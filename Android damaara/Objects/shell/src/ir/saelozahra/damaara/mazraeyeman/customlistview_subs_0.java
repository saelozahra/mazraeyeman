package ir.saelozahra.damaara.mazraeyeman;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class customlistview_subs_0 {


public static RemoteObject  _add(RemoteObject __ref,RemoteObject _pnl,RemoteObject _itemheight,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("Add (customlistview) ","customlistview",13,__ref.getField(false, "ba"),__ref,251);
if (RapidSub.canDelegate("add")) { return __ref.runUserSub(false, "customlistview","add", __ref, _pnl, _itemheight, _value);}
Debug.locals.put("Pnl", _pnl);
Debug.locals.put("ItemHeight", _itemheight);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 251;BA.debugLine="Public Sub Add(Pnl As Panel, ItemHeight As Int, Va";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 252;BA.debugLine="InsertAt(items.Size, Pnl, ItemHeight, Value)";
Debug.ShouldStop(134217728);
__ref.runClassMethod (ir.saelozahra.damaara.mazraeyeman.customlistview.class, "_insertat" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(true,"getSize")),(Object)(_pnl),(Object)(_itemheight),(Object)(_value));
 BA.debugLineNum = 253;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addalertitem(RemoteObject __ref,RemoteObject _text,RemoteObject _value,RemoteObject _thistype,RemoteObject _thisicon,RemoteObject _time) throws Exception{
try {
		Debug.PushSubsStack("AddAlertItem (customlistview) ","customlistview",13,__ref.getField(false, "ba"),__ref,121);
if (RapidSub.canDelegate("addalertitem")) { return __ref.runUserSub(false, "customlistview","addalertitem", __ref, _text, _value, _thistype, _thisicon, _time);}
Debug.locals.put("Text", _text);
Debug.locals.put("Value", _value);
Debug.locals.put("ThisType", _thistype);
Debug.locals.put("ThisIcon", _thisicon);
Debug.locals.put("Time", _time);
 BA.debugLineNum = 121;BA.debugLine="Public Sub AddAlertItem(Text As String, Value As O";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 122;BA.debugLine="InsertAtAlertItem(items.Size, Text, Value,ThisTyp";
Debug.ShouldStop(33554432);
__ref.runClassMethod (ir.saelozahra.damaara.mazraeyeman.customlistview.class, "_insertatalertitem" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(true,"getSize")),(Object)(_text),(Object)(_value),(Object)(BA.NumberToString(_thistype)),(Object)(BA.NumberToString(_thisicon)),(Object)(_time));
 BA.debugLineNum = 123;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addtextitem(RemoteObject __ref,RemoteObject _text,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("AddTextItem (customlistview) ","customlistview",13,__ref.getField(false, "ba"),__ref,96);
if (RapidSub.canDelegate("addtextitem")) { return __ref.runUserSub(false, "customlistview","addtextitem", __ref, _text, _value);}
Debug.locals.put("Text", _text);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 96;BA.debugLine="Public Sub AddTextItem(Text As String, Value As Ob";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 97;BA.debugLine="InsertAtTextItem(items.Size, Text, Value)";
Debug.ShouldStop(1);
__ref.runClassMethod (ir.saelozahra.damaara.mazraeyeman.customlistview.class, "_insertattextitem" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(true,"getSize")),(Object)(_text),(Object)(_value));
 BA.debugLineNum = 98;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _asview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AsView (customlistview) ","customlistview",13,__ref.getField(false, "ba"),__ref,52);
if (RapidSub.canDelegate("asview")) { return __ref.runUserSub(false, "customlistview","asview", __ref);}
 BA.debugLineNum = 52;BA.debugLine="Public Sub AsView As View";
Debug.ShouldStop(524288);
 BA.debugLineNum = 53;BA.debugLine="Return sv";
Debug.ShouldStop(1048576);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_sv" /*RemoteObject*/ ).getObject());
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Dim timeOut As Int";
customlistview._timeout = RemoteObject.createImmutable(0);__ref.setField("_timeout",customlistview._timeout);
 //BA.debugLineNum = 4;BA.debugLine="Dim t1 As Timer";
customlistview._t1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");__ref.setField("_t1",customlistview._t1);
 //BA.debugLineNum = 5;BA.debugLine="Private sv As ScrollView";
customlistview._sv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");__ref.setField("_sv",customlistview._sv);
 //BA.debugLineNum = 6;BA.debugLine="Private items As List";
customlistview._items = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_items",customlistview._items);
 //BA.debugLineNum = 7;BA.debugLine="Private panels As List";
customlistview._panels = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_panels",customlistview._panels);
 //BA.debugLineNum = 8;BA.debugLine="Private dividerHeight As Float";
customlistview._dividerheight = RemoteObject.createImmutable(0f);__ref.setField("_dividerheight",customlistview._dividerheight);
 //BA.debugLineNum = 9;BA.debugLine="Private pressedDrawable As Object";
customlistview._presseddrawable = RemoteObject.createNew ("Object");__ref.setField("_presseddrawable",customlistview._presseddrawable);
 //BA.debugLineNum = 10;BA.debugLine="Private EventName As String";
customlistview._eventname = RemoteObject.createImmutable("");__ref.setField("_eventname",customlistview._eventname);
 //BA.debugLineNum = 11;BA.debugLine="Private CallBack As Object";
customlistview._callback = RemoteObject.createNew ("Object");__ref.setField("_callback",customlistview._callback);
 //BA.debugLineNum = 12;BA.debugLine="Private su As StringUtils";
customlistview._su = RemoteObject.createNew ("anywheresoftware.b4a.objects.StringUtils");__ref.setField("_su",customlistview._su);
 //BA.debugLineNum = 13;BA.debugLine="Public DefaultTextSize As Int";
customlistview._defaulttextsize = RemoteObject.createImmutable(0);__ref.setField("_defaulttextsize",customlistview._defaulttextsize);
 //BA.debugLineNum = 14;BA.debugLine="Public DefaultTextColor As Int";
customlistview._defaulttextcolor = RemoteObject.createImmutable(0);__ref.setField("_defaulttextcolor",customlistview._defaulttextcolor);
 //BA.debugLineNum = 15;BA.debugLine="Public DefaultTextBackgroundColor As Int";
customlistview._defaulttextbackgroundcolor = RemoteObject.createImmutable(0);__ref.setField("_defaulttextbackgroundcolor",customlistview._defaulttextbackgroundcolor);
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clear(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Clear (customlistview) ","customlistview",13,__ref.getField(false, "ba"),__ref,42);
if (RapidSub.canDelegate("clear")) { return __ref.runUserSub(false, "customlistview","clear", __ref);}
int _i = 0;
 BA.debugLineNum = 42;BA.debugLine="Public Sub Clear";
Debug.ShouldStop(512);
 BA.debugLineNum = 43;BA.debugLine="items.Clear";
Debug.ShouldStop(1024);
__ref.getField(false,"_items" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 44;BA.debugLine="panels.Clear";
Debug.ShouldStop(2048);
__ref.getField(false,"_panels" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 45;BA.debugLine="sv.Panel.Height = 0";
Debug.ShouldStop(4096);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethod(true,"setHeight",BA.numberCast(int.class, 0));
 BA.debugLineNum = 46;BA.debugLine="For i = sv.Panel.NumberOfViews - 1 To 0 Step -1";
Debug.ShouldStop(8192);
{
final int step4 = -1;
final int limit4 = 0;
_i = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue() ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 47;BA.debugLine="sv.Panel.RemoveViewAt(i)";
Debug.ShouldStop(16384);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(false,"getPanel").runVoidMethod ("RemoveViewAt",(Object)(BA.numberCast(int.class, _i)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcurrentactivity(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getCurrentActivity (customlistview) ","customlistview",13,__ref.getField(false, "ba"),__ref,297);
if (RapidSub.canDelegate("getcurrentactivity")) { return __ref.runUserSub(false, "customlistview","getcurrentactivity", __ref);}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
 BA.debugLineNum = 297;BA.debugLine="Sub getCurrentActivity As Activity";
Debug.ShouldStop(256);
 BA.debugLineNum = 298;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(512);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 299;BA.debugLine="r.Target = r.GetActivityBA";
Debug.ShouldStop(1024);
_r.setField ("Target",(_r.runMethod(false,"GetActivityBA",__ref.getField(false, "ba"))));
 BA.debugLineNum = 300;BA.debugLine="Return r.GetField(\"vg\")";
Debug.ShouldStop(2048);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ActivityWrapper"), _r.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("vg"))));
 BA.debugLineNum = 301;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getitemfromview(RemoteObject __ref,RemoteObject _v) throws Exception{
try {
		Debug.PushSubsStack("GetItemFromView (customlistview) ","customlistview",13,__ref.getField(false, "ba"),__ref,283);
if (RapidSub.canDelegate("getitemfromview")) { return __ref.runUserSub(false, "customlistview","getitemfromview", __ref, _v);}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
RemoteObject _parent = RemoteObject.declareNull("Object");
RemoteObject _current = RemoteObject.declareNull("Object");
Debug.locals.put("v", _v);
 BA.debugLineNum = 283;BA.debugLine="Public Sub GetItemFromView(v As View) As Int";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 284;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(134217728);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 285;BA.debugLine="Dim parent, current As Object";
Debug.ShouldStop(268435456);
_parent = RemoteObject.createNew ("Object");Debug.locals.put("parent", _parent);
_current = RemoteObject.createNew ("Object");Debug.locals.put("current", _current);
 BA.debugLineNum = 286;BA.debugLine="parent = v";
Debug.ShouldStop(536870912);
_parent = (_v.getObject());Debug.locals.put("parent", _parent);
 BA.debugLineNum = 287;BA.debugLine="Do While (parent Is Panel) = False Or sv.Panel <>";
Debug.ShouldStop(1073741824);
while (RemoteObject.solveBoolean("=",RemoteObject.createImmutable((RemoteObject.solveBoolean("i",_parent, RemoteObject.createImmutable("android.view.ViewGroup")))),customlistview.__c.getField(true,"False")) || RemoteObject.solveBoolean("!",__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(false,"getPanel"),_parent)) {
 BA.debugLineNum = 288;BA.debugLine="current = parent";
Debug.ShouldStop(-2147483648);
_current = _parent;Debug.locals.put("current", _current);
 BA.debugLineNum = 289;BA.debugLine="r.Target = current";
Debug.ShouldStop(1);
_r.setField ("Target",_current);
 BA.debugLineNum = 290;BA.debugLine="parent = r.RunMethod(\"getParent\")";
Debug.ShouldStop(2);
_parent = _r.runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getParent")));Debug.locals.put("parent", _parent);
 }
;
 BA.debugLineNum = 292;BA.debugLine="v = current";
Debug.ShouldStop(8);
_v = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), _current);Debug.locals.put("v", _v);
 BA.debugLineNum = 293;BA.debugLine="Return v.Tag";
Debug.ShouldStop(16);
if (true) return BA.numberCast(int.class, _v.runMethod(false,"getTag"));
 BA.debugLineNum = 294;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getpanel(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("GetPanel (customlistview) ","customlistview",13,__ref.getField(false, "ba"),__ref,69);
if (RapidSub.canDelegate("getpanel")) { return __ref.runUserSub(false, "customlistview","getpanel", __ref, _index);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("Index", _index);
 BA.debugLineNum = 69;BA.debugLine="Public Sub GetPanel(Index As Int) As Panel";
Debug.ShouldStop(16);
 BA.debugLineNum = 70;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(32);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 71;BA.debugLine="p = panels.Get(Index) 'this is the parent panel";
Debug.ShouldStop(64);
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), __ref.getField(false,"_panels" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_index)));Debug.locals.put("p", _p);
 BA.debugLineNum = 72;BA.debugLine="Return p.GetView(0)";
Debug.ShouldStop(128);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());
 BA.debugLineNum = 73;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getsize(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetSize (customlistview) ","customlistview",13,__ref.getField(false, "ba"),__ref,64);
if (RapidSub.canDelegate("getsize")) { return __ref.runUserSub(false, "customlistview","getsize", __ref);}
 BA.debugLineNum = 64;BA.debugLine="Public Sub GetSize As Int";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 65;BA.debugLine="Return items.Size";
Debug.ShouldStop(1);
if (true) return __ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(true,"getSize");
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getvalue(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("GetValue (customlistview) ","customlistview",13,__ref.getField(false, "ba"),__ref,76);
if (RapidSub.canDelegate("getvalue")) { return __ref.runUserSub(false, "customlistview","getvalue", __ref, _index);}
Debug.locals.put("Index", _index);
 BA.debugLineNum = 76;BA.debugLine="Public Sub GetValue(Index As Int) As Object";
Debug.ShouldStop(2048);
 BA.debugLineNum = 77;BA.debugLine="Return items.Get(Index)";
Debug.ShouldStop(4096);
if (true) return __ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_index));
 BA.debugLineNum = 78;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _vcallback,RemoteObject _veventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (customlistview) ","customlistview",13,__ref.getField(false, "ba"),__ref,20);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "customlistview","initialize", __ref, _ba, _vcallback, _veventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
RemoteObject _idpressed = RemoteObject.createImmutable(0);
Debug.locals.put("ba", _ba);
Debug.locals.put("vCallback", _vcallback);
Debug.locals.put("vEventName", _veventname);
 BA.debugLineNum = 20;BA.debugLine="Public Sub Initialize (vCallback As Object, vEvent";
Debug.ShouldStop(524288);
 BA.debugLineNum = 21;BA.debugLine="sv.Initialize2(0, \"sv\")";
Debug.ShouldStop(1048576);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runVoidMethod ("Initialize2",__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.createImmutable("sv")));
 BA.debugLineNum = 22;BA.debugLine="items.Initialize";
Debug.ShouldStop(2097152);
__ref.getField(false,"_items" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 23;BA.debugLine="panels.Initialize";
Debug.ShouldStop(4194304);
__ref.getField(false,"_panels" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 24;BA.debugLine="dividerHeight = 0dip";
Debug.ShouldStop(8388608);
__ref.setField ("_dividerheight" /*RemoteObject*/ ,BA.numberCast(float.class, customlistview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))));
 BA.debugLineNum = 25;BA.debugLine="EventName = vEventName";
Debug.ShouldStop(16777216);
__ref.setField ("_eventname" /*RemoteObject*/ ,_veventname);
 BA.debugLineNum = 26;BA.debugLine="CallBack = vCallback";
Debug.ShouldStop(33554432);
__ref.setField ("_callback" /*RemoteObject*/ ,_vcallback);
 BA.debugLineNum = 27;BA.debugLine="sv.Color = Colors.Transparent '0xFFD9D7DE 'this s";
Debug.ShouldStop(67108864);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runVoidMethod ("setColor",customlistview.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 28;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(134217728);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 29;BA.debugLine="Dim idPressed As Int";
Debug.ShouldStop(268435456);
_idpressed = RemoteObject.createImmutable(0);Debug.locals.put("idPressed", _idpressed);
 BA.debugLineNum = 30;BA.debugLine="idPressed = r.GetStaticField(\"android.R$drawab";
Debug.ShouldStop(536870912);
_idpressed = BA.numberCast(int.class, _r.runMethod(false,"GetStaticField",(Object)(BA.ObjectToString("android.R$drawable")),(Object)(RemoteObject.createImmutable("list_selector_background"))));Debug.locals.put("idPressed", _idpressed);
 BA.debugLineNum = 31;BA.debugLine="r.Target = r.GetContext";
Debug.ShouldStop(1073741824);
_r.setField ("Target",(_r.runMethod(false,"GetContext",__ref.getField(false, "ba"))));
 BA.debugLineNum = 32;BA.debugLine="r.Target = r.RunMethod(\"getResources\")";
Debug.ShouldStop(-2147483648);
_r.setField ("Target",_r.runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getResources"))));
 BA.debugLineNum = 33;BA.debugLine="pressedDrawable = r.RunMethod2(\"getDrawable\", idP";
Debug.ShouldStop(1);
__ref.setField ("_presseddrawable" /*RemoteObject*/ ,_r.runMethod(false,"RunMethod2",(Object)(BA.ObjectToString("getDrawable")),(Object)(BA.NumberToString(_idpressed)),(Object)(RemoteObject.createImmutable("java.lang.int"))));
 BA.debugLineNum = 34;BA.debugLine="DefaultTextColor = Colors.White";
Debug.ShouldStop(2);
__ref.setField ("_defaulttextcolor" /*RemoteObject*/ ,customlistview.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 35;BA.debugLine="DefaultTextSize = 16";
Debug.ShouldStop(4);
__ref.setField ("_defaulttextsize" /*RemoteObject*/ ,BA.numberCast(int.class, 16));
 BA.debugLineNum = 36;BA.debugLine="DefaultTextBackgroundColor = SaeloZahra.ColorDark";
Debug.ShouldStop(8);
__ref.setField ("_defaulttextbackgroundcolor" /*RemoteObject*/ ,customlistview._saelozahra._colordark /*RemoteObject*/ );
 BA.debugLineNum = 37;BA.debugLine="t1.Initialize(\"t1\",1000)";
Debug.ShouldStop(16);
__ref.getField(false,"_t1" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("t1")),(Object)(BA.numberCast(long.class, 1000)));
 BA.debugLineNum = 38;BA.debugLine="t1.Enabled=True";
Debug.ShouldStop(32);
__ref.getField(false,"_t1" /*RemoteObject*/ ).runMethod(true,"setEnabled",customlistview.__c.getField(true,"True"));
 BA.debugLineNum = 39;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _insertat(RemoteObject __ref,RemoteObject _index,RemoteObject _pnl,RemoteObject _itemheight,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("InsertAt (customlistview) ","customlistview",13,__ref.getField(false, "ba"),__ref,198);
if (RapidSub.canDelegate("insertat")) { return __ref.runUserSub(false, "customlistview","insertat", __ref, _index, _pnl, _itemheight, _value);}
RemoteObject _sd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.StateListDrawable");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _cd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _top = RemoteObject.createImmutable(0);
RemoteObject _previouspanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _p2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
int _i = 0;
Debug.locals.put("Index", _index);
Debug.locals.put("Pnl", _pnl);
Debug.locals.put("ItemHeight", _itemheight);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 198;BA.debugLine="Public Sub InsertAt(Index As Int, Pnl As Panel, It";
Debug.ShouldStop(32);
 BA.debugLineNum = 200;BA.debugLine="Dim sd As StateListDrawable";
Debug.ShouldStop(128);
_sd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.StateListDrawable");Debug.locals.put("sd", _sd);
 BA.debugLineNum = 201;BA.debugLine="sd.Initialize";
Debug.ShouldStop(256);
_sd.runVoidMethod ("Initialize");
 BA.debugLineNum = 202;BA.debugLine="sd.AddState(sd.State_Pressed, pressedDrawable)";
Debug.ShouldStop(512);
_sd.runVoidMethod ("AddState",(Object)(_sd.getField(true,"State_Pressed")),(Object)((__ref.getField(false,"_presseddrawable" /*RemoteObject*/ ))));
 BA.debugLineNum = 203;BA.debugLine="sd.AddCatchAllState(Pnl.Background)";
Debug.ShouldStop(1024);
_sd.runVoidMethod ("AddCatchAllState",(Object)(_pnl.runMethod(false,"getBackground")));
 BA.debugLineNum = 206;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(8192);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 207;BA.debugLine="p.Initialize(\"panel\")";
Debug.ShouldStop(16384);
_p.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("panel")));
 BA.debugLineNum = 208;BA.debugLine="p.Background = sd";
Debug.ShouldStop(32768);
_p.runMethod(false,"setBackground",(_sd.getObject()));
 BA.debugLineNum = 209;BA.debugLine="Dim cd As ColorDrawable";
Debug.ShouldStop(65536);
_cd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("cd", _cd);
 BA.debugLineNum = 210;BA.debugLine="cd.Initialize(Colors.Transparent, 0)";
Debug.ShouldStop(131072);
_cd.runVoidMethod ("Initialize",(Object)(customlistview.__c.getField(false,"Colors").getField(true,"Transparent")),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 211;BA.debugLine="Pnl.Background = cd";
Debug.ShouldStop(262144);
_pnl.runMethod(false,"setBackground",(_cd.getObject()));
 BA.debugLineNum = 212;BA.debugLine="p.AddView(Pnl, 0, 0, sv.Width, ItemHeight)";
Debug.ShouldStop(524288);
_p.runVoidMethod ("AddView",(Object)((_pnl.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(_itemheight));
 BA.debugLineNum = 213;BA.debugLine="p.Tag = Index";
Debug.ShouldStop(1048576);
_p.runMethod(false,"setTag",(_index));
 BA.debugLineNum = 215;BA.debugLine="If Index = items.Size Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_index,BA.numberCast(double.class, __ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(true,"getSize")))) { 
 BA.debugLineNum = 216;BA.debugLine="items.Add(Value)";
Debug.ShouldStop(8388608);
__ref.getField(false,"_items" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(_value));
 BA.debugLineNum = 217;BA.debugLine="panels.Add(p)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_panels" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_p.getObject())));
 BA.debugLineNum = 218;BA.debugLine="Dim top As Int";
Debug.ShouldStop(33554432);
_top = RemoteObject.createImmutable(0);Debug.locals.put("top", _top);
 BA.debugLineNum = 219;BA.debugLine="If Index = 0 Then top = dividerHeight Else top =";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_index,BA.numberCast(double.class, 0))) { 
_top = BA.numberCast(int.class, __ref.getField(true,"_dividerheight" /*RemoteObject*/ ));Debug.locals.put("top", _top);}
else {
_top = __ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethod(true,"getHeight");Debug.locals.put("top", _top);};
 BA.debugLineNum = 220;BA.debugLine="sv.Panel.AddView(p, 0, top, sv.Width, ItemHeight";
Debug.ShouldStop(134217728);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(_top),(Object)(__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(_itemheight));
 }else {
 BA.debugLineNum = 222;BA.debugLine="Dim top As Int";
Debug.ShouldStop(536870912);
_top = RemoteObject.createImmutable(0);Debug.locals.put("top", _top);
 BA.debugLineNum = 223;BA.debugLine="If Index = 0 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_index,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 224;BA.debugLine="top = dividerHeight";
Debug.ShouldStop(-2147483648);
_top = BA.numberCast(int.class, __ref.getField(true,"_dividerheight" /*RemoteObject*/ ));Debug.locals.put("top", _top);
 }else {
 BA.debugLineNum = 226;BA.debugLine="Dim previousPanel As Panel";
Debug.ShouldStop(2);
_previouspanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("previousPanel", _previouspanel);
 BA.debugLineNum = 227;BA.debugLine="previousPanel = panels.Get(Index - 1)";
Debug.ShouldStop(4);
_previouspanel = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), __ref.getField(false,"_panels" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {_index,RemoteObject.createImmutable(1)}, "-",1, 1))));Debug.locals.put("previousPanel", _previouspanel);
 BA.debugLineNum = 228;BA.debugLine="top = previousPanel.top + previousPanel.Height";
Debug.ShouldStop(8);
_top = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_previouspanel.runMethod(true,"getTop"),_previouspanel.runMethod(true,"getHeight"),__ref.getField(true,"_dividerheight" /*RemoteObject*/ )}, "++",2, 0));Debug.locals.put("top", _top);
 };
 BA.debugLineNum = 231;BA.debugLine="Dim p2 As Panel";
Debug.ShouldStop(64);
_p2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p2", _p2);
 BA.debugLineNum = 232;BA.debugLine="For i = Index To panels.Size - 1";
Debug.ShouldStop(128);
{
final int step29 = 1;
final int limit29 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_panels" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = _index.<Integer>get().intValue() ;
for (;(step29 > 0 && _i <= limit29) || (step29 < 0 && _i >= limit29) ;_i = ((int)(0 + _i + step29))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 233;BA.debugLine="p2 = panels.Get(i)";
Debug.ShouldStop(256);
_p2 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), __ref.getField(false,"_panels" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("p2", _p2);
 BA.debugLineNum = 234;BA.debugLine="p2.top = p2.top + ItemHeight + dividerHeight";
Debug.ShouldStop(512);
_p2.runMethod(true,"setTop",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_p2.runMethod(true,"getTop"),_itemheight,__ref.getField(true,"_dividerheight" /*RemoteObject*/ )}, "++",2, 0)));
 BA.debugLineNum = 235;BA.debugLine="p2.Tag = i + 1";
Debug.ShouldStop(1024);
_p2.runMethod(false,"setTag",(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 238;BA.debugLine="items.InsertAt(Index, Value)";
Debug.ShouldStop(8192);
__ref.getField(false,"_items" /*RemoteObject*/ ).runVoidMethod ("InsertAt",(Object)(_index),(Object)(_value));
 BA.debugLineNum = 239;BA.debugLine="panels.InsertAt(Index, p)";
Debug.ShouldStop(16384);
__ref.getField(false,"_panels" /*RemoteObject*/ ).runVoidMethod ("InsertAt",(Object)(_index),(Object)((_p.getObject())));
 BA.debugLineNum = 240;BA.debugLine="sv.Panel.AddView(p, 0%x, top, sv.Width, ItemHeig";
Debug.ShouldStop(32768);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(customlistview.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 0)),__ref.getField(false, "ba"))),(Object)(_top),(Object)(__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(_itemheight));
 };
 BA.debugLineNum = 244;BA.debugLine="sv.Panel.Height = sv.Panel.Height + ItemHeight +";
Debug.ShouldStop(524288);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethod(true,"setHeight",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethod(true,"getHeight"),_itemheight,__ref.getField(true,"_dividerheight" /*RemoteObject*/ )}, "++",2, 0)));
 BA.debugLineNum = 246;BA.debugLine="If items.Size = 1 Then sv.Panel.Height = sv.Panel";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 1))) { 
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethod(true,"setHeight",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethod(true,"getHeight"),__ref.getField(true,"_dividerheight" /*RemoteObject*/ )}, "+",1, 0)));};
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
public static RemoteObject  _insertatalertitem(RemoteObject __ref,RemoteObject _index,RemoteObject _text,RemoteObject _value,RemoteObject _thistype,RemoteObject _icon,RemoteObject _time) throws Exception{
try {
		Debug.PushSubsStack("InsertAtAlertItem (customlistview) ","customlistview",13,__ref.getField(false, "ba"),__ref,125);
if (RapidSub.canDelegate("insertatalertitem")) { return __ref.runUserSub(false, "customlistview","insertatalertitem", __ref, _index, _text, _value, _thistype, _icon, _time);}
RemoteObject _cdpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _cd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _timelbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _imgv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
RemoteObject _linelbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _cdbubble = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _bubblelbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _minheight = RemoteObject.createImmutable(0);
Debug.locals.put("Index", _index);
Debug.locals.put("Text", _text);
Debug.locals.put("Value", _value);
Debug.locals.put("ThisType", _thistype);
Debug.locals.put("Icon", _icon);
Debug.locals.put("Time", _time);
 BA.debugLineNum = 125;BA.debugLine="Public Sub InsertAtAlertItem(Index As Int, Text As";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 127;BA.debugLine="Dim cdPanel As ColorDrawable";
Debug.ShouldStop(1073741824);
_cdpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("cdPanel", _cdpanel);
 BA.debugLineNum = 128;BA.debugLine="cdPanel.Initialize(Colors.RGB(Rnd(0,254),Rnd(0,25";
Debug.ShouldStop(-2147483648);
_cdpanel.runVoidMethod ("Initialize",(Object)(customlistview.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(customlistview.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 254)))),(Object)(customlistview.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 254)))),(Object)(customlistview.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 254)))))),(Object)(BA.numberCast(int.class, 18)));
 BA.debugLineNum = 130;BA.debugLine="Dim pnl As Panel";
Debug.ShouldStop(2);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 131;BA.debugLine="pnl.Initialize(\"\")";
Debug.ShouldStop(4);
_pnl.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 132;BA.debugLine="pnl.Background=cdPanel";
Debug.ShouldStop(8);
_pnl.runMethod(false,"setBackground",(_cdpanel.getObject()));
 BA.debugLineNum = 133;BA.debugLine="pnl.Elevation=12dip";
Debug.ShouldStop(16);
_pnl.runMethod(true,"setElevation",BA.numberCast(float.class, customlistview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 12)))));
 BA.debugLineNum = 135;BA.debugLine="Dim lbl As Label";
Debug.ShouldStop(64);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 136;BA.debugLine="lbl.Initialize(\"\")";
Debug.ShouldStop(128);
_lbl.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 137;BA.debugLine="lbl.Background=cdPanel";
Debug.ShouldStop(256);
_lbl.runMethod(false,"setBackground",(_cdpanel.getObject()));
 BA.debugLineNum = 138;BA.debugLine="lbl.Text = Text";
Debug.ShouldStop(512);
_lbl.runMethod(true,"setText",BA.ObjectToCharSequence(_text));
 BA.debugLineNum = 139;BA.debugLine="lbl.Gravity = Bit.Or(Gravity.CENTER_HORIZONTAL,Gr";
Debug.ShouldStop(1024);
_lbl.runMethod(true,"setGravity",customlistview.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(customlistview.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL")),(Object)(customlistview.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL"))));
 BA.debugLineNum = 142;BA.debugLine="lbl.Typeface = SaeloZahra.font";
Debug.ShouldStop(8192);
_lbl.runMethod(false,"setTypeface",(customlistview._saelozahra._font /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 143;BA.debugLine="pnl.AddView(lbl, 10dip, 10dip, sv.Width - (sv.Wid";
Debug.ShouldStop(16384);
_pnl.runVoidMethod ("AddView",(Object)((_lbl.getObject())),(Object)(customlistview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(customlistview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"getWidth"),(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(7)}, "/",0, 0))}, "-",1, 0))),(Object)(customlistview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))));
 BA.debugLineNum = 146;BA.debugLine="Dim cd As ColorDrawable";
Debug.ShouldStop(131072);
_cd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("cd", _cd);
 BA.debugLineNum = 147;BA.debugLine="cd.Initialize(SaeloZahra.FindAlertColor(ThisType)";
Debug.ShouldStop(262144);
_cd.runVoidMethod ("Initialize",(Object)(customlistview._saelozahra.runMethod(true,"_findalertcolor" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_thistype))),(Object)(customlistview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 7)))));
 BA.debugLineNum = 149;BA.debugLine="Dim timeLbl As Label";
Debug.ShouldStop(1048576);
_timelbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("timeLbl", _timelbl);
 BA.debugLineNum = 150;BA.debugLine="timeLbl.Initialize(\"\")";
Debug.ShouldStop(2097152);
_timelbl.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 151;BA.debugLine="timeLbl.Background	= cd";
Debug.ShouldStop(4194304);
_timelbl.runMethod(false,"setBackground",(_cd.getObject()));
 BA.debugLineNum = 152;BA.debugLine="timeLbl.Text	 	= SaeloZahra.mohasebe_tarikh(Time)";
Debug.ShouldStop(8388608);
_timelbl.runMethod(true,"setText",BA.ObjectToCharSequence(customlistview._saelozahra.runMethod(true,"_mohasebe_tarikh" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.numberCast(long.class, _time)))));
 BA.debugLineNum = 153;BA.debugLine="timeLbl.TextSize	= 12";
Debug.ShouldStop(16777216);
_timelbl.runMethod(true,"setTextSize",BA.numberCast(float.class, 12));
 BA.debugLineNum = 154;BA.debugLine="timeLbl.Gravity		= Bit.Or(Gravity.CENTER, Gravity";
Debug.ShouldStop(33554432);
_timelbl.runMethod(true,"setGravity",customlistview.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(customlistview.__c.getField(false,"Gravity").getField(true,"CENTER")),(Object)(customlistview.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"))));
 BA.debugLineNum = 155;BA.debugLine="timeLbl.textColor	= Colors.White";
Debug.ShouldStop(67108864);
_timelbl.runMethod(true,"setTextColor",customlistview.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 156;BA.debugLine="pnl.AddView(timeLbl,12dip,12dip,72dip,18dip)";
Debug.ShouldStop(134217728);
_pnl.runVoidMethod ("AddView",(Object)((_timelbl.getObject())),(Object)(customlistview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 12)))),(Object)(customlistview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 12)))),(Object)(customlistview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 72)))),(Object)(customlistview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 18)))));
 BA.debugLineNum = 159;BA.debugLine="Dim ImgV As ImageView";
Debug.ShouldStop(1073741824);
_imgv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");Debug.locals.put("ImgV", _imgv);
 BA.debugLineNum = 160;BA.debugLine="ImgV.Initialize(\"\")";
Debug.ShouldStop(-2147483648);
_imgv.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 161;BA.debugLine="ImgV.Gravity = Gravity.CENTER";
Debug.ShouldStop(1);
_imgv.runMethod(true,"setGravity",customlistview.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 162;BA.debugLine="If File.Exists(File.DirAssets,Icon) Then";
Debug.ShouldStop(2);
if (customlistview.__c.getField(false,"File").runMethod(true,"Exists",(Object)(customlistview.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(_icon)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 163;BA.debugLine="ImgV.SetBackgroundImage(LoadBitmap(File.DirAsset";
Debug.ShouldStop(4);
_imgv.runVoidMethod ("SetBackgroundImageNew",(Object)((customlistview.__c.runMethod(false,"LoadBitmap",(Object)(customlistview.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(_icon)).getObject())));
 }else {
 BA.debugLineNum = 165;BA.debugLine="ImgV.SetBackgroundImage(LoadBitmap(File.DirAsset";
Debug.ShouldStop(16);
_imgv.runVoidMethod ("SetBackgroundImageNew",(Object)((customlistview.__c.runMethod(false,"LoadBitmap",(Object)(customlistview.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("1.png"))).getObject())));
 };
 BA.debugLineNum = 167;BA.debugLine="pnl.AddView(ImgV,sv.Width - (sv.Width/7),12dip,sv";
Debug.ShouldStop(64);
_pnl.runVoidMethod ("AddView",(Object)((_imgv.getObject())),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"getWidth"),(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(7)}, "/",0, 0))}, "-",1, 0))),(Object)(customlistview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 12)))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(7)}, "/",0, 0))),(Object)(customlistview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))));
 BA.debugLineNum = 169;BA.debugLine="Dim LineLbl As Label";
Debug.ShouldStop(256);
_linelbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("LineLbl", _linelbl);
 BA.debugLineNum = 170;BA.debugLine="LineLbl.Initialize(\"\")";
Debug.ShouldStop(512);
_linelbl.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 171;BA.debugLine="LineLbl.Color=Colors.LightGray";
Debug.ShouldStop(1024);
_linelbl.runVoidMethod ("setColor",customlistview.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 172;BA.debugLine="pnl.AddView(LineLbl, sv.Width - (sv.Width/7)+7dip";
Debug.ShouldStop(2048);
_pnl.runVoidMethod ("AddView",(Object)((_linelbl.getObject())),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"getWidth"),(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(7)}, "/",0, 0)),customlistview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 7)))}, "-+",2, 0))),(Object)(customlistview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 14)))),(Object)(customlistview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))),(Object)(customlistview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))));
 BA.debugLineNum = 174;BA.debugLine="Dim cdBubble As ColorDrawable";
Debug.ShouldStop(8192);
_cdbubble = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("cdBubble", _cdbubble);
 BA.debugLineNum = 175;BA.debugLine="cdBubble.Initialize2(SaeloZahra.FindAlertColor(Th";
Debug.ShouldStop(16384);
_cdbubble.runVoidMethod ("Initialize2",(Object)(customlistview._saelozahra.runMethod(true,"_findalertcolor" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_thistype))),(Object)(customlistview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 14)))),(Object)(customlistview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(customlistview._saelozahra._color /*RemoteObject*/ ));
 BA.debugLineNum = 177;BA.debugLine="Dim bubbleLbl As Label";
Debug.ShouldStop(65536);
_bubblelbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("bubbleLbl", _bubblelbl);
 BA.debugLineNum = 178;BA.debugLine="bubbleLbl.Initialize(\"\")";
Debug.ShouldStop(131072);
_bubblelbl.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 179;BA.debugLine="bubbleLbl.Background=cdBubble";
Debug.ShouldStop(262144);
_bubblelbl.runMethod(false,"setBackground",(_cdbubble.getObject()));
 BA.debugLineNum = 180;BA.debugLine="pnl.AddView(bubbleLbl, sv.Width - (sv.Width/7), 1";
Debug.ShouldStop(524288);
_pnl.runVoidMethod ("AddView",(Object)((_bubblelbl.getObject())),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"getWidth"),(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(7)}, "/",0, 0))}, "-",1, 0))),(Object)(customlistview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 12)))),(Object)(customlistview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 14)))),(Object)(customlistview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 14)))));
 BA.debugLineNum = 184;BA.debugLine="Dim minHeight As Int";
Debug.ShouldStop(8388608);
_minheight = RemoteObject.createImmutable(0);Debug.locals.put("minHeight", _minheight);
 BA.debugLineNum = 185;BA.debugLine="minHeight = su.MeasureMultilineTextHeight(lbl, Te";
Debug.ShouldStop(16777216);
_minheight = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_su" /*RemoteObject*/ ).runMethod(true,"MeasureMultilineTextHeight",(Object)((_lbl.getObject())),(Object)(BA.ObjectToCharSequence(_text))),customlistview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 14)))}, "+",1, 1);Debug.locals.put("minHeight", _minheight);
 BA.debugLineNum = 186;BA.debugLine="lbl.Height  = Max(50dip, minHeight)";
Debug.ShouldStop(33554432);
_lbl.runMethod(true,"setHeight",BA.numberCast(int.class, customlistview.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, customlistview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))))),(Object)(BA.numberCast(double.class, _minheight)))));
 BA.debugLineNum = 187;BA.debugLine="ImgV.Height = Max(50dip, minHeight)";
Debug.ShouldStop(67108864);
_imgv.runMethod(true,"setHeight",BA.numberCast(int.class, customlistview.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, customlistview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))))),(Object)(BA.numberCast(double.class, _minheight)))));
 BA.debugLineNum = 188;BA.debugLine="LineLbl.Height = Max(50dip, minHeight)";
Debug.ShouldStop(134217728);
_linelbl.runMethod(true,"setHeight",BA.numberCast(int.class, customlistview.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, customlistview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))))),(Object)(BA.numberCast(double.class, _minheight)))));
 BA.debugLineNum = 191;BA.debugLine="InsertAt(Index, pnl, lbl.Height + 2dip, Value)";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (ir.saelozahra.damaara.mazraeyeman.customlistview.class, "_insertat" /*RemoteObject*/ ,(Object)(_index),(Object)(_pnl),(Object)(RemoteObject.solve(new RemoteObject[] {_lbl.runMethod(true,"getHeight"),customlistview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "+",1, 1)),(Object)(_value));
 BA.debugLineNum = 193;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _insertattextitem(RemoteObject __ref,RemoteObject _index,RemoteObject _text,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("InsertAtTextItem (customlistview) ","customlistview",13,__ref.getField(false, "ba"),__ref,101);
if (RapidSub.canDelegate("insertattextitem")) { return __ref.runUserSub(false, "customlistview","insertattextitem", __ref, _index, _text, _value);}
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _minheight = RemoteObject.createImmutable(0);
Debug.locals.put("Index", _index);
Debug.locals.put("Text", _text);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 101;BA.debugLine="Public Sub InsertAtTextItem(Index As Int, Text As";
Debug.ShouldStop(16);
 BA.debugLineNum = 102;BA.debugLine="Dim pnl As Panel";
Debug.ShouldStop(32);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 103;BA.debugLine="pnl.Initialize(\"\")";
Debug.ShouldStop(64);
_pnl.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 104;BA.debugLine="Dim lbl As Label";
Debug.ShouldStop(128);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 105;BA.debugLine="lbl.Initialize(\"\")";
Debug.ShouldStop(256);
_lbl.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 106;BA.debugLine="pnl.AddView(lbl, 5dip, 2dip, sv.Width - 5dip, 20d";
Debug.ShouldStop(512);
_pnl.runVoidMethod ("AddView",(Object)((_lbl.getObject())),(Object)(customlistview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(customlistview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"getWidth"),customlistview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "-",1, 1)),(Object)(customlistview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))));
 BA.debugLineNum = 107;BA.debugLine="lbl.Text = Text";
Debug.ShouldStop(1024);
_lbl.runMethod(true,"setText",BA.ObjectToCharSequence(_text));
 BA.debugLineNum = 108;BA.debugLine="lbl.Gravity = Bit.Or(Gravity.CENTER_HORIZONTAL,Gr";
Debug.ShouldStop(2048);
_lbl.runMethod(true,"setGravity",customlistview.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(customlistview.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL")),(Object)(customlistview.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL"))));
 BA.debugLineNum = 109;BA.debugLine="lbl.TextSize = DefaultTextSize";
Debug.ShouldStop(4096);
_lbl.runMethod(true,"setTextSize",BA.numberCast(float.class, __ref.getField(true,"_defaulttextsize" /*RemoteObject*/ )));
 BA.debugLineNum = 110;BA.debugLine="lbl.TextColor = DefaultTextColor";
Debug.ShouldStop(8192);
_lbl.runMethod(true,"setTextColor",__ref.getField(true,"_defaulttextcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 111;BA.debugLine="lbl.Typeface = SaeloZahra.font";
Debug.ShouldStop(16384);
_lbl.runMethod(false,"setTypeface",(customlistview._saelozahra._font /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 112;BA.debugLine="pnl.Color = DefaultTextBackgroundColor";
Debug.ShouldStop(32768);
_pnl.runVoidMethod ("setColor",__ref.getField(true,"_defaulttextbackgroundcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 113;BA.debugLine="Dim minHeight As Int";
Debug.ShouldStop(65536);
_minheight = RemoteObject.createImmutable(0);Debug.locals.put("minHeight", _minheight);
 BA.debugLineNum = 114;BA.debugLine="minHeight = su.MeasureMultilineTextHeight(lbl, Te";
Debug.ShouldStop(131072);
_minheight = __ref.getField(false,"_su" /*RemoteObject*/ ).runMethod(true,"MeasureMultilineTextHeight",(Object)((_lbl.getObject())),(Object)(BA.ObjectToCharSequence(_text)));Debug.locals.put("minHeight", _minheight);
 BA.debugLineNum = 115;BA.debugLine="lbl.Height = Max(50dip, minHeight)";
Debug.ShouldStop(262144);
_lbl.runMethod(true,"setHeight",BA.numberCast(int.class, customlistview.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, customlistview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))))),(Object)(BA.numberCast(double.class, _minheight)))));
 BA.debugLineNum = 116;BA.debugLine="InsertAt(Index, pnl, lbl.Height + 2dip, Value)";
Debug.ShouldStop(524288);
__ref.runClassMethod (ir.saelozahra.damaara.mazraeyeman.customlistview.class, "_insertat" /*RemoteObject*/ ,(Object)(_index),(Object)(_pnl),(Object)(RemoteObject.solve(new RemoteObject[] {_lbl.runMethod(true,"getHeight"),customlistview.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "+",1, 1)),(Object)(_value));
 BA.debugLineNum = 117;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _jumptoitem(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("JumpToItem (customlistview) ","customlistview",13,__ref.getField(false, "ba"),__ref,256);
if (RapidSub.canDelegate("jumptoitem")) { __ref.runUserSub(false, "customlistview","jumptoitem", __ref, _index); return;}
ResumableSub_JumpToItem rsub = new ResumableSub_JumpToItem(null,__ref,_index);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_JumpToItem extends BA.ResumableSub {
public ResumableSub_JumpToItem(ir.saelozahra.damaara.mazraeyeman.customlistview parent,RemoteObject __ref,RemoteObject _index) {
this.parent = parent;
this.__ref = __ref;
this._index = _index;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
ir.saelozahra.damaara.mazraeyeman.customlistview parent;
RemoteObject _index;
RemoteObject _top = RemoteObject.createImmutable(0);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
int _i = 0;
int step3;
int limit3;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("JumpToItem (customlistview) ","customlistview",13,__ref.getField(false, "ba"),__ref,256);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Index", _index);
 BA.debugLineNum = 257;BA.debugLine="Dim top As Int";
Debug.ShouldStop(1);
_top = RemoteObject.createImmutable(0);Debug.locals.put("top", _top);
 BA.debugLineNum = 258;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(2);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 259;BA.debugLine="For i = 0 To Min(Index - 1, items.Size - 1)";
Debug.ShouldStop(4);
if (true) break;

case 1:
//for
this.state = 4;
step3 = 1;
limit3 = (int) (0 + parent.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_index,RemoteObject.createImmutable(1)}, "-",1, 1))),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1)))).<Double>get().doubleValue());
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 5;
if (true) break;

case 5:
//C
this.state = 4;
if ((step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3)) this.state = 3;
if (true) break;

case 6:
//C
this.state = 5;
_i = ((int)(0 + _i + step3)) ;
Debug.locals.put("i", _i);
if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 260;BA.debugLine="p = panels.Get(i)";
Debug.ShouldStop(8);
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), __ref.getField(false,"_panels" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("p", _p);
 BA.debugLineNum = 261;BA.debugLine="top = top + p.Height + dividerHeight";
Debug.ShouldStop(16);
_top = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_top,_p.runMethod(true,"getHeight"),__ref.getField(true,"_dividerheight" /*RemoteObject*/ )}, "++",2, 0));Debug.locals.put("top", _top);
 if (true) break;
if (true) break;

case 4:
//C
this.state = -1;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 263;BA.debugLine="sv.ScrollPosition = top";
Debug.ShouldStop(64);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"setScrollPosition",_top);
 BA.debugLineNum = 266;BA.debugLine="Sleep(0)";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "customlistview", "jumptoitem"),BA.numberCast(int.class, 0));
this.state = 7;
return;
case 7:
//C
this.state = -1;
;
 BA.debugLineNum = 267;BA.debugLine="sv.ScrollPosition = top";
Debug.ShouldStop(1024);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"setScrollPosition",_top);
 BA.debugLineNum = 268;BA.debugLine="Sleep(0)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "customlistview", "jumptoitem"),BA.numberCast(int.class, 0));
this.state = 8;
return;
case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 270;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
public static RemoteObject  _panel_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Panel_Click (customlistview) ","customlistview",13,__ref.getField(false, "ba"),__ref,272);
if (RapidSub.canDelegate("panel_click")) { return __ref.runUserSub(false, "customlistview","panel_click", __ref);}
RemoteObject _v = RemoteObject.declareNull("anywheresoftware.b4a.objects.ConcreteViewWrapper");
 BA.debugLineNum = 272;BA.debugLine="Private Sub Panel_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 273;BA.debugLine="If SubExists(CallBack, EventName & \"_ItemClick\")";
Debug.ShouldStop(65536);
if (customlistview.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_eventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_ItemClick")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 274;BA.debugLine="Dim v As View";
Debug.ShouldStop(131072);
_v = RemoteObject.createNew ("anywheresoftware.b4a.objects.ConcreteViewWrapper");Debug.locals.put("v", _v);
 BA.debugLineNum = 275;BA.debugLine="v = Sender";
Debug.ShouldStop(262144);
_v = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), customlistview.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("v", _v);
 BA.debugLineNum = 276;BA.debugLine="CallSub3(CallBack, EventName & \"_ItemClick\", v.T";
Debug.ShouldStop(524288);
customlistview.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_eventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_ItemClick"))),(Object)(_v.runMethod(false,"getTag")),(Object)(__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _v.runMethod(false,"getTag"))))));
 };
 BA.debugLineNum = 278;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _removeat(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("RemoveAt (customlistview) ","customlistview",13,__ref.getField(false, "ba"),__ref,81);
if (RapidSub.canDelegate("removeat")) { return __ref.runUserSub(false, "customlistview","removeat", __ref, _index);}
RemoteObject _removepanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
int _i = 0;
Debug.locals.put("Index", _index);
 BA.debugLineNum = 81;BA.debugLine="Public Sub RemoveAt(Index As Int)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 82;BA.debugLine="Dim removePanel, p As Panel";
Debug.ShouldStop(131072);
_removepanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("removePanel", _removepanel);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 83;BA.debugLine="removePanel = panels.Get(Index)";
Debug.ShouldStop(262144);
_removepanel = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), __ref.getField(false,"_panels" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_index)));Debug.locals.put("removePanel", _removepanel);
 BA.debugLineNum = 84;BA.debugLine="For i = Index + 1 To items.Size - 1";
Debug.ShouldStop(524288);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = RemoteObject.solve(new RemoteObject[] {_index,RemoteObject.createImmutable(1)}, "+",1, 1).<Integer>get().intValue() ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 85;BA.debugLine="p = panels.Get(i)";
Debug.ShouldStop(1048576);
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), __ref.getField(false,"_panels" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("p", _p);
 BA.debugLineNum = 86;BA.debugLine="p.Tag = i - 1";
Debug.ShouldStop(2097152);
_p.runMethod(false,"setTag",(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1)));
 BA.debugLineNum = 87;BA.debugLine="p.Top = p.Top - removePanel.Height - dividerHeig";
Debug.ShouldStop(4194304);
_p.runMethod(true,"setTop",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_p.runMethod(true,"getTop"),_removepanel.runMethod(true,"getHeight"),__ref.getField(true,"_dividerheight" /*RemoteObject*/ )}, "--",2, 0)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 89;BA.debugLine="sv.Panel.Height = sv.Panel.Height - removePanel.H";
Debug.ShouldStop(16777216);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethod(true,"setHeight",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethod(true,"getHeight"),_removepanel.runMethod(true,"getHeight"),__ref.getField(true,"_dividerheight" /*RemoteObject*/ )}, "--",2, 0)));
 BA.debugLineNum = 90;BA.debugLine="items.RemoveAt(Index)";
Debug.ShouldStop(33554432);
__ref.getField(false,"_items" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(_index));
 BA.debugLineNum = 91;BA.debugLine="panels.RemoveAt(Index)";
Debug.ShouldStop(67108864);
__ref.getField(false,"_panels" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(_index));
 BA.debugLineNum = 92;BA.debugLine="removePanel.RemoveView";
Debug.ShouldStop(134217728);
_removepanel.runVoidMethod ("RemoveView");
 BA.debugLineNum = 93;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _scroll(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("scroll (customlistview) ","customlistview",13,__ref.getField(false, "ba"),__ref,57);
if (RapidSub.canDelegate("scroll")) { return __ref.runUserSub(false, "customlistview","scroll", __ref);}
 BA.debugLineNum = 57;BA.debugLine="Public Sub scroll As ScrollView";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 58;BA.debugLine="Return sv";
Debug.ShouldStop(33554432);
if (true) return __ref.getField(false,"_sv" /*RemoteObject*/ );
 BA.debugLineNum = 59;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _t1_tick(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("t1_Tick (customlistview) ","customlistview",13,__ref.getField(false, "ba"),__ref,324);
if (RapidSub.canDelegate("t1_tick")) { return __ref.runUserSub(false, "customlistview","t1_tick", __ref);}
 BA.debugLineNum = 324;BA.debugLine="Sub t1_Tick";
Debug.ShouldStop(8);
 BA.debugLineNum = 325;BA.debugLine="timeOut=timeOut+1";
Debug.ShouldStop(16);
__ref.setField ("_timeout" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_timeout" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 326;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}