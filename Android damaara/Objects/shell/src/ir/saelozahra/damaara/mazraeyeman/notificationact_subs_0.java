package ir.saelozahra.damaara.mazraeyeman;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class notificationact_subs_0 {


public static RemoteObject  _actionbar_navigationitemclick() throws Exception{
try {
		Debug.PushSubsStack("Actionbar_NavigationItemClick (notificationact) ","notificationact",9,notificationact.mostCurrent.activityBA,notificationact.mostCurrent,226);
if (RapidSub.canDelegate("actionbar_navigationitemclick")) { return ir.saelozahra.damaara.mazraeyeman.notificationact.remoteMe.runUserSub(false, "notificationact","actionbar_navigationitemclick");}
 BA.debugLineNum = 226;BA.debugLine="Sub Actionbar_NavigationItemClick";
Debug.ShouldStop(2);
 BA.debugLineNum = 227;BA.debugLine="Activity.Finish";
Debug.ShouldStop(4);
notificationact.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 228;BA.debugLine="SaeloZahra.SetAnimation(\"zoom_enter\",\"zoom_exit\")";
Debug.ShouldStop(8);
notificationact.mostCurrent._saelozahra.runVoidMethod ("_setanimation" /*RemoteObject*/ ,notificationact.mostCurrent.activityBA,(Object)(BA.ObjectToString("zoom_enter")),(Object)(RemoteObject.createImmutable("zoom_exit")));
 BA.debugLineNum = 229;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("Activity_Create (notificationact) ","notificationact",9,notificationact.mostCurrent.activityBA,notificationact.mostCurrent,34);
if (RapidSub.canDelegate("activity_create")) { return ir.saelozahra.damaara.mazraeyeman.notificationact.remoteMe.runUserSub(false, "notificationact","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 34;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(2);
 BA.debugLineNum = 36;BA.debugLine="css_start	= \"<html><body style='white-space: pre-";
Debug.ShouldStop(8);
notificationact.mostCurrent._css_start = BA.ObjectToString("<html><body style='white-space: pre-wrap;box-sizing: border-box; padding:2%; margin: auto;text-align: right; width:100%;max-width:100%;direction:rtl;line-height:1.4;font-family:samim;font-size:110%;color:#777;'>           <style>@import url(https://cdn.jsdelivr.net/gh/rastikerdar/samim-font@v4.0.5/dist/font-face.css); h1{font-size:130%;margin:3% auto;} hr, .hr {background: rgba(0, 0, 0, 0) url('file:///android_asset/sp.png') repeat-x scroll center center; border: 0 none;clear: both;height: 19px;margin: 8px auto;width: 100%;} a{color:#111;font-weight: bold;} .img{max-width:100%;}</style>       <pre style='white-space: pre-wrap;width:100%;font-family:Samim;'>");
 BA.debugLineNum = 37;BA.debugLine="css_end		= \"</pre><br style='clear:both;' > </bod";
Debug.ShouldStop(16);
notificationact.mostCurrent._css_end = BA.ObjectToString("</pre><br style='clear:both;' > </body></html>");
 BA.debugLineNum = 40;BA.debugLine="Activity.LoadLayout(\"TabNewlayout\")";
Debug.ShouldStop(128);
notificationact.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("TabNewlayout")),notificationact.mostCurrent.activityBA);
 BA.debugLineNum = 42;BA.debugLine="Actionbar.Title=SaeloZahra.CSB(\"اطلاعیـــــــــه";
Debug.ShouldStop(512);
notificationact.mostCurrent._actionbar.runMethod(true,"setTitle",BA.ObjectToCharSequence(notificationact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,notificationact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("اطلاعیـــــــــه ها"))).getObject()));
 BA.debugLineNum = 43;BA.debugLine="Actionbar.TitleTextColor=Colors.White";
Debug.ShouldStop(1024);
notificationact.mostCurrent._actionbar.runVoidMethod ("setTitleTextColor",notificationact.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 44;BA.debugLine="Actionbar.NavigationIconDrawable = X1.GetDrawable";
Debug.ShouldStop(2048);
notificationact.mostCurrent._actionbar.runMethod(false,"setNavigationIconDrawable",notificationact.mostCurrent._x1.runMethod(false,"GetDrawable",(Object)(RemoteObject.createImmutable("baseline_arrow_back_white_24"))));
 BA.debugLineNum = 45;BA.debugLine="Actionbar.Color=SaeloZahra.Color";
Debug.ShouldStop(4096);
notificationact.mostCurrent._actionbar.runVoidMethod ("setColor",notificationact.mostCurrent._saelozahra._color /*RemoteObject*/ );
 BA.debugLineNum = 49;BA.debugLine="SvAlert.Initialize(1000dip)";
Debug.ShouldStop(65536);
notificationact.mostCurrent._svalert.runVoidMethod ("Initialize",notificationact.mostCurrent.activityBA,(Object)(notificationact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1000)))));
 BA.debugLineNum = 50;BA.debugLine="SvNotif.Initialize(1000dip)";
Debug.ShouldStop(131072);
notificationact.mostCurrent._svnotif.runVoidMethod ("Initialize",notificationact.mostCurrent.activityBA,(Object)(notificationact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1000)))));
 BA.debugLineNum = 54;BA.debugLine="If File.Exists(SaeloZahra.dir,\"db.db\") = False Th";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",notificationact.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(notificationact.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("db.db"))),notificationact.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 55;BA.debugLine="File.Copy(File.DirAssets,\"db.db\",SaeloZahra.dir,";
Debug.ShouldStop(4194304);
notificationact.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(notificationact.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("db.db")),(Object)(notificationact.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("db.db")));
 };
 BA.debugLineNum = 59;BA.debugLine="If sql1.IsInitialized = False Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",notificationact._sql1.runMethod(true,"IsInitialized"),notificationact.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 60;BA.debugLine="sql1.Initialize(SaeloZahra.dir,\"db.db\",False)";
Debug.ShouldStop(134217728);
notificationact._sql1.runVoidMethod ("Initialize",(Object)(notificationact.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(BA.ObjectToString("db.db")),(Object)(notificationact.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 64;BA.debugLine="SaeloZahra.SetStatusBarColor(SaeloZahra.ColorDark";
Debug.ShouldStop(-2147483648);
notificationact.mostCurrent._saelozahra.runVoidMethod ("_setstatusbarcolor" /*RemoteObject*/ ,notificationact.mostCurrent.activityBA,(Object)(notificationact.mostCurrent._saelozahra._colordark /*RemoteObject*/ ));
 BA.debugLineNum = 67;BA.debugLine="PC.Initialize";
Debug.ShouldStop(4);
notificationact.mostCurrent._pc.runVoidMethod ("Initialize",notificationact.mostCurrent.activityBA);
 BA.debugLineNum = 68;BA.debugLine="TabLayout.SetTabTextColors(0x7FFFFFFF,Colors.Whit";
Debug.ShouldStop(8);
notificationact.mostCurrent._tablayout.runVoidMethod ("SetTabTextColors",(Object)(BA.numberCast(int.class, ((int)0x7fffffff))),(Object)(notificationact.mostCurrent.__c.getField(false,"Colors").getField(true,"White")));
 BA.debugLineNum = 69;BA.debugLine="TabLayout.TabIndicatorColor=Colors.White";
Debug.ShouldStop(16);
notificationact.mostCurrent._tablayout.runVoidMethod ("setTabIndicatorColor",notificationact.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 73;BA.debugLine="PC.AddPage(SvNotif, SaeloZahra.csb(\"اطلاعیــــه ه";
Debug.ShouldStop(256);
notificationact.mostCurrent._pc.runVoidMethod ("AddPage",(Object)((notificationact.mostCurrent._svnotif.getObject())),(Object)(BA.ObjectToString(notificationact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,notificationact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("اطلاعیــــه ها"))))));
 BA.debugLineNum = 74;BA.debugLine="PC.AddPage(SvAlert, SaeloZahra.csb(\"گزارش وضعیت و";
Debug.ShouldStop(512);
notificationact.mostCurrent._pc.runVoidMethod ("AddPage",(Object)((notificationact.mostCurrent._svalert.getObject())),(Object)(BA.ObjectToString(notificationact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,notificationact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("گزارش وضعیت و هشدار"))))));
 BA.debugLineNum = 76;BA.debugLine="VP.PageContainer = PC";
Debug.ShouldStop(2048);
notificationact.mostCurrent._vp.runVoidMethod ("setPageContainer",notificationact.mostCurrent._pc);
 BA.debugLineNum = 78;BA.debugLine="TabLayout.Color = Colors.Transparent";
Debug.ShouldStop(8192);
notificationact.mostCurrent._tablayout.runVoidMethod ("setColor",notificationact.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 79;BA.debugLine="TabLayout.TabMode=TabLayout.MODE_FIXED";
Debug.ShouldStop(16384);
notificationact.mostCurrent._tablayout.runMethod(true,"setTabMode",notificationact.mostCurrent._tablayout.getField(true,"MODE_FIXED"));
 BA.debugLineNum = 81;BA.debugLine="TabLayout.SetViewPager(VP)";
Debug.ShouldStop(65536);
notificationact.mostCurrent._tablayout.runVoidMethod ("SetViewPager",(Object)((notificationact.mostCurrent._vp.getObject())));
 BA.debugLineNum = 82;BA.debugLine="Actionbar.SetLayout(0,0,100%x,SaeloZahra.Material";
Debug.ShouldStop(131072);
notificationact.mostCurrent._actionbar.runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(notificationact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),notificationact.mostCurrent.activityBA)),(Object)(notificationact.mostCurrent._saelozahra._materialactionbarheight /*RemoteObject*/ ));
 BA.debugLineNum = 83;BA.debugLine="TabLayout.SetLayout(0,Actionbar.Top+Actionbar.Hei";
Debug.ShouldStop(262144);
notificationact.mostCurrent._tablayout.runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {notificationact.mostCurrent._actionbar.runMethod(true,"getTop"),notificationact.mostCurrent._actionbar.runMethod(true,"getHeight")}, "+",1, 1)),(Object)(notificationact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),notificationact.mostCurrent.activityBA)),(Object)(notificationact.mostCurrent._saelozahra._materialactionbarheight /*RemoteObject*/ ));
 BA.debugLineNum = 84;BA.debugLine="VP.SetLayout(0,TabLayout.Top+TabLayout.Height,100";
Debug.ShouldStop(524288);
notificationact.mostCurrent._vp.runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {notificationact.mostCurrent._tablayout.runMethod(true,"getTop"),notificationact.mostCurrent._tablayout.runMethod(true,"getHeight")}, "+",1, 1)),(Object)(notificationact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),notificationact.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {notificationact.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),notificationact.mostCurrent.activityBA),(RemoteObject.solve(new RemoteObject[] {notificationact.mostCurrent._saelozahra._materialactionbarheight /*RemoteObject*/ ,RemoteObject.createImmutable(2)}, "*",0, 1))}, "-",1, 1)));
 BA.debugLineNum = 86;BA.debugLine="TabLayout.SetTabIcon(0,X1.GetDrawable(\"baseline_s";
Debug.ShouldStop(2097152);
notificationact.mostCurrent._tablayout.runVoidMethod ("SetTabIcon",(Object)(BA.numberCast(int.class, 0)),(Object)(notificationact.mostCurrent._x1.runMethod(false,"GetDrawable",(Object)(RemoteObject.createImmutable("baseline_sentiment_satisfied_alt_white_24")))));
 BA.debugLineNum = 87;BA.debugLine="TabLayout.SetTabIcon(1,X1.GetDrawable(\"baseline_a";
Debug.ShouldStop(4194304);
notificationact.mostCurrent._tablayout.runVoidMethod ("SetTabIcon",(Object)(BA.numberCast(int.class, 1)),(Object)(notificationact.mostCurrent._x1.runMethod(false,"GetDrawable",(Object)(RemoteObject.createImmutable("baseline_all_inclusive_white_24")))));
 BA.debugLineNum = 88;BA.debugLine="TabLayout.Color=SaeloZahra.Color";
Debug.ShouldStop(8388608);
notificationact.mostCurrent._tablayout.runVoidMethod ("setColor",notificationact.mostCurrent._saelozahra._color /*RemoteObject*/ );
 BA.debugLineNum = 90;BA.debugLine="LoadMsgs";
Debug.ShouldStop(33554432);
_loadmsgs();
 BA.debugLineNum = 93;BA.debugLine="If SaeloZahra.P.SdkVersion>23 Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean(">",notificationact.mostCurrent._saelozahra._p /*RemoteObject*/ .runMethod(true,"getSdkVersion"),BA.numberCast(double.class, 23))) { 
 BA.debugLineNum = 94;BA.debugLine="Config.Initialize";
Debug.ShouldStop(536870912);
notificationact.mostCurrent._config.runVoidMethod ("Initialize",notificationact.processBA);
 BA.debugLineNum = 95;BA.debugLine="Config.position(Config.POSITION_LEFT)";
Debug.ShouldStop(1073741824);
notificationact.mostCurrent._config.runVoidMethod ("position",(Object)(notificationact.mostCurrent._config.getField(true,"POSITION_LEFT")));
 BA.debugLineNum = 96;BA.debugLine="Config.primaryColor(SaeloZahra.ColorDark)";
Debug.ShouldStop(-2147483648);
notificationact.mostCurrent._config.runVoidMethod ("primaryColor",(Object)(notificationact.mostCurrent._saelozahra._colordark /*RemoteObject*/ ));
 BA.debugLineNum = 97;BA.debugLine="Config.edge(True)";
Debug.ShouldStop(1);
notificationact.mostCurrent._config.runVoidMethod ("edge",(Object)(notificationact.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 98;BA.debugLine="Config.sensitivity(100)";
Debug.ShouldStop(2);
notificationact.mostCurrent._config.runVoidMethod ("sensitivity",(Object)(BA.numberCast(float.class, 100)));
 BA.debugLineNum = 99;BA.debugLine="Config.scrimColor(Colors.ARGB(180,0,0,0))";
Debug.ShouldStop(4);
notificationact.mostCurrent._config.runVoidMethod ("scrimColor",(Object)(notificationact.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 180)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))));
 BA.debugLineNum = 101;BA.debugLine="Show.convertActivityToTranslucent";
Debug.ShouldStop(16);
notificationact.mostCurrent._show.runVoidMethod ("convertActivityToTranslucent",notificationact.mostCurrent.activityBA);
 BA.debugLineNum = 102;BA.debugLine="Show.attachActivity(Config)";
Debug.ShouldStop(32);
notificationact.mostCurrent._show.runVoidMethod ("attachActivity",notificationact.mostCurrent.activityBA,(Object)(notificationact.mostCurrent._config));
 };
 BA.debugLineNum = 104;BA.debugLine="VP.GotoPage(1,True)";
Debug.ShouldStop(128);
notificationact.mostCurrent._vp.runVoidMethodAndSync ("GotoPage",(Object)(BA.numberCast(int.class, 1)),(Object)(notificationact.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 105;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("Activity_KeyPress (notificationact) ","notificationact",9,notificationact.mostCurrent.activityBA,notificationact.mostCurrent,232);
if (RapidSub.canDelegate("activity_keypress")) { return ir.saelozahra.damaara.mazraeyeman.notificationact.remoteMe.runUserSub(false, "notificationact","activity_keypress", _keycode);}
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 232;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(128);
 BA.debugLineNum = 233;BA.debugLine="If KeyCode==KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, notificationact.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 234;BA.debugLine="Actionbar_NavigationItemClick";
Debug.ShouldStop(512);
_actionbar_navigationitemclick();
 BA.debugLineNum = 235;BA.debugLine="Return False";
Debug.ShouldStop(1024);
if (true) return notificationact.mostCurrent.__c.getField(true,"False");
 }else {
 BA.debugLineNum = 237;BA.debugLine="Return True";
Debug.ShouldStop(4096);
if (true) return notificationact.mostCurrent.__c.getField(true,"True");
 };
 BA.debugLineNum = 239;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("Activity_Pause (notificationact) ","notificationact",9,notificationact.mostCurrent.activityBA,notificationact.mostCurrent,219);
if (RapidSub.canDelegate("activity_pause")) { return ir.saelozahra.damaara.mazraeyeman.notificationact.remoteMe.runUserSub(false, "notificationact","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 219;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 220;BA.debugLine="If cu1.IsInitialized Then cu1.Close";
Debug.ShouldStop(134217728);
if (notificationact._cu1.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
notificationact._cu1.runVoidMethod ("Close");};
 BA.debugLineNum = 221;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("Activity_Resume (notificationact) ","notificationact",9,notificationact.mostCurrent.activityBA,notificationact.mostCurrent,145);
if (RapidSub.canDelegate("activity_resume")) { return ir.saelozahra.damaara.mazraeyeman.notificationact.remoteMe.runUserSub(false, "notificationact","activity_resume");}
RemoteObject _in1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.IntentWrapper");
int _i = 0;
 BA.debugLineNum = 145;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(65536);
 BA.debugLineNum = 148;BA.debugLine="Dim in1 As Intent";
Debug.ShouldStop(524288);
_in1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");Debug.locals.put("in1", _in1);
 BA.debugLineNum = 150;BA.debugLine="in1 = Activity.GetStartingIntent";
Debug.ShouldStop(2097152);
_in1 = notificationact.mostCurrent._activity.runMethod(false,"GetStartingIntent");Debug.locals.put("in1", _in1);
 BA.debugLineNum = 151;BA.debugLine="If in1.HasExtra(\"Notification_Tag\") Then";
Debug.ShouldStop(4194304);
if (_in1.runMethod(true,"HasExtra",(Object)(RemoteObject.createImmutable("Notification_Tag"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 152;BA.debugLine="Log(in1.GetExtra(\"Notification_Tag\")) 'Will log";
Debug.ShouldStop(8388608);
notificationact.mostCurrent.__c.runVoidMethod ("LogImpl","412189703",BA.ObjectToString(_in1.runMethod(false,"GetExtra",(Object)(RemoteObject.createImmutable("Notification_Tag")))),0);
 BA.debugLineNum = 153;BA.debugLine="If SaeloZahra.Debug Then ToastMessageShow(in1.Ge";
Debug.ShouldStop(16777216);
if (notificationact.mostCurrent._saelozahra._debug /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
notificationact.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(_in1.runMethod(false,"GetExtra",(Object)(RemoteObject.createImmutable("Notification_Tag"))))),(Object)(notificationact.mostCurrent.__c.getField(true,"True")));};
 }else {
 };
 BA.debugLineNum = 158;BA.debugLine="If in1.HasExtra(\"Notification_Tag\") Then";
Debug.ShouldStop(536870912);
if (_in1.runMethod(true,"HasExtra",(Object)(RemoteObject.createImmutable("Notification_Tag"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 162;BA.debugLine="cu1 = sql1.ExecQuery(\"SELECT * FROM notification";
Debug.ShouldStop(2);
notificationact._cu1 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), notificationact._sql1.runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM notification ORDER BY id DESC limit 1"))));
 BA.debugLineNum = 165;BA.debugLine="For i = 0 To cu1.RowCount-1";
Debug.ShouldStop(16);
{
final int step10 = 1;
final int limit10 = RemoteObject.solve(new RemoteObject[] {notificationact._cu1.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step10 > 0 && _i <= limit10) || (step10 < 0 && _i >= limit10) ;_i = ((int)(0 + _i + step10))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 167;BA.debugLine="cu1.Position = i";
Debug.ShouldStop(64);
notificationact._cu1.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 169;BA.debugLine="type_str = cu1.GetString(\"type\")";
Debug.ShouldStop(256);
notificationact._type_str = notificationact._cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("type")));
 BA.debugLineNum = 172;BA.debugLine="If type_str == \"telegram\" Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",notificationact._type_str,BA.ObjectToString("telegram"))) { 
 BA.debugLineNum = 173;BA.debugLine="Activity.Finish";
Debug.ShouldStop(4096);
notificationact.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 174;BA.debugLine="open_telegram(cu1.GetString(\"value\"))";
Debug.ShouldStop(8192);
_open_telegram(notificationact._cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("value"))));
 };
 BA.debugLineNum = 177;BA.debugLine="If type_str == \"url\" Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",notificationact._type_str,BA.ObjectToString("url"))) { 
 BA.debugLineNum = 178;BA.debugLine="Activity.Finish";
Debug.ShouldStop(131072);
notificationact.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 179;BA.debugLine="StartActivity(Web.OpenBrowser(cu1.GetString(\"v";
Debug.ShouldStop(262144);
notificationact.mostCurrent.__c.runVoidMethod ("StartActivity",notificationact.processBA,(Object)((notificationact.mostCurrent._web.runMethod(false,"OpenBrowser",(Object)(notificationact._cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("value"))))))));
 };
 BA.debugLineNum = 182;BA.debugLine="If type_str == \"activity\" Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",notificationact._type_str,BA.ObjectToString("activity"))) { 
 BA.debugLineNum = 183;BA.debugLine="Activity.Finish";
Debug.ShouldStop(4194304);
notificationact.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 184;BA.debugLine="StartActivity(cu1.GetString(\"value\"))";
Debug.ShouldStop(8388608);
notificationact.mostCurrent.__c.runVoidMethod ("StartActivity",notificationact.processBA,(Object)((notificationact._cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("value"))))));
 };
 }
}Debug.locals.put("i", _i);
;
 }else {
 };
 BA.debugLineNum = 203;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addalertbox(RemoteObject _index,RemoteObject _text,RemoteObject _thistype,RemoteObject _thisicon,RemoteObject _time) throws Exception{
try {
		Debug.PushSubsStack("addAlertBox (notificationact) ","notificationact",9,notificationact.mostCurrent.activityBA,notificationact.mostCurrent,257);
if (RapidSub.canDelegate("addalertbox")) { return ir.saelozahra.damaara.mazraeyeman.notificationact.remoteMe.runUserSub(false, "notificationact","addalertbox", _index, _text, _thistype, _thisicon, _time);}
RemoteObject _mycolor = RemoteObject.createImmutable(0);
RemoteObject _cdpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.GradientDrawable");
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _cd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _timelbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _linelbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _cdbubble = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _bubblelbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _imgv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
RemoteObject _minheight = RemoteObject.createImmutable(0);
Debug.locals.put("Index", _index);
Debug.locals.put("Text", _text);
Debug.locals.put("ThisType", _thistype);
Debug.locals.put("ThisIcon", _thisicon);
Debug.locals.put("Time", _time);
 BA.debugLineNum = 257;BA.debugLine="Sub addAlertBox(Index As String, Text As CSBuilder";
Debug.ShouldStop(1);
 BA.debugLineNum = 262;BA.debugLine="Dim MyColor As Int = SaeloZahra.FindAlertColor(Th";
Debug.ShouldStop(32);
_mycolor = notificationact.mostCurrent._saelozahra.runMethod(true,"_findalertcolor" /*RemoteObject*/ ,notificationact.mostCurrent.activityBA,(Object)(_thistype));Debug.locals.put("MyColor", _mycolor);Debug.locals.put("MyColor", _mycolor);
 BA.debugLineNum = 264;BA.debugLine="Dim cdPanel As GradientDrawable";
Debug.ShouldStop(128);
_cdpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.GradientDrawable");Debug.locals.put("cdPanel", _cdpanel);
 BA.debugLineNum = 265;BA.debugLine="cdPanel.Initialize(\"TR_BL\", Array As Int(Colors.W";
Debug.ShouldStop(256);
_cdpanel.runVoidMethod ("Initialize",(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.drawable.GradientDrawable.Orientation"),"TR_BL")),(Object)(RemoteObject.createNewArray("int",new int[] {2},new Object[] {notificationact.mostCurrent.__c.getField(false,"Colors").getField(true,"White"),notificationact.mostCurrent.__c.getField(false,"Colors").getField(true,"White")})));
 BA.debugLineNum = 266;BA.debugLine="cdPanel.CornerRadius = 12dip";
Debug.ShouldStop(512);
_cdpanel.runVoidMethod ("setCornerRadius",BA.numberCast(float.class, notificationact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 12)))));
 BA.debugLineNum = 268;BA.debugLine="Dim pnl As Panel";
Debug.ShouldStop(2048);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 269;BA.debugLine="pnl.Initialize(\"\")";
Debug.ShouldStop(4096);
_pnl.runVoidMethod ("Initialize",notificationact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 270;BA.debugLine="pnl.Tag = Index";
Debug.ShouldStop(8192);
_pnl.runMethod(false,"setTag",(_index));
 BA.debugLineNum = 271;BA.debugLine="pnl.Background=cdPanel";
Debug.ShouldStop(16384);
_pnl.runMethod(false,"setBackground",(_cdpanel.getObject()));
 BA.debugLineNum = 272;BA.debugLine="pnl.Elevation=12dip";
Debug.ShouldStop(32768);
_pnl.runMethod(true,"setElevation",BA.numberCast(float.class, notificationact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 12)))));
 BA.debugLineNum = 274;BA.debugLine="Dim lbl As Label";
Debug.ShouldStop(131072);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 275;BA.debugLine="lbl.Initialize(\"lbl\")";
Debug.ShouldStop(262144);
_lbl.runVoidMethod ("Initialize",notificationact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl")));
 BA.debugLineNum = 276;BA.debugLine="lbl.Tag  = Text";
Debug.ShouldStop(524288);
_lbl.runMethod(false,"setTag",(_text.getObject()));
 BA.debugLineNum = 277;BA.debugLine="lbl.Text = Text";
Debug.ShouldStop(1048576);
_lbl.runMethod(true,"setText",BA.ObjectToCharSequence(_text.getObject()));
 BA.debugLineNum = 278;BA.debugLine="lbl.Gravity = Bit.Or(Gravity.RIGHT,Gravity.CENTER";
Debug.ShouldStop(2097152);
_lbl.runMethod(true,"setGravity",notificationact.mostCurrent.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(notificationact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT")),(Object)(notificationact.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL"))));
 BA.debugLineNum = 281;BA.debugLine="lbl.Typeface = SaeloZahra.font";
Debug.ShouldStop(16777216);
_lbl.runMethod(false,"setTypeface",(notificationact.mostCurrent._saelozahra._font /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 282;BA.debugLine="pnl.AddView(lbl, 10dip, 10dip, Activity.Width - (";
Debug.ShouldStop(33554432);
_pnl.runVoidMethod ("AddView",(Object)((_lbl.getObject())),(Object)(notificationact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(notificationact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(RemoteObject.solve(new RemoteObject[] {notificationact.mostCurrent._activity.runMethod(true,"getWidth"),(notificationact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 25)),notificationact.mostCurrent.activityBA)),notificationact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 24)))}, "--",2, 1)),(Object)(notificationact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))));
 BA.debugLineNum = 285;BA.debugLine="Dim cd As ColorDrawable";
Debug.ShouldStop(268435456);
_cd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("cd", _cd);
 BA.debugLineNum = 286;BA.debugLine="cd.Initialize(MyColor,7dip)";
Debug.ShouldStop(536870912);
_cd.runVoidMethod ("Initialize",(Object)(_mycolor),(Object)(notificationact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 7)))));
 BA.debugLineNum = 288;BA.debugLine="Dim timeLbl As Label";
Debug.ShouldStop(-2147483648);
_timelbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("timeLbl", _timelbl);
 BA.debugLineNum = 289;BA.debugLine="timeLbl.Initialize(\"\")";
Debug.ShouldStop(1);
_timelbl.runVoidMethod ("Initialize",notificationact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 290;BA.debugLine="timeLbl.Background	= cd";
Debug.ShouldStop(2);
_timelbl.runMethod(false,"setBackground",(_cd.getObject()));
 BA.debugLineNum = 292;BA.debugLine="timeLbl.textColor	= Colors.White";
Debug.ShouldStop(8);
_timelbl.runMethod(true,"setTextColor",notificationact.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 293;BA.debugLine="If ThisType == \"notification\" Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_thistype,BA.ObjectToString("notification"))) { 
 BA.debugLineNum = 294;BA.debugLine="timeLbl.Text	 	= \"اطلاعیـــه\"";
Debug.ShouldStop(32);
_timelbl.runMethod(true,"setText",BA.ObjectToCharSequence("اطلاعیـــه"));
 }else 
{ BA.debugLineNum = 295;BA.debugLine="Else if ThisType == \"weather\" Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_thistype,BA.ObjectToString("weather"))) { 
 BA.debugLineNum = 296;BA.debugLine="timeLbl.Text	 	= \"وضعیت آب و هوا\"";
Debug.ShouldStop(128);
_timelbl.runMethod(true,"setText",BA.ObjectToCharSequence("وضعیت آب و هوا"));
 }else 
{ BA.debugLineNum = 297;BA.debugLine="Else if ThisType == \"sarmazadegi\" Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_thistype,BA.ObjectToString("sarmazadegi"))) { 
 BA.debugLineNum = 298;BA.debugLine="timeLbl.Text	 	= \"هشدار سرمازدگی\"";
Debug.ShouldStop(512);
_timelbl.runMethod(true,"setText",BA.ObjectToCharSequence("هشدار سرمازدگی"));
 }else 
{ BA.debugLineNum = 299;BA.debugLine="Else if ThisType == \"garmazadegi\" Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_thistype,BA.ObjectToString("garmazadegi"))) { 
 BA.debugLineNum = 300;BA.debugLine="timeLbl.Text	 	= \"هشدار گرمازدگی\"";
Debug.ShouldStop(2048);
_timelbl.runMethod(true,"setText",BA.ObjectToCharSequence("هشدار گرمازدگی"));
 }else {
 BA.debugLineNum = 302;BA.debugLine="timeLbl.Text	 	= SaeloZahra.mohasebe_tarikh(Time";
Debug.ShouldStop(8192);
_timelbl.runMethod(true,"setText",BA.ObjectToCharSequence(notificationact.mostCurrent._saelozahra.runMethod(true,"_mohasebe_tarikh" /*RemoteObject*/ ,notificationact.mostCurrent.activityBA,(Object)(_time))));
 }}}}
;
 BA.debugLineNum = 306;BA.debugLine="timeLbl.TextSize	= 12";
Debug.ShouldStop(131072);
_timelbl.runMethod(true,"setTextSize",BA.numberCast(float.class, 12));
 BA.debugLineNum = 307;BA.debugLine="timeLbl.SingleLine=True";
Debug.ShouldStop(262144);
_timelbl.runVoidMethod ("setSingleLine",notificationact.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 308;BA.debugLine="timeLbl.Ellipsize = \"END\"";
Debug.ShouldStop(524288);
_timelbl.runMethod(true,"setEllipsize",BA.ObjectToString("END"));
 BA.debugLineNum = 309;BA.debugLine="timeLbl.Gravity		= Bit.Or(Gravity.CENTER_VERTICAL";
Debug.ShouldStop(1048576);
_timelbl.runMethod(true,"setGravity",notificationact.mostCurrent.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(notificationact.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")),(Object)(notificationact.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"))));
 BA.debugLineNum = 310;BA.debugLine="timeLbl.textColor	= Colors.White";
Debug.ShouldStop(2097152);
_timelbl.runMethod(true,"setTextColor",notificationact.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 311;BA.debugLine="pnl.AddView(timeLbl,12dip,12dip,88dip,18dip)";
Debug.ShouldStop(4194304);
_pnl.runVoidMethod ("AddView",(Object)((_timelbl.getObject())),(Object)(notificationact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 12)))),(Object)(notificationact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 12)))),(Object)(notificationact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 88)))),(Object)(notificationact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 18)))));
 BA.debugLineNum = 314;BA.debugLine="Dim LineLbl As Label";
Debug.ShouldStop(33554432);
_linelbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("LineLbl", _linelbl);
 BA.debugLineNum = 315;BA.debugLine="LineLbl.Initialize(\"\")";
Debug.ShouldStop(67108864);
_linelbl.runVoidMethod ("Initialize",notificationact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 316;BA.debugLine="LineLbl.Color=Colors.LightGray";
Debug.ShouldStop(134217728);
_linelbl.runVoidMethod ("setColor",notificationact.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 317;BA.debugLine="pnl.AddView(LineLbl, Activity.Width - (25%x)+7dip";
Debug.ShouldStop(268435456);
_pnl.runVoidMethod ("AddView",(Object)((_linelbl.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {notificationact.mostCurrent._activity.runMethod(true,"getWidth"),(notificationact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 25)),notificationact.mostCurrent.activityBA)),notificationact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 7)))}, "-+",2, 1)),(Object)(notificationact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 14)))),(Object)(notificationact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))),(Object)(notificationact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))));
 BA.debugLineNum = 319;BA.debugLine="Dim cdBubble As ColorDrawable";
Debug.ShouldStop(1073741824);
_cdbubble = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("cdBubble", _cdbubble);
 BA.debugLineNum = 320;BA.debugLine="cdBubble.Initialize2(MyColor,14dip,2dip,SaeloZahr";
Debug.ShouldStop(-2147483648);
_cdbubble.runVoidMethod ("Initialize2",(Object)(_mycolor),(Object)(notificationact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 14)))),(Object)(notificationact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(notificationact.mostCurrent._saelozahra._color /*RemoteObject*/ ));
 BA.debugLineNum = 322;BA.debugLine="Dim bubbleLbl As Label";
Debug.ShouldStop(2);
_bubblelbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("bubbleLbl", _bubblelbl);
 BA.debugLineNum = 323;BA.debugLine="bubbleLbl.Initialize(\"\")";
Debug.ShouldStop(4);
_bubblelbl.runVoidMethod ("Initialize",notificationact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 324;BA.debugLine="bubbleLbl.Background=cdBubble";
Debug.ShouldStop(8);
_bubblelbl.runMethod(false,"setBackground",(_cdbubble.getObject()));
 BA.debugLineNum = 325;BA.debugLine="pnl.AddView(bubbleLbl, Activity.Width - (25%x), 1";
Debug.ShouldStop(16);
_pnl.runVoidMethod ("AddView",(Object)((_bubblelbl.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {notificationact.mostCurrent._activity.runMethod(true,"getWidth"),(notificationact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 25)),notificationact.mostCurrent.activityBA))}, "-",1, 1)),(Object)(notificationact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 12)))),(Object)(notificationact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 14)))),(Object)(notificationact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 14)))));
 BA.debugLineNum = 328;BA.debugLine="Dim ImgV As ImageView";
Debug.ShouldStop(128);
_imgv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");Debug.locals.put("ImgV", _imgv);
 BA.debugLineNum = 329;BA.debugLine="ImgV.Initialize(\"\")";
Debug.ShouldStop(256);
_imgv.runVoidMethod ("Initialize",notificationact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 330;BA.debugLine="ImgV.Gravity = Gravity.CENTER";
Debug.ShouldStop(512);
_imgv.runMethod(true,"setGravity",notificationact.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 331;BA.debugLine="ImgV.Bitmap = SaeloZahra.FindWeatherImg(ThisIcon)";
Debug.ShouldStop(1024);
_imgv.runMethod(false,"setBitmap",(notificationact.mostCurrent._saelozahra.runMethod(false,"_findweatherimg" /*RemoteObject*/ ,notificationact.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, _thisicon))).runMethod(false,"Resize",(Object)(BA.numberCast(float.class, notificationact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 18)),notificationact.mostCurrent.activityBA))),(Object)(BA.numberCast(float.class, notificationact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 18)),notificationact.mostCurrent.activityBA))),(Object)(notificationact.mostCurrent.__c.getField(true,"True"))).getObject()));
 BA.debugLineNum = 332;BA.debugLine="pnl.AddView(ImgV, Activity.Width - 26%x,16dip,20%";
Debug.ShouldStop(2048);
_pnl.runVoidMethod ("AddView",(Object)((_imgv.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {notificationact.mostCurrent._activity.runMethod(true,"getWidth"),notificationact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 26)),notificationact.mostCurrent.activityBA)}, "-",1, 1)),(Object)(notificationact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 16)))),(Object)(notificationact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),notificationact.mostCurrent.activityBA)),(Object)(notificationact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),notificationact.mostCurrent.activityBA)));
 BA.debugLineNum = 335;BA.debugLine="Dim minHeight As Int";
Debug.ShouldStop(16384);
_minheight = RemoteObject.createImmutable(0);Debug.locals.put("minHeight", _minheight);
 BA.debugLineNum = 336;BA.debugLine="minHeight 		= su.MeasureMultilineTextHeight(lbl,";
Debug.ShouldStop(32768);
_minheight = RemoteObject.solve(new RemoteObject[] {notificationact.mostCurrent._su.runMethod(true,"MeasureMultilineTextHeight",(Object)((_lbl.getObject())),(Object)(BA.ObjectToCharSequence(_text.getObject()))),notificationact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))}, "+",1, 1);Debug.locals.put("minHeight", _minheight);
 BA.debugLineNum = 337;BA.debugLine="lbl.Height  	= Max(50dip, minHeight)";
Debug.ShouldStop(65536);
_lbl.runMethod(true,"setHeight",BA.numberCast(int.class, notificationact.mostCurrent.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, notificationact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))))),(Object)(BA.numberCast(double.class, _minheight)))));
 BA.debugLineNum = 338;BA.debugLine="ImgV.Height 	= Max(50dip, minHeight)";
Debug.ShouldStop(131072);
_imgv.runMethod(true,"setHeight",BA.numberCast(int.class, notificationact.mostCurrent.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, notificationact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))))),(Object)(BA.numberCast(double.class, _minheight)))));
 BA.debugLineNum = 339;BA.debugLine="LineLbl.Height	= Max(50dip, minHeight)";
Debug.ShouldStop(262144);
_linelbl.runMethod(true,"setHeight",BA.numberCast(int.class, notificationact.mostCurrent.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, notificationact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))))),(Object)(BA.numberCast(double.class, _minheight)))));
 BA.debugLineNum = 340;BA.debugLine="pnl.Height 		= Max(50dip, minHeight)+18dip";
Debug.ShouldStop(524288);
_pnl.runMethod(true,"setHeight",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {notificationact.mostCurrent.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, notificationact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))))),(Object)(BA.numberCast(double.class, _minheight))),notificationact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 18)))}, "+",1, 0)));
 BA.debugLineNum = 342;BA.debugLine="Return pnl";
Debug.ShouldStop(2097152);
if (true) return _pnl;
 BA.debugLineNum = 344;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Dim Config 	As Amir_SliderConfig";
notificationact.mostCurrent._config = RemoteObject.createNew ("ir.aghajari.slider.Amir_SlisderConfig");
 //BA.debugLineNum = 17;BA.debugLine="Dim Show 	As Amir_SliderShow";
notificationact.mostCurrent._show = RemoteObject.createNew ("ir.aghajari.slider.Amir_SliderShow");
 //BA.debugLineNum = 18;BA.debugLine="Dim su As StringUtils";
notificationact.mostCurrent._su = RemoteObject.createNew ("anywheresoftware.b4a.objects.StringUtils");
 //BA.debugLineNum = 19;BA.debugLine="Dim X1 As XmlLayoutBuilder";
notificationact.mostCurrent._x1 = RemoteObject.createNew ("anywheresoftware.b4a.object.XmlLayoutBuilder");
 //BA.debugLineNum = 20;BA.debugLine="Dim Actionbar As ACToolBarLight";
notificationact.mostCurrent._actionbar = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACToolbarLightWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Public css_start,css_end As String";
notificationact.mostCurrent._css_start = RemoteObject.createImmutable("");
notificationact.mostCurrent._css_end = RemoteObject.createImmutable("");
 //BA.debugLineNum = 22;BA.debugLine="Dim Web As PhoneIntents";
notificationact.mostCurrent._web = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.PhoneIntents");
 //BA.debugLineNum = 23;BA.debugLine="Dim PC As AHPageContainer";
notificationact.mostCurrent._pc = RemoteObject.createNew ("de.amberhome.viewpager.AHPageContainer");
 //BA.debugLineNum = 24;BA.debugLine="Dim TabLayout As DSTabLayout";
notificationact.mostCurrent._tablayout = RemoteObject.createNew ("de.amberhome.objects.TabLayoutWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Dim VP As AHViewPager";
notificationact.mostCurrent._vp = RemoteObject.createNew ("de.amberhome.viewpager.AHViewPager");
 //BA.debugLineNum = 26;BA.debugLine="Dim SvNotif,SvAlert As ScrollView";
notificationact.mostCurrent._svnotif = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
notificationact.mostCurrent._svalert = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Dim StopintNotif As Int=18dip";
notificationact._stopintnotif = notificationact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 18)));
 //BA.debugLineNum = 29;BA.debugLine="Dim StopintAlert As Int=18dip";
notificationact._stopintalert = notificationact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 18)));
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _lbl_click() throws Exception{
try {
		Debug.PushSubsStack("lbl_Click (notificationact) ","notificationact",9,notificationact.mostCurrent.activityBA,notificationact.mostCurrent,346);
if (RapidSub.canDelegate("lbl_click")) { return ir.saelozahra.damaara.mazraeyeman.notificationact.remoteMe.runUserSub(false, "notificationact","lbl_click");}
 BA.debugLineNum = 346;BA.debugLine="Sub lbl_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 348;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadmsgs() throws Exception{
try {
		Debug.PushSubsStack("LoadMsgs (notificationact) ","notificationact",9,notificationact.mostCurrent.activityBA,notificationact.mostCurrent,107);
if (RapidSub.canDelegate("loadmsgs")) { return ir.saelozahra.damaara.mazraeyeman.notificationact.remoteMe.runUserSub(false, "notificationact","loadmsgs");}
int _i = 0;
RemoteObject _csbtxt = RemoteObject.declareNull("anywheresoftware.b4a.objects.CSBuilder");
RemoteObject _thisicon = RemoteObject.createImmutable("");
RemoteObject _p1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
 BA.debugLineNum = 107;BA.debugLine="Sub LoadMsgs";
Debug.ShouldStop(1024);
 BA.debugLineNum = 109;BA.debugLine="cu1 = sql1.ExecQuery(\"SELECT * FROM notification";
Debug.ShouldStop(4096);
notificationact._cu1 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), notificationact._sql1.runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM notification ORDER BY id DESC limit 110"))));
 BA.debugLineNum = 112;BA.debugLine="For i = 0 To cu1.RowCount-1";
Debug.ShouldStop(32768);
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {notificationact._cu1.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 114;BA.debugLine="cu1.Position = i";
Debug.ShouldStop(131072);
notificationact._cu1.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 115;BA.debugLine="Dim CsbTxt As CSBuilder";
Debug.ShouldStop(262144);
_csbtxt = RemoteObject.createNew ("anywheresoftware.b4a.objects.CSBuilder");Debug.locals.put("CsbTxt", _csbtxt);
 BA.debugLineNum = 116;BA.debugLine="CsbTxt.Initialize";
Debug.ShouldStop(524288);
_csbtxt.runVoidMethod ("Initialize");
 BA.debugLineNum = 117;BA.debugLine="CsbTxt.Bold.Typeface(SaeloZahra.font).Size(16).C";
Debug.ShouldStop(1048576);
_csbtxt.runMethod(false,"Bold").runMethod(false,"Typeface",(Object)((notificationact.mostCurrent._saelozahra._font /*RemoteObject*/ .getObject()))).runMethod(false,"Size",(Object)(BA.numberCast(int.class, 16))).runMethod(false,"Color",(Object)(notificationact.mostCurrent.__c.getField(false,"Colors").getField(true,"DarkGray"))).runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(notificationact._cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("title")))))).runVoidMethod ("PopAll");
 BA.debugLineNum = 118;BA.debugLine="CsbTxt.Append(CRLF)";
Debug.ShouldStop(2097152);
_csbtxt.runVoidMethod ("Append",(Object)(BA.ObjectToCharSequence(notificationact.mostCurrent.__c.getField(true,"CRLF"))));
 BA.debugLineNum = 119;BA.debugLine="CsbTxt.Append(CRLF)";
Debug.ShouldStop(4194304);
_csbtxt.runVoidMethod ("Append",(Object)(BA.ObjectToCharSequence(notificationact.mostCurrent.__c.getField(true,"CRLF"))));
 BA.debugLineNum = 120;BA.debugLine="CsbTxt.Typeface(SaeloZahra.font).Color(0xFF7C797";
Debug.ShouldStop(8388608);
_csbtxt.runMethod(false,"Typeface",(Object)((notificationact.mostCurrent._saelozahra._font /*RemoteObject*/ .getObject()))).runMethod(false,"Color",(Object)(BA.numberCast(int.class, ((int)0xff7c7979)))).runMethod(false,"Size",(Object)(BA.numberCast(int.class, 12))).runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(notificationact._cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("value"))).runMethod(true,"replace",(Object)(BA.ObjectToString("<br>")),(Object)(notificationact.mostCurrent.__c.getField(true,"CRLF"))).runMethod(true,"replace",(Object)(BA.ObjectToString("<hr>")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("___________________________________"),notificationact.mostCurrent.__c.getField(true,"CRLF"))))))).runVoidMethod ("PopAll");
 BA.debugLineNum = 122;BA.debugLine="Log(cu1.GetString(\"id\"))";
Debug.ShouldStop(33554432);
notificationact.mostCurrent.__c.runVoidMethod ("LogImpl","412124175",notificationact._cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("id"))),0);
 BA.debugLineNum = 124;BA.debugLine="Dim ThisIcon As String = cu1.GetString(\"icon\")";
Debug.ShouldStop(134217728);
_thisicon = notificationact._cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("icon")));Debug.locals.put("ThisIcon", _thisicon);Debug.locals.put("ThisIcon", _thisicon);
 BA.debugLineNum = 125;BA.debugLine="If ThisIcon==\"\" Then ThisIcon = 0";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_thisicon,BA.ObjectToString(""))) { 
_thisicon = BA.NumberToString(0);Debug.locals.put("ThisIcon", _thisicon);};
 BA.debugLineNum = 127;BA.debugLine="Dim P1 As Panel";
Debug.ShouldStop(1073741824);
_p1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("P1", _p1);
 BA.debugLineNum = 128;BA.debugLine="P1 = addAlertBox(cu1.GetString(\"id\"),CsbTxt,cu1.";
Debug.ShouldStop(-2147483648);
_p1 = _addalertbox(notificationact._cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("id"))),_csbtxt,notificationact._cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("type"))),_thisicon,BA.numberCast(long.class, notificationact._cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("time")))));Debug.locals.put("P1", _p1);
 BA.debugLineNum = 130;BA.debugLine="If cu1.GetString(\"type\") == \"notification\" Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",notificationact._cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("type"))),BA.ObjectToString("notification"))) { 
 BA.debugLineNum = 131;BA.debugLine="SvNotif.Panel.AddView( P1, 20dip, StopintNotif,";
Debug.ShouldStop(4);
notificationact.mostCurrent._svnotif.runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((_p1.getObject())),(Object)(notificationact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))),(Object)(notificationact._stopintnotif),(Object)(RemoteObject.solve(new RemoteObject[] {notificationact.mostCurrent._activity.runMethod(true,"getWidth"),notificationact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))}, "-",1, 1)),(Object)(_p1.runMethod(true,"getHeight")));
 BA.debugLineNum = 132;BA.debugLine="StopintNotif = StopintNotif+P1.Height + 24dip";
Debug.ShouldStop(8);
notificationact._stopintnotif = RemoteObject.solve(new RemoteObject[] {notificationact._stopintnotif,_p1.runMethod(true,"getHeight"),notificationact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 24)))}, "++",2, 1);
 }else {
 BA.debugLineNum = 134;BA.debugLine="SvAlert.Panel.AddView( P1, 20dip, StopintAlert,";
Debug.ShouldStop(32);
notificationact.mostCurrent._svalert.runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((_p1.getObject())),(Object)(notificationact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))),(Object)(notificationact._stopintalert),(Object)(RemoteObject.solve(new RemoteObject[] {notificationact.mostCurrent._activity.runMethod(true,"getWidth"),notificationact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))}, "-",1, 1)),(Object)(_p1.runMethod(true,"getHeight")));
 BA.debugLineNum = 135;BA.debugLine="StopintAlert = StopintAlert+P1.Height + 24dip";
Debug.ShouldStop(64);
notificationact._stopintalert = RemoteObject.solve(new RemoteObject[] {notificationact._stopintalert,_p1.runMethod(true,"getHeight"),notificationact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 24)))}, "++",2, 1);
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 141;BA.debugLine="SvAlert.Panel.Height=StopintAlert+22dip";
Debug.ShouldStop(4096);
notificationact.mostCurrent._svalert.runMethod(false,"getPanel").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {notificationact._stopintalert,notificationact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 22)))}, "+",1, 1));
 BA.debugLineNum = 142;BA.debugLine="SvNotif.Panel.Height=StopintNotif+22dip";
Debug.ShouldStop(8192);
notificationact.mostCurrent._svnotif.runMethod(false,"getPanel").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {notificationact._stopintnotif,notificationact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 22)))}, "+",1, 1));
 BA.debugLineNum = 144;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _matn_overrideurl(RemoteObject _url) throws Exception{
try {
		Debug.PushSubsStack("matn_OverrideUrl (notificationact) ","notificationact",9,notificationact.mostCurrent.activityBA,notificationact.mostCurrent,206);
if (RapidSub.canDelegate("matn_overrideurl")) { return ir.saelozahra.damaara.mazraeyeman.notificationact.remoteMe.runUserSub(false, "notificationact","matn_overrideurl", _url);}
Debug.locals.put("Url", _url);
 BA.debugLineNum = 206;BA.debugLine="Sub matn_OverrideUrl (Url As String) As Boolean";
Debug.ShouldStop(8192);
 BA.debugLineNum = 207;BA.debugLine="ProgressDialogShow2(\"چند لحظه صبر کنید\",True)";
Debug.ShouldStop(16384);
notificationact.mostCurrent.__c.runVoidMethod ("ProgressDialogShow2",notificationact.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence("چند لحظه صبر کنید")),(Object)(notificationact.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 208;BA.debugLine="StartActivity(Web.OpenBrowser(Url))";
Debug.ShouldStop(32768);
notificationact.mostCurrent.__c.runVoidMethod ("StartActivity",notificationact.processBA,(Object)((notificationact.mostCurrent._web.runMethod(false,"OpenBrowser",(Object)(_url)))));
 BA.debugLineNum = 209;BA.debugLine="Return True";
Debug.ShouldStop(65536);
if (true) return notificationact.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 210;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _matn_pagefinished(RemoteObject _url) throws Exception{
try {
		Debug.PushSubsStack("matn_PageFinished (notificationact) ","notificationact",9,notificationact.mostCurrent.activityBA,notificationact.mostCurrent,213);
if (RapidSub.canDelegate("matn_pagefinished")) { return ir.saelozahra.damaara.mazraeyeman.notificationact.remoteMe.runUserSub(false, "notificationact","matn_pagefinished", _url);}
Debug.locals.put("Url", _url);
 BA.debugLineNum = 213;BA.debugLine="Sub matn_PageFinished (Url As String)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 214;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(2097152);
notificationact.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 215;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _open_telegram(RemoteObject _tid) throws Exception{
try {
		Debug.PushSubsStack("open_telegram (notificationact) ","notificationact",9,notificationact.mostCurrent.activityBA,notificationact.mostCurrent,244);
if (RapidSub.canDelegate("open_telegram")) { return ir.saelozahra.damaara.mazraeyeman.notificationact.remoteMe.runUserSub(false, "notificationact","open_telegram", _tid);}
Debug.locals.put("tid", _tid);
 BA.debugLineNum = 244;BA.debugLine="Sub open_telegram(tid As String)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 245;BA.debugLine="Log(\"Open Telegram\")";
Debug.ShouldStop(1048576);
notificationact.mostCurrent.__c.runVoidMethod ("LogImpl","412582913",RemoteObject.createImmutable("Open Telegram"),0);
 BA.debugLineNum = 246;BA.debugLine="Try";
Debug.ShouldStop(2097152);
try { BA.debugLineNum = 247;BA.debugLine="share.Initialize(share.ACTION_EDIT,\"tg://\"&tid)";
Debug.ShouldStop(4194304);
notificationact._share.runVoidMethod ("Initialize",(Object)(notificationact._share.getField(true,"ACTION_EDIT")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("tg://"),_tid)));
 BA.debugLineNum = 248;BA.debugLine="StartActivity(share)";
Debug.ShouldStop(8388608);
notificationact.mostCurrent.__c.runVoidMethod ("StartActivity",notificationact.processBA,(Object)((notificationact._share.getObject())));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e6) {
			BA.rdebugUtils.runVoidMethod("setLastException",notificationact.processBA, e6.toString()); BA.debugLineNum = 250;BA.debugLine="StartActivity(Web.OpenBrowser(\"https://telegram.";
Debug.ShouldStop(33554432);
notificationact.mostCurrent.__c.runVoidMethod ("StartActivity",notificationact.processBA,(Object)((notificationact.mostCurrent._web.runMethod(false,"OpenBrowser",(Object)(RemoteObject.concat(RemoteObject.createImmutable("https://telegram.me/"),_tid))))));
 };
 BA.debugLineNum = 252;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Dim sql1 As SQL";
notificationact._sql1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");
 //BA.debugLineNum = 10;BA.debugLine="Dim cu1 As Cursor";
notificationact._cu1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 //BA.debugLineNum = 11;BA.debugLine="Dim share As Intent";
notificationact._share = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");
 //BA.debugLineNum = 12;BA.debugLine="Dim type_str As String";
notificationact._type_str = RemoteObject.createImmutable("");
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}