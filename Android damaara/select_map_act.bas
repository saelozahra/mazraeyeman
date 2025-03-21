B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=8
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: false
	#IncludeTitle: false
#End Region

#Extends: android.support.v7.app.AppCompatActivity
	
Sub Process_Globals
'	Dim ApiKey As String = "AIzaSyC0P4XSC-UZoO2wpZ2wfQlQM8P4ErQLljY"
	Dim myLocation As Location
	Dim t,T2 As Timer
	Dim WhatLove As String
	
	Dim place_lat,place_lng As Double
	Dim gheshlagh_lat,gheshlagh_lng As Double
	Dim yeylagh_lat,yeylagh_lng As Double
			
End Sub

Sub Globals
	Dim MDialog As MaterialDialogBuilder
	Dim lista_punta,PlaceList As List
	Dim X1 As XmlLayoutBuilder
	Dim SV As ACSearchView
	Dim gmap As GoogleMap
	Dim CP As CameraPosition
	Dim MapFragment1 As MapFragment
	Dim gme As GoogleMapsExtras
	Dim OnMyLocationChangeListener1 As OnMyLocationChangeListener
	Dim latlng_old As LatLng
	Dim point As Map
	
	Dim SearchPlace,get_my_address,GetMyElevationJob As HttpJob'NearPlace
	Dim Started As Boolean = True
	Private address_bar_lbl As Label
	Dim time,Time2 As Int
	Private search_et As EditText
	Private ActionBar As ACToolBarLight
	Dim AC As AppCompat
	Dim SI As ACMenuItem
	Private Panel1 As Panel
	Private MarkerIV As ImageView
	Private SelectLocationBTN As Button
End Sub


Sub Activity_Create(FirstTime As Boolean)
	
	SaeloZahra.active_page="selectmap"
	Activity.LoadLayout("map_layout")
	
	address_bar_lbl.Color		= 0xEA056523
	address_bar_lbl.TextColor	= Colors.White
	address_bar_lbl.Typeface= SaeloZahra.font
	AC.SetElevation(address_bar_lbl,7dip)
	
	If MapFragment1.IsGooglePlayServicesAvailable = False Then
		ToastMessageShow("لطفا گوگل پلی را نصب کنید.", True)
		Activity.Finish
	End If
	
	
'	SaeloZahra.SetStatusBarColor(SaeloZahra.colorDark)
	ActionBar.Title=SaeloZahra.CSB("انتخاب موقعیت مکانی")
	ActionBar.TitleTextColor=Colors.White
	ActionBar.NavigationIconDrawable = X1.GetDrawable("baseline_arrow_back_white_24")
	ActionBar.Color=Colors.Transparent
	ActionBar.SetLayout(0dip,2%y,100%x,AC.GetMaterialActionBarHeight+4%y)
	Panel1.SetLayout(0,AC.GetMaterialActionBarHeight+SaeloZahra.GetStatusBarHeight,100%x,100%y-SaeloZahra.GetStatusBarHeight-AC.GetMaterialActionBarHeight)
	myLocation.Initialize
	
	If Not(File.Exists(SaeloZahra.dir,"lat")) Then
		File.WriteString(SaeloZahra.dir,"lat" ,"29.609503")
		File.WriteString(SaeloZahra.dir,"lng","52.542800")
	End If
	
	myLocation.Latitude =File.ReadString(SaeloZahra.dir,"lat")
	myLocation.Longitude=File.ReadString(SaeloZahra.dir,"lng")
	
	
	
	If Not(SaeloZahra.CheckConnection) Then
		ToastMessageShow( SaeloZahra.CSB("حتما به اینترنت متصل شوید") ,True)
	End If
	
	
'	NearPlace.Initialize(		"NearPlace"		, Me)
	get_my_address.Initialize(	"get_my_address", Starter)
	GetMyElevationJob.Initialize("GetMyElevationJob", Starter)
	
	
	t.Initialize("t",100)
	t.Enabled=True
	T2.Initialize("T2",100)
	T2.Enabled=True
	
	SaeloZahra.SearchableEdittext(search_et)
	search_et.Color=Colors.Transparent
	search_et.Typeface= SaeloZahra.font
	
'	Main.amaroid.TrackView(ActionBar.Title&"")
	
	SelectLocationBTN.Typeface=SaeloZahra.fontBold
	
'	If NewTheme Then
		SaeloZahra.SetStatusBarColor( SaeloZahra.ColorDark )
		SelectLocationBTN.Color = SaeloZahra.ColorDark
		ActionBar.Color = SaeloZahra.Color
		ActionBar.SetLayout(0,0,100%x,SaeloZahra.MaterialActionBarHeight)
		Panel1.SetLayout(0,SaeloZahra.MaterialActionBarHeight,100%x,GetDeviceLayoutValues.Height-SaeloZahra.MaterialActionBarHeight)
		address_bar_lbl.Color = 0xBC15887B
'	End If
	
	MarkerIV.SetBackgroundImage(LoadBitmapResize(File.DirAssets,"location.png",MarkerIV.Width,MarkerIV.Height,True))

End Sub


Sub Activity_Resume
	If Starter.GPS1.GPSEnabled = False Then
		StartGPS
	Else
		Starter.rp.CheckAndRequest(Starter.rp.PERMISSION_ACCESS_FINE_LOCATION)
		Wait For Activity_PermissionResult (Permission As String, Result As Boolean)
		If Result Then CallSubDelayed(Starter, "StartGPS")
	End If
	
End Sub

Sub StartGPS
	ToastMessageShow("لطفا جی پی اس را فعال کنید", True)
	Msgbox2Async("لطفا موقعیت یاب خود را روشن کنید","موقعیت","روشن کن","لغو","",Null,False)

	Wait For Msgbox_Result (Result As Int)
	If Result = DialogResponse.POSITIVE Then
		StartActivity(Starter.GPS1.LocationSettingsIntent) 'Will open the relevant settings screen.
	End If
End Sub

Sub Activity_Pause (UserClosed As Boolean)
	CallSubDelayed(Starter, "StopGPS")
End Sub





Sub goToMyLocation
		
	If Starter.gpsStarted Then
		CP.Initialize( myLocation.Latitude, myLocation.Longitude, 14 )
		gmap.AnimateCamera(CP)
		Log("Go To My Location")
		CallSubDelayed(Starter, "StopGps")
	End If
	
	If Started Then
'		gmap.AddMarker(myLocation.Latitude, myLocation.Longitude, "موقعیت من")
		Started=False
	End If
	
	If Starter.GPS1.GPSEnabled Then
		gmap.MyLocationEnabled=True
	End If
	
End Sub


Sub change_addressbar_text(text As String)
	address_bar_lbl.Text=text
	address_bar_lbl.SetVisibleAnimated(313,True)
'	address_bar_lbl.Top=GetDeviceLayoutValues.Height-address_bar_lbl.Height-9dip
	time=0
End Sub

Sub t_Tick
	time=time+72
	If time>9999 Then
		address_bar_lbl.SetVisibleAnimated(1000,False)
	End If
End Sub

Sub T2_Tick
	Time2=Time2+1
End Sub

Sub MapFragment1_CameraChange (Position As CameraPosition)
	
	If Time2>20 Then
		
		Time2 = 0
		MarkerIV.SetLayoutAnimated(10,MarkerIV.Left+5dip,MarkerIV.Top-18dip,MarkerIV.Width-10dip,MarkerIV.Height-2dip)
		MarkerIV.SetBackgroundImage(LoadBitmapResize(File.DirAssets,"location.png",MarkerIV.Width,MarkerIV.Height,True))
		
		If SaeloZahra.CheckConnection Then
			get_my_address.Download("https://us1.locationiq.com/v1/reverse.php?key=50f886904c60e7&lat="&Position.Target.Latitude&"&lon="&Position.Target.Longitude&"&accept-language=fa&format=json")
	'		get_my_address.Download("http://maps.google.com/maps/api/geocode/json?latlng="&Position.Target.Latitude&","&Position.Target.Longitude&"&sensor=False&language=fa")
			LogColor("https://us1.locationiq.com/v1/reverse.php?key=50f886904c60e7&lat="&Position.Target.Latitude&"&lon="&Position.Target.Longitude&"&accept-language=fa&format=json",Colors.Yellow)
		Else
			address_bar_lbl.SetVisibleAnimated(313,False)
		End If
		
		Sleep(50)
		MarkerIV.SetLayoutAnimated(202,MarkerIV.Left-5dip,MarkerIV.Top+18dip,MarkerIV.Width+10dip,MarkerIV.Height+2dip)
		MarkerIV.SetBackgroundImage(LoadBitmapResize(File.DirAssets,"location.png",MarkerIV.Width,MarkerIV.Height,True))
		
		MarkerIV.Tag=CreateMap("lat":Position.Target.Latitude,"lng":Position.Target.Longitude)
		point = CreateMap("lat":Position.Target.Latitude,"lng":Position.Target.Longitude)
		If WhatLove=="gheshlagh" Then
			gheshlagh_lat = Position.Target.Latitude
			gheshlagh_lng = Position.Target.Longitude
		Else If WhatLove=="yeylagh" Then
			yeylagh_lat = Position.Target.Latitude
			yeylagh_lng = Position.Target.Longitude
		Else
			place_lat = Position.Target.Latitude
			place_lng = Position.Target.Longitude
		End If
			
	End If
		
End Sub


Sub MapFragment1_Ready
	
	Log("map ready")
	
	gmap = MapFragment1.GetMap
	
	If Not(gmap.IsInitialized) Then
		ToastMessageShow("نتوانستیم نقشه را نصب کنیم", True)
	Else
		latlng_old.Initialize(myLocation.Latitude,myLocation.Longitude)
'		gmap.AddMarker(myLocation.Latitude, myLocation.Longitude, "موقعیت من")
		CP.Initialize( myLocation.Latitude, myLocation.Longitude, 13 )
		gmap.AnimateCamera(CP)
		latlng_old.Initialize(myLocation.Latitude,myLocation.Longitude)
'		NearPlace.Download(SaeloZahra.json_url&"/user/index/json/2/"&myLocation.Latitude&"/"&myLocation.Longitude)
		Log("Go To My Location: "&myLocation.Latitude&","&myLocation.Longitude)
	End If
	
	SaeloZahra.ChangeGooglemapStyle(File.ReadString(File.DirAssets,"googlemapstyle.txt"),gmap)
	
	OnMyLocationChangeListener1.Initialize("OnMyLocationChangeListener1")
	gme.SetOnMyLocationChangeListener( gmap , OnMyLocationChangeListener1 )
	
	lista_punta.Initialize
	
End Sub

Sub OnMyLocationChangeListener1_MyLocationChange(Location1 As Location)
	myLocation = Location1
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


Sub back_Click
	
End Sub



















'Inline Java code to initialize the Menu
#If Java
	public boolean _onCreateOptionsMenu(android.view.Menu menu) {
		if (processBA.subExists("activity_createmenu")) {
			processBA.raiseEvent2(null, true, "activity_createmenu", false, new de.amberhome.objects.appcompat.ACMenuWrapper(menu));
			return true;
		}
		else
			return false;
	}
#End If
	
#Region searchbar_and_menu
'This is the Sub called by the inline Java code to initialize the Menu
Sub Activity_CreateMenu(Menu As ACMenu)
	
	
	SV.Initialize2("Search", SV.THEME_DARK)
	SV.IconifiedByDefault = True

	'Clear the menu
	Menu.Clear
	
	'Add a menu item and assign the SearchView to it
	ActionBar.InitMenuListener
	
	
	SI = Menu.Add2(1, 1, "جستجو", X1.GetDrawable("baseline_search_white_24") )
	SI.SearchView = SV
	
	
'	ActionBar.Menu.Add2(2,2,"جی پی اس", saelozahra.icon("gmd_gps_fixed",saelozahra.colorDDD).Drawable ).ShowAsAction = 2

	
End Sub



Sub Search_Closed
	Log("SearchView closed")
End Sub

'Sub Search_QueryChanged (Query As String)
'	Log("Query changed: " & Query)
'End Sub




Sub search_et_EnterPressed
	Search_QuerySubmitted(search_et.Text)
End Sub

Sub Search_QuerySubmitted (Query As String)
   
	Log("Search for '" & Query & "'")
	
	Dim KeyWord As String = Query.Trim
	If KeyWord = "" Then Return 'Exit when keyword is blank.
	KeyWord = KeyWord.Replace(" ", "+") 'Required to replace all space by + to use in request query.
	ProgressDialogShow(SaeloZahra.csb("در حال جستجو..."))
	'TODO: Search Google
'	SearchPlace.Download("https://maps.googleapis.com/maps/api/place/nearbysearch/json?location="&myLocation.Latitude&","&myLocation.Longitude&"&radius=500000&name=" & KeyWord & "&key=" & ApiKey &"&language=fa")
'	SearchPlace.Download("https://map.ir/search/v2?text="&KeyWord&"&x-api-key=eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImp0aSI6IjkxODk3N2I5ZDhjYTUwMzgyNTY2NDM4YjUxMWNlZjRkMThlNzA2ODMxODYzOTZiODhkZWM3YTJhNzhmZjNmZWZjYzk0NDlkN2Q2ZjFlM2MwIn0.eyJhdWQiOiI3NTM2IiwianRpIjoiOTE4OTc3YjlkOGNhNTAzODI1NjY0MzhiNTExY2VmNGQxOGU3MDY4MzE4NjM5NmI4OGRlYzdhMmE3OGZmM2ZlZmNjOTQ0OWQ3ZDZmMWUzYzAiLCJpYXQiOjE1NzkwNDMyNDEsIm5iZiI6MTU3OTA0MzI0MSwiZXhwIjoxNTgxNTQ4ODQxLCJzdWIiOiIiLCJzY29wZXMiOlsiYmFzaWMiXX0.m-0uizyhu0KrC2Nf4pU3SKcWw7IXXHyDRALzFh65mrbMGjnGtMvg3483oxNWInl3Ng4WX0q_g0t5GOzK-47WAmBvfSZFIYMUG6Nlee57Ozlc47_IbfjuF8R-mRcLttx2D6wmqBZkgcCkCxVAV_d0TB30t2vJVFFOV3Ryp4Hij7HOEdzg4pdvYmSjE7qhRnW9rEXMOCRS9NIGZIRFm57lUpXpbT4B3UdjFKCBBke53mGOP8emLoUlJfoFoEWPrvplJx8mGg82Uyl5HtGgOZvv5Z6ZZ92u-WGnH_VdRz0CpDqgOcEiuS5XGAhCVEzTAev1yrdhKuHZ-n1WXo_OED4AiQ&lat="&myLocation.Latitude&"&lon"&myLocation.Longitude&"&radius=500000&name=" & KeyWord & "&key=" & ApiKey &"&language=fa")
	
	Dim KeyWord As String = Query.Trim
	If KeyWord = "" Then Return 'Exit when keyword is blank.
	KeyWord = KeyWord.Replace(" ", "+") 'Required to replace all space by + to use in request query.
	SearchPlace.Initialize("SearchPlace", Me)
	SearchPlace.Download("https://us1.locationiq.com/v1/search.php?key=50f886904c60e7&q="& KeyWord &"&format=json&countrycodes=ir&accept-language=fa")
	
	Log("search mylocation lat is: "&myLocation.Latitude&" and long is: "&myLocation.Longitude & "KeyWord: "&KeyWord)
	
End Sub


#End Region




Sub JobDone(Job As HttpJob)
	ProgressDialogHide
	If Job.Success Then
		Select Job.JobName
			
			Case "SearchPlace"
'				Dim plgo As PolygonOptions
'				plgo.
'				gme.AddPolygon(gmap,)
				If Job.GetString=="{""html_attributions"" : [],""results"" : [],""status"" : ""ZERO_RESULTS""}" Or Job.GetString == "{""error"":""Unable to geocode""}" Then
						ToastMessageShow("نتیجه ای یافت نشد",True)
				Else
					
					PlaceList.Initialize
					
					
					Dim parser As JSONParser
					parser.Initialize(Job.GetString)
					Dim root As List = parser.NextArray
					Dim tempDialogNames(root.Size) As String
					Dim tempDialogId As Int = 0
					For Each colroot As Map In root
						lista_punta.Initialize
'						Dim boundingbox As List = colroot.Get("boundingbox")
'							For Each colboundingbox As String In boundingbox
'								lista_punta.Add(colboundingbox)
'							Next
'						DrawPolygon(lista_punta)
'						
'						Dim importance As Double = colroot.Get("importance")
'						Dim locationType As String = colroot.Get("type")
'						Dim class As String = colroot.Get("class")
'						TODO: Address Class


						Dim co As CircleOptions
						co.Initialize
						co.Center2(colroot.Get("lat"),colroot.Get("lon"))
						co.FillColor(0x5CFFFFFF)
						co.Radius(202)
						co.StrokeWidth(3)
						co.StrokeColor(SaeloZahra.ColorDark)
						gme.AddCircle(gmap,co)
						
						Dim TempMap As Map : TempMap.Initialize
						TempMap.Put("address", colroot.Get("display_name"))
						TempMap.Put("icon", colroot.Get("icon"))
						TempMap.Put("name", colroot.Get("display_name"))
						
						TempMap.Put("lat", colroot.Get("lat"))
						TempMap.Put("lng", colroot.Get("lon"))
						
						tempDialogNames(tempDialogId)=TempMap.Get("name")
						tempDialogId=tempDialogId+1
						PlaceList.Add(TempMap)
						
					Next
					
'					For Google Map
'					Dim parser As JSONParser
'					parser.Initialize(Job.getString)
'					Dim root As Map = parser.NextObject
'					Dim results As List = root.Get("results")
'					Dim temp_dialog_names(results.Size) As String
'					Dim temp_dialog_id As Int = 0
'					
'					For Each colresults As Map In results
'						Dim TempMap As Map : TempMap.Initialize
'						TempMap.Put("address", colresults.Get("vicinity"))
'						TempMap.Put("icon", colresults.Get("icon"))
'						TempMap.Put("name", colresults.Get("name"))
'						
'						Dim geometry As Map = colresults.Get("geometry")
'						Dim location As Map = geometry.Get("location")
'						TempMap.Put("lng", location.Get("lng"))
'						TempMap.Put("lat", location.Get("lat"))
'						
'						PlaceList.Add(TempMap)
'						
'						temp_dialog_names(temp_dialog_id)=TempMap.Get("address")&": "&TempMap.Get("name")
'						temp_dialog_id=temp_dialog_id+1
'						
'					Next
				End If
				
				MDialog.Initialize("MDialog")
				MDialog.Title("جستجو")
				MDialog.Content("یکی از مکان های زیر را انتخاب کنید")
				MDialog.ButtonRippleColor(SaeloZahra.ColorLight)
				MDialog.Typeface(SaeloZahra.font,SaeloZahra.font)
				MDialog.ItemsCallback
				MDialog.Items(tempDialogNames)
				MDialog.Show
				
		End Select
	Else
		ToastMessageShow(SaeloZahra.CSB("خطا در تکمیل درخواست..."),False)
	End If
End Sub

Sub MDialog_ItemSelected (Dialog As MaterialDialog, Position As Int, Text As String)
	
	Dim map2 As Map = PlaceList.Get(Position)
	CP.Initialize(map2.Get("lat"),map2.Get("lng"),17)
	gmap.AnimateCamera(CP)

End Sub


Sub SelectLocationBTN_Click
	Try
			
		
		If gmap.IsInitialized Then
			Dim makanName As String
			If WhatLove=="gheshlagh" Then
				File.WriteString(SaeloZahra.dir,"gheshlagh_lat",point.Get("lat"))
				File.WriteString(SaeloZahra.dir,"gheshlagh_lng",point.Get("lng"))
				makanName = "قشلاق"
			Else If WhatLove=="yeylagh" Then
				File.WriteString(SaeloZahra.dir,"yeylagh_lat",point.Get("lat"))
				File.WriteString(SaeloZahra.dir,"yeylagh_lng",point.Get("lng"))
				makanName = "ییلاق"
			Else
				File.WriteString(SaeloZahra.dir,"place_lat",point.Get("lat"))
				File.WriteString(SaeloZahra.dir,"place_lng",point.Get("lng"))
				makanName = "مکانی"
			End If
			
			
'			GetMyElevationJob.Download("https://api.jawg.io/elevations?locations="&point.Get("lat")&","&point.Get("lng")&"&access-token=hK0HswafCCr88OOdM5atp9xm2En6VFk91kAbR0458PtVAqznRTur7AK3ViDO780k")
			Activity.Finish
			
			Log("Select Map For "&WhatLove & " " & makanName)
		End If

	Catch
		ToastMessageShow("خطا در خواندن موقعیت مکانی",True)
		MsgboxAsync(LastException.Message,"خطای ثبت موقعیت")
		Activity.Finish
	End Try
End Sub


































Sub MapFragment1_LongClick (mPoint As LatLng)
	
	gmap.AddMarker3(mPoint.Latitude,mPoint.Longitude, address_bar_lbl.Text ,SaeloZahra.SetBitmapDensity(LoadBitmapResize(File.DirAssets,"location.png",18dip,18dip,True))).InfoWindowShown = True
	
	lista_punta.Add(mPoint)
	If lista_punta.Size = 6 Then
		DrawPolygon(lista_punta)
	End If
	
End Sub



Sub DrawPolygon(PointList As List)
    Dim GoogleMapsExtras1 As GoogleMapsExtras
    Dim polygonoptions1 As PolygonOptions
    polygonoptions1.Initialize
	polygonoptions1.FillColor=0x960C0D6A
    polygonoptions1.AddPoints(PointList)
    polygonoptions1.StrokeColor=Colors.DarkGray
    polygonoptions1.StrokeWidth=3
    Dim pg As Polygon = GoogleMapsExtras1.AddPolygon(gmap, polygonoptions1)
	pg.FillColor = 0x960C0D6A
End Sub