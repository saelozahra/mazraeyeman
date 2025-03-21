B4A=true
Group=Class Module
ModulesStructureVersion=1
Type=Class
Version=7.3
@EndOfDesignText@
'version: 1.02
Sub Class_Globals
	Dim timeOut As Int
	Dim t1 As Timer
	Private sv As ScrollView
	Private items As List
	Private panels As List
	Private dividerHeight As Float
	Private pressedDrawable As Object
	Private EventName As String
	Private CallBack As Object
	Private su As StringUtils
	Public DefaultTextSize As Int
	Public DefaultTextColor As Int
	Public DefaultTextBackgroundColor As Int
'	Private mLastScrollY As Int = 0
End Sub


Public Sub Initialize (vCallback As Object, vEventName As String)
	sv.Initialize2(0, "sv")
	items.Initialize
	panels.Initialize
	dividerHeight = 0dip
	EventName = vEventName
	CallBack = vCallback
	sv.Color = Colors.Transparent '0xFFD9D7DE 'this sets the dividers color
	Dim r As Reflector
	Dim idPressed As Int
   	idPressed = r.GetStaticField("android.R$drawable", "list_selector_background")
    r.Target = r.GetContext
    r.Target = r.RunMethod("getResources")
	pressedDrawable = r.RunMethod2("getDrawable", idPressed, "java.lang.int")
	DefaultTextColor = Colors.White
	DefaultTextSize = 16
	DefaultTextBackgroundColor = SaeloZahra.ColorDark
	t1.Initialize("t1",1000)
	t1.Enabled=True
End Sub

'Clears all items.
Public Sub Clear
	items.Clear
	panels.Clear
	sv.Panel.Height = 0
	For i = sv.Panel.NumberOfViews - 1 To 0 Step -1
		sv.Panel.RemoveViewAt(i)
	Next
End Sub

'Returns a view object that holds the list.
Public Sub AsView As View
	Return sv
End Sub


Public Sub scroll As ScrollView
	Return sv
End Sub



'Returns the number of items.
Public Sub GetSize As Int
	Return items.Size
End Sub

'Returns the Panel stored at the specified index.
Public Sub GetPanel(Index As Int) As Panel
	Dim p As Panel
	p = panels.Get(Index) 'this is the parent panel
	Return p.GetView(0)
End Sub

'Returns the value stored at the specified index.
Public Sub GetValue(Index As Int) As Object
	Return items.Get(Index)
End Sub

'Removes the item at the specified index.
Public Sub RemoveAt(Index As Int)
	Dim removePanel, p As Panel
	removePanel = panels.Get(Index)
	For i = Index + 1 To items.Size - 1
		p = panels.Get(i)
		p.Tag = i - 1
		p.Top = p.Top - removePanel.Height - dividerHeight
	Next
	sv.Panel.Height = sv.Panel.Height - removePanel.Height - dividerHeight
	items.RemoveAt(Index)
	panels.RemoveAt(Index)
	removePanel.RemoveView
End Sub

'Adds a text item. The item height will be adjusted based on the text.
Public Sub AddTextItem(Text As String, Value As Object)
	InsertAtTextItem(items.Size, Text, Value)
End Sub

'Inserts a text item at the specified index.
Public Sub InsertAtTextItem(Index As Int, Text As String, Value As Object)
	Dim pnl As Panel
	pnl.Initialize("")
	Dim lbl As Label
	lbl.Initialize("")
	pnl.AddView(lbl, 5dip, 2dip, sv.Width - 5dip, 20dip)
	lbl.Text = Text
	lbl.Gravity = Bit.Or(Gravity.CENTER_HORIZONTAL,Gravity.CENTER_VERTICAL)
	lbl.TextSize = DefaultTextSize
	lbl.TextColor = DefaultTextColor
	lbl.Typeface = SaeloZahra.font
	pnl.Color = DefaultTextBackgroundColor
	Dim minHeight As Int
	minHeight = su.MeasureMultilineTextHeight(lbl, Text)
	lbl.Height = Max(50dip, minHeight)
	InsertAt(Index, pnl, lbl.Height + 2dip, Value)
End Sub



Public Sub AddAlertItem(Text As String, Value As Object, ThisType As Int, ThisIcon As Int, Time As String)
	InsertAtAlertItem(items.Size, Text, Value,ThisType,ThisIcon,Time)
End Sub

Public Sub InsertAtAlertItem(Index As Int, Text As String, Value As Object,ThisType As String,Icon As String,Time As String)
	
	Dim cdPanel As ColorDrawable
	cdPanel.Initialize(Colors.RGB(Rnd(0,254),Rnd(0,254),Rnd(0,254)),18)
	
	Dim pnl As Panel
	pnl.Initialize("")
	pnl.Background=cdPanel
	pnl.Elevation=12dip
	
	Dim lbl As Label
	lbl.Initialize("")
	lbl.Background=cdPanel
	lbl.Text = Text
	lbl.Gravity = Bit.Or(Gravity.CENTER_HORIZONTAL,Gravity.CENTER_VERTICAL)
'	lbl.TextSize = DefaultTextSize
'	lbl.TextColor = DefaultTextColor
	lbl.Typeface = SaeloZahra.font
	pnl.AddView(lbl, 10dip, 10dip, sv.Width - (sv.Width/7) , 50dip)
	
	
	Dim cd As ColorDrawable
	cd.Initialize(SaeloZahra.FindAlertColor(ThisType),7dip)
	
	Dim timeLbl As Label
	timeLbl.Initialize("")
	timeLbl.Background	= cd
	timeLbl.Text	 	= SaeloZahra.mohasebe_tarikh(Time)
	timeLbl.TextSize	= 12
	timeLbl.Gravity		= Bit.Or(Gravity.CENTER, Gravity.CENTER_HORIZONTAL)
	timeLbl.textColor	= Colors.White
	pnl.AddView(timeLbl,12dip,12dip,72dip,18dip)
	
	
	Dim ImgV As ImageView
	ImgV.Initialize("")
	ImgV.Gravity = Gravity.CENTER
	If File.Exists(File.DirAssets,Icon) Then
		ImgV.SetBackgroundImage(LoadBitmap(File.DirAssets,Icon))
	Else
		ImgV.SetBackgroundImage(LoadBitmap(File.DirAssets,"1.png"))
	End If
	pnl.AddView(ImgV,sv.Width - (sv.Width/7),12dip,sv.Width/7,50dip)
	
	Dim LineLbl As Label
	LineLbl.Initialize("")
	LineLbl.Color=Colors.LightGray
	pnl.AddView(LineLbl, sv.Width - (sv.Width/7)+7dip, 14dip, 1dip, 50dip)
	
	Dim cdBubble As ColorDrawable
	cdBubble.Initialize2(SaeloZahra.FindAlertColor(ThisType),14dip,2dip,SaeloZahra.Color)
	
	Dim bubbleLbl As Label
	bubbleLbl.Initialize("")
	bubbleLbl.Background=cdBubble
	pnl.AddView(bubbleLbl, sv.Width - (sv.Width/7), 12dip, 14dip, 14dip)
	
	
	
	Dim minHeight As Int
	minHeight = su.MeasureMultilineTextHeight(lbl, Text) + 14dip
	lbl.Height  = Max(50dip, minHeight)
	ImgV.Height = Max(50dip, minHeight)
	LineLbl.Height = Max(50dip, minHeight)
	
	
	InsertAt(Index, pnl, lbl.Height + 2dip, Value)
	
End Sub



'Adds a custom item at the specified index.
Public Sub InsertAt(Index As Int, Pnl As Panel, ItemHeight As Int, Value As Object)
    
	Dim sd As StateListDrawable
    sd.Initialize
    sd.AddState(sd.State_Pressed, pressedDrawable)
    sd.AddCatchAllState(Pnl.Background)
	
	'create another panel to handle the click event
	Dim p As Panel
	p.Initialize("panel")
	p.Background = sd
	Dim cd As ColorDrawable
	cd.Initialize(Colors.Transparent, 0)
    Pnl.Background = cd
	p.AddView(Pnl, 0, 0, sv.Width, ItemHeight)
	p.Tag = Index
	
	If Index = items.Size Then
		items.Add(Value)
		panels.Add(p)
		Dim top As Int
		If Index = 0 Then top = dividerHeight Else top = sv.Panel.Height
		sv.Panel.AddView(p, 0, top, sv.Width, ItemHeight)
	Else
		Dim top As Int
		If Index = 0 Then
			top = dividerHeight
		Else
			Dim previousPanel As Panel
			previousPanel = panels.Get(Index - 1)
			top = previousPanel.top + previousPanel.Height + dividerHeight
		End If

		Dim p2 As Panel
		For i = Index To panels.Size - 1
			p2 = panels.Get(i)
			p2.top = p2.top + ItemHeight + dividerHeight
			p2.Tag = i + 1
		Next

		items.InsertAt(Index, Value)
		panels.InsertAt(Index, p)
		sv.Panel.AddView(p, 0%x, top, sv.Width, ItemHeight)
	
	End If
	
	sv.Panel.Height = sv.Panel.Height + ItemHeight + dividerHeight
	
	If items.Size = 1 Then sv.Panel.Height = sv.Panel.Height + dividerHeight
	
End Sub

'Adds a custom item.
Public Sub Add(Pnl As Panel, ItemHeight As Int, Value As Object)
	InsertAt(items.Size, Pnl, ItemHeight, Value)
End Sub

'Scrolls the list to the specified item.
Public Sub JumpToItem(Index As Int)
	Dim top As Int
	Dim p As Panel
	For i = 0 To Min(Index - 1, items.Size - 1)
		p = panels.Get(i)
		top = top + p.Height + dividerHeight
	Next
	sv.ScrollPosition = top
	'The scroll position doesn't always gets updated without two calls to DoEvents
'	DoEvents
	Sleep(0)
	sv.ScrollPosition = top
	Sleep(0)
'	DoEvents
End Sub

Private Sub Panel_Click
	If SubExists(CallBack, EventName & "_ItemClick") Then
		Dim v As View
		v = Sender
		CallSub3(CallBack, EventName & "_ItemClick", v.Tag, items.Get(v.Tag))
	End If
End Sub



'Returns the index of the item that holds the given view.
Public Sub GetItemFromView(v As View) As Int
	Dim r As Reflector
	Dim parent, current As Object
	parent = v
	Do While (parent Is Panel) = False Or sv.Panel <> parent
		current = parent
		r.Target = current
		parent = r.RunMethod("getParent")
	Loop
	v = current
	Return v.Tag
End Sub


Sub getCurrentActivity As Activity
   Dim r As Reflector
   r.Target = r.GetActivityBA
   Return r.GetField("vg")   
End Sub


'Sub sv_ScrollChanged(Position As Int)
'	If (sv.Height + Position) >= ( sv.Panel.Height ) Then
'		If timeOut>=3 Then
''			CallSub(list_act,"getNewPosts")
'			LogColor("رسیدیم به آخر خط",Colors.Magenta)
'			timeOut=0
'		End If
'	End If
'
'	If getCurrentActivity.Tag == "best_list" Then
'		If Position > 650 Then
'			CallSub(bazarcheListAct,"HideToolbar")
'		Else if Position < 500 Then
'			CallSub(bazarcheListAct,"ShowToolbar")
'		End If
'		
'	End If
'
'End Sub

Sub t1_Tick
	timeOut=timeOut+1
End Sub