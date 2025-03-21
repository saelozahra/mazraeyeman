package ir.saelozahra.damaara.mazraeyeman;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class saelozahra_subs_0 {


public static RemoteObject  _beep(RemoteObject _ba,RemoteObject _address) throws Exception{
try {
		Debug.PushSubsStack("beep (saelozahra) ","saelozahra",7,_ba,saelozahra.mostCurrent,643);
if (RapidSub.canDelegate("beep")) { return ir.saelozahra.damaara.mazraeyeman.saelozahra.remoteMe.runUserSub(false, "saelozahra","beep", _ba, _address);}
RemoteObject _media = RemoteObject.declareNull("anywheresoftware.b4a.objects.MediaPlayerWrapper");
;
Debug.locals.put("address", _address);
 BA.debugLineNum = 643;BA.debugLine="Sub beep(address As String)";
Debug.ShouldStop(4);
 BA.debugLineNum = 644;BA.debugLine="Dim media As MediaPlayer";
Debug.ShouldStop(8);
_media = RemoteObject.createNew ("anywheresoftware.b4a.objects.MediaPlayerWrapper");Debug.locals.put("media", _media);
 BA.debugLineNum = 645;BA.debugLine="media.Initialize2(\"media\")";
Debug.ShouldStop(16);
_media.runVoidMethod ("Initialize2",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba),(Object)(RemoteObject.createImmutable("media")));
 BA.debugLineNum = 646;BA.debugLine="media.Load(File.DirAssets,address)";
Debug.ShouldStop(32);
_media.runVoidMethod ("Load",(Object)(saelozahra.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(_address));
 BA.debugLineNum = 647;BA.debugLine="media.SetVolume(0.2,0.2)";
Debug.ShouldStop(64);
_media.runVoidMethod ("SetVolume",(Object)(BA.numberCast(float.class, 0.2)),(Object)(BA.numberCast(float.class, 0.2)));
 BA.debugLineNum = 648;BA.debugLine="media.Play";
Debug.ShouldStop(128);
_media.runVoidMethod ("Play");
 BA.debugLineNum = 649;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _blur(RemoteObject _ba,RemoteObject _bmp) throws Exception{
try {
		Debug.PushSubsStack("Blur (saelozahra) ","saelozahra",7,_ba,saelozahra.mostCurrent,919);
if (RapidSub.canDelegate("blur")) { return ir.saelozahra.damaara.mazraeyeman.saelozahra.remoteMe.runUserSub(false, "saelozahra","blur", _ba, _bmp);}
RemoteObject _n = RemoteObject.createImmutable(0L);
RemoteObject _bc = RemoteObject.declareNull("b4a.example.bitmapcreator");
RemoteObject _reducescale = RemoteObject.createImmutable(0);
RemoteObject _count = RemoteObject.createImmutable(0);
RemoteObject _clrs = null;
RemoteObject _temp = RemoteObject.declareNull("b4a.example.bitmapcreator._argbcolor");
RemoteObject _m = RemoteObject.createImmutable(0);
int _steps = 0;
int _y = 0;
int _x = 0;
;
Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 919;BA.debugLine="Sub Blur (bmp As B4XBitmap) As B4XBitmap";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 920;BA.debugLine="Dim n As Long = DateTime.Now";
Debug.ShouldStop(8388608);
_n = saelozahra.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("n", _n);Debug.locals.put("n", _n);
 BA.debugLineNum = 921;BA.debugLine="Dim bc As BitmapCreator";
Debug.ShouldStop(16777216);
_bc = RemoteObject.createNew ("b4a.example.bitmapcreator");Debug.locals.put("bc", _bc);
 BA.debugLineNum = 922;BA.debugLine="Dim ReduceScale As Int = 2";
Debug.ShouldStop(33554432);
_reducescale = BA.numberCast(int.class, 2);Debug.locals.put("ReduceScale", _reducescale);Debug.locals.put("ReduceScale", _reducescale);
 BA.debugLineNum = 923;BA.debugLine="bc.Initialize(bmp.Width / ReduceScale / bmp.Scale";
Debug.ShouldStop(67108864);
_bc.runVoidMethod ("_initialize",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_bmp.runMethod(true,"getWidth"),_reducescale,_bmp.runMethod(true,"getScale")}, "//",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_bmp.runMethod(true,"getHeight"),_reducescale,_bmp.runMethod(true,"getScale")}, "//",0, 0))));
 BA.debugLineNum = 924;BA.debugLine="bc.CopyPixelsFromBitmap(bmp)";
Debug.ShouldStop(134217728);
_bc.runVoidMethod ("_copypixelsfrombitmap",(Object)(_bmp));
 BA.debugLineNum = 925;BA.debugLine="Dim count As Int = 3";
Debug.ShouldStop(268435456);
_count = BA.numberCast(int.class, 3);Debug.locals.put("count", _count);Debug.locals.put("count", _count);
 BA.debugLineNum = 926;BA.debugLine="Dim clrs(3) As ARGBColor";
Debug.ShouldStop(536870912);
_clrs = RemoteObject.createNewArray ("b4a.example.bitmapcreator._argbcolor", new int[] {3}, new Object[]{});Debug.locals.put("clrs", _clrs);
 BA.debugLineNum = 927;BA.debugLine="Dim temp As ARGBColor";
Debug.ShouldStop(1073741824);
_temp = RemoteObject.createNew ("b4a.example.bitmapcreator._argbcolor");Debug.locals.put("temp", _temp);
 BA.debugLineNum = 928;BA.debugLine="Dim m As Int";
Debug.ShouldStop(-2147483648);
_m = RemoteObject.createImmutable(0);Debug.locals.put("m", _m);
 BA.debugLineNum = 929;BA.debugLine="For steps = 1 To count";
Debug.ShouldStop(1);
{
final int step10 = 1;
final int limit10 = _count.<Integer>get().intValue();
_steps = 1 ;
for (;(step10 > 0 && _steps <= limit10) || (step10 < 0 && _steps >= limit10) ;_steps = ((int)(0 + _steps + step10))  ) {
Debug.locals.put("steps", _steps);
 BA.debugLineNum = 930;BA.debugLine="For y = 0 To bc.mHeight - 1";
Debug.ShouldStop(2);
{
final int step11 = 1;
final int limit11 = RemoteObject.solve(new RemoteObject[] {_bc.getField(true,"_mheight"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_y = 0 ;
for (;(step11 > 0 && _y <= limit11) || (step11 < 0 && _y >= limit11) ;_y = ((int)(0 + _y + step11))  ) {
Debug.locals.put("y", _y);
 BA.debugLineNum = 931;BA.debugLine="For x = 0 To 2";
Debug.ShouldStop(4);
{
final int step12 = 1;
final int limit12 = 2;
_x = 0 ;
for (;(step12 > 0 && _x <= limit12) || (step12 < 0 && _x >= limit12) ;_x = ((int)(0 + _x + step12))  ) {
Debug.locals.put("x", _x);
 BA.debugLineNum = 932;BA.debugLine="bc.GetARGB(x, y, clrs(x))";
Debug.ShouldStop(8);
_bc.runVoidMethod ("_getargb",(Object)(BA.numberCast(int.class, _x)),(Object)(BA.numberCast(int.class, _y)),(Object)(_clrs.getArrayElement(false,BA.numberCast(int.class, _x))));
 }
}Debug.locals.put("x", _x);
;
 BA.debugLineNum = 934;BA.debugLine="SetAvg(bc, 1, y, clrs, temp)";
Debug.ShouldStop(32);
_setavg(_ba,_bc,BA.numberCast(int.class, 1),BA.numberCast(int.class, _y),_clrs,_temp);
 BA.debugLineNum = 935;BA.debugLine="m = 0";
Debug.ShouldStop(64);
_m = BA.numberCast(int.class, 0);Debug.locals.put("m", _m);
 BA.debugLineNum = 936;BA.debugLine="For x = 2 To bc.mWidth - 2";
Debug.ShouldStop(128);
{
final int step17 = 1;
final int limit17 = RemoteObject.solve(new RemoteObject[] {_bc.getField(true,"_mwidth"),RemoteObject.createImmutable(2)}, "-",1, 1).<Integer>get().intValue();
_x = 2 ;
for (;(step17 > 0 && _x <= limit17) || (step17 < 0 && _x >= limit17) ;_x = ((int)(0 + _x + step17))  ) {
Debug.locals.put("x", _x);
 BA.debugLineNum = 937;BA.debugLine="bc.GetARGB(x + 1, y, clrs(m))";
Debug.ShouldStop(256);
_bc.runVoidMethod ("_getargb",(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_x),RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)(BA.numberCast(int.class, _y)),(Object)(_clrs.getArrayElement(false,_m)));
 BA.debugLineNum = 938;BA.debugLine="m = (m + 1) Mod clrs.Length";
Debug.ShouldStop(512);
_m = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_m,RemoteObject.createImmutable(1)}, "+",1, 1)),_clrs.getField(true,"length")}, "%",0, 1);Debug.locals.put("m", _m);
 BA.debugLineNum = 939;BA.debugLine="SetAvg(bc, x, y, clrs, temp)";
Debug.ShouldStop(1024);
_setavg(_ba,_bc,BA.numberCast(int.class, _x),BA.numberCast(int.class, _y),_clrs,_temp);
 }
}Debug.locals.put("x", _x);
;
 }
}Debug.locals.put("y", _y);
;
 BA.debugLineNum = 942;BA.debugLine="For x = 0 To bc.mWidth - 1";
Debug.ShouldStop(8192);
{
final int step23 = 1;
final int limit23 = RemoteObject.solve(new RemoteObject[] {_bc.getField(true,"_mwidth"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_x = 0 ;
for (;(step23 > 0 && _x <= limit23) || (step23 < 0 && _x >= limit23) ;_x = ((int)(0 + _x + step23))  ) {
Debug.locals.put("x", _x);
 BA.debugLineNum = 943;BA.debugLine="For y = 0 To 2";
Debug.ShouldStop(16384);
{
final int step24 = 1;
final int limit24 = 2;
_y = 0 ;
for (;(step24 > 0 && _y <= limit24) || (step24 < 0 && _y >= limit24) ;_y = ((int)(0 + _y + step24))  ) {
Debug.locals.put("y", _y);
 BA.debugLineNum = 944;BA.debugLine="bc.GetARGB(x, y, clrs(y))";
Debug.ShouldStop(32768);
_bc.runVoidMethod ("_getargb",(Object)(BA.numberCast(int.class, _x)),(Object)(BA.numberCast(int.class, _y)),(Object)(_clrs.getArrayElement(false,BA.numberCast(int.class, _y))));
 }
}Debug.locals.put("y", _y);
;
 BA.debugLineNum = 946;BA.debugLine="SetAvg(bc, x, 1, clrs, temp)";
Debug.ShouldStop(131072);
_setavg(_ba,_bc,BA.numberCast(int.class, _x),BA.numberCast(int.class, 1),_clrs,_temp);
 BA.debugLineNum = 947;BA.debugLine="m = 0";
Debug.ShouldStop(262144);
_m = BA.numberCast(int.class, 0);Debug.locals.put("m", _m);
 BA.debugLineNum = 948;BA.debugLine="For y = 2 To bc.mHeight - 2";
Debug.ShouldStop(524288);
{
final int step29 = 1;
final int limit29 = RemoteObject.solve(new RemoteObject[] {_bc.getField(true,"_mheight"),RemoteObject.createImmutable(2)}, "-",1, 1).<Integer>get().intValue();
_y = 2 ;
for (;(step29 > 0 && _y <= limit29) || (step29 < 0 && _y >= limit29) ;_y = ((int)(0 + _y + step29))  ) {
Debug.locals.put("y", _y);
 BA.debugLineNum = 949;BA.debugLine="bc.GetARGB(x, y + 1, clrs(m))";
Debug.ShouldStop(1048576);
_bc.runVoidMethod ("_getargb",(Object)(BA.numberCast(int.class, _x)),(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_y),RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)(_clrs.getArrayElement(false,_m)));
 BA.debugLineNum = 950;BA.debugLine="m = (m + 1) Mod clrs.Length";
Debug.ShouldStop(2097152);
_m = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_m,RemoteObject.createImmutable(1)}, "+",1, 1)),_clrs.getField(true,"length")}, "%",0, 1);Debug.locals.put("m", _m);
 BA.debugLineNum = 951;BA.debugLine="SetAvg(bc, x, y, clrs, temp)";
Debug.ShouldStop(4194304);
_setavg(_ba,_bc,BA.numberCast(int.class, _x),BA.numberCast(int.class, _y),_clrs,_temp);
 }
}Debug.locals.put("y", _y);
;
 }
}Debug.locals.put("x", _x);
;
 }
}Debug.locals.put("steps", _steps);
;
 BA.debugLineNum = 955;BA.debugLine="Log(DateTime.Now - n)";
Debug.ShouldStop(67108864);
saelozahra.mostCurrent.__c.runVoidMethod ("LogImpl","49568292",BA.NumberToString(RemoteObject.solve(new RemoteObject[] {saelozahra.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"),_n}, "-",1, 2)),0);
 BA.debugLineNum = 956;BA.debugLine="Return bc.Bitmap";
Debug.ShouldStop(134217728);
if (true) return _bc.runMethod(false,"_getbitmap");
 BA.debugLineNum = 957;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cd(RemoteObject _ba,RemoteObject _color1) throws Exception{
try {
		Debug.PushSubsStack("CD (saelozahra) ","saelozahra",7,_ba,saelozahra.mostCurrent,135);
if (RapidSub.canDelegate("cd")) { return ir.saelozahra.damaara.mazraeyeman.saelozahra.remoteMe.runUserSub(false, "saelozahra","cd", _ba, _color1);}
RemoteObject _cd2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
;
Debug.locals.put("Color1", _color1);
 BA.debugLineNum = 135;BA.debugLine="Sub CD( Color1 As Int ) As ColorDrawable";
Debug.ShouldStop(64);
 BA.debugLineNum = 136;BA.debugLine="Dim cd2 As ColorDrawable";
Debug.ShouldStop(128);
_cd2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("cd2", _cd2);
 BA.debugLineNum = 137;BA.debugLine="cd2.Initialize2(Colors.White,16dip,2dip,Color1)";
Debug.ShouldStop(256);
_cd2.runVoidMethod ("Initialize2",(Object)(saelozahra.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(saelozahra.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 16)))),(Object)(saelozahra.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(_color1));
 BA.debugLineNum = 138;BA.debugLine="Return cd2";
Debug.ShouldStop(512);
if (true) return _cd2;
 BA.debugLineNum = 139;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _changegooglemapstyle(RemoteObject _ba,RemoteObject _stylecode,RemoteObject _map) throws Exception{
try {
		Debug.PushSubsStack("ChangeGooglemapStyle (saelozahra) ","saelozahra",7,_ba,saelozahra.mostCurrent,676);
if (RapidSub.canDelegate("changegooglemapstyle")) { return ir.saelozahra.damaara.mazraeyeman.saelozahra.remoteMe.runUserSub(false, "saelozahra","changegooglemapstyle", _ba, _stylecode, _map);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _style = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
;
Debug.locals.put("StyleCode", _stylecode);
Debug.locals.put("Map", _map);
 BA.debugLineNum = 676;BA.debugLine="Sub ChangeGooglemapStyle(StyleCode As String,Map A";
Debug.ShouldStop(8);
 BA.debugLineNum = 677;BA.debugLine="Dim jo As JavaObject = Map";
Debug.ShouldStop(16);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _map.getObject());Debug.locals.put("jo", _jo);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 678;BA.debugLine="Dim Style As JavaObject";
Debug.ShouldStop(32);
_style = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("Style", _style);
 BA.debugLineNum = 679;BA.debugLine="Style.InitializeNewInstance(\"com.google.android.g";
Debug.ShouldStop(64);
_style.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("com.google.android.gms.maps.model.MapStyleOptions")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_stylecode)})));
 BA.debugLineNum = 680;BA.debugLine="Return jo.RunMethod(\"setMapStyle\", Array(Style))";
Debug.ShouldStop(128);
if (true) return BA.ObjectToString(_jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("setMapStyle")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_style.getObject())}))));
 BA.debugLineNum = 681;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkconnection(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("CheckConnection (saelozahra) ","saelozahra",7,_ba,saelozahra.mostCurrent,629);
if (RapidSub.canDelegate("checkconnection")) { return ir.saelozahra.damaara.mazraeyeman.saelozahra.remoteMe.runUserSub(false, "saelozahra","checkconnection", _ba);}
;
 BA.debugLineNum = 629;BA.debugLine="Sub CheckConnection As Boolean";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 631;BA.debugLine="If (p.GetDataState == \"CONNECTED\") Or (p.GetSetti";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",saelozahra._p.runMethod(true,"GetDataState"),RemoteObject.createImmutable("CONNECTED"))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",saelozahra._p.runMethod(true,"GetSettings",(Object)(RemoteObject.createImmutable("wifi_on"))),BA.NumberToString(1)))))) { 
 BA.debugLineNum = 632;BA.debugLine="Return True";
Debug.ShouldStop(8388608);
if (true) return saelozahra.mostCurrent.__c.getField(true,"True");
 }else 
{ BA.debugLineNum = 633;BA.debugLine="else If (p.GetDataState == \"DISCONNECTED\") Or (p.";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",saelozahra._p.runMethod(true,"GetDataState"),RemoteObject.createImmutable("DISCONNECTED"))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",saelozahra._p.runMethod(true,"GetDataState"),RemoteObject.createImmutable("SUSPENDED")))))) { 
 BA.debugLineNum = 634;BA.debugLine="Return False";
Debug.ShouldStop(33554432);
if (true) return saelozahra.mostCurrent.__c.getField(true,"False");
 }else {
 BA.debugLineNum = 636;BA.debugLine="Return True";
Debug.ShouldStop(134217728);
if (true) return saelozahra.mostCurrent.__c.getField(true,"True");
 }}
;
 BA.debugLineNum = 639;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checksite(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("CheckSite (saelozahra) ","saelozahra",7,_ba,saelozahra.mostCurrent,651);
if (RapidSub.canDelegate("checksite")) { return ir.saelozahra.damaara.mazraeyeman.saelozahra.remoteMe.runUserSub(false, "saelozahra","checksite", _ba);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
;
 BA.debugLineNum = 651;BA.debugLine="Sub CheckSite As Boolean";
Debug.ShouldStop(1024);
 BA.debugLineNum = 652;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(2048);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 653;BA.debugLine="sb.Initialize";
Debug.ShouldStop(4096);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 654;BA.debugLine="p.Shell(\"ping -c 2 -W 10 -v mazraeyeman.ir\", Null";
Debug.ShouldStop(8192);
saelozahra._p.runVoidMethod ("Shell",(Object)(BA.ObjectToString("ping -c 2 -W 10 -v mazraeyeman.ir")),(Object)((saelozahra.mostCurrent.__c.getField(false,"Null"))),(Object)((_sb.getObject())),(Object)((saelozahra.mostCurrent.__c.getField(false,"Null"))));
 BA.debugLineNum = 655;BA.debugLine="If sb.Length = 0 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_sb.runMethod(true,"getLength"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 656;BA.debugLine="Return False";
Debug.ShouldStop(32768);
if (true) return saelozahra.mostCurrent.__c.getField(true,"False");
 }else {
 BA.debugLineNum = 658;BA.debugLine="Return True";
Debug.ShouldStop(131072);
if (true) return saelozahra.mostCurrent.__c.getField(true,"True");
 };
 BA.debugLineNum = 660;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _convertenglish(RemoteObject _ba,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("ConvertEnglish (saelozahra) ","saelozahra",7,_ba,saelozahra.mostCurrent,250);
if (RapidSub.canDelegate("convertenglish")) { return ir.saelozahra.damaara.mazraeyeman.saelozahra.remoteMe.runUserSub(false, "saelozahra","convertenglish", _ba, _text);}
;
Debug.locals.put("Text", _text);
 BA.debugLineNum = 250;BA.debugLine="Sub ConvertEnglish( Text As String ) As String";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 251;BA.debugLine="Return Text.Replace( \"۰\" , \"0\" ).Replace( \"۱\" , \"";
Debug.ShouldStop(67108864);
if (true) return _text.runMethod(true,"replace",(Object)(BA.ObjectToString("۰")),(Object)(RemoteObject.createImmutable("0"))).runMethod(true,"replace",(Object)(BA.ObjectToString("۱")),(Object)(RemoteObject.createImmutable("1"))).runMethod(true,"replace",(Object)(BA.ObjectToString("۲")),(Object)(RemoteObject.createImmutable("2"))).runMethod(true,"replace",(Object)(BA.ObjectToString("۳")),(Object)(RemoteObject.createImmutable("3"))).runMethod(true,"replace",(Object)(BA.ObjectToString("۴")),(Object)(RemoteObject.createImmutable("4"))).runMethod(true,"replace",(Object)(BA.ObjectToString("۵")),(Object)(RemoteObject.createImmutable("5"))).runMethod(true,"replace",(Object)(BA.ObjectToString("۶")),(Object)(RemoteObject.createImmutable("6"))).runMethod(true,"replace",(Object)(BA.ObjectToString("۷")),(Object)(RemoteObject.createImmutable("7"))).runMethod(true,"replace",(Object)(BA.ObjectToString("۸")),(Object)(RemoteObject.createImmutable("8"))).runMethod(true,"replace",(Object)(BA.ObjectToString("۹")),(Object)(RemoteObject.createImmutable("9")));
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
public static RemoteObject  _convertpersian(RemoteObject _ba,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("ConvertPersian (saelozahra) ","saelozahra",7,_ba,saelozahra.mostCurrent,246);
if (RapidSub.canDelegate("convertpersian")) { return ir.saelozahra.damaara.mazraeyeman.saelozahra.remoteMe.runUserSub(false, "saelozahra","convertpersian", _ba, _text);}
;
Debug.locals.put("Text", _text);
 BA.debugLineNum = 246;BA.debugLine="Sub ConvertPersian( Text As String ) As String";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 247;BA.debugLine="Return Text.Replace( \"0\" , \"۰\" ).Replace( \"1\" , \"";
Debug.ShouldStop(4194304);
if (true) return _text.runMethod(true,"replace",(Object)(BA.ObjectToString("0")),(Object)(RemoteObject.createImmutable("۰"))).runMethod(true,"replace",(Object)(BA.ObjectToString("1")),(Object)(RemoteObject.createImmutable("۱"))).runMethod(true,"replace",(Object)(BA.ObjectToString("2")),(Object)(RemoteObject.createImmutable("۲"))).runMethod(true,"replace",(Object)(BA.ObjectToString("3")),(Object)(RemoteObject.createImmutable("۳"))).runMethod(true,"replace",(Object)(BA.ObjectToString("4")),(Object)(RemoteObject.createImmutable("۴"))).runMethod(true,"replace",(Object)(BA.ObjectToString("5")),(Object)(RemoteObject.createImmutable("۵"))).runMethod(true,"replace",(Object)(BA.ObjectToString("6")),(Object)(RemoteObject.createImmutable("۶"))).runMethod(true,"replace",(Object)(BA.ObjectToString("7")),(Object)(RemoteObject.createImmutable("۷"))).runMethod(true,"replace",(Object)(BA.ObjectToString("8")),(Object)(RemoteObject.createImmutable("۸"))).runMethod(true,"replace",(Object)(BA.ObjectToString("9")),(Object)(RemoteObject.createImmutable("۹")));
 BA.debugLineNum = 248;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _csb(RemoteObject _ba,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("CSB (saelozahra) ","saelozahra",7,_ba,saelozahra.mostCurrent,664);
if (RapidSub.canDelegate("csb")) { return ir.saelozahra.damaara.mazraeyeman.saelozahra.remoteMe.runUserSub(false, "saelozahra","csb", _ba, _text);}
RemoteObject _cs = RemoteObject.declareNull("anywheresoftware.b4a.objects.CSBuilder");
;
Debug.locals.put("text", _text);
 BA.debugLineNum = 664;BA.debugLine="Sub CSB(text As String) As CSBuilder";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 665;BA.debugLine="Dim CS As CSBuilder";
Debug.ShouldStop(16777216);
_cs = RemoteObject.createNew ("anywheresoftware.b4a.objects.CSBuilder");Debug.locals.put("CS", _cs);
 BA.debugLineNum = 666;BA.debugLine="CS.Initialize.Typeface(font).Append(text).PopAll";
Debug.ShouldStop(33554432);
_cs.runMethod(false,"Initialize").runMethod(false,"Typeface",(Object)((saelozahra._font.getObject()))).runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(_text))).runVoidMethod ("PopAll");
 BA.debugLineNum = 667;BA.debugLine="Return CS";
Debug.ShouldStop(67108864);
if (true) return _cs;
 BA.debugLineNum = 668;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _csbtitle(RemoteObject _ba,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("CSBTitle (saelozahra) ","saelozahra",7,_ba,saelozahra.mostCurrent,670);
if (RapidSub.canDelegate("csbtitle")) { return ir.saelozahra.damaara.mazraeyeman.saelozahra.remoteMe.runUserSub(false, "saelozahra","csbtitle", _ba, _text);}
RemoteObject _cs = RemoteObject.declareNull("anywheresoftware.b4a.objects.CSBuilder");
;
Debug.locals.put("text", _text);
 BA.debugLineNum = 670;BA.debugLine="Sub CSBTitle(text As String) As CSBuilder";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 671;BA.debugLine="Dim CS As CSBuilder";
Debug.ShouldStop(1073741824);
_cs = RemoteObject.createNew ("anywheresoftware.b4a.objects.CSBuilder");Debug.locals.put("CS", _cs);
 BA.debugLineNum = 672;BA.debugLine="CS.Initialize.Typeface(Typeface.LoadFromAssets(\"a";
Debug.ShouldStop(-2147483648);
_cs.runMethod(false,"Initialize").runMethod(false,"Typeface",(Object)(saelozahra.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("aviny.ttf"))))).runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(_text))).runVoidMethod ("PopAll");
 BA.debugLineNum = 673;BA.debugLine="Return CS";
Debug.ShouldStop(1);
if (true) return _cs;
 BA.debugLineNum = 674;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _encodeurl(RemoteObject _ba,RemoteObject _myurl) throws Exception{
try {
		Debug.PushSubsStack("EncodeUrl (saelozahra) ","saelozahra",7,_ba,saelozahra.mostCurrent,239);
if (RapidSub.canDelegate("encodeurl")) { return ir.saelozahra.damaara.mazraeyeman.saelozahra.remoteMe.runUserSub(false, "saelozahra","encodeurl", _ba, _myurl);}
RemoteObject _strutil = RemoteObject.declareNull("anywheresoftware.b4a.objects.StringUtils");
;
Debug.locals.put("myUrl", _myurl);
 BA.debugLineNum = 239;BA.debugLine="Sub EncodeUrl(myUrl As String) As String";
Debug.ShouldStop(16384);
 BA.debugLineNum = 241;BA.debugLine="Dim strUtil As StringUtils";
Debug.ShouldStop(65536);
_strutil = RemoteObject.createNew ("anywheresoftware.b4a.objects.StringUtils");Debug.locals.put("strUtil", _strutil);
 BA.debugLineNum = 242;BA.debugLine="Return strUtil.EncodeUrl(myUrl,\"UTF8\")";
Debug.ShouldStop(131072);
if (true) return _strutil.runMethod(true,"EncodeUrl",(Object)(_myurl),(Object)(RemoteObject.createImmutable("UTF8")));
 BA.debugLineNum = 244;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _esmemah(RemoteObject _ba,RemoteObject _input) throws Exception{
try {
		Debug.PushSubsStack("esmeMah (saelozahra) ","saelozahra",7,_ba,saelozahra.mostCurrent,259);
if (RapidSub.canDelegate("esmemah")) { return ir.saelozahra.damaara.mazraeyeman.saelozahra.remoteMe.runUserSub(false, "saelozahra","esmemah", _ba, _input);}
;
Debug.locals.put("input", _input);
 BA.debugLineNum = 259;BA.debugLine="Sub esmeMah(input As Int)As String";
Debug.ShouldStop(4);
 BA.debugLineNum = 261;BA.debugLine="Select input";
Debug.ShouldStop(16);
switch (BA.switchObjectToInt(_input,BA.numberCast(int.class, 1),BA.numberCast(int.class, 2),BA.numberCast(int.class, 3),BA.numberCast(int.class, 4),BA.numberCast(int.class, 5),BA.numberCast(int.class, 6),BA.numberCast(int.class, 7),BA.numberCast(int.class, 8),BA.numberCast(int.class, 9),BA.numberCast(int.class, 10),BA.numberCast(int.class, 11),BA.numberCast(int.class, 12))) {
case 0: {
 BA.debugLineNum = 264;BA.debugLine="Return \"فروردین\"";
Debug.ShouldStop(128);
if (true) return BA.ObjectToString("فروردین");
 break; }
case 1: {
 BA.debugLineNum = 266;BA.debugLine="Return \"اردیبهشت\"";
Debug.ShouldStop(512);
if (true) return BA.ObjectToString("اردیبهشت");
 break; }
case 2: {
 BA.debugLineNum = 268;BA.debugLine="Return \"خرداد\"";
Debug.ShouldStop(2048);
if (true) return BA.ObjectToString("خرداد");
 break; }
case 3: {
 BA.debugLineNum = 270;BA.debugLine="Return \"تیر\"";
Debug.ShouldStop(8192);
if (true) return BA.ObjectToString("تیر");
 break; }
case 4: {
 BA.debugLineNum = 272;BA.debugLine="Return \"مرداد\"";
Debug.ShouldStop(32768);
if (true) return BA.ObjectToString("مرداد");
 break; }
case 5: {
 BA.debugLineNum = 274;BA.debugLine="Return \"شهریور\"";
Debug.ShouldStop(131072);
if (true) return BA.ObjectToString("شهریور");
 break; }
case 6: {
 BA.debugLineNum = 276;BA.debugLine="Return \"مهر\"";
Debug.ShouldStop(524288);
if (true) return BA.ObjectToString("مهر");
 break; }
case 7: {
 BA.debugLineNum = 278;BA.debugLine="Return \"آبان\"";
Debug.ShouldStop(2097152);
if (true) return BA.ObjectToString("آبان");
 break; }
case 8: {
 BA.debugLineNum = 280;BA.debugLine="Return \"آذر\"";
Debug.ShouldStop(8388608);
if (true) return BA.ObjectToString("آذر");
 break; }
case 9: {
 BA.debugLineNum = 282;BA.debugLine="Return \"دی\"";
Debug.ShouldStop(33554432);
if (true) return BA.ObjectToString("دی");
 break; }
case 10: {
 BA.debugLineNum = 284;BA.debugLine="Return \"بهمن\"";
Debug.ShouldStop(134217728);
if (true) return BA.ObjectToString("بهمن");
 break; }
case 11: {
 BA.debugLineNum = 286;BA.debugLine="Return \"اسفند\"";
Debug.ShouldStop(536870912);
if (true) return BA.ObjectToString("اسفند");
 break; }
default: {
 BA.debugLineNum = 288;BA.debugLine="Return input";
Debug.ShouldStop(-2147483648);
if (true) return BA.NumberToString(_input);
 break; }
}
;
 BA.debugLineNum = 291;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _esmeroozehafte(RemoteObject _ba,RemoteObject _timestamp) throws Exception{
try {
		Debug.PushSubsStack("esmeRoozeHafte (saelozahra) ","saelozahra",7,_ba,saelozahra.mostCurrent,405);
if (RapidSub.canDelegate("esmeroozehafte")) { return ir.saelozahra.damaara.mazraeyeman.saelozahra.remoteMe.runUserSub(false, "saelozahra","esmeroozehafte", _ba, _timestamp);}
;
Debug.locals.put("timestamp", _timestamp);
 BA.debugLineNum = 405;BA.debugLine="Sub esmeRoozeHafte(timestamp As Long) As String";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 410;BA.debugLine="If timestamp == 0 Then timestamp = DateTime.Now";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_timestamp,BA.numberCast(long.class, 0))) { 
_timestamp = saelozahra.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("timestamp", _timestamp);};
 BA.debugLineNum = 412;BA.debugLine="Select DateTime.GetDayOfWeek(timestamp)";
Debug.ShouldStop(134217728);
switch (BA.switchObjectToInt(saelozahra.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"GetDayOfWeek",(Object)(_timestamp)),BA.numberCast(int.class, 7),BA.numberCast(int.class, 1),BA.numberCast(int.class, 2),BA.numberCast(int.class, 3),BA.numberCast(int.class, 4),BA.numberCast(int.class, 5),BA.numberCast(int.class, 6))) {
case 0: {
 BA.debugLineNum = 414;BA.debugLine="Return \" شنبه \"";
Debug.ShouldStop(536870912);
if (true) return BA.ObjectToString(" شنبه ");
 break; }
case 1: {
 BA.debugLineNum = 416;BA.debugLine="Return \" یکشنبه \"";
Debug.ShouldStop(-2147483648);
if (true) return BA.ObjectToString(" یکشنبه ");
 break; }
case 2: {
 BA.debugLineNum = 418;BA.debugLine="Return \" دوشنبه \"";
Debug.ShouldStop(2);
if (true) return BA.ObjectToString(" دوشنبه ");
 break; }
case 3: {
 BA.debugLineNum = 420;BA.debugLine="Return \" سه شنبه \"";
Debug.ShouldStop(8);
if (true) return BA.ObjectToString(" سه شنبه ");
 break; }
case 4: {
 BA.debugLineNum = 422;BA.debugLine="Return \" چهارشنبه \"";
Debug.ShouldStop(32);
if (true) return BA.ObjectToString(" چهارشنبه ");
 break; }
case 5: {
 BA.debugLineNum = 424;BA.debugLine="Return \" پنجشنبه \"";
Debug.ShouldStop(128);
if (true) return BA.ObjectToString(" پنجشنبه ");
 break; }
case 6: {
 BA.debugLineNum = 426;BA.debugLine="Return \" جمعه \"";
Debug.ShouldStop(512);
if (true) return BA.ObjectToString(" جمعه ");
 break; }
default: {
 BA.debugLineNum = 428;BA.debugLine="Return \" امروز \"";
Debug.ShouldStop(2048);
if (true) return BA.ObjectToString(" امروز ");
 break; }
}
;
 BA.debugLineNum = 431;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _findalertcolor(RemoteObject _ba,RemoteObject _alerttype) throws Exception{
try {
		Debug.PushSubsStack("FindAlertColor (saelozahra) ","saelozahra",7,_ba,saelozahra.mostCurrent,85);
if (RapidSub.canDelegate("findalertcolor")) { return ir.saelozahra.damaara.mazraeyeman.saelozahra.remoteMe.runUserSub(false, "saelozahra","findalertcolor", _ba, _alerttype);}
;
Debug.locals.put("AlertType", _alerttype);
 BA.debugLineNum = 85;BA.debugLine="Sub FindAlertColor(AlertType As String) As Int";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 86;BA.debugLine="Select AlertType";
Debug.ShouldStop(2097152);
switch (BA.switchObjectToInt(_alerttype,BA.ObjectToString("weather"),BA.ObjectToString("sarmazadegi"),BA.ObjectToString("garmazadegi"),BA.ObjectToString("yakhbandan"),BA.ObjectToString("notification"),BA.ObjectToString("baraneshadid"))) {
case 0: {
 BA.debugLineNum = 88;BA.debugLine="Return 0xFF3DBBF1";
Debug.ShouldStop(8388608);
if (true) return BA.numberCast(int.class, ((int)0xff3dbbf1));
 break; }
case 1: {
 BA.debugLineNum = 90;BA.debugLine="Return Colors.red";
Debug.ShouldStop(33554432);
if (true) return saelozahra.mostCurrent.__c.getField(false,"Colors").getField(true,"Red");
 break; }
case 2: {
 BA.debugLineNum = 92;BA.debugLine="Return Colors.red";
Debug.ShouldStop(134217728);
if (true) return saelozahra.mostCurrent.__c.getField(false,"Colors").getField(true,"Red");
 break; }
case 3: {
 BA.debugLineNum = 94;BA.debugLine="Return Colors.red";
Debug.ShouldStop(536870912);
if (true) return saelozahra.mostCurrent.__c.getField(false,"Colors").getField(true,"Red");
 break; }
case 4: {
 BA.debugLineNum = 96;BA.debugLine="Return 0xFFD0A614";
Debug.ShouldStop(-2147483648);
if (true) return BA.numberCast(int.class, ((int)0xffd0a614));
 break; }
case 5: {
 BA.debugLineNum = 98;BA.debugLine="Return Colors.red";
Debug.ShouldStop(2);
if (true) return saelozahra.mostCurrent.__c.getField(false,"Colors").getField(true,"Red");
 break; }
default: {
 BA.debugLineNum = 100;BA.debugLine="Return Colors.RGB(Rnd(0,254),Rnd(0,254),Rnd(0,2";
Debug.ShouldStop(8);
if (true) return saelozahra.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(saelozahra.mostCurrent.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 254)))),(Object)(saelozahra.mostCurrent.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 254)))),(Object)(saelozahra.mostCurrent.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 254)))));
 break; }
}
;
 BA.debugLineNum = 102;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _findmax(RemoteObject _ba,RemoteObject _ints) throws Exception{
try {
		Debug.PushSubsStack("FindMax (saelozahra) ","saelozahra",7,_ba,saelozahra.mostCurrent,215);
if (RapidSub.canDelegate("findmax")) { return ir.saelozahra.damaara.mazraeyeman.saelozahra.remoteMe.runUserSub(false, "saelozahra","findmax", _ba, _ints);}
;
Debug.locals.put("Ints", _ints);
 BA.debugLineNum = 215;BA.debugLine="Sub FindMax(Ints As List) As String";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 217;BA.debugLine="Ints.Sort(False)";
Debug.ShouldStop(16777216);
_ints.runVoidMethod ("Sort",(Object)(saelozahra.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 218;BA.debugLine="Log(\"start with: \"&Ints.Get(0)&\"end with:\"&Ints.G";
Debug.ShouldStop(33554432);
saelozahra.mostCurrent.__c.runVoidMethod ("LogImpl","47995395",RemoteObject.concat(RemoteObject.createImmutable("start with: "),_ints.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))),RemoteObject.createImmutable("end with:"),_ints.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {_ints.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1))),RemoteObject.createImmutable("        _  Max: "),_parseint(_ba,BA.ObjectToString(_ints.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0)))))),0);
 BA.debugLineNum = 219;BA.debugLine="Return Ints.Get(0)";
Debug.ShouldStop(67108864);
if (true) return BA.ObjectToString(_ints.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));
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
public static RemoteObject  _findmin(RemoteObject _ba,RemoteObject _ints) throws Exception{
try {
		Debug.PushSubsStack("FindMin (saelozahra) ","saelozahra",7,_ba,saelozahra.mostCurrent,223);
if (RapidSub.canDelegate("findmin")) { return ir.saelozahra.damaara.mazraeyeman.saelozahra.remoteMe.runUserSub(false, "saelozahra","findmin", _ba, _ints);}
;
Debug.locals.put("Ints", _ints);
 BA.debugLineNum = 223;BA.debugLine="Sub FindMin(Ints As List) As String";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 225;BA.debugLine="Ints.Sort(True)";
Debug.ShouldStop(1);
_ints.runVoidMethod ("Sort",(Object)(saelozahra.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 226;BA.debugLine="Log(\"Min: \"&parseInt(Ints.Get(0))&\" |  Max:\"&Ints";
Debug.ShouldStop(2);
saelozahra.mostCurrent.__c.runVoidMethod ("LogImpl","48060931",RemoteObject.concat(RemoteObject.createImmutable("Min: "),_parseint(_ba,BA.ObjectToString(_ints.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))))),RemoteObject.createImmutable(" |  Max:"),_ints.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {_ints.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1)))),0);
 BA.debugLineNum = 227;BA.debugLine="Return Ints.Get(0)";
Debug.ShouldStop(4);
if (true) return BA.ObjectToString(_ints.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 237;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _findweatherimg(RemoteObject _ba,RemoteObject _iconnum) throws Exception{
try {
		Debug.PushSubsStack("FindWeatherImg (saelozahra) ","saelozahra",7,_ba,saelozahra.mostCurrent,116);
if (RapidSub.canDelegate("findweatherimg")) { return ir.saelozahra.damaara.mazraeyeman.saelozahra.remoteMe.runUserSub(false, "saelozahra","findweatherimg", _ba, _iconnum);}
;
Debug.locals.put("iconNum", _iconnum);
 BA.debugLineNum = 116;BA.debugLine="Sub FindWeatherImg(iconNum As Int) As Bitmap";
Debug.ShouldStop(524288);
 BA.debugLineNum = 117;BA.debugLine="If File.Exists(File.DirAssets,iconNum&\".png\") The";
Debug.ShouldStop(1048576);
if (saelozahra.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(saelozahra.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.concat(_iconnum,RemoteObject.createImmutable(".png")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 118;BA.debugLine="Return LoadBitmap(File.DirAssets,iconNum&\".png\")";
Debug.ShouldStop(2097152);
if (true) return saelozahra.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(saelozahra.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.concat(_iconnum,RemoteObject.createImmutable(".png"))));
 }else {
 BA.debugLineNum = 120;BA.debugLine="Log(iconNum&\" Not Found\")";
Debug.ShouldStop(8388608);
saelozahra.mostCurrent.__c.runVoidMethod ("LogImpl","47733252",RemoteObject.concat(_iconnum,RemoteObject.createImmutable(" Not Found")),0);
 BA.debugLineNum = 121;BA.debugLine="Return LoadBitmap(File.DirAssets,\"taajob-icon.pn";
Debug.ShouldStop(16777216);
if (true) return saelozahra.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(saelozahra.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("taajob-icon.png")));
 };
 BA.debugLineNum = 123;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mah(RemoteObject _ba,RemoteObject _m1) throws Exception{
try {
		Debug.PushSubsStack("Mah (saelozahra) ","saelozahra",7,_ba,saelozahra.mostCurrent,165);
if (RapidSub.canDelegate("mah")) { return ir.saelozahra.damaara.mazraeyeman.saelozahra.remoteMe.runUserSub(false, "saelozahra","mah", _ba, _m1);}
;
Debug.locals.put("M1", _m1);
 BA.debugLineNum = 165;BA.debugLine="Sub Mah(M1 As String) As String";
Debug.ShouldStop(16);
 BA.debugLineNum = 166;BA.debugLine="Select M1";
Debug.ShouldStop(32);
switch (BA.switchObjectToInt(_m1,BA.ObjectToString("1"),BA.ObjectToString("2"),BA.ObjectToString("3"),BA.ObjectToString("4"),BA.ObjectToString("5"),BA.ObjectToString("6"),BA.ObjectToString("7"),BA.ObjectToString("8"),BA.ObjectToString("9"),BA.ObjectToString("10"),BA.ObjectToString("11"),BA.ObjectToString("12"))) {
case 0: {
 BA.debugLineNum = 168;BA.debugLine="Return \"فروردین\"";
Debug.ShouldStop(128);
if (true) return BA.ObjectToString("فروردین");
 break; }
case 1: {
 BA.debugLineNum = 170;BA.debugLine="Return \"اردیبهشت\"";
Debug.ShouldStop(512);
if (true) return BA.ObjectToString("اردیبهشت");
 break; }
case 2: {
 BA.debugLineNum = 172;BA.debugLine="Return \"خرداد\"";
Debug.ShouldStop(2048);
if (true) return BA.ObjectToString("خرداد");
 break; }
case 3: {
 BA.debugLineNum = 174;BA.debugLine="Return \"تیر\"";
Debug.ShouldStop(8192);
if (true) return BA.ObjectToString("تیر");
 break; }
case 4: {
 BA.debugLineNum = 176;BA.debugLine="Return \"مرداد\"";
Debug.ShouldStop(32768);
if (true) return BA.ObjectToString("مرداد");
 break; }
case 5: {
 BA.debugLineNum = 178;BA.debugLine="Return \"شهریور\"";
Debug.ShouldStop(131072);
if (true) return BA.ObjectToString("شهریور");
 break; }
case 6: {
 BA.debugLineNum = 180;BA.debugLine="Return \"مهر\"";
Debug.ShouldStop(524288);
if (true) return BA.ObjectToString("مهر");
 break; }
case 7: {
 BA.debugLineNum = 182;BA.debugLine="Return \"آبان\"";
Debug.ShouldStop(2097152);
if (true) return BA.ObjectToString("آبان");
 break; }
case 8: {
 BA.debugLineNum = 184;BA.debugLine="Return \"آذر\"";
Debug.ShouldStop(8388608);
if (true) return BA.ObjectToString("آذر");
 break; }
case 9: {
 BA.debugLineNum = 186;BA.debugLine="Return \"دی\"";
Debug.ShouldStop(33554432);
if (true) return BA.ObjectToString("دی");
 break; }
case 10: {
 BA.debugLineNum = 188;BA.debugLine="Return \"بهمن\"";
Debug.ShouldStop(134217728);
if (true) return BA.ObjectToString("بهمن");
 break; }
case 11: {
 BA.debugLineNum = 190;BA.debugLine="Return \"اسفند\"";
Debug.ShouldStop(536870912);
if (true) return BA.ObjectToString("اسفند");
 break; }
default: {
 BA.debugLineNum = 192;BA.debugLine="Return M1";
Debug.ShouldStop(-2147483648);
if (true) return _m1;
 break; }
}
;
 BA.debugLineNum = 194;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mohasebe_tarikh(RemoteObject _ba,RemoteObject _time_time) throws Exception{
try {
		Debug.PushSubsStack("mohasebe_tarikh (saelozahra) ","saelozahra",7,_ba,saelozahra.mostCurrent,351);
if (RapidSub.canDelegate("mohasebe_tarikh")) { return ir.saelozahra.damaara.mazraeyeman.saelozahra.remoteMe.runUserSub(false, "saelozahra","mohasebe_tarikh", _ba, _time_time);}
RemoteObject _mohasebe_daghighe = RemoteObject.createImmutable("");
RemoteObject _mohasebe_saat = RemoteObject.createImmutable("");
RemoteObject _mohasebe_rooz = RemoteObject.createImmutable("");
RemoteObject _mohasebe_months = RemoteObject.createImmutable("");
;
Debug.locals.put("time_time", _time_time);
 BA.debugLineNum = 351;BA.debugLine="Sub mohasebe_tarikh(time_time As Long) As String";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 353;BA.debugLine="Dim mohasebe_daghighe As String";
Debug.ShouldStop(1);
_mohasebe_daghighe = RemoteObject.createImmutable("");Debug.locals.put("mohasebe_daghighe", _mohasebe_daghighe);
 BA.debugLineNum = 354;BA.debugLine="mohasebe_daghighe = DateUtils.PeriodBetween(time_";
Debug.ShouldStop(2);
_mohasebe_daghighe = BA.NumberToString(saelozahra.mostCurrent._dateutils.runMethod(false,"_periodbetween" /*RemoteObject*/ ,_ba,(Object)(_time_time),(Object)(saelozahra.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"))).getField(true,"Minutes" /*RemoteObject*/ ));Debug.locals.put("mohasebe_daghighe", _mohasebe_daghighe);
 BA.debugLineNum = 356;BA.debugLine="Dim mohasebe_saat As String";
Debug.ShouldStop(8);
_mohasebe_saat = RemoteObject.createImmutable("");Debug.locals.put("mohasebe_saat", _mohasebe_saat);
 BA.debugLineNum = 357;BA.debugLine="mohasebe_saat = DateUtils.PeriodBetween(time_time";
Debug.ShouldStop(16);
_mohasebe_saat = BA.NumberToString(saelozahra.mostCurrent._dateutils.runMethod(false,"_periodbetween" /*RemoteObject*/ ,_ba,(Object)(_time_time),(Object)(saelozahra.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"))).getField(true,"Hours" /*RemoteObject*/ ));Debug.locals.put("mohasebe_saat", _mohasebe_saat);
 BA.debugLineNum = 362;BA.debugLine="Dim mohasebe_rooz As String";
Debug.ShouldStop(512);
_mohasebe_rooz = RemoteObject.createImmutable("");Debug.locals.put("mohasebe_rooz", _mohasebe_rooz);
 BA.debugLineNum = 363;BA.debugLine="mohasebe_rooz = DateUtils.PeriodBetween(time_time";
Debug.ShouldStop(1024);
_mohasebe_rooz = BA.NumberToString(saelozahra.mostCurrent._dateutils.runMethod(false,"_periodbetween" /*RemoteObject*/ ,_ba,(Object)(_time_time),(Object)(saelozahra.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"))).getField(true,"Days" /*RemoteObject*/ ));Debug.locals.put("mohasebe_rooz", _mohasebe_rooz);
 BA.debugLineNum = 365;BA.debugLine="Dim mohasebe_Months As String";
Debug.ShouldStop(4096);
_mohasebe_months = RemoteObject.createImmutable("");Debug.locals.put("mohasebe_Months", _mohasebe_months);
 BA.debugLineNum = 366;BA.debugLine="mohasebe_Months = DateUtils.PeriodBetween(time_ti";
Debug.ShouldStop(8192);
_mohasebe_months = BA.NumberToString(saelozahra.mostCurrent._dateutils.runMethod(false,"_periodbetween" /*RemoteObject*/ ,_ba,(Object)(_time_time),(Object)(saelozahra.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"))).getField(true,"Months" /*RemoteObject*/ ));Debug.locals.put("mohasebe_Months", _mohasebe_months);
 BA.debugLineNum = 369;BA.debugLine="If mohasebe_Months > 1 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _mohasebe_months),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 370;BA.debugLine="Return mohasebe_Months &\" ماه و \"&mohasebe_rooz&";
Debug.ShouldStop(131072);
if (true) return RemoteObject.concat(_mohasebe_months,RemoteObject.createImmutable(" ماه و "),_mohasebe_rooz,RemoteObject.createImmutable(" روز پیش "));
 }else 
{ BA.debugLineNum = 371;BA.debugLine="Else If mohasebe_rooz>1 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _mohasebe_rooz),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 372;BA.debugLine="Return mohasebe_rooz&\" روز پیش \"";
Debug.ShouldStop(524288);
if (true) return RemoteObject.concat(_mohasebe_rooz,RemoteObject.createImmutable(" روز پیش "));
 }else 
{ BA.debugLineNum = 373;BA.debugLine="Else if mohasebe_saat>1 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _mohasebe_saat),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 374;BA.debugLine="Return mohasebe_saat & \" ساعت پیش \"";
Debug.ShouldStop(2097152);
if (true) return RemoteObject.concat(_mohasebe_saat,RemoteObject.createImmutable(" ساعت پیش "));
 }else {
 BA.debugLineNum = 376;BA.debugLine="Return mohasebe_daghighe & \" دقیقه پیش \"";
Debug.ShouldStop(8388608);
if (true) return RemoteObject.concat(_mohasebe_daghighe,RemoteObject.createImmutable(" دقیقه پیش "));
 }}}
;
 BA.debugLineNum = 379;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _parseint(RemoteObject _ba,RemoteObject _in1) throws Exception{
try {
		Debug.PushSubsStack("parseInt (saelozahra) ","saelozahra",7,_ba,saelozahra.mostCurrent,60);
if (RapidSub.canDelegate("parseint")) { return ir.saelozahra.damaara.mazraeyeman.saelozahra.remoteMe.runUserSub(false, "saelozahra","parseint", _ba, _in1);}
RemoteObject _adadesh = RemoteObject.createImmutable(0);
;
Debug.locals.put("in1", _in1);
 BA.debugLineNum = 60;BA.debugLine="Sub parseInt(in1 As String) As Int";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 61;BA.debugLine="If in1 == Null Or in1 == \"null\" Then in1 = 0";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("n",_in1) || RemoteObject.solveBoolean("=",_in1,BA.ObjectToString("null"))) { 
_in1 = BA.NumberToString(0);Debug.locals.put("in1", _in1);};
 BA.debugLineNum = 62;BA.debugLine="If in1.Contains(\".\") Then";
Debug.ShouldStop(536870912);
if (_in1.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("."))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 63;BA.debugLine="in1 = in1.SubString2(0,in1.IndexOf(\".\"))";
Debug.ShouldStop(1073741824);
_in1 = _in1.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(_in1.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable(".")))));Debug.locals.put("in1", _in1);
 };
 BA.debugLineNum = 65;BA.debugLine="Dim Adadesh As Int";
Debug.ShouldStop(1);
_adadesh = RemoteObject.createImmutable(0);Debug.locals.put("Adadesh", _adadesh);
 BA.debugLineNum = 66;BA.debugLine="Adadesh = Bit.ParseInt(in1,10)";
Debug.ShouldStop(2);
_adadesh = saelozahra.mostCurrent.__c.getField(false,"Bit").runMethod(true,"ParseInt",(Object)(_in1),(Object)(BA.numberCast(int.class, 10)));Debug.locals.put("Adadesh", _adadesh);
 BA.debugLineNum = 67;BA.debugLine="Return Adadesh";
Debug.ShouldStop(4);
if (true) return _adadesh;
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pishhomare(RemoteObject _ba,RemoteObject _pish) throws Exception{
try {
		Debug.PushSubsStack("pishhomare (saelozahra) ","saelozahra",7,_ba,saelozahra.mostCurrent,70);
if (RapidSub.canDelegate("pishhomare")) { return ir.saelozahra.damaara.mazraeyeman.saelozahra.remoteMe.runUserSub(false, "saelozahra","pishhomare", _ba, _pish);}
;
Debug.locals.put("pish", _pish);
 BA.debugLineNum = 70;BA.debugLine="Sub pishhomare(pish As String) As String";
Debug.ShouldStop(32);
 BA.debugLineNum = 72;BA.debugLine="If pish.StartsWith(\"0990\") Or pish.StartsWith(\"09";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean(".",_pish.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("0990")))) || RemoteObject.solveBoolean(".",_pish.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("0991")))) || RemoteObject.solveBoolean(".",_pish.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("0992")))) || RemoteObject.solveBoolean(".",_pish.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("091"))))) { 
 BA.debugLineNum = 73;BA.debugLine="Return \"hamrah\"";
Debug.ShouldStop(256);
if (true) return BA.ObjectToString("hamrah");
 }else 
{ BA.debugLineNum = 74;BA.debugLine="else If pish.StartsWith(\"090\") Or pish.StartsWith";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean(".",_pish.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("090")))) || RemoteObject.solveBoolean(".",_pish.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("093"))))) { 
 BA.debugLineNum = 75;BA.debugLine="Return \"irancell\"";
Debug.ShouldStop(1024);
if (true) return BA.ObjectToString("irancell");
 }else 
{ BA.debugLineNum = 76;BA.debugLine="Else If pish.StartsWith(\"0920\") Or pish.StartsWit";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean(".",_pish.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("0920")))) || RemoteObject.solveBoolean(".",_pish.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("0921")))) || RemoteObject.solveBoolean(".",_pish.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("0922"))))) { 
 BA.debugLineNum = 77;BA.debugLine="Return \"rightel\"";
Debug.ShouldStop(4096);
if (true) return BA.ObjectToString("rightel");
 }else {
 BA.debugLineNum = 79;BA.debugLine="Return \"other\"";
Debug.ShouldStop(16384);
if (true) return BA.ObjectToString("other");
 }}}
;
 BA.debugLineNum = 82;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _plaintext(RemoteObject _ba,RemoteObject _html) throws Exception{
try {
		Debug.PushSubsStack("PlainText (saelozahra) ","saelozahra",7,_ba,saelozahra.mostCurrent,482);
if (RapidSub.canDelegate("plaintext")) { return ir.saelozahra.damaara.mazraeyeman.saelozahra.remoteMe.runUserSub(false, "saelozahra","plaintext", _ba, _html);}
;
Debug.locals.put("HTML", _html);
 BA.debugLineNum = 482;BA.debugLine="Sub PlainText (HTML As String) As String";
Debug.ShouldStop(2);
 BA.debugLineNum = 483;BA.debugLine="HTML = RegexReplace(\"/<\\s*br\\/*>/gi\", HTML, CRLF)";
Debug.ShouldStop(4);
_html = _regexreplace(_ba,BA.ObjectToString("/<\\s*br\\/*>/gi"),_html,saelozahra.mostCurrent.__c.getField(true,"CRLF"));Debug.locals.put("HTML", _html);
 BA.debugLineNum = 484;BA.debugLine="HTML = RegexReplace(\"/<\\s*a.*href=\" & QUOTE & \"(.";
Debug.ShouldStop(8);
_html = _regexreplace(_ba,RemoteObject.concat(RemoteObject.createImmutable("/<\\s*a.*href="),saelozahra.mostCurrent.__c.getField(true,"QUOTE"),RemoteObject.createImmutable("(.*?)"),saelozahra.mostCurrent.__c.getField(true,"QUOTE"),RemoteObject.createImmutable(".*>(.*?)<\\/a>/gi")),_html,RemoteObject.createImmutable(" $2 (Link->$1) "));Debug.locals.put("HTML", _html);
 BA.debugLineNum = 485;BA.debugLine="HTML = RegexReplace(\"/<\\s*\\/*.+?>/ig\", HTML, CRLF";
Debug.ShouldStop(16);
_html = _regexreplace(_ba,BA.ObjectToString("/<\\s*\\/*.+?>/ig"),_html,saelozahra.mostCurrent.__c.getField(true,"CRLF"));Debug.locals.put("HTML", _html);
 BA.debugLineNum = 486;BA.debugLine="HTML = RegexReplace(\"/ {2,}/gi\", HTML, \" \")";
Debug.ShouldStop(32);
_html = _regexreplace(_ba,BA.ObjectToString("/ {2,}/gi"),_html,RemoteObject.createImmutable(" "));Debug.locals.put("HTML", _html);
 BA.debugLineNum = 487;BA.debugLine="HTML = RegexReplace(\"/\\n+\\s*/gi\", HTML, CRLF & CR";
Debug.ShouldStop(64);
_html = _regexreplace(_ba,BA.ObjectToString("/\\n+\\s*/gi"),_html,RemoteObject.concat(saelozahra.mostCurrent.__c.getField(true,"CRLF"),saelozahra.mostCurrent.__c.getField(true,"CRLF")));Debug.locals.put("HTML", _html);
 BA.debugLineNum = 488;BA.debugLine="HTML = HTML.Replace(\"<p>\", CRLF)";
Debug.ShouldStop(128);
_html = _html.runMethod(true,"replace",(Object)(BA.ObjectToString("<p>")),(Object)(saelozahra.mostCurrent.__c.getField(true,"CRLF")));Debug.locals.put("HTML", _html);
 BA.debugLineNum = 489;BA.debugLine="HTML = HTML.Replace(\"</p>\", CRLF)";
Debug.ShouldStop(256);
_html = _html.runMethod(true,"replace",(Object)(BA.ObjectToString("</p>")),(Object)(saelozahra.mostCurrent.__c.getField(true,"CRLF")));Debug.locals.put("HTML", _html);
 BA.debugLineNum = 490;BA.debugLine="Return HTML";
Debug.ShouldStop(512);
if (true) return _html;
 BA.debugLineNum = 491;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 5;BA.debugLine="Dim Dir As String = File.DirInternalCache";
saelozahra._dir = saelozahra.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternalCache");
 //BA.debugLineNum = 6;BA.debugLine="Dim font As Typeface=Typeface.LoadFromAssets(\"Sam";
saelozahra._font = RemoteObject.createNew ("anywheresoftware.b4a.keywords.constants.TypefaceWrapper");
saelozahra._font = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.constants.TypefaceWrapper"), saelozahra.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("Samim-FD-WOL.ttf"))));
 //BA.debugLineNum = 7;BA.debugLine="Dim fontBold As Typeface=Typeface.LoadFromAssets(";
saelozahra._fontbold = RemoteObject.createNew ("anywheresoftware.b4a.keywords.constants.TypefaceWrapper");
saelozahra._fontbold = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.constants.TypefaceWrapper"), saelozahra.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("Samim-Bold-FD-WOL.ttf"))));
 //BA.debugLineNum = 8;BA.debugLine="Dim site_url As String = \"https://mazraeyeman.ir/";
saelozahra._site_url = BA.ObjectToString("https://mazraeyeman.ir/");
 //BA.debugLineNum = 9;BA.debugLine="Dim json_url As String = site_url&\"reseller/api_f";
saelozahra._json_url = RemoteObject.concat(saelozahra._site_url,RemoteObject.createImmutable("reseller/api_files/"));
 //BA.debugLineNum = 10;BA.debugLine="Dim smsNumber As Int = 983072451";
saelozahra._smsnumber = BA.numberCast(int.class, 983072451);
 //BA.debugLineNum = 11;BA.debugLine="Dim SupportNumber As String = \"09170006373\"";
saelozahra._supportnumber = BA.ObjectToString("09170006373");
 //BA.debugLineNum = 12;BA.debugLine="Dim P As Phone";
saelozahra._p = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone");
 //BA.debugLineNum = 13;BA.debugLine="Dim R As Reflector";
saelozahra._r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");
 //BA.debugLineNum = 14;BA.debugLine="Dim PI As PhoneIntents";
saelozahra._pi = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.PhoneIntents");
 //BA.debugLineNum = 15;BA.debugLine="Dim intent1 As Intent";
saelozahra._intent1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Dim active_page As String";
saelozahra._active_page = RemoteObject.createImmutable("");
 //BA.debugLineNum = 17;BA.debugLine="Dim MaterialActionBarHeight As Int";
saelozahra._materialactionbarheight = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 18;BA.debugLine="Dim GetStatusBarHeight As Int";
saelozahra._getstatusbarheight = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 19;BA.debugLine="Dim Debug As Boolean = True";
saelozahra._debug = saelozahra.mostCurrent.__c.getField(true,"True");
 //BA.debugLineNum = 20;BA.debugLine="Dim RayganHast As Boolean = False";
saelozahra._rayganhast = saelozahra.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 29;BA.debugLine="Dim Color As Int 		= 0xFF059327";
saelozahra._color = BA.numberCast(int.class, ((int)0xff059327));
 //BA.debugLineNum = 30;BA.debugLine="Dim ColorDark As Int  	= 0xFF04751c";
saelozahra._colordark = BA.numberCast(int.class, ((int)0xff04751c));
 //BA.debugLineNum = 31;BA.debugLine="Dim ColorLight As Int 	= 0x9F059327";
saelozahra._colorlight = BA.numberCast(int.class, ((int)0x9f059327));
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _regexreplace(RemoteObject _ba,RemoteObject _pattern,RemoteObject _text,RemoteObject _replacement) throws Exception{
try {
		Debug.PushSubsStack("RegexReplace (saelozahra) ","saelozahra",7,_ba,saelozahra.mostCurrent,468);
if (RapidSub.canDelegate("regexreplace")) { return ir.saelozahra.damaara.mazraeyeman.saelozahra.remoteMe.runUserSub(false, "saelozahra","regexreplace", _ba, _pattern, _text, _replacement);}
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Regex.MatcherWrapper");
;
Debug.locals.put("Pattern", _pattern);
Debug.locals.put("Text", _text);
Debug.locals.put("Replacement", _replacement);
 BA.debugLineNum = 468;BA.debugLine="Sub RegexReplace(Pattern As String, Text As String";
Debug.ShouldStop(524288);
 BA.debugLineNum = 469;BA.debugLine="Try";
Debug.ShouldStop(1048576);
try { BA.debugLineNum = 470;BA.debugLine="Dim m As Matcher";
Debug.ShouldStop(2097152);
_m = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Regex.MatcherWrapper");Debug.locals.put("m", _m);
 BA.debugLineNum = 471;BA.debugLine="m = Regex.Matcher(Pattern, Text)";
Debug.ShouldStop(4194304);
_m = saelozahra.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Matcher",(Object)(_pattern),(Object)(_text));Debug.locals.put("m", _m);
 BA.debugLineNum = 472;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(8388608);
saelozahra._r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");
 BA.debugLineNum = 473;BA.debugLine="r.Target = m";
Debug.ShouldStop(16777216);
saelozahra._r.setField ("Target",(_m.getObject()));
 BA.debugLineNum = 474;BA.debugLine="Return r.RunMethod2(\"replaceAll\", Replacement, \"";
Debug.ShouldStop(33554432);
Debug.CheckDeviceExceptions();if (true) return BA.ObjectToString(saelozahra._r.runMethod(false,"RunMethod2",(Object)(BA.ObjectToString("replaceAll")),(Object)(_replacement),(Object)(RemoteObject.createImmutable("java.lang.String"))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e8.toString()); BA.debugLineNum = 476;BA.debugLine="Log(LastException)";
Debug.ShouldStop(134217728);
saelozahra.mostCurrent.__c.runVoidMethod ("LogImpl","48519688",BA.ObjectToString(saelozahra.mostCurrent.__c.runMethod(false,"LastException",_ba)),0);
 BA.debugLineNum = 477;BA.debugLine="Return Text";
Debug.ShouldStop(268435456);
if (true) return _text;
 };
 BA.debugLineNum = 479;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _searchableedittext(RemoteObject _ba,RemoteObject _edittext1) throws Exception{
try {
		Debug.PushSubsStack("SearchableEditText (saelozahra) ","saelozahra",7,_ba,saelozahra.mostCurrent,718);
if (RapidSub.canDelegate("searchableedittext")) { return ir.saelozahra.damaara.mazraeyeman.saelozahra.remoteMe.runUserSub(false, "saelozahra","searchableedittext", _ba, _edittext1);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
;
Debug.locals.put("Edittext1", _edittext1);
 BA.debugLineNum = 718;BA.debugLine="Sub SearchableEditText(Edittext1 As EditText)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 719;BA.debugLine="Dim JO As JavaObject = Edittext1";
Debug.ShouldStop(16384);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _edittext1.getObject());Debug.locals.put("JO", _jo);Debug.locals.put("JO", _jo);
 BA.debugLineNum = 720;BA.debugLine="JO.RunMethod(\"setImeOptions\",Array As Object(3))";
Debug.ShouldStop(32768);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setImeOptions")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {RemoteObject.createImmutable((3))})));
 BA.debugLineNum = 721;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _senoghte(RemoteObject _ba,RemoteObject _adad) throws Exception{
try {
		Debug.PushSubsStack("SeNoghte (saelozahra) ","saelozahra",7,_ba,saelozahra.mostCurrent,42);
if (RapidSub.canDelegate("senoghte")) { return ir.saelozahra.damaara.mazraeyeman.saelozahra.remoteMe.runUserSub(false, "saelozahra","senoghte", _ba, _adad);}
;
Debug.locals.put("adad", _adad);
 BA.debugLineNum = 42;BA.debugLine="Sub SeNoghte(adad As Int)As String";
Debug.ShouldStop(512);
 BA.debugLineNum = 43;BA.debugLine="Return NumberFormat2( adad,3,0, 0,True)";
Debug.ShouldStop(1024);
if (true) return saelozahra.mostCurrent.__c.runMethod(true,"NumberFormat2",(Object)(BA.numberCast(double.class, _adad)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(saelozahra.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setalpha(RemoteObject _ba,RemoteObject _view,RemoteObject _level) throws Exception{
try {
		Debug.PushSubsStack("SetAlpha (saelozahra) ","saelozahra",7,_ba,saelozahra.mostCurrent,46);
if (RapidSub.canDelegate("setalpha")) { return ir.saelozahra.damaara.mazraeyeman.saelozahra.remoteMe.runUserSub(false, "saelozahra","setalpha", _ba, _view, _level);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _alpha = RemoteObject.createImmutable(0f);
;
Debug.locals.put("View", _view);
Debug.locals.put("Level", _level);
 BA.debugLineNum = 46;BA.debugLine="Public Sub SetAlpha (View As B4XView, Level As Flo";
Debug.ShouldStop(8192);
 BA.debugLineNum = 48;BA.debugLine="Dim JO As JavaObject = View";
Debug.ShouldStop(32768);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _view.getObject());Debug.locals.put("JO", _jo);Debug.locals.put("JO", _jo);
 BA.debugLineNum = 49;BA.debugLine="Dim alpha As Float = Level";
Debug.ShouldStop(65536);
_alpha = _level;Debug.locals.put("alpha", _alpha);Debug.locals.put("alpha", _alpha);
 BA.debugLineNum = 50;BA.debugLine="JO.RunMethod(\"setAlpha\", Array(alpha))";
Debug.ShouldStop(131072);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setAlpha")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_alpha)})));
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setanimation(RemoteObject _ba,RemoteObject _inanimation,RemoteObject _outanimation) throws Exception{
try {
		Debug.PushSubsStack("SetAnimation (saelozahra) ","saelozahra",7,_ba,saelozahra.mostCurrent,615);
if (RapidSub.canDelegate("setanimation")) { return ir.saelozahra.damaara.mazraeyeman.saelozahra.remoteMe.runUserSub(false, "saelozahra","setanimation", _ba, _inanimation, _outanimation);}
RemoteObject _package = RemoteObject.createImmutable("");
RemoteObject _in = RemoteObject.createImmutable(0);
RemoteObject _out = RemoteObject.createImmutable(0);
;
Debug.locals.put("InAnimation", _inanimation);
Debug.locals.put("OutAnimation", _outanimation);
 BA.debugLineNum = 615;BA.debugLine="Sub SetAnimation(InAnimation As String, OutAnimati";
Debug.ShouldStop(64);
 BA.debugLineNum = 617;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(256);
saelozahra._r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");
 BA.debugLineNum = 618;BA.debugLine="Dim package As String";
Debug.ShouldStop(512);
_package = RemoteObject.createImmutable("");Debug.locals.put("package", _package);
 BA.debugLineNum = 619;BA.debugLine="Dim In, out As Int";
Debug.ShouldStop(1024);
_in = RemoteObject.createImmutable(0);Debug.locals.put("In", _in);
_out = RemoteObject.createImmutable(0);Debug.locals.put("out", _out);
 BA.debugLineNum = 620;BA.debugLine="package = r.GetStaticField(\"anywheresoftware.b4a.";
Debug.ShouldStop(2048);
_package = BA.ObjectToString(saelozahra._r.runMethod(false,"GetStaticField",(Object)(BA.ObjectToString("anywheresoftware.b4a.BA")),(Object)(RemoteObject.createImmutable("packageName"))));Debug.locals.put("package", _package);
 BA.debugLineNum = 621;BA.debugLine="In = r.GetStaticField(package & \".R$anim\", InAnim";
Debug.ShouldStop(4096);
_in = BA.numberCast(int.class, saelozahra._r.runMethod(false,"GetStaticField",(Object)(RemoteObject.concat(_package,RemoteObject.createImmutable(".R$anim"))),(Object)(_inanimation)));Debug.locals.put("In", _in);
 BA.debugLineNum = 622;BA.debugLine="out = r.GetStaticField(package & \".R$anim\", OutAn";
Debug.ShouldStop(8192);
_out = BA.numberCast(int.class, saelozahra._r.runMethod(false,"GetStaticField",(Object)(RemoteObject.concat(_package,RemoteObject.createImmutable(".R$anim"))),(Object)(_outanimation)));Debug.locals.put("out", _out);
 BA.debugLineNum = 623;BA.debugLine="r.Target = r.GetActivity";
Debug.ShouldStop(16384);
saelozahra._r.setField ("Target",(saelozahra._r.runMethod(false,"GetActivity",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba))));
 BA.debugLineNum = 624;BA.debugLine="r.RunMethod4(\"overridePendingTransition\", Array A";
Debug.ShouldStop(32768);
saelozahra._r.runVoidMethod ("RunMethod4",(Object)(BA.ObjectToString("overridePendingTransition")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_in),(_out)})),(Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("java.lang.int"),RemoteObject.createImmutable("java.lang.int")})));
 BA.debugLineNum = 626;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setavg(RemoteObject _ba,RemoteObject _bc,RemoteObject _x,RemoteObject _y,RemoteObject _clrs,RemoteObject _temp) throws Exception{
try {
		Debug.PushSubsStack("SetAvg (saelozahra) ","saelozahra",7,_ba,saelozahra.mostCurrent,959);
if (RapidSub.canDelegate("setavg")) { return ir.saelozahra.damaara.mazraeyeman.saelozahra.remoteMe.runUserSub(false, "saelozahra","setavg", _ba, _bc, _x, _y, _clrs, _temp);}
RemoteObject _c = RemoteObject.declareNull("b4a.example.bitmapcreator._argbcolor");
;
Debug.locals.put("bc", _bc);
Debug.locals.put("x", _x);
Debug.locals.put("y", _y);
Debug.locals.put("clrs", _clrs);
Debug.locals.put("temp", _temp);
 BA.debugLineNum = 959;BA.debugLine="Private Sub SetAvg(bc As BitmapCreator, x As Int,";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 960;BA.debugLine="temp.Initialize";
Debug.ShouldStop(-2147483648);
_temp.runVoidMethod ("Initialize");
 BA.debugLineNum = 961;BA.debugLine="For Each c As ARGBColor In clrs";
Debug.ShouldStop(1);
{
final RemoteObject group2 = _clrs;
final int groupLen2 = group2.getField(true,"length").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_c = group2.getArrayElement(false,RemoteObject.createImmutable(index2));Debug.locals.put("c", _c);
Debug.locals.put("c", _c);
 BA.debugLineNum = 962;BA.debugLine="temp.r = temp.r + c.r";
Debug.ShouldStop(2);
_temp.setField ("r",RemoteObject.solve(new RemoteObject[] {_temp.getField(true,"r"),_c.getField(true,"r")}, "+",1, 1));
 BA.debugLineNum = 963;BA.debugLine="temp.g = temp.g + c.g";
Debug.ShouldStop(4);
_temp.setField ("g",RemoteObject.solve(new RemoteObject[] {_temp.getField(true,"g"),_c.getField(true,"g")}, "+",1, 1));
 BA.debugLineNum = 964;BA.debugLine="temp.b = temp.b + c.b";
Debug.ShouldStop(8);
_temp.setField ("b",RemoteObject.solve(new RemoteObject[] {_temp.getField(true,"b"),_c.getField(true,"b")}, "+",1, 1));
 }
}Debug.locals.put("c", _c);
;
 BA.debugLineNum = 966;BA.debugLine="temp.a = 255";
Debug.ShouldStop(32);
_temp.setField ("a",BA.numberCast(int.class, 255));
 BA.debugLineNum = 967;BA.debugLine="temp.r = temp.r / clrs.Length";
Debug.ShouldStop(64);
_temp.setField ("r",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_temp.getField(true,"r"),_clrs.getField(true,"length")}, "/",0, 0)));
 BA.debugLineNum = 968;BA.debugLine="temp.g = temp.g / clrs.Length";
Debug.ShouldStop(128);
_temp.setField ("g",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_temp.getField(true,"g"),_clrs.getField(true,"length")}, "/",0, 0)));
 BA.debugLineNum = 969;BA.debugLine="temp.b = temp.b / clrs.Length";
Debug.ShouldStop(256);
_temp.setField ("b",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_temp.getField(true,"b"),_clrs.getField(true,"length")}, "/",0, 0)));
 BA.debugLineNum = 970;BA.debugLine="bc.SetARGB(x, y, temp)";
Debug.ShouldStop(512);
_bc.runVoidMethod ("_setargb",(Object)(_x),(Object)(_y),(Object)(_temp));
 BA.debugLineNum = 971;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setbitmapdensity(RemoteObject _ba,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetBitmapDensity (saelozahra) ","saelozahra",7,_ba,saelozahra.mostCurrent,494);
if (RapidSub.canDelegate("setbitmapdensity")) { return ir.saelozahra.damaara.mazraeyeman.saelozahra.remoteMe.runUserSub(false, "saelozahra","setbitmapdensity", _ba, _b);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _den = RemoteObject.createImmutable(0);
;
Debug.locals.put("b", _b);
 BA.debugLineNum = 494;BA.debugLine="Sub SetBitmapDensity(b As Bitmap) As Bitmap";
Debug.ShouldStop(8192);
 BA.debugLineNum = 495;BA.debugLine="Dim jo As JavaObject = b";
Debug.ShouldStop(16384);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _b.getObject());Debug.locals.put("jo", _jo);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 496;BA.debugLine="Dim den As Int = Density * 160";
Debug.ShouldStop(32768);
_den = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {saelozahra.mostCurrent.__c.getField(true,"Density"),RemoteObject.createImmutable(160)}, "*",0, 0));Debug.locals.put("den", _den);Debug.locals.put("den", _den);
 BA.debugLineNum = 497;BA.debugLine="jo.RunMethod(\"setDensity\", Array(den))";
Debug.ShouldStop(65536);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setDensity")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_den)})));
 BA.debugLineNum = 498;BA.debugLine="Return b";
Debug.ShouldStop(131072);
if (true) return _b;
 BA.debugLineNum = 499;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcornerradii(RemoteObject _ba,RemoteObject _v,RemoteObject _rx_topleft,RemoteObject _ry_topleft,RemoteObject _rx_topright,RemoteObject _ry_topright,RemoteObject _rx_bottomright,RemoteObject _ry_bottomright,RemoteObject _rx_bottomleft,RemoteObject _ry_bottomleft) throws Exception{
try {
		Debug.PushSubsStack("setCornerRadii (saelozahra) ","saelozahra",7,_ba,saelozahra.mostCurrent,35);
if (RapidSub.canDelegate("setcornerradii")) { return ir.saelozahra.damaara.mazraeyeman.saelozahra.remoteMe.runUserSub(false, "saelozahra","setcornerradii", _ba, _v, _rx_topleft, _ry_topleft, _rx_topright, _ry_topright, _rx_bottomright, _ry_bottomright, _rx_bottomleft, _ry_bottomleft);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
;
Debug.locals.put("v", _v);
Debug.locals.put("Rx_TopLeft", _rx_topleft);
Debug.locals.put("Ry_TopLeft", _ry_topleft);
Debug.locals.put("Rx_TopRight", _rx_topright);
Debug.locals.put("Ry_TopRight", _ry_topright);
Debug.locals.put("Rx_BottomRight", _rx_bottomright);
Debug.locals.put("Ry_BottomRight", _ry_bottomright);
Debug.locals.put("Rx_BottomLeft", _rx_bottomleft);
Debug.locals.put("Ry_BottomLeft", _ry_bottomleft);
 BA.debugLineNum = 35;BA.debugLine="Sub setCornerRadii(v As View, Rx_TopLeft As Float,";
Debug.ShouldStop(4);
 BA.debugLineNum = 36;BA.debugLine="Dim jo As JavaObject = v.Background";
Debug.ShouldStop(8);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _v.runMethod(false,"getBackground"));Debug.locals.put("jo", _jo);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 37;BA.debugLine="If v.Background Is ColorDrawable Or v.Background";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("i",_v.runMethod(false,"getBackground"), RemoteObject.createImmutable("android.graphics.drawable.Drawable")) || RemoteObject.solveBoolean("i",_v.runMethod(false,"getBackground"), RemoteObject.createImmutable("android.graphics.drawable.GradientDrawable"))) { 
 BA.debugLineNum = 38;BA.debugLine="jo.RunMethod(\"setCornerRadii\", Array As Object(A";
Debug.ShouldStop(32);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setCornerRadii")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createNewArray("float",new int[] {8},new Object[] {_rx_topleft,_ry_topleft,_rx_topright,_ry_topright,_rx_bottomright,_ry_bottomright,_rx_bottomleft,_ry_bottomleft}))})));
 };
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setnavigationbarcolor(RemoteObject _ba,RemoteObject _clr) throws Exception{
try {
		Debug.PushSubsStack("SetNavigationBarColor (saelozahra) ","saelozahra",7,_ba,saelozahra.mostCurrent,527);
if (RapidSub.canDelegate("setnavigationbarcolor")) { return ir.saelozahra.damaara.mazraeyeman.saelozahra.remoteMe.runUserSub(false, "saelozahra","setnavigationbarcolor", _ba, _clr);}
RemoteObject _j = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
;
Debug.locals.put("Clr", _clr);
 BA.debugLineNum = 527;BA.debugLine="Sub SetNavigationBarColor(Clr As Int)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 529;BA.debugLine="Dim j As JavaObject";
Debug.ShouldStop(65536);
_j = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("j", _j);
 BA.debugLineNum = 530;BA.debugLine="J.InitializeStatic(\"android.os.Build$VERSION\")";
Debug.ShouldStop(131072);
_j.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("android.os.Build$VERSION")));
 BA.debugLineNum = 531;BA.debugLine="If j.GetField(\"SDK_INT\") > 20 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _j.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("SDK_INT")))),BA.numberCast(double.class, 20))) { 
 BA.debugLineNum = 532;BA.debugLine="J.InitializeContext.RunMethodJO(\"getWindow\",Null";
Debug.ShouldStop(524288);
_j.runMethod(false,"InitializeContext",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba)).runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getWindow")),(Object)((saelozahra.mostCurrent.__c.getField(false,"Null")))).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setNavigationBarColor")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_clr)})));
 };
 BA.debugLineNum = 535;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setninepatchbutton(RemoteObject _ba,RemoteObject _btn,RemoteObject _defaultimage,RemoteObject _pressedimage,RemoteObject _disabelimage) throws Exception{
try {
		Debug.PushSubsStack("SetNinePatchButton (saelozahra) ","saelozahra",7,_ba,saelozahra.mostCurrent,750);
if (RapidSub.canDelegate("setninepatchbutton")) { return ir.saelozahra.damaara.mazraeyeman.saelozahra.remoteMe.runUserSub(false, "saelozahra","setninepatchbutton", _ba, _btn, _defaultimage, _pressedimage, _disabelimage);}
RemoteObject _package = RemoteObject.createImmutable("");
RemoteObject _iddefault = RemoteObject.createImmutable(0);
RemoteObject _iddisabel = RemoteObject.createImmutable(0);
RemoteObject _idpressed = RemoteObject.createImmutable(0);
RemoteObject _sd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.StateListDrawable");
;
Debug.locals.put("Btn", _btn);
Debug.locals.put("DefaultImage", _defaultimage);
Debug.locals.put("PressedImage", _pressedimage);
Debug.locals.put("DisabelImage", _disabelimage);
 BA.debugLineNum = 750;BA.debugLine="Sub SetNinePatchButton(Btn As Button, DefaultImage";
Debug.ShouldStop(8192);
 BA.debugLineNum = 751;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(16384);
saelozahra._r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");
 BA.debugLineNum = 752;BA.debugLine="Dim package As String";
Debug.ShouldStop(32768);
_package = RemoteObject.createImmutable("");Debug.locals.put("package", _package);
 BA.debugLineNum = 753;BA.debugLine="Dim idDefault, iddisabel, idPressed As Int";
Debug.ShouldStop(65536);
_iddefault = RemoteObject.createImmutable(0);Debug.locals.put("idDefault", _iddefault);
_iddisabel = RemoteObject.createImmutable(0);Debug.locals.put("iddisabel", _iddisabel);
_idpressed = RemoteObject.createImmutable(0);Debug.locals.put("idPressed", _idpressed);
 BA.debugLineNum = 754;BA.debugLine="package = r.GetStaticField(\"anywheresoftware.b4a.";
Debug.ShouldStop(131072);
_package = BA.ObjectToString(saelozahra._r.runMethod(false,"GetStaticField",(Object)(BA.ObjectToString("anywheresoftware.b4a.BA")),(Object)(RemoteObject.createImmutable("packageName"))));Debug.locals.put("package", _package);
 BA.debugLineNum = 755;BA.debugLine="idDefault = r.GetStaticField(package & \".R$drawab";
Debug.ShouldStop(262144);
_iddefault = BA.numberCast(int.class, saelozahra._r.runMethod(false,"GetStaticField",(Object)(RemoteObject.concat(_package,RemoteObject.createImmutable(".R$drawable"))),(Object)(_defaultimage)));Debug.locals.put("idDefault", _iddefault);
 BA.debugLineNum = 756;BA.debugLine="If PressedImage <> \"\" Then idPressed = r.GetStati";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("!",_pressedimage,BA.ObjectToString(""))) { 
_idpressed = BA.numberCast(int.class, saelozahra._r.runMethod(false,"GetStaticField",(Object)(RemoteObject.concat(_package,RemoteObject.createImmutable(".R$drawable"))),(Object)(_pressedimage)));Debug.locals.put("idPressed", _idpressed);};
 BA.debugLineNum = 757;BA.debugLine="If DisabelImage <> \"\" Then iddisabel = r.GetStati";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("!",_disabelimage,BA.ObjectToString(""))) { 
_iddisabel = BA.numberCast(int.class, saelozahra._r.runMethod(false,"GetStaticField",(Object)(RemoteObject.concat(_package,RemoteObject.createImmutable(".R$drawable"))),(Object)(_disabelimage)));Debug.locals.put("iddisabel", _iddisabel);};
 BA.debugLineNum = 758;BA.debugLine="r.Target = r.GetContext";
Debug.ShouldStop(2097152);
saelozahra._r.setField ("Target",(saelozahra._r.runMethod(false,"GetContext",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba))));
 BA.debugLineNum = 759;BA.debugLine="r.Target = r.RunMethod(\"getResources\")";
Debug.ShouldStop(4194304);
saelozahra._r.setField ("Target",saelozahra._r.runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getResources"))));
 BA.debugLineNum = 760;BA.debugLine="Dim sd As StateListDrawable";
Debug.ShouldStop(8388608);
_sd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.StateListDrawable");Debug.locals.put("sd", _sd);
 BA.debugLineNum = 761;BA.debugLine="sd.Initialize";
Debug.ShouldStop(16777216);
_sd.runVoidMethod ("Initialize");
 BA.debugLineNum = 762;BA.debugLine="If PressedImage <> \"\" Then sd.AddState(sd.State_P";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("!",_pressedimage,BA.ObjectToString(""))) { 
_sd.runVoidMethod ("AddState",(Object)(_sd.getField(true,"State_Pressed")),(Object)((saelozahra._r.runMethod(false,"RunMethod2",(Object)(BA.ObjectToString("getDrawable")),(Object)(BA.NumberToString(_idpressed)),(Object)(RemoteObject.createImmutable("java.lang.int"))))));};
 BA.debugLineNum = 763;BA.debugLine="If DisabelImage <> \"\" Then sd.AddState(sd.State_D";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("!",_disabelimage,BA.ObjectToString(""))) { 
_sd.runVoidMethod ("AddState",(Object)(_sd.getField(true,"State_Disabled")),(Object)((saelozahra._r.runMethod(false,"RunMethod2",(Object)(BA.ObjectToString("getDrawable")),(Object)(BA.NumberToString(_iddisabel)),(Object)(RemoteObject.createImmutable("java.lang.int"))))));};
 BA.debugLineNum = 764;BA.debugLine="sd.AddCatchAllState( r.RunMethod2(\"getDrawable\",";
Debug.ShouldStop(134217728);
_sd.runVoidMethod ("AddCatchAllState",(Object)((saelozahra._r.runMethod(false,"RunMethod2",(Object)(BA.ObjectToString("getDrawable")),(Object)(BA.NumberToString(_iddefault)),(Object)(RemoteObject.createImmutable("java.lang.int"))))));
 BA.debugLineNum = 765;BA.debugLine="Btn.Background = sd";
Debug.ShouldStop(268435456);
_btn.runMethod(false,"setBackground",(_sd.getObject()));
 BA.debugLineNum = 766;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstatusbarcolor(RemoteObject _ba,RemoteObject _clr) throws Exception{
try {
		Debug.PushSubsStack("SetStatusBarColor (saelozahra) ","saelozahra",7,_ba,saelozahra.mostCurrent,512);
if (RapidSub.canDelegate("setstatusbarcolor")) { return ir.saelozahra.damaara.mazraeyeman.saelozahra.remoteMe.runUserSub(false, "saelozahra","setstatusbarcolor", _ba, _clr);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _window = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
;
Debug.locals.put("clr", _clr);
 BA.debugLineNum = 512;BA.debugLine="Sub SetStatusBarColor(clr As Int)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 514;BA.debugLine="If p.SdkVersion >= 21 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("g",saelozahra._p.runMethod(true,"getSdkVersion"),BA.numberCast(double.class, 21))) { 
 BA.debugLineNum = 515;BA.debugLine="Dim jo As JavaObject";
Debug.ShouldStop(4);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 516;BA.debugLine="jo.InitializeContext";
Debug.ShouldStop(8);
_jo.runVoidMethod ("InitializeContext",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba));
 BA.debugLineNum = 517;BA.debugLine="Dim window As JavaObject = jo.RunMethodJO(\"getWi";
Debug.ShouldStop(16);
_window = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_window = _jo.runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getWindow")),(Object)((saelozahra.mostCurrent.__c.getField(false,"Null"))));Debug.locals.put("window", _window);Debug.locals.put("window", _window);
 BA.debugLineNum = 518;BA.debugLine="window.RunMethod(\"addFlags\", Array (0x80000000))";
Debug.ShouldStop(32);
_window.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("addFlags")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {RemoteObject.createImmutable((((int)0x80000000)))})));
 BA.debugLineNum = 519;BA.debugLine="window.RunMethod(\"clearFlags\", Array (0x04000000";
Debug.ShouldStop(64);
_window.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("clearFlags")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {RemoteObject.createImmutable((((int)0x04000000)))})));
 BA.debugLineNum = 520;BA.debugLine="window.RunMethod(\"setStatusBarColor\", Array(clr)";
Debug.ShouldStop(128);
_window.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setStatusBarColor")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_clr)})));
 };
 BA.debugLineNum = 523;BA.debugLine="SetNavigationBarColor(clr)";
Debug.ShouldStop(1024);
_setnavigationbarcolor(_ba,_clr);
 BA.debugLineNum = 525;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settextshadow(RemoteObject _ba,RemoteObject _pview,RemoteObject _pradius,RemoteObject _pdx,RemoteObject _pdy,RemoteObject _pcolor) throws Exception{
try {
		Debug.PushSubsStack("SetTextShadow (saelozahra) ","saelozahra",7,_ba,saelozahra.mostCurrent,573);
if (RapidSub.canDelegate("settextshadow")) { return ir.saelozahra.damaara.mazraeyeman.saelozahra.remoteMe.runUserSub(false, "saelozahra","settextshadow", _ba, _pview, _pradius, _pdx, _pdy, _pcolor);}
RemoteObject _ref = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
;
Debug.locals.put("pView", _pview);
Debug.locals.put("pRadius", _pradius);
Debug.locals.put("pDx", _pdx);
Debug.locals.put("pDy", _pdy);
Debug.locals.put("pColor", _pcolor);
 BA.debugLineNum = 573;BA.debugLine="Sub SetTextShadow(pView As View, pRadius As Float,";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 575;BA.debugLine="Dim ref As Reflector";
Debug.ShouldStop(1073741824);
_ref = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("ref", _ref);
 BA.debugLineNum = 577;BA.debugLine="ref.Target = pView";
Debug.ShouldStop(1);
_ref.setField ("Target",(_pview.getObject()));
 BA.debugLineNum = 579;BA.debugLine="ref.RunMethod4(\"setShadowLayer\", Array As Object(";
Debug.ShouldStop(4);
_ref.runVoidMethod ("RunMethod4",(Object)(BA.ObjectToString("setShadowLayer")),(Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(_pradius),(_pdx),(_pdy),(_pcolor)})),(Object)(RemoteObject.createNewArray("String",new int[] {4},new Object[] {BA.ObjectToString("java.lang.float"),BA.ObjectToString("java.lang.float"),BA.ObjectToString("java.lang.float"),RemoteObject.createImmutable("java.lang.int")})));
 BA.debugLineNum = 581;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tarikhekhafan(RemoteObject _ba,RemoteObject _timestamp) throws Exception{
try {
		Debug.PushSubsStack("tarikheKhafan (saelozahra) ","saelozahra",7,_ba,saelozahra.mostCurrent,141);
if (RapidSub.canDelegate("tarikhekhafan")) { return ir.saelozahra.damaara.mazraeyeman.saelozahra.remoteMe.runUserSub(false, "saelozahra","tarikhekhafan", _ba, _timestamp);}
RemoteObject _shamsidate = RemoteObject.declareNull("anywheresoftware.b4a.student.PersianDate");
RemoteObject _khodetarikh = RemoteObject.createImmutable("");
RemoteObject _roozetarikh = RemoteObject.createImmutable("");
RemoteObject _mahesh = RemoteObject.createImmutable("");
;
Debug.locals.put("timeStamp", _timestamp);
 BA.debugLineNum = 141;BA.debugLine="Sub tarikheKhafan(timeStamp As Long) As String";
Debug.ShouldStop(4096);
 BA.debugLineNum = 143;BA.debugLine="Try";
Debug.ShouldStop(16384);
try { BA.debugLineNum = 145;BA.debugLine="Dim shamsiDate As PersianDate";
Debug.ShouldStop(65536);
_shamsidate = RemoteObject.createNew ("anywheresoftware.b4a.student.PersianDate");Debug.locals.put("shamsiDate", _shamsidate);
 BA.debugLineNum = 146;BA.debugLine="Dim KhodeTarikh As String = ConvertEnglish(shams";
Debug.ShouldStop(131072);
_khodetarikh = _convertenglish(_ba,_shamsidate.runMethod(true,"getDate",(Object)(saelozahra.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_timestamp))),(Object)(saelozahra.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(_timestamp))),(Object)(saelozahra.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(_timestamp))),(Object)(RemoteObject.createImmutable("/"))));Debug.locals.put("KhodeTarikh", _khodetarikh);Debug.locals.put("KhodeTarikh", _khodetarikh);
 BA.debugLineNum = 147;BA.debugLine="KhodeTarikh=KhodeTarikh.Replace(\"1399/\",\"\")";
Debug.ShouldStop(262144);
_khodetarikh = _khodetarikh.runMethod(true,"replace",(Object)(BA.ObjectToString("1399/")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("KhodeTarikh", _khodetarikh);
 BA.debugLineNum = 148;BA.debugLine="KhodeTarikh=KhodeTarikh.Replace(\"1400/\",\"\")";
Debug.ShouldStop(524288);
_khodetarikh = _khodetarikh.runMethod(true,"replace",(Object)(BA.ObjectToString("1400/")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("KhodeTarikh", _khodetarikh);
 BA.debugLineNum = 149;BA.debugLine="KhodeTarikh=KhodeTarikh.Replace(\"1401/\",\"\")";
Debug.ShouldStop(1048576);
_khodetarikh = _khodetarikh.runMethod(true,"replace",(Object)(BA.ObjectToString("1401/")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("KhodeTarikh", _khodetarikh);
 BA.debugLineNum = 151;BA.debugLine="Dim RoozeTarikh As String = KhodeTarikh.SubStrin";
Debug.ShouldStop(4194304);
_roozetarikh = _khodetarikh.runMethod(true,"substring",(Object)(_khodetarikh.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("/")))),(Object)(_khodetarikh.runMethod(true,"length"))).runMethod(true,"replace",(Object)(BA.ObjectToString("/")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("RoozeTarikh", _roozetarikh);Debug.locals.put("RoozeTarikh", _roozetarikh);
 BA.debugLineNum = 153;BA.debugLine="Dim Mahesh As String = KhodeTarikh.SubString2(0,";
Debug.ShouldStop(16777216);
_mahesh = _khodetarikh.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(_khodetarikh.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("/")))));Debug.locals.put("Mahesh", _mahesh);Debug.locals.put("Mahesh", _mahesh);
 BA.debugLineNum = 154;BA.debugLine="Mahesh = esmeMah(Mahesh.Replace(\"/\",\"\"))";
Debug.ShouldStop(33554432);
_mahesh = _esmemah(_ba,BA.numberCast(int.class, _mahesh.runMethod(true,"replace",(Object)(BA.ObjectToString("/")),(Object)(RemoteObject.createImmutable("")))));Debug.locals.put("Mahesh", _mahesh);
 BA.debugLineNum = 156;BA.debugLine="Return esmeRoozeHafte(timeStamp)&\" \" &ConvertPer";
Debug.ShouldStop(134217728);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.concat(_esmeroozehafte(_ba,_timestamp),RemoteObject.createImmutable(" "),_convertpersian(_ba,_roozetarikh),RemoteObject.createImmutable(" "),_mah(_ba,_mahesh));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e12) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e12.toString()); BA.debugLineNum = 159;BA.debugLine="Log(\"نتونست تاریخو در بیاره\"&LastException)";
Debug.ShouldStop(1073741824);
saelozahra.mostCurrent.__c.runVoidMethod ("LogImpl","47864338",RemoteObject.concat(RemoteObject.createImmutable("نتونست تاریخو در بیاره"),saelozahra.mostCurrent.__c.runMethod(false,"LastException",_ba)),0);
 BA.debugLineNum = 160;BA.debugLine="Return shamsiDate.getDate(DateTime.GetYear(timeS";
Debug.ShouldStop(-2147483648);
if (true) return _shamsidate.runMethod(true,"getDate",(Object)(saelozahra.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_timestamp))),(Object)(saelozahra.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(_timestamp))),(Object)(saelozahra.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(_timestamp))),(Object)(RemoteObject.createImmutable("/")));
 };
 BA.debugLineNum = 163;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _validateemail(RemoteObject _ba,RemoteObject _emailaddress) throws Exception{
try {
		Debug.PushSubsStack("ValidateEmail (saelozahra) ","saelozahra",7,_ba,saelozahra.mostCurrent,558);
if (RapidSub.canDelegate("validateemail")) { return ir.saelozahra.damaara.mazraeyeman.saelozahra.remoteMe.runUserSub(false, "saelozahra","validateemail", _ba, _emailaddress);}
RemoteObject _matchemail = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Regex.MatcherWrapper");
;
Debug.locals.put("EmailAddress", _emailaddress);
 BA.debugLineNum = 558;BA.debugLine="Sub ValidateEmail(EmailAddress As String) As Boole";
Debug.ShouldStop(8192);
 BA.debugLineNum = 560;BA.debugLine="Dim MatchEmail As Matcher = Regex.Matcher(\"^(?i)[";
Debug.ShouldStop(32768);
_matchemail = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Regex.MatcherWrapper");
_matchemail = saelozahra.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Matcher",(Object)(BA.ObjectToString("^(?i)[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])$")),(Object)(_emailaddress));Debug.locals.put("MatchEmail", _matchemail);Debug.locals.put("MatchEmail", _matchemail);
 BA.debugLineNum = 562;BA.debugLine="If MatchEmail.Find = True Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_matchemail.runMethod(true,"Find"),saelozahra.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 563;BA.debugLine="Log(MatchEmail.Match)";
Debug.ShouldStop(262144);
saelozahra.mostCurrent.__c.runVoidMethod ("LogImpl","48847365",_matchemail.runMethod(true,"getMatch"),0);
 BA.debugLineNum = 564;BA.debugLine="Return True";
Debug.ShouldStop(524288);
if (true) return saelozahra.mostCurrent.__c.getField(true,"True");
 }else {
 BA.debugLineNum = 566;BA.debugLine="Log(\"Oops, please double check your email addres";
Debug.ShouldStop(2097152);
saelozahra.mostCurrent.__c.runVoidMethod ("LogImpl","48847368",RemoteObject.createImmutable("Oops, please double check your email address..."),0);
 BA.debugLineNum = 567;BA.debugLine="Return False";
Debug.ShouldStop(4194304);
if (true) return saelozahra.mostCurrent.__c.getField(true,"False");
 };
 BA.debugLineNum = 570;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}