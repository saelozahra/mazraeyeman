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
	Dim Provider As FileProvider
End Sub

Sub Globals
	' Primary Init 
	Dim DTTC As DoubleTaptoClose
	Private ActionBar As ACToolBarDark
	Dim AC As AppCompat
'	Private btn1lbl,btn2lbl,btn3lbl As Label
	Dim SH As Amir_SliderShow
	Dim Snake As DSSnackbar
	Dim X1 As XmlLayoutBuilder
'	Dim ShareApp As ShareMyApp
	Dim customBrowser As JK_CustomTabsBrowser
'	Dim TIP As MSShowTipsBuilder
'	Dim TipState As Int
	Dim BottomBar As AX_SmoothBottomBar
	Private VP As AHViewPager
	Dim apkupdt As cl_appupdate
'	Dim oBillingManager As PBillingManager3
	
	' Menu
	Dim SM As SlidingMenu
	Dim lv As ListView
	Dim listSearchResults,listSearchHasVid As List
	Dim msi As MaterialSimpleListItem
	Dim ModalBuilder As MaterialDialogBuilder
	
	Dim sv As ACSearchView
	Dim si As ACMenuItem
	
	' Home
	Private PanelMsgs,PanelWeather,HomePanel As Panel ' containerPanel,bottomNavigationPanel,
	Dim ClvMsg As CustomListView
	Dim Zouj As Boolean = True
'	Private ImageView1,ImageView2,ImageView3 As ImageView
	Dim WeatherWV As WebView
	Dim ParallaxDesign As Hitex_ParallaxDesign
	Dim HomePanelHeight As Int
	
	'MultiMedia
	Private MultiMediaWv As WebView
	Private SwipeMultiMedia As WVSwipe
	Dim MultiMediaPanel As Panel
	
	'Bazarche
	Dim BazarcheWV As WebView
	Private SwipeBazarche As WVSwipe
	Dim BazarcheWVPanel As Panel
	Dim jobSingleBazarche,jobSingleVideo,JobGet12Hour,JobSearch As HttpJob
	
End Sub

Sub Activity_Create(FirstTime As Boolean)
	
	ProgressDialogHide
	
'	Activity.LoadLayout("home2Layout")
	
	SaeloZahra.SetStatusBarColor(SaeloZahra.ColorDark)
	
	ActionBar.Initialize("ActionBar")
	ActionBar.SetAsActionBar
	Activity.AddView(ActionBar,0,0,100%x,SaeloZahra.MaterialActionBarHeight)
	ActionBar.Color=SaeloZahra.Color
	
	customBrowser.Initialize
	customBrowser.ToolbarColor = SaeloZahra.Color
	customBrowser.ShowTitle = True
	customBrowser.Build
	
	Provider.Initialize
	
	lv.Initialize("lv")
	lv.Color=Colors.Transparent
	lv.AddSingleLine2(SaeloZahra.CSB("ویرایش حساب"),"edit_user")
	lv.AddSingleLine2(SaeloZahra.CSB("محصولات من"),"myproducts")
	lv.AddSingleLine2(SaeloZahra.CSB("ثبت محصولات"),"sabtemahsool")
	lv.AddSingleLine2(SaeloZahra.CSB("وضعیت آب و هوا"),"Weather")
	lv.AddSingleLine2(SaeloZahra.CSB("اطلاعیــــــه ها") ,"Notification")
	lv.AddSingleLine2(SaeloZahra.CSB("صندوق بیمه") ,"sandoghbime")
'	lv.AddSingleLine2(SaeloZahra.CSB("کارشناسان")   ,"karshenasan")
'	lv.AddSingleLine2(SaeloZahra.CSB("معرفی و دریافت جایزه"),"referral")
	lv.AddSingleLine2(SaeloZahra.CSB("بروزرسانی نرم افزار"),"update")
	lv.AddSingleLine2(SaeloZahra.CSB("معرفی نرم افزار"),"share")
	lv.AddSingleLine2(SaeloZahra.CSB("پشتیبانی تلفنی"),"support")
'	If SaeloZahra.pishhomare(File.ReadString(SaeloZahra.dir,"usrnm")) == "irancell" Then
'		lv.AddSingleLine2(SaeloZahra.CSB("لغو اشتراک و خروج"),"unsubscribe")
'	End If
'	lv.AddSingleLine2(SaeloZahra.CSB("لغو اشتراک با USSD"),"unsubscribeUssd")
	lv.AddSingleLine2(SaeloZahra.CSB("خروج"),"exit")
	lv.Padding = Array As Int(0,SaeloZahra.MaterialActionBarHeight,0,0)
	
	lv.SingleLineLayout.ItemHeight = lv.SingleLineLayout.ItemHeight * 1.2
	lv.SingleLineLayout.Label.Padding = Array As Int (30dip, 12dip, 30dip, 12dip)
	
	SM.Initialize("sm")
'	SM.Menu.Color=SaeloZahra.Color

	Dim GrG As GradientDrawable
	Dim Clrs(4) As Int
	Clrs(0) = SaeloZahra.Color
	Clrs(1) = SaeloZahra.ColorLight
	Clrs(2) = SaeloZahra.Color
	Clrs(3) = SaeloZahra.Color
	GrG.Initialize("BR_TL", Clrs)
	
	SM.Menu.Background = GrG
	SM.Menu.AddView(lv,0,0,-2,-2)
	SM.BehindOffset=133dip
	ActionBar.NavigationIconBitmap = LoadBitmapResize(File.DirAssets,"menu.png",ActionBar.Height/2,ActionBar.Height/2,True)
	
	ActionBar.Title=SaeloZahra.CSB(Application.LabelName)
	ActionBar.TitleTextColor=Colors.White
	
'	Main.amaroid.TrackView("Home")
	DTTC.InItIaLiZe("برای خروج از نرم افزار"&CRLF&"مجددا دکمه خروج را بزنید")
	
	
	JobSearch.Initialize("JobSearch",Me)
'	UnsubscribeJob.Initialize("UnsubscribeJob",Me)
	
	
	
	
	
	Dim Icon1 As BitmapDrawable
	Icon1.Initialize(LoadBitmap(File.DirAssets,"icon1.png"))
	Dim Icon2 As BitmapDrawable
	Icon2.Initialize(LoadBitmap(File.DirAssets,"icon2.png"))
	Dim Icon3 As BitmapDrawable
	Icon3.Initialize(LoadBitmap(File.DirAssets,"icon3.png"))
	
	Dim Items As List
	Items.Initialize
	Items.Add(BottomBar.CreateItem("چندرسانه‌ای",Icon1))
	Items.Add(BottomBar.CreateItem("مزرعه‌من",Icon2))
	Items.Add(BottomBar.CreateItem("بازارچه",Icon3))
	
	Dim Ui As AX_SmoothBottomBarUI
	Ui.Initialize
	Ui.BarBackgroundColor = SaeloZahra.Color
	Ui.ItemTextColor = Colors.White
	Ui.ItemIconSize = 50dip
	Ui.BarIndicatorColor = 0x2DFFFFFF
	Ui.BarIndicatorRadius = 10dip
'	Ui.BarSideMargins = 0dip
	Ui.BarSideMargins = 15dip
	Ui.ItemPadding = 8dip ' har chi Kamtar beshe koochikTar Mishe
	Ui.ItemIconTint = 0xA0FFFFFF
	Ui.ItemIconTintActive = Colors.White
'	Ui.ItemTextSize = 28
	Ui.ItemTypeface=SaeloZahra.fontBold
	BottomBar.Initialize("Amir",Ui,Items)
	Activity.AddView(BottomBar,0,100%y-SaeloZahra.MaterialActionBarHeight-SaeloZahra.GetStatusBarHeight-20dip,100%x,SaeloZahra.MaterialActionBarHeight+20dip)
	
	
	
	
	
	
	
	
	
'	If FirstTime Then
'		If File.Exists(SaeloZahra.dir,"showTip")==False Then
'			TIP.Initialize("tip")
'			TIP.setTitle(SaeloZahra.csb("وضعیت مزرعه من")).setButtonText(SaeloZahra.csb("بعدی")).setTitleColor(SaeloZahra.Color).setDescriptionColor(SaeloZahra.ColorDark).setDescription(SaeloZahra.csb("اگه میخواید وضعیت آب و هوا و مخاطرات مزرعه رو ببینید ، وارد این بخش بشید")).setTarget(ImageView2).build
'			TIP.setDelay(2313)
'			TIP.show
'			TipState=1
'			File.WriteString(SaeloZahra.dir,"showTip","")
'		End If
'	End If

	
	
'	If FirstTime Then
'		
''		fingerprint.Initialize(Me, "auth")
'		
'		Log("Initialize Irancell Billing Manager")
'		oBillingManager.InitializeSDK("BillingManager", Main.KEY , Main.secretOne, Main.secretTwo, True)
'		'Its for debug log, set it to false after test and when ready to build the App
'		oBillingManager.DebugLogging = False
'		
'	End If
	
	
	
	
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
	
'	containerPanel.SetLayout(0,ActionBar.Height,100%x,100%y-AC.GetMaterialActionBarHeight-bottomNavigationPanel.Height+14dip)'bottomNavigationPanel.Top)
	
'	HomePanel.SetLayout(0,0,containerPanel.Width,containerPanel.Height)
	
	
'	btn1lbl.Typeface=SaeloZahra.font
'	btn3lbl.Typeface=SaeloZahra.font
'	btn2lbl.Typeface=SaeloZahra.font
	HomePanelHeight = 100%y-AC.GetMaterialActionBarHeight-SaeloZahra.MaterialActionBarHeight+14dip
	HomePanel.Initialize("HomePanel")
	Dim TafavoteSize As Int = HomePanelHeight/12
	If GetDeviceLayoutValues.Height>2020 Then TafavoteSize = HomePanelHeight/20
	
	Dim cdPanelMsg As ColorDrawable
	cdPanelMsg.Initialize(Colors.White,18)
	PanelMsgs.Initialize("PanelMsgs")
	PanelMsgs.Background=cdPanelMsg
	PanelMsgs.Elevation=7dip
	HomePanel.AddView(PanelMsgs,14dip,14dip,100%x-28dip,HomePanelHeight/2-60dip-TafavoteSize)
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
		ClvMsg.Add(CreateListItemMsg(cu1.GetString("id"),cu1.GetString("title"),cu1.GetString("value").Replace("<hr>",""),cu1.GetString("type"),cu1.GetString("time"),ThisIcon,SaeloZahra.FindAlertColor(cu1.GetString("type")) ),listItemHeightMSG,cu1.GetString("title"))
	Next
	
	If cu1.RowCount <4 Then
		ProgressDialogShow(SaeloZahra.CSB("در حال دریافت اطلاعات اولیه نرم افزار"))
		StartService(accuWeatherCronJobService)
	End If

'	ImageView1.Gravity=Gravity.CENTER
'	ImageView2.Gravity=Gravity.CENTER
'	ImageView3.Gravity=Gravity.CENTER
	
	
	
	
	
	
	
	
	
	
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
'	JobGet12Hour.Download(	"http://newserver.mazraeyeman.ir/mazraeyeman_proxy.php?url="&SaeloZahra.EncodeUrl("http://dataservice.accuweather.com/forecasts/v1/hourly/12hour/"&accuWeatherCronJobService.RegionCode&"?metric=true&details=true&language=fa-ir&apikey="&accuWeatherCronJobService.ApiAccuWeather)&"&amirTime="&DateTime.Now)
	JobGet12Hour.Download(	$"https://mazraeyeman.ir/reseller/api_files/forecasts.php?region=${accuWeatherCronJobService.RegionCode}&period=hour"$)
	
	
	
	Dim cdPanelWeather As ColorDrawable
	cdPanelWeather.Initialize(Colors.White,18)
	
	PanelWeather.Initialize("PanelWeather")
	PanelWeather.Background=cdPanelWeather
	PanelWeather.Padding= Array As Int (0,0,0,0 )
	PanelWeather.Elevation=7dip
	PanelWeather.SetBackgroundImage(LoadBitmap(File.DirAssets,"home-weather-background.jpg"))
	HomePanel.AddView(PanelWeather,14dip, PanelMsgs.Top+PanelMsgs.Height+20dip ,100%x-28dip,HomePanelHeight/2 + TafavoteSize)
	
	
	
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
	WeatherWV.LoadHtml("<br><br><br><h3 style='text-align:center;'>در حال بارگزاری</h3>")
	WeatherWV.LoadUrl("file:///android_asset/background.html")
	PanelWeather.AddView(WeatherWV,5dip,15dip,PanelWeather.Width-10dip,PanelWeather.Height-55dip)
	
	Dim WeatherHover As Label
	WeatherHover.Initialize("WeatherHover")
	PanelWeather.AddView(WeatherHover,-30dip,-30dip,100%x,100%y)
	
	AC.SetClickEffect(WeatherHover,True)
	
	
	
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
	
	MultiMediaWv.Initialize("MultiMediaWv")
	MultiMediaWv.Color=Colors.Transparent
	MultiMediaWv.ZoomEnabled=False
	MultiMediaWv.LoadUrl(SaeloZahra.json_url&"multimedia.php")
'	MultiMediaWv.Visible=False
	MultiMediaWv.Tag = "salam"
		
	MultiMediaPanel.Initialize("MultiMediaPanel")
	MultiMediaPanel.AddView(MultiMediaWv,0,0,100%x,100%y)
	
	
	
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
	
	jobSingleBazarche.Initialize("jobSingleBazarche",Me)
	
	
	BazarcheWV.Initialize("BazarcheWV")
	BazarcheWV.Color=Colors.Transparent
	BazarcheWV.ZoomEnabled=False
	BazarcheWV.LoadUrl(SaeloZahra.json_url&"productfarmers_list.php?bazarche=html&wc=yes")
	
	BazarcheWVPanel.Initialize("BazarcheWVPanel")
	BazarcheWVPanel.AddView(BazarcheWV,0,0,100%x,100%y)
	
	
	mapProductName.Initialize
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	'app update
	'app update
	
	If FirstTime Then
		apkupdt.Initialize(Me,"update")			'initializes the class
		apkupdt.Verbose = True  				'this one affects the verbosity of the logs
	End If
	'ALWAYS NEEDED - this is your app's package name (see "Project/BuilConfigurations/Package")
	apkupdt.PackageName = Application.PackageName
	'ALWAYS NEEDED - this is the complete path to the info text file holding the newer version number
	apkupdt.NewVerTxt = SaeloZahra.site_url&"application/android.inf"
	'ALWAYS NEEDED - this is the complete path to your newer apk
	apkupdt.NewVerApk = SaeloZahra.site_url&"application/android.apk"
	'OPTIONAL - Set credentials to access a protected folder. Not needed for this example
	apkupdt.setCredentials("saelozahra","Yaheydar110")
	
	
	
	'Layout
	'Layout
	'Layout
	'Layout
	'Layout
	
	
	
	
	
	'Add ViewPager
	VP.Initialize("VP")
	Activity.AddView(VP,0,SaeloZahra.MaterialActionBarHeight,100%x,100%y-BottomBar.Height-SaeloZahra.MaterialActionBarHeight-SaeloZahra.GetStatusBarHeight+3dip)
	
	Dim PC As AHPageContainer
	PC.Initialize
	PC.AddPage(MultiMediaPanel,"چندرسانه‌ای")
	PC.AddPage(HomePanel,"مزرعه‌من")
	PC.AddPage(BazarcheWVPanel,"بازارچه")
	VP.PageContainer = PC
	VP.CurrentPage = 1
	BottomBar.ActiveItem = 1
	
	BottomBar.BringToFront
	
	HomePanel.Height = HomePanel.Height + 110dip
	
	
	
	SwipeBazarche.Initialize(BazarcheWV)
	SwipeBazarche.Progress_Color=SaeloZahra.Color

	SwipeMultiMedia.Initialize(MultiMediaWv)
	SwipeMultiMedia.Progress_Color=SaeloZahra.ColorDark
	
End Sub



Sub GetIntent As Intent
	Dim sR As Reflector
	sR.Target=sR.GetActivity
	Return sR.RunMethod("getIntent")
End Sub

Sub Activity_Resume
	
	Dim Int1 As Intent = GetIntent
	If Int1.Action = Int1.ACTION_VIEW Then
		Dim URI As String =Int1.GetData
		LogColor(URI,Colors.Yellow)
		If URI.StartsWith("tmm://mazraeyeman.ir") Then
			If URI.Replace("tmm://mazraeyeman.ir?marja=","").Length>5 Then
				Snake.Initialize("snake",Activity,SaeloZahra.CSB("پرداخت با موفقیت انجام شد"),Snake.DURATION_LONG)
				Msgbox2Async("وضعیت تراکنش: موفق"& CRLF&"کد پیگیری تراکنش: " & URI.Replace("tmm://mazraeyeman.ir?marja=","") ,"وضعیت تراکنش",SaeloZahra.CSB("ثبت نام"),"","",Null,True)
				login_act.ItIsPayed = True
			Else
				Snake.Initialize("snake",Activity,SaeloZahra.CSB("خطا در پرداخت"),Snake.DURATION_LONG)
			End If
			Snake.Show
		End If
	End If
		
	
	
	
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
	
	If Not(SaeloZahra.RayganHast) Then
		If File.Exists(SaeloZahra.dir,"usrnm") And File.ReadMap(SaeloZahra.dir,"user.dat").Get("pay_type")=="vas" Then
			If Not(File.Exists(SaeloZahra.dir,"NotNeedUserPass")) Then
'				If SaeloZahra.pishhomare(File.ReadString(SaeloZahra.dir,"usrnm"))== "irancell" Then
'					oBillingManager.SetMsisdn(File.ReadString(SaeloZahra.dir,"usrnm"),False)
'					oBillingManager.RequestPayment(Main.KEY,"subs" ,"پرداخت هزینه نرم افزار مزرعه من")
'				Else
'		'			OTPConfirmAct
'					Log("Irancell Nist")
'				End If
			Else
				Log("Niaz Be Pass Nist")
			End If
		Else
			Log("VAS Nist")
		End If
	End If
	
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub





'Sub BillingManager_PurchaseCompleted (Success As Boolean, Product As Purchase)
'	LogColor(Product.MSISDN&CRLF&" login:   ProductId: "&Product.ProductId&CRLF&"PurchaseState: "&Product.PurchaseState&CRLF&"Token: "&Product.Token,Colors.Green)
'	If Success Then
'		File.WriteString(SaeloZahra.Dir,"NotNeedUserPass",Product.MSISDN)
'		ToastMessageShow(SaeloZahra.CSB("تائید حساب "&Product.MSISDN&" با موفقیت انجام شد"&CRLF&"وضعیت:"&Product.PurchaseState),True)
'	Else
'		ToastMessageShow(SaeloZahra.CSB("تائید حساب ایرانسل انجام نشد"),True)
'	End If
'End Sub
'
'Sub BillingManager_ProductConsumed (Success As Boolean, Product As Purchase)
'	LogColor(Product.MSISDN&CRLF&" login:   ProductId: "&Product.ProductId&CRLF&"PurchaseState: "&Product.PurchaseState&CRLF&"Token: "&Product.Token,Colors.Yellow)
'	If Success Then
'		File.WriteString(SaeloZahra.Dir,"NotNeedUserPass",Product.MSISDN)
'		ToastMessageShow("BillingManager_ProductConsumed: "&SaeloZahra.CSB("تائید حساب "&Product.MSISDN&" با موفقیت انجام شد"&CRLF&"وضعیت:"&Product.PurchaseState),True)
'	Else
'		ToastMessageShow(SaeloZahra.CSB("تائید حساب ایرانسل انجام نشد"),True)
'	End If
'End Sub


'
''Show is billing supported or not
'Sub BillingManager_BillingSupported (Supported As Boolean, Message As String)
'	
'	Log("BillingSupported: " & Supported & ", " & Message)
'	LogColor("oBillingManager.About: "&oBillingManager.About , Colors.Green)
'	Log("Subscriptions supported: " & oBillingManager.SubscriptionsSupported)
'	
'	If Supported Then
'		Main.bIsoBillingManagerAvailable = True
'	End If
'   
'	If Main.bIsoBillingManagerAvailable Then
''		'Get Owned Products
''		If File.Exists(SaeloZahra.dir,"usrnm") Then
''			oBillingManager.SetMsisdn(File.ReadString(SaeloZahra.dir,"usrnm"),True)
''			oBillingManager.SetDelayPayment(0)
''			oBillingManager.GetOwnedProducts
''		End If
'	End If
'End Sub
'
'Sub BillingManager_OwnedProducts (Success As Boolean, Purchases As Map)
'
''	LogColor("Success: "&Success&"   ,   Purchases: "&Purchases,Colors.Green)
'	LogColor("لیست رو کامل در آورد",Colors.Yellow)
'	
'	If Purchases.Size == 0 Then
'		File.Delete(SaeloZahra.Dir,"NotNeedUserPass")
'	End If
'	
'End Sub


'
'Sub tip_Click
'	If TipState==1 Then
'		TIP.Initialize("tip")
'		TIP.setTitle(SaeloZahra.csb("بازارچـــــــه")).setButtonText(SaeloZahra.csb("بعدی")).setDescription(SaeloZahra.csb("تمام محصولاتی که برای فروش گذاشته میشوند در این بخش قرار دارند")).setTarget(ImageView3).build
'		TIP.setDelay(313)
'		TipState=2
'		TIP.show
'	else if TipState=2 Then
'		TIP.Initialize("tip")
'		TIP.setTitle(SaeloZahra.csb("فیلـــــــــم ها و محتوای آموزشی")).setButtonText(SaeloZahra.csb("بعدی")).setDescription(SaeloZahra.csb("اینجا میتونین به فیلم ها ، صوت ها و متن های آموزشی دسترسی داشته باشین")).setTarget(ImageView1).build
'		TIP.setDelay(313)
'		TipState="3"
'		TIP.show
'	else if TipState=3 Then
'		ActionBar_NavigationItemClick
'		TIP.Initialize("tip")
'		TIP.setTitle(SaeloZahra.csb("امکانات بیشتر")).setButtonText(SaeloZahra.csb("بزن بریم")).setDescription(SaeloZahra.csb("برای ثبت محصولاتتون و دیدن امکانات دیگه نرم افزار این منو رو ببینید")).setTarget(lv).build
'		TIP.setDelay(313)
'		TipState="4"
'		TIP.show
''	else if TipState=4 Then
''		TIP.Initialize("tip")
''		TIP.setTitle(SaeloZahra.csb("اهدای جوایز")).setButtonText(SaeloZahra.csb("بزن بریم")).setDescription(SaeloZahra.csb("اینجا میتونین کشاورزای دیگه رو به این نرم افزار دعوت کنین"&CRLF&"و به ازای هر نفری که نرم افزار رو نصب کنه جایزه بگیرید")).setTarget(Btn7).build
''		TIP.setDelay(313)
''		TipState="5"
''		TIP.show
'	End If
'End Sub


Sub lv_ItemClick (Position As Int, Value As Object)
	Select Value
		Case "share"
			
			Try
'				ShareApp.startShare(SaeloZahra.r.GetActivity , "ارسال نرم افزار به دیگران")

				Dim FileName As String = "ads_mockup.jpg"
				'copy the shared file to the shared folder
				File.Copy(File.DirAssets, FileName, Provider.SharedFolder, FileName)
				Dim email As Email
'				email.To.Add("aaa@bbb.com")
				email.Subject = "مزرعه من"
				email.Body    = "نسخه آخر نرم افزار "&Application.LabelName&" را از "& CRLF & "mazraeyeman.ir/application"& CRLF & "دریافت کنید."& CRLF & "🌹🌷💐"
				email.Attachments.Add(Provider.GetFileUri(FileName))
				Dim in As Intent = email.GetIntent
				in.Flags = 1 'FLAG_GRANT_READ_URI_PERMISSION
				StartActivity(in)
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
			
		Case "myproducts"
			SH.convertActivityFromTranslucent
			MahsoulListAct.ListType = "my"
			StartActivity(MahsoulListAct)
		Case "edit_user"
			SH.convertActivityFromTranslucent
			RegisterAct.ActType = "edit"
			StartActivity(RegisterAct)
		Case "update"

			Wait For (CheckInstallationRequirements) Complete (Result As Boolean)
			'OPTIONAL - if you like to show a splash screen while checking for a newer apk goes on
'			apkupdt.SetAndStartSplashScreen(Activity,LoadBitmap(File.DirAssets, "updating.jpg"))
			ProgressDialogShow(SaeloZahra.CSB("کمی صبر کنید"&CRLF&"در حال بروزرسانی"))
			'NEEDED - this is the one you need if you want to perform "automatic" updating of your apk
			apkupdt.UpdateApk(Result) 'checks for newer apk, downloads it and asks the user to install it
			
		Case "sabtemahsool"
			SH.convertActivityFromTranslucent
			StartActivity(SabteMahsoolAct)
		Case "Weather"
			If login_act.ItIsPayed Then
				SH.convertActivityFromTranslucent
				StartActivity(WeatherNewAct)
			Else
				ShowPardakhtModal
			End If
		Case "Notification"
			If login_act.ItIsPayed Then
				SH.convertActivityFromTranslucent
				StartActivity(NotificationAct)
			Else
				ShowPardakhtModal
			End If
		Case "support"
			
			Msgbox2Async("با کدوم بخش پشتیبانی کار دارید؟", "پشتیبانی تلفنی", "پشتیبانی فنی", "لغو", "پشتیبانی سامانه", Null, False)
			Wait For Msgbox_Result (Resultsssss As Int)
			If Resultsssss = DialogResponse.POSITIVE Then
				SaeloZahra.intent1.Initialize(SaeloZahra.intent1.ACTION_VIEW, "tel:"&SaeloZahra.SupportNumber)
				StartActivity(SaeloZahra.intent1)
			else If Resultsssss = DialogResponse.NEGATIVE Then
				SaeloZahra.intent1.Initialize(SaeloZahra.intent1.ACTION_VIEW, "tel: 09173842588")
				StartActivity(SaeloZahra.intent1)
			End If
			
'		Case "referral"
'			SaeloZahra.SetAnimation("zoom_exit","zoom_enter")
'			Starter.rp.CheckAndRequest(Starter.rp.PERMISSION_READ_CONTACTS)
'			Wait For Activity_PermissionResult (Permission As String, Result As Boolean)
'			If Result Then StartActivity(ReferralAct)
'			
		Case "unsubscribeUssd"
			SaeloZahra.intent1.Initialize(SaeloZahra.intent1.ACTION_VIEW, "tel:*800#")
			StartActivity(SaeloZahra.intent1)
'		Case "unsubscribe"
'			'TODO:Unsubscribe
'			
'			If File.Exists(SaeloZahra.dir,"ActiveToken") Then
'				ProgressDialogShow(SaeloZahra.CSB("در حال لغو اشتراک"))
'				UnsubscribeJob.Download("https://seller.jhoobin.com/ws/androidpublisher/v2/applications/ir.saelozahra.damaara.mazraeyeman/purchases/subscriptions/BRDM9729/tokens/"&File.ReadString(SaeloZahra.dir,"ActiveToken")&":cancel?access_token=a0390850-ad76-37dd-a8d8-e3a0eadb1796")
'			End If
'			
''			Main.oBillingManager.RemoveAccount
''			Main.oBillingManager.RemoveAccount()
'			    
			
		Case "exit"
			ExitApplication
			
	End Select
End Sub








#Region Update app

'Check whether we already have permission for install other apps.
'If not we open the relevant settings page
'then wait for Activity_Resume and check the value of CanRequestPackageInstalls again

Private Sub CheckInstallationRequirements As ResumableSub
	If File.ExternalWritable = False Then
		MsgboxAsync(SaeloZahra.CSB("مموری موجود نیست، مطمئن شوید که دستگاه شما به فلش مموری متصل نیست"), "")
		Return False
	Else If SaeloZahra.P.SdkVersion >= 26 And apkupdt.CanRequestPackageInstalls = False Then
		MsgboxAsync(SaeloZahra.CSB("لطفا به من مجوز نصب نرم افزار را بدهید"), "")
		Wait For Msgbox_Result(Result As Int)
			Dim in As Intent
			in.Initialize("android.settings.MANAGE_UNKNOWN_APP_SOURCES", "package:" & Application.PackageName)
			StartActivity(in)
		Wait For Activity_Resume '<-- wait for Activity_Resume
			Return apkupdt.CanRequestPackageInstalls
	Else If apkupdt.CheckNonMarketAppsEnabled = False Then
		MsgboxAsync("لطفا مجوز نصب برنامه را در " & CRLF & "تنظیمات (Setting) > امنیتی (Security) > Unknown sources (نصب برنامه از منابع ناشناس)" _
        & CRLF & "یا " _ 
		&"Settings > Applications > Unknown sources"&CRLF&"بدهید", "")
		Return False
	Else
		Return True
	End If
End Sub


Sub update_UpdateComplete
	ProgressDialogHide
	LogColor($"UpdateComplete - time: ${DateTime.Time(DateTime.Now)}"$, 0xFF556B2F)
	apkupdt.StopSplashScreen
	'too lazy to manage error conditions..check apkupdt.ERR_xxx codes if you like
	Select apkupdt.Status
		Case apkupdt.OK_CURVER
			MsgboxAsync(SaeloZahra.CSB($"ورژن در حال اجرا: ${apkupdt.CurVN} است ${CRLF}"$), "")
		Case apkupdt.OK_WEBVER
			MsgboxAsync(SaeloZahra.CSB($" نسخه آنلاین: ${apkupdt.WebVN}${CRLF} توضیحات نسخه جدید: ${apkupdt.WebChangeLog}${CRLF} حجم فایل: ${apkupdt.WebFileSize} ${CRLF}"$), "")
		Case apkupdt.OK_NEWERAPK
			MsgboxAsync(SaeloZahra.CSB($"نسخه جدید موجود است"$), "")
		Case apkupdt.NO_NEWERAPK
			MsgboxAsync(SaeloZahra.CSB($"نسخه جدیدی موجود نیست"$), "")
		Case apkupdt.OK_DOWNLOAD
			MsgboxAsync(SaeloZahra.CSB($"نسخه جدید دانلود شد"$), "")
		Case apkupdt.OK_INSTALL
			MsgboxAsync(SaeloZahra.CSB($"درخواست نصب نسخه جدید به کاربر ارسال شد"$), "")
		Case apkupdt.ERR_NOPERM
			Log("No permission to install")
			MsgboxAsync(SaeloZahra.CSB($"کاربر اجازه نصب نرم افزار را نداد"$), "")
		Case Else
			MsgboxAsync(SaeloZahra.CSB($" وضعیت: ${apkupdt.Status} "$), "")
	End Select
End Sub

#End Region


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
		JobSearch.Download(SaeloZahra.json_url&"post.php?search="&Query)
	End If
	ProgressDialogShow(SaeloZahra.CSB("در حال جستجو"))
		
End Sub




Sub ActionBar_NavigationItemClick
	SM.ShowMenu
End Sub


Sub Activity_KeyPress (KeyCode As Int) As Boolean
	If KeyCode = KeyCodes.KEYCODE_BACK Then
		If SM.Visible Then
			ActionBar_NavigationItemClick
		Else if VP.CurrentPage == 0 Then
			MultiMediaWv.Back
			DTTC.TapToClose
		Else
			DTTC.TapToClose
		End If
		Return True
	Else
		Return False
	End If
End Sub


Sub Dialog_SimpleItemSelected (Dialog As MaterialDialog, Position As Int, Item As MaterialSimpleListItem)
	Dim ResultMap As Map = listSearchResults.Get(Position)
	ToastMessageShow(Item.Content, False)
	If listSearchHasVid.Get(Position)=="true" Or listSearchHasVid.Get(Position)=="True" Or listSearchHasVid.Get(Position)==True Then
		ProgressDialogShow(SaeloZahra.CSB("در حال بارگزاری فیلم"))
		jobSingleVideo.Download(SaeloZahra.json_url&"post.php?type=html&id="&ResultMap.Get("id"))
		
	Else
		SingleNewAct.post_id = ResultMap.Get("id")
		SingleNewAct.caption_str = ResultMap.Get("title")
		SingleNewAct.content_str = ResultMap.Get("content")
		SingleNewAct.video_str = ResultMap.Get("video")
		StartActivity(SingleNewAct)
	End If
	Dialog.Dismiss
End Sub





Sub RestartAct
	Activity.Finish
	StartActivity(Me)
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
			
			Case "UnsubscribeJob"
				File.Delete(SaeloZahra.Dir,"NotNeedUserPass")
				ToastMessageShow(SaeloZahra.CSB("اشتراک مزرعه من با موفقیت حذف شد"),True)
				ExitApplication
			Case "jobSingleBazarche"
				
				
				Dim ParserBazarche As JSONParser
				ParserBazarche.Initialize(Job.GetString)
				Dim RootBazarche As List = ParserBazarche.NextArray
				For Each ColRootBazarche As Map In RootBazarche
				Next
				
				If login_act.ItIsPayed Then
					SH.convertActivityFromTranslucent
					bazarcheMahsoolAct.pageVals=ColRootBazarche
					ProgressDialogShow("در حال بارگزاری...")
					StartActivity(bazarcheMahsoolAct)
				Else
					ShowPardakhtModal
				End If


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
						Dim RootBazarche As List = parser.NextArray
						For Each ColRootBazarche As Map In RootBazarche
							
'							Dim image_url As String
'							If colrootBazarche.Get("pic")<>"" Then
'								image_url = SaeloZahra.site_url&"reseller/fileupload/product/"&colrootBazarche.Get("pic")
'							Else
'								image_url = "http://melkamlak.com/melk_pic/32438/bpic32438.jpg"
'							End If
							
'							Dim url As String = SaeloZahra.site_url&"user/id/"&colrootBazarche.Get("id")&"/simple"
							
							If mapProductName.ContainsKey(ColRootBazarche.Get("product")) Then ColRootBazarche.Put( "product" , mapProductName.Get(ColRootBazarche.Get("product")) )
							
'							ClvBazarche.Add(CreateListItem(colrootBazarche.Get("id"),colrootBazarche.Get("vazn")&" تن "&colrootBazarche.Get("product"),"ارائه در "&colrootBazarche.Get("zaman_eraa"),image_url,url),listItemHeightBazarche+22,colrootBazarche)
							
							PlaceList.Add(ColRootBazarche)
							
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
						For Each RootSearch As Map In root1
							Dim ContentId As String = RootSearch.Get("id")
							Dim TitleRendered As String = RootSearch.Get("title")
							Dim video As String = RootSearch.Get("video")
							Dim excerptrendered As String = RootSearch.Get("text")
							Dim pic As String = RootSearch.Get("pic")
							Dim moretext As String = RootSearch.Get("moretext")
'							Dim date As String = RootSearch.Get("date")
'							Dim featured As String = RootSearch.Get("featured")
'							Dim category_txt As String = RootSearch.Get("category_txt")
'							Dim exlink As String = RootSearch.Get("exlink")
'							Dim likecount As String = RootSearch.Get("likecount")
'							Dim product_title As String = RootSearch.Get("product_title")
'							Dim File_ As String = RootSearch.Get("file")
'							Dim cateid As String = RootSearch.Get("cateid")
'							Dim product_id As String = RootSearch.Get("product_id")
'							Dim publisher As String = RootSearch.Get("publisher")
'							Dim viewcount As String = RootSearch.Get("viewcount")
'							Dim group As String = RootSearch.Get("group")
'							Dim status As String = RootSearch.Get("status")
							
							SearchResults(shomareyeNatije) = TitleRendered
							shomareyeNatije =shomareyeNatije+1
								
								
							listSearchResults.Add(CreateMap("id":ContentId,"title":TitleRendered,"excerpt":excerptrendered,"content":moretext,"video":video,"image":pic))
							
							If SaeloZahra.Debug Then ToastMessageShow(TitleRendered,False)
							If video.Length>20 Then
								listSearchHasVid.Add(True)
								msi.Initialize2("outline_video_library_black_24" , TitleRendered)
							Else
								listSearchHasVid.Add(False)
								msi.Initialize2("outline_file_copy_black_24" 	 , TitleRendered)
							End If
							msi.BackgroundColor = Colors.White 'Rnd(Colors.White,SaeloZahra.ColorLight)
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
				
				
				VideoNewAct.pageTitle=TitleRendered
				If video.Length>20 Then
					VideoNewAct.VidUrl=video
					StartActivity(VideoNewAct)
				Else
					SingleNewAct.post_id = jobSingleVideo.Tag
					SingleNewAct.caption_str = "محتوای چندرسانه‌ای"
					SingleNewAct.content_str = Job.GetString
					SingleNewAct.video_str = ""
					StartActivity(SingleNewAct)
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
	
		If (Job.JobName=="JobGet12Hour" And  Job.GetString.Contains("The allowed number of requests has been exceeded.")) Or ( Job.JobName=="JobGet12Hour" And Not(NotEmptyJob) ) Then
			
			Log("GetString: "&Job.GetString)
			Log("The allowed number of requests has been exceeded.  Api Jadid Begir")
			Sleep(3000)
			Select Rnd(1,7)
				Case 1
					JobGet12Hour.Download(	"http://newserver.mazraeyeman.ir/mazraeyeman_proxy.php?url="&SaeloZahra.EncodeUrl("http://dataservice.accuweather.com/forecasts/v1/hourly/12hour/"&accuWeatherCronJobService.RegionCode&"?metric=true&details=true&language=fa-ir&apikey="&accuWeatherCronJobService.ApiAccuWeather1)&"&amirTime="&DateTime.Now)
					Log("Downloading: "&	"http://newserver.mazraeyeman.ir/mazraeyeman_proxy.php?url="&SaeloZahra.EncodeUrl("http://dataservice.accuweather.com/forecasts/v1/hourly/12hour/"&accuWeatherCronJobService.RegionCode&"?metric=true&details=true&language=fa-ir&apikey="&accuWeatherCronJobService.ApiAccuWeather1)&"&amirTime="&DateTime.Now)
				Case 2
					JobGet12Hour.Download(	"http://newserver.mazraeyeman.ir/mazraeyeman_proxy.php?url="&SaeloZahra.EncodeUrl("http://dataservice.accuweather.com/forecasts/v1/hourly/12hour/"&accuWeatherCronJobService.RegionCode&"?metric=true&details=true&language=fa-ir&apikey="&accuWeatherCronJobService.ApiAccuWeather2)&"&amirTime="&DateTime.Now)
					Log("Downloading: "&	"http://newserver.mazraeyeman.ir/mazraeyeman_proxy.php?url="&SaeloZahra.EncodeUrl("http://dataservice.accuweather.com/forecasts/v1/hourly/12hour/"&accuWeatherCronJobService.RegionCode&"?metric=true&details=true&language=fa-ir&apikey="&accuWeatherCronJobService.ApiAccuWeather2)&"&amirTime="&DateTime.Now)
				Case 3
					JobGet12Hour.Download(	"http://newserver.mazraeyeman.ir/mazraeyeman_proxy.php?url="&SaeloZahra.EncodeUrl("http://dataservice.accuweather.com/forecasts/v1/hourly/12hour/"&accuWeatherCronJobService.RegionCode&"?metric=true&details=true&language=fa-ir&apikey="&accuWeatherCronJobService.ApiAccuWeather3)&"&amirTime="&DateTime.Now)
					Log("Downloading: "&	"http://newserver.mazraeyeman.ir/mazraeyeman_proxy.php?url="&SaeloZahra.EncodeUrl("http://dataservice.accuweather.com/forecasts/v1/hourly/12hour/"&accuWeatherCronJobService.RegionCode&"?metric=true&details=true&language=fa-ir&apikey="&accuWeatherCronJobService.ApiAccuWeather3)&"&amirTime="&DateTime.Now)
				Case 4
					JobGet12Hour.Download(	"http://newserver.mazraeyeman.ir/mazraeyeman_proxy.php?url="&SaeloZahra.EncodeUrl("http://dataservice.accuweather.com/forecasts/v1/hourly/12hour/"&accuWeatherCronJobService.RegionCode&"?metric=true&details=true&language=fa-ir&apikey="&accuWeatherCronJobService.ApiAccuWeather4)&"&amirTime="&DateTime.Now)
					Log("Downloading: "&	"http://newserver.mazraeyeman.ir/mazraeyeman_proxy.php?url="&SaeloZahra.EncodeUrl("http://dataservice.accuweather.com/forecasts/v1/hourly/12hour/"&accuWeatherCronJobService.RegionCode&"?metric=true&details=true&language=fa-ir&apikey="&accuWeatherCronJobService.ApiAccuWeather4)&"&amirTime="&DateTime.Now)
				Case 5
					JobGet12Hour.Download(	"http://newserver.mazraeyeman.ir/mazraeyeman_proxy.php?url="&SaeloZahra.EncodeUrl("http://dataservice.accuweather.com/forecasts/v1/hourly/12hour/"&accuWeatherCronJobService.RegionCode&"?metric=true&details=true&language=fa-ir&apikey="&accuWeatherCronJobService.ApiAccuWeather5)&"&amirTime="&DateTime.Now)
					Log("Downloading: "&	"http://newserver.mazraeyeman.ir/mazraeyeman_proxy.php?url="&SaeloZahra.EncodeUrl("http://dataservice.accuweather.com/forecasts/v1/hourly/12hour/"&accuWeatherCronJobService.RegionCode&"?metric=true&details=true&language=fa-ir&apikey="&accuWeatherCronJobService.ApiAccuWeather5)&"&amirTime="&DateTime.Now)
				Case Else
					JobGet12Hour.Download(	"http://newserver.mazraeyeman.ir/mazraeyeman_proxy.php?url="&SaeloZahra.EncodeUrl("http://dataservice.accuweather.com/forecasts/v1/hourly/12hour/"&accuWeatherCronJobService.RegionCode&"?metric=true&details=true&language=fa-ir&apikey="&accuWeatherCronJobService.ApiAccuWeather)&"&amirTime="&DateTime.Now)
					Log("Downloading: "&	"http://newserver.mazraeyeman.ir/mazraeyeman_proxy.php?url="&SaeloZahra.EncodeUrl("http://dataservice.accuweather.com/forecasts/v1/hourly/12hour/"&accuWeatherCronJobService.RegionCode&"?metric=true&details=true&language=fa-ir&apikey="&accuWeatherCronJobService.ApiAccuWeather)&"&amirTime="&DateTime.Now)
			End Select
			
		End If
		
		LogColor(Job.ErrorMessage,Colors.Magenta)
		
	End If
    
	Job.Release
	
End Sub


Sub MultiMediaWv_OverrideUrl (Url As String) As Boolean
'	SwipeMultiMedia.Pull_Immediately
	If MultiMediaWv.Tag <> "salam" Then ProgressDialogShow2(SaeloZahra.CSB("در حال بارگزاری رسانه ها"),True)
	MultiMediaWv.Tag = "bia"
	Log(Url)
	If Url=="http://porbazdid/" Then
		Return True
	else If Url=="http://porbahs/" Then
		Return True
'	else If Url.Contains(SaeloZahra.json_url&"multimedia.php?cat_id=") Then
'		Dim CatNum As String = Url.Replace(SaeloZahra.json_url&"multimedia.php?cat_id=","").Replace("/","")
'		ToastMessageShow( CatNum,True)
'		Return True
	else If Url.Contains("http://cat_id:") Then
		ToastMessageShow( Url.Replace("http://cat_id:","").Replace("/",""),True)
		Return True
	else If Url.Contains("http://singleid:") Then
		ProgressDialogShow(SaeloZahra.CSB("در حال بارگزاری"))
		Log(SaeloZahra.json_url&"post.php?type=html&id="&Url.Replace("http://singleid:","").Replace("/",""))
		jobSingleVideo.Tag = Url.Replace("http://singleid:","").Replace("/","")
		jobSingleVideo.Download(SaeloZahra.json_url&"post.php?type=html&id="&Url.Replace("http://singleid:","").Replace("/",""))
		Return True
	Else
		Return False
	End If
End Sub

Sub MultiMediaWv_PageFinished (Url As String)
	Try
		If SwipeMultiMedia.IsInitialized Then SwipeMultiMedia.RefreshCompleted '<-- call to exit refresh mode
	Catch
		Log("3333333333333333333")
		Log(LastException)
	End Try
	ProgressDialogHide
End Sub



Sub snakeSearch_Click()
	sv.Submit
End Sub


Private Sub Amir_onItemSelected (Position As Int)
	Log("onItemSelected : "&Position)
	VP.CurrentPage = Position
End Sub

Private Sub VP_PageChanged (Position As Int)
	BottomBar.ActiveItem = Position
	If Position == 2 Then
		ActionBar.Title=SaeloZahra.CSB("بازارچـــــــــــه")
		sv.QueryHint=SaeloZahra.CSB("جستجو در بازارچه")
	Else If Position == 1 Then
		ActionBar.Title=SaeloZahra.CSB("مزرعه من")
		sv.QueryHint=SaeloZahra.CSB("جستجو در سایت")
	Else If Position == 0 Then
		ActionBar.Title=SaeloZahra.CSB("چندرسانــــــــــــــــه‌ای")
		sv.QueryHint=SaeloZahra.CSB("جستجو در رسانه ها")
'		MultiMediaWv.LoadUrl(SaeloZahra.json_url&"multimedia.php")
		Log(SaeloZahra.json_url&"multimedia.php")
	End If
	
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
		"@import 'https://cdn.jsdelivr.net/gh/rastikerdar/samim-font@v4.0.5/dist/font-face.css';"& _
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
		" .topDamaMiangin{float:left; width:162px; text-align:center; margin-top:-10px; } "& _
		" .balayish_topdamaMiangin{ font-size:250%; font-weight: bold; } "& _
		" .JoziateBishtar{ text-align:center; color:ccc; bottom:0px; left:0; width:100%;position:absolute; font-size:90%; } "& _
		" .likeBtn{ display:inline-block;border-radius:8px; color:white;padding:2px 10px;margin:3px 14px;font-size:80%;background: #aac1c9; /* Old browsers */background: -moz-linear-gradient(-45deg,  #aac1c9 0%, #94a8af 100%); /* FF3.6-15 */background: -webkit-linear-gradient(-45deg,  #aac1c9 0%,#94a8af 100%); /* Chrome10-25,Safari5.1-6 */background: linear-gradient(135deg,  #aac1c9 0%,#94a8af 100%); /* W3C, IE10+, FF16+, Chrome26+, Opera12+, Safari7+ */filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#aac1c9', endColorstr='#94a8af',GradientType=1 );}</style>"
		
		
		Next12HFaghatDama.Sort(True)
		
		
		Dim miangineDamaInt As Int = (accuWeatherCronJobService.MinDama+accuWeatherCronJobService.MaxDama)/2
		
		Dim tarikhesh As String = "<div class='likeBtn' style='float:right;'>"&SaeloZahra.tarikheKhafan(DateTime.Now)&"</div>"
		Dim shahresh As String = "<div class='likeBtn' style='float:left;'>"&File.ReadMap(SaeloZahra.dir,"user.dat").Get("city")&"</div>"
		
		Dim TopDama As String = "<div class='topDama'><div class='balayish_topdama'>"&SaeloZahra.ConvertPersian(accuWeatherCronJobService.MaxDama)&"°</div><div class='payinish_topdama'>"&SaeloZahra.ConvertPersian(accuWeatherCronJobService.MinDama)&"°</div></div>"
		
		Dim Damasanj As String   = "<img style='float:right;max-width:40px;max-height:180px; margin-top:10px;margin-right:13px;' src='file:///android_asset/home-weather-1.png'>"
		
		
		
		If Night Then
			Dim AkseVaziat As String = "<img style='float:left;max-width:88px;max-height:180px; margin-top:20px; margin-left:10px;' src='file:///android_asset/"&accuWeatherCronJobService.NightIcon&".png'>"
		Else
			Dim AkseVaziat As String = "<img style='float:left;max-width:88px;max-height:180px; margin-top:20px; margin-left:10px;' src='file:///android_asset/"&accuWeatherCronJobService.DayIcon  &".png'>"
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
	
	If login_act.ItIsPayed Then
		
		SH.convertActivityFromTranslucent
		
		StartActivity(WeatherNewAct)
		
	Else
		ShowPardakhtModal
	End If
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
		gdr.Initialize("TR_BL", Array As Int(SaeloZahra.Color, SaeloZahra.ColorLight))
	End If
'	gdr.CornerRadius = 8dip
	
	p_view.Background=gdr
'	p_view.Elevation=8dip
'	p_view.Padding = Array As Int(5dip,2dip,5dip,2dip)

	
	Dim ImgCoverLbl As Label
	ImgCoverLbl.Initialize("ImgCoverLbl")
	If Zouj Then ImgCoverLbl.Color = SaeloZahra.Color Else ImgCoverLbl.Color = SaeloZahra.ColorDark
	p_view.AddView( ImgCoverLbl, PanelMsgs.Width-listItemHeightMSG,0,listItemHeightMSG,listItemHeightMSG)
	
	
	Dim CdBubble As ColorDrawable
	
	Dim ImgCoverBubbleLbl As Label
	ImgCoverBubbleLbl.Initialize("ImgCoverBubbleLbl")
	If Zouj Then CdBubble.Initialize(SaeloZahra.Color,14dip) Else CdBubble.Initialize(SaeloZahra.ColorDark,14dip)
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
	WVText.LoadHtml("<style>@import 'https://cdn.jsdelivr.net/gh/rastikerdar/samim-font@v4.0.5/dist/font-face.css'; *,body,html{font-family:'Samim';margin:auto;} .div{ direction:rtl; width:100%;float:left;height:100%;font-size:10px;}</style><div class='div'>"&SaeloZahra.PlainText(content_cli)&"</div>")
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
	

	If login_act.ItIsPayed Then
		
		Dim panel_test As Panel
		panel_test = ClvMsg.GetPanel(Index)
		
		Log("Tag is: "&panel_test.GetView(0).Tag)
		
		SH.convertActivityFromTranslucent
		
		StartActivity(NotificationAct)
		
	Else
		ShowPardakhtModal
	End If
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

Sub BazarcheWV_OverrideUrl (Url As String) As Boolean
'	SwipeBazarche.Pull_Immediately
	If MultiMediaWv.Tag <> "salam" Then ProgressDialogShow2(SaeloZahra.CSB("در حال بارگزاری رسانه ها"),True)
	MultiMediaWv.Tag = "bia"
	Log(Url)
	If Url.Contains("http://cat_id:") Then
		ToastMessageShow( Url.Replace("http://cat_id:","").Replace("/",""),True)
		Return True
	else If Url.Contains("http://bazarche:") Then
		ProgressDialogShow(SaeloZahra.CSB("در حال بارگزاری"))
		Log(SaeloZahra.json_url&"productfarmers_list.php?search=yes&field=db_product_farmers.id&s="&Url.Replace("http://bazarche:","").Replace("/",""))
		jobSingleBazarche.Download(SaeloZahra.json_url&"productfarmers_list.php?search=yes&field=db_product_farmers.id&s="&Url.Replace("http://bazarche:","").Replace("/",""))
		Return True
	else If Url.Contains("http://singleid:") Then
		Log(SaeloZahra.site_url&"?p="&Url.Replace("http://singleid:","").Replace("/",""))
		customBrowser.CreateNewTab(SaeloZahra.site_url&"?p="&Url.Replace("http://singleid:","").Replace("/",""))
		Return True
	Else
		Return False
	End If
End Sub


Sub BazarcheWV_PageFinished (Url As String)
	Try
		If SwipeBazarche.IsInitialized Then SwipeBazarche.RefreshCompleted '<-- call to exit refresh mode
	Catch
		Log("4444444444444444444")
		Log(LastException)
	End Try
	ProgressDialogHide
End Sub


#End Region


Sub ShowPardakhtModal
	ModalBuilder.Initialize("ModalBuilder")
'	ModalBuilder.Theme(ModalBuilder.THEME_DARK)
	ModalBuilder.Title(SaeloZahra.CSB("پرداخت حق عضویت"))
'	ModalBuilder.Content(SaeloZahra.CSB($"برای دسترسی کامل به تمام بخش‌های سامانه مبلغ ${RegisterAct.gheimatKamel} تومان پرداخت ${CRLF} و یا ${RegisterAct.TedadNafarateKamel} نفر را با کد معرف خود، عضو سامانه کنید ${CRLF&Application.LabelName} "$))
	ModalBuilder.Content(SaeloZahra.CSB($"دوره آزمایشی شما تمام شد ${CRLF} برای دسترسی کامل به تمام بخش‌های سامانه مبلغ ${RegisterAct.gheimatKamel} تومان پرداخت کنید "$))
	ModalBuilder.PositiveText("پرداخت حق عضویـــــت").NegativeText("معــــرفی افراد")
	ModalBuilder.IconRes("baseline_attach_money_white_24").LimitIconToDefaultSize
	ModalBuilder.ButtonStackedGravity(ModalBuilder.GRAVITY_END)
	ModalBuilder.ForceStacking(True)
	ModalBuilder.Show
End Sub

Sub ModalBuilder_ButtonPressed (Dialog As MaterialDialog, Action As String)
	Select Action
		Case Dialog.ACTION_POSITIVE
			' پرداخت حق عضویت
			Log("Positive Button pressed")
			customBrowser.CreateNewTab(SaeloZahra.json_url&"pec_pay/payment.php?aftertrial=true&tel="&Starter.usrnm&"&Amount="&RegisterAct.gheimatKamel&"0&OrderId="&Rnd(0,999)&Starter.usrnm&Rnd(100,999))
'		Case Dialog.ACTION_NEGATIVE
''			معرفی افراد
'			Log("Negative Button pressed")
'			SH.convertActivityFromTranslucent
'			Starter.rp.CheckAndRequest(Starter.rp.PERMISSION_READ_CONTACTS)
'			Wait For Activity_PermissionResult (Permission As String, Result As Boolean)
'			If Result Then StartActivity(ReferralAct)
		Case Dialog.ACTION_NEUTRAL
			Log("Neutral Button pressed")
	End Select
	
	Log("CheckBox: " & Dialog.PromptCheckBoxChecked)
End Sub
