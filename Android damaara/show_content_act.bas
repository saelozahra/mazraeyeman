B4A=true
Group=OLD
ModulesStructureVersion=1
Type=Activity
Version=8.5
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals
	Dim timer1 As Timer
	Dim cheSafheyi,pageTitle,pageID As String
End Sub

Sub Globals
	Dim VP As VideoPlayer
	Dim vv As VideoView
	Dim x As XmlLayoutBuilder
	Private ActivityParent As JavaObject
	

	Private header_lbl As Label
	Private subtitle_lbl As Label
	Private ScrollView1 As ScrollView
	Private back As Button
	Dim JobJson As HttpJob
	Dim WV As WebView
End Sub

Sub Activity_Create(FirstTime As Boolean)
	
	SaeloZahra.P.SetScreenOrientation(-1)
	
	Activity.LoadLayout("sv_layout")
	SaeloZahra.SetStatusBarColor(SaeloZahra.colorDark)
	ScrollView1.Visible=False
	header_lbl.Typeface=SaeloZahra.fontBold
	subtitle_lbl.Typeface=SaeloZahra.font
	
	WV.Initialize("wv")
	WV.ZoomEnabled=False
	WV.Color=Colors.Transparent
	WV.LoadHtml(pageTitle)
	Activity.AddView(WV,ScrollView1.Left,ScrollView1.Top,ScrollView1.Width,ScrollView1.Height)
	
	JobJson.Initialize("JobJson",Me)
	Activity.AddMenuItem("تمام صفحه","fs")
	
	
	
	Main.amaroid.TrackView(header_lbl.Text&"  - قدیم")
	
	
	
	
	
	
	
	
	
	
	Dim jo As JavaObject = Activity
	jo.RunMethodJO("getContext", Null).RunMethodJO("getWindow", Null)
	ActivityParent = jo.RunMethodJO("getParent", Null)
	
	timer1.Initialize("Timer1",100)
	
	'***********************************************************************************************
	'Load the layout using XmlLayoutBuilder. You may need to download the library from the forum.
	'I am providing an xml-layout based on FrameLayout. It must be placed in the layout-folder
	'under Objects/res/. This layout ensures that the video will resize after an orientation change.
	'If you have difficulties in understanding how the XmlLayoutBulder works, please then read the
	'thread from where you downloaded it.
	'***********************************************************************************************
	x.LoadXmlLayout(Activity, "frame")
	vv.Initialize("vv")
	vv = x.GetView("surface")
	vv.MediaControllerEnabled=True
	
	
	
End Sub

Sub fs_click
	StartActivity(fullscreen_video_act)
End Sub

Sub Activity_Resume
	
	Activity.SetBackgroundImage(LoadBitmap(File.DirAssets,"login.jpg"))
	
	Log("ما در صفحه : "&cheSafheyi&"  هستیم.")
	ProgressDialogShow(SaeloZahra.csb("لطفا کمی صبر کنید"))
	Select cheSafheyi
		Case "video"
			header_lbl.Text="پخش فیلم"
			subtitle_lbl.Text=pageTitle
			LogColor("http://agrocontrol.damaara.com/api/postdata/webservice/?kind=videodetail&videoid="&pageID,Colors.Yellow)
			JobJson.Download("http://agrocontrol.damaara.com/api/postdata/webservice/?kind=videodetail&videoid="&pageID)
	End Select

	ToastMessageShow(SaeloZahra.CSB("برای نمایش فیلم در اندازه بزرگ"&CRLF&"لطفا صفحه نمایش را بچرخانید"),True)
	
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





Sub JobDone(Job As HttpJob)
	
	ProgressDialogHide
	
	Log(Job.Success&"  "&cheSafheyi)
	
	If Job.Success Then
		Select cheSafheyi
			Case "video"
				
				Dim parser As JSONParser
				parser.Initialize(Job.GetString)
				Dim root As Map = parser.NextObject
				Dim videodetails As Map = root.Get("videodetails")
'				Dim Title As String = videodetails.Get("Title")
'				Dim Description As String = videodetails.Get("Description")
				Dim VideoFile As String = videodetails.Get("VideoFile")
'				Dim Pic As String = videodetails.Get("Pic")
				
'				WV.LoadHtml("<style>@import 'http://mincdn.ir/font/IranSans/v5/fontiran.css';*,body,html{font-family:'IRANSans';margin:auto;text-align:right;}.div{direction:rtl; width:100%;float:left;height:100%;font-size:14px;line-height: 14px;}</style><div class='div'><br><br><br><h2>"&Title&"</h2><br><br><h4>"&Description&"</h4><br><video width='320' height='240' poster='"&Pic&"' controls style='width:100%;'><source src='"&VideoFile&"' type='video/mp4'>این دستگاه قابلیت پخش این فیلم را ندارد / پلیر خود را بروز کنید</video></div>")
'				WV.LoadHtml("<style>@import 'http://mincdn.ir/font/IranSans/v5/fontiran.css';*,body,html{font-family:'IRANSans';margin:auto;text-align:right;}.div{direction:rtl; width:100%;float:left;height:100%;font-size:14px;line-height: 14px;}</style><div class='div'><br><br><br><h2>"&Title&"</h2><br><br><h4>"&Description&"</h4><br>"&HTMLStr(VideoFile,Pic)&"</div>")
				
'				fullscreen_video_act.PosterUrlStr = Pic
				fullscreen_video_act.videoUrlStr = VideoFile
				
				WV.Visible=False
				

				vv.LoadVideo("http",VideoFile)
				vv.Play
				
				If SaeloZahra.P.SdkVersion < 20 Then
					StartActivity(VP.PlayAnyPlayer(VideoFile))
				End If
				
			Case "videocategory"
		End Select
	Else
		
		If Job.ErrorMessage.Contains("Unable to resolve host") Then
			ToastMessageShow(SaeloZahra.CSB(" اینترنتتون وصل نیست "),True)
		Else
			ToastMessageShow(SaeloZahra.CSB(" خطا ")&CRLF&Job.ErrorMessage,True)
		End If
	End If
End Sub



'Sub HTMLStr(VideoUrl As String,PosterUrl As String) As String
'
'	Dim HTML As StringBuilder
'	HTML.Initialize
'	HTML.Append("<!DOCTYPE html>" & CRLF)
'	HTML.Append("<html style='margin:auto;padding:0;'>" & CRLF)
'	HTML.Append("<head>" & CRLF)
'	HTML.Append("<title>ویدیو پلیر</title>" & CRLF)
'	HTML.Append("<!-- Chang URLs to wherever Video.js files will be hosted -->" & CRLF)
'	HTML.Append("<link href='https://cdnjs.cloudflare.com/ajax/libs/video.js/7.3.0/alt/video-js-cdn.min.css' rel='stylesheet' type='text/css'>" & CRLF)
'	HTML.Append("<!-- video.js must be in the <head> for older IEs to work. -->" & CRLF)
'	HTML.Append("<script src='https://cdnjs.cloudflare.com/ajax/libs/video.js/7.3.0/video.min.js'></script>" & CRLF)
'	HTML.Append("<script src='https://cdnjs.cloudflare.com/ajax/libs/video.js/7.3.0/lang/fa.js'></script>" & CRLF)
'	HTML.Append("</head>" & CRLF)
'	HTML.Append("<body style='margin:auto;padding:0;'>" & CRLF)
'	HTML.Append("<video id='example_video_1' class='video-js vjs-default-skin' controls preload='none' width='" & (WV.width / Density) & "' height='" & (WV.width / Density) & "'" & CRLF)
'	HTML.Append("poster='"&PosterUrl&"'" & CRLF)
'	HTML.Append("poster='poster.png'" & CRLF)
'	HTML.Append("data-setup='{}'>" & CRLF)
'	
'	'Download Demo file
'	HTML.Append("<source src='"&VideoUrl&"' type='video/mp4' />" & CRLF)
'	HTML.Append("<source src='"&VideoUrl&"' type='video/webm' />" & CRLF)
'	HTML.Append("<source src='"&VideoUrl&"' type='video/ogg' />" & CRLF)
'
'	'Load a local file
'	'HTML.Append("<source src='" & WebViewAssetFile("myfile.mp4") & "' type='video/mp4' />" & CRLF)
'	
''	HTML.Append("<track kind='captions' src='demo.captions.vtt' srclang='en' label='English'></track><!-- Tracks need an ending tag thanks to IE9 -->" & CRLF)
''	HTML.Append("<track kind='subtitles' src='demo.captions.vtt' srclang='en' label='English'></track><!-- Tracks need an ending tag thanks to IE9 -->" & CRLF)
'	HTML.Append("<p class='vjs-no-js'>برای پخش این فیلم جاوااسکریپت را فعال کنید یا مرورگر خود را به روز کنید <a href='http://videojs.com/html5-video-support/'" & CRLF)
'	HTML.Append("target='_blank'>پشتیبانی از فیلم های HTML5</a></p>" & CRLF)
'	HTML.Append("</video>" & CRLF)
'	HTML.Append("</body>" & CRLF)
'	HTML.Append("<style>.video-js,.video-js .vjs-tech {background-color: white;} .vjs-poster {background-color: #fff;}   .video-js .vjs-control-bar, .video-js .vjs-big-play-button, .video-js .vjs-menu-button .vjs-menu-content {background-color: green;Opacity: 1.0 = 100%, 0.0 = 0%;background-color: rgba(0, 128, 0, 0.7);} </style>" & CRLF)
'	HTML.Append("</html>" & CRLF)
'	Return HTML.ToString
'End Sub
























Sub vv_Complete
	Log("Playing completed")
End Sub

Sub timer1_Tick
	
	If vv.IsPlaying Then
		CallSubDelayed(Me, "AfterChange")
	End If

End Sub

Sub Activity_ConfigChanged()
	
	'****************************************************************************************
	'This code together with the java-snippet in this project detects a configuration-change
	'Here I use the timer to call the sub AfterChange
	'My testing showed that a delay of 100ms is sufficient to let the sub AfterChange
	'be in a position to obtain the new activity values. It resulted also in a smooth
	'orientation-change of the playing video.
	'****************************************************************************************
	
	Log("inside configsub    width"&GetDeviceLayoutValues.Width&"     Height"&GetDeviceLayoutValues.Height)
	timer1.Enabled = True
	
	
	If GetDeviceLayoutValues.Width>GetDeviceLayoutValues.Height Then ' خوابیده
		Activity.Color=Colors.Black
		back.Visible = False
		SaeloZahra.SetStatusBarColor(Colors.Black)
	Else ' پاشده
		Activity.SetBackgroundImage(LoadBitmap(File.DirAssets,"login.jpg"))
		back.Visible = True
		SaeloZahra.SetStatusBarColor(SaeloZahra.colorDark)
	End If
	
End Sub

Sub AfterChange
	
	'******************************************************************************************************
	'After a configuration-change, bypassing onCreate, it is difficult to get the new values
	'of Activity Height and Activity Width. This code posted by Erel helps us to obtain the new values.
	'******************************************************************************************************
   	
	Dim ajo As Panel = Activity
	Dim width As Int = ActivityParent.RunMethod("getMeasuredWidth", Null)
	Dim height As Int = ActivityParent.RunMethod("getMeasuredHeight", Null)
	If width = 0 Or height = 0 Then Return
	ajo.Width = width 'update the "activity" width and height
	ajo.Height = height
	Activity.Invalidate
	vv.Width = width
	vv.Height = height
	'Log("AW=" & Activity.Width & " and AH=" & Activity.Height)
	vv.Invalidate
	timer1.Enabled = False
   
End Sub

#if JAVA

//This java-code will detect a configuration-change. We use it to trigger our event
//Activity_ConfigChanged in our B4A-code.
//Many thanks to JordiCP in the B4A-forum for this java-snippet!!

import android.content.res.Configuration;
import anywheresoftware.b4a.keywords.Common;
import android.view.WindowManager;
import android.content.Context;

@Override
public void onConfigurationChanged(Configuration newConfig) {

    super.onConfigurationChanged(newConfig);
    processBA.raiseEvent(null, "activity_configchanged"); // trigger event in B4A-code                                                       
}

#end if

