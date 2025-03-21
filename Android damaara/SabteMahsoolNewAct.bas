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
	Dim GroupTypeListByID,GroupTypeListByName,nameMahsoolByName As Map
End Sub

#Extends: android.support.v7.app.AppCompatActivity

Sub Globals
	Dim X1 As XmlLayoutBuilder
	Dim witchDatePicker As String
	Dim pdpd As ParsDatePickerDialog
	Private Label3,Label5,Label6,gorooheMahsoolLbl As Label
	Private ScrollView1 As ScrollView
	Private gorooh_mahsool_spinner,noueAbyari_Spinner,vahed_spinner,noueKhakSpinner,name_mahsool_spinner As Spinner
	Private save_btn As Button
	Private PanelMavaredeDarkhasti,PaneleAshayer,panel_keshavarzi As Panel
	Private zamanekasht_et,sennemahsool_et,zamanebazderakht_et,zamane_kesht_et,fasele_kasht_et,radif_metr_et,chah_et,zamanefasleroshd_et,zamane_goldehi_et As EditText
	Private group1RadioButton1,group2RadioButton2 As RadioButton
	Dim jobListeGroup,downloadListMahsoolJob,SubmitJob As HttpJob
	Private name_mahsool_lbl As Label
	Dim ThisGroupTypeID,ThisProductID As Int ',checkBoxTop,fieldhayeDarkhastiJob
	Dim array_mavared_darkhasti,Files As List
	Dim mavarede_darkhasti As String = ""
	Private gheshlaghdate_et,yeylaghdate_et As EditText
	Private yeylagh_map_btn,gheshlagh_map_btn,selectPicBtn As Button
	
	Private BazarcheSwitch As ACSwitch
	Private ImageView1 As ImageView
	Private Panel_bazarche As Panel
	Private tonaj_et,amount_et,zaman_eraa_et,bazarche_des_et,masahateYahteKeshET As EditText
	
	Dim BSFileChooser1 As BSFileChooser
	
	Dim IME As IME
	Private ActionBar As ACToolBarDark
End Sub

Sub Activity_Create(FirstTime As Boolean)
	
	SaeloZahra.SetStatusBarColor(SaeloZahra.NewcolorDark)
	Activity.LoadLayout("SVNewlayout")
	ScrollView1.Panel.LoadLayout("sabte_mahsool_layout")
	
	Files.Initialize
	
	ActionBar.Title=SaeloZahra.CSB("ثبت محصول جدید")
	ActionBar.TitleTextColor=Colors.White
	ActionBar.NavigationIconDrawable = X1.GetDrawable("baseline_arrow_back_white_24")
	ActionBar.Color=SaeloZahra.NewColor
	ActionBar.SetLayout(0,0,100%x,SaeloZahra.MaterialActionBarHeight+5dip)
	Main.amaroid.TrackView(ActionBar.title)
	
	save_btn.Color = SaeloZahra.NewColor
	save_btn.textColor = Colors.White
	zamanekasht_et.Typeface=SaeloZahra.font
	sennemahsool_et.Typeface=SaeloZahra.font
	save_btn.Typeface=SaeloZahra.fontBold
	Label5.Typeface=SaeloZahra.font
	Label6.Typeface=SaeloZahra.font
	gorooheMahsoolLbl.Typeface=SaeloZahra.font
	zamane_kesht_et.Typeface=SaeloZahra.font
	fasele_kasht_et.Typeface=SaeloZahra.font
	radif_metr_et.Typeface=SaeloZahra.font
	chah_et.Typeface=SaeloZahra.font
	zamanefasleroshd_et.Typeface=SaeloZahra.font
	zamane_goldehi_et.Typeface=SaeloZahra.font
	zamanebazderakht_et.Typeface=SaeloZahra.font
	name_mahsool_lbl.Typeface=SaeloZahra.font
	tonaj_et.Typeface=SaeloZahra.font
	amount_et.Typeface=SaeloZahra.font
	zaman_eraa_et.Typeface=SaeloZahra.font
	bazarche_des_et.Typeface=SaeloZahra.font
	BazarcheSwitch.Typeface=SaeloZahra.font
	selectPicBtn.Typeface=SaeloZahra.font
	yeylagh_map_btn.Typeface=SaeloZahra.font
	gheshlagh_map_btn.Typeface=SaeloZahra.font
	Label3.Typeface=SaeloZahra.font
	BazarcheSwitch.Tag="no"
	
	sennemahsool_et.InputType=sennemahsool_et.INPUT_TYPE_DECIMAL_NUMBERS
	masahateYahteKeshET.InputType=sennemahsool_et.INPUT_TYPE_NUMBERS
	fasele_kasht_et.InputType=sennemahsool_et.INPUT_TYPE_NUMBERS
	chah_et.InputType=sennemahsool_et.INPUT_TYPE_NUMBERS
	radif_metr_et.InputType=sennemahsool_et.INPUT_TYPE_NUMBERS
	tonaj_et.InputType=sennemahsool_et.INPUT_TYPE_NUMBERS
	
	
	
	
	tonaj_et.Background=SaeloZahra.CD(SaeloZahra.NewcolorLight)
	amount_et.Background=SaeloZahra.CD(SaeloZahra.NewcolorLight)
	zaman_eraa_et.Background=SaeloZahra.CD(SaeloZahra.NewcolorLight)
	bazarche_des_et.Background=SaeloZahra.CD(SaeloZahra.NewcolorLight)
	zamanebazderakht_et.Background=SaeloZahra.CD(SaeloZahra.NewcolorLight)
	zamane_goldehi_et.Background=SaeloZahra.CD(SaeloZahra.NewcolorLight)
	zamanefasleroshd_et.Background=SaeloZahra.CD(SaeloZahra.NewcolorLight)
	chah_et.Background=SaeloZahra.CD(SaeloZahra.NewcolorLight)
	radif_metr_et.Background=SaeloZahra.CD(SaeloZahra.NewcolorLight)
	fasele_kasht_et.Background=SaeloZahra.CD(SaeloZahra.NewcolorLight)
	zamane_kesht_et.Background=SaeloZahra.CD(SaeloZahra.NewcolorLight)
	zamanekasht_et.Background=SaeloZahra.CD(SaeloZahra.NewcolorLight)
	sennemahsool_et.Background=SaeloZahra.CD(SaeloZahra.NewcolorLight)
	name_mahsool_lbl.Background=SaeloZahra.CD(SaeloZahra.NewcolorLight)
	gorooh_mahsool_spinner.Background=SaeloZahra.CD(SaeloZahra.NewcolorLight)
	gheshlagh_map_btn.Background=SaeloZahra.CD(SaeloZahra.NewcolorLight)
	yeylagh_map_btn.Background=SaeloZahra.CD(SaeloZahra.NewcolorLight)
	selectPicBtn.Background=SaeloZahra.CD(SaeloZahra.NewcolorLight)
	masahateYahteKeshET.Background=SaeloZahra.CD(SaeloZahra.NewcolorLight)
	
	Label3.Background=SaeloZahra.CD(SaeloZahra.NewcolorLight)
	Label5.Background=SaeloZahra.CD(SaeloZahra.NewcolorLight)
	Label6.Background=SaeloZahra.CD(SaeloZahra.NewcolorLight)
	gorooheMahsoolLbl.Background=SaeloZahra.CD(SaeloZahra.NewcolorLight)
	
	Dim csb_sub As CSBuilder
	csb_sub.Initialize
	csb_sub.Typeface(SaeloZahra.font)
	csb_sub.Size(14)
	csb_sub.Color(Colors.White)
	csb_sub.Append(" اطلاعات ")
	csb_sub.Color(0xFFFFCD44)
	csb_sub.Bold
	csb_sub.Append(" محصول جدید ")
	csb_sub.Pop
	csb_sub.Color(Colors.White)
	csb_sub.Append(" را وارد نمائید ")
	csb_sub.PopAll
	ActionBar.SubTitle = csb_sub
	
	
	gorooh_mahsool_spinner.Add(SaeloZahra.CSB("گروه محصول"))
	gorooh_mahsool_spinner.AddAll(Array As String("حبوبات","درختان میوه","غلات","صیفی جات","دانه های روغنی","گیاهان دارویی","گیاهان ادویه ای","زنبورداران","دام و طیور","آبزیان","مراتع"))
	
	noueAbyari_Spinner.AddAll(Array As String("غرقابی","قطره ای","دیم","بارانی"))
	
'	SaeloZahra.SetRadioButtonDrawable(hoshdare_sarmazadegi,0xFF0A974A,Min(hoshdare_sarmazadegi.Width,hoshdare_sarmazadegi.Height),0xFFFFBA00,Colors.LightGray,2dip)

	
'	pdpd.Initialize("pdpd",1400,1300,SaeloZahra.font,SaeloZahra.colorLight,"ثبت","لغو","امروز")
	ScrollView1.Panel.Height=save_btn.Top+save_btn.Height+24dip
	
	vahed_spinner.Tag="hectare"
	vahed_spinner.Add("هکتار")
	vahed_spinner.Add("متر مربع")
	
	noueKhakSpinner.Add("رسی")
	noueKhakSpinner.Add("شنی")
	noueKhakSpinner.Add("رسی سیلتی")
	noueKhakSpinner.Add("رسی شنی")
	
	
	
	pdpd.Initialize("pdpd",1400,1395,SaeloZahra.font,SaeloZahra.NewcolorDark,"ثبت","بازگشت","امروز")
	

	
	
	gorooh_mahsool_spinner.Tag = "group1"
	jobListeGroup.Initialize("jobListeGroup",Me)
	jobListeGroup.Download(SaeloZahra.json_url&"product_category.php?gp="&gorooh_mahsool_spinner.Tag)
	LogColor(SaeloZahra.json_url&"product_category.php?gp="&gorooh_mahsool_spinner.Tag,Colors.DarkGray)
	
	downloadListMahsoolJob.Initialize("downloadListMahsoolJob",Me)
	SubmitJob.Initialize("SubmitJob",Me)
	array_mavared_darkhasti.Initialize
	
	IME.Initialize("IME")
	IME.AddHeightChangedEvent
	
End Sub


Sub Activity_Pause (UserClosed As Boolean)

End Sub


Sub Activity_Resume
	
	If File.Exists(SaeloZahra.dir,"gheshlagh_lat") Then
		
		Dim csbcheck As CSBuilder
		csbcheck.Initialize
		csbcheck.Typeface(SaeloZahra.font)
		csbcheck.Append(" انتخاب محل قشلاق ")
		csbcheck.Color(SaeloZahra.NewcolorDark)
		csbcheck.Typeface(Typeface.FONTAWESOME)
		csbcheck.Append(Chr(0xF046)).PopAll
	
		gheshlagh_map_btn.Text = csbcheck
		
	End If
	
	If File.Exists(SaeloZahra.dir,"yeylagh_lng") Then
		
		Dim csbcheck1 As CSBuilder
		csbcheck1.Initialize
		csbcheck1.Typeface(SaeloZahra.font)
		csbcheck1.Append(" انتخاب محل ییلاق ")
		csbcheck1.Color(SaeloZahra.NewcolorDark)
		csbcheck1.Typeface(Typeface.FONTAWESOME)
		csbcheck1.Append(Chr(0xF046)).PopAll
		
		yeylagh_map_btn.Text = csbcheck1
		
	End If
		
	
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



Sub vahed_spinner_ItemClick (Position As Int, Value As Object)
	If Position == 0 Then
		vahed_spinner.Tag="hectare"
	Else
		vahed_spinner.Tag="meters"
	End If
End Sub

Sub radioGroup_CheckedChange(Checked As Boolean)
	
	If group1RadioButton1.Checked Then
		gorooh_mahsool_spinner.Tag = "group1"
		PaneleAshayer.SetVisibleAnimated(110,False)
		panel_keshavarzi.SetVisibleAnimated(1110,True)
		PanelMavaredeDarkhasti.Top = panel_keshavarzi.Top + panel_keshavarzi.Height + 18dip
	Else
		gorooh_mahsool_spinner.Tag = "group2"
		panel_keshavarzi.SetVisibleAnimated(110,False)
		PaneleAshayer.SetVisibleAnimated(1110,True)
		PanelMavaredeDarkhasti.Top = PaneleAshayer.Top + PaneleAshayer.Height + 18dip
	End If
	
	LogColor(gorooh_mahsool_spinner.Tag,Colors.Yellow)
	
	jobListeGroup.Download(SaeloZahra.json_url&"product_category.php?gp="&gorooh_mahsool_spinner.Tag)
	LogColor(SaeloZahra.json_url&"product_category.php?gp="&gorooh_mahsool_spinner.Tag,Colors.DarkGray)
	
	
	BazarcheSwitch.Top = PanelMavaredeDarkhasti.Top + 18dip
	Panel_bazarche.Top=BazarcheSwitch.Top+BazarcheSwitch.Height+22dip
'	save_btn.Top = PanelMavaredeDarkhasti.Top + PanelMavaredeDarkhasti.Height + 24dip
	If BazarcheSwitch.Checked Then
		save_btn.Top = Panel_bazarche.Top+Panel_bazarche.Height + 50dip
	Else
		save_btn.Top = BazarcheSwitch.Top+BazarcheSwitch.Height + 50dip
	End If
	
	ScrollView1.Panel.Height = save_btn.Top + save_btn.Height + 24dip
	
End Sub


Sub jobDone(Job As HttpJob)
	ProgressDialogHide
	Log(Job.Success&" : "&Job.JobName)
	
	Log(Job.GetString)
	If Job.Success And  Job.GetString<>"""not found""" Then
		
		Select Job.JobName
			
			Case "SubmitJob"
				Log(Job.GetString)
'				Dim parser As JSONParser
'				parser.Initialize(Job.GetString)
'				Dim root As Map = parser.NextObject
'				ToastMessageShow(SaeloZahra.CSB(root.Get("alert")),True)
		
'				Dim errorCode As Int = root.Get("errorCode")
				If Job.GetString == "success" Then
					Activity.Finish
					SaeloZahra.beep("button-20.mp3")
				End If
		
			Case "downloadListMahsoolJob" ' انتخاب دسته بندی محصول
				nameMahsoolByName.Initialize
				name_mahsool_spinner.Clear
				
				Dim parser As JSONParser
				parser.Initialize(Job.GetString)
				Dim rootListMahsool As List = parser.NextArray
				For Each colroot As Map In rootListMahsool
'					Dim category_txt As String = colroot.Get("category_txt")
'					Dim category_id As String = colroot.Get("category_id")
					Dim MahsoolID As String = colroot.Get("id")
					Dim MahsoolTitle As String = colroot.Get("title")
					
					nameMahsoolByName.Put(MahsoolTitle,MahsoolID)
					name_mahsool_spinner.Add(MahsoolTitle)
					
				Next
			
			Case "jobListeGroup"
				
				GroupTypeListByID.Initialize
				GroupTypeListByName.Initialize
				gorooh_mahsool_spinner.Clear
				
				Dim parser As JSONParser
				parser.Initialize(Job.GetString)
				Dim rootGroup As List = parser.NextArray
				For Each colroot As Map In rootGroup
					Dim groupID As String = colroot.Get("id")
					Dim GroupTitle As String = colroot.Get("title")
					GroupTypeListByID.Put(groupID,GroupTitle)
					GroupTypeListByName.Put(GroupTitle,groupID)
					gorooh_mahsool_spinner.Add(GroupTitle)
				Next

				ThisGroupTypeID = GroupTypeListByName.GetValueAt(0)
				
				LogColor(SaeloZahra.json_url&"product_list.php?cat="&ThisGroupTypeID,Colors.LightGray)
				downloadListMahsoolJob.Download(SaeloZahra.json_url&"product_list.php?cat="&ThisGroupTypeID)
		End Select
	Else
		If Job.GetString=="""not found""" Then
			ToastMessageShow(SaeloZahra.CSB("موردی یافت نشد."),True)
		Else
			
			If Job.ErrorMessage.Contains("Unable to resolve host") Then
				ToastMessageShow(SaeloZahra.CSB(" اینترنتتون وصل نیست "),True)
			Else
				ToastMessageShow(SaeloZahra.CSB(" خطا ")&CRLF&Job.ErrorMessage,True)
			End If
			
		End If
	End If
	
End Sub

Sub chkb_CheckedChange(Checked As Boolean)
	
	Dim chk As CheckBox
	chk.Initialize("")
	chk=Sender
	
	If Checked Then
		If array_mavared_darkhasti.IndexOf(chk.Tag)==-1 Then array_mavared_darkhasti.Add(chk.Tag)
	Else
		If array_mavared_darkhasti.IndexOf(chk.Tag)>-1 Then array_mavared_darkhasti.RemoveAt(array_mavared_darkhasti.IndexOf(chk.Tag))
	End If
	
	mavarede_darkhasti = ""
	For Each chk_id In array_mavared_darkhasti
		mavarede_darkhasti = mavarede_darkhasti&chk_id&","
	Next
	Log(mavarede_darkhasti)
	
End Sub

Sub gorooh_mahsool_spinner_ItemClick (Position As Int, Value As Object)
	
	Log(Position&Value)
	
	ThisGroupTypeID = GroupTypeListByName.Get(Value)
	
	downloadListMahsoolJob.Download(SaeloZahra.json_url&"product_list.php?cat="&ThisGroupTypeID)
	LogColor(SaeloZahra.json_url&"product_list.php?cat="&ThisGroupTypeID,Colors.LightGray)
	
End Sub

Sub name_mahsool_spinner_ItemClick (Position As Int, Value As Object)
	ThisProductID = nameMahsoolByName.Get(Value)
End Sub



Sub zamanebazderakht_et_FocusChanged (HasFocus As Boolean)
	witchDatePicker = "zamanebazderakht_et"
	If HasFocus Then pdpd.show
End Sub

Sub zamane_goldehi_et_FocusChanged (HasFocus As Boolean)
	witchDatePicker = "zamane_goldehi_et"
	If HasFocus Then pdpd.show
End Sub

Sub zamanefasleroshd_et_FocusChanged (HasFocus As Boolean)
	witchDatePicker = "zamanefasleroshd_et"
	If HasFocus Then pdpd.show
End Sub

Sub zamane_kesht_et_FocusChanged (HasFocus As Boolean)
	witchDatePicker = "zamane_kesht_et"
	If HasFocus Then pdpd.show
End Sub

Sub yeylaghdate_et_FocusChanged (HasFocus As Boolean)
	witchDatePicker = "yeylaghdate_et"
	If HasFocus Then pdpd.show
End Sub

Sub gheshlaghdate_et_FocusChanged (HasFocus As Boolean)
	witchDatePicker = "gheshlaghdate_et"
	If HasFocus Then pdpd.show
End Sub


Sub pdpd_DateSelected(PersianYear As Int,PersianMonth As Int,PersianDay As Int)
	
	Dim str_mounth,str_day As String
	If PersianMonth < 10 Then str_mounth="0"&PersianMonth Else str_mounth = PersianMonth
	If PersianDay < 10 Then str_day="0"&PersianDay Else str_day = PersianDay
	
	Log($"Year=${PersianYear} Month=${str_mounth} Day=${str_day} dar: ${witchDatePicker}"$)
	Dim fulldate As String = PersianYear&"/"&str_mounth&"/"&str_day
	Dim YearMountDay As String = PersianYear&str_mounth&str_day
	
	Select witchDatePicker
		Case "gheshlaghdate_et"
			gheshlaghdate_et.Text = fulldate
			gheshlaghdate_et.Tag  = YearMountDay
		Case "yeylaghdate_et"
			yeylaghdate_et.Text = fulldate
			yeylaghdate_et.Tag  = YearMountDay
		Case "zamanekasht_et"
			zamanekasht_et.Text = fulldate
			zamanekasht_et.Tag  = YearMountDay
		Case "zaman_eraa_et"
			zaman_eraa_et.Text = fulldate
			zaman_eraa_et.Tag  = YearMountDay
		Case "zamanebazderakht_et"
			zamanebazderakht_et.Text = fulldate
			zamanebazderakht_et.Tag  = YearMountDay
		Case "zamane_goldehi_et"
			zamane_goldehi_et.Text = fulldate
			zamane_goldehi_et.Tag  = YearMountDay
		Case "zamane_kesht_et"
			zamane_kesht_et.Text = fulldate
			zamane_kesht_et.Tag  = YearMountDay
		Case "zamanefasleroshd_et"
			zamanefasleroshd_et.Text = fulldate
			zamanefasleroshd_et.Tag  = YearMountDay
	End Select
	
End Sub

Sub pdpd_Disimised
	Log("pdpd_Disimised")
End Sub

Sub zamanekasht_et_FocusChanged (HasFocus As Boolean)
	witchDatePicker = "zamanekasht_et"
	If HasFocus Then pdpd.show
End Sub

Sub zaman_eraa_et_FocusChanged (HasFocus As Boolean)
	witchDatePicker = "zaman_eraa_et"
	If HasFocus Then pdpd.show
End Sub


Sub save_btn_Click
	
	ThisGroupTypeID = GroupTypeListByName.Get(gorooh_mahsool_spinner.SelectedItem)
	
	If ThisProductID < 1 Or ThisGroupTypeID<1 Then
		ToastMessageShow(SaeloZahra.CSB("فرم را تکمیل کنید"),False)
		Return
	End If
	
	Dim googleweightyeylag As String=""
	Dim googleheightyeylag As String=""
	If File.Exists(SaeloZahra.dir,"yeylagh_lat")Then
		googleweightyeylag = File.ReadString(SaeloZahra.dir,"yeylagh_lat")
		googleheightyeylag = File.ReadString(SaeloZahra.dir,"yeylagh_lng")
	End If
	
	Dim googleweightgheshlagh As String=""
	Dim googleheightgheshlagh As String=""
	If File.Exists(SaeloZahra.dir,"gheshlagh_lat")Then
		googleweightgheshlagh = File.ReadString(SaeloZahra.dir,"gheshlagh_lat")
		googleheightgheshlagh = File.ReadString(SaeloZahra.dir,"gheshlagh_lng")
	End If
	
	Dim mapSubmit As Map
	mapSubmit.Initialize
	
	If gorooh_mahsool_spinner.Tag == "group1" Then
'		mavarede_darkhasti
		mapSubmit.Clear
		mapSubmit.Put("group",		gorooh_mahsool_spinner.Tag)
		mapSubmit.Put("category",	ThisGroupTypeID)
		mapSubmit.Put("product",	ThisProductID)
		mapSubmit.Put("zaman_kasht",zamane_kesht_et.Text)
		mapSubmit.Put("sen_mahsol",	sennemahsool_et.Text)
		mapSubmit.Put("vahed",		vahed_spinner.Tag)
		mapSubmit.Put("masahat",	masahateYahteKeshET.Text)
		mapSubmit.Put("khak",		noueKhakSpinner.SelectedItem)
		mapSubmit.Put("abyari",		noueAbyari_Spinner.SelectedItem)
		mapSubmit.Put("fasele_kesht",fasele_kasht_et.Text)
		mapSubmit.Put("khoroji_chah",chah_et.Text)
		mapSubmit.Put("fasele_radif",radif_metr_et.Text)
		mapSubmit.Put("fasele_roshd",zamanefasleroshd_et.Text)
		mapSubmit.Put("goldehi_derakhtan",zamane_goldehi_et.Text)
		mapSubmit.Put("tavarom_javane",zamanebazderakht_et.Text)
		mapSubmit.Put("farmers_user",Starter.usrnm)
		
		mapSubmit.Put("bazarche",	BazarcheSwitch.Tag)
		mapSubmit.Put("vazn",		tonaj_et.Text)
		mapSubmit.Put("ghimat",		amount_et.Text)
		mapSubmit.Put("zaman_eraa",	zaman_eraa_et.Text)
		mapSubmit.Put("des",		bazarche_des_et.Text)
		
		
		SubmitJob.PostMultipart(SaeloZahra.json_url&"farmers_product_insert.php?save=true",mapSubmit,Files)
	
	Else If gorooh_mahsool_spinner.Tag == "group2" Then
		
		If googleweightyeylag.Length < 5 Or googleweightgheshlagh.Length < 5 Then
			ToastMessageShow(SaeloZahra.CSB("موقعیت مکانی ییلاق و قشلاق الزامیست"),False)
			Return
		Else If yeylaghdate_et.Text.Length < 5 Or gheshlaghdate_et.Text.Length < 5 Then
			ToastMessageShow(SaeloZahra.CSB("تاریخ ییلاق و قشلاق الزامیست"),False)
			Return
		End If
		
		
		
		mapSubmit.Clear
		mapSubmit.Put("group",gorooh_mahsool_spinner.Tag)
		mapSubmit.Put("category",ThisGroupTypeID)
		mapSubmit.Put("product",ThisProductID)
		mapSubmit.Put("yeylagh_time",yeylaghdate_et.Text)
		mapSubmit.Put("gheshlagh_time",gheshlaghdate_et.Text)
		mapSubmit.Put("yeylagh_latlng",googleweightyeylag&","&googleheightyeylag)
		mapSubmit.Put("yeylagh_latlng",googleweightgheshlagh&","&googleheightgheshlagh)

		mapSubmit.Put("farmers_user",Starter.usrnm)
		
		mapSubmit.Put("bazarche",BazarcheSwitch.Tag)
		mapSubmit.Put("vazn",tonaj_et.Text)
		mapSubmit.Put("ghimat",amount_et.Text)
		mapSubmit.Put("zaman_eraa",zaman_eraa_et.Text)
		mapSubmit.Put("des",bazarche_des_et.Text)
		
		SubmitJob.PostMultipart(SaeloZahra.json_url&"farmers_product_insert.php?save=true",mapSubmit,Files)
		
	
	End If
	
	ProgressDialogShow(SaeloZahra.CSB("در حال ثبت اطلاعات..."))
	
End Sub



Sub gheshlagh_map_btn_Click
	select_map_act.WhatLove="gheshlagh"
	StartActivity(select_map_act)
End Sub

Sub yeylagh_map_btn_Click
	select_map_act.WhatLove="yeylagh"
	StartActivity(select_map_act)
End Sub


Sub BazarcheSwitch_CheckedChange(Checked As Boolean)
	Panel_bazarche.Visible=Checked
	Panel_bazarche.Top=BazarcheSwitch.Top+BazarcheSwitch.Height+22dip
	If Checked Then
		save_btn.Top = Panel_bazarche.Top+Panel_bazarche.Height + 50dip
		ScrollView1.Panel.Height = save_btn.Top + save_btn.Height + 24dip
		BazarcheSwitch.Tag="yes"
	Else
		save_btn.Top = BazarcheSwitch.Top+BazarcheSwitch.Height + 50dip
		ScrollView1.Panel.Height = save_btn.Top + save_btn.Height + 24dip
		BazarcheSwitch.Tag="no"
	End If
End Sub


Sub selectPicBtn_Click
	Try
		BSFileChooser1.Show3("tFile", Array As String("jpeg", "jpg", "png"))
	Catch
		ToastMessageShow("نتونستیم انتخابش کنیم",False)
	End Try
End Sub

Sub sennemahsool_et_TextChanged (Old As String, New As String)
	If New.Length>2 Then sennemahsool_et.Text=New.SubString2(0,2)
End Sub

Sub IME_HeightChanged(NewHeight As Int, OldHeight As Int)
	ScrollView1.Height = NewHeight-ScrollView1.Top
End Sub





Sub tFile_result(FilePath As String)
	
'	ImageView1.Bitmap = SaeloZahra.AddBorder(LoadBitmapSample("", FilePath,ImageView1.Width*1.2,ImageView1.Height*1.2),SaeloZahra.Color)
	ImageView1.Bitmap = LoadBitmapSample("", FilePath,ImageView1.Width*1.2,ImageView1.Height*1.2)
	
	
	Dim filetype As String
	Dim fd As MultipartFileData
	fd.Initialize
	fd.KeyName="fileupload"
	
	If FilePath.Contains(".png") Then
		fd.ContentType = "image/png"
		filetype = "png"
	Else
		fd.ContentType = "image/jpeg"
		filetype = "jpg"
	End If
	
	File.Copy("",FilePath,SaeloZahra.dir,"image."&filetype)
	
	fd.Dir= SaeloZahra.dir
	fd.FileName="image."&filetype
'	CropImageInGallery(fd.Dir,fd.FileName)
	Files.Add(fd)
	
End Sub
