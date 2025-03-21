B4A=true
Group=OLD
ModulesStructureVersion=1
Type=Activity
Version=8.8
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True
#End Region

#Extends: android.support.v7.app.AppCompatActivity

Sub Process_Globals
	Dim RegionCode As String
'	Dim gmap As GoogleMap
End Sub

Sub Globals
	Dim Config 	As Amir_SliderConfig
	Dim Show 	As Amir_SliderShow
	
	Dim Parser As JSONParser
	Dim vaziatHtml,vaziat2Html,vaziatRoozha,css_start,css_end As String
	Dim JobGet12Hour,JobGet5Day,JobGetAmar As HttpJob
	Private WebView1 As WebView
'	Private MapFragment1 As MapFragment
	Dim RainProbability,IceProbability,SnowProbability As Int
	
	Dim gChart As GoogleCharts
	
	Dim AC As AppCompat
	Private VP As AHViewPager
	Private PC As AHPageContainer
	Private TabLayout As DSTabLayout
	Private ActionBar As ACToolBarDark
	Dim P1,P2,PChart As Panel',Panel_map,
	Dim X1 As XmlLayoutBuilder
	
	Dim amar_spinner As Spinner

	Dim wind_amar_day,dewpoint_amar_day,ice_amar_day,snow_amar_day,cloudcover_amar_day,rain_amar_day,temp_amar_day,humidity_amar_day,uvindex_amar_day As Double
	Dim uvindex_amar_week,snow_amar_week,dewpoint_amar_week,ice_amar_week,temp_amar_week,humidity_amar_week,wind_amar_week,cloudcover_amar_week,rain_amar_week As Double
	Dim uvindex_amar_month,wind_amar_month,temp_amar_month,ice_amar_month,snow_amar_month,rain_amar_month,humidity_amar_month,dewpoint_amar_month,cloudcover_amar_month As Double
	Dim wind_amar_year,cloudcover_amar_year,rain_amar_year,uvindex_amar_year,dewpoint_amar_year,snow_amar_year,ice_amar_year,humidity_amar_year,temp_amar_year As Double
End Sub

Sub Activity_Create(FirstTime As Boolean)
	
	ProgressDialogShow(SaeloZahra.CSB("کمی صبر کنید"))
	
	Activity.LoadLayout("tab_layout")
	
	ActionBar.Title=SaeloZahra.CSB("وضعیت آب و هوا")
	
	Main.amaroid.TrackView(ActionBar.Title&"  - قدیم")
	
	ActionBar.Color=Colors.Transparent
	
	
	PC.Initialize
	TabLayout.SetTabTextColors(SaeloZahra.colorLight,Colors.White)
	
	ActionBar.NavigationIconDrawable = X1.GetDrawable("baseline_arrow_back_white_24")
	
	
	P1.Initialize("p1")
	WebView1.Initialize("WebView1")
	P1.AddView(WebView1,0dip,0dip,100%x,100%y)
	P2.Initialize("p2")
'	P1.LoadLayout("vaziateAboHavayeShomaLayout")
	
'	Activity.AddView(P1,0,SaeloZahra.MaterialActionBarHeight,100%x,40%y)
'	Activity.AddView(P2,0,SaeloZahra.MaterialActionBarHeight+40%y,100%x,40%y)
	
	PC.AddPage(P1, SaeloZahra.csb("آینده"))
	PC.AddPage(P2, SaeloZahra.csb("گذشته"))
	
	VP.PageContainer = PC
	
	TabLayout.Color = Colors.Transparent
	TabLayout.TabMode=TabLayout.MODE_FIXED
	
	TabLayout.SetViewPager(VP)
	ActionBar.SetLayout(0,AC.GetStatusBarHeight,100%x,SaeloZahra.MaterialActionBarHeight)
	TabLayout.SetLayout(0,ActionBar.Top+ActionBar.Height,100%x,SaeloZahra.MaterialActionBarHeight)
	VP.SetLayout(0,TabLayout.Top+TabLayout.Height,100%x,100%y - (SaeloZahra.MaterialActionBarHeight*2) )
	
	TabLayout.SetTabIcon(0,X1.GetDrawable("baseline_place_white_24"))
	TabLayout.SetTabIcon(1,X1.GetDrawable("baseline_all_inclusive_white_24"))
	
	
	
	If Not(File.Exists(SaeloZahra.dir,"RegionCode")) Then
		accuWeatherCronJobService.OpenHome=False
		StartService(accuWeatherCronJobService)
		ToastMessageShow("ابتدا سرویس را فعال کنید",True)
		Activity.Finish
	End If
	RegionCode = File.ReadString(SaeloZahra.dir,"RegionCode")
	
	RainProbability=0
	IceProbability =0
	SnowProbability=0
	
	JobGet12Hour.Initialize("JobGet12Hour", Me)
	JobGet5Day.Initialize("JobGet5Day", Me)
	JobGet5Day.Download("http://dataservice.accuweather.com/forecasts/v1/daily/5day/"&RegionCode&"?metric=true&details=true&language=fa-ir&apikey="&accuWeatherCronJobService.ApiAccuWeather)
	
	css_start	= "<html><body style='box-sizing: border-box; padding:8px; margin: auto;text-align: right; width:100%;max-width:100%;direction:rtl;line-height:1.8;font-family:Samim;color:#000;'>           <style>@import url(https://cdn.rawgit.com/rastikerdar/samim-font/v3.1.0/dist/font-face.css); h1{font-size:110%;margin:3% auto;} hr, .hr {background: rgba(0, 0, 0, 0) url('file:///android_asset/sp.png') repeat-x scroll center center; border: 0 none;clear: both;height: 19px;margin: 8px auto;width: 100%;} * {box-sizing: border-box;} a{color:#eee;} .img{max-width:100%;float:left;} .row{ float:right; width:100%; } .fr{float:right;} .fl{float:left;} .col-2{width:16%;float:left;font-size:80%;padding:2%;overflow:hidden}</style>       <pre style='white-space: pre-wrap;width:100%;font-family:Samim;'>"'white-space: pre-wrap;
	css_end		= "</pre><br style='clear:both;' ><br style='clear:both;' ><br style='clear:both;' > </body></html>"
	
	
	
	P1.SetLayout       (0,0,100%x,100%y - (SaeloZahra.MaterialActionBarHeight*2))
'	Panel_map.SetLayout(0,0,100%x,100%y - (SaeloZahra.MaterialActionBarHeight*2))
'///	MapFragment1.SetLayout(0,0,100%x,100%y - (SaeloZahra.MaterialActionBarHeight*2))
	WebView1.SetLayout (0,0,100%x,100%y - (SaeloZahra.MaterialActionBarHeight*2))
	
	WebView1.ZoomEnabled=False
	
	
	amar_spinner.Initialize("amar_spinner")
	amar_spinner.Add("نگــــــاه کلی")
	amar_spinner.Add("میـــانگین آمار")
	amar_spinner.Add("آمـــار روزانه")
	P2.AddView(amar_spinner,40%x,0,60%x,SaeloZahra.MaterialActionBarHeight)
	
	PChart.Initialize("PChart")
	PChart.Color=Colors.Transparent
	P2.AddView(PChart,0,SaeloZahra.MaterialActionBarHeight,100%x,-2)
	
	gChart.Initialize(PChart ,Me ,"Chart" ,False )
	
	
	JobGetAmar.Initialize("JobGetAmar", Me)
	JobGetAmar.Download(SaeloZahra.json_url&"statistics_weather.php?userid="&Starter.usrnm)
		
	If SaeloZahra.P.SdkVersion>23 Then
		Config.Initialize
		Config.position(Starter.SliderPosition)
		Config.scrimColor(Colors.Transparent)
		Config.primaryColor(Colors.RGB(3,169,244))
		Config.edge(True)
		Config.scrimColor(Colors.ARGB(50,0,0,0))

		Show.convertActivityToTranslucent
		Show.attachActivity(Config)
	End If
	
End Sub

Sub Activity_Resume

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





Sub jobDone(job As HttpJob)
	
	
	WebView1.Color=Colors.Transparent
'	WebView2.Color=Colors.Transparent
'	Panel_map.Visible=False
	
	
	LogColor(job.JobName&"    ,    "&job.Success,Colors.White)
	
				
				
	If job.Success Then
		
		ProgressDialogHide
		
		Select job.JobName
			Case "JobGetAmar"
				Dim Parser As JSONParser
				Parser.Initialize(job.GetString)
				Dim root_statistics As Map = Parser.NextObject
				Dim monthly_statistics As Map = root_statistics.Get("monthly_statistics")
					uvindex_amar_month = monthly_statistics.Get("uvindex_amar_month")
					wind_amar_month = monthly_statistics.Get("wind_amar_month")
					temp_amar_month = monthly_statistics.Get("temp_amar_month")
					ice_amar_month = monthly_statistics.Get("ice_amar_month")
					snow_amar_month = monthly_statistics.Get("snow_amar_month")
					rain_amar_month = monthly_statistics.Get("rain_amar_month")
					humidity_amar_month = monthly_statistics.Get("humidity_amar_month")
					dewpoint_amar_month = monthly_statistics.Get("dewpoint_amar_month")
					cloudcover_amar_month = monthly_statistics.Get("cloudcover_amar_month")
				Dim daily_statistics As Map = root_statistics.Get("daily_statistics")
					wind_amar_day = daily_statistics.Get("wind_amar_day")
					dewpoint_amar_day = daily_statistics.Get("dewpoint_amar_day")
					ice_amar_day = daily_statistics.Get("ice_amar_day")
					snow_amar_day = daily_statistics.Get("snow_amar_day")
					cloudcover_amar_day = daily_statistics.Get("cloudcover_amar_day")
					rain_amar_day = daily_statistics.Get("rain_amar_day")
					temp_amar_day = daily_statistics.Get("temp_amar_day")
					humidity_amar_day = daily_statistics.Get("humidity_amar_day")
					uvindex_amar_day = daily_statistics.Get("uvindex_amar_day")
				Dim weekly_statistics As Map = root_statistics.Get("weekly_statistics")
					uvindex_amar_week = weekly_statistics.Get("uvindex_amar_week")
					snow_amar_week = weekly_statistics.Get("snow_amar_week")
					dewpoint_amar_week = weekly_statistics.Get("dewpoint_amar_week")
					ice_amar_week = weekly_statistics.Get("ice_amar_week")
					temp_amar_week = weekly_statistics.Get("temp_amar_week")
					humidity_amar_week = weekly_statistics.Get("humidity_amar_week")
					wind_amar_week = weekly_statistics.Get("wind_amar_week")
					cloudcover_amar_week = weekly_statistics.Get("cloudcover_amar_week")
					rain_amar_week = weekly_statistics.Get("rain_amar_week")
				Dim yearly_statistics As Map = root_statistics.Get("yearly_statistics")
					wind_amar_year = yearly_statistics.Get("wind_amar_year")
					cloudcover_amar_year = yearly_statistics.Get("cloudcover_amar_year")
					rain_amar_year = yearly_statistics.Get("rain_amar_year")
					uvindex_amar_year = yearly_statistics.Get("uvindex_amar_year")
					dewpoint_amar_year = yearly_statistics.Get("dewpoint_amar_year")
					snow_amar_year = yearly_statistics.Get("snow_amar_year")
					ice_amar_year = yearly_statistics.Get("ice_amar_year")
					humidity_amar_year = yearly_statistics.Get("humidity_amar_year")
					temp_amar_year = yearly_statistics.Get("temp_amar_year")


				Bubble
	
			Case "JobGet12Hour"
				
				Dim list12Saat As String = File.ReadString(File.DirAssets,"start_slider.html")
				
	
'				Dim Zouj As Boolean = True
				Parser.Initialize(job.GetString)
				Dim root As List = Parser.NextArray
				For Each colroot As Map In root
					
'					If Zouj Then Zouj = False Else Zouj = True
'					If Not(Zouj) Then Continue
					
'					Dim ThisDateTime As String = colroot.Get("DateTime")
					Dim EpochDateTime As Long = colroot.Get("EpochDateTime")
					Dim WeatherIcon As String = colroot.Get("WeatherIcon")
					
'					Dim RelativeHumidity As Int = colroot.Get("RelativeHumidity")
'					Dim CloudCover As Int = colroot.Get("CloudCover")
'					Dim UVIndex As Int = colroot.Get("UVIndex")
'					Dim DewPoint As Map = colroot.Get("DewPoint")
'					Dim DewPointValue As Double = DewPoint.Get("Value")
'					Dim Ice As Map = colroot.Get("Ice")
'					Dim IceValue As Double = Ice.Get("Value")
'					Dim Snow As Map = colroot.Get("Snow")
'					Dim SnowValue As Double = Snow.Get("Value")
'					Dim Rain As Map = colroot.Get("Rain")
'					Dim RainValue As Double = Rain.Get("Value")
					Dim Wind As Map = colroot.Get("Wind")
					Dim WindSpeed As Map = Wind.Get("Speed")
					Dim WindSpeedValue As Double = WindSpeed.Get("Value")
					Dim Temperature As Map = colroot.Get("Temperature")
					Dim TemperatureValue As Double = Temperature.Get("Value")
					Dim TemperatureValue As Double = Temperature.Get("Value")
'					Dim PrecipitationProbability As Int = colroot.Get("PrecipitationProbability")
					RainProbability = RainProbability + colroot.Get("RainProbability")
					IceProbability  = IceProbability  + colroot.Get("IceProbability")
					SnowProbability = SnowProbability + colroot.Get("SnowProbability")
'					Dim WindGust As Map = colroot.Get("WindGust")
'					Dim WindGustSpeed As Map = WindGust.Get("Speed")
'					Dim WindGustSpeedValue As Double = WindGustSpeed.Get("Value")
					
					list12Saat=list12Saat&"<div class='item'>ساعت"&DateTime.GetHour(EpochDateTime&"000")&"<br><img class='img' src='https://apidev.accuweather.com/developers/Media/Default/WeatherIcons/"&SaeloZahra.addZero(WeatherIcon)&"-s.png'><br>"&TemperatureValue&"°C</div>"'col-2
			
			
'					Dim mapVals As Map
'					mapVals.Initialize
'					mapVals.Put("unique_id",	File.ReadString(SaeloZahra.dir,"usrnm")&"_"&ThisDateTime)
'					mapVals.Put("user",			File.ReadString(SaeloZahra.dir,"usrnm"))
'					mapVals.Put("latlng",		Starter.MyLocation.Latitude&","&Starter.MyLocation.Longitude)
'					mapVals.Put("time",			ThisDateTime)
'					mapVals.Put("humidity",		RelativeHumidity)'رطوبت
'					mapVals.Put("cloudcover",	CloudCover)
'					mapVals.Put("uvindex",		UVIndex)
'					mapVals.Put("dewpoint",		DewPointValue)'نقطه شبنم
'					mapVals.Put("ice",			IceValue)
'					mapVals.Put("snow",			SnowValue)
'					mapVals.Put("rain",			RainValue)
'					mapVals.Put("wind",			WindSpeedValue)
'					mapVals.Put("temp",			TemperatureValue)
'					mapVals.Put("ehtemal_precip",PrecipitationProbability)
'					mapVals.Put("ehtemal_rain",	RainProbability)
'					mapVals.Put("ehtemal_ice",	IceProbability)
'					mapVals.Put("ehtemal_snow",	SnowProbability)
'					mapVals.Put("ehtemal_gusts",WindGustSpeedValue)
					
					
'					ListValues.Add(mapVals)
'					
'					vaziatHtml=vaziatHtml&$"وضعیت آب و هوای: ${ThisDateTime}<br> <br> رطوبت: ${RelativeHumidity} <br> پوشش ابر: ${CloudCover} <br> شاخص اشعه ماوراء بنفش: ${UVIndex} <br> نقطه شبنم: ${DewPointValue}  <br> یخ زدگی: ${IceValue}   <br> برف: ${SnowValue}  <br> باران: ${RainValue}   <br> سرعت باد: ${WindSpeedValue}   <br> دما: ${TemperatureValue}   <br> احتمال بارش: ${RainProbability}  <br> احتمال یخ زدگی: ${IceProbability}  <br> احتمال بارش برف: ${SnowProbability}  <br> احتمال طوفان: ${WindGustSpeedValue}   <br><br><br><br>"$
'					
'					
'					If TemperatureValue > 14 Then
'						save_and_alert("اخطار گرما زدگی","دمای هوا در ساعات آینده به حد غیر مجاز "&TemperatureValue&" درجه میرسد و احتمال از بین رفتن محصولات شما میرود.")
'					End If
'				
				Next
				
				list12Saat=list12Saat&File.ReadString(File.DirAssets,"end_slider.html")
				
				vaziat2Html=vaziat2Html&"<div class='row'>احتمال بارش باران: "&SeRagham(RainProbability/12)&"%</div>"
				vaziat2Html=vaziat2Html&"<div class='row'>احتمال بارش برف: "&SeRagham(RainProbability/12)&"%</div>"
				vaziat2Html=vaziat2Html&"<div class='row'>احتمال یخ زدگی: "&SeRagham(RainProbability/12)&"%</div>"
				vaziat2Html=vaziat2Html&"<div class='row'>سرعت باد: "&WindSpeedValue&" کیلومتر بر ساعت </div>"
				
				
				WebView1.LoadHtml(css_start&vaziatHtml &"</pre><br><hr>"& list12Saat &"<hr><br><pre>"&vaziatRoozha&"<br>"&vaziat2Html&"<br><br><br><br><br><br>"&css_end)
				
				LogColor("Load Complete",Colors.Yellow)
				
			Case "JobGet5Day"
				
				
				Parser.Initialize(job.GetString)
				Dim DayRoot As Map = Parser.NextObject
				
				Dim Headline As Map = DayRoot.Get("Headline")
				Dim MatneTouzihat As String = Headline.Get("Text")
'				Dim VaziateAboHava As String = Headline.Get("Category")
				vaziatHtml = "<h1>"&MatneTouzihat&"</h1>"'<br> وضعیت کلی: &VaziateAboHava.Replace("rain","بارانی").Replace("heat","گرم")
'					Dim EndEpochDate As Int = Headline.Get("EndEpochDate")
'					Dim EffectiveEpochDate As Int = Headline.Get("EffectiveEpochDate")
'					Dim EffectiveDate As String = Headline.Get("EffectiveDate")
'					Dim Link As String = Headline.Get("Link")
'					Dim MobileLink As String = Headline.Get("MobileLink")

				Dim DailyForecasts As List = DayRoot.Get("DailyForecasts")
				
				Dim DailyForecastsNumber As Int = DateTime.GetDayOfWeek(DateTime.Now)
				
				For Each colDailyForecasts As Map In DailyForecasts
					Dim Moon As Map = colDailyForecasts.Get("Moon")
					Dim MoonEpochSet As Int = Moon.Get("EpochSet")
					Dim MoonSet As String = Moon.Get("Set")
'						Dim MoonPhase As String = Moon.Get("Phase")
'						Dim MoonEpochRise As Int = Moon.Get("EpochRise")
'						Dim MoonAge As Int = Moon.Get("Age")
'						Dim MoonRise As String = Moon.Get("Rise")
					
					Dim Sun As Map = colDailyForecasts.Get("Sun")
					Dim SunEpochSet As Int = Sun.Get("EpochSet")
					Dim SunSet As String = Sun.Get("Set")
'						Dim SunRise As String = Sun.Get("Rise")
					Dim SunEpochRise As Int = Sun.Get("EpochRise")
					
'					Dim HoursOfSun As Double = colDailyForecasts.Get("HoursOfSun")
'					Dim ThisDateTime As String = colDailyForecasts.Get("Date")
					
					Dim Temperature As Map = colDailyForecasts.Get("Temperature")
					Dim TemperatureMinimum As Map = Temperature.Get("Minimum")
'						Dim TemperatureMinimumUnitType As Int = TemperatureMinimum.Get("UnitType")
					Dim TemperatureMinimumValue As Double = TemperatureMinimum.Get("Value")
'						Dim TemperatureMinimumUnit As String = TemperatureMinimum.Get("Unit")
					Dim TemperatureMaximum As Map = Temperature.Get("Maximum")
'						Dim TemperatureMaximumUnitType As Int = TemperatureMaximum.Get("UnitType")
					Dim TemperatureMaximumValue As Double = TemperatureMaximum.Get("Value")
'						Dim TemperatureMaximumUnit As String = TemperatureMaximum.Get("Unit")
						
						
						
'					Dim RealFeelTemperature As Map = colDailyForecasts.Get("RealFeelTemperature")
'					Dim RealFeelTemperatureMinimum As Map = RealFeelTemperature.Get("Minimum")
'						Dim RealFeelTemperatureMinimumUnitType As Int = RealFeelTemperatureMinimum.Get("UnitType")
'						Dim RealFeelTemperatureMinimumValue As Double = RealFeelTemperatureMinimum.Get("Value")
'						Dim RealFeelTemperatureMinimumUnit As String = RealFeelTemperatureMinimum.Get("Unit")
'					Dim RealFeelTemperatureMaximum As Map = RealFeelTemperature.Get("Maximum")
'						Dim RealFeelTemperatureMaximumUnitType As Int = RealFeelTemperatureMaximum.Get("UnitType")
'						Dim RealFeelTemperatureMaximumValue As Double = RealFeelTemperatureMaximum.Get("Value")
'						Dim RealFeelTemperatureMaximumUnit As String = RealFeelTemperatureMaximum.Get("Unit")
							
						
						
						
						
						
						
					Dim Night As Map = colDailyForecasts.Get("Night")
					Dim NightRainProbability As Int = Night.Get("RainProbability")
					Dim NightSnowProbability As Int = Night.Get("SnowProbability")
'					Dim NightShortPhrase As String = Night.Get("ShortPhrase")
'					Dim NightHoursOfRain As Double = Night.Get("HoursOfRain")
'					Dim NightHoursOfIce As Double = Night.Get("HoursOfIce")
'					Dim NightThunderstormProbability As Int = Night.Get("ThunderstormProbability")
'					Dim NightIconPhrase As String = Night.Get("IconPhrase")
'					Dim NightLongPhrase As String = Night.Get("LongPhrase")
'					Dim NightIcon As Int = Night.Get("Icon")
					Dim NightIcon As String = 	"https://apidev.accuweather.com/developers/Media/Default/WeatherIcons/"&SaeloZahra.addZero(Night.Get("Icon"))&"-s.png"

'					Dim NightHoursOfSnow As Double = Night.Get("HoursOfSnow")
'					Dim NightHoursOfPrecipitation As Double = Night.Get("HoursOfPrecipitation")
					Dim NightPrecipitationProbability As Int = Night.Get("PrecipitationProbability")
					Dim NightIceProbability As Int = Night.Get("IceProbability")
					Dim NightCloudCover As Int = Night.Get("CloudCover")
					
					Dim NightWind As Map = Night.Get("Wind")
					Dim NightWindSpeed As Map = NightWind.Get("Speed")
'							Dim NightWindSpeedUnitType As Int = NightWindSpeed.Get("UnitType")
					Dim NightWindSpeedValue As Double = NightWindSpeed.Get("Value")
'							Dim NightWindSpeedUnit As String = NightWindSpeed.Get("Unit")
'						Dim NightWindDirection As Map = NightWind.Get("Direction")
'							Dim NightWindDirectionEnglish As String = NightWindDirection.Get("English")
'							Dim NightWindDirectionDegrees As Int = NightWindDirection.Get("Degrees")
'							Dim NightWindDirectionLocalized As String = NightWindDirection.Get("Localized")
					Dim NightSnow As Map = Night.Get("Snow")
'						Dim NightSnowUnitType As Int = NightSnow.Get("UnitType")
					Dim NightSnowValue As Double = NightSnow.Get("Value")
'						Dim NightSnowUnit As String = NightSnow.Get("Unit")
					Dim NightTotalLiquid As Map = Night.Get("TotalLiquid")
'						Dim TotalLiquidUnitType As Int = TotalLiquid.Get("UnitType")
					Dim NightTotalLiquidValue As Double = NightTotalLiquid.Get("Value")
'						Dim TotalLiquidUnit As String = TotalLiquid.Get("Unit")
					Dim NightIce As Map = Night.Get("Ice")
'						Dim IceUnitType As Int = Ice.Get("UnitType")
					Dim NightIceValue As Double = NightIce.Get("Value")
'						Dim IceUnit As String = Ice.Get("Unit")
					Dim NightRain As Map = Night.Get("Rain")
'						Dim NightRainUnitType As Int = NightRain.Get("UnitType")
					Dim NightRainValue As Double = NightRain.Get("Value")
'						Dim NightRainUnit As String = NightRain.Get("Unit")
					Dim NightWindGust As Map = Night.Get("WindGust")
					Dim NightWindGustSpeed As Map = NightWindGust.Get("Speed")
'							Dim NightWindGustSpeedUnitType As Int = NightWindGustSpeed.Get("UnitType")
					Dim NightWindGustSpeedValue As Double = NightWindGustSpeed.Get("Value")
'							Dim NightWindGustSpeedUnit As String = NightWindGustSpeed.Get("Unit")
'						Dim Direction As Map = WindGust.Get("Direction")
'							Dim English As String = Direction.Get("English")
'							Dim Degrees As Int = Direction.Get("Degrees")
'							Dim Localized As String = Direction.Get("Localized")
					Dim UnixTimeStamp As Int = colDailyForecasts.Get("EpochDate")

					Dim DegreeDaySummary As Map = colDailyForecasts.Get("DegreeDaySummary")
					Dim DegreeDaySummaryCooling As Map = DegreeDaySummary.Get("Cooling")
'						Dim DegreeDaySummaryCoolingUnitType As Int = DegreeDaySummaryCooling.Get("UnitType")
					Dim DegreeDaySummaryCoolingValue As Double = DegreeDaySummaryCooling.Get("Value")
'						Dim DegreeDaySummaryCoolingUnit As String = DegreeDaySummaryCooling.Get("Unit")
					Dim DegreeDaySummaryHeating As Map = DegreeDaySummary.Get("Heating")
'						Dim DegreeDaySummaryHeatingUnitType As Int = DegreeDaySummaryHeating.Get("UnitType")
					Dim DegreeDaySummaryHeatingValue As Double = DegreeDaySummaryHeating.Get("Value")
'						Dim DegreeDaySummaryHeatingUnit As String = DegreeDaySummaryHeating.Get("Unit")
						
					
					
'					Dim RealFeelTemperatureShade As Map = colDailyForecasts.Get("RealFeelTemperatureShade")
'						Dim Minimum As Map = RealFeelTemperatureShade.Get("Minimum")
'							Dim UnitType As Int = Minimum.Get("UnitType")
'							Dim Value As Double = Minimum.Get("Value")
'							Dim Unit As String = Minimum.Get("Unit")
'						Dim Maximum As Map = RealFeelTemperatureShade.Get("Maximum")
'							Dim UnitType As Int = Maximum.Get("UnitType")
'							Dim Value As Double = Maximum.Get("Value")
'							Dim Unit As String = Maximum.Get("Unit")
							
							
							
							
							
							
							
							
					Dim Day As Map = colDailyForecasts.Get("Day")
					
'					Dim DayShortPhrase As String = 				Day.Get("ShortPhrase")
'					Dim DayThunderstormProbability As Int = 	Day.Get("ThunderstormProbability")
'					Dim DayIconPhrase As String = 				Day.Get("IconPhrase")
'					Dim DayLongPhrase As String = 				Day.Get("LongPhrase")
					Dim DayIcon As String = 					"https://apidev.accuweather.com/developers/Media/Default/WeatherIcons/"&SaeloZahra.addZero(Day.Get("Icon"))&"-s.png"
'					Dim DayHoursOfRain As Double = 				Day.Get("HoursOfRain")
'					Dim DayHoursOfIce As Double = 				Day.Get("HoursOfIce")
'					Dim DayHoursOfSnow As Double = 				Day.Get("HoursOfSnow")
'					Dim DayHoursOfPrecipitation As Double = 	Day.Get("HoursOfPrecipitation")
					Dim DaySnowProbability As Int = 			Day.Get("SnowProbability")
					Dim DayPrecipitationProbability As Int = 	Day.Get("PrecipitationProbability")
					Dim DayIceProbability As Int = 				Day.Get("IceProbability")
					Dim DayCloudCover As Int = 					Day.Get("CloudCover")
					Dim DayRainProbability As Int = 			Day.Get("RainProbability")
					
					Dim DayWind As Map = Day.Get("Wind")
					Dim DayWindSpeed As Map = DayWind.Get("Speed")
'						Dim DayWindSpeedUnitType As Int = DayWindSpeed.Get("UnitType")
					Dim DayWindSpeedValue As Double = DayWindSpeed.Get("Value")
'						Dim DayWindSpeedUnit As String = DayWindSpeed.Get("Unit")
'					Dim DayWindDirection As Map = DayWind.Get("Direction")
'						Dim DayWindDirectionEnglish As String = DayWindDirection.Get("English")
'						Dim DayWindDirectionDegrees As Int = DayWindDirection.Get("Degrees")
'						Dim DayWindDirectionLocalized As String = DayWindDirection.Get("Localized")
					Dim DaySnow As Map = Day.Get("Snow")
'						Dim DaySnowUnitType As Int = DaySnow.Get("UnitType")
					Dim DaySnowValue As Double = DaySnow.Get("Value")
'						Dim DaySnowUnit As String = DaySnow.Get("Unit")
					Dim DayTotalLiquid As Map = Day.Get("TotalLiquid")
'						Dim DayTotalLiquidUnitType As Int = DayTotalLiquid.Get("UnitType")
					Dim DayTotalLiquidValue As Double = DayTotalLiquid.Get("Value")
'						Dim DayTotalLiquidUnit As String = DayTotalLiquid.Get("Unit")
					Dim DayIce As Map = Day.Get("Ice")
'						Dim DayIceUnitType As Int = DayIce.Get("UnitType")
					Dim DayIceValue As Double = DayIce.Get("Value")
'						Dim DayIceUnit As String = DayIce.Get("Unit")
					Dim DayRain As Map = Day.Get("Rain")
'						Dim DayRainUnitType As Int = DayRain.Get("UnitType")
					Dim DayRainValue As Double = DayRain.Get("Value")
'						Dim DayRainUnit As String = DayRain.Get("Unit")
					Dim DayWindGust As Map = Day.Get("WindGust")
					Dim DayWindGustSpeed As Map = DayWindGust.Get("Speed")
'						Dim DayWindGustSpeedUnitType As Int = DayWindGustSpeed.Get("UnitType")
					Dim DayWindGustSpeedValue As Double = DayWindGustSpeed.Get("Value")
'						Dim DayWindGustSpeedUnit As String = DayWindGustSpeed.Get("Unit")
'					Dim DayWindGustDirection As Map = DayWindGust.Get("Direction")
'						Dim DayWindGustDirectionEnglish As String = DayWindGustDirection.Get("English")
'						Dim DayWindGustDirectionDegrees As Int = DayWindGustDirection.Get("Degrees")
'						Dim DayWindGustDirectionLocalized As String = DayWindGustDirection.Get("Localized")
					
					
					
					Dim UVIndex As Int
					
					Dim AirAndPollen As List = colDailyForecasts.Get("AirAndPollen")
					For Each colAirAndPollen As Map In AirAndPollen
'						Dim colAirAndPollenCategory As String = colAirAndPollen.Get("Category")
'						Dim colAirAndPollenCategoryValue As Int = colAirAndPollen.Get("CategoryValue")
						Dim colAirAndPollenValue As Int = colAirAndPollen.Get("Value")
						Dim colAirAndPollenName As String = colAirAndPollen.Get("Name")
						
						If colAirAndPollenName == "" Then UVIndex = colAirAndPollenValue
					Next
					
					
					
					
					
					
					
					Dim mapNight As Map
					mapNight.Initialize
					mapNight.Put("unique_id",		File.ReadString(SaeloZahra.dir,"usrnm")&"_"&MoonEpochSet)
					mapNight.Put("user",			File.ReadString(SaeloZahra.dir,"usrnm"))
					mapNight.Put("latlng",			Starter.MyLocation.Latitude&","&Starter.MyLocation.Longitude)
					mapNight.Put("time",			MoonSet)
					mapNight.Put("humidity",		NightTotalLiquidValue)'رطوبت
'					mapNight.Put("dewpoint",		DewPointValue)'نقطه شبنم
					mapNight.Put("cloudcover",		NightCloudCover)
					mapNight.Put("uvindex",			UVIndex)
					mapNight.Put("ice",				NightIceValue)
					mapNight.Put("snow",			NightSnowValue)
					mapNight.Put("rain",			NightRainValue)
					mapNight.Put("wind",			NightWindSpeedValue)
					mapNight.Put("temp",			TemperatureMaximumValue)
					mapNight.Put("ehtemal_precip",	NightPrecipitationProbability)
					mapNight.Put("ehtemal_ice",		NightIceProbability)
					mapNight.Put("ehtemal_rain",	NightRainProbability)
					mapNight.Put("ehtemal_snow",	NightSnowProbability)
					mapNight.Put("ehtemal_gusts",	NightWindGustSpeedValue)
					mapNight.Put("degreeday",		DegreeDaySummaryCoolingValue)'CreateMap("cool":DegreeDaySummaryCoolingValue,"heat":DegreeDaySummaryHeatingValue))
					mapNight.Put("day",				UnixTimeStamp)
					
					
					
					
					
					Dim mapDay As Map
					mapDay.Initialize
					mapDay.Put("unique_id",		File.ReadString(SaeloZahra.dir,"usrnm")&"_"&SunEpochSet)
					mapDay.Put("user",			File.ReadString(SaeloZahra.dir,"usrnm"))
					mapDay.Put("latlng",		Starter.MyLocation.Latitude&","&Starter.MyLocation.Longitude)
					mapDay.Put("time",			SunSet)
					mapDay.Put("humidity",		DayTotalLiquidValue)'رطوبت
'					mapDay.Put("dewpoint",		DewPointValue)'نقطه شبنم
					mapDay.Put("cloudcover",	DayCloudCover)
					mapDay.Put("uvindex",		UVIndex)
					mapDay.Put("ice",			DayIceValue)
					mapDay.Put("snow",			DaySnowValue)
					mapDay.Put("rain",			DayRainValue)
					mapDay.Put("wind",			DayWindSpeedValue)
					mapDay.Put("temp",			TemperatureMinimumValue)
					mapDay.Put("ehtemal_precip",DayPrecipitationProbability)
					mapDay.Put("ehtemal_ice",	DayIceProbability)
					mapDay.Put("ehtemal_rain",	DayRainProbability)
					mapDay.Put("ehtemal_snow",	DaySnowProbability)
					mapDay.Put("ehtemal_gusts",	DayWindGustSpeedValue)
					mapDay.Put("degreeday",		DegreeDaySummaryHeatingValue)
					mapDay.Put("day",			UnixTimeStamp)
					

					vaziatRoozha=vaziatRoozha&"<div class='row'><div class='fr'>صبح "&SaeloZahra.NameShomareyeRoozeHafte(DailyForecastsNumber )&"</div><img src='"&DayIcon&"'> <div class='fl'>"&TemperatureMaximumValue&"°C</div></div>"
					vaziatRoozha=vaziatRoozha&"<div class='row'><div class='fr'>شب "&SaeloZahra.NameShomareyeRoozeHafte(DailyForecastsNumber )&"</div><img src='"&NightIcon&"'> <div class='fl'>"&TemperatureMinimumValue&"°C</div></div>"
					vaziatRoozha=vaziatRoozha&"<br><hr><br>"
					
					If DailyForecastsNumber = 7 Then
						DailyForecastsNumber = 1
					Else
						DailyForecastsNumber=DailyForecastsNumber+1
					End If
					
'					vaziatHtml=vaziatHtml&$"وضعیت آب و هوای: ${SunSet}<br> <br> رطوبت روز: ${DayTotalLiquidValue}  رطوبت شب: ${NightTotalLiquidValue} <br> پوشش ابر روز: ${DayCloudCover}  پوشش ابر شب: ${NightCloudCover} <br> شاخص اشعه ماوراء بنفش: ${UVIndex}  <br> یخ زدگی روز: ${DayIceValue}  یخ زدگی شب: ${NightIceValue}   <br> میزان برف روز: ${DaySnowValue}  میزان برف شب: ${NightSnowValue}  <br> میزان باران روز: ${DayRainValue}  میزان باران شب: ${NightRainValue}   <br> سرعت باد روز: ${DayWindSpeedValue}  سرعت باد شب: ${NightWindSpeedValue}   <br> حداقل دما: ${TemperatureMinimumValue} حداکثر دما: ${TemperatureMaximumValue}   <br> احتمال بارش در روز: ${DayRainProbability}  احتمال بارش در شب: ${NightRainProbability}  <br> احتمال یخ زدگی در روز: ${DayIceProbability}  احتمال یخ زدگی در شب: ${NightIceProbability}  <br> احتمال بارش برف در روز: ${DaySnowProbability}	  احتمال بارش برف در شب: ${NightSnowProbability}  <br> احتمال طوفان در روز: ${DayWindGustSpeedValue}  احتمال طوفان در شب: ${NightWindGustSpeedValue}   <br><br><hr><br>"$
				Next
					
				
				vaziat2Html=vaziat2Html&"<div class='row'>طلوع آفتاب: "&DateTime.Time(SunEpochRise * 1000 )&"</div>"
				vaziat2Html=vaziat2Html&"<div class='row'>غروب آفتاب: "&DateTime.Time(SunEpochSet * 1000 )&"</div>"
					
				
				JobGet12Hour.Download("http://dataservice.accuweather.com/forecasts/v1/hourly/12hour/"&RegionCode&"?metric=true&details=true&apikey="&accuWeatherCronJobService.ApiAccuWeather)
					
				LogColor("Load Complete And Now Loading:   http://dataservice.accuweather.com/forecasts/v1/hourly/12hour/"&RegionCode&"?metric=true&details=true&apikey="&accuWeatherCronJobService.ApiAccuWeather,Colors.Blue)

				
		End Select
	Else
		
		If job.ErrorMessage.Contains("allowed number of requests") Then
			VP.GotoPage(1,True)
			ToastMessageShow(SaeloZahra.CSB("سقف مرور روزانه نرم افزار تکمیل شده"),True)
		End If
		
		If job.ErrorMessage.Contains("No address associated with hostname") Or job.ErrorMessage.Contains("503 Service Unavailable") Then
			ToastMessageShow("آدرس فیلتر شده"&CRLF&"در حال دور زدن تحریم...",False)
			Select job.JobName
				Case "JobGet12Hour"
					Log("در حال شکستن فیلتر JobGet12Hour")
					JobGet12Hour.Download(	"http://newserver.mazraeyeman.ir/mazraeyeman_proxy.php?url="&SaeloZahra.EncodeUrl("http://dataservice.accuweather.com/forecasts/v1/hourly/12hour/"&RegionCode&"?metric=true&details=true&apikey="&accuWeatherCronJobService.ApiAccuWeather))
				Case "JobGet5Day"
					JobGet5Day.Download(	"http://newserver.mazraeyeman.ir/mazraeyeman_proxy.php?url="&SaeloZahra.EncodeUrl("http://dataservice.accuweather.com/forecasts/v1/daily/5day/"&RegionCode&"?metric=true&details=true&language=fa-ir&apikey="&accuWeatherCronJobService.ApiAccuWeather))
			End Select
			ToastMessageShow("صفحه مورد نظر پیدا نشد"&CRLF&"احتمالا آیپی شما مسدود شده یا اینترنتتون قطع هست",True)
		End If
		
		LogColor(job.ErrorMessage,Colors.Red)
		
	End If
	
	job.Release
	
End Sub


'Sub MapFragment1_Ready
'	
'	Log("Map Ready")
'	
'	Try
'		gmap = MapFragment1.GetMap
'	Catch
'		Log("Nashod Dadash:  "&LastException)
'	End Try
'	
'	If Not(gmap.IsInitialized) Then
'		ToastMessageShow("نتوانستیم نقشه را نصب کنیم", True)
'	Else
'		Dim cp As CameraPosition
'		cp.Initialize( Starter.MyLocation.Latitude, Starter.MyLocation.Longitude, 16 )
'		gmap.AnimateCamera(cp)
'		Log("Go To My Location")
'	End If
'	
'	SaeloZahra.ChangeGooglemapStyle(File.ReadString(File.DirAssets,"googlemapstyle.txt"),gmap)
'	
'End Sub

Sub SeRagham(inputText As String) As String
	If inputText.Length>=3 Then
		Return inputText.SubString2(0,3)
	Else
		Return inputText
	End If
End Sub









'##########################
'######## Routines ########
'##########################

'This event will trigger when the chart has completed loading.
Sub Chart_ChartGenerated_Response

	ProgressDialogHide

End Sub

'This event will trigger when the MENU button is pressed.
'You can add any actions here, in this example, we are showing
'options to save or print the chart.
Sub Chart_ChartMenuButtonPressed_Response

	Private Options As List
	Private Action As Int
				
	Options.Initialize
				
	Options.AddAll(Array As String("Save", "Print"))
				
	Action = InputList(Options, "Select Action", -1)
				
	Select Action
				
		Case 0
											
			gChart.SaveChart(File.DirDefaultExternal, "SavedChart.png")
																
		Case 1
											
			gChart.PrintChart
											
	End Select
								
End Sub

Sub Chart_ChartSaved_Response

	ToastMessageShow("چارت با موفقیت ذخیره شد...", False)
				
End Sub



Sub Bar

	gChart.Initialize(PChart, Me, "Chart", False)
				
'	gChart.AddOnlineCustomFontToChart = "Roboto:100"
	
	'Local fonts MUST be in your assets.
	gChart.AddOfflineCustomFontToChart = "Samim-FD-WOL.ttf" 'The font name MUST be LOWERCASE.
				
	gChart.BarChartTitle = "جدول مشاهده میانگین آمار"
	gChart.BarChartTitleStyle("green", "Samim-FD-WOL.ttf", 20, False, True)

	gChart.BarChartSetColumnLabel = "مقدار"
				
				
	
				
	
	gChart.BarChartSetColumnValues("دما"			, Array As Double(temp_amar_day))
	gChart.BarChartSetColumnValues("اشعه یو وی"	, Array As Double(uvindex_amar_day))
	gChart.BarChartSetColumnValues("نقطه شبنم"	, Array As Double(dewpoint_amar_day))
	gChart.BarChartSetColumnValues("سرعت باد"	, Array As Double(wind_amar_day))
	gChart.BarChartSetColumnValues("رطوبت"		, Array As Double(humidity_amar_day))
	gChart.BarChartSetColumnValues("پوشش ابر"	, Array As Double(cloudcover_amar_day))
	gChart.BarChartSetColumnValues("یخ زدگی"		, Array As Double(ice_amar_day))
	gChart.BarChartSetColumnValues("برف"		, Array As Double(snow_amar_day))
	gChart.BarChartSetColumnValues("باران"		, Array As Double(rain_amar_day))
				
	gChart.BarChartLegend("right", "purple", "Samim-FD-WOL.ttf", 14, False, True)
	gChart.BarChartOrientation = "horizontal"
	gChart.BarChartIsStacked = False
	gChart.BarChartSetHorizontalAxisTitle("معیار", SaeloZahra.colorDark, "Samim-FD-WOL.ttf", 20, False, True)
	gChart.BarChartSetVerticalAxisTitle(  "مقدار", SaeloZahra.colorDark, "Samim-FD-WOL.ttf", 20, False, True)
	gChart.BarChartSetAxisTitlesPosition = "out"
	gChart.BarChartShowColumnLabel = True
	gChart.BarChartBarsColor = Array As String("green","red","blue")
								
	gChart.ShowBarChart

End Sub

Sub Scatter

	gChart.Initialize(PChart, Me, "Chart", True)
			
	gChart.AddOfflineCustomFontToChart = "Samim-FD-WOL.ttf"

	gChart.ScatterChartTitle = "آمار روزانه زمین کشاورزی شما"
	gChart.ScatterChartTitleStyle("brown", "", 18, False, False)
	gChart.ScatterChartLegend("right", "red", "Samim-FD-WOL.ttf", 16, False, False)
	gChart.ScatterChartSetAxisTitlesPosition = "out"
	gChart.ScatterChartSetHorizontalAxisTitle("زمان", "", "Samim-FD-WOL.ttf", 16, True, False)
	gChart.ScatterChartSetVerticalAxisTitle("میزان", "","Samim-FD-WOL.ttf", 16, True, False)
	gChart.ScatterChartPointShape("circle", 14)
	gChart.ScatterChartCrosshair("both", "both")


	gChart.ScatterChartDotsColor = Array As String("OrangeRed", "green", "blue")
			
			
	gChart.ScatterChartSetColumnValues("Age", Array As Double(8, 12, 7.3)) 'First column can't be included on a trend line.
	gChart.ScatterChartSetColumnValues("دما", 		Array As Double(temp_amar_day, temp_amar_month, temp_amar_year))
	gChart.ScatterChartSetColumnValues("اشعه یو وی", Array As Double(uvindex_amar_day, uvindex_amar_week, uvindex_amar_month, uvindex_amar_year))
	gChart.ScatterChartSetColumnValues("نقطه شبنم", 	Array As Double(dewpoint_amar_day, dewpoint_amar_week,dewpoint_amar_month,dewpoint_amar_year))
	gChart.ScatterChartSetColumnValues("سرعت باد", 	Array As Double(wind_amar_day, wind_amar_week,wind_amar_month,wind_amar_year))
	gChart.ScatterChartSetColumnValues("رطوبت", 	Array As Double(humidity_amar_day, humidity_amar_week, humidity_amar_month, humidity_amar_year))
	gChart.ScatterChartSetColumnValues("پوشش ابر", 	Array As Double(cloudcover_amar_day, cloudcover_amar_week, cloudcover_amar_month, cloudcover_amar_year))
	gChart.ScatterChartSetColumnValues("یخ زدگی", 	Array As Double(ice_amar_day , ice_amar_week,ice_amar_month,ice_amar_year))
	gChart.ScatterChartSetColumnValues("برف", 		Array As Double(snow_amar_day, snow_amar_week, snow_amar_month, snow_amar_year))
	gChart.ScatterChartSetColumnValues("باران", 		Array As Double(rain_amar_day, rain_amar_week, rain_amar_month, rain_amar_year))
	
	
	gChart.ScatterChartShowTrendLine("دما", "دما (برتر)" , "polynomial", 2, 1, 1, True)
			
	gChart.ShowScatterChart

End Sub


Sub Bubble

	gChart.Initialize(PChart, Me, "Chart", False)
			
	gChart.BubbleChartTitle = "تمام شاخص ها در زمین کشاورزی شما"
	gChart.BubbleChartTitleStyle("black", "", 20, True, True)
	gChart.BubbleChartLegend("out", "green", "", 14, False, False)
	gChart.BubbleChartSetHorizontalAxisTitle("معیــار", "blue", "Samim-FD-WOL.ttf", 16, False, False)
	gChart.BubbleChartSetVerticalAxisTitle("مقـــــدار", "blue", "Samim-FD-WOL.ttf", 16, False, False)
	gChart.BubbleChartSetBubbleStyle("white", "Samim-FD-WOL.ttf", 14, "black", False, False)
			
			
	gChart.BubbleChartLegendColorAxis = Array As String("red", "blue", "orange")
	gChart.BubbleChartSeriesColor = Array As String("grey", "blue")

	gChart.BubbleChartSetColumnLabel = "ID"
	gChart.BubbleChartSetColumnLabel = "ردیف"
	gChart.BubbleChartSetColumnLabel = "امروز"
	gChart.BubbleChartSetColumnLabel = "هفتگی"
	gChart.BubbleChartSetColumnLabel = "ماهانه"
	gChart.BubbleChartSetColumnLabel = "سالانه"
	
	
	
	gChart.BubbleChartSetColumnValues("دما", 		Array As String("1", temp_amar_day, temp_amar_week&"°C", temp_amar_month, temp_amar_year&"°C"))
	gChart.BubbleChartSetColumnValues("اشعه یو وی", 	Array As String("10", uvindex_amar_day, uvindex_amar_week&" SPF", uvindex_amar_month, uvindex_amar_year&" SPF"))
	gChart.BubbleChartSetColumnValues("نقطه شبنم", 	Array As String("20", dewpoint_amar_day, dewpoint_amar_week&"TD",dewpoint_amar_month,dewpoint_amar_year&"TD"))
	gChart.BubbleChartSetColumnValues("سرعت باد", 	Array As String("30", wind_amar_day, wind_amar_week&" کیلومتر بر ساعت",wind_amar_month,wind_amar_year&" کیلومتر بر ساعت"))
	gChart.BubbleChartSetColumnValues("رطوبت", 		Array As String("40", humidity_amar_day, humidity_amar_week&"%", humidity_amar_month, humidity_amar_year&"%"))
	gChart.BubbleChartSetColumnValues("پوشش ابر", 	Array As String("50", cloudcover_amar_day, cloudcover_amar_week&" اکتا", cloudcover_amar_month, cloudcover_amar_year&" اکتا"))
	gChart.BubbleChartSetColumnValues("یخ زدگی", 	Array As String("60", ice_amar_day , ice_amar_week&" میلیمتر",ice_amar_month,ice_amar_year&" میلیمتر"))
	gChart.BubbleChartSetColumnValues("برف", 		Array As String("70", snow_amar_day, snow_amar_week&" سانتی متر", snow_amar_month, snow_amar_year&" سانتی متر"))
	gChart.BubbleChartSetColumnValues("باران", 		Array As String("80", rain_amar_day, rain_amar_week&" میلیمتر", rain_amar_month, rain_amar_year&" میلیمتر"))
	
	gChart.ShowBubbleChart

End Sub

Sub amar_spinner_ItemClick (Position As Int, Value As Object)
	Select Position
		Case 0
			Bubble
		Case 1
			Scatter
		Case 2
			Bar
	End Select
End Sub
