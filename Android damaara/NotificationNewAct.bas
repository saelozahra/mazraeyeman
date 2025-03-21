B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=9.5
@EndOfDesignText@

#Region  Activity Attributes 
	#Extends: androidx.appcompat.app.AppCompatActivity
	#FullScreen: False
	#IncludeTitle: True
#End Region

Sub Process_Globals
	Dim sql1 As SQL
	Dim cu1 As Cursor
	Dim share As Intent
	Dim type_str As String
End Sub

Sub Globals
	Dim Config 	As Amir_SliderConfig
	Dim Show 	As Amir_SliderShow
	Dim su As StringUtils
	Dim X1 As XmlLayoutBuilder
	Dim Actionbar As ACToolBarLight
	Public css_start,css_end As String
	Dim Web As PhoneIntents
	Dim PC As AHPageContainer
	Dim TabLayout As DSTabLayout
	Dim VP As AHViewPager
	Dim SvNotif,SvAlert As ScrollView
	
	Dim StopintNotif As Int=18dip
	Dim StopintAlert As Int=18dip
	
End Sub


Sub Activity_Create(FirstTime As Boolean)
	
	css_start	= "<html><body style='white-space: pre-wrap;box-sizing: border-box; padding:2%; margin: auto;text-align: right; width:100%;max-width:100%;direction:rtl;line-height:1.4;font-family:Tanha;font-size:110%;color:#777;'>           <style>@import url(https://cdn.rawgit.com/rastikerdar/samim-font/v3.1.0/dist/font-face.css); h1{font-size:130%;margin:3% auto;} hr, .hr {background: rgba(0, 0, 0, 0) url('file:///android_asset/sp.png') repeat-x scroll center center; border: 0 none;clear: both;height: 19px;margin: 8px auto;width: 100%;} a{color:#111;font-weight: bold;} .img{max-width:100%;}</style>       <pre style='white-space: pre-wrap;width:100%;font-family:Samim;'>"
	css_end		= "</pre><br style='clear:both;' > </body></html>"
	
	
	Activity.LoadLayout("TabNewlayout")
	
	Actionbar.Title=SaeloZahra.CSB("اطلاعیـــــــــه ها")
	Actionbar.TitleTextColor=Colors.White
	Actionbar.NavigationIconDrawable = X1.GetDrawable("baseline_arrow_back_white_24")
	Actionbar.Color=SaeloZahra.NewColor
	
	Main.amaroid.TrackView(Actionbar.title&" جدید")

	SvAlert.Initialize(1000dip)
	SvNotif.Initialize(1000dip)



	If File.Exists(SaeloZahra.dir,"db.db") = False Then
		File.Copy(File.DirAssets,"db.db",SaeloZahra.dir,"db.db")
	End If
	
	
	If sql1.IsInitialized = False Then
		sql1.Initialize(SaeloZahra.dir,"db.db",False)
	End If
	
	
	SaeloZahra.SetStatusBarColor(SaeloZahra.NewcolorDark)
	
	
	PC.Initialize
	TabLayout.SetTabTextColors(0x7FFFFFFF,Colors.White)
	TabLayout.TabIndicatorColor=Colors.White
	
	
	
	PC.AddPage(SvAlert, SaeloZahra.csb("گزارش وضعیت و هشدار"))
	PC.AddPage(SvNotif, SaeloZahra.csb("اطلاعیــــه ها"))
	
	VP.PageContainer = PC
	
	TabLayout.Color = Colors.Transparent
	TabLayout.TabMode=TabLayout.MODE_FIXED
	
	TabLayout.SetViewPager(VP)
	Actionbar.SetLayout(0,0,100%x,SaeloZahra.MaterialActionBarHeight)
	TabLayout.SetLayout(0,Actionbar.Top+Actionbar.Height,100%x,SaeloZahra.MaterialActionBarHeight)
	VP.SetLayout(0,TabLayout.Top+TabLayout.Height,100%x,100%y - (SaeloZahra.MaterialActionBarHeight*2) )
	
	TabLayout.SetTabIcon(0,X1.GetDrawable("baseline_all_inclusive_white_24"))
	TabLayout.SetTabIcon(1,X1.GetDrawable("baseline_sentiment_satisfied_alt_white_24"))
	TabLayout.Color=SaeloZahra.NewColor
	
	LoadMsgs
	
		
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
	
End Sub

Sub LoadMsgs
	
	cu1 = sql1.ExecQuery("SELECT * FROM notification ORDER BY id DESC limit 110")
	
		
	For i = 0 To cu1.RowCount-1
			
		cu1.Position = i
		Dim CsbTxt As CSBuilder
		CsbTxt.Initialize
		CsbTxt.Bold.Typeface(SaeloZahra.font).Size(16).Color(Colors.DarkGray).Append(cu1.GetString("title")).PopAll
		CsbTxt.Append(CRLF)
		CsbTxt.Append(CRLF)
		CsbTxt.Typeface(SaeloZahra.font).Color(0xFF7C7979).Size(12).Append(cu1.GetString("value").Replace("<br>",CRLF).Replace("<hr>","___________________________________"&CRLF)).PopAll
		
		Log(cu1.GetString("id"))
		
		Dim ThisIcon As String = cu1.GetString("icon")
		If ThisIcon=="" Then ThisIcon = 0
		
		Dim P1 As Panel
		P1 = addAlertBox(cu1.GetString("id"),CsbTxt,cu1.GetString("type"),ThisIcon,cu1.GetString("time"))
		
		If cu1.GetString("type") == "notification" Then
			SvNotif.Panel.AddView( P1, 20dip, StopintNotif, Activity.Width-40dip, P1.Height )
			StopintNotif = StopintNotif+P1.Height + 24dip
		Else
			SvAlert.Panel.AddView( P1, 20dip, StopintAlert, Activity.Width-40dip, P1.Height )
			StopintAlert = StopintAlert+P1.Height + 24dip
		End If

		
	Next
	
	SvAlert.Panel.Height=StopintAlert+22dip
	SvNotif.Panel.Height=StopintNotif+22dip
	
End Sub
Sub Activity_Resume
	
	
	Dim in1 As Intent
	
	in1 = Activity.GetStartingIntent
	If in1.HasExtra("Notification_Tag") Then
		Log(in1.GetExtra("Notification_Tag")) 'Will log the tag
		If SaeloZahra.Debug Then ToastMessageShow(in1.GetExtra("Notification_Tag"),True)
	Else
		If SaeloZahra.Debug Then ToastMessageShow("Dont Has Extra",True)
	End If
	
	If in1.HasExtra("Notification_Tag") Then
	
	
	
		cu1 = sql1.ExecQuery("SELECT * FROM notification ORDER BY id DESC limit 1")
		
			
		For i = 0 To cu1.RowCount-1
			
			cu1.Position = i
			
			type_str = cu1.GetString("type")
			
			
			If type_str == "telegram" Then
				Activity.Finish
				open_telegram(cu1.GetString("value"))
			End If
		
			If type_str == "url" Then
				Activity.Finish
				StartActivity(Web.OpenBrowser(cu1.GetString("value")))
			End If
		
			If type_str == "activity" Then
				Activity.Finish
				StartActivity(cu1.GetString("value"))
			End If

'			subtitle_lbl.Text=cu1.GetString("title")
			
'			matn.LoadHtml(css_start &  cu1.GetString("value") & css_end )' "<h1>" & cu1.GetString("title") &  "</h1>" &
			
			
	
		Next

	

				
	Else
		
	End If
	

End Sub


Sub matn_OverrideUrl (Url As String) As Boolean
	ProgressDialogShow2("چند لحظه صبر کنید",True)
	StartActivity(Web.OpenBrowser(Url))
	Return True
End Sub


Sub matn_PageFinished (Url As String)
	ProgressDialogHide
End Sub



Sub Activity_Pause (UserClosed As Boolean)
	If cu1.IsInitialized Then cu1.Close
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




Sub open_telegram(tid As String)
	Log("Open Telegram")
	Try
		share.Initialize(share.ACTION_EDIT,"tg://"&tid)
		StartActivity(share)
	Catch
		StartActivity(Web.OpenBrowser("https://telegram.me/"&tid))
	End Try
End Sub




Sub addAlertBox(Index As String, Text As CSBuilder, ThisType As String,ThisIcon As String,Time As Long) As Panel
	
'	Dim cdPanel As ColorDrawable
'	cdPanel.Initialize(Colors.White,18)
	
	Dim MyColor As Int = SaeloZahra.FindAlertColor(ThisType)
	
	Dim cdPanel As GradientDrawable
	cdPanel.Initialize("TR_BL", Array As Int(Colors.White, Colors.White))
	cdPanel.CornerRadius = 12dip
	
	Dim pnl As Panel
	pnl.Initialize("")
	pnl.Tag = Index
	pnl.Background=cdPanel
	pnl.Elevation=12dip
	
	Dim lbl As Label
	lbl.Initialize("lbl")
	lbl.Tag  = Text
	lbl.Text = Text
	lbl.Gravity = Bit.Or(Gravity.RIGHT,Gravity.CENTER_VERTICAL)
'	lbl.TextSize = DefaultTextSize
'	lbl.TextColor = DefaultTextColor
	lbl.Typeface = SaeloZahra.font
	pnl.AddView(lbl, 10dip, 10dip, Activity.Width - (25%x)-24dip  , 50dip)
	
	
	Dim cd As ColorDrawable
	cd.Initialize(MyColor,7dip)
	
	Dim timeLbl As Label
	timeLbl.Initialize("")
	timeLbl.Background	= cd
	
	timeLbl.textColor	= Colors.White
	If ThisType == "notification" Then
		timeLbl.Text	 	= "اطلاعیـــه"
	Else if ThisType == "weather" Then
		timeLbl.Text	 	= "وضعیت آب و هوا"
	Else if ThisType == "sarmazadegi" Then
		timeLbl.Text	 	= "هشدار سرمازدگی"
	Else if ThisType == "garmazadegi" Then
		timeLbl.Text	 	= "هشدار گرمازدگی"
	Else
		timeLbl.Text	 	= SaeloZahra.mohasebe_tarikh(Time)
	End If
	
	
	timeLbl.TextSize	= 12
	timeLbl.SingleLine=True
	timeLbl.Ellipsize = "END"
	timeLbl.Gravity		= Bit.Or(Gravity.CENTER_VERTICAL, Gravity.CENTER_HORIZONTAL)
	timeLbl.textColor	= Colors.White
	pnl.AddView(timeLbl,12dip,12dip,72dip,18dip)
	
	
	Dim LineLbl As Label
	LineLbl.Initialize("")
	LineLbl.Color=Colors.LightGray
	pnl.AddView(LineLbl, Activity.Width - (25%x)+7dip, 14dip, 1dip, 50dip)
	
	Dim cdBubble As ColorDrawable
	cdBubble.Initialize2(MyColor,14dip,2dip,SaeloZahra.NewColor)
	
	Dim bubbleLbl As Label
	bubbleLbl.Initialize("")
	bubbleLbl.Background=cdBubble
	pnl.AddView(bubbleLbl, Activity.Width - (25%x), 12dip, 14dip, 14dip)
	
	
	Dim ImgV As ImageView
	ImgV.Initialize("")
	ImgV.Gravity = Gravity.CENTER
	ImgV.Bitmap = SaeloZahra.FindWeatherImg(ThisIcon).Resize(18%x,18%x,True)
	pnl.AddView(ImgV, Activity.Width - 26%x,16dip,20%x,20%x)
	
	
	Dim minHeight As Int
	minHeight 		= su.MeasureMultilineTextHeight(lbl, Text) + 40dip
	lbl.Height  	= Max(50dip, minHeight)
	ImgV.Height 	= Max(50dip, minHeight)
	LineLbl.Height	= Max(50dip, minHeight)
	pnl.Height 		= Max(50dip, minHeight)+18dip
	
	Return pnl
	
End Sub

Sub lbl_Click
	
End Sub