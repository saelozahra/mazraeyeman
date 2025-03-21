B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=11.2
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True
#End Region
#Extends: android.support.v7.app.AppCompatActivity

Sub Process_Globals
	Dim PlaceList As List
	Dim ListType As String = "my"
End Sub

Sub Globals
	Private ActionBar As ACToolBarDark
	Private ScrollView1 As ScrollView
	Dim X1 As XmlLayoutBuilder
	
	Dim SH As Amir_SliderShow
	Dim Config 	As Amir_SliderConfig
	Dim Show 	As Amir_SliderShow
	Dim Snake As DSSnackbar
	Dim AC As AppCompat
	
	
	'Bazarche
	Dim ClvBazarche As CustomListView
	Dim jobBazarche As HttpJob
	Dim mapProductName As Map
	
End Sub

Sub Activity_Create(FirstTime As Boolean)
	
	Activity.LoadLayout("SVNewLayout")
	ScrollView1.Visible=False
	
	SaeloZahra.SetStatusBarColor(SaeloZahra.ColorDark)
	ActionBar.Title=SaeloZahra.CSB("محصولات")
	ActionBar.TitleTextColor=Colors.White
	ActionBar.NavigationIconDrawable = X1.GetDrawable("baseline_arrow_back_white_24")
	ActionBar.Color=SaeloZahra.Color
	ActionBar.SetLayout(0,0,100%x,SaeloZahra.MaterialActionBarHeight+5dip)
	
	
	mapProductName.Initialize
	If File.Exists(SaeloZahra.dir,"ProductName") Then
		mapProductName=File.ReadMap(SaeloZahra.dir,"ProductName")
	End If
	
	ClvBazarche.Initialize(Me, "ClvBazarche")
	Activity.AddView(ClvBazarche.AsView,0,ActionBar.Height,-1,-1)
	
	jobBazarche.Initialize("jobBazarche",Me)
	If ListType=="my" Then
		jobBazarche.Download(SaeloZahra.json_url&"productfarmers_list.php?userid="&Starter.usrnm)
		Log(SaeloZahra.json_url&"productfarmers_list.php?userid="&Starter.usrnm)
		ActionBar.Title=SaeloZahra.CSB("محصولات من")
	End If
							
	ProgressDialogShow(SaeloZahra.CSB("در حال بارگزاری..."))
	
	
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
	
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub JobDone (Job As HttpJob)
	
	ProgressDialogHide
	LogColor(Job.JobName&"    ,    "&Job.Success,Colors.Magenta)
	
	If Job.Success Then
    
				ClvBazarche.Clear
				
				
				
				If Job.GetString=="{""result"":""not found""}" Or Job.GetString=="" Or Job.GetString =="""not found""" Then
					
					ClvBazarche.Add(CreateListItem(1,"در بازارچه محصولی موجود نیست","برای افزودن محصول کلیک کنید","http://melkamlak.com/melk_pic/32438/bpic32438.jpg",""),HomeAct.listItemHeightBazarche+22,"")
						
					Snake.Initialize("snake",Activity,SaeloZahra.CSB("نتیجه ای یافت نشد"),Snake.DURATION_LONG)
					Snake.Show
					
				Else
					
			PlaceList.Initialize
					
					
					
			Dim parser As JSONParser
			parser.Initialize(Job.GetString)
			Dim root As List = parser.NextArray
			For Each colroot As Map In root
				
				
				
				Dim image_url As String
				If colroot.Get("pic")<>"" Then
					image_url = SaeloZahra.site_url&"reseller/fileupload/product/"&colroot.Get("pic")
				Else
					image_url = "http://melkamlak.com/melk_pic/32438/bpic32438.jpg"
				End If
						
				Dim url As String = SaeloZahra.site_url&"user/id/"&colroot.Get("id")&"/simple"
						
				If mapProductName.ContainsKey(colroot.Get("product")) Then colroot.Put( "product" , mapProductName.Get(colroot.Get("product")) )
						
				ClvBazarche.Add(CreateListItem(colroot.Get("id"),colroot.Get("vazn")&" تن "&colroot.Get("product_title"),"ارائه در "&colroot.Get("zaman_eraa"),image_url,url),HomeAct.listItemHeightBazarche+22,colroot)
						
				PlaceList.Add(colroot)
						
				
			Next



		End If
				
				
	Else
		
		If SaeloZahra.CheckConnection Then Log("Error: " & Job.ErrorMessage)
		
		LogColor(Job.ErrorMessage,Colors.Magenta)
		
	End If
    
	Job.Release
	
End Sub


#Region Bazarche



Sub CLV_ItemClick (Index As Int, Value As Object)
	
	SH.convertActivityFromTranslucent
		
	If Value=="" Then
		StartActivity(SabteMahsoolAct)
	Else
		Log(Value)
		'	Sleep(500)
		
		Msgbox2Async("قصد انجام چه عملیاتی دارید ؟", "عملیات", "نمایش", "لغو", "ویرایش", Null, False)
		Wait For Msgbox_Result (Result As Int)
		If Result = DialogResponse.POSITIVE Then
			bazarcheMahsoolAct.pageVals=Value
			ProgressDialogShow("کمی صبر کنید...")
			StartActivity(bazarcheMahsoolAct)
		Else If Result = DialogResponse.NEGATIVE Then
			SabteMahsoolAct.EditMahsoolMap=Value
			ProgressDialogShow("کمی صبر کنید...")
			StartActivity(SabteMahsoolAct)
		End If
		
	End If
	
End Sub


Sub Cover_lbl_Click
	Dim index As Int
	index = ClvBazarche.GetItemFromView(Sender)
	CLV_ItemClick(index,ClvBazarche.GetValue(index))
End Sub



Sub CreateListItem(id_cli As Int,Title_cli As String, line2_cli As String, image_cli As String, Url_cli As String) As Panel

	
	Dim p_view As Panel
	p_view.Initialize("")
	
	Dim gdr As GradientDrawable
	gdr.Initialize("TR_BL", Array As Int(0x2ADBECDC, Colors.White))
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
'	p_view.AddView( inner_pannel , 0 ,0 , 100%x , listItemHeightBazarche+18dip )
	
	Dim Image_WV As WebView
	Image_WV.Initialize("image_wv")
	Image_WV.LoadHtml("<!doctype html><html><head><meta charset='utf-8'><meta name='viewport' content='width=device-width'></head><body><div style=' bottom: 5%; height: 90%; left: 5%; position: fixed; right: 5%; top: 5%; width: 90%; overflow:hidden;box-shadow: 0 0 6px #666;'><img src='"&image_cli&"' style='min-width:100%;min-height:100%;max-width:133%;max-height:202%;position: absolute;'></div></body></html>")
	Image_WV.ZoomEnabled = False
	Image_WV.Color = Colors.Transparent
	Image_WV.Tag = Title_cli & CRLF & line2_cli &CRLF&SaeloZahra.site_url
	p_view.AddView( Image_WV , 60%x , 5dip , 37%x , HomeAct.listItemHeightBazarche - 20dip )
	
	
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
	p_view.AddView( lbl_caption , 2dip , 8dip , 59%x ,35dip )
	
	
	Dim text_wv As WebView
	text_wv.Initialize("text_wv")
	text_wv.Color = Colors.Transparent
	text_wv.ZoomEnabled=False
	text_wv.Tag = id_cli
	text_wv.LoadHtml("<style>@import 'https://cdn.jsdelivr.net/gh/rastikerdar/samim-font@v4.0.5/dist/font-face.css'; *,body,html{font-family:'Samim';margin:auto;} .div{ direction:rtl; width:100%;float:left;height:100%;font-size:12px;}</style><div class='div'>"&line2_cli&"</div>")
	p_view.AddView( text_wv , 0dip , 52dip , 59%x , 88dip )
	
	
	
	Dim Cover_lbl As Label
	Cover_lbl.Initialize("Cover_lbl")
	Cover_lbl.Tag=Url_cli
	p_view.AddView(Cover_lbl,0dip,0dip,100%x,HomeAct.listItemHeightBazarche)
	
	AC.SetClickEffect(Cover_lbl,True)
	
	
'	Ripple.Initialize(Cover_lbl,saelozahra.colorDark,313,False)
	

	Return p_view
	
	
End Sub

#End Region








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


