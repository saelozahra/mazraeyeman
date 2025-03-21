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

Sub Process_Globals

End Sub

Sub Globals
	
	Dim Config 	As Amir_SliderConfig
	Dim Show 	As Amir_SliderShow
	
	Dim X1 As XmlLayoutBuilder
	Private ActionBar As ACToolBarLight
	Private TabLayout As DSTabLayout
	Private VP As AHViewPager
	Dim PC As AHPageContainer
	Dim SV(6) As ScrollView
	
	Dim JobGetAmar As HttpJob
	Dim WindWeekList,TempWeekList,RainWeekList,SnowWeekList,IceWeekList,HumidityWeekList As List
	Dim WindMonthList,TempMonthList,RainMonthList,SnowMonthList,IceMonthList,HumidityMonthList As List
	Dim WindYearList,TempYearList,RainYearList,SnowYearList,IceYearList,HumidityYearList As List

End Sub

Sub Activity_Create(FirstTime As Boolean)
	
	Activity.LoadLayout("TabNewlayout")

	ActionBar.Title=SaeloZahra.CSB("هواشنـــــــــــــــاسی")
	ActionBar.TitleTextColor=Colors.White
	ActionBar.NavigationIconDrawable = X1.GetDrawable("baseline_arrow_back_white_24")
	ActionBar.Color=SaeloZahra.Color
	
	SaeloZahra.SetStatusBarColor(SaeloZahra.ColorDark)
	
'	Main.amaroid.TrackView(ActionBar.title)
	
	PC.Initialize
	TabLayout.SetTabTextColors(0x7FFFFFFF,Colors.White)
	TabLayout.TabIndicatorColor=Colors.White
	
	
	SV(0).Initialize(1000dip)
	SV(1).Initialize(1000dip)
	SV(2).Initialize(1000dip)
	SV(3).Initialize(1000dip)
	SV(4).Initialize(1000dip)
	SV(0).Panel.Padding = Array As Int (5dip, 14dip, 5dip, 14dip)
	SV(1).Panel.Padding = Array As Int (5dip, 14dip, 5dip, 14dip)
	SV(2).Panel.Padding = Array As Int (5dip, 14dip, 5dip, 14dip)
	SV(3).Panel.Padding = Array As Int (5dip, 14dip, 5dip, 14dip)
	SV(4).Panel.Padding = Array As Int (5dip, 14dip, 5dip, 14dip)
	
	
	PC.AddPage(SV(4), SaeloZahra.csb("سالانه"))
	PC.AddPage(SV(3), SaeloZahra.csb("مــاهانه"))
	PC.AddPage(SV(2), SaeloZahra.csb("هــــفتگی"))
	PC.AddPage(SV(1), SaeloZahra.csb("امــــــــــــــــــروز"))
	PC.AddPage(SV(0), SaeloZahra.csb("هفته آیـــــــــــنده"))
	VP.PageContainer = PC
	
	TabLayout.Color=SaeloZahra.Color
	TabLayout.TabMode=TabLayout.MODE_SCROLLABLE
	
	TabLayout.SetViewPager(VP)
	ActionBar.SetLayout(0,0,100%x,SaeloZahra.MaterialActionBarHeight)
	TabLayout.SetLayout(0,ActionBar.Top+ActionBar.Height,100%x,SaeloZahra.MaterialActionBarHeight)
	VP.SetLayout(0,TabLayout.Top+TabLayout.Height,100%x,100%y - (SaeloZahra.MaterialActionBarHeight*2) )
	
	VP.GotoPage(PC.Count-1,True)
	
'	TabLayout.SetTabIcon(0,X1.GetDrawable("baseline_all_inclusive_white_24"))
'	TabLayout.SetTabIcon(1,X1.GetDrawable("baseline_sentiment_satisfied_alt_white_24"))
	
	
	JobGetAmar.Initialize("JobGetAmar", Me)
	JobGetAmar.Download(SaeloZahra.json_url&"statistics_weather.php?query_type=amar&userid="&Starter.usrnm)
	
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
	
	ProgressDialogShow(SaeloZahra.CSB("در حال دریافت وضعیت مزرعه شما"))
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
				
				
				
'	SV 5DAY
'	SV 5DAY
'	SV 5DAY
'	SV 5DAY
				
	Dim P1 As Panel = CreateWeatherPanel(CreateSvgBazeView(accuWeatherCronJobService.BazeDama),"نوسان دما")
	
	SV(0).Panel.AddView(P1, 20dip, 20dip, 90%x, 313dip)
	
	
	
	Dim P2 As Panel = CreateWeatherPanel(CreateSvgLineView(accuWeatherCronJobService.WindHaDay),"وضعیت وزش باد روز")
	SV(0).Panel.AddView(P2, 20dip, 372dip, 90%x, 280dip)
	
	
	Dim P3 As Panel = CreateWeatherPanel(CreateSvgLineView(accuWeatherCronJobService.WindHaNight),"وضعیت وزش باد شب")
	SV(0).Panel.AddView(P3, 20dip, 720dip, 90%x, 280dip)
	
	
	SV(0).Panel.Height = P1.Top+P1.Height    +    110dip+P2.Height    +    110dip+P3.Height 
				
	
	
	
	
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub



Sub Actionbar_NavigationItemClick
	Activity.Finish
	SaeloZahra.SetAnimation("zoom_enter","zoom_exit")
End Sub


Sub Activity_KeyPress (KeyCode As Int) As Boolean
	If KeyCode==KeyCodes.KEYCODE_BACK Then
		Actionbar_NavigationItemClick
		Return False
	Else
		Return True
	End If
End Sub



Sub jobDone(job As HttpJob)
	
	LogColor(job.JobName&"    ,    "&job.Success,Colors.White)
	
	
	If job.Success Then
		
		ProgressDialogHide
		
		Select job.JobName
			Case "JobGetAmar"
					
				Dim parser As JSONParser
				parser.Initialize(job.GetString)
				Dim root As Map = parser.NextObject
				
				'Week
				'Week
				'Week
				
					
				
				WindWeekList.Initialize
				TempWeekList.Initialize
				RainWeekList.Initialize
				SnowWeekList.Initialize
				IceWeekList.Initialize
				HumidityWeekList.Initialize

				Dim roozeAvval As Boolean = True
				Dim week As List = root.Get("week")
				For Each colweek As Map In week
						
					If roozeAvval Then
'						snow = colweek.Get("snow")
'						humidity = colweek.Get("humidity")
'						wind = colweek.Get("wind")
'						rain = colweek.Get("rain")
'						uvindex = colweek.Get("uvindex")
'						If home2_act.DewPointValue>0 Then
'							dewpoint = home2_act.DewPointValue
'						Else
'							dewpoint = colweek.Get("dewpoint")
'						End If
						
						roozeAvval=False
					End If
					
					TempWeekList.Add(	CreateMap("title":colweek.Get("title"),"value":SaeloZahra.parseInt(colweek.Get("temp")),"image":colweek.Get("icon")&".png"))
					WindWeekList.Add(	CreateMap("title":colweek.Get("title"),"value":SaeloZahra.parseInt(colweek.Get("wind")),"image":colweek.Get("icon")&".png"))
					RainWeekList.Add(	CreateMap("title":colweek.Get("title"),"value":SaeloZahra.parseInt(colweek.Get("rain")),"image":colweek.Get("icon")&".png"))
					SnowWeekList.Add(	CreateMap("title":colweek.Get("title"),"value":SaeloZahra.parseInt(colweek.Get("snow")),"image":colweek.Get("icon")&".png"))
					IceWeekList.Add(	CreateMap("title":colweek.Get("title"),"value":SaeloZahra.parseInt(colweek.Get("ice")),"image":colweek.Get("icon")&".png"))
					HumidityWeekList.Add(CreateMap("title":colweek.Get("title"),"value":SaeloZahra.parseInt(colweek.Get("humidity")),"image":colweek.Get("icon")&".png"))
					
'					Dim ehtemal_snow As String = colweek.Get("ehtemal_snow")
'					Dim ehtemal_ice As String = colweek.Get("ehtemal_ice")
'					Dim ehtemal_gusts As String = colweek.Get("ehtemal_gusts")
'					Dim farmers_user As String = colweek.Get("farmers_user")
'					Dim ehtemal_precip As String = colweek.Get("ehtemal_precip")
'					Dim date_insert As String = colweek.Get("date_insert")
'					Dim cloudcover As String = colweek.Get("cloudcover")
'					Dim ehtemal_rain As String = colweek.Get("ehtemal_rain")
				Next
					
				Dim P1 As Panel = CreateWeatherPanel(CreateSvgLineView(TempWeekList),"نوسان دمای مزرعه شما در هفته گذشته")
				SV(2).Panel.AddView(P1, 20dip, 20dip, 90%x, 313dip)
	
				Dim P2 As Panel = CreateWeatherPanel(CreateSvgLineView(WindWeekList),"وزش بــــــاد در هفته گذشته")
				SV(2).Panel.AddView(P2, 20dip, 353dip, 90%x, 313dip)
	
				Dim P3 As Panel = CreateWeatherPanel(CreateSvgLineView(HumidityWeekList),"میانگین رطـــــــوبت مزرعه شما")
				SV(2).Panel.AddView(P3, 20dip, 706dip, 90%x, 313dip)
	
				Dim P4 As Panel = CreateWeatherPanel(CreateSvgLineView(RainWeekList),"وضعیت بارنـــــــدگی مزرعه شما")
				SV(2).Panel.AddView(P4, 20dip, 1059dip, 90%x, 313dip)
	
				Dim P5 As Panel = CreateWeatherPanel(CreateSvgLineView(SnowWeekList),"بارش بــــرف در مزرعه شما")
				SV(2).Panel.AddView(P5, 20dip, 1412dip, 90%x, 313dip)
	
				Dim P6 As Panel = CreateWeatherPanel(CreateSvgLineView(IceWeekList),"وضعیت یخ زدگی در مزرعه شما")
				SV(2).Panel.AddView(P6, 20dip, 1765dip, 90%x, 313dip)
	
				SV(2).Panel.Height = P6.Top + P6.Height + 72dip
				
				
				
				
				
				
				
				
					
				
				'	SV TODAY
				'	SV TODAY
				'	SV TODAY
				'	SV TODAY
	
				Dim P1 As Panel' = CreateWeatherPanel(CreateSvgHomeView(CreateMap("humidity":home2_act.RelativeHumidity,"wind":home2_act.WindSpeedValue,"snow":home2_act.SnowValue,"uv":home2_act.UVIndex,"rain":home2_act.RainValue,"dupoint":home2_act.DewPointValue)),"وضعیت آب و هـــــــــــــــوای مزرعـــــه شما")
				P1.Initialize("")
				Dim mapToday As Map = CreateMap("humidity":HomeAct.RelativeHumidity,"wind":HomeAct.WindSpeedValue,"snow":HomeAct.SnowValue,"uv":HomeAct.UVIndex,"rain":HomeAct.RainValue,"dupoint":HomeAct.DewPointValue)
				P1 = CreateWVWeatherPanel(mapToday,"وضعیت آب و هـــــــــــــــوای مزرعـــــه شما")
				SV(1).Panel.AddView(P1, 20dip, 20dip, 90%x, 313dip)
	
				Dim P2 As Panel = CreateWeatherPanel(CreateSvgLineView(HomeAct.Next12HDamaha),"نوســــــان دمای امروز مزرعـــــه شما")
				SV(1).Panel.AddView(P2, 20dip, 358dip, 90%x, 313dip)
	
				Dim P3 As Panel = CreateWeatherPanel(CreateSvgLineView(HomeAct.Next12HWindha),"وضعیت وزش باد امروز مزرعـــــه شما")
				SV(1).Panel.AddView(P3, 20dip, 702dip, 90%x, 313dip)
	
	
	
	
				SV(1).Panel.Height = P3.Top + P3.Height + 72dip
	
	
				
				
				
				
					
				'Month
				'Month
				'Month
	
				
				TempMonthList.Initialize
				HumidityMonthList.Initialize
				WindMonthList.Initialize
				RainMonthList.Initialize
				SnowMonthList.Initialize
				IceMonthList.Initialize
				
				Dim mounth As List = root.Get("mounth")
				For Each colmounth As Map In mounth
					TempMonthList.Add(CreateMap("title":colmounth.Get("title"),"value":SaeloZahra.parseInt(colmounth.Get("temp_amar_month")),"image":colmounth.Get("icon")&".png"))
					HumidityMonthList.Add(CreateMap("title":colmounth.Get("title"),"value":SaeloZahra.parseInt(colmounth.Get("humidity_amar_month")),"image":colmounth.Get("icon")&".png"))
					WindMonthList.Add(CreateMap("title":colmounth.Get("title"),"value":SaeloZahra.parseInt(colmounth.Get("wind_amar_month")),"image":colmounth.Get("icon")&".png"))
					RainMonthList.Add(CreateMap("title":colmounth.Get("title"),"value":SaeloZahra.parseInt(colmounth.Get("rain_amar_month")),"image":colmounth.Get("icon")&".png"))
					SnowMonthList.Add(CreateMap("title":colmounth.Get("title"),"value":SaeloZahra.parseInt(colmounth.Get("snow_amar_month")),"image":colmounth.Get("icon")&".png"))
					IceMonthList.Add(CreateMap("title":colmounth.Get("title"),"value":SaeloZahra.parseInt(colmounth.Get("ice_amar_month")),"image":colmounth.Get("icon")&".png"))
'					Dim uvindex_amar_month As String = colmounth.Get("uvindex_amar_month")
'					Dim dewpoint_amar_month As String = colmounth.Get("dewpoint_amar_month")
'					Dim cloudcover_amar_month As String = colmounth.Get("cloudcover_amar_month")
				Next			
				
				Dim P1 As Panel = CreateWeatherPanel(CreateSvgLineView(TempMonthList),"نوسان دمای مزرعه شما در ماه گذشته")
				SV(3).Panel.AddView(P1, 20dip, 20dip, 90%x, 313dip)
	
				Dim P2 As Panel = CreateWeatherPanel(CreateSvgLineView(HumidityMonthList),"میانگین رطـــــــوبت مزرعه شما")
				SV(3).Panel.AddView(P2, 20dip, 353dip, 90%x, 313dip)
	
				Dim P3 As Panel = CreateWeatherPanel(CreateSvgLineView(WindMonthList),"وضعیت وزش بــــــاد در مزرعه شما")
				SV(3).Panel.AddView(P3, 20dip, 706dip, 90%x, 313dip)
	
				Dim P4 As Panel = CreateWeatherPanel(CreateSvgLineView(RainMonthList),"وضعیت بارنـــــــدگی مزرعه شما")
				SV(3).Panel.AddView(P4, 20dip, 1059dip, 90%x, 313dip)
	
				Dim P5 As Panel = CreateWeatherPanel(CreateSvgLineView(SnowMonthList),"بارش بــــرف در مزرعه شما")
				SV(3).Panel.AddView(P5, 20dip, 1412dip, 90%x, 313dip)
	
				Dim P6 As Panel = CreateWeatherPanel(CreateSvgLineView(IceMonthList),"وضعیت یخ زدگی در مزرعه شما")
				SV(3).Panel.AddView(P6, 20dip, 1765dip, 90%x, 313dip)
	
				SV(3).Panel.Height = P6.Top + P6.Height + 72dip
				
				
					
				
				'Year
				'Year
				'Year
					
				WindYearList.Initialize
				TempYearList.Initialize
				RainYearList.Initialize
				SnowYearList.Initialize
				IceYearList.Initialize
				HumidityYearList.Initialize
				
				
				Dim year As List = root.Get("year")
				Dim Zouj As Boolean = True
				For Each colyear As Map In year
					If Zouj Then Zouj = False Else Zouj = True
					If Zouj Then Continue
					
					WindYearList.Add(CreateMap("title":	colyear.Get("title"),"value":SaeloZahra.parseInt(colyear.Get("wind_amar_year")),"image":colyear.Get("icon")&".png"))
					TempYearList.Add(CreateMap("title":	colyear.Get("title"),"value":SaeloZahra.parseInt(colyear.Get("temp_amar_year")),"image":colyear.Get("icon")&".png"))
					RainYearList.Add(CreateMap("title":	colyear.Get("title"),"value":SaeloZahra.parseInt(colyear.Get("rain_amar_year")),"image":colyear.Get("icon")&".png"))
					SnowYearList.Add(CreateMap("title":	colyear.Get("title"),"value":SaeloZahra.parseInt(colyear.Get("snow_amar_year")),"image":colyear.Get("icon")&".png"))
					IceYearList.Add( CreateMap("title":	colyear.Get("title"),"value":SaeloZahra.parseInt(colyear.Get("ice_amar_year")),"image":colyear.Get("icon")&".png"))
					HumidityYearList.Add(CreateMap("title":colyear.Get("title"),"value":SaeloZahra.parseInt(colyear.Get("humidity_amar_year")),"image":colyear.Get("icon")&".png"))
'					Dim cloudcover_amar_year As String = colyear.Get("cloudcover_amar_year")
'					Dim uvindex_amar_year As String = colyear.Get("uvindex_amar_year")
'					Dim dewpoint_amar_year As String = colyear.Get("dewpoint_amar_year")

				Next

				
				Dim P1 As Panel = CreateWeatherPanel(CreateSvgLineView(TempYearList),"نوسان دمای مزرعه شما در ماه گذشته")
				SV(4).Panel.AddView(P1, 20dip, 20dip, 90%x, 313dip)
	
				Dim P2 As Panel = CreateWeatherPanel(CreateSvgLineView(HumidityYearList),"میانگین رطـــــــوبت مزرعه شما")
				SV(4).Panel.AddView(P2, 20dip, 353dip, 90%x, 313dip)
	
				Dim P3 As Panel = CreateWeatherPanel(CreateSvgLineView(WindYearList),"وضعیت وزش بــــــاد در مزرعه شما")
				SV(4).Panel.AddView(P3, 20dip, 706dip, 90%x, 313dip)
	
				Dim P4 As Panel = CreateWeatherPanel(CreateSvgLineView(RainYearList),"وضعیت بارنـــــــدگی مزرعه شما")
				SV(4).Panel.AddView(P4, 20dip, 1059dip, 90%x, 313dip)
	
				Dim P5 As Panel = CreateWeatherPanel(CreateSvgLineView(SnowYearList),"بارش بــــرف در مزرعه شما")
				SV(4).Panel.AddView(P5, 20dip, 1412dip, 90%x, 313dip)
	
				Dim P6 As Panel = CreateWeatherPanel(CreateSvgLineView(IceYearList),"وضعیت یخ زدگی در مزرعه شما")
				SV(4).Panel.AddView(P6, 20dip, 1765dip, 90%x, 313dip)
	
				SV(4).Panel.Height = P6.Top + P6.Height + 72dip
				
				
				
		End Select
	Else
		
		If job.ErrorMessage.Contains("allowed number of requests") Then
			VP.GotoPage(1,True)
			ToastMessageShow(SaeloZahra.CSB("سقف مرور روزانه نرم افزار تکمیل شده"),True)
		End If
		
		LogColor(job.ErrorMessage,Colors.Red)
		
	End If
	
	job.Release
	
End Sub




Sub CreateWeatherPanel(Bit1 As Bitmap,titleStr As String) As Panel
	
	Dim CD As ColorDrawable
	CD.Initialize(Colors.White,16dip)
	
	Dim P1 As Panel
	P1.Initialize("P1")
'	P1.SetLayout(0 , 0, 90%x, 313dip)
	P1.Elevation=8dip
	P1.Background=CD
	
	Dim HeaderLbl As Label
	HeaderLbl.Initialize("")
	HeaderLbl.Padding = Array As Int (14dip, 0, 14dip, 0)
	HeaderLbl.Gravity=Bit.Or(Gravity.CENTER_VERTICAL,Gravity.RIGHT)
	HeaderLbl.TextColor=Colors.White
	HeaderLbl.Color=SaeloZahra.Color
	HeaderLbl.Text=SaeloZahra.CSB(titleStr)
	P1.AddView(HeaderLbl,0,0,-1,50dip)
	
	Dim IV As ImageView
	IV.Initialize("")
	IV.Bitmap=Bit1
'	SaeloZahra.FitCenterBitmap(IV,Bit1)
	IV.Gravity=Gravity.FILL
	P1.AddView(IV,10dip, 50dip, -2, -2)
	
	Return P1
	
End Sub



Sub CreateWVWeatherPanel(Values As Map,titleStr As String) As Panel
	
	Dim CD As ColorDrawable
	CD.Initialize(Colors.White,16dip)
	
	Dim P1 As Panel
	P1.Initialize("P1")
	P1.Padding = Array As Int (0dip, 0dip, 0dip, 1dip)
'	P1.SetLayout(0 , 0, 90%x, 313dip)
	P1.Elevation=8dip
	P1.Background=CD
	
	Dim HeaderLbl As Label
	HeaderLbl.Initialize("")
	HeaderLbl.Padding = Array As Int (14dip, 0, 14dip, 0)
	HeaderLbl.Gravity=Bit.Or(Gravity.CENTER_VERTICAL,Gravity.RIGHT)
	HeaderLbl.TextColor=Colors.White
	HeaderLbl.Color=SaeloZahra.Color
	HeaderLbl.Text =SaeloZahra.CSB(titleStr)
	P1.AddView(HeaderLbl,-2dip,0,93%x,50dip)'-1
	Dim HTML As String = File.ReadString(File.DirAssets,"weatherPanelTop.html")
	
	
	
	
	
	
	HTML = HTML.Replace("//soratojahatebad//",	SaeloZahra.ConvertPersian(Values.Get("wind")))
	HTML = HTML.Replace("//miangineRotoobat//",	SaeloZahra.ConvertPersian(Values.Get("humidity")))
	HTML = HTML.Replace("//DUPoint//",			SaeloZahra.ConvertPersian(Values.Get("dupoint")))
	HTML = HTML.Replace("//baresh//",			SaeloZahra.ConvertPersian(Values.Get("rain")))
	HTML = HTML.Replace("//UVINDEX//",			SaeloZahra.ConvertPersian(Values.Get("uv")))
	HTML = HTML.Replace("//barf//",				SaeloZahra.ConvertPersian(Values.Get("snow")))
	
	Dim WV1 As WebView
	WV1.Initialize("WV1")
	WV1.Color=Colors.Transparent
	WV1.LoadHtml(HTML)
	P1.AddView(WV1,10dip, 50dip, -2, -2)
	
	Return P1
	
End Sub

Sub CreateSvgLineView(Values As List) As Bitmap
	
	Dim columnTool As Int = 91%x/Values.Size
	Dim Nimcolumn As Int = columnTool/2
	Dim NoghteY,NoghteOldY As Int
	Dim ArrayNoghteY(20) As Int
	Dim B1 As Bitmap
	B1.InitializeMutable(93%x,222dip)
	
	Dim Csv As Canvas
	Csv.Initialize2(B1)
	Csv.DrawColor(Colors.White)
	
	Dim ListVals As List
	ListVals.Initialize
	For i=0 To Values.Size-1
		Dim M0 As Map = Values.Get(i)
		ListVals.Add(M0.Get("value"))
	Next
	
	For i=0 To Values.Size-1
		Dim M1 As Map = Values.Get(i)
'		NoghteY = balaVaPain(M1.Get("value"))
		NoghteY = BalaVaPainHesam(M1.Get("value"),ListVals)
		ArrayNoghteY(i)=NoghteY
		If i>0 Then
'			Dim MGhabl As Map = Values.Get(i-1)
			Csv.DrawLine( ((i-1)*columnTool)+Nimcolumn , NoghteOldY  ,  (i*columnTool)+Nimcolumn,NoghteY,0xFF3A526A,6dip)
			NoghteOldY = NoghteY
		Else
			NoghteOldY = NoghteY
		End If
		Csv.DrawLine((i*columnTool)+Nimcolumn,NoghteY,(i*columnTool)+Nimcolumn,220dip,0x80CCCCCC,1dip)
		
		
	Next
	
	For i=0 To Values.Size-1
		
		Dim M2 As Map = Values.Get(i)
		NoghteY = ArrayNoghteY(i)
		
		If M2.Get("title")=="S" Then
			M2.Put("title","جنوب")
		Else If M2.Get("title")=="N" Then
			M2.Put("title","شمال")
		Else If M2.Get("title")=="W" Then
			M2.Put("title","غرب")
		Else If M2.Get("title")=="E" Then
			M2.Put("title","شرق")
		End If
		
		Csv.DrawCircle((i*columnTool)+Nimcolumn,NoghteY,9dip,Colors.White,True,0)
		Csv.DrawCircle((i*columnTool)+Nimcolumn,NoghteY,10dip,SaeloZahra.Color,False,4dip)
		Csv.DrawText(M2.Get("value"),(i*columnTool)+Nimcolumn,NoghteY-18dip,SaeloZahra.fontBold,20,0xFF3A526A,"CENTER")
		
		Dim rectTitleWidth As Float = Csv.MeasureStringWidth(M2.Get("title"),SaeloZahra.fontBold,12)
		If rectTitleWidth < 20dip Then rectTitleWidth = rectTitleWidth +8dip
		
		Dim RectTitle As Rect
		RectTitle.Initialize((i*columnTool)+Nimcolumn-(rectTitleWidth/2),206dip,(i*columnTool)+Nimcolumn+(rectTitleWidth/2),215dip+DipToCurrent(Csv.MeasureStringHeight(M2.Get("title"),SaeloZahra.fontBold,11)))
		Csv.DrawRect(RectTitle,Colors.Red,True,1dip)
		Csv.DrawText(M2.Get("title"),(i*columnTool)+Nimcolumn,217dip,SaeloZahra.font,8,Colors.White,"CENTER")
		
		If Not(File.Exists(File.DirAssets,M2.Get("image"))) Then
			M2.Put("image","1.png")
		End If
		
		Dim imgRect As Rect
		imgRect.Initialize(i*columnTool-(Nimcolumn/2)+10dip,150dip,i*columnTool-(Nimcolumn/2)+60dip,200dip)
		Csv.DrawBitmap(LoadBitmapSample(File.DirAssets,M2.Get("image"),columnTool,columnTool),Null,imgRect)
		
	Next
	
	Return B1
	
End Sub



Sub CreateSvgBazeView(Values As List) As Bitmap
	
	Dim columnTool As Int = 91%x/Values.Size
	Dim Nimcolumn As Int = columnTool/2
	Dim NoghteY,NoghteY2 As Int
	Dim B1 As Bitmap
	B1.InitializeMutable(93%x,222dip)
	
	Dim Csv As Canvas
	Csv.Initialize2(B1)
	Csv.DrawColor(Colors.White)
	
	
	Dim ListMinVals,ListMaxVals As List
	ListMinVals.Initialize
	ListMaxVals.Initialize
	For i=0 To Values.Size-1
		Dim M0 As Map = Values.Get(i)
		ListMinVals.Add(M0.Get("min"))
		ListMaxVals.Add(M0.Get("max"))
	Next
	
	For i=0 To Values.Size-1
		
		Dim M As Map = Values.Get(i)
'		NoghteY  = Rnd(20dip,80dip)	
		NoghteY  = balaVaPainBaze(M.Get("max"),ListMaxVals)
		NoghteY2 = NoghteY+80dip+(SaeloZahra.parseInt(M.Get("max"))*5) 'balaVaPainBaze(M.Get("min"),ListMinVals) '
		
'		Csv.DrawLine((i*columnTool)+Nimcolumn,NoghteY,(i*columnTool)+Nimcolumn,220dip,0x80CCCCCC,1dip)
		
		Dim RectBox As Rect
		RectBox.Initialize((i*columnTool)+Nimcolumn-20,NoghteY,(i*columnTool)+Nimcolumn+10dip,NoghteY2)
		Csv.DrawRect(RectBox,SaeloZahra.Color,True,1dip)
		
		
		Csv.DrawText(M.Get("max")&"°",(i*columnTool)+Nimcolumn,NoghteY-4dip,SaeloZahra.fontBold,18,0xFF3A526A,"CENTER")
		Csv.DrawText(M.Get("min")&"°",(i*columnTool)+Nimcolumn,NoghteY2+16dip,SaeloZahra.fontBold,18,0xFF3A526A,"CENTER")
		
		Dim rectTitleWidth As Float = Csv.MeasureStringWidth(M.Get("title"),SaeloZahra.font,10)
		Dim rectTitle As Rect
		rectTitle.Initialize((i*columnTool)+Nimcolumn-(rectTitleWidth/2),210dip,(i*columnTool)+Nimcolumn+(rectTitleWidth/2),217dip+DipToCurrent(Csv.MeasureStringHeight(M.Get("title"),SaeloZahra.fontBold,13)))
		Csv.DrawRect(rectTitle,Colors.Red,True,1dip)
		Csv.DrawText(M.Get("title"),(i*columnTool)+Nimcolumn,220dip,SaeloZahra.font,9,Colors.White,"CENTER")
		
		Dim imgRect As Rect
		imgRect.Initialize(i*columnTool+15dip,165dip,i*columnTool+60dip,210dip)
'		Csv.DrawBitmap(LoadBitmapSample(File.DirAssets,"weather-sunny.png",columnTool,columnTool),Null,imgRect)
		Csv.DrawBitmap(SaeloZahra.FindWeatherImg(M.Get("icon")).Resize(columnTool,columnTool,True),Null,imgRect)
		
	Next
	
	Return B1
	
End Sub




'Sub CreateSvgHomeView(Values As Map) As Bitmap
'	
'	Dim B1 As Bitmap
'	B1.InitializeMutable(93%x,260dip)
'	
'	
'	Dim rectAll As Rect
'	rectAll.Initialize(0,0,93%x,260dip )
'	
'	Dim Csv As Canvas
'	Csv.Initialize2(B1)
'	Csv.DrawBitmap(LoadBitmapResize(File.DirAssets,"weatherSv0Bg1.jpg",rectAll.Width,rectAll.Height,True),Null,rectAll)
'	
'
'	Csv.DrawText(Values.Get("humidity"),95dip,40dip,SaeloZahra.fontBold,20,0xFF3A526A,"CENTER")
'	Csv.DrawText(Values.Get("wind"),260dip,40dip,SaeloZahra.fontBold,20,0xFF3A526A,"CENTER")
'	Csv.DrawText("km/h",290dip,40dip,SaeloZahra.fontBold,10,0xFF3A526A,"CENTER")
'	
'	Csv.DrawText(Values.Get("snow"),95dip,130dip,SaeloZahra.fontBold,20,0xFF3A526A,"CENTER")
'	Csv.DrawText(Values.Get("uv"),270dip,130dip,SaeloZahra.fontBold,20,0xFF3A526A,"CENTER")
'	
'	Csv.DrawText(Values.Get("rain"),95dip,220dip,SaeloZahra.fontBold,20,0xFF3A526A,"CENTER")
'	Csv.DrawText(Values.Get("dupoint"),270dip,220dip,SaeloZahra.fontBold,20,0xFF3A526A,"CENTER")
'	
'	
'	Return B1
'	
'End Sub



'Sub balaVaPain(noghteStr As String) As Int
'	
'	Dim noghteInt As Int = noghteStr.Replace("°","")
'	
'	If noghteInt > 30 Then
'		noghteInt=noghteInt*8
'	Else If noghteInt > 14 Then
'		noghteInt=noghteInt*18
'	Else If noghteInt>3 Then
'		noghteInt=noghteInt*30
'	Else If noghteInt>1 Then
'		noghteInt=noghteInt*110
'	Else
'		noghteInt = 1
'		noghteInt=noghteInt*202
'	End If
'	
'	
'	noghteInt = Rnd(noghteInt-3dip,noghteInt+3dip)
'	noghteInt = 140dip - noghteInt
'	
'	If noghteInt > 200dip Then
'		Return 200dip
'	else If noghteInt < 20dip Then
'		Return 20dip
'	Else
'		Return noghteInt
'	End If
'	
'End Sub


	
Sub balaVaPainBaze(val As Int ,Values As List) As Int
	Dim AStr,BStr,XStr,MinStr,MaxStr As Int
	MaxStr=SaeloZahra.parseInt(SaeloZahra.FindMax(Values))
	MinStr=SaeloZahra.parseInt(SaeloZahra.FindMin(Values))
	If Abs(MinStr) > MaxStr Then
		AStr = Abs(MaxStr-MinStr)
	Else
		AStr=MaxStr
	End If
		BStr = 100/AStr
		XStr = 150- BStr*val
	Return XStr
End Sub
	
Sub BalaVaPainHesam(val As Int ,Values As List) As Int
	
'	Dim AStr,BStr,XStr,MinStr,MaxStr As Int
'	MaxStr=SaeloZahra.parseInt(SaeloZahra.FindMax(Values))
'	MinStr=SaeloZahra.parseInt(SaeloZahra.FindMin(Values))
'	AStr = Abs(MaxStr-MinStr)
'	BStr = 100/AStr
'	XStr = BStr*val+50
'	Return XStr
	
	Dim BStr,XStr,MaxStr As Int
	MaxStr=SaeloZahra.parseInt(SaeloZahra.FindMax(Values))
'	MinStr=SaeloZahra.parseInt(SaeloZahra.FindMin(Values))
	BStr = 100/MaxStr
	XStr = 150-BStr*val
	Return XStr + 33dip
	
End Sub
