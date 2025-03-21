package ir.saelozahra.damaara.mazraeyeman;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_click() throws Exception{
try {
		Debug.PushSubsStack("Activity_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,194);
if (RapidSub.canDelegate("activity_click")) { return ir.saelozahra.damaara.mazraeyeman.main.remoteMe.runUserSub(false, "main","activity_click");}
 BA.debugLineNum = 194;BA.debugLine="Sub Activity_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 195;BA.debugLine="go_btn_Click";
Debug.ShouldStop(4);
_go_btn_click();
 BA.debugLineNum = 196;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,64);
if (RapidSub.canDelegate("activity_create")) { ir.saelozahra.damaara.mazraeyeman.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime); return;}
ResumableSub_Activity_Create rsub = new ResumableSub_Activity_Create(null,_firsttime);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Activity_Create extends BA.ResumableSub {
public ResumableSub_Activity_Create(ir.saelozahra.damaara.mazraeyeman.main parent,RemoteObject _firsttime) {
this.parent = parent;
this._firsttime = _firsttime;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.saelozahra.damaara.mazraeyeman.main parent;
RemoteObject _firsttime;
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _hoverlbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,64);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 66;BA.debugLine="Activity.LoadLayout(\"intro_layout\")";
Debug.ShouldStop(2);
parent.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("intro_layout")),main.mostCurrent.activityBA);
 BA.debugLineNum = 68;BA.debugLine="DTTC.InItIaLiZe(\"مجددا دکمه خروج را بزنید\")";
Debug.ShouldStop(8);
parent.mostCurrent._dttc.runClassMethod (ir.saelozahra.damaara.mazraeyeman.doubletaptoclose.class, "_initialize" /*RemoteObject*/ ,main.processBA,(Object)(RemoteObject.createImmutable("مجددا دکمه خروج را بزنید")));
 BA.debugLineNum = 70;BA.debugLine="Log( \" ApproximateScreenSize: 	\" & GetDeviceLayou";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","4131078",RemoteObject.concat(RemoteObject.createImmutable(" ApproximateScreenSize: 	"),parent.mostCurrent.__c.runMethod(false,"GetDeviceLayoutValues",main.mostCurrent.activityBA).runMethod(true,"getApproximateScreenSize")),0);
 BA.debugLineNum = 71;BA.debugLine="Log( \" Width:				    \" & GetDeviceLayoutValues.Wi";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","4131079",RemoteObject.concat(RemoteObject.createImmutable(" Width:				    "),parent.mostCurrent.__c.runMethod(false,"GetDeviceLayoutValues",main.mostCurrent.activityBA).getField(true,"Width")),0);
 BA.debugLineNum = 72;BA.debugLine="Log( \" height:				    \" & GetDeviceLayoutValues.H";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","4131080",RemoteObject.concat(RemoteObject.createImmutable(" height:				    "),parent.mostCurrent.__c.runMethod(false,"GetDeviceLayoutValues",main.mostCurrent.activityBA).getField(true,"Height")),0);
 BA.debugLineNum = 74;BA.debugLine="SaeloZahra.MaterialActionBarHeight 	=	AC.GetMater";
Debug.ShouldStop(512);
parent.mostCurrent._saelozahra._materialactionbarheight /*RemoteObject*/  = parent.mostCurrent._ac.runMethod(true,"GetMaterialActionBarHeight",main.mostCurrent.activityBA);
 BA.debugLineNum = 75;BA.debugLine="SaeloZahra.GetStatusBarHeight 		=	AC.GetStatusBar";
Debug.ShouldStop(1024);
parent.mostCurrent._saelozahra._getstatusbarheight /*RemoteObject*/  = parent.mostCurrent._ac.runMethod(true,"GetStatusBarHeight",main.mostCurrent.activityBA);
 BA.debugLineNum = 80;BA.debugLine="If Not(SQL1.IsInitialized) Then";
Debug.ShouldStop(32768);
if (true) break;

case 1:
//if
this.state = 4;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent._sql1.runMethod(true,"IsInitialized"))).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 81;BA.debugLine="SQL1.Initialize(SaeloZahra.dir,\"db.db\",False)";
Debug.ShouldStop(65536);
parent._sql1.runVoidMethod ("Initialize",(Object)(parent.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(BA.ObjectToString("db.db")),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 87;BA.debugLine="StartService(accuWeatherCronJobService)";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("StartService",main.processBA,(Object)((parent.mostCurrent._accuweathercronjobservice.getObject())));
 BA.debugLineNum = 92;BA.debugLine="If FirstTime Then";
Debug.ShouldStop(134217728);
if (true) break;

case 5:
//if
this.state = 28;
if (_firsttime.<Boolean>get().booleanValue()) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 100;BA.debugLine="Try";
Debug.ShouldStop(8);
if (true) break;

case 8:
//try
this.state = 17;
this.catchState = 16;
this.state = 10;
if (true) break;

case 10:
//C
this.state = 11;
this.catchState = 16;
 BA.debugLineNum = 101;BA.debugLine="If Application.VersionCode > File.ReadString(Sa";
Debug.ShouldStop(16);
if (true) break;

case 11:
//if
this.state = 14;
if (RemoteObject.solveBoolean(">",parent.mostCurrent.__c.getField(false,"Application").runMethod(true,"getVersionCode"),BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(parent.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("VAPP")))))) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 102;BA.debugLine="NewVersion = True";
Debug.ShouldStop(32);
parent._newversion = parent.mostCurrent.__c.getField(true,"True");
 if (true) break;

case 14:
//C
this.state = 17;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 16:
//C
this.state = 17;
this.catchState = 0;
 BA.debugLineNum = 105;BA.debugLine="File.WriteString(SaeloZahra.dir,\"VAPP\",Applicat";
Debug.ShouldStop(256);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(parent.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(BA.ObjectToString("VAPP")),(Object)(BA.NumberToString(parent.mostCurrent.__c.getField(false,"Application").runMethod(true,"getVersionCode"))));
 if (true) break;
if (true) break;

case 17:
//C
this.state = 18;
this.catchState = 0;
;
 BA.debugLineNum = 107;BA.debugLine="File.WriteString(SaeloZahra.dir,\"VAPP\",Applicati";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(parent.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(BA.ObjectToString("VAPP")),(Object)(BA.NumberToString(parent.mostCurrent.__c.getField(false,"Application").runMethod(true,"getVersionCode"))));
 BA.debugLineNum = 110;BA.debugLine="If Not(File.Exists(SaeloZahra.dir,\"db.db\")) Then";
Debug.ShouldStop(8192);
if (true) break;

case 18:
//if
this.state = 27;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("db.db"))))).<Boolean>get().booleanValue()) { 
this.state = 20;
}else 
{ BA.debugLineNum = 112;BA.debugLine="Else If NewVersion Then";
Debug.ShouldStop(32768);
if (parent._newversion.<Boolean>get().booleanValue()) { 
this.state = 22;
}}
if (true) break;

case 20:
//C
this.state = 27;
 BA.debugLineNum = 111;BA.debugLine="File.Copy(File.DirAssets,\"db.db\",SaeloZahra.dir";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("db.db")),(Object)(parent.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("db.db")));
 if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 113;BA.debugLine="Msgbox2Async(\"آیا قصد حذف آرشیو اطلاعات و پیام‌";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("آیا قصد حذف آرشیو اطلاعات و پیام‌ها را دارید؟")),(Object)(BA.ObjectToCharSequence("پاکسازی")),(Object)(BA.ObjectToString("آره ، حذفشون کن")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("نه، میخوام داشته باشمشون")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.mostCurrent.__c.getField(false,"Null")),main.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 114;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "activity_create"), null);
this.state = 39;
return;
case 39:
//C
this.state = 23;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 115;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(262144);
if (true) break;

case 23:
//if
this.state = 26;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 116;BA.debugLine="File.Copy(File.DirAssets,\"db.db\",SaeloZahra.di";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("db.db")),(Object)(parent.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("db.db")));
 if (true) break;

case 26:
//C
this.state = 27;
;
 if (true) break;

case 27:
//C
this.state = 28;
;
 if (true) break;

case 28:
//C
this.state = 29;
;
 BA.debugLineNum = 134;BA.debugLine="ParallaxDesign.Initialize";
Debug.ShouldStop(32);
parent.mostCurrent._parallaxdesign.runVoidMethod ("Initialize",main.mostCurrent.activityBA);
 BA.debugLineNum = 135;BA.debugLine="Activity.AddView(ParallaxDesign,0,-14dip,100%x,10";
Debug.ShouldStop(64);
parent.mostCurrent._activity.runVoidMethod ("AddView",(Object)((parent.mostCurrent._parallaxdesign.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, -(double) (0 + parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 14))).<Integer>get().intValue()))),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA),parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 28)))}, "+",1, 1)));
 BA.debugLineNum = 136;BA.debugLine="ParallaxDesign.setMargins(270,100)";
Debug.ShouldStop(128);
parent.mostCurrent._parallaxdesign.runVoidMethod ("setMargins",(Object)(BA.numberCast(int.class, 270)),(Object)(BA.numberCast(int.class, 100)));
 BA.debugLineNum = 137;BA.debugLine="ParallaxDesign.setMultipliers(1.7f,1.7f)";
Debug.ShouldStop(256);
parent.mostCurrent._parallaxdesign.runVoidMethod ("setMultipliers",(Object)(BA.numberCast(float.class, 1.7f)),(Object)(BA.numberCast(float.class, 1.7f)));
 BA.debugLineNum = 138;BA.debugLine="ParallaxDesign.SetImageBitmap(LoadBitmap(File.Dir";
Debug.ShouldStop(512);
parent.mostCurrent._parallaxdesign.runVoidMethod ("SetImageBitmap",(Object)(parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("bg"),parent.mostCurrent.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 12))),RemoteObject.createImmutable(".jpg"))))));
 BA.debugLineNum = 139;BA.debugLine="ParallaxDesign.SendToBack";
Debug.ShouldStop(1024);
parent.mostCurrent._parallaxdesign.runVoidMethod ("SendToBack");
 BA.debugLineNum = 141;BA.debugLine="DescLbl.BringToFront";
Debug.ShouldStop(4096);
parent.mostCurrent._desclbl.runVoidMethod ("BringToFront");
 BA.debugLineNum = 142;BA.debugLine="DescLbl.Typeface=SaeloZahra.font";
Debug.ShouldStop(8192);
parent.mostCurrent._desclbl.runMethod(false,"setTypeface",(parent.mostCurrent._saelozahra._font /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 144;BA.debugLine="go_btn.Typeface=SaeloZahra.font";
Debug.ShouldStop(32768);
parent.mostCurrent._go_btn.runMethod(false,"setTypeface",(parent.mostCurrent._saelozahra._font /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 147;BA.debugLine="T.Initialize(\"T\",1444)";
Debug.ShouldStop(262144);
parent._t.runVoidMethod ("Initialize",main.processBA,(Object)(BA.ObjectToString("T")),(Object)(BA.numberCast(long.class, 1444)));
 BA.debugLineNum = 148;BA.debugLine="T.Enabled=True";
Debug.ShouldStop(524288);
parent._t.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 149;BA.debugLine="TimerInt=0";
Debug.ShouldStop(1048576);
parent._timerint = BA.numberCast(int.class, 0);
 BA.debugLineNum = 161;BA.debugLine="If accuWeatherCronJobService.RegionCode==\"\" Then";
Debug.ShouldStop(1);
if (true) break;

case 29:
//if
this.state = 38;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._accuweathercronjobservice._regioncode /*RemoteObject*/ ,BA.ObjectToString(""))) { 
this.state = 31;
}if (true) break;

case 31:
//C
this.state = 32;
 BA.debugLineNum = 162;BA.debugLine="If File.Exists(SaeloZahra.dir,\"RegionCode\") Then";
Debug.ShouldStop(2);
if (true) break;

case 32:
//if
this.state = 37;
if (parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("RegionCode"))).<Boolean>get().booleanValue()) { 
this.state = 34;
}else {
this.state = 36;
}if (true) break;

case 34:
//C
this.state = 37;
 BA.debugLineNum = 163;BA.debugLine="accuWeatherCronJobService.RegionCode = File.Rea";
Debug.ShouldStop(4);
parent.mostCurrent._accuweathercronjobservice._regioncode /*RemoteObject*/  = parent.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(parent.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("RegionCode")));
 if (true) break;

case 36:
//C
this.state = 37;
 BA.debugLineNum = 165;BA.debugLine="StartService(accuWeatherCronJobService)";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("StartService",main.processBA,(Object)((parent.mostCurrent._accuweathercronjobservice.getObject())));
 if (true) break;

case 37:
//C
this.state = 38;
;
 if (true) break;

case 38:
//C
this.state = -1;
;
 BA.debugLineNum = 170;BA.debugLine="logoIV.Bitmap=LoadBitmapResize(File.DirAssets,\"wa";
Debug.ShouldStop(512);
parent.mostCurrent._logoiv.runMethod(false,"setBitmap",(parent.mostCurrent.__c.runMethod(false,"LoadBitmapResize",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("watermark.png")),(Object)(parent.mostCurrent._logoiv.runMethod(true,"getWidth")),(Object)(parent.mostCurrent._logoiv.runMethod(true,"getHeight")),(Object)(parent.mostCurrent.__c.getField(true,"True"))).getObject()));
 BA.debugLineNum = 171;BA.debugLine="logoIV.SetVisibleAnimated(3133,True)";
Debug.ShouldStop(1024);
parent.mostCurrent._logoiv.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 3133)),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 174;BA.debugLine="DescLbl.TextColor=Colors.White";
Debug.ShouldStop(8192);
parent.mostCurrent._desclbl.runMethod(true,"setTextColor",parent.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 175;BA.debugLine="SaeloZahra.SetTextShadow(DescLbl,5,0,0,Colors.Bla";
Debug.ShouldStop(16384);
parent.mostCurrent._saelozahra.runVoidMethod ("_settextshadow" /*RemoteObject*/ ,main.mostCurrent.activityBA,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), parent.mostCurrent._desclbl.getObject()),(Object)(BA.numberCast(float.class, 5)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Black")));
 BA.debugLineNum = 176;BA.debugLine="Dim HoverLbl As Label";
Debug.ShouldStop(32768);
_hoverlbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("HoverLbl", _hoverlbl);
 BA.debugLineNum = 177;BA.debugLine="HoverLbl.Initialize(\"HoverLbl\")";
Debug.ShouldStop(65536);
_hoverlbl.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("HoverLbl")));
 BA.debugLineNum = 178;BA.debugLine="HoverLbl.SetBackgroundImage(LoadBitmap(File.DirAs";
Debug.ShouldStop(131072);
_hoverlbl.runVoidMethod ("SetBackgroundImageNew",(Object)((parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("GreenHover.png"))).getObject())));
 BA.debugLineNum = 179;BA.debugLine="Activity.AddView(HoverLbl,0,0,100%x,100%y)";
Debug.ShouldStop(262144);
parent.mostCurrent._activity.runVoidMethod ("AddView",(Object)((_hoverlbl.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 180;BA.debugLine="HoverLbl.BringToFront";
Debug.ShouldStop(524288);
_hoverlbl.runVoidMethod ("BringToFront");
 BA.debugLineNum = 181;BA.debugLine="HoverLbl.Visible=False";
Debug.ShouldStop(1048576);
_hoverlbl.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 182;BA.debugLine="DescLbl.BringToFront";
Debug.ShouldStop(2097152);
parent.mostCurrent._desclbl.runVoidMethod ("BringToFront");
 BA.debugLineNum = 183;BA.debugLine="logoIV.BringToFront";
Debug.ShouldStop(4194304);
parent.mostCurrent._logoiv.runVoidMethod ("BringToFront");
 BA.debugLineNum = 192;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e0.toString());}
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
public static RemoteObject  _activity_keypress(RemoteObject _keycode) throws Exception{
try {
		Debug.PushSubsStack("Activity_KeyPress (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,256);
if (RapidSub.canDelegate("activity_keypress")) { return ir.saelozahra.damaara.mazraeyeman.main.remoteMe.runUserSub(false, "main","activity_keypress", _keycode);}
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 256;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 257;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, main.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 258;BA.debugLine="DTTC.TapToClose";
Debug.ShouldStop(2);
main.mostCurrent._dttc.runClassMethod (ir.saelozahra.damaara.mazraeyeman.doubletaptoclose.class, "_taptoclose" /*RemoteObject*/ );
 BA.debugLineNum = 259;BA.debugLine="Return True";
Debug.ShouldStop(4);
if (true) return main.mostCurrent.__c.getField(true,"True");
 }else {
 BA.debugLineNum = 261;BA.debugLine="Return False";
Debug.ShouldStop(16);
if (true) return main.mostCurrent.__c.getField(true,"False");
 };
 BA.debugLineNum = 263;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,244);
if (RapidSub.canDelegate("activity_pause")) { return ir.saelozahra.damaara.mazraeyeman.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 244;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 246;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,239);
if (RapidSub.canDelegate("activity_resume")) { return ir.saelozahra.damaara.mazraeyeman.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 239;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(16384);
 BA.debugLineNum = 240;BA.debugLine="Log(\"SDK: \"&SaeloZahra.P.SdkVersion)";
Debug.ShouldStop(32768);
main.mostCurrent.__c.runVoidMethod ("LogImpl","4458753",RemoteObject.concat(RemoteObject.createImmutable("SDK: "),main.mostCurrent._saelozahra._p /*RemoteObject*/ .runMethod(true,"getSdkVersion")),0);
 BA.debugLineNum = 241;BA.debugLine="ParallaxDesign.SetImageBitmap(LoadBitmap(File.Dir";
Debug.ShouldStop(65536);
main.mostCurrent._parallaxdesign.runVoidMethod ("SetImageBitmap",(Object)(main.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("bg"),main.mostCurrent.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 12))),RemoteObject.createImmutable(".jpg"))))));
 BA.debugLineNum = 242;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _desclbl_click() throws Exception{
try {
		Debug.PushSubsStack("DescLbl_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,197);
if (RapidSub.canDelegate("desclbl_click")) { return ir.saelozahra.damaara.mazraeyeman.main.remoteMe.runUserSub(false, "main","desclbl_click");}
 BA.debugLineNum = 197;BA.debugLine="Sub DescLbl_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 198;BA.debugLine="go_btn_Click";
Debug.ShouldStop(32);
_go_btn_click();
 BA.debugLineNum = 199;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 51;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 52;BA.debugLine="Dim NewVersion As Boolean = False";
main._newversion = main.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 53;BA.debugLine="Dim DTTC As DoubleTaptoClose";
main.mostCurrent._dttc = RemoteObject.createNew ("ir.saelozahra.damaara.mazraeyeman.doubletaptoclose");
 //BA.debugLineNum = 54;BA.debugLine="Dim AC As AppCompat";
main.mostCurrent._ac = RemoteObject.createNew ("de.amberhome.objects.appcompat.AppCompatBase");
 //BA.debugLineNum = 56;BA.debugLine="Dim TimerInt As Int";
main._timerint = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 57;BA.debugLine="Dim ParallaxDesign As Hitex_ParallaxDesign";
main.mostCurrent._parallaxdesign = RemoteObject.createNew ("iir.wrap.Hitex_ParallaxDesign");
 //BA.debugLineNum = 58;BA.debugLine="Private DescLbl As Label";
main.mostCurrent._desclbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 59;BA.debugLine="Private logoIV As ImageView";
main.mostCurrent._logoiv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 60;BA.debugLine="Private go_btn As Button";
main.mostCurrent._go_btn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static void  _go_btn_click() throws Exception{
try {
		Debug.PushSubsStack("go_btn_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,266);
if (RapidSub.canDelegate("go_btn_click")) { ir.saelozahra.damaara.mazraeyeman.main.remoteMe.runUserSub(false, "main","go_btn_click"); return;}
ResumableSub_go_btn_Click rsub = new ResumableSub_go_btn_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_go_btn_Click extends BA.ResumableSub {
public ResumableSub_go_btn_Click(ir.saelozahra.damaara.mazraeyeman.main parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.saelozahra.damaara.mazraeyeman.main parent;
RemoteObject _permission = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("go_btn_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,266);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 268;BA.debugLine="SaeloZahra.beep(\"button-19.mp3\")";
Debug.ShouldStop(2048);
parent.mostCurrent._saelozahra.runVoidMethod ("_beep" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("button-19.mp3")));
 BA.debugLineNum = 269;BA.debugLine="SaeloZahra.SetAnimation(\"zoom_exit\",\"zoom_enter\")";
Debug.ShouldStop(4096);
parent.mostCurrent._saelozahra.runVoidMethod ("_setanimation" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.ObjectToString("zoom_exit")),(Object)(RemoteObject.createImmutable("zoom_enter")));
 BA.debugLineNum = 270;BA.debugLine="If File.Exists(SaeloZahra.dir,\"usrnm\") Then";
Debug.ShouldStop(8192);
if (true) break;

case 1:
//if
this.state = 12;
if (parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("usrnm"))).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 11;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 273;BA.debugLine="Starter.rp.CheckAndRequest(Starter.rp.PERMISSION";
Debug.ShouldStop(65536);
parent.mostCurrent._starter._rp /*RemoteObject*/ .runVoidMethod ("CheckAndRequest",main.processBA,(Object)(parent.mostCurrent._starter._rp /*RemoteObject*/ .getField(true,"PERMISSION_WRITE_EXTERNAL_STORAGE")));
 BA.debugLineNum = 274;BA.debugLine="Wait For Activity_PermissionResult (Permission A";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","activity_permissionresult", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "go_btn_click"), null);
this.state = 13;
return;
case 13:
//C
this.state = 4;
_permission = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Permission", _permission);
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 275;BA.debugLine="If Result Then StartActivity(login_act)";
Debug.ShouldStop(262144);
if (true) break;

case 4:
//if
this.state = 9;
if (_result.<Boolean>get().booleanValue()) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
parent.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((parent.mostCurrent._login_act.getObject())));
if (true) break;

case 9:
//C
this.state = 12;
;
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 281;BA.debugLine="StartActivity(Intro2Act)";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((parent.mostCurrent._intro2act.getObject())));
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 283;BA.debugLine="SaeloZahra.SetAnimation(\"zoom_exit\",\"zoom_enter\")";
Debug.ShouldStop(67108864);
parent.mostCurrent._saelozahra.runVoidMethod ("_setanimation" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.ObjectToString("zoom_exit")),(Object)(RemoteObject.createImmutable("zoom_enter")));
 BA.debugLineNum = 284;BA.debugLine="Activity.Finish";
Debug.ShouldStop(134217728);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 285;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
public static RemoteObject  _logoiv_click() throws Exception{
try {
		Debug.PushSubsStack("logoIV_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,200);
if (RapidSub.canDelegate("logoiv_click")) { return ir.saelozahra.damaara.mazraeyeman.main.remoteMe.runUserSub(false, "main","logoiv_click");}
 BA.debugLineNum = 200;BA.debugLine="Sub logoIV_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 201;BA.debugLine="go_btn_Click";
Debug.ShouldStop(256);
_go_btn_click();
 BA.debugLineNum = 202;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
intro2act_subs_0._process_globals();
login_act_subs_0._process_globals();
homeact_subs_0._process_globals();
starter_subs_0._process_globals();
accuweathercronjobservice_subs_0._process_globals();
registeract_subs_0._process_globals();
saelozahra_subs_0._process_globals();
sabtemahsoolact_subs_0._process_globals();
notificationact_subs_0._process_globals();
weathernewact_subs_0._process_globals();
bazarchemahsoolact_subs_0._process_globals();
dateutils_subs_0._process_globals();
firebasemessaging_subs_0._process_globals();
fullscreen_video_act_subs_0._process_globals();
mahsoullistact_subs_0._process_globals();
otpconfirmact_subs_0._process_globals();
select_map_act_subs_0._process_globals();
singlenewact_subs_0._process_globals();
videonewact_subs_0._process_globals();
zarinpal_payment_subs_0._process_globals();
newinst2_subs_0._process_globals();
httputils2service_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("ir.saelozahra.damaara.mazraeyeman.main");
intro2act.myClass = BA.getDeviceClass ("ir.saelozahra.damaara.mazraeyeman.intro2act");
login_act.myClass = BA.getDeviceClass ("ir.saelozahra.damaara.mazraeyeman.login_act");
homeact.myClass = BA.getDeviceClass ("ir.saelozahra.damaara.mazraeyeman.homeact");
starter.myClass = BA.getDeviceClass ("ir.saelozahra.damaara.mazraeyeman.starter");
accuweathercronjobservice.myClass = BA.getDeviceClass ("ir.saelozahra.damaara.mazraeyeman.accuweathercronjobservice");
registeract.myClass = BA.getDeviceClass ("ir.saelozahra.damaara.mazraeyeman.registeract");
saelozahra.myClass = BA.getDeviceClass ("ir.saelozahra.damaara.mazraeyeman.saelozahra");
sabtemahsoolact.myClass = BA.getDeviceClass ("ir.saelozahra.damaara.mazraeyeman.sabtemahsoolact");
notificationact.myClass = BA.getDeviceClass ("ir.saelozahra.damaara.mazraeyeman.notificationact");
weathernewact.myClass = BA.getDeviceClass ("ir.saelozahra.damaara.mazraeyeman.weathernewact");
bazarchemahsoolact.myClass = BA.getDeviceClass ("ir.saelozahra.damaara.mazraeyeman.bazarchemahsoolact");
ctoast.myClass = BA.getDeviceClass ("ir.saelozahra.damaara.mazraeyeman.ctoast");
customlistview.myClass = BA.getDeviceClass ("ir.saelozahra.damaara.mazraeyeman.customlistview");
dateutils.myClass = BA.getDeviceClass ("ir.saelozahra.damaara.mazraeyeman.dateutils");
doubletaptoclose.myClass = BA.getDeviceClass ("ir.saelozahra.damaara.mazraeyeman.doubletaptoclose");
firebasemessaging.myClass = BA.getDeviceClass ("ir.saelozahra.damaara.mazraeyeman.firebasemessaging");
fullscreen_video_act.myClass = BA.getDeviceClass ("ir.saelozahra.damaara.mazraeyeman.fullscreen_video_act");
mahsoullistact.myClass = BA.getDeviceClass ("ir.saelozahra.damaara.mazraeyeman.mahsoullistact");
otpconfirmact.myClass = BA.getDeviceClass ("ir.saelozahra.damaara.mazraeyeman.otpconfirmact");
select_map_act.myClass = BA.getDeviceClass ("ir.saelozahra.damaara.mazraeyeman.select_map_act");
singlenewact.myClass = BA.getDeviceClass ("ir.saelozahra.damaara.mazraeyeman.singlenewact");
videonewact.myClass = BA.getDeviceClass ("ir.saelozahra.damaara.mazraeyeman.videonewact");
zarinpal_payment.myClass = BA.getDeviceClass ("ir.saelozahra.damaara.mazraeyeman.zarinpal_payment");
cl_appupdate.myClass = BA.getDeviceClass ("ir.saelozahra.damaara.mazraeyeman.cl_appupdate");
newinst2.myClass = BA.getDeviceClass ("ir.saelozahra.damaara.mazraeyeman.newinst2");
fileprovider.myClass = BA.getDeviceClass ("ir.saelozahra.damaara.mazraeyeman.fileprovider");
httputils2service.myClass = BA.getDeviceClass ("ir.saelozahra.damaara.mazraeyeman.httputils2service");
httpjob.myClass = BA.getDeviceClass ("ir.saelozahra.damaara.mazraeyeman.httpjob");
wvswipe.myClass = BA.getDeviceClass ("ir.saelozahra.damaara.mazraeyeman.wvswipe");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 32;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 33;BA.debugLine="Dim SQL1 As SQL";
main._sql1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");
 //BA.debugLineNum = 36;BA.debugLine="Dim T As Timer";
main._t = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _t_tick() throws Exception{
try {
		Debug.PushSubsStack("T_Tick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,206);
if (RapidSub.canDelegate("t_tick")) { return ir.saelozahra.damaara.mazraeyeman.main.remoteMe.runUserSub(false, "main","t_tick");}
 BA.debugLineNum = 206;BA.debugLine="Sub T_Tick";
Debug.ShouldStop(8192);
 BA.debugLineNum = 208;BA.debugLine="If TimerInt > 1  And TimerInt<3 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean(">",main._timerint,BA.numberCast(double.class, 1)) && RemoteObject.solveBoolean("<",main._timerint,BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 209;BA.debugLine="T.Enabled=False";
Debug.ShouldStop(65536);
main._t.runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 210;BA.debugLine="go_btn.SetVisibleAnimated(313,True)";
Debug.ShouldStop(131072);
main.mostCurrent._go_btn.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 313)),(Object)(main.mostCurrent.__c.getField(true,"True")));
 }else {
 BA.debugLineNum = 213;BA.debugLine="TimerInt=TimerInt+1";
Debug.ShouldStop(1048576);
main._timerint = RemoteObject.solve(new RemoteObject[] {main._timerint,RemoteObject.createImmutable(1)}, "+",1, 1);
 };
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
}