package ir.saelozahra.damaara.mazraeyeman;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class login_act_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (login_act) ","login_act",2,login_act.mostCurrent.activityBA,login_act.mostCurrent,29);
if (RapidSub.canDelegate("activity_create")) { return ir.saelozahra.damaara.mazraeyeman.login_act.remoteMe.runUserSub(false, "login_act","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 29;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 33;BA.debugLine="ParallaxDesign.Initialize";
Debug.ShouldStop(1);
login_act.mostCurrent._parallaxdesign.runVoidMethod ("Initialize",login_act.mostCurrent.activityBA);
 BA.debugLineNum = 34;BA.debugLine="Activity.AddView(ParallaxDesign,-4%x,-4%y,108%x,1";
Debug.ShouldStop(2);
login_act.mostCurrent._activity.runVoidMethod ("AddView",(Object)((login_act.mostCurrent._parallaxdesign.getObject())),(Object)(BA.numberCast(int.class, -(double) (0 + login_act.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 4)),login_act.mostCurrent.activityBA).<Integer>get().intValue()))),(Object)(BA.numberCast(int.class, -(double) (0 + login_act.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 4)),login_act.mostCurrent.activityBA).<Integer>get().intValue()))),(Object)(login_act.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 108)),login_act.mostCurrent.activityBA)),(Object)(login_act.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 108)),login_act.mostCurrent.activityBA)));
 BA.debugLineNum = 35;BA.debugLine="ParallaxDesign.setMargins(270,100)";
Debug.ShouldStop(4);
login_act.mostCurrent._parallaxdesign.runVoidMethod ("setMargins",(Object)(BA.numberCast(int.class, 270)),(Object)(BA.numberCast(int.class, 100)));
 BA.debugLineNum = 36;BA.debugLine="ParallaxDesign.setMultipliers(1.9f,1.9f)";
Debug.ShouldStop(8);
login_act.mostCurrent._parallaxdesign.runVoidMethod ("setMultipliers",(Object)(BA.numberCast(float.class, 1.9f)),(Object)(BA.numberCast(float.class, 1.9f)));
 BA.debugLineNum = 37;BA.debugLine="ParallaxDesign.SetImageBitmap(SaeloZahra.Blur(Loa";
Debug.ShouldStop(16);
login_act.mostCurrent._parallaxdesign.runVoidMethod ("SetImageBitmap",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), login_act.mostCurrent._saelozahra.runMethod(false,"_blur" /*RemoteObject*/ ,login_act.mostCurrent.activityBA,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper"), login_act.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(login_act.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("bg"),login_act.mostCurrent.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 12))),RemoteObject.createImmutable(".jpg")))).getObject())).getObject()));
 BA.debugLineNum = 40;BA.debugLine="Activity.LoadLayout(\"login_layout\")";
Debug.ShouldStop(128);
login_act.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("login_layout")),login_act.mostCurrent.activityBA);
 BA.debugLineNum = 41;BA.debugLine="CD1.Initialize2(0x4026873E,7dip,1dip,SaeloZahra.C";
Debug.ShouldStop(256);
login_act.mostCurrent._cd1.runVoidMethod ("Initialize2",(Object)(BA.numberCast(int.class, ((int)0x4026873e))),(Object)(login_act.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 7)))),(Object)(login_act.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))),(Object)(login_act.mostCurrent._saelozahra._colorlight /*RemoteObject*/ ));
 BA.debugLineNum = 42;BA.debugLine="CD2.Initialize2(0x4026873E,7dip,1dip,SaeloZahra.C";
Debug.ShouldStop(512);
login_act.mostCurrent._cd2.runVoidMethod ("Initialize2",(Object)(BA.numberCast(int.class, ((int)0x4026873e))),(Object)(login_act.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 7)))),(Object)(login_act.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))),(Object)(login_act.mostCurrent._saelozahra._colorlight /*RemoteObject*/ ));
 BA.debugLineNum = 49;BA.debugLine="username_et.Typeface=SaeloZahra.font";
Debug.ShouldStop(65536);
login_act.mostCurrent._username_et.runMethod(false,"setTypeface",(login_act.mostCurrent._saelozahra._font /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 50;BA.debugLine="password_et.Typeface=SaeloZahra.font";
Debug.ShouldStop(131072);
login_act.mostCurrent._password_et.runMethod(false,"setTypeface",(login_act.mostCurrent._saelozahra._font /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 51;BA.debugLine="login_btn.Typeface=SaeloZahra.font";
Debug.ShouldStop(262144);
login_act.mostCurrent._login_btn.runMethod(false,"setTypeface",(login_act.mostCurrent._saelozahra._font /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 52;BA.debugLine="Register_btn.Typeface=SaeloZahra.font";
Debug.ShouldStop(524288);
login_act.mostCurrent._register_btn.runMethod(false,"setTypeface",(login_act.mostCurrent._saelozahra._font /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 54;BA.debugLine="If GetDeviceLayoutValues.Height > 3000 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean(">",login_act.mostCurrent.__c.runMethod(false,"GetDeviceLayoutValues",login_act.mostCurrent.activityBA).getField(true,"Height"),BA.numberCast(double.class, 3000))) { 
 BA.debugLineNum = 55;BA.debugLine="SaeloZahra.SetNinePatchButton(login_btn,\"btn_gre";
Debug.ShouldStop(4194304);
login_act.mostCurrent._saelozahra.runVoidMethod ("_setninepatchbutton" /*RemoteObject*/ ,login_act.mostCurrent.activityBA,(Object)(login_act.mostCurrent._login_btn),(Object)(BA.ObjectToString("btn_green")),(Object)(BA.ObjectToString("btn_green_pressed")),(Object)(RemoteObject.createImmutable("")));
 };
 BA.debugLineNum = 73;BA.debugLine="If File.Exists(SaeloZahra.dir,\"usrnm\") Then";
Debug.ShouldStop(256);
if (login_act.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(login_act.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("usrnm"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 74;BA.debugLine="username_et.Text=File.ReadString(SaeloZahra.dir,";
Debug.ShouldStop(512);
login_act.mostCurrent._username_et.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(login_act.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(login_act.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("usrnm")))));
 BA.debugLineNum = 75;BA.debugLine="password_et.Text=File.ReadString(SaeloZahra.dir,";
Debug.ShouldStop(1024);
login_act.mostCurrent._password_et.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(login_act.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(login_act.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("pswd")))));
 };
 BA.debugLineNum = 78;BA.debugLine="If File.Exists(SaeloZahra.dir,\"expire\") Then";
Debug.ShouldStop(8192);
if (login_act.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(login_act.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("expire"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 79;BA.debugLine="ToastMessageShow(SaeloZahra.CSB(\"نرم افزار شما ا";
Debug.ShouldStop(16384);
login_act.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(login_act.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,login_act.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("نرم افزار شما اکسپایر شده است"),login_act.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("با پشتیبانی تماس بگیرید")))).getObject())),(Object)(login_act.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 83;BA.debugLine="ParallaxDesign.SendToBack";
Debug.ShouldStop(262144);
login_act.mostCurrent._parallaxdesign.runVoidMethod ("SendToBack");
 BA.debugLineNum = 84;BA.debugLine="Container.BringToFront";
Debug.ShouldStop(524288);
login_act.mostCurrent._container.runVoidMethod ("BringToFront");
 BA.debugLineNum = 85;BA.debugLine="username_et.BringToFront";
Debug.ShouldStop(1048576);
login_act.mostCurrent._username_et.runVoidMethod ("BringToFront");
 BA.debugLineNum = 86;BA.debugLine="password_et.BringToFront";
Debug.ShouldStop(2097152);
login_act.mostCurrent._password_et.runVoidMethod ("BringToFront");
 BA.debugLineNum = 87;BA.debugLine="login_btn.BringToFront";
Debug.ShouldStop(4194304);
login_act.mostCurrent._login_btn.runVoidMethod ("BringToFront");
 BA.debugLineNum = 88;BA.debugLine="Register_btn.BringToFront";
Debug.ShouldStop(8388608);
login_act.mostCurrent._register_btn.runVoidMethod ("BringToFront");
 BA.debugLineNum = 91;BA.debugLine="username_et.Background=CD1";
Debug.ShouldStop(67108864);
login_act.mostCurrent._username_et.runMethod(false,"setBackground",(login_act.mostCurrent._cd1.getObject()));
 BA.debugLineNum = 92;BA.debugLine="password_et.Background=CD2";
Debug.ShouldStop(134217728);
login_act.mostCurrent._password_et.runMethod(false,"setBackground",(login_act.mostCurrent._cd2.getObject()));
 BA.debugLineNum = 96;BA.debugLine="If SaeloZahra.P.SdkVersion<23 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("<",login_act.mostCurrent._saelozahra._p /*RemoteObject*/ .runMethod(true,"getSdkVersion"),BA.numberCast(double.class, 23))) { 
 BA.debugLineNum = 97;BA.debugLine="username_et.Color=0x4026873E";
Debug.ShouldStop(1);
login_act.mostCurrent._username_et.runVoidMethod ("setColor",BA.numberCast(int.class, ((int)0x4026873e)));
 BA.debugLineNum = 98;BA.debugLine="password_et.Color=0x4026873E";
Debug.ShouldStop(2);
login_act.mostCurrent._password_et.runVoidMethod ("setColor",BA.numberCast(int.class, ((int)0x4026873e)));
 };
 BA.debugLineNum = 102;BA.debugLine="If FirstTime Then";
Debug.ShouldStop(32);
if (_firsttime.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 103;BA.debugLine="If File.Exists(SaeloZahra.dir,\"showTipLogin\")==F";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",login_act.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(login_act.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("showTipLogin"))),login_act.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 104;BA.debugLine="TIP.Initialize(\"tip\")";
Debug.ShouldStop(128);
login_act.mostCurrent._tip.runVoidMethod ("Initialize",login_act.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("tip")));
 BA.debugLineNum = 106;BA.debugLine="TIP.setTitle(SaeloZahra.csb(\"ثبت نام\")).setButt";
Debug.ShouldStop(512);
login_act.mostCurrent._tip.runMethod(false,"setTitle",(Object)(BA.ObjectToString(login_act.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,login_act.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("ثبت نام")))))).runMethod(false,"setButtonText",(Object)(BA.ObjectToString(login_act.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,login_act.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("بعدی")))))).runMethod(false,"setTitleColor",(Object)(login_act.mostCurrent.__c.getField(false,"Colors").getField(true,"White"))).runMethod(false,"setDescriptionColor",(Object)(login_act.mostCurrent.__c.getField(false,"Colors").getField(true,"White"))).runMethod(false,"setDescription",(Object)(BA.ObjectToString(login_act.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,login_act.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("اگر تاکنون در اپلیکیشن مزرعه من ثبت نام نکرده اید از قسمت ثبت نام، اطلاعات زمین کشاورزی خود را وارد نموده و از خدمات این اپلیکیشن بهره مند شوید.")))))).runMethod(false,"setTarget",(Object)((login_act.mostCurrent._register_btn.getObject()))).runVoidMethod ("build");
 BA.debugLineNum = 107;BA.debugLine="TIP.setDelay(2313)";
Debug.ShouldStop(1024);
login_act.mostCurrent._tip.runVoidMethod ("setDelay",(Object)(BA.numberCast(int.class, 2313)));
 BA.debugLineNum = 109;BA.debugLine="File.WriteString(SaeloZahra.dir,\"showTipLogin\",";
Debug.ShouldStop(4096);
login_act.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(login_act.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(BA.ObjectToString("showTipLogin")),(Object)(RemoteObject.createImmutable("")));
 }else {
 BA.debugLineNum = 111;BA.debugLine="TIP.Initialize(\"Temptip\")";
Debug.ShouldStop(16384);
login_act.mostCurrent._tip.runVoidMethod ("Initialize",login_act.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Temptip")));
 BA.debugLineNum = 112;BA.debugLine="TIP.setTitle(SaeloZahra.csb(\"مزرعه من چه خدماتی";
Debug.ShouldStop(32768);
login_act.mostCurrent._tip.runMethod(false,"setTitle",(Object)(BA.ObjectToString(login_act.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,login_act.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("مزرعه من چه خدماتی ارائه میدهد؟")))))).runMethod(false,"setButtonText",(Object)(BA.ObjectToString(login_act.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,login_act.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("شروع نرم افزار")))))).runMethod(false,"setTitleColor",(Object)(login_act.mostCurrent.__c.getField(false,"Colors").getField(true,"White"))).runMethod(false,"setDescriptionColor",(Object)(login_act.mostCurrent.__c.getField(false,"Colors").getField(true,"White"))).runMethod(false,"setDescription",(Object)(BA.ObjectToString(login_act.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,login_act.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("1. پیش بینی حوادث غیر مترقبه مرتبط با محصول شما از قبیل: سرمازدگی، گرمازدگی، خشکسالی، یخبندان، بادزدگی، طوفان، سیل، تگرگ "),login_act.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((login_act.mostCurrent.__c.getField(true,"CRLF")))),RemoteObject.createImmutable("2. اعلام بارندگی و مدت زمان تقریبی بارش "),login_act.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((login_act.mostCurrent.__c.getField(true,"CRLF")))),RemoteObject.createImmutable("3. مقایسه آمار شاخص های آب و هوایی در دوره های مختلف  "),login_act.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((login_act.mostCurrent.__c.getField(true,"CRLF")))),RemoteObject.createImmutable("4. محاسبه و هشدار هجوم طغیان آفت  "),login_act.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((login_act.mostCurrent.__c.getField(true,"CRLF")))),RemoteObject.createImmutable("5. محتوای آموزشی مفید برای جلوگیری از بروز مشکلات "),login_act.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((login_act.mostCurrent.__c.getField(true,"CRLF")))),RemoteObject.createImmutable(" و ده ها خدمات دیگر...")))))))).runMethod(false,"setTarget",(Object)((login_act.mostCurrent._register_btn.getObject()))).runVoidMethod ("build");
 BA.debugLineNum = 113;BA.debugLine="TIP.setDelay(2313)";
Debug.ShouldStop(65536);
login_act.mostCurrent._tip.runVoidMethod ("setDelay",(Object)(BA.numberCast(int.class, 2313)));
 };
 };
 BA.debugLineNum = 119;BA.debugLine="If File.Exists(SaeloZahra.dir,\"usrnm\") And File.E";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean(".",login_act.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(login_act.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("usrnm")))) && RemoteObject.solveBoolean(".",login_act.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(login_act.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("pswd")))) && RemoteObject.solveBoolean(".",login_act.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(login_act.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("NotNeedUserPass"))))) { 
 BA.debugLineNum = 120;BA.debugLine="login_btn_Click";
Debug.ShouldStop(8388608);
_login_btn_click();
 };
 BA.debugLineNum = 133;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (login_act) ","login_act",2,login_act.mostCurrent.activityBA,login_act.mostCurrent,147);
if (RapidSub.canDelegate("activity_pause")) { return ir.saelozahra.damaara.mazraeyeman.login_act.remoteMe.runUserSub(false, "login_act","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 147;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 149;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("Activity_Resume (login_act) ","login_act",2,login_act.mostCurrent.activityBA,login_act.mostCurrent,135);
if (RapidSub.canDelegate("activity_resume")) { return ir.saelozahra.damaara.mazraeyeman.login_act.remoteMe.runUserSub(false, "login_act","activity_resume");}
 BA.debugLineNum = 135;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(64);
 BA.debugLineNum = 137;BA.debugLine="Log(GetDeviceLayoutValues.Height)";
Debug.ShouldStop(256);
login_act.mostCurrent.__c.runVoidMethod ("LogImpl","41310722",BA.NumberToString(login_act.mostCurrent.__c.runMethod(false,"GetDeviceLayoutValues",login_act.mostCurrent.activityBA).getField(true,"Height")),0);
 BA.debugLineNum = 138;BA.debugLine="If File.Exists(SaeloZahra.dir,\"usrnm\") Then";
Debug.ShouldStop(512);
if (login_act.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(login_act.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("usrnm"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 139;BA.debugLine="If File.ReadString(SaeloZahra.dir,\"usrnm\").Lengt";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",login_act.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(login_act.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("usrnm"))).runMethod(true,"length"),BA.numberCast(double.class, 11))) { 
 BA.debugLineNum = 140;BA.debugLine="username_et.Text=File.ReadString(SaeloZahra.dir";
Debug.ShouldStop(2048);
login_act.mostCurrent._username_et.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(login_act.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(login_act.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("usrnm")))));
 BA.debugLineNum = 141;BA.debugLine="password_et.Text=File.ReadString(SaeloZahra.dir";
Debug.ShouldStop(4096);
login_act.mostCurrent._password_et.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(login_act.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(login_act.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("pswd")))));
 };
 };
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
public static void  _auth_complete(RemoteObject _success,RemoteObject _errormessage) throws Exception{
try {
		Debug.PushSubsStack("Auth_Complete (login_act) ","login_act",2,login_act.mostCurrent.activityBA,login_act.mostCurrent,311);
if (RapidSub.canDelegate("auth_complete")) { ir.saelozahra.damaara.mazraeyeman.login_act.remoteMe.runUserSub(false, "login_act","auth_complete", _success, _errormessage); return;}
ResumableSub_Auth_Complete rsub = new ResumableSub_Auth_Complete(null,_success,_errormessage);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Auth_Complete extends BA.ResumableSub {
public ResumableSub_Auth_Complete(ir.saelozahra.damaara.mazraeyeman.login_act parent,RemoteObject _success,RemoteObject _errormessage) {
this.parent = parent;
this._success = _success;
this._errormessage = _errormessage;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.saelozahra.damaara.mazraeyeman.login_act parent;
RemoteObject _success;
RemoteObject _errormessage;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Auth_Complete (login_act) ","login_act",2,login_act.mostCurrent.activityBA,login_act.mostCurrent,311);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("Success", _success);
Debug.locals.put("ErrorMessage", _errormessage);
 BA.debugLineNum = 312;BA.debugLine="If Success Then";
Debug.ShouldStop(8388608);
if (true) break;

case 1:
//if
this.state = 6;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 313;BA.debugLine="dsnake.Initialize(\"snake\",Activity,SaeloZahra.CS";
Debug.ShouldStop(16777216);
parent.mostCurrent._dsnake.runVoidMethod ("Initialize",login_act.mostCurrent.activityBA,(Object)(BA.ObjectToString("snake")),(Object)((parent.mostCurrent._activity.getObject())),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,login_act.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("هویت شما تائید شد..."))).getObject())),(Object)(parent.mostCurrent._dsnake.getField(true,"DURATION_SHORT")));
 BA.debugLineNum = 314;BA.debugLine="Sleep(dsnake.DURATION_SHORT)";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("Sleep",login_act.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "login_act", "auth_complete"),parent.mostCurrent._dsnake.getField(true,"DURATION_SHORT"));
this.state = 7;
return;
case 7:
//C
this.state = 6;
;
 BA.debugLineNum = 316;BA.debugLine="login_btn_Click";
Debug.ShouldStop(134217728);
_login_btn_click();
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 318;BA.debugLine="ToastMessageShow($\"خطا: ${ErrorMessage}\"$, True)";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("خطا: "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_errormessage))),RemoteObject.createImmutable(""))))),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 319;BA.debugLine="Log(ErrorMessage)";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","41769480",_errormessage,0);
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 321;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
public static RemoteObject  _callfab_click() throws Exception{
try {
		Debug.PushSubsStack("CallFab_Click (login_act) ","login_act",2,login_act.mostCurrent.activityBA,login_act.mostCurrent,343);
if (RapidSub.canDelegate("callfab_click")) { return ir.saelozahra.damaara.mazraeyeman.login_act.remoteMe.runUserSub(false, "login_act","callfab_click");}
 BA.debugLineNum = 343;BA.debugLine="Sub CallFab_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 344;BA.debugLine="SaeloZahra.intent1.Initialize(SaeloZahra.intent1.";
Debug.ShouldStop(8388608);
login_act.mostCurrent._saelozahra._intent1 /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(login_act.mostCurrent._saelozahra._intent1 /*RemoteObject*/ .getField(true,"ACTION_VIEW")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("tel:"),login_act.mostCurrent._saelozahra._supportnumber /*RemoteObject*/ )));
 BA.debugLineNum = 345;BA.debugLine="StartActivity(SaeloZahra.intent1)";
Debug.ShouldStop(16777216);
login_act.mostCurrent.__c.runVoidMethod ("StartActivity",login_act.processBA,(Object)((login_act.mostCurrent._saelozahra._intent1 /*RemoteObject*/ .getObject())));
 BA.debugLineNum = 346;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 11;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 12;BA.debugLine="Dim MoreThanTrialDays As Boolean = False";
login_act._morethantrialdays = login_act.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 13;BA.debugLine="Dim RAF As RandomAccessFile";
login_act.mostCurrent._raf = RemoteObject.createNew ("anywheresoftware.b4a.randomaccessfile.RandomAccessFile");
 //BA.debugLineNum = 14;BA.debugLine="Dim SH As Amir_SliderShow";
login_act.mostCurrent._sh = RemoteObject.createNew ("ir.aghajari.slider.Amir_SliderShow");
 //BA.debugLineNum = 15;BA.debugLine="Dim job1 As HttpJob";
login_act.mostCurrent._job1 = RemoteObject.createNew ("ir.saelozahra.damaara.mazraeyeman.httpjob");
 //BA.debugLineNum = 16;BA.debugLine="Dim CD1,CD2 As ColorDrawable";
login_act.mostCurrent._cd1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");
login_act.mostCurrent._cd2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");
 //BA.debugLineNum = 17;BA.debugLine="Private username_et,password_et As EditText";
login_act.mostCurrent._username_et = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
login_act.mostCurrent._password_et = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Dim components() As String";
login_act.mostCurrent._components = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});
 //BA.debugLineNum = 20;BA.debugLine="Private login_btn,Register_btn As Button";
login_act.mostCurrent._login_btn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
login_act.mostCurrent._register_btn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Dim dsnake As DSSnackbar";
login_act.mostCurrent._dsnake = RemoteObject.createNew ("de.amberhome.objects.SnackbarWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Dim ParallaxDesign As Hitex_ParallaxDesign";
login_act.mostCurrent._parallaxdesign = RemoteObject.createNew ("iir.wrap.Hitex_ParallaxDesign");
 //BA.debugLineNum = 23;BA.debugLine="Private Container As Panel";
login_act.mostCurrent._container = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Dim TIP As MSShowTipsBuilder";
login_act.mostCurrent._tip = RemoteObject.createNew ("com.maximussoft.showtips.BuilderWrapper");
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("jobDone (login_act) ","login_act",2,login_act.mostCurrent.activityBA,login_act.mostCurrent,200);
if (RapidSub.canDelegate("jobdone")) { return ir.saelozahra.damaara.mazraeyeman.login_act.remoteMe.runUserSub(false, "login_act","jobdone", _job);}
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _location = RemoteObject.createImmutable("");
RemoteObject _userproducts = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _regdate = RemoteObject.createImmutable(0L);
Debug.locals.put("job", _job);
 BA.debugLineNum = 200;BA.debugLine="Sub jobDone(job As HttpJob)";
Debug.ShouldStop(128);
 BA.debugLineNum = 202;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(512);
login_act.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 204;BA.debugLine="If job.Success Then";
Debug.ShouldStop(2048);
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 206;BA.debugLine="If job.GetString==\"\"\"PassError\"\"\" Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_getstring" /*RemoteObject*/ ),BA.ObjectToString("\"PassError\""))) { 
 BA.debugLineNum = 208;BA.debugLine="ToastMessageShow(SaeloZahra.CSB(\"کلمه عبور وارد";
Debug.ShouldStop(32768);
login_act.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(login_act.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,login_act.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("کلمه عبور وارد شده غلط است"))).getObject())),(Object)(login_act.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 209;BA.debugLine="File.Delete(SaeloZahra.dir,\"usrnm\")";
Debug.ShouldStop(65536);
login_act.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(login_act.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("usrnm")));
 BA.debugLineNum = 210;BA.debugLine="File.Delete(SaeloZahra.dir,\"pswd\")";
Debug.ShouldStop(131072);
login_act.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(login_act.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("pswd")));
 }else 
{ BA.debugLineNum = 212;BA.debugLine="Else If job.GetString==\"\"\"UserNotFound\"\"\" Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_getstring" /*RemoteObject*/ ),BA.ObjectToString("\"UserNotFound\""))) { 
 BA.debugLineNum = 214;BA.debugLine="ToastMessageShow(SaeloZahra.CSB(\"نام کاربری پید";
Debug.ShouldStop(2097152);
login_act.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(login_act.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,login_act.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("نام کاربری پیدا نشد"))).getObject())),(Object)(login_act.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 215;BA.debugLine="File.Delete(SaeloZahra.dir,\"usrnm\")";
Debug.ShouldStop(4194304);
login_act.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(login_act.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("usrnm")));
 BA.debugLineNum = 216;BA.debugLine="File.Delete(SaeloZahra.dir,\"pswd\")";
Debug.ShouldStop(8388608);
login_act.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(login_act.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("pswd")));
 }else {
 BA.debugLineNum = 222;BA.debugLine="Log(job.GetString)";
Debug.ShouldStop(536870912);
login_act.mostCurrent.__c.runVoidMethod ("LogImpl","41703958",_job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_getstring" /*RemoteObject*/ ),0);
 BA.debugLineNum = 223;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(1073741824);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 224;BA.debugLine="parser.Initialize(job.GetString)";
Debug.ShouldStop(-2147483648);
_parser.runVoidMethod ("Initialize",(Object)(_job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 225;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(1);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 226;BA.debugLine="Starter.my_id = root.Get(\"id\")";
Debug.ShouldStop(2);
login_act.mostCurrent._starter._my_id /*RemoteObject*/  = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));
 BA.debugLineNum = 227;BA.debugLine="Dim location As String = root.Get(\"location\")";
Debug.ShouldStop(4);
_location = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("location")))));Debug.locals.put("location", _location);Debug.locals.put("location", _location);
 BA.debugLineNum = 229;BA.debugLine="Dim userProducts As List = root.Get(\"userProduc";
Debug.ShouldStop(16);
_userproducts = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_userproducts = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("userProducts")))));Debug.locals.put("userProducts", _userproducts);Debug.locals.put("userProducts", _userproducts);
 BA.debugLineNum = 230;BA.debugLine="RAF.Initialize(SaeloZahra.Dir,\"userProducts\",Fa";
Debug.ShouldStop(32);
login_act.mostCurrent._raf.runVoidMethod ("Initialize",(Object)(login_act.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(BA.ObjectToString("userProducts")),(Object)(login_act.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 231;BA.debugLine="RAF.WriteObject(userProducts, True,RAF.CurrentP";
Debug.ShouldStop(64);
login_act.mostCurrent._raf.runVoidMethod ("WriteObject",(Object)((_userproducts.getObject())),(Object)(login_act.mostCurrent.__c.getField(true,"True")),(Object)(login_act.mostCurrent._raf.getField(true,"CurrentPosition")));
 BA.debugLineNum = 232;BA.debugLine="If location.Contains(\",\") And location.Length<8";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean(".",_location.runMethod(true,"contains",(Object)(RemoteObject.createImmutable(",")))) && RemoteObject.solveBoolean("<",_location.runMethod(true,"length"),BA.numberCast(double.class, 8))) { 
 BA.debugLineNum = 233;BA.debugLine="ToastMessageShow(SaeloZahra.CSB(\"اطلاعات شما ن";
Debug.ShouldStop(256);
login_act.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(login_act.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,login_act.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("اطلاعات شما ناقص است"),login_act.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("سریعا آنها را از بخش زیر اصلاح کنید")))).getObject())),(Object)(login_act.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 234;BA.debugLine="StartActivity(SaeloZahra.PI.OpenBrowser(SaeloZ";
Debug.ShouldStop(512);
login_act.mostCurrent.__c.runVoidMethod ("StartActivity",login_act.processBA,(Object)((login_act.mostCurrent._saelozahra._pi /*RemoteObject*/ .runMethod(false,"OpenBrowser",(Object)(RemoteObject.concat(login_act.mostCurrent._saelozahra._site_url /*RemoteObject*/ ,RemoteObject.createImmutable("reseller/panel/")))))));
 BA.debugLineNum = 235;BA.debugLine="ToastMessageShow(SaeloZahra.CSB(\"نام کاربری و";
Debug.ShouldStop(1024);
login_act.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(login_act.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,login_act.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("نام کاربری و کلمه عبور شما ، شماره تلفن همراه شماست"))).getObject())),(Object)(login_act.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 238;BA.debugLine="components = Regex.Split(\",\", location)";
Debug.ShouldStop(8192);
login_act.mostCurrent._components = login_act.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(",")),(Object)(_location));
 BA.debugLineNum = 240;BA.debugLine="File.WriteString(SaeloZahra.dir,\"lat\" ,	compone";
Debug.ShouldStop(32768);
login_act.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(login_act.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(BA.ObjectToString("lat")),(Object)(login_act.mostCurrent._components.getArrayElement(true,BA.numberCast(int.class, 0))));
 BA.debugLineNum = 241;BA.debugLine="File.WriteString(SaeloZahra.dir,\"lng\" ,	compone";
Debug.ShouldStop(65536);
login_act.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(login_act.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(BA.ObjectToString("lng")),(Object)(login_act.mostCurrent._components.getArrayElement(true,BA.numberCast(int.class, 1))));
 BA.debugLineNum = 243;BA.debugLine="Starter.MyLocation.Initialize2(components(0),co";
Debug.ShouldStop(262144);
login_act.mostCurrent._starter._mylocation /*RemoteObject*/ .runVoidMethod ("Initialize2",(Object)(login_act.mostCurrent._components.getArrayElement(true,BA.numberCast(int.class, 0))),(Object)(login_act.mostCurrent._components.getArrayElement(true,BA.numberCast(int.class, 1))));
 BA.debugLineNum = 244;BA.debugLine="Starter.myLocation.Latitude =File.ReadString(Sa";
Debug.ShouldStop(524288);
login_act.mostCurrent._starter._mylocation /*RemoteObject*/ .runMethod(true,"setLatitude",BA.numberCast(double.class, login_act.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(login_act.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("lat")))));
 BA.debugLineNum = 245;BA.debugLine="Starter.myLocation.Longitude=File.ReadString(Sa";
Debug.ShouldStop(1048576);
login_act.mostCurrent._starter._mylocation /*RemoteObject*/ .runMethod(true,"setLongitude",BA.numberCast(double.class, login_act.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(login_act.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("lng")))));
 BA.debugLineNum = 247;BA.debugLine="LogColor(components(0)&\",,,,\"&components(1),Col";
Debug.ShouldStop(4194304);
login_act.mostCurrent.__c.runVoidMethod ("LogImpl","41703983",RemoteObject.concat(login_act.mostCurrent._components.getArrayElement(true,BA.numberCast(int.class, 0)),RemoteObject.createImmutable(",,,,"),login_act.mostCurrent._components.getArrayElement(true,BA.numberCast(int.class, 1))),login_act.mostCurrent.__c.getField(false,"Colors").getField(true,"Blue"));
 BA.debugLineNum = 248;BA.debugLine="LogColor(job.GetString,Colors.Yellow)";
Debug.ShouldStop(8388608);
login_act.mostCurrent.__c.runVoidMethod ("LogImpl","41703984",_job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_getstring" /*RemoteObject*/ ),login_act.mostCurrent.__c.getField(false,"Colors").getField(true,"Yellow"));
 BA.debugLineNum = 254;BA.debugLine="Dim RegDate As Long = root.Get(\"reg_date\")";
Debug.ShouldStop(536870912);
_regdate = BA.numberCast(long.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("reg_date")))));Debug.locals.put("RegDate", _regdate);Debug.locals.put("RegDate", _regdate);
 BA.debugLineNum = 255;BA.debugLine="Log(\"RegDate: \"&RegDate)";
Debug.ShouldStop(1073741824);
login_act.mostCurrent.__c.runVoidMethod ("LogImpl","41703991",RemoteObject.concat(RemoteObject.createImmutable("RegDate: "),_regdate),0);
 BA.debugLineNum = 256;BA.debugLine="Log(RegDate*1000)";
Debug.ShouldStop(-2147483648);
login_act.mostCurrent.__c.runVoidMethod ("LogImpl","41703992",BA.NumberToString(RemoteObject.solve(new RemoteObject[] {_regdate,RemoteObject.createImmutable(1000)}, "*",0, 2)),0);
 BA.debugLineNum = 257;BA.debugLine="Log(DateTime.Now)";
Debug.ShouldStop(1);
login_act.mostCurrent.__c.runVoidMethod ("LogImpl","41703993",BA.NumberToString(login_act.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")),0);
 BA.debugLineNum = 258;BA.debugLine="LogColor(DateUtils.PeriodBetween(RegDate*1000,D";
Debug.ShouldStop(2);
login_act.mostCurrent.__c.runVoidMethod ("LogImpl","41703994",BA.NumberToString(login_act.mostCurrent._dateutils.runMethod(false,"_periodbetween" /*RemoteObject*/ ,login_act.mostCurrent.activityBA,(Object)(RemoteObject.solve(new RemoteObject[] {_regdate,RemoteObject.createImmutable(1000)}, "*",0, 2)),(Object)(login_act.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"))).getField(true,"Years" /*RemoteObject*/ )),login_act.mostCurrent.__c.getField(false,"Colors").getField(true,"Green"));
 BA.debugLineNum = 259;BA.debugLine="LogColor(DateUtils.PeriodBetween(RegDate*1000,D";
Debug.ShouldStop(4);
login_act.mostCurrent.__c.runVoidMethod ("LogImpl","41703995",BA.NumberToString(login_act.mostCurrent._dateutils.runMethod(false,"_periodbetween" /*RemoteObject*/ ,login_act.mostCurrent.activityBA,(Object)(RemoteObject.solve(new RemoteObject[] {_regdate,RemoteObject.createImmutable(1000)}, "*",0, 2)),(Object)(login_act.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"))).getField(true,"Months" /*RemoteObject*/ )),login_act.mostCurrent.__c.getField(false,"Colors").getField(true,"Green"));
 BA.debugLineNum = 260;BA.debugLine="LogColor(DateUtils.PeriodBetween(RegDate*1000,D";
Debug.ShouldStop(8);
login_act.mostCurrent.__c.runVoidMethod ("LogImpl","41703996",BA.NumberToString(login_act.mostCurrent._dateutils.runMethod(false,"_periodbetween" /*RemoteObject*/ ,login_act.mostCurrent.activityBA,(Object)(RemoteObject.solve(new RemoteObject[] {_regdate,RemoteObject.createImmutable(1000)}, "*",0, 2)),(Object)(login_act.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"))).getField(true,"Days" /*RemoteObject*/ )),login_act.mostCurrent.__c.getField(false,"Colors").getField(true,"Green"));
 BA.debugLineNum = 262;BA.debugLine="If DateUtils.PeriodBetween(RegDate*1000,DateTim";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean(">",login_act.mostCurrent._dateutils.runMethod(false,"_periodbetween" /*RemoteObject*/ ,login_act.mostCurrent.activityBA,(Object)(RemoteObject.solve(new RemoteObject[] {_regdate,RemoteObject.createImmutable(1000)}, "*",0, 2)),(Object)(login_act.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"))).getField(true,"Years" /*RemoteObject*/ ),BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean(">",login_act.mostCurrent._dateutils.runMethod(false,"_periodbetween" /*RemoteObject*/ ,login_act.mostCurrent.activityBA,(Object)(RemoteObject.solve(new RemoteObject[] {_regdate,RemoteObject.createImmutable(1000)}, "*",0, 2)),(Object)(login_act.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"))).getField(true,"Months" /*RemoteObject*/ ),BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean(">",login_act.mostCurrent._dateutils.runMethod(false,"_periodbetween" /*RemoteObject*/ ,login_act.mostCurrent.activityBA,(Object)(RemoteObject.solve(new RemoteObject[] {_regdate,RemoteObject.createImmutable(1000)}, "*",0, 2)),(Object)(login_act.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"))).getField(true,"Days" /*RemoteObject*/ ),BA.numberCast(double.class, login_act.mostCurrent._registeract._tedadrooztrial /*RemoteObject*/ ))) { 
 BA.debugLineNum = 263;BA.debugLine="MoreThanTrialDays=True";
Debug.ShouldStop(64);
login_act._morethantrialdays = login_act.mostCurrent.__c.getField(true,"True");
 };
 BA.debugLineNum = 266;BA.debugLine="If root.Get(\"payed\")==\"1\" Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("payed")))),RemoteObject.createImmutable(("1")))) { 
 BA.debugLineNum = 267;BA.debugLine="ItIsPayed=True";
Debug.ShouldStop(1024);
login_act._itispayed = login_act.mostCurrent.__c.getField(true,"True");
 }else 
{ BA.debugLineNum = 268;BA.debugLine="Else if MoreThanTrialDays Then";
Debug.ShouldStop(2048);
if (login_act._morethantrialdays.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 269;BA.debugLine="ItIsPayed=False";
Debug.ShouldStop(4096);
login_act._itispayed = login_act.mostCurrent.__c.getField(true,"False");
 }else 
{ BA.debugLineNum = 270;BA.debugLine="Else if Not(MoreThanTrialDays) Then";
Debug.ShouldStop(8192);
if (login_act.mostCurrent.__c.runMethod(true,"Not",(Object)(login_act._morethantrialdays)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 271;BA.debugLine="ItIsPayed=True";
Debug.ShouldStop(16384);
login_act._itispayed = login_act.mostCurrent.__c.getField(true,"True");
 }else {
 BA.debugLineNum = 273;BA.debugLine="ItIsPayed=False";
Debug.ShouldStop(65536);
login_act._itispayed = login_act.mostCurrent.__c.getField(true,"False");
 }}}
;
 BA.debugLineNum = 276;BA.debugLine="File.WriteMap(SaeloZahra.dir,\"user.dat\",root)";
Debug.ShouldStop(524288);
login_act.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteMap",(Object)(login_act.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(BA.ObjectToString("user.dat")),(Object)(_root));
 BA.debugLineNum = 278;BA.debugLine="ToastMessageShow(SaeloZahra.CSB(root.Get(\"name\"";
Debug.ShouldStop(2097152);
login_act.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(login_act.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,login_act.mostCurrent.activityBA,(Object)(RemoteObject.concat(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name")))),RemoteObject.createImmutable(" عزیز، خوش آمدید")))).getObject())),(Object)(login_act.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 280;BA.debugLine="CallSubDelayed2(FirebaseMessaging, \"SubscribeTo";
Debug.ShouldStop(8388608);
login_act.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",login_act.processBA,(Object)((login_act.mostCurrent._firebasemessaging.getObject())),(Object)(BA.ObjectToString("SubscribeToTopics")),(Object)((login_act.mostCurrent._username_et.runMethod(true,"getText"))));
 BA.debugLineNum = 281;BA.debugLine="CallSubDelayed2(FirebaseMessaging, \"SubscribeTo";
Debug.ShouldStop(16777216);
login_act.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",login_act.processBA,(Object)((login_act.mostCurrent._firebasemessaging.getObject())),(Object)(BA.ObjectToString("SubscribeToTopics")),(Object)((RemoteObject.concat(RemoteObject.createImmutable("namayande_"),_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("moaref"))))))));
 BA.debugLineNum = 282;BA.debugLine="Starter.usrnm = username_et.Text";
Debug.ShouldStop(33554432);
login_act.mostCurrent._starter._usrnm /*RemoteObject*/  = login_act.mostCurrent._username_et.runMethod(true,"getText");
 BA.debugLineNum = 283;BA.debugLine="File.WriteString(SaeloZahra.dir,\"usrnm\",usernam";
Debug.ShouldStop(67108864);
login_act.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(login_act.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(BA.ObjectToString("usrnm")),(Object)(login_act.mostCurrent._username_et.runMethod(true,"getText")));
 BA.debugLineNum = 284;BA.debugLine="File.WriteString(SaeloZahra.dir,\"pswd\",password";
Debug.ShouldStop(134217728);
login_act.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(login_act.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(BA.ObjectToString("pswd")),(Object)(login_act.mostCurrent._password_et.runMethod(true,"getText")));
 BA.debugLineNum = 288;BA.debugLine="Activity.Finish";
Debug.ShouldStop(-2147483648);
login_act.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 289;BA.debugLine="SaeloZahra.beep(\"button-20.mp3\")";
Debug.ShouldStop(1);
login_act.mostCurrent._saelozahra.runVoidMethod ("_beep" /*RemoteObject*/ ,login_act.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("button-20.mp3")));
 BA.debugLineNum = 290;BA.debugLine="StartActivity(HomeAct)";
Debug.ShouldStop(2);
login_act.mostCurrent.__c.runVoidMethod ("StartActivity",login_act.processBA,(Object)((login_act.mostCurrent._homeact.getObject())));
 BA.debugLineNum = 291;BA.debugLine="SaeloZahra.SetAnimation(\"file3\",\"file4\")";
Debug.ShouldStop(4);
login_act.mostCurrent._saelozahra.runVoidMethod ("_setanimation" /*RemoteObject*/ ,login_act.mostCurrent.activityBA,(Object)(BA.ObjectToString("file3")),(Object)(RemoteObject.createImmutable("file4")));
 BA.debugLineNum = 294;BA.debugLine="ProgressDialogShow2(SaeloZahra.CSB(\"در حال دریا";
Debug.ShouldStop(32);
login_act.mostCurrent.__c.runVoidMethod ("ProgressDialogShow2",login_act.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(login_act.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,login_act.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("در حال دریافت وضعیت آب و هوا"))).getObject())),(Object)(login_act.mostCurrent.__c.getField(true,"True")));
 }}
;
 }else {
 BA.debugLineNum = 302;BA.debugLine="If job.ErrorMessage.Contains(\"Unable to resolve";
Debug.ShouldStop(8192);
if (_job.getField(true,"_errormessage" /*RemoteObject*/ ).runMethod(true,"contains",(Object)(RemoteObject.createImmutable("Unable to resolve host"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 303;BA.debugLine="ToastMessageShow(SaeloZahra.CSB(\" اینترنتتون وص";
Debug.ShouldStop(16384);
login_act.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(login_act.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,login_act.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable(" اینترنتتون وصل نیست "))).getObject())),(Object)(login_act.mostCurrent.__c.getField(true,"True")));
 }else {
 BA.debugLineNum = 305;BA.debugLine="ToastMessageShow(SaeloZahra.CSB(\" خطا در ورود \"";
Debug.ShouldStop(65536);
login_act.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(login_act.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,login_act.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable(" خطا در ورود "))),login_act.mostCurrent.__c.getField(true,"CRLF"),_job.getField(true,"_errormessage" /*RemoteObject*/ )))),(Object)(login_act.mostCurrent.__c.getField(true,"True")));
 };
 };
 BA.debugLineNum = 308;BA.debugLine="job.Release";
Debug.ShouldStop(524288);
_job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 309;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _login_btn_click() throws Exception{
try {
		Debug.PushSubsStack("login_btn_Click (login_act) ","login_act",2,login_act.mostCurrent.activityBA,login_act.mostCurrent,179);
if (RapidSub.canDelegate("login_btn_click")) { return ir.saelozahra.damaara.mazraeyeman.login_act.remoteMe.runUserSub(false, "login_act","login_btn_click");}
 BA.debugLineNum = 179;BA.debugLine="Sub login_btn_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 185;BA.debugLine="If File.Exists(SaeloZahra.dir,\"expire\") Then";
Debug.ShouldStop(16777216);
if (login_act.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(login_act.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("expire"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 186;BA.debugLine="ToastMessageShow(SaeloZahra.CSB(\"نرم افزار شما ا";
Debug.ShouldStop(33554432);
login_act.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(login_act.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,login_act.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("نرم افزار شما اکسپایر شده است"),login_act.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("با پشتیبانی تماس بگیرید")))).getObject())),(Object)(login_act.mostCurrent.__c.getField(true,"True")));
 }else 
{ BA.debugLineNum = 187;BA.debugLine="Else If username_et.Text.Length<4 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("<",login_act.mostCurrent._username_et.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 4))) { 
 BA.debugLineNum = 188;BA.debugLine="username_et.RequestFocus";
Debug.ShouldStop(134217728);
login_act.mostCurrent._username_et.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 189;BA.debugLine="ToastMessageShow(\"نام کاربری خود را وارد کنید\",F";
Debug.ShouldStop(268435456);
login_act.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("نام کاربری خود را وارد کنید")),(Object)(login_act.mostCurrent.__c.getField(true,"False")));
 }else 
{ BA.debugLineNum = 190;BA.debugLine="Else If password_et.Text.Length<4 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("<",login_act.mostCurrent._password_et.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 4))) { 
 BA.debugLineNum = 191;BA.debugLine="password_et.RequestFocus";
Debug.ShouldStop(1073741824);
login_act.mostCurrent._password_et.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 192;BA.debugLine="ToastMessageShow(\"کلمه عبور خود را وارد کنید\",Fa";
Debug.ShouldStop(-2147483648);
login_act.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("کلمه عبور خود را وارد کنید")),(Object)(login_act.mostCurrent.__c.getField(true,"False")));
 }else {
 BA.debugLineNum = 194;BA.debugLine="job1.Initialize(\"job1\",Me)";
Debug.ShouldStop(2);
login_act.mostCurrent._job1.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_initialize" /*RemoteObject*/ ,login_act.processBA,(Object)(BA.ObjectToString("job1")),(Object)(login_act.getObject()));
 BA.debugLineNum = 195;BA.debugLine="job1.PostString(SaeloZahra.json_url&\"login_api.p";
Debug.ShouldStop(4);
login_act.mostCurrent._job1.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(login_act.mostCurrent._saelozahra._json_url /*RemoteObject*/ ,RemoteObject.createImmutable("login_api.php"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("user="),login_act.mostCurrent._username_et.runMethod(true,"getText"),RemoteObject.createImmutable("&pass="),login_act.mostCurrent._password_et.runMethod(true,"getText"),RemoteObject.createImmutable("&pushNotificationCode="),login_act.mostCurrent._firebasemessaging._mytoken /*RemoteObject*/ )));
 BA.debugLineNum = 196;BA.debugLine="ProgressDialogShow(SaeloZahra.CSB(\"در حال ورود..";
Debug.ShouldStop(8);
login_act.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",login_act.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(login_act.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,login_act.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("در حال ورود..."))).getObject())));
 }}}
;
 BA.debugLineNum = 198;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 8;BA.debugLine="Dim ItIsPayed As Boolean = False";
login_act._itispayed = login_act.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _register_btn_click() throws Exception{
try {
		Debug.PushSubsStack("Register_btn_Click (login_act) ","login_act",2,login_act.mostCurrent.activityBA,login_act.mostCurrent,337);
if (RapidSub.canDelegate("register_btn_click")) { return ir.saelozahra.damaara.mazraeyeman.login_act.remoteMe.runUserSub(false, "login_act","register_btn_click");}
 BA.debugLineNum = 337;BA.debugLine="Sub Register_btn_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 338;BA.debugLine="SH.convertActivityFromTranslucent";
Debug.ShouldStop(131072);
login_act.mostCurrent._sh.runVoidMethod ("convertActivityFromTranslucent",login_act.mostCurrent.activityBA);
 BA.debugLineNum = 339;BA.debugLine="SaeloZahra.beep(\"button-20.mp3\")";
Debug.ShouldStop(262144);
login_act.mostCurrent._saelozahra.runVoidMethod ("_beep" /*RemoteObject*/ ,login_act.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("button-20.mp3")));
 BA.debugLineNum = 340;BA.debugLine="StartActivity(RegisterAct)";
Debug.ShouldStop(524288);
login_act.mostCurrent.__c.runVoidMethod ("StartActivity",login_act.processBA,(Object)((login_act.mostCurrent._registeract.getObject())));
 BA.debugLineNum = 341;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _temptip_click() throws Exception{
try {
		Debug.PushSubsStack("Temptip_Click (login_act) ","login_act",2,login_act.mostCurrent.activityBA,login_act.mostCurrent,156);
if (RapidSub.canDelegate("temptip_click")) { return ir.saelozahra.damaara.mazraeyeman.login_act.remoteMe.runUserSub(false, "login_act","temptip_click");}
RemoteObject _tt = RemoteObject.declareNull("de.donmanfred.SimpleTooltipBuilder");
 BA.debugLineNum = 156;BA.debugLine="Sub Temptip_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 157;BA.debugLine="Dim tt As SimpleTooltipBuilder";
Debug.ShouldStop(268435456);
_tt = RemoteObject.createNew ("de.donmanfred.SimpleTooltipBuilder");Debug.locals.put("tt", _tt);
 BA.debugLineNum = 158;BA.debugLine="tt.Initialize(\"STT\")";
Debug.ShouldStop(536870912);
_tt.runVoidMethod ("Initialize",login_act.processBA,(Object)(RemoteObject.createImmutable("STT")));
 BA.debugLineNum = 159;BA.debugLine="tt.animated(True).animationDuration(1313).backgro";
Debug.ShouldStop(1073741824);
_tt.runMethod(false,"animated",(Object)(login_act.mostCurrent.__c.getField(true,"True"))).runMethod(false,"animationDuration",(Object)(BA.numberCast(long.class, 1313))).runMethod(false,"backgroundColor",(Object)(login_act.mostCurrent._saelozahra._color /*RemoteObject*/ )).runMethod(false,"arrowColor",(Object)(login_act.mostCurrent._saelozahra._color /*RemoteObject*/ )).runMethod(false,"dismissOnInsideTouch",(Object)(login_act.mostCurrent.__c.getField(true,"True"))).runMethod(false,"dismissOnOutsideTouch",(Object)(login_act.mostCurrent.__c.getField(true,"True"))).runMethod(false,"modal",(Object)(login_act.mostCurrent.__c.getField(true,"True"))).runMethod(false,"text",(Object)(BA.ObjectToString(login_act.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,login_act.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("ثبت‌نام باغداران و کشاورزان")))))).runMethod(false,"textColor",(Object)(login_act.mostCurrent.__c.getField(false,"Colors").getField(true,"White"))).runMethod(false,"anchorView",(Object)((login_act.mostCurrent._register_btn.getObject()))).runMethod(false,"gravityStart").runVoidMethod ("build");
 BA.debugLineNum = 160;BA.debugLine="tt.show";
Debug.ShouldStop(-2147483648);
_tt.runVoidMethod ("show");
 BA.debugLineNum = 161;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tip_click() throws Exception{
try {
		Debug.PushSubsStack("tip_Click (login_act) ","login_act",2,login_act.mostCurrent.activityBA,login_act.mostCurrent,162);
if (RapidSub.canDelegate("tip_click")) { return ir.saelozahra.damaara.mazraeyeman.login_act.remoteMe.runUserSub(false, "login_act","tip_click");}
 BA.debugLineNum = 162;BA.debugLine="Sub tip_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 163;BA.debugLine="TIP.Initialize(\"tip2\")";
Debug.ShouldStop(4);
login_act.mostCurrent._tip.runVoidMethod ("Initialize",login_act.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("tip2")));
 BA.debugLineNum = 164;BA.debugLine="TIP.setTitle(SaeloZahra.csb(\"ورود\")).setButtonTex";
Debug.ShouldStop(8);
login_act.mostCurrent._tip.runMethod(false,"setTitle",(Object)(BA.ObjectToString(login_act.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,login_act.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("ورود")))))).runMethod(false,"setButtonText",(Object)(BA.ObjectToString(login_act.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,login_act.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("شروع")))))).runMethod(false,"setDescription",(Object)(BA.ObjectToString(login_act.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,login_act.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("در صورتیکه قبلا ثبت نام نموده اید "),login_act.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(" نام کاربری و رمز عبور هردو بصورت پیش فرض شماره موبایل شما قرار داده شده است."))))))).runMethod(false,"setTarget",(Object)((login_act.mostCurrent._login_btn.getObject()))).runVoidMethod ("build");
 BA.debugLineNum = 165;BA.debugLine="TIP.setDelay(313)";
Debug.ShouldStop(16);
login_act.mostCurrent._tip.runVoidMethod ("setDelay",(Object)(BA.numberCast(int.class, 313)));
 BA.debugLineNum = 166;BA.debugLine="TIP.show";
Debug.ShouldStop(32);
login_act.mostCurrent._tip.runVoidMethod ("show");
 BA.debugLineNum = 167;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tip2_click() throws Exception{
try {
		Debug.PushSubsStack("tip2_Click (login_act) ","login_act",2,login_act.mostCurrent.activityBA,login_act.mostCurrent,153);
if (RapidSub.canDelegate("tip2_click")) { return ir.saelozahra.damaara.mazraeyeman.login_act.remoteMe.runUserSub(false, "login_act","tip2_click");}
 BA.debugLineNum = 153;BA.debugLine="Sub tip2_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 154;BA.debugLine="Temptip_Click";
Debug.ShouldStop(33554432);
_temptip_click();
 BA.debugLineNum = 155;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _username_et_focuschanged(RemoteObject _hasfocus) throws Exception{
try {
		Debug.PushSubsStack("username_et_FocusChanged (login_act) ","login_act",2,login_act.mostCurrent.activityBA,login_act.mostCurrent,323);
if (RapidSub.canDelegate("username_et_focuschanged")) { return ir.saelozahra.damaara.mazraeyeman.login_act.remoteMe.runUserSub(false, "login_act","username_et_focuschanged", _hasfocus);}
Debug.locals.put("HasFocus", _hasfocus);
 BA.debugLineNum = 323;BA.debugLine="Sub username_et_FocusChanged (HasFocus As Boolean)";
Debug.ShouldStop(4);
 BA.debugLineNum = 327;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _username_et_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("username_et_TextChanged (login_act) ","login_act",2,login_act.mostCurrent.activityBA,login_act.mostCurrent,329);
if (RapidSub.canDelegate("username_et_textchanged")) { return ir.saelozahra.damaara.mazraeyeman.login_act.remoteMe.runUserSub(false, "login_act","username_et_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 329;BA.debugLine="Sub username_et_TextChanged (Old As String, New As";
Debug.ShouldStop(256);
 BA.debugLineNum = 330;BA.debugLine="If New.Length==11 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_new.runMethod(true,"length"),BA.numberCast(double.class, 11))) { 
 BA.debugLineNum = 331;BA.debugLine="File.WriteString(SaeloZahra.dir,\"usrnm\",New)";
Debug.ShouldStop(1024);
login_act.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(login_act.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(BA.ObjectToString("usrnm")),(Object)(_new));
 BA.debugLineNum = 332;BA.debugLine="File.WriteString(SaeloZahra.dir,\"pswd\",New)";
Debug.ShouldStop(2048);
login_act.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(login_act.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(BA.ObjectToString("pswd")),(Object)(_new));
 };
 BA.debugLineNum = 335;BA.debugLine="End Sub";
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