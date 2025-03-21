package ir.saelozahra.damaara.mazraeyeman;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class zarinpal_payment_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (zarinpal_payment) ","zarinpal_payment",23,zarinpal_payment.mostCurrent.activityBA,zarinpal_payment.mostCurrent,85);
if (RapidSub.canDelegate("activity_create")) { return ir.saelozahra.damaara.mazraeyeman.zarinpal_payment.remoteMe.runUserSub(false, "zarinpal_payment","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 85;BA.debugLine="private Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 86;BA.debugLine="ph.SetScreenOrientation(1)";
Debug.ShouldStop(2097152);
zarinpal_payment.mostCurrent._ph.runVoidMethod ("SetScreenOrientation",zarinpal_payment.processBA,(Object)(BA.numberCast(int.class, 1)));
 BA.debugLineNum = 87;BA.debugLine="Activity.LoadLayout(\"L_ZarinPal_Payment\")";
Debug.ShouldStop(4194304);
zarinpal_payment.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("L_ZarinPal_Payment")),zarinpal_payment.mostCurrent.activityBA);
 BA.debugLineNum = 88;BA.debugLine="Initialize";
Debug.ShouldStop(8388608);
_initialize();
 BA.debugLineNum = 89;BA.debugLine="lbl_Address.SingleLine= True";
Debug.ShouldStop(16777216);
zarinpal_payment.mostCurrent._lbl_address.runVoidMethod ("setSingleLine",zarinpal_payment.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 90;BA.debugLine="timer.Initialize(\"timer\",10)";
Debug.ShouldStop(33554432);
zarinpal_payment._timer.runVoidMethod ("Initialize",zarinpal_payment.processBA,(Object)(BA.ObjectToString("timer")),(Object)(BA.numberCast(long.class, 10)));
 BA.debugLineNum = 91;BA.debugLine="timer.Enabled=True";
Debug.ShouldStop(67108864);
zarinpal_payment._timer.runMethod(true,"setEnabled",zarinpal_payment.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 92;BA.debugLine="timer_OK.Initialize(\"timer_OK\",10)";
Debug.ShouldStop(134217728);
zarinpal_payment._timer_ok.runVoidMethod ("Initialize",zarinpal_payment.processBA,(Object)(BA.ObjectToString("timer_OK")),(Object)(BA.numberCast(long.class, 10)));
 BA.debugLineNum = 93;BA.debugLine="timer_OK.Enabled=True";
Debug.ShouldStop(268435456);
zarinpal_payment._timer_ok.runMethod(true,"setEnabled",zarinpal_payment.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 94;BA.debugLine="SetLabelTextSize(lbl_SSL,\"\",15)";
Debug.ShouldStop(536870912);
_setlabeltextsize(zarinpal_payment.mostCurrent._lbl_ssl,BA.ObjectToString(""),BA.numberCast(int.class, 15));
 BA.debugLineNum = 95;BA.debugLine="lbl_Address.Typeface=Font";
Debug.ShouldStop(1073741824);
zarinpal_payment.mostCurrent._lbl_address.runMethod(false,"setTypeface",(zarinpal_payment.mostCurrent._font.getObject()));
 BA.debugLineNum = 96;BA.debugLine="Img_Icon.Bitmap=logo";
Debug.ShouldStop(-2147483648);
zarinpal_payment.mostCurrent._img_icon.runMethod(false,"setBitmap",(zarinpal_payment.mostCurrent._logo.getObject()));
 BA.debugLineNum = 97;BA.debugLine="If pnl.IsInitialized=False Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",zarinpal_payment.mostCurrent._pnl.runMethod(true,"IsInitialized"),zarinpal_payment.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 98;BA.debugLine="pnl.Initialize(\"pnl\")";
Debug.ShouldStop(2);
zarinpal_payment.mostCurrent._pnl.runVoidMethod ("Initialize",zarinpal_payment.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("pnl")));
 };
 BA.debugLineNum = 100;BA.debugLine="If lbl_SSL_Panel.IsInitialized = False Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",zarinpal_payment.mostCurrent._lbl_ssl_panel.runMethod(true,"IsInitialized"),zarinpal_payment.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 101;BA.debugLine="lbl_SSL_Panel.Initialize(\"lbl_SSL_Panel\")";
Debug.ShouldStop(16);
zarinpal_payment.mostCurrent._lbl_ssl_panel.runVoidMethod ("Initialize",zarinpal_payment.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_SSL_Panel")));
 };
 BA.debugLineNum = 103;BA.debugLine="If lbl_SSL_About.IsInitialized = False Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",zarinpal_payment.mostCurrent._lbl_ssl_about.runMethod(true,"IsInitialized"),zarinpal_payment.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 104;BA.debugLine="lbl_SSL_About.Initialize(\"lbl_SSL_About\")";
Debug.ShouldStop(128);
zarinpal_payment.mostCurrent._lbl_ssl_about.runVoidMethod ("Initialize",zarinpal_payment.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_SSL_About")));
 };
 BA.debugLineNum = 110;BA.debugLine="SaeloZahra.SetStatusBarColor(Colors.RGB(255,220,8";
Debug.ShouldStop(8192);
zarinpal_payment.mostCurrent._saelozahra.runVoidMethod ("_setstatusbarcolor" /*RemoteObject*/ ,zarinpal_payment.mostCurrent.activityBA,(Object)(zarinpal_payment.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 220)),(Object)(BA.numberCast(int.class, 8)))));
 BA.debugLineNum = 112;BA.debugLine="Activity.AddView(pnl,1%x,11%y,80%x,42%y)";
Debug.ShouldStop(32768);
zarinpal_payment.mostCurrent._activity.runVoidMethod ("AddView",(Object)((zarinpal_payment.mostCurrent._pnl.getObject())),(Object)(zarinpal_payment.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 1)),zarinpal_payment.mostCurrent.activityBA)),(Object)(zarinpal_payment.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 11)),zarinpal_payment.mostCurrent.activityBA)),(Object)(zarinpal_payment.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 80)),zarinpal_payment.mostCurrent.activityBA)),(Object)(zarinpal_payment.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 42)),zarinpal_payment.mostCurrent.activityBA)));
 BA.debugLineNum = 113;BA.debugLine="pnl.Visible=False";
Debug.ShouldStop(65536);
zarinpal_payment.mostCurrent._pnl.runMethod(true,"setVisible",zarinpal_payment.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 114;BA.debugLine="pnl.AddView(lbl_SSL_Panel,0%x,0%y,81%x,20%y)";
Debug.ShouldStop(131072);
zarinpal_payment.mostCurrent._pnl.runVoidMethod ("AddView",(Object)((zarinpal_payment.mostCurrent._lbl_ssl_panel.getObject())),(Object)(zarinpal_payment.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 0)),zarinpal_payment.mostCurrent.activityBA)),(Object)(zarinpal_payment.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 0)),zarinpal_payment.mostCurrent.activityBA)),(Object)(zarinpal_payment.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 81)),zarinpal_payment.mostCurrent.activityBA)),(Object)(zarinpal_payment.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 20)),zarinpal_payment.mostCurrent.activityBA)));
 BA.debugLineNum = 115;BA.debugLine="pnl.AddView(lbl_SSL_About,1%x,21%y,78%x,20%y)";
Debug.ShouldStop(262144);
zarinpal_payment.mostCurrent._pnl.runVoidMethod ("AddView",(Object)((zarinpal_payment.mostCurrent._lbl_ssl_about.getObject())),(Object)(zarinpal_payment.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 1)),zarinpal_payment.mostCurrent.activityBA)),(Object)(zarinpal_payment.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 21)),zarinpal_payment.mostCurrent.activityBA)),(Object)(zarinpal_payment.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 78)),zarinpal_payment.mostCurrent.activityBA)),(Object)(zarinpal_payment.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 20)),zarinpal_payment.mostCurrent.activityBA)));
 BA.debugLineNum = 116;BA.debugLine="pnl.Color=Colors.RGB(255,220,8)";
Debug.ShouldStop(524288);
zarinpal_payment.mostCurrent._pnl.runVoidMethod ("setColor",zarinpal_payment.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 220)),(Object)(BA.numberCast(int.class, 8))));
 BA.debugLineNum = 117;BA.debugLine="lbl_SSL_About.Typeface =Font";
Debug.ShouldStop(1048576);
zarinpal_payment.mostCurrent._lbl_ssl_about.runMethod(false,"setTypeface",(zarinpal_payment.mostCurrent._font.getObject()));
 BA.debugLineNum = 118;BA.debugLine="lbl_SSL_Panel.Typeface = Typeface.MATERIALICONS";
Debug.ShouldStop(2097152);
zarinpal_payment.mostCurrent._lbl_ssl_panel.runMethod(false,"setTypeface",zarinpal_payment.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"getMATERIALICONS"));
 BA.debugLineNum = 119;BA.debugLine="lbl_SSL_Panel.Gravity = Gravity.CENTER";
Debug.ShouldStop(4194304);
zarinpal_payment.mostCurrent._lbl_ssl_panel.runMethod(true,"setGravity",zarinpal_payment.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 120;BA.debugLine="lbl_SSL_About.Gravity = Gravity.RIGHT";
Debug.ShouldStop(8388608);
zarinpal_payment.mostCurrent._lbl_ssl_about.runMethod(true,"setGravity",zarinpal_payment.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT"));
 BA.debugLineNum = 121;BA.debugLine="lbl_SSL_About.TextColor=Colors.Black";
Debug.ShouldStop(16777216);
zarinpal_payment.mostCurrent._lbl_ssl_about.runMethod(true,"setTextColor",zarinpal_payment.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 122;BA.debugLine="lbl_SSL_Panel.TextColor=Colors.Black";
Debug.ShouldStop(33554432);
zarinpal_payment.mostCurrent._lbl_ssl_panel.runMethod(true,"setTextColor",zarinpal_payment.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 123;BA.debugLine="nb.Initialize(\"nb\")";
Debug.ShouldStop(67108864);
zarinpal_payment.mostCurrent._nb.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("nb")));
 BA.debugLineNum = 124;BA.debugLine="nb.AddHeightChangedEvent";
Debug.ShouldStop(134217728);
zarinpal_payment.mostCurrent._nb.runVoidMethod ("AddHeightChangedEvent",zarinpal_payment.mostCurrent.activityBA);
 BA.debugLineNum = 125;BA.debugLine="WebView.LoadUrl(Start_HostName_With&\"/index.php?A";
Debug.ShouldStop(268435456);
zarinpal_payment.mostCurrent._webview.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(zarinpal_payment.mostCurrent._start_hostname_with,RemoteObject.createImmutable("/index.php?Amount="),zarinpal_payment._money,RemoteObject.createImmutable("&Description="),zarinpal_payment._description,RemoteObject.createImmutable("&Email="),zarinpal_payment._e_mail,RemoteObject.createImmutable("&Mobile="),zarinpal_payment._phone,RemoteObject.createImmutable("&Merchand_ID="),zarinpal_payment.mostCurrent._merchand_id,RemoteObject.createImmutable("&Start="),zarinpal_payment.mostCurrent._start_hostname_with)));
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
public static RemoteObject  _activity_keypress(RemoteObject _keycode) throws Exception{
try {
		Debug.PushSubsStack("Activity_KeyPress (zarinpal_payment) ","zarinpal_payment",23,zarinpal_payment.mostCurrent.activityBA,zarinpal_payment.mostCurrent,157);
if (RapidSub.canDelegate("activity_keypress")) { return ir.saelozahra.damaara.mazraeyeman.zarinpal_payment.remoteMe.runUserSub(false, "zarinpal_payment","activity_keypress", _keycode);}
RemoteObject _a = RemoteObject.createImmutable(0);
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 157;BA.debugLine="private Sub Activity_KeyPress (KeyCode As Int) As";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 159;BA.debugLine="Select KeyCode";
Debug.ShouldStop(1073741824);
switch (BA.switchObjectToInt(_keycode,zarinpal_payment.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK"))) {
case 0: {
 BA.debugLineNum = 161;BA.debugLine="Dim a As Int";
Debug.ShouldStop(1);
_a = RemoteObject.createImmutable(0);Debug.locals.put("a", _a);
 BA.debugLineNum = 162;BA.debugLine="a=Msgbox2Async(\"آیا می خواهید از صفحه پرداخت خا";
Debug.ShouldStop(2);
_a = BA.numberCast(int.class, zarinpal_payment.mostCurrent.__c.runMethod(false,"Msgbox2Async",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("آیا می خواهید از صفحه پرداخت خارج شوید؟"),zarinpal_payment.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("خروج شما باعث لغو پرداخت می شود؟")))),(Object)(BA.ObjectToCharSequence("خارج شدن از پرداخت")),(Object)(BA.ObjectToString("خارج می شوم")),(Object)(BA.ObjectToString("به پرداخت ادامه می دهم")),(Object)(BA.ObjectToString("")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), zarinpal_payment.mostCurrent.__c.getField(false,"Null")),zarinpal_payment.processBA,(Object)(zarinpal_payment.mostCurrent.__c.getField(true,"False"))));Debug.locals.put("a", _a);
 BA.debugLineNum = 163;BA.debugLine="If a = DialogResponse.POSITIVE Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_a,BA.numberCast(double.class, zarinpal_payment.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 164;BA.debugLine="Activity.Finish";
Debug.ShouldStop(8);
zarinpal_payment.mostCurrent._activity.runVoidMethod ("Finish");
 };
 BA.debugLineNum = 166;BA.debugLine="Return True";
Debug.ShouldStop(32);
if (true) return zarinpal_payment.mostCurrent.__c.getField(true,"True");
 break; }
}
;
 BA.debugLineNum = 168;BA.debugLine="Return False";
Debug.ShouldStop(128);
if (true) return zarinpal_payment.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 169;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("Activity_Pause (zarinpal_payment) ","zarinpal_payment",23,zarinpal_payment.mostCurrent.activityBA,zarinpal_payment.mostCurrent,153);
if (RapidSub.canDelegate("activity_pause")) { return ir.saelozahra.damaara.mazraeyeman.zarinpal_payment.remoteMe.runUserSub(false, "zarinpal_payment","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 153;BA.debugLine="private Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(16777216);
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (zarinpal_payment) ","zarinpal_payment",23,zarinpal_payment.mostCurrent.activityBA,zarinpal_payment.mostCurrent,128);
if (RapidSub.canDelegate("activity_resume")) { return ir.saelozahra.damaara.mazraeyeman.zarinpal_payment.remoteMe.runUserSub(false, "zarinpal_payment","activity_resume");}
 BA.debugLineNum = 128;BA.debugLine="Private Sub Activity_Resume";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 130;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 16;BA.debugLine="private Sub Globals";
 //BA.debugLineNum = 17;BA.debugLine="Private htt As HttpJob";
zarinpal_payment.mostCurrent._htt = RemoteObject.createNew ("ir.saelozahra.damaara.mazraeyeman.httpjob");
 //BA.debugLineNum = 18;BA.debugLine="Private WebView As WebView";
zarinpal_payment.mostCurrent._webview = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private lbl_SSL As Label";
zarinpal_payment.mostCurrent._lbl_ssl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private lbl_Address As Label";
zarinpal_payment.mostCurrent._lbl_address = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private bool As Boolean = False";
zarinpal_payment._bool = zarinpal_payment.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 22;BA.debugLine="Private pnl As Panel";
zarinpal_payment.mostCurrent._pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private lbl_SSL_Panel As Label";
zarinpal_payment.mostCurrent._lbl_ssl_panel = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private lbl_SSL_About As Label";
zarinpal_payment.mostCurrent._lbl_ssl_about = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private r As RichString";
zarinpal_payment.mostCurrent._r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.richstring.RichStringBuilder.RichString");
 //BA.debugLineNum = 26;BA.debugLine="Private ab As String";
zarinpal_payment.mostCurrent._ab = RemoteObject.createImmutable("");
 //BA.debugLineNum = 28;BA.debugLine="Private Merchand_ID As String";
zarinpal_payment.mostCurrent._merchand_id = RemoteObject.createImmutable("");
 //BA.debugLineNum = 29;BA.debugLine="Private logo As Bitmap";
zarinpal_payment.mostCurrent._logo = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private Start_HostName_With As String";
zarinpal_payment.mostCurrent._start_hostname_with = RemoteObject.createImmutable("");
 //BA.debugLineNum = 31;BA.debugLine="Private Font As Typeface";
zarinpal_payment.mostCurrent._font = RemoteObject.createNew ("anywheresoftware.b4a.keywords.constants.TypefaceWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private Img_Icon As ImageView";
zarinpal_payment.mostCurrent._img_icon = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private nb As IME";
zarinpal_payment.mostCurrent._nb = RemoteObject.createNew ("anywheresoftware.b4a.objects.IME");
 //BA.debugLineNum = 34;BA.debugLine="Private ph As Phone";
zarinpal_payment.mostCurrent._ph = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone");
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize() throws Exception{
try {
		Debug.PushSubsStack("Initialize (zarinpal_payment) ","zarinpal_payment",23,zarinpal_payment.mostCurrent.activityBA,zarinpal_payment.mostCurrent,62);
if (RapidSub.canDelegate("initialize")) { return ir.saelozahra.damaara.mazraeyeman.zarinpal_payment.remoteMe.runUserSub(false, "zarinpal_payment","initialize");}
 BA.debugLineNum = 62;BA.debugLine="Sub Initialize";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 76;BA.debugLine="Merchand_ID =  \"29882ae2-3c64-11ea-a2b4-000c295eb";
Debug.ShouldStop(2048);
zarinpal_payment.mostCurrent._merchand_id = BA.ObjectToString("29882ae2-3c64-11ea-a2b4-000c295eb8fc");
 BA.debugLineNum = 77;BA.debugLine="logo =  LoadBitmap(File.DirAssets,\"Icon.png\")";
Debug.ShouldStop(4096);
zarinpal_payment.mostCurrent._logo = zarinpal_payment.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(zarinpal_payment.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("Icon.png")));
 BA.debugLineNum = 78;BA.debugLine="Start_HostName_With =  \"https://mazraeyeman.ir/re";
Debug.ShouldStop(8192);
zarinpal_payment.mostCurrent._start_hostname_with = BA.ObjectToString("https://mazraeyeman.ir/reseller/api_files/zarinpal");
 BA.debugLineNum = 79;BA.debugLine="Font= SaeloZahra.font    '** For a more beautiful";
Debug.ShouldStop(16384);
zarinpal_payment.mostCurrent._font = zarinpal_payment.mostCurrent._saelozahra._font /*RemoteObject*/ ;
 BA.debugLineNum = 81;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (zarinpal_payment) ","zarinpal_payment",23,zarinpal_payment.mostCurrent.activityBA,zarinpal_payment.mostCurrent,211);
if (RapidSub.canDelegate("jobdone")) { return ir.saelozahra.damaara.mazraeyeman.zarinpal_payment.remoteMe.runUserSub(false, "zarinpal_payment","jobdone", _job);}
RemoteObject _jp = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _l1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _l21 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _statuss = RemoteObject.createImmutable("");
RemoteObject _kod_tarakoneshs = RemoteObject.createImmutable("");
Debug.locals.put("job", _job);
 BA.debugLineNum = 211;BA.debugLine="private Sub JobDone(job As HttpJob)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 212;BA.debugLine="Log(job.GetString)";
Debug.ShouldStop(524288);
zarinpal_payment.mostCurrent.__c.runVoidMethod ("LogImpl","423789569",_job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_getstring" /*RemoteObject*/ ),0);
 BA.debugLineNum = 214;BA.debugLine="If job.Success Then";
Debug.ShouldStop(2097152);
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 215;BA.debugLine="If job.JobName=\"htt\" Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("htt"))) { 
 BA.debugLineNum = 216;BA.debugLine="Dim jp As JSONParser";
Debug.ShouldStop(8388608);
_jp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("jp", _jp);
 BA.debugLineNum = 217;BA.debugLine="jp.Initialize(job.GetString)";
Debug.ShouldStop(16777216);
_jp.runVoidMethod ("Initialize",(Object)(_job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 218;BA.debugLine="Dim l1 As List = jp.NextArray";
Debug.ShouldStop(33554432);
_l1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_l1 = _jp.runMethod(false,"NextArray");Debug.locals.put("l1", _l1);Debug.locals.put("l1", _l1);
 BA.debugLineNum = 219;BA.debugLine="Dim l21 As Map = l1.Get(0)";
Debug.ShouldStop(67108864);
_l21 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_l21 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _l1.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("l21", _l21);Debug.locals.put("l21", _l21);
 BA.debugLineNum = 220;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(134217728);
zarinpal_payment.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 221;BA.debugLine="Dim Statuss As String=l21.Get(\"Status\")";
Debug.ShouldStop(268435456);
_statuss = BA.ObjectToString(_l21.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Status")))));Debug.locals.put("Statuss", _statuss);Debug.locals.put("Statuss", _statuss);
 BA.debugLineNum = 222;BA.debugLine="Dim Kod_Tarakoneshs As String =l21.Get(\"Kod_Tar";
Debug.ShouldStop(536870912);
_kod_tarakoneshs = BA.ObjectToString(_l21.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Kod_Tarakonesh")))));Debug.locals.put("Kod_Tarakoneshs", _kod_tarakoneshs);Debug.locals.put("Kod_Tarakoneshs", _kod_tarakoneshs);
 BA.debugLineNum = 223;BA.debugLine="If l21.Get(\"Status\") == \"null\" Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_l21.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Status")))),RemoteObject.createImmutable(("null")))) { 
 BA.debugLineNum = 224;BA.debugLine="Statuss=\"21\"";
Debug.ShouldStop(-2147483648);
_statuss = BA.ObjectToString("21");Debug.locals.put("Statuss", _statuss);
 BA.debugLineNum = 225;BA.debugLine="Kod_Tarakoneshs = \"0\"";
Debug.ShouldStop(1);
_kod_tarakoneshs = BA.ObjectToString("0");Debug.locals.put("Kod_Tarakoneshs", _kod_tarakoneshs);
 };
 BA.debugLineNum = 267;BA.debugLine="CallSubDelayed3(Activity_Now,\"Zarin_Pal_Request";
Debug.ShouldStop(1024);
zarinpal_payment.mostCurrent.__c.runVoidMethod ("CallSubDelayed3",zarinpal_payment.processBA,(Object)(zarinpal_payment._activity_now),(Object)(BA.ObjectToString("Zarin_Pal_Request")),(Object)((_statuss)),(Object)((_kod_tarakoneshs)));
 BA.debugLineNum = 268;BA.debugLine="Activity.Finish";
Debug.ShouldStop(2048);
zarinpal_payment.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 269;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(4096);
zarinpal_payment.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 };
 };
 BA.debugLineNum = 272;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lbl_ssl_about_click() throws Exception{
try {
		Debug.PushSubsStack("lbl_SSL_About_Click (zarinpal_payment) ","zarinpal_payment",23,zarinpal_payment.mostCurrent.activityBA,zarinpal_payment.mostCurrent,310);
if (RapidSub.canDelegate("lbl_ssl_about_click")) { return ir.saelozahra.damaara.mazraeyeman.zarinpal_payment.remoteMe.runUserSub(false, "zarinpal_payment","lbl_ssl_about_click");}
 BA.debugLineNum = 310;BA.debugLine="private Sub lbl_SSL_About_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 311;BA.debugLine="pnl.Visible=False";
Debug.ShouldStop(4194304);
zarinpal_payment.mostCurrent._pnl.runMethod(true,"setVisible",zarinpal_payment.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 312;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lbl_ssl_click() throws Exception{
try {
		Debug.PushSubsStack("lbl_SSL_Click (zarinpal_payment) ","zarinpal_payment",23,zarinpal_payment.mostCurrent.activityBA,zarinpal_payment.mostCurrent,282);
if (RapidSub.canDelegate("lbl_ssl_click")) { return ir.saelozahra.damaara.mazraeyeman.zarinpal_payment.remoteMe.runUserSub(false, "zarinpal_payment","lbl_ssl_click");}
 BA.debugLineNum = 282;BA.debugLine="Private Sub lbl_SSL_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 283;BA.debugLine="If pnl.Visible = False Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",zarinpal_payment.mostCurrent._pnl.runMethod(true,"getVisible"),zarinpal_payment.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 284;BA.debugLine="pnl.Visible=True";
Debug.ShouldStop(134217728);
zarinpal_payment.mostCurrent._pnl.runMethod(true,"setVisible",zarinpal_payment.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 285;BA.debugLine="If WebView.Url.StartsWith(\"https://\")=True Or We";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",zarinpal_payment.mostCurrent._webview.runMethod(true,"getUrl").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("https://"))),zarinpal_payment.mostCurrent.__c.getField(true,"True")) || RemoteObject.solveBoolean("=",zarinpal_payment.mostCurrent._webview.runMethod(true,"getUrl").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("Https://"))),zarinpal_payment.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 286;BA.debugLine="lbl_SSL_Panel.TextColor = Colors.Green";
Debug.ShouldStop(536870912);
zarinpal_payment.mostCurrent._lbl_ssl_panel.runMethod(true,"setTextColor",zarinpal_payment.mostCurrent.__c.getField(false,"Colors").getField(true,"Green"));
 BA.debugLineNum = 287;BA.debugLine="SetLabelTextSize(lbl_SSL_Panel,\"\",50)";
Debug.ShouldStop(1073741824);
_setlabeltextsize(zarinpal_payment.mostCurrent._lbl_ssl_panel,BA.ObjectToString(""),BA.numberCast(int.class, 50));
 }else {
 BA.debugLineNum = 289;BA.debugLine="lbl_SSL_Panel.TextColor = Colors.Red";
Debug.ShouldStop(1);
zarinpal_payment.mostCurrent._lbl_ssl_panel.runMethod(true,"setTextColor",zarinpal_payment.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 290;BA.debugLine="SetLabelTextSize(lbl_SSL_Panel,\"\",50)";
Debug.ShouldStop(2);
_setlabeltextsize(zarinpal_payment.mostCurrent._lbl_ssl_panel,BA.ObjectToString(""),BA.numberCast(int.class, 50));
 };
 BA.debugLineNum = 292;BA.debugLine="If WebView.Url.Contains(\"shaparak.ir\") =True The";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",zarinpal_payment.mostCurrent._webview.runMethod(true,"getUrl").runMethod(true,"contains",(Object)(RemoteObject.createImmutable("shaparak.ir"))),zarinpal_payment.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 293;BA.debugLine="If WebView.Url.StartsWith(\"https://\")=True Or W";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",zarinpal_payment.mostCurrent._webview.runMethod(true,"getUrl").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("https://"))),zarinpal_payment.mostCurrent.__c.getField(true,"True")) || RemoteObject.solveBoolean("=",zarinpal_payment.mostCurrent._webview.runMethod(true,"getUrl").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("Https://"))),zarinpal_payment.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 294;BA.debugLine="SetLabelTextSize(lbl_SSL_About,\"اتصال امن است!";
Debug.ShouldStop(32);
_setlabeltextsize(zarinpal_payment.mostCurrent._lbl_ssl_about,RemoteObject.concat(RemoteObject.createImmutable("اتصال امن است!"),zarinpal_payment.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("اطلاعات پرداخت شما هنگامی که به این سایت ارسال می شود خصوصی است."),zarinpal_payment.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("شما در سایت شاپرک هستید!")),BA.numberCast(int.class, 15));
 }else {
 BA.debugLineNum = 296;BA.debugLine="SetLabelTextSize(lbl_SSL_About,\"اتصال شما به ا";
Debug.ShouldStop(128);
_setlabeltextsize(zarinpal_payment.mostCurrent._lbl_ssl_about,RemoteObject.concat(RemoteObject.createImmutable("اتصال شما به این سایت امن نیست!"),zarinpal_payment.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("شما نباید هیچ اطلاعات حساس در این سایت وارد کنید."),zarinpal_payment.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("زیرا می تواند توسط مهاجمان مورد سرقت قرار گیرد."),zarinpal_payment.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("شما در سایت شاپرک هستید!")),BA.numberCast(int.class, 15));
 };
 }else {
 BA.debugLineNum = 299;BA.debugLine="If WebView.Url.StartsWith(\"https://\")=True Or W";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",zarinpal_payment.mostCurrent._webview.runMethod(true,"getUrl").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("https://"))),zarinpal_payment.mostCurrent.__c.getField(true,"True")) || RemoteObject.solveBoolean("=",zarinpal_payment.mostCurrent._webview.runMethod(true,"getUrl").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("Https://"))),zarinpal_payment.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 300;BA.debugLine="SetLabelTextSize(lbl_SSL_About,\"اتصال امن است!";
Debug.ShouldStop(2048);
_setlabeltextsize(zarinpal_payment.mostCurrent._lbl_ssl_about,RemoteObject.concat(RemoteObject.createImmutable("اتصال امن است!"),zarinpal_payment.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("اطلاعات پرداخت شما هنگامی که به این سایت ارسال می شود خصوصی است.")),BA.numberCast(int.class, 15));
 }else {
 BA.debugLineNum = 302;BA.debugLine="SetLabelTextSize(lbl_SSL_About,\"اتصال شما به ا";
Debug.ShouldStop(8192);
_setlabeltextsize(zarinpal_payment.mostCurrent._lbl_ssl_about,RemoteObject.concat(RemoteObject.createImmutable("اتصال شما به این سایت امن نیست!"),zarinpal_payment.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("شما نباید هیچ اطلاعات حساس در این سایت وارد کنید."),zarinpal_payment.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("زیرا می تواند توسط مهاجمان مورد سرقت قرار گیرد.")),BA.numberCast(int.class, 15));
 };
 };
 }else 
{ BA.debugLineNum = 305;BA.debugLine="Else if pnl.Visible = True Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",zarinpal_payment.mostCurrent._pnl.runMethod(true,"getVisible"),zarinpal_payment.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 306;BA.debugLine="pnl.Visible=False";
Debug.ShouldStop(131072);
zarinpal_payment.mostCurrent._pnl.runMethod(true,"setVisible",zarinpal_payment.mostCurrent.__c.getField(true,"False"));
 }}
;
 BA.debugLineNum = 308;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lbl_ssl_panel_click() throws Exception{
try {
		Debug.PushSubsStack("lbl_SSL_Panel_Click (zarinpal_payment) ","zarinpal_payment",23,zarinpal_payment.mostCurrent.activityBA,zarinpal_payment.mostCurrent,314);
if (RapidSub.canDelegate("lbl_ssl_panel_click")) { return ir.saelozahra.damaara.mazraeyeman.zarinpal_payment.remoteMe.runUserSub(false, "zarinpal_payment","lbl_ssl_panel_click");}
 BA.debugLineNum = 314;BA.debugLine="private Sub lbl_SSL_Panel_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 315;BA.debugLine="pnl.Visible=False";
Debug.ShouldStop(67108864);
zarinpal_payment.mostCurrent._pnl.runMethod(true,"setVisible",zarinpal_payment.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 316;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _nb_heightchanged(RemoteObject _newheight,RemoteObject _oldheight) throws Exception{
try {
		Debug.PushSubsStack("nb_HeightChanged (zarinpal_payment) ","zarinpal_payment",23,zarinpal_payment.mostCurrent.activityBA,zarinpal_payment.mostCurrent,274);
if (RapidSub.canDelegate("nb_heightchanged")) { return ir.saelozahra.damaara.mazraeyeman.zarinpal_payment.remoteMe.runUserSub(false, "zarinpal_payment","nb_heightchanged", _newheight, _oldheight);}
Debug.locals.put("NewHeight", _newheight);
Debug.locals.put("OldHeight", _oldheight);
 BA.debugLineNum = 274;BA.debugLine="Sub nb_HeightChanged(NewHeight As Int, OldHeight A";
Debug.ShouldStop(131072);
 BA.debugLineNum = 275;BA.debugLine="If NewHeight < OldHeight Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("<",_newheight,BA.numberCast(double.class, _oldheight))) { 
 BA.debugLineNum = 276;BA.debugLine="WebView.Height =  NewHeight - 10%y";
Debug.ShouldStop(524288);
zarinpal_payment.mostCurrent._webview.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {_newheight,zarinpal_payment.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),zarinpal_payment.mostCurrent.activityBA)}, "-",1, 1));
 }else 
{ BA.debugLineNum = 277;BA.debugLine="Else If NewHeight > OldHeight Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean(">",_newheight,BA.numberCast(double.class, _oldheight))) { 
 BA.debugLineNum = 278;BA.debugLine="WebView.Height=90%y";
Debug.ShouldStop(2097152);
zarinpal_payment.mostCurrent._webview.runMethod(true,"setHeight",zarinpal_payment.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 90)),zarinpal_payment.mostCurrent.activityBA));
 }}
;
 BA.debugLineNum = 280;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
 //BA.debugLineNum = 7;BA.debugLine="Dim phone As String";
zarinpal_payment._phone = RemoteObject.createImmutable("");
 //BA.debugLineNum = 8;BA.debugLine="Dim E_Mail As String";
zarinpal_payment._e_mail = RemoteObject.createImmutable("");
 //BA.debugLineNum = 9;BA.debugLine="Dim Description As String";
zarinpal_payment._description = RemoteObject.createImmutable("");
 //BA.debugLineNum = 10;BA.debugLine="Dim money As String";
zarinpal_payment._money = RemoteObject.createImmutable("");
 //BA.debugLineNum = 11;BA.debugLine="Dim Activity_Now As Object";
zarinpal_payment._activity_now = RemoteObject.createNew ("Object");
 //BA.debugLineNum = 12;BA.debugLine="Private timer As Timer";
zarinpal_payment._timer = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 13;BA.debugLine="Private timer_OK As Timer";
zarinpal_payment._timer_ok = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _setlabeltextsize(RemoteObject _ex,RemoteObject _txt,RemoteObject _good) throws Exception{
try {
		Debug.PushSubsStack("SetLabelTextSize (zarinpal_payment) ","zarinpal_payment",23,zarinpal_payment.mostCurrent.activityBA,zarinpal_payment.mostCurrent,132);
if (RapidSub.canDelegate("setlabeltextsize")) { return ir.saelozahra.damaara.mazraeyeman.zarinpal_payment.remoteMe.runUserSub(false, "zarinpal_payment","setlabeltextsize", _ex, _txt, _good);}
RemoteObject _dt = RemoteObject.createImmutable(0f);
RemoteObject _limit = RemoteObject.createImmutable(0f);
RemoteObject _h = RemoteObject.createImmutable(0);
RemoteObject _stu = RemoteObject.declareNull("anywheresoftware.b4a.objects.StringUtils");
Debug.locals.put("ex", _ex);
Debug.locals.put("txt", _txt);
Debug.locals.put("good", _good);
 BA.debugLineNum = 132;BA.debugLine="Private Sub SetLabelTextSize(ex As Label, txt As S";
Debug.ShouldStop(8);
 BA.debugLineNum = 133;BA.debugLine="Dim dt As Float";
Debug.ShouldStop(16);
_dt = RemoteObject.createImmutable(0f);Debug.locals.put("dt", _dt);
 BA.debugLineNum = 134;BA.debugLine="Dim limit = 0.5 As Float";
Debug.ShouldStop(32);
_limit = BA.numberCast(float.class, 0.5);Debug.locals.put("limit", _limit);Debug.locals.put("limit", _limit);
 BA.debugLineNum = 135;BA.debugLine="Dim h As Int";
Debug.ShouldStop(64);
_h = RemoteObject.createImmutable(0);Debug.locals.put("h", _h);
 BA.debugLineNum = 136;BA.debugLine="Dim stu As StringUtils";
Debug.ShouldStop(128);
_stu = RemoteObject.createNew ("anywheresoftware.b4a.objects.StringUtils");Debug.locals.put("stu", _stu);
 BA.debugLineNum = 137;BA.debugLine="ex.Text = txt";
Debug.ShouldStop(256);
_ex.runMethod(true,"setText",BA.ObjectToCharSequence(_txt));
 BA.debugLineNum = 138;BA.debugLine="ex.TextSize = good";
Debug.ShouldStop(512);
_ex.runMethod(true,"setTextSize",BA.numberCast(float.class, _good));
 BA.debugLineNum = 139;BA.debugLine="dt = ex.TextSize";
Debug.ShouldStop(1024);
_dt = _ex.runMethod(true,"getTextSize");Debug.locals.put("dt", _dt);
 BA.debugLineNum = 140;BA.debugLine="h = stu.MeasureMultilineTextHeight(ex, txt)";
Debug.ShouldStop(2048);
_h = _stu.runMethod(true,"MeasureMultilineTextHeight",(Object)((_ex.getObject())),(Object)(BA.ObjectToCharSequence(_txt)));Debug.locals.put("h", _h);
 BA.debugLineNum = 141;BA.debugLine="Do While dt > limit Or h > ex.Height";
Debug.ShouldStop(4096);
while (RemoteObject.solveBoolean(">",_dt,BA.numberCast(double.class, _limit)) || RemoteObject.solveBoolean(">",_h,BA.numberCast(double.class, _ex.runMethod(true,"getHeight")))) {
 BA.debugLineNum = 142;BA.debugLine="dt = dt / 2";
Debug.ShouldStop(8192);
_dt = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_dt,RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("dt", _dt);
 BA.debugLineNum = 143;BA.debugLine="h = stu.MeasureMultilineTextHeight(ex, txt)";
Debug.ShouldStop(16384);
_h = _stu.runMethod(true,"MeasureMultilineTextHeight",(Object)((_ex.getObject())),(Object)(BA.ObjectToCharSequence(_txt)));Debug.locals.put("h", _h);
 BA.debugLineNum = 144;BA.debugLine="If h > ex.Height Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean(">",_h,BA.numberCast(double.class, _ex.runMethod(true,"getHeight")))) { 
 BA.debugLineNum = 145;BA.debugLine="ex.TextSize = ex.TextSize - dt";
Debug.ShouldStop(65536);
_ex.runMethod(true,"setTextSize",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_ex.runMethod(true,"getTextSize"),_dt}, "-",1, 0)));
 }else {
 BA.debugLineNum = 147;BA.debugLine="ex.TextSize = ex.TextSize + dt";
Debug.ShouldStop(262144);
_ex.runMethod(true,"setTextSize",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_ex.runMethod(true,"getTextSize"),_dt}, "+",1, 0)));
 };
 }
;
 BA.debugLineNum = 150;BA.debugLine="ex.TextSize=ex.textsize * 0.8";
Debug.ShouldStop(2097152);
_ex.runMethod(true,"setTextSize",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_ex.runMethod(true,"getTextSize"),RemoteObject.createImmutable(0.8)}, "*",0, 0)));
 BA.debugLineNum = 151;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _timer_ok_tick() throws Exception{
try {
		Debug.PushSubsStack("timer_OK_Tick (zarinpal_payment) ","zarinpal_payment",23,zarinpal_payment.mostCurrent.activityBA,zarinpal_payment.mostCurrent,200);
if (RapidSub.canDelegate("timer_ok_tick")) { return ir.saelozahra.damaara.mazraeyeman.zarinpal_payment.remoteMe.runUserSub(false, "zarinpal_payment","timer_ok_tick");}
 BA.debugLineNum = 200;BA.debugLine="private Sub timer_OK_Tick";
Debug.ShouldStop(128);
 BA.debugLineNum = 201;BA.debugLine="If WebView.Url.StartsWith(Start_HostName_With&\"/v";
Debug.ShouldStop(256);
if (zarinpal_payment.mostCurrent._webview.runMethod(true,"getUrl").runMethod(true,"startsWith",(Object)(RemoteObject.concat(zarinpal_payment.mostCurrent._start_hostname_with,RemoteObject.createImmutable("/verify.php")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 202;BA.debugLine="WebView.Visible=False";
Debug.ShouldStop(512);
zarinpal_payment.mostCurrent._webview.runMethod(true,"setVisible",zarinpal_payment.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 203;BA.debugLine="Log(\"تراکنش انجام شد\")";
Debug.ShouldStop(1024);
zarinpal_payment.mostCurrent.__c.runVoidMethod ("LogImpl","423724035",RemoteObject.createImmutable("تراکنش انجام شد"),0);
 BA.debugLineNum = 204;BA.debugLine="ProgressDialogShow2(\"در حال برسی وضعیت تراکنش...";
Debug.ShouldStop(2048);
zarinpal_payment.mostCurrent.__c.runVoidMethod ("ProgressDialogShow2",zarinpal_payment.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence("در حال برسی وضعیت تراکنش...")),(Object)(zarinpal_payment.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 205;BA.debugLine="timer_OK.Enabled=False";
Debug.ShouldStop(4096);
zarinpal_payment._timer_ok.runMethod(true,"setEnabled",zarinpal_payment.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 206;BA.debugLine="htt.Initialize(\"htt\",Me)";
Debug.ShouldStop(8192);
zarinpal_payment.mostCurrent._htt.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_initialize" /*RemoteObject*/ ,zarinpal_payment.processBA,(Object)(BA.ObjectToString("htt")),(Object)(zarinpal_payment.getObject()));
 BA.debugLineNum = 207;BA.debugLine="htt.Download(WebView.Url)";
Debug.ShouldStop(16384);
zarinpal_payment.mostCurrent._htt.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(zarinpal_payment.mostCurrent._webview.runMethod(true,"getUrl")));
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
public static RemoteObject  _timer_tick() throws Exception{
try {
		Debug.PushSubsStack("timer_Tick (zarinpal_payment) ","zarinpal_payment",23,zarinpal_payment.mostCurrent.activityBA,zarinpal_payment.mostCurrent,171);
if (RapidSub.canDelegate("timer_tick")) { return ir.saelozahra.damaara.mazraeyeman.zarinpal_payment.remoteMe.runUserSub(false, "zarinpal_payment","timer_tick");}
 BA.debugLineNum = 171;BA.debugLine="private Sub timer_Tick";
Debug.ShouldStop(1024);
 BA.debugLineNum = 172;BA.debugLine="ab=WebView.Url";
Debug.ShouldStop(2048);
zarinpal_payment.mostCurrent._ab = zarinpal_payment.mostCurrent._webview.runMethod(true,"getUrl");
 BA.debugLineNum = 173;BA.debugLine="If WebView.Url.StartsWith(\"https://\")=True Or Web";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",zarinpal_payment.mostCurrent._webview.runMethod(true,"getUrl").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("https://"))),zarinpal_payment.mostCurrent.__c.getField(true,"True")) || RemoteObject.solveBoolean("=",zarinpal_payment.mostCurrent._webview.runMethod(true,"getUrl").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("Https://"))),zarinpal_payment.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 174;BA.debugLine="lbl_SSL.TextColor = Colors.Green";
Debug.ShouldStop(8192);
zarinpal_payment.mostCurrent._lbl_ssl.runMethod(true,"setTextColor",zarinpal_payment.mostCurrent.__c.getField(false,"Colors").getField(true,"Green"));
 BA.debugLineNum = 175;BA.debugLine="lbl_SSL.Text=\"\"";
Debug.ShouldStop(16384);
zarinpal_payment.mostCurrent._lbl_ssl.runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 176;BA.debugLine="ab=ab.Replace(\"https://\",\"{R}https://{R}\")";
Debug.ShouldStop(32768);
zarinpal_payment.mostCurrent._ab = zarinpal_payment.mostCurrent._ab.runMethod(true,"replace",(Object)(BA.ObjectToString("https://")),(Object)(RemoteObject.createImmutable("{R}https://{R}")));
 BA.debugLineNum = 177;BA.debugLine="r.Initialize(ab)";
Debug.ShouldStop(65536);
zarinpal_payment.mostCurrent._r.runVoidMethod ("Initialize",(Object)(BA.ObjectToCharSequence(zarinpal_payment.mostCurrent._ab)));
 BA.debugLineNum = 178;BA.debugLine="r.Color2(Colors.Green,\"{R}\")";
Debug.ShouldStop(131072);
zarinpal_payment.mostCurrent._r.runVoidMethod ("Color2",(Object)(zarinpal_payment.mostCurrent.__c.getField(false,"Colors").getField(true,"Green")),(Object)(RemoteObject.createImmutable("{R}")));
 }else {
 BA.debugLineNum = 180;BA.debugLine="lbl_SSL.TextColor = Colors.Red";
Debug.ShouldStop(524288);
zarinpal_payment.mostCurrent._lbl_ssl.runMethod(true,"setTextColor",zarinpal_payment.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 181;BA.debugLine="lbl_SSL.Text=\"\"";
Debug.ShouldStop(1048576);
zarinpal_payment.mostCurrent._lbl_ssl.runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 182;BA.debugLine="ab=ab.Replace(\"www.\",\"{R}www.{R}\")";
Debug.ShouldStop(2097152);
zarinpal_payment.mostCurrent._ab = zarinpal_payment.mostCurrent._ab.runMethod(true,"replace",(Object)(BA.ObjectToString("www.")),(Object)(RemoteObject.createImmutable("{R}www.{R}")));
 BA.debugLineNum = 183;BA.debugLine="ab=ab.Replace(\"http://\",\"{R}http://{R}\")";
Debug.ShouldStop(4194304);
zarinpal_payment.mostCurrent._ab = zarinpal_payment.mostCurrent._ab.runMethod(true,"replace",(Object)(BA.ObjectToString("http://")),(Object)(RemoteObject.createImmutable("{R}http://{R}")));
 BA.debugLineNum = 184;BA.debugLine="r.Initialize(ab)";
Debug.ShouldStop(8388608);
zarinpal_payment.mostCurrent._r.runVoidMethod ("Initialize",(Object)(BA.ObjectToCharSequence(zarinpal_payment.mostCurrent._ab)));
 BA.debugLineNum = 185;BA.debugLine="r.Color2(Colors.Red,\"{R}\")";
Debug.ShouldStop(16777216);
zarinpal_payment.mostCurrent._r.runVoidMethod ("Color2",(Object)(zarinpal_payment.mostCurrent.__c.getField(false,"Colors").getField(true,"Red")),(Object)(RemoteObject.createImmutable("{R}")));
 };
 BA.debugLineNum = 188;BA.debugLine="lbl_Address.Text =r";
Debug.ShouldStop(134217728);
zarinpal_payment.mostCurrent._lbl_address.runMethod(true,"setText",BA.ObjectToCharSequence(zarinpal_payment.mostCurrent._r.getObject()));
 BA.debugLineNum = 190;BA.debugLine="If lbl_Address.Text.StartsWith(\"zarinpal://otpAut";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",zarinpal_payment.mostCurrent._lbl_address.runMethod(true,"getText").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("zarinpal://otpAuthorize"))),zarinpal_payment.mostCurrent.__c.getField(true,"True")) && RemoteObject.solveBoolean("=",zarinpal_payment._bool,zarinpal_payment.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 191;BA.debugLine="ToastMessageShow(\"نمی توان از اپیکیشن زرین پال ب";
Debug.ShouldStop(1073741824);
zarinpal_payment.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("نمی توان از اپیکیشن زرین پال برای پرداخت استفاده کرد!")),(Object)(zarinpal_payment.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 192;BA.debugLine="WebView.Back";
Debug.ShouldStop(-2147483648);
zarinpal_payment.mostCurrent._webview.runVoidMethod ("Back");
 BA.debugLineNum = 193;BA.debugLine="bool = False";
Debug.ShouldStop(1);
zarinpal_payment._bool = zarinpal_payment.mostCurrent.__c.getField(true,"False");
 }else 
{ BA.debugLineNum = 194;BA.debugLine="else If lbl_Address.Text.StartsWith(\"zarinpal://o";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",zarinpal_payment.mostCurrent._lbl_address.runMethod(true,"getText").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("zarinpal://otpAuthorize"))),zarinpal_payment.mostCurrent.__c.getField(true,"False")) && RemoteObject.solveBoolean("=",zarinpal_payment._bool,zarinpal_payment.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 195;BA.debugLine="bool = True";
Debug.ShouldStop(4);
zarinpal_payment._bool = zarinpal_payment.mostCurrent.__c.getField(true,"True");
 }}
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
}