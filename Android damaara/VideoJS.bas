B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=3.8
@EndOfDesignText@
'Class module
Sub Class_Globals
	Dim WebView1 As WebView
	Dim WVE As WebViewExtras
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(Act As Activity,VideoUrl As String,PosterUrl As String)
	Act.LoadLayout("WebViewLayout")
	WebView1.LoadHtml(HTMLStr(VideoUrl,PosterUrl))
	WebView1.ZoomEnabled=False
	WebView1.Color=Colors.Transparent
	WVE.addWebChromeClient(WebView1,"wve")
End Sub

Sub HTMLStr(VideoUrl As String,PosterUrl As String) As String

	Dim HTML As StringBuilder
	HTML.Initialize
	HTML.Append("<!DOCTYPE html>" & CRLF)
	HTML.Append("<html style='margin:auto;padding:0;'>" & CRLF)
	HTML.Append("<head>" & CRLF)
	HTML.Append("<title>ویدیو پلیر</title>" & CRLF)
	HTML.Append("<!-- Chang URLs to wherever Video.js files will be hosted -->" & CRLF)
	HTML.Append("<link href='https://cdnjs.cloudflare.com/ajax/libs/video.js/7.3.0/alt/video-js-cdn.min.css' rel='stylesheet' type='text/css'>" & CRLF)
	HTML.Append("<!-- video.js must be in the <head> for older IEs to work. -->" & CRLF)
	HTML.Append("<script src='https://cdnjs.cloudflare.com/ajax/libs/video.js/7.3.0/video.min.js'></script>" & CRLF)
	HTML.Append("</head>" & CRLF)
	HTML.Append("<body style='margin:auto;padding:0;'>" & CRLF)
	HTML.Append("<video id='example_video_1' class='video-js vjs-default-skin' controls preload='none' width='" & (WebView1.width / Density) & "' height='" & (WebView1.Height / Density) & "'" & CRLF)
	HTML.Append("poster='"&PosterUrl&"'" & CRLF)
	HTML.Append("poster='poster.png'" & CRLF)
	HTML.Append("data-setup='{}'>" & CRLF)
	
	'Download Demo file
	HTML.Append("<source src='"&VideoUrl&"' type='video/mp4' />" & CRLF)
	HTML.Append("<source src='"&VideoUrl&"' type='video/webm' />" & CRLF)
	HTML.Append("<source src='"&VideoUrl&"' type='video/ogg' />" & CRLF)

	'Load a local file
	'HTML.Append("<source src='" & WebViewAssetFile("myfile.mp4") & "' type='video/mp4' />" & CRLF)
	
'	HTML.Append("<track kind='captions' src='demo.captions.vtt' srclang='en' label='English'></track><!-- Tracks need an ending tag thanks to IE9 -->" & CRLF)
'	HTML.Append("<track kind='subtitles' src='demo.captions.vtt' srclang='en' label='English'></track><!-- Tracks need an ending tag thanks to IE9 -->" & CRLF)
	HTML.Append("<p class='vjs-no-js'>برای پخش این فیلم جاوااسکریپت را فعال کنید یا مرورگر خود را به روز کنید <a href='http://videojs.com/html5-video-support/'" & CRLF)
	HTML.Append("target='_blank'>پشتیبانی از فیلم های HTML5</a></p>" & CRLF)
	HTML.Append("</video>" & CRLF)
	HTML.Append("</body>" & CRLF)
	HTML.Append("</html>" & CRLF)
	Return HTML.ToString
End Sub

'Erel's code to select the correct asset directory from here: http://www.basic4ppc.com/android/forum/threads/images-loaded-in-webviews-are-not-displayed-in-mode-%E2%80%9Cdebug-rapid-%E2%80%9D-b4a-3-50-version.38981/#post-230988
Sub WebViewAssetFile (FileName As String) As String
	Dim jo As JavaObject
	jo.InitializeStatic("anywheresoftware.b4a.objects.streams.File")
	If jo.GetField("virtualAssetsFolder") = Null Then
		Return "file:///android_asset/" & FileName.ToLowerCase
	Else
		Return "file://" & File.Combine(jo.GetField("virtualAssetsFolder"), _
		jo.RunMethod("getUnpackedVirtualAssetFile", Array As Object(FileName)))
	End If
End Sub
