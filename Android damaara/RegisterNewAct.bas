B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=9.5
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals
	Dim actType As String = "register"
	Dim OTPTransactionId As String
	Dim referenceCode As String
	Dim OTPCode As String = ""
	Dim Operator As String = ""
	Dim cu1 As Cursor
	Dim SQL1 As SQL
End Sub

Sub Globals
	Dim X1 As XmlLayoutBuilder
	Dim errorText As String=""
	Dim job1,job_otp_generate,jobOtpOtherGenerate As HttpJob
	Private ScenarioVASLBL,ScenarioMoneyLBL,Label1 As Label
	Private ScrollView1 As ScrollView
	Private save_btn,map_select_btn As Button
	Private name_family_et,email_et,tel_et,address,masahateYahteKeshET,moaref_et,NationalCode_et As EditText
	Private vahed_spinner,state_spinner As Spinner
	Dim IME As IME
	Dim SeaLevel As String
	Dim userDataMap As Map
	Private ActionBar As ACToolBarDark
	Dim CityACET As AutoCompleteEditText
	Dim Config 	As Amir_SliderConfig
	Dim Show 	As Amir_SliderShow
	Dim MyToast As CToast
	Dim Snake As DSSnackbar
	Private ScenarioPanel As Panel
End Sub

Sub Activity_Create(FirstTime As Boolean)
	
	SaeloZahra.SetStatusBarColor(SaeloZahra.NewcolorDark)
	Activity.LoadLayout("SVNewlayout")
	ScrollView1.Panel.LoadLayout("sabte_etelaat_baghdaran_layout")
	
	IME.Initialize("IME")
	IME.AddHeightChangedEvent
	
	ActionBar.Color=SaeloZahra.NewColor
	ActionBar.Title=SaeloZahra.CSB("ثبت اطلاعات باغداران")
	ActionBar.TitleTextColor=Colors.White
	ActionBar.NavigationIconDrawable = X1.GetDrawable("baseline_arrow_back_white_24")
	Main.amaroid.TrackView(ActionBar.title)
	
	save_btn.Color = SaeloZahra.NewColor
	save_btn.textColor = Colors.White
	
	masahateYahteKeshET.Typeface=SaeloZahra.font
	Label1.Typeface=SaeloZahra.font
	save_btn.Typeface=SaeloZahra.font
	map_select_btn.Typeface=SaeloZahra.font
	
	name_family_et.Typeface=SaeloZahra.font
	tel_et.Typeface=SaeloZahra.font
	email_et.Typeface=SaeloZahra.font
	moaref_et.Typeface=SaeloZahra.font
	address.Typeface=SaeloZahra.font
	NationalCode_et.Typeface=SaeloZahra.font
	CityACET.Typeface=SaeloZahra.font
	ScenarioVASLBL.Typeface=SaeloZahra.font
	ScenarioMoneyLBL.Typeface=SaeloZahra.font
	
	ScenarioVASLBL_Click
	
	masahateYahteKeshET.Background=SaeloZahra.CD(SaeloZahra.newcolorLight)
	name_family_et.Background=SaeloZahra.CD(SaeloZahra.newcolorLight)
	NationalCode_et.Background=SaeloZahra.CD(SaeloZahra.newcolorLight)
	CityACET.Background=SaeloZahra.CD(SaeloZahra.newcolorLight)
	tel_et.Background=SaeloZahra.CD(SaeloZahra.newcolorLight)
	moaref_et.Background=SaeloZahra.CD(SaeloZahra.newcolorLight)
	email_et.Background=SaeloZahra.CD(SaeloZahra.newcolorLight)
	address.Background=SaeloZahra.CD(SaeloZahra.newcolorLight)
	map_select_btn.Background=SaeloZahra.CD(SaeloZahra.newcolorLight)
	
	tel_et.InputType=tel_et.INPUT_TYPE_PHONE
	NationalCode_et.InputType=tel_et.INPUT_TYPE_NUMBERS
	masahateYahteKeshET.InputType=tel_et.INPUT_TYPE_DECIMAL_NUMBERS
	moaref_et.InputType=tel_et.INPUT_TYPE_DECIMAL_NUMBERS
	
	
	
	File.Delete(SaeloZahra.dir,"address")
	
	vahed_spinner.Add("هکتار")
	vahed_spinner.Add("متر مربع")
	
	
'	If GetDeviceLayoutValues.Width > 500 Then
'		header_lbl.Left = header_lbl.Left -18dip
'		ScrollView1.Top=ScrollView1.Top+50dip
'	End If
	
	
	
	state_spinner.Add("فارس")
	state_spinner.Add("البرز")
	state_spinner.Add("اصفهان")
	state_spinner.Add("اردبيل")
	state_spinner.Add("ايلام")
	state_spinner.Add("آذربایجان‌شرقی")
	state_spinner.Add("آذربایجان‌غربی")
	state_spinner.Add("بوشهر")
	state_spinner.Add("تهران")
	state_spinner.Add("چهارمحال‌و‌بختیاری")
	state_spinner.Add("خراسان‌جنوبی")
	state_spinner.Add("خراسان‌رضوی")
	state_spinner.Add("خراسان‌شمالی")
	state_spinner.Add("خوزستان")
	state_spinner.Add("زنجان")
	state_spinner.Add("سمنان")
	state_spinner.Add("سیستان‌و‌بلوچستان")
	state_spinner.Add("سیستان‌و‌بلوچستان")
	state_spinner.Add("قزوين")
	state_spinner.Add("قم")
	state_spinner.Add("كردستان")
	state_spinner.Add("كرمان")
	state_spinner.Add("كرمانشاه")
	state_spinner.Add("کهگیلویه‌و‌بویراحمد")
	state_spinner.Add("گلستان")
	state_spinner.Add("گيلان")
	state_spinner.Add("لرستان")
	state_spinner.Add("مازندران")
	state_spinner.Add("مركزي")
	state_spinner.Add("هرمزگان")
	state_spinner.Add("همدان")
	state_spinner.Add("يزد")
	
	
	Try
			
		If SQL1.IsInitialized = False Then
			SQL1.Initialize(SaeloZahra.dir,"db.db",False)
		End If
		
		cu1 = SQL1.ExecQuery("SELECT * FROM ostanha")
		Dim listCity As List
		listCity.Initialize
		For i = 0 To cu1.RowCount-1
			cu1.Position = i
			listCity.Add(cu1.GetString("city"))
		Next
		CityACET.SetItems(listCity)

	Catch
		Log(LastException)
	End Try
	
	If SaeloZahra.P.SdkVersion>23 Then
		Config.Initialize
		Config.position(Config.POSITION_LEFT)
		Config.primaryColor(SaeloZahra.NewcolorDark)
		Config.edge(True)
		Config.sensitivity(100)
		Config.scrimColor(Colors.ARGB(180,0,0,0))
		
		Show.convertActivityToTranslucent
		Show.attachActivity(Config)
	End If
	
	
	MyToast.Initialize(Activity,Me,Activity.Height,Activity.Width)
	
	jobOtpOtherGenerate.Initialize("jobOtpOtherGenerate",Me)
	job_otp_generate.Initialize("job_otp_generate",Me)
	job1.Initialize("job1",Me)
	
End Sub

Sub Activity_Resume
	
	Starter.rp.CheckAndRequest(Starter.rp.PERMISSION_ACCESS_FINE_LOCATION)
	Wait For Activity_PermissionResult (Permission As String, Result As Boolean)
	If Result Then CallSubDelayed(Starter, "StartGPS")
	
'	ScrollView1.Height=100%y-ScrollView1.Top
	ScrollView1.Panel.Height=save_btn.Top+save_btn.Height+33dip
	
	
	If File.Exists(SaeloZahra.dir,"mySeaLevel") Then
		SeaLevel = File.ReadString(SaeloZahra.dir,"mySeaLevel")
'		ToastMessageShow("ارتفاع شما از سطح دریا "&SeaLevel&" است",True)
	End If
	
	If File.Exists(SaeloZahra.dir,"address") Then
		address.Text=File.ReadString(SaeloZahra.dir,"address")
	End If
	
	If actType=="edit" Then
		Activity.Title=SaeloZahra.CSB("ویرایش اطلاعات باغداران")
		userDataMap = File.ReadMap(SaeloZahra.dir,"user.dat")
		
		name_family_et.Text = userDataMap.Get("name")
		NationalCode_et.Text = userDataMap.Get("nationalcode")
		tel_et.Text = userDataMap.Get("mobile")
		email_et.Text = userDataMap.Get("email")
		CityACET.Text = userDataMap.Get("city")
		address.Text = userDataMap.Get("address")
		masahateYahteKeshET.Text = userDataMap.Get("area")
		moaref_et.Text = userDataMap.Get("moaref")
		
		state_spinner.SelectedIndex = state_spinner.IndexOf(userDataMap.Get("state"))
		vahed_spinner.SelectedIndex = vahed_spinner.IndexOf(userDataMap.Get("unit"))
		
'		Select userDataMap.Get("unit")
'			Case "hectare"
'				vahed_spinner.SelectedIndex = 0
'			Case "meters"
'				vahed_spinner.SelectedIndex = 1
'		End Select
		save_btn.Text="ویرایش اطلاعات"
	End If
	
End Sub

Sub Activity_Pause (UserClosed As Boolean)
	SaeloZahra.P.HideKeyboard(Activity)
	Sleep(0)
End Sub






Sub Actionbar_NavigationItemClick
	Activity.Finish
	SaeloZahra.SetAnimation("zoom_enter","zoom_exit")
End Sub


Sub Activity_KeyPress (KeyCode As Int) As Boolean 'Return True to consume the event
	If KeyCode==KeyCodes.KEYCODE_BACK Then
		Actionbar_NavigationItemClick
		Return False
	Else
		Return True
	End If
End Sub


Sub map_select_btn_Click
	SaeloZahra.SetAnimation("zoom_exit","zoom_enter")
	select_map_act.NewTheme=True
	StartActivity(select_map_act)
End Sub



Sub save_btn_Click
	
	Dim place_lat As String=""
	Dim place_lng As String=""
	If File.Exists(SaeloZahra.dir,"place_lat") Then
		Dim place_lat As String = File.ReadString(SaeloZahra.dir,"place_lat")
	End If
	If File.Exists(SaeloZahra.dir,"place_lng") Then
		Dim place_lng As String = File.ReadString(SaeloZahra.dir,"place_lng")
	End If
		
	If name_family_et.Text=="" Then
		Snake.Initialize("snake",Activity,SaeloZahra.CSB("نام خود را وارد کنید"),Snake.DURATION_LONG)
		Snake.Show
		name_family_et.RequestFocus
		Return
	End If
	
	If tel_et.Text=="" Then
		Snake.Initialize("snake",Activity,SaeloZahra.CSB("شماره تماس خود را وارد کنید"),Snake.DURATION_LONG)
		Snake.Show
		tel_et.RequestFocus
		Return
	End If
	
	If CityACET.Text=="" Then
		Snake.Initialize("snake",Activity,SaeloZahra.CSB("شهر خود را وارد کنید"),Snake.DURATION_LONG)
		Snake.Show
		CityACET.RequestFocus
		Return
	End If
	
	If address.Text=="" Then
		Snake.Initialize("snake",Activity,SaeloZahra.CSB("آدرس را وارد کنید"),Snake.DURATION_LONG)
		Snake.Show
		address.RequestFocus
		Return
	End If
	
	If place_lat=="" Or place_lng=="" Then
		Snake.Initialize("snake",Activity,SaeloZahra.CSB("اول موقعیت خود را ذخیره کنید"),Snake.DURATION_LONG)
		Snake.Show
		
		SaeloZahra.SetAnimation("zoom_exit","zoom_enter")
		select_map_act.NewTheme=True
		StartActivity(select_map_act)
		Return
	End If
	
	
	
	If ScenarioPanel.Tag == "vas" Then
		
		Operator = SaeloZahra.pishhomare(tel_et.Text)
		ProgressDialogShow(SaeloZahra.CSB("کمی صبر کنید"))
		OTPCode = Rnd(1100,9999)
		If Operator == "hamrah" Then
			job_otp_generate.Download("http://server.mazraeyeman.ir:3400/telepormo/OTP_Generation.php?tel="&SaeloZahra.Replace0With98(tel_et.Text))
'		Else If Operator == "irancell" Then
	'		jobOtpOtherGenerate.Download(SaeloZahra.json_url&"sendSms.php?tel="&tel_et.Text&"&text=کد ورود به نرم افزار مزرعه من "&OTPCode&" است.")
	'		Main.oBillingManager.RequestPayment(Application.PackageName,"subs","پرداخت هزینه نرم افزار مزرعه من")
		Else
			jobOtpOtherGenerate.Download(SaeloZahra.json_url&"sendSms.php?tel="&tel_et.Text&"&text=کد ورود به نرم افزار مزرعه من "&OTPCode&" است."&CRLF&CRLF&"نام کاربری: "&tel_et.Text&CRLF&"کلمه عبور: "&tel_et.Text&CRLF&"هزینه روزانه :300 تومان")
		End If
					
	Else If ScenarioPanel.Tag == "money" Then
		save_btn.Text = "پرداخت و ثبت نام"
		ZarinPal_Payment.Activity_Now=Me
		ZarinPal_Payment.Description="پرداخت حق عضویت یک ساله مزرعه من برای جناب "&name_family_et.Text
		ZarinPal_Payment.E_Mail=email_et.Text
		ZarinPal_Payment.phone=tel_et.Text
		ZarinPal_Payment.money="72000"
		StartActivity(ZarinPal_Payment)
	End If
	
End Sub

Sub tel_et_TextChanged (Old As String, New As String)
	File.WriteString(SaeloZahra.dir,"usrnm",tel_et.Text)
	File.WriteString(SaeloZahra.dir,"pswd",tel_et.Text)
End Sub

Sub jobDone(job As HttpJob)
	ProgressDialogHide
	If job.Success Then
		LogColor(job.GetString,Colors.Yellow)
		
		Select job.JobName
			Case "jobOtpOtherGenerate"
				StartActivity(OTPConfirmNewAct)
			Case "job_otp_generate"
				
				Dim parser As JSONParser
				parser.Initialize(job.GetString)
				Dim root As Map = parser.NextObject
				Dim data As Map = root.Get("data")
				Dim statusInfo As Map = data.Get("statusInfo")
				OTPTransactionId = statusInfo.Get("OTPTransactionId")
				referenceCode = statusInfo.Get("referenceCode")
			
				StartActivity(OTPConfirmNewAct)
				
			Case "job1"
				If job.GetString == """success""" Then
					File.WriteString(SaeloZahra.dir,"usrnm",tel_et.Text)
					File.WriteString(SaeloZahra.dir,"pswd",tel_et.Text)
					StartService(accuWeatherCronJobService)
					SaeloZahra.beep("button-20.mp3")
					ToastMessageShow(SaeloZahra.CSB("ثبت نام با موفقیت انجام شد"),True)
					Activity.Finish
				Else If job.GetString == "shomare mobile sahih nist" Then
					tel_et.RequestFocus
					MyToast.ToastMessageShow2(SaeloZahra.CSB("شماره تماس صحیح نیست"), 2, 0, 0, "", Colors.White, Colors.Red,  15, True)
					
				Else If job.GetString == "wrong email" Then
					email_et.RequestFocus
					ToastMessageShow(SaeloZahra.CSB("پست الکترونیک وارد شده اشتباه است"),True)
				Else If job.GetString == "insert all fields" Then
					ToastMessageShow(SaeloZahra.CSB("تمام فیلد ها را وارد کنید"),True)
				Else If job.GetString == "tel Repetitious" Then
					tel_et.RequestFocus
					ToastMessageShow(SaeloZahra.CSB("شماره تماس تکراریست"),True)
				Else
					
					If job.ErrorMessage.Contains("Unable to resolve host") Then
						ToastMessageShow(SaeloZahra.CSB(" اینترنتتون وصل نیست "),True)
					Else
						ToastMessageShow(SaeloZahra.CSB(" خطا در ورود ")&CRLF&job.ErrorMessage,True)
					End If
					
				End If
		
		End Select
		
	Else
		If job.ErrorMessage.Contains("Unable to resolve host") Then
			ToastMessageShow(SaeloZahra.CSB(" اینترنتتون وصل نیست "),True)
		Else
			ToastMessageShow(SaeloZahra.CSB(" خطا در ورود ")&CRLF&job.ErrorMessage,True)
		End If
	End If
	job.Release
End Sub


Sub IME_HeightChanged(NewHeight As Int, OldHeight As Int)
	ScrollView1.Height = NewHeight-ScrollView1.Top
End Sub

Sub email_et_FocusChanged (HasFocus As Boolean)
	If Not(HasFocus) And email_et.Text<>"" Then
		If Not(SaeloZahra.ValidateEmail(email_et.Text)) Then
			email_et.SelectAll
			errorText="پست الکترونیک صحیح را وارد کنید"
			MyToast.ToastMessageShow2(SaeloZahra.CSB(errorText), 2, 0, 0, "", Colors.White, Colors.Red,  15, True)
		Else
			errorText=""
		End If
	End If
End Sub

Sub tel_et_FocusChanged (HasFocus As Boolean)
	tel_et.Text=SaeloZahra.ConvertEnglish(tel_et.Text)
	If Not(HasFocus) Then
		If Not(tel_et.Text.StartsWith("09")) Then
			tel_et.RequestFocus
			tel_et.SelectAll
			errorText="شماره تلفن با 09 آغاز میشود"
			MyToast.ToastMessageShow2(SaeloZahra.CSB(errorText), 2, 0, 0, "", Colors.White, Colors.Red,  15, True)
		else If tel_et.Text.Length>11 Or tel_et.Text.Length<10 Then
			tel_et.RequestFocus
			tel_et.SelectAll
			errorText="تعداد ارقام شماره تماس صحیح نیست"
			MyToast.ToastMessageShow2(SaeloZahra.CSB(errorText), 2, 0, 0, "", Colors.White, Colors.Red,  15, True)
		Else
			errorText=""
		End If
	End If
	Operator = SaeloZahra.pishhomare(tel_et.Text)
End Sub


Sub NationalCode_et_FocusChanged (HasFocus As Boolean)
	NationalCode_et.Text=SaeloZahra.ConvertEnglish(NationalCode_et.Text)
	If NationalCode_et.Text.Length<8 Then
		errorText="کد ملی را به صورت کامل وارد کنید"
		MyToast.ToastMessageShow2(SaeloZahra.CSB(errorText), 2, 0, 0, "", Colors.White, Colors.Red,  15, True)
		
		NationalCode_et.SelectAll
	Else If NationalCode_et.Text.Length>10 Then
		errorText="تعداد ارقام بیش از حد مجاز"
		MyToast.ToastMessageShow2(SaeloZahra.CSB(errorText), 2, 0, 0, "", Colors.White, Colors.Red,  15, True)
		NationalCode_et.SelectAll
	Else
		errorText=""
	End If
End Sub



Sub ScenarioMoneyLBL_Click
	
	
	
	ScenarioMoneyLBL.SetColorAnimated(313,Colors.White,SaeloZahra.NewColorLight)
	ScenarioVASLBL.SetColorAnimated(313,SaeloZahra.NewColorLight,Colors.White)
	ScenarioVASLBL.Color=Colors.White
	
	
	Dim ScenarioMoneyCBS As CSBuilder
	ScenarioMoneyCBS.Initialize.Typeface(SaeloZahra.font).bold.Color(Colors.Red).Append("پیش پرداخت 1 ساله").Pop.Pop.Append(CRLF).Color(Colors.White).Typeface(SaeloZahra.font).Append("شرکت در قرعه کشی تراکتور").Append(CRLF).Append("20% تخفیف").Append(CRLF).Bold.Append("72 هزار تومان سالانه").PopAll
	ScenarioMoneyLBL.Text = ScenarioMoneyCBS
	
	Dim ScenarioVASCBS As CSBuilder
	ScenarioVASCBS.Initialize.Typeface(SaeloZahra.font).bold.Color(Colors.Red).Append("پرداخت روزانه اعتباری").Pop.Pop.Append(CRLF).Color(Colors.DarkGray).Typeface(SaeloZahra.font).Append("کسر روزانه 300 تومان از اعتبار تلفن همراه").Append(CRLF).Bold.Append("روزانه 300 تومان").PopAll
	ScenarioVASLBL.Text = ScenarioVASCBS
	
	
	
	
	ScenarioPanel.Tag=ScenarioMoneyLBL.Tag 'money
	
	
End Sub



Sub ScenarioVASLBL_Click
	
	ScenarioVASLBL.SetColorAnimated(313,Colors.White,SaeloZahra.NewColorLight)
	ScenarioMoneyLBL.SetColorAnimated(313,SaeloZahra.NewColorLight,Colors.White)
	
	
	Dim ScenarioMoneyCBS As CSBuilder
	ScenarioMoneyCBS.Initialize.Typeface(SaeloZahra.font).bold.Color(Colors.Red).Append("پیش پرداخت 1 ساله").Pop.Pop.Append(CRLF).Color(Colors.DarkGray).Typeface(SaeloZahra.font).Append("شرکت در قرعه کشی تراکتور").Append(CRLF).Append("20% تخفیف").Append(CRLF).Bold.Append("72 هزار تومان سالانه").PopAll
	ScenarioMoneyLBL.Text = ScenarioMoneyCBS
	
	Dim ScenarioVASCBS As CSBuilder
	ScenarioVASCBS.Initialize.Typeface(SaeloZahra.font).bold.Color(Colors.Red).Append("پرداخت روزانه اعتباری").Pop.Pop.Append(CRLF).Color(Colors.White).Typeface(SaeloZahra.font).Append("کسر روزانه 300 تومان از اعتبار تلفن همراه").Append(CRLF).Bold.Append("روزانه 300 تومان").PopAll
	ScenarioVASLBL.Text = ScenarioVASCBS
	
	
	ScenarioPanel.Tag=ScenarioVASLBL.Tag 'vas
	
	save_btn.Text = "ثبت نام"
	
End Sub



Sub Zarin_Pal_Request( Status As String, Kod_Payment As String)
	'اگر ستاتوس برابر 100 یا 101 بود تراکنش موفق بوده!
	'اگر ستاتوس برابر نال یا غیره بود تراکنش ناموفق بوده!
	If Status ="100" Or Status="101" Then
		Msgbox2("وضعیت تراکنش: "&Status& CRLF&"کد پیگیری تراکنش: " & Kod_Payment ,"وضعیت تراکنش",SaeloZahra.CSB("ثبت نام"),"","",Null)
		SubmitForm
	Else
		Msgbox("تراکنش ناموفق!","وضعیت تراکنش")
	End If
	Log(Status& CRLF & Kod_Payment)
End Sub



Sub SubmitForm
	
	Dim place_lat As String=""
	Dim place_lng As String=""
	If File.Exists(SaeloZahra.dir,"place_lat") Then
		Dim place_lat As String = File.ReadString(SaeloZahra.dir,"place_lat")
	End If
	If File.Exists(SaeloZahra.dir,"place_lng") Then
		Dim place_lng As String = File.ReadString(SaeloZahra.dir,"place_lng")
	End If
		
	If name_family_et.Text=="" Then
		Snake.Initialize("snake",Activity,SaeloZahra.CSB("نام خود را وارد کنید"),Snake.DURATION_LONG)
		Snake.Show
		name_family_et.RequestFocus
		Return
	End If
	
	If tel_et.Text=="" Then
		Snake.Initialize("snake",Activity,SaeloZahra.CSB("شماره تماس خود را وارد کنید"),Snake.DURATION_LONG)
		Snake.Show
		tel_et.RequestFocus
		Return
	End If
	
	If CityACET.Text=="" Then
		Snake.Initialize("snake",Activity,SaeloZahra.CSB("شهر خود را وارد کنید"),Snake.DURATION_LONG)
		Snake.Show
		CityACET.RequestFocus
		Return
	End If
	
	If address.Text=="" Then
		Snake.Initialize("snake",Activity,SaeloZahra.CSB("آدرس را وارد کنید"),Snake.DURATION_LONG)
		Snake.Show
		address.RequestFocus
		Return
	End If
	
	If place_lat=="" Or place_lng=="" Then
		Snake.Initialize("snake",Activity,SaeloZahra.CSB("اول موقعیت خود را ذخیره کنید"),Snake.DURATION_LONG)
		Snake.Show
		
		SaeloZahra.SetAnimation("zoom_exit","zoom_enter")
		select_map_act.NewTheme=True
		StartActivity(select_map_act)
		Return
	End If
	
	Main.amaroid.TrackEvent("Register",1,"save_btn_Click",Activity.Title)
	
	If errorText=="" Then
		
		Select vahed_spinner.SelectedIndex
			Case 0
				vahed_spinner.Tag="hectare"
			Case 1
				vahed_spinner.Tag="meters"
		End Select
		
		job1.PostString(SaeloZahra.json_url&"farmers_insert.php?save=true","&nationalcode="&NationalCode_et.Text&"&name="&name_family_et.Text&"&mobile="&tel_et.Text&"&unit="&vahed_spinner.Tag&"&area="&masahateYahteKeshET.Text&"&email="&email_et.Text&"&moaref="&moaref_et.Text&"&location="&place_lat&","&place_lng&"&state="&state_spinner.SelectedItem&"&city="&CityACET.Text&"&address="&address.Text&"&sealevel="&SeaLevel)
		ProgressDialogShow(SaeloZahra.CSB("در حال ثبت نام..."))
		
	Else
		ToastMessageShow(SaeloZahra.CSB(errorText),True)
	End If
	
End Sub