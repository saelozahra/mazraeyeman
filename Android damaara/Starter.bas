B4A=true
Group=Service
ModulesStructureVersion=1
Type=Service
Version=8.3
@EndOfDesignText@
#Region  Service Attributes 
	#StartAtBoot: False
	#ExcludeFromLibrary: True
#End Region

Sub Process_Globals
	Dim usrnm As String = "admin"
	Dim my_id As String
	Public rp As RuntimePermissions
	Public GPS1 As GPS
	Public gpsStarted As Boolean
	Dim MyLocation As Location
'	Dim analytics As FirebaseAnalytics
'	Public CL As Crashlytics
End Sub

Sub Service_Create
	
	ActivateSSL
	
	StartService(FirebaseMessaging)
	CallSubDelayed2(FirebaseMessaging, "SubscribeToTopics","general")
	
	Try
		GPS1.Initialize("GPS")
	Catch
		Log(LastException&" نتونستیم راهش بندازیم")
	End Try
	
	
	
'	analytics.Initialize
	
'	Dim context As JavaObject 'depends on JavaObject
'	context.InitializeContext
'	CL.Initialize(context)
	
End Sub

Sub Service_Start (StartingIntent As Intent)
	

End Sub

Sub Service_TaskRemoved
End Sub

'Return true to allow the OS default exceptions handler to handle the uncaught exception.
Sub Application_Error (Error As Exception, StackTrace As String) As Boolean
'	CL.CLog("Amir Bia Errrror: "&Error.Message)
	Return False
End Sub


Sub Service_Destroy
	StopGps
End Sub


Sub GPS_LocationChanged (Location1 As Location)
	MyLocation = Location1
	
	If SaeloZahra.active_page =="selectmap" Then
		
		CallSub(select_map_act,"goToMyLocation")
		select_map_act.myLocation=MyLocation
		
		File.WriteString(SaeloZahra.dir,"lat",Location1.Latitude)
		File.WriteString(SaeloZahra.dir,"lng",Location1.Longitude)

	End If
	
End Sub


Public Sub StartGps
	If gpsStarted = False Then
		GPS1.Start(0, 0)
		gpsStarted = True
	End If
End Sub

Public Sub StopGps
	If gpsStarted Then
		GPS1.Stop
		gpsStarted = False
	End If
End Sub
'





Sub JobDone (Job As HttpJob)
	
	Log(Job.JobName&"  "&Job.Success)
	
	ProgressDialogHide
    

	If Job.Success Then
		Select Job.JobName
			Case "CheckPurchusedJob"
				
				Dim parserCheckPurchusedJob As JSONParser
				parserCheckPurchusedJob.Initialize(Job.GetString)
				Dim rootCheckPurchusedJob As Map = parserCheckPurchusedJob.NextObject
				Dim purchases As List = rootCheckPurchusedJob.Get("purchases")
				For Each colpurchases As Map In purchases
					Dim token As String = colpurchases.Get("token")
					Dim packageName As String = colpurchases.Get("packageName")
					Dim autoRenewing As String = colpurchases.Get("autoRenewing")
					If (packageName == Application.PackageName) And (autoRenewing.ToLowerCase == "true" Or autoRenewing.ToLowerCase==True) Then
						LogColor("اشتراک شما ثبت شده",Colors.LightGray)
						File.WriteString(SaeloZahra.dir,"NotNeedUserPass",Application.PackageName)
						File.WriteString(SaeloZahra.dir,"ActiveToken",token)
						RegisterAct.Payed=2
					Else
						LogColor("شما اشتراک فعالی ندارید",Colors.LightGray)
						File.Delete(SaeloZahra.Dir,"NotNeedUserPass")
					End If
				Next
				
				If Job.GetString == "{""purchases"":[]}" Then
					LogColor("شما اشتراک فعالی ندارید",Colors.LightGray)
					File.Delete(SaeloZahra.Dir,"NotNeedUserPass")
				End If
				If SaeloZahra.RayganHast Then RegisterAct.Payed=2
				Job.Release
			Case "GetMyElevationJob"
				Dim parserElevation As JSONParser
				parserElevation.Initialize(Job.GetString)
				Dim rootElevation As List = parserElevation.NextArray
				For Each colrootElevation As Map In rootElevation
					Dim elevation As Double = colrootElevation.Get("elevation")
					File.WriteString(SaeloZahra.dir,"mySeaLevel",elevation)
					ToastMessageShow("ارتفاع شما از سطح دریا "&elevation&" است",True)
'					Dim location As Map = colrootElevation.Get("location")
'					Dim lng As Double = location.Get("lng")
'					Dim lat As Double = location.Get("lat")
'					Dim resolution As Double = colrootElevation.Get("resolution")
				Next
			Case "get_my_address"
				Dim parser As JSONParser
				parser.Initialize(Job.GetString)
				Dim root As Map = parser.NextObject
				Dim display_name As String = root.Get("display_name")
				File.WriteString(SaeloZahra.dir,"address",display_name)
				CallSubDelayed2(select_map_act,"change_addressbar_text",display_name)
			Case "get_my_address_old"
				Try
					Dim Adresse As List
					Adresse.Initialize
					Dim parser As JSONParser
					Try
						parser.Initialize(Job.GetString)
						Dim root As Map = parser.NextObject
						Dim results As List = root.Get("results")
					Catch
						Log("address json nist")
					End Try
					
					For Each colresults As Map In results
						Dim formatted_address As String = colresults.Get("formatted_address")
						Adresse.Add(formatted_address)
					Next
				    
					If Adresse.Size<>0 Then CallSubDelayed2(select_map_act,"change_addressbar_text",Adresse.Get(0))
					
					File.WriteString(SaeloZahra.dir,"address",Adresse.Get(0))
					
				Catch
					Log(LastException)
				End Try
		End Select
	Else
        
		If Not(SaeloZahra.CheckConnection) Then
			ToastMessageShow(SaeloZahra.CSB("اینترنت شما قطع است"),True)
		Else If Not(SaeloZahra.checkSite) Then
			ToastMessageShow(SaeloZahra.CSB("اتصال به سایت برقرار نشد"),True)
		Else
			Log("Error: " & Job.ErrorMessage)
			
			If Job.ErrorMessage.Contains("Unable to resolve host") Then
				ToastMessageShow(SaeloZahra.CSB(" اینترنتتون وصل نیست "),True)
			Else if Job.ErrorMessage.Contains("too_many_requests") Then
				Job.Release
			Else
				ToastMessageShow(SaeloZahra.CSB(" خطا در ورود ")&CRLF&Job.ErrorMessage,True)
			End If
		End If
		
	End If
    
	Job.Release
	
End Sub



Sub ActivateSSL

	Dim javaobjectContext                                                       As JavaObject
	Dim javaobjectInstance                                                      As JavaObject
	Dim objectListener                                                          As Object
	Dim phoneInstance                                                           As Phone

	Try
		Select Case phoneInstance.SdkVersion
			Case 16, 17, 18, 19, 20 ' Android 4.1 - 4.4
			Case Else
				Return
		End Select
		javaobjectInstance.InitializeStatic ("com.google.android.gms.security.ProviderInstaller")
		javaobjectContext.InitializeContext
		DisableStrictMode
		objectListener = javaobjectInstance.CreateEventFromUI ("com.google.android.gms.security.ProviderInstaller.ProviderInstallListener", "objectListener", Null)
		javaobjectInstance.RunMethod ("installIfNeededAsync", Array (javaobjectContext, objectListener))
		Wait For objectListener_Event (stringMethodName As String, objectArguments () As Object)
		' If stringMethodName = "onProviderInstalled" Then [ Provider installed successfully ] Else [ Error installing provider (objectArguments (0)) ]
	Catch
		Log(LastException)
	End Try

End Sub

Sub DisableStrictMode

	Dim javaobjectInstance                                                      As JavaObject
	Dim javaobjectPolicy                                                        As JavaObject
	Dim javaobjectStrictMode                                                    As JavaObject

	Try
		javaobjectInstance.InitializeStatic ("android.os.Build.VERSION")
		If javaobjectInstance.GetField ("SDK_INT") > 9 Then
			javaobjectPolicy = javaobjectPolicy.InitializeNewInstance ("android.os.StrictMode.ThreadPolicy.Builder", Null)
			javaobjectPolicy = javaobjectPolicy.RunMethodJO ("permitAll", Null). RunMethodJO ("build", Null)
			javaobjectStrictMode.InitializeStatic ("android.os.StrictMode"). RunMethod ("setThreadPolicy", Array (javaobjectPolicy))
		End If
	Catch
		Log(LastException)
	End Try

End Sub