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
	Dim timer1 As Timer
	Dim pageTitle,VidUrl As String
End Sub

Sub Globals
	Dim VP As VideoPlayer
	Dim vv As VideoView
	Dim x As XmlLayoutBuilder
	Private ActivityParent As JavaObject
	
	Dim X1 As XmlLayoutBuilder
	Private ScrollView1 As ScrollView
	Private ActionBar As ACToolBarDark
End Sub

Sub Activity_Create(FirstTime As Boolean)
	
	SaeloZahra.P.SetScreenOrientation(-1)
	
	Activity.LoadLayout("svNewlayout")
	SaeloZahra.SetStatusBarColor(SaeloZahra.newcolorDark)
	ScrollView1.Visible=False
	ActionBar.Title = SaeloZahra.CSB("پخش فیلم")
	ActionBar.TitleTextColor=Colors.White
	ActionBar.subTitle = SaeloZahra.CSB(pageTitle)
	ActionBar.subTitleTextColor=Colors.White
	ActionBar.Color=SaeloZahra.NewColor
	
	
	ActionBar.Menu.Add(1,1,"تمام صفحه",Null)
	
	
	
	ActionBar.NavigationIconDrawable = X1.GetDrawable("baseline_arrow_back_white_24")
	
	
	
	
	
	
	
	
	
	
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
	
	
	
	vv.LoadVideo("http",VidUrl)
	vv.Play
				
	If SaeloZahra.P.SdkVersion < 20 Then
		StartActivity(VP.PlayAnyPlayer(VidUrl))
	End If
	
				
End Sub

Sub ActionBar_MenuItemClick (Item As ACMenuItem)
	StartActivity(fullscreen_video_act)
End Sub

Sub Activity_Resume
	
'	Activity.SetBackgroundImage(LoadBitmap(File.DirAssets,"login.jpg"))
'	
'	Log("ما در صفحه : "&cheSafheyi&"  هستیم.")
'	ProgressDialogShow(SaeloZahra.csb("لطفا کمی صبر کنید"))
'	Select cheSafheyi
'		Case "video"
'			
'	End Select
'
	ToastMessageShow(SaeloZahra.CSB("برای نمایش فیلم در اندازه بزرگ"&CRLF&"لطفا صفحه نمایش را بچرخانید"),True)
	
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
		Activity.Color=Colors.DarkGray
		ActionBar.Visible = False
		SaeloZahra.SetStatusBarColor(Colors.DarkGray)
	Else ' پاشده
		Activity.Color=Colors.White
		ActionBar.Visible = True
		SaeloZahra.SetStatusBarColor(SaeloZahra.NewcolorDark)
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

