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
	Dim Tmr As Timer
End Sub

Sub Globals
	Dim counter As Int = 300
	Dim job1 As HttpJob
	Dim cd As ColorDrawable
	Private username_et As EditText
	Private login_btn As Button
	Private TimerLbl As Label
	Private ActionBar As ACToolBarDark
End Sub

Sub Activity_Create(FirstTime As Boolean)

	Activity.LoadLayout("OtpNewLayout")
	cd.Initialize2(Colors.Transparent,14dip,2dip,SaeloZahra.NewcolorLight)
	username_et.Background=cd
	username_et.Typeface=SaeloZahra.font
	username_et.Gravity=Bit.Or(Gravity.CENTER_HORIZONTAL,Gravity.CENTER_VERTICAL)
	login_btn.Typeface=SaeloZahra.font
	
	ActionBar.Color		= SaeloZahra.NewColor
	ActionBar.title		= SaeloZahra.CSB("تائید هویت")
	ActionBar.SubTitle	= SaeloZahra.CSB("کد ارسال شده با پیامک را وارد کنید")
	Main.amaroid.TrackView(ActionBar.title)
	
	If GetDeviceLayoutValues.Height > 3000 Then
		SaeloZahra.SetNinePatchButton(login_btn,"btn_green","btn_green_pressed","")
	End If
	
	username_et.Top=username_et.Top+20dip
	username_et.Hint="کد تائید عضویت"
	username_et.InputType=username_et.INPUT_TYPE_NUMBERS
	
	
	login_btn.Color = SaeloZahra.NewColor
	login_btn.textColor = Colors.White
	login_btn.Text="تائید ورود"
	Tmr.Initialize("Tmr",1000)
	Tmr.Enabled=True
	counter = 300
	
	
	TimerLbl.Typeface=SaeloZahra.fontBold
	TimerLbl.Text="زمان باقیمانده"
	TimerLbl.Gravity=Bit.Or(Gravity.CENTER_HORIZONTAL,Gravity.CENTER_VERTICAL)
	
	SaeloZahra.SetStatusBarColor(SaeloZahra.NewcolorDark)
	
End Sub

Sub Activity_Resume
	Log(GetDeviceLayoutValues.Height)
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub



Sub login_btn_Click
	If RegisterNewAct.Operator=="hamrah" Then
		job1.Initialize("job1",Me)
		job1.Download("http://server.mazraeyeman.ir:3400/telepormo/OTP_Confirmation.php?tel="&SaeloZahra.Replace0With98(File.ReadString(SaeloZahra.dir,"usrnm"))&"&msg="&username_et.Text&"&referencecode="&RegisterNewAct.referenceCode&"&otptransaction="&RegisterNewAct.OTPTransactionId)
		ProgressDialogShow(SaeloZahra.CSB("در حال بررسی..."))
	Else
		If RegisterNewAct.OTPCode == username_et.Text Then
			ToastMessageShow(SaeloZahra.CSB("شماره تماس شما تائید شد"),True)
				
			If RegisterNewAct.Operator == "irancell" Then
				Main.oBillingManager.RequestPayment(Main.KEY,"subs","پرداخت هزینه نرم افزار مزرعه من")
			End If
			
'			StartActivity(home2_act)
		Else
			ToastMessageShow(SaeloZahra.CSB("کد وارد شده اشتباه است"),True)
		End If
	End If
End Sub

Sub BillingManager_ProductConsumed (Success As Boolean, Product As Purchase)
	FinishVAS
End Sub

Sub BillingManager_PurchaseCompleted (Success As Boolean, Product As Purchase)
	FinishVAS
End Sub

Sub jobDone(job As HttpJob)
	
	ProgressDialogHide
	
	If job.Success Then
		
		LogColor(job.GetString,Colors.DarkGray)
		
		Dim parser As JSONParser
		parser.Initialize(job.GetString)
		Dim root As Map = parser.NextObject
		Dim data As Map = root.Get("data")
		Dim statusInfo As Map = data.Get("statusInfo")
		Dim statusCode As String = statusInfo.Get("statusCode")
		
		If statusInfo.ContainsKey("errorInfo") Then
			
			Dim errorInfo As Map = statusInfo.Get("errorInfo")
			Dim msgDescription As String = errorInfo.Get("errorDescription")
			Dim errorCode As String = errorInfo.Get("errorCode")
			
			If errorCode=="51026" Then
				msgDescription="کد وارد شده اشتباه است"
			Else If errorCode=="SVC726" Then
				msgDescription="شما قبلا ثبت نام کرده اید"
				FinishVAS
			End If
			
		End If
		
		If statusCode == "200" Then
			msgDescription = "با موفقیت تائید شد"
			FinishVAS
'			StartActivity(login_act)
			FinishVAS
		End If
		
		ToastMessageShow(SaeloZahra.CSB(msgDescription),True)
		
	Else
		
		SaeloZahra.intent1.Initialize(SaeloZahra.intent1.ACTION_VIEW, "sms:"&SaeloZahra.smsNumber)
		SaeloZahra.intent1.PutExtra( "sms_body" , "1" )
		StartActivity(SaeloZahra.intent1)
					
		
		If job.ErrorMessage.Contains("Unable to resolve host") Then
			ToastMessageShow(SaeloZahra.CSB(" اینترنتتون وصل نیست "),True)
		Else
			ToastMessageShow(SaeloZahra.CSB(" خطا در ورود ")&CRLF&job.ErrorMessage,True)
		End If
		
	End If
	job.Release
End Sub



Sub Tmr_Tick
	If ( counter > 0) Then
		counter=counter-1
		Dim sMin As Int = Floor(counter / 60)
		Dim sSec As Int = counter Mod 60
		If sSec Mod 2 == 0 Then TimerLbl.SetTextColorAnimated(1000,SaeloZahra.NewcolorLight) Else TimerLbl.SetTextColorAnimated(1000,SaeloZahra.colorDark)
		Dim secPrefix As String =""
		Dim minPrefix As String =""
		If (sSec < 10) Then
			secPrefix = "0"
		End If
		If (sMin < 10 ) Then
			minPrefix = "0"
		End If
		TimerLbl.Text = SaeloZahra.CSB(minPrefix & sMin &":"& secPrefix & sSec)
	Else
		Activity.Finish
		Tmr.Enabled = False
	End If
 
End Sub

Sub FinishVAS
	Activity.Finish
	CallSubDelayed(RegisterNewAct,"SubmitForm")
	ProgressDialogShow(SaeloZahra.CSB("در حال ثبت اطلاعات"))
End Sub