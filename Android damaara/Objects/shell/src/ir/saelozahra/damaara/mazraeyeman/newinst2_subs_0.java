package ir.saelozahra.damaara.mazraeyeman;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class newinst2_subs_0 {


public static RemoteObject  _getpackagename() throws Exception{
try {
		Debug.PushSubsStack("GetPackageName (newinst2) ","newinst2",25,newinst2.processBA,newinst2.mostCurrent,38);
if (RapidSub.canDelegate("getpackagename")) { return ir.saelozahra.damaara.mazraeyeman.newinst2.remoteMe.runUserSub(false, "newinst2","getpackagename");}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
 BA.debugLineNum = 38;BA.debugLine="Sub GetPackageName As String";
Debug.ShouldStop(32);
 BA.debugLineNum = 39;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(64);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 40;BA.debugLine="Return r.GetStaticField(\"anywheresoftware.b4a.BA\"";
Debug.ShouldStop(128);
if (true) return BA.ObjectToString(_r.runMethod(false,"GetStaticField",(Object)(BA.ObjectToString("anywheresoftware.b4a.BA")),(Object)(RemoteObject.createImmutable("packageName"))));
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _myappreload() throws Exception{
try {
		Debug.PushSubsStack("MyAppReload (newinst2) ","newinst2",25,newinst2.processBA,newinst2.mostCurrent,43);
if (RapidSub.canDelegate("myappreload")) { return ir.saelozahra.damaara.mazraeyeman.newinst2.remoteMe.runUserSub(false, "newinst2","myappreload");}
 BA.debugLineNum = 43;BA.debugLine="Sub MyAppReload";
Debug.ShouldStop(1024);
 BA.debugLineNum = 44;BA.debugLine="If svcVerbose Then Log(\"-- AppUpdating.NewInst2:";
Debug.ShouldStop(2048);
if (newinst2._svcverbose.<Boolean>get().booleanValue()) { 
newinst2.mostCurrent.__c.runVoidMethod ("LogImpl","426804225",RemoteObject.createImmutable("-- AppUpdating.NewInst2: processing MyAppReload"),0);};
 BA.debugLineNum = 45;BA.debugLine="If IsPaused(\"main\") Then";
Debug.ShouldStop(4096);
if (newinst2.mostCurrent.__c.runMethod(true,"IsPaused",newinst2.processBA,(Object)((RemoteObject.createImmutable("main")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 46;BA.debugLine="StartActivity(\"main\")";
Debug.ShouldStop(8192);
newinst2.mostCurrent.__c.runVoidMethod ("StartActivity",newinst2.processBA,(Object)((RemoteObject.createImmutable("main"))));
 };
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 5;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 8;BA.debugLine="Dim pkg As String							'app's package name";
newinst2._pkg = RemoteObject.createImmutable("");
 //BA.debugLineNum = 9;BA.debugLine="Dim svcVerbose As Boolean					'True = shows start";
newinst2._svcverbose = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 10;BA.debugLine="Private LogColor1 As Int = 0xFFFF8C00		'color for";
newinst2._logcolor1 = BA.numberCast(int.class, ((int)0xffff8c00));
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _service_create() throws Exception{
try {
		Debug.PushSubsStack("Service_Create (newinst2) ","newinst2",25,newinst2.processBA,newinst2.mostCurrent,13);
if (RapidSub.canDelegate("service_create")) { return ir.saelozahra.damaara.mazraeyeman.newinst2.remoteMe.runUserSub(false, "newinst2","service_create");}
 BA.debugLineNum = 13;BA.debugLine="Sub Service_Create";
Debug.ShouldStop(4096);
 BA.debugLineNum = 14;BA.debugLine="LogColor(\"---- AppUpdating.newinst2: service crea";
Debug.ShouldStop(8192);
newinst2.mostCurrent.__c.runVoidMethod ("LogImpl","426542081",BA.ObjectToString("---- AppUpdating.newinst2: service created"),newinst2._logcolor1);
 BA.debugLineNum = 15;BA.debugLine="pkg = \"\"";
Debug.ShouldStop(16384);
newinst2._pkg = BA.ObjectToString("");
 BA.debugLineNum = 16;BA.debugLine="svcVerbose = False";
Debug.ShouldStop(32768);
newinst2._svcverbose = newinst2.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 17;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_destroy() throws Exception{
try {
		Debug.PushSubsStack("Service_Destroy (newinst2) ","newinst2",25,newinst2.processBA,newinst2.mostCurrent,35);
if (RapidSub.canDelegate("service_destroy")) { return ir.saelozahra.damaara.mazraeyeman.newinst2.remoteMe.runUserSub(false, "newinst2","service_destroy");}
 BA.debugLineNum = 35;BA.debugLine="Sub Service_Destroy";
Debug.ShouldStop(4);
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_start(RemoteObject _startingintent) throws Exception{
try {
		Debug.PushSubsStack("Service_Start (newinst2) ","newinst2",25,newinst2.processBA,newinst2.mostCurrent,19);
if (RapidSub.canDelegate("service_start")) { return ir.saelozahra.damaara.mazraeyeman.newinst2.remoteMe.runUserSub(false, "newinst2","service_start", _startingintent);}
Debug.locals.put("StartingIntent", _startingintent);
 BA.debugLineNum = 19;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 20;BA.debugLine="LogColor(\"---- AppUpdating.newinst2: service_star";
Debug.ShouldStop(524288);
newinst2.mostCurrent.__c.runVoidMethod ("LogImpl","426607617",BA.ObjectToString("---- AppUpdating.newinst2: service_started"),newinst2._logcolor1);
 BA.debugLineNum = 21;BA.debugLine="If svcVerbose Then";
Debug.ShouldStop(1048576);
if (newinst2._svcverbose.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 22;BA.debugLine="Log($\"${TAB}intent: ${StartingIntent}\"$)";
Debug.ShouldStop(2097152);
newinst2.mostCurrent.__c.runVoidMethod ("LogImpl","426607619",(RemoteObject.concat(RemoteObject.createImmutable(""),newinst2.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((newinst2.mostCurrent.__c.getField(true,"TAB")))),RemoteObject.createImmutable("intent: "),newinst2.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_startingintent.getObject()))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 23;BA.debugLine="Log($\"${TAB}action: ${StartingIntent.Action}\"$)";
Debug.ShouldStop(4194304);
newinst2.mostCurrent.__c.runVoidMethod ("LogImpl","426607620",(RemoteObject.concat(RemoteObject.createImmutable(""),newinst2.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((newinst2.mostCurrent.__c.getField(true,"TAB")))),RemoteObject.createImmutable("action: "),newinst2.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_startingintent.runMethod(true,"getAction")))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 24;BA.debugLine="Log($\"${TAB}extra: ${StartingIntent.ExtrasToStri";
Debug.ShouldStop(8388608);
newinst2.mostCurrent.__c.runVoidMethod ("LogImpl","426607621",(RemoteObject.concat(RemoteObject.createImmutable(""),newinst2.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((newinst2.mostCurrent.__c.getField(true,"TAB")))),RemoteObject.createImmutable("extra: "),newinst2.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_startingintent.runMethod(true,"ExtrasToString")))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 25;BA.debugLine="Log($\"${TAB}data: ${StartingIntent.GetData}\"$)";
Debug.ShouldStop(16777216);
newinst2.mostCurrent.__c.runVoidMethod ("LogImpl","426607622",(RemoteObject.concat(RemoteObject.createImmutable(""),newinst2.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((newinst2.mostCurrent.__c.getField(true,"TAB")))),RemoteObject.createImmutable("data: "),newinst2.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_startingintent.runMethod(true,"GetData")))),RemoteObject.createImmutable(""))),0);
 };
 BA.debugLineNum = 27;BA.debugLine="If StartingIntent.Action = \"android.intent.action";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_startingintent.runMethod(true,"getAction"),BA.ObjectToString("android.intent.action.MY_PACKAGE_REPLACED"))) { 
 BA.debugLineNum = 28;BA.debugLine="If svcVerbose Then Log($\"${TAB}Intent MY_PACKAGE";
Debug.ShouldStop(134217728);
if (newinst2._svcverbose.<Boolean>get().booleanValue()) { 
newinst2.mostCurrent.__c.runVoidMethod ("LogImpl","426607625",(RemoteObject.concat(RemoteObject.createImmutable(""),newinst2.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((newinst2.mostCurrent.__c.getField(true,"TAB")))),RemoteObject.createImmutable("Intent MY_PACKAGE_REPLACED received!"))),0);};
 BA.debugLineNum = 29;BA.debugLine="pkg = GetPackageName";
Debug.ShouldStop(268435456);
newinst2._pkg = _getpackagename();
 BA.debugLineNum = 30;BA.debugLine="If svcVerbose Then Log($\"${TAB}package: ${pkg}\"$";
Debug.ShouldStop(536870912);
if (newinst2._svcverbose.<Boolean>get().booleanValue()) { 
newinst2.mostCurrent.__c.runVoidMethod ("LogImpl","426607627",(RemoteObject.concat(RemoteObject.createImmutable(""),newinst2.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((newinst2.mostCurrent.__c.getField(true,"TAB")))),RemoteObject.createImmutable("package: "),newinst2.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((newinst2._pkg))),RemoteObject.createImmutable(""))),0);};
 BA.debugLineNum = 31;BA.debugLine="MyAppReload";
Debug.ShouldStop(1073741824);
_myappreload();
 };
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}