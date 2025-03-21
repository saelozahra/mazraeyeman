package ir.saelozahra.damaara.mazraeyeman;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class fullscreen_video_act_subs_0 {


public static RemoteObject  _activity_configchanged() throws Exception{
try {
		Debug.PushSubsStack("Activity_ConfigChanged (fullscreen_video_act) ","fullscreen_video_act",17,fullscreen_video_act.mostCurrent.activityBA,fullscreen_video_act.mostCurrent,65);
if (RapidSub.canDelegate("activity_configchanged")) { return ir.saelozahra.damaara.mazraeyeman.fullscreen_video_act.remoteMe.runUserSub(false, "fullscreen_video_act","activity_configchanged");}
 BA.debugLineNum = 65;BA.debugLine="Sub Activity_ConfigChanged()";
Debug.ShouldStop(1);
 BA.debugLineNum = 75;BA.debugLine="Log(\"inside configsub\")";
Debug.ShouldStop(1024);
fullscreen_video_act.mostCurrent.__c.runVoidMethod ("LogImpl","418612234",RemoteObject.createImmutable("inside configsub"),0);
 BA.debugLineNum = 76;BA.debugLine="timer1.Enabled = True";
Debug.ShouldStop(2048);
fullscreen_video_act._timer1.runMethod(true,"setEnabled",fullscreen_video_act.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 77;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("Activity_Create (fullscreen_video_act) ","fullscreen_video_act",17,fullscreen_video_act.mostCurrent.activityBA,fullscreen_video_act.mostCurrent,19);
if (RapidSub.canDelegate("activity_create")) { return ir.saelozahra.damaara.mazraeyeman.fullscreen_video_act.remoteMe.runUserSub(false, "fullscreen_video_act","activity_create", _firsttime);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 19;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 20;BA.debugLine="Activity.Color=Colors.Black";
Debug.ShouldStop(524288);
fullscreen_video_act.mostCurrent._activity.runVoidMethod ("setColor",fullscreen_video_act.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 21;BA.debugLine="SaeloZahra.P.SetScreenOrientation(0)";
Debug.ShouldStop(1048576);
fullscreen_video_act.mostCurrent._saelozahra._p /*RemoteObject*/ .runVoidMethod ("SetScreenOrientation",fullscreen_video_act.processBA,(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 26;BA.debugLine="Dim jo As JavaObject = Activity";
Debug.ShouldStop(33554432);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), fullscreen_video_act.mostCurrent._activity.getObject());Debug.locals.put("jo", _jo);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 27;BA.debugLine="jo.RunMethodJO(\"getContext\", Null).RunMethodJO(\"g";
Debug.ShouldStop(67108864);
_jo.runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getContext")),(Object)((fullscreen_video_act.mostCurrent.__c.getField(false,"Null")))).runVoidMethod ("RunMethodJO",(Object)(BA.ObjectToString("getWindow")),(Object)((fullscreen_video_act.mostCurrent.__c.getField(false,"Null"))));
 BA.debugLineNum = 28;BA.debugLine="ActivityParent = jo.RunMethodJO(\"getParent\", Null";
Debug.ShouldStop(134217728);
fullscreen_video_act.mostCurrent._activityparent = _jo.runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getParent")),(Object)((fullscreen_video_act.mostCurrent.__c.getField(false,"Null"))));
 BA.debugLineNum = 30;BA.debugLine="timer1.Initialize(\"Timer1\",100)";
Debug.ShouldStop(536870912);
fullscreen_video_act._timer1.runVoidMethod ("Initialize",fullscreen_video_act.processBA,(Object)(BA.ObjectToString("Timer1")),(Object)(BA.numberCast(long.class, 100)));
 BA.debugLineNum = 39;BA.debugLine="x.LoadXmlLayout(Activity, \"frame\")";
Debug.ShouldStop(64);
fullscreen_video_act.mostCurrent._x.runVoidMethod ("LoadXmlLayout",fullscreen_video_act.mostCurrent.activityBA,(Object)((fullscreen_video_act.mostCurrent._activity.getObject())),(Object)(RemoteObject.createImmutable("frame")));
 BA.debugLineNum = 40;BA.debugLine="vv.Initialize(\"vv\")";
Debug.ShouldStop(128);
fullscreen_video_act.mostCurrent._vv.runVoidMethod ("Initialize",fullscreen_video_act.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("vv")));
 BA.debugLineNum = 41;BA.debugLine="vv = x.GetView(\"surface\")";
Debug.ShouldStop(256);
fullscreen_video_act.mostCurrent._vv = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.audio.VideoViewWrapper"), fullscreen_video_act.mostCurrent._x.runMethod(false,"GetView",fullscreen_video_act.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("surface"))));
 BA.debugLineNum = 42;BA.debugLine="Activity.Color = Colors.Black";
Debug.ShouldStop(512);
fullscreen_video_act.mostCurrent._activity.runVoidMethod ("setColor",fullscreen_video_act.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 44;BA.debugLine="vv.LoadVideo(\"http\",videoUrlStr)";
Debug.ShouldStop(2048);
fullscreen_video_act.mostCurrent._vv.runVoidMethod ("LoadVideo",(Object)(BA.ObjectToString("http")),(Object)(fullscreen_video_act._videourlstr));
 BA.debugLineNum = 45;BA.debugLine="vv.Play";
Debug.ShouldStop(4096);
fullscreen_video_act.mostCurrent._vv.runVoidMethod ("Play");
 BA.debugLineNum = 46;BA.debugLine="vv.MediaControllerEnabled=True";
Debug.ShouldStop(8192);
fullscreen_video_act.mostCurrent._vv.runVoidMethod ("setMediaControllerEnabled",fullscreen_video_act.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("AfterChange (fullscreen_video_act) ","fullscreen_video_act",17,fullscreen_video_act.mostCurrent.activityBA,fullscreen_video_act.mostCurrent,79);
if (RapidSub.canDelegate("afterchange")) { return ir.saelozahra.damaara.mazraeyeman.fullscreen_video_act.remoteMe.runUserSub(false, "fullscreen_video_act","afterchange");}
RemoteObject _ajo = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _width = RemoteObject.createImmutable(0);
RemoteObject _height = RemoteObject.createImmutable(0);
 BA.debugLineNum = 79;BA.debugLine="Sub AfterChange";
Debug.ShouldStop(16384);
 BA.debugLineNum = 86;BA.debugLine="Dim ajo As Panel = Activity";
Debug.ShouldStop(2097152);
_ajo = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_ajo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), fullscreen_video_act.mostCurrent._activity.getObject());Debug.locals.put("ajo", _ajo);Debug.locals.put("ajo", _ajo);
 BA.debugLineNum = 87;BA.debugLine="Dim width As Int = ActivityParent.RunMethod(\"getM";
Debug.ShouldStop(4194304);
_width = BA.numberCast(int.class, fullscreen_video_act.mostCurrent._activityparent.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getMeasuredWidth")),(Object)((fullscreen_video_act.mostCurrent.__c.getField(false,"Null")))));Debug.locals.put("width", _width);Debug.locals.put("width", _width);
 BA.debugLineNum = 88;BA.debugLine="Dim height As Int = ActivityParent.RunMethod(\"get";
Debug.ShouldStop(8388608);
_height = BA.numberCast(int.class, fullscreen_video_act.mostCurrent._activityparent.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getMeasuredHeight")),(Object)((fullscreen_video_act.mostCurrent.__c.getField(false,"Null")))));Debug.locals.put("height", _height);Debug.locals.put("height", _height);
 BA.debugLineNum = 89;BA.debugLine="If width = 0 Or height = 0 Then Return";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_width,BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean("=",_height,BA.numberCast(double.class, 0))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 90;BA.debugLine="ajo.Width = width 'update the \"activity\" width an";
Debug.ShouldStop(33554432);
_ajo.runMethod(true,"setWidth",_width);
 BA.debugLineNum = 91;BA.debugLine="ajo.Height = height";
Debug.ShouldStop(67108864);
_ajo.runMethod(true,"setHeight",_height);
 BA.debugLineNum = 92;BA.debugLine="Activity.Invalidate";
Debug.ShouldStop(134217728);
fullscreen_video_act.mostCurrent._activity.runVoidMethod ("Invalidate");
 BA.debugLineNum = 93;BA.debugLine="vv.Width = width";
Debug.ShouldStop(268435456);
fullscreen_video_act.mostCurrent._vv.runMethod(true,"setWidth",_width);
 BA.debugLineNum = 94;BA.debugLine="vv.Height = height";
Debug.ShouldStop(536870912);
fullscreen_video_act.mostCurrent._vv.runMethod(true,"setHeight",_height);
 BA.debugLineNum = 96;BA.debugLine="vv.Invalidate";
Debug.ShouldStop(-2147483648);
fullscreen_video_act.mostCurrent._vv.runVoidMethod ("Invalidate");
 BA.debugLineNum = 97;BA.debugLine="timer1.Enabled = False";
Debug.ShouldStop(1);
fullscreen_video_act._timer1.runMethod(true,"setEnabled",fullscreen_video_act.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 99;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
 //BA.debugLineNum = 13;BA.debugLine="Dim vv As VideoView";
fullscreen_video_act.mostCurrent._vv = RemoteObject.createNew ("anywheresoftware.b4a.audio.VideoViewWrapper");
 //BA.debugLineNum = 14;BA.debugLine="Dim x As XmlLayoutBuilder";
fullscreen_video_act.mostCurrent._x = RemoteObject.createNew ("anywheresoftware.b4a.object.XmlLayoutBuilder");
 //BA.debugLineNum = 15;BA.debugLine="Private ActivityParent As JavaObject";
fullscreen_video_act.mostCurrent._activityparent = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 8;BA.debugLine="Dim timer1 As Timer";
fullscreen_video_act._timer1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 9;BA.debugLine="Dim videoUrlStr As String";
fullscreen_video_act._videourlstr = RemoteObject.createImmutable("");
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _timer1_tick() throws Exception{
try {
		Debug.PushSubsStack("timer1_Tick (fullscreen_video_act) ","fullscreen_video_act",17,fullscreen_video_act.mostCurrent.activityBA,fullscreen_video_act.mostCurrent,57);
if (RapidSub.canDelegate("timer1_tick")) { return ir.saelozahra.damaara.mazraeyeman.fullscreen_video_act.remoteMe.runUserSub(false, "fullscreen_video_act","timer1_tick");}
 BA.debugLineNum = 57;BA.debugLine="Sub timer1_Tick";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 59;BA.debugLine="If vv.IsPlaying Then";
Debug.ShouldStop(67108864);
if (fullscreen_video_act.mostCurrent._vv.runMethod(true,"IsPlaying").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 60;BA.debugLine="CallSubDelayed(Me, \"AfterChange\")";
Debug.ShouldStop(134217728);
fullscreen_video_act.mostCurrent.__c.runVoidMethod ("CallSubDelayed",fullscreen_video_act.processBA,(Object)(fullscreen_video_act.getObject()),(Object)(RemoteObject.createImmutable("AfterChange")));
 };
 BA.debugLineNum = 63;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("vv_Complete (fullscreen_video_act) ","fullscreen_video_act",17,fullscreen_video_act.mostCurrent.activityBA,fullscreen_video_act.mostCurrent,53);
if (RapidSub.canDelegate("vv_complete")) { return ir.saelozahra.damaara.mazraeyeman.fullscreen_video_act.remoteMe.runUserSub(false, "fullscreen_video_act","vv_complete");}
 BA.debugLineNum = 53;BA.debugLine="Sub vv_Complete";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 54;BA.debugLine="Log(\"Playing completed\")";
Debug.ShouldStop(2097152);
fullscreen_video_act.mostCurrent.__c.runVoidMethod ("LogImpl","418481153",RemoteObject.createImmutable("Playing completed"),0);
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}