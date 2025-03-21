B4A=true
Group=OLD
ModulesStructureVersion=1
Type=Activity
Version=9.5
@EndOfDesignText@
'#Region  Project Attributes 
'	#ApplicationLabel: مزرعه من
'	#VersionCode: 9
'	#VersionName: 9
'	'SupportedOrientations possible values: unspecified, landscape or portrait.
'	#SupportedOrientations: portrait
'	#CanInstallToExternalStorage: true
'	#BridgeLogger: True
'	#MultiDex: True
''	#LibraryAuthor: NJDude
'#End Region

#Region  Activity Attributes
	#FullScreen: True
	#IncludeTitle: False
#End Region

'#IgnoreWarnings: 32,15,20,12
'#AdditionalRes: ..\res_contentchooser
'#AdditionalRes: ..\res
'#AdditionalRes: j:\Development\sdk\my_resource\b4a_floatingactionbutton, de.amberhome.objects.floatingactionbutton
'#CustomBuildAction: 1, c:\windows\system32\attrib.exe, +r res\*.* /s
'#AdditionalJar: com.google.android.gms:play-services-base
'#AdditionalJar: com.google.android.gms:play-services-maps
'#AdditionalJar: com.google.firebase:firebase-core
'#additionaljar: com.android.support:support-v4






'#AdditionalJar: gson-2.8.5
'#AdditionalJar: inAppSDK.aar
'#AdditionalJar: amaroid-common-1.0.3.aar
'#AdditionalJar: com.android.support:appcompat-v7
'#AdditionalJar: com.android.support:cardview-v7
'#AdditionalJar: com.google.android.gms:play-services-auth-api-phone



Sub Process_Globals
	
End Sub

Sub Globals
	Dim NewVersion As Boolean = False
	Private go_btn,register_btn,NewTheme_Btn As Button
	Dim DTTC As DoubleTaptoClose
	Dim AC As AppCompat
'	Dim cfg As FirebaseRemoteConfig
	
End Sub

Sub Activity_Create( FirstTime As Boolean )
	
	Activity.LoadLayout("intro_old_layout")
	go_btn.Typeface=SaeloZahra.font
	register_btn.Typeface=SaeloZahra.font
	NewTheme_Btn.Typeface=SaeloZahra.font
'	SaeloZahra.SetNinePatchButton(go_btn,"btn_yellow","","")
	DTTC.InItIaLiZe("مجددا دکمه خروج را بزنید")
	
	Log( " ApproximateScreenSize: 	" & GetDeviceLayoutValues.ApproximateScreenSize )
	Log( " Width:				    " & GetDeviceLayoutValues.Width )
	Log( " height:				    " & GetDeviceLayoutValues.Height )
	
	SaeloZahra.MaterialActionBarHeight =AC.GetMaterialActionBarHeight
	SaeloZahra.GetStatusBarHeight =	AC.GetStatusBarHeight


'	Try
'		cfg.Initialize("Config")
'		cfg.Defaults = CreateMap("expired_version": 1)
'		cfg.fetch2(86400)
'	Catch
'		Log("Remote config nasb nashod:   "&LastException)
'	End Try
	
	StartServiceAt(accuWeatherCronJobService, DateTime.Now + 1 * DateTime.TicksPerMinute, True)
	
	If FirstTime Then
		
		Try
			If Application.VersionCode > File.ReadString(SaeloZahra.dir,"VAPP") Then
				NewVersion = True
			End If
		Catch
			File.WriteString(SaeloZahra.dir,"VAPP",Application.VersionCode)
		End Try
		File.WriteString(SaeloZahra.dir,"VAPP",Application.VersionCode)
		
		
		If Not(File.Exists(SaeloZahra.dir,"db.db")) Or NewVersion Then
			File.Copy(File.DirAssets,"db.db",SaeloZahra.dir,"db.db")
		End If
		
	End If
	
	Main.amaroid.TrackView("اصلی  - قدیم")
	
	
End Sub


'Sub Config_onFetchComplete(success As Boolean)
'	If success Then
'		Log("Activate fetched values")
'		cfg.activateFetched
'		Log("expired_version="&cfg.getDouble("expired_version"))
'		If Application.VersionCode<=cfg.getDouble("expired_version") Then
'			File.WriteString(SaeloZahra.dir,"expire",True)
'		Else
'			File.Delete(SaeloZahra.dir,"expire")
'		End If
'	End If
'End Sub


Sub Activity_Resume
	Log("SDK: "&SaeloZahra.P.SdkVersion)
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

'Sub jobDone(job As HttpJob)
'	If job.Success Then
'		Log("Common Baby: "&job.GetString)
'	Else
'		Log(job.ErrorMessage)
'	End If
'End Sub

Sub Activity_KeyPress (KeyCode As Int) As Boolean
	If KeyCode = KeyCodes.KEYCODE_BACK Then
		DTTC.TapToClose
		Return True
	Else
		Return False
	End If
End Sub


Sub go_btn_Click
'	Activity.Finish
	SaeloZahra.beep("button-19.mp3")
'	Sleep(555)
	StartActivity(loginOldAct)
End Sub


Sub register_btn_Click
	SaeloZahra.beep("button-20.mp3")
'	Sleep(555)
	StartActivity(register_act)
End Sub

Sub NewTheme_Btn_Click
	SaeloZahra.beep("button-20.mp3")
	StartActivity(login_act)
End Sub