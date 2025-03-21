B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=9.5
@EndOfDesignText@
#Extends: android.support.v7.app.AppCompatActivity

#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True
#End Region

Sub Process_Globals
		
	Dim post_id As String
	Dim caption_str As String
	Dim content_str As String
	Dim video_str As String
	Dim Stared As Boolean = False
End Sub

Sub Globals
	
	Dim Config 	As Amir_SliderConfig
	Dim Show 	As Amir_SliderShow
	
	Dim CSS As String
	Dim customBrowser As JK_CustomTabsBrowser
	Dim ActionBar As ACToolBarLight
	Dim WebView1 As WebView
	Dim likeJob As HttpJob
	Dim ds As DSSnackbar
	Dim X1 As XmlLayoutBuilder
	Dim FullContentLink As String = SaeloZahra.site_url&"/?p="&post_id
End Sub

Sub Activity_Create(FirstTime As Boolean)
	
	
	Activity.LoadLayout("WVNewLayout")
	
	ActionBar.SetLayout(0,0,100%x,SaeloZahra.MaterialActionBarHeight)
	WebView1.SetLayout(0,SaeloZahra.MaterialActionBarHeight,100%x,100%y-SaeloZahra.MaterialActionBarHeight)
	SaeloZahra.SetStatusBarColor(SaeloZahra.ColorDark)
	ActionBar.Color = SaeloZahra.Color
	
	
	ActionBar.NavigationIconDrawable = X1.GetDrawable("baseline_arrow_back_white_24")
	
	
	ActionBar.Title = SaeloZahra.csb("نمایش مطلب")
'	Main.amaroid.TrackView(ActionBar.title&"  - جدید")
	
	
	CSS = " <html><head><style>@import url(https://cdn.jsdelivr.net/gh/rastikerdar/samim-font@v4.0.5/dist/font-face.css); *{ line-height:2;direction:rtl; font-family:'Samim'; max-width:100%; } h1,h2,h3,h4,h5,h6,h7{ font-weight: bold; } img,video{max-width:100%;height:auto;} video{float:right;} iframe{border:0;} .title{colot:#212121;} a{text-decoration:none;color:#590606} body{ box-sizing:border-box; padding:0 5px 18px 5px; } </style>"
	WebView1.LoadHtml(CSS& "</head><body><h3 class='title'><a href='"&FullContentLink&"'>" & caption_str & "</a></h3>" & content_str & "</body></html>")
	
	ActionBar.InitMenuListener
'	ActionBar.Menu.Add2(1,1,"پسندیدم",X1.GetDrawable("baseline_fullscreen_white_24")).ShowAsAction=2
	If video_str.Length>20 Then ActionBar.Menu.Add2(2,2,"پخش فیلم",X1.GetDrawable("baseline_fullscreen_white_24")).ShowAsAction=2
	
	If Stared Then
		ActionBar.Menu.Add2(3,3,"مورد علاقه",X1.GetDrawable("baseline_star_white_24")).ShowAsAction=2
	Else
		ActionBar.Menu.Add2(3,3,"مورد علاقه",X1.GetDrawable("baseline_star_border_white_24")).ShowAsAction=2
	End If
	
	likeJob.Initialize("likeJob",Me)
	
	customBrowser.Initialize
	customBrowser.ToolbarColor = SaeloZahra.Color
	'customBrowser.addDefaultShareMenuItem ' Baray faeal kardan dokme Eshterak gozari link
	customBrowser.ShowTitle = True
	'customBrowser.enableUrlBarHiding ' Baray Makhfi kardan URL bar hengam Scroll
	customBrowser.Build
		
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


Sub ActionBar_MenuItemClick (Item As ACMenuItem)
	Select Item.Id
		Case 1
		Case 2
			fullscreen_video_act.videoUrlStr = video_str
			StartActivity(fullscreen_video_act)
		Case 3
			Log(			 SaeloZahra.json_url&"post.php?type=html&like=true&id="&post_id)
			likeJob.Download(SaeloZahra.json_url&"post.php?type=html&like=true&id="&post_id)
			If Stared Then
				Stared = False
				ActionBar.Menu.FindItem(3).Icon=X1.GetDrawable("baseline_star_border_white_24")
				'TODO
'				Main.sql1.ExecNonQuery("UPDATE content set star = 0 WHERE id = " & library.selectedContent )
			Else
				Stared = True
				ActionBar.Menu.FindItem(3).Icon=X1.GetDrawable("baseline_star_white_24")
'				Main.sql1.ExecNonQuery("UPDATE content set star = 1 WHERE id = " & library.selectedContent )
			End If
	End Select
'	likeJob.Download(SaeloZahra.like_url&post_id)
End Sub


Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub Actionbar_NavigationItemClick
	Activity.Finish
End Sub


Sub JobDone (job As HttpJob)
	
	If job.Success Then
	
		Dim csb1 As CSBuilder
		csb1.Initialize
		csb1.Alignment("ALIGN_OPPOSITE").Typeface(Typeface.FONTAWESOME).Append(Chr(0xF21E)).Pop.Append("پسندیدید").PopAll
		ds.Initialize("ds",Activity,csb1,ds.DURATION_LONG)
		ds.Show
		WebView1.LoadHtml(CSS& "</head><body>" & job.GetString & "</body></html>")
	Else
		Actionbar_NavigationItemClick
	End If
				
	ProgressDialogHide
	
End Sub

Sub WebView1_PageFinished (Url As String)
	
End Sub

Sub WebView1_OverrideUrl (Url As String) As Boolean
	
	customBrowser.CreateNewTab(Url)

	Return True
	
End Sub