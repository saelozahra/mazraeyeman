B4A=true
Group=OLD
ModulesStructureVersion=1
Type=Activity
Version=8.8
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True
#End Region

#Extends: android.support.v7.app.AppCompatActivity

Sub Process_Globals
	Dim intent1 As Intent
'	Dim NewTheme As Boolean = False
End Sub

Sub Globals
	Dim Config 	As Amir_SliderConfig
	Dim Show 	As Amir_SliderShow
	Dim CP As ContactPicker
	Dim Ime As IME
	Dim fab,share_fab,PayFab As FloatingActionButton
	Private ListView1 As ListView
'	Dim ShareApp As ShareMyApp
	Private ActionBar As ACToolBarDark
	Dim X1 As XmlLayoutBuilder
	Private InfoLbl As Label
	Dim CustomBrowser As JK_CustomTabsBrowser
End Sub

Sub Activity_Create(FirstTime As Boolean)
	
	
	SaeloZahra.SetStatusBarColor(SaeloZahra.ColorDark)
	Activity.LoadLayout("referralLayout")
	
	ListView1.SetLayout(ListView1.Left,ListView1.Top,ListView1.Width,ListView1.Height-SaeloZahra.GetStatusBarHeight)
	
	Ime.Initialize("IME")
	Ime.AddHeightChangedEvent
	
	InfoLbl.Color	= SaeloZahra.Color
	ActionBar.Color	= SaeloZahra.Color
	ActionBar.Title	= SaeloZahra.CSB("معرفی و دریافت جایزه")
	ActionBar.TitleTextColor=Colors.White
	ActionBar.NavigationIconDrawable = X1.GetDrawable("baseline_arrow_back_white_24")
	
	fab.ColorNormal=SaeloZahra.Color
	fab.ColorPressed=SaeloZahra.ColorDark
	fab.ColorRipple=SaeloZahra.ColorLight
	fab.IconDrawable = "baseline_add_white_24"
	
	PayFab.ColorNormal=SaeloZahra.Color
	PayFab.ColorPressed=SaeloZahra.ColorDark
	PayFab.ColorRipple=SaeloZahra.ColorLight
	PayFab.IconDrawable = "baseline_attach_money_white_24"
	PayFab.Indeterminate=True
	PayFab.ShowProgressBackground = False
	PayFab.ProgressWidth = 2dip
	PayFab.ProgressBackgroundColor = SaeloZahra.ColorDark
	'fabdesign1.setProgress(90,True)
	
	share_fab.ColorNormal	= SaeloZahra.ColorLight
	share_fab.ColorPressed	= SaeloZahra.ColorDark
	share_fab.ColorRipple	= SaeloZahra.Color
	share_fab.IconDrawable 	= "baseline_share_white_24"
	
	
	Dim csb_sub As CSBuilder
	csb_sub.Initialize
	csb_sub.Typeface(SaeloZahra.font)
	csb_sub.Size(12)
	csb_sub.Color(Colors.White)
	
	csb_sub.Append("بعد از اینکه دوستات حسابشون رو ")
	'کشاورزای دیگه رو به این نرم افزار دعوات کن و بعد از
	csb_sub.Color(0xFFFFCD44)
	csb_sub.Bold
	csb_sub.Append(" فعــال ")
	csb_sub.Pop
	csb_sub.Color(Colors.White)
	csb_sub.Append("کردن، جایزه رو می‌بری")
	
	csb_sub.PopAll
	ActionBar.SubTitle=csb_sub
	
	Activity.AddMenuItem(SaeloZahra.CSB("ارسال نرم افزار"),"ShareAPP")
	
	If FirstTime Then
		Dim tt As SimpleTooltipBuilder
		tt.Initialize("STT")
		tt.animated(True).animationDuration(1313).backgroundColor(SaeloZahra.ColorDark).arrowColor(SaeloZahra.ColorDark).dismissOnInsideTouch(True).dismissOnOutsideTouch(True).modal(True).text("کشاورزای دیگه رو به این لیست اضافه کنین"&CRLF&"و بعد روی اسمشون بزنین که براشون پیام ارسال بشه").textColor(Colors.White).anchorView(fab).gravityEnd.build
		tt.show
	End If
	
	If File.Exists(SaeloZahra.dir,"user.dat") Then
		Log("Moaref: "&File.ReadMap(SaeloZahra.dir,"user.dat").Get("moaref"))
		Dim moaref_payed_count As Int = File.ReadMap(SaeloZahra.dir,"user.dat").Get("moaref_payed_count")
		Dim CSBInfo As CSBuilder
		CSBInfo.Initialize
		CSBInfo.Typeface(SaeloZahra.font).Color(Colors.White)
		CSBInfo.Append("تا حالا ")
		CSBInfo.Color(0xFFFFCD44).Bold.Append(File.ReadMap(SaeloZahra.dir,"user.dat").Get("moaref")).Pop
		CSBInfo.Color(Colors.White).Append(" نفر با کد معرف شما عضو "&Application.LabelName&" شدن"&CRLF&" که ")
		CSBInfo.Color(0xFFFFCD44).Bold.Append(moaref_payed_count).Pop
		CSBInfo.Color(Colors.White).Append(" نفرشون هزینه رو پرداخت کردند.")
		If moaref_payed_count>0 Then
			CSBInfo.Append(CRLF).Append("تا حالا ").Color(0xFFFFCD44).Append((RegisterAct.gheimatKamel/RegisterAct.TedadNafarateKamel)*moaref_payed_count).Color(Colors.White).Append(" تومان تخفیف به ازای عضویت ").Color(0xFFFFCD44).Append(moaref_payed_count).Color(Colors.White).Append(" نفر شامل شما شده. برای پرداخت بقیه هزینه از دکمه روبرو استفاده کنید")
		End If
		CSBInfo.PopAll
		If File.ReadMap(SaeloZahra.dir,"user.dat").Get("moaref")=="0" Then
			CSBInfo.Initialize
			CSBInfo.Append("کسی تا حالا با کد معرف شما عضو نرم افزار نشده!")
		End If
	End If
	InfoLbl.Typeface=SaeloZahra.font
	InfoLbl.Text = CSBInfo

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
	
'	ActionBar.Menu.Add2(1,1,"Search",X1.GetDrawable("baseline_search_white_24")).ShowAsAction=2
	CP.Initialize(Me,"CP")
	
	ReloadListView
	
	CustomBrowser.Initialize
	CustomBrowser.ToolbarColor = SaeloZahra.Color
	CustomBrowser.ShowTitle = True
	CustomBrowser.Build
	
End Sub

Sub Activity_Resume
	
End Sub

Sub ReloadListView
	
	ListView1.Clear
	Dim L As List
	L.Initialize
	If File.Exists(SaeloZahra.dir,"Contact.list") Then L = File.ReadList(SaeloZahra.dir,"Contact.list")
	For i = 0 To L.Size-1
		LogColor("Active L is: "&L.Get(i),Colors.Yellow)
		Dim CName As String
		Dim CTels As String
		Try
			Dim components() As String
			components = Regex.Split("_|_", L.Get(i))
			Log(components.Length)
			CName = components(0)
			CTels = components(2)
		Catch
			CName = "نتوانستیم نام را بخوانیم"
			CTels = "نتوانستیم شماره را بخوانیم"
			Log("نشد کاکو")
			Log(LastException)
		End Try
		
		ListView1.AddTwoLines2(CName,CTels,CTels)
		
	Next
	
	ListView1.TwoLinesLayout.Label.TextColor=Colors.DarkGray
	ListView1.TwoLinesLayout.Label.Left=ListView1.TwoLinesLayout.Label.Left-20dip
	ListView1.TwoLinesLayout.Label.Typeface=SaeloZahra.font
	ListView1.TwoLinesLayout.Label.Gravity=Bit.Or(Gravity.RIGHT,Gravity.CENTER_VERTICAL)
	ListView1.TwoLinesLayout.SecondLabel.Left=ListView1.TwoLinesLayout.Label.Left-20dip
	ListView1.TwoLinesLayout.SecondLabel.Gravity=Bit.Or(Gravity.RIGHT,Gravity.CENTER_VERTICAL)
	ListView1.TwoLinesLayout.SecondLabel.Typeface=SaeloZahra.font
	ListView1.TwoLinesLayout.SecondLabel.TextColor=Colors.LightGray
	
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub PayFab_Click
	Dim moaref_payed_count As Int = File.ReadMap(SaeloZahra.dir,"user.dat").Get("moaref_payed_count")
	If moaref_payed_count == 0 Then
		Dim MablagheKol As String = RegisterAct.gheimatKamel
	Else
		Dim MablagheKol As String = RegisterAct.gheimatKamel-((RegisterAct.gheimatKamel/RegisterAct.TedadNafarateKamel)*moaref_payed_count)
	End If
	CustomBrowser.CreateNewTab(SaeloZahra.json_url&"pec_pay/payment.php?aftertrial=true&tel="&Starter.usrnm&"&Amount="&MablagheKol&"0&OrderId="&Rnd(0,999)&Starter.usrnm&Rnd(100,999))
End Sub

Sub ShareAPP_Click
	
'	Try
'		ShareApp.startShare(SaeloZahra.r.GetActivity , "ارسال نرم افزار به دیگران")
'	Catch
		Log(LastException)
		SaeloZahra.intent1.Initialize(SaeloZahra.intent1.ACTION_SEND,"")
		SaeloZahra.intent1.SetType("text/plain")
		SaeloZahra.intent1.PutExtra("android.intent.extra.TEXT", "نسخه آخر نرم افزار "&Application.LabelName&" را از "& CRLF & "mazraeyeman.ir/application"& CRLF & "دریافت کنید."& CRLF & "🌹🌷💐")
		SaeloZahra.intent1.WrapAsIntentChooser("اشتراک گذاری نرم افزار")
		StartActivity(SaeloZahra.intent1)
'	End Try
	
End Sub

Sub ListView1_ItemClick (Position As Int, Value As Object)
	intent1.Initialize(intent1.ACTION_VIEW, "sms:"&Value)
	intent1.PutExtra( "sms_body" , "سلام"&CRLF&"توی نرم افزار "&Application.LabelName &" عضو شو"& CRLF &"قبل از افتادن هر اتفاقی (مثل سرمازدگی و گرمازدگی و آفت و ...) برای مزرعه ات بهت اخطار میده "& CRLF&"داخلش میتونی کلی جایزه خوب هم ببری"& CRLF&"فقط حتما داخلش موقع ثبت نام برای کد معرف: "&Starter.my_id&" رو بزن 🌹"&CRLF&"لینک دریافت نرم افزار: MazraeyeMan.ir/Application" )
	StartActivity(intent1)
End Sub

Sub share_fab_Click
	ShareAPP_Click
End Sub

Sub fab_Click
	CP.ShowPicker
End Sub

Sub CP_ContactChooser(contact As Contact)
	
	Dim L1 As List
	L1.Initialize
	
	If File.Exists(SaeloZahra.dir,"Contact.list") Then
		L1 = File.ReadList(SaeloZahra.dir,"Contact.list")
	End If
	
	
	For Each T As String In contact.Phones
		Log(FindNumber(t))
		L1.Add(contact.Name&"_|_"&FindNumber(t))
	Next
	
	File.WriteList(SaeloZahra.dir,"Contact.list",L1)
	
	ReloadListView
	
	Dim snake As DSSnackbar
	snake.Initialize("snake",Activity,SaeloZahra.CSB("بعد از اضافه شدن دوستان به لیست، روی اسم آنها بزنید تا پیام برای آن‌ها ارسال شود"),snake.DURATION_LONG)
	snake.Show
	
End Sub


Sub FindNumber(str As String) As String
	Try
		Dim stx2() As String
		stx2=Regex.Split("Number=",str)
		Dim stx3() As String
		stx3=Regex.Split(",",stx2(1))
		stx3(0)=stx3(0).Replace("+980","0").Replace("00980","0").Replace(" ","").Replace("-","").Replace("/","").Replace("\","").Replace("_","").Replace(",","").Replace(".","").Replace("+98","0").Replace("0098","0").Replace("(","").Replace(")","")
		
		Return stx3(0)
		
	Catch
		Log(LastException)
		Return "شماره قابل انتخاب نیست"
	End Try
End Sub

Sub Actionbar_NavigationItemClick
	Activity.Finish
	SaeloZahra.SetAnimation("zoom_enter","zoom_exit")
End Sub


Sub Activity_KeyPress (KeyCode As Int) As Boolean
	If KeyCode==KeyCodes.KEYCODE_BACK Then
		Actionbar_NavigationItemClick
		Return False
	Else
		Return True
	End If
End Sub

