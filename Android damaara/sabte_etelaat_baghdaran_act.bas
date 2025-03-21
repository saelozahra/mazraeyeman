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
	
End Sub


Sub Globals
	
	Dim job1 As HttpJob
	Private header_lbl ,subtitle_lbl,Label1,masahatekesht_lbl,val_sb1_lbl As Label
	Private ScrollView1 As ScrollView
	Private back,save_btn,map_select_btn As Button
	Private name_family_et,tel_et,email_et,address,NationalCode_et,city_et As EditText
	Private SeekBar1 As SeekBar
	Private vahed_spinner,state_spinner As Spinner
	
End Sub

Sub Activity_Create(FirstTime As Boolean)
	
	SaeloZahra.SetStatusBarColor(SaeloZahra.colorDark)
	Activity.LoadLayout("sv_layout")
	ScrollView1.Panel.LoadLayout("sabte_etelaat_baghdaran_layout")
	
	header_lbl.Text="ثبت اطلاعات باغداران"
	
	masahatekesht_lbl.Typeface=SaeloZahra.font
	Label1.Typeface=SaeloZahra.font
	header_lbl.Typeface=SaeloZahra.fontBold
	subtitle_lbl.Typeface=SaeloZahra.font
	save_btn.Typeface=SaeloZahra.font
	map_select_btn.Typeface=SaeloZahra.font
	
	name_family_et.Typeface=SaeloZahra.font
	tel_et.Typeface=SaeloZahra.font
	email_et.Typeface=SaeloZahra.font
	address.Typeface=SaeloZahra.font
	val_sb1_lbl.Typeface=SaeloZahra.font
	NationalCode_et.Typeface=SaeloZahra.font
	city_et.Typeface=SaeloZahra.font
	
	name_family_et.Background=SaeloZahra.CD(SaeloZahra.colorLight)
	NationalCode_et.Background=SaeloZahra.CD(SaeloZahra.colorLight)
	city_et.Background=SaeloZahra.CD(SaeloZahra.colorLight)
	tel_et.Background=SaeloZahra.CD(SaeloZahra.colorLight)
	email_et.Background=SaeloZahra.CD(SaeloZahra.colorLight)
	address.Background=SaeloZahra.CD(SaeloZahra.colorLight)
	map_select_btn.Background=SaeloZahra.CD(SaeloZahra.colorLight)
	
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
	
	ScrollView1.Panel.Height=save_btn.Top+save_btn.Height+24dip
	
	File.Delete(SaeloZahra.dir,"address")
	
	vahed_spinner.Add("متر مربع")
	vahed_spinner.Add("هکتار")
	
	
	If GetDeviceLayoutValues.Width > 500 Then
		header_lbl.Left = header_lbl.Left -18dip
		ScrollView1.Top=ScrollView1.Top+50dip
		ScrollView1.Height=ScrollView1.Height-50dip
	End If
	
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
	
	
	
End Sub

Sub Activity_Resume
	
	If File.Exists(SaeloZahra.dir,"address") Then
		address.Text=File.ReadString(SaeloZahra.dir,"address")
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

Sub SeekBar1_ValueChanged (Value As Int, UserChanged As Boolean)
	val_sb1_lbl.Text=SaeloZahra.SeNoghte(Value)&" "&vahed_spinner.SelectedItem
End Sub

Sub save_btn_Click
	
	Select vahed_spinner.SelectedIndex
		Case 0
			vahed_spinner.Tag="meters"
		Case 1
			vahed_spinner.Tag="hectare"
	End Select
	
	Dim place_lat As String=""
	Dim place_lng As String=""
	If File.Exists(SaeloZahra.dir,"place_lat") Then
		Dim place_lat As String = File.ReadString(SaeloZahra.dir,"place_lat")
	End If
	If File.Exists(SaeloZahra.dir,"place_lng") Then
		Dim place_lng As String = File.ReadString(SaeloZahra.dir,"place_lng")
	End If
	
	job1.Initialize("job1",Me)
	job1.PostString(SaeloZahra.json_url&"farmers_insert.php?save=true","&nationalcode="&NationalCode_et.Text&"&name="&name_family_et.Text&"&mobile="&tel_et.Text&"&unit="&vahed_spinner.Tag&"&area="&SeekBar1.Value&"&email="&email_et.Text&"&location="&place_lat&","&place_lng&"&state="&state_spinner.SelectedItem&"&city="&city_et.Text&"&address="&address.Text&"&sealevel=")
	ProgressDialogShow(SaeloZahra.CSB("در حال ثبت نام..."))
	
	
End Sub


Sub jobDone(job As HttpJob)
	ProgressDialogHide
	If job.Success Then
		
		LogColor(job.GetString,Colors.Yellow)
		
		If job.GetString == """success""" Then
			Activity.Finish
			SaeloZahra.beep("button-20.mp3")
			StartActivity(login_act)
		Else
			ToastMessageShow(SaeloZahra.CSB("خطا : "&job.GetString)&CRLF&job.ErrorMessage,True)
		End If
		
	Else
		ToastMessageShow(SaeloZahra.CSB(" خطا در ورود ")&CRLF&job.ErrorMessage,True)
	End If
	job.Release
End Sub
