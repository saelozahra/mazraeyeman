B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=8.3
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals
'	Private fingerprint As FingerprintManager
	Dim ItIsPayed As Boolean = False
End Sub

Sub Globals
	Dim MoreThanTrialDays As Boolean = False
	Dim RAF As RandomAccessFile
	Dim SH As Amir_SliderShow
	Dim job1 As HttpJob
	Dim CD1,CD2 As ColorDrawable
	Private username_et,password_et As EditText
'	Dim DTTC As DoubleTaptoClose
	Dim components() As String
	Private login_btn,Register_btn As Button
	Dim dsnake As DSSnackbar
	Dim ParallaxDesign As Hitex_ParallaxDesign
	Private Container As Panel
	
	Dim TIP As MSShowTipsBuilder
	
End Sub

Sub Activity_Create(FirstTime As Boolean)
	
'	DTTC.Initialize("مجددا دکمه خروج را بزنید")
	
	ParallaxDesign.Initialize
	Activity.AddView(ParallaxDesign,-4%x,-4%y,108%x,108%y)
	ParallaxDesign.setMargins(270,100)
	ParallaxDesign.setMultipliers(1.9f,1.9f)
	ParallaxDesign.SetImageBitmap(SaeloZahra.Blur(LoadBitmap(File.DirAssets,"bg"&Rnd(1,12)&".jpg")))
	
	
	Activity.LoadLayout("login_layout")
	CD1.Initialize2(0x4026873E,7dip,1dip,SaeloZahra.ColorLight)
	CD2.Initialize2(0x4026873E,7dip,1dip,SaeloZahra.ColorLight)
	
	
	
	
'	Main.amaroid.TrackView("ورود")
	
	username_et.Typeface=SaeloZahra.font
	password_et.Typeface=SaeloZahra.font
	login_btn.Typeface=SaeloZahra.font
	Register_btn.Typeface=SaeloZahra.font
	
	If GetDeviceLayoutValues.Height > 3000 Then
		SaeloZahra.SetNinePatchButton(login_btn,"btn_green","btn_green_pressed","")
	End If
	
	
	
	
	
	
'	File.WriteString(SaeloZahra.dir,"usrnm","09333782396")
'	File.WriteString(SaeloZahra.dir,"pswd", "09333782396")
'	username_et.Enabled=False
'	password_et.Enabled=False
	
	
	
	
	
	
	If File.Exists(SaeloZahra.dir,"usrnm") Then
		username_et.Text=File.ReadString(SaeloZahra.dir,"usrnm")
		password_et.Text=File.ReadString(SaeloZahra.dir,"pswd")
	End If
	
	If File.Exists(SaeloZahra.dir,"expire") Then
		ToastMessageShow(SaeloZahra.CSB("نرم افزار شما اکسپایر شده است"&CRLF&"با پشتیبانی تماس بگیرید"),True)
	End If
	
	
	ParallaxDesign.SendToBack
	Container.BringToFront
	username_et.BringToFront
	password_et.BringToFront
	login_btn.BringToFront
	Register_btn.BringToFront
	
	
	username_et.Background=CD1
	password_et.Background=CD2
	
		
		
	If SaeloZahra.P.SdkVersion<23 Then
		username_et.Color=0x4026873E
		password_et.Color=0x4026873E
	End If
	
	
	If FirstTime Then
		If File.Exists(SaeloZahra.dir,"showTipLogin")==False Then
			TIP.Initialize("tip")
'			TIP.setTitle(SaeloZahra.csb("ثبت نام")).setButtonText(SaeloZahra.csb("بعدی")).setTitleColor(Colors.White).setDescriptionColor(Colors.White).setDescription(SaeloZahra.csb("اگه هنوز مزرعه تون رو ثبت نکردید برید اینجا"&CRLF&"بعد از وارد کردن اطلاعات مزرعه تون انتخاب کنید که چجوری میخواید هزینه خدمات رو پرداخت کنید ؟ "&CRLF&"پیش پرداخت یک ساله ، یا کسر روزانه 300 تومان از اعتبار تلفن همراه؟")).setTarget(Register_btn).build
			TIP.setTitle(SaeloZahra.csb("ثبت نام")).setButtonText(SaeloZahra.csb("بعدی")).setTitleColor(Colors.White).setDescriptionColor(Colors.White).setDescription(SaeloZahra.csb("اگر تاکنون در اپلیکیشن مزرعه من ثبت نام نکرده اید از قسمت ثبت نام، اطلاعات زمین کشاورزی خود را وارد نموده و از خدمات این اپلیکیشن بهره مند شوید.")).setTarget(Register_btn).build
			TIP.setDelay(2313)
'			TIP.show
			File.WriteString(SaeloZahra.dir,"showTipLogin","")
		Else
			TIP.Initialize("Temptip")
			TIP.setTitle(SaeloZahra.csb("مزرعه من چه خدماتی ارائه میدهد؟")).setButtonText(SaeloZahra.csb("شروع نرم افزار")).setTitleColor(Colors.White).setDescriptionColor(Colors.White).setDescription(SaeloZahra.csb($"1. پیش بینی حوادث غیر مترقبه مرتبط با محصول شما از قبیل: سرمازدگی، گرمازدگی، خشکسالی، یخبندان، بادزدگی، طوفان، سیل، تگرگ ${CRLF}2. اعلام بارندگی و مدت زمان تقریبی بارش ${CRLF}3. مقایسه آمار شاخص های آب و هوایی در دوره های مختلف  ${CRLF}4. محاسبه و هشدار هجوم طغیان آفت  ${CRLF}5. محتوای آموزشی مفید برای جلوگیری از بروز مشکلات ${CRLF} و ده ها خدمات دیگر..."$)).setTarget(Register_btn).build
			TIP.setDelay(2313)
'			TIP.show
		End If
	End If

	
	If File.Exists(SaeloZahra.dir,"usrnm") And File.Exists(SaeloZahra.dir,"pswd") And File.Exists(SaeloZahra.dir,"NotNeedUserPass") Then
		login_btn_Click
	End If
	
'	If Not(fingerprint.HardwareDetected) Then
'		Log("سنسور اثر انگشت پیدا نشد")
'	Else if Not(fingerprint.HasEnrolledFingerprints) Then
'		Log("هیچ اثر انگشتی ثبت نشده")
'	Else
'		fingerprint.Authenticate
'		dsnake.Initialize("snake",Activity,SaeloZahra.CSB("در حال اسکن اثر انگشت..."),dsnake.DURATION_LONG)
'		dsnake.Show
'	End If
	
End Sub

Sub Activity_Resume
	
	Log(GetDeviceLayoutValues.Height)
	If File.Exists(SaeloZahra.dir,"usrnm") Then
		If File.ReadString(SaeloZahra.dir,"usrnm").Length==11 Then
			username_et.Text=File.ReadString(SaeloZahra.dir,"usrnm")
			password_et.Text=File.ReadString(SaeloZahra.dir,"pswd")
		End If
	End If
		
End Sub

Sub Activity_Pause (UserClosed As Boolean)
'	fingerprint.Cancel
End Sub



Sub tip2_Click
	Temptip_Click
End Sub
Sub Temptip_Click
	Dim tt As SimpleTooltipBuilder
	tt.Initialize("STT")
	tt.animated(True).animationDuration(1313).backgroundColor(SaeloZahra.Color).arrowColor(SaeloZahra.Color).dismissOnInsideTouch(True).dismissOnOutsideTouch(True).modal(True).text(SaeloZahra.CSB("ثبت‌نام باغداران و کشاورزان")).textColor(Colors.White).anchorView(Register_btn).gravityStart.build
	tt.show
End Sub
Sub tip_Click
	TIP.Initialize("tip2")
	TIP.setTitle(SaeloZahra.csb("ورود")).setButtonText(SaeloZahra.csb("شروع")).setDescription(SaeloZahra.csb("در صورتیکه قبلا ثبت نام نموده اید "&CRLF&" نام کاربری و رمز عبور هردو بصورت پیش فرض شماره موبایل شما قرار داده شده است.")).setTarget(login_btn).build
	TIP.setDelay(313)
	TIP.show
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
	
'	Main.amaroid.TrackEvent("lOGIN",1,"Login_Btn_Click",Activity.Title)
''	fingerprint.Cancel
	
	
	If File.Exists(SaeloZahra.dir,"expire") Then
		ToastMessageShow(SaeloZahra.CSB("نرم افزار شما اکسپایر شده است"&CRLF&"با پشتیبانی تماس بگیرید"),True)
	Else If username_et.Text.Length<4 Then
		username_et.RequestFocus
		ToastMessageShow("نام کاربری خود را وارد کنید",False)
	Else If password_et.Text.Length<4 Then
		password_et.RequestFocus
		ToastMessageShow("کلمه عبور خود را وارد کنید",False)
	Else
		job1.Initialize("job1",Me)
		job1.PostString(SaeloZahra.json_url&"login_api.php","user="&username_et.Text&"&pass="&password_et.Text&"&pushNotificationCode="&FirebaseMessaging.MyToken)
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
			
			Dim userProducts As List = root.Get("userProducts")
			RAF.Initialize(SaeloZahra.Dir,"userProducts",False)
			RAF.WriteObject(userProducts, True,RAF.CurrentPosition)
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
			'TODO: eslahe ettelaaat
			
'		CallSub(accuWeatherCronJobService,"FindRegionCode")


			Dim RegDate As Long = root.Get("reg_date")
			Log("RegDate: "&RegDate)
			Log(RegDate*1000)
			Log(DateTime.Now)
			LogColor(DateUtils.PeriodBetween(RegDate*1000,DateTime.Now).Years,Colors.Green)
			LogColor(DateUtils.PeriodBetween(RegDate*1000,DateTime.Now).Months,Colors.Green)
			LogColor(DateUtils.PeriodBetween(RegDate*1000,DateTime.Now).Days,Colors.Green)
			
			If DateUtils.PeriodBetween(RegDate*1000,DateTime.Now).Years>0 Or DateUtils.PeriodBetween(RegDate*1000,DateTime.Now).Months>0 Or DateUtils.PeriodBetween(RegDate*1000,DateTime.Now).Days>RegisterAct.TedadRoozTrial Then
				MoreThanTrialDays=True
			End If
			
			If root.Get("payed")=="1" Then
				ItIsPayed=True
			Else if MoreThanTrialDays Then
				ItIsPayed=False
			Else if Not(MoreThanTrialDays) Then
				ItIsPayed=True
			Else
				ItIsPayed=False
			End If
			
			File.WriteMap(SaeloZahra.dir,"user.dat",root)
			
			ToastMessageShow(SaeloZahra.CSB(root.Get("name")&" عزیز، خوش آمدید"),True)
			
			CallSubDelayed2(FirebaseMessaging, "SubscribeToTopics",username_et.Text)
			CallSubDelayed2(FirebaseMessaging, "SubscribeToTopics","namayande_"&root.Get("moaref"))
			Starter.usrnm = username_et.Text
			File.WriteString(SaeloZahra.dir,"usrnm",username_et.Text)
			File.WriteString(SaeloZahra.dir,"pswd",password_et.Text)
			
'			File.ReadString(SaeloZahra.Dir,"usrnm")
			
			Activity.Finish
			SaeloZahra.beep("button-20.mp3")
			StartActivity(HomeAct)
			SaeloZahra.SetAnimation("file3","file4")
'			accuWeatherCronJobService.OpenHome=True
'			StartService(accuWeatherCronJobService)
			ProgressDialogShow2(SaeloZahra.CSB("در حال دریافت وضعیت آب و هوا"),True)
			
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
		dsnake.Initialize("snake",Activity,SaeloZahra.CSB("هویت شما تائید شد..."),dsnake.DURATION_SHORT)
		Sleep(dsnake.DURATION_SHORT)
'		ToastMessageShow("هویت شما تائید شد...", True)
		login_btn_Click
	Else
		ToastMessageShow($"خطا: ${ErrorMessage}"$, True)
		Log(ErrorMessage)
	End If
End Sub

Sub username_et_FocusChanged (HasFocus As Boolean)
'	If username_et.Text.Length==11 Then
'		CheckPurchusedJob.Download("https://seller.charkhoneh.com/ws/androidpublisher/v2/inquiry/purchases/subscriptions/msisdn/"&username_et.Text&"?access_token=a0390850-ad76-37dd-a8d8-e3a0eadb1796")
'	End If
End Sub

Sub username_et_TextChanged (Old As String, New As String)
	If New.Length==11 Then
		File.WriteString(SaeloZahra.dir,"usrnm",New)
		File.WriteString(SaeloZahra.dir,"pswd",New)
'		CheckPurchusedJob.Download("https://seller.charkhoneh.com/ws/androidpublisher/v2/inquiry/purchases/subscriptions/msisdn/"&username_et.Text&"?access_token=a0390850-ad76-37dd-a8d8-e3a0eadb1796")
	End If
End Sub

Sub Register_btn_Click
	SH.convertActivityFromTranslucent
	SaeloZahra.beep("button-20.mp3")
	StartActivity(RegisterAct)
End Sub

Sub CallFab_Click
	SaeloZahra.intent1.Initialize(SaeloZahra.intent1.ACTION_VIEW, "tel:"&SaeloZahra.SupportNumber)
	StartActivity(SaeloZahra.intent1)
End Sub