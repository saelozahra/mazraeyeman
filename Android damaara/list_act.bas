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
	
	Dim cheSafheyi,pageTitle,pageID As String
	Dim list_item_height As Int = 133dip

End Sub

Sub Globals
	Dim Clv As CustomListView
	Dim image_wv As WebView
	Private header_lbl As Label
	Private subtitle_lbl As Label
	Private ScrollView1 As ScrollView
	Private back As Button
	Dim JobJson As HttpJob
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("sv_layout")
	SaeloZahra.SetStatusBarColor(SaeloZahra.colorDark)
	ScrollView1.Visible=False
	header_lbl.Typeface=SaeloZahra.fontBold
	subtitle_lbl.Typeface=SaeloZahra.font
	Clv.Initialize(Me, "Clv")
	Activity.AddView(Clv.AsView,ScrollView1.Left,ScrollView1.Top,ScrollView1.Width,ScrollView1.Height)
	
	JobJson.Initialize("JobJson",Me)
End Sub

Sub Activity_Resume
	
	Clv.Clear
	
	If cheSafheyi == "videocategory" Then
		header_lbl.Text="فیلم ها"
		subtitle_lbl.Text="دسته بندی فیلم ها"
		JobJson.Download("http://agrocontrol.damaara.com/api/postdata/webservice/?kind=videocategory")
'		addItemToListView(3,"بسم الله","     باغدار گرامی لطفا هر چه سریعتر نسبت به تکمیل موارد درخواستی اقدام نمایید. در غیر اینصورت سامانه شما غیرفعال می‌گردد. ","")
'		addItemToListView(5,"بسم الله","باغدار گرامی لطفا هر چه سریعتر نسبت به تکمیل موارد درخواستی اقدام نمایید. در غیر اینصورت سامانه شما غیرفعال می‌گردد ","")
'		addItemToListView(1,"سر تیتر مطلب بدون عکس"," <img src='file:///android_asset/nameee.png' style='margin:5px;float:right;max-width:24px;height:auto;'>    باغدار گرامی لطفا هر چه سریعتر نسبت به تکمیل موارد درخواستی اقدام نمایید. در غیر اینصورت سامانه شما غیرفعال می‌گردد. ","")
'		addItemToListView(3,"بسم الله","     باغدار گرامی لطفا هر چه سریعتر نسبت به تکمیل موارد درخواستی اقدام نمایید. در غیر اینصورت سامانه شما غیرفعال می‌گردد. ","")
'		addItemToListView(1,"سر تیتر مطلب بدون عکس"," <img src='file:///android_asset/nameee.png' style='margin:5px;float:right;max-width:24px;height:auto;'>    باغدار گرامی لطفا هر چه سریعتر نسبت به تکمیل موارد درخواستی اقدام نمایید. در غیر اینصورت سامانه شما غیرفعال می‌گردد. ","")
	Else if cheSafheyi=="showvideo" Then
		header_lbl.Text=pageTitle
		subtitle_lbl.Text="لیست فیلم ها"
		LogColor("http://agrocontrol.damaara.com/api/postdata/webservice/?kind=showvideo&groupid="&pageID,Colors.Yellow)
		JobJson.Download("http://agrocontrol.damaara.com/api/postdata/webservice/?kind=showvideo&groupid="&pageID)
	Else if cheSafheyi=="my_mahsool" Then
		header_lbl.Text="محصولات من"
		subtitle_lbl.Text="لیست محصولات من"
		JobJson.Download(SaeloZahra.json_url&"productfarmers_list.php?userid="&Starter.usrnm)
	Else if cheSafheyi=="bazarche" Then
		header_lbl.Text="بازارچه"
		subtitle_lbl.Text="لیست محصولات کشاورزان ما"
		JobJson.Download(SaeloZahra.json_url&"productfarmers_list.php?bazarche=yes")
	Else if cheSafheyi=="msg" Then
		header_lbl.Text="اطلاعیه ها"
		subtitle_lbl.Text="لیست اطلاعیه ها و پیغام ها"
		JobJson.Download(SaeloZahra.json_url&"?kind=showvideo&groupid="&pageID)
	End If

	ProgressDialogShow(SaeloZahra.csb("لطفا کمی صبر کنید"))
	
	Main.amaroid.TrackView(header_lbl.Text&"  - قدیم")
	
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




Public Sub addItemToListView(id_cli As Int,line1 As String, line2 As String, Image_cli As String,Map1 As Map)
	Clv.Add(CreateListItem(id_cli , line1 , line2 , Image_cli ,Map1 ), list_item_height, id_cli)
End Sub


Sub CreateListItem(id_cli As Int,line1_cli As String, line2_cli As String, image_cli As String, map_cli As Map) As Panel

	Dim p_view As Panel
	p_view.Initialize("")
	p_view.Background=SaeloZahra.CD(SaeloZahra.colorLight)
	p_view.SetBackgroundImage(LoadBitmap(File.DirAssets,"list_bg.png")).Gravity=Gravity.FILL
	p_view.Padding = Array As Int(0dip,0dip,0dip,0dip)
	p_view.Tag=id_cli
	
		
	image_wv.Initialize("image_wv")
	image_wv.LoadHtml("<!doctype html><html><head><meta charset='utf-8'><meta name='viewport' content='width=device-width'></head><body><div style=' bottom: 2%; height: 96%; left: 2%; position: fixed; right: 2%; top: 2%; width: 96%; border-radius:20%; overflow:hidden;box-shadow: 0 0 6px #666;'><img src='"&image_cli&"' style='min-width:100%;min-height:100%;max-width:133%;max-height:202%;position: absolute;'></div></body></html>")
	image_wv.ZoomEnabled = False
	image_wv.Color = Colors.Transparent
	image_wv.Tag = id_cli
	p_view.AddView( image_wv , 100%x - (list_item_height-1dip) , 4dip , list_item_height - 70 , list_item_height - 70 )
	Log(image_cli)
	
	Dim lbl_caption As Label
	lbl_caption.Initialize("lbl_caption")
	lbl_caption.Gravity = Bit.Or(Gravity.RIGHT,Gravity.CENTER_VERTICAL)
	lbl_caption.TextSize = 1
	lbl_caption.Tag = line1_cli & CRLF & line2_cli &CRLF&SaeloZahra.site_url
	lbl_caption.Text = line1_cli
	lbl_caption.SetTextSizeAnimated(313,17)
	lbl_caption.Typeface = SaeloZahra.font
	lbl_caption.TextColor = Colors.Black
	lbl_caption.SingleLine=True
	lbl_caption.Ellipsize="END"
	p_view.AddView( lbl_caption , 3dip , 0dip , 98%x - list_item_height ,35dip )
	
	
	
	Dim text_wv As WebView
	text_wv.Initialize("text_wv")
	text_wv.Color = Colors.Transparent
	text_wv.ZoomEnabled=False
	text_wv.Tag = line1_cli
	text_wv.LoadHtml("<style>@import 'https://cdn.rawgit.com/rastikerdar/samim-font/v3.1.0/dist/font-face.css';*,body,html{font-family:'Samim';margin:auto;text-align:right;}.div{direction:rtl; width:100%;float:left;height:100%;font-size:14px;line-height: 14px;}</style><div class='div'>"&line2_cli&"</div>")
	p_view.AddView( text_wv , 3dip , 35dip , 98%x - list_item_height , 100dip )
	
	
	Dim lable1_btn As Label
	lable1_btn.Initialize("lable1_btn")
	lable1_btn.Tag=id_cli
	lable1_btn.Typeface=SaeloZahra.font
	lable1_btn.TextSize=12
	lable1_btn.Padding=Array As Int(5dip,5dip,5dip,5dip)
	lable1_btn.Gravity=Bit.Or(Gravity.RIGHT,Gravity.RIGHT)
	lable1_btn.TextColor=0xFF333333
'	lable1_btn.Text=line3_cli
	p_view.AddView(lable1_btn,2dip,list_item_height-24dip,-2,30dip)



	Dim lable1 As Label
	lable1.Initialize("lable1")
'	lable1.Background=SaeloZahra.CD(SaeloZahra.colorLight)
	lable1.Tag=map_cli
	p_view.AddView(lable1,0dip,0dip,100%x,list_item_height)


	If image_cli == "" Then
		image_wv.Visible=False
		lbl_caption.Width=90%x
		text_wv.Width=90%x
	End If
	
'	ripple.Initialize(lable1,saelozahra.colorDark,313,False)
	Return p_view
	
	
End Sub



Sub Clv_ItemClick (Index As Int, Value As Object)
	
	
	Dim panel_test As Panel
	panel_test = Clv.GetPanel(Index)
	
	Log("Tag is: "&panel_test.GetView(0).Tag)
	
	Select cheSafheyi
		Case "videodetail"
			show_content_act.cheSafheyi = "video"
			show_content_act.pageID 		= panel_test.GetView(0).Tag
			show_content_act.pageTitle 	= panel_test.GetView(2).Tag
			StartActivity(show_content_act)
		Case "showvideo"
'			cheSafheyi 	= "videodetail"
'			pageID 		= panel_test.GetView(0).Tag
'			pageTitle 	= panel_test.GetView(2).Tag
'			StartActivity("list_act")
			show_content_act.cheSafheyi = "video"
			show_content_act.pageID 		= panel_test.GetView(0).Tag
			show_content_act.pageTitle 	= panel_test.GetView(2).Tag
			StartActivity(show_content_act)
			
		Case "videocategory"
'			JobJson.Download(SaeloZahra.json_url&"?kind=showvideo&groupid="&panel_test.GetView(0).Tag)
			cheSafheyi 	= "showvideo"
			pageID 		= panel_test.GetView(0).Tag
			pageTitle 	= panel_test.GetView(2).Tag
'			CallSub(Me,"Activity_Resume")
			StartActivity("list_act")
		Case "my_mahsool"
'			JobJson.Download(SaeloZahra.json_url&"?kind=showvideo&groupid="&panel_test.GetView(0).Tag)
			pageID 		= panel_test.GetView(0).Tag
			pageTitle 	= panel_test.GetView(2).Tag
			bazarcheMahsoolAct.pageVals=panel_test.GetView(4).Tag
			StartActivity(bazarcheMahsoolAct)
	End Select
	
End Sub




Sub lable1_Click

	Dim index As Int
	index = Clv.GetItemFromView(Sender)
	
'	Dim panel_test As Panel
'	panel_test = Clv.GetPanel(index)
	
	Clv_ItemClick(index,Clv.GetValue(index))
	
End Sub


Sub lable1_LongClick
	Dim index As Int
	index = Clv.GetItemFromView(Sender)

	Dim panel_test As Panel
	panel_test = Clv.GetPanel(index)
	
	
	SaeloZahra.intent1.Initialize(SaeloZahra.intent1.ACTION_SEND,"")
	SaeloZahra.intent1.SetType("text/plain")
	SaeloZahra.intent1.PutExtra("android.intent.extra.TEXT", panel_test.GetView(1).Tag & CRLF & "https://cafebazaar.ir/app/"&Application.PackageName)
	SaeloZahra.intent1.WrapAsIntentChooser("ارسال این مطلب")
	StartActivity(SaeloZahra.intent1)
	
End Sub


Sub JobDone(Job As HttpJob)
	
	ProgressDialogHide
	
	Log(Job.Success&"  "&cheSafheyi)
	
	If Job.Success Then
		Select cheSafheyi
			Case "my_mahsool","bazarche"
				Dim parser As JSONParser
				parser.Initialize(Job.GetString)
				Dim root_bazarche As List = parser.NextArray
				For Each colroot As Map In root_bazarche
'					Dim fasele_roshd As String = colroot.Get("fasele_roshd")
'					Dim abyari As String = colroot.Get("abyari")
'					Dim sen_mahsol As String = colroot.Get("sen_mahsol")
'					Dim tavarom_javane As String = colroot.Get("tavarom_javane")
'					Dim vahed As String = colroot.Get("vahed")
'					Dim goldehi_derakhtan As String = colroot.Get("goldehi_derakhtan")
'					Dim ghimat As String = colroot.Get("ghimat")
'					Dim zaman_kesht As String = colroot.Get("zaman_kesht")
'					Dim zaman_kasht As String = colroot.Get("zaman_kasht")
'					Dim fasele_kesht As String = colroot.Get("fasele_kesht")
'					Dim group As String = colroot.Get("group")
'					Dim vazn As String = colroot.Get("vazn")
'					Dim farmers_user As String = colroot.Get("farmers_user")
'					Dim fasele_radif As String = colroot.Get("fasele_radif")
'					Dim khak As String = colroot.Get("khak")
'					Dim masahat As String = colroot.Get("masahat")
'					Dim khoroji_chah As String = colroot.Get("khoroji_chah")
'					Dim category As String = colroot.Get("category")
'					Dim bazarche As String = colroot.Get("bazarche")
					
					Dim image_url As String
					If colroot.Get("pic")<>"" Then
						image_url = SaeloZahra.site_url&"reseller/fileupload/product/"&colroot.Get("pic")
					Else
						image_url = "http://melkamlak.com/melk_pic/32438/bpic32438.jpg"
					End If
				
					addItemToListView(colroot.Get("id"),colroot.Get("vazn")&" تن "&colroot.Get("product_title"), colroot.Get("des") &CRLF&colroot.Get("zaman_eraa") , image_url,colroot)
					
				Next
			Case "showvideo"
				Dim parser As JSONParser
				parser.Initialize(Job.GetString)
				Dim root As Map = parser.NextObject
				Dim videos As List = root.Get("videos")
				For Each colvideos As Map In videos
'					Dim VideoFile As String = colvideos.Get("VideoFile")
					addItemToListView(colvideos.Get("ID"),colvideos.Get("Title")," <img src='file:///android_asset/nameee.png' style='margin:0 5px;float:right;max-width:24px;height:auto;'>   " & colvideos.Get("Description") ,colvideos.Get("Pic"),colvideos)
				Next
			Case "videocategory"
				Dim parser As JSONParser
				parser.Initialize(Job.GetString)
				Dim root As Map = parser.NextObject
				Dim videocategories As List = root.Get("videocategories")
				For Each colvideocategories As Map In videocategories
					addItemToListView(colvideocategories.Get("ID"),colvideocategories.Get("title")," <img src='file:///android_asset/nameee.png' style='margin:0 5px;float:right;max-width:24px;height:auto;'>   " & colvideocategories.Get("GrpName"),"",colvideocategories)'colvideocategories.Get("Pic")
				Next
		End Select
	Else
		
		If Job.ErrorMessage.Contains("Unable to resolve host") Then
			ToastMessageShow(SaeloZahra.CSB(" اینترنتتون وصل نیست "),True)
		Else
			ToastMessageShow(SaeloZahra.CSB(" خطا ")&CRLF&Job.ErrorMessage,True)
		End If
	End If
End Sub
