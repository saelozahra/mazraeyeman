package ir.saelozahra.damaara.mazraeyeman;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class weathernewact_subs_0 {


public static RemoteObject  _actionbar_navigationitemclick() throws Exception{
try {
		Debug.PushSubsStack("Actionbar_NavigationItemClick (weathernewact) ","weathernewact",10,weathernewact.mostCurrent.activityBA,weathernewact.mostCurrent,155);
if (RapidSub.canDelegate("actionbar_navigationitemclick")) { return ir.saelozahra.damaara.mazraeyeman.weathernewact.remoteMe.runUserSub(false, "weathernewact","actionbar_navigationitemclick");}
 BA.debugLineNum = 155;BA.debugLine="Sub Actionbar_NavigationItemClick";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 156;BA.debugLine="Activity.Finish";
Debug.ShouldStop(134217728);
weathernewact.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 157;BA.debugLine="SaeloZahra.SetAnimation(\"zoom_enter\",\"zoom_exit\")";
Debug.ShouldStop(268435456);
weathernewact.mostCurrent._saelozahra.runVoidMethod ("_setanimation" /*RemoteObject*/ ,weathernewact.mostCurrent.activityBA,(Object)(BA.ObjectToString("zoom_enter")),(Object)(RemoteObject.createImmutable("zoom_exit")));
 BA.debugLineNum = 158;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (weathernewact) ","weathernewact",10,weathernewact.mostCurrent.activityBA,weathernewact.mostCurrent,29);
if (RapidSub.canDelegate("activity_create")) { return ir.saelozahra.damaara.mazraeyeman.weathernewact.remoteMe.runUserSub(false, "weathernewact","activity_create", _firsttime);}
RemoteObject _p1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _p2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _p3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 29;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 31;BA.debugLine="Activity.LoadLayout(\"TabNewlayout\")";
Debug.ShouldStop(1073741824);
weathernewact.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("TabNewlayout")),weathernewact.mostCurrent.activityBA);
 BA.debugLineNum = 33;BA.debugLine="ActionBar.Title=SaeloZahra.CSB(\"هواشنــــــــــــ";
Debug.ShouldStop(1);
weathernewact.mostCurrent._actionbar.runMethod(true,"setTitle",BA.ObjectToCharSequence(weathernewact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,weathernewact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("هواشنـــــــــــــــاسی"))).getObject()));
 BA.debugLineNum = 34;BA.debugLine="ActionBar.TitleTextColor=Colors.White";
Debug.ShouldStop(2);
weathernewact.mostCurrent._actionbar.runVoidMethod ("setTitleTextColor",weathernewact.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 35;BA.debugLine="ActionBar.NavigationIconDrawable = X1.GetDrawable";
Debug.ShouldStop(4);
weathernewact.mostCurrent._actionbar.runMethod(false,"setNavigationIconDrawable",weathernewact.mostCurrent._x1.runMethod(false,"GetDrawable",(Object)(RemoteObject.createImmutable("baseline_arrow_back_white_24"))));
 BA.debugLineNum = 36;BA.debugLine="ActionBar.Color=SaeloZahra.Color";
Debug.ShouldStop(8);
weathernewact.mostCurrent._actionbar.runVoidMethod ("setColor",weathernewact.mostCurrent._saelozahra._color /*RemoteObject*/ );
 BA.debugLineNum = 38;BA.debugLine="SaeloZahra.SetStatusBarColor(SaeloZahra.ColorDark";
Debug.ShouldStop(32);
weathernewact.mostCurrent._saelozahra.runVoidMethod ("_setstatusbarcolor" /*RemoteObject*/ ,weathernewact.mostCurrent.activityBA,(Object)(weathernewact.mostCurrent._saelozahra._colordark /*RemoteObject*/ ));
 BA.debugLineNum = 42;BA.debugLine="PC.Initialize";
Debug.ShouldStop(512);
weathernewact.mostCurrent._pc.runVoidMethod ("Initialize",weathernewact.mostCurrent.activityBA);
 BA.debugLineNum = 43;BA.debugLine="TabLayout.SetTabTextColors(0x7FFFFFFF,Colors.Whit";
Debug.ShouldStop(1024);
weathernewact.mostCurrent._tablayout.runVoidMethod ("SetTabTextColors",(Object)(BA.numberCast(int.class, ((int)0x7fffffff))),(Object)(weathernewact.mostCurrent.__c.getField(false,"Colors").getField(true,"White")));
 BA.debugLineNum = 44;BA.debugLine="TabLayout.TabIndicatorColor=Colors.White";
Debug.ShouldStop(2048);
weathernewact.mostCurrent._tablayout.runVoidMethod ("setTabIndicatorColor",weathernewact.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 47;BA.debugLine="SV(0).Initialize(1000dip)";
Debug.ShouldStop(16384);
weathernewact.mostCurrent._sv.getArrayElement(false,BA.numberCast(int.class, 0)).runVoidMethod ("Initialize",weathernewact.mostCurrent.activityBA,(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1000)))));
 BA.debugLineNum = 48;BA.debugLine="SV(1).Initialize(1000dip)";
Debug.ShouldStop(32768);
weathernewact.mostCurrent._sv.getArrayElement(false,BA.numberCast(int.class, 1)).runVoidMethod ("Initialize",weathernewact.mostCurrent.activityBA,(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1000)))));
 BA.debugLineNum = 49;BA.debugLine="SV(2).Initialize(1000dip)";
Debug.ShouldStop(65536);
weathernewact.mostCurrent._sv.getArrayElement(false,BA.numberCast(int.class, 2)).runVoidMethod ("Initialize",weathernewact.mostCurrent.activityBA,(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1000)))));
 BA.debugLineNum = 50;BA.debugLine="SV(3).Initialize(1000dip)";
Debug.ShouldStop(131072);
weathernewact.mostCurrent._sv.getArrayElement(false,BA.numberCast(int.class, 3)).runVoidMethod ("Initialize",weathernewact.mostCurrent.activityBA,(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1000)))));
 BA.debugLineNum = 51;BA.debugLine="SV(4).Initialize(1000dip)";
Debug.ShouldStop(262144);
weathernewact.mostCurrent._sv.getArrayElement(false,BA.numberCast(int.class, 4)).runVoidMethod ("Initialize",weathernewact.mostCurrent.activityBA,(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1000)))));
 BA.debugLineNum = 52;BA.debugLine="SV(0).Panel.Padding = Array As Int (5dip, 14dip,";
Debug.ShouldStop(524288);
weathernewact.mostCurrent._sv.getArrayElement(false,BA.numberCast(int.class, 0)).runMethod(false,"getPanel").runMethod(false,"setPadding",RemoteObject.createNewArray("int",new int[] {4},new Object[] {weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))),weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 14))),weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))),weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 14)))}));
 BA.debugLineNum = 53;BA.debugLine="SV(1).Panel.Padding = Array As Int (5dip, 14dip,";
Debug.ShouldStop(1048576);
weathernewact.mostCurrent._sv.getArrayElement(false,BA.numberCast(int.class, 1)).runMethod(false,"getPanel").runMethod(false,"setPadding",RemoteObject.createNewArray("int",new int[] {4},new Object[] {weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))),weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 14))),weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))),weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 14)))}));
 BA.debugLineNum = 54;BA.debugLine="SV(2).Panel.Padding = Array As Int (5dip, 14dip,";
Debug.ShouldStop(2097152);
weathernewact.mostCurrent._sv.getArrayElement(false,BA.numberCast(int.class, 2)).runMethod(false,"getPanel").runMethod(false,"setPadding",RemoteObject.createNewArray("int",new int[] {4},new Object[] {weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))),weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 14))),weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))),weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 14)))}));
 BA.debugLineNum = 55;BA.debugLine="SV(3).Panel.Padding = Array As Int (5dip, 14dip,";
Debug.ShouldStop(4194304);
weathernewact.mostCurrent._sv.getArrayElement(false,BA.numberCast(int.class, 3)).runMethod(false,"getPanel").runMethod(false,"setPadding",RemoteObject.createNewArray("int",new int[] {4},new Object[] {weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))),weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 14))),weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))),weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 14)))}));
 BA.debugLineNum = 56;BA.debugLine="SV(4).Panel.Padding = Array As Int (5dip, 14dip,";
Debug.ShouldStop(8388608);
weathernewact.mostCurrent._sv.getArrayElement(false,BA.numberCast(int.class, 4)).runMethod(false,"getPanel").runMethod(false,"setPadding",RemoteObject.createNewArray("int",new int[] {4},new Object[] {weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))),weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 14))),weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))),weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 14)))}));
 BA.debugLineNum = 59;BA.debugLine="PC.AddPage(SV(4), SaeloZahra.csb(\"سالانه\"))";
Debug.ShouldStop(67108864);
weathernewact.mostCurrent._pc.runVoidMethod ("AddPage",(Object)((weathernewact.mostCurrent._sv.getArrayElement(false,BA.numberCast(int.class, 4)).getObject())),(Object)(BA.ObjectToString(weathernewact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,weathernewact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("سالانه"))))));
 BA.debugLineNum = 60;BA.debugLine="PC.AddPage(SV(3), SaeloZahra.csb(\"مــاهانه\"))";
Debug.ShouldStop(134217728);
weathernewact.mostCurrent._pc.runVoidMethod ("AddPage",(Object)((weathernewact.mostCurrent._sv.getArrayElement(false,BA.numberCast(int.class, 3)).getObject())),(Object)(BA.ObjectToString(weathernewact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,weathernewact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("مــاهانه"))))));
 BA.debugLineNum = 61;BA.debugLine="PC.AddPage(SV(2), SaeloZahra.csb(\"هــــفتگی\"))";
Debug.ShouldStop(268435456);
weathernewact.mostCurrent._pc.runVoidMethod ("AddPage",(Object)((weathernewact.mostCurrent._sv.getArrayElement(false,BA.numberCast(int.class, 2)).getObject())),(Object)(BA.ObjectToString(weathernewact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,weathernewact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("هــــفتگی"))))));
 BA.debugLineNum = 62;BA.debugLine="PC.AddPage(SV(1), SaeloZahra.csb(\"امـــــــــــــ";
Debug.ShouldStop(536870912);
weathernewact.mostCurrent._pc.runVoidMethod ("AddPage",(Object)((weathernewact.mostCurrent._sv.getArrayElement(false,BA.numberCast(int.class, 1)).getObject())),(Object)(BA.ObjectToString(weathernewact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,weathernewact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("امــــــــــــــــــروز"))))));
 BA.debugLineNum = 63;BA.debugLine="PC.AddPage(SV(0), SaeloZahra.csb(\"هفته آیــــــــ";
Debug.ShouldStop(1073741824);
weathernewact.mostCurrent._pc.runVoidMethod ("AddPage",(Object)((weathernewact.mostCurrent._sv.getArrayElement(false,BA.numberCast(int.class, 0)).getObject())),(Object)(BA.ObjectToString(weathernewact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,weathernewact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("هفته آیـــــــــــنده"))))));
 BA.debugLineNum = 64;BA.debugLine="VP.PageContainer = PC";
Debug.ShouldStop(-2147483648);
weathernewact.mostCurrent._vp.runVoidMethod ("setPageContainer",weathernewact.mostCurrent._pc);
 BA.debugLineNum = 66;BA.debugLine="TabLayout.Color=SaeloZahra.Color";
Debug.ShouldStop(2);
weathernewact.mostCurrent._tablayout.runVoidMethod ("setColor",weathernewact.mostCurrent._saelozahra._color /*RemoteObject*/ );
 BA.debugLineNum = 67;BA.debugLine="TabLayout.TabMode=TabLayout.MODE_SCROLLABLE";
Debug.ShouldStop(4);
weathernewact.mostCurrent._tablayout.runMethod(true,"setTabMode",weathernewact.mostCurrent._tablayout.getField(true,"MODE_SCROLLABLE"));
 BA.debugLineNum = 69;BA.debugLine="TabLayout.SetViewPager(VP)";
Debug.ShouldStop(16);
weathernewact.mostCurrent._tablayout.runVoidMethod ("SetViewPager",(Object)((weathernewact.mostCurrent._vp.getObject())));
 BA.debugLineNum = 70;BA.debugLine="ActionBar.SetLayout(0,0,100%x,SaeloZahra.Material";
Debug.ShouldStop(32);
weathernewact.mostCurrent._actionbar.runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),weathernewact.mostCurrent.activityBA)),(Object)(weathernewact.mostCurrent._saelozahra._materialactionbarheight /*RemoteObject*/ ));
 BA.debugLineNum = 71;BA.debugLine="TabLayout.SetLayout(0,ActionBar.Top+ActionBar.Hei";
Debug.ShouldStop(64);
weathernewact.mostCurrent._tablayout.runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {weathernewact.mostCurrent._actionbar.runMethod(true,"getTop"),weathernewact.mostCurrent._actionbar.runMethod(true,"getHeight")}, "+",1, 1)),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),weathernewact.mostCurrent.activityBA)),(Object)(weathernewact.mostCurrent._saelozahra._materialactionbarheight /*RemoteObject*/ ));
 BA.debugLineNum = 72;BA.debugLine="VP.SetLayout(0,TabLayout.Top+TabLayout.Height,100";
Debug.ShouldStop(128);
weathernewact.mostCurrent._vp.runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {weathernewact.mostCurrent._tablayout.runMethod(true,"getTop"),weathernewact.mostCurrent._tablayout.runMethod(true,"getHeight")}, "+",1, 1)),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),weathernewact.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {weathernewact.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),weathernewact.mostCurrent.activityBA),(RemoteObject.solve(new RemoteObject[] {weathernewact.mostCurrent._saelozahra._materialactionbarheight /*RemoteObject*/ ,RemoteObject.createImmutable(2)}, "*",0, 1))}, "-",1, 1)));
 BA.debugLineNum = 74;BA.debugLine="VP.GotoPage(PC.Count-1,True)";
Debug.ShouldStop(512);
weathernewact.mostCurrent._vp.runVoidMethodAndSync ("GotoPage",(Object)(RemoteObject.solve(new RemoteObject[] {weathernewact.mostCurrent._pc.runMethod(true,"getCount"),RemoteObject.createImmutable(1)}, "-",1, 1)),(Object)(weathernewact.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 80;BA.debugLine="JobGetAmar.Initialize(\"JobGetAmar\", Me)";
Debug.ShouldStop(32768);
weathernewact.mostCurrent._jobgetamar.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_initialize" /*RemoteObject*/ ,weathernewact.processBA,(Object)(BA.ObjectToString("JobGetAmar")),(Object)(weathernewact.getObject()));
 BA.debugLineNum = 81;BA.debugLine="JobGetAmar.Download(SaeloZahra.json_url&\"statisti";
Debug.ShouldStop(65536);
weathernewact.mostCurrent._jobgetamar.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.concat(weathernewact.mostCurrent._saelozahra._json_url /*RemoteObject*/ ,RemoteObject.createImmutable("statistics_weather.php?query_type=amar&userid="),weathernewact.mostCurrent._starter._usrnm /*RemoteObject*/ )));
 BA.debugLineNum = 83;BA.debugLine="If SaeloZahra.P.SdkVersion>23 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean(">",weathernewact.mostCurrent._saelozahra._p /*RemoteObject*/ .runMethod(true,"getSdkVersion"),BA.numberCast(double.class, 23))) { 
 BA.debugLineNum = 84;BA.debugLine="Config.Initialize";
Debug.ShouldStop(524288);
weathernewact.mostCurrent._config.runVoidMethod ("Initialize",weathernewact.processBA);
 BA.debugLineNum = 85;BA.debugLine="Config.position(Config.POSITION_LEFT)";
Debug.ShouldStop(1048576);
weathernewact.mostCurrent._config.runVoidMethod ("position",(Object)(weathernewact.mostCurrent._config.getField(true,"POSITION_LEFT")));
 BA.debugLineNum = 86;BA.debugLine="Config.primaryColor(SaeloZahra.ColorDark)";
Debug.ShouldStop(2097152);
weathernewact.mostCurrent._config.runVoidMethod ("primaryColor",(Object)(weathernewact.mostCurrent._saelozahra._colordark /*RemoteObject*/ ));
 BA.debugLineNum = 87;BA.debugLine="Config.edge(True )";
Debug.ShouldStop(4194304);
weathernewact.mostCurrent._config.runVoidMethod ("edge",(Object)(weathernewact.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 88;BA.debugLine="Config.sensitivity(100)";
Debug.ShouldStop(8388608);
weathernewact.mostCurrent._config.runVoidMethod ("sensitivity",(Object)(BA.numberCast(float.class, 100)));
 BA.debugLineNum = 89;BA.debugLine="Config.scrimColor(Colors.ARGB(180,0,0,0))";
Debug.ShouldStop(16777216);
weathernewact.mostCurrent._config.runVoidMethod ("scrimColor",(Object)(weathernewact.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 180)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))));
 BA.debugLineNum = 91;BA.debugLine="Show.convertActivityToTranslucent";
Debug.ShouldStop(67108864);
weathernewact.mostCurrent._show.runVoidMethod ("convertActivityToTranslucent",weathernewact.mostCurrent.activityBA);
 BA.debugLineNum = 92;BA.debugLine="Show.attachActivity(Config)";
Debug.ShouldStop(134217728);
weathernewact.mostCurrent._show.runVoidMethod ("attachActivity",weathernewact.mostCurrent.activityBA,(Object)(weathernewact.mostCurrent._config));
 };
 BA.debugLineNum = 95;BA.debugLine="ProgressDialogShow(SaeloZahra.CSB(\"در حال دریافت";
Debug.ShouldStop(1073741824);
weathernewact.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",weathernewact.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(weathernewact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,weathernewact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("در حال دریافت وضعیت مزرعه شما"))).getObject())));
 BA.debugLineNum = 123;BA.debugLine="Dim P1 As Panel = CreateWeatherPanel(CreateSvgBaz";
Debug.ShouldStop(67108864);
_p1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_p1 = _createweatherpanel(_createsvgbazeview(weathernewact.mostCurrent._accuweathercronjobservice._bazedama /*RemoteObject*/ ),RemoteObject.createImmutable("نوسان دما"));Debug.locals.put("P1", _p1);Debug.locals.put("P1", _p1);
 BA.debugLineNum = 125;BA.debugLine="SV(0).Panel.AddView(P1, 20dip, 20dip, 90%x, 313di";
Debug.ShouldStop(268435456);
weathernewact.mostCurrent._sv.getArrayElement(false,BA.numberCast(int.class, 0)).runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((_p1.getObject())),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 90)),weathernewact.mostCurrent.activityBA)),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 313)))));
 BA.debugLineNum = 129;BA.debugLine="Dim P2 As Panel = CreateWeatherPanel(CreateSvgLin";
Debug.ShouldStop(1);
_p2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_p2 = _createweatherpanel(_createsvglineview(weathernewact.mostCurrent._accuweathercronjobservice._windhaday /*RemoteObject*/ ),RemoteObject.createImmutable("وضعیت وزش باد روز"));Debug.locals.put("P2", _p2);Debug.locals.put("P2", _p2);
 BA.debugLineNum = 130;BA.debugLine="SV(0).Panel.AddView(P2, 20dip, 372dip, 90%x, 280d";
Debug.ShouldStop(2);
weathernewact.mostCurrent._sv.getArrayElement(false,BA.numberCast(int.class, 0)).runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((_p2.getObject())),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 372)))),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 90)),weathernewact.mostCurrent.activityBA)),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 280)))));
 BA.debugLineNum = 133;BA.debugLine="Dim P3 As Panel = CreateWeatherPanel(CreateSvgLin";
Debug.ShouldStop(16);
_p3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_p3 = _createweatherpanel(_createsvglineview(weathernewact.mostCurrent._accuweathercronjobservice._windhanight /*RemoteObject*/ ),RemoteObject.createImmutable("وضعیت وزش باد شب"));Debug.locals.put("P3", _p3);Debug.locals.put("P3", _p3);
 BA.debugLineNum = 134;BA.debugLine="SV(0).Panel.AddView(P3, 20dip, 720dip, 90%x, 280d";
Debug.ShouldStop(32);
weathernewact.mostCurrent._sv.getArrayElement(false,BA.numberCast(int.class, 0)).runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((_p3.getObject())),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 720)))),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 90)),weathernewact.mostCurrent.activityBA)),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 280)))));
 BA.debugLineNum = 137;BA.debugLine="SV(0).Panel.Height = P1.Top+P1.Height    +    110";
Debug.ShouldStop(256);
weathernewact.mostCurrent._sv.getArrayElement(false,BA.numberCast(int.class, 0)).runMethod(false,"getPanel").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {_p1.runMethod(true,"getTop"),_p1.runMethod(true,"getHeight"),weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 110))),_p2.runMethod(true,"getHeight"),weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 110))),_p3.runMethod(true,"getHeight")}, "+++++",5, 1));
 BA.debugLineNum = 143;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_keypress(RemoteObject _keycode) throws Exception{
try {
		Debug.PushSubsStack("Activity_KeyPress (weathernewact) ","weathernewact",10,weathernewact.mostCurrent.activityBA,weathernewact.mostCurrent,161);
if (RapidSub.canDelegate("activity_keypress")) { return ir.saelozahra.damaara.mazraeyeman.weathernewact.remoteMe.runUserSub(false, "weathernewact","activity_keypress", _keycode);}
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 161;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(1);
 BA.debugLineNum = 162;BA.debugLine="If KeyCode==KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, weathernewact.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 163;BA.debugLine="Actionbar_NavigationItemClick";
Debug.ShouldStop(4);
_actionbar_navigationitemclick();
 BA.debugLineNum = 164;BA.debugLine="Return False";
Debug.ShouldStop(8);
if (true) return weathernewact.mostCurrent.__c.getField(true,"False");
 }else {
 BA.debugLineNum = 166;BA.debugLine="Return True";
Debug.ShouldStop(32);
if (true) return weathernewact.mostCurrent.__c.getField(true,"True");
 };
 BA.debugLineNum = 168;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (weathernewact) ","weathernewact",10,weathernewact.mostCurrent.activityBA,weathernewact.mostCurrent,149);
if (RapidSub.canDelegate("activity_pause")) { return ir.saelozahra.damaara.mazraeyeman.weathernewact.remoteMe.runUserSub(false, "weathernewact","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 149;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 151;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (weathernewact) ","weathernewact",10,weathernewact.mostCurrent.activityBA,weathernewact.mostCurrent,145);
if (RapidSub.canDelegate("activity_resume")) { return ir.saelozahra.damaara.mazraeyeman.weathernewact.remoteMe.runUserSub(false, "weathernewact","activity_resume");}
 BA.debugLineNum = 145;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(65536);
 BA.debugLineNum = 147;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _balavapainbaze(RemoteObject _val,RemoteObject _values) throws Exception{
try {
		Debug.PushSubsStack("balaVaPainBaze (weathernewact) ","weathernewact",10,weathernewact.mostCurrent.activityBA,weathernewact.mostCurrent,694);
if (RapidSub.canDelegate("balavapainbaze")) { return ir.saelozahra.damaara.mazraeyeman.weathernewact.remoteMe.runUserSub(false, "weathernewact","balavapainbaze", _val, _values);}
RemoteObject _astr = RemoteObject.createImmutable(0);
RemoteObject _bstr = RemoteObject.createImmutable(0);
RemoteObject _xstr = RemoteObject.createImmutable(0);
RemoteObject _minstr = RemoteObject.createImmutable(0);
RemoteObject _maxstr = RemoteObject.createImmutable(0);
Debug.locals.put("val", _val);
Debug.locals.put("Values", _values);
 BA.debugLineNum = 694;BA.debugLine="Sub balaVaPainBaze(val As Int ,Values As List) As";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 695;BA.debugLine="Dim AStr,BStr,XStr,MinStr,MaxStr As Int";
Debug.ShouldStop(4194304);
_astr = RemoteObject.createImmutable(0);Debug.locals.put("AStr", _astr);
_bstr = RemoteObject.createImmutable(0);Debug.locals.put("BStr", _bstr);
_xstr = RemoteObject.createImmutable(0);Debug.locals.put("XStr", _xstr);
_minstr = RemoteObject.createImmutable(0);Debug.locals.put("MinStr", _minstr);
_maxstr = RemoteObject.createImmutable(0);Debug.locals.put("MaxStr", _maxstr);
 BA.debugLineNum = 696;BA.debugLine="MaxStr=SaeloZahra.parseInt(SaeloZahra.FindMax(Val";
Debug.ShouldStop(8388608);
_maxstr = weathernewact.mostCurrent._saelozahra.runMethod(true,"_parseint" /*RemoteObject*/ ,weathernewact.mostCurrent.activityBA,(Object)(weathernewact.mostCurrent._saelozahra.runMethod(true,"_findmax" /*RemoteObject*/ ,weathernewact.mostCurrent.activityBA,(Object)(_values))));Debug.locals.put("MaxStr", _maxstr);
 BA.debugLineNum = 697;BA.debugLine="MinStr=SaeloZahra.parseInt(SaeloZahra.FindMin(Val";
Debug.ShouldStop(16777216);
_minstr = weathernewact.mostCurrent._saelozahra.runMethod(true,"_parseint" /*RemoteObject*/ ,weathernewact.mostCurrent.activityBA,(Object)(weathernewact.mostCurrent._saelozahra.runMethod(true,"_findmin" /*RemoteObject*/ ,weathernewact.mostCurrent.activityBA,(Object)(_values))));Debug.locals.put("MinStr", _minstr);
 BA.debugLineNum = 698;BA.debugLine="If Abs(MinStr) > MaxStr Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean(">",weathernewact.mostCurrent.__c.runMethod(true,"Abs",(Object)(BA.numberCast(double.class, _minstr))),BA.numberCast(double.class, _maxstr))) { 
 BA.debugLineNum = 699;BA.debugLine="AStr = Abs(MaxStr-MinStr)";
Debug.ShouldStop(67108864);
_astr = BA.numberCast(int.class, weathernewact.mostCurrent.__c.runMethod(true,"Abs",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_maxstr,_minstr}, "-",1, 1)))));Debug.locals.put("AStr", _astr);
 }else {
 BA.debugLineNum = 701;BA.debugLine="AStr=MaxStr";
Debug.ShouldStop(268435456);
_astr = _maxstr;Debug.locals.put("AStr", _astr);
 };
 BA.debugLineNum = 703;BA.debugLine="BStr = 100/AStr";
Debug.ShouldStop(1073741824);
_bstr = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(100),_astr}, "/",0, 0));Debug.locals.put("BStr", _bstr);
 BA.debugLineNum = 704;BA.debugLine="XStr = 150- BStr*val";
Debug.ShouldStop(-2147483648);
_xstr = RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(150),_bstr,_val}, "-*",1, 1);Debug.locals.put("XStr", _xstr);
 BA.debugLineNum = 705;BA.debugLine="Return XStr";
Debug.ShouldStop(1);
if (true) return _xstr;
 BA.debugLineNum = 706;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _balavapainhesam(RemoteObject _val,RemoteObject _values) throws Exception{
try {
		Debug.PushSubsStack("BalaVaPainHesam (weathernewact) ","weathernewact",10,weathernewact.mostCurrent.activityBA,weathernewact.mostCurrent,708);
if (RapidSub.canDelegate("balavapainhesam")) { return ir.saelozahra.damaara.mazraeyeman.weathernewact.remoteMe.runUserSub(false, "weathernewact","balavapainhesam", _val, _values);}
RemoteObject _bstr = RemoteObject.createImmutable(0);
RemoteObject _xstr = RemoteObject.createImmutable(0);
RemoteObject _maxstr = RemoteObject.createImmutable(0);
Debug.locals.put("val", _val);
Debug.locals.put("Values", _values);
 BA.debugLineNum = 708;BA.debugLine="Sub BalaVaPainHesam(val As Int ,Values As List) As";
Debug.ShouldStop(8);
 BA.debugLineNum = 718;BA.debugLine="Dim BStr,XStr,MaxStr As Int";
Debug.ShouldStop(8192);
_bstr = RemoteObject.createImmutable(0);Debug.locals.put("BStr", _bstr);
_xstr = RemoteObject.createImmutable(0);Debug.locals.put("XStr", _xstr);
_maxstr = RemoteObject.createImmutable(0);Debug.locals.put("MaxStr", _maxstr);
 BA.debugLineNum = 719;BA.debugLine="MaxStr=SaeloZahra.parseInt(SaeloZahra.FindMax(Val";
Debug.ShouldStop(16384);
_maxstr = weathernewact.mostCurrent._saelozahra.runMethod(true,"_parseint" /*RemoteObject*/ ,weathernewact.mostCurrent.activityBA,(Object)(weathernewact.mostCurrent._saelozahra.runMethod(true,"_findmax" /*RemoteObject*/ ,weathernewact.mostCurrent.activityBA,(Object)(_values))));Debug.locals.put("MaxStr", _maxstr);
 BA.debugLineNum = 721;BA.debugLine="BStr = 100/MaxStr";
Debug.ShouldStop(65536);
_bstr = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(100),_maxstr}, "/",0, 0));Debug.locals.put("BStr", _bstr);
 BA.debugLineNum = 722;BA.debugLine="XStr = 150-BStr*val";
Debug.ShouldStop(131072);
_xstr = RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(150),_bstr,_val}, "-*",1, 1);Debug.locals.put("XStr", _xstr);
 BA.debugLineNum = 723;BA.debugLine="Return XStr + 33dip";
Debug.ShouldStop(262144);
if (true) return RemoteObject.solve(new RemoteObject[] {_xstr,weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 33)))}, "+",1, 1);
 BA.debugLineNum = 725;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createsvgbazeview(RemoteObject _values) throws Exception{
try {
		Debug.PushSubsStack("CreateSvgBazeView (weathernewact) ","weathernewact",10,weathernewact.mostCurrent.activityBA,weathernewact.mostCurrent,571);
if (RapidSub.canDelegate("createsvgbazeview")) { return ir.saelozahra.damaara.mazraeyeman.weathernewact.remoteMe.runUserSub(false, "weathernewact","createsvgbazeview", _values);}
RemoteObject _columntool = RemoteObject.createImmutable(0);
RemoteObject _nimcolumn = RemoteObject.createImmutable(0);
RemoteObject _noghtey = RemoteObject.createImmutable(0);
RemoteObject _noghtey2 = RemoteObject.createImmutable(0);
RemoteObject _b1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _csv = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper");
RemoteObject _listminvals = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _listmaxvals = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _m0 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _rectbox = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper");
RemoteObject _recttitlewidth = RemoteObject.createImmutable(0f);
RemoteObject _recttitle = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper");
RemoteObject _imgrect = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper");
Debug.locals.put("Values", _values);
 BA.debugLineNum = 571;BA.debugLine="Sub CreateSvgBazeView(Values As List) As Bitmap";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 573;BA.debugLine="Dim columnTool As Int = 91%x/Values.Size";
Debug.ShouldStop(268435456);
_columntool = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {weathernewact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 91)),weathernewact.mostCurrent.activityBA),_values.runMethod(true,"getSize")}, "/",0, 0));Debug.locals.put("columnTool", _columntool);Debug.locals.put("columnTool", _columntool);
 BA.debugLineNum = 574;BA.debugLine="Dim Nimcolumn As Int = columnTool/2";
Debug.ShouldStop(536870912);
_nimcolumn = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_columntool,RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("Nimcolumn", _nimcolumn);Debug.locals.put("Nimcolumn", _nimcolumn);
 BA.debugLineNum = 575;BA.debugLine="Dim NoghteY,NoghteY2 As Int";
Debug.ShouldStop(1073741824);
_noghtey = RemoteObject.createImmutable(0);Debug.locals.put("NoghteY", _noghtey);
_noghtey2 = RemoteObject.createImmutable(0);Debug.locals.put("NoghteY2", _noghtey2);
 BA.debugLineNum = 576;BA.debugLine="Dim B1 As Bitmap";
Debug.ShouldStop(-2147483648);
_b1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("B1", _b1);
 BA.debugLineNum = 577;BA.debugLine="B1.InitializeMutable(93%x,222dip)";
Debug.ShouldStop(1);
_b1.runVoidMethod ("InitializeMutable",(Object)(weathernewact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 93)),weathernewact.mostCurrent.activityBA)),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 222)))));
 BA.debugLineNum = 579;BA.debugLine="Dim Csv As Canvas";
Debug.ShouldStop(4);
_csv = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper");Debug.locals.put("Csv", _csv);
 BA.debugLineNum = 580;BA.debugLine="Csv.Initialize2(B1)";
Debug.ShouldStop(8);
_csv.runVoidMethod ("Initialize2",(Object)((_b1.getObject())));
 BA.debugLineNum = 581;BA.debugLine="Csv.DrawColor(Colors.White)";
Debug.ShouldStop(16);
_csv.runVoidMethod ("DrawColor",(Object)(weathernewact.mostCurrent.__c.getField(false,"Colors").getField(true,"White")));
 BA.debugLineNum = 584;BA.debugLine="Dim ListMinVals,ListMaxVals As List";
Debug.ShouldStop(128);
_listminvals = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ListMinVals", _listminvals);
_listmaxvals = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ListMaxVals", _listmaxvals);
 BA.debugLineNum = 585;BA.debugLine="ListMinVals.Initialize";
Debug.ShouldStop(256);
_listminvals.runVoidMethod ("Initialize");
 BA.debugLineNum = 586;BA.debugLine="ListMaxVals.Initialize";
Debug.ShouldStop(512);
_listmaxvals.runVoidMethod ("Initialize");
 BA.debugLineNum = 587;BA.debugLine="For i=0 To Values.Size-1";
Debug.ShouldStop(1024);
{
final int step12 = 1;
final int limit12 = RemoteObject.solve(new RemoteObject[] {_values.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step12 > 0 && _i <= limit12) || (step12 < 0 && _i >= limit12) ;_i = ((int)(0 + _i + step12))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 588;BA.debugLine="Dim M0 As Map = Values.Get(i)";
Debug.ShouldStop(2048);
_m0 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m0 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _values.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("M0", _m0);Debug.locals.put("M0", _m0);
 BA.debugLineNum = 589;BA.debugLine="ListMinVals.Add(M0.Get(\"min\"))";
Debug.ShouldStop(4096);
_listminvals.runVoidMethod ("Add",(Object)(_m0.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("min"))))));
 BA.debugLineNum = 590;BA.debugLine="ListMaxVals.Add(M0.Get(\"max\"))";
Debug.ShouldStop(8192);
_listmaxvals.runVoidMethod ("Add",(Object)(_m0.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("max"))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 593;BA.debugLine="For i=0 To Values.Size-1";
Debug.ShouldStop(65536);
{
final int step17 = 1;
final int limit17 = RemoteObject.solve(new RemoteObject[] {_values.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step17 > 0 && _i <= limit17) || (step17 < 0 && _i >= limit17) ;_i = ((int)(0 + _i + step17))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 595;BA.debugLine="Dim M As Map = Values.Get(i)";
Debug.ShouldStop(262144);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _values.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("M", _m);Debug.locals.put("M", _m);
 BA.debugLineNum = 597;BA.debugLine="NoghteY  = balaVaPainBaze(M.Get(\"max\"),ListMaxVa";
Debug.ShouldStop(1048576);
_noghtey = _balavapainbaze(BA.numberCast(int.class, _m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("max"))))),_listmaxvals);Debug.locals.put("NoghteY", _noghtey);
 BA.debugLineNum = 598;BA.debugLine="NoghteY2 = NoghteY+80dip+(SaeloZahra.parseInt(M.";
Debug.ShouldStop(2097152);
_noghtey2 = RemoteObject.solve(new RemoteObject[] {_noghtey,weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80))),(RemoteObject.solve(new RemoteObject[] {weathernewact.mostCurrent._saelozahra.runMethod(true,"_parseint" /*RemoteObject*/ ,weathernewact.mostCurrent.activityBA,(Object)(BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("max"))))))),RemoteObject.createImmutable(5)}, "*",0, 1))}, "++",2, 1);Debug.locals.put("NoghteY2", _noghtey2);
 BA.debugLineNum = 602;BA.debugLine="Dim RectBox As Rect";
Debug.ShouldStop(33554432);
_rectbox = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper");Debug.locals.put("RectBox", _rectbox);
 BA.debugLineNum = 603;BA.debugLine="RectBox.Initialize((i*columnTool)+Nimcolumn-20,N";
Debug.ShouldStop(67108864);
_rectbox.runVoidMethod ("Initialize",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),_columntool}, "*",0, 1)),_nimcolumn,RemoteObject.createImmutable(20)}, "+-",2, 1)),(Object)(_noghtey),(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),_columntool}, "*",0, 1)),_nimcolumn,weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "++",2, 1)),(Object)(_noghtey2));
 BA.debugLineNum = 604;BA.debugLine="Csv.DrawRect(RectBox,SaeloZahra.Color,True,1dip)";
Debug.ShouldStop(134217728);
_csv.runVoidMethod ("DrawRect",(Object)((_rectbox.getObject())),(Object)(weathernewact.mostCurrent._saelozahra._color /*RemoteObject*/ ),(Object)(weathernewact.mostCurrent.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 607;BA.debugLine="Csv.DrawText(M.Get(\"max\")&\"°\",(i*columnTool)+Nim";
Debug.ShouldStop(1073741824);
_csv.runVoidMethod ("DrawText",weathernewact.mostCurrent.activityBA,(Object)(RemoteObject.concat(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("max")))),RemoteObject.createImmutable("°"))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),_columntool}, "*",0, 1)),_nimcolumn}, "+",1, 1))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_noghtey,weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))}, "-",1, 1))),(Object)((weathernewact.mostCurrent._saelozahra._fontbold /*RemoteObject*/ .getObject())),(Object)(BA.numberCast(float.class, 18)),(Object)(BA.numberCast(int.class, ((int)0xff3a526a))),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Paint.Align"),RemoteObject.createImmutable("CENTER"))));
 BA.debugLineNum = 608;BA.debugLine="Csv.DrawText(M.Get(\"min\")&\"°\",(i*columnTool)+Nim";
Debug.ShouldStop(-2147483648);
_csv.runVoidMethod ("DrawText",weathernewact.mostCurrent.activityBA,(Object)(RemoteObject.concat(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("min")))),RemoteObject.createImmutable("°"))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),_columntool}, "*",0, 1)),_nimcolumn}, "+",1, 1))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_noghtey2,weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 16)))}, "+",1, 1))),(Object)((weathernewact.mostCurrent._saelozahra._fontbold /*RemoteObject*/ .getObject())),(Object)(BA.numberCast(float.class, 18)),(Object)(BA.numberCast(int.class, ((int)0xff3a526a))),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Paint.Align"),RemoteObject.createImmutable("CENTER"))));
 BA.debugLineNum = 610;BA.debugLine="Dim rectTitleWidth As Float = Csv.MeasureStringW";
Debug.ShouldStop(2);
_recttitlewidth = _csv.runMethod(true,"MeasureStringWidth",(Object)(BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("title")))))),(Object)((weathernewact.mostCurrent._saelozahra._font /*RemoteObject*/ .getObject())),(Object)(BA.numberCast(float.class, 10)));Debug.locals.put("rectTitleWidth", _recttitlewidth);Debug.locals.put("rectTitleWidth", _recttitlewidth);
 BA.debugLineNum = 611;BA.debugLine="Dim rectTitle As Rect";
Debug.ShouldStop(4);
_recttitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper");Debug.locals.put("rectTitle", _recttitle);
 BA.debugLineNum = 612;BA.debugLine="rectTitle.Initialize((i*columnTool)+Nimcolumn-(r";
Debug.ShouldStop(8);
_recttitle.runVoidMethod ("Initialize",(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),_columntool}, "*",0, 1)),_nimcolumn,(RemoteObject.solve(new RemoteObject[] {_recttitlewidth,RemoteObject.createImmutable(2)}, "/",0, 0))}, "+-",2, 0))),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 210)))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),_columntool}, "*",0, 1)),_nimcolumn,(RemoteObject.solve(new RemoteObject[] {_recttitlewidth,RemoteObject.createImmutable(2)}, "/",0, 0))}, "++",2, 0))),(Object)(RemoteObject.solve(new RemoteObject[] {weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 217))),weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, _csv.runMethod(true,"MeasureStringHeight",(Object)(BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("title")))))),(Object)((weathernewact.mostCurrent._saelozahra._fontbold /*RemoteObject*/ .getObject())),(Object)(BA.numberCast(float.class, 13))))))}, "+",1, 1)));
 BA.debugLineNum = 613;BA.debugLine="Csv.DrawRect(rectTitle,Colors.Red,True,1dip)";
Debug.ShouldStop(16);
_csv.runVoidMethod ("DrawRect",(Object)((_recttitle.getObject())),(Object)(weathernewact.mostCurrent.__c.getField(false,"Colors").getField(true,"Red")),(Object)(weathernewact.mostCurrent.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 614;BA.debugLine="Csv.DrawText(M.Get(\"title\"),(i*columnTool)+Nimco";
Debug.ShouldStop(32);
_csv.runVoidMethod ("DrawText",weathernewact.mostCurrent.activityBA,(Object)(BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("title")))))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),_columntool}, "*",0, 1)),_nimcolumn}, "+",1, 1))),(Object)(BA.numberCast(float.class, weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 220))))),(Object)((weathernewact.mostCurrent._saelozahra._font /*RemoteObject*/ .getObject())),(Object)(BA.numberCast(float.class, 9)),(Object)(weathernewact.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Paint.Align"),RemoteObject.createImmutable("CENTER"))));
 BA.debugLineNum = 616;BA.debugLine="Dim imgRect As Rect";
Debug.ShouldStop(128);
_imgrect = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper");Debug.locals.put("imgRect", _imgrect);
 BA.debugLineNum = 617;BA.debugLine="imgRect.Initialize(i*columnTool+15dip,165dip,i*c";
Debug.ShouldStop(256);
_imgrect.runVoidMethod ("Initialize",(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),_columntool,weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 15)))}, "*+",1, 1)),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 165)))),(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),_columntool,weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60)))}, "*+",1, 1)),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 210)))));
 BA.debugLineNum = 619;BA.debugLine="Csv.DrawBitmap(SaeloZahra.FindWeatherImg(M.Get(\"";
Debug.ShouldStop(1024);
_csv.runVoidMethod ("DrawBitmap",(Object)((weathernewact.mostCurrent._saelozahra.runMethod(false,"_findweatherimg" /*RemoteObject*/ ,weathernewact.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, _m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("icon"))))))).runMethod(false,"Resize",(Object)(BA.numberCast(float.class, _columntool)),(Object)(BA.numberCast(float.class, _columntool)),(Object)(weathernewact.mostCurrent.__c.getField(true,"True"))).getObject())),(Object)((weathernewact.mostCurrent.__c.getField(false,"Null"))),(Object)((_imgrect.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 623;BA.debugLine="Return B1";
Debug.ShouldStop(16384);
if (true) return _b1;
 BA.debugLineNum = 625;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createsvglineview(RemoteObject _values) throws Exception{
try {
		Debug.PushSubsStack("CreateSvgLineView (weathernewact) ","weathernewact",10,weathernewact.mostCurrent.activityBA,weathernewact.mostCurrent,491);
if (RapidSub.canDelegate("createsvglineview")) { return ir.saelozahra.damaara.mazraeyeman.weathernewact.remoteMe.runUserSub(false, "weathernewact","createsvglineview", _values);}
RemoteObject _columntool = RemoteObject.createImmutable(0);
RemoteObject _nimcolumn = RemoteObject.createImmutable(0);
RemoteObject _noghtey = RemoteObject.createImmutable(0);
RemoteObject _noghteoldy = RemoteObject.createImmutable(0);
RemoteObject _arraynoghtey = null;
RemoteObject _b1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _csv = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper");
RemoteObject _listvals = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _m0 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _m1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _m2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _recttitlewidth = RemoteObject.createImmutable(0f);
RemoteObject _recttitle = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper");
RemoteObject _imgrect = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper");
Debug.locals.put("Values", _values);
 BA.debugLineNum = 491;BA.debugLine="Sub CreateSvgLineView(Values As List) As Bitmap";
Debug.ShouldStop(1024);
 BA.debugLineNum = 493;BA.debugLine="Dim columnTool As Int = 91%x/Values.Size";
Debug.ShouldStop(4096);
_columntool = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {weathernewact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 91)),weathernewact.mostCurrent.activityBA),_values.runMethod(true,"getSize")}, "/",0, 0));Debug.locals.put("columnTool", _columntool);Debug.locals.put("columnTool", _columntool);
 BA.debugLineNum = 494;BA.debugLine="Dim Nimcolumn As Int = columnTool/2";
Debug.ShouldStop(8192);
_nimcolumn = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_columntool,RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("Nimcolumn", _nimcolumn);Debug.locals.put("Nimcolumn", _nimcolumn);
 BA.debugLineNum = 495;BA.debugLine="Dim NoghteY,NoghteOldY As Int";
Debug.ShouldStop(16384);
_noghtey = RemoteObject.createImmutable(0);Debug.locals.put("NoghteY", _noghtey);
_noghteoldy = RemoteObject.createImmutable(0);Debug.locals.put("NoghteOldY", _noghteoldy);
 BA.debugLineNum = 496;BA.debugLine="Dim ArrayNoghteY(20) As Int";
Debug.ShouldStop(32768);
_arraynoghtey = RemoteObject.createNewArray ("int", new int[] {20}, new Object[]{});Debug.locals.put("ArrayNoghteY", _arraynoghtey);
 BA.debugLineNum = 497;BA.debugLine="Dim B1 As Bitmap";
Debug.ShouldStop(65536);
_b1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("B1", _b1);
 BA.debugLineNum = 498;BA.debugLine="B1.InitializeMutable(93%x,222dip)";
Debug.ShouldStop(131072);
_b1.runVoidMethod ("InitializeMutable",(Object)(weathernewact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 93)),weathernewact.mostCurrent.activityBA)),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 222)))));
 BA.debugLineNum = 500;BA.debugLine="Dim Csv As Canvas";
Debug.ShouldStop(524288);
_csv = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper");Debug.locals.put("Csv", _csv);
 BA.debugLineNum = 501;BA.debugLine="Csv.Initialize2(B1)";
Debug.ShouldStop(1048576);
_csv.runVoidMethod ("Initialize2",(Object)((_b1.getObject())));
 BA.debugLineNum = 502;BA.debugLine="Csv.DrawColor(Colors.White)";
Debug.ShouldStop(2097152);
_csv.runVoidMethod ("DrawColor",(Object)(weathernewact.mostCurrent.__c.getField(false,"Colors").getField(true,"White")));
 BA.debugLineNum = 504;BA.debugLine="Dim ListVals As List";
Debug.ShouldStop(8388608);
_listvals = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ListVals", _listvals);
 BA.debugLineNum = 505;BA.debugLine="ListVals.Initialize";
Debug.ShouldStop(16777216);
_listvals.runVoidMethod ("Initialize");
 BA.debugLineNum = 506;BA.debugLine="For i=0 To Values.Size-1";
Debug.ShouldStop(33554432);
{
final int step12 = 1;
final int limit12 = RemoteObject.solve(new RemoteObject[] {_values.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step12 > 0 && _i <= limit12) || (step12 < 0 && _i >= limit12) ;_i = ((int)(0 + _i + step12))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 507;BA.debugLine="Dim M0 As Map = Values.Get(i)";
Debug.ShouldStop(67108864);
_m0 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m0 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _values.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("M0", _m0);Debug.locals.put("M0", _m0);
 BA.debugLineNum = 508;BA.debugLine="ListVals.Add(M0.Get(\"value\"))";
Debug.ShouldStop(134217728);
_listvals.runVoidMethod ("Add",(Object)(_m0.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("value"))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 511;BA.debugLine="For i=0 To Values.Size-1";
Debug.ShouldStop(1073741824);
{
final int step16 = 1;
final int limit16 = RemoteObject.solve(new RemoteObject[] {_values.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step16 > 0 && _i <= limit16) || (step16 < 0 && _i >= limit16) ;_i = ((int)(0 + _i + step16))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 512;BA.debugLine="Dim M1 As Map = Values.Get(i)";
Debug.ShouldStop(-2147483648);
_m1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m1 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _values.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("M1", _m1);Debug.locals.put("M1", _m1);
 BA.debugLineNum = 514;BA.debugLine="NoghteY = BalaVaPainHesam(M1.Get(\"value\"),ListVa";
Debug.ShouldStop(2);
_noghtey = _balavapainhesam(BA.numberCast(int.class, _m1.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("value"))))),_listvals);Debug.locals.put("NoghteY", _noghtey);
 BA.debugLineNum = 515;BA.debugLine="ArrayNoghteY(i)=NoghteY";
Debug.ShouldStop(4);
_arraynoghtey.setArrayElement (_noghtey,BA.numberCast(int.class, _i));
 BA.debugLineNum = 516;BA.debugLine="If i>0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean(">",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 518;BA.debugLine="Csv.DrawLine( ((i-1)*columnTool)+Nimcolumn , No";
Debug.ShouldStop(32);
_csv.runVoidMethod ("DrawLine",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1)),_columntool}, "*",0, 1)),_nimcolumn}, "+",1, 1))),(Object)(BA.numberCast(float.class, _noghteoldy)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),_columntool}, "*",0, 1)),_nimcolumn}, "+",1, 1))),(Object)(BA.numberCast(float.class, _noghtey)),(Object)(BA.numberCast(int.class, ((int)0xff3a526a))),(Object)(BA.numberCast(float.class, weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 6))))));
 BA.debugLineNum = 519;BA.debugLine="NoghteOldY = NoghteY";
Debug.ShouldStop(64);
_noghteoldy = _noghtey;Debug.locals.put("NoghteOldY", _noghteoldy);
 }else {
 BA.debugLineNum = 521;BA.debugLine="NoghteOldY = NoghteY";
Debug.ShouldStop(256);
_noghteoldy = _noghtey;Debug.locals.put("NoghteOldY", _noghteoldy);
 };
 BA.debugLineNum = 523;BA.debugLine="Csv.DrawLine((i*columnTool)+Nimcolumn,NoghteY,(i";
Debug.ShouldStop(1024);
_csv.runVoidMethod ("DrawLine",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),_columntool}, "*",0, 1)),_nimcolumn}, "+",1, 1))),(Object)(BA.numberCast(float.class, _noghtey)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),_columntool}, "*",0, 1)),_nimcolumn}, "+",1, 1))),(Object)(BA.numberCast(float.class, weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 220))))),(Object)(BA.numberCast(int.class, ((int)0x80cccccc))),(Object)(BA.numberCast(float.class, weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 528;BA.debugLine="For i=0 To Values.Size-1";
Debug.ShouldStop(32768);
{
final int step28 = 1;
final int limit28 = RemoteObject.solve(new RemoteObject[] {_values.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step28 > 0 && _i <= limit28) || (step28 < 0 && _i >= limit28) ;_i = ((int)(0 + _i + step28))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 530;BA.debugLine="Dim M2 As Map = Values.Get(i)";
Debug.ShouldStop(131072);
_m2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m2 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _values.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("M2", _m2);Debug.locals.put("M2", _m2);
 BA.debugLineNum = 531;BA.debugLine="NoghteY = ArrayNoghteY(i)";
Debug.ShouldStop(262144);
_noghtey = _arraynoghtey.getArrayElement(true,BA.numberCast(int.class, _i));Debug.locals.put("NoghteY", _noghtey);
 BA.debugLineNum = 533;BA.debugLine="If M2.Get(\"title\")==\"S\" Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_m2.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("title")))),RemoteObject.createImmutable(("S")))) { 
 BA.debugLineNum = 534;BA.debugLine="M2.Put(\"title\",\"جنوب\")";
Debug.ShouldStop(2097152);
_m2.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("title"))),(Object)((RemoteObject.createImmutable("جنوب"))));
 }else 
{ BA.debugLineNum = 535;BA.debugLine="Else If M2.Get(\"title\")==\"N\" Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_m2.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("title")))),RemoteObject.createImmutable(("N")))) { 
 BA.debugLineNum = 536;BA.debugLine="M2.Put(\"title\",\"شمال\")";
Debug.ShouldStop(8388608);
_m2.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("title"))),(Object)((RemoteObject.createImmutable("شمال"))));
 }else 
{ BA.debugLineNum = 537;BA.debugLine="Else If M2.Get(\"title\")==\"W\" Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_m2.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("title")))),RemoteObject.createImmutable(("W")))) { 
 BA.debugLineNum = 538;BA.debugLine="M2.Put(\"title\",\"غرب\")";
Debug.ShouldStop(33554432);
_m2.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("title"))),(Object)((RemoteObject.createImmutable("غرب"))));
 }else 
{ BA.debugLineNum = 539;BA.debugLine="Else If M2.Get(\"title\")==\"E\" Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_m2.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("title")))),RemoteObject.createImmutable(("E")))) { 
 BA.debugLineNum = 540;BA.debugLine="M2.Put(\"title\",\"شرق\")";
Debug.ShouldStop(134217728);
_m2.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("title"))),(Object)((RemoteObject.createImmutable("شرق"))));
 }}}}
;
 BA.debugLineNum = 543;BA.debugLine="Csv.DrawCircle((i*columnTool)+Nimcolumn,NoghteY,";
Debug.ShouldStop(1073741824);
_csv.runVoidMethod ("DrawCircle",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),_columntool}, "*",0, 1)),_nimcolumn}, "+",1, 1))),(Object)(BA.numberCast(float.class, _noghtey)),(Object)(BA.numberCast(float.class, weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 9))))),(Object)(weathernewact.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(weathernewact.mostCurrent.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 544;BA.debugLine="Csv.DrawCircle((i*columnTool)+Nimcolumn,NoghteY,";
Debug.ShouldStop(-2147483648);
_csv.runVoidMethod ("DrawCircle",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),_columntool}, "*",0, 1)),_nimcolumn}, "+",1, 1))),(Object)(BA.numberCast(float.class, _noghtey)),(Object)(BA.numberCast(float.class, weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10))))),(Object)(weathernewact.mostCurrent._saelozahra._color /*RemoteObject*/ ),(Object)(weathernewact.mostCurrent.__c.getField(true,"False")),(Object)(BA.numberCast(float.class, weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4))))));
 BA.debugLineNum = 545;BA.debugLine="Csv.DrawText(M2.Get(\"value\"),(i*columnTool)+Nimc";
Debug.ShouldStop(1);
_csv.runVoidMethod ("DrawText",weathernewact.mostCurrent.activityBA,(Object)(BA.ObjectToString(_m2.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("value")))))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),_columntool}, "*",0, 1)),_nimcolumn}, "+",1, 1))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_noghtey,weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 18)))}, "-",1, 1))),(Object)((weathernewact.mostCurrent._saelozahra._fontbold /*RemoteObject*/ .getObject())),(Object)(BA.numberCast(float.class, 20)),(Object)(BA.numberCast(int.class, ((int)0xff3a526a))),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Paint.Align"),RemoteObject.createImmutable("CENTER"))));
 BA.debugLineNum = 547;BA.debugLine="Dim rectTitleWidth As Float = Csv.MeasureStringW";
Debug.ShouldStop(4);
_recttitlewidth = _csv.runMethod(true,"MeasureStringWidth",(Object)(BA.ObjectToString(_m2.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("title")))))),(Object)((weathernewact.mostCurrent._saelozahra._fontbold /*RemoteObject*/ .getObject())),(Object)(BA.numberCast(float.class, 12)));Debug.locals.put("rectTitleWidth", _recttitlewidth);Debug.locals.put("rectTitleWidth", _recttitlewidth);
 BA.debugLineNum = 548;BA.debugLine="If rectTitleWidth < 20dip Then rectTitleWidth =";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("<",_recttitlewidth,BA.numberCast(double.class, weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))))) { 
_recttitlewidth = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_recttitlewidth,weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8)))}, "+",1, 0));Debug.locals.put("rectTitleWidth", _recttitlewidth);};
 BA.debugLineNum = 550;BA.debugLine="Dim RectTitle As Rect";
Debug.ShouldStop(32);
_recttitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper");Debug.locals.put("RectTitle", _recttitle);
 BA.debugLineNum = 551;BA.debugLine="RectTitle.Initialize((i*columnTool)+Nimcolumn-(r";
Debug.ShouldStop(64);
_recttitle.runVoidMethod ("Initialize",(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),_columntool}, "*",0, 1)),_nimcolumn,(RemoteObject.solve(new RemoteObject[] {_recttitlewidth,RemoteObject.createImmutable(2)}, "/",0, 0))}, "+-",2, 0))),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 206)))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),_columntool}, "*",0, 1)),_nimcolumn,(RemoteObject.solve(new RemoteObject[] {_recttitlewidth,RemoteObject.createImmutable(2)}, "/",0, 0))}, "++",2, 0))),(Object)(RemoteObject.solve(new RemoteObject[] {weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 215))),weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, _csv.runMethod(true,"MeasureStringHeight",(Object)(BA.ObjectToString(_m2.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("title")))))),(Object)((weathernewact.mostCurrent._saelozahra._fontbold /*RemoteObject*/ .getObject())),(Object)(BA.numberCast(float.class, 11))))))}, "+",1, 1)));
 BA.debugLineNum = 552;BA.debugLine="Csv.DrawRect(RectTitle,Colors.Red,True,1dip)";
Debug.ShouldStop(128);
_csv.runVoidMethod ("DrawRect",(Object)((_recttitle.getObject())),(Object)(weathernewact.mostCurrent.__c.getField(false,"Colors").getField(true,"Red")),(Object)(weathernewact.mostCurrent.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 553;BA.debugLine="Csv.DrawText(M2.Get(\"title\"),(i*columnTool)+Nimc";
Debug.ShouldStop(256);
_csv.runVoidMethod ("DrawText",weathernewact.mostCurrent.activityBA,(Object)(BA.ObjectToString(_m2.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("title")))))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),_columntool}, "*",0, 1)),_nimcolumn}, "+",1, 1))),(Object)(BA.numberCast(float.class, weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 217))))),(Object)((weathernewact.mostCurrent._saelozahra._font /*RemoteObject*/ .getObject())),(Object)(BA.numberCast(float.class, 8)),(Object)(weathernewact.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Paint.Align"),RemoteObject.createImmutable("CENTER"))));
 BA.debugLineNum = 555;BA.debugLine="If Not(File.Exists(File.DirAssets,M2.Get(\"image\"";
Debug.ShouldStop(1024);
if (weathernewact.mostCurrent.__c.runMethod(true,"Not",(Object)(weathernewact.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(weathernewact.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString(_m2.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("image"))))))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 556;BA.debugLine="M2.Put(\"image\",\"1.png\")";
Debug.ShouldStop(2048);
_m2.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("image"))),(Object)((RemoteObject.createImmutable("1.png"))));
 };
 BA.debugLineNum = 559;BA.debugLine="Dim imgRect As Rect";
Debug.ShouldStop(16384);
_imgrect = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper");Debug.locals.put("imgRect", _imgrect);
 BA.debugLineNum = 560;BA.debugLine="imgRect.Initialize(i*columnTool-(Nimcolumn/2)+10";
Debug.ShouldStop(32768);
_imgrect.runVoidMethod ("Initialize",(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),_columntool,(RemoteObject.solve(new RemoteObject[] {_nimcolumn,RemoteObject.createImmutable(2)}, "/",0, 0)),weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "*-+",2, 0))),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 150)))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),_columntool,(RemoteObject.solve(new RemoteObject[] {_nimcolumn,RemoteObject.createImmutable(2)}, "/",0, 0)),weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60)))}, "*-+",2, 0))),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 200)))));
 BA.debugLineNum = 561;BA.debugLine="Csv.DrawBitmap(LoadBitmapSample(File.DirAssets,M";
Debug.ShouldStop(65536);
_csv.runVoidMethod ("DrawBitmap",(Object)((weathernewact.mostCurrent.__c.runMethod(false,"LoadBitmapSample",(Object)(weathernewact.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString(_m2.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("image")))))),(Object)(_columntool),(Object)(_columntool)).getObject())),(Object)((weathernewact.mostCurrent.__c.getField(false,"Null"))),(Object)((_imgrect.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 565;BA.debugLine="Return B1";
Debug.ShouldStop(1048576);
if (true) return _b1;
 BA.debugLineNum = 567;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createweatherpanel(RemoteObject _bit1,RemoteObject _titlestr) throws Exception{
try {
		Debug.PushSubsStack("CreateWeatherPanel (weathernewact) ","weathernewact",10,weathernewact.mostCurrent.activityBA,weathernewact.mostCurrent,414);
if (RapidSub.canDelegate("createweatherpanel")) { return ir.saelozahra.damaara.mazraeyeman.weathernewact.remoteMe.runUserSub(false, "weathernewact","createweatherpanel", _bit1, _titlestr);}
RemoteObject _cd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _p1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _headerlbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _iv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
Debug.locals.put("Bit1", _bit1);
Debug.locals.put("titleStr", _titlestr);
 BA.debugLineNum = 414;BA.debugLine="Sub CreateWeatherPanel(Bit1 As Bitmap,titleStr As";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 416;BA.debugLine="Dim CD As ColorDrawable";
Debug.ShouldStop(-2147483648);
_cd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("CD", _cd);
 BA.debugLineNum = 417;BA.debugLine="CD.Initialize(Colors.White,16dip)";
Debug.ShouldStop(1);
_cd.runVoidMethod ("Initialize",(Object)(weathernewact.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 16)))));
 BA.debugLineNum = 419;BA.debugLine="Dim P1 As Panel";
Debug.ShouldStop(4);
_p1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("P1", _p1);
 BA.debugLineNum = 420;BA.debugLine="P1.Initialize(\"P1\")";
Debug.ShouldStop(8);
_p1.runVoidMethod ("Initialize",weathernewact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("P1")));
 BA.debugLineNum = 422;BA.debugLine="P1.Elevation=8dip";
Debug.ShouldStop(32);
_p1.runMethod(true,"setElevation",BA.numberCast(float.class, weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8)))));
 BA.debugLineNum = 423;BA.debugLine="P1.Background=CD";
Debug.ShouldStop(64);
_p1.runMethod(false,"setBackground",(_cd.getObject()));
 BA.debugLineNum = 425;BA.debugLine="Dim HeaderLbl As Label";
Debug.ShouldStop(256);
_headerlbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("HeaderLbl", _headerlbl);
 BA.debugLineNum = 426;BA.debugLine="HeaderLbl.Initialize(\"\")";
Debug.ShouldStop(512);
_headerlbl.runVoidMethod ("Initialize",weathernewact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 427;BA.debugLine="HeaderLbl.Padding = Array As Int (14dip, 0, 14dip";
Debug.ShouldStop(1024);
_headerlbl.runMethod(false,"setPadding",RemoteObject.createNewArray("int",new int[] {4},new Object[] {weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 14))),BA.numberCast(int.class, 0),weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 14))),BA.numberCast(int.class, 0)}));
 BA.debugLineNum = 428;BA.debugLine="HeaderLbl.Gravity=Bit.Or(Gravity.CENTER_VERTICAL,";
Debug.ShouldStop(2048);
_headerlbl.runMethod(true,"setGravity",weathernewact.mostCurrent.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(weathernewact.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")),(Object)(weathernewact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT"))));
 BA.debugLineNum = 429;BA.debugLine="HeaderLbl.TextColor=Colors.White";
Debug.ShouldStop(4096);
_headerlbl.runMethod(true,"setTextColor",weathernewact.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 430;BA.debugLine="HeaderLbl.Color=SaeloZahra.Color";
Debug.ShouldStop(8192);
_headerlbl.runVoidMethod ("setColor",weathernewact.mostCurrent._saelozahra._color /*RemoteObject*/ );
 BA.debugLineNum = 431;BA.debugLine="HeaderLbl.Text=SaeloZahra.CSB(titleStr)";
Debug.ShouldStop(16384);
_headerlbl.runMethod(true,"setText",BA.ObjectToCharSequence(weathernewact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,weathernewact.mostCurrent.activityBA,(Object)(_titlestr)).getObject()));
 BA.debugLineNum = 432;BA.debugLine="P1.AddView(HeaderLbl,0,0,-1,50dip)";
Debug.ShouldStop(32768);
_p1.runVoidMethod ("AddView",(Object)((_headerlbl.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))));
 BA.debugLineNum = 434;BA.debugLine="Dim IV As ImageView";
Debug.ShouldStop(131072);
_iv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");Debug.locals.put("IV", _iv);
 BA.debugLineNum = 435;BA.debugLine="IV.Initialize(\"\")";
Debug.ShouldStop(262144);
_iv.runVoidMethod ("Initialize",weathernewact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 436;BA.debugLine="IV.Bitmap=Bit1";
Debug.ShouldStop(524288);
_iv.runMethod(false,"setBitmap",(_bit1.getObject()));
 BA.debugLineNum = 438;BA.debugLine="IV.Gravity=Gravity.FILL";
Debug.ShouldStop(2097152);
_iv.runMethod(true,"setGravity",weathernewact.mostCurrent.__c.getField(false,"Gravity").getField(true,"FILL"));
 BA.debugLineNum = 439;BA.debugLine="P1.AddView(IV,10dip, 50dip, -2, -2)";
Debug.ShouldStop(4194304);
_p1.runVoidMethod ("AddView",(Object)((_iv.getObject())),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))),(Object)(BA.numberCast(int.class, -(double) (0 + 2))),(Object)(BA.numberCast(int.class, -(double) (0 + 2))));
 BA.debugLineNum = 441;BA.debugLine="Return P1";
Debug.ShouldStop(16777216);
if (true) return _p1;
 BA.debugLineNum = 443;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createwvweatherpanel(RemoteObject _values,RemoteObject _titlestr) throws Exception{
try {
		Debug.PushSubsStack("CreateWVWeatherPanel (weathernewact) ","weathernewact",10,weathernewact.mostCurrent.activityBA,weathernewact.mostCurrent,447);
if (RapidSub.canDelegate("createwvweatherpanel")) { return ir.saelozahra.damaara.mazraeyeman.weathernewact.remoteMe.runUserSub(false, "weathernewact","createwvweatherpanel", _values, _titlestr);}
RemoteObject _cd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _p1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _headerlbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _html = RemoteObject.createImmutable("");
RemoteObject _wv1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.WebViewWrapper");
Debug.locals.put("Values", _values);
Debug.locals.put("titleStr", _titlestr);
 BA.debugLineNum = 447;BA.debugLine="Sub CreateWVWeatherPanel(Values As Map,titleStr As";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 449;BA.debugLine="Dim CD As ColorDrawable";
Debug.ShouldStop(1);
_cd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("CD", _cd);
 BA.debugLineNum = 450;BA.debugLine="CD.Initialize(Colors.White,16dip)";
Debug.ShouldStop(2);
_cd.runVoidMethod ("Initialize",(Object)(weathernewact.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 16)))));
 BA.debugLineNum = 452;BA.debugLine="Dim P1 As Panel";
Debug.ShouldStop(8);
_p1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("P1", _p1);
 BA.debugLineNum = 453;BA.debugLine="P1.Initialize(\"P1\")";
Debug.ShouldStop(16);
_p1.runVoidMethod ("Initialize",weathernewact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("P1")));
 BA.debugLineNum = 454;BA.debugLine="P1.Padding = Array As Int (0dip, 0dip, 0dip, 1dip";
Debug.ShouldStop(32);
_p1.runMethod(false,"setPadding",RemoteObject.createNewArray("int",new int[] {4},new Object[] {weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))),weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))),weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0))),weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))}));
 BA.debugLineNum = 456;BA.debugLine="P1.Elevation=8dip";
Debug.ShouldStop(128);
_p1.runMethod(true,"setElevation",BA.numberCast(float.class, weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8)))));
 BA.debugLineNum = 457;BA.debugLine="P1.Background=CD";
Debug.ShouldStop(256);
_p1.runMethod(false,"setBackground",(_cd.getObject()));
 BA.debugLineNum = 459;BA.debugLine="Dim HeaderLbl As Label";
Debug.ShouldStop(1024);
_headerlbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("HeaderLbl", _headerlbl);
 BA.debugLineNum = 460;BA.debugLine="HeaderLbl.Initialize(\"\")";
Debug.ShouldStop(2048);
_headerlbl.runVoidMethod ("Initialize",weathernewact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 461;BA.debugLine="HeaderLbl.Padding = Array As Int (14dip, 0, 14dip";
Debug.ShouldStop(4096);
_headerlbl.runMethod(false,"setPadding",RemoteObject.createNewArray("int",new int[] {4},new Object[] {weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 14))),BA.numberCast(int.class, 0),weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 14))),BA.numberCast(int.class, 0)}));
 BA.debugLineNum = 462;BA.debugLine="HeaderLbl.Gravity=Bit.Or(Gravity.CENTER_VERTICAL,";
Debug.ShouldStop(8192);
_headerlbl.runMethod(true,"setGravity",weathernewact.mostCurrent.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(weathernewact.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")),(Object)(weathernewact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT"))));
 BA.debugLineNum = 463;BA.debugLine="HeaderLbl.TextColor=Colors.White";
Debug.ShouldStop(16384);
_headerlbl.runMethod(true,"setTextColor",weathernewact.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 464;BA.debugLine="HeaderLbl.Color=SaeloZahra.Color";
Debug.ShouldStop(32768);
_headerlbl.runVoidMethod ("setColor",weathernewact.mostCurrent._saelozahra._color /*RemoteObject*/ );
 BA.debugLineNum = 465;BA.debugLine="HeaderLbl.Text =SaeloZahra.CSB(titleStr)";
Debug.ShouldStop(65536);
_headerlbl.runMethod(true,"setText",BA.ObjectToCharSequence(weathernewact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,weathernewact.mostCurrent.activityBA,(Object)(_titlestr)).getObject()));
 BA.debugLineNum = 466;BA.debugLine="P1.AddView(HeaderLbl,-2dip,0,93%x,50dip)'-1";
Debug.ShouldStop(131072);
_p1.runVoidMethod ("AddView",(Object)((_headerlbl.getObject())),(Object)(BA.numberCast(int.class, -(double) (0 + weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2))).<Integer>get().intValue()))),(Object)(BA.numberCast(int.class, 0)),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 93)),weathernewact.mostCurrent.activityBA)),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))));
 BA.debugLineNum = 467;BA.debugLine="Dim HTML As String = File.ReadString(File.DirAsse";
Debug.ShouldStop(262144);
_html = weathernewact.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(weathernewact.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("weatherPanelTop.html")));Debug.locals.put("HTML", _html);Debug.locals.put("HTML", _html);
 BA.debugLineNum = 474;BA.debugLine="HTML = HTML.Replace(\"//soratojahatebad//\",	SaeloZ";
Debug.ShouldStop(33554432);
_html = _html.runMethod(true,"replace",(Object)(BA.ObjectToString("//soratojahatebad//")),(Object)(weathernewact.mostCurrent._saelozahra.runMethod(true,"_convertpersian" /*RemoteObject*/ ,weathernewact.mostCurrent.activityBA,(Object)(BA.ObjectToString(_values.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("wind")))))))));Debug.locals.put("HTML", _html);
 BA.debugLineNum = 475;BA.debugLine="HTML = HTML.Replace(\"//miangineRotoobat//\",	Saelo";
Debug.ShouldStop(67108864);
_html = _html.runMethod(true,"replace",(Object)(BA.ObjectToString("//miangineRotoobat//")),(Object)(weathernewact.mostCurrent._saelozahra.runMethod(true,"_convertpersian" /*RemoteObject*/ ,weathernewact.mostCurrent.activityBA,(Object)(BA.ObjectToString(_values.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("humidity")))))))));Debug.locals.put("HTML", _html);
 BA.debugLineNum = 476;BA.debugLine="HTML = HTML.Replace(\"//DUPoint//\",			SaeloZahra.C";
Debug.ShouldStop(134217728);
_html = _html.runMethod(true,"replace",(Object)(BA.ObjectToString("//DUPoint//")),(Object)(weathernewact.mostCurrent._saelozahra.runMethod(true,"_convertpersian" /*RemoteObject*/ ,weathernewact.mostCurrent.activityBA,(Object)(BA.ObjectToString(_values.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("dupoint")))))))));Debug.locals.put("HTML", _html);
 BA.debugLineNum = 477;BA.debugLine="HTML = HTML.Replace(\"//baresh//\",			SaeloZahra.Co";
Debug.ShouldStop(268435456);
_html = _html.runMethod(true,"replace",(Object)(BA.ObjectToString("//baresh//")),(Object)(weathernewact.mostCurrent._saelozahra.runMethod(true,"_convertpersian" /*RemoteObject*/ ,weathernewact.mostCurrent.activityBA,(Object)(BA.ObjectToString(_values.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("rain")))))))));Debug.locals.put("HTML", _html);
 BA.debugLineNum = 478;BA.debugLine="HTML = HTML.Replace(\"//UVINDEX//\",			SaeloZahra.C";
Debug.ShouldStop(536870912);
_html = _html.runMethod(true,"replace",(Object)(BA.ObjectToString("//UVINDEX//")),(Object)(weathernewact.mostCurrent._saelozahra.runMethod(true,"_convertpersian" /*RemoteObject*/ ,weathernewact.mostCurrent.activityBA,(Object)(BA.ObjectToString(_values.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("uv")))))))));Debug.locals.put("HTML", _html);
 BA.debugLineNum = 479;BA.debugLine="HTML = HTML.Replace(\"//barf//\",				SaeloZahra.Con";
Debug.ShouldStop(1073741824);
_html = _html.runMethod(true,"replace",(Object)(BA.ObjectToString("//barf//")),(Object)(weathernewact.mostCurrent._saelozahra.runMethod(true,"_convertpersian" /*RemoteObject*/ ,weathernewact.mostCurrent.activityBA,(Object)(BA.ObjectToString(_values.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("snow")))))))));Debug.locals.put("HTML", _html);
 BA.debugLineNum = 481;BA.debugLine="Dim WV1 As WebView";
Debug.ShouldStop(1);
_wv1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");Debug.locals.put("WV1", _wv1);
 BA.debugLineNum = 482;BA.debugLine="WV1.Initialize(\"WV1\")";
Debug.ShouldStop(2);
_wv1.runVoidMethod ("Initialize",weathernewact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("WV1")));
 BA.debugLineNum = 483;BA.debugLine="WV1.Color=Colors.Transparent";
Debug.ShouldStop(4);
_wv1.runVoidMethod ("setColor",weathernewact.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 484;BA.debugLine="WV1.LoadHtml(HTML)";
Debug.ShouldStop(8);
_wv1.runVoidMethod ("LoadHtml",(Object)(_html));
 BA.debugLineNum = 485;BA.debugLine="P1.AddView(WV1,10dip, 50dip, -2, -2)";
Debug.ShouldStop(16);
_p1.runVoidMethod ("AddView",(Object)((_wv1.getObject())),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))),(Object)(BA.numberCast(int.class, -(double) (0 + 2))),(Object)(BA.numberCast(int.class, -(double) (0 + 2))));
 BA.debugLineNum = 487;BA.debugLine="Return P1";
Debug.ShouldStop(64);
if (true) return _p1;
 BA.debugLineNum = 489;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 10;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 12;BA.debugLine="Dim Config 	As Amir_SliderConfig";
weathernewact.mostCurrent._config = RemoteObject.createNew ("ir.aghajari.slider.Amir_SlisderConfig");
 //BA.debugLineNum = 13;BA.debugLine="Dim Show 	As Amir_SliderShow";
weathernewact.mostCurrent._show = RemoteObject.createNew ("ir.aghajari.slider.Amir_SliderShow");
 //BA.debugLineNum = 15;BA.debugLine="Dim X1 As XmlLayoutBuilder";
weathernewact.mostCurrent._x1 = RemoteObject.createNew ("anywheresoftware.b4a.object.XmlLayoutBuilder");
 //BA.debugLineNum = 16;BA.debugLine="Private ActionBar As ACToolBarLight";
weathernewact.mostCurrent._actionbar = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACToolbarLightWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private TabLayout As DSTabLayout";
weathernewact.mostCurrent._tablayout = RemoteObject.createNew ("de.amberhome.objects.TabLayoutWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private VP As AHViewPager";
weathernewact.mostCurrent._vp = RemoteObject.createNew ("de.amberhome.viewpager.AHViewPager");
 //BA.debugLineNum = 19;BA.debugLine="Dim PC As AHPageContainer";
weathernewact.mostCurrent._pc = RemoteObject.createNew ("de.amberhome.viewpager.AHPageContainer");
 //BA.debugLineNum = 20;BA.debugLine="Dim SV(6) As ScrollView";
weathernewact.mostCurrent._sv = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.ScrollViewWrapper", new int[] {6}, new Object[]{});
 //BA.debugLineNum = 22;BA.debugLine="Dim JobGetAmar As HttpJob";
weathernewact.mostCurrent._jobgetamar = RemoteObject.createNew ("ir.saelozahra.damaara.mazraeyeman.httpjob");
 //BA.debugLineNum = 23;BA.debugLine="Dim WindWeekList,TempWeekList,RainWeekList,SnowWe";
weathernewact.mostCurrent._windweeklist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
weathernewact.mostCurrent._tempweeklist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
weathernewact.mostCurrent._rainweeklist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
weathernewact.mostCurrent._snowweeklist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
weathernewact.mostCurrent._iceweeklist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
weathernewact.mostCurrent._humidityweeklist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 24;BA.debugLine="Dim WindMonthList,TempMonthList,RainMonthList,Sno";
weathernewact.mostCurrent._windmonthlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
weathernewact.mostCurrent._tempmonthlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
weathernewact.mostCurrent._rainmonthlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
weathernewact.mostCurrent._snowmonthlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
weathernewact.mostCurrent._icemonthlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
weathernewact.mostCurrent._humiditymonthlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 25;BA.debugLine="Dim WindYearList,TempYearList,RainYearList,SnowYe";
weathernewact.mostCurrent._windyearlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
weathernewact.mostCurrent._tempyearlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
weathernewact.mostCurrent._rainyearlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
weathernewact.mostCurrent._snowyearlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
weathernewact.mostCurrent._iceyearlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
weathernewact.mostCurrent._humidityyearlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("jobDone (weathernewact) ","weathernewact",10,weathernewact.mostCurrent.activityBA,weathernewact.mostCurrent,172);
if (RapidSub.canDelegate("jobdone")) { return ir.saelozahra.damaara.mazraeyeman.weathernewact.remoteMe.runUserSub(false, "weathernewact","jobdone", _job);}
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _roozeavval = RemoteObject.createImmutable(false);
RemoteObject _week = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colweek = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _p1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _p2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _p3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _p4 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _p5 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _p6 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _maptoday = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mounth = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colmounth = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _year = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _zouj = RemoteObject.createImmutable(false);
RemoteObject _colyear = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("job", _job);
 BA.debugLineNum = 172;BA.debugLine="Sub jobDone(job As HttpJob)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 174;BA.debugLine="LogColor(job.JobName&\"    ,    \"&job.Success,Colo";
Debug.ShouldStop(8192);
weathernewact.mostCurrent.__c.runVoidMethod ("LogImpl","413238274",RemoteObject.concat(_job.getField(true,"_jobname" /*RemoteObject*/ ),RemoteObject.createImmutable("    ,    "),_job.getField(true,"_success" /*RemoteObject*/ )),weathernewact.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 177;BA.debugLine="If job.Success Then";
Debug.ShouldStop(65536);
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 179;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(262144);
weathernewact.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 181;BA.debugLine="Select job.JobName";
Debug.ShouldStop(1048576);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("JobGetAmar"))) {
case 0: {
 BA.debugLineNum = 184;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(8388608);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 185;BA.debugLine="parser.Initialize(job.GetString)";
Debug.ShouldStop(16777216);
_parser.runVoidMethod ("Initialize",(Object)(_job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 186;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(33554432);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 194;BA.debugLine="WindWeekList.Initialize";
Debug.ShouldStop(2);
weathernewact.mostCurrent._windweeklist.runVoidMethod ("Initialize");
 BA.debugLineNum = 195;BA.debugLine="TempWeekList.Initialize";
Debug.ShouldStop(4);
weathernewact.mostCurrent._tempweeklist.runVoidMethod ("Initialize");
 BA.debugLineNum = 196;BA.debugLine="RainWeekList.Initialize";
Debug.ShouldStop(8);
weathernewact.mostCurrent._rainweeklist.runVoidMethod ("Initialize");
 BA.debugLineNum = 197;BA.debugLine="SnowWeekList.Initialize";
Debug.ShouldStop(16);
weathernewact.mostCurrent._snowweeklist.runVoidMethod ("Initialize");
 BA.debugLineNum = 198;BA.debugLine="IceWeekList.Initialize";
Debug.ShouldStop(32);
weathernewact.mostCurrent._iceweeklist.runVoidMethod ("Initialize");
 BA.debugLineNum = 199;BA.debugLine="HumidityWeekList.Initialize";
Debug.ShouldStop(64);
weathernewact.mostCurrent._humidityweeklist.runVoidMethod ("Initialize");
 BA.debugLineNum = 201;BA.debugLine="Dim roozeAvval As Boolean = True";
Debug.ShouldStop(256);
_roozeavval = weathernewact.mostCurrent.__c.getField(true,"True");Debug.locals.put("roozeAvval", _roozeavval);Debug.locals.put("roozeAvval", _roozeavval);
 BA.debugLineNum = 202;BA.debugLine="Dim week As List = root.Get(\"week\")";
Debug.ShouldStop(512);
_week = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_week = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("week")))));Debug.locals.put("week", _week);Debug.locals.put("week", _week);
 BA.debugLineNum = 203;BA.debugLine="For Each colweek As Map In week";
Debug.ShouldStop(1024);
_colweek = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group17 = _week;
final int groupLen17 = group17.runMethod(true,"getSize").<Integer>get()
;int index17 = 0;
;
for (; index17 < groupLen17;index17++){
_colweek = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group17.runMethod(false,"Get",index17));Debug.locals.put("colweek", _colweek);
Debug.locals.put("colweek", _colweek);
 BA.debugLineNum = 205;BA.debugLine="If roozeAvval Then";
Debug.ShouldStop(4096);
if (_roozeavval.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 217;BA.debugLine="roozeAvval=False";
Debug.ShouldStop(16777216);
_roozeavval = weathernewact.mostCurrent.__c.getField(true,"False");Debug.locals.put("roozeAvval", _roozeavval);
 };
 BA.debugLineNum = 220;BA.debugLine="TempWeekList.Add(	CreateMap(\"title\":colweek.G";
Debug.ShouldStop(134217728);
weathernewact.mostCurrent._tempweeklist.runVoidMethod ("Add",(Object)((weathernewact.mostCurrent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("title")),_colweek.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("title")))),RemoteObject.createImmutable(("value")),(weathernewact.mostCurrent._saelozahra.runMethod(true,"_parseint" /*RemoteObject*/ ,weathernewact.mostCurrent.activityBA,(Object)(BA.ObjectToString(_colweek.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("temp")))))))),RemoteObject.createImmutable(("image")),(RemoteObject.concat(_colweek.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("icon")))),RemoteObject.createImmutable(".png")))})).getObject())));
 BA.debugLineNum = 221;BA.debugLine="WindWeekList.Add(	CreateMap(\"title\":colweek.G";
Debug.ShouldStop(268435456);
weathernewact.mostCurrent._windweeklist.runVoidMethod ("Add",(Object)((weathernewact.mostCurrent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("title")),_colweek.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("title")))),RemoteObject.createImmutable(("value")),(weathernewact.mostCurrent._saelozahra.runMethod(true,"_parseint" /*RemoteObject*/ ,weathernewact.mostCurrent.activityBA,(Object)(BA.ObjectToString(_colweek.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("wind")))))))),RemoteObject.createImmutable(("image")),(RemoteObject.concat(_colweek.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("icon")))),RemoteObject.createImmutable(".png")))})).getObject())));
 BA.debugLineNum = 222;BA.debugLine="RainWeekList.Add(	CreateMap(\"title\":colweek.G";
Debug.ShouldStop(536870912);
weathernewact.mostCurrent._rainweeklist.runVoidMethod ("Add",(Object)((weathernewact.mostCurrent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("title")),_colweek.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("title")))),RemoteObject.createImmutable(("value")),(weathernewact.mostCurrent._saelozahra.runMethod(true,"_parseint" /*RemoteObject*/ ,weathernewact.mostCurrent.activityBA,(Object)(BA.ObjectToString(_colweek.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("rain")))))))),RemoteObject.createImmutable(("image")),(RemoteObject.concat(_colweek.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("icon")))),RemoteObject.createImmutable(".png")))})).getObject())));
 BA.debugLineNum = 223;BA.debugLine="SnowWeekList.Add(	CreateMap(\"title\":colweek.G";
Debug.ShouldStop(1073741824);
weathernewact.mostCurrent._snowweeklist.runVoidMethod ("Add",(Object)((weathernewact.mostCurrent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("title")),_colweek.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("title")))),RemoteObject.createImmutable(("value")),(weathernewact.mostCurrent._saelozahra.runMethod(true,"_parseint" /*RemoteObject*/ ,weathernewact.mostCurrent.activityBA,(Object)(BA.ObjectToString(_colweek.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("snow")))))))),RemoteObject.createImmutable(("image")),(RemoteObject.concat(_colweek.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("icon")))),RemoteObject.createImmutable(".png")))})).getObject())));
 BA.debugLineNum = 224;BA.debugLine="IceWeekList.Add(	CreateMap(\"title\":colweek.Ge";
Debug.ShouldStop(-2147483648);
weathernewact.mostCurrent._iceweeklist.runVoidMethod ("Add",(Object)((weathernewact.mostCurrent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("title")),_colweek.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("title")))),RemoteObject.createImmutable(("value")),(weathernewact.mostCurrent._saelozahra.runMethod(true,"_parseint" /*RemoteObject*/ ,weathernewact.mostCurrent.activityBA,(Object)(BA.ObjectToString(_colweek.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ice")))))))),RemoteObject.createImmutable(("image")),(RemoteObject.concat(_colweek.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("icon")))),RemoteObject.createImmutable(".png")))})).getObject())));
 BA.debugLineNum = 225;BA.debugLine="HumidityWeekList.Add(CreateMap(\"title\":colwee";
Debug.ShouldStop(1);
weathernewact.mostCurrent._humidityweeklist.runVoidMethod ("Add",(Object)((weathernewact.mostCurrent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("title")),_colweek.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("title")))),RemoteObject.createImmutable(("value")),(weathernewact.mostCurrent._saelozahra.runMethod(true,"_parseint" /*RemoteObject*/ ,weathernewact.mostCurrent.activityBA,(Object)(BA.ObjectToString(_colweek.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("humidity")))))))),RemoteObject.createImmutable(("image")),(RemoteObject.concat(_colweek.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("icon")))),RemoteObject.createImmutable(".png")))})).getObject())));
 }
}Debug.locals.put("colweek", _colweek);
;
 BA.debugLineNum = 237;BA.debugLine="Dim P1 As Panel = CreateWeatherPanel(CreateSvg";
Debug.ShouldStop(4096);
_p1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_p1 = _createweatherpanel(_createsvglineview(weathernewact.mostCurrent._tempweeklist),RemoteObject.createImmutable("نوسان دمای مزرعه شما در هفته گذشته"));Debug.locals.put("P1", _p1);Debug.locals.put("P1", _p1);
 BA.debugLineNum = 238;BA.debugLine="SV(2).Panel.AddView(P1, 20dip, 20dip, 90%x, 31";
Debug.ShouldStop(8192);
weathernewact.mostCurrent._sv.getArrayElement(false,BA.numberCast(int.class, 2)).runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((_p1.getObject())),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 90)),weathernewact.mostCurrent.activityBA)),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 313)))));
 BA.debugLineNum = 240;BA.debugLine="Dim P2 As Panel = CreateWeatherPanel(CreateSvg";
Debug.ShouldStop(32768);
_p2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_p2 = _createweatherpanel(_createsvglineview(weathernewact.mostCurrent._windweeklist),RemoteObject.createImmutable("وزش بــــــاد در هفته گذشته"));Debug.locals.put("P2", _p2);Debug.locals.put("P2", _p2);
 BA.debugLineNum = 241;BA.debugLine="SV(2).Panel.AddView(P2, 20dip, 353dip, 90%x, 3";
Debug.ShouldStop(65536);
weathernewact.mostCurrent._sv.getArrayElement(false,BA.numberCast(int.class, 2)).runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((_p2.getObject())),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 353)))),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 90)),weathernewact.mostCurrent.activityBA)),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 313)))));
 BA.debugLineNum = 243;BA.debugLine="Dim P3 As Panel = CreateWeatherPanel(CreateSvg";
Debug.ShouldStop(262144);
_p3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_p3 = _createweatherpanel(_createsvglineview(weathernewact.mostCurrent._humidityweeklist),RemoteObject.createImmutable("میانگین رطـــــــوبت مزرعه شما"));Debug.locals.put("P3", _p3);Debug.locals.put("P3", _p3);
 BA.debugLineNum = 244;BA.debugLine="SV(2).Panel.AddView(P3, 20dip, 706dip, 90%x, 3";
Debug.ShouldStop(524288);
weathernewact.mostCurrent._sv.getArrayElement(false,BA.numberCast(int.class, 2)).runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((_p3.getObject())),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 706)))),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 90)),weathernewact.mostCurrent.activityBA)),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 313)))));
 BA.debugLineNum = 246;BA.debugLine="Dim P4 As Panel = CreateWeatherPanel(CreateSvg";
Debug.ShouldStop(2097152);
_p4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_p4 = _createweatherpanel(_createsvglineview(weathernewact.mostCurrent._rainweeklist),RemoteObject.createImmutable("وضعیت بارنـــــــدگی مزرعه شما"));Debug.locals.put("P4", _p4);Debug.locals.put("P4", _p4);
 BA.debugLineNum = 247;BA.debugLine="SV(2).Panel.AddView(P4, 20dip, 1059dip, 90%x,";
Debug.ShouldStop(4194304);
weathernewact.mostCurrent._sv.getArrayElement(false,BA.numberCast(int.class, 2)).runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((_p4.getObject())),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1059)))),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 90)),weathernewact.mostCurrent.activityBA)),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 313)))));
 BA.debugLineNum = 249;BA.debugLine="Dim P5 As Panel = CreateWeatherPanel(CreateSvg";
Debug.ShouldStop(16777216);
_p5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_p5 = _createweatherpanel(_createsvglineview(weathernewact.mostCurrent._snowweeklist),RemoteObject.createImmutable("بارش بــــرف در مزرعه شما"));Debug.locals.put("P5", _p5);Debug.locals.put("P5", _p5);
 BA.debugLineNum = 250;BA.debugLine="SV(2).Panel.AddView(P5, 20dip, 1412dip, 90%x,";
Debug.ShouldStop(33554432);
weathernewact.mostCurrent._sv.getArrayElement(false,BA.numberCast(int.class, 2)).runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((_p5.getObject())),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1412)))),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 90)),weathernewact.mostCurrent.activityBA)),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 313)))));
 BA.debugLineNum = 252;BA.debugLine="Dim P6 As Panel = CreateWeatherPanel(CreateSvg";
Debug.ShouldStop(134217728);
_p6 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_p6 = _createweatherpanel(_createsvglineview(weathernewact.mostCurrent._iceweeklist),RemoteObject.createImmutable("وضعیت یخ زدگی در مزرعه شما"));Debug.locals.put("P6", _p6);Debug.locals.put("P6", _p6);
 BA.debugLineNum = 253;BA.debugLine="SV(2).Panel.AddView(P6, 20dip, 1765dip, 90%x,";
Debug.ShouldStop(268435456);
weathernewact.mostCurrent._sv.getArrayElement(false,BA.numberCast(int.class, 2)).runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((_p6.getObject())),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1765)))),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 90)),weathernewact.mostCurrent.activityBA)),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 313)))));
 BA.debugLineNum = 255;BA.debugLine="SV(2).Panel.Height = P6.Top + P6.Height + 72di";
Debug.ShouldStop(1073741824);
weathernewact.mostCurrent._sv.getArrayElement(false,BA.numberCast(int.class, 2)).runMethod(false,"getPanel").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {_p6.runMethod(true,"getTop"),_p6.runMethod(true,"getHeight"),weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 72)))}, "++",2, 1));
 BA.debugLineNum = 271;BA.debugLine="Dim P1 As Panel' = CreateWeatherPanel(CreateSv";
Debug.ShouldStop(16384);
_p1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("P1", _p1);
 BA.debugLineNum = 272;BA.debugLine="P1.Initialize(\"\")";
Debug.ShouldStop(32768);
_p1.runVoidMethod ("Initialize",weathernewact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 273;BA.debugLine="Dim mapToday As Map = CreateMap(\"humidity\":Hom";
Debug.ShouldStop(65536);
_maptoday = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_maptoday = weathernewact.mostCurrent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("humidity")),(weathernewact.mostCurrent._homeact._relativehumidity /*RemoteObject*/ ),RemoteObject.createImmutable(("wind")),(weathernewact.mostCurrent._homeact._windspeedvalue /*RemoteObject*/ ),RemoteObject.createImmutable(("snow")),(weathernewact.mostCurrent._homeact._snowvalue /*RemoteObject*/ ),RemoteObject.createImmutable(("uv")),(weathernewact.mostCurrent._homeact._uvindex /*RemoteObject*/ ),RemoteObject.createImmutable(("rain")),(weathernewact.mostCurrent._homeact._rainvalue /*RemoteObject*/ ),RemoteObject.createImmutable(("dupoint")),(weathernewact.mostCurrent._homeact._dewpointvalue /*RemoteObject*/ )}));Debug.locals.put("mapToday", _maptoday);Debug.locals.put("mapToday", _maptoday);
 BA.debugLineNum = 274;BA.debugLine="P1 = CreateWVWeatherPanel(mapToday,\"وضعیت آب و";
Debug.ShouldStop(131072);
_p1 = _createwvweatherpanel(_maptoday,RemoteObject.createImmutable("وضعیت آب و هـــــــــــــــوای مزرعـــــه شما"));Debug.locals.put("P1", _p1);
 BA.debugLineNum = 275;BA.debugLine="SV(1).Panel.AddView(P1, 20dip, 20dip, 90%x, 31";
Debug.ShouldStop(262144);
weathernewact.mostCurrent._sv.getArrayElement(false,BA.numberCast(int.class, 1)).runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((_p1.getObject())),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 90)),weathernewact.mostCurrent.activityBA)),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 313)))));
 BA.debugLineNum = 277;BA.debugLine="Dim P2 As Panel = CreateWeatherPanel(CreateSvg";
Debug.ShouldStop(1048576);
_p2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_p2 = _createweatherpanel(_createsvglineview(weathernewact.mostCurrent._homeact._next12hdamaha /*RemoteObject*/ ),RemoteObject.createImmutable("نوســــــان دمای امروز مزرعـــــه شما"));Debug.locals.put("P2", _p2);Debug.locals.put("P2", _p2);
 BA.debugLineNum = 278;BA.debugLine="SV(1).Panel.AddView(P2, 20dip, 358dip, 90%x, 3";
Debug.ShouldStop(2097152);
weathernewact.mostCurrent._sv.getArrayElement(false,BA.numberCast(int.class, 1)).runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((_p2.getObject())),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 358)))),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 90)),weathernewact.mostCurrent.activityBA)),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 313)))));
 BA.debugLineNum = 280;BA.debugLine="Dim P3 As Panel = CreateWeatherPanel(CreateSvg";
Debug.ShouldStop(8388608);
_p3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_p3 = _createweatherpanel(_createsvglineview(weathernewact.mostCurrent._homeact._next12hwindha /*RemoteObject*/ ),RemoteObject.createImmutable("وضعیت وزش باد امروز مزرعـــــه شما"));Debug.locals.put("P3", _p3);Debug.locals.put("P3", _p3);
 BA.debugLineNum = 281;BA.debugLine="SV(1).Panel.AddView(P3, 20dip, 702dip, 90%x, 3";
Debug.ShouldStop(16777216);
weathernewact.mostCurrent._sv.getArrayElement(false,BA.numberCast(int.class, 1)).runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((_p3.getObject())),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 702)))),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 90)),weathernewact.mostCurrent.activityBA)),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 313)))));
 BA.debugLineNum = 286;BA.debugLine="SV(1).Panel.Height = P3.Top + P3.Height + 72di";
Debug.ShouldStop(536870912);
weathernewact.mostCurrent._sv.getArrayElement(false,BA.numberCast(int.class, 1)).runMethod(false,"getPanel").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {_p3.runMethod(true,"getTop"),_p3.runMethod(true,"getHeight"),weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 72)))}, "++",2, 1));
 BA.debugLineNum = 299;BA.debugLine="TempMonthList.Initialize";
Debug.ShouldStop(1024);
weathernewact.mostCurrent._tempmonthlist.runVoidMethod ("Initialize");
 BA.debugLineNum = 300;BA.debugLine="HumidityMonthList.Initialize";
Debug.ShouldStop(2048);
weathernewact.mostCurrent._humiditymonthlist.runVoidMethod ("Initialize");
 BA.debugLineNum = 301;BA.debugLine="WindMonthList.Initialize";
Debug.ShouldStop(4096);
weathernewact.mostCurrent._windmonthlist.runVoidMethod ("Initialize");
 BA.debugLineNum = 302;BA.debugLine="RainMonthList.Initialize";
Debug.ShouldStop(8192);
weathernewact.mostCurrent._rainmonthlist.runVoidMethod ("Initialize");
 BA.debugLineNum = 303;BA.debugLine="SnowMonthList.Initialize";
Debug.ShouldStop(16384);
weathernewact.mostCurrent._snowmonthlist.runVoidMethod ("Initialize");
 BA.debugLineNum = 304;BA.debugLine="IceMonthList.Initialize";
Debug.ShouldStop(32768);
weathernewact.mostCurrent._icemonthlist.runVoidMethod ("Initialize");
 BA.debugLineNum = 306;BA.debugLine="Dim mounth As List = root.Get(\"mounth\")";
Debug.ShouldStop(131072);
_mounth = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_mounth = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("mounth")))));Debug.locals.put("mounth", _mounth);Debug.locals.put("mounth", _mounth);
 BA.debugLineNum = 307;BA.debugLine="For Each colmounth As Map In mounth";
Debug.ShouldStop(262144);
_colmounth = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group58 = _mounth;
final int groupLen58 = group58.runMethod(true,"getSize").<Integer>get()
;int index58 = 0;
;
for (; index58 < groupLen58;index58++){
_colmounth = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group58.runMethod(false,"Get",index58));Debug.locals.put("colmounth", _colmounth);
Debug.locals.put("colmounth", _colmounth);
 BA.debugLineNum = 308;BA.debugLine="TempMonthList.Add(CreateMap(\"title\":colmounth";
Debug.ShouldStop(524288);
weathernewact.mostCurrent._tempmonthlist.runVoidMethod ("Add",(Object)((weathernewact.mostCurrent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("title")),_colmounth.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("title")))),RemoteObject.createImmutable(("value")),(weathernewact.mostCurrent._saelozahra.runMethod(true,"_parseint" /*RemoteObject*/ ,weathernewact.mostCurrent.activityBA,(Object)(BA.ObjectToString(_colmounth.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("temp_amar_month")))))))),RemoteObject.createImmutable(("image")),(RemoteObject.concat(_colmounth.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("icon")))),RemoteObject.createImmutable(".png")))})).getObject())));
 BA.debugLineNum = 309;BA.debugLine="HumidityMonthList.Add(CreateMap(\"title\":colmo";
Debug.ShouldStop(1048576);
weathernewact.mostCurrent._humiditymonthlist.runVoidMethod ("Add",(Object)((weathernewact.mostCurrent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("title")),_colmounth.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("title")))),RemoteObject.createImmutable(("value")),(weathernewact.mostCurrent._saelozahra.runMethod(true,"_parseint" /*RemoteObject*/ ,weathernewact.mostCurrent.activityBA,(Object)(BA.ObjectToString(_colmounth.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("humidity_amar_month")))))))),RemoteObject.createImmutable(("image")),(RemoteObject.concat(_colmounth.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("icon")))),RemoteObject.createImmutable(".png")))})).getObject())));
 BA.debugLineNum = 310;BA.debugLine="WindMonthList.Add(CreateMap(\"title\":colmounth";
Debug.ShouldStop(2097152);
weathernewact.mostCurrent._windmonthlist.runVoidMethod ("Add",(Object)((weathernewact.mostCurrent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("title")),_colmounth.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("title")))),RemoteObject.createImmutable(("value")),(weathernewact.mostCurrent._saelozahra.runMethod(true,"_parseint" /*RemoteObject*/ ,weathernewact.mostCurrent.activityBA,(Object)(BA.ObjectToString(_colmounth.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("wind_amar_month")))))))),RemoteObject.createImmutable(("image")),(RemoteObject.concat(_colmounth.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("icon")))),RemoteObject.createImmutable(".png")))})).getObject())));
 BA.debugLineNum = 311;BA.debugLine="RainMonthList.Add(CreateMap(\"title\":colmounth";
Debug.ShouldStop(4194304);
weathernewact.mostCurrent._rainmonthlist.runVoidMethod ("Add",(Object)((weathernewact.mostCurrent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("title")),_colmounth.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("title")))),RemoteObject.createImmutable(("value")),(weathernewact.mostCurrent._saelozahra.runMethod(true,"_parseint" /*RemoteObject*/ ,weathernewact.mostCurrent.activityBA,(Object)(BA.ObjectToString(_colmounth.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("rain_amar_month")))))))),RemoteObject.createImmutable(("image")),(RemoteObject.concat(_colmounth.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("icon")))),RemoteObject.createImmutable(".png")))})).getObject())));
 BA.debugLineNum = 312;BA.debugLine="SnowMonthList.Add(CreateMap(\"title\":colmounth";
Debug.ShouldStop(8388608);
weathernewact.mostCurrent._snowmonthlist.runVoidMethod ("Add",(Object)((weathernewact.mostCurrent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("title")),_colmounth.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("title")))),RemoteObject.createImmutable(("value")),(weathernewact.mostCurrent._saelozahra.runMethod(true,"_parseint" /*RemoteObject*/ ,weathernewact.mostCurrent.activityBA,(Object)(BA.ObjectToString(_colmounth.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("snow_amar_month")))))))),RemoteObject.createImmutable(("image")),(RemoteObject.concat(_colmounth.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("icon")))),RemoteObject.createImmutable(".png")))})).getObject())));
 BA.debugLineNum = 313;BA.debugLine="IceMonthList.Add(CreateMap(\"title\":colmounth.";
Debug.ShouldStop(16777216);
weathernewact.mostCurrent._icemonthlist.runVoidMethod ("Add",(Object)((weathernewact.mostCurrent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("title")),_colmounth.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("title")))),RemoteObject.createImmutable(("value")),(weathernewact.mostCurrent._saelozahra.runMethod(true,"_parseint" /*RemoteObject*/ ,weathernewact.mostCurrent.activityBA,(Object)(BA.ObjectToString(_colmounth.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ice_amar_month")))))))),RemoteObject.createImmutable(("image")),(RemoteObject.concat(_colmounth.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("icon")))),RemoteObject.createImmutable(".png")))})).getObject())));
 }
}Debug.locals.put("colmounth", _colmounth);
;
 BA.debugLineNum = 319;BA.debugLine="Dim P1 As Panel = CreateWeatherPanel(CreateSvg";
Debug.ShouldStop(1073741824);
_p1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_p1 = _createweatherpanel(_createsvglineview(weathernewact.mostCurrent._tempmonthlist),RemoteObject.createImmutable("نوسان دمای مزرعه شما در ماه گذشته"));Debug.locals.put("P1", _p1);Debug.locals.put("P1", _p1);
 BA.debugLineNum = 320;BA.debugLine="SV(3).Panel.AddView(P1, 20dip, 20dip, 90%x, 31";
Debug.ShouldStop(-2147483648);
weathernewact.mostCurrent._sv.getArrayElement(false,BA.numberCast(int.class, 3)).runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((_p1.getObject())),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 90)),weathernewact.mostCurrent.activityBA)),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 313)))));
 BA.debugLineNum = 322;BA.debugLine="Dim P2 As Panel = CreateWeatherPanel(CreateSvg";
Debug.ShouldStop(2);
_p2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_p2 = _createweatherpanel(_createsvglineview(weathernewact.mostCurrent._humiditymonthlist),RemoteObject.createImmutable("میانگین رطـــــــوبت مزرعه شما"));Debug.locals.put("P2", _p2);Debug.locals.put("P2", _p2);
 BA.debugLineNum = 323;BA.debugLine="SV(3).Panel.AddView(P2, 20dip, 353dip, 90%x, 3";
Debug.ShouldStop(4);
weathernewact.mostCurrent._sv.getArrayElement(false,BA.numberCast(int.class, 3)).runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((_p2.getObject())),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 353)))),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 90)),weathernewact.mostCurrent.activityBA)),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 313)))));
 BA.debugLineNum = 325;BA.debugLine="Dim P3 As Panel = CreateWeatherPanel(CreateSvg";
Debug.ShouldStop(16);
_p3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_p3 = _createweatherpanel(_createsvglineview(weathernewact.mostCurrent._windmonthlist),RemoteObject.createImmutable("وضعیت وزش بــــــاد در مزرعه شما"));Debug.locals.put("P3", _p3);Debug.locals.put("P3", _p3);
 BA.debugLineNum = 326;BA.debugLine="SV(3).Panel.AddView(P3, 20dip, 706dip, 90%x, 3";
Debug.ShouldStop(32);
weathernewact.mostCurrent._sv.getArrayElement(false,BA.numberCast(int.class, 3)).runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((_p3.getObject())),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 706)))),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 90)),weathernewact.mostCurrent.activityBA)),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 313)))));
 BA.debugLineNum = 328;BA.debugLine="Dim P4 As Panel = CreateWeatherPanel(CreateSvg";
Debug.ShouldStop(128);
_p4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_p4 = _createweatherpanel(_createsvglineview(weathernewact.mostCurrent._rainmonthlist),RemoteObject.createImmutable("وضعیت بارنـــــــدگی مزرعه شما"));Debug.locals.put("P4", _p4);Debug.locals.put("P4", _p4);
 BA.debugLineNum = 329;BA.debugLine="SV(3).Panel.AddView(P4, 20dip, 1059dip, 90%x,";
Debug.ShouldStop(256);
weathernewact.mostCurrent._sv.getArrayElement(false,BA.numberCast(int.class, 3)).runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((_p4.getObject())),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1059)))),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 90)),weathernewact.mostCurrent.activityBA)),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 313)))));
 BA.debugLineNum = 331;BA.debugLine="Dim P5 As Panel = CreateWeatherPanel(CreateSvg";
Debug.ShouldStop(1024);
_p5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_p5 = _createweatherpanel(_createsvglineview(weathernewact.mostCurrent._snowmonthlist),RemoteObject.createImmutable("بارش بــــرف در مزرعه شما"));Debug.locals.put("P5", _p5);Debug.locals.put("P5", _p5);
 BA.debugLineNum = 332;BA.debugLine="SV(3).Panel.AddView(P5, 20dip, 1412dip, 90%x,";
Debug.ShouldStop(2048);
weathernewact.mostCurrent._sv.getArrayElement(false,BA.numberCast(int.class, 3)).runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((_p5.getObject())),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1412)))),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 90)),weathernewact.mostCurrent.activityBA)),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 313)))));
 BA.debugLineNum = 334;BA.debugLine="Dim P6 As Panel = CreateWeatherPanel(CreateSvg";
Debug.ShouldStop(8192);
_p6 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_p6 = _createweatherpanel(_createsvglineview(weathernewact.mostCurrent._icemonthlist),RemoteObject.createImmutable("وضعیت یخ زدگی در مزرعه شما"));Debug.locals.put("P6", _p6);Debug.locals.put("P6", _p6);
 BA.debugLineNum = 335;BA.debugLine="SV(3).Panel.AddView(P6, 20dip, 1765dip, 90%x,";
Debug.ShouldStop(16384);
weathernewact.mostCurrent._sv.getArrayElement(false,BA.numberCast(int.class, 3)).runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((_p6.getObject())),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1765)))),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 90)),weathernewact.mostCurrent.activityBA)),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 313)))));
 BA.debugLineNum = 337;BA.debugLine="SV(3).Panel.Height = P6.Top + P6.Height + 72di";
Debug.ShouldStop(65536);
weathernewact.mostCurrent._sv.getArrayElement(false,BA.numberCast(int.class, 3)).runMethod(false,"getPanel").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {_p6.runMethod(true,"getTop"),_p6.runMethod(true,"getHeight"),weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 72)))}, "++",2, 1));
 BA.debugLineNum = 346;BA.debugLine="WindYearList.Initialize";
Debug.ShouldStop(33554432);
weathernewact.mostCurrent._windyearlist.runVoidMethod ("Initialize");
 BA.debugLineNum = 347;BA.debugLine="TempYearList.Initialize";
Debug.ShouldStop(67108864);
weathernewact.mostCurrent._tempyearlist.runVoidMethod ("Initialize");
 BA.debugLineNum = 348;BA.debugLine="RainYearList.Initialize";
Debug.ShouldStop(134217728);
weathernewact.mostCurrent._rainyearlist.runVoidMethod ("Initialize");
 BA.debugLineNum = 349;BA.debugLine="SnowYearList.Initialize";
Debug.ShouldStop(268435456);
weathernewact.mostCurrent._snowyearlist.runVoidMethod ("Initialize");
 BA.debugLineNum = 350;BA.debugLine="IceYearList.Initialize";
Debug.ShouldStop(536870912);
weathernewact.mostCurrent._iceyearlist.runVoidMethod ("Initialize");
 BA.debugLineNum = 351;BA.debugLine="HumidityYearList.Initialize";
Debug.ShouldStop(1073741824);
weathernewact.mostCurrent._humidityyearlist.runVoidMethod ("Initialize");
 BA.debugLineNum = 354;BA.debugLine="Dim year As List = root.Get(\"year\")";
Debug.ShouldStop(2);
_year = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_year = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("year")))));Debug.locals.put("year", _year);Debug.locals.put("year", _year);
 BA.debugLineNum = 355;BA.debugLine="Dim Zouj As Boolean = True";
Debug.ShouldStop(4);
_zouj = weathernewact.mostCurrent.__c.getField(true,"True");Debug.locals.put("Zouj", _zouj);Debug.locals.put("Zouj", _zouj);
 BA.debugLineNum = 356;BA.debugLine="For Each colyear As Map In year";
Debug.ShouldStop(8);
_colyear = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group87 = _year;
final int groupLen87 = group87.runMethod(true,"getSize").<Integer>get()
;int index87 = 0;
;
for (; index87 < groupLen87;index87++){
_colyear = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group87.runMethod(false,"Get",index87));Debug.locals.put("colyear", _colyear);
Debug.locals.put("colyear", _colyear);
 BA.debugLineNum = 357;BA.debugLine="If Zouj Then Zouj = False Else Zouj = True";
Debug.ShouldStop(16);
if (_zouj.<Boolean>get().booleanValue()) { 
_zouj = weathernewact.mostCurrent.__c.getField(true,"False");Debug.locals.put("Zouj", _zouj);}
else {
_zouj = weathernewact.mostCurrent.__c.getField(true,"True");Debug.locals.put("Zouj", _zouj);};
 BA.debugLineNum = 358;BA.debugLine="If Zouj Then Continue";
Debug.ShouldStop(32);
if (_zouj.<Boolean>get().booleanValue()) { 
if (true) continue;};
 BA.debugLineNum = 360;BA.debugLine="WindYearList.Add(CreateMap(\"title\":	colyear.G";
Debug.ShouldStop(128);
weathernewact.mostCurrent._windyearlist.runVoidMethod ("Add",(Object)((weathernewact.mostCurrent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("title")),_colyear.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("title")))),RemoteObject.createImmutable(("value")),(weathernewact.mostCurrent._saelozahra.runMethod(true,"_parseint" /*RemoteObject*/ ,weathernewact.mostCurrent.activityBA,(Object)(BA.ObjectToString(_colyear.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("wind_amar_year")))))))),RemoteObject.createImmutable(("image")),(RemoteObject.concat(_colyear.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("icon")))),RemoteObject.createImmutable(".png")))})).getObject())));
 BA.debugLineNum = 361;BA.debugLine="TempYearList.Add(CreateMap(\"title\":	colyear.G";
Debug.ShouldStop(256);
weathernewact.mostCurrent._tempyearlist.runVoidMethod ("Add",(Object)((weathernewact.mostCurrent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("title")),_colyear.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("title")))),RemoteObject.createImmutable(("value")),(weathernewact.mostCurrent._saelozahra.runMethod(true,"_parseint" /*RemoteObject*/ ,weathernewact.mostCurrent.activityBA,(Object)(BA.ObjectToString(_colyear.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("temp_amar_year")))))))),RemoteObject.createImmutable(("image")),(RemoteObject.concat(_colyear.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("icon")))),RemoteObject.createImmutable(".png")))})).getObject())));
 BA.debugLineNum = 362;BA.debugLine="RainYearList.Add(CreateMap(\"title\":	colyear.G";
Debug.ShouldStop(512);
weathernewact.mostCurrent._rainyearlist.runVoidMethod ("Add",(Object)((weathernewact.mostCurrent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("title")),_colyear.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("title")))),RemoteObject.createImmutable(("value")),(weathernewact.mostCurrent._saelozahra.runMethod(true,"_parseint" /*RemoteObject*/ ,weathernewact.mostCurrent.activityBA,(Object)(BA.ObjectToString(_colyear.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("rain_amar_year")))))))),RemoteObject.createImmutable(("image")),(RemoteObject.concat(_colyear.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("icon")))),RemoteObject.createImmutable(".png")))})).getObject())));
 BA.debugLineNum = 363;BA.debugLine="SnowYearList.Add(CreateMap(\"title\":	colyear.G";
Debug.ShouldStop(1024);
weathernewact.mostCurrent._snowyearlist.runVoidMethod ("Add",(Object)((weathernewact.mostCurrent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("title")),_colyear.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("title")))),RemoteObject.createImmutable(("value")),(weathernewact.mostCurrent._saelozahra.runMethod(true,"_parseint" /*RemoteObject*/ ,weathernewact.mostCurrent.activityBA,(Object)(BA.ObjectToString(_colyear.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("snow_amar_year")))))))),RemoteObject.createImmutable(("image")),(RemoteObject.concat(_colyear.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("icon")))),RemoteObject.createImmutable(".png")))})).getObject())));
 BA.debugLineNum = 364;BA.debugLine="IceYearList.Add( CreateMap(\"title\":	colyear.G";
Debug.ShouldStop(2048);
weathernewact.mostCurrent._iceyearlist.runVoidMethod ("Add",(Object)((weathernewact.mostCurrent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("title")),_colyear.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("title")))),RemoteObject.createImmutable(("value")),(weathernewact.mostCurrent._saelozahra.runMethod(true,"_parseint" /*RemoteObject*/ ,weathernewact.mostCurrent.activityBA,(Object)(BA.ObjectToString(_colyear.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ice_amar_year")))))))),RemoteObject.createImmutable(("image")),(RemoteObject.concat(_colyear.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("icon")))),RemoteObject.createImmutable(".png")))})).getObject())));
 BA.debugLineNum = 365;BA.debugLine="HumidityYearList.Add(CreateMap(\"title\":colyea";
Debug.ShouldStop(4096);
weathernewact.mostCurrent._humidityyearlist.runVoidMethod ("Add",(Object)((weathernewact.mostCurrent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("title")),_colyear.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("title")))),RemoteObject.createImmutable(("value")),(weathernewact.mostCurrent._saelozahra.runMethod(true,"_parseint" /*RemoteObject*/ ,weathernewact.mostCurrent.activityBA,(Object)(BA.ObjectToString(_colyear.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("humidity_amar_year")))))))),RemoteObject.createImmutable(("image")),(RemoteObject.concat(_colyear.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("icon")))),RemoteObject.createImmutable(".png")))})).getObject())));
 }
}Debug.locals.put("colyear", _colyear);
;
 BA.debugLineNum = 373;BA.debugLine="Dim P1 As Panel = CreateWeatherPanel(CreateSvg";
Debug.ShouldStop(1048576);
_p1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_p1 = _createweatherpanel(_createsvglineview(weathernewact.mostCurrent._tempyearlist),RemoteObject.createImmutable("نوسان دمای مزرعه شما در ماه گذشته"));Debug.locals.put("P1", _p1);Debug.locals.put("P1", _p1);
 BA.debugLineNum = 374;BA.debugLine="SV(4).Panel.AddView(P1, 20dip, 20dip, 90%x, 31";
Debug.ShouldStop(2097152);
weathernewact.mostCurrent._sv.getArrayElement(false,BA.numberCast(int.class, 4)).runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((_p1.getObject())),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 90)),weathernewact.mostCurrent.activityBA)),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 313)))));
 BA.debugLineNum = 376;BA.debugLine="Dim P2 As Panel = CreateWeatherPanel(CreateSvg";
Debug.ShouldStop(8388608);
_p2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_p2 = _createweatherpanel(_createsvglineview(weathernewact.mostCurrent._humidityyearlist),RemoteObject.createImmutable("میانگین رطـــــــوبت مزرعه شما"));Debug.locals.put("P2", _p2);Debug.locals.put("P2", _p2);
 BA.debugLineNum = 377;BA.debugLine="SV(4).Panel.AddView(P2, 20dip, 353dip, 90%x, 3";
Debug.ShouldStop(16777216);
weathernewact.mostCurrent._sv.getArrayElement(false,BA.numberCast(int.class, 4)).runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((_p2.getObject())),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 353)))),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 90)),weathernewact.mostCurrent.activityBA)),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 313)))));
 BA.debugLineNum = 379;BA.debugLine="Dim P3 As Panel = CreateWeatherPanel(CreateSvg";
Debug.ShouldStop(67108864);
_p3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_p3 = _createweatherpanel(_createsvglineview(weathernewact.mostCurrent._windyearlist),RemoteObject.createImmutable("وضعیت وزش بــــــاد در مزرعه شما"));Debug.locals.put("P3", _p3);Debug.locals.put("P3", _p3);
 BA.debugLineNum = 380;BA.debugLine="SV(4).Panel.AddView(P3, 20dip, 706dip, 90%x, 3";
Debug.ShouldStop(134217728);
weathernewact.mostCurrent._sv.getArrayElement(false,BA.numberCast(int.class, 4)).runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((_p3.getObject())),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 706)))),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 90)),weathernewact.mostCurrent.activityBA)),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 313)))));
 BA.debugLineNum = 382;BA.debugLine="Dim P4 As Panel = CreateWeatherPanel(CreateSvg";
Debug.ShouldStop(536870912);
_p4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_p4 = _createweatherpanel(_createsvglineview(weathernewact.mostCurrent._rainyearlist),RemoteObject.createImmutable("وضعیت بارنـــــــدگی مزرعه شما"));Debug.locals.put("P4", _p4);Debug.locals.put("P4", _p4);
 BA.debugLineNum = 383;BA.debugLine="SV(4).Panel.AddView(P4, 20dip, 1059dip, 90%x,";
Debug.ShouldStop(1073741824);
weathernewact.mostCurrent._sv.getArrayElement(false,BA.numberCast(int.class, 4)).runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((_p4.getObject())),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1059)))),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 90)),weathernewact.mostCurrent.activityBA)),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 313)))));
 BA.debugLineNum = 385;BA.debugLine="Dim P5 As Panel = CreateWeatherPanel(CreateSvg";
Debug.ShouldStop(1);
_p5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_p5 = _createweatherpanel(_createsvglineview(weathernewact.mostCurrent._snowyearlist),RemoteObject.createImmutable("بارش بــــرف در مزرعه شما"));Debug.locals.put("P5", _p5);Debug.locals.put("P5", _p5);
 BA.debugLineNum = 386;BA.debugLine="SV(4).Panel.AddView(P5, 20dip, 1412dip, 90%x,";
Debug.ShouldStop(2);
weathernewact.mostCurrent._sv.getArrayElement(false,BA.numberCast(int.class, 4)).runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((_p5.getObject())),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1412)))),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 90)),weathernewact.mostCurrent.activityBA)),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 313)))));
 BA.debugLineNum = 388;BA.debugLine="Dim P6 As Panel = CreateWeatherPanel(CreateSvg";
Debug.ShouldStop(8);
_p6 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_p6 = _createweatherpanel(_createsvglineview(weathernewact.mostCurrent._iceyearlist),RemoteObject.createImmutable("وضعیت یخ زدگی در مزرعه شما"));Debug.locals.put("P6", _p6);Debug.locals.put("P6", _p6);
 BA.debugLineNum = 389;BA.debugLine="SV(4).Panel.AddView(P6, 20dip, 1765dip, 90%x,";
Debug.ShouldStop(16);
weathernewact.mostCurrent._sv.getArrayElement(false,BA.numberCast(int.class, 4)).runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((_p6.getObject())),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1765)))),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 90)),weathernewact.mostCurrent.activityBA)),(Object)(weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 313)))));
 BA.debugLineNum = 391;BA.debugLine="SV(4).Panel.Height = P6.Top + P6.Height + 72di";
Debug.ShouldStop(64);
weathernewact.mostCurrent._sv.getArrayElement(false,BA.numberCast(int.class, 4)).runMethod(false,"getPanel").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {_p6.runMethod(true,"getTop"),_p6.runMethod(true,"getHeight"),weathernewact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 72)))}, "++",2, 1));
 break; }
}
;
 }else {
 BA.debugLineNum = 398;BA.debugLine="If job.ErrorMessage.Contains(\"allowed number of";
Debug.ShouldStop(8192);
if (_job.getField(true,"_errormessage" /*RemoteObject*/ ).runMethod(true,"contains",(Object)(RemoteObject.createImmutable("allowed number of requests"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 399;BA.debugLine="VP.GotoPage(1,True)";
Debug.ShouldStop(16384);
weathernewact.mostCurrent._vp.runVoidMethodAndSync ("GotoPage",(Object)(BA.numberCast(int.class, 1)),(Object)(weathernewact.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 400;BA.debugLine="ToastMessageShow(SaeloZahra.CSB(\"سقف مرور روزان";
Debug.ShouldStop(32768);
weathernewact.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(weathernewact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,weathernewact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("سقف مرور روزانه نرم افزار تکمیل شده"))).getObject())),(Object)(weathernewact.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 403;BA.debugLine="LogColor(job.ErrorMessage,Colors.Red)";
Debug.ShouldStop(262144);
weathernewact.mostCurrent.__c.runVoidMethod ("LogImpl","413238503",_job.getField(true,"_errormessage" /*RemoteObject*/ ),weathernewact.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"));
 };
 BA.debugLineNum = 407;BA.debugLine="job.Release";
Debug.ShouldStop(4194304);
_job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 409;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}