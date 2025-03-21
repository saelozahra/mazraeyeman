package ir.saelozahra.damaara.mazraeyeman;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class videonewact_subs_0 {


public static RemoteObject  _actionbar_menuitemclick(RemoteObject _item) throws Exception{
try {
		Debug.PushSubsStack("ActionBar_MenuItemClick (videonewact) ","videonewact",22,videonewact.mostCurrent.activityBA,videonewact.mostCurrent,107);
if (RapidSub.canDelegate("actionbar_menuitemclick")) { return ir.saelozahra.damaara.mazraeyeman.videonewact.remoteMe.runUserSub(false, "videonewact","actionbar_menuitemclick", _item);}
Debug.locals.put("Item", _item);
 BA.debugLineNum = 107;BA.debugLine="Sub ActionBar_MenuItemClick (Item As ACMenuItem)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 108;BA.debugLine="Select Item.Id";
Debug.ShouldStop(2048);
switch (BA.switchObjectToInt(_item.runMethod(true,"getId"),BA.numberCast(int.class, 1),BA.numberCast(int.class, 2))) {
case 0: {
 BA.debugLineNum = 110;BA.debugLine="fullscreen_video_act.videoUrlStr=VidUrl";
Debug.ShouldStop(8192);
videonewact.mostCurrent._fullscreen_video_act._videourlstr /*RemoteObject*/  = videonewact._vidurl;
 BA.debugLineNum = 111;BA.debugLine="StartActivity(fullscreen_video_act)";
Debug.ShouldStop(16384);
videonewact.mostCurrent.__c.runVoidMethod ("StartActivity",videonewact.processBA,(Object)((videonewact.mostCurrent._fullscreen_video_act.getObject())));
 break; }
case 1: {
 BA.debugLineNum = 114;BA.debugLine="If Stared Then";
Debug.ShouldStop(131072);
if (videonewact._stared.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 115;BA.debugLine="Stared = False";
Debug.ShouldStop(262144);
videonewact._stared = videonewact.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 116;BA.debugLine="ActionBar.Menu.FindItem(2).Icon=X1.GetDrawable";
Debug.ShouldStop(524288);
videonewact.mostCurrent._actionbar.runMethod(false,"getMenu").runMethod(false,"FindItem",(Object)(BA.numberCast(int.class, 2))).runMethod(false,"setIcon",videonewact.mostCurrent._x1.runMethod(false,"GetDrawable",(Object)(RemoteObject.createImmutable("baseline_star_border_white_24"))));
 }else {
 BA.debugLineNum = 121;BA.debugLine="Stared = True";
Debug.ShouldStop(16777216);
videonewact._stared = videonewact.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 122;BA.debugLine="ActionBar.Menu.FindItem(2).Icon=X1.GetDrawable";
Debug.ShouldStop(33554432);
videonewact.mostCurrent._actionbar.runMethod(false,"getMenu").runMethod(false,"FindItem",(Object)(BA.numberCast(int.class, 2))).runMethod(false,"setIcon",videonewact.mostCurrent._x1.runMethod(false,"GetDrawable",(Object)(RemoteObject.createImmutable("baseline_star_white_24"))));
 };
 break; }
}
;
 BA.debugLineNum = 126;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _actionbar_navigationitemclick() throws Exception{
try {
		Debug.PushSubsStack("Actionbar_NavigationItemClick (videonewact) ","videonewact",22,videonewact.mostCurrent.activityBA,videonewact.mostCurrent,151);
if (RapidSub.canDelegate("actionbar_navigationitemclick")) { return ir.saelozahra.damaara.mazraeyeman.videonewact.remoteMe.runUserSub(false, "videonewact","actionbar_navigationitemclick");}
 BA.debugLineNum = 151;BA.debugLine="Sub Actionbar_NavigationItemClick";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 152;BA.debugLine="Activity.Finish";
Debug.ShouldStop(8388608);
videonewact.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 153;BA.debugLine="SaeloZahra.SetAnimation(\"zoom_enter\",\"zoom_exit\")";
Debug.ShouldStop(16777216);
videonewact.mostCurrent._saelozahra.runVoidMethod ("_setanimation" /*RemoteObject*/ ,videonewact.mostCurrent.activityBA,(Object)(BA.ObjectToString("zoom_enter")),(Object)(RemoteObject.createImmutable("zoom_exit")));
 BA.debugLineNum = 154;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_configchanged() throws Exception{
try {
		Debug.PushSubsStack("Activity_ConfigChanged (videonewact) ","videonewact",22,videonewact.mostCurrent.activityBA,videonewact.mostCurrent,185);
if (RapidSub.canDelegate("activity_configchanged")) { return ir.saelozahra.damaara.mazraeyeman.videonewact.remoteMe.runUserSub(false, "videonewact","activity_configchanged");}
 BA.debugLineNum = 185;BA.debugLine="Sub Activity_ConfigChanged()";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 195;BA.debugLine="Log(\"inside configsub    width\"&GetDeviceLayoutVa";
Debug.ShouldStop(4);
videonewact.mostCurrent.__c.runVoidMethod ("LogImpl","423003146",RemoteObject.concat(RemoteObject.createImmutable("inside configsub    width"),videonewact.mostCurrent.__c.runMethod(false,"GetDeviceLayoutValues",videonewact.mostCurrent.activityBA).getField(true,"Width"),RemoteObject.createImmutable("     Height"),videonewact.mostCurrent.__c.runMethod(false,"GetDeviceLayoutValues",videonewact.mostCurrent.activityBA).getField(true,"Height")),0);
 BA.debugLineNum = 196;BA.debugLine="timer1.Enabled = True";
Debug.ShouldStop(8);
videonewact._timer1.runMethod(true,"setEnabled",videonewact.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 199;BA.debugLine="If GetDeviceLayoutValues.Width>GetDeviceLayoutVal";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean(">",videonewact.mostCurrent.__c.runMethod(false,"GetDeviceLayoutValues",videonewact.mostCurrent.activityBA).getField(true,"Width"),BA.numberCast(double.class, videonewact.mostCurrent.__c.runMethod(false,"GetDeviceLayoutValues",videonewact.mostCurrent.activityBA).getField(true,"Height")))) { 
 BA.debugLineNum = 200;BA.debugLine="Activity.Color=Colors.DarkGray";
Debug.ShouldStop(128);
videonewact.mostCurrent._activity.runVoidMethod ("setColor",videonewact.mostCurrent.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 201;BA.debugLine="ActionBar.Visible = False";
Debug.ShouldStop(256);
videonewact.mostCurrent._actionbar.runMethod(true,"setVisible",videonewact.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 202;BA.debugLine="SaeloZahra.SetStatusBarColor(Colors.DarkGray)";
Debug.ShouldStop(512);
videonewact.mostCurrent._saelozahra.runVoidMethod ("_setstatusbarcolor" /*RemoteObject*/ ,videonewact.mostCurrent.activityBA,(Object)(videonewact.mostCurrent.__c.getField(false,"Colors").getField(true,"DarkGray")));
 }else {
 BA.debugLineNum = 204;BA.debugLine="Activity.Color=Colors.White";
Debug.ShouldStop(2048);
videonewact.mostCurrent._activity.runVoidMethod ("setColor",videonewact.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 205;BA.debugLine="ActionBar.Visible = True";
Debug.ShouldStop(4096);
videonewact.mostCurrent._actionbar.runMethod(true,"setVisible",videonewact.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 206;BA.debugLine="SaeloZahra.SetStatusBarColor(SaeloZahra.ColorDar";
Debug.ShouldStop(8192);
videonewact.mostCurrent._saelozahra.runVoidMethod ("_setstatusbarcolor" /*RemoteObject*/ ,videonewact.mostCurrent.activityBA,(Object)(videonewact.mostCurrent._saelozahra._colordark /*RemoteObject*/ ));
 };
 BA.debugLineNum = 209;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("Activity_Create (videonewact) ","videonewact",22,videonewact.mostCurrent.activityBA,videonewact.mostCurrent,28);
if (RapidSub.canDelegate("activity_create")) { return ir.saelozahra.damaara.mazraeyeman.videonewact.remoteMe.runUserSub(false, "videonewact","activity_create", _firsttime);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 28;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 30;BA.debugLine="SaeloZahra.P.SetScreenOrientation(-1)";
Debug.ShouldStop(536870912);
videonewact.mostCurrent._saelozahra._p /*RemoteObject*/ .runVoidMethod ("SetScreenOrientation",videonewact.processBA,(Object)(BA.numberCast(int.class, -(double) (0 + 1))));
 BA.debugLineNum = 32;BA.debugLine="Activity.LoadLayout(\"svNewlayout\")";
Debug.ShouldStop(-2147483648);
videonewact.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("svNewlayout")),videonewact.mostCurrent.activityBA);
 BA.debugLineNum = 33;BA.debugLine="Activity.Color=Colors.White";
Debug.ShouldStop(1);
videonewact.mostCurrent._activity.runVoidMethod ("setColor",videonewact.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 34;BA.debugLine="SaeloZahra.SetStatusBarColor(SaeloZahra.ColorDark";
Debug.ShouldStop(2);
videonewact.mostCurrent._saelozahra.runVoidMethod ("_setstatusbarcolor" /*RemoteObject*/ ,videonewact.mostCurrent.activityBA,(Object)(videonewact.mostCurrent._saelozahra._colordark /*RemoteObject*/ ));
 BA.debugLineNum = 35;BA.debugLine="ScrollView1.Visible=False";
Debug.ShouldStop(4);
videonewact.mostCurrent._scrollview1.runMethod(true,"setVisible",videonewact.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 36;BA.debugLine="ActionBar.Title = SaeloZahra.CSB(\"پخش فیلم\")";
Debug.ShouldStop(8);
videonewact.mostCurrent._actionbar.runMethod(true,"setTitle",BA.ObjectToCharSequence(videonewact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,videonewact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("پخش فیلم"))).getObject()));
 BA.debugLineNum = 37;BA.debugLine="ActionBar.TitleTextColor=Colors.White";
Debug.ShouldStop(16);
videonewact.mostCurrent._actionbar.runVoidMethod ("setTitleTextColor",videonewact.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 38;BA.debugLine="ActionBar.subTitle = SaeloZahra.CSB(pageTitle)";
Debug.ShouldStop(32);
videonewact.mostCurrent._actionbar.runMethod(true,"setSubTitle",BA.ObjectToCharSequence(videonewact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,videonewact.mostCurrent.activityBA,(Object)(videonewact._pagetitle)).getObject()));
 BA.debugLineNum = 39;BA.debugLine="ActionBar.subTitleTextColor=Colors.White";
Debug.ShouldStop(64);
videonewact.mostCurrent._actionbar.runVoidMethod ("setSubTitleTextColor",videonewact.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 40;BA.debugLine="ActionBar.Color=SaeloZahra.Color";
Debug.ShouldStop(128);
videonewact.mostCurrent._actionbar.runVoidMethod ("setColor",videonewact.mostCurrent._saelozahra._color /*RemoteObject*/ );
 BA.debugLineNum = 44;BA.debugLine="ActionBar.Menu.Add2(1,1,\"تمام صفحه\",X1.GetDrawabl";
Debug.ShouldStop(2048);
videonewact.mostCurrent._actionbar.runMethod(false,"getMenu").runMethod(false,"Add2",(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.ObjectToCharSequence("تمام صفحه")),(Object)(videonewact.mostCurrent._x1.runMethod(false,"GetDrawable",(Object)(RemoteObject.createImmutable("baseline_fullscreen_white_24"))))).runVoidMethod ("setShowAsAction",BA.numberCast(int.class, 2));
 BA.debugLineNum = 46;BA.debugLine="If Stared Then";
Debug.ShouldStop(8192);
if (videonewact._stared.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 47;BA.debugLine="ActionBar.Menu.Add2(2,2,\"مورد علاقه\",X1.GetDrawa";
Debug.ShouldStop(16384);
videonewact.mostCurrent._actionbar.runMethod(false,"getMenu").runMethod(false,"Add2",(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.ObjectToCharSequence("مورد علاقه")),(Object)(videonewact.mostCurrent._x1.runMethod(false,"GetDrawable",(Object)(RemoteObject.createImmutable("baseline_star_white_24"))))).runVoidMethod ("setShowAsAction",BA.numberCast(int.class, 2));
 }else {
 BA.debugLineNum = 49;BA.debugLine="ActionBar.Menu.Add2(2,2,\"مورد علاقه\",X1.GetDrawa";
Debug.ShouldStop(65536);
videonewact.mostCurrent._actionbar.runMethod(false,"getMenu").runMethod(false,"Add2",(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.ObjectToCharSequence("مورد علاقه")),(Object)(videonewact.mostCurrent._x1.runMethod(false,"GetDrawable",(Object)(RemoteObject.createImmutable("baseline_star_border_white_24"))))).runVoidMethod ("setShowAsAction",BA.numberCast(int.class, 2));
 };
 BA.debugLineNum = 54;BA.debugLine="ActionBar.NavigationIconDrawable = X1.GetDrawable";
Debug.ShouldStop(2097152);
videonewact.mostCurrent._actionbar.runMethod(false,"setNavigationIconDrawable",videonewact.mostCurrent._x1.runMethod(false,"GetDrawable",(Object)(RemoteObject.createImmutable("baseline_arrow_back_white_24"))));
 BA.debugLineNum = 65;BA.debugLine="Dim jo As JavaObject = Activity";
Debug.ShouldStop(1);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), videonewact.mostCurrent._activity.getObject());Debug.locals.put("jo", _jo);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 66;BA.debugLine="jo.RunMethodJO(\"getContext\", Null).RunMethodJO(\"g";
Debug.ShouldStop(2);
_jo.runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getContext")),(Object)((videonewact.mostCurrent.__c.getField(false,"Null")))).runVoidMethod ("RunMethodJO",(Object)(BA.ObjectToString("getWindow")),(Object)((videonewact.mostCurrent.__c.getField(false,"Null"))));
 BA.debugLineNum = 67;BA.debugLine="ActivityParent = jo.RunMethodJO(\"getParent\", Null";
Debug.ShouldStop(4);
videonewact.mostCurrent._activityparent = _jo.runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getParent")),(Object)((videonewact.mostCurrent.__c.getField(false,"Null"))));
 BA.debugLineNum = 69;BA.debugLine="timer1.Initialize(\"Timer1\",100)";
Debug.ShouldStop(16);
videonewact._timer1.runVoidMethod ("Initialize",videonewact.processBA,(Object)(BA.ObjectToString("Timer1")),(Object)(BA.numberCast(long.class, 100)));
 BA.debugLineNum = 78;BA.debugLine="x.LoadXmlLayout(Activity, \"frame\")";
Debug.ShouldStop(8192);
videonewact.mostCurrent._x.runVoidMethod ("LoadXmlLayout",videonewact.mostCurrent.activityBA,(Object)((videonewact.mostCurrent._activity.getObject())),(Object)(RemoteObject.createImmutable("frame")));
 BA.debugLineNum = 79;BA.debugLine="vv.Initialize(\"vv\")";
Debug.ShouldStop(16384);
videonewact.mostCurrent._vv.runVoidMethod ("Initialize",videonewact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("vv")));
 BA.debugLineNum = 80;BA.debugLine="vv = x.GetView(\"surface\")";
Debug.ShouldStop(32768);
videonewact.mostCurrent._vv = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.audio.VideoViewWrapper"), videonewact.mostCurrent._x.runMethod(false,"GetView",videonewact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("surface"))));
 BA.debugLineNum = 85;BA.debugLine="vv.LoadVideo(\"http\",VidUrl)";
Debug.ShouldStop(1048576);
videonewact.mostCurrent._vv.runVoidMethod ("LoadVideo",(Object)(BA.ObjectToString("http")),(Object)(videonewact._vidurl));
 BA.debugLineNum = 86;BA.debugLine="vv.Play";
Debug.ShouldStop(2097152);
videonewact.mostCurrent._vv.runVoidMethod ("Play");
 BA.debugLineNum = 88;BA.debugLine="If SaeloZahra.P.SdkVersion < 20 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("<",videonewact.mostCurrent._saelozahra._p /*RemoteObject*/ .runMethod(true,"getSdkVersion"),BA.numberCast(double.class, 20))) { 
 BA.debugLineNum = 89;BA.debugLine="StartActivity(VP.PlayAnyPlayer(VidUrl))";
Debug.ShouldStop(16777216);
videonewact.mostCurrent.__c.runVoidMethod ("StartActivity",videonewact.processBA,(Object)((videonewact.mostCurrent._vp.runMethod(false,"PlayAnyPlayer",(Object)(videonewact._vidurl)))));
 };
 BA.debugLineNum = 92;BA.debugLine="If SaeloZahra.P.SdkVersion>23 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean(">",videonewact.mostCurrent._saelozahra._p /*RemoteObject*/ .runMethod(true,"getSdkVersion"),BA.numberCast(double.class, 23))) { 
 BA.debugLineNum = 94;BA.debugLine="Config.Initialize";
Debug.ShouldStop(536870912);
videonewact.mostCurrent._config.runVoidMethod ("Initialize",videonewact.processBA);
 BA.debugLineNum = 95;BA.debugLine="Config.position(Config.POSITION_LEFT)";
Debug.ShouldStop(1073741824);
videonewact.mostCurrent._config.runVoidMethod ("position",(Object)(videonewact.mostCurrent._config.getField(true,"POSITION_LEFT")));
 BA.debugLineNum = 96;BA.debugLine="Config.primaryColor(SaeloZahra.ColorDark)";
Debug.ShouldStop(-2147483648);
videonewact.mostCurrent._config.runVoidMethod ("primaryColor",(Object)(videonewact.mostCurrent._saelozahra._colordark /*RemoteObject*/ ));
 BA.debugLineNum = 97;BA.debugLine="Config.edge(True )";
Debug.ShouldStop(1);
videonewact.mostCurrent._config.runVoidMethod ("edge",(Object)(videonewact.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 98;BA.debugLine="Config.sensitivity(100)";
Debug.ShouldStop(2);
videonewact.mostCurrent._config.runVoidMethod ("sensitivity",(Object)(BA.numberCast(float.class, 100)));
 BA.debugLineNum = 99;BA.debugLine="Config.scrimColor(Colors.ARGB(180,0,0,0))";
Debug.ShouldStop(4);
videonewact.mostCurrent._config.runVoidMethod ("scrimColor",(Object)(videonewact.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 180)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))));
 BA.debugLineNum = 101;BA.debugLine="Show.convertActivityToTranslucent";
Debug.ShouldStop(16);
videonewact.mostCurrent._show.runVoidMethod ("convertActivityToTranslucent",videonewact.mostCurrent.activityBA);
 BA.debugLineNum = 102;BA.debugLine="Show.attachActivity(Config)";
Debug.ShouldStop(32);
videonewact.mostCurrent._show.runVoidMethod ("attachActivity",videonewact.mostCurrent.activityBA,(Object)(videonewact.mostCurrent._config));
 };
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
		Debug.PushSubsStack("Activity_KeyPress (videonewact) ","videonewact",22,videonewact.mostCurrent.activityBA,videonewact.mostCurrent,157);
if (RapidSub.canDelegate("activity_keypress")) { return ir.saelozahra.damaara.mazraeyeman.videonewact.remoteMe.runUserSub(false, "videonewact","activity_keypress", _keycode);}
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 157;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 158;BA.debugLine="If KeyCode==KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, videonewact.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 159;BA.debugLine="Actionbar_NavigationItemClick";
Debug.ShouldStop(1073741824);
_actionbar_navigationitemclick();
 BA.debugLineNum = 160;BA.debugLine="Return False";
Debug.ShouldStop(-2147483648);
if (true) return videonewact.mostCurrent.__c.getField(true,"False");
 }else {
 BA.debugLineNum = 162;BA.debugLine="Return True";
Debug.ShouldStop(2);
if (true) return videonewact.mostCurrent.__c.getField(true,"True");
 };
 BA.debugLineNum = 164;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("Activity_Pause (videonewact) ","videonewact",22,videonewact.mostCurrent.activityBA,videonewact.mostCurrent,143);
if (RapidSub.canDelegate("activity_pause")) { return ir.saelozahra.damaara.mazraeyeman.videonewact.remoteMe.runUserSub(false, "videonewact","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 143;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 145;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("Activity_Resume (videonewact) ","videonewact",22,videonewact.mostCurrent.activityBA,videonewact.mostCurrent,128);
if (RapidSub.canDelegate("activity_resume")) { return ir.saelozahra.damaara.mazraeyeman.videonewact.remoteMe.runUserSub(false, "videonewact","activity_resume");}
 BA.debugLineNum = 128;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 139;BA.debugLine="ToastMessageShow(SaeloZahra.CSB(\"برای نمایش فیلم";
Debug.ShouldStop(1024);
videonewact.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(videonewact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,videonewact.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("برای نمایش فیلم در اندازه بزرگ"),videonewact.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("لطفا صفحه نمایش را بچرخانید")))).getObject())),(Object)(videonewact.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 141;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _afterchange() throws Exception{
try {
		Debug.PushSubsStack("AfterChange (videonewact) ","videonewact",22,videonewact.mostCurrent.activityBA,videonewact.mostCurrent,211);
if (RapidSub.canDelegate("afterchange")) { return ir.saelozahra.damaara.mazraeyeman.videonewact.remoteMe.runUserSub(false, "videonewact","afterchange");}
RemoteObject _ajo = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _width = RemoteObject.createImmutable(0);
RemoteObject _height = RemoteObject.createImmutable(0);
 BA.debugLineNum = 211;BA.debugLine="Sub AfterChange";
Debug.ShouldStop(262144);
 BA.debugLineNum = 218;BA.debugLine="Dim ajo As Panel = Activity";
Debug.ShouldStop(33554432);
_ajo = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_ajo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), videonewact.mostCurrent._activity.getObject());Debug.locals.put("ajo", _ajo);Debug.locals.put("ajo", _ajo);
 BA.debugLineNum = 219;BA.debugLine="Dim width As Int = ActivityParent.RunMethod(\"getM";
Debug.ShouldStop(67108864);
_width = BA.numberCast(int.class, videonewact.mostCurrent._activityparent.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getMeasuredWidth")),(Object)((videonewact.mostCurrent.__c.getField(false,"Null")))));Debug.locals.put("width", _width);Debug.locals.put("width", _width);
 BA.debugLineNum = 220;BA.debugLine="Dim height As Int = ActivityParent.RunMethod(\"get";
Debug.ShouldStop(134217728);
_height = BA.numberCast(int.class, videonewact.mostCurrent._activityparent.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getMeasuredHeight")),(Object)((videonewact.mostCurrent.__c.getField(false,"Null")))));Debug.locals.put("height", _height);Debug.locals.put("height", _height);
 BA.debugLineNum = 221;BA.debugLine="If width = 0 Or height = 0 Then Return";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_width,BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean("=",_height,BA.numberCast(double.class, 0))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 222;BA.debugLine="ajo.Width = width 'update the \"activity\" width an";
Debug.ShouldStop(536870912);
_ajo.runMethod(true,"setWidth",_width);
 BA.debugLineNum = 223;BA.debugLine="ajo.Height = height";
Debug.ShouldStop(1073741824);
_ajo.runMethod(true,"setHeight",_height);
 BA.debugLineNum = 224;BA.debugLine="Activity.Invalidate";
Debug.ShouldStop(-2147483648);
videonewact.mostCurrent._activity.runVoidMethod ("Invalidate");
 BA.debugLineNum = 225;BA.debugLine="vv.Width = width";
Debug.ShouldStop(1);
videonewact.mostCurrent._vv.runMethod(true,"setWidth",_width);
 BA.debugLineNum = 226;BA.debugLine="vv.Height = height";
Debug.ShouldStop(2);
videonewact.mostCurrent._vv.runMethod(true,"setHeight",_height);
 BA.debugLineNum = 228;BA.debugLine="vv.Invalidate";
Debug.ShouldStop(8);
videonewact.mostCurrent._vv.runVoidMethod ("Invalidate");
 BA.debugLineNum = 229;BA.debugLine="timer1.Enabled = False";
Debug.ShouldStop(16);
videonewact._timer1.runMethod(true,"setEnabled",videonewact.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 231;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 13;BA.debugLine="Dim Config 	As Amir_SliderConfig";
videonewact.mostCurrent._config = RemoteObject.createNew ("ir.aghajari.slider.Amir_SlisderConfig");
 //BA.debugLineNum = 14;BA.debugLine="Dim Show 	As Amir_SliderShow";
videonewact.mostCurrent._show = RemoteObject.createNew ("ir.aghajari.slider.Amir_SliderShow");
 //BA.debugLineNum = 16;BA.debugLine="Dim VP As VideoPlayer";
videonewact.mostCurrent._vp = RemoteObject.createNew ("tilleke.b4a.VideoPlayer.VideoPlayer");
 //BA.debugLineNum = 17;BA.debugLine="Dim vv As VideoView";
videonewact.mostCurrent._vv = RemoteObject.createNew ("anywheresoftware.b4a.audio.VideoViewWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Dim x As XmlLayoutBuilder";
videonewact.mostCurrent._x = RemoteObject.createNew ("anywheresoftware.b4a.object.XmlLayoutBuilder");
 //BA.debugLineNum = 19;BA.debugLine="Private ActivityParent As JavaObject";
videonewact.mostCurrent._activityparent = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
 //BA.debugLineNum = 21;BA.debugLine="Dim X1 As XmlLayoutBuilder";
videonewact.mostCurrent._x1 = RemoteObject.createNew ("anywheresoftware.b4a.object.XmlLayoutBuilder");
 //BA.debugLineNum = 22;BA.debugLine="Private ScrollView1 As ScrollView";
videonewact.mostCurrent._scrollview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private ActionBar As ACToolBarDark";
videonewact.mostCurrent._actionbar = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACToolbarDarkWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Dim Stared As Boolean = False";
videonewact._stared = videonewact.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 8;BA.debugLine="Dim timer1 As Timer";
videonewact._timer1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 9;BA.debugLine="Dim pageTitle,VidUrl As String";
videonewact._pagetitle = RemoteObject.createImmutable("");
videonewact._vidurl = RemoteObject.createImmutable("");
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _timer1_tick() throws Exception{
try {
		Debug.PushSubsStack("timer1_Tick (videonewact) ","videonewact",22,videonewact.mostCurrent.activityBA,videonewact.mostCurrent,177);
if (RapidSub.canDelegate("timer1_tick")) { return ir.saelozahra.damaara.mazraeyeman.videonewact.remoteMe.runUserSub(false, "videonewact","timer1_tick");}
 BA.debugLineNum = 177;BA.debugLine="Sub timer1_Tick";
Debug.ShouldStop(65536);
 BA.debugLineNum = 179;BA.debugLine="If vv.IsPlaying Then";
Debug.ShouldStop(262144);
if (videonewact.mostCurrent._vv.runMethod(true,"IsPlaying").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 180;BA.debugLine="CallSubDelayed(Me, \"AfterChange\")";
Debug.ShouldStop(524288);
videonewact.mostCurrent.__c.runVoidMethod ("CallSubDelayed",videonewact.processBA,(Object)(videonewact.getObject()),(Object)(RemoteObject.createImmutable("AfterChange")));
 };
 BA.debugLineNum = 183;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _vv_complete() throws Exception{
try {
		Debug.PushSubsStack("vv_Complete (videonewact) ","videonewact",22,videonewact.mostCurrent.activityBA,videonewact.mostCurrent,173);
if (RapidSub.canDelegate("vv_complete")) { return ir.saelozahra.damaara.mazraeyeman.videonewact.remoteMe.runUserSub(false, "videonewact","vv_complete");}
 BA.debugLineNum = 173;BA.debugLine="Sub vv_Complete";
Debug.ShouldStop(4096);
 BA.debugLineNum = 174;BA.debugLine="Log(\"Playing completed\")";
Debug.ShouldStop(8192);
videonewact.mostCurrent.__c.runVoidMethod ("LogImpl","422872065",RemoteObject.createImmutable("Playing completed"),0);
 BA.debugLineNum = 175;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}