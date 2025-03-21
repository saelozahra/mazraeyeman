B4A=true
Group=OLD
ModulesStructureVersion=1
Type=Activity
Version=8.3
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
	Dim cu1 As Cursor
	Dim SQL1 As SQL
End Sub

Sub Globals
	Dim errorText As String=""
	Dim job1,job_otp_generate,jobOtpOtherGenerate As HttpJob
	Private header_lbl ,subtitle_lbl,Label1 As Label
	Private ScrollView1 As ScrollView
	Private back,save_btn,map_select_btn As Button
	Private name_family_et,email_et,tel_et,address,masahateYahteKeshET,moaref_et,NationalCode_et As EditText
	Private vahed_spinner,state_spinner As Spinner
	Dim IME As IME
	Dim SeaLevel As String
	Dim userDataMap As Map
	Private CityACET As AutoCompleteEditText
End Sub

Sub Activity_Create(FirstTime As Boolean)
	
	SaeloZahra.SetStatusBarColor(SaeloZahra.colorDark)
	Activity.LoadLayout("sv_layout")
	ScrollView1.Panel.LoadLayout("sabte_etelaat_baghdaran_layout")
	
	IME.Initialize("IME")
	IME.AddHeightChangedEvent
	
	header_lbl.Text="ثبت اطلاعات باغداران"
	
	masahateYahteKeshET.Typeface=SaeloZahra.font
	Label1.Typeface=SaeloZahra.font
	header_lbl.Typeface=SaeloZahra.fontBold
	subtitle_lbl.Typeface=SaeloZahra.font
	save_btn.Typeface=SaeloZahra.font
	map_select_btn.Typeface=SaeloZahra.font
	
	name_family_et.Typeface=SaeloZahra.font
	tel_et.Typeface=SaeloZahra.font
	email_et.Typeface=SaeloZahra.font
	moaref_et.Typeface=SaeloZahra.font
	address.Typeface=SaeloZahra.font
	NationalCode_et.Typeface=SaeloZahra.font
	CityACET.Typeface=SaeloZahra.font
	
	masahateYahteKeshET.Background=SaeloZahra.CD(SaeloZahra.colorLight)
	name_family_et.Background=SaeloZahra.CD(SaeloZahra.colorLight)
	NationalCode_et.Background=SaeloZahra.CD(SaeloZahra.colorLight)
	CityACET.Background=SaeloZahra.CD(SaeloZahra.colorLight)
	tel_et.Background=SaeloZahra.CD(SaeloZahra.colorLight)
	moaref_et.Background=SaeloZahra.CD(SaeloZahra.colorLight)
	email_et.Background=SaeloZahra.CD(SaeloZahra.colorLight)
	address.Background=SaeloZahra.CD(SaeloZahra.colorLight)
	map_select_btn.Background=SaeloZahra.CD(SaeloZahra.colorLight)
	
	tel_et.InputType=tel_et.INPUT_TYPE_PHONE
	NationalCode_et.InputType=tel_et.INPUT_TYPE_NUMBERS
	masahateYahteKeshET.InputType=tel_et.INPUT_TYPE_DECIMAL_NUMBERS
	moaref_et.InputType=tel_et.INPUT_TYPE_DECIMAL_NUMBERS
	
	
	Dim csb_sub As CSBuilder
	csb_sub.Initialize
	csb_sub.Typeface(SaeloZahra.font)
	csb_sub.Color(Colors.White)
	csb_sub.Append(" اطلاعات ")
'	csb_sub.Color(0xFFFFCD44)
'	csb_sub.Bold
'	csb_sub.Append(" باغ ")
'	csb_sub.Pop
	csb_sub.Color(Colors.White)
	csb_sub.Append(" خود را وارد نمائید ")
	csb_sub.PopAll
	subtitle_lbl.Text=csb_sub
	
	
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
	
	Main.amaroid.TrackView(header_lbl.Text&"  - قدیم")
	
	
End Sub

Sub Activity_Resume
	
	Starter.rp.CheckAndRequest(Starter.rp.PERMISSION_ACCESS_FINE_LOCATION)
	Wait For Activity_PermissionResult (Permission As String, Result As Boolean)
	If Result Then CallSubDelayed(Starter, "StartGPS")
	
	ScrollView1.Height=100%y-SaeloZahra.GetStatusBarHeight-ScrollView1.Top
	ScrollView1.Panel.Height=save_btn.Top+save_btn.Height+18dip
	
	If File.Exists(SaeloZahra.dir,"mySeaLevel") Then
		SeaLevel = File.ReadString(SaeloZahra.dir,"mySeaLevel")
'		ToastMessageShow("ارتفاع شما از سطح دریا "&SeaLevel&" است",True)
	End If
	
	If File.Exists(SaeloZahra.dir,"address") Then
		address.Text=File.ReadString(SaeloZahra.dir,"address")
	End If
	
	If actType=="edit" Then
		header_lbl.Text="ویرایش اطلاعات باغداران"
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

End Sub





Sub back_Click
	Actionbar_NavigationItemClick
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
	If errorText=="" Then
		
		Select vahed_spinner.SelectedIndex
			Case 0
				vahed_spinner.Tag="hectare"
			Case 1
				vahed_spinner.Tag="meters"
		End Select
		
		Dim place_lat As String=""
		Dim place_lng As String=""
		If File.Exists(SaeloZahra.dir,"place_lat") Then
			Dim place_lat As String = File.ReadString(SaeloZahra.dir,"place_lat")
		End If
		If File.Exists(SaeloZahra.dir,"place_lng") Then
			Dim place_lng As String = File.ReadString(SaeloZahra.dir,"place_lng")
		End If
		
		job_otp_generate.Initialize("job_otp_generate",Me)
		jobOtpOtherGenerate.Initialize("jobOtpOtherGenerate",Me)
		job1.Initialize("job1",Me)
		job1.PostString(SaeloZahra.json_url&"farmers_insert.php?save=true","&nationalcode="&NationalCode_et.Text&"&name="&name_family_et.Text&"&mobile="&tel_et.Text&"&unit="&vahed_spinner.Tag&"&area="&masahateYahteKeshET.Text&"&email="&email_et.Text&"&moaref="&moaref_et.Text&"&location="&place_lat&","&place_lng&"&state="&state_spinner.SelectedItem&"&city="&CityACET.Text&"&address="&address.Text&"&sealevel="&SeaLevel)
		ProgressDialogShow(SaeloZahra.CSB("در حال ثبت نام..."))
		
	Else
		ToastMessageShow(SaeloZahra.CSB(errorText),True)
	End If
	
End Sub


Sub jobDone(job As HttpJob)
	ProgressDialogHide
	If job.Success Then
		LogColor(job.GetString,Colors.Yellow)
		
		Select job.JobName
			Case "job_otp_generate"
				Dim parser As JSONParser
				parser.Initialize(job.GetString)
				Dim root As Map = parser.NextObject
				Dim data As Map = root.Get("data")
				Dim statusInfo As Map = data.Get("statusInfo")
				OTPTransactionId = statusInfo.Get("OTPTransactionId")
				referenceCode = statusInfo.Get("referenceCode")
			
				StartActivity(otp_confirm_act)
				
			Case "job1"
				If job.GetString == """success""" Then
					
					File.WriteString(SaeloZahra.dir,"usrnm",tel_et.Text)
					File.WriteString(SaeloZahra.dir,"pswd",tel_et.Text)
					Activity.Finish
					SaeloZahra.beep("button-20.mp3")
					ToastMessageShow(SaeloZahra.CSB("ثبت نام با موفقیت انجام شد"),True)
					
					If SaeloZahra.pishhomare(tel_et.Text) == "hamrah" Then
						job_otp_generate.Download("http://server.mazraeyeman.ir:3400/telepormo/OTP_Generation.php?tel="&SaeloZahra.Replace0With98(tel_et.Text))
					Else If SaeloZahra.pishhomare(tel_et.Text) == "irancell" Then
						Main.oBillingManager.RequestPayment(Main.KEY,"subs","پرداخت هزینه نرم افزار مزرعه من")
					Else
						OTPCode = Rnd(1100,9999)
						jobOtpOtherGenerate.Download("http://mazraeyeman.ir/reseller/api_files/sendSms.php?tel="&tel_et.Text&"&text=کد ورود به نرم افزار مزرعه من "&OTPCode&" است.")
					End If
					
					
				Else If job.GetString == "shomare mobile sahih nist" Then
					tel_et.RequestFocus
					ToastMessageShow(SaeloZahra.CSB("شماره تماس صحیح نیست"),True)
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
	ScrollView1.Height = NewHeight-SaeloZahra.GetStatusBarHeight-ScrollView1.Top
'	EditText1.Height = btnHideKeyboard.Top - EditText1.Top
End Sub

Sub email_et_FocusChanged (HasFocus As Boolean)
	If Not(HasFocus) Then
		If Not(SaeloZahra.ValidateEmail(email_et.Text)) Then
			email_et.SelectAll
			errorText="پست الکترونیک صحیح را وارد کنید"
			ToastMessageShow(SaeloZahra.CSB(errorText),True)
		Else
			errorText=""
		End If
	End If
End Sub

Sub tel_et_FocusChanged (HasFocus As Boolean)
	If Not(HasFocus) Then
		If Not(tel_et.Text.StartsWith("09")) Then
			tel_et.RequestFocus
			tel_et.SelectAll
			errorText="شماره تلفن با 09 آغاز میشود"
			ToastMessageShow(SaeloZahra.CSB(errorText),True)
		else If tel_et.Text.Length>11 Or tel_et.Text.Length<10 Then
			tel_et.RequestFocus
			tel_et.SelectAll
			errorText="تعداد ارقام شماره تماس صحیح نیست"
			ToastMessageShow(SaeloZahra.CSB(errorText),True)
		Else
			errorText=""
		End If
	End If
End Sub


Sub NationalCode_et_FocusChanged (HasFocus As Boolean)
	If NationalCode_et.Text.Length<9 Then
		errorText="کد ملی را به صورت کامل وارد کنید"
		ToastMessageShow(SaeloZahra.CSB(errorText),True)
		NationalCode_et.SelectAll
	Else If NationalCode_et.Text.Length>10 Then
		errorText="تعداد ارقام بیش از حد مجاز"
		ToastMessageShow(SaeloZahra.CSB(errorText),True)
		NationalCode_et.SelectAll
	Else
		errorText=""
	End If
End Sub