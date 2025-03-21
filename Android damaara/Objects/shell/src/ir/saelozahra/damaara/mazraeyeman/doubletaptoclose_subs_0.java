package ir.saelozahra.damaara.mazraeyeman;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class doubletaptoclose_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Private Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Private Ti As Timer";
doubletaptoclose._ti = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");__ref.setField("_ti",doubletaptoclose._ti);
 //BA.debugLineNum = 5;BA.debugLine="Private Timr As Timer";
doubletaptoclose._timr = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");__ref.setField("_timr",doubletaptoclose._timr);
 //BA.debugLineNum = 6;BA.debugLine="Private I As Float";
doubletaptoclose._i = RemoteObject.createImmutable(0f);__ref.setField("_i",doubletaptoclose._i);
 //BA.debugLineNum = 7;BA.debugLine="Private TT As String";
doubletaptoclose._tt = RemoteObject.createImmutable("");__ref.setField("_tt",doubletaptoclose._tt);
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _csb(RemoteObject __ref,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("CSB (doubletaptoclose) ","doubletaptoclose",15,__ref.getField(false, "ba"),__ref,37);
if (RapidSub.canDelegate("csb")) { return __ref.runUserSub(false, "doubletaptoclose","csb", __ref, _text);}
RemoteObject _csb1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.CSBuilder");
Debug.locals.put("Text", _text);
 BA.debugLineNum = 37;BA.debugLine="Public Sub CSB(Text As String) As CSBuilder";
Debug.ShouldStop(16);
 BA.debugLineNum = 38;BA.debugLine="Dim Csb1 As CSBuilder";
Debug.ShouldStop(32);
_csb1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.CSBuilder");Debug.locals.put("Csb1", _csb1);
 BA.debugLineNum = 39;BA.debugLine="Csb1.Initialize";
Debug.ShouldStop(64);
_csb1.runVoidMethod ("Initialize");
 BA.debugLineNum = 40;BA.debugLine="Csb1.Typeface(SaeloZahra.font).Alignment(\"ALIGN_C";
Debug.ShouldStop(128);
_csb1.runMethod(false,"Typeface",(Object)((doubletaptoclose._saelozahra._font /*RemoteObject*/ .getObject()))).runMethod(false,"Alignment",(Object)(BA.getEnumFromString(BA.getDeviceClass("android.text.Layout.Alignment"),RemoteObject.createImmutable("ALIGN_CENTER")))).runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(_text))).runVoidMethod ("PopAll");
 BA.debugLineNum = 41;BA.debugLine="Return Csb1";
Debug.ShouldStop(256);
if (true) return _csb1;
 BA.debugLineNum = 42;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _toasttext) throws Exception{
try {
		Debug.PushSubsStack("InItIaLiZe (doubletaptoclose) ","doubletaptoclose",15,__ref.getField(false, "ba"),__ref,12);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "doubletaptoclose","initialize", __ref, _ba, _toasttext);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("ToastText", _toasttext);
 BA.debugLineNum = 12;BA.debugLine="Public Sub InItIaLiZe (ToastText As String)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 13;BA.debugLine="I = 0";
Debug.ShouldStop(4096);
__ref.setField ("_i" /*RemoteObject*/ ,BA.numberCast(float.class, 0));
 BA.debugLineNum = 14;BA.debugLine="Ti.Initialize (\"Ti\",1000)";
Debug.ShouldStop(8192);
__ref.getField(false,"_ti" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Ti")),(Object)(BA.numberCast(long.class, 1000)));
 BA.debugLineNum = 15;BA.debugLine="Ti.Enabled = True";
Debug.ShouldStop(16384);
__ref.getField(false,"_ti" /*RemoteObject*/ ).runMethod(true,"setEnabled",doubletaptoclose.__c.getField(true,"True"));
 BA.debugLineNum = 16;BA.debugLine="Timr.Initialize (\"Timr\",100)";
Debug.ShouldStop(32768);
__ref.getField(false,"_timr" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Timr")),(Object)(BA.numberCast(long.class, 100)));
 BA.debugLineNum = 17;BA.debugLine="Timr.Enabled = True";
Debug.ShouldStop(65536);
__ref.getField(false,"_timr" /*RemoteObject*/ ).runMethod(true,"setEnabled",doubletaptoclose.__c.getField(true,"True"));
 BA.debugLineNum = 18;BA.debugLine="TT = ToastText";
Debug.ShouldStop(131072);
__ref.setField ("_tt" /*RemoteObject*/ ,_toasttext);
 BA.debugLineNum = 19;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _taptoclose(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("TapToClose (doubletaptoclose) ","doubletaptoclose",15,__ref.getField(false, "ba"),__ref,45);
if (RapidSub.canDelegate("taptoclose")) { return __ref.runUserSub(false, "doubletaptoclose","taptoclose", __ref);}
 BA.debugLineNum = 45;BA.debugLine="Public Sub TapToClose";
Debug.ShouldStop(4096);
 BA.debugLineNum = 47;BA.debugLine="ToastMessageShow (CSB(TT),False)";
Debug.ShouldStop(16384);
doubletaptoclose.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(__ref.runClassMethod (ir.saelozahra.damaara.mazraeyeman.doubletaptoclose.class, "_csb" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_tt" /*RemoteObject*/ ))).getObject())),(Object)(doubletaptoclose.__c.getField(true,"False")));
 BA.debugLineNum = 49;BA.debugLine="I = I+1.3";
Debug.ShouldStop(65536);
__ref.setField ("_i" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_i" /*RemoteObject*/ ),RemoteObject.createImmutable(1.3)}, "+",1, 0)));
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ti_tick(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Ti_Tick (doubletaptoclose) ","doubletaptoclose",15,__ref.getField(false, "ba"),__ref,21);
if (RapidSub.canDelegate("ti_tick")) { return __ref.runUserSub(false, "doubletaptoclose","ti_tick", __ref);}
 BA.debugLineNum = 21;BA.debugLine="Private Sub Ti_Tick";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 23;BA.debugLine="If I > 0 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_i" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 24;BA.debugLine="I = I-0.49";
Debug.ShouldStop(8388608);
__ref.setField ("_i" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_i" /*RemoteObject*/ ),RemoteObject.createImmutable(0.49)}, "-",1, 0)));
 };
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _timr_tick(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Timr_Tick (doubletaptoclose) ","doubletaptoclose",15,__ref.getField(false, "ba"),__ref,29);
if (RapidSub.canDelegate("timr_tick")) { return __ref.runUserSub(false, "doubletaptoclose","timr_tick", __ref);}
 BA.debugLineNum = 29;BA.debugLine="Private Sub Timr_Tick";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 31;BA.debugLine="If I >= 2 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("g",__ref.getField(true,"_i" /*RemoteObject*/ ),BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 32;BA.debugLine="ExitApplication";
Debug.ShouldStop(-2147483648);
doubletaptoclose.__c.runVoidMethod ("ExitApplication");
 };
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}