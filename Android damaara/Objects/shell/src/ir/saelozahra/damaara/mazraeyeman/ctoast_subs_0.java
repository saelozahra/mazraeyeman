package ir.saelozahra.damaara.mazraeyeman;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class ctoast_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Private Sub Class_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private TMS2 As Reflector";
ctoast._tms2 = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");__ref.setField("_tms2",ctoast._tms2);
 //BA.debugLineNum = 10;BA.debugLine="Private TMS2pan As Panel";
ctoast._tms2pan = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_tms2pan",ctoast._tms2pan);
 //BA.debugLineNum = 11;BA.debugLine="Private TMS2lab As Label";
ctoast._tms2lab = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_tms2lab",ctoast._tms2lab);
 //BA.debugLineNum = 12;BA.debugLine="Private TMS2text As Label";
ctoast._tms2text = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_tms2text",ctoast._tms2text);
 //BA.debugLineNum = 13;BA.debugLine="Private TTime As Timer";
ctoast._ttime = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");__ref.setField("_ttime",ctoast._ttime);
 //BA.debugLineNum = 14;BA.debugLine="Private ActH As Int";
ctoast._acth = RemoteObject.createImmutable(0);__ref.setField("_acth",ctoast._acth);
 //BA.debugLineNum = 15;BA.debugLine="Private ActW As Int";
ctoast._actw = RemoteObject.createImmutable(0);__ref.setField("_actw",ctoast._actw);
 //BA.debugLineNum = 17;BA.debugLine="Private MyModule As Object";
ctoast._mymodule = RemoteObject.createNew ("Object");__ref.setField("_mymodule",ctoast._mymodule);
 //BA.debugLineNum = 18;BA.debugLine="Private Tac As Boolean";
ctoast._tac = RemoteObject.createImmutable(false);__ref.setField("_tac",ctoast._tac);
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _activity,RemoteObject _module,RemoteObject _act_h,RemoteObject _act_w) throws Exception{
try {
		Debug.PushSubsStack("Initialize (ctoast) ","ctoast",12,__ref.getField(false, "ba"),__ref,25);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "ctoast","initialize", __ref, _ba, _activity, _module, _act_h, _act_w);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Activity", _activity);
Debug.locals.put("Module", _module);
Debug.locals.put("Act_H", _act_h);
Debug.locals.put("Act_W", _act_w);
 BA.debugLineNum = 25;BA.debugLine="Sub Initialize(Activity As Activity, Module As Obj";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 26;BA.debugLine="Tac = True";
Debug.ShouldStop(33554432);
__ref.setField ("_tac" /*RemoteObject*/ ,ctoast.__c.getField(true,"True"));
 BA.debugLineNum = 27;BA.debugLine="ActH = Act_H";
Debug.ShouldStop(67108864);
__ref.setField ("_acth" /*RemoteObject*/ ,_act_h);
 BA.debugLineNum = 28;BA.debugLine="ActW = Act_W";
Debug.ShouldStop(134217728);
__ref.setField ("_actw" /*RemoteObject*/ ,_act_w);
 BA.debugLineNum = 29;BA.debugLine="MyModule = Module";
Debug.ShouldStop(268435456);
__ref.setField ("_mymodule" /*RemoteObject*/ ,_module);
 BA.debugLineNum = 30;BA.debugLine="TMS2lab.Initialize(\"TMS2lab\")";
Debug.ShouldStop(536870912);
__ref.getField(false,"_tms2lab" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("TMS2lab")));
 BA.debugLineNum = 31;BA.debugLine="TMS2pan.Initialize(\"TMS2pan\")";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_tms2pan" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("TMS2pan")));
 BA.debugLineNum = 32;BA.debugLine="Activity.AddView(TMS2pan, 100dip, 50dip, 200dip,";
Debug.ShouldStop(-2147483648);
_activity.runVoidMethod ("AddView",(Object)((__ref.getField(false,"_tms2pan" /*RemoteObject*/ ).getObject())),(Object)(ctoast.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))),(Object)(ctoast.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))),(Object)(ctoast.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 200)))),(Object)(ctoast.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))));
 BA.debugLineNum = 33;BA.debugLine="TMS2pan.AddView(TMS2lab, 100, 50, 200, 40)";
Debug.ShouldStop(1);
__ref.getField(false,"_tms2pan" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_tms2lab" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 100)),(Object)(BA.numberCast(int.class, 50)),(Object)(BA.numberCast(int.class, 200)),(Object)(BA.numberCast(int.class, 40)));
 BA.debugLineNum = 34;BA.debugLine="TMS2pan.Visible = False";
Debug.ShouldStop(2);
__ref.getField(false,"_tms2pan" /*RemoteObject*/ ).runMethod(true,"setVisible",ctoast.__c.getField(true,"False"));
 BA.debugLineNum = 35;BA.debugLine="TMS2text.Initialize(\"TMS2text\")";
Debug.ShouldStop(4);
__ref.getField(false,"_tms2text" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("TMS2text")));
 BA.debugLineNum = 36;BA.debugLine="Activity.AddView(TMS2text,0,0,100dip,60dip)";
Debug.ShouldStop(8);
_activity.runVoidMethod ("AddView",(Object)((__ref.getField(false,"_tms2text" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(ctoast.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))),(Object)(ctoast.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60)))));
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settoast(RemoteObject __ref,RemoteObject _tset) throws Exception{
try {
		Debug.PushSubsStack("SetToast (ctoast) ","ctoast",12,__ref.getField(false, "ba"),__ref,106);
if (RapidSub.canDelegate("settoast")) { return __ref.runUserSub(false, "ctoast","settoast", __ref, _tset);}
Debug.locals.put("Tset", _tset);
 BA.debugLineNum = 106;BA.debugLine="Private Sub SetToast(Tset As Int)";
Debug.ShouldStop(512);
 BA.debugLineNum = 107;BA.debugLine="TTime.Enabled = False";
Debug.ShouldStop(1024);
__ref.getField(false,"_ttime" /*RemoteObject*/ ).runMethod(true,"setEnabled",ctoast.__c.getField(true,"False"));
 BA.debugLineNum = 108;BA.debugLine="TTime.Initialize(\"TTime\", (Tset * 1000))";
Debug.ShouldStop(2048);
__ref.getField(false,"_ttime" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("TTime")),(Object)(BA.numberCast(long.class, (RemoteObject.solve(new RemoteObject[] {_tset,RemoteObject.createImmutable(1000)}, "*",0, 1)))));
 BA.debugLineNum = 109;BA.debugLine="TTime.Enabled = True";
Debug.ShouldStop(4096);
__ref.getField(false,"_ttime" /*RemoteObject*/ ).runMethod(true,"setEnabled",ctoast.__c.getField(true,"True"));
 BA.debugLineNum = 110;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tms2lab_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("TMS2lab_Click (ctoast) ","ctoast",12,__ref.getField(false, "ba"),__ref,115);
if (RapidSub.canDelegate("tms2lab_click")) { return __ref.runUserSub(false, "ctoast","tms2lab_click", __ref);}
 BA.debugLineNum = 115;BA.debugLine="Private Sub TMS2lab_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 116;BA.debugLine="If Tac = False Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_tac" /*RemoteObject*/ ),ctoast.__c.getField(true,"False"))) { 
 BA.debugLineNum = 117;BA.debugLine="Tac = True : TTime_Tick";
Debug.ShouldStop(1048576);
__ref.setField ("_tac" /*RemoteObject*/ ,ctoast.__c.getField(true,"True"));
 BA.debugLineNum = 117;BA.debugLine="Tac = True : TTime_Tick";
Debug.ShouldStop(1048576);
__ref.runClassMethod (ir.saelozahra.damaara.mazraeyeman.ctoast.class, "_ttime_tick" /*RemoteObject*/ );
 };
 BA.debugLineNum = 119;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _toastmessageshow2(RemoteObject __ref,RemoteObject _tmessage,RemoteObject _tseconds,RemoteObject _tpercentdownvertical,RemoteObject _tpercentacrosshorizontal,RemoteObject _timage,RemoteObject _tcolor,RemoteObject _tbackcolor,RemoteObject _ttextsize,RemoteObject _tautoclose) throws Exception{
try {
		Debug.PushSubsStack("ToastMessageShow2 (ctoast) ","ctoast",12,__ref.getField(false, "ba"),__ref,47);
if (RapidSub.canDelegate("toastmessageshow2")) { __ref.runUserSub(false, "ctoast","toastmessageshow2", __ref, _tmessage, _tseconds, _tpercentdownvertical, _tpercentacrosshorizontal, _timage, _tcolor, _tbackcolor, _ttextsize, _tautoclose); return;}
ResumableSub_ToastMessageShow2 rsub = new ResumableSub_ToastMessageShow2(null,__ref,_tmessage,_tseconds,_tpercentdownvertical,_tpercentacrosshorizontal,_timage,_tcolor,_tbackcolor,_ttextsize,_tautoclose);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ToastMessageShow2 extends BA.ResumableSub {
public ResumableSub_ToastMessageShow2(ir.saelozahra.damaara.mazraeyeman.ctoast parent,RemoteObject __ref,RemoteObject _tmessage,RemoteObject _tseconds,RemoteObject _tpercentdownvertical,RemoteObject _tpercentacrosshorizontal,RemoteObject _timage,RemoteObject _tcolor,RemoteObject _tbackcolor,RemoteObject _ttextsize,RemoteObject _tautoclose) {
this.parent = parent;
this.__ref = __ref;
this._tmessage = _tmessage;
this._tseconds = _tseconds;
this._tpercentdownvertical = _tpercentdownvertical;
this._tpercentacrosshorizontal = _tpercentacrosshorizontal;
this._timage = _timage;
this._tcolor = _tcolor;
this._tbackcolor = _tbackcolor;
this._ttextsize = _ttextsize;
this._tautoclose = _tautoclose;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
ir.saelozahra.damaara.mazraeyeman.ctoast parent;
RemoteObject _tmessage;
RemoteObject _tseconds;
RemoteObject _tpercentdownvertical;
RemoteObject _tpercentacrosshorizontal;
RemoteObject _timage;
RemoteObject _tcolor;
RemoteObject _tbackcolor;
RemoteObject _ttextsize;
RemoteObject _tautoclose;
RemoteObject _height = RemoteObject.createImmutable(0);
RemoteObject _width = RemoteObject.createImmutable(0);
RemoteObject _cd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ToastMessageShow2 (ctoast) ","ctoast",12,__ref.getField(false, "ba"),__ref,47);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Tmessage", _tmessage);
Debug.locals.put("Tseconds", _tseconds);
Debug.locals.put("TpercentDownVertical", _tpercentdownvertical);
Debug.locals.put("TpercentAcrossHorizontal", _tpercentacrosshorizontal);
Debug.locals.put("Timage", _timage);
Debug.locals.put("Tcolor", _tcolor);
Debug.locals.put("Tbackcolor", _tbackcolor);
Debug.locals.put("Ttextsize", _ttextsize);
Debug.locals.put("Tautoclose", _tautoclose);
 BA.debugLineNum = 48;BA.debugLine="TMS2text.Visible = True";
Debug.ShouldStop(32768);
__ref.getField(false,"_tms2text" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"True"));
 BA.debugLineNum = 49;BA.debugLine="TMS2text.TextColor = Colors.Transparent";
Debug.ShouldStop(65536);
__ref.getField(false,"_tms2text" /*RemoteObject*/ ).runMethod(true,"setTextColor",parent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 51;BA.debugLine="Dim Height, Width As Int";
Debug.ShouldStop(262144);
_height = RemoteObject.createImmutable(0);Debug.locals.put("Height", _height);
_width = RemoteObject.createImmutable(0);Debug.locals.put("Width", _width);
 BA.debugLineNum = 52;BA.debugLine="TMS2text.Text = Tmessage";
Debug.ShouldStop(524288);
__ref.getField(false,"_tms2text" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_tmessage));
 BA.debugLineNum = 53;BA.debugLine="TMS2text.TextSize = Ttextsize";
Debug.ShouldStop(1048576);
__ref.getField(false,"_tms2text" /*RemoteObject*/ ).runMethod(true,"setTextSize",BA.numberCast(float.class, _ttextsize));
 BA.debugLineNum = 54;BA.debugLine="TMS2text.Width = -2";
Debug.ShouldStop(2097152);
__ref.getField(false,"_tms2text" /*RemoteObject*/ ).runMethod(true,"setWidth",BA.numberCast(int.class, -(double) (0 + 2)));
 BA.debugLineNum = 55;BA.debugLine="TMS2text.Height = -2";
Debug.ShouldStop(4194304);
__ref.getField(false,"_tms2text" /*RemoteObject*/ ).runMethod(true,"setHeight",BA.numberCast(int.class, -(double) (0 + 2)));
 BA.debugLineNum = 56;BA.debugLine="Sleep(0)";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctoast", "toastmessageshow2"),BA.numberCast(int.class, 0));
this.state = 30;
return;
case 30:
//C
this.state = 1;
;
 BA.debugLineNum = 57;BA.debugLine="TMS2.Target = TMS2text";
Debug.ShouldStop(16777216);
__ref.getField(false,"_tms2" /*RemoteObject*/ ).setField ("Target",(__ref.getField(false,"_tms2text" /*RemoteObject*/ ).getObject()));
 BA.debugLineNum = 58;BA.debugLine="Width = TMS2.RunMethod(\"getWidth\")";
Debug.ShouldStop(33554432);
_width = BA.numberCast(int.class, __ref.getField(false,"_tms2" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getWidth"))));Debug.locals.put("Width", _width);
 BA.debugLineNum = 59;BA.debugLine="Height = TMS2.RunMethod(\"getHeight\")";
Debug.ShouldStop(67108864);
_height = BA.numberCast(int.class, __ref.getField(false,"_tms2" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getHeight"))));Debug.locals.put("Height", _height);
 BA.debugLineNum = 60;BA.debugLine="TMS2text.Visible = False";
Debug.ShouldStop(134217728);
__ref.getField(false,"_tms2text" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"False"));
 BA.debugLineNum = 61;BA.debugLine="TMS2lab.TextColor = Colors.DarkGray";
Debug.ShouldStop(268435456);
__ref.getField(false,"_tms2lab" /*RemoteObject*/ ).runMethod(true,"setTextColor",parent.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 62;BA.debugLine="TMS2lab.TextSize = Ttextsize";
Debug.ShouldStop(536870912);
__ref.getField(false,"_tms2lab" /*RemoteObject*/ ).runMethod(true,"setTextSize",BA.numberCast(float.class, _ttextsize));
 BA.debugLineNum = 63;BA.debugLine="TMS2lab.Gravity = Gravity.CENTER";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_tms2lab" /*RemoteObject*/ ).runMethod(true,"setGravity",parent.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 64;BA.debugLine="Dim cd As ColorDrawable";
Debug.ShouldStop(-2147483648);
_cd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("cd", _cd);
 BA.debugLineNum = 65;BA.debugLine="cd.Initialize(Tbackcolor,10dip)";
Debug.ShouldStop(1);
_cd.runVoidMethod ("Initialize",(Object)(BA.numberCast(int.class, _tbackcolor)),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))));
 BA.debugLineNum = 66;BA.debugLine="TMS2pan.Background = cd";
Debug.ShouldStop(2);
__ref.getField(false,"_tms2pan" /*RemoteObject*/ ).runMethod(false,"setBackground",(_cd.getObject()));
 BA.debugLineNum = 67;BA.debugLine="If Timage <> \"\" Then";
Debug.ShouldStop(4);
if (true) break;

case 1:
//if
this.state = 8;
if (RemoteObject.solveBoolean("!",_timage,BA.ObjectToString(""))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 68;BA.debugLine="If File.Exists(File.DirAssets, Timage) Then";
Debug.ShouldStop(8);
if (true) break;

case 4:
//if
this.state = 7;
if (parent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(_timage)).<Boolean>get().booleanValue()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 69;BA.debugLine="TMS2pan.SetBackgroundImage(LoadBitmap(File.DirA";
Debug.ShouldStop(16);
__ref.getField(false,"_tms2pan" /*RemoteObject*/ ).runVoidMethod ("SetBackgroundImageNew",(Object)((parent.__c.runMethod(false,"LoadBitmap",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(_timage)).getObject())));
 if (true) break;

case 7:
//C
this.state = 8;
;
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 72;BA.debugLine="TMS2lab.Text = Tmessage";
Debug.ShouldStop(128);
__ref.getField(false,"_tms2lab" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_tmessage));
 BA.debugLineNum = 73;BA.debugLine="TMS2pan.BringToFront";
Debug.ShouldStop(256);
__ref.getField(false,"_tms2pan" /*RemoteObject*/ ).runVoidMethod ("BringToFront");
 BA.debugLineNum = 75;BA.debugLine="If TpercentDownVertical > 0 And TpercentDownVerti";
Debug.ShouldStop(1024);
if (true) break;

case 9:
//if
this.state = 14;
if (RemoteObject.solveBoolean(">",_tpercentdownvertical,BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("<",_tpercentdownvertical,BA.numberCast(double.class, 91))) { 
this.state = 11;
}else {
this.state = 13;
}if (true) break;

case 11:
//C
this.state = 14;
 BA.debugLineNum = 76;BA.debugLine="TMS2pan.Top = (ActH * (TpercentDownVertical/100)";
Debug.ShouldStop(2048);
__ref.getField(false,"_tms2pan" /*RemoteObject*/ ).runMethod(true,"setTop",BA.numberCast(int.class, (RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_acth" /*RemoteObject*/ ),(RemoteObject.solve(new RemoteObject[] {_tpercentdownvertical,RemoteObject.createImmutable(100)}, "/",0, 0))}, "*",0, 0))));
 if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 78;BA.debugLine="TMS2pan.Top = (ActH * .10)";
Debug.ShouldStop(8192);
__ref.getField(false,"_tms2pan" /*RemoteObject*/ ).runMethod(true,"setTop",BA.numberCast(int.class, (RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_acth" /*RemoteObject*/ ),RemoteObject.createImmutable(.10)}, "*",0, 0))));
 if (true) break;
;
 BA.debugLineNum = 80;BA.debugLine="If TpercentAcrossHorizontal > 0 And TpercentAcros";
Debug.ShouldStop(32768);

case 14:
//if
this.state = 19;
if (RemoteObject.solveBoolean(">",_tpercentacrosshorizontal,BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("<",_tpercentacrosshorizontal,BA.numberCast(double.class, 91))) { 
this.state = 16;
}else {
this.state = 18;
}if (true) break;

case 16:
//C
this.state = 19;
 BA.debugLineNum = 81;BA.debugLine="TMS2pan.Left = (ActW * (TpercentAcrossHorizontal";
Debug.ShouldStop(65536);
__ref.getField(false,"_tms2pan" /*RemoteObject*/ ).runMethod(true,"setLeft",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_actw" /*RemoteObject*/ ),(RemoteObject.solve(new RemoteObject[] {_tpercentacrosshorizontal,RemoteObject.createImmutable(100)}, "/",0, 0))}, "*",0, 0)),(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_width,RemoteObject.createImmutable(60)}, "+",1, 1)),RemoteObject.createImmutable(2)}, "/",0, 0))}, "-",1, 0)));
 if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 83;BA.debugLine="TMS2pan.Left = (ActW/2) - ((Width+60)/2)";
Debug.ShouldStop(262144);
__ref.getField(false,"_tms2pan" /*RemoteObject*/ ).runMethod(true,"setLeft",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_actw" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/",0, 0)),(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_width,RemoteObject.createImmutable(60)}, "+",1, 1)),RemoteObject.createImmutable(2)}, "/",0, 0))}, "-",1, 0)));
 if (true) break;

case 19:
//C
this.state = 20;
;
 BA.debugLineNum = 85;BA.debugLine="TMS2lab.Left = 30";
Debug.ShouldStop(1048576);
__ref.getField(false,"_tms2lab" /*RemoteObject*/ ).runMethod(true,"setLeft",BA.numberCast(int.class, 30));
 BA.debugLineNum = 86;BA.debugLine="TMS2lab.Top = 5";
Debug.ShouldStop(2097152);
__ref.getField(false,"_tms2lab" /*RemoteObject*/ ).runMethod(true,"setTop",BA.numberCast(int.class, 5));
 BA.debugLineNum = 87;BA.debugLine="TMS2pan.Width = Width + 60";
Debug.ShouldStop(4194304);
__ref.getField(false,"_tms2pan" /*RemoteObject*/ ).runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_width,RemoteObject.createImmutable(60)}, "+",1, 1));
 BA.debugLineNum = 88;BA.debugLine="TMS2lab.Width = Width";
Debug.ShouldStop(8388608);
__ref.getField(false,"_tms2lab" /*RemoteObject*/ ).runMethod(true,"setWidth",_width);
 BA.debugLineNum = 89;BA.debugLine="TMS2pan.Height = Height + (TMS2text.TextSize / 2)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_tms2pan" /*RemoteObject*/ ).runMethod(true,"setHeight",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_height,(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_tms2text" /*RemoteObject*/ ).runMethod(true,"getTextSize"),RemoteObject.createImmutable(2)}, "/",0, 0))}, "+",1, 0)));
 BA.debugLineNum = 90;BA.debugLine="TMS2lab.Height = Height";
Debug.ShouldStop(33554432);
__ref.getField(false,"_tms2lab" /*RemoteObject*/ ).runMethod(true,"setHeight",_height);
 BA.debugLineNum = 91;BA.debugLine="Sleep(0)";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctoast", "toastmessageshow2"),BA.numberCast(int.class, 0));
this.state = 31;
return;
case 31:
//C
this.state = 20;
;
 BA.debugLineNum = 92;BA.debugLine="If Tcolor <> 0 Then";
Debug.ShouldStop(134217728);
if (true) break;

case 20:
//if
this.state = 23;
if (RemoteObject.solveBoolean("!",_tcolor,BA.numberCast(long.class, 0))) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 93;BA.debugLine="TMS2lab.TextColor = Tcolor";
Debug.ShouldStop(268435456);
__ref.getField(false,"_tms2lab" /*RemoteObject*/ ).runMethod(true,"setTextColor",BA.numberCast(int.class, _tcolor));
 if (true) break;

case 23:
//C
this.state = 24;
;
 BA.debugLineNum = 95;BA.debugLine="TMS2lab.Visible = True";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_tms2lab" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"True"));
 BA.debugLineNum = 96;BA.debugLine="TMS2pan.Visible = True";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_tms2pan" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"True"));
 BA.debugLineNum = 97;BA.debugLine="TMS2pan.SetVisibleAnimated(500,True)";
Debug.ShouldStop(1);
__ref.getField(false,"_tms2pan" /*RemoteObject*/ ).runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 99;BA.debugLine="Sleep(0)";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "ctoast", "toastmessageshow2"),BA.numberCast(int.class, 0));
this.state = 32;
return;
case 32:
//C
this.state = 24;
;
 BA.debugLineNum = 100;BA.debugLine="If Tautoclose = False Then";
Debug.ShouldStop(8);
if (true) break;

case 24:
//if
this.state = 29;
if (RemoteObject.solveBoolean("=",_tautoclose,parent.__c.getField(true,"False"))) { 
this.state = 26;
}else {
this.state = 28;
}if (true) break;

case 26:
//C
this.state = 29;
 BA.debugLineNum = 101;BA.debugLine="Tac = False";
Debug.ShouldStop(16);
__ref.setField ("_tac" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 if (true) break;

case 28:
//C
this.state = 29;
 BA.debugLineNum = 103;BA.debugLine="SetToast(Tseconds)";
Debug.ShouldStop(64);
__ref.runClassMethod (ir.saelozahra.damaara.mazraeyeman.ctoast.class, "_settoast" /*RemoteObject*/ ,(Object)(_tseconds));
 if (true) break;

case 29:
//C
this.state = -1;
;
 BA.debugLineNum = 105;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
public static RemoteObject  _ttime_tick(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("TTime_Tick (ctoast) ","ctoast",12,__ref.getField(false, "ba"),__ref,111);
if (RapidSub.canDelegate("ttime_tick")) { return __ref.runUserSub(false, "ctoast","ttime_tick", __ref);}
 BA.debugLineNum = 111;BA.debugLine="Private Sub TTime_Tick";
Debug.ShouldStop(16384);
 BA.debugLineNum = 112;BA.debugLine="TTime.Enabled = False";
Debug.ShouldStop(32768);
__ref.getField(false,"_ttime" /*RemoteObject*/ ).runMethod(true,"setEnabled",ctoast.__c.getField(true,"False"));
 BA.debugLineNum = 113;BA.debugLine="TMS2pan.SetVisibleAnimated(500,False)";
Debug.ShouldStop(65536);
__ref.getField(false,"_tms2pan" /*RemoteObject*/ ).runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(ctoast.__c.getField(true,"False")));
 BA.debugLineNum = 114;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}