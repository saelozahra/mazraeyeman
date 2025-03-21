B4A=true
Group=OLD
ModulesStructureVersion=1
Type=Activity
Version=9.5
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: true
	#IncludeTitle: False
#End Region

Sub Process_Globals
	Private fingerprint As FingerprintManager
End Sub

Sub Globals
	Dim job1 As HttpJob
	Dim cd As ColorDrawable
	Private Username_ET,Password_ET As EditText
	Private login_btn As Button
	Private header_lbl ,subtitle_lbl As Label
'	Dim DTTC As DoubleTaptoClose
	Dim components() As String
	Dim dsnake As DSSnackbar
End Sub

Sub Activity_Create(FirstTime As Boolean)
'	DTTC.Initialize("مجددا دکمه خروج را بزنید")
	Activity.LoadLayout("login_old_layout")
	cd.Initialize2(Colors.Transparent,14dip,2dip,SaeloZahra.colorLight)
	Username_ET.Background=cd
	Password_ET.Background=cd
	header_lbl.Typeface=SaeloZahra.fontBold'Typeface.CreateNew(SaeloZahra.font,Typeface.DEFAULT_BOLD)
	subtitle_lbl.Typeface=SaeloZahra.font
	Username_ET.Typeface=SaeloZahra.font
	Password_ET.Typeface=SaeloZahra.font
	login_btn.Typeface=SaeloZahra.font
	
	If GetDeviceLayoutValues.Height > 3000 Then
		SaeloZahra.SetNinePatchButton(login_btn,"btn_green","btn_green_pressed","")
	End If
	
	If File.Exists(SaeloZahra.dir,"usrnm") Then
		Username_ET.Text=File.ReadString(SaeloZahra.dir,"usrnm")
		Password_ET.Text=File.ReadString(SaeloZahra.dir,"pswd")
	End If
	
	If File.Exists(SaeloZahra.dir,"expire") Then
		ToastMessageShow(SaeloZahra.CSB("نرم افزار شما اکسپایر شده است"&CRLF&"با پشتیبانی تماس بگیرید"),True)
	End If
	
	
	If FirstTime Then
		fingerprint.Initialize (Me, "auth")
	End If
	
	If Not(fingerprint.HardwareDetected) Then
		Log("سنسور اثر انگشت پیدا نشد")
	Else if Not(fingerprint.HasEnrolledFingerprints) Then
		ToastMessageShow("هیچ اثر انگشتی ثبت نشده", False)
	Else
		fingerprint.Authenticate
		dsnake.Initialize("snake",Activity,SaeloZahra.CSB("در حال اسکن اثر انگشت..."),dsnake.DURATION_LONG)
		dsnake.Show
	End If
	
	Main.amaroid.TrackView(header_lbl.Text&"  - قدیم")
	
End Sub

Sub Activity_Resume
	Log(GetDeviceLayoutValues.Height)
	If File.Exists(SaeloZahra.dir,"usrnm") Then
		Username_ET.Text=File.ReadString(SaeloZahra.dir,"usrnm")
		Password_ET.Text=File.ReadString(SaeloZahra.dir,"pswd")
	End If
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


'Sub Activity_KeyPress (KeyCode As Int) As Boolean
'	If KeyCode = KeyCodes.KEYCODE_BACK Then
'		StartActivity(Main)
'		Return True
'	Else
'		Return False
'	End If
'End Sub


Sub login_btn_Click
	If File.Exists(SaeloZahra.dir,"expire") Then
		ToastMessageShow(SaeloZahra.CSB("نرم افزار شما اکسپایر شده است"&CRLF&"با پشتیبانی تماس بگیرید"),True)
	Else If Username_ET.Text.Length<4 Then
		Username_ET.RequestFocus
		ToastMessageShow("نام کاربری خود را وارد کنید",False)
	Else If Password_ET.Text.Length<4 Then
		Password_ET.RequestFocus
		ToastMessageShow("کلمه عبور خود را وارد کنید",False)
	Else
'		LogColor(SaeloZahra.json_url&"login_api.php?user="&username_et.Text&"&pass="&password_et.Text,SaeloZahra.colorDark)
		job1.Initialize("job1",Me)
		job1.PostString(SaeloZahra.json_url&"login_api.php","user="&Username_ET.Text&"&pass="&Password_ET.Text&"&pushNotificationCode="&FirebaseMessaging.MyToken)
		ProgressDialogShow(SaeloZahra.CSB("در حال ورود..."))
	End If
End Sub

Sub jobDone(job As HttpJob)
	
	ProgressDialogHide
	
	If job.Success Then
		
		If job.GetString=="""PassError""" Then
			
			ToastMessageShow(SaeloZahra.CSB("کلمه عبور وارد شده غلط است"),True)
			File.Delete(SaeloZahra.dir,"usrnm")
			File.Delete(SaeloZahra.dir,"pswd")
		
		Else If job.GetString=="""UserNotFound""" Then
			
			ToastMessageShow(SaeloZahra.CSB("نام کاربری پیدا نشد"),True)
			File.Delete(SaeloZahra.dir,"usrnm")
			File.Delete(SaeloZahra.dir,"pswd")
			
		Else
			
			
		
			Log(job.GetString)
			Dim parser As JSONParser
			parser.Initialize(job.GetString)
			Dim root As Map = parser.NextObject
			Starter.my_id = root.Get("id")
			Dim location As String = root.Get("location")
			
			If location.Contains(",") And location.Length<8 Then
				ToastMessageShow(SaeloZahra.CSB("اطلاعات شما ناقص است"&CRLF&"سریعا آنها را از بخش زیر اصلاح کنید"),True)
				StartActivity(SaeloZahra.PI.OpenBrowser(SaeloZahra.site_url&"reseller/panel/"))
				ToastMessageShow(SaeloZahra.CSB("نام کاربری و کلمه عبور شما ، شماره تلفن همراه شماست"),True)
			End If
		
			components = Regex.Split(",", location)
			
			File.WriteString(SaeloZahra.dir,"lat" ,	components(0))
			File.WriteString(SaeloZahra.dir,"lng" ,	components(1))
		
			Starter.MyLocation.Initialize2(components(0),components(1))
			Starter.myLocation.Latitude =File.ReadString(SaeloZahra.dir,"lat")
			Starter.myLocation.Longitude=File.ReadString(SaeloZahra.dir,"lng")
	
			LogColor(components(0)&",,,,"&components(1),Colors.Blue)
			LogColor(job.GetString,Colors.Yellow)
		
'		CallSub(accuWeatherCronJobService,"FindRegionCode")



			
			File.WriteMap(SaeloZahra.dir,"user.dat",root)
			
			ToastMessageShow(SaeloZahra.CSB(root.Get("name")&" عزیز، خوش آمدید"),True)
			
			CallSubDelayed2(FirebaseMessaging, "SubscribeToTopics",Username_ET.Text)
			CallSubDelayed2(FirebaseMessaging, "SubscribeToTopics","namayande_"&root.Get("resellercode"))
			Starter.usrnm = Username_ET.Text
			File.WriteString(SaeloZahra.dir,"usrnm",Username_ET.Text)
			File.WriteString(SaeloZahra.dir,"pswd",Password_ET.Text)
			Activity.Finish
			SaeloZahra.beep("button-20.mp3")
			StartActivity(home_act)
			
		End If
		
		
		
	Else
		If job.ErrorMessage.Contains("Unable to resolve host") Then
			ToastMessageShow(SaeloZahra.CSB(" اینترنتتون وصل نیست "),True)
		Else
			ToastMessageShow(SaeloZahra.CSB(" خطا در ورود ")&CRLF&job.ErrorMessage,True)
		End If
	End If
	job.Release
End Sub











Sub Auth_Complete (Success As Boolean, ErrorMessage As String)
	If Success Then
		ToastMessageShow("هویت شما تائید شد...", True)
		login_btn_Click
	Else
		ToastMessageShow($"خطا: ${ErrorMessage}"$, True)
		Log(ErrorMessage)
	End If
End Sub
