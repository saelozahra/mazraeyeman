B4A=true
Group=Service
ModulesStructureVersion=1
Type=Service
Version=6.3
@EndOfDesignText@
#IgnoreWarnings:7

#Region  Service Attributes 
	#StartAtBoot: true
#End Region

Sub Process_Globals
	Private fm As FirebaseMessaging
	Dim msg_type,msg_val,msg_title,msg_body As String
'	Dim n1 As Notification
	Dim sql1 As SQL
	Dim R As Reflector
	Dim nb As NotificationBuilder
	Dim MyToken As String
End Sub

Sub Service_Create
	
	fm.Initialize("fm")
	MyToken = fm.Token
'	n1.Initialize
	
	If Not(sql1.IsInitialized) Then
		If Not(File.Exists(SaeloZahra.dir,"db.db")) Then File.Copy(File.DirAssets,"db.db",SaeloZahra.dir,"db.db")
		sql1.Initialize(SaeloZahra.dir,"db.db",False)
	End If
	
	
End Sub


Public Sub SubscribeToTopics( TopicName As String )
	
	If Not(fm.IsInitialized) Then fm.Initialize("fm")
	
	TopicName=TopicName.Replace(" ","_")
	TopicName=TopicName.Replace(":","_")
	TopicName=TopicName.Replace("\n","")
	
	Try
		R.Target = fm
		R.RunMethod2("subscribeToTopic",TopicName,"java.lang.String")
'		fm.SubscribeToTopic( TopicName )
	Catch
		Log("error1: "&LastException.Message)
'		Try
'			R.Target = fm
'			r.RunMethod2("subscribeToTopic",TopicName,"java.lang.String")
'		Catch
'			Log("error2: "&LastException)
'		End Try
	End Try
	
End Sub

Sub Service_Start (StartingIntent As Intent)
	
	
	If fm.IsInitialized == False Then
		fm.Initialize("fm")
	End If
	
	If StartingIntent.IsInitialized And fm.HandleIntent(StartingIntent) Then Return
	
End Sub

Sub fm_TokenRefresh (Token As String)
	Log("Token: "&Token)
End Sub

Sub fm_MessageArrived (Message As RemoteMessage)

	Log("Message arrived")
	Log("Message data: "&Message.GetData)
	
	If Message.GetData.ContainsKey("type") Then
		msg_type = Message.GetData.Get("type")
		msg_val = Message.GetData.Get("body")
	Else
		msg_type = "text"
		msg_val = ""
	End If
	
	If Message.GetData.Get("title") == Null Then
		msg_title=Application.LabelName
	Else
		msg_title=Message.GetData.Get("title")
	End If
	
		
	If Message.GetData.Get("body") == Null Then
		msg_body=Application.LabelName
	Else
		msg_body=Message.GetData.Get("body")
	End If
	
	If Message.GetData.Get("title")==Null And Message.GetData.Get("body")==Null Then Return
	
	If msg_type == "expire" And msg_body=="yes" Then
		File.WriteString(SaeloZahra.dir,"expire",True)
	Else If msg_type == "expire" And msg_body=="no" Then
		File.Delete(SaeloZahra.dir,"expire")
	End If

	
	nb.Initialize
	nb.AutoCancel = True
	nb.DefaultLight = True
	nb.DefaultSound = True
	nb.DefaultVibrate = True
	nb.SmallIcon = "teraktor"'teraktor
'	nb.CustomSound = File.Combine(File.DirRootExternal,"1.mp3")
	nb.CustomVibrate = Array As Long(0,100,200,300)
	nb.LocalOnly = True
	
	
	Dim javaobjectInstance As JavaObject
	javaobjectInstance = nb
	javaobjectInstance.RunMethod ("setColor", Array As Object (SaeloZahra.Color))
	
'	nb.When = DateTime.Now + 3000
'	nb.Ticker = "Ticker"
'	nb.ShowTime = True
'	nb.UsesChrono = True
'	nb.Number = "12"
	nb.OnlyAlertOnce = True
	nb.setActivity(NotificationAct)
	nb.Tag = "opened"
	'nb.ContentInfo = "Information app"
	nb.ContentText = msg_body
	nb.ContentTitle = msg_title
		
'	n1.SetInfo2(msg_title, msg_body,"opened", notification)
	nb.OnGoingEvent=False
	nb.Notify(313)
			
'	ToastMessageShow(msg_title&"  :  "&msg_body&"  :  "&msg_type&"  :  "&msg_val,True)
	Log(msg_title&"  :  "&msg_type&"  :  "&msg_val)
	
	
		
	Try
		sql1.ExecNonQuery($"insert into notification (title,type,value,time) VALUES ('${msg_title}','${msg_type}','${msg_val}','${DateTime.Now}')"$)
		Log("Inserted")
	Catch
		Log($" ${LastException.Message} error to insert this id to nitification = ${msg_title}"$   )
	End Try
	
	
End Sub


Sub Service_Destroy

End Sub