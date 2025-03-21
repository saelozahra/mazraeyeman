B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=9
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True
#End Region

#Extends: android.support.v7.app.AppCompatActivity

Sub Process_Globals
	Dim pageVals As Map
End Sub

Sub Globals
	
	Dim Config 	As Amir_SliderConfig
	Dim Show 	As Amir_SliderShow
	
	Dim Email As String
	Dim xml As XmlLayoutBuilder
	Private DSBottomNavigationView1 As DSBottomNavigationView
	Private ActionBar As ACToolBarDark
	Private Panel1,Panel2,Panel3,ContainerPanel,currentPanel As Panel
	
	Dim farmerjob As HttpJob
	Dim components(3) As String
	Private WebView1 As WebView
	Dim GMap As GoogleMap
	Dim MapFragment1 As MapFragment
	
	Private CallLbl,MailLbl As Label
End Sub

Sub Activity_Create(FirstTime As Boolean)
	
	Activity.LoadLayout("bazarcheSingleLayout")
	
	Starter.rp.CheckAndRequest(Starter.rp.PERMISSION_ACCESS_FINE_LOCATION)	
	
	ActionBar.Color=0x582F944F
	ActionBar.Title=SaeloZahra.CSBTitle("محصولات بازارچه")
	ActionBar.Elevation=0
'	Main.amaroid.TrackView(ActionBar.title)
	
	DSBottomNavigationView1.Color=Colors.Transparent
	DSBottomNavigationView1.ItemIconColor=Colors.White
	DSBottomNavigationView1.ItemTextColor=Colors.White
	DSBottomNavigationView1.SetItemIconColors(SaeloZahra.ColorLight,Colors.White,Colors.LightGray)
	DSBottomNavigationView1.SetItemtextColors(Colors.White,Colors.White,Colors.LightGray)
	
	DSBottomNavigationView1.Menu.Add2(1, 1, SaeloZahra.CSB("محصول"), xml.GetDrawable("baseline_all_inclusive_white_24")).Checked = True
	DSBottomNavigationView1.Menu.Add2(2, 2, SaeloZahra.CSB("موقعیت"), xml.GetDrawable("baseline_place_white_24"))
	DSBottomNavigationView1.Menu.Add2(3, 3, SaeloZahra.CSB("تماس"), xml.GetDrawable("baseline_local_phone_white_24"))

	currentPanel = Panel1
	
	ActionBar.NavigationIconDrawable = xml.GetDrawable("baseline_arrow_back_white_24")
	
	WebView1.LoadHtml(pageVals.Get("product"))
	WebView1.LoadUrl(SaeloZahra.json_url&"single_product_farmer.php?id="&pageVals.Get("id"))
	
	currentPanel.Color=Colors.Transparent
	
	
	farmerjob.Initialize("farmerjob",Me)
	farmerjob.Download(SaeloZahra.json_url&"farmers_list.php?farmertel="&pageVals.Get("farmers_user"))
	
	ContainerPanel.Color=Colors.LightGray
	Dim ContainerPanelHeight As Int =GetDeviceLayoutValues.Height-(DSBottomNavigationView1.Height+DSBottomNavigationView1.Top+30dip)+SaeloZahra.GetStatusBarHeight
	
	ContainerPanel.SetLayout(0,0,100%x,ContainerPanelHeight)
	Panel1.SetLayout(0,0,100%x,ContainerPanel.Height)
	Panel2.SetLayout(0,0,100%x,ContainerPanel.Height)
	Panel3.SetLayout(0,0,100%x,ContainerPanel.Height)
'	WebView1.Height=100%y-(DSBottomNavigationView1.Height+DSBottomNavigationView1.Top+30dip)+SaeloZahra.GetStatusBarHeight
'	Panel2.Height=100%y-(DSBottomNavigationView1.Height+DSBottomNavigationView1.Top+30dip)+SaeloZahra.GetStatusBarHeight
'	currentPanel.Height=100%y-(DSBottomNavigationView1.Height+DSBottomNavigationView1.Top+30dip)+SaeloZahra.GetStatusBarHeight
	
	WebView1.Color=Colors.ARGB(188,255,255,255)
	Panel1.Color = Colors.ARGB(188,255,255,255)
	Panel2.Color = Colors.ARGB(188,255,255,255)
	Panel3.Color = Colors.ARGB(188,255,255,255)
'	MapFragment1.Initialize("MapFragment1",Panel2)
	
	CallLbl.Text = SaeloZahra.CSB("شماره تماس: "&pageVals.Get("farmers_user"))
	
	If MapFragment1.IsGooglePlayServicesAvailable = False Then
		ToastMessageShow("گوگل پلی سرویس در دسترس نیست", True)
	End If
	
'	If NewTheme Then
		SaeloZahra.SetStatusBarColor(SaeloZahra.ColorDark)
		Activity.Color		=SaeloZahra.Color
		ActionBar.Color		=Colors.Transparent
		DSBottomNavigationView1.Color=Colors.Transparent
		ActionBar.SetLayout(0,0,100%x,SaeloZahra.MaterialActionBarHeight)
		DSBottomNavigationView1.SetLayout(0,SaeloZahra.MaterialActionBarHeight,100%x,SaeloZahra.MaterialActionBarHeight)
		DSBottomNavigationView1.SetItemIconColors(SaeloZahra.ColorLight,Colors.White,Colors.LightGray)
		ContainerPanel.SetLayout(0,SaeloZahra.MaterialActionBarHeight*2,100%x,Activity.Height-(SaeloZahra.MaterialActionBarHeight*2)+SaeloZahra.GetStatusBarHeight)
		Panel1.Height=ContainerPanel.Height+SaeloZahra.GetStatusBarHeight
		Panel2.Height=ContainerPanel.Height+SaeloZahra.GetStatusBarHeight
		Panel3.Height=ContainerPanel.Height+SaeloZahra.GetStatusBarHeight
'	End If
	
	If SaeloZahra.P.SdkVersion>23 Then
		Config.Initialize
		Config.position(Config.POSITION_LEFT)
		Config.primaryColor(SaeloZahra.ColorDark)
		Config.edge(True )
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

Sub MapFragment1_Ready
	Log("map ready")
	
	If Starter.rp.Check(Starter.rp.PERMISSION_ACCESS_FINE_LOCATION) Then
		If MapFragment1.GetMap.IsInitialized Then
			GMap = MapFragment1.GetMap
		End If
	Else
		Starter.rp.CheckAndRequest(Starter.rp.PERMISSION_ACCESS_FINE_LOCATION)
		Wait For Activity_PermissionResult (Permission As String, Result As Boolean)
		If Result Then MapFragment1_Ready
	End If
		
	If Not(GMap.IsInitialized) Then
		ToastMessageShow("Error initializing the map.", True)
	Else
		If components(1).Length>2 Then
			Dim cp As CameraPosition
			cp.Initialize(components(0), components(1), GMap.CameraPosition.Zoom)
			GMap.AnimateCamera(cp)
			GMap.AddMarker2(components(0), components(1),"موقعیت این محصول",GMap.HUE_YELLOW)
		End If
	End If
	
End Sub


Sub DSBottomNavigationView1_NavigationItemSelected(MenuItem As ACMenuItem)
	Log("Menu item selected: " &MenuItem.Id&"  :  "& MenuItem.Title)
	Dim newPanel As Panel
	Panel1.Visible=False
	Panel2.Visible=False
	Panel3.Visible=False
	
	Select MenuItem.Id
		Case 1
			newPanel = Panel1
		Case 2
			newPanel = Panel2
		Case 3
			newPanel = Panel3
		Case Else
			newPanel = Panel1
	End Select

	' If the selectd panel is not the current one
	' make the new panel visible (animated) like in Material Design guidelines.

	If currentPanel <> newPanel Then
		newPanel.SetVisibleAnimated(0, False)
		newPanel.BringToFront
		newPanel.SetVisibleAnimated(200, True)
		currentPanel = newPanel
		currentPanel.SetVisibleAnimated(888,True)
	End If

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


Sub jobDone(job As HttpJob)
	
	ProgressDialogHide
	
	If job.Success Then
		
		If job.GetString=="""PassError""" Then
			
			ToastMessageShow(SaeloZahra.CSB("کلمه عبور وارد شده غلط است"),True)
			File.Delete(SaeloZahra.dir,"usrnm")
			File.Delete(SaeloZahra.dir,"pswd")
		
		Else If job.GetString=="""UserNotFound""" Then
			
			ToastMessageShow(SaeloZahra.CSB("نام کاربری پیدا نشد"),True)
			File.Delete(SaeloZahra.dir,"usrnm")
			File.Delete(SaeloZahra.dir,"pswd")
			
		Else
			
			LogColor(job.GetString,Colors.Green)
		
			Dim parser As JSONParser
			parser.Initialize(job.GetString)
			Dim root As List = parser.NextArray
			For Each colroot As Map In root
'				Dim area As String = colroot.Get("area")
'				Dim address As String = colroot.Get("address")
'				Dim sh_bime As String = colroot.Get("sh_bime")
'				Dim city As String = colroot.Get("city")
'				Dim mobile As String = colroot.Get("mobile")
'				Dim pay As String = colroot.Get("pay")
'				Dim reg_date As String = colroot.Get("reg_date")
'				Dim password As String = colroot.Get("password")
'				Dim unit As String = colroot.Get("unit")
'				Dim last_visit As String = colroot.Get("last_visit")
'				Dim fathername As String = colroot.Get("fathername")
'				Dim nationalcode As String = colroot.Get("nationalcode")
'				Dim stream As String = colroot.Get("stream")
'				Dim name As String = colroot.Get("name")
				Dim location As String = colroot.Get("location")
'				Dim id As String = colroot.Get("id")
'				Dim state As String = colroot.Get("state")
				Email = colroot.Get("email")
				MailLbl.Text = SaeloZahra.CSB("پست الکترونیک: "&Email)
'				Dim moaref As String = colroot.Get("moaref")
'				Dim username As String = colroot.Get("username")
'				Dim status As String = colroot.Get("status")
			Next
			
			
'			TODO:GOTO MY LOCATION
			components = Regex.Split(",", location)
			
			LogColor(components(0)&",,,,"&components(1),Colors.Blue)
			If GMap.IsInitialized Then
				Dim cp As CameraPosition
				cp.Initialize(components(0), components(1), 14)
				gmap.AnimateCamera(cp)
			End If
			
		End If
		
		
		
	Else
		
		If job.ErrorMessage.Contains("Unable to resolve host") Then
			ToastMessageShow(SaeloZahra.CSB(" اینترنتتون وصل نیست "),True)
		Else
			ToastMessageShow(SaeloZahra.CSB(" خطا ")&CRLF&job.ErrorMessage,True)
		End If
	End If
	job.Release
End Sub




Sub MailLbl_Click
	SaeloZahra.intent1.Initialize( "android.intent.action.SENDTO" 	, "mailto:"&Email )
	SaeloZahra.intent1.putExtra  ( "android.intent.extra.SUBJECT" 	, "درخواست خرید محصول" )
	SaeloZahra.intent1.putExtra  ( "android.intent.extra.TEXT" 		, "سلام / ببخشید چطور میتونم مقداری از این محصول تهیه کنم ؟" )
	SaeloZahra.intent1.WrapAsIntentChooser ( "ارسال ایمیل" )
	StartActivity ( SaeloZahra.intent1 )
End Sub

Sub CallLbl_Click
	SaeloZahra.intent1.Initialize(SaeloZahra.intent1.ACTION_VIEW, "tel:"&pageVals.Get("farmers_user"))
	StartActivity(SaeloZahra.intent1)
End Sub