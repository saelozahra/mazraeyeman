B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=9.5
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True
#End Region
#Extends: androidx.appcompat.app.AppCompatActivity
#Extends: de.amberhome.materialdialogs.MaterialDialogsActivity

Sub Process_Globals
	Dim SQL1 As SQL
	Dim cu1 As Cursor
	Dim listItemHeightMSG As Int = 72dip
	Dim listItemHeightBazarche As Int = 110dip
	Dim PlaceList As List
	Dim mapProductName As Map
	Dim WindSpeedValue,NowWind As String'RainProbability
	Dim Next12HDamaha,Next12HFaghatDama,Next12HWindha As List
	Dim RelativeHumidity,UVIndex As String
	Dim DewPointValue,SnowValue,RainValue As Double
End Sub

Sub Globals
	' Primary Init 
	Private ActionBar As ACToolBarDark
	Dim AC As AppCompat
	Private btn1lbl,btn2lbl,btn3lbl As Label
	Dim SH As Amir_SliderShow
	Dim Snake As DSSnackbar
	Dim X1 As XmlLayoutBuilder
	Dim ShareApp As ShareMyApp
	Dim customBrowser As JK_CustomTabsBrowser
	Dim TIP As MSShowTipsBuilder
	Dim TipState As Int
	
	' Menu
	Dim SM As SlidingMenu
	Dim lv As ListView
	Dim listSearchResults,listSearchHasVid As List
	Dim msi As MaterialSimpleListItem
	
	Dim sv As ACSearchView
	Dim si As ACMenuItem
	
	' Home
	Private PanelMsgs,PanelWeather,containerPanel,bottomNavigationPanel,Panel3,HomePanel As Panel
	Dim ClvMsg As CustomListView
	Dim Zouj As Boolean = True
	Private ImageView1,ImageView2,ImageView3 As ImageView
	Dim WeatherWV As WebView
	Dim ParallaxDesign As Hitex_ParallaxDesign
	
	
	'MultiMedia
	Private MultiMediaWv As WebView
	
	'Bazarche
	Dim ClvBazarche As CustomListView
	Dim jobBazarche,jobSingleVideo,JobGet12Hour,JobSearch As HttpJob
	
End Sub

Sub Activity_Create(FirstTime As Boolean)
	
	ProgressDialogHide
	
	Activity.LoadLayout("home2Layout")
	
	SaeloZahra.SetStatusBarColor(SaeloZahra.NewColorDark)
	ActionBar.Color=SaeloZahra.NewColor
	
	customBrowser.Initialize
	customBrowser.ToolbarColor = SaeloZahra.NewColor
	customBrowser.ShowTitle = True
	customBrowser.Build
	
	lv.Initialize("lv")
	lv.Color=SaeloZahra.NewColor
'	lv.AddSingleLine2(SaeloZahra.CSB("قالب قدیمی"),"Start New Theme")
	lv.AddSingleLine2(SaeloZahra.CSB("وضعیت آب و هوا"),"Weather")
	lv.AddSingleLine2(SaeloZahra.CSB("اطلاعیــــــه ها") ,"Notification")
	lv.AddSingleLine2(SaeloZahra.CSB("ثبت محصولات"),"sabtemahsool")
	lv.AddSingleLine2(SaeloZahra.CSB("صندوق بیمه") ,"sandoghbime")
	lv.AddSingleLine2(SaeloZahra.CSB("کارشناسان")   ,"karshenasan")
'	lv.AddSingleLine2(SaeloZahra.CSB("معرفی و دریافت جایزه"),"referral")
'	lv.AddSingleLine2(SaeloZahra.CSB("ارسال نرم افزار"),"share")
	lv.AddSingleLine2(SaeloZahra.CSB("لغو اشتراک و خروج"),"unsubscribe")
	lv.AddSingleLine2(SaeloZahra.CSB("خروج"),"exit")
	lv.Padding = Array As Int(0,SaeloZahra.MaterialActionBarHeight,0,0)
	
	SM.Initialize("sm")
	SM.Menu.Color=SaeloZahra.NewColor
	SM.Menu.AddView(lv,0,0,-2,-2)
	SM.BehindOffset=133dip
	ActionBar.NavigationIconBitmap = LoadBitmapResize(File.DirAssets,"menu.png",ActionBar.Height/2,ActionBar.Height/2,True)
	
	ActionBar.Title=SaeloZahra.CSB(Application.LabelName)
	ActionBar.TitleTextColor=Colors.White
	
	Main.amaroid.TrackView("Home2")
	
	
	JobSearch.Initialize("JobSearch",Me)
	
	
	
	
	
	
	If FirstTime Then
		If File.Exists(SaeloZahra.dir,"showTip")==False Then
			TIP.Initialize("tip")
			TIP.setTitle(SaeloZahra.csb("وضعیت مزرعه من")).setButtonText(SaeloZahra.csb("بعدی")).setTitleColor(SaeloZahra.color).setDescriptionColor(SaeloZahra.colorDark).setDescription(SaeloZahra.csb("اگه میخواید وضعیت آب و هوا و مخاطرات مزرعه رو ببینید ، وارد این بخش بشید")).setTarget(ImageView2).build
			TIP.setDelay(2313)
			TIP.show
			TipState=1
			File.WriteString(SaeloZahra.dir,"showTip","")
		End If
	End If

	
	
	
	
	
	''''load msgs
	''''load msgs
	''''load msgs
	''''load msgs
	''''load msgs
	''''load msgs
	''''load msgs
	''''load msgs
	''''load msgs
	''''load msgs
	''''load msgs
	''''load msgs
	''''load msgs
	''''load msgs
	''''load msgs
	''''load msgs
	''''load msgs
	''''load msgs
	''''load msgs
	''''load msgs
	''''load msgs
	
	containerPanel.SetLayout(0,ActionBar.Height,100%x,100%y-AC.GetMaterialActionBarHeight-bottomNavigationPanel.Height+14dip)'bottomNavigationPanel.Top)
	
	HomePanel.SetLayout(0,0,containerPanel.Width,containerPanel.Height)
	
	
	btn1lbl.Typeface=SaeloZahra.font
	btn3lbl.Typeface=SaeloZahra.font
	btn2lbl.Typeface=SaeloZahra.font
	
	Dim TafavoteSize As Int = HomePanel.Height/12
	If GetDeviceLayoutValues.Height>2020 Then TafavoteSize = HomePanel.Height/20
	
	Dim cdPanelMsg As ColorDrawable
	cdPanelMsg.Initialize(Colors.White,18)
	PanelMsgs.Initialize("PanelMsgs")
	PanelMsgs.Background=cdPanelMsg
	PanelMsgs.Elevation=7dip
	HomePanel.AddView(PanelMsgs,14dip,14dip,HomePanel.Width-28dip,HomePanel.Height/2-60dip-TafavoteSize)
	AC.SetElevation(PanelMsgs,7dip)
	
	ClvMsg.Initialize(Me, "ClvMsg")
	PanelMsgs.AddView(ClvMsg.AsView,0dip,0dip,PanelMsgs.Width,PanelMsgs.Height-0dip)
	
	
	If File.Exists(SaeloZahra.dir,"db.db") = False Then
		File.Copy(File.DirAssets,"db.db",SaeloZahra.dir,"db.db")
	End If
	
	
	If Not(SQL1.IsInitialized) Then
		SQL1.Initialize(SaeloZahra.dir,"db.db",False)
	End If
	
	cu1 = SQL1.ExecQuery("SELECT * FROM notification ORDER BY id DESC")

	For i = 0 To cu1.RowCount-1
		cu1.Position = i
		Dim ThisIcon As String = cu1.GetString("icon")
		If ThisIcon=="" Then ThisIcon = 0
		ClvMsg.Add(CreateListItemMsg(cu1.GetString("id"),cu1.GetString("title"),cu1.GetString("value").Replace("<hr>",""),cu1.GetString("type"),cu1.GetString("time"),ThisIcon,Colors.RGB(Rnd(0,254),Rnd(0,254),Rnd(0,254)) ),listItemHeightMSG,cu1.GetString("title"))
	Next
	

	ImageView1.Gravity=Gravity.CENTER
	ImageView2.Gravity=Gravity.CENTER
	ImageView3.Gravity=Gravity.CENTER
	
	
	
	
	
	
	
	
	
	
	''''load Weather
	''''load Weather
	''''load Weather
	''''load Weather
	''''load Weather
	''''load Weather
	''''load Weather
	''''load Weather
	''''load Weather
	''''load Weather
	''''load Weather
	''''load Weather
	''''load Weather
	''''load Weather
	''''load Weather
	''''load Weather
	''''load Weather
	''''load Weather
	''''load Weather
	''''load Weather
	
	
	JobGet12Hour.Initialize("JobGet12Hour",Me)
	JobGet12Hour.Download(	"http://newserver.mazraeyeman.ir/mazraeyeman_proxy.php?url="&SaeloZahra.EncodeUrl("http://dataservice.accuweather.com/forecasts/v1/hourly/12hour/"&accuWeatherCronJobService.RegionCode&"?metric=true&details=true&language=fa-ir&apikey="&accuWeatherCronJobService.ApiAccuWeather)&"&amirTime="&DateTime.Now)
	
	
	
	Dim cdPanelWeather As ColorDrawable
	cdPanelWeather.Initialize(Colors.White,18)
	
	PanelWeather.Initialize("PanelWeather")
	PanelWeather.Background=cdPanelWeather
	PanelWeather.Padding= Array As Int (0,0,0,0 )
	PanelWeather.Elevation=7dip
	PanelWeather.SetBackgroundImage(LoadBitmap(File.DirAssets,"home-weather-background.jpg"))
	HomePanel.AddView(PanelWeather,14dip, PanelMsgs.Top+PanelMsgs.Height+20dip ,HomePanel.Width-28dip,HomePanel.Height/2 + TafavoteSize)
	
	
	
	ParallaxDesign.Initialize
	PanelWeather.AddView(ParallaxDesign,-5dip,-5dip,PanelWeather.Width+10dip,PanelWeather.Height+10dip)
	ParallaxDesign.setMargins(PanelWeather.Height/2,PanelWeather.Width/2)
	ParallaxDesign.setMultipliers(1.4f,1.4f)
	ParallaxDesign.SetImageBitmap(LoadBitmap(File.DirAssets,"home-weather-background.jpg"))
	
'	Dim WeatherBG As ImageView
'	WeatherBG.Initialize("WeatherBG")
'	WeatherBG.Gravity=Gravity.FILL
'	WeatherBG.Bitmap=LoadBitmap(File.DirAssets,"home-weather-background.jpg")
'	WeatherBG.Gravity=Gravity.FILL
'	PanelWeather.AddView(WeatherBG,-30dip,-30dip,ScrollView2.Width,ScrollView2.Height)
	
	WeatherWV.Initialize("WeatherWV")
	WeatherWV.Color=Colors.Transparent
	WeatherWV.ZoomEnabled=False
	WeatherWV.LoadHtml("در حال بارگزاری")
	PanelWeather.AddView(WeatherWV,5dip,15dip,PanelWeather.Width-10dip,PanelWeather.Height-20dip)
	
	Dim WeatherHover As Label
	WeatherHover.Initialize("WeatherHover")
	PanelWeather.AddView(WeatherHover,-30dip,-30dip,100%x,100%y)
	
	AC.SetClickEffect(WeatherHover,True)
	
	
'	If GetDeviceLayoutValues.Height<1300 Then ' وقتی گوشی جی ال ایکس یا کوچیک تر بود
'		PanelMsgs.Height = 45%y
'		PanelWeather.Top = PanelMsgs.Top+PanelMsgs.Height+5%y
'		PanelWeather.Height = 48%y
''		ScrollView2.Panel.Height =PanelWeather.top + PanelWeather.Height + 16dip
'	End If
	
	
	''''''MultiMedia
	''''''MultiMedia
	''''''MultiMedia
	''''''MultiMedia
	''''''MultiMedia
	''''''MultiMedia
	''''''MultiMedia
	''''''MultiMedia
	''''''MultiMedia
	''''''MultiMedia
	''''''MultiMedia
	''''''MultiMedia
	''''''MultiMedia
	''''''MultiMedia
	''''''MultiMedia
	''''''MultiMedia
	''''''MultiMedia
	''''''MultiMedia
	''''''MultiMedia
	''''''MultiMedia
	''''''MultiMedia
	
	
	jobSingleVideo.Initialize("jobSingleVideo",Me)
	
	MultiMediaWv.Color=Colors.Transparent
	MultiMediaWv.ZoomEnabled=False
	MultiMediaWv.LoadUrl(SaeloZahra.site_url&"popularmedia")
	MultiMediaWv.Visible=False
	MultiMediaWv.Tag = "salam"
	
	
	
	''''''Bazarche
	''''''Bazarche
	''''''Bazarche
	''''''Bazarche
	''''''Bazarche
	''''''Bazarche
	''''''Bazarche
	''''''Bazarche
	''''''Bazarche
	''''''Bazarche
	''''''Bazarche
	''''''Bazarche
	''''''Bazarche
	''''''Bazarche
	''''''Bazarche
	''''''Bazarche
	''''''Bazarche
	''''''Bazarche
	

	mapProductName.Initialize
	If File.Exists(SaeloZahra.dir,"ProductName") Then
		mapProductName=File.ReadMap(SaeloZahra.dir,"ProductName")
	End If
	
	ClvBazarche.Initialize(Me, "ClvBazarche")
	Panel3.AddView(ClvBazarche.AsView,0,0,-1,-1)
	
	
	jobBazarche.Initialize("jobBazarche",Me)
	
	
	
	
	
	
	
	
	
	
	
	
	
	'Layout
	'Layout
	'Layout
	'Layout
	'Layout
	
	
	ActionBar.SetLayout(0,0,100%x,SaeloZahra.MaterialActionBarHeight)
	containerPanel.SetLayout(0,ActionBar.Height,100%x,100%y-AC.GetMaterialActionBarHeight-bottomNavigationPanel.Height+14dip)'bottomNavigationPanel.Top)
	MultiMediaWv.SetLayout(0,0,-1,-1)
	HomePanel.SetLayout(0,0,containerPanel.Width,containerPanel.Height)
	Panel3.SetLayout(0,0,-1,-1)
	
End Sub



Sub Activity_Resume
	
	Sleep(0)
	For i = 0 To ClvMsg.GetSize-1
		If ClvMsg.GetValue(i) == "وضعیت "&SaeloZahra.tarikheKhafan(DateTime.Now) Then ClvMsg.JumpToItem(i)
	Next
	
	If Not(ActionBar.IsInitialized) Or ActionBar.Height<20dip Then ExitApplication
	
	Try
		If File.Exists(SaeloZahra.dir,"UVIndex") Then
			UVIndex = File.ReadString(SaeloZahra.dir,"UVIndex")
		Else
			UVIndex = accuWeatherCronJobService.UVIndex
		End If
	Catch
		Log("UVIndex: "&UVIndex)
		Log(LastException)
	End Try
	
	Try
		If Not(File.Exists(SaeloZahra.Dir,"MinDama")) Then File.WriteString(SaeloZahra.Dir,"MinDama",0)
		If accuWeatherCronJobService.MinDama<1 Then accuWeatherCronJobService.MinDama = File.ReadString(SaeloZahra.Dir,"MinDama")
	Catch
		Log("MinDama: "&accuWeatherCronJobService.MinDama)
		Log(LastException)
	End Try
		
	Try
		If Not(File.Exists(SaeloZahra.Dir,"MaxDama")) Then File.WriteString(SaeloZahra.Dir,"MaxDama",0)
		If accuWeatherCronJobService.MaxDama<1 Then accuWeatherCronJobService.MaxDama = File.ReadString(SaeloZahra.Dir,"MaxDama")
	Catch
		Log("MaxDama: "&accuWeatherCronJobService.MaxDama)
		Log(LastException)
	End Try
	
	Try
		If Not(File.Exists(SaeloZahra.Dir,"NightIcon")) Then File.WriteString(SaeloZahra.Dir,"NightIcon",1)
		If accuWeatherCronJobService.NightIcon<1 Then accuWeatherCronJobService.NightIcon = File.ReadString(SaeloZahra.Dir,"NightIcon")
	Catch
		Log("NightIcon: "&accuWeatherCronJobService.NightIcon)
		Log(LastException)
	End Try

		
	Try
		If Not(File.Exists(SaeloZahra.Dir,"DayIcon")) Then File.WriteString(SaeloZahra.Dir,"DayIcon",1)
		If accuWeatherCronJobService.DayIcon<1 Then accuWeatherCronJobService.DayIcon = File.ReadString(SaeloZahra.Dir,"DayIcon")
	Catch
		Log("DayIcon: "&accuWeatherCronJobService.DayIcon)
		Log(LastException)
	End Try
	
		
	Try
		If Not(File.Exists(SaeloZahra.Dir,"NightShortPhrase")) Then File.WriteString(SaeloZahra.Dir,"NightShortPhrase","")
		If accuWeatherCronJobService.NightShortPhrase=="" Then accuWeatherCronJobService.NightShortPhrase = File.ReadString(SaeloZahra.Dir,"NightShortPhrase")
	Catch
		Log("NightShortPhrase: "&accuWeatherCronJobService.NightShortPhrase)
		Log(LastException)
	End Try
	
		
	Try
		If Not(File.Exists(SaeloZahra.Dir,"DayShortPhrase")) Then File.WriteString(SaeloZahra.Dir,"DayShortPhrase","")
		If accuWeatherCronJobService.DayShortPhrase=="" Then accuWeatherCronJobService.DayShortPhrase = File.ReadString(SaeloZahra.Dir,"DayShortPhrase")
	Catch
		Log("DayShortPhrase: "&accuWeatherCronJobService.DayShortPhrase)
		Log(LastException)
	End Try
		
	Try
		If Not(File.Exists(SaeloZahra.Dir,"NowWind")) Then File.WriteString(SaeloZahra.Dir,"NowWind","")
		If NowWind=="" Then NowWind = File.ReadString(SaeloZahra.Dir,"NowWind")
	Catch
		Log("NowWind: "&NowWind)
		Log(LastException)
	End Try
		
	Try
		If Not(File.Exists(SaeloZahra.Dir,"DayRainProbability")) Then File.WriteString(SaeloZahra.Dir,"DayRainProbability","0")
		If accuWeatherCronJobService.DayRainProbability==0 Then accuWeatherCronJobService.DayRainProbability = File.ReadString(SaeloZahra.Dir,"DayRainProbability")
	Catch
		Log("DayRainProbability: "&accuWeatherCronJobService.DayRainProbability)
		Log(LastException)
	End Try
		
	Try
		If Not(File.Exists(SaeloZahra.Dir,"RelativeHumidity")) Then File.WriteString(SaeloZahra.Dir,"RelativeHumidity","")
		If RelativeHumidity=="" Then RelativeHumidity = File.ReadString(SaeloZahra.Dir,"RelativeHumidity")
	Catch
		Log("RelativeHumidity: "&RelativeHumidity)
		Log(LastException)
	End Try
	
	buildWeatherHtml
	
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub





Sub tip_Click
	If TipState==1 Then
		TIP.Initialize("tip")
		TIP.setTitle(SaeloZahra.csb("بازارچـــــــه")).setButtonText(SaeloZahra.csb("بعدی")).setDescription(SaeloZahra.csb("تمام محصولاتی که برای فروش گذاشته میشوند در این بخش قرار دارند")).setTarget(ImageView3).build
		TIP.setDelay(313)
		TipState=2
		TIP.show
	else if TipState=2 Then
		TIP.Initialize("tip")
		TIP.setTitle(SaeloZahra.csb("فیلـــــــــم ها و محتوای آموزشی")).setButtonText(SaeloZahra.csb("بعدی")).setDescription(SaeloZahra.csb("اینجا میتونین به فیلم ها ، صوت ها و متن های آموزشی دسترسی داشته باشین")).setTarget(ImageView1).build
		TIP.setDelay(313)
		TipState="3"
		TIP.show
	else if TipState=3 Then
		ActionBar_NavigationItemClick
		TIP.Initialize("tip")
		TIP.setTitle(SaeloZahra.csb("امکانات بیشتر")).setButtonText(SaeloZahra.csb("بزن بریم")).setDescription(SaeloZahra.csb("برای ثبت محصولاتتون و دیدن امکانات دیگه نرم افزار این منو رو ببینید")).setTarget(lv).build
		TIP.setDelay(313)
		TipState="4"
		TIP.show
'	else if TipState=4 Then
'		TIP.Initialize("tip")
'		TIP.setTitle(SaeloZahra.csb("اهدای جوایز")).setButtonText(SaeloZahra.csb("بزن بریم")).setDescription(SaeloZahra.csb("اینجا میتونین کشاورزای دیگه رو به این نرم افزار دعوت کنین"&CRLF&"و به ازای هر نفری که نرم افزار رو نصب کنه جایزه بگیرید")).setTarget(Btn7).build
'		TIP.setDelay(313)
'		TipState="5"
'		TIP.show
	End If
End Sub


Sub lv_ItemClick (Position As Int, Value As Object)
	
	Select Value
		Case "share"
			
			Try
				ShareApp.startShare(SaeloZahra.r.GetActivity , "ارسال نرم افزار به دیگران")
			Catch
				Log(LastException)
				SaeloZahra.intent1.Initialize(SaeloZahra.intent1.ACTION_SEND,"")
				SaeloZahra.intent1.SetType("text/plain")
				SaeloZahra.intent1.PutExtra("android.intent.extra.TEXT", "نسخه آخر نرم افزار "&Application.LabelName&" را از "& CRLF & "mazraeyeman.ir/application"& CRLF & "دریافت کنید."& CRLF & "🌹🌷💐")
				SaeloZahra.intent1.WrapAsIntentChooser("اشتراک گذاری نرم افزار")
				StartActivity(SaeloZahra.intent1)
			End Try
	
		Case "karshenasan"
			customBrowser.CreateNewTab("https://mazraeyeman.ir/%d8%a8%d8%ae%d8%b4-%da%a9%d8%a7%d8%b1%d8%b4%d9%86%d8%a7%d8%b3%d8%a7%d9%86/")
			
		Case "sandoghbime"
			customBrowser.CreateNewTab("http://www.sbkiran.ir/")
			
		Case "sabtemahsool"
			SH.convertActivityFromTranslucent
			Starter.SliderPosition=0
			StartActivity(SabteMahsoolNewAct)
		Case "Weather"
			SH.convertActivityFromTranslucent
			Starter.SliderPosition=0
			StartActivity(WeatherNewAct)
		Case "Notification"
			SH.convertActivityFromTranslucent
			Starter.SliderPosition=0
			StartActivity(NotificationNewAct)
		Case "referral"
			SaeloZahra.SetAnimation("zoom_exit","zoom_enter")
'			referralAct.NewTheme=True
			StartActivity(referralAct)
		Case "unsubscribe"
			'TODO:Unsubscribe
			Main.oBillingManager.RemoveAccount
			ToastMessageShow("در حال حذف اشتراک ایرانسل",True)
			Sleep(3000)
			ExitApplication
		Case "exit"
			ExitApplication
			
	End Select
End Sub

#Region Init



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
	

Sub Activity_CreateMenu(Menu As ACMenu)

	sv.Initialize2("search", sv.THEME_DARK)
	sv.IconifiedByDefault = True
	
	Menu.Clear
	ActionBar.InitMenuListener
	
	sv.QueryHint=SaeloZahra.csb("جستجو در مطالب")
	si = Menu.Add2(1, 1, "جستجو", X1.GetDrawable("baseline_search_white_24") )
	si.SearchView = sv
'	Menu.Add2(2, 2, "بارگزاری مجدد", SaeloZahra.icon("gmd_refresh",2).Drawable )
	
	btn2lbl_Click
	
	
	
	
	
	
End Sub

Sub Actionbar_MenuItemClick (Item As ACMenuItem)
	Select Item.Id
'		Case 2
'			Refresh
	End Select
End Sub

Sub search_QuerySubmitted (Query As String)

	sv.Iconfied = True
	si.ItemCollapsed = True
	If sv.QueryHint == "جستجو در بازارچه" Then
		JobSearch.Download(SaeloZahra.json_url&"productfarmers_list.php?bazarche=yes&search=yes&field=title&s="&Query)
	Else
		JobSearch.Download(SaeloZahra.site_url&"wp-json/wp/v2/posts/?search="&Query)
	End If
	ProgressDialogShow(SaeloZahra.CSB("در حال جستجو"))
		
End Sub




Sub ActionBar_NavigationItemClick
	SM.ShowMenu
End Sub


'Sub Activity_KeyPress (KeyCode As Int) As Boolean
'	If KeyCode = KeyCodes.KEYCODE_BACK Then
'		If SM.Visible Then SM.HideMenus Else ActionBar_NavigationItemClick
'		Return True
'	Else
'		Return False
'	End If
'End Sub



Sub Dialog_ItemSelected (Dialog As MaterialDialog, Position As Int, Text As String)
	Dim ResultMap As Map = listSearchResults.Get(Position)
		LogColor($"Film Dasht ${listSearchHasVid.Get(Position)} Item Selected: ${Position} : ${Text}"$,Colors.Yellow)
	If listSearchHasVid.Get(Position)=="true" Or listSearchHasVid.Get(Position)=="True" Or listSearchHasVid.Get(Position)==True Then
		ProgressDialogShow(SaeloZahra.CSB("در حال بارگزاری فیلم"))
		jobSingleVideo.Download(SaeloZahra.site_url&"wp-json/wp/v2/posts/"&ResultMap.Get("id"))
	End If
		
	
	ToastMessageShow(listSearchHasVid.Get(Position), False)

End Sub

Sub Dialog_SimpleItemSelected (Dialog As MaterialDialog, Position As Int, Item As MaterialSimpleListItem)
	Dim ResultMap As Map = listSearchResults.Get(Position)
	ToastMessageShow(Item.Content, False)
	If listSearchHasVid.Get(Position)=="true" Or listSearchHasVid.Get(Position)=="True" Or listSearchHasVid.Get(Position)==True Then
		ProgressDialogShow(SaeloZahra.CSB("در حال بارگزاری فیلم"))
		jobSingleVideo.Download(SaeloZahra.site_url&"wp-json/wp/v2/posts/"&ResultMap.Get("id"))
	Else
		SingleNewAct.post_id = ResultMap.Get("id")
		SingleNewAct.caption_str = ResultMap.Get("title")
		SingleNewAct.content_str = ResultMap.Get("content")
		SingleNewAct.video_str = ResultMap.Get("video")
		StartActivity(SingleNewAct)
	End If
	Dialog.Dismiss
End Sub



Sub JobDone (Job As HttpJob)
	
	ProgressDialogHide
	LogColor(Job.JobName&"    ,    "&Job.Success,Colors.Magenta)

	Dim NotEmptyJob As Boolean = True
	If Job.Success Then
		If Job.GetString =="" Then NotEmptyJob=False Else NotEmptyJob=True
		If Job.GetString.Contains("The allowed number of requests has been exceeded.") Then NotEmptyJob=False
	End If
	
	If Job.Success And NotEmptyJob Then
    
		Select Job.JobName
			
			Case "JobSearch"
				If Job.GetString=="{""result"":""not found""}" Or Job.GetString == "[]" Then
					Snake.Initialize("snakeSearch",Activity,SaeloZahra.CSB("هیچ نتیجه ای یافت نشد"),2000)
					Snake.SetAction(SaeloZahra.CSB("جستجوی مجدد"))
					Snake.Show
				Else
					
					
					Dim parser As JSONParser
					parser.Initialize(Job.GetString)
					If sv.QueryHint == "جستجو در بازارچه" Then
							
						PlaceList.Initialize
						Dim rootBazarche As List = parser.NextArray
						For Each colrootBazarche As Map In rootBazarche
							
							Dim image_url As String
							If colrootBazarche.Get("pic")<>"" Then
								image_url = SaeloZahra.site_url&"reseller/fileupload/product/"&colrootBazarche.Get("pic")
							Else
								image_url = "http://melkamlak.com/melk_pic/32438/bpic32438.jpg"
							End If
							
							Dim url As String = SaeloZahra.site_url&"user/id/"&colrootBazarche.Get("id")&"/simple"
							
							If mapProductName.ContainsKey(colrootBazarche.Get("product")) Then colrootBazarche.Put( "product" , mapProductName.Get(colrootBazarche.Get("product")) )
							
							ClvBazarche.Add(CreateListItem(colrootBazarche.Get("id"),colrootBazarche.Get("vazn")&" تن "&colrootBazarche.Get("product"),"ارائه در "&colrootBazarche.Get("zaman_eraa"),image_url,url),listItemHeightBazarche+22,colrootBazarche)
							
							PlaceList.Add(colrootBazarche)
							
						Next
					Else
						
						Dim Builder As MaterialDialogBuilder
						Builder.Initialize("Dialog")
						Builder.Icon(X1.GetDrawable("baseline_search_black_24"))
						Builder.Title(SaeloZahra.CSB("نتیجه جستجو"))
						Builder.Typeface(SaeloZahra.fontBold,SaeloZahra.font)
						Dim root1 As List = parser.NextArray
						Dim shomareyeNatije As Int = 0
						Dim SearchResults(root1.Size) As String
						listSearchResults.Initialize
						listSearchHasVid.Initialize
						For Each rootSearch As Map In root1
							Dim title As Map = rootSearch.Get("title")
								Dim titlerendered As String = title.Get("rendered")
								SearchResults(shomareyeNatije) = titlerendered
								shomareyeNatije =shomareyeNatije+1
							Dim jetpack_featured_media_url As String = rootSearch.Get("jetpack_featured_media_url")
							Dim video As String = rootSearch.Get("video")
							Dim excerpt As Map = rootSearch.Get("excerpt")
								Dim excerptrendered As String = excerpt.Get("rendered")
			'				Dim videolenght As String = rootSearch.Get("videolenght")
			'				Dim view As String = rootSearch.Get("view")
							
							Dim content As Map = rootSearch.Get("content")
							Dim contentrendered As String = content.Get("rendered")
		'					Dim protected As String = content.Get("protected")


'							Dim categories As List = rootSearch.Get("categories")
'							For Each colcategories As Int In categories
'							Next
							listSearchResults.Add(CreateMap("id":rootSearch.Get("id"),"title":titlerendered,"excerpt":excerptrendered,"content":contentrendered,"video":video,"image":jetpack_featured_media_url))
							
							ToastMessageShow(titlerendered,False)
							If video.Length>20 Then
								listSearchHasVid.Add(True)
								msi.Initialize2("outline_video_library_black_24" , titlerendered)
							Else
								listSearchHasVid.Add(False)
								msi.Initialize2("outline_file_copy_black_24" 	 , titlerendered)
							End If
							msi.BackgroundColor = Colors.White 'Rnd(Colors.White,SaeloZahra.NewColorLight)
							Builder.AddSimpleItem(msi)
			
						Next
						
'						TODO:ErrorBareDovvom
'						msi.Initialize2("outline_file_copy_black_24", "username@gmail.com")
'						msi.BackgroundColor = Colors.White
'						Builder.AddSimpleItem(msi)
'			
'						msi.Initialize2("outline_video_library_black_24", "user02@gmail.com")
'						msi.BackgroundColor = Colors.White
'						Builder.AddSimpleItem(msi)
'			
'						msi.Initialize2("outline_file_copy_black_24", "Add account")
'						msi.IconPadding=8dip
'						Builder.AddSimpleItem(msi)
'			
'						Builder.Items(SearchResults)
'						Builder.ItemsCallback
						Builder.NegativeText("بازگشت")
						Builder.Show
	
					End If

				End If
			Case "jobSingleVideo"
				Dim parser As JSONParser
				parser.Initialize(Job.GetString)
				Dim rootVid As Map = parser.NextObject
				Dim title As Map = rootVid.Get("title")
					Dim titlerendered As String = title.Get("rendered")
'				Dim jetpack_featured_media_url As String = rootVid.Get("jetpack_featured_media_url")
				Dim video As String = rootVid.Get("video")
'				Dim videolenght As String = rootVid.Get("videolenght")
'				Dim view As String = rootVid.Get("view")
				
				Dim content As Map = rootVid.Get("content")
					Dim contentrendered As String = content.Get("rendered")
'					Dim protected As String = content.Get("protected")
'				Dim categories As List = rootVid.Get("categories")

'				Dim excerpt As Map = rootVid.Get("excerpt")
'					Dim excerptrendered As String = excerpt.Get("rendered")

'				For Each colcategories As Int In categories
'				Next
				
				VideoNewAct.pageTitle=titlerendered
				If video.Length>20 Then
					VideoNewAct.VidUrl=video
					StartActivity(VideoNewAct)
				Else
					SingleNewAct.post_id = rootVid.Get("id")
					SingleNewAct.caption_str = titlerendered
					SingleNewAct.content_str = contentrendered
					SingleNewAct.video_str = ""
					StartActivity(SingleNewAct)
				End If
				
			Case "jobBazarche"
				
				ClvBazarche.Clear
				
				If Job.GetString=="{""result"":""not found""}" Or Job.GetString=="" Or Job.GetString =="""not found""" Then
					
					ClvBazarche.Add(CreateListItem(1,"در بازارچه محصولی موجود نیست","برای افزودن محصول کلیک کنید","http://melkamlak.com/melk_pic/32438/bpic32438.jpg",""),listItemHeightBazarche+22,"")
						
					Snake.Initialize("snake",Activity,SaeloZahra.CSB("نتیجه ای یافت نشد"),Snake.DURATION_LONG)
					Snake.Show
					
				Else
					
					PlaceList.Initialize
					
					Dim parser As JSONParser
					parser.Initialize(Job.GetString)
					Dim rootBazarche As List = parser.NextArray
					For Each colroot As Map In rootBazarche
						
						Dim image_url As String
						If colroot.Get("pic")<>"" Then
							image_url = SaeloZahra.site_url&"reseller/fileupload/product/"&colroot.Get("pic")
						Else
							image_url = "http://melkamlak.com/melk_pic/32438/bpic32438.jpg"
						End If
						
						Dim url As String = SaeloZahra.site_url&"user/id/"&colroot.Get("id")&"/simple"
						
						If mapProductName.ContainsKey(colroot.Get("product")) Then colroot.Put( "product" , mapProductName.Get(colroot.Get("product")) )
						
						ClvBazarche.Add(CreateListItem(colroot.Get("id"),colroot.Get("vazn")&" تن "&colroot.Get("product_title"),"ارائه در "&colroot.Get("zaman_eraa"),image_url,url),listItemHeightBazarche+22,colroot)
						
						PlaceList.Add(colroot)
						
					Next

				End If
			Case "JobGet12Hour"
				
				Next12HWindha.Initialize
				Next12HDamaha.Initialize
				Next12HFaghatDama.Initialize
				
				Dim Shomarande As Int = 0
				Dim Zouj As Boolean = True
				
				Dim parser2 As JSONParser
				parser2.Initialize(Job.GetString)
				Dim root12Hour As List = parser2.NextArray
				For Each colroot As Map In root12Hour
					
					Shomarande=Shomarande+1
					
					If Zouj Then Zouj = False Else Zouj = True
					If Not(Zouj) Then Continue
					
'					Dim ThisDateTime As String = colroot.Get("DateTime")
					Dim EpochDateTime As Long = colroot.Get("EpochDateTime")
					Dim WeatherIcon As String = colroot.Get("WeatherIcon")
					
					RelativeHumidity = colroot.Get("RelativeHumidity")
					File.WriteString(SaeloZahra.Dir,"RelativeHumidity",RelativeHumidity)
					WeatherWV.LoadHtml(buildWeatherHtml)
					
'					Dim CloudCover As Int = colroot.Get("CloudCover")
					UVIndex = colroot.Get("UVIndexText")
					File.WriteString(SaeloZahra.dir,"UVIndex",UVIndex)
					Dim DewPoint As Map = colroot.Get("DewPoint")
					DewPointValue = DewPoint.Get("Value")
'					Dim Ice As Map = colroot.Get("Ice")
'					Dim IceValue As Double = Ice.Get("Value")
					Dim Snow As Map = colroot.Get("Snow")
					SnowValue = Snow.Get("Value")
					Dim Rain As Map = colroot.Get("Rain")
					RainValue = Rain.Get("Value")
					Dim Wind As Map = colroot.Get("Wind")
					Dim WindSpeed As Map = Wind.Get("Speed")
					WindSpeedValue = WindSpeed.Get("Value")
					NowWind = "<b>"&WindSpeedValue&"</b>" & "<small style='font-size:10%'>KM/H</small>"
					File.WriteString(SaeloZahra.Dir,"NowWind",NowWind)
					
					Dim Temperature As Map = colroot.Get("Temperature")
					Dim TemperatureValue As Double = Temperature.Get("Value")
					
'					Dim PrecipitationProbability As Int = colroot.Get("PrecipitationProbability")
'					RainProbability = RainProbability + colroot.Get("RainProbability")
'					IceProbability  = IceProbability  + colroot.Get("IceProbability")
'					SnowProbability = SnowProbability + colroot.Get("SnowProbability")
'					Dim WindGust As Map = colroot.Get("WindGust")
'					Dim WindGustSpeed As Map = WindGust.Get("Speed")
'					Dim WindGustSpeedValue As Double = WindGustSpeed.Get("Value")
					
					Next12HWindha.Add(CreateMap("title":"ساعت "&DateTime.GetHour(EpochDateTime&"000"),"value":WindSpeedValue,"image":WeatherIcon&".png"))
					Next12HDamaha.Add(CreateMap("title":"ساعت "&DateTime.GetHour(EpochDateTime&"000"),"value":TemperatureValue,"image":WeatherIcon&".png"))
					Next12HFaghatDama.Add(TemperatureValue)
					
				Next
				
				
				LogColor("Load 12H Complete",Colors.Yellow)
				
				
		End Select
				
	Else
		
		If SaeloZahra.CheckConnection Then Log("Error: " & Job.ErrorMessage)
	
		If Job.JobName=="JobGet12Hour" And  Job.GetString.Contains("The allowed number of requests has been exceeded.") Then
			
			Log("GetString: "&Job.GetString)
			Log("The allowed number of requests has been exceeded.  Api Jadid Begir")
			Sleep(3000)
'			Select Rnd(2,6)
'				Case 2
'					JobGet12Hour.Download(	"http://newserver.mazraeyeman.ir/mazraeyeman_proxy.php?url="&SaeloZahra.EncodeUrl("http://dataservice.accuweather.com/forecasts/v1/hourly/12hour/"&accuWeatherCronJobService.RegionCode&"?metric=true&details=true&language=fa-ir&apikey="&accuWeatherCronJobService.ApiAccuWeather2)&"&amirTime="&DateTime.Now)
'					Log("Downloading: "&	"http://newserver.mazraeyeman.ir/mazraeyeman_proxy.php?url="&SaeloZahra.EncodeUrl("http://dataservice.accuweather.com/forecasts/v1/hourly/12hour/"&accuWeatherCronJobService.RegionCode&"?metric=true&details=true&language=fa-ir&apikey="&accuWeatherCronJobService.ApiAccuWeather2)&"&amirTime="&DateTime.Now)
'				Case 3
'					JobGet12Hour.Download(	"http://newserver.mazraeyeman.ir/mazraeyeman_proxy.php?url="&SaeloZahra.EncodeUrl("http://dataservice.accuweather.com/forecasts/v1/hourly/12hour/"&accuWeatherCronJobService.RegionCode&"?metric=true&details=true&language=fa-ir&apikey="&accuWeatherCronJobService.ApiAccuWeather3)&"&amirTime="&DateTime.Now)
'					Log("Downloading: "&	"http://newserver.mazraeyeman.ir/mazraeyeman_proxy.php?url="&SaeloZahra.EncodeUrl("http://dataservice.accuweather.com/forecasts/v1/hourly/12hour/"&accuWeatherCronJobService.RegionCode&"?metric=true&details=true&language=fa-ir&apikey="&accuWeatherCronJobService.ApiAccuWeather3)&"&amirTime="&DateTime.Now)
'				Case 4
'					JobGet12Hour.Download(	"http://newserver.mazraeyeman.ir/mazraeyeman_proxy.php?url="&SaeloZahra.EncodeUrl("http://dataservice.accuweather.com/forecasts/v1/hourly/12hour/"&accuWeatherCronJobService.RegionCode&"?metric=true&details=true&language=fa-ir&apikey="&accuWeatherCronJobService.ApiAccuWeather4)&"&amirTime="&DateTime.Now)
'					Log("Downloading: "&	"http://newserver.mazraeyeman.ir/mazraeyeman_proxy.php?url="&SaeloZahra.EncodeUrl("http://dataservice.accuweather.com/forecasts/v1/hourly/12hour/"&accuWeatherCronJobService.RegionCode&"?metric=true&details=true&language=fa-ir&apikey="&accuWeatherCronJobService.ApiAccuWeather4)&"&amirTime="&DateTime.Now)
'				Case 5
'					JobGet12Hour.Download(	"http://newserver.mazraeyeman.ir/mazraeyeman_proxy.php?url="&SaeloZahra.EncodeUrl("http://dataservice.accuweather.com/forecasts/v1/hourly/12hour/"&accuWeatherCronJobService.RegionCode&"?metric=true&details=true&language=fa-ir&apikey="&accuWeatherCronJobService.ApiAccuWeather5)&"&amirTime="&DateTime.Now)
'					Log("Downloading: "&	"http://newserver.mazraeyeman.ir/mazraeyeman_proxy.php?url="&SaeloZahra.EncodeUrl("http://dataservice.accuweather.com/forecasts/v1/hourly/12hour/"&accuWeatherCronJobService.RegionCode&"?metric=true&details=true&language=fa-ir&apikey="&accuWeatherCronJobService.ApiAccuWeather5)&"&amirTime="&DateTime.Now)
'				Case Else
					JobGet12Hour.Download(	"http://newserver.mazraeyeman.ir/mazraeyeman_proxy.php?url="&SaeloZahra.EncodeUrl("http://dataservice.accuweather.com/forecasts/v1/hourly/12hour/"&accuWeatherCronJobService.RegionCode&"?metric=true&details=true&language=fa-ir&apikey="&accuWeatherCronJobService.ApiAccuWeather)&"&amirTime="&DateTime.Now)
					Log("Downloading: "&	"http://newserver.mazraeyeman.ir/mazraeyeman_proxy.php?url="&SaeloZahra.EncodeUrl("http://dataservice.accuweather.com/forecasts/v1/hourly/12hour/"&accuWeatherCronJobService.RegionCode&"?metric=true&details=true&language=fa-ir&apikey="&accuWeatherCronJobService.ApiAccuWeather)&"&amirTime="&DateTime.Now)
'			End Select
			
		End If
		
	End If
    
	Job.Release
	
End Sub


Sub MultiMediaWv_OverrideUrl (Url As String) As Boolean
	If MultiMediaWv.Tag <> "salam" Then ProgressDialogShow2(SaeloZahra.CSB("در حال بارگزاری رسانه ها"),True)
	MultiMediaWv.Tag = "bia"
	Log(Url)
	If Url=="http://porbazdid/" Then
		Return True
	else If Url=="http://porbahs/" Then
		Return True
	else If Url.Contains("http://cat_id:") Then
		ToastMessageShow( Url.Replace("http://cat_id:","").Replace("/",""),True)
		Return True
	
	else If Url.Contains("http://singleid:") Then
		ProgressDialogShow(SaeloZahra.CSB("در حال بارگزاری فیلم"))
		jobSingleVideo.Download(SaeloZahra.site_url&"wp-json/wp/v2/posts/"&Url.Replace("http://singleid:","").Replace("/",""))
		Return True
	Else
		Return False
	End If
End Sub

Sub MultiMediaWv_PageFinished (Url As String)
	ProgressDialogHide
End Sub

Sub btn3lbl_Click
	
	sv.QueryHint=SaeloZahra.CSB("جستجو در بازارچه")
	
	MultiMediaWv.SetVisibleAnimated(30,False)
	HomePanel.SetVisibleAnimated(30,False)
	Panel3.SetVisibleAnimated(110,True)
	
	btn3lbl.Color=SaeloZahra.NewColor
	btn2lbl.Color=Colors.White
	btn1lbl.Color=Colors.White
	
	btn3lbl.textColor=Colors.White
	btn2lbl.textColor=Colors.DarkGray
	btn1lbl.textColor=Colors.DarkGray
	
	ImageView3.Bitmap=LoadBitmapResize(File.DirAssets,"icon3hover.png",ImageView2.Width/2,ImageView2.Height,True)
	ImageView2.Bitmap=LoadBitmapResize(File.DirAssets,"icon2.png",ImageView2.Width/2,ImageView2.Height,True)
	ImageView1.Bitmap=LoadBitmapResize(File.DirAssets,"icon1.png",ImageView2.Width/2,ImageView2.Height,True)
	
	LogColor("ClvBazarche.GetSize: "&ClvBazarche.GetSize,Colors.Yellow)
	If ClvBazarche.GetSize<2 Then
		jobBazarche.Download(SaeloZahra.json_url&"productfarmers_list.php?bazarche=yes")
		ProgressDialogShow(SaeloZahra.CSB("در حال بارگزاری..."))
	End If
	
End Sub

Sub btn2lbl_Click
	
	sv.QueryHint=SaeloZahra.CSB("جستجو در سایت")
	
	MultiMediaWv.SetVisibleAnimated(30,False)
	HomePanel.SetVisibleAnimated(110,True)
	Panel3.SetVisibleAnimated(110,False)
	
	btn2lbl.Color=SaeloZahra.NewColor
	btn1lbl.Color=Colors.White
	btn3lbl.Color=Colors.White
	
	btn2lbl.textColor=Colors.White
	btn1lbl.textColor=Colors.DarkGray
	btn3lbl.textColor=Colors.DarkGray
	
	ImageView2.Bitmap=LoadBitmapResize(File.DirAssets,"icon2hover.png",ImageView2.Width/2,ImageView2.Height,True)
	ImageView1.Bitmap=LoadBitmapResize(File.DirAssets,"icon1.png",ImageView2.Width/2,ImageView2.Height,True)
	ImageView3.Bitmap=LoadBitmapResize(File.DirAssets,"icon3.png",ImageView2.Width/2,ImageView2.Height,True)
	
End Sub

Sub btn1lbl_Click
	
	sv.QueryHint=SaeloZahra.CSB("جستجو در رسانه ها")
	
	MultiMediaWv.LoadUrl(SaeloZahra.site_url&"popularmedia")
	
	MultiMediaWv.SetVisibleAnimated(110,True)
	HomePanel.SetVisibleAnimated(30,False)
	Panel3.SetVisibleAnimated(30,False)
	
	btn1lbl.Color=SaeloZahra.NewColor
	btn3lbl.Color=Colors.White
	btn2lbl.Color=Colors.White

	btn1lbl.textColor=Colors.White
	btn3lbl.textColor=Colors.DarkGray
	btn2lbl.textColor=Colors.DarkGray
	
	ImageView1.Bitmap=LoadBitmapResize(File.DirAssets,"icon1hover.png",ImageView2.Width/2,ImageView2.Height,True)
	ImageView2.Bitmap=LoadBitmapResize(File.DirAssets,"icon2.png",ImageView2.Width/2,ImageView2.Height,True)
	ImageView3.Bitmap=LoadBitmapResize(File.DirAssets,"icon3.png",ImageView2.Width/2,ImageView2.Height,True)
	
End Sub


Sub snakeSearch_Click()
	sv.Submit
End Sub


#End Region




#Region Weather



Sub buildWeatherHtml As String
	Try
		
		Dim Night As Boolean = False
		Select DateTime.GetHour(DateTime.Now)
			Case 17,18,19,20,21,22,23,0,1,2,3,4,5
				Night=True
			Case 6,7,8,9,10,11,12,13,14,15,16,17
				Night=False
		End Select
		
'		//background-image:url(file:///android_asset/home-weather-background.jpg);
		Dim CSS As String = "<style>"& _
		"@import 'https://cdn.rawgit.com/rastikerdar/samim-font/v3.1.0/dist/font-face.css';"& _
		"*,body,html{font-family:'Samim';margin:auto;direction:rtl;}"& _
		" body{background-size:cover;position:relative;} "& _
		" .topbox{position:absolute;left:0;top:0;width:100%;height:50%;} "& _
		" .bottombox{position:absolute;left:0;bottom:5%;width:100%;height:45%;padding-top:4%;border-top:1px solid rgba(1,1,1,0.1)} "& _
		" .row,.col1{width:100%;float:right; height:auto;} "& _
		" .col4{width:25%;float:right;position:relative;font-size:90%;} "& _
		" .whitespace{float:right;white-space: nowrap;text-overflow: ellipsis;overflow: hidden;font-size:88%;text-align:center;} "& _
		" .adadeshe{width:100%; white-space: nowrap; text-overflow: ellipsis; overflow: hidden; font-size:90%; text-align:center; position:absolute; top:30px;} "& _
		" .topDama{direction:rtl; width:45px;min-height:100px; font-size:100%; color:white; text-align:center; float:right; background-image:url('file:///android_asset/topdama.png'); background-size:cover; border-radius:10px; position:relative; margin-right:12px; } "& _
		" .balayish_topdama{line-height:2; padding-top:5px; width:100%;height:50%; position:absolute; top:0% ; right:0;} "& _
		" .payinish_topdama{line-height:2; padding-top:8px; width:100%;height:50%; position:absolute; top:50%; right:0;} "& _
		" .bottombox .col4 img{transform: scale(4.5);} "& _
		" .topDamaMiangin{float:left; width:145px; text-align:center; margin-top:-10px; } "& _
		" .balayish_topdamaMiangin{ font-size:240%;} "& _
		" .JoziateBishtar{ text-align:center; color:ccc; bottom:0px; left:0; width:100%;position:absolute; font-size:90%; } "& _
		" .likeBtn{ display:inline-block;border-radius:8px; color:white;padding:2px 10px;margin:3px 14px;font-size:80%;background: #aac1c9; /* Old browsers */background: -moz-linear-gradient(-45deg,  #aac1c9 0%, #94a8af 100%); /* FF3.6-15 */background: -webkit-linear-gradient(-45deg,  #aac1c9 0%,#94a8af 100%); /* Chrome10-25,Safari5.1-6 */background: linear-gradient(135deg,  #aac1c9 0%,#94a8af 100%); /* W3C, IE10+, FF16+, Chrome26+, Opera12+, Safari7+ */filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#aac1c9', endColorstr='#94a8af',GradientType=1 );}</style>"
		
		
		Next12HFaghatDama.Sort(True)
		
		
		Dim miangineDamaInt As Int = (accuWeatherCronJobService.MinDama+accuWeatherCronJobService.MaxDama)/2
		
		Dim tarikhesh As String = "<div class='likeBtn' style='float:right;'>"&SaeloZahra.tarikheKhafan(DateTime.Now)&"</div>"
		Dim shahresh As String = "<div class='likeBtn' style='float:left;'>"&File.ReadMap(SaeloZahra.dir,"user.dat").Get("city")&"</div>"
		
		Dim TopDama As String = "<div class='topDama'><div class='balayish_topdama'>"&SaeloZahra.ConvertPersian(accuWeatherCronJobService.MaxDama)&"°</div><div class='payinish_topdama'>"&SaeloZahra.ConvertPersian(accuWeatherCronJobService.MinDama)&"°</div></div>"
		
		Dim Damasanj As String   = "<img style='float:right;max-width:40px;max-height:180px; margin-top:10px;margin-right:13px;' src='file:///android_asset/home-weather-1.png'>"
		
		
		
		If Night Then
			Dim AkseVaziat As String = "<img style='float:left;max-width:50px;max-height:180px; margin-top:20px; margin-left:10px;' src='file:///android_asset/"&accuWeatherCronJobService.NightIcon&".png'>"
		Else
			Dim AkseVaziat As String = "<img style='float:left;max-width:50px;max-height:180px; margin-top:20px; margin-left:10px;' src='file:///android_asset/"&accuWeatherCronJobService.DayIcon  &".png'>"
		End If
		
		If Night Then
			Dim TopDamaMiangin As String = "<div class='topDamaMiangin' ><div class='balayish_topdamaMiangin row' >"&SaeloZahra.ConvertPersian(miangineDamaInt)&"°</div><div class='payinish_vaziat whitespace row'>"&accuWeatherCronJobService.NightShortPhrase&"</div></div>"
		Else
			Dim TopDamaMiangin As String = "<div class='topDamaMiangin' ><div class='balayish_topdamaMiangin row' >"&SaeloZahra.ConvertPersian(miangineDamaInt)&"°</div><div class='payinish_vaziat whitespace row'>"&accuWeatherCronJobService.DayShortPhrase&"</div></div>"
		End If
		
		
		
		Dim TopBox As String 	= "<div class='topbox'><div class='row' style='margin-top:-5px;padding-bottom:5px;'>"&tarikhesh&shahresh&"</div><div class='row' style='padding:top:5px;'>"&TopDama&Damasanj&AkseVaziat&TopDamaMiangin&" </div></div>"
		
		
		
		Dim bottomRows As String = "<div class='col4' style='float:left;'><img class='row' src='"&FindDarsadImage(NowWind)&"'><div class='adadeshe'>"&SaeloZahra.ConvertPersian(NowWind)&"</div><div class='row whitespace'>باد</div></div>"
		bottomRows 	  = bottomRows&"<div class='col4' style='float:left;'><img class='row' src='"&FindDarsadImage(accuWeatherCronJobService.DayRainProbability)&"'><div class='adadeshe'>"&SaeloZahra.ConvertPersian(accuWeatherCronJobService.DayRainProbability)&"%</div><div class='row whitespace'>احتمال بارش</div></div>"
		bottomRows 	  = bottomRows&"<div class='col4' style='float:left;'><img class='row' src='"&FindDarsadImage(UVIndex)&"'><div class='adadeshe'>"&SaeloZahra.ConvertPersian(UVIndex)&"</div><div class='row whitespace'>UV</div></div>"
		bottomRows 	  = bottomRows&"<div class='col4' style='float:left;'><img class='row' src='"&FindDarsadImage(RelativeHumidity)&"'><div class='adadeshe'><b>"&SaeloZahra.ConvertPersian(RelativeHumidity)&"</b><small>%</small></div><div class='row whitespace'>رطوبت</div></div>"
		
		
		
		Dim BottomBox As String = "<div class='bottombox'>"&bottomRows&"</div>"
		
		Dim JoziateBishtar As String = "<div class='JoziateBishtar'  >جزئیات بیـــــشتر</div>"
		
		Dim Html As String = CSS&"<html style='overflow:hidden;'><body style='overflow:hidden;' >"&TopBox&BottomBox&JoziateBishtar&"</body></html>"
		
		Return Html
	Catch
		Return "خطا در دریافت اطلاعات"
		Log(LastException)
	End Try
	
End Sub



Sub FindDarsadImage(adad As String) As String
	Try
		If adad = "" Then adad = 5
		
		adad = adad.Replace("km/h","").Replace("%","").Replace("<b>","").Replace("</b>","").Replace("<small style='font-size:12'></small>","")
		
		Dim dada As Int = 1
		
		'if String
		Select adad
			Case "پائین","کم","پایین","low"
				dada = 2
			Case "متوسط","medium"
				dada = 5
			Case "بالا","زیاد","hight"
				dada = 9
		End Select
		
		If dada>1 Then Return "file:///android_asset/darsad_"&dada&".svg"
		
		'if Adad
		dada = SaeloZahra.parseInt(adad)
		
		If dada >10 Then
			dada = SaeloZahra.parseInt(dada/10)
		End If
		
		If dada = 0 Then
			dada = 1
		else if dada>10 Then
			dada = 10
		End If
		If SaeloZahra.Debug Then LogColor("adad: "&adad&"    dada: "&dada&"     round: "&Round2(dada,0),Colors.Blue)
		
		dada = Round2(dada,0)
		
		
		Return "file:///android_asset/darsad_"&dada&".svg"
	
	Catch
		Log(LastException)
		Return "file:///android_asset/darsad_5.svg"
	End Try
End Sub

Sub WeatherHover_Click
	
	SH.convertActivityFromTranslucent
	Starter.SliderPosition=0
	
	StartActivity(WeatherNewAct)
	
End Sub


#End Region




#Region MSG

Sub CreateListItemMsg(id_cli As String,Title_cli As String,content_cli As String,TypeCli As String,time_cli As String, Icon_cli As Int, Color_cli As Int) As Panel
	
	If Zouj Then Zouj=False Else Zouj = True
	
	Dim p_view As Panel
	p_view.Initialize("")
	
	Dim gdr As GradientDrawable
	gdr.Initialize("TR_BL", Array As Int(Colors.White, Colors.White))'0xFFEeEeEe))
		
	If Title_cli == "وضعیت "&SaeloZahra.tarikheKhafan(DateTime.Now) Then
		gdr.Initialize("TR_BL", Array As Int(SaeloZahra.NewColor, SaeloZahra.NewColorLight))
	End If
'	gdr.CornerRadius = 8dip
	
	p_view.Background=gdr
'	p_view.Elevation=8dip
'	p_view.Padding = Array As Int(5dip,2dip,5dip,2dip)

	
	Dim ImgCoverLbl As Label
	ImgCoverLbl.Initialize("ImgCoverLbl")
	If Zouj Then ImgCoverLbl.Color = SaeloZahra.NewColor Else ImgCoverLbl.Color = SaeloZahra.NewColorDark
	p_view.AddView( ImgCoverLbl, PanelMsgs.Width-listItemHeightMSG,0,listItemHeightMSG,listItemHeightMSG)
	
	
	Dim CdBubble As ColorDrawable
	
	Dim ImgCoverBubbleLbl As Label
	ImgCoverBubbleLbl.Initialize("ImgCoverBubbleLbl")
	If Zouj Then CdBubble.Initialize(SaeloZahra.NewColor,14dip) Else CdBubble.Initialize(SaeloZahra.NewColorDark,14dip)
	ImgCoverBubbleLbl.Color=Color_cli
	ImgCoverBubbleLbl.Background=CdBubble
	p_view.AddView( ImgCoverBubbleLbl, PanelMsgs.Width-listItemHeightMSG-12dip,(listItemHeightMSG/2)-12dip,24dip,24dip)
	
	
	Dim CdLittleBubble As ColorDrawable
	CdLittleBubble.Initialize2(Color_cli,10dip,2dip,Colors.White)
	
	Dim ImgCoverLittleBubbleLbl As Label
	ImgCoverLittleBubbleLbl.Initialize("ImgCoverLittleBubbleLbl")
	ImgCoverLittleBubbleLbl.Background=CdLittleBubble
	p_view.AddView( ImgCoverLittleBubbleLbl, PanelMsgs.Width-listItemHeightMSG-7dip,(listItemHeightMSG/2)-7dip,14dip,14dip)
	
	Dim Image_IV As ImageView
	Image_IV.Initialize("image_wv")
	Image_IV.Gravity=Gravity.CENTER
'	If File.Exists(File.DirAssets,Icon_cli) Then Image_IV.Bitmap = LoadBitmapResize(File.DirAssets,Type_cli,list_item_height/1.5,list_item_height/1.5,True) Else  Image_IV.Bitmap = LoadBitmapResize(File.DirAssets,"taajob-icon.png",list_item_height/1.5,list_item_height/1.5,True)
	Image_IV.Bitmap = SaeloZahra.FindWeatherImg(Icon_cli).Resize(listItemHeightMSG/1.5,listItemHeightMSG/1.5,True)
	p_view.AddView( Image_IV , PanelMsgs.Width - listItemHeightMSG , 0 , listItemHeightMSG , listItemHeightMSG )
	
	
	Dim lbl_caption As Label
	lbl_caption.Initialize("lbl_caption")
	lbl_caption.Gravity = Bit.Or(Gravity.RIGHT,Gravity.CENTER_VERTICAL)
	lbl_caption.TextSize = 1
	lbl_caption.Tag = id_cli
	lbl_caption.Text = Title_cli
	lbl_caption.SetTextSizeAnimated(555,15)
	lbl_caption.Typeface = SaeloZahra.font
	lbl_caption.TextColor = Colors.Black
	lbl_caption.SingleLine=True
	lbl_caption.Ellipsize="END"
	p_view.AddView( lbl_caption , 2dip , 2dip , PanelMsgs.Width - listItemHeightMSG - 24dip ,35dip )
	
	Dim WVText As WebView
	WVText.Initialize("WVText")
	WVText.Color = Colors.Transparent
	WVText.ZoomEnabled=False
	WVText.Tag = id_cli
	content_cli=content_cli.Replace("<br>"," ")
	content_cli=content_cli.Replace("<br>"," ")
	WVText.LoadHtml("<style>@import 'https://cdn.rawgit.com/rastikerdar/samim-font/v3.1.0/dist/font-face.css'; *,body,html{font-family:'Samim';margin:auto;} .div{ direction:rtl; width:100%;float:left;height:100%;font-size:10px;}</style><div class='div'>"&SaeloZahra.PlainText(content_cli)&"</div>")
	p_view.AddView( WVText , 2dip , 43dip , PanelMsgs.Width - listItemHeightMSG - 24dip ,18dip )
	
	
	Dim cd As ColorDrawable
	cd.Initialize(Color_cli,7dip)
	
	Dim timeLbl As Label
	timeLbl.Initialize("timeLbl")
	timeLbl.Background	= cd
	timeLbl.TextSize	= 12
	timeLbl.Typeface = Typeface.LoadFromAssets("aviny.ttf")
	timeLbl.Gravity		= Bit.Or(Gravity.CENTER, Gravity.CENTER_HORIZONTAL)
	timeLbl.textColor	= Colors.White
	If TypeCli == "notification" Then
		timeLbl.Text	 	= "اطلاعیـــه"
	Else if TypeCli == "weather" Then
		timeLbl.Text	 	= "وضعیت آب و هوا"
	Else if TypeCli == "sarmazadegi" Then
		timeLbl.Text	 	= "هشدار سرمازدگی"
	Else if TypeCli == "garmazadegi" Then
		timeLbl.Text	 	= "هشدار گرمازدگی"
	Else
		timeLbl.Text	 	= SaeloZahra.mohasebe_tarikh(time_cli)
	End If
	p_view.AddView(timeLbl,5dip,7dip,72dip,24dip)
	
	Dim ss As SmartString
	ss.Initialize
	ss.SingleLine2(Activity,timeLbl,"aviny.ttf")
	
	
	Dim border_bottom_lbl As Label
	border_bottom_lbl.Initialize("border_bottom_lbl")
	border_bottom_lbl.Color=0xBECCCCCC
	p_view.AddView(border_bottom_lbl,15%x,listItemHeightMSG-1dip,50%x,1dip)
	
	
	Dim CoverMsglbl As Label
	CoverMsglbl.Initialize("CoverMsglbl")
'	CoverMsglbl.Tag=Url_cli
	p_view.AddView(CoverMsglbl,0dip,0dip,100%x,listItemHeightMSG)
	
	AC.SetClickEffect(CoverMsglbl,True)
	
	
	Return p_view
	
	
End Sub





Sub ClvMsg_ItemClick (Index As Int, Value As Object)
	
	Dim panel_test As Panel
	panel_test = ClvMsg.GetPanel(Index)
	
	Log("Tag is: "&panel_test.GetView(0).Tag)
	
	SH.convertActivityFromTranslucent
	Starter.SliderPosition=0
	
	StartActivity(NotificationNewAct)
	
End Sub




Sub CoverMsglbl_Click

	Dim index As Int
	index = ClvMsg.GetItemFromView(Sender)
	
'	Dim panel_test As Panel
'	panel_test = ClvMsg.GetPanel(index)
'	StartActivity(NotificationNewAct)
	
	ClvMsg_ItemClick(index,ClvMsg.GetValue(index))
	
End Sub



#End Region






#Region Bazarche



Sub CLV_ItemClick (Index As Int, Value As Object)

	SH.convertActivityFromTranslucent
	Starter.SliderPosition=0
	
	If Value=="" Then
		StartActivity(sabte_mahsool_act)
	Else
		Log(Value)
	'	Sleep(500)
		bazarcheMahsoolAct.pageVals=Value
		ProgressDialogShow("کمی صبر کنید...")
		bazarcheMahsoolAct.NewTheme=True
		StartActivity(bazarcheMahsoolAct)
	End If
	
End Sub


Sub Cover_lbl_Click
	Dim index As Int
	index = ClvBazarche.GetItemFromView(Sender)
	CLV_ItemClick(index,ClvBazarche.GetValue(index))
End Sub






Sub CreateListItem(id_cli As Int,Title_cli As String, line2_cli As String, image_cli As String, Url_cli As String) As Panel

	
	Dim p_view As Panel
	p_view.Initialize("")
	
	Dim gdr As GradientDrawable
	gdr.Initialize("TR_BL", Array As Int(0xFFDBECDC, Colors.White))
	gdr.CornerRadius = 8dip
	
	p_view.Background=gdr
	p_view.Elevation=8dip
	
	p_view.Padding = Array As Int(5dip,2dip,5dip,2dip)

	
'	Dim inner_pannel As MSCardView
'	inner_pannel.Initialize("")
'	inner_pannel.tag=Title_cli
'	inner_pannel.Panel.Color=Colors.White
	
'	inner_pannel.MaxElevation = 5dip
'	inner_pannel.Elevation = 3dip
'	inner_pannel.Radius = 5
'	p_view.AddView( inner_pannel , 0 ,0 , 100%x , listItemHeightBazarche+18dip )
	
	Dim Image_WV As WebView
	Image_WV.Initialize("image_wv")
	Image_WV.LoadHtml("<!doctype html><html><head><meta charset='utf-8'><meta name='viewport' content='width=device-width'></head><body><div style=' bottom: 5%; height: 90%; left: 5%; position: fixed; right: 5%; top: 5%; width: 90%; overflow:hidden;box-shadow: 0 0 6px #666;'><img src='"&image_cli&"' style='min-width:100%;min-height:100%;max-width:133%;max-height:202%;position: absolute;'></div></body></html>")
	Image_WV.ZoomEnabled = False
	Image_WV.Color = Colors.Transparent
	Image_WV.Tag = Title_cli & CRLF & line2_cli &CRLF&SaeloZahra.site_url
	p_view.AddView( Image_WV , 60%x , 5dip , 37%x , listItemHeightBazarche - 20dip )
	
	
	Dim lbl_caption As Label
	lbl_caption.Initialize("lbl_caption")
	lbl_caption.Gravity = Bit.Or(Gravity.RIGHT,Gravity.CENTER_VERTICAL)
	lbl_caption.TextSize = 1
	lbl_caption.Tag = id_cli
	lbl_caption.Text = Title_cli
	lbl_caption.SetTextSizeAnimated(313,17)
	lbl_caption.Typeface = SaeloZahra.font
	lbl_caption.TextColor = Colors.Black
	lbl_caption.SingleLine=True
	lbl_caption.Ellipsize="END"
	p_view.AddView( lbl_caption , 2dip , 8dip , 59%x ,35dip )
	
	
	Dim text_wv As WebView
	text_wv.Initialize("text_wv")
	text_wv.Color = Colors.Transparent
	text_wv.ZoomEnabled=False
	text_wv.Tag = id_cli
	text_wv.LoadHtml("<style>@import 'https://cdn.rawgit.com/rastikerdar/samim-font/v3.1.0/dist/font-face.css'; *,body,html{font-family:'Samim';margin:auto;} .div{ direction:rtl; width:100%;float:left;height:100%;font-size:12px;}</style><div class='div'>"&line2_cli&"</div>")
	p_view.AddView( text_wv , 0dip , 52dip , 59%x , 88dip )
	
	
	
	Dim Cover_lbl As Label
	Cover_lbl.Initialize("Cover_lbl")
	Cover_lbl.Tag=Url_cli
	p_view.AddView(Cover_lbl,0dip,0dip,100%x,listItemHeightBazarche)
	
	AC.SetClickEffect(Cover_lbl,True)
	
	
'	Ripple.Initialize(Cover_lbl,saelozahra.colorDark,313,False)
	

	Return p_view
	
	
End Sub

#End Region

