package ir.saelozahra.damaara.mazraeyeman;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class select_map_act_subs_0 {


public static RemoteObject  _actionbar_navigationitemclick() throws Exception{
try {
		Debug.PushSubsStack("Actionbar_NavigationItemClick (select_map_act) ","select_map_act",20,select_map_act.mostCurrent.activityBA,select_map_act.mostCurrent,259);
if (RapidSub.canDelegate("actionbar_navigationitemclick")) { return ir.saelozahra.damaara.mazraeyeman.select_map_act.remoteMe.runUserSub(false, "select_map_act","actionbar_navigationitemclick");}
 BA.debugLineNum = 259;BA.debugLine="Sub Actionbar_NavigationItemClick";
Debug.ShouldStop(4);
 BA.debugLineNum = 260;BA.debugLine="Activity.Finish";
Debug.ShouldStop(8);
select_map_act.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 261;BA.debugLine="SaeloZahra.SetAnimation(\"zoom_enter\",\"zoom_exit\")";
Debug.ShouldStop(16);
select_map_act.mostCurrent._saelozahra.runVoidMethod ("_setanimation" /*RemoteObject*/ ,select_map_act.mostCurrent.activityBA,(Object)(BA.ObjectToString("zoom_enter")),(Object)(RemoteObject.createImmutable("zoom_exit")));
 BA.debugLineNum = 262;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("Activity_Create (select_map_act) ","select_map_act",20,select_map_act.mostCurrent.activityBA,select_map_act.mostCurrent,47);
if (RapidSub.canDelegate("activity_create")) { return ir.saelozahra.damaara.mazraeyeman.select_map_act.remoteMe.runUserSub(false, "select_map_act","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 47;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 49;BA.debugLine="SaeloZahra.active_page=\"selectmap\"";
Debug.ShouldStop(65536);
select_map_act.mostCurrent._saelozahra._active_page /*RemoteObject*/  = BA.ObjectToString("selectmap");
 BA.debugLineNum = 50;BA.debugLine="Activity.LoadLayout(\"map_layout\")";
Debug.ShouldStop(131072);
select_map_act.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("map_layout")),select_map_act.mostCurrent.activityBA);
 BA.debugLineNum = 52;BA.debugLine="address_bar_lbl.Color		= 0xEA056523";
Debug.ShouldStop(524288);
select_map_act.mostCurrent._address_bar_lbl.runVoidMethod ("setColor",BA.numberCast(int.class, ((int)0xea056523)));
 BA.debugLineNum = 53;BA.debugLine="address_bar_lbl.TextColor	= Colors.White";
Debug.ShouldStop(1048576);
select_map_act.mostCurrent._address_bar_lbl.runMethod(true,"setTextColor",select_map_act.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 54;BA.debugLine="address_bar_lbl.Typeface= SaeloZahra.font";
Debug.ShouldStop(2097152);
select_map_act.mostCurrent._address_bar_lbl.runMethod(false,"setTypeface",(select_map_act.mostCurrent._saelozahra._font /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 55;BA.debugLine="AC.SetElevation(address_bar_lbl,7dip)";
Debug.ShouldStop(4194304);
select_map_act.mostCurrent._ac.runVoidMethod ("SetElevation",(Object)((select_map_act.mostCurrent._address_bar_lbl.getObject())),(Object)(BA.numberCast(float.class, select_map_act.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 7))))));
 BA.debugLineNum = 57;BA.debugLine="If MapFragment1.IsGooglePlayServicesAvailable = F";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",select_map_act.mostCurrent._mapfragment1.runMethod(true,"IsGooglePlayServicesAvailable",select_map_act.mostCurrent.activityBA),select_map_act.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 58;BA.debugLine="ToastMessageShow(\"لطفا گوگل پلی را نصب کنید.\", T";
Debug.ShouldStop(33554432);
select_map_act.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("لطفا گوگل پلی را نصب کنید.")),(Object)(select_map_act.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 59;BA.debugLine="Activity.Finish";
Debug.ShouldStop(67108864);
select_map_act.mostCurrent._activity.runVoidMethod ("Finish");
 };
 BA.debugLineNum = 64;BA.debugLine="ActionBar.Title=SaeloZahra.CSB(\"انتخاب موقعیت مکا";
Debug.ShouldStop(-2147483648);
select_map_act.mostCurrent._actionbar.runMethod(true,"setTitle",BA.ObjectToCharSequence(select_map_act.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,select_map_act.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("انتخاب موقعیت مکانی"))).getObject()));
 BA.debugLineNum = 65;BA.debugLine="ActionBar.TitleTextColor=Colors.White";
Debug.ShouldStop(1);
select_map_act.mostCurrent._actionbar.runVoidMethod ("setTitleTextColor",select_map_act.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 66;BA.debugLine="ActionBar.NavigationIconDrawable = X1.GetDrawable";
Debug.ShouldStop(2);
select_map_act.mostCurrent._actionbar.runMethod(false,"setNavigationIconDrawable",select_map_act.mostCurrent._x1.runMethod(false,"GetDrawable",(Object)(RemoteObject.createImmutable("baseline_arrow_back_white_24"))));
 BA.debugLineNum = 67;BA.debugLine="ActionBar.Color=Colors.Transparent";
Debug.ShouldStop(4);
select_map_act.mostCurrent._actionbar.runVoidMethod ("setColor",select_map_act.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 68;BA.debugLine="ActionBar.SetLayout(0dip,2%y,100%x,AC.GetMaterial";
Debug.ShouldStop(8);
select_map_act.mostCurrent._actionbar.runVoidMethod ("SetLayout",(Object)(select_map_act.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(select_map_act.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 2)),select_map_act.mostCurrent.activityBA)),(Object)(select_map_act.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),select_map_act.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {select_map_act.mostCurrent._ac.runMethod(true,"GetMaterialActionBarHeight",select_map_act.mostCurrent.activityBA),select_map_act.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 4)),select_map_act.mostCurrent.activityBA)}, "+",1, 1)));
 BA.debugLineNum = 69;BA.debugLine="Panel1.SetLayout(0,AC.GetMaterialActionBarHeight+";
Debug.ShouldStop(16);
select_map_act.mostCurrent._panel1.runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {select_map_act.mostCurrent._ac.runMethod(true,"GetMaterialActionBarHeight",select_map_act.mostCurrent.activityBA),select_map_act.mostCurrent._saelozahra._getstatusbarheight /*RemoteObject*/ }, "+",1, 1)),(Object)(select_map_act.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),select_map_act.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {select_map_act.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),select_map_act.mostCurrent.activityBA),select_map_act.mostCurrent._saelozahra._getstatusbarheight /*RemoteObject*/ ,select_map_act.mostCurrent._ac.runMethod(true,"GetMaterialActionBarHeight",select_map_act.mostCurrent.activityBA)}, "--",2, 1)));
 BA.debugLineNum = 70;BA.debugLine="myLocation.Initialize";
Debug.ShouldStop(32);
select_map_act._mylocation.runVoidMethod ("Initialize");
 BA.debugLineNum = 72;BA.debugLine="If Not(File.Exists(SaeloZahra.dir,\"lat\")) Then";
Debug.ShouldStop(128);
if (select_map_act.mostCurrent.__c.runMethod(true,"Not",(Object)(select_map_act.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(select_map_act.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("lat"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 73;BA.debugLine="File.WriteString(SaeloZahra.dir,\"lat\" ,\"29.60950";
Debug.ShouldStop(256);
select_map_act.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(select_map_act.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(BA.ObjectToString("lat")),(Object)(RemoteObject.createImmutable("29.609503")));
 BA.debugLineNum = 74;BA.debugLine="File.WriteString(SaeloZahra.dir,\"lng\",\"52.542800";
Debug.ShouldStop(512);
select_map_act.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(select_map_act.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(BA.ObjectToString("lng")),(Object)(RemoteObject.createImmutable("52.542800")));
 };
 BA.debugLineNum = 77;BA.debugLine="myLocation.Latitude =File.ReadString(SaeloZahra.d";
Debug.ShouldStop(4096);
select_map_act._mylocation.runMethod(true,"setLatitude",BA.numberCast(double.class, select_map_act.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(select_map_act.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("lat")))));
 BA.debugLineNum = 78;BA.debugLine="myLocation.Longitude=File.ReadString(SaeloZahra.d";
Debug.ShouldStop(8192);
select_map_act._mylocation.runMethod(true,"setLongitude",BA.numberCast(double.class, select_map_act.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(select_map_act.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("lng")))));
 BA.debugLineNum = 82;BA.debugLine="If Not(SaeloZahra.CheckConnection) Then";
Debug.ShouldStop(131072);
if (select_map_act.mostCurrent.__c.runMethod(true,"Not",(Object)(select_map_act.mostCurrent._saelozahra.runMethod(true,"_checkconnection" /*RemoteObject*/ ,select_map_act.mostCurrent.activityBA))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 83;BA.debugLine="ToastMessageShow( SaeloZahra.CSB(\"حتما به اینترن";
Debug.ShouldStop(262144);
select_map_act.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(select_map_act.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,select_map_act.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("حتما به اینترنت متصل شوید"))).getObject())),(Object)(select_map_act.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 88;BA.debugLine="get_my_address.Initialize(	\"get_my_address\", Star";
Debug.ShouldStop(8388608);
select_map_act.mostCurrent._get_my_address.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_initialize" /*RemoteObject*/ ,select_map_act.processBA,(Object)(BA.ObjectToString("get_my_address")),(Object)((select_map_act.mostCurrent._starter.getObject())));
 BA.debugLineNum = 89;BA.debugLine="GetMyElevationJob.Initialize(\"GetMyElevationJob\",";
Debug.ShouldStop(16777216);
select_map_act.mostCurrent._getmyelevationjob.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_initialize" /*RemoteObject*/ ,select_map_act.processBA,(Object)(BA.ObjectToString("GetMyElevationJob")),(Object)((select_map_act.mostCurrent._starter.getObject())));
 BA.debugLineNum = 92;BA.debugLine="t.Initialize(\"t\",100)";
Debug.ShouldStop(134217728);
select_map_act._t.runVoidMethod ("Initialize",select_map_act.processBA,(Object)(BA.ObjectToString("t")),(Object)(BA.numberCast(long.class, 100)));
 BA.debugLineNum = 93;BA.debugLine="t.Enabled=True";
Debug.ShouldStop(268435456);
select_map_act._t.runMethod(true,"setEnabled",select_map_act.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 94;BA.debugLine="T2.Initialize(\"T2\",100)";
Debug.ShouldStop(536870912);
select_map_act._t2.runVoidMethod ("Initialize",select_map_act.processBA,(Object)(BA.ObjectToString("T2")),(Object)(BA.numberCast(long.class, 100)));
 BA.debugLineNum = 95;BA.debugLine="T2.Enabled=True";
Debug.ShouldStop(1073741824);
select_map_act._t2.runMethod(true,"setEnabled",select_map_act.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 97;BA.debugLine="SaeloZahra.SearchableEdittext(search_et)";
Debug.ShouldStop(1);
select_map_act.mostCurrent._saelozahra.runVoidMethod ("_searchableedittext" /*RemoteObject*/ ,select_map_act.mostCurrent.activityBA,(Object)(select_map_act.mostCurrent._search_et));
 BA.debugLineNum = 98;BA.debugLine="search_et.Color=Colors.Transparent";
Debug.ShouldStop(2);
select_map_act.mostCurrent._search_et.runVoidMethod ("setColor",select_map_act.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 99;BA.debugLine="search_et.Typeface= SaeloZahra.font";
Debug.ShouldStop(4);
select_map_act.mostCurrent._search_et.runMethod(false,"setTypeface",(select_map_act.mostCurrent._saelozahra._font /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 103;BA.debugLine="SelectLocationBTN.Typeface=SaeloZahra.fontBold";
Debug.ShouldStop(64);
select_map_act.mostCurrent._selectlocationbtn.runMethod(false,"setTypeface",(select_map_act.mostCurrent._saelozahra._fontbold /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 106;BA.debugLine="SaeloZahra.SetStatusBarColor( SaeloZahra.ColorDa";
Debug.ShouldStop(512);
select_map_act.mostCurrent._saelozahra.runVoidMethod ("_setstatusbarcolor" /*RemoteObject*/ ,select_map_act.mostCurrent.activityBA,(Object)(select_map_act.mostCurrent._saelozahra._colordark /*RemoteObject*/ ));
 BA.debugLineNum = 107;BA.debugLine="SelectLocationBTN.Color = SaeloZahra.ColorDark";
Debug.ShouldStop(1024);
select_map_act.mostCurrent._selectlocationbtn.runVoidMethod ("setColor",select_map_act.mostCurrent._saelozahra._colordark /*RemoteObject*/ );
 BA.debugLineNum = 108;BA.debugLine="ActionBar.Color = SaeloZahra.Color";
Debug.ShouldStop(2048);
select_map_act.mostCurrent._actionbar.runVoidMethod ("setColor",select_map_act.mostCurrent._saelozahra._color /*RemoteObject*/ );
 BA.debugLineNum = 109;BA.debugLine="ActionBar.SetLayout(0,0,100%x,SaeloZahra.Materia";
Debug.ShouldStop(4096);
select_map_act.mostCurrent._actionbar.runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(select_map_act.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),select_map_act.mostCurrent.activityBA)),(Object)(select_map_act.mostCurrent._saelozahra._materialactionbarheight /*RemoteObject*/ ));
 BA.debugLineNum = 110;BA.debugLine="Panel1.SetLayout(0,SaeloZahra.MaterialActionBarH";
Debug.ShouldStop(8192);
select_map_act.mostCurrent._panel1.runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(select_map_act.mostCurrent._saelozahra._materialactionbarheight /*RemoteObject*/ ),(Object)(select_map_act.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),select_map_act.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {select_map_act.mostCurrent.__c.runMethod(false,"GetDeviceLayoutValues",select_map_act.mostCurrent.activityBA).getField(true,"Height"),select_map_act.mostCurrent._saelozahra._materialactionbarheight /*RemoteObject*/ }, "-",1, 1)));
 BA.debugLineNum = 111;BA.debugLine="address_bar_lbl.Color = 0xBC15887B";
Debug.ShouldStop(16384);
select_map_act.mostCurrent._address_bar_lbl.runVoidMethod ("setColor",BA.numberCast(int.class, ((int)0xbc15887b)));
 BA.debugLineNum = 114;BA.debugLine="MarkerIV.SetBackgroundImage(LoadBitmapResize(File";
Debug.ShouldStop(131072);
select_map_act.mostCurrent._markeriv.runVoidMethod ("SetBackgroundImageNew",(Object)((select_map_act.mostCurrent.__c.runMethod(false,"LoadBitmapResize",(Object)(select_map_act.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("location.png")),(Object)(select_map_act.mostCurrent._markeriv.runMethod(true,"getWidth")),(Object)(select_map_act.mostCurrent._markeriv.runMethod(true,"getHeight")),(Object)(select_map_act.mostCurrent.__c.getField(true,"True"))).getObject())));
 BA.debugLineNum = 116;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_createmenu(RemoteObject _menu) throws Exception{
try {
		Debug.PushSubsStack("Activity_CreateMenu (select_map_act) ","select_map_act",20,select_map_act.mostCurrent.activityBA,select_map_act.mostCurrent,311);
if (RapidSub.canDelegate("activity_createmenu")) { return ir.saelozahra.damaara.mazraeyeman.select_map_act.remoteMe.runUserSub(false, "select_map_act","activity_createmenu", _menu);}
Debug.locals.put("Menu", _menu);
 BA.debugLineNum = 311;BA.debugLine="Sub Activity_CreateMenu(Menu As ACMenu)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 314;BA.debugLine="SV.Initialize2(\"Search\", SV.THEME_DARK)";
Debug.ShouldStop(33554432);
select_map_act.mostCurrent._sv.runVoidMethod ("Initialize2",select_map_act.mostCurrent.activityBA,(Object)(BA.ObjectToString("Search")),(Object)(select_map_act.mostCurrent._sv.getField(true,"THEME_DARK")));
 BA.debugLineNum = 315;BA.debugLine="SV.IconifiedByDefault = True";
Debug.ShouldStop(67108864);
select_map_act.mostCurrent._sv.runMethod(true,"setIconifiedByDefault",select_map_act.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 318;BA.debugLine="Menu.Clear";
Debug.ShouldStop(536870912);
_menu.runVoidMethod ("Clear");
 BA.debugLineNum = 321;BA.debugLine="ActionBar.InitMenuListener";
Debug.ShouldStop(1);
select_map_act.mostCurrent._actionbar.runVoidMethod ("InitMenuListener");
 BA.debugLineNum = 324;BA.debugLine="SI = Menu.Add2(1, 1, \"جستجو\", X1.GetDrawable(\"bas";
Debug.ShouldStop(8);
select_map_act.mostCurrent._si = _menu.runMethod(false,"Add2",(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.ObjectToCharSequence("جستجو")),(Object)(select_map_act.mostCurrent._x1.runMethod(false,"GetDrawable",(Object)(RemoteObject.createImmutable("baseline_search_white_24")))));
 BA.debugLineNum = 325;BA.debugLine="SI.SearchView = SV";
Debug.ShouldStop(16);
select_map_act.mostCurrent._si.runVoidMethod ("setSearchView",select_map_act.mostCurrent._sv);
 BA.debugLineNum = 331;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("Activity_KeyPress (select_map_act) ","select_map_act",20,select_map_act.mostCurrent.activityBA,select_map_act.mostCurrent,265);
if (RapidSub.canDelegate("activity_keypress")) { return ir.saelozahra.damaara.mazraeyeman.select_map_act.remoteMe.runUserSub(false, "select_map_act","activity_keypress", _keycode);}
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 265;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(256);
 BA.debugLineNum = 266;BA.debugLine="If KeyCode==KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, select_map_act.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 267;BA.debugLine="Actionbar_NavigationItemClick";
Debug.ShouldStop(1024);
_actionbar_navigationitemclick();
 BA.debugLineNum = 268;BA.debugLine="Return False";
Debug.ShouldStop(2048);
if (true) return select_map_act.mostCurrent.__c.getField(true,"False");
 }else {
 BA.debugLineNum = 270;BA.debugLine="Return True";
Debug.ShouldStop(8192);
if (true) return select_map_act.mostCurrent.__c.getField(true,"True");
 };
 BA.debugLineNum = 272;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("Activity_Pause (select_map_act) ","select_map_act",20,select_map_act.mostCurrent.activityBA,select_map_act.mostCurrent,140);
if (RapidSub.canDelegate("activity_pause")) { return ir.saelozahra.damaara.mazraeyeman.select_map_act.remoteMe.runUserSub(false, "select_map_act","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 140;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 141;BA.debugLine="CallSubDelayed(Starter, \"StopGPS\")";
Debug.ShouldStop(4096);
select_map_act.mostCurrent.__c.runVoidMethod ("CallSubDelayed",select_map_act.processBA,(Object)((select_map_act.mostCurrent._starter.getObject())),(Object)(RemoteObject.createImmutable("StopGPS")));
 BA.debugLineNum = 142;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (select_map_act) ","select_map_act",20,select_map_act.mostCurrent.activityBA,select_map_act.mostCurrent,119);
if (RapidSub.canDelegate("activity_resume")) { ir.saelozahra.damaara.mazraeyeman.select_map_act.remoteMe.runUserSub(false, "select_map_act","activity_resume"); return;}
ResumableSub_Activity_Resume rsub = new ResumableSub_Activity_Resume(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Activity_Resume extends BA.ResumableSub {
public ResumableSub_Activity_Resume(ir.saelozahra.damaara.mazraeyeman.select_map_act parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.saelozahra.damaara.mazraeyeman.select_map_act parent;
RemoteObject _permission = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (select_map_act) ","select_map_act",20,select_map_act.mostCurrent.activityBA,select_map_act.mostCurrent,119);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 120;BA.debugLine="If Starter.GPS1.GPSEnabled = False Then";
Debug.ShouldStop(8388608);
if (true) break;

case 1:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._starter._gps1 /*RemoteObject*/ .runMethod(true,"getGPSEnabled"),parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 12;
 BA.debugLineNum = 121;BA.debugLine="StartGPS";
Debug.ShouldStop(16777216);
_startgps();
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 123;BA.debugLine="Starter.rp.CheckAndRequest(Starter.rp.PERMISSION";
Debug.ShouldStop(67108864);
parent.mostCurrent._starter._rp /*RemoteObject*/ .runVoidMethod ("CheckAndRequest",select_map_act.processBA,(Object)(parent.mostCurrent._starter._rp /*RemoteObject*/ .getField(true,"PERMISSION_ACCESS_FINE_LOCATION")));
 BA.debugLineNum = 124;BA.debugLine="Wait For Activity_PermissionResult (Permission A";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","activity_permissionresult", select_map_act.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "select_map_act", "activity_resume"), null);
this.state = 13;
return;
case 13:
//C
this.state = 6;
_permission = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Permission", _permission);
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 125;BA.debugLine="If Result Then CallSubDelayed(Starter, \"StartGPS";
Debug.ShouldStop(268435456);
if (true) break;

case 6:
//if
this.state = 11;
if (_result.<Boolean>get().booleanValue()) { 
this.state = 8;
;}if (true) break;

case 8:
//C
this.state = 11;
parent.mostCurrent.__c.runVoidMethod ("CallSubDelayed",select_map_act.processBA,(Object)((parent.mostCurrent._starter.getObject())),(Object)(RemoteObject.createImmutable("StartGPS")));
if (true) break;

case 11:
//C
this.state = 12;
;
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 128;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _activity_permissionresult(RemoteObject _permission,RemoteObject _result) throws Exception{
}
public static RemoteObject  _back_click() throws Exception{
try {
		Debug.PushSubsStack("back_Click (select_map_act) ","select_map_act",20,select_map_act.mostCurrent.activityBA,select_map_act.mostCurrent,275);
if (RapidSub.canDelegate("back_click")) { return ir.saelozahra.damaara.mazraeyeman.select_map_act.remoteMe.runUserSub(false, "select_map_act","back_click");}
 BA.debugLineNum = 275;BA.debugLine="Sub back_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 277;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _change_addressbar_text(RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("change_addressbar_text (select_map_act) ","select_map_act",20,select_map_act.mostCurrent.activityBA,select_map_act.mostCurrent,169);
if (RapidSub.canDelegate("change_addressbar_text")) { return ir.saelozahra.damaara.mazraeyeman.select_map_act.remoteMe.runUserSub(false, "select_map_act","change_addressbar_text", _text);}
Debug.locals.put("text", _text);
 BA.debugLineNum = 169;BA.debugLine="Sub change_addressbar_text(text As String)";
Debug.ShouldStop(256);
 BA.debugLineNum = 170;BA.debugLine="address_bar_lbl.Text=text";
Debug.ShouldStop(512);
select_map_act.mostCurrent._address_bar_lbl.runMethod(true,"setText",BA.ObjectToCharSequence(_text));
 BA.debugLineNum = 171;BA.debugLine="address_bar_lbl.SetVisibleAnimated(313,True)";
Debug.ShouldStop(1024);
select_map_act.mostCurrent._address_bar_lbl.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 313)),(Object)(select_map_act.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 173;BA.debugLine="time=0";
Debug.ShouldStop(4096);
select_map_act._time = BA.numberCast(int.class, 0);
 BA.debugLineNum = 174;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawpolygon(RemoteObject _pointlist) throws Exception{
try {
		Debug.PushSubsStack("DrawPolygon (select_map_act) ","select_map_act",20,select_map_act.mostCurrent.activityBA,select_map_act.mostCurrent,567);
if (RapidSub.canDelegate("drawpolygon")) { return ir.saelozahra.damaara.mazraeyeman.select_map_act.remoteMe.runUserSub(false, "select_map_act","drawpolygon", _pointlist);}
RemoteObject _googlemapsextras1 = RemoteObject.declareNull("uk.co.martinpearman.b4a.googlemapsextras.GoogleMapsExtras");
RemoteObject _polygonoptions1 = RemoteObject.declareNull("uk.co.martinpearman.b4a.com.google.android.gms.maps.model.PolygonOptions");
RemoteObject _pg = RemoteObject.declareNull("uk.co.martinpearman.b4a.com.google.android.gms.maps.model.Polygon");
Debug.locals.put("PointList", _pointlist);
 BA.debugLineNum = 567;BA.debugLine="Sub DrawPolygon(PointList As List)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 568;BA.debugLine="Dim GoogleMapsExtras1 As GoogleMapsExtras";
Debug.ShouldStop(8388608);
_googlemapsextras1 = RemoteObject.createNew ("uk.co.martinpearman.b4a.googlemapsextras.GoogleMapsExtras");Debug.locals.put("GoogleMapsExtras1", _googlemapsextras1);
 BA.debugLineNum = 569;BA.debugLine="Dim polygonoptions1 As PolygonOptions";
Debug.ShouldStop(16777216);
_polygonoptions1 = RemoteObject.createNew ("uk.co.martinpearman.b4a.com.google.android.gms.maps.model.PolygonOptions");Debug.locals.put("polygonoptions1", _polygonoptions1);
 BA.debugLineNum = 570;BA.debugLine="polygonoptions1.Initialize";
Debug.ShouldStop(33554432);
_polygonoptions1.runVoidMethod ("Initialize");
 BA.debugLineNum = 571;BA.debugLine="polygonoptions1.FillColor=0x960C0D6A";
Debug.ShouldStop(67108864);
_polygonoptions1.runMethod(true,"setFillColor",BA.numberCast(int.class, ((int)0x960c0d6a)));
 BA.debugLineNum = 572;BA.debugLine="polygonoptions1.AddPoints(PointList)";
Debug.ShouldStop(134217728);
_polygonoptions1.runVoidMethod ("AddPoints",(Object)(_pointlist));
 BA.debugLineNum = 573;BA.debugLine="polygonoptions1.StrokeColor=Colors.DarkGray";
Debug.ShouldStop(268435456);
_polygonoptions1.runMethod(true,"setStrokeColor",select_map_act.mostCurrent.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 574;BA.debugLine="polygonoptions1.StrokeWidth=3";
Debug.ShouldStop(536870912);
_polygonoptions1.runMethod(true,"setStrokeWidth",BA.numberCast(float.class, 3));
 BA.debugLineNum = 575;BA.debugLine="Dim pg As Polygon = GoogleMapsExtras1.AddPolyg";
Debug.ShouldStop(1073741824);
_pg = RemoteObject.createNew ("uk.co.martinpearman.b4a.com.google.android.gms.maps.model.Polygon");
_pg = _googlemapsextras1.runMethod(false,"AddPolygon",(Object)((select_map_act.mostCurrent._gmap.getObject())),(Object)((_polygonoptions1.getObject())));Debug.locals.put("pg", _pg);Debug.locals.put("pg", _pg);
 BA.debugLineNum = 576;BA.debugLine="pg.FillColor = 0x960C0D6A";
Debug.ShouldStop(-2147483648);
_pg.runMethod(true,"setFillColor",BA.numberCast(int.class, ((int)0x960c0d6a)));
 BA.debugLineNum = 577;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 20;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 21;BA.debugLine="Dim MDialog As MaterialDialogBuilder";
select_map_act.mostCurrent._mdialog = RemoteObject.createNew ("de.amberhome.materialdialogs.MaterialDialogBuilderWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Dim lista_punta,PlaceList As List";
select_map_act.mostCurrent._lista_punta = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
select_map_act.mostCurrent._placelist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 23;BA.debugLine="Dim X1 As XmlLayoutBuilder";
select_map_act.mostCurrent._x1 = RemoteObject.createNew ("anywheresoftware.b4a.object.XmlLayoutBuilder");
 //BA.debugLineNum = 24;BA.debugLine="Dim SV As ACSearchView";
select_map_act.mostCurrent._sv = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACSearchViewWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Dim gmap As GoogleMap";
select_map_act.mostCurrent._gmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.MapFragmentWrapper.GoogleMapWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Dim CP As CameraPosition";
select_map_act.mostCurrent._cp = RemoteObject.createNew ("anywheresoftware.b4a.objects.MapFragmentWrapper.CameraPositionWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Dim MapFragment1 As MapFragment";
select_map_act.mostCurrent._mapfragment1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.MapFragmentWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Dim gme As GoogleMapsExtras";
select_map_act.mostCurrent._gme = RemoteObject.createNew ("uk.co.martinpearman.b4a.googlemapsextras.GoogleMapsExtras");
 //BA.debugLineNum = 29;BA.debugLine="Dim OnMyLocationChangeListener1 As OnMyLocationCh";
select_map_act.mostCurrent._onmylocationchangelistener1 = RemoteObject.createNew ("uk.co.martinpearman.b4a.com.google.android.gms.maps.googlemap.OnMyLocationChangeListener");
 //BA.debugLineNum = 30;BA.debugLine="Dim latlng_old As LatLng";
select_map_act.mostCurrent._latlng_old = RemoteObject.createNew ("anywheresoftware.b4a.objects.MapFragmentWrapper.LatLngWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Dim point As Map";
select_map_act.mostCurrent._point = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 33;BA.debugLine="Dim SearchPlace,get_my_address,GetMyElevationJob";
select_map_act.mostCurrent._searchplace = RemoteObject.createNew ("ir.saelozahra.damaara.mazraeyeman.httpjob");
select_map_act.mostCurrent._get_my_address = RemoteObject.createNew ("ir.saelozahra.damaara.mazraeyeman.httpjob");
select_map_act.mostCurrent._getmyelevationjob = RemoteObject.createNew ("ir.saelozahra.damaara.mazraeyeman.httpjob");
 //BA.debugLineNum = 34;BA.debugLine="Dim Started As Boolean = True";
select_map_act._started = select_map_act.mostCurrent.__c.getField(true,"True");
 //BA.debugLineNum = 35;BA.debugLine="Private address_bar_lbl As Label";
select_map_act.mostCurrent._address_bar_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Dim time,Time2 As Int";
select_map_act._time = RemoteObject.createImmutable(0);
select_map_act._time2 = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 37;BA.debugLine="Private search_et As EditText";
select_map_act.mostCurrent._search_et = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private ActionBar As ACToolBarLight";
select_map_act.mostCurrent._actionbar = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACToolbarLightWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Dim AC As AppCompat";
select_map_act.mostCurrent._ac = RemoteObject.createNew ("de.amberhome.objects.appcompat.AppCompatBase");
 //BA.debugLineNum = 40;BA.debugLine="Dim SI As ACMenuItem";
select_map_act.mostCurrent._si = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACMenuItemWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Private Panel1 As Panel";
select_map_act.mostCurrent._panel1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 42;BA.debugLine="Private MarkerIV As ImageView";
select_map_act.mostCurrent._markeriv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 43;BA.debugLine="Private SelectLocationBTN As Button";
select_map_act.mostCurrent._selectlocationbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _gotomylocation() throws Exception{
try {
		Debug.PushSubsStack("goToMyLocation (select_map_act) ","select_map_act",20,select_map_act.mostCurrent.activityBA,select_map_act.mostCurrent,148);
if (RapidSub.canDelegate("gotomylocation")) { return ir.saelozahra.damaara.mazraeyeman.select_map_act.remoteMe.runUserSub(false, "select_map_act","gotomylocation");}
 BA.debugLineNum = 148;BA.debugLine="Sub goToMyLocation";
Debug.ShouldStop(524288);
 BA.debugLineNum = 150;BA.debugLine="If Starter.gpsStarted Then";
Debug.ShouldStop(2097152);
if (select_map_act.mostCurrent._starter._gpsstarted /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 151;BA.debugLine="CP.Initialize( myLocation.Latitude, myLocation.L";
Debug.ShouldStop(4194304);
select_map_act.mostCurrent._cp.runVoidMethod ("Initialize",(Object)(select_map_act._mylocation.runMethod(true,"getLatitude")),(Object)(select_map_act._mylocation.runMethod(true,"getLongitude")),(Object)(BA.numberCast(float.class, 14)));
 BA.debugLineNum = 152;BA.debugLine="gmap.AnimateCamera(CP)";
Debug.ShouldStop(8388608);
select_map_act.mostCurrent._gmap.runVoidMethod ("AnimateCamera",(Object)((select_map_act.mostCurrent._cp.getObject())));
 BA.debugLineNum = 153;BA.debugLine="Log(\"Go To My Location\")";
Debug.ShouldStop(16777216);
select_map_act.mostCurrent.__c.runVoidMethod ("LogImpl","420447237",RemoteObject.createImmutable("Go To My Location"),0);
 BA.debugLineNum = 154;BA.debugLine="CallSubDelayed(Starter, \"StopGps\")";
Debug.ShouldStop(33554432);
select_map_act.mostCurrent.__c.runVoidMethod ("CallSubDelayed",select_map_act.processBA,(Object)((select_map_act.mostCurrent._starter.getObject())),(Object)(RemoteObject.createImmutable("StopGps")));
 };
 BA.debugLineNum = 157;BA.debugLine="If Started Then";
Debug.ShouldStop(268435456);
if (select_map_act._started.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 159;BA.debugLine="Started=False";
Debug.ShouldStop(1073741824);
select_map_act._started = select_map_act.mostCurrent.__c.getField(true,"False");
 };
 BA.debugLineNum = 162;BA.debugLine="If Starter.GPS1.GPSEnabled Then";
Debug.ShouldStop(2);
if (select_map_act.mostCurrent._starter._gps1 /*RemoteObject*/ .runMethod(true,"getGPSEnabled").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 163;BA.debugLine="gmap.MyLocationEnabled=True";
Debug.ShouldStop(4);
select_map_act.mostCurrent._gmap.runMethod(true,"setMyLocationEnabled",select_map_act.mostCurrent.__c.getField(true,"True"));
 };
 BA.debugLineNum = 166;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (select_map_act) ","select_map_act",20,select_map_act.mostCurrent.activityBA,select_map_act.mostCurrent,378);
if (RapidSub.canDelegate("jobdone")) { return ir.saelozahra.damaara.mazraeyeman.select_map_act.remoteMe.runUserSub(false, "select_map_act","jobdone", _job);}
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _tempdialognames = null;
RemoteObject _tempdialogid = RemoteObject.createImmutable(0);
RemoteObject _colroot = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _co = RemoteObject.declareNull("uk.co.martinpearman.b4a.com.google.android.gms.maps.model.CircleOptions");
RemoteObject _tempmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 378;BA.debugLine="Sub JobDone(Job As HttpJob)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 379;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(67108864);
select_map_act.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 380;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(134217728);
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 381;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(268435456);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("SearchPlace"))) {
case 0: {
 BA.debugLineNum = 387;BA.debugLine="If Job.GetString==\"{\"\"html_attributions\"\" : []";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_getstring" /*RemoteObject*/ ),BA.ObjectToString("{\"html_attributions\" : [],\"results\" : [],\"status\" : \"ZERO_RESULTS\"}")) || RemoteObject.solveBoolean("=",_job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_getstring" /*RemoteObject*/ ),BA.ObjectToString("{\"error\":\"Unable to geocode\"}"))) { 
 BA.debugLineNum = 388;BA.debugLine="ToastMessageShow(\"نتیجه ای یافت نشد\",True)";
Debug.ShouldStop(8);
select_map_act.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("نتیجه ای یافت نشد")),(Object)(select_map_act.mostCurrent.__c.getField(true,"True")));
 }else {
 BA.debugLineNum = 391;BA.debugLine="PlaceList.Initialize";
Debug.ShouldStop(64);
select_map_act.mostCurrent._placelist.runVoidMethod ("Initialize");
 BA.debugLineNum = 394;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(512);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 395;BA.debugLine="parser.Initialize(Job.GetString)";
Debug.ShouldStop(1024);
_parser.runVoidMethod ("Initialize",(Object)(_job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 396;BA.debugLine="Dim root As List = parser.NextArray";
Debug.ShouldStop(2048);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_root = _parser.runMethod(false,"NextArray");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 397;BA.debugLine="Dim tempDialogNames(root.Size) As String";
Debug.ShouldStop(4096);
_tempdialognames = RemoteObject.createNewArray ("String", new int[] {_root.runMethod(true,"getSize").<Integer>get().intValue()}, new Object[]{});Debug.locals.put("tempDialogNames", _tempdialognames);
 BA.debugLineNum = 398;BA.debugLine="Dim tempDialogId As Int = 0";
Debug.ShouldStop(8192);
_tempdialogid = BA.numberCast(int.class, 0);Debug.locals.put("tempDialogId", _tempdialogid);Debug.locals.put("tempDialogId", _tempdialogid);
 BA.debugLineNum = 399;BA.debugLine="For Each colroot As Map In root";
Debug.ShouldStop(16384);
_colroot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group14 = _root;
final int groupLen14 = group14.runMethod(true,"getSize").<Integer>get()
;int index14 = 0;
;
for (; index14 < groupLen14;index14++){
_colroot = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group14.runMethod(false,"Get",index14));Debug.locals.put("colroot", _colroot);
Debug.locals.put("colroot", _colroot);
 BA.debugLineNum = 400;BA.debugLine="lista_punta.Initialize";
Debug.ShouldStop(32768);
select_map_act.mostCurrent._lista_punta.runVoidMethod ("Initialize");
 BA.debugLineNum = 413;BA.debugLine="Dim co As CircleOptions";
Debug.ShouldStop(268435456);
_co = RemoteObject.createNew ("uk.co.martinpearman.b4a.com.google.android.gms.maps.model.CircleOptions");Debug.locals.put("co", _co);
 BA.debugLineNum = 414;BA.debugLine="co.Initialize";
Debug.ShouldStop(536870912);
_co.runVoidMethod ("Initialize");
 BA.debugLineNum = 415;BA.debugLine="co.Center2(colroot.Get(\"lat\"),colroot.Get(\"l";
Debug.ShouldStop(1073741824);
_co.runVoidMethod ("Center2",(Object)(BA.numberCast(double.class, _colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lat")))))),(Object)(BA.numberCast(double.class, _colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lon")))))));
 BA.debugLineNum = 416;BA.debugLine="co.FillColor(0x5CFFFFFF)";
Debug.ShouldStop(-2147483648);
_co.runVoidMethod ("FillColor",(Object)(BA.numberCast(int.class, ((int)0x5cffffff))));
 BA.debugLineNum = 417;BA.debugLine="co.Radius(202)";
Debug.ShouldStop(1);
_co.runVoidMethod ("Radius",(Object)(BA.numberCast(double.class, 202)));
 BA.debugLineNum = 418;BA.debugLine="co.StrokeWidth(3)";
Debug.ShouldStop(2);
_co.runVoidMethod ("StrokeWidth",(Object)(BA.numberCast(float.class, 3)));
 BA.debugLineNum = 419;BA.debugLine="co.StrokeColor(SaeloZahra.ColorDark)";
Debug.ShouldStop(4);
_co.runVoidMethod ("StrokeColor",(Object)(select_map_act.mostCurrent._saelozahra._colordark /*RemoteObject*/ ));
 BA.debugLineNum = 420;BA.debugLine="gme.AddCircle(gmap,co)";
Debug.ShouldStop(8);
select_map_act.mostCurrent._gme.runVoidMethod ("AddCircle",(Object)((select_map_act.mostCurrent._gmap.getObject())),(Object)((_co.getObject())));
 BA.debugLineNum = 422;BA.debugLine="Dim TempMap As Map : TempMap.Initialize";
Debug.ShouldStop(32);
_tempmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("TempMap", _tempmap);
 BA.debugLineNum = 422;BA.debugLine="Dim TempMap As Map : TempMap.Initialize";
Debug.ShouldStop(32);
_tempmap.runVoidMethod ("Initialize");
 BA.debugLineNum = 423;BA.debugLine="TempMap.Put(\"address\", colroot.Get(\"display_";
Debug.ShouldStop(64);
_tempmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("address"))),(Object)(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("display_name"))))));
 BA.debugLineNum = 424;BA.debugLine="TempMap.Put(\"icon\", colroot.Get(\"icon\"))";
Debug.ShouldStop(128);
_tempmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("icon"))),(Object)(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("icon"))))));
 BA.debugLineNum = 425;BA.debugLine="TempMap.Put(\"name\", colroot.Get(\"display_nam";
Debug.ShouldStop(256);
_tempmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("name"))),(Object)(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("display_name"))))));
 BA.debugLineNum = 427;BA.debugLine="TempMap.Put(\"lat\", colroot.Get(\"lat\"))";
Debug.ShouldStop(1024);
_tempmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lat"))),(Object)(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lat"))))));
 BA.debugLineNum = 428;BA.debugLine="TempMap.Put(\"lng\", colroot.Get(\"lon\"))";
Debug.ShouldStop(2048);
_tempmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lng"))),(Object)(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lon"))))));
 BA.debugLineNum = 430;BA.debugLine="tempDialogNames(tempDialogId)=TempMap.Get(\"n";
Debug.ShouldStop(8192);
_tempdialognames.setArrayElement (BA.ObjectToString(_tempmap.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name"))))),_tempdialogid);
 BA.debugLineNum = 431;BA.debugLine="tempDialogId=tempDialogId+1";
Debug.ShouldStop(16384);
_tempdialogid = RemoteObject.solve(new RemoteObject[] {_tempdialogid,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("tempDialogId", _tempdialogid);
 BA.debugLineNum = 432;BA.debugLine="PlaceList.Add(TempMap)";
Debug.ShouldStop(32768);
select_map_act.mostCurrent._placelist.runVoidMethod ("Add",(Object)((_tempmap.getObject())));
 }
}Debug.locals.put("colroot", _colroot);
;
 };
 BA.debugLineNum = 463;BA.debugLine="MDialog.Initialize(\"MDialog\")";
Debug.ShouldStop(16384);
select_map_act.mostCurrent._mdialog.runVoidMethod ("Initialize",select_map_act.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("MDialog")));
 BA.debugLineNum = 464;BA.debugLine="MDialog.Title(\"جستجو\")";
Debug.ShouldStop(32768);
select_map_act.mostCurrent._mdialog.runVoidMethod ("Title",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("جستجو"))));
 BA.debugLineNum = 465;BA.debugLine="MDialog.Content(\"یکی از مکان های زیر را انتخاب";
Debug.ShouldStop(65536);
select_map_act.mostCurrent._mdialog.runVoidMethod ("Content",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("یکی از مکان های زیر را انتخاب کنید"))));
 BA.debugLineNum = 466;BA.debugLine="MDialog.ButtonRippleColor(SaeloZahra.ColorLigh";
Debug.ShouldStop(131072);
select_map_act.mostCurrent._mdialog.runVoidMethod ("ButtonRippleColor",(Object)(select_map_act.mostCurrent._saelozahra._colorlight /*RemoteObject*/ ));
 BA.debugLineNum = 467;BA.debugLine="MDialog.Typeface(SaeloZahra.font,SaeloZahra.fo";
Debug.ShouldStop(262144);
select_map_act.mostCurrent._mdialog.runVoidMethod ("Typeface",(Object)((select_map_act.mostCurrent._saelozahra._font /*RemoteObject*/ .getObject())),(Object)((select_map_act.mostCurrent._saelozahra._font /*RemoteObject*/ .getObject())));
 BA.debugLineNum = 468;BA.debugLine="MDialog.ItemsCallback";
Debug.ShouldStop(524288);
select_map_act.mostCurrent._mdialog.runVoidMethod ("ItemsCallback");
 BA.debugLineNum = 469;BA.debugLine="MDialog.Items(tempDialogNames)";
Debug.ShouldStop(1048576);
select_map_act.mostCurrent._mdialog.runVoidMethod ("Items",(Object)((_tempdialognames)));
 BA.debugLineNum = 470;BA.debugLine="MDialog.Show";
Debug.ShouldStop(2097152);
select_map_act.mostCurrent._mdialog.runVoidMethod ("Show");
 break; }
}
;
 }else {
 BA.debugLineNum = 474;BA.debugLine="ToastMessageShow(SaeloZahra.CSB(\"خطا در تکمیل در";
Debug.ShouldStop(33554432);
select_map_act.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(select_map_act.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,select_map_act.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("خطا در تکمیل درخواست..."))).getObject())),(Object)(select_map_act.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 476;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _mapfragment1_camerachange(RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("MapFragment1_CameraChange (select_map_act) ","select_map_act",20,select_map_act.mostCurrent.activityBA,select_map_act.mostCurrent,187);
if (RapidSub.canDelegate("mapfragment1_camerachange")) { ir.saelozahra.damaara.mazraeyeman.select_map_act.remoteMe.runUserSub(false, "select_map_act","mapfragment1_camerachange", _position); return;}
ResumableSub_MapFragment1_CameraChange rsub = new ResumableSub_MapFragment1_CameraChange(null,_position);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_MapFragment1_CameraChange extends BA.ResumableSub {
public ResumableSub_MapFragment1_CameraChange(ir.saelozahra.damaara.mazraeyeman.select_map_act parent,RemoteObject _position) {
this.parent = parent;
this._position = _position;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.saelozahra.damaara.mazraeyeman.select_map_act parent;
RemoteObject _position;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("MapFragment1_CameraChange (select_map_act) ","select_map_act",20,select_map_act.mostCurrent.activityBA,select_map_act.mostCurrent,187);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("Position", _position);
 BA.debugLineNum = 189;BA.debugLine="If Time2>20 Then";
Debug.ShouldStop(268435456);
if (true) break;

case 1:
//if
this.state = 18;
if (RemoteObject.solveBoolean(">",parent._time2,BA.numberCast(double.class, 20))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 191;BA.debugLine="Time2 = 0";
Debug.ShouldStop(1073741824);
parent._time2 = BA.numberCast(int.class, 0);
 BA.debugLineNum = 192;BA.debugLine="MarkerIV.SetLayoutAnimated(10,MarkerIV.Left+5dip";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._markeriv.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 10)),(Object)(RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._markeriv.runMethod(true,"getLeft"),parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "+",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._markeriv.runMethod(true,"getTop"),parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 18)))}, "-",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._markeriv.runMethod(true,"getWidth"),parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "-",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._markeriv.runMethod(true,"getHeight"),parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "-",1, 1)));
 BA.debugLineNum = 193;BA.debugLine="MarkerIV.SetBackgroundImage(LoadBitmapResize(Fil";
Debug.ShouldStop(1);
parent.mostCurrent._markeriv.runVoidMethod ("SetBackgroundImageNew",(Object)((parent.mostCurrent.__c.runMethod(false,"LoadBitmapResize",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("location.png")),(Object)(parent.mostCurrent._markeriv.runMethod(true,"getWidth")),(Object)(parent.mostCurrent._markeriv.runMethod(true,"getHeight")),(Object)(parent.mostCurrent.__c.getField(true,"True"))).getObject())));
 BA.debugLineNum = 195;BA.debugLine="If SaeloZahra.CheckConnection Then";
Debug.ShouldStop(4);
if (true) break;

case 4:
//if
this.state = 9;
if (parent.mostCurrent._saelozahra.runMethod(true,"_checkconnection" /*RemoteObject*/ ,select_map_act.mostCurrent.activityBA).<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 196;BA.debugLine="get_my_address.Download(\"https://us1.locationiq";
Debug.ShouldStop(8);
parent.mostCurrent._get_my_address.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("https://us1.locationiq.com/v1/reverse.php?key=50f886904c60e7&lat="),_position.runMethod(false,"getTarget").runMethod(true,"getLatitude"),RemoteObject.createImmutable("&lon="),_position.runMethod(false,"getTarget").runMethod(true,"getLongitude"),RemoteObject.createImmutable("&accept-language=fa&format=json"))));
 BA.debugLineNum = 198;BA.debugLine="LogColor(\"https://us1.locationiq.com/v1/reverse";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","420709387",RemoteObject.concat(RemoteObject.createImmutable("https://us1.locationiq.com/v1/reverse.php?key=50f886904c60e7&lat="),_position.runMethod(false,"getTarget").runMethod(true,"getLatitude"),RemoteObject.createImmutable("&lon="),_position.runMethod(false,"getTarget").runMethod(true,"getLongitude"),RemoteObject.createImmutable("&accept-language=fa&format=json")),parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Yellow"));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 200;BA.debugLine="address_bar_lbl.SetVisibleAnimated(313,False)";
Debug.ShouldStop(128);
parent.mostCurrent._address_bar_lbl.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 313)),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 if (true) break;

case 9:
//C
this.state = 10;
;
 BA.debugLineNum = 203;BA.debugLine="Sleep(50)";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("Sleep",select_map_act.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "select_map_act", "mapfragment1_camerachange"),BA.numberCast(int.class, 50));
this.state = 19;
return;
case 19:
//C
this.state = 10;
;
 BA.debugLineNum = 204;BA.debugLine="MarkerIV.SetLayoutAnimated(202,MarkerIV.Left-5di";
Debug.ShouldStop(2048);
parent.mostCurrent._markeriv.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 202)),(Object)(RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._markeriv.runMethod(true,"getLeft"),parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "-",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._markeriv.runMethod(true,"getTop"),parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 18)))}, "+",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._markeriv.runMethod(true,"getWidth"),parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "+",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._markeriv.runMethod(true,"getHeight"),parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "+",1, 1)));
 BA.debugLineNum = 205;BA.debugLine="MarkerIV.SetBackgroundImage(LoadBitmapResize(Fil";
Debug.ShouldStop(4096);
parent.mostCurrent._markeriv.runVoidMethod ("SetBackgroundImageNew",(Object)((parent.mostCurrent.__c.runMethod(false,"LoadBitmapResize",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("location.png")),(Object)(parent.mostCurrent._markeriv.runMethod(true,"getWidth")),(Object)(parent.mostCurrent._markeriv.runMethod(true,"getHeight")),(Object)(parent.mostCurrent.__c.getField(true,"True"))).getObject())));
 BA.debugLineNum = 207;BA.debugLine="MarkerIV.Tag=CreateMap(\"lat\":Position.Target.Lat";
Debug.ShouldStop(16384);
parent.mostCurrent._markeriv.runMethod(false,"setTag",(parent.mostCurrent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("lat")),(_position.runMethod(false,"getTarget").runMethod(true,"getLatitude")),RemoteObject.createImmutable(("lng")),(_position.runMethod(false,"getTarget").runMethod(true,"getLongitude"))})).getObject()));
 BA.debugLineNum = 208;BA.debugLine="point = CreateMap(\"lat\":Position.Target.Latitude";
Debug.ShouldStop(32768);
parent.mostCurrent._point = parent.mostCurrent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("lat")),(_position.runMethod(false,"getTarget").runMethod(true,"getLatitude")),RemoteObject.createImmutable(("lng")),(_position.runMethod(false,"getTarget").runMethod(true,"getLongitude"))}));
 BA.debugLineNum = 209;BA.debugLine="If WhatLove==\"gheshlagh\" Then";
Debug.ShouldStop(65536);
if (true) break;

case 10:
//if
this.state = 17;
if (RemoteObject.solveBoolean("=",parent._whatlove,BA.ObjectToString("gheshlagh"))) { 
this.state = 12;
}else 
{ BA.debugLineNum = 212;BA.debugLine="Else If WhatLove==\"yeylagh\" Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",parent._whatlove,BA.ObjectToString("yeylagh"))) { 
this.state = 14;
}else {
this.state = 16;
}}
if (true) break;

case 12:
//C
this.state = 17;
 BA.debugLineNum = 210;BA.debugLine="gheshlagh_lat = Position.Target.Latitude";
Debug.ShouldStop(131072);
parent._gheshlagh_lat = _position.runMethod(false,"getTarget").runMethod(true,"getLatitude");
 BA.debugLineNum = 211;BA.debugLine="gheshlagh_lng = Position.Target.Longitude";
Debug.ShouldStop(262144);
parent._gheshlagh_lng = _position.runMethod(false,"getTarget").runMethod(true,"getLongitude");
 if (true) break;

case 14:
//C
this.state = 17;
 BA.debugLineNum = 213;BA.debugLine="yeylagh_lat = Position.Target.Latitude";
Debug.ShouldStop(1048576);
parent._yeylagh_lat = _position.runMethod(false,"getTarget").runMethod(true,"getLatitude");
 BA.debugLineNum = 214;BA.debugLine="yeylagh_lng = Position.Target.Longitude";
Debug.ShouldStop(2097152);
parent._yeylagh_lng = _position.runMethod(false,"getTarget").runMethod(true,"getLongitude");
 if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 216;BA.debugLine="place_lat = Position.Target.Latitude";
Debug.ShouldStop(8388608);
parent._place_lat = _position.runMethod(false,"getTarget").runMethod(true,"getLatitude");
 BA.debugLineNum = 217;BA.debugLine="place_lng = Position.Target.Longitude";
Debug.ShouldStop(16777216);
parent._place_lng = _position.runMethod(false,"getTarget").runMethod(true,"getLongitude");
 if (true) break;

case 17:
//C
this.state = 18;
;
 if (true) break;

case 18:
//C
this.state = -1;
;
 BA.debugLineNum = 222;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _mapfragment1_longclick(RemoteObject _mpoint) throws Exception{
try {
		Debug.PushSubsStack("MapFragment1_LongClick (select_map_act) ","select_map_act",20,select_map_act.mostCurrent.activityBA,select_map_act.mostCurrent,554);
if (RapidSub.canDelegate("mapfragment1_longclick")) { return ir.saelozahra.damaara.mazraeyeman.select_map_act.remoteMe.runUserSub(false, "select_map_act","mapfragment1_longclick", _mpoint);}
Debug.locals.put("mPoint", _mpoint);
 BA.debugLineNum = 554;BA.debugLine="Sub MapFragment1_LongClick (mPoint As LatLng)";
Debug.ShouldStop(512);
 BA.debugLineNum = 556;BA.debugLine="gmap.AddMarker3(mPoint.Latitude,mPoint.Longitude,";
Debug.ShouldStop(2048);
select_map_act.mostCurrent._gmap.runMethod(false,"AddMarker3",(Object)(_mpoint.runMethod(true,"getLatitude")),(Object)(_mpoint.runMethod(true,"getLongitude")),(Object)(select_map_act.mostCurrent._address_bar_lbl.runMethod(true,"getText")),(Object)((select_map_act.mostCurrent._saelozahra.runMethod(false,"_setbitmapdensity" /*RemoteObject*/ ,select_map_act.mostCurrent.activityBA,(Object)(select_map_act.mostCurrent.__c.runMethod(false,"LoadBitmapResize",(Object)(select_map_act.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("location.png")),(Object)(select_map_act.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 18)))),(Object)(select_map_act.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 18)))),(Object)(select_map_act.mostCurrent.__c.getField(true,"True"))))).getObject()))).runMethod(true,"setInfoWindowShown",select_map_act.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 558;BA.debugLine="lista_punta.Add(mPoint)";
Debug.ShouldStop(8192);
select_map_act.mostCurrent._lista_punta.runVoidMethod ("Add",(Object)((_mpoint.getObject())));
 BA.debugLineNum = 559;BA.debugLine="If lista_punta.Size = 6 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",select_map_act.mostCurrent._lista_punta.runMethod(true,"getSize"),BA.numberCast(double.class, 6))) { 
 BA.debugLineNum = 560;BA.debugLine="DrawPolygon(lista_punta)";
Debug.ShouldStop(32768);
_drawpolygon(select_map_act.mostCurrent._lista_punta);
 };
 BA.debugLineNum = 563;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mapfragment1_ready() throws Exception{
try {
		Debug.PushSubsStack("MapFragment1_Ready (select_map_act) ","select_map_act",20,select_map_act.mostCurrent.activityBA,select_map_act.mostCurrent,225);
if (RapidSub.canDelegate("mapfragment1_ready")) { return ir.saelozahra.damaara.mazraeyeman.select_map_act.remoteMe.runUserSub(false, "select_map_act","mapfragment1_ready");}
 BA.debugLineNum = 225;BA.debugLine="Sub MapFragment1_Ready";
Debug.ShouldStop(1);
 BA.debugLineNum = 227;BA.debugLine="Log(\"map ready\")";
Debug.ShouldStop(4);
select_map_act.mostCurrent.__c.runVoidMethod ("LogImpl","420774914",RemoteObject.createImmutable("map ready"),0);
 BA.debugLineNum = 229;BA.debugLine="gmap = MapFragment1.GetMap";
Debug.ShouldStop(16);
select_map_act.mostCurrent._gmap = select_map_act.mostCurrent._mapfragment1.runMethod(false,"GetMap");
 BA.debugLineNum = 231;BA.debugLine="If Not(gmap.IsInitialized) Then";
Debug.ShouldStop(64);
if (select_map_act.mostCurrent.__c.runMethod(true,"Not",(Object)(select_map_act.mostCurrent._gmap.runMethod(true,"IsInitialized"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 232;BA.debugLine="ToastMessageShow(\"نتوانستیم نقشه را نصب کنیم\", T";
Debug.ShouldStop(128);
select_map_act.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("نتوانستیم نقشه را نصب کنیم")),(Object)(select_map_act.mostCurrent.__c.getField(true,"True")));
 }else {
 BA.debugLineNum = 234;BA.debugLine="latlng_old.Initialize(myLocation.Latitude,myLoca";
Debug.ShouldStop(512);
select_map_act.mostCurrent._latlng_old.runVoidMethod ("Initialize",(Object)(select_map_act._mylocation.runMethod(true,"getLatitude")),(Object)(select_map_act._mylocation.runMethod(true,"getLongitude")));
 BA.debugLineNum = 236;BA.debugLine="CP.Initialize( myLocation.Latitude, myLocation.L";
Debug.ShouldStop(2048);
select_map_act.mostCurrent._cp.runVoidMethod ("Initialize",(Object)(select_map_act._mylocation.runMethod(true,"getLatitude")),(Object)(select_map_act._mylocation.runMethod(true,"getLongitude")),(Object)(BA.numberCast(float.class, 13)));
 BA.debugLineNum = 237;BA.debugLine="gmap.AnimateCamera(CP)";
Debug.ShouldStop(4096);
select_map_act.mostCurrent._gmap.runVoidMethod ("AnimateCamera",(Object)((select_map_act.mostCurrent._cp.getObject())));
 BA.debugLineNum = 238;BA.debugLine="latlng_old.Initialize(myLocation.Latitude,myLoca";
Debug.ShouldStop(8192);
select_map_act.mostCurrent._latlng_old.runVoidMethod ("Initialize",(Object)(select_map_act._mylocation.runMethod(true,"getLatitude")),(Object)(select_map_act._mylocation.runMethod(true,"getLongitude")));
 BA.debugLineNum = 240;BA.debugLine="Log(\"Go To My Location: \"&myLocation.Latitude&\",";
Debug.ShouldStop(32768);
select_map_act.mostCurrent.__c.runVoidMethod ("LogImpl","420774927",RemoteObject.concat(RemoteObject.createImmutable("Go To My Location: "),select_map_act._mylocation.runMethod(true,"getLatitude"),RemoteObject.createImmutable(","),select_map_act._mylocation.runMethod(true,"getLongitude")),0);
 };
 BA.debugLineNum = 243;BA.debugLine="SaeloZahra.ChangeGooglemapStyle(File.ReadString(F";
Debug.ShouldStop(262144);
select_map_act.mostCurrent._saelozahra.runVoidMethod ("_changegooglemapstyle" /*RemoteObject*/ ,select_map_act.mostCurrent.activityBA,(Object)(select_map_act.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(select_map_act.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("googlemapstyle.txt")))),(Object)(select_map_act.mostCurrent._gmap));
 BA.debugLineNum = 245;BA.debugLine="OnMyLocationChangeListener1.Initialize(\"OnMyLocat";
Debug.ShouldStop(1048576);
select_map_act.mostCurrent._onmylocationchangelistener1.runVoidMethod ("Initialize",select_map_act.processBA,(Object)(RemoteObject.createImmutable("OnMyLocationChangeListener1")));
 BA.debugLineNum = 246;BA.debugLine="gme.SetOnMyLocationChangeListener( gmap , OnMyLoc";
Debug.ShouldStop(2097152);
select_map_act.mostCurrent._gme.runVoidMethod ("SetOnMyLocationChangeListener",(Object)((select_map_act.mostCurrent._gmap.getObject())),(Object)((select_map_act.mostCurrent._onmylocationchangelistener1.getObject())));
 BA.debugLineNum = 248;BA.debugLine="lista_punta.Initialize";
Debug.ShouldStop(8388608);
select_map_act.mostCurrent._lista_punta.runVoidMethod ("Initialize");
 BA.debugLineNum = 250;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mdialog_itemselected(RemoteObject _dialog,RemoteObject _position,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("MDialog_ItemSelected (select_map_act) ","select_map_act",20,select_map_act.mostCurrent.activityBA,select_map_act.mostCurrent,478);
if (RapidSub.canDelegate("mdialog_itemselected")) { return ir.saelozahra.damaara.mazraeyeman.select_map_act.remoteMe.runUserSub(false, "select_map_act","mdialog_itemselected", _dialog, _position, _text);}
RemoteObject _map2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Dialog", _dialog);
Debug.locals.put("Position", _position);
Debug.locals.put("Text", _text);
 BA.debugLineNum = 478;BA.debugLine="Sub MDialog_ItemSelected (Dialog As MaterialDialog";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 480;BA.debugLine="Dim map2 As Map = PlaceList.Get(Position)";
Debug.ShouldStop(-2147483648);
_map2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_map2 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), select_map_act.mostCurrent._placelist.runMethod(false,"Get",(Object)(_position)));Debug.locals.put("map2", _map2);Debug.locals.put("map2", _map2);
 BA.debugLineNum = 481;BA.debugLine="CP.Initialize(map2.Get(\"lat\"),map2.Get(\"lng\"),17)";
Debug.ShouldStop(1);
select_map_act.mostCurrent._cp.runVoidMethod ("Initialize",(Object)(BA.numberCast(double.class, _map2.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lat")))))),(Object)(BA.numberCast(double.class, _map2.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lng")))))),(Object)(BA.numberCast(float.class, 17)));
 BA.debugLineNum = 482;BA.debugLine="gmap.AnimateCamera(CP)";
Debug.ShouldStop(2);
select_map_act.mostCurrent._gmap.runVoidMethod ("AnimateCamera",(Object)((select_map_act.mostCurrent._cp.getObject())));
 BA.debugLineNum = 484;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _onmylocationchangelistener1_mylocationchange(RemoteObject _location1) throws Exception{
try {
		Debug.PushSubsStack("OnMyLocationChangeListener1_MyLocationChange (select_map_act) ","select_map_act",20,select_map_act.mostCurrent.activityBA,select_map_act.mostCurrent,252);
if (RapidSub.canDelegate("onmylocationchangelistener1_mylocationchange")) { return ir.saelozahra.damaara.mazraeyeman.select_map_act.remoteMe.runUserSub(false, "select_map_act","onmylocationchangelistener1_mylocationchange", _location1);}
Debug.locals.put("Location1", _location1);
 BA.debugLineNum = 252;BA.debugLine="Sub OnMyLocationChangeListener1_MyLocationChange(L";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 253;BA.debugLine="myLocation = Location1";
Debug.ShouldStop(268435456);
select_map_act._mylocation = _location1;
 BA.debugLineNum = 254;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
 //BA.debugLineNum = 10;BA.debugLine="Dim myLocation As Location";
select_map_act._mylocation = RemoteObject.createNew ("anywheresoftware.b4a.gps.LocationWrapper");
 //BA.debugLineNum = 11;BA.debugLine="Dim t,T2 As Timer";
select_map_act._t = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
select_map_act._t2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 12;BA.debugLine="Dim WhatLove As String";
select_map_act._whatlove = RemoteObject.createImmutable("");
 //BA.debugLineNum = 14;BA.debugLine="Dim place_lat,place_lng As Double";
select_map_act._place_lat = RemoteObject.createImmutable(0);
select_map_act._place_lng = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 15;BA.debugLine="Dim gheshlagh_lat,gheshlagh_lng As Double";
select_map_act._gheshlagh_lat = RemoteObject.createImmutable(0);
select_map_act._gheshlagh_lng = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 16;BA.debugLine="Dim yeylagh_lat,yeylagh_lng As Double";
select_map_act._yeylagh_lat = RemoteObject.createImmutable(0);
select_map_act._yeylagh_lng = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _search_closed() throws Exception{
try {
		Debug.PushSubsStack("Search_Closed (select_map_act) ","select_map_act",20,select_map_act.mostCurrent.activityBA,select_map_act.mostCurrent,335);
if (RapidSub.canDelegate("search_closed")) { return ir.saelozahra.damaara.mazraeyeman.select_map_act.remoteMe.runUserSub(false, "select_map_act","search_closed");}
 BA.debugLineNum = 335;BA.debugLine="Sub Search_Closed";
Debug.ShouldStop(16384);
 BA.debugLineNum = 336;BA.debugLine="Log(\"SearchView closed\")";
Debug.ShouldStop(32768);
select_map_act.mostCurrent.__c.runVoidMethod ("LogImpl","421168129",RemoteObject.createImmutable("SearchView closed"),0);
 BA.debugLineNum = 337;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _search_et_enterpressed() throws Exception{
try {
		Debug.PushSubsStack("search_et_EnterPressed (select_map_act) ","select_map_act",20,select_map_act.mostCurrent.activityBA,select_map_act.mostCurrent,346);
if (RapidSub.canDelegate("search_et_enterpressed")) { return ir.saelozahra.damaara.mazraeyeman.select_map_act.remoteMe.runUserSub(false, "select_map_act","search_et_enterpressed");}
 BA.debugLineNum = 346;BA.debugLine="Sub search_et_EnterPressed";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 347;BA.debugLine="Search_QuerySubmitted(search_et.Text)";
Debug.ShouldStop(67108864);
_search_querysubmitted(select_map_act.mostCurrent._search_et.runMethod(true,"getText"));
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
public static RemoteObject  _search_querysubmitted(RemoteObject _query) throws Exception{
try {
		Debug.PushSubsStack("Search_QuerySubmitted (select_map_act) ","select_map_act",20,select_map_act.mostCurrent.activityBA,select_map_act.mostCurrent,350);
if (RapidSub.canDelegate("search_querysubmitted")) { return ir.saelozahra.damaara.mazraeyeman.select_map_act.remoteMe.runUserSub(false, "select_map_act","search_querysubmitted", _query);}
RemoteObject _keyword = RemoteObject.createImmutable("");
Debug.locals.put("Query", _query);
 BA.debugLineNum = 350;BA.debugLine="Sub Search_QuerySubmitted (Query As String)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 352;BA.debugLine="Log(\"Search for '\" & Query & \"'\")";
Debug.ShouldStop(-2147483648);
select_map_act.mostCurrent.__c.runVoidMethod ("LogImpl","421299202",RemoteObject.concat(RemoteObject.createImmutable("Search for '"),_query,RemoteObject.createImmutable("'")),0);
 BA.debugLineNum = 354;BA.debugLine="Dim KeyWord As String = Query.Trim";
Debug.ShouldStop(2);
_keyword = _query.runMethod(true,"trim");Debug.locals.put("KeyWord", _keyword);Debug.locals.put("KeyWord", _keyword);
 BA.debugLineNum = 355;BA.debugLine="If KeyWord = \"\" Then Return 'Exit when keyword is";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_keyword,BA.ObjectToString(""))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 356;BA.debugLine="KeyWord = KeyWord.Replace(\" \", \"+\") 'Required to";
Debug.ShouldStop(8);
_keyword = _keyword.runMethod(true,"replace",(Object)(BA.ObjectToString(" ")),(Object)(RemoteObject.createImmutable("+")));Debug.locals.put("KeyWord", _keyword);
 BA.debugLineNum = 357;BA.debugLine="ProgressDialogShow(SaeloZahra.csb(\"در حال جستجو..";
Debug.ShouldStop(16);
select_map_act.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",select_map_act.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(select_map_act.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,select_map_act.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("در حال جستجو..."))).getObject())));
 BA.debugLineNum = 362;BA.debugLine="Dim KeyWord As String = Query.Trim";
Debug.ShouldStop(512);
_keyword = _query.runMethod(true,"trim");Debug.locals.put("KeyWord", _keyword);Debug.locals.put("KeyWord", _keyword);
 BA.debugLineNum = 363;BA.debugLine="If KeyWord = \"\" Then Return 'Exit when keyword is";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_keyword,BA.ObjectToString(""))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 364;BA.debugLine="KeyWord = KeyWord.Replace(\" \", \"+\") 'Required to";
Debug.ShouldStop(2048);
_keyword = _keyword.runMethod(true,"replace",(Object)(BA.ObjectToString(" ")),(Object)(RemoteObject.createImmutable("+")));Debug.locals.put("KeyWord", _keyword);
 BA.debugLineNum = 365;BA.debugLine="SearchPlace.Initialize(\"SearchPlace\", Me)";
Debug.ShouldStop(4096);
select_map_act.mostCurrent._searchplace.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_initialize" /*RemoteObject*/ ,select_map_act.processBA,(Object)(BA.ObjectToString("SearchPlace")),(Object)(select_map_act.getObject()));
 BA.debugLineNum = 366;BA.debugLine="SearchPlace.Download(\"https://us1.locationiq.com/";
Debug.ShouldStop(8192);
select_map_act.mostCurrent._searchplace.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("https://us1.locationiq.com/v1/search.php?key=50f886904c60e7&q="),_keyword,RemoteObject.createImmutable("&format=json&countrycodes=ir&accept-language=fa"))));
 BA.debugLineNum = 368;BA.debugLine="Log(\"search mylocation lat is: \"&myLocation.Latit";
Debug.ShouldStop(32768);
select_map_act.mostCurrent.__c.runVoidMethod ("LogImpl","421299218",RemoteObject.concat(RemoteObject.createImmutable("search mylocation lat is: "),select_map_act._mylocation.runMethod(true,"getLatitude"),RemoteObject.createImmutable(" and long is: "),select_map_act._mylocation.runMethod(true,"getLongitude"),RemoteObject.createImmutable("KeyWord: "),_keyword),0);
 BA.debugLineNum = 370;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _selectlocationbtn_click() throws Exception{
try {
		Debug.PushSubsStack("SelectLocationBTN_Click (select_map_act) ","select_map_act",20,select_map_act.mostCurrent.activityBA,select_map_act.mostCurrent,487);
if (RapidSub.canDelegate("selectlocationbtn_click")) { return ir.saelozahra.damaara.mazraeyeman.select_map_act.remoteMe.runUserSub(false, "select_map_act","selectlocationbtn_click");}
RemoteObject _makanname = RemoteObject.createImmutable("");
 BA.debugLineNum = 487;BA.debugLine="Sub SelectLocationBTN_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 488;BA.debugLine="Try";
Debug.ShouldStop(128);
try { BA.debugLineNum = 491;BA.debugLine="If gmap.IsInitialized Then";
Debug.ShouldStop(1024);
if (select_map_act.mostCurrent._gmap.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 492;BA.debugLine="Dim makanName As String";
Debug.ShouldStop(2048);
_makanname = RemoteObject.createImmutable("");Debug.locals.put("makanName", _makanname);
 BA.debugLineNum = 493;BA.debugLine="If WhatLove==\"gheshlagh\" Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",select_map_act._whatlove,BA.ObjectToString("gheshlagh"))) { 
 BA.debugLineNum = 494;BA.debugLine="File.WriteString(SaeloZahra.dir,\"gheshlagh_lat";
Debug.ShouldStop(8192);
select_map_act.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(select_map_act.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(BA.ObjectToString("gheshlagh_lat")),(Object)(BA.ObjectToString(select_map_act.mostCurrent._point.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lat")))))));
 BA.debugLineNum = 495;BA.debugLine="File.WriteString(SaeloZahra.dir,\"gheshlagh_lng";
Debug.ShouldStop(16384);
select_map_act.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(select_map_act.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(BA.ObjectToString("gheshlagh_lng")),(Object)(BA.ObjectToString(select_map_act.mostCurrent._point.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lng")))))));
 BA.debugLineNum = 496;BA.debugLine="makanName = \"قشلاق\"";
Debug.ShouldStop(32768);
_makanname = BA.ObjectToString("قشلاق");Debug.locals.put("makanName", _makanname);
 }else 
{ BA.debugLineNum = 497;BA.debugLine="Else If WhatLove==\"yeylagh\" Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",select_map_act._whatlove,BA.ObjectToString("yeylagh"))) { 
 BA.debugLineNum = 498;BA.debugLine="File.WriteString(SaeloZahra.dir,\"yeylagh_lat\",";
Debug.ShouldStop(131072);
select_map_act.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(select_map_act.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(BA.ObjectToString("yeylagh_lat")),(Object)(BA.ObjectToString(select_map_act.mostCurrent._point.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lat")))))));
 BA.debugLineNum = 499;BA.debugLine="File.WriteString(SaeloZahra.dir,\"yeylagh_lng\",";
Debug.ShouldStop(262144);
select_map_act.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(select_map_act.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(BA.ObjectToString("yeylagh_lng")),(Object)(BA.ObjectToString(select_map_act.mostCurrent._point.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lng")))))));
 BA.debugLineNum = 500;BA.debugLine="makanName = \"ییلاق\"";
Debug.ShouldStop(524288);
_makanname = BA.ObjectToString("ییلاق");Debug.locals.put("makanName", _makanname);
 }else {
 BA.debugLineNum = 502;BA.debugLine="File.WriteString(SaeloZahra.dir,\"place_lat\",po";
Debug.ShouldStop(2097152);
select_map_act.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(select_map_act.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(BA.ObjectToString("place_lat")),(Object)(BA.ObjectToString(select_map_act.mostCurrent._point.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lat")))))));
 BA.debugLineNum = 503;BA.debugLine="File.WriteString(SaeloZahra.dir,\"place_lng\",po";
Debug.ShouldStop(4194304);
select_map_act.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(select_map_act.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(BA.ObjectToString("place_lng")),(Object)(BA.ObjectToString(select_map_act.mostCurrent._point.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lng")))))));
 BA.debugLineNum = 504;BA.debugLine="makanName = \"مکانی\"";
Debug.ShouldStop(8388608);
_makanname = BA.ObjectToString("مکانی");Debug.locals.put("makanName", _makanname);
 }}
;
 BA.debugLineNum = 509;BA.debugLine="Activity.Finish";
Debug.ShouldStop(268435456);
select_map_act.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 511;BA.debugLine="Log(\"Select Map For \"&WhatLove & \" \" & makanNam";
Debug.ShouldStop(1073741824);
select_map_act.mostCurrent.__c.runVoidMethod ("LogImpl","421495832",RemoteObject.concat(RemoteObject.createImmutable("Select Map For "),select_map_act._whatlove,RemoteObject.createImmutable(" "),_makanname),0);
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e21) {
			BA.rdebugUtils.runVoidMethod("setLastException",select_map_act.processBA, e21.toString()); BA.debugLineNum = 515;BA.debugLine="ToastMessageShow(\"خطا در خواندن موقعیت مکانی\",Tr";
Debug.ShouldStop(4);
select_map_act.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("خطا در خواندن موقعیت مکانی")),(Object)(select_map_act.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 516;BA.debugLine="MsgboxAsync(LastException.Message,\"خطای ثبت موقع";
Debug.ShouldStop(8);
select_map_act.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(select_map_act.mostCurrent.__c.runMethod(false,"LastException",select_map_act.mostCurrent.activityBA).runMethod(true,"getMessage"))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("خطای ثبت موقعیت"))),select_map_act.processBA);
 BA.debugLineNum = 517;BA.debugLine="Activity.Finish";
Debug.ShouldStop(16);
select_map_act.mostCurrent._activity.runVoidMethod ("Finish");
 };
 BA.debugLineNum = 519;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _startgps() throws Exception{
try {
		Debug.PushSubsStack("StartGPS (select_map_act) ","select_map_act",20,select_map_act.mostCurrent.activityBA,select_map_act.mostCurrent,130);
if (RapidSub.canDelegate("startgps")) { ir.saelozahra.damaara.mazraeyeman.select_map_act.remoteMe.runUserSub(false, "select_map_act","startgps"); return;}
ResumableSub_StartGPS rsub = new ResumableSub_StartGPS(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_StartGPS extends BA.ResumableSub {
public ResumableSub_StartGPS(ir.saelozahra.damaara.mazraeyeman.select_map_act parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.saelozahra.damaara.mazraeyeman.select_map_act parent;
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("StartGPS (select_map_act) ","select_map_act",20,select_map_act.mostCurrent.activityBA,select_map_act.mostCurrent,130);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 131;BA.debugLine="ToastMessageShow(\"لطفا جی پی اس را فعال کنید\", Tr";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("لطفا جی پی اس را فعال کنید")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 132;BA.debugLine="Msgbox2Async(\"لطفا موقعیت یاب خود را روشن کنید\",\"";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("لطفا موقعیت یاب خود را روشن کنید")),(Object)(BA.ObjectToCharSequence("موقعیت")),(Object)(BA.ObjectToString("روشن کن")),(Object)(BA.ObjectToString("لغو")),(Object)(BA.ObjectToString("")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.mostCurrent.__c.getField(false,"Null")),select_map_act.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 134;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", select_map_act.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "select_map_act", "startgps"), null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 135;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(64);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 136;BA.debugLine="StartActivity(Starter.GPS1.LocationSettingsInten";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",select_map_act.processBA,(Object)((parent.mostCurrent._starter._gps1 /*RemoteObject*/ .runMethod(false,"getLocationSettingsIntent"))));
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 138;BA.debugLine="End Sub";
Debug.ShouldStop(512);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _msgbox_result(RemoteObject _result) throws Exception{
}
public static RemoteObject  _t_tick() throws Exception{
try {
		Debug.PushSubsStack("t_Tick (select_map_act) ","select_map_act",20,select_map_act.mostCurrent.activityBA,select_map_act.mostCurrent,176);
if (RapidSub.canDelegate("t_tick")) { return ir.saelozahra.damaara.mazraeyeman.select_map_act.remoteMe.runUserSub(false, "select_map_act","t_tick");}
 BA.debugLineNum = 176;BA.debugLine="Sub t_Tick";
Debug.ShouldStop(32768);
 BA.debugLineNum = 177;BA.debugLine="time=time+72";
Debug.ShouldStop(65536);
select_map_act._time = RemoteObject.solve(new RemoteObject[] {select_map_act._time,RemoteObject.createImmutable(72)}, "+",1, 1);
 BA.debugLineNum = 178;BA.debugLine="If time>9999 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean(">",select_map_act._time,BA.numberCast(double.class, 9999))) { 
 BA.debugLineNum = 179;BA.debugLine="address_bar_lbl.SetVisibleAnimated(1000,False)";
Debug.ShouldStop(262144);
select_map_act.mostCurrent._address_bar_lbl.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 1000)),(Object)(select_map_act.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 181;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _t2_tick() throws Exception{
try {
		Debug.PushSubsStack("T2_Tick (select_map_act) ","select_map_act",20,select_map_act.mostCurrent.activityBA,select_map_act.mostCurrent,183);
if (RapidSub.canDelegate("t2_tick")) { return ir.saelozahra.damaara.mazraeyeman.select_map_act.remoteMe.runUserSub(false, "select_map_act","t2_tick");}
 BA.debugLineNum = 183;BA.debugLine="Sub T2_Tick";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 184;BA.debugLine="Time2=Time2+1";
Debug.ShouldStop(8388608);
select_map_act._time2 = RemoteObject.solve(new RemoteObject[] {select_map_act._time2,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 185;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}