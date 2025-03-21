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
	
End Sub

Sub Globals
	Dim DTTC As DoubleTaptoClose
	Private header_lbl ,subtitle_lbl As Label
	Private btn1,btn2,btn3,btn4,btn5,btn6,Btn7,Btn8 As Button
'	Dim btnWidth,btnHeight As Int
	Private ScrollView1 As ScrollView
	Dim TIP As MSShowTipsBuilder
	Dim TipState As Int
End Sub

Sub Activity_Create(FirstTime As Boolean)
	
	Activity.LoadLayout("home_layout")
	ScrollView1.Panel.LoadLayout("home_btn")
	ScrollView1.Panel.Height=Btn8.Height+Btn8.Top+40dip
	
	header_lbl.Typeface=SaeloZahra.fontBold
	subtitle_lbl.Typeface=SaeloZahra.font
	btn1.Typeface=SaeloZahra.font
	btn2.Typeface=SaeloZahra.font
	btn3.Typeface=SaeloZahra.font
	btn4.Typeface=SaeloZahra.font
	btn5.Typeface=SaeloZahra.font
	btn6.Typeface=SaeloZahra.font
	Btn7.Typeface=SaeloZahra.font
	Btn8.Typeface=SaeloZahra.font
	
	Dim csb_sub As CSBuilder
	csb_sub.Initialize
	csb_sub.Typeface(SaeloZahra.font)
	csb_sub.Color(Colors.White)
'	csb_sub.Color(0xFFFFCD44)
'	csb_sub.Append(File.ReadMap(SaeloZahra.dir,"user.dat").Get("name"))
	csb_sub.Color(Colors.White)
	csb_sub.Append(" به ")
	csb_sub.Color(0xFFFFCD44)
	csb_sub.Bold
	csb_sub.Append(" مــــزرعه مــــن ")
	csb_sub.Pop
	csb_sub.Color(Colors.White)
	csb_sub.Append(" خوش آمدید ")
	csb_sub.PopAll
	subtitle_lbl.Text=csb_sub
	
	DTTC.Initialize("مجددا دکمه خروج را بزنید")
	
	Main.amaroid.TrackView(header_lbl.Text&"  - قدیم")
	
'	btn1.SetBackgroundImage(LoadBitmapResize(File.DirAssets,"btn1.jpg",btn1.Width,btn1.Height,True)).Gravity = Gravity.CENTER
'	btn2.SetBackgroundImage(LoadBitmapResize(File.DirAssets,"btn2.jpg",btn2.Width,btn2.Height,True)).Gravity = Gravity.CENTER
'	btn3.SetBackgroundImage(LoadBitmapResize(File.DirAssets,"btn_myproduct.jpg",btn3.Width,btn3.Height,True)).Gravity = Gravity.CENTER
'	btn4.SetBackgroundImage(LoadBitmapResize(File.DirAssets,"btn_bazar.jpg",btn4.Width,btn4.Height,True)).Gravity = Gravity.CENTER
'	btn5.SetBackgroundImage(LoadBitmapResize(File.DirAssets,"btn3.jpg",btn3.Width,btn3.Height,True)).Gravity = Gravity.CENTER
'	btn6.SetBackgroundImage(LoadBitmapResize(File.DirAssets,"btn5.jpg",btn6.Width,btn6.Height,True)).Gravity = Gravity.CENTER
'	Btn7.SetBackgroundImage(LoadBitmapResize(File.DirAssets,"btn_referral.jpg",Btn7.Width,Btn7.Height,True)).Gravity = Gravity.CENTER
'	Btn8.SetBackgroundImage(LoadBitmapResize(File.DirAssets,"btn6.jpg",Btn8.Width,Btn8.Height,True)).Gravity = Gravity.CENTER
	
	If GetDeviceLayoutValues.Width > 500 Then
		header_lbl.Left = header_lbl.Left -18dip
		btn1.Top=btn1.Top+24dip
		btn2.Top=btn2.Top+24dip
		btn3.Top=btn3.Top+24dip
		btn4.Top=btn4.Top+24dip
		btn5.Top=btn5.Top+24dip
		btn6.Top=btn6.Top+24dip
		Btn7.Top=Btn7.Top+24dip
		Btn8.Top=Btn8.Top+24dip
	End If
	
'	btnWidth=btn1.Width
'	btnHeight=btn1.Height
'	btn1.Tag=btn1.Top
'	btn2.Tag=btn2.Top
'	btn3.Tag=btn3.Top
'	btn4.Tag=btn4.Top
'	btn5.Tag=btn5.Top
'	btn6.Tag=btn6.Top
'	Btn7.Tag=Btn7.Top
'	Btn8.Tag=Btn8.Top
	
	Activity.AddMenuItem(SaeloZahra.CSB("معرفی و دریافت جایزه"),"referralMnu")
	
	If Activity.Height>1999 Then
		ScrollView1.SetLayout(ScrollView1.Left,ScrollView1.Top+24dip,ScrollView1.Width,ScrollView1.Height-24dip)
	End If
	
	
	If FirstTime Then
		If File.Exists(SaeloZahra.dir,"showTip")==False Then
			TIP.Initialize("tip")
			TIP.setTitle(SaeloZahra.csb("ثبت محصولات")).setButtonText(SaeloZahra.csb("بعدی")).setTitleColor(SaeloZahra.color).setDescriptionColor(SaeloZahra.colorDark).setDescription(SaeloZahra.csb("بعد از ثبت نام "&CRLF&" باید محصولات خود را از اینجا ثبت کنید"&CRLF&"تا در شرایط حساس به شما اطلاع داده شود")).setTarget(btn1).build
			TIP.setDelay(2313)
			TIP.show
			TipState=1
			File.WriteString(SaeloZahra.dir,"showTip","")
		End If
	End If


End Sub



	
Sub tip_Click
	If TipState==1 Then
		TIP.Initialize("tip")
		TIP.setTitle(SaeloZahra.csb("بازارچـــــــه")).setButtonText(SaeloZahra.csb("بعدی")).setDescription(SaeloZahra.csb("تمام محصولاتی که برای فروش گذاشته میشوند در این بخش قرار دارند")).setTarget(btn4).build
		TIP.setDelay(313)
		TipState=2
		TIP.show
	else if TipState=2 Then
		TIP.Initialize("tip")
		TIP.setTitle(SaeloZahra.csb("فیلـــــــــم ها و محتوای آموزشی")).setButtonText(SaeloZahra.csb("بعدی")).setDescription(SaeloZahra.csb("اینجا میتونین به فیلم ها ، صوت ها و متن های آموزشی دسترسی داشته باشین")).setTarget(btn5).build
		TIP.setDelay(313)
		TipState="3"
		TIP.show
	else if TipState=3 Then
		TIP.Initialize("tip")
		TIP.setTitle(SaeloZahra.csb("وضعیت آب و هـــــــــــوا")).setButtonText(SaeloZahra.csb("بعدی")).setDescription(SaeloZahra.csb("اینجا میتونین وضعیت آب و هوایی مرتبط با زمین کشاورزی خودتون رو ببینین")).setTarget(btn6).build
		TIP.setDelay(313)
		TipState="4"
		TIP.show
	else if TipState=4 Then
		TIP.Initialize("tip")
		TIP.setTitle(SaeloZahra.csb("اهدای جوایز")).setButtonText(SaeloZahra.csb("بزن بریم")).setDescription(SaeloZahra.csb("اینجا میتونین کشاورزای دیگه رو به این نرم افزار دعوت کنین"&CRLF&"و به ازای هر نفری که نرم افزار رو نصب کنه جایزه بگیرید")).setTarget(Btn7).build
		TIP.setDelay(313)
		TipState="5"
		TIP.show
	End If
End Sub

Sub referralMnu_click
	Starter.rp.CheckAndRequest(Starter.rp.PERMISSION_READ_CONTACTS)
	Starter.rp.CheckAndRequest(Starter.rp.PERMISSION_WRITE_CONTACTS)
End Sub

Sub Activity_PermissionResult (Permission As String, Result As Boolean)
	If Result And Permission==Starter.rp.PERMISSION_READ_CONTACTS Then
		StartActivity(referralAct)
	End If
End Sub

Sub Activity_Resume
	
	btn1.Visible=False
	btn2.Visible=False
	btn3.Visible=False
	btn4.Visible=False
	btn5.Visible=False
	btn6.Visible=False
	Btn7.Visible=False
	Btn8.Visible=False
	
'	btn1.SetLayout(-300dip,-300dip,0,0)
'	btn2.SetLayout(100%x+300dip,-300dip,0,0)
'	btn3.SetLayout(-300dip,-300dip,0,0)
'	btn4.SetLayout(100%x+300dip,100%y+300dip,0,0)
'	btn5.SetLayout(-300dip,-300dip,0,0)
'	btn6.SetLayout(100%x+300dip,100%y+300dip,0,0)
'	Btn7.SetLayout(-300dip,-300dip,0,0)
'	Btn8.SetLayout(100%x+300dip,100%y+300dip,0,0)
'	
'	btn1.SetLayoutAnimated(1313,55%x,btn2.Tag,btnWidth,btnHeight)
'	btn2.SetLayoutAnimated(1313,14%x,btn1.Tag,btnWidth,btnHeight)
'	btn3.SetLayoutAnimated(1110,55%x,btn4.Tag,btnWidth,btnHeight)
'	btn4.SetLayoutAnimated(1110,14%x,btn3.Tag,btnWidth,btnHeight)
'	btn5.SetLayoutAnimated(888,14%x,btn5.Tag,btnWidth,btnHeight)
'	btn6.SetLayoutAnimated(888,55%x,btn6.Tag,btnWidth,btnHeight)
'	Btn7.SetLayoutAnimated(666,55%x,Btn7.Tag,btnWidth,btnHeight)
'	Btn8.SetLayoutAnimated(666,14%x,Btn8.Tag,btnWidth,btnHeight)
	
	SaeloZahra.RemoveShadows(btn1)
	SaeloZahra.RemoveShadows(btn2)
	SaeloZahra.RemoveShadows(btn3)
	SaeloZahra.RemoveShadows(btn4)
	SaeloZahra.RemoveShadows(btn5)
	SaeloZahra.RemoveShadows(btn6)
	SaeloZahra.RemoveShadows(Btn7)
	SaeloZahra.RemoveShadows(Btn8)
	
	btn1.SetVisibleAnimated(100,True)
	btn2.SetVisibleAnimated(300,True)
	btn3.SetVisibleAnimated(600,True)
	btn4.SetVisibleAnimated(1000,True)
	btn5.SetVisibleAnimated(1400,True)
	btn6.SetVisibleAnimated(1800,True)
	Btn7.SetVisibleAnimated(2100,True)
	Btn8.SetVisibleAnimated(2300,True)
	
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Sub Activity_KeyPress (KeyCode As Int) As Boolean
	If KeyCode = KeyCodes.KEYCODE_BACK Then
		DTTC.TapToClose
		Return True
	Else
		Return False
	End If
End Sub


Sub btn6_Click
	SaeloZahra.SetAnimation("file3","file4")
	StartActivity(vaziat_abo_hava_act)
End Sub

Sub btn5_Click
	SaeloZahra.SetAnimation("file3","file4")
	list_act.cheSafheyi="videocategory"
	StartActivity(list_act)
End Sub


Sub btn4_Click
'	list_act.cheSafheyi="bazarche"
	SaeloZahra.SetAnimation("file3","file4")
	StartActivity(bazarcheListAct)
End Sub

Sub btn3_Click
	SaeloZahra.SetAnimation("file3","file4")
	list_act.cheSafheyi="my_mahsool"
	StartActivity(list_act)
End Sub

Sub btn2_Click
	SaeloZahra.SetAnimation("file3","file4")
	list_act.cheSafheyi="msg"
	StartActivity(Notification)
End Sub


Sub btn1_Click
	SaeloZahra.SetAnimation("file3","file4")
	StartActivity(sabte_mahsool_act)
End Sub


Sub subtitle_lbl_Click
	register_act.actType="edit"
	StartActivity(register_act)
'	referralMnu_click
End Sub

Sub header_lbl_Click
	register_act.actType="edit"
	StartActivity(register_act)
'	referralMnu_click
End Sub

Sub Btn8_Click
	Activity_KeyPress(KeyCodes.KEYCODE_BACK)
End Sub

Sub Btn7_Click
	referralMnu_click
End Sub