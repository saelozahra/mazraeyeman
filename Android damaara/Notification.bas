B4A=true
Group=OLD
ModulesStructureVersion=1
Type=Activity
Version=6.3
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
	Dim title_limit As String
'	Dim bbbd As BitmapDrawable
'	Dim xml1 As XmlLayoutBuilder
	Private Actionbar As ACToolBarDark
	Public css_start,css_end As String
	Dim web As PhoneIntents
	Dim act_title As Label
	Dim ac As AppCompat
	Dim ABHelper As ACActionBar
	Dim back_btn As Button
	Private list_not As ListView
	Private matn As WebView
	Dim icon_list,icon_back As IconicsDrawable
	Private subtitle_lbl As Label
End Sub


Sub Activity_Create(FirstTime As Boolean)

	css_start	= "<html><body style='white-space: pre-wrap;box-sizing: border-box; padding:2%; margin: auto;text-align: right; width:100%;max-width:100%;direction:rtl;line-height:1.4;font-family:Tanha;font-size:110%;color:#777;'>           <style>@import url(https://cdn.rawgit.com/rastikerdar/samim-font/v3.1.0/dist/font-face.css); h1{font-size:130%;margin:3% auto;} hr, .hr {background: rgba(0, 0, 0, 0) url('file:///android_asset/sp.png') repeat-x scroll center center; border: 0 none;clear: both;height: 19px;margin: 8px auto;width: 100%;} a{color:#111;font-weight: bold;} .img{max-width:100%;}</style>       <pre style='white-space: pre-wrap;width:100%;font-family:Samim;'>"
	css_end		= "</pre><br style='clear:both;' > </body></html>"
	
	Activity.LoadLayout("notification")
	
	If Activity.Height>1999 Then
		list_not.SetLayout(list_not.Left,list_not.Top+24dip,list_not.Width,list_not.Height-24dip)
	End If
	
	Main.amaroid.TrackView("اطلاعیه ها  - قدیم")
	
	list_not.SingleLineLayout.ItemHeight = 85dip
	list_not.SingleLineLayout.Label.Height = 85dip
	
	list_not.SingleLineLayout.Label.Color=Colors.Transparent
	list_not.SingleLineLayout.Label.Gravity=Bit.Or(Gravity.CENTER_HORIZONTAL,Gravity.CENTER_VERTICAL)
	list_not.SingleLineLayout.Label.TextColor=SaeloZahra.colorDark
	list_not.SingleLineLayout.Label.Typeface=SaeloZahra.font
	
	Actionbar.SetAsActionBar
	ABHelper.Initialize



	
	icon_list.Initialize("gmd_list")
	icon_list.Color(Colors.White)
	icon_list.sizeDp(40dip)
	icon_list.paddingDp(5dip)
	
	icon_back.Initialize("gmd_arrow_back")
	icon_back.Color(Colors.White)
	icon_back.sizeDp(40dip)
	icon_back.paddingDp(5dip)	
	
	back_btn.Initialize("bb")
	back_btn.SetBackgroundImage(icon_back.toBitmap)
	back_btn.Gravity = Gravity.CENTER
	back_btn.Text=""
	back_btn.tag="list1"
	Actionbar.AddView(back_btn,ac.GetMaterialActionBarHeight / 1.5 ,ac.GetMaterialActionBarHeight / 1.5 ,Bit.Or(Gravity.LEFT,Gravity.TOP))
	
	
	
	
	act_title.Initialize("act_title")
	
	act_title.Text=Activity.Title
	
	act_title.Typeface = SaeloZahra.font
	act_title.TextColor = Colors.White
	act_title.Gravity = Bit.Or(Gravity.CENTER_HORIZONTAL,Gravity.CENTER_VERTICAL)
	act_title.TextSize = 22
	Actionbar.AddView(act_title,-2,ac.GetMaterialActionBarHeight , Bit.Or(Gravity.CENTER_HORIZONTAL,Gravity.CENTER_VERTICAL))
	
	matn.Color = Colors.Transparent


	Actionbar.SetLayoutAnimated(200, 0, 0, 100%x, ac.GetMaterialActionBarHeight)
	Actionbar.SetVisibleAnimated(110, True)
	Actionbar.Color=Colors.Transparent
'	matn.SetLayoutAnimated(200, 5%x , ac.GetMaterialActionBarHeight+5%y , 90%x , 90%y - ac.GetMaterialActionBarHeight)
	



	If File.Exists(SaeloZahra.dir,"db.db") = False Then
		File.Copy(File.DirAssets,"db.db",SaeloZahra.dir,"db.db")
	End If
	
	
	If sql1.IsInitialized = False Then
		sql1.Initialize(SaeloZahra.dir,"db.db",False)
	End If
	
	
	SaeloZahra.SetStatusBarColor(SaeloZahra.colorDark)
	
	
End Sub

Sub Activity_Resume
	
	list_not.Clear
	
	Dim in1 As Intent
	
	in1 = Activity.GetStartingIntent
	If in1.HasExtra("Notification_Tag") Then
		Log(in1.GetExtra("Notification_Tag")) 'Will log the tag
		ToastMessageShow(in1.GetExtra("Notification_Tag"),True)
	Else
		ToastMessageShow("Dont Has Extra",True)
	End If
	
	If in1.HasExtra("Notification_Tag") Then
	
	
	
		cu1 = sql1.ExecQuery("SELECT * FROM notification ORDER BY id DESC limit 1")
		
		back_btn.tag="list1"
			
		For i = 0 To cu1.RowCount-1
			
			cu1.Position = i
			
			type_str = cu1.GetString("type")
	
	
			
	
	
		
			If type_str == "telegram" Then
				Activity.Finish
				open_telegram(cu1.GetString("value"))
			End If
		
			If type_str == "url" Then
				Activity.Finish
				StartActivity(web.OpenBrowser(cu1.GetString("value")))
			End If
		
			If type_str == "activity" Then
				Activity.Finish
				StartActivity(cu1.GetString("value"))
			End If

		
			'		If insert_str <> "" Then
			'			Activity.Finish
			'			Main.sql1.ExecNonQuery("insert into content (name,html,cat) VALUES ('"&name_str&"','"&html_str&"','"&cat_str&"')")
			'		End If
		
					
			'		If html_str <> "" Then
			'			matn.Visible=True
			'			list_not.Visible=False
			'			back_btn.Background=icon_back.Drawable
			'			back_btn.tag="list1"
			'			matn.LoadHtml(css_start & "<h1>" & title_str &  "</h1> <hr>" &  html_str & css_end )
			'
			'			'			insertDB(title_str,html_str)
			'
			'		Else
			'			matn.Visible=True
			'			list_not.Visible=False
			'			back_btn.Background=icon_back.Drawable
			'			back_btn.tag="list1"
			'			matn.LoadHtml(css_start & text_str & css_end )
			'			'			insertDB(title_str,text_str)
			'		End If
		

		
	
	
	
	
	
	
	
	
			subtitle_lbl.Text=cu1.GetString("title")
			
			matn.LoadHtml(css_start &  cu1.GetString("value") & css_end )' "<h1>" & cu1.GetString("title") &  "</h1>" &
			
			
			matn.SetVisibleAnimated(110,True)
			list_not.SetVisibleAnimated(110,False)
	
			back_btn.SetBackgroundImage(icon_list.toBitmap)
			back_btn.tag="web1"
			
	
		Next

	

				
	Else



		cu1 = sql1.ExecQuery("SELECT * FROM notification ORDER BY id DESC")' WHERE type = 'text' OR type='html'
	
		Log(cu1.RowCount)
		
		
		back_btn.tag="list1"
			
		For i = 0 To cu1.RowCount-1
			
			cu1.Position = i
			
			title_limit = cu1.GetString("title")
			If cu1.GetString("title").Length > 28 Then
				title_limit=cu1.GetString("title").SubString2(0,28)
			End If
			
			list_not.AddSingleLine2(title_limit,cu1.GetString("id"))
		Next

		matn.SetVisibleAnimated(110,False)
		list_not.SetVisibleAnimated(110,True)
		
		

	End If
	

End Sub


Sub list_not_ItemClick (Position As Int, Value As Object)
	
	matn.SetVisibleAnimated(110,True)
	list_not.SetVisibleAnimated(110,False)
	
	cu1 = sql1.ExecQuery("SELECT * FROM notification WHERE id ="&Value)
	cu1.Position=0
	
	matn.LoadHtml(css_start & "<h1>" & cu1.GetString("title") &  "</h1>" &  cu1.GetString("value") & css_end )
	
	
	back_btn.SetBackgroundImage(icon_list.toBitmap)
	back_btn.tag="web1"

	Log("list_not_ItemClick - tag: " & back_btn.tag)

			
	type_str = cu1.GetString("type")
	
	
			
	
	
		
	If type_str == "telegram" Then
		Activity.Finish
		open_telegram(cu1.GetString("value"))
	End If
		
	If type_str == "url" Then
		Activity.Finish
		StartActivity(web.OpenBrowser(cu1.GetString("value")))
	End If
		
	If type_str == "activity" Then
		Activity.Finish
		StartActivity(cu1.GetString("value"))
	End If
	
End Sub


Sub list_not_ItemLongClick (Position As Int, Value As Object)
	
	cu1 = sql1.ExecQuery("SELECT * FROM notification WHERE id ="&Value)
	cu1.Position=0
	
   share.Initialize(share.ACTION_SEND,"")
   share.SetType("text/plain")
   share.PutExtra("android.intent.extra.TEXT", cu1.GetString("title") & CRLF & cu1.GetString("value") & CRLF & CRLF & Application.LabelName & CRLF & "https://cafebazaar.ir/app/"&Application.PackageName )
   share.WrapAsIntentChooser("ارسال این مطلب")
   StartActivity(share)
   		
End Sub


Sub matn_OverrideUrl (Url As String) As Boolean
	ProgressDialogShow2("چند لحظه صبر کنید",True)
	StartActivity(web.OpenBrowser(Url))
	Return True
End Sub


Sub matn_PageFinished (Url As String)
	ProgressDialogHide
End Sub



Sub Activity_Pause (UserClosed As Boolean)
	cu1.Close
End Sub





Sub Activity_KeyPress (KeyCode As Int) As Boolean
	

	If KeyCode = KeyCodes.KEYCODE_BACK Then
			bb_Click
		Return True
	Else
		Return False
	End If


End Sub


Sub bb_Click
	Log("BB Click")
	Log("back_btn.tag : " & back_btn.tag)
	
	If back_btn.tag = "web1" Then
	
		matn.SetVisibleAnimated(110,False)
		list_not.SetVisibleAnimated(110,True)
		
		back_btn.SetBackgroundImage(icon_back.toBitmap)
		back_btn.tag="list1"
'		Activity.Finish
'		StartActivity(Me)
	Else If back_btn.tag = "list1" Then
		Activity.Finish
	End If
	
End Sub

Sub bb_LongClick
	Activity.Finish
End Sub


Sub open_telegram(tid As String)
	Log("Open Telegram")
	Try
	    share.Initialize(share.ACTION_EDIT,"tg://"&tid)
	    StartActivity(share)
	Catch
		StartActivity(web.OpenBrowser("https://telegram.me/"&tid))
	End Try
End Sub
