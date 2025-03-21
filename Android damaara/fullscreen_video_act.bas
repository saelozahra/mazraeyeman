B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=8.5
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: True
	#IncludeTitle: False
#End Region


Sub Process_Globals
	Dim timer1 As Timer
	Dim videoUrlStr As String
End Sub

Sub Globals
	Dim vv As VideoView
	Dim x As XmlLayoutBuilder
	Private ActivityParent As JavaObject

End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.Color=Colors.Black
	SaeloZahra.P.SetScreenOrientation(0)
	'Do not forget to load the layout file created with the visual designer. For example:
	'Activity.LoadLayout("Layout1")
	
	'* Code needed for the sub AfterChange. See comments in said sub.
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
	Activity.Color = Colors.Black

	vv.LoadVideo("http",videoUrlStr)
	vv.Play
	vv.MediaControllerEnabled=True
'	Main.amaroid.TrackView("FullScreeen  - قدیم")
   

End Sub


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
	
	Log("inside configsub")
	timer1.Enabled = True
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





'Sub Process_Globals
'	
'	Dim videoUrlStr,PosterUrlStr As String
'
'End Sub
'
'Sub Globals
'	Dim WV As WebView
'End Sub
'
'Sub Activity_Create(FirstTime As Boolean)
'	
'	SaeloZahra.P.SetScreenOrientation(0)
'	
'	WV.Initialize("wv")
'	WV.ZoomEnabled=False
'	WV.Color=Colors.Transparent
'	WV.LoadHtml(HTMLStr(videoUrlStr,PosterUrlStr))
'	
'	Activity.AddView(WV,0,0,100%x,100%y)
'	
'End Sub
'
'Sub Activity_Resume
'	
'End Sub
'
'Sub Activity_Pause (UserClosed As Boolean)
'
'End Sub
'
'
'
'
'
'Sub back_Click
'	Actionbar_NavigationItemClick
'End Sub
'
'Sub Actionbar_NavigationItemClick
'	Activity.Finish
'	SaeloZahra.SetAnimation("zoom_enter","zoom_exit")
'End Sub
'
'Sub Activity_KeyPress (KeyCode As Int) As Boolean 'Return True to consume the event
'	If KeyCode==KeyCodes.KEYCODE_BACK Then
'		Actionbar_NavigationItemClick
'		Return False
'	Else
'		Return True
'	End If
'End Sub
'
'
'
'
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
'	HTML.Append("<video id='example_video_1' class='video-js vjs-default-skin vjs-big-play-centered' controls autoplay preload='auto' width='" & (WV.Width / Density) & "' height='133'" & CRLF)
'	HTML.Append("poster='"&PosterUrl&"'" & CRLF)
'	HTML.Append("poster='poster.png'" & CRLF)
'	HTML.Append("data-setup='{""fluid"": true,""autoplay"": true,""aspectRatio"":""16:9""}'>" & CRLF)
''	(WV.Height / Density)
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
'	HTML.Append("<style>.vjs-fullscreen-control.vjs-control {display: none;} .vjs-volume-control.vjs-control {margin-right: 22px;}</style>" & CRLF)
'	HTML.Append("</body>" & CRLF)
'	HTML.Append("</html>" & CRLF)
'	Return HTML.ToString
'End Sub
'
