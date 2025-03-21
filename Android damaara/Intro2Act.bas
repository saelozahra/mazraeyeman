B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=9.8
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True
#End Region

Sub Process_Globals
End Sub

Sub Globals
	Private go_btn As Button
	Dim DescLbl As Label
	Dim ParallaxDesign As Hitex_ParallaxDesign
End Sub

Sub Activity_Create(FirstTime As Boolean)
	
	ParallaxDesign.Initialize
	Activity.AddView(ParallaxDesign,0,-14dip,100%x,100%y+28dip)
	ParallaxDesign.setMargins(270,100)
	ParallaxDesign.setMultipliers(1.7f,1.7f)
	ParallaxDesign.SetImageBitmap(LoadBitmap(File.DirAssets,"bg"&Rnd(1,12)&".jpg"))
	ParallaxDesign.SendToBack
	
	Dim HoverLbl As Label
	HoverLbl.Initialize("HoverLbl")
	HoverLbl.SetBackgroundImage(LoadBitmap(File.DirAssets,"GreenHover.png"))
	Activity.AddView(HoverLbl,0,0,100%x,100%y)
	HoverLbl.BringToFront
	HoverLbl.Visible=False
	
	
	Dim csbText As CSBuilder
	csbText.Initialize
	csbText.Typeface(SaeloZahra.fontBold)
	csbText.Color(Colors.White).Bold.Append("مزرعه من چه خدماتی ارائه میدهد؟").Append(CRLF).Append(CRLF).PopAll
	csbText.Typeface(SaeloZahra.font)
	csbText.Color(0xEAFFFFFF).Append($"1. پیش بینی حوادث غیر مترقبه مرتبط با محصول شما از قبیل: سرمازدگی، گرمازدگی، خشکسالی، یخبندان، بادزدگی، طوفان، سیل، تگرگ ${CRLF}2. اعلام بارندگی و مدت زمان تقریبی بارش ${CRLF}3. مقایسه آمار شاخص های آب و هوایی در دوره های مختلف  ${CRLF}4. محاسبه و هشدار هجوم طغیان آفت  ${CRLF}5. محتوای آموزشی مفید برای جلوگیری از بروز مشکلات ${CRLF} و ده ها خدمات دیگر..."$).PopAll
	
	
	DescLbl.Initialize("desclbl")
	DescLbl.Text=csbText
	DescLbl.TextColor=Colors.White
	SaeloZahra.SetTextShadow(DescLbl,5,0,0,Colors.Black)
	Activity.AddView(DescLbl,5%x,10%y,90%x,60%y)
	DescLbl.BringToFront
	
	
	Dim gd As ColorDrawable
	gd.Initialize2(0x0AFFFFFF,5dip,2dip,Colors.White)
	
	go_btn.Initialize("go_btn")
	go_btn.Background = gd
	go_btn.Typeface=SaeloZahra.font
	go_btn.Text="مرحله بعـــــــــد"
	go_btn.TextSize = 18
	go_btn.TextColor=Colors.White
	go_btn.Visible=False
	Activity.AddView(go_btn,25%x,60%y,50%x,8%y)
	go_btn.BringToFront
	Sleep(1110)
	go_btn.SetVisibleAnimated(1110,True)
	
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub go_btn_Click
	Activity.Finish
'	Sleep(555)
	SaeloZahra.beep("button-19.mp3")
	SaeloZahra.SetAnimation("zoom_exit","zoom_enter")
	StartActivity(login_act)
	SaeloZahra.SetAnimation("zoom_exit","zoom_enter")
End Sub

