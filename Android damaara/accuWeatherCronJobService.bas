B4A=true
Group=Service
ModulesStructureVersion=1
Type=Service
Version=8.8
@EndOfDesignText@
#Region  Service Attributes 
	#StartAtBoot: True
#End Region

Sub Process_Globals
	Dim OpenHome As Boolean = False
	Dim JobGetRegionCode,JobGetAccuWeather As HttpJob
	Dim RegionCode As String
	Dim AvvalinBar As Boolean = False
	Dim sql1 As SQL
	Dim FullUrl As String
	Dim MatneTouzihat As String
	Dim UVIndex,DayShortPhrase,NightShortPhrase As String',Humidity,Wind
	Dim ApiAccuWeather As String  = "g9btQW4rvB3pAHS37m8kqA8xobFsSGUu" 'emily
	Dim ApiAccuWeather1 As String = "4LlMJ2sdnGCqgsLeZV30m11X1QEHRLM7" 'info@mazrae
	Dim ApiAccuWeather2 As String = "rgAVOs6ZCNaut1hbqL3p8YVBkkLZBtrq"
	Dim ApiAccuWeather3 As String = "ARgdZ3zsAzhRLn5MadrahTDaCVVHoTb7" ' ltf
	Dim ApiAccuWeather4 As String = "3JtrEZcZTQO9ptzb0AhALr1JKm3ucOIw" ' Amirltf
	Dim ApiAccuWeather5 As String = "5pYddALhTGle3ytso69AuK6H4jkerbDL" 'saelozahra14@gmail.com
	Dim ApiAccuWeather6 As String = "wLSgTqG4jjoTNbK7vYgyC4HRQVlwXbYt"
	Dim DayIcon,NightIcon,DayRainProbability,MinDama,MaxDama As Int
	Dim BazeDama,WindHaDay,WindHaNight,ListValues,ListUserProducts As List
	Dim RAF As RandomAccessFile
	Dim NotifKon As Boolean
End Sub

Sub Service_Create
	LogColor("AccuWeatherCronJobService Created",SaeloZahra.ColorDark)
End Sub




Sub Service_Start (StartingIntent As Intent)
	
	LogColor("AccuWeatherCronJobService Started",SaeloZahra.ColorDark)
	
	If Not(Starter.MyLocation.IsInitialized) Then
		If File.Exists(SaeloZahra.dir,"lat") Then
			Starter.MyLocation.Initialize
			Starter.MyLocation.Latitude  = File.ReadString(SaeloZahra.Dir,"lat")
			Starter.MyLocation.Longitude = File.ReadString(SaeloZahra.Dir,"lng")
		End If
	End If
	
	
	If SaeloZahra.CheckConnection Then
		StartServiceAt(Me, DateTime.Now + 24 * DateTime.TicksPerHour, True)
		FindRegionCode
	Else
		Log("اینترنتو وصل کن داداچ")
		StartServiceAt(Me, DateTime.Now + 15 * DateTime.TicksPerMinute, True)
	End If
'	Service.StopAutomaticForeground 'Call this when the background task completes (if there is one)



	If Not(File.Exists(SaeloZahra.dir,"db.db"))Then
		File.Copy(File.DirAssets,"db.db",SaeloZahra.dir,"db.db")
	End If
	
	If sql1.IsInitialized = False Then
		sql1.Initialize(SaeloZahra.dir,"db.db",False)
	End If
	
End Sub
	

Sub Service_Destroy
	
End Sub

Public Sub FindRegionCode
	
	ListValues.Initialize
	
	LogColor("Start Weather Service",SaeloZahra.ColorLight)
	
	If File.Exists(SaeloZahra.dir,"RegionCode") Then
		Log("RegionCode Exists: "&File.ReadString(SaeloZahra.dir,"RegionCode"))
		RegionCode = File.ReadString(SaeloZahra.dir,"RegionCode")
		If RegionCode.Length<2 Then File.Delete(SaeloZahra.dir,"RegionCode")
		GetAccuWeather(RegionCode,ApiAccuWeather)
	Else
		AvvalinBar = True
		Log("No Find RegionCode")
		If Starter.MyLocation.IsInitialized Then
			Log("Nothing Found Your Location")
			JobGetRegionCode.Initialize("JobGetRegionCode", Me)
'			JobGetRegionCode.Download("https://apidev.accuweather.com/locations/v1/search?q="&Starter.MyLocation.Latitude&","&Starter.MyLocation.Longitude&"&apikey=hoArfRosT1215")
			JobGetRegionCode.Download("https://mazraeyeman.ir/reseller/api_files/forecasts.php?geoposition="&Starter.MyLocation.Latitude&","&Starter.MyLocation.Longitude)
		End If
			
	End If
			
End Sub




Sub jobDone(job As HttpJob)
	
	ProgressDialogHide
	
	LogColor(job.JobName&"    ,    "&job.Success,Colors.White)
	
	Dim NotEmptyJob As Boolean = True
	If job.Success Then
		If job.GetString =="" Then NotEmptyJob=False Else NotEmptyJob=True
		If job.GetString.Contains("The allowed number of requests has been exceeded.") Then NotEmptyJob=False
	End If
	
	If job.Success And NotEmptyJob Then
		
		LogColor(job.JobName&"   :   "&job.GetString,Colors.Green)
		
		Select job.JobName
			Case "JobGetAccuWeather"
				
				If job.GetString.Length>500 Then
					File.WriteString(SaeloZahra.Dir,"FiveDay.Json",job.GetString)
				End If
				
				If File.Exists(SaeloZahra.Dir,"FiveDay.Json") Then
					calcAccuWeather(File.ReadString(SaeloZahra.Dir,"FiveDay.Json"))
				Else
					calcAccuWeather(job.GetString)
				End If
				
				job.Release

			Case "JobGetRegionCode"
				
'				
'				
'				Dim parser As JSONParser
'				parser.Initialize(job.GetString)
'				Dim rootRegionCode As Map = parser.NextObject
''				Dim AdministrativeArea As Map = rootRegionCode.Get("AdministrativeArea")
''				Dim LocalizedName As String = AdministrativeArea.Get("LocalizedName")
'				RegionCode = rootRegionCode.Get("Key")

				If job.GetString.Length<20 Then
					RegionCode = job.GetString
				Else
					JobGetRegionCode.Download("http://dataservice.accuweather.com/locations/v1/cities/geoposition/search?language=fa-ir&q="&Starter.MyLocation.Latitude&","&Starter.MyLocation.Longitude&"&apikey="&ApiAccuWeather)
				End If
		
				LogColor("Your Region Code Is: "&RegionCode,SaeloZahra.ColorLight)
				File.WriteString(SaeloZahra.dir,"RegionCode",RegionCode)
				FindRegionCode
				Return
				
				
				
		End Select
	Else
		
		If job.JobName=="JobGetAccuWeather" And job.GetString.Contains("The allowed number of requests has been exceeded.") Then
			Log("The allowed number of requests has been exceeded.  Api Jadid Begir")
			Select Rnd(1,7)
				Case 1
					GetAccuWeather(RegionCode,ApiAccuWeather1)
				Case 2
					GetAccuWeather(RegionCode,ApiAccuWeather2)
				Case 3
					GetAccuWeather(RegionCode,ApiAccuWeather3)
				Case 4
					GetAccuWeather(RegionCode,ApiAccuWeather4)
				Case 5
					GetAccuWeather(RegionCode,ApiAccuWeather5)
				Case 6
					GetAccuWeather(RegionCode,ApiAccuWeather6)
				Case Else
					GetAccuWeather(RegionCode,ApiAccuWeather)
			End Select
				
		End If
		
		If job.ErrorMessage.Contains("No address associated with hostname")  Or job.ErrorMessage.Contains("503 Service Unavailable") Then
			Sleep(10000)
			JobGetAccuWeather.Download("http://newserver.mazraeyeman.ir/mazraeyeman_proxy.php?url="&FullUrl)
			ToastMessageShow("صفحه مورد نظر پیدا نشد"&CRLF&"احتمالا آیپی شما مسدود شده یا اینترنتتون قطع هست",True)
		End If
		
		LogColor("Error in Hast:    "&job.ErrorMessage,Colors.Red)
		
	End If
	
	job.Release
	
End Sub



Sub GetAccuWeather(RCode As String,ApiKey As String)
		
	LogColor($"GetAccuWeather for ${RCode}  With API:${ApiKey}"$,SaeloZahra.ColorLight)
	
	JobGetAccuWeather.Initialize("JobGetAccuWeather", Me)
	
	FullUrl=SaeloZahra.EncodeUrl("http://dataservice.accuweather.com/forecasts/v1/daily/5day/"&RCode&"?metric=true&details=true&language=fa-ir&apikey="&ApiKey&"&amirTime="&DateTime.Now)
'	JobGetAccuWeather.Download("http://newserver.mazraeyeman.ir/mazraeyeman_proxy.php?url="&FullUrl)
	JobGetAccuWeather.Download($"https://mazraeyeman.ir/reseller/api_files/forecasts.php?region=${RCode}"$)
	LogColor($"https://mazraeyeman.ir/reseller/api_files/forecasts.php?region=${RCode}"$,Colors.Yellow)

End Sub

Sub calcAccuWeather(getString As String)
	
	Dim shomarande As Int = 0

	BazeDama.Initialize
	WindHaDay.Initialize
	WindHaNight.Initialize
				
	Try
		Try
			Dim vaziatHtml As String=""
			Dim parser As JSONParser
			parser.Initialize(getString.Replace("null","0").Replace("Null","0"))
			Dim root As Map = parser.NextObject
			Dim Headline As Map = root.Get("Headline")
			MatneTouzihat = Headline.Get("Text")
		Catch
			Log("همون بخش اول پکوندمون")
		End Try
'		Dim VaziateAboHava As String = Headline.Get("Category")
'		Dim EndEpochDate As Int = Headline.Get("EndEpochDate")
'		Dim EffectiveEpochDate As Int = Headline.Get("EffectiveEpochDate")
'		Dim EffectiveDate As String = Headline.Get("EffectiveDate")
'		Dim Link As String = Headline.Get("Link")
'		Dim MobileLink As String = Headline.Get("MobileLink")
					
		Dim DailyForecasts As List = root.Get("DailyForecasts")
		For Each colDailyForecasts As Map In DailyForecasts
			shomarande = shomarande+1
			LogColor("روز: "&shomarande,Colors.Yellow)
			Dim Moon As Map = colDailyForecasts.Get("Moon")
			Dim MoonEpochSet As Int = Moon.Get("EpochSet")
			Dim MoonSet As String = Moon.Get("Set")
			MoonSet=MoonSet.SubString2(0,MoonSet.IndexOf("T"))
							
'			Dim MoonPhase As String = Moon.Get("Phase")
'			Dim MoonEpochRise As Int = Moon.Get("EpochRise")
'			Dim MoonAge As Int = Moon.Get("Age")
'			Dim MoonRise As String = Moon.Get("Rise")
						
			Dim Sun As Map = colDailyForecasts.Get("Sun")
			Dim SunEpochSet As Int = Sun.Get("EpochSet")
			Dim SunSet As String = Sun.Get("Set")
'			SunSet=SunSet.Replace("T","   ساعت ")
			SunSet=SunSet.SubString2(0,SunSet.IndexOf("T"))
'			Dim SunEpochRise As Int = Sun.Get("EpochRise")
'			Dim SunRise As String = Sun.Get("Rise")
'			Dim HoursOfSun As Double = colDailyForecasts.Get("HoursOfSun")
			Dim ThisDateTime As String = colDailyForecasts.Get("Date")
						
			Dim Temperature As Map = colDailyForecasts.Get("Temperature")
		Dim TemperatureMinimum As Map = Temperature.Get("Minimum")
'			Dim TemperatureMinimumUnitType As Int = TemperatureMinimum.Get("UnitType")
			Dim TemperatureMinimumValue As Int = TemperatureMinimum.Get("Value")
'			Dim TemperatureMinimumUnit As String = TemperatureMinimum.Get("Unit")
			If shomarande == 1 Then MinDama = TemperatureMinimumValue
			File.WriteString(SaeloZahra.Dir,"MinDama",TemperatureMinimumValue)
			Dim TemperatureMaximum As Map = Temperature.Get("Maximum")
'			Dim TemperatureMaximumUnitType As Int = TemperatureMaximum.Get("UnitType")
			Dim TemperatureMaximumValue As Int = TemperatureMaximum.Get("Value")
'			Dim TemperatureMaximumUnit As String = TemperatureMaximum.Get("Unit")
			If shomarande == 1 Then MaxDama = TemperatureMaximumValue
			File.WriteString(SaeloZahra.Dir,"MaxDama",TemperatureMaximumValue)
			
							
'			Dim RealFeelTemperature As Map = colDailyForecasts.Get("RealFeelTemperature")
'			Dim RealFeelTemperatureMinimum As Map = RealFeelTemperature.Get("Minimum")
'			Dim RealFeelTemperatureMinimumUnitType As Int = RealFeelTemperatureMinimum.Get("UnitType")
'			Dim RealFeelTemperatureMinimumValue As Double = RealFeelTemperatureMinimum.Get("Value")
'			Dim RealFeelTemperatureMinimumUnit As String = RealFeelTemperatureMinimum.Get("Unit")
'			Dim RealFeelTemperatureMaximum As Map = RealFeelTemperature.Get("Maximum")
'			Dim RealFeelTemperatureMaximumUnitType As Int = RealFeelTemperatureMaximum.Get("UnitType")
'			Dim RealFeelTemperatureMaximumValue As Double = RealFeelTemperatureMaximum.Get("Value")
'			Dim RealFeelTemperatureMaximumUnit As String = RealFeelTemperatureMaximum.Get("Unit")
								
							
							
							
							
							
							
			Dim Night As Map = colDailyForecasts.Get("Night")
			Dim NightRainProbability As Int = Night.Get("RainProbability")
			Dim NightSnowProbability As Int = Night.Get("SnowProbability")
			If shomarande == 1 Then NightShortPhrase = Night.Get("ShortPhrase")
			If shomarande == 1 Then File.WriteString(SaeloZahra.Dir,"ShortPhrase",NightShortPhrase)
'			Dim NightHoursOfRain As Double = Night.Get("HoursOfRain")
'			Dim NightHoursOfIce As Double = Night.Get("HoursOfIce")
'			Dim NightThunderstormProbability As Int = Night.Get("ThunderstormProbability")
'			Dim NightIconPhrase As String = Night.Get("IconPhrase")
'			Dim NightLongPhrase As String = Night.Get("LongPhrase")
			If shomarande == 1 Then NightIcon = Night.Get("Icon")
			If shomarande == 1 Then File.WriteString(SaeloZahra.Dir,"NightIcon",NightIcon)
'			Dim NightHoursOfSnow As Double = Night.Get("HoursOfSnow")
'			Dim NightHoursOfPrecipitation As Double = Night.Get("HoursOfPrecipitation")
			Dim NightPrecipitationProbability As Int = Night.Get("PrecipitationProbability")
			Dim NightIceProbability As Int = Night.Get("IceProbability")
			Dim NightCloudCover As Int = Night.Get("CloudCover")
						
			Dim NightWind As Map = Night.Get("Wind")
			Dim NightWindSpeed As Map = NightWind.Get("Speed")
'			Dim NightWindSpeedUnitType As Int = NightWindSpeed.Get("UnitType")
			Dim NightWindSpeedValue As Double = NightWindSpeed.Get("Value")
'			Dim NightWindSpeedUnit As String = NightWindSpeed.Get("Unit")
			Dim NightWindDirection As Map = NightWind.Get("Direction")
'			Dim NightWindDirectionEnglish As String = NightWindDirection.Get("English")
'			Dim NightWindDirectionDegrees As Int = NightWindDirection.Get("Degrees")
			Dim NightWindDirectionLocalized As String = NightWindDirection.Get("Localized")
			WindHaNight.Add(CreateMap("title":NightWindDirectionLocalized,"value" :NightWindSpeedValue,"image":NightIcon&".png"))
							
						
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
							
						
						
'			Dim RealFeelTemperatureShade As Map = colDailyForecasts.Get("RealFeelTemperatureShade")
'			Dim Minimum As Map = RealFeelTemperatureShade.Get("Minimum")
'			Dim UnitType As Int = Minimum.Get("UnitType")
'			Dim Value As Double = Minimum.Get("Value")
'			Dim Unit As String = Minimum.Get("Unit")
'			Dim Maximum As Map = RealFeelTemperatureShade.Get("Maximum")
'			Dim UnitType As Int = Maximum.Get("UnitType")
'			Dim Value As Double = Maximum.Get("Value")
'			Dim Unit As String = Maximum.Get("Unit")
								
								
								
								
								
								
								
			If shomarande == 1 Then NotifKon = True Else NotifKon = False
			
			Dim Day As Map = colDailyForecasts.Get("Day")
						
			DayShortPhrase				 = 				Day.Get("ShortPhrase")
			If shomarande == 1 Then File.WriteString(SaeloZahra.Dir,"DayShortPhrase",DayShortPhrase)
'			Dim DayThunderstormProbability As Int = 	Day.Get("ThunderstormProbability")
'			Dim DayIconPhrase As String = 				Day.Get("IconPhrase")
'			Dim DayLongPhrase As String = 				Day.Get("LongPhrase")
			DayIcon						= 				Day.Get("Icon")
			If shomarande == 1 Then File.WriteString(SaeloZahra.Dir,"DayIcon",DayIcon)
'			Dim DayHoursOfRain As Double = 				Day.Get("HoursOfRain")
'			Dim DayHoursOfIce As Double = 				Day.Get("HoursOfIce")
'			Dim DayHoursOfSnow As Double = 				Day.Get("HoursOfSnow")
'			Dim DayHoursOfPrecipitation As Double = 	Day.Get("HoursOfPrecipitation")
			Dim DaySnowProbability As Int = 			Day.Get("SnowProbability")
			Dim DayPrecipitationProbability As Int = 	Day.Get("PrecipitationProbability")
			Dim DayIceProbability As Int = 				Day.Get("IceProbability")
			Dim DayCloudCover As Int = 					Day.Get("CloudCover")
			DayRainProbability 				= 			Day.Get("RainProbability")
			If shomarande == 1 Then File.WriteString(SaeloZahra.Dir,"DayRainProbability",DayRainProbability)
						
			Dim DayWind As Map = Day.Get("Wind")
			Dim DayWindSpeed As Map = DayWind.Get("Speed")
'			Dim DayWindSpeedUnitType As Int = DayWindSpeed.Get("UnitType")
			Dim DayWindSpeedValue As Double = DayWindSpeed.Get("Value")
'			Dim DayWindSpeedUnit As String = DayWindSpeed.Get("Unit")
'			Dim Wind as String = "<b>"&DayWindSpeedValue&"</b>" & "<small style='font-size:12%'>"&DayWindSpeedUnit&"</small>"
			Dim DayWindDirection As Map = DayWind.Get("Direction")
	'		Dim DayWindDirectionEnglish As String = DayWindDirection.Get("English")
	'		Dim DayWindDirectionDegrees As Int = DayWindDirection.Get("Degrees")
			Dim DayWindDirectionLocalized As String = DayWindDirection.Get("Localized")
							
			WindHaDay.Add(CreateMap("title":DayWindDirectionLocalized,"value" :DayWindSpeedValue,"image":DayIcon&".png"))
							
			Dim DaySnow As Map = Day.Get("Snow")
	'		Dim DaySnowUnitType As Int = DaySnow.Get("UnitType")
			Dim DaySnowValue As Double = DaySnow.Get("Value")
	'		Dim DaySnowUnit As String = DaySnow.Get("Unit")
			Dim DayTotalLiquid As Map = Day.Get("TotalLiquid")
	'		Dim DayTotalLiquidUnit As String = DayTotalLiquid.Get("Unit")
	'		Dim DayTotalLiquidUnitType As Int = DayTotalLiquid.Get("UnitType")
			Dim DayTotalLiquidValue As Double = DayTotalLiquid.Get("Value")
	'		Humidity = "<b>"&DayTotalLiquidValue&"</b>" & "<small style='font-size:18%'>"&DayTotalLiquidUnit&"</small>"
			Dim DayIce As Map = Day.Get("Ice")
	'		Dim DayIceUnitType As Int = DayIce.Get("UnitType")
			Dim DayIceValue As Double = DayIce.Get("Value")
	'		Dim DayIceUnit As String = DayIce.Get("Unit")
			Dim DayRain As Map = Day.Get("Rain")
	'		Dim DayRainUnitType As Int = DayRain.Get("UnitType")
			Dim DayRainValue As Double = DayRain.Get("Value")
	'		Dim DayRainUnit As String = DayRain.Get("Unit")
			Dim DayWindGust As Map = Day.Get("WindGust")
			Dim DayWindGustSpeed As Map = DayWindGust.Get("Speed")
	'		Dim DayWindGustSpeedUnitType As Int = DayWindGustSpeed.Get("UnitType")
			Dim DayWindGustSpeedValue As Double = DayWindGustSpeed.Get("Value")
'			Dim DayWindGustSpeedUnit As String = DayWindGustSpeed.Get("Unit")
'			Dim DayWindGustDirection As Map = DayWindGust.Get("Direction")
'			Dim DayWindGustDirectionEnglish As String = DayWindGustDirection.Get("English")
'			Dim DayWindGustDirectionDegrees As Int = DayWindGustDirection.Get("Degrees")
'			Dim DayWindGustDirectionLocalized As String = DayWindGustDirection.Get("Localized")
						
						
						
'			Dim AirAndPollen As List = colDailyForecasts.Get("AirAndPollen")
'			For Each colAirAndPollen As Map In AirAndPollen
'				Dim colAirAndPollenCategory As String = colAirAndPollen.Get("Category")
'	'						Dim colAirAndPollenCategoryValue As Int = colAirAndPollen.Get("CategoryValue")
'	'						Dim colAirAndPollenValue As Int = colAirAndPollen.Get("Value")
'				Dim colAirAndPollenName As String = colAirAndPollen.Get("Name")
'							
'				If colAirAndPollenName == "UVIndex" Then
'					UVIndex = colAirAndPollenCategory
'					If shomarande = 1 Then File.WriteString(SaeloZahra.dir,"UVIndex",UVIndex)
'				End If
'			Next
						
			Dim KhodeTarikh,RoozeTarikh,Mahesh As String
			Try
				Dim shamsiDate As PersianDate
				KhodeTarikh = SaeloZahra.ConvertEnglish(shamsiDate.getDate(DateTime.GetYear(UnixTimeStamp&"000"),DateTime.GetMonth(UnixTimeStamp&"000"),DateTime.GetDayOfMonth(UnixTimeStamp&"000"),"/"))
				KhodeTarikh=KhodeTarikh.Replace("1398/","").Replace("1399/","")
				Log("KhodeTarikh:  "&KhodeTarikh)
				RoozeTarikh = KhodeTarikh.SubString2(KhodeTarikh.IndexOf("/"),KhodeTarikh.Length).Replace("/","")
				
				Mahesh = KhodeTarikh.SubString2(0,KhodeTarikh.IndexOf("/"))
				Mahesh = SaeloZahra.esmeMah(Mahesh.Replace("/",""))
			Catch
				Log("نتونست تاریخو در بیاره"&LastException)
			End Try
			
			
			Try
				BazeDama.Add(CreateMap("icon":DayIcon, "title":SaeloZahra.esmeRoozeHafte(UnixTimeStamp&"000")&SaeloZahra.ConvertPersian(RoozeTarikh)&" "&Mahesh, "min":TemperatureMinimumValue, "max":TemperatureMaximumValue ))
			Catch
				Log(LastException)
			End Try
						
						
						
			
			Try
					
				Dim mapNight As Map
				mapNight.Initialize
				mapNight.Put("unique_id",		File.ReadString(SaeloZahra.dir,"usrnm")&"_"&MoonEpochSet)
				mapNight.Put("user",			File.ReadString(SaeloZahra.dir,"usrnm"))
				mapNight.Put("latlng",			Starter.MyLocation.Latitude&","&Starter.MyLocation.Longitude)
				mapNight.Put("time",			MoonSet)
				mapNight.Put("humidity",		NightTotalLiquidValue)'رطوبت
	'			mapNight.Put("dewpoint",		DewPointValue)'نقطه شبنم
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
				mapNight.Put("icon",			NightIcon)
							
				ListValues.Add(mapNight)
							
					
			Catch
				Log(LastException)
			End Try
						
			
			Try
					
				Dim mapDay As Map
				mapDay.Initialize
				mapDay.Put("unique_id",		File.ReadString(SaeloZahra.dir,"usrnm")&"_"&SunEpochSet)
				mapDay.Put("user",			File.ReadString(SaeloZahra.dir,"usrnm"))
				mapDay.Put("latlng",		Starter.MyLocation.Latitude&","&Starter.MyLocation.Longitude)
				mapDay.Put("time",			SunSet)
				mapDay.Put("humidity",		DayTotalLiquidValue)'رطوبت
	'			mapDay.Put("dewpoint",		DewPointValue)'نقطه شبنم
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
				mapDay.Put("icon",			DayIcon)
							
				ListValues.Add(mapDay)
							
			Catch
				Log(LastException)
			End Try
			
			Dim Vaziatesh As String
			Vaziatesh = CheckBadMahsoolWeatherAlert(TemperatureMinimumValue,TemperatureMaximumValue)
			Log("در حال بررسی وضعیت "&Vaziatesh)
						
'			وضعیت آب و هوای: ${SaeloZahra.tarikheKhafan(SunEpochSet&"000")}<br>
			vaziatHtml=$"وضعیت روز: ${Day.Get("ShortPhrase")}  وضعیت شب: ${Night.Get("ShortPhrase")} <br> <br> جمع رطوبت روز: ${DayTotalLiquidValue}م‌م  جمع رطوبت شب: ${NightTotalLiquidValue}م‌م <br> پوشش ابر روز: ${DayCloudCover}%  پوشش ابر شب: ${NightCloudCover}% <br> شاخص اشعه ماوراء بنفش: ${UVIndex}  <br> یخ زدگی روز: ${DayIceValue}م‌م  یخ زدگی شب: ${NightIceValue}م‌م   <br> میزان برف روز: ${DaySnowValue}م‌م  میزان برف شب: ${NightSnowValue}م‌م  <br> میزان باران روز: ${DayRainValue}م‌م  میزان باران شب: ${NightRainValue}م‌م   <br> سرعت باد روز: ${DayWindSpeedValue}KM/H  سرعت باد شب: ${NightWindSpeedValue}KM/H   <br> حداقل دما: ${TemperatureMinimumValue}° حداکثر دما: ${TemperatureMaximumValue}°   <br> احتمال بارش در روز: ${DayRainProbability}م‌م  احتمال بارش در شب: ${NightRainProbability}م‌م  <br> احتمال یخ زدگی در روز: ${DayIceProbability}م‌م  احتمال یخ زدگی در شب: ${NightIceProbability}م‌م  <br> احتمال بارش برف در روز: ${DaySnowProbability}م‌م	  احتمال بارش برف در شب: ${NightSnowProbability}م‌م  <br> احتمال طوفان در روز: ${DayWindGustSpeedValue}KM/H  احتمال طوفان در شب: ${NightWindGustSpeedValue}KM/H   <br><br>"$
			'TODO: DayShortPhrase/Vaziat/KhateBaad
				
			If MatneTouzihat.Length>1 Then
				saveAndAlert(ThisDateTime ,"وضعیت "&SaeloZahra.tarikheKhafan(SunEpochSet&"000"),vaziatHtml,Vaziatesh, DayIcon,SunEpochSet&"000",NotifKon)
			End If
						
		Next
					
					
					
		If AvvalinBar Then
			ToastMessageShow("ورود شما را برای اولین بار خوش آمد میگویم",True)
			CallSubDelayed(HomeAct,"RestartAct")
		End If
		
					
		If OpenHome Then
			StartActivity(HomeAct)
		End If
		
					
					
		Dim j3 As HttpJob
		j3.Initialize("j3",Me)
					
		For Each m As Map In ListValues
			
			j3.PostMultipart(SaeloZahra.json_url&"weather_insert.php?save=true",m,Null)
			Wait For (j3) jobDone(j3 As HttpJob)
			If j3.Success Then
				Log("Hi:  "&j3.GetString)
			End If
		Next
			
		j3.Release
	
	Catch
		Log(LastException)
		LogColor("Error to Accuweather Calc",0xFFCA1A4F)
	End Try
End Sub

Sub CheckBadMahsoolWeatherAlert(minTemp As Int,maxTemp As Int) As String
	Try
			
		If File.Exists(SaeloZahra.Dir,"userProducts") Then
			RAF.Initialize(SaeloZahra.Dir,"userProducts",False)
			ListUserProducts=RAF.readObject(RAF.CurrentPosition)
				
			For Each coluserProducts As Map In ListUserProducts
'				Dim id As String = coluserProducts.Get("id")
	'			Dim product_id As String = coluserProducts.Get("product_id")
				Dim product_title As String = coluserProducts.Get("product_title")
				Dim minTempMahsool As Int = coluserProducts.Get("temp_min")
				Dim maXTempMahsool As Int = coluserProducts.Get("temp_max")
	'			Dim dewpoint_min As String = coluserProducts.Get("dewpoint_min")
	'			Dim dewpoint_max As String = coluserProducts.Get("dewpoint_max")
				Dim alert_txt As String = coluserProducts.Get("alert_txt")
					
			
				'TODO: Change Alert Icon
				If minTemp < minTempMahsool Then
					CreateNotification("هشدار سرمازدگی برای "&product_title , alert_txt ,"sarmazadegi",NotificationAct,True,True).Notify(2)
					Log("سرمازدگی برای "&product_title)
					Return "sarmazadegi"
				End If
		
				If maxTemp > maXTempMahsool Then
					CreateNotification("هشدار گرمازدگی برای "&product_title , alert_txt ,"garmazadegi",NotificationAct,True,True).Notify(2)
					Log("گرمازدگی برای "&product_title)
					Return "garmazadegi"
				End If
				Log("خطری برای "&product_title&" یافت نشد")
			Next
		Else
			Log("شما اول محصول ثبت کن بعد بیا خطراتشو بررسی کن")
		End If
	Catch
		Log(LastException)
	End Try
	Return "weather"
End Sub

' Notification
Sub saveAndAlert(ID_str As String, title_str As String, content_str As String, Vaziat_str As String, Icon_str As Int,TimeStr As Long,NotifBool As Boolean)
	
	Try
		sql1.ExecNonQuery($"insert into notification (id,title,type,value,time,icon) VALUES ('${ID_str}','${title_str}','${Vaziat_str}','${content_str}','${TimeStr}','${Icon_str}')"$)
		LogColor("Local DB Inserted",Colors.Magenta)
	Catch
		Try
			sql1.ExecNonQuery($"UPDATE notification set title = '${title_str}',type ='${Vaziat_str}',value = '${content_str}',time = '${TimeStr}',icon = '${Icon_str}' WHERE id = '${ID_str}'"$  )
			LogColor("Local DB Updated",Colors.Magenta)
		Catch
			LogColor($"Local DB Errrror: ${LastException.Message} error To Up this id To Notification = ${title_str}"$,Colors.Magenta)
		End Try
	End Try

	If NotifBool Then CreateNotification(title_str , MatneTouzihat ,"teraktor",NotificationAct,True,True).Notify(1)'teraktor
	
End Sub

Public Sub CreateNotification(Title As String, Content As String, Icon As String, TargetActivity As Object, Sound As Boolean, Vibrate As Boolean) As Notification
	
	Dim p As Phone
	If p.SdkVersion >= 21 Then
		Dim nb As NotificationBuilder
		nb.Initialize
		nb.DefaultSound = Sound
		nb.DefaultVibrate = Vibrate
		
		If Icon == "garmazadegi" Then
			nb.LargeIcon = LoadBitmap(File.DirAssets,"30.png")
		Else If Icon == "sarmazadegi" Then
			nb.LargeIcon = LoadBitmap(File.DirAssets,"31.png")
		Else
			nb.LargeIcon = LoadBitmap(File.DirAssets,"icon.png")
		End If
		
		nb.AutoCancel = True
		nb.ContentTitle = Title
		nb.ContentText = Content
		nb.setActivity(TargetActivity)
		nb.AddAction("baseline_all_inclusive_white_24","وضعیت کلی","full",TargetActivity)
		nb.AddAction("baseline_place_white_24","گزارش کامل امروز","full",WeatherNewAct)
		nb.SmallIcon = Icon
		
		Dim javaobjectInstance As JavaObject
		javaobjectInstance = nb
		javaobjectInstance.RunMethod ("setColor", Array As Object (SaeloZahra.Color))
	
		If p.SdkVersion >= 26 Then
			Dim ctxt As JavaObject
			ctxt.InitializeContext
			Dim manager As JavaObject
			manager.InitializeStatic("android.app.NotificationManager")
			Dim Channel As JavaObject
			Dim importance As String
			If Sound Then importance = "IMPORTANCE_DEFAULT" Else importance = "IMPORTANCE_LOW"
			Dim ChannelVisibleName As String = Application.LabelName
			Channel.InitializeNewInstance("android.app.NotificationChannel", _
                   Array("MyChannelId1", ChannelVisibleName, manager.GetField(importance)))
			manager = ctxt.RunMethod("getSystemService", Array("notification"))
			manager.RunMethod("createNotificationChannel", Array(Channel))
			Dim jo As JavaObject = nb
			jo.RunMethod("setChannelId", Array("MyChannelId1"))
		End If
		Return  nb.GetNotification
	Else
		Dim n As Notification
		n.Initialize
'		n.Sound=Sound
		n.AutoCancel=True
		n.Vibrate = Vibrate
		n.Icon = Icon
		
		n.SetInfo(Title, Content, TargetActivity)
		Return n
	End If
End Sub
