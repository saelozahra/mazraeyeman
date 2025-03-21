B4A=true
Group=OLD
ModulesStructureVersion=1
Type=Activity
Version=9
@EndOfDesignText@
'#Extends: android.support.v7.app.AppCompatActivity
#Extends: androidx.appcompat.app.AppCompatActivity

#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True
#End Region

Sub Process_Globals
	Dim PlaceList As List
	Dim list_item_height As Int = 133dip
End Sub

Sub Globals
	Dim AC As AppCompat
	Private VP As AHViewPager
	Private PC As AHPageContainer
	Private TabLayout As DSTabLayout
	Dim Clv1,Clv2,Clv3,Clv4 As CustomListView
	Private ActionBar As ACToolBarDark
	Dim P1,P2,P3,P4 As Panel
	Dim X1 As XmlLayoutBuilder
	Dim jobs(5) As HttpJob
	Dim mapProductName As Map
End Sub

Sub Activity_Create(FirstTime As Boolean)
	
'	SaeloZahra.SetStatusBarColor(SaeloZahra.colorDark)
	
	Activity.Tag="best_list"
	
	Activity.LoadLayout("tab_layout")
	
	ActionBar.Color=Colors.Transparent'SaeloZahra.color
	ActionBar.Title=SaeloZahra.CSB("بازارچه میوه و تره بار")
	Main.amaroid.TrackView(ActionBar.title&"  - قدیم")
	
	Clv1.Initialize(Me, "clv")
	Clv2.Initialize(Me, "clv")
	Clv3.Initialize(Me, "clv")
	Clv4.Initialize(Me, "clv")
	
	PC.Initialize
	TabLayout.SetTabTextColors(SaeloZahra.colorLight,Colors.White)
	
	
	ActionBar.NavigationIconDrawable = X1.GetDrawable("baseline_arrow_back_white_24")
	
	P1.Initialize("p1")
	P2.Initialize("p2")
	P3.Initialize("p3")
	P4.Initialize("p4")
	P1.AddView(Clv1.AsView,5dip,0,100%x-10dip,100%y - (SaeloZahra.MaterialActionBarHeight*2))
	P2.AddView(Clv2.AsView,5dip,0,100%x-10dip,100%y - (SaeloZahra.MaterialActionBarHeight*2))
	P3.AddView(Clv3.AsView,5dip,0,100%x-10dip,100%y - (SaeloZahra.MaterialActionBarHeight*2))
	P4.AddView(Clv4.AsView,5dip,0,100%x-10dip,100%y - (SaeloZahra.MaterialActionBarHeight*2))
	
	PC.AddPage(P1, SaeloZahra.csb("همه محصولات"))
	PC.AddPage(P2, SaeloZahra.csb("ارزان ترین ها"))
	PC.AddPage(P3, SaeloZahra.csb("نزدیک ترین ها به شما"))
	PC.AddPage(P4, SaeloZahra.csb("محصولات شما"))
	
	VP.PageContainer = PC
	
	TabLayout.Color = Colors.Transparent'SaeloZahra.color
	
	TabLayout.SetViewPager(VP)
	ActionBar.SetLayout(0,AC.GetStatusBarHeight,100%x,SaeloZahra.MaterialActionBarHeight)
	TabLayout.SetLayout(0,ActionBar.Top+ActionBar.Height,100%x,SaeloZahra.MaterialActionBarHeight)
	VP.SetLayout(0,TabLayout.Top+TabLayout.Height,100%x,100%y - (SaeloZahra.MaterialActionBarHeight*2) )
	
	TabLayout.SetTabIcon(0,X1.GetDrawable("baseline_all_inclusive_white_24"))
	TabLayout.SetTabIcon(1,X1.GetDrawable("baseline_attach_money_white_24"))
	TabLayout.SetTabIcon(2,X1.GetDrawable("baseline_place_white_24"))
	TabLayout.SetTabIcon(3,X1.GetDrawable("baseline_sentiment_satisfied_alt_white_24"))
	
	
	mapProductName.Initialize
	
	If File.Exists(SaeloZahra.dir,"ProductName") Then
		mapProductName=File.ReadMap(SaeloZahra.dir,"ProductName") 
	End If
	
	jobs(0).Initialize("jobs_all",Me)
	jobs(1).Initialize("jobs_amount",Me)
	jobs(2).Initialize("jobs_near",Me)
	jobs(3).Initialize("jobs_my",Me)
	jobs(4).Initialize("jobs_productname",Me)
	
	jobs(4).Download(SaeloZahra.json_url&"product_list.php")
	
	jobs(0).Download(SaeloZahra.json_url&"productfarmers_list.php?bazarche=yes")
'	Sleep(1000)
	jobs(1).Download(SaeloZahra.json_url&"productfarmers_list.php?bazarche=yes&order=yes&o=ghimat")
'	Sleep(1000)
	If Not(Starter.MyLocation.IsInitialized) Then
		Starter.MyLocation.Initialize
		Starter.MyLocation.Latitude=0
		Starter.MyLocation.Longitude=0
	End If
	jobs(2).Download(SaeloZahra.json_url&$"productfarmers_list.php?bazarche=yes${Starter.MyLocation.Latitude}","${Starter.MyLocation.Longitude}/"$)
'	Sleep(1000)
	jobs(3).Download(SaeloZahra.json_url&$"productfarmers_list.php?userid=${Starter.usrnm}&bazarche=yes"$)
	
	
End Sub


Sub VP_PageChanged (Position As Int)
	Log(Position)
End Sub

'Sub HideToolbar
'	ActionBar.SetLayoutAnimated(1110,0,0,100%x,0)
'	TabLayout.Top=ActionBar.Top+ActionBar.Height
'	VP.Top=TabLayout.Top+TabLayout.Height
'	VP.Height=100%y-VP.Top
'	P1.Height = VP.Height
'	P2.Height = VP.Height
'	Clv1.AsView.Height=P1.Height
'	Clv2.AsView.Height=P2.Height
'End Sub
'
'Sub ShowToolbar
'	ActionBar.SetLayoutAnimated(1110,0,0,100%x,SaeloZahra.MaterialActionBarHeight)
'	TabLayout.Top=ActionBar.Top+ActionBar.Height
'	VP.Top=TabLayout.Top+TabLayout.Height
'	VP.Height=100%y-VP.Top
'	P1.Height = VP.Height
'	P2.Height = VP.Height
'	Clv1.AsView.Height=P1.Height
'	Clv2.AsView.Height=P2.Height
'End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

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




Sub JobDone (Job As HttpJob)
	
	ProgressDialogHide

	If Job.Success Then
    
'		If saelozahra.debug Then Log("JobName = " & Job.JobName & ", Success = " & Job.Success & "job tag: "&Job.Tag)
		
		If Job.GetString=="{""result"":""not found""}" Or Job.GetString=="" Then
			ToastMessageShow(SaeloZahra.csb("نتیجه ای یافت نشد"),True)
		Else If Job.JobName=="jobs_productname" Then
			Dim parser_productname As JSONParser
			parser_productname.Initialize(Job.GetString)
			Dim root_productname As List = parser_productname.NextArray
			For Each colroot As Map In root_productname
				Dim product_id As String = colroot.Get("id")
				Dim product_title As String = colroot.Get("title")
				mapProductName.Put(product_id,product_title)
			Next
			File.WriteMap(SaeloZahra.dir,"ProductName",mapProductName)
		Else
			
			PlaceList.Initialize
			
			Dim parser As JSONParser
			parser.Initialize(Job.GetString)
			Dim root As List = parser.NextArray
			For Each colroot As Map In root
				
'				Dim fasele_roshd As String = colroot.Get("fasele_roshd")
'				Dim abyari As String = colroot.Get("abyari")
'				Dim sen_mahsol As String = colroot.Get("sen_mahsol")
'				Dim tavarom_javane As String = colroot.Get("tavarom_javane")
'				Dim vahed As String = colroot.Get("vahed")
'				Dim goldehi_derakhtan As String = colroot.Get("goldehi_derakhtan")
'				Dim des As String = colroot.Get("des")
'				Dim ghimat As String = colroot.Get("ghimat")
'				Dim zaman_kesht As String = colroot.Get("zaman_kesht")
'				Dim zaman_kasht As String = colroot.Get("zaman_kasht")
'				Dim fasele_kesht As String = colroot.Get("fasele_kesht")
'				Dim group As String = colroot.Get("group")
'				Dim gheshlagh_latlng As String = colroot.Get("gheshlagh_latlng")
'				Dim gheshlagh_time As String = colroot.Get("gheshlagh_time")
'				Dim vazn As String = colroot.Get("vazn")
'				Dim farmers_user As String = colroot.Get("farmers_user")
'				Dim yeylagh_time As String = colroot.Get("yeylagh_time")
'				Dim fasele_radif As String = colroot.Get("fasele_radif")
'				Dim khak As String = colroot.Get("khak")
'				Dim yeylagh_latlng As String = colroot.Get("yeylagh_latlng")
'				Dim masahat As String = colroot.Get("masahat")
'				Dim khoroji_chah As String = colroot.Get("khoroji_chah")
'				Dim category As String = colroot.Get("category")
'				Dim bazarche As String = colroot.Get("bazarche")
				
				
				
				Dim image_url As String
				If colroot.Get("pic")<>"" Then
					image_url = SaeloZahra.site_url&"reseller/fileupload/product/"&colroot.Get("pic")
				Else
					image_url = "http://melkamlak.com/melk_pic/32438/bpic32438.jpg"
				End If
				
				Dim url As String = SaeloZahra.site_url&"user/id/"&colroot.Get("id")&"/simple"
				
				If mapProductName.ContainsKey(colroot.Get("product")) Then colroot.Put( "product" , mapProductName.Get(colroot.Get("product")) )
				
				Select Job.JobName
					Case "jobs_all"
						Clv1.Add(CreateListItem(colroot.Get("id"),colroot.Get("vazn")&" تن "&colroot.Get("product_title"),"ارائه در "&colroot.Get("zaman_eraa"),image_url,url),list_item_height+22,colroot)
					Case "jobs_amount"
						Clv2.Add(CreateListItem(colroot.Get("id"),colroot.Get("vazn")&" تن "&colroot.Get("product_title"),"ارائه در "&colroot.Get("zaman_eraa"),image_url,url),list_item_height+22,colroot)
					Case "jobs_near"
						Clv3.Add(CreateListItem(colroot.Get("id"),colroot.Get("vazn")&" تن "&colroot.Get("product_title"),"ارائه در "&colroot.Get("zaman_eraa"),image_url,url),list_item_height+22,colroot)
					Case "jobs_my"
						Clv4.Add(CreateListItem(colroot.Get("id"),colroot.Get("vazn")&" تن "&colroot.Get("product_title"),"ارائه در "&colroot.Get("zaman_eraa"),image_url,url),list_item_height+22,colroot)
				End Select
				
				
				PlaceList.Add(colroot)
			Next

		End If
				
				
	Else
		
'		ToastMessageShow("Error: " & Job.ErrorMessage, True)
		If SaeloZahra.CheckConnection Then Log("Error: " & Job.ErrorMessage)
		'Else show_snake("اتصال اینرنت خود را بررسی کنید",3000)
	End If
    
	Job.Release
	
End Sub










Sub CLV_ItemClick (Index As Int, Value As Object)
	
'	Dim panel_test As Panel
'	panel_test = CLV.GetPanel(Index)
'	
'	saelozahra.SetAnimation("file3","file4")
'	
'	page_webview_act.page_title="آرایشگاه ها"
'	page_webview_act.page_type="url"
	Log(Value)
'	Sleep(500)
	bazarcheMahsoolAct.pageVals=Value
	ProgressDialogShow("کمی صبر کنید...")
	StartActivity(bazarcheMahsoolAct)
	
End Sub




Sub Cover_lbl_Click
'			Dim panel_test As Panel
'			panel_test = Clv1.GetPanel(index)
	Dim index As Int
	Select VP.CurrentPage
		Case 0
			index = Clv1.GetItemFromView(Sender)
			CLV_ItemClick(index,Clv1.GetValue(index))
		Case 1
			index = Clv2.GetItemFromView(Sender)
			CLV_ItemClick(index,Clv2.GetValue(index))
		Case 2
			index = Clv3.GetItemFromView(Sender)
			CLV_ItemClick(index,Clv3.GetValue(index))
		Case 3
			index = Clv4.GetItemFromView(Sender)
			CLV_ItemClick(index,Clv4.GetValue(index))
	End Select
End Sub






Sub CreateListItem(id_cli As Int,Title_cli As String, line2_cli As String, image_cli As String, Url_cli As String) As Panel

	Dim list_item_height As Int = 133dip
	
	Dim p_view As Panel
	p_view.Initialize("")
	
	Dim gdr As GradientDrawable
	gdr.Initialize("TR_BL", Array As Int(Colors.White, Colors.White))
	gdr.CornerRadius = 8dip
	
	p_view.Background=gdr
	p_view.Elevation=8dip
	
	p_view.Padding = Array As Int(5dip,2dip,5dip,2dip)

	
'	Dim inner_pannel As MSCardView
'	inner_pannel.Initialize("")
'	inner_pannel.tag=Title_cli
'	inner_pannel.Panel.Color=Colors.White
	
'	inner_pannel.MaxElevation = 5dip
'	inner_pannel.Elevation = 3dip
'	inner_pannel.Radius = 5
'	p_view.AddView( inner_pannel , 0 ,0 , 100%x , list_item_height+18dip )
	
	Dim Image_WV As WebView
	Image_WV.Initialize("image_wv")
	Image_WV.LoadHtml("<!doctype html><html><head><meta charset='utf-8'><meta name='viewport' content='width=device-width'></head><body><div style=' bottom: 2%; height: 96%; left: 2%; position: fixed; right: 2%; top: 2%; width: 96%; border-radius:50%; overflow:hidden;box-shadow: 0 0 6px #666;'><img src='"&image_cli&"' style='min-width:100%;min-height:100%;max-width:133%;max-height:202%;position: absolute;'></div></body></html>")
	Image_WV.ZoomEnabled = False
	Image_WV.Color = Colors.Transparent
	Image_WV.Tag = Title_cli & CRLF & line2_cli &CRLF&SaeloZahra.site_url
	p_view.AddView( Image_WV , 100%x - (list_item_height+8dip) , 5dip , list_item_height - 28 , list_item_height - 30 )
	
	
	Dim lbl_caption As Label
	lbl_caption.Initialize("lbl_caption")
	lbl_caption.Gravity = Bit.Or(Gravity.RIGHT,Gravity.CENTER_VERTICAL)
	lbl_caption.TextSize = 1
	lbl_caption.Tag = id_cli
	lbl_caption.Text = Title_cli
	lbl_caption.SetTextSizeAnimated(313,17)
	lbl_caption.Typeface = SaeloZahra.font
	lbl_caption.TextColor = Colors.Black
	lbl_caption.SingleLine=True
	lbl_caption.Ellipsize="END"
	p_view.AddView( lbl_caption , 2dip , 8dip , 100%x - (list_item_height+5dip) ,35dip )
	
	
	Dim text_wv As WebView
	text_wv.Initialize("text_wv")
	text_wv.Color = Colors.Transparent
	text_wv.ZoomEnabled=False
	text_wv.Tag = id_cli
	text_wv.LoadHtml("<style>@import 'https://cdn.rawgit.com/rastikerdar/samim-font/v3.1.0/dist/font-face.css'; *,body,html{font-family:'Samim';margin:auto;} .div{ direction:rtl; width:100%;float:left;height:100%;font-size:12px;}</style><div class='div'>"&line2_cli&"</div>")
	p_view.AddView( text_wv , 0dip , 52dip , 100%x - (list_item_height+10dip) , 88dip )
	
	
	
	Dim Cover_lbl As Label
	Cover_lbl.Initialize("Cover_lbl")
	Cover_lbl.Tag=Url_cli
	p_view.AddView(Cover_lbl,0dip,0dip,100%x,list_item_height)
	
	AC.SetClickEffect(Cover_lbl,True)
	
	
'	Ripple.Initialize(Cover_lbl,saelozahra.colorDark,313,False)
	

	Return p_view
	
	
End Sub

