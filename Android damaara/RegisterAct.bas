B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=9.5
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
	#IgnoreWarnings: 9
#End Region

Sub Process_Globals
	Dim ActType As String = "register"
'	Dim OTPTransactionId As String
'	Dim referenceCode As String
	Dim OTPCode As String = ""
	Dim Operator As String = ""
	Dim CU1 As Cursor
	Dim SQL1 As SQL
	Dim gheimatKamel As Int 	 = 80000
	Dim TedadNafarateKamel As Int= 12
	Dim TedadRoozTrial As Int= 14
	Dim TimeStamp As Long
	Dim Payed As Int = 0
	Dim DefaultResseller As Int = 6
End Sub

Sub Globals
	Dim X1 As XmlLayoutBuilder
	Dim errorText As String=""
	Dim job1,jobOtpGenerate,JobGetPayUser,JobCheckUserName As HttpJob
	Private ScenarioTrialLbl,ScenarioMoneyLBL,Label1 As Label
	Private ScrollView1 As ScrollView
	Private save_btn,map_select_btn As Button
	Private name_family_et,email_et,tel_et,address,masahateYahteKeshET,moaref_et,NationalCode_et As EditText
	Private vahed_spinner,state_spinner As Spinner
	Dim IME As IME
	Dim Int1 As Intent
	Dim URI As String
	Dim SeaLevel As String
	Dim userDataMap As Map
	Private ActionBar As ACToolBarDark
	Dim CityACET As AutoCompleteEditText
	Dim Config 	As Amir_SliderConfig
	Dim Show 	As Amir_SliderShow
	Dim MyToast As CToast
	Dim Snake As DSSnackbar
	Private ScenarioPanel As Panel
	Dim customBrowser As JK_CustomTabsBrowser
	Dim ScenarioMoneyLayout,ScenarioTrialLayout As Map
	Dim WaitForPay As Boolean = False
'	Dim oBillingManager As PBillingManager3
	Private SendSmsBtn As Button
	Private CodeEt As EditText
	Private OtherThanTelPanel As B4XView
End Sub

Sub Activity_Create(FirstTime As Boolean)
'	ToastMessageShow("آمیر آقا حواست باشه",True)'SendSmsBtn_LongClick
	SaeloZahra.SetStatusBarColor(SaeloZahra.ColorDark)
	Activity.LoadLayout("SVNewlayout")
	ScrollView1.Panel.LoadLayout("sabte_etelaat_baghdaran_layout")
	
	IME.Initialize("IME")
	IME.AddHeightChangedEvent
	
	ActionBar.Color=SaeloZahra.Color
	ActionBar.Title=SaeloZahra.CSB("ثبت‌نام مزرعه داران")
	ActionBar.TitleTextColor=Colors.White
	ActionBar.NavigationIconDrawable = X1.GetDrawable("baseline_arrow_back_white_24")
'	Main.amaroid.TrackView(ActionBar.title)
	
	save_btn.Color = SaeloZahra.Color
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
	ScenarioTrialLbl.Typeface=SaeloZahra.font
	ScenarioMoneyLBL.Typeface=SaeloZahra.font
	SendSmsBtn.Typeface=SaeloZahra.font
	CodeEt.Typeface=SaeloZahra.font
	SendSmsBtn.Color=SaeloZahra.Color
	SendSmsBtn.TextColor=Colors.White
	
	
	ScenarioTrialLBL_Click
	
	masahateYahteKeshET.Background=SaeloZahra.CD(SaeloZahra.ColorLight)
	name_family_et.Background=SaeloZahra.CD(SaeloZahra.ColorLight)
	NationalCode_et.Background=SaeloZahra.CD(SaeloZahra.ColorLight)
	CityACET.Background=SaeloZahra.CD(SaeloZahra.ColorLight)
	tel_et.Background=SaeloZahra.CD(SaeloZahra.ColorLight)
	moaref_et.Background=SaeloZahra.CD(SaeloZahra.ColorLight)
	email_et.Background=SaeloZahra.CD(SaeloZahra.ColorLight)
	address.Background=SaeloZahra.CD(SaeloZahra.ColorLight)
	map_select_btn.Background=SaeloZahra.CD(SaeloZahra.ColorLight)
	
	tel_et.InputType=tel_et.INPUT_TYPE_PHONE
	NationalCode_et.InputType=tel_et.INPUT_TYPE_NUMBERS
	masahateYahteKeshET.InputType=tel_et.INPUT_TYPE_DECIMAL_NUMBERS
	moaref_et.InputType=tel_et.INPUT_TYPE_DECIMAL_NUMBERS
	
	If DefaultResseller > 0 Then moaref_et.Text = DefaultResseller
	
	
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
		
		CU1 = SQL1.ExecQuery("SELECT * FROM ostanha")
		Dim listCity As List
		listCity.Initialize
		For i = 0 To CU1.RowCount-1
			CU1.Position = i
			listCity.Add(CU1.GetString("city"))
		Next
		CityACET.SetItems(listCity)

	Catch
		Log(LastException)
	End Try
	
	If SaeloZahra.P.SdkVersion>23 Then
		Config.Initialize
		Config.position(Config.POSITION_LEFT)
		Config.primaryColor(SaeloZahra.ColorDark)
		Config.edge(True)
		Config.sensitivity(100)
		Config.scrimColor(Colors.ARGB(180,0,0,0))
		
		Show.convertActivityToTranslucent
		Show.attachActivity(Config)
	End If
	
	
	MyToast.Initialize(Activity,Me,Activity.Height,Activity.Width)
	
	JobCheckUserName.Initialize("JobCheckUserName",Me)
	JobGetPayUser.Initialize(	"JobGetPayUser",Me)
	jobOtpGenerate.Initialize(	"jobOtpGenerate",Me)
	job1.Initialize("job1",Me)
	
	
	
	
	customBrowser.Initialize
	customBrowser.ToolbarColor = SaeloZahra.Color
	customBrowser.ShowTitle = True
	customBrowser.Build
	
	
	ScenarioMoneyLayout.Initialize
	ScenarioMoneyLayout.Put("left",ScenarioMoneyLBL.Left)
	ScenarioMoneyLayout.Put("width",ScenarioMoneyLBL.Width)
	ScenarioMoneyLayout.Put("top",ScenarioMoneyLBL.Top)
	ScenarioMoneyLayout.Put("height",ScenarioMoneyLBL.Height)
	ScenarioTrialLayout.Initialize
	ScenarioTrialLayout.Put("left",ScenarioTrialLbl.Left)
	ScenarioTrialLayout.Put("width",ScenarioTrialLbl.Width)
	ScenarioTrialLayout.Put("top",ScenarioTrialLbl.Top)
	ScenarioTrialLayout.Put("height",ScenarioTrialLbl.Height)
	
	
	onlyTrialorMoney("")

End Sub

Sub GetIntent As Intent
	Dim sR As Reflector
	sR.Target=sR.GetActivity
	Return sR.RunMethod("getIntent")
End Sub

Sub Activity_Resume
	
	
	Int1 = GetIntent
	If Int1.Action = Int1.ACTION_VIEW Then
		URI=Int1.GetData
		LogColor(URI,Colors.Yellow)
		If URI.StartsWith("mm://mazraeyeman.ir") Then
			If URI.Replace("mm://mazraeyeman.ir?marja=","").Length>5 Then
				Snake.Initialize("snake",Activity,SaeloZahra.CSB("پرداخت با موفقیت انجام شد"),Snake.DURATION_LONG)
				Zarin_Pal_Request("موفق",URI.Replace("mm://mazraeyeman.ir?marja=",""))
			Else
				Snake.Initialize("snake",Activity,SaeloZahra.CSB("خطا در پرداخت"),Snake.DURATION_LONG)
			End If
				Snake.Show
		Else
			If WaitForPay Then
				JobGetPayUser.Download(SaeloZahra.json_url&"payment.php?tel="&tel_et.Text)
			End If
		End If
	Else
		If WaitForPay Then
			JobGetPayUser.Download(SaeloZahra.json_url&"payment.php?tel="&tel_et.Text)
		End If
	End If
		
'	If tel_et.Text.Length>8 Then
'		CheckPurchusedJob.Initialize("CheckPurchusedJob",Starter)
'		CheckPurchusedJob.Download("https://seller.charkhoneh.com/ws/androidpublisher/v2/inquiry/purchases/subscriptions/msisdn/"&tel_et.Text&"?access_token=a0390850-ad76-37dd-a8d8-e3a0eadb1796")
'	End If

	Starter.rp.CheckAndRequest(Starter.rp.PERMISSION_ACCESS_FINE_LOCATION)
	Wait For Activity_PermissionResult (Permission As String, Result As Boolean)
	If Result Then CallSubDelayed(Starter, "StartGPS")
	
'	ScrollView1.Height=100%y-ScrollView1.Top
	ScrollView1.Panel.Height=OtherThanTelPanel.Top+OtherThanTelPanel.Height+33dip
	
	
	If File.Exists(SaeloZahra.dir,"mySeaLevel") Then
		SeaLevel = File.ReadString(SaeloZahra.dir,"mySeaLevel")
'		ToastMessageShow("ارتفاع شما از سطح دریا "&SeaLevel&" است",True)
	End If
	
	If File.Exists(SaeloZahra.dir,"address") Then
		address.Text=File.ReadString(SaeloZahra.dir,"address")
	End If
	
	If ActType=="edit" Then
		
		tel_et.Enabled=False
		
		ScenarioPanel.Enabled=False
		SaeloZahra.SetAlpha(ScenarioPanel,0.7)
		ScenarioMoneyLBL.Enabled=False
		SaeloZahra.SetAlpha(ScenarioMoneyLBL,0.7)
		ScenarioTrialLbl.Enabled=False
		SaeloZahra.SetAlpha(ScenarioTrialLbl,0.7)
		
		SendSmsBtn.SetVisibleAnimated(313,False)
		CodeEt.SetVisibleAnimated(313,False)
		OtherThanTelPanel.SetVisibleAnimated(313,True)
		
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
		
		Dim locs() As String = Regex.Split(",", userDataMap.Get("location"))
		
		
		
		File.WriteString(SaeloZahra.dir,"place_lat",locs(0))
		File.WriteString(SaeloZahra.dir,"place_lng",locs(1))
		
		
		JobGetPayUser.Download(SaeloZahra.json_url&"payment.php?tel="&tel_et.Text)
		
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
	Sleep(0)
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
		
		map_select_btn_Click
		Return
	End If
	
	
	
	If ScenarioPanel.Tag == "trial" Or ActType<>"edit" Then
		ToastMessageShow(SaeloZahra.CSB("نرم افزار تا "&TedadRoozTrial&" روز به صورت رایگان برای شما فعال شد"),True)
		SubmitForm
	Else If ScenarioPanel.Tag == "money" Then
		save_btn.Text = "پرداخت و ثبت نام"
		If ActType=="edit" And Payed==0 Then
			save_btn.Text = "پرداخت و ویرایش حساب"
		Else If ActType=="edit" And Payed==1 Then
			save_btn.Text = "ویرایش حساب کاربری"
		End If
'		ZarinPal_Payment.Activity_Now=Me
'		ZarinPal_Payment.Description="پرداخت حق عضویت یک ساله مزرعه من برای جناب "&name_family_et.Text
'		ZarinPal_Payment.E_Mail=email_et.Text
'		ZarinPal_Payment.phone=tel_et.Text
'		ZarinPal_Payment.money="81000"
'		StartActivity(ZarinPal_Payment)
		WaitForPay = True
		If Payed==1 Or SaeloZahra.RayganHast Then
			SubmitForm
		Else
			customBrowser.CreateNewTab(SaeloZahra.json_url&"pec_pay/payment.php?tel="&tel_et.Text&"&Amount="&gheimatKamel&"0&OrderId="&Rnd(0,999)&tel_et.Text&Rnd(100,999))
		End If
	End If
	
End Sub



Sub tel_et_TextChanged (Old As String, New As String)
	If SaeloZahra.pishhomare(New) == "rightel" Then
'		onlyTrialorMoney("money")
	End If
	If New.Length>10 And ActType<>"edit" Then JobCheckUserName.Download(SaeloZahra.json_url&"check_farmer.php?tel="&New)
End Sub


' در این تابع مشخص میکنیم که این شماره تماس از چه روش های پرداختی پشتیبانی میکند
Sub onlyTrialorMoney(thisType As String)
	ScenarioMoneyLBL.SetLayout(ScenarioMoneyLayout.Get("left"),ScenarioMoneyLayout.Get("top"),ScenarioMoneyLayout.Get("width"),ScenarioMoneyLayout.Get("height"))
	ScenarioTrialLbl.SetLayout(ScenarioTrialLayout.Get("left"),ScenarioTrialLayout.Get("top"),ScenarioTrialLayout.Get("width"),ScenarioTrialLayout.Get("height"))
	If thisType == "Trial" Then
		ScenarioMoneyLBL.Visible=False
		ScenarioTrialLbl.Visible=True
		ScenarioTrialLbl.SetLayout(0,0,-2,-2)
	Else If thisType == "money" Then
		ScenarioTrialLbl.Visible=False
		ScenarioMoneyLBL.Visible=True
		ScenarioMoneyLBL.SetLayout(0,0,-2,-2)
	Else
		ScenarioTrialLbl.Visible=True
		ScenarioMoneyLBL.Visible=True
		ScenarioMoneyLBL.SetLayout(ScenarioMoneyLayout.Get("left"),ScenarioMoneyLayout.Get("top"),ScenarioMoneyLayout.Get("width"),ScenarioMoneyLayout.Get("height"))
		ScenarioTrialLbl.SetLayout(ScenarioTrialLayout.Get("left"),ScenarioTrialLayout.Get("top"),ScenarioTrialLayout.Get("width"),ScenarioTrialLayout.Get("height"))
	End If
End Sub

Sub jobDone(job As HttpJob)
	ProgressDialogHide
	If job.Success Then
		LogColor(job.JobName&" | "&job.GetString,Colors.Yellow)
		
		Select job.JobName
			Case "JobCheckUserName"
				Select job.GetString
					Case "enter tel"
						MyToast.ToastMessageShow2(SaeloZahra.CSB("شماره تماس ر ا وارد کنید"), 2, 0, 0, "", Colors.White, Colors.Red,  15, True)
						tel_et.RequestFocus
						tel_et.SelectAll
					Case "tel Repetitious"
						MyToast.ToastMessageShow2(SaeloZahra.CSB("شماره تماس تکراریست"), 2, 0, 0, "", Colors.White, Colors.Red,  15, True)
						tel_et.RequestFocus
						tel_et.SelectAll
						SendSmsBtn.Enabled=False
					Case Else
						SendSmsBtn.Enabled=True
				End Select
			Case "JobGetPayUser"
				If job.GetString<>"""not found""" Then
					
				Dim PayParser As JSONParser
				PayParser.Initialize(job.GetString)
				Dim PayRoot As List = PayParser.NextArray
				For Each PayColroot As Map In PayRoot
					If PayColroot.Get("amount") > "50000" Then
'						Dim orderid As String = PayColroot.Get("orderid")
						Payed=1
					End If
				Next
				End If
				If SaeloZahra.RayganHast Then Payed = 1
			Case "jobOtpGenerate"
'				If job.GetString.Length>18 Then
					CodeEt.SetVisibleAnimated(313,True)
					SendSmsBtn.SetLayoutAnimated(313,SendSmsBtn.Left,SendSmsBtn.Top,80dip,SendSmsBtn.Height)
					SendSmsBtn.Text="تائید"
'				End If
			Case "job1"
				If job.GetString == "success" Then
					File.WriteString(SaeloZahra.dir,"usrnm",tel_et.Text)
					File.WriteString(SaeloZahra.dir,"pswd",tel_et.Text)
					StartService(accuWeatherCronJobService)
					SaeloZahra.beep("button-20.mp3")
					ToastMessageShow(SaeloZahra.CSB("ثبت نام با موفقیت انجام شد"),True)
					Activity.Finish
				Else If job.GetString == "updated" Then
					ToastMessageShow(SaeloZahra.CSB("اطلاعات شما با موفقیت ویرایش شد"),True)
					ToastMessageShow(SaeloZahra.CSB("در ورود بعدی شما به سامانه ، اطلاعات جدید بارگزاری میشود"),True)
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
	
	If tel_et.Text.Length>10 Then
		If ActType<>"edit" Then JobCheckUserName.Download(SaeloZahra.json_url&"check_farmer.php?tel="&tel_et.Text)
		JobGetPayUser.Download(SaeloZahra.json_url&"payment.php?tel="&tel_et.Text)
	End If
	
End Sub


Sub NationalCode_et_FocusChanged (HasFocus As Boolean)
	If Not(HasFocus) Then
		NationalCode_et.Text=SaeloZahra.ConvertEnglish(NationalCode_et.Text)
		If NationalCode_et.Text.Length<9 Then
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
	End If
End Sub



Sub ScenarioMoneyLBL_Click
	
	
	
	ScenarioMoneyLBL.SetColorAnimated(313,Colors.White,SaeloZahra.ColorLight)
	ScenarioTrialLbl.SetColorAnimated(313,SaeloZahra.ColorLight,Colors.White)
	ScenarioTrialLbl.Color=Colors.White
	
	
	Dim ScenarioMoneyCBS As CSBuilder
	ScenarioMoneyCBS.Initialize.Typeface(SaeloZahra.font).bold.Color(Colors.Red).Append("خرید نقدی یکساله خدمات").Pop.Pop.Append(CRLF).Color(Colors.White).Typeface(SaeloZahra.font).Append("").Append(" "&SaeloZahra.ConvertPersian(gheimatKamel)&" تومان ").Append(CRLF).Bold.Append("با این خرید شما از تسهیلات کاربران ویژه بخش کشاورزی بهره مند خواهید شد").PopAll
	ScenarioMoneyLBL.Text = ScenarioMoneyCBS
	
	Dim ScenarioTrialCBS As CSBuilder
	ScenarioTrialCBS.Initialize.Typeface(SaeloZahra.font).bold.Color(Colors.Red).Append("تست "&TedadRoozTrial&" روزه رایگان").Pop.Pop.Append(CRLF).Color(Colors.DarkGray).Typeface(SaeloZahra.font).Append("تا "&TedadRoozTrial&" روز رایگان از امکانات سامانه استفاده کنید").Append(CRLF).PopAll'.Bold.Append("در این مدت با معرفی 12 نفر، نرم‌افزار را رایگان هدیه بگیرید")
	ScenarioTrialLbl.Text = ScenarioTrialCBS
	
	
	
	
	ScenarioPanel.Tag=ScenarioMoneyLBL.Tag 'money
	
	
End Sub



Sub ScenarioTrialLBL_Click
	
	ScenarioTrialLbl.SetColorAnimated(313,Colors.White,SaeloZahra.ColorLight)
	ScenarioMoneyLBL.SetColorAnimated(313,SaeloZahra.ColorLight,Colors.White)
	
	
	Dim ScenarioMoneyCBS As CSBuilder
	ScenarioMoneyCBS.Initialize.Typeface(SaeloZahra.font).bold.Color(Colors.Red).Append("خرید نقدی یکساله خدمات").Pop.Pop.Append(CRLF).Color(Colors.DarkGray).Typeface(SaeloZahra.font).Append("").Append(" "&SaeloZahra.ConvertPersian(gheimatKamel)&" تومان ").Append(CRLF).Bold.Append("با این خرید شما از تسهیلات کاربران ویژه بخش کشاورزی بهره مند خواهید شد").PopAll
	ScenarioMoneyLBL.Text = ScenarioMoneyCBS
	
	Dim ScenarioTrialCBS As CSBuilder
	ScenarioTrialCBS.Initialize.Typeface(SaeloZahra.font).bold.Color(Colors.Red).Append("تست "&TedadRoozTrial&" روزه رایگان").Pop.Pop.Append(CRLF).Color(Colors.White).Typeface(SaeloZahra.font).Append("تا "&TedadRoozTrial&" روز رایگان از امکانات سامانه استفاده کنید").Append(CRLF).PopAll'.Bold.Append("در این مدت با معرفی 12 نفر، نرم‌افزار را رایگان هدیه بگیرید")
	ScenarioTrialLbl.Text = ScenarioTrialCBS
	
	
	ScenarioPanel.Tag=ScenarioTrialLbl.Tag 'Trial
	
	save_btn.Text = "ثبت نام"
	
End Sub



Sub Zarin_Pal_Request( Status As String, Kod_Payment As String)
	'اگر ستاتوس برابر 100 یا 101 بود تراکنش موفق بوده!
	'اگر ستاتوس برابر نال یا غیره بود تراکنش ناموفق بوده!
	If Status ="100" Or Status="101" Or Status="موفق" Then
		Payed=1
		Msgbox2Async("وضعیت تراکنش: "&Status& CRLF&"کد پیگیری تراکنش: " & Kod_Payment ,"وضعیت تراکنش",SaeloZahra.CSB("ثبت نام"),"","",Null,True)
		SubmitForm
	Else
		Payed=0
		MsgboxAsync("تراکنش ناموفق!","وضعیت تراکنش")
	End If
	Log(Status& CRLF & Kod_Payment)
End Sub


' submit the form
Sub SubmitForm
	
	Dim place_lat As String=select_map_act.place_lat
	Dim place_lng As String=select_map_act.place_lng
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
		
		map_select_btn_Click
		Return
	End If
	
'	Main.amaroid.TrackEvent("Register",1,"save_btn_Click",Activity.Title)
	
	If errorText=="" Then
		
		Select vahed_spinner.SelectedIndex
			Case 0
				vahed_spinner.Tag="hectare"
			Case 1
				vahed_spinner.Tag="meters"
		End Select
		
		
		If ActType=="edit" Then
			job1.PostString(SaeloZahra.json_url&"farmers_insert.php?save=edit","&id="&Starter.my_id&"&nationalcode="&NationalCode_et.Text&"&name="&name_family_et.Text&"&unit="&vahed_spinner.Tag&"&area="&masahateYahteKeshET.Text&"&email="&email_et.Text&"&moaref="&moaref_et.Text&"&location="&place_lat&","&place_lng&"&state="&state_spinner.SelectedItem&"&city="&CityACET.Text&"&address="&address.Text&"&sealevel="&SeaLevel&"&pay_type="&ScenarioPanel.Tag&"&payed="&Payed)
		Else
			job1.PostString(SaeloZahra.json_url&"farmers_insert.php?save=true","&nationalcode="&NationalCode_et.Text&"&name="&name_family_et.Text&"&mobile="&tel_et.Text&"&unit="&vahed_spinner.Tag&"&area="&masahateYahteKeshET.Text&"&email="&email_et.Text&"&moaref="&moaref_et.Text&"&location="&place_lat&","&place_lng&"&state="&state_spinner.SelectedItem&"&city="&CityACET.Text&"&address="&address.Text&"&sealevel="&SeaLevel&"&pay_type="&ScenarioPanel.Tag&"&payed="&Payed)
		End If
			
		ProgressDialogShow(SaeloZahra.CSB("در حال ثبت نام..."))
		
	Else
		ToastMessageShow(SaeloZahra.CSB(errorText),True)
	End If
	
End Sub

Sub SendSmsBtn_Click
	If SendSmsBtn.Text == "تائید" Then
		If OTPCode==CodeEt.Text Then
			CodeEt.SetVisibleAnimated(313,False)
			SendSmsBtn.SetVisibleAnimated(313,False)
			OtherThanTelPanel.SetVisibleAnimated(313,True)
		Else
			
			CodeEt.Text=""
			
			Snake.Initialize("SmsSnake",Activity,SaeloZahra.CSB("کد وارد شده غلط است"),Snake.DURATION_LONG)
			Snake.SetAction(SaeloZahra.CSB("ارسال مجدد پیام"))
			Snake.Show
			SaeloZahra.P.HideKeyboard(Activity)
			
		End If
	Else
		Operator = SaeloZahra.pishhomare(tel_et.Text)
		ProgressDialogShow(SaeloZahra.CSB("کمی صبر کنید"))
		OTPCode = Rnd(1100,9999)
		TimeStamp=DateTime.Now
		Log(SaeloZahra.json_url&"sendSms.php?tel="&tel_et.Text&"&text="&name_family_et.Text&" عزیز، کد ورود به نرم افزار مزرعه من "&OTPCode&" است.")'&CRLF&CRLF&"نام کاربری: "&tel_et.Text&CRLF&"کلمه عبور: "&tel_et.Text)
		jobOtpGenerate.Download(SaeloZahra.json_url&"sendSms.php?tel="&tel_et.Text&"&text="&name_family_et.Text&" عزیز، کد ورود به نرم افزار مزرعه من "&OTPCode&" است.")'&CRLF&CRLF&"نام کاربری: "&tel_et.Text&CRLF&"کلمه عبور: "&tel_et.Text)
	End If
End Sub

'Sub SendSmsBtn_LongClick
'	CodeEt.SetVisibleAnimated(313,False)
'	SendSmsBtn.SetVisibleAnimated(313,False)
'	OtherThanTelPanel.SetVisibleAnimated(313,True)
'End Sub

Sub CodeEt_EnterPressed
	SendSmsBtn_Click
End Sub

Sub SmsSnake_Click()
	If TimeStamp+DateTime.TicksPerMinute>DateTime.Now Then
		jobOtpGenerate.Download(SaeloZahra.json_url&"sendSms.php?tel="&tel_et.Text&"&text="&name_family_et.Text&" عزیز، کد ورود به نرم افزار مزرعه من "&OTPCode&" است.")
	Else
		ToastMessageShow(" پس از یک دقیقه، مجددا امتحان کنید ",True)
		Snake.Initialize("SmsSnake",Activity,SaeloZahra.CSB("کد وارد شده غلط است"), 60000)
		Snake.SetAction(SaeloZahra.CSB("ارسال مجدد پیام"))
		Snake.Show
		SaeloZahra.P.HideKeyboard(Activity)
	End If
End Sub