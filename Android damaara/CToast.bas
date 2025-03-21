Group=Class Module
ModulesStructureVersion=1
Type=Class
Version=2.00
@EndOfDesignText@
'Class Module: CToast
'Author: Margret
'Code Version: 1.0
'Last Mod: June 20th, 2012
'B4A Version 2.0
#IgnoreWarnings:9,6

Private Sub Class_Globals
	Private TMS2 As Reflector
	Private TMS2pan As Panel
	Private TMS2lab As Label
	Private TMS2text As Label
	Private TTime As Timer
	Private ActH As Int
	Private ActW As Int
'	Private MyEventName As String
	Private MyModule As Object
	Private Tac As Boolean
End Sub
'Initializes the CToast object
' Activity - Pass reference to the Activity: Pass Activity
' Module - The calling Module Name: Pass Me
' Act_H - Is the Activity Height: Pass Activity.Height
' Act_W - Is the Activity Width: Pass Activity.Width
Sub Initialize(Activity As Activity, Module As Object, Act_H As Int, Act_W As Int)
	Tac = True 
	ActH = Act_H
	ActW = Act_W
	MyModule = Module
	TMS2lab.Initialize("TMS2lab")
	TMS2pan.Initialize("TMS2pan")
	Activity.AddView(TMS2pan, 100dip, 50dip, 200dip, 50dip)
	TMS2pan.AddView(TMS2lab, 100, 50, 200, 40)
	TMS2pan.Visible = False
	TMS2text.Initialize("TMS2text")
	Activity.AddView(TMS2text,0,0,100dip,60dip)
End Sub
'Tmessage = The text you want to show in the toast message
'Tseconds = The number of seconds you want the toast to show
'TpercentDownVertical = Vertical center of message on screen. Example: 20 is 20 percent down
'TpercentAcrossHorizontal = Horizontal center of message on screen. Example: 50 is 50 percent across
'Timage = Image you want to use as the background of toast message. Must be in the assets folder
'Tcolor = Color of the text words
'Tbackcolor = Background color of toast message if no image is used
'Ttextsize = the size you want the toast message text to be
'Tautoclose = True to close after Tseconds, False stays on screen until you Tap message
Sub ToastMessageShow2(Tmessage As String, Tseconds As Int, TpercentDownVertical As Int, TpercentAcrossHorizontal As Int, Timage As String, Tcolor As Long, Tbackcolor As Long, Ttextsize As Int, Tautoclose As Boolean)
	TMS2text.Visible = True                                   
	TMS2text.TextColor = Colors.Transparent
'	Dim tmfl As Int : tmfl = Tseconds
	Dim Height, Width As Int
	TMS2text.Text = Tmessage
	TMS2text.TextSize = Ttextsize
	TMS2text.Width = -2
	TMS2text.Height = -2
	Sleep(0)    
	TMS2.Target = TMS2text
	Width = TMS2.RunMethod("getWidth")
	Height = TMS2.RunMethod("getHeight")
	TMS2text.Visible = False
	TMS2lab.TextColor = Colors.DarkGray 
	TMS2lab.TextSize = Ttextsize		
	TMS2lab.Gravity = Gravity.CENTER
	Dim cd As ColorDrawable
	cd.Initialize(Tbackcolor,10dip)
	TMS2pan.Background = cd
	If Timage <> "" Then
		If File.Exists(File.DirAssets, Timage) Then
			TMS2pan.SetBackgroundImage(LoadBitmap(File.DirAssets, Timage))
		End If	
	End If
	TMS2lab.Text = Tmessage
	TMS2pan.BringToFront
'	Dim abc As Int
	If TpercentDownVertical > 0 And TpercentDownVertical < 91 Then
		TMS2pan.Top = (ActH * (TpercentDownVertical/100))
	Else
		TMS2pan.Top = (ActH * .10)
	End If
	If TpercentAcrossHorizontal > 0 And TpercentAcrossHorizontal < 91 Then
		TMS2pan.Left = (ActW * (TpercentAcrossHorizontal/100)) - ((Width+60)/2)
	Else
		TMS2pan.Left = (ActW/2) - ((Width+60)/2)	
	End If
	TMS2lab.Left = 30
	TMS2lab.Top = 5
	TMS2pan.Width = Width + 60
	TMS2lab.Width = Width
	TMS2pan.Height = Height + (TMS2text.TextSize / 2)
	TMS2lab.Height = Height
	Sleep(0)
	If Tcolor <> 0 Then
		TMS2lab.TextColor = Tcolor
	End If
	TMS2lab.Visible = True
	TMS2pan.Visible = True
	TMS2pan.SetVisibleAnimated(500,True)
	
	Sleep(0)
	If Tautoclose = False Then
		Tac = False
	Else
		SetToast(Tseconds)
	End If
End Sub
Private Sub SetToast(Tset As Int)
	TTime.Enabled = False
	TTime.Initialize("TTime", (Tset * 1000))
	TTime.Enabled = True
End Sub
Private Sub TTime_Tick
	TTime.Enabled = False
	TMS2pan.SetVisibleAnimated(500,False)
End Sub
Private Sub TMS2lab_Click
	If Tac = False Then
		Tac = True : TTime_Tick
	End If	
End Sub
'Closes the Toast Message right away
'Sub CloseNow
'	TTime_Tick
'End Sub
