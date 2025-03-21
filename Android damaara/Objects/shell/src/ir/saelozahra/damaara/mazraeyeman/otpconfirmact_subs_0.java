package ir.saelozahra.damaara.mazraeyeman;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class otpconfirmact_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (otpconfirmact) ","otpconfirmact",19,otpconfirmact.mostCurrent.activityBA,otpconfirmact.mostCurrent,20);
if (RapidSub.canDelegate("activity_create")) { return ir.saelozahra.damaara.mazraeyeman.otpconfirmact.remoteMe.runUserSub(false, "otpconfirmact","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 20;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 22;BA.debugLine="Activity.LoadLayout(\"OtpNewLayout\")";
Debug.ShouldStop(2097152);
otpconfirmact.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("OtpNewLayout")),otpconfirmact.mostCurrent.activityBA);
 BA.debugLineNum = 23;BA.debugLine="cd.Initialize2(Colors.Transparent,14dip,2dip,Sael";
Debug.ShouldStop(4194304);
otpconfirmact.mostCurrent._cd.runVoidMethod ("Initialize2",(Object)(otpconfirmact.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent")),(Object)(otpconfirmact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 14)))),(Object)(otpconfirmact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(otpconfirmact.mostCurrent._saelozahra._colorlight /*RemoteObject*/ ));
 BA.debugLineNum = 24;BA.debugLine="username_et.Background=cd";
Debug.ShouldStop(8388608);
otpconfirmact.mostCurrent._username_et.runMethod(false,"setBackground",(otpconfirmact.mostCurrent._cd.getObject()));
 BA.debugLineNum = 25;BA.debugLine="username_et.Typeface=SaeloZahra.font";
Debug.ShouldStop(16777216);
otpconfirmact.mostCurrent._username_et.runMethod(false,"setTypeface",(otpconfirmact.mostCurrent._saelozahra._font /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 26;BA.debugLine="username_et.Gravity=Bit.Or(Gravity.CENTER_HORIZON";
Debug.ShouldStop(33554432);
otpconfirmact.mostCurrent._username_et.runMethod(true,"setGravity",otpconfirmact.mostCurrent.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(otpconfirmact.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL")),(Object)(otpconfirmact.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL"))));
 BA.debugLineNum = 27;BA.debugLine="login_btn.Typeface=SaeloZahra.font";
Debug.ShouldStop(67108864);
otpconfirmact.mostCurrent._login_btn.runMethod(false,"setTypeface",(otpconfirmact.mostCurrent._saelozahra._font /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 29;BA.debugLine="ActionBar.Color		= SaeloZahra.Color";
Debug.ShouldStop(268435456);
otpconfirmact.mostCurrent._actionbar.runVoidMethod ("setColor",otpconfirmact.mostCurrent._saelozahra._color /*RemoteObject*/ );
 BA.debugLineNum = 30;BA.debugLine="ActionBar.title		= SaeloZahra.CSB(\"تائید هویت\")";
Debug.ShouldStop(536870912);
otpconfirmact.mostCurrent._actionbar.runMethod(true,"setTitle",BA.ObjectToCharSequence(otpconfirmact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,otpconfirmact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("تائید هویت"))).getObject()));
 BA.debugLineNum = 31;BA.debugLine="ActionBar.SubTitle	= SaeloZahra.CSB(\"کد ارسال شده";
Debug.ShouldStop(1073741824);
otpconfirmact.mostCurrent._actionbar.runMethod(true,"setSubTitle",BA.ObjectToCharSequence(otpconfirmact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,otpconfirmact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("کد ارسال شده با پیامک را وارد کنید"))).getObject()));
 BA.debugLineNum = 34;BA.debugLine="If GetDeviceLayoutValues.Height > 3000 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean(">",otpconfirmact.mostCurrent.__c.runMethod(false,"GetDeviceLayoutValues",otpconfirmact.mostCurrent.activityBA).getField(true,"Height"),BA.numberCast(double.class, 3000))) { 
 BA.debugLineNum = 35;BA.debugLine="SaeloZahra.SetNinePatchButton(login_btn,\"btn_gre";
Debug.ShouldStop(4);
otpconfirmact.mostCurrent._saelozahra.runVoidMethod ("_setninepatchbutton" /*RemoteObject*/ ,otpconfirmact.mostCurrent.activityBA,(Object)(otpconfirmact.mostCurrent._login_btn),(Object)(BA.ObjectToString("btn_green")),(Object)(BA.ObjectToString("btn_green_pressed")),(Object)(RemoteObject.createImmutable("")));
 };
 BA.debugLineNum = 38;BA.debugLine="username_et.Top=username_et.Top+20dip";
Debug.ShouldStop(32);
otpconfirmact.mostCurrent._username_et.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {otpconfirmact.mostCurrent._username_et.runMethod(true,"getTop"),otpconfirmact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "+",1, 1));
 BA.debugLineNum = 39;BA.debugLine="username_et.Hint=\"کد تائید عضویت\"";
Debug.ShouldStop(64);
otpconfirmact.mostCurrent._username_et.runMethod(true,"setHint",BA.ObjectToString("کد تائید عضویت"));
 BA.debugLineNum = 40;BA.debugLine="username_et.InputType=username_et.INPUT_TYPE_NUMB";
Debug.ShouldStop(128);
otpconfirmact.mostCurrent._username_et.runMethod(true,"setInputType",otpconfirmact.mostCurrent._username_et.getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 43;BA.debugLine="login_btn.Color = SaeloZahra.Color";
Debug.ShouldStop(1024);
otpconfirmact.mostCurrent._login_btn.runVoidMethod ("setColor",otpconfirmact.mostCurrent._saelozahra._color /*RemoteObject*/ );
 BA.debugLineNum = 44;BA.debugLine="login_btn.textColor = Colors.White";
Debug.ShouldStop(2048);
otpconfirmact.mostCurrent._login_btn.runMethod(true,"setTextColor",otpconfirmact.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 45;BA.debugLine="login_btn.Text=\"تائید ورود\"";
Debug.ShouldStop(4096);
otpconfirmact.mostCurrent._login_btn.runMethod(true,"setText",BA.ObjectToCharSequence("تائید ورود"));
 BA.debugLineNum = 46;BA.debugLine="Tmr.Initialize(\"Tmr\",1000)";
Debug.ShouldStop(8192);
otpconfirmact._tmr.runVoidMethod ("Initialize",otpconfirmact.processBA,(Object)(BA.ObjectToString("Tmr")),(Object)(BA.numberCast(long.class, 1000)));
 BA.debugLineNum = 47;BA.debugLine="Tmr.Enabled=True";
Debug.ShouldStop(16384);
otpconfirmact._tmr.runMethod(true,"setEnabled",otpconfirmact.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 48;BA.debugLine="counter = 300";
Debug.ShouldStop(32768);
otpconfirmact._counter = BA.numberCast(int.class, 300);
 BA.debugLineNum = 51;BA.debugLine="TimerLbl.Typeface=SaeloZahra.fontBold";
Debug.ShouldStop(262144);
otpconfirmact.mostCurrent._timerlbl.runMethod(false,"setTypeface",(otpconfirmact.mostCurrent._saelozahra._fontbold /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 52;BA.debugLine="TimerLbl.Text=\"زمان باقیمانده\"";
Debug.ShouldStop(524288);
otpconfirmact.mostCurrent._timerlbl.runMethod(true,"setText",BA.ObjectToCharSequence("زمان باقیمانده"));
 BA.debugLineNum = 53;BA.debugLine="TimerLbl.Gravity=Bit.Or(Gravity.CENTER_HORIZONTAL";
Debug.ShouldStop(1048576);
otpconfirmact.mostCurrent._timerlbl.runMethod(true,"setGravity",otpconfirmact.mostCurrent.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(otpconfirmact.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL")),(Object)(otpconfirmact.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL"))));
 BA.debugLineNum = 55;BA.debugLine="SaeloZahra.SetStatusBarColor(SaeloZahra.ColorDark";
Debug.ShouldStop(4194304);
otpconfirmact.mostCurrent._saelozahra.runVoidMethod ("_setstatusbarcolor" /*RemoteObject*/ ,otpconfirmact.mostCurrent.activityBA,(Object)(otpconfirmact.mostCurrent._saelozahra._colordark /*RemoteObject*/ ));
 BA.debugLineNum = 57;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("Activity_Pause (otpconfirmact) ","otpconfirmact",19,otpconfirmact.mostCurrent.activityBA,otpconfirmact.mostCurrent,63);
if (RapidSub.canDelegate("activity_pause")) { return ir.saelozahra.damaara.mazraeyeman.otpconfirmact.remoteMe.runUserSub(false, "otpconfirmact","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 63;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 65;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("Activity_Resume (otpconfirmact) ","otpconfirmact",19,otpconfirmact.mostCurrent.activityBA,otpconfirmact.mostCurrent,59);
if (RapidSub.canDelegate("activity_resume")) { return ir.saelozahra.damaara.mazraeyeman.otpconfirmact.remoteMe.runUserSub(false, "otpconfirmact","activity_resume");}
 BA.debugLineNum = 59;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 60;BA.debugLine="Log(GetDeviceLayoutValues.Height)";
Debug.ShouldStop(134217728);
otpconfirmact.mostCurrent.__c.runVoidMethod ("LogImpl","419660801",BA.NumberToString(otpconfirmact.mostCurrent.__c.runMethod(false,"GetDeviceLayoutValues",otpconfirmact.mostCurrent.activityBA).getField(true,"Height")),0);
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _finishvas() throws Exception{
try {
		Debug.PushSubsStack("FinishVAS (otpconfirmact) ","otpconfirmact",19,otpconfirmact.mostCurrent.activityBA,otpconfirmact.mostCurrent,176);
if (RapidSub.canDelegate("finishvas")) { return ir.saelozahra.damaara.mazraeyeman.otpconfirmact.remoteMe.runUserSub(false, "otpconfirmact","finishvas");}
 BA.debugLineNum = 176;BA.debugLine="Sub FinishVAS";
Debug.ShouldStop(32768);
 BA.debugLineNum = 177;BA.debugLine="Activity.Finish";
Debug.ShouldStop(65536);
otpconfirmact.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 178;BA.debugLine="CallSubDelayed(RegisterAct,\"SubmitForm\")";
Debug.ShouldStop(131072);
otpconfirmact.mostCurrent.__c.runVoidMethod ("CallSubDelayed",otpconfirmact.processBA,(Object)((otpconfirmact.mostCurrent._registeract.getObject())),(Object)(RemoteObject.createImmutable("SubmitForm")));
 BA.debugLineNum = 179;BA.debugLine="ProgressDialogShow(SaeloZahra.CSB(\"در حال ثبت اطل";
Debug.ShouldStop(262144);
otpconfirmact.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",otpconfirmact.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(otpconfirmact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,otpconfirmact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("در حال ثبت اطلاعات"))).getObject())));
 BA.debugLineNum = 180;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 10;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 11;BA.debugLine="Dim counter As Int = 300";
otpconfirmact._counter = BA.numberCast(int.class, 300);
 //BA.debugLineNum = 13;BA.debugLine="Dim cd As ColorDrawable";
otpconfirmact.mostCurrent._cd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");
 //BA.debugLineNum = 14;BA.debugLine="Private username_et As EditText";
otpconfirmact.mostCurrent._username_et = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 15;BA.debugLine="Private login_btn As Button";
otpconfirmact.mostCurrent._login_btn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Private TimerLbl As Label";
otpconfirmact.mostCurrent._timerlbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private ActionBar As ACToolBarDark";
otpconfirmact.mostCurrent._actionbar = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACToolbarDarkWrapper");
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("jobDone (otpconfirmact) ","otpconfirmact",19,otpconfirmact.mostCurrent.activityBA,otpconfirmact.mostCurrent,96);
if (RapidSub.canDelegate("jobdone")) { return ir.saelozahra.damaara.mazraeyeman.otpconfirmact.remoteMe.runUserSub(false, "otpconfirmact","jobdone", _job);}
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _statusinfo = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _statuscode = RemoteObject.createImmutable("");
RemoteObject _errorinfo = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msgdescription = RemoteObject.createImmutable("");
RemoteObject _errorcode = RemoteObject.createImmutable("");
Debug.locals.put("job", _job);
 BA.debugLineNum = 96;BA.debugLine="Sub jobDone(job As HttpJob)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 98;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(2);
otpconfirmact.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 100;BA.debugLine="If job.Success Then";
Debug.ShouldStop(8);
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 102;BA.debugLine="LogColor(job.GetString,Colors.DarkGray)";
Debug.ShouldStop(32);
otpconfirmact.mostCurrent.__c.runVoidMethod ("LogImpl","419857414",_job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_getstring" /*RemoteObject*/ ),otpconfirmact.mostCurrent.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 104;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(128);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 105;BA.debugLine="parser.Initialize(job.GetString)";
Debug.ShouldStop(256);
_parser.runVoidMethod ("Initialize",(Object)(_job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 106;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(512);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 107;BA.debugLine="Dim data As Map = root.Get(\"data\")";
Debug.ShouldStop(1024);
_data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_data = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("data")))));Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 108;BA.debugLine="Dim statusInfo As Map = data.Get(\"statusInfo\")";
Debug.ShouldStop(2048);
_statusinfo = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_statusinfo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("statusInfo")))));Debug.locals.put("statusInfo", _statusinfo);Debug.locals.put("statusInfo", _statusinfo);
 BA.debugLineNum = 109;BA.debugLine="Dim statusCode As String = statusInfo.Get(\"statu";
Debug.ShouldStop(4096);
_statuscode = BA.ObjectToString(_statusinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("statusCode")))));Debug.locals.put("statusCode", _statuscode);Debug.locals.put("statusCode", _statuscode);
 BA.debugLineNum = 111;BA.debugLine="If statusInfo.ContainsKey(\"errorInfo\") Then";
Debug.ShouldStop(16384);
if (_statusinfo.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("errorInfo")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 113;BA.debugLine="Dim errorInfo As Map = statusInfo.Get(\"errorInf";
Debug.ShouldStop(65536);
_errorinfo = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_errorinfo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _statusinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("errorInfo")))));Debug.locals.put("errorInfo", _errorinfo);Debug.locals.put("errorInfo", _errorinfo);
 BA.debugLineNum = 114;BA.debugLine="Dim msgDescription As String = errorInfo.Get(\"e";
Debug.ShouldStop(131072);
_msgdescription = BA.ObjectToString(_errorinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("errorDescription")))));Debug.locals.put("msgDescription", _msgdescription);Debug.locals.put("msgDescription", _msgdescription);
 BA.debugLineNum = 115;BA.debugLine="Dim errorCode As String = errorInfo.Get(\"errorC";
Debug.ShouldStop(262144);
_errorcode = BA.ObjectToString(_errorinfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("errorCode")))));Debug.locals.put("errorCode", _errorcode);Debug.locals.put("errorCode", _errorcode);
 BA.debugLineNum = 117;BA.debugLine="If errorCode==\"51026\" Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_errorcode,BA.ObjectToString("51026"))) { 
 BA.debugLineNum = 118;BA.debugLine="msgDescription=\"کد وارد شده اشتباه است\"";
Debug.ShouldStop(2097152);
_msgdescription = BA.ObjectToString("کد وارد شده اشتباه است");Debug.locals.put("msgDescription", _msgdescription);
 }else 
{ BA.debugLineNum = 119;BA.debugLine="Else If errorCode==\"SVC726\" Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_errorcode,BA.ObjectToString("SVC726"))) { 
 BA.debugLineNum = 120;BA.debugLine="msgDescription=\"شما قبلا ثبت نام کرده اید\"";
Debug.ShouldStop(8388608);
_msgdescription = BA.ObjectToString("شما قبلا ثبت نام کرده اید");Debug.locals.put("msgDescription", _msgdescription);
 BA.debugLineNum = 121;BA.debugLine="FinishVAS";
Debug.ShouldStop(16777216);
_finishvas();
 }}
;
 };
 BA.debugLineNum = 126;BA.debugLine="If statusCode == \"200\" Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_statuscode,BA.ObjectToString("200"))) { 
 BA.debugLineNum = 127;BA.debugLine="msgDescription = \"با موفقیت تائید شد\"";
Debug.ShouldStop(1073741824);
_msgdescription = BA.ObjectToString("با موفقیت تائید شد");Debug.locals.put("msgDescription", _msgdescription);
 BA.debugLineNum = 128;BA.debugLine="FinishVAS";
Debug.ShouldStop(-2147483648);
_finishvas();
 BA.debugLineNum = 130;BA.debugLine="FinishVAS";
Debug.ShouldStop(2);
_finishvas();
 };
 BA.debugLineNum = 133;BA.debugLine="ToastMessageShow(SaeloZahra.CSB(msgDescription),";
Debug.ShouldStop(16);
otpconfirmact.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(otpconfirmact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,otpconfirmact.mostCurrent.activityBA,(Object)(_msgdescription)).getObject())),(Object)(otpconfirmact.mostCurrent.__c.getField(true,"True")));
 }else {
 BA.debugLineNum = 137;BA.debugLine="SaeloZahra.intent1.Initialize(SaeloZahra.intent1";
Debug.ShouldStop(256);
otpconfirmact.mostCurrent._saelozahra._intent1 /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(otpconfirmact.mostCurrent._saelozahra._intent1 /*RemoteObject*/ .getField(true,"ACTION_VIEW")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("sms:"),otpconfirmact.mostCurrent._saelozahra._smsnumber /*RemoteObject*/ )));
 BA.debugLineNum = 138;BA.debugLine="SaeloZahra.intent1.PutExtra( \"sms_body\" , \"1\" )";
Debug.ShouldStop(512);
otpconfirmact.mostCurrent._saelozahra._intent1 /*RemoteObject*/ .runVoidMethod ("PutExtra",(Object)(BA.ObjectToString("sms_body")),(Object)((RemoteObject.createImmutable("1"))));
 BA.debugLineNum = 139;BA.debugLine="StartActivity(SaeloZahra.intent1)";
Debug.ShouldStop(1024);
otpconfirmact.mostCurrent.__c.runVoidMethod ("StartActivity",otpconfirmact.processBA,(Object)((otpconfirmact.mostCurrent._saelozahra._intent1 /*RemoteObject*/ .getObject())));
 BA.debugLineNum = 142;BA.debugLine="If job.ErrorMessage.Contains(\"Unable to resolve";
Debug.ShouldStop(8192);
if (_job.getField(true,"_errormessage" /*RemoteObject*/ ).runMethod(true,"contains",(Object)(RemoteObject.createImmutable("Unable to resolve host"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 143;BA.debugLine="ToastMessageShow(SaeloZahra.CSB(\" اینترنتتون وص";
Debug.ShouldStop(16384);
otpconfirmact.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(otpconfirmact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,otpconfirmact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable(" اینترنتتون وصل نیست "))).getObject())),(Object)(otpconfirmact.mostCurrent.__c.getField(true,"True")));
 }else {
 BA.debugLineNum = 145;BA.debugLine="ToastMessageShow(SaeloZahra.CSB(\" خطا در ورود \"";
Debug.ShouldStop(65536);
otpconfirmact.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(otpconfirmact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,otpconfirmact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable(" خطا در ورود "))),otpconfirmact.mostCurrent.__c.getField(true,"CRLF"),_job.getField(true,"_errormessage" /*RemoteObject*/ )))),(Object)(otpconfirmact.mostCurrent.__c.getField(true,"True")));
 };
 };
 BA.debugLineNum = 149;BA.debugLine="job.Release";
Debug.ShouldStop(1048576);
_job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 150;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("login_btn_Click (otpconfirmact) ","otpconfirmact",19,otpconfirmact.mostCurrent.activityBA,otpconfirmact.mostCurrent,69);
if (RapidSub.canDelegate("login_btn_click")) { return ir.saelozahra.damaara.mazraeyeman.otpconfirmact.remoteMe.runUserSub(false, "otpconfirmact","login_btn_click");}
 BA.debugLineNum = 69;BA.debugLine="Sub login_btn_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 75;BA.debugLine="If RegisterAct.OTPCode == username_et.Text Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",otpconfirmact.mostCurrent._registeract._otpcode /*RemoteObject*/ ,otpconfirmact.mostCurrent._username_et.runMethod(true,"getText"))) { 
 BA.debugLineNum = 76;BA.debugLine="ToastMessageShow(SaeloZahra.CSB(\"شماره تماس شما";
Debug.ShouldStop(2048);
otpconfirmact.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(otpconfirmact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,otpconfirmact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("شماره تماس شما تائید شد"))).getObject())),(Object)(otpconfirmact.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 79;BA.debugLine="FinishVAS";
Debug.ShouldStop(16384);
_finishvas();
 }else {
 BA.debugLineNum = 83;BA.debugLine="ToastMessageShow(SaeloZahra.CSB(\"کد وارد شده اش";
Debug.ShouldStop(262144);
otpconfirmact.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(otpconfirmact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,otpconfirmact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("کد وارد شده اشتباه است"))).getObject())),(Object)(otpconfirmact.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 86;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
 //BA.debugLineNum = 7;BA.debugLine="Dim Tmr As Timer";
otpconfirmact._tmr = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _tmr_tick() throws Exception{
try {
		Debug.PushSubsStack("Tmr_Tick (otpconfirmact) ","otpconfirmact",19,otpconfirmact.mostCurrent.activityBA,otpconfirmact.mostCurrent,154);
if (RapidSub.canDelegate("tmr_tick")) { return ir.saelozahra.damaara.mazraeyeman.otpconfirmact.remoteMe.runUserSub(false, "otpconfirmact","tmr_tick");}
RemoteObject _smin = RemoteObject.createImmutable(0);
RemoteObject _ssec = RemoteObject.createImmutable(0);
RemoteObject _secprefix = RemoteObject.createImmutable("");
RemoteObject _minprefix = RemoteObject.createImmutable("");
 BA.debugLineNum = 154;BA.debugLine="Sub Tmr_Tick";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 155;BA.debugLine="If ( counter > 0) Then";
Debug.ShouldStop(67108864);
if ((RemoteObject.solveBoolean(">",otpconfirmact._counter,BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 156;BA.debugLine="counter=counter-1";
Debug.ShouldStop(134217728);
otpconfirmact._counter = RemoteObject.solve(new RemoteObject[] {otpconfirmact._counter,RemoteObject.createImmutable(1)}, "-",1, 1);
 BA.debugLineNum = 157;BA.debugLine="Dim sMin As Int = Floor(counter / 60)";
Debug.ShouldStop(268435456);
_smin = BA.numberCast(int.class, otpconfirmact.mostCurrent.__c.runMethod(true,"Floor",(Object)(RemoteObject.solve(new RemoteObject[] {otpconfirmact._counter,RemoteObject.createImmutable(60)}, "/",0, 0))));Debug.locals.put("sMin", _smin);Debug.locals.put("sMin", _smin);
 BA.debugLineNum = 158;BA.debugLine="Dim sSec As Int = counter Mod 60";
Debug.ShouldStop(536870912);
_ssec = RemoteObject.solve(new RemoteObject[] {otpconfirmact._counter,RemoteObject.createImmutable(60)}, "%",0, 1);Debug.locals.put("sSec", _ssec);Debug.locals.put("sSec", _ssec);
 BA.debugLineNum = 159;BA.debugLine="If sSec Mod 2 == 0 Then TimerLbl.SetTextColorAni";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",RemoteObject.solve(new RemoteObject[] {_ssec,RemoteObject.createImmutable(2)}, "%",0, 1),BA.numberCast(double.class, 0))) { 
otpconfirmact.mostCurrent._timerlbl.runVoidMethod ("SetTextColorAnimated",(Object)(BA.numberCast(int.class, 1000)),(Object)(otpconfirmact.mostCurrent._saelozahra._colorlight /*RemoteObject*/ ));}
else {
otpconfirmact.mostCurrent._timerlbl.runVoidMethod ("SetTextColorAnimated",(Object)(BA.numberCast(int.class, 1000)),(Object)(otpconfirmact.mostCurrent._saelozahra._colordark /*RemoteObject*/ ));};
 BA.debugLineNum = 160;BA.debugLine="Dim secPrefix As String =\"\"";
Debug.ShouldStop(-2147483648);
_secprefix = BA.ObjectToString("");Debug.locals.put("secPrefix", _secprefix);Debug.locals.put("secPrefix", _secprefix);
 BA.debugLineNum = 161;BA.debugLine="Dim minPrefix As String =\"\"";
Debug.ShouldStop(1);
_minprefix = BA.ObjectToString("");Debug.locals.put("minPrefix", _minprefix);Debug.locals.put("minPrefix", _minprefix);
 BA.debugLineNum = 162;BA.debugLine="If (sSec < 10) Then";
Debug.ShouldStop(2);
if ((RemoteObject.solveBoolean("<",_ssec,BA.numberCast(double.class, 10)))) { 
 BA.debugLineNum = 163;BA.debugLine="secPrefix = \"0\"";
Debug.ShouldStop(4);
_secprefix = BA.ObjectToString("0");Debug.locals.put("secPrefix", _secprefix);
 };
 BA.debugLineNum = 165;BA.debugLine="If (sMin < 10 ) Then";
Debug.ShouldStop(16);
if ((RemoteObject.solveBoolean("<",_smin,BA.numberCast(double.class, 10)))) { 
 BA.debugLineNum = 166;BA.debugLine="minPrefix = \"0\"";
Debug.ShouldStop(32);
_minprefix = BA.ObjectToString("0");Debug.locals.put("minPrefix", _minprefix);
 };
 BA.debugLineNum = 168;BA.debugLine="TimerLbl.Text = SaeloZahra.CSB(minPrefix & sMin";
Debug.ShouldStop(128);
otpconfirmact.mostCurrent._timerlbl.runMethod(true,"setText",BA.ObjectToCharSequence(otpconfirmact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,otpconfirmact.mostCurrent.activityBA,(Object)(RemoteObject.concat(_minprefix,_smin,RemoteObject.createImmutable(":"),_secprefix,_ssec))).getObject()));
 }else {
 BA.debugLineNum = 170;BA.debugLine="Activity.Finish";
Debug.ShouldStop(512);
otpconfirmact.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 171;BA.debugLine="Tmr.Enabled = False";
Debug.ShouldStop(1024);
otpconfirmact._tmr.runMethod(true,"setEnabled",otpconfirmact.mostCurrent.__c.getField(true,"False"));
 };
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
}