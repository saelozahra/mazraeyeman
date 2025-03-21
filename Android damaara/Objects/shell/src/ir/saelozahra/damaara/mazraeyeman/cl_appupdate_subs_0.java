package ir.saelozahra.damaara.mazraeyeman;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cl_appupdate_subs_0 {


public static RemoteObject  _canrequestpackageinstalls(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CanRequestPackageInstalls (cl_appupdate) ","cl_appupdate",24,__ref.getField(false, "ba"),__ref,448);
if (RapidSub.canDelegate("canrequestpackageinstalls")) { return __ref.runUserSub(false, "cl_appupdate","canrequestpackageinstalls", __ref);}
RemoteObject _ctxt = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _packagemanager = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
 BA.debugLineNum = 448;BA.debugLine="Public Sub CanRequestPackageInstalls As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 449;BA.debugLine="Dim ctxt As JavaObject";
Debug.JustUpdateDeviceLine();
_ctxt = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("ctxt", _ctxt);
 BA.debugLineNum = 450;BA.debugLine="ctxt.InitializeContext";
Debug.JustUpdateDeviceLine();
_ctxt.runVoidMethod ("InitializeContext",__ref.getField(false, "ba"));
 BA.debugLineNum = 451;BA.debugLine="Dim PackageManager As JavaObject = ctxt.RunMethod";
Debug.JustUpdateDeviceLine();
_packagemanager = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_packagemanager = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _ctxt.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getPackageManager")),(Object)((cl_appupdate.__c.getField(false,"Null")))));Debug.locals.put("PackageManager", _packagemanager);Debug.locals.put("PackageManager", _packagemanager);
 BA.debugLineNum = 452;BA.debugLine="Return PackageManager.RunMethod(\"canRequestPackag";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToBoolean(_packagemanager.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("canRequestPackageInstalls")),(Object)((cl_appupdate.__c.getField(false,"Null")))));
 BA.debugLineNum = 453;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checknonmarketappsenabled(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CheckNonMarketAppsEnabled (cl_appupdate) ","cl_appupdate",24,__ref.getField(false, "ba"),__ref,471);
if (RapidSub.canDelegate("checknonmarketappsenabled")) { return __ref.runUserSub(false, "cl_appupdate","checknonmarketappsenabled", __ref);}
RemoteObject _context = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _resolver = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _global = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
 BA.debugLineNum = 471;BA.debugLine="Public Sub CheckNonMarketAppsEnabled As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 472;BA.debugLine="If phone.SdkVersion >= 26 Then Return True";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("g",__ref.getField(false,"_phone" /*RemoteObject*/ ).runMethod(true,"getSdkVersion"),BA.numberCast(double.class, 26))) { 
if (true) return cl_appupdate.__c.getField(true,"True");};
 BA.debugLineNum = 473;BA.debugLine="If phone.SdkVersion < 17 Or phone.SdkVersion >= 2";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",__ref.getField(false,"_phone" /*RemoteObject*/ ).runMethod(true,"getSdkVersion"),BA.numberCast(double.class, 17)) || RemoteObject.solveBoolean("g",__ref.getField(false,"_phone" /*RemoteObject*/ ).runMethod(true,"getSdkVersion"),BA.numberCast(double.class, 21))) { 
 BA.debugLineNum = 474;BA.debugLine="Return phone.GetSettings(\"install_non_market_app";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.getField(false,"_phone" /*RemoteObject*/ ).runMethod(true,"GetSettings",(Object)(RemoteObject.createImmutable("install_non_market_apps"))),BA.ObjectToString("1")));
 }else {
 BA.debugLineNum = 476;BA.debugLine="Dim context As JavaObject";
Debug.JustUpdateDeviceLine();
_context = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("context", _context);
 BA.debugLineNum = 477;BA.debugLine="context.InitializeContext";
Debug.JustUpdateDeviceLine();
_context.runVoidMethod ("InitializeContext",__ref.getField(false, "ba"));
 BA.debugLineNum = 478;BA.debugLine="Dim resolver As JavaObject = context.RunMethod(\"";
Debug.JustUpdateDeviceLine();
_resolver = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_resolver = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _context.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getContentResolver")),(Object)((cl_appupdate.__c.getField(false,"Null")))));Debug.locals.put("resolver", _resolver);Debug.locals.put("resolver", _resolver);
 BA.debugLineNum = 479;BA.debugLine="Dim global As JavaObject";
Debug.JustUpdateDeviceLine();
_global = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("global", _global);
 BA.debugLineNum = 480;BA.debugLine="global.InitializeStatic(\"android.provider.Settin";
Debug.JustUpdateDeviceLine();
_global.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("android.provider.Settings.Global")));
 BA.debugLineNum = 481;BA.debugLine="Return global.RunMethod(\"getString\", Array(resol";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_global.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getString")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_resolver.getObject()),(RemoteObject.createImmutable("install_non_market_apps"))}))),RemoteObject.createImmutable(("1"))));
 };
 BA.debugLineNum = 483;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Private Sub Class_Globals";
 //BA.debugLineNum = 8;BA.debugLine="Public ERR_NOPKG = -1	As Int				'missing package";
cl_appupdate._err_nopkg = BA.numberCast(int.class, -(double) (0 + 1));__ref.setField("_err_nopkg",cl_appupdate._err_nopkg);
 //BA.debugLineNum = 9;BA.debugLine="Public ERR_NOTXT = -2 As Int				'missing webserve";
cl_appupdate._err_notxt = BA.numberCast(int.class, -(double) (0 + 2));__ref.setField("_err_notxt",cl_appupdate._err_notxt);
 //BA.debugLineNum = 10;BA.debugLine="Public ERR_NOAPK = -3 As Int				'missing webserve";
cl_appupdate._err_noapk = BA.numberCast(int.class, -(double) (0 + 3));__ref.setField("_err_noapk",cl_appupdate._err_noapk);
 //BA.debugLineNum = 11;BA.debugLine="Public ERR_TXTROW = -4 As Int				'wrong row forma";
cl_appupdate._err_txtrow = BA.numberCast(int.class, -(double) (0 + 4));__ref.setField("_err_txtrow",cl_appupdate._err_txtrow);
 //BA.debugLineNum = 12;BA.debugLine="Public ERR_HTML = -5 As Int					'website returned";
cl_appupdate._err_html = BA.numberCast(int.class, -(double) (0 + 5));__ref.setField("_err_html",cl_appupdate._err_html);
 //BA.debugLineNum = 13;BA.debugLine="Public ERR_NOSPACE = -6 As Int				'no enough spac";
cl_appupdate._err_nospace = BA.numberCast(int.class, -(double) (0 + 6));__ref.setField("_err_nospace",cl_appupdate._err_nospace);
 //BA.debugLineNum = 14;BA.debugLine="Public ERR_NOPERM = -7 As Int				'no permissions";
cl_appupdate._err_noperm = BA.numberCast(int.class, -(double) (0 + 7));__ref.setField("_err_noperm",cl_appupdate._err_noperm);
 //BA.debugLineNum = 15;BA.debugLine="Public ERR_DOWNLOAD = -8 As Int				'failed to dow";
cl_appupdate._err_download = BA.numberCast(int.class, -(double) (0 + 8));__ref.setField("_err_download",cl_appupdate._err_download);
 //BA.debugLineNum = 16;BA.debugLine="Public ERR_HTTP = -100 As Int				'HttpUtils error";
cl_appupdate._err_http = BA.numberCast(int.class, -(double) (0 + 100));__ref.setField("_err_http",cl_appupdate._err_http);
 //BA.debugLineNum = 17;BA.debugLine="Public OK_INIT = 0 As Int";
cl_appupdate._ok_init = BA.numberCast(int.class, 0);__ref.setField("_ok_init",cl_appupdate._ok_init);
 //BA.debugLineNum = 18;BA.debugLine="Public OK_CURVER = 1 As Int					'curver has valid";
cl_appupdate._ok_curver = BA.numberCast(int.class, 1);__ref.setField("_ok_curver",cl_appupdate._ok_curver);
 //BA.debugLineNum = 19;BA.debugLine="Public OK_WEBVER = 2 As Int";
cl_appupdate._ok_webver = BA.numberCast(int.class, 2);__ref.setField("_ok_webver",cl_appupdate._ok_webver);
 //BA.debugLineNum = 20;BA.debugLine="Public NO_NEWERAPK = 3 As Int				'apk version on";
cl_appupdate._no_newerapk = BA.numberCast(int.class, 3);__ref.setField("_no_newerapk",cl_appupdate._no_newerapk);
 //BA.debugLineNum = 21;BA.debugLine="Public OK_NEWERAPK = 4 As Int				'current apk has";
cl_appupdate._ok_newerapk = BA.numberCast(int.class, 4);__ref.setField("_ok_newerapk",cl_appupdate._ok_newerapk);
 //BA.debugLineNum = 22;BA.debugLine="Public OK_DOWNLOAD = 5 As Int				'newer apk corre";
cl_appupdate._ok_download = BA.numberCast(int.class, 5);__ref.setField("_ok_download",cl_appupdate._ok_download);
 //BA.debugLineNum = 23;BA.debugLine="Public OK_INSTALL = 6 As Int				'user asked to in";
cl_appupdate._ok_install = BA.numberCast(int.class, 6);__ref.setField("_ok_install",cl_appupdate._ok_install);
 //BA.debugLineNum = 26;BA.debugLine="Private Callback As Object";
cl_appupdate._callback = RemoteObject.createNew ("Object");__ref.setField("_callback",cl_appupdate._callback);
 //BA.debugLineNum = 27;BA.debugLine="Private Event As String";
cl_appupdate._event = RemoteObject.createImmutable("");__ref.setField("_event",cl_appupdate._event);
 //BA.debugLineNum = 28;BA.debugLine="Private sPackageName As String      		'ex: com.te";
cl_appupdate._spackagename = RemoteObject.createImmutable("");__ref.setField("_spackagename",cl_appupdate._spackagename);
 //BA.debugLineNum = 29;BA.debugLine="Private sNewVerTxt As String        		'ex: http:/";
cl_appupdate._snewvertxt = RemoteObject.createImmutable("");__ref.setField("_snewvertxt",cl_appupdate._snewvertxt);
 //BA.debugLineNum = 30;BA.debugLine="Private sNewVerApk  As String       		'ex: http:/";
cl_appupdate._snewverapk = RemoteObject.createImmutable("");__ref.setField("_snewverapk",cl_appupdate._snewverapk);
 //BA.debugLineNum = 31;BA.debugLine="Private sStatusCode As Int          		'negatives";
cl_appupdate._sstatuscode = RemoteObject.createImmutable(0);__ref.setField("_sstatuscode",cl_appupdate._sstatuscode);
 //BA.debugLineNum = 32;BA.debugLine="Private sUserName As String         		'user name";
cl_appupdate._susername = RemoteObject.createImmutable("");__ref.setField("_susername",cl_appupdate._susername);
 //BA.debugLineNum = 33;BA.debugLine="Private sUPassword As String        		'password r";
cl_appupdate._supassword = RemoteObject.createImmutable("");__ref.setField("_supassword",cl_appupdate._supassword);
 //BA.debugLineNum = 34;BA.debugLine="Private curver, webver As String    		'curver = c";
cl_appupdate._curver = RemoteObject.createImmutable("");__ref.setField("_curver",cl_appupdate._curver);
cl_appupdate._webver = RemoteObject.createImmutable("");__ref.setField("_webver",cl_appupdate._webver);
 //BA.debugLineNum = 35;BA.debugLine="Private webclog As String					'webclog = optional";
cl_appupdate._webclog = RemoteObject.createImmutable("");__ref.setField("_webclog",cl_appupdate._webclog);
 //BA.debugLineNum = 36;BA.debugLine="Private webfsize As String					'webfsize = option";
cl_appupdate._webfsize = RemoteObject.createImmutable("");__ref.setField("_webfsize",cl_appupdate._webfsize);
 //BA.debugLineNum = 37;BA.debugLine="Private sVerbose As Boolean					'TRUE = a lot of";
cl_appupdate._sverbose = RemoteObject.createImmutable(false);__ref.setField("_sverbose",cl_appupdate._sverbose);
 //BA.debugLineNum = 38;BA.debugLine="Private pnlSplash As Panel					'panel used to sup";
cl_appupdate._pnlsplash = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnlsplash",cl_appupdate._pnlsplash);
 //BA.debugLineNum = 39;BA.debugLine="Private SplashShowing As Boolean			'True = splash";
cl_appupdate._splashshowing = RemoteObject.createImmutable(false);__ref.setField("_splashshowing",cl_appupdate._splashshowing);
 //BA.debugLineNum = 40;BA.debugLine="Private phone As Phone";
cl_appupdate._phone = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone");__ref.setField("_phone",cl_appupdate._phone);
 //BA.debugLineNum = 41;BA.debugLine="Private rp As RuntimePermissions";
cl_appupdate._rp = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");__ref.setField("_rp",cl_appupdate._rp);
 //BA.debugLineNum = 42;BA.debugLine="Private SharedFolder As String				'Foder where to";
cl_appupdate._sharedfolder = RemoteObject.createImmutable("");__ref.setField("_sharedfolder",cl_appupdate._sharedfolder);
 //BA.debugLineNum = 43;BA.debugLine="Private UseFileProvider As Boolean			'TRUE = SDK";
cl_appupdate._usefileprovider = RemoteObject.createImmutable(false);__ref.setField("_usefileprovider",cl_appupdate._usefileprovider);
 //BA.debugLineNum = 44;BA.debugLine="Private LogColor1 As Int = 0xFFFF8C00		'first col";
cl_appupdate._logcolor1 = BA.numberCast(int.class, ((int)0xffff8c00));__ref.setField("_logcolor1",cl_appupdate._logcolor1);
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static void  _downloadapk(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("DownloadApk (cl_appupdate) ","cl_appupdate",24,__ref.getField(false, "ba"),__ref,158);
if (RapidSub.canDelegate("downloadapk")) { __ref.runUserSub(false, "cl_appupdate","downloadapk", __ref); return;}
ResumableSub_DownloadApk rsub = new ResumableSub_DownloadApk(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_DownloadApk extends BA.ResumableSub {
public ResumableSub_DownloadApk(ir.saelozahra.damaara.mazraeyeman.cl_appupdate parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
ir.saelozahra.damaara.mazraeyeman.cl_appupdate parent;
RemoteObject _j = RemoteObject.declareNull("ir.saelozahra.damaara.mazraeyeman.httpjob");
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DownloadApk (cl_appupdate) ","cl_appupdate",24,__ref.getField(false, "ba"),__ref,158);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 159;BA.debugLine="LogColor(\"---- AppUpdating.DownloadApk\", LogColor";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","925165825",BA.ObjectToString("---- AppUpdating.DownloadApk"),__ref.getField(true,"_logcolor1" /*RemoteObject*/ ));
 BA.debugLineNum = 161;BA.debugLine="If sNewVerApk = \"\" Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_snewverapk" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 162;BA.debugLine="sStatusCode = ERR_NOAPK";
Debug.JustUpdateDeviceLine();
__ref.setField ("_sstatuscode" /*RemoteObject*/ ,__ref.getField(true,"_err_noapk" /*RemoteObject*/ ));
 BA.debugLineNum = 163;BA.debugLine="If sVerbose Then Log($\"${TAB}missing apk file fu";
Debug.JustUpdateDeviceLine();
if (true) break;

case 4:
//if
this.state = 9;
if (__ref.getField(true,"_sverbose" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
parent.__c.runVoidMethod ("LogImpl","925165829",(RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.__c.getField(true,"TAB")))),RemoteObject.createImmutable("missing apk file full path indication"))),0);
if (true) break;

case 9:
//C
this.state = 10;
;
 BA.debugLineNum = 164;BA.debugLine="Finito";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (ir.saelozahra.damaara.mazraeyeman.cl_appupdate.class, "_finito" /*RemoteObject*/ );
 BA.debugLineNum = 165;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return ;
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 168;BA.debugLine="Dim j As HttpJob";
Debug.JustUpdateDeviceLine();
_j = RemoteObject.createNew ("ir.saelozahra.damaara.mazraeyeman.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 169;BA.debugLine="j.Initialize(\"\", Me)";
Debug.JustUpdateDeviceLine();
_j.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 170;BA.debugLine="j.Username = sUserName";
Debug.JustUpdateDeviceLine();
_j.setField ("_username" /*RemoteObject*/ ,__ref.getField(true,"_susername" /*RemoteObject*/ ));
 BA.debugLineNum = 171;BA.debugLine="j.Password = sUPassword";
Debug.JustUpdateDeviceLine();
_j.setField ("_password" /*RemoteObject*/ ,__ref.getField(true,"_supassword" /*RemoteObject*/ ));
 BA.debugLineNum = 172;BA.debugLine="j.Download(sNewVerApk)							'ex: j.Download(\"htt";
Debug.JustUpdateDeviceLine();
_j.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_snewverapk" /*RemoteObject*/ )));
 BA.debugLineNum = 173;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cl_appupdate", "downloadapk"), (_j));
this.state = 29;
return;
case 29:
//C
this.state = 11;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 174;BA.debugLine="Log($\"Donload ok? ${j.Success}\"$)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","925165840",(RemoteObject.concat(RemoteObject.createImmutable("Donload ok? "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_j.getField(true,"_success" /*RemoteObject*/ )))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 175;BA.debugLine="If j.Success Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 11:
//if
this.state = 28;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 13;
}else {
this.state = 21;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 177;BA.debugLine="Dim out As OutputStream";
Debug.JustUpdateDeviceLine();
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");Debug.locals.put("out", _out);
 BA.debugLineNum = 178;BA.debugLine="out = File.OpenOutput(SharedFolder,\"tmp.apk\",Fal";
Debug.JustUpdateDeviceLine();
_out = parent.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(__ref.getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(BA.ObjectToString("tmp.apk")),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("out", _out);
 BA.debugLineNum = 179;BA.debugLine="File.Copy2(J.GetInputStream, out)";
Debug.JustUpdateDeviceLine();
parent.__c.getField(false,"File").runVoidMethod ("Copy2",(Object)((_j.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_getinputstream" /*RemoteObject*/ ).getObject())),(Object)((_out.getObject())));
 BA.debugLineNum = 180;BA.debugLine="out.Close";
Debug.JustUpdateDeviceLine();
_out.runVoidMethod ("Close");
 BA.debugLineNum = 181;BA.debugLine="Log($\"Copy2 (saving) ok? TRUE\"$)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","925165847",(RemoteObject.createImmutable("Copy2 (saving) ok? TRUE")),0);
 BA.debugLineNum = 182;BA.debugLine="sStatusCode = OK_DOWNLOAD";
Debug.JustUpdateDeviceLine();
__ref.setField ("_sstatuscode" /*RemoteObject*/ ,__ref.getField(true,"_ok_download" /*RemoteObject*/ ));
 BA.debugLineNum = 183;BA.debugLine="If sVerbose Then Log($\"${TAB}new apk version dow";
Debug.JustUpdateDeviceLine();
if (true) break;

case 14:
//if
this.state = 19;
if (__ref.getField(true,"_sverbose" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 16;
;}if (true) break;

case 16:
//C
this.state = 19;
parent.__c.runVoidMethod ("LogImpl","925165849",(RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.__c.getField(true,"TAB")))),RemoteObject.createImmutable("new apk version downloaded and ready to install"))),0);
if (true) break;

case 19:
//C
this.state = 28;
;
 if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 185;BA.debugLine="Log($\"${TAB}Error: ${J.ErrorMessage}\"$)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","925165851",(RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.__c.getField(true,"TAB")))),RemoteObject.createImmutable("Error: "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_j.getField(true,"_errormessage" /*RemoteObject*/ )))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 186;BA.debugLine="sStatusCode = ERR_HTTP";
Debug.JustUpdateDeviceLine();
__ref.setField ("_sstatuscode" /*RemoteObject*/ ,__ref.getField(true,"_err_http" /*RemoteObject*/ ));
 BA.debugLineNum = 187;BA.debugLine="If sVerbose Then Log($\"${TAB}error in httputils2";
Debug.JustUpdateDeviceLine();
if (true) break;

case 22:
//if
this.state = 27;
if (__ref.getField(true,"_sverbose" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 24;
;}if (true) break;

case 24:
//C
this.state = 27;
parent.__c.runVoidMethod ("LogImpl","925165853",(RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.__c.getField(true,"TAB")))),RemoteObject.createImmutable("error in httputils2"))),0);
if (true) break;

case 27:
//C
this.state = 28;
;
 BA.debugLineNum = 188;BA.debugLine="ToastMessageShow(\"Error: \" & J.ErrorMessage, Tru";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Error: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )))),(Object)(parent.__c.getField(true,"True")));
 if (true) break;

case 28:
//C
this.state = -1;
;
 BA.debugLineNum = 190;BA.debugLine="j.Release";
Debug.JustUpdateDeviceLine();
_j.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 191;BA.debugLine="Finito";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (ir.saelozahra.damaara.mazraeyeman.cl_appupdate.class, "_finito" /*RemoteObject*/ );
 BA.debugLineNum = 192;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static void  _jobdone(RemoteObject __ref,RemoteObject _j) throws Exception{
}
public static RemoteObject  _extractcl(RemoteObject __ref,RemoteObject _txtrow) throws Exception{
try {
		Debug.PushSubsStack("ExtractCL (cl_appupdate) ","cl_appupdate",24,__ref.getField(false, "ba"),__ref,381);
if (RapidSub.canDelegate("extractcl")) { return __ref.runUserSub(false, "cl_appupdate","extractcl", __ref, _txtrow);}
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _j1 = RemoteObject.createImmutable(0);
RemoteObject _j2 = RemoteObject.createImmutable(0);
Debug.locals.put("TxtRow", _txtrow);
 BA.debugLineNum = 381;BA.debugLine="Private Sub ExtractCL(TxtRow As String) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 382;BA.debugLine="Dim i As Int";
Debug.JustUpdateDeviceLine();
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 383;BA.debugLine="i = TxtRow.IndexOf(\"<ChangeLog>\")";
Debug.JustUpdateDeviceLine();
_i = _txtrow.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("<ChangeLog>")));Debug.locals.put("i", _i);
 BA.debugLineNum = 384;BA.debugLine="If i <> -1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_i,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 385;BA.debugLine="Dim j1 As Int = TxtRow.IndexOf(\"</ChangeLog>\")";
Debug.JustUpdateDeviceLine();
_j1 = _txtrow.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("</ChangeLog>")));Debug.locals.put("j1", _j1);Debug.locals.put("j1", _j1);
 BA.debugLineNum = 386;BA.debugLine="If j1 = -1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_j1,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 387;BA.debugLine="Dim j2 As Int = TxtRow.IndexOf(\"<FileSize>\")	'l";
Debug.JustUpdateDeviceLine();
_j2 = _txtrow.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("<FileSize>")));Debug.locals.put("j2", _j2);Debug.locals.put("j2", _j2);
 BA.debugLineNum = 388;BA.debugLine="j1 = j2";
Debug.JustUpdateDeviceLine();
_j1 = _j2;Debug.locals.put("j1", _j1);
 BA.debugLineNum = 389;BA.debugLine="If j1 < i Then j1 = -1";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",_j1,BA.numberCast(double.class, _i))) { 
_j1 = BA.numberCast(int.class, -(double) (0 + 1));Debug.locals.put("j1", _j1);};
 };
 BA.debugLineNum = 391;BA.debugLine="If j1 <> -1 Then Return TxtRow.SubString2(i+11,j";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_j1,BA.numberCast(double.class, -(double) (0 + 1)))) { 
if (true) return _txtrow.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(11)}, "+",1, 1)),(Object)(_j1));}
else {
if (true) return _txtrow.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(11)}, "+",1, 1)));};
 }else {
 BA.debugLineNum = 393;BA.debugLine="Return \"\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("");
 };
 BA.debugLineNum = 395;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _extractsz(RemoteObject __ref,RemoteObject _txtrow) throws Exception{
try {
		Debug.PushSubsStack("ExtractSZ (cl_appupdate) ","cl_appupdate",24,__ref.getField(false, "ba"),__ref,399);
if (RapidSub.canDelegate("extractsz")) { return __ref.runUserSub(false, "cl_appupdate","extractsz", __ref, _txtrow);}
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _j1 = RemoteObject.createImmutable(0);
RemoteObject _j2 = RemoteObject.createImmutable(0);
RemoteObject _s = RemoteObject.createImmutable("");
Debug.locals.put("TxtRow", _txtrow);
 BA.debugLineNum = 399;BA.debugLine="Private Sub ExtractSZ(TxtRow As String) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 400;BA.debugLine="Dim i As Int";
Debug.JustUpdateDeviceLine();
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 401;BA.debugLine="i = TxtRow.IndexOf(\"<FileSize>\")";
Debug.JustUpdateDeviceLine();
_i = _txtrow.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("<FileSize>")));Debug.locals.put("i", _i);
 BA.debugLineNum = 402;BA.debugLine="If i <> -1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_i,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 403;BA.debugLine="Dim j1 As Int = TxtRow.IndexOf(\"</FileSize>\")		'";
Debug.JustUpdateDeviceLine();
_j1 = _txtrow.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("</FileSize>")));Debug.locals.put("j1", _j1);Debug.locals.put("j1", _j1);
 BA.debugLineNum = 404;BA.debugLine="If j1 = -1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_j1,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 405;BA.debugLine="Dim j2 As Int = TxtRow.IndexOf(\"<ChangeLog>\")	'";
Debug.JustUpdateDeviceLine();
_j2 = _txtrow.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("<ChangeLog>")));Debug.locals.put("j2", _j2);Debug.locals.put("j2", _j2);
 BA.debugLineNum = 406;BA.debugLine="j1 = j2";
Debug.JustUpdateDeviceLine();
_j1 = _j2;Debug.locals.put("j1", _j1);
 BA.debugLineNum = 407;BA.debugLine="If j1 < i Then j1 = -1";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",_j1,BA.numberCast(double.class, _i))) { 
_j1 = BA.numberCast(int.class, -(double) (0 + 1));Debug.locals.put("j1", _j1);};
 };
 BA.debugLineNum = 409;BA.debugLine="Dim s As String";
Debug.JustUpdateDeviceLine();
_s = RemoteObject.createImmutable("");Debug.locals.put("s", _s);
 BA.debugLineNum = 410;BA.debugLine="If j1 <> -1 Then s = TxtRow.SubString2(i+10,j1)";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_j1,BA.numberCast(double.class, -(double) (0 + 1)))) { 
_s = _txtrow.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(10)}, "+",1, 1)),(Object)(_j1));Debug.locals.put("s", _s);}
else {
_s = _txtrow.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(10)}, "+",1, 1)));Debug.locals.put("s", _s);};
 BA.debugLineNum = 411;BA.debugLine="s = s.Replace(CRLF,\"\")";
Debug.JustUpdateDeviceLine();
_s = _s.runMethod(true,"replace",(Object)(cl_appupdate.__c.getField(true,"CRLF")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("s", _s);
 BA.debugLineNum = 412;BA.debugLine="s=s.Replace(Chr(13),\"\")";
Debug.JustUpdateDeviceLine();
_s = _s.runMethod(true,"replace",(Object)(BA.ObjectToString(cl_appupdate.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 13))))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("s", _s);
 BA.debugLineNum = 413;BA.debugLine="Return s";
Debug.JustUpdateDeviceLine();
if (true) return _s;
 }else {
 BA.debugLineNum = 415;BA.debugLine="Return \"\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("");
 };
 BA.debugLineNum = 417;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _extractvn(RemoteObject __ref,RemoteObject _txtrow) throws Exception{
try {
		Debug.PushSubsStack("ExtractVN (cl_appupdate) ","cl_appupdate",24,__ref.getField(false, "ba"),__ref,360);
if (RapidSub.canDelegate("extractvn")) { return __ref.runUserSub(false, "cl_appupdate","extractvn", __ref, _txtrow);}
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _j1 = RemoteObject.createImmutable(0);
RemoteObject _j2 = RemoteObject.createImmutable(0);
RemoteObject _j = RemoteObject.createImmutable(0);
RemoteObject _s = RemoteObject.createImmutable("");
Debug.locals.put("TxtRow", _txtrow);
 BA.debugLineNum = 360;BA.debugLine="Private Sub ExtractVN(TxtRow As String) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 361;BA.debugLine="Dim i As Int";
Debug.JustUpdateDeviceLine();
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 362;BA.debugLine="i = TxtRow.IndexOf(\"=\")";
Debug.JustUpdateDeviceLine();
_i = _txtrow.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("=")));Debug.locals.put("i", _i);
 BA.debugLineNum = 363;BA.debugLine="If i <> -1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_i,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 364;BA.debugLine="Dim j1 As Int = TxtRow.IndexOf(\"<ChangeLog>\")	'l";
Debug.JustUpdateDeviceLine();
_j1 = _txtrow.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("<ChangeLog>")));Debug.locals.put("j1", _j1);Debug.locals.put("j1", _j1);
 BA.debugLineNum = 365;BA.debugLine="Dim j2 As Int = TxtRow.IndexOf(\"<FileSize>\")	'lo";
Debug.JustUpdateDeviceLine();
_j2 = _txtrow.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("<FileSize>")));Debug.locals.put("j2", _j2);Debug.locals.put("j2", _j2);
 BA.debugLineNum = 366;BA.debugLine="Dim j As Int = Min(j1, j2)";
Debug.JustUpdateDeviceLine();
_j = BA.numberCast(int.class, cl_appupdate.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, _j1)),(Object)(BA.numberCast(double.class, _j2))));Debug.locals.put("j", _j);Debug.locals.put("j", _j);
 BA.debugLineNum = 367;BA.debugLine="If j = -1 Then j = Max(j1,j2)";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_j,BA.numberCast(double.class, -(double) (0 + 1)))) { 
_j = BA.numberCast(int.class, cl_appupdate.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, _j1)),(Object)(BA.numberCast(double.class, _j2))));Debug.locals.put("j", _j);};
 BA.debugLineNum = 368;BA.debugLine="Dim s As String";
Debug.JustUpdateDeviceLine();
_s = RemoteObject.createImmutable("");Debug.locals.put("s", _s);
 BA.debugLineNum = 369;BA.debugLine="If j <> - 1 Then s=TxtRow.SubString2(i+1,j) Else";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_j,BA.numberCast(double.class, -(double) (0 + 1)))) { 
_s = _txtrow.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)(_j));Debug.locals.put("s", _s);}
else {
_s = _txtrow.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1)));Debug.locals.put("s", _s);};
 BA.debugLineNum = 370;BA.debugLine="s=s.Replace(CRLF,\"\")";
Debug.JustUpdateDeviceLine();
_s = _s.runMethod(true,"replace",(Object)(cl_appupdate.__c.getField(true,"CRLF")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("s", _s);
 BA.debugLineNum = 371;BA.debugLine="s=s.Replace(Chr(13),\"\")";
Debug.JustUpdateDeviceLine();
_s = _s.runMethod(true,"replace",(Object)(BA.ObjectToString(cl_appupdate.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 13))))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("s", _s);
 BA.debugLineNum = 372;BA.debugLine="Return s";
Debug.JustUpdateDeviceLine();
if (true) return _s;
 }else {
 BA.debugLineNum = 374;BA.debugLine="Return \"\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("");
 };
 BA.debugLineNum = 376;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _finito(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Finito (cl_appupdate) ","cl_appupdate",24,__ref.getField(false, "ba"),__ref,290);
if (RapidSub.canDelegate("finito")) { return __ref.runUserSub(false, "cl_appupdate","finito", __ref);}
 BA.debugLineNum = 290;BA.debugLine="Private Sub Finito";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 291;BA.debugLine="If SubExists(Callback,Event&\"_UpdateComplete\") Th";
Debug.JustUpdateDeviceLine();
if (cl_appupdate.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_event" /*RemoteObject*/ ),RemoteObject.createImmutable("_UpdateComplete")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 292;BA.debugLine="CallSub(Callback,Event&\"_UpdateComplete\")";
Debug.JustUpdateDeviceLine();
cl_appupdate.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_event" /*RemoteObject*/ ),RemoteObject.createImmutable("_UpdateComplete"))));
 };
 BA.debugLineNum = 294;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getavailablespace(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetAvailableSpace (cl_appupdate) ","cl_appupdate",24,__ref.getField(false, "ba"),__ref,137);
if (RapidSub.canDelegate("getavailablespace")) { return __ref.runUserSub(false, "cl_appupdate","getavailablespace", __ref);}
 BA.debugLineNum = 137;BA.debugLine="Public Sub GetAvailableSpace As Long";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 138;BA.debugLine="Return GetFreeSpace";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (ir.saelozahra.damaara.mazraeyeman.cl_appupdate.class, "_getfreespace" /*RemoteObject*/ );
 BA.debugLineNum = 139;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcurvn(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getCurVN (cl_appupdate) ","cl_appupdate",24,__ref.getField(false, "ba"),__ref,114);
if (RapidSub.canDelegate("getcurvn")) { return __ref.runUserSub(false, "cl_appupdate","getcurvn", __ref);}
 BA.debugLineNum = 114;BA.debugLine="Public Sub getCurVN As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 115;BA.debugLine="Return curver";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_curver" /*RemoteObject*/ );
 BA.debugLineNum = 116;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getfileuri(RemoteObject __ref,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("GetFileUri (cl_appupdate) ","cl_appupdate",24,__ref.getField(false, "ba"),__ref,503);
if (RapidSub.canDelegate("getfileuri")) { return __ref.runUserSub(false, "cl_appupdate","getfileuri", __ref, _filename);}
RemoteObject _uri = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _f = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _fp = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _context = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 503;BA.debugLine="Private Sub GetFileUri (FileName As String) As Obj";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 504;BA.debugLine="If UseFileProvider = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_usefileprovider" /*RemoteObject*/ ),cl_appupdate.__c.getField(true,"False"))) { 
 BA.debugLineNum = 505;BA.debugLine="Dim uri As JavaObject";
Debug.JustUpdateDeviceLine();
_uri = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("uri", _uri);
 BA.debugLineNum = 506;BA.debugLine="Return uri.InitializeStatic(\"android.net.Uri\").R";
Debug.JustUpdateDeviceLine();
if (true) return _uri.runMethod(false,"InitializeStatic",(Object)(RemoteObject.createImmutable("android.net.Uri"))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("parse")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.concat(RemoteObject.createImmutable("file://"),cl_appupdate.__c.getField(false,"File").runMethod(true,"Combine",(Object)(__ref.getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_filename))))})));
 }else {
 BA.debugLineNum = 508;BA.debugLine="Dim f As JavaObject";
Debug.JustUpdateDeviceLine();
_f = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("f", _f);
 BA.debugLineNum = 509;BA.debugLine="f.InitializeNewInstance(\"java.io.File\", Array(Sh";
Debug.JustUpdateDeviceLine();
_f.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("java.io.File")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(__ref.getField(true,"_sharedfolder" /*RemoteObject*/ )),(_filename)})));
 BA.debugLineNum = 510;BA.debugLine="Dim fp As JavaObject";
Debug.JustUpdateDeviceLine();
_fp = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("fp", _fp);
 BA.debugLineNum = 511;BA.debugLine="Dim context As JavaObject";
Debug.JustUpdateDeviceLine();
_context = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("context", _context);
 BA.debugLineNum = 512;BA.debugLine="context.InitializeContext";
Debug.JustUpdateDeviceLine();
_context.runVoidMethod ("InitializeContext",__ref.getField(false, "ba"));
 BA.debugLineNum = 513;BA.debugLine="fp.InitializeStatic(\"android.support.v4.content.";
Debug.JustUpdateDeviceLine();
_fp.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("androidx.core.content.FileProvider")));
 BA.debugLineNum = 514;BA.debugLine="Return fp.RunMethod(\"getUriForFile\", Array(conte";
Debug.JustUpdateDeviceLine();
if (true) return _fp.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getUriForFile")),(Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_context.getObject()),(RemoteObject.concat(cl_appupdate.__c.getField(false,"Application").runMethod(true,"getPackageName"),RemoteObject.createImmutable(".provider"))),(_f.getObject())})));
 };
 BA.debugLineNum = 516;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getfreespace(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetFreeSpace (cl_appupdate) ","cl_appupdate",24,__ref.getField(false, "ba"),__ref,421);
if (RapidSub.canDelegate("getfreespace")) { return __ref.runUserSub(false, "cl_appupdate","getfreespace", __ref);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
 BA.debugLineNum = 421;BA.debugLine="Private Sub GetFreeSpace As Long";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 422;BA.debugLine="Dim jo As JavaObject";
Debug.JustUpdateDeviceLine();
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 423;BA.debugLine="jo.InitializeNewInstance(\"java.io.File\", Array(Sh";
Debug.JustUpdateDeviceLine();
_jo.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("java.io.File")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(__ref.getField(true,"_sharedfolder" /*RemoteObject*/ ))})));
 BA.debugLineNum = 424;BA.debugLine="Return jo.RunMethod(\"getFreeSpace\", Null)";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(long.class, _jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getFreeSpace")),(Object)((cl_appupdate.__c.getField(false,"Null")))));
 BA.debugLineNum = 425;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getnmappinst(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetNMAppInst (cl_appupdate) ","cl_appupdate",24,__ref.getField(false, "ba"),__ref,435);
if (RapidSub.canDelegate("getnmappinst")) { return __ref.runUserSub(false, "cl_appupdate","getnmappinst", __ref);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _context = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _resolver = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
 BA.debugLineNum = 435;BA.debugLine="Private Sub GetNMAppInst As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 436;BA.debugLine="Dim jo As JavaObject";
Debug.JustUpdateDeviceLine();
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 437;BA.debugLine="jo.InitializeStatic(\"android.provider.Settings.Se";
Debug.JustUpdateDeviceLine();
_jo.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("android.provider.Settings.Secure")));
 BA.debugLineNum = 438;BA.debugLine="Dim context As JavaObject";
Debug.JustUpdateDeviceLine();
_context = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("context", _context);
 BA.debugLineNum = 439;BA.debugLine="context.InitializeContext";
Debug.JustUpdateDeviceLine();
_context.runVoidMethod ("InitializeContext",__ref.getField(false, "ba"));
 BA.debugLineNum = 440;BA.debugLine="Dim resolver As JavaObject = context.RunMethod(\"g";
Debug.JustUpdateDeviceLine();
_resolver = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_resolver = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _context.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getContentResolver")),(Object)((cl_appupdate.__c.getField(false,"Null")))));Debug.locals.put("resolver", _resolver);Debug.locals.put("resolver", _resolver);
 BA.debugLineNum = 441;BA.debugLine="Return jo.RunMethod(\"getString\", Array(resolver,";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString(_jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getString")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_resolver.getObject()),(RemoteObject.createImmutable("install_non_market_apps"))}))));
 BA.debugLineNum = 442;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getpackagename(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getPackageName (cl_appupdate) ","cl_appupdate",24,__ref.getField(false, "ba"),__ref,79);
if (RapidSub.canDelegate("getpackagename")) { return __ref.runUserSub(false, "cl_appupdate","getpackagename", __ref);}
 BA.debugLineNum = 79;BA.debugLine="Public Sub getPackageName As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 80;BA.debugLine="Return sPackageName";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_spackagename" /*RemoteObject*/ );
 BA.debugLineNum = 81;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getsdkversion(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetSDKVersion (cl_appupdate) ","cl_appupdate",24,__ref.getField(false, "ba"),__ref,428);
if (RapidSub.canDelegate("getsdkversion")) { return __ref.runUserSub(false, "cl_appupdate","getsdkversion", __ref);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
 BA.debugLineNum = 428;BA.debugLine="Private Sub GetSDKVersion As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 429;BA.debugLine="Dim jo As JavaObject";
Debug.JustUpdateDeviceLine();
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 430;BA.debugLine="jo.InitializeStatic(\"android.os.Build.VERSION\")";
Debug.JustUpdateDeviceLine();
_jo.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("android.os.Build.VERSION")));
 BA.debugLineNum = 431;BA.debugLine="Return jo.GetField(\"SDK_INT\")";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(int.class, _jo.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("SDK_INT"))));
 BA.debugLineNum = 432;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getstatus(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getStatus (cl_appupdate) ","cl_appupdate",24,__ref.getField(false, "ba"),__ref,108);
if (RapidSub.canDelegate("getstatus")) { return __ref.runUserSub(false, "cl_appupdate","getstatus", __ref);}
 BA.debugLineNum = 108;BA.debugLine="Public Sub getStatus As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 109;BA.debugLine="Return sStatusCode";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_sstatuscode" /*RemoteObject*/ );
 BA.debugLineNum = 110;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getwebchangelog(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getWebChangeLog (cl_appupdate) ","cl_appupdate",24,__ref.getField(false, "ba"),__ref,126);
if (RapidSub.canDelegate("getwebchangelog")) { return __ref.runUserSub(false, "cl_appupdate","getwebchangelog", __ref);}
 BA.debugLineNum = 126;BA.debugLine="Public Sub getWebChangeLog As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 127;BA.debugLine="Return webclog";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_webclog" /*RemoteObject*/ );
 BA.debugLineNum = 128;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getwebfilesize(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getWebFileSize (cl_appupdate) ","cl_appupdate",24,__ref.getField(false, "ba"),__ref,132);
if (RapidSub.canDelegate("getwebfilesize")) { return __ref.runUserSub(false, "cl_appupdate","getwebfilesize", __ref);}
 BA.debugLineNum = 132;BA.debugLine="Public Sub getWebFileSize As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 133;BA.debugLine="Return webfsize";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_webfsize" /*RemoteObject*/ );
 BA.debugLineNum = 134;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getwebvn(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getWebVN (cl_appupdate) ","cl_appupdate",24,__ref.getField(false, "ba"),__ref,120);
if (RapidSub.canDelegate("getwebvn")) { return __ref.runUserSub(false, "cl_appupdate","getwebvn", __ref);}
 BA.debugLineNum = 120;BA.debugLine="Public Sub getWebVN As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 121;BA.debugLine="Return webver";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_webver" /*RemoteObject*/ );
 BA.debugLineNum = 122;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callbackmodule,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (cl_appupdate) ","cl_appupdate",24,__ref.getField(false, "ba"),__ref,48);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cl_appupdate","initialize", __ref, _ba, _callbackmodule, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone");
Debug.locals.put("ba", _ba);
Debug.locals.put("CallbackModule", _callbackmodule);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 48;BA.debugLine="Public Sub Initialize(CallbackModule As Object, Ev";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 49;BA.debugLine="Callback = CallbackModule";
Debug.JustUpdateDeviceLine();
__ref.setField ("_callback" /*RemoteObject*/ ,_callbackmodule);
 BA.debugLineNum = 50;BA.debugLine="Event = EventName";
Debug.JustUpdateDeviceLine();
__ref.setField ("_event" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 51;BA.debugLine="sPackageName = \"\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_spackagename" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 52;BA.debugLine="sNewVerTxt = \"\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_snewvertxt" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 53;BA.debugLine="sNewVerApk = \"\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_snewverapk" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 54;BA.debugLine="sUserName = \"\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_susername" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 55;BA.debugLine="sUPassword = \"\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_supassword" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 56;BA.debugLine="sStatusCode = OK_INIT";
Debug.JustUpdateDeviceLine();
__ref.setField ("_sstatuscode" /*RemoteObject*/ ,__ref.getField(true,"_ok_init" /*RemoteObject*/ ));
 BA.debugLineNum = 57;BA.debugLine="curver = \"\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_curver" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 58;BA.debugLine="webver = \"\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_webver" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 59;BA.debugLine="sVerbose = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_sverbose" /*RemoteObject*/ ,cl_appupdate.__c.getField(true,"False"));
 BA.debugLineNum = 60;BA.debugLine="Dim p As Phone";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone");Debug.locals.put("p", _p);
 BA.debugLineNum = 61;BA.debugLine="If p.SdkVersion >= 24 Or File.ExternalWritable =";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("g",_p.runMethod(true,"getSdkVersion"),BA.numberCast(double.class, 24)) || RemoteObject.solveBoolean("=",cl_appupdate.__c.getField(false,"File").runMethod(true,"getExternalWritable"),cl_appupdate.__c.getField(true,"False"))) { 
 BA.debugLineNum = 62;BA.debugLine="UseFileProvider = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_usefileprovider" /*RemoteObject*/ ,cl_appupdate.__c.getField(true,"True"));
 BA.debugLineNum = 63;BA.debugLine="SharedFolder = File.Combine(File.DirInternal, \"s";
Debug.JustUpdateDeviceLine();
__ref.setField ("_sharedfolder" /*RemoteObject*/ ,cl_appupdate.__c.getField(false,"File").runMethod(true,"Combine",(Object)(cl_appupdate.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("shared"))));
 BA.debugLineNum = 64;BA.debugLine="File.MakeDir(\"\", SharedFolder)";
Debug.JustUpdateDeviceLine();
cl_appupdate.__c.getField(false,"File").runVoidMethod ("MakeDir",(Object)(BA.ObjectToString("")),(Object)(__ref.getField(true,"_sharedfolder" /*RemoteObject*/ )));
 }else {
 BA.debugLineNum = 66;BA.debugLine="UseFileProvider = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_usefileprovider" /*RemoteObject*/ ,cl_appupdate.__c.getField(true,"False"));
 BA.debugLineNum = 67;BA.debugLine="SharedFolder = rp.GetSafeDirDefaultExternal(\"sha";
Debug.JustUpdateDeviceLine();
__ref.setField ("_sharedfolder" /*RemoteObject*/ ,__ref.getField(false,"_rp" /*RemoteObject*/ ).runMethod(true,"GetSafeDirDefaultExternal",(Object)(RemoteObject.createImmutable("shared"))));
 };
 BA.debugLineNum = 69;BA.debugLine="Log($\"SDK#: ${p.SdkVersion} - UseFP: ${UseFilePro";
Debug.JustUpdateDeviceLine();
cl_appupdate.__c.runVoidMethod ("LogImpl","924182805",(RemoteObject.concat(RemoteObject.createImmutable("SDK#: "),cl_appupdate.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_p.runMethod(true,"getSdkVersion")))),RemoteObject.createImmutable(" - UseFP: "),cl_appupdate.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_usefileprovider" /*RemoteObject*/ )))),RemoteObject.createImmutable(" - SharedFolder: "),cl_appupdate.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_sharedfolder" /*RemoteObject*/ )))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 70;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _installapk(RemoteObject __ref,RemoteObject _pstatus) throws Exception{
try {
		Debug.PushSubsStack("InstallApk (cl_appupdate) ","cl_appupdate",24,__ref.getField(false, "ba"),__ref,195);
if (RapidSub.canDelegate("installapk")) { return __ref.runUserSub(false, "cl_appupdate","installapk", __ref, _pstatus);}
Debug.locals.put("pstatus", _pstatus);
 BA.debugLineNum = 195;BA.debugLine="Public Sub InstallApk(pstatus As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 196;BA.debugLine="LogColor(\"---- AppUpdating.InstallApk\", LogColor1";
Debug.JustUpdateDeviceLine();
cl_appupdate.__c.runVoidMethod ("LogImpl","925231361",BA.ObjectToString("---- AppUpdating.InstallApk"),__ref.getField(true,"_logcolor1" /*RemoteObject*/ ));
 BA.debugLineNum = 197;BA.debugLine="If pstatus Then";
Debug.JustUpdateDeviceLine();
if (_pstatus.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 198;BA.debugLine="SendInstallIntent";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (ir.saelozahra.damaara.mazraeyeman.cl_appupdate.class, "_sendinstallintent" /*RemoteObject*/ );
 BA.debugLineNum = 199;BA.debugLine="sStatusCode = OK_INSTALL";
Debug.JustUpdateDeviceLine();
__ref.setField ("_sstatuscode" /*RemoteObject*/ ,__ref.getField(true,"_ok_install" /*RemoteObject*/ ));
 BA.debugLineNum = 200;BA.debugLine="If sVerbose Then Log(TAB & \"user asked to instal";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_sverbose" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
cl_appupdate.__c.runVoidMethod ("LogImpl","925231365",RemoteObject.concat(cl_appupdate.__c.getField(true,"TAB"),RemoteObject.createImmutable("user asked to install new apk")),0);};
 }else {
 BA.debugLineNum = 202;BA.debugLine="sStatusCode = ERR_NOPERM";
Debug.JustUpdateDeviceLine();
__ref.setField ("_sstatuscode" /*RemoteObject*/ ,__ref.getField(true,"_err_noperm" /*RemoteObject*/ ));
 BA.debugLineNum = 203;BA.debugLine="If sVerbose Then Log(TAB & \"no permissions from";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_sverbose" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
cl_appupdate.__c.runVoidMethod ("LogImpl","925231368",RemoteObject.concat(cl_appupdate.__c.getField(true,"TAB"),RemoteObject.createImmutable("no permissions from user to install new apk")),0);};
 };
 BA.debugLineNum = 205;BA.debugLine="Finito";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (ir.saelozahra.damaara.mazraeyeman.cl_appupdate.class, "_finito" /*RemoteObject*/ );
 BA.debugLineNum = 206;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isvalidcv(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("IsValidCV (cl_appupdate) ","cl_appupdate",24,__ref.getField(false, "ba"),__ref,297);
if (RapidSub.canDelegate("isvalidcv")) { return __ref.runUserSub(false, "cl_appupdate","isvalidcv", __ref);}
RemoteObject _pm = RemoteObject.declareNull("anywheresoftware.b4a.phone.PackageManagerWrapper");
 BA.debugLineNum = 297;BA.debugLine="Private Sub IsValidCV As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 298;BA.debugLine="If sPackageName = \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_spackagename" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 299;BA.debugLine="curver = \"\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_curver" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 300;BA.debugLine="sStatusCode = ERR_NOPKG";
Debug.JustUpdateDeviceLine();
__ref.setField ("_sstatuscode" /*RemoteObject*/ ,__ref.getField(true,"_err_nopkg" /*RemoteObject*/ ));
 BA.debugLineNum = 301;BA.debugLine="If sVerbose Then Log($\"${TAB}missing package nam";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_sverbose" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
cl_appupdate.__c.runVoidMethod ("LogImpl","925493508",(RemoteObject.concat(RemoteObject.createImmutable(""),cl_appupdate.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((cl_appupdate.__c.getField(true,"TAB")))),RemoteObject.createImmutable("missing package name for current version check"))),0);};
 }else {
 BA.debugLineNum = 303;BA.debugLine="Dim pm As PackageManager";
Debug.JustUpdateDeviceLine();
_pm = RemoteObject.createNew ("anywheresoftware.b4a.phone.PackageManagerWrapper");Debug.locals.put("pm", _pm);
 BA.debugLineNum = 304;BA.debugLine="curver = pm.GetVersionName(sPackageName)";
Debug.JustUpdateDeviceLine();
__ref.setField ("_curver" /*RemoteObject*/ ,_pm.runMethod(true,"GetVersionName",(Object)(__ref.getField(true,"_spackagename" /*RemoteObject*/ ))));
 BA.debugLineNum = 305;BA.debugLine="sStatusCode = OK_CURVER 									'got current ve";
Debug.JustUpdateDeviceLine();
__ref.setField ("_sstatuscode" /*RemoteObject*/ ,__ref.getField(true,"_ok_curver" /*RemoteObject*/ ));
 BA.debugLineNum = 306;BA.debugLine="If sVerbose Then Log($\"${TAB}Current Version: ${";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_sverbose" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
cl_appupdate.__c.runVoidMethod ("LogImpl","925493513",(RemoteObject.concat(RemoteObject.createImmutable(""),cl_appupdate.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((cl_appupdate.__c.getField(true,"TAB")))),RemoteObject.createImmutable("Current Version: "),cl_appupdate.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_curver" /*RemoteObject*/ )))),RemoteObject.createImmutable(""))),0);};
 };
 BA.debugLineNum = 308;BA.debugLine="Return (sStatusCode == OK_CURVER)";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToBoolean((RemoteObject.solveBoolean("=",__ref.getField(true,"_sstatuscode" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_ok_curver" /*RemoteObject*/ )))));
 BA.debugLineNum = 309;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isvalidwv(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("IsvalidWV (cl_appupdate) ","cl_appupdate",24,__ref.getField(false, "ba"),__ref,312);
if (RapidSub.canDelegate("isvalidwv")) { return __ref.runUserSub(false, "cl_appupdate","isvalidwv", __ref);}
ResumableSub_IsvalidWV rsub = new ResumableSub_IsvalidWV(null,__ref);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_IsvalidWV extends BA.ResumableSub {
public ResumableSub_IsvalidWV(ir.saelozahra.damaara.mazraeyeman.cl_appupdate parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
ir.saelozahra.damaara.mazraeyeman.cl_appupdate parent;
RemoteObject _j = RemoteObject.declareNull("ir.saelozahra.damaara.mazraeyeman.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("IsvalidWV (cl_appupdate) ","cl_appupdate",24,__ref.getField(false, "ba"),__ref,312);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 313;BA.debugLine="Log(\"IsValidComplete start\")";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","925559041",RemoteObject.createImmutable("IsValidComplete start"),0);
 BA.debugLineNum = 314;BA.debugLine="If sNewVerTxt = \"\" Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 60;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_snewvertxt" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 3;
}else {
this.state = 11;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 315;BA.debugLine="webver = \"\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_webver" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 316;BA.debugLine="sStatusCode = ERR_NOTXT";
Debug.JustUpdateDeviceLine();
__ref.setField ("_sstatuscode" /*RemoteObject*/ ,__ref.getField(true,"_err_notxt" /*RemoteObject*/ ));
 BA.debugLineNum = 317;BA.debugLine="If sVerbose Then Log($\"${TAB}missing info file f";
Debug.JustUpdateDeviceLine();
if (true) break;

case 4:
//if
this.state = 9;
if (__ref.getField(true,"_sverbose" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
parent.__c.runVoidMethod ("LogImpl","925559045",(RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.__c.getField(true,"TAB")))),RemoteObject.createImmutable("missing info file full path indication"))),0);
if (true) break;

case 9:
//C
this.state = 60;
;
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 320;BA.debugLine="Dim j As HttpJob";
Debug.JustUpdateDeviceLine();
_j = RemoteObject.createNew ("ir.saelozahra.damaara.mazraeyeman.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 321;BA.debugLine="j.Initialize(\"\", Me)";
Debug.JustUpdateDeviceLine();
_j.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 322;BA.debugLine="j.Username = sUserName";
Debug.JustUpdateDeviceLine();
_j.setField ("_username" /*RemoteObject*/ ,__ref.getField(true,"_susername" /*RemoteObject*/ ));
 BA.debugLineNum = 323;BA.debugLine="j.Password = sUPassword";
Debug.JustUpdateDeviceLine();
_j.setField ("_password" /*RemoteObject*/ ,__ref.getField(true,"_supassword" /*RemoteObject*/ ));
 BA.debugLineNum = 324;BA.debugLine="j.Download(sNewVerTxt)								'ex: jobapk.Downlo";
Debug.JustUpdateDeviceLine();
_j.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_snewvertxt" /*RemoteObject*/ )));
 BA.debugLineNum = 325;BA.debugLine="Log(\"before\")";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","925559053",RemoteObject.createImmutable("before"),0);
 BA.debugLineNum = 326;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cl_appupdate", "isvalidwv"), (_j));
this.state = 61;
return;
case 61:
//C
this.state = 12;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 327;BA.debugLine="Log(\"after\")";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","925559055",RemoteObject.createImmutable("after"),0);
 BA.debugLineNum = 328;BA.debugLine="If j.Success Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 12:
//if
this.state = 59;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 14;
}else {
this.state = 52;
}if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 329;BA.debugLine="If sVerbose Then Log($\"Webserver's info file co";
Debug.JustUpdateDeviceLine();
if (true) break;

case 15:
//if
this.state = 20;
if (__ref.getField(true,"_sverbose" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 17;
;}if (true) break;

case 17:
//C
this.state = 20;
parent.__c.runVoidMethod ("LogImpl","925559057",(RemoteObject.concat(RemoteObject.createImmutable("Webserver's info file content: "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.__c.getField(true,"CRLF")))),RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_j.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_getstring" /*RemoteObject*/ )))),RemoteObject.createImmutable(""))),0);
if (true) break;

case 20:
//C
this.state = 21;
;
 BA.debugLineNum = 330;BA.debugLine="If Not(J.GetString.Contains(\"<!DOCTYPE html>\"))";
Debug.JustUpdateDeviceLine();
if (true) break;

case 21:
//if
this.state = 50;
if (parent.__c.runMethod(true,"Not",(Object)(_j.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_getstring" /*RemoteObject*/ ).runMethod(true,"contains",(Object)(RemoteObject.createImmutable("<!DOCTYPE html>"))))).<Boolean>get().booleanValue()) { 
this.state = 23;
}else {
this.state = 43;
}if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 331;BA.debugLine="webver = ExtractVN(J.GetString)";
Debug.JustUpdateDeviceLine();
__ref.setField ("_webver" /*RemoteObject*/ ,__ref.runClassMethod (ir.saelozahra.damaara.mazraeyeman.cl_appupdate.class, "_extractvn" /*RemoteObject*/ ,(Object)(_j.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_getstring" /*RemoteObject*/ ))));
 BA.debugLineNum = 332;BA.debugLine="webclog = ExtractCL(J.GetString)					'optional";
Debug.JustUpdateDeviceLine();
__ref.setField ("_webclog" /*RemoteObject*/ ,__ref.runClassMethod (ir.saelozahra.damaara.mazraeyeman.cl_appupdate.class, "_extractcl" /*RemoteObject*/ ,(Object)(_j.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_getstring" /*RemoteObject*/ ))));
 BA.debugLineNum = 333;BA.debugLine="webfsize = ExtractSZ(J.GetString)					'optiona";
Debug.JustUpdateDeviceLine();
__ref.setField ("_webfsize" /*RemoteObject*/ ,__ref.runClassMethod (ir.saelozahra.damaara.mazraeyeman.cl_appupdate.class, "_extractsz" /*RemoteObject*/ ,(Object)(_j.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_getstring" /*RemoteObject*/ ))));
 BA.debugLineNum = 334;BA.debugLine="If webver = \"\" Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 24:
//if
this.state = 41;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_webver" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 26;
}else {
this.state = 34;
}if (true) break;

case 26:
//C
this.state = 27;
 BA.debugLineNum = 335;BA.debugLine="sStatusCode = ERR_TXTROW";
Debug.JustUpdateDeviceLine();
__ref.setField ("_sstatuscode" /*RemoteObject*/ ,__ref.getField(true,"_err_txtrow" /*RemoteObject*/ ));
 BA.debugLineNum = 336;BA.debugLine="If sVerbose Then Log($\"${TAB}wrong row format";
Debug.JustUpdateDeviceLine();
if (true) break;

case 27:
//if
this.state = 32;
if (__ref.getField(true,"_sverbose" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 29;
;}if (true) break;

case 29:
//C
this.state = 32;
parent.__c.runVoidMethod ("LogImpl","925559064",(RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.__c.getField(true,"TAB")))),RemoteObject.createImmutable("wrong row format in info file "))),0);
if (true) break;

case 32:
//C
this.state = 41;
;
 if (true) break;

case 34:
//C
this.state = 35;
 BA.debugLineNum = 338;BA.debugLine="sStatusCode = OK_WEBVER							'read apk's ver";
Debug.JustUpdateDeviceLine();
__ref.setField ("_sstatuscode" /*RemoteObject*/ ,__ref.getField(true,"_ok_webver" /*RemoteObject*/ ));
 BA.debugLineNum = 339;BA.debugLine="If sVerbose Then Log($\"${TAB}Web version numb";
Debug.JustUpdateDeviceLine();
if (true) break;

case 35:
//if
this.state = 40;
if (__ref.getField(true,"_sverbose" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 37;
;}if (true) break;

case 37:
//C
this.state = 40;
parent.__c.runVoidMethod ("LogImpl","925559067",(RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.__c.getField(true,"TAB")))),RemoteObject.createImmutable("Web version number: "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_webver" /*RemoteObject*/ )))),RemoteObject.createImmutable(""))),0);
if (true) break;

case 40:
//C
this.state = 41;
;
 if (true) break;

case 41:
//C
this.state = 50;
;
 if (true) break;

case 43:
//C
this.state = 44;
 BA.debugLineNum = 342;BA.debugLine="sStatusCode = ERR_HTML								'website returne";
Debug.JustUpdateDeviceLine();
__ref.setField ("_sstatuscode" /*RemoteObject*/ ,__ref.getField(true,"_err_html" /*RemoteObject*/ ));
 BA.debugLineNum = 343;BA.debugLine="If sVerbose Then Log($\"${TAB}ERROR: website re";
Debug.JustUpdateDeviceLine();
if (true) break;

case 44:
//if
this.state = 49;
if (__ref.getField(true,"_sverbose" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 46;
;}if (true) break;

case 46:
//C
this.state = 49;
parent.__c.runVoidMethod ("LogImpl","925559071",(RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.__c.getField(true,"TAB")))),RemoteObject.createImmutable("ERROR: website returned an HTML error page"))),0);
if (true) break;

case 49:
//C
this.state = 50;
;
 if (true) break;

case 50:
//C
this.state = 59;
;
 if (true) break;

case 52:
//C
this.state = 53;
 BA.debugLineNum = 346;BA.debugLine="Log($\"${TAB}Error: ${J.ErrorMessage}\"$)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","925559074",(RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.__c.getField(true,"TAB")))),RemoteObject.createImmutable("Error: "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_j.getField(true,"_errormessage" /*RemoteObject*/ )))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 347;BA.debugLine="sStatusCode = ERR_HTTP";
Debug.JustUpdateDeviceLine();
__ref.setField ("_sstatuscode" /*RemoteObject*/ ,__ref.getField(true,"_err_http" /*RemoteObject*/ ));
 BA.debugLineNum = 348;BA.debugLine="If sVerbose Then Log($\"${TAB}error in httputils";
Debug.JustUpdateDeviceLine();
if (true) break;

case 53:
//if
this.state = 58;
if (__ref.getField(true,"_sverbose" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 55;
;}if (true) break;

case 55:
//C
this.state = 58;
parent.__c.runVoidMethod ("LogImpl","925559076",(RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.__c.getField(true,"TAB")))),RemoteObject.createImmutable("error in httputils2"))),0);
if (true) break;

case 58:
//C
this.state = 59;
;
 BA.debugLineNum = 349;BA.debugLine="ToastMessageShow(\"Error: \" & J.ErrorMessage, Tr";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Error: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )))),(Object)(parent.__c.getField(true,"True")));
 if (true) break;

case 59:
//C
this.state = 60;
;
 BA.debugLineNum = 351;BA.debugLine="j.Release";
Debug.JustUpdateDeviceLine();
_j.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_release" /*RemoteObject*/ );
 if (true) break;

case 60:
//C
this.state = -1;
;
 BA.debugLineNum = 353;BA.debugLine="Return (sStatusCode == OK_WEBVER)";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(((RemoteObject.solveBoolean("=",__ref.getField(true,"_sstatuscode" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_ok_webver" /*RemoteObject*/ )))))));return;};
 BA.debugLineNum = 354;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static RemoteObject  _readcurvn(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ReadCurVN (cl_appupdate) ","cl_appupdate",24,__ref.getField(false, "ba"),__ref,143);
if (RapidSub.canDelegate("readcurvn")) { return __ref.runUserSub(false, "cl_appupdate","readcurvn", __ref);}
 BA.debugLineNum = 143;BA.debugLine="Public Sub ReadCurVN";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 144;BA.debugLine="LogColor(\"---- AppUpdating.ReadCurVN\", LogColor1)";
Debug.JustUpdateDeviceLine();
cl_appupdate.__c.runVoidMethod ("LogImpl","925034753",BA.ObjectToString("---- AppUpdating.ReadCurVN"),__ref.getField(true,"_logcolor1" /*RemoteObject*/ ));
 BA.debugLineNum = 145;BA.debugLine="IsValidCV											'we don't care about its resu";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (ir.saelozahra.damaara.mazraeyeman.cl_appupdate.class, "_isvalidcv" /*RemoteObject*/ );
 BA.debugLineNum = 146;BA.debugLine="Finito";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (ir.saelozahra.damaara.mazraeyeman.cl_appupdate.class, "_finito" /*RemoteObject*/ );
 BA.debugLineNum = 147;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _readwebvn(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ReadWebVN (cl_appupdate) ","cl_appupdate",24,__ref.getField(false, "ba"),__ref,151);
if (RapidSub.canDelegate("readwebvn")) { __ref.runUserSub(false, "cl_appupdate","readwebvn", __ref); return;}
ResumableSub_ReadWebVN rsub = new ResumableSub_ReadWebVN(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ReadWebVN extends BA.ResumableSub {
public ResumableSub_ReadWebVN(ir.saelozahra.damaara.mazraeyeman.cl_appupdate parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
ir.saelozahra.damaara.mazraeyeman.cl_appupdate parent;
RemoteObject _okwebver = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ReadWebVN (cl_appupdate) ","cl_appupdate",24,__ref.getField(false, "ba"),__ref,151);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 152;BA.debugLine="LogColor(\"---- AppUpdating.ReadWebVN\", LogColor1)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","925100289",BA.ObjectToString("---- AppUpdating.ReadWebVN"),__ref.getField(true,"_logcolor1" /*RemoteObject*/ ));
 BA.debugLineNum = 153;BA.debugLine="Wait For(IsvalidWV) Complete (OkWebVer As Boolean";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cl_appupdate", "readwebvn"), __ref.runClassMethod (ir.saelozahra.damaara.mazraeyeman.cl_appupdate.class, "_isvalidwv" /*RemoteObject*/ ));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_okwebver = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("OkWebVer", _okwebver);
;
 BA.debugLineNum = 154;BA.debugLine="Finito";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (ir.saelozahra.damaara.mazraeyeman.cl_appupdate.class, "_finito" /*RemoteObject*/ );
 BA.debugLineNum = 155;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static void  _complete(RemoteObject __ref,RemoteObject _okwebver) throws Exception{
}
public static RemoteObject  _sendinstallintent(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SendInstallIntent (cl_appupdate) ","cl_appupdate",24,__ref.getField(false, "ba"),__ref,487);
if (RapidSub.canDelegate("sendinstallintent")) { return __ref.runUserSub(false, "cl_appupdate","sendinstallintent", __ref);}
RemoteObject _apkname = RemoteObject.createImmutable("");
RemoteObject _i = RemoteObject.declareNull("anywheresoftware.b4a.objects.IntentWrapper");
 BA.debugLineNum = 487;BA.debugLine="Private Sub SendInstallIntent";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 488;BA.debugLine="Dim ApkName As String = \"tmp.apk\"";
Debug.JustUpdateDeviceLine();
_apkname = BA.ObjectToString("tmp.apk");Debug.locals.put("ApkName", _apkname);Debug.locals.put("ApkName", _apkname);
 BA.debugLineNum = 489;BA.debugLine="Dim i As Intent";
Debug.JustUpdateDeviceLine();
_i = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");Debug.locals.put("i", _i);
 BA.debugLineNum = 490;BA.debugLine="If phone.SdkVersion >= 24 Then													'Nouga";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("g",__ref.getField(false,"_phone" /*RemoteObject*/ ).runMethod(true,"getSdkVersion"),BA.numberCast(double.class, 24))) { 
 BA.debugLineNum = 491;BA.debugLine="i.Initialize(\"android.intent.action.INSTALL_PACK";
Debug.JustUpdateDeviceLine();
_i.runVoidMethod ("Initialize",(Object)(BA.ObjectToString("android.intent.action.INSTALL_PACKAGE")),(Object)(BA.ObjectToString(__ref.runClassMethod (ir.saelozahra.damaara.mazraeyeman.cl_appupdate.class, "_getfileuri" /*RemoteObject*/ ,(Object)(_apkname)))));
 BA.debugLineNum = 492;BA.debugLine="i.Flags = Bit.Or(i.Flags, 1) 'FLAG_GRANT_READ_UR";
Debug.JustUpdateDeviceLine();
_i.runMethod(true,"setFlags",cl_appupdate.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(_i.runMethod(true,"getFlags")),(Object)(BA.numberCast(int.class, 1))));
 }else {
 BA.debugLineNum = 494;BA.debugLine="i.Initialize(i.ACTION_VIEW, \"file://\" & File.Com";
Debug.JustUpdateDeviceLine();
_i.runVoidMethod ("Initialize",(Object)(_i.getField(true,"ACTION_VIEW")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("file://"),cl_appupdate.__c.getField(false,"File").runMethod(true,"Combine",(Object)(__ref.getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_apkname)))));
 BA.debugLineNum = 495;BA.debugLine="i.SetType(\"application/vnd.android.package-archi";
Debug.JustUpdateDeviceLine();
_i.runVoidMethod ("SetType",(Object)(RemoteObject.createImmutable("application/vnd.android.package-archive")));
 };
 BA.debugLineNum = 497;BA.debugLine="StartActivity(i)";
Debug.JustUpdateDeviceLine();
cl_appupdate.__c.runVoidMethod ("StartActivity",__ref.getField(false, "ba"),(Object)((_i.getObject())));
 BA.debugLineNum = 498;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setandstartsplashscreen(RemoteObject __ref,RemoteObject _callingact,RemoteObject _bm) throws Exception{
try {
		Debug.PushSubsStack("SetAndStartSplashScreen (cl_appupdate) ","cl_appupdate",24,__ref.getField(false, "ba"),__ref,532);
if (RapidSub.canDelegate("setandstartsplashscreen")) { return __ref.runUserSub(false, "cl_appupdate","setandstartsplashscreen", __ref, _callingact, _bm);}
RemoteObject _bitimage = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.BitmapDrawable");
Debug.locals.put("CallingAct", _callingact);
Debug.locals.put("BM", _bm);
 BA.debugLineNum = 532;BA.debugLine="Public Sub SetAndStartSplashScreen(CallingAct As A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 533;BA.debugLine="If BM.IsInitialized Then";
Debug.JustUpdateDeviceLine();
if (_bm.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 534;BA.debugLine="pnlSplash.Initialize(\"pnl1\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_pnlsplash" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("pnl1")));
 BA.debugLineNum = 535;BA.debugLine="pnlSplash.Tag = \"splash\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_pnlsplash" /*RemoteObject*/ ).runMethod(false,"setTag",RemoteObject.createImmutable(("splash")));
 BA.debugLineNum = 536;BA.debugLine="Dim BitImage As BitmapDrawable";
Debug.JustUpdateDeviceLine();
_bitimage = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.BitmapDrawable");Debug.locals.put("BitImage", _bitimage);
 BA.debugLineNum = 537;BA.debugLine="BitImage.Initialize(BM)";
Debug.JustUpdateDeviceLine();
_bitimage.runVoidMethod ("Initialize",(Object)((_bm.getObject())));
 BA.debugLineNum = 538;BA.debugLine="BitImage.Gravity = Gravity.FILL";
Debug.JustUpdateDeviceLine();
_bitimage.runMethod(true,"setGravity",cl_appupdate.__c.getField(false,"Gravity").getField(true,"FILL"));
 BA.debugLineNum = 539;BA.debugLine="CallingAct.AddView(pnlSplash, 0, 0, CallingAct.W";
Debug.JustUpdateDeviceLine();
_callingact.runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pnlsplash" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_callingact.runMethod(true,"getWidth")),(Object)(_callingact.runMethod(true,"getHeight")));
 BA.debugLineNum = 540;BA.debugLine="pnlSplash.Background = BitImage";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_pnlsplash" /*RemoteObject*/ ).runMethod(false,"setBackground",(_bitimage.getObject()));
 BA.debugLineNum = 541;BA.debugLine="pnlSplash.BringToFront";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_pnlsplash" /*RemoteObject*/ ).runVoidMethod ("BringToFront");
 BA.debugLineNum = 542;BA.debugLine="SplashShowing = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_splashshowing" /*RemoteObject*/ ,cl_appupdate.__c.getField(true,"True"));
 };
 BA.debugLineNum = 544;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcredentials(RemoteObject __ref,RemoteObject _usern,RemoteObject _userp) throws Exception{
try {
		Debug.PushSubsStack("setCredentials (cl_appupdate) ","cl_appupdate",24,__ref.getField(false, "ba"),__ref,96);
if (RapidSub.canDelegate("setcredentials")) { return __ref.runUserSub(false, "cl_appupdate","setcredentials", __ref, _usern, _userp);}
Debug.locals.put("UserN", _usern);
Debug.locals.put("UserP", _userp);
 BA.debugLineNum = 96;BA.debugLine="Public Sub setCredentials(UserN As String, UserP A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 97;BA.debugLine="sUserName = UserN";
Debug.JustUpdateDeviceLine();
__ref.setField ("_susername" /*RemoteObject*/ ,_usern);
 BA.debugLineNum = 98;BA.debugLine="sUPassword = UserP";
Debug.JustUpdateDeviceLine();
__ref.setField ("_supassword" /*RemoteObject*/ ,_userp);
 BA.debugLineNum = 99;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setfileuriasintentdata(RemoteObject __ref,RemoteObject _intent,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("SetFileUriAsIntentData (cl_appupdate) ","cl_appupdate",24,__ref.getField(false, "ba"),__ref,520);
if (RapidSub.canDelegate("setfileuriasintentdata")) { return __ref.runUserSub(false, "cl_appupdate","setfileuriasintentdata", __ref, _intent, _filename);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("Intent", _intent);
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 520;BA.debugLine="Private Sub SetFileUriAsIntentData (Intent As Inte";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 521;BA.debugLine="Dim jo As JavaObject = Intent";
Debug.JustUpdateDeviceLine();
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _intent.getObject());Debug.locals.put("jo", _jo);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 522;BA.debugLine="jo.RunMethod(\"setData\", Array(GetFileUri(FileName";
Debug.JustUpdateDeviceLine();
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setData")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {__ref.runClassMethod (ir.saelozahra.damaara.mazraeyeman.cl_appupdate.class, "_getfileuri" /*RemoteObject*/ ,(Object)(_filename))})));
 BA.debugLineNum = 523;BA.debugLine="Intent.Flags = Bit.Or(Intent.Flags, 1) 'FLAG_GRAN";
Debug.JustUpdateDeviceLine();
_intent.runMethod(true,"setFlags",cl_appupdate.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(_intent.runMethod(true,"getFlags")),(Object)(BA.numberCast(int.class, 1))));
 BA.debugLineNum = 524;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setnewverapk(RemoteObject __ref,RemoteObject _nva) throws Exception{
try {
		Debug.PushSubsStack("setNewVerApk (cl_appupdate) ","cl_appupdate",24,__ref.getField(false, "ba"),__ref,91);
if (RapidSub.canDelegate("setnewverapk")) { return __ref.runUserSub(false, "cl_appupdate","setnewverapk", __ref, _nva);}
Debug.locals.put("NVA", _nva);
 BA.debugLineNum = 91;BA.debugLine="Public Sub setNewVerApk(NVA As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 92;BA.debugLine="sNewVerApk = NVA";
Debug.JustUpdateDeviceLine();
__ref.setField ("_snewverapk" /*RemoteObject*/ ,_nva);
 BA.debugLineNum = 93;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setnewvertxt(RemoteObject __ref,RemoteObject _nvt) throws Exception{
try {
		Debug.PushSubsStack("setNewVerTxt (cl_appupdate) ","cl_appupdate",24,__ref.getField(false, "ba"),__ref,86);
if (RapidSub.canDelegate("setnewvertxt")) { return __ref.runUserSub(false, "cl_appupdate","setnewvertxt", __ref, _nvt);}
Debug.locals.put("NVT", _nvt);
 BA.debugLineNum = 86;BA.debugLine="Public Sub setNewVerTxt(NVT As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 87;BA.debugLine="sNewVerTxt = NVT";
Debug.JustUpdateDeviceLine();
__ref.setField ("_snewvertxt" /*RemoteObject*/ ,_nvt);
 BA.debugLineNum = 88;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setpackagename(RemoteObject __ref,RemoteObject _pn) throws Exception{
try {
		Debug.PushSubsStack("setPackageName (cl_appupdate) ","cl_appupdate",24,__ref.getField(false, "ba"),__ref,74);
if (RapidSub.canDelegate("setpackagename")) { return __ref.runUserSub(false, "cl_appupdate","setpackagename", __ref, _pn);}
Debug.locals.put("PN", _pn);
 BA.debugLineNum = 74;BA.debugLine="Public Sub setPackageName(PN As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 75;BA.debugLine="sPackageName = PN";
Debug.JustUpdateDeviceLine();
__ref.setField ("_spackagename" /*RemoteObject*/ ,_pn);
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setverbose(RemoteObject __ref,RemoteObject _verbose) throws Exception{
try {
		Debug.PushSubsStack("setVerbose (cl_appupdate) ","cl_appupdate",24,__ref.getField(false, "ba"),__ref,102);
if (RapidSub.canDelegate("setverbose")) { return __ref.runUserSub(false, "cl_appupdate","setverbose", __ref, _verbose);}
Debug.locals.put("Verbose", _verbose);
 BA.debugLineNum = 102;BA.debugLine="Public Sub setVerbose(Verbose As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 103;BA.debugLine="sVerbose = Verbose";
Debug.JustUpdateDeviceLine();
__ref.setField ("_sverbose" /*RemoteObject*/ ,_verbose);
 BA.debugLineNum = 104;BA.debugLine="newinst2.svcVerbose = Verbose";
Debug.JustUpdateDeviceLine();
cl_appupdate._newinst2._svcverbose /*RemoteObject*/  = _verbose;
 BA.debugLineNum = 105;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _stopsplashscreen(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("StopSplashScreen (cl_appupdate) ","cl_appupdate",24,__ref.getField(false, "ba"),__ref,547);
if (RapidSub.canDelegate("stopsplashscreen")) { return __ref.runUserSub(false, "cl_appupdate","stopsplashscreen", __ref);}
 BA.debugLineNum = 547;BA.debugLine="Public Sub StopSplashScreen";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 548;BA.debugLine="If SplashShowing Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_splashshowing" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 549;BA.debugLine="SplashShowing = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_splashshowing" /*RemoteObject*/ ,cl_appupdate.__c.getField(true,"False"));
 BA.debugLineNum = 550;BA.debugLine="pnlSplash.RemoveView";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_pnlsplash" /*RemoteObject*/ ).runVoidMethod ("RemoveView");
 };
 BA.debugLineNum = 552;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _tryapkupdate(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("TryApkUpdate (cl_appupdate) ","cl_appupdate",24,__ref.getField(false, "ba"),__ref,245);
if (RapidSub.canDelegate("tryapkupdate")) { __ref.runUserSub(false, "cl_appupdate","tryapkupdate", __ref); return;}
ResumableSub_TryApkUpdate rsub = new ResumableSub_TryApkUpdate(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_TryApkUpdate extends BA.ResumableSub {
public ResumableSub_TryApkUpdate(ir.saelozahra.damaara.mazraeyeman.cl_appupdate parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
ir.saelozahra.damaara.mazraeyeman.cl_appupdate parent;
RemoteObject _j = RemoteObject.declareNull("ir.saelozahra.damaara.mazraeyeman.httpjob");
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("TryApkUpdate (cl_appupdate) ","cl_appupdate",24,__ref.getField(false, "ba"),__ref,245);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 246;BA.debugLine="LogColor($\"${TAB}-- TryApkUpdate\"$, LogColor1)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","925362433",(RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.__c.getField(true,"TAB")))),RemoteObject.createImmutable("-- TryApkUpdate"))),__ref.getField(true,"_logcolor1" /*RemoteObject*/ ));
 BA.debugLineNum = 248;BA.debugLine="If ((sStatusCode >= 0) And (sStatusCode <> NO_NEW";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 44;
if ((RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("g",__ref.getField(true,"_sstatuscode" /*RemoteObject*/ ),BA.numberCast(double.class, 0))))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("!",__ref.getField(true,"_sstatuscode" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_no_newerapk" /*RemoteObject*/ )))))))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 250;BA.debugLine="Dim j As HttpJob";
Debug.JustUpdateDeviceLine();
_j = RemoteObject.createNew ("ir.saelozahra.damaara.mazraeyeman.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 251;BA.debugLine="j.Initialize(\"\", Me)";
Debug.JustUpdateDeviceLine();
_j.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 252;BA.debugLine="j.Username = sUserName";
Debug.JustUpdateDeviceLine();
_j.setField ("_username" /*RemoteObject*/ ,__ref.getField(true,"_susername" /*RemoteObject*/ ));
 BA.debugLineNum = 253;BA.debugLine="j.Password = sUPassword";
Debug.JustUpdateDeviceLine();
_j.setField ("_password" /*RemoteObject*/ ,__ref.getField(true,"_supassword" /*RemoteObject*/ ));
 BA.debugLineNum = 254;BA.debugLine="j.Download(sNewVerApk)								'ex: jobapk.Downlo";
Debug.JustUpdateDeviceLine();
_j.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_snewverapk" /*RemoteObject*/ )));
 BA.debugLineNum = 255;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cl_appupdate", "tryapkupdate"), (_j));
this.state = 45;
return;
case 45:
//C
this.state = 4;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 256;BA.debugLine="Log($\"Donload ok? ${j.Success}\"$)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","925362443",(RemoteObject.concat(RemoteObject.createImmutable("Donload ok? "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_j.getField(true,"_success" /*RemoteObject*/ )))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 257;BA.debugLine="If j.Success Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 4:
//if
this.state = 33;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 26;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 258;BA.debugLine="Try";
Debug.JustUpdateDeviceLine();
if (true) break;

case 7:
//try
this.state = 24;
this.catchState = 17;
this.state = 9;
if (true) break;

case 9:
//C
this.state = 10;
this.catchState = 17;
 BA.debugLineNum = 260;BA.debugLine="Dim out As OutputStream";
Debug.JustUpdateDeviceLine();
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");Debug.locals.put("out", _out);
 BA.debugLineNum = 261;BA.debugLine="out = File.OpenOutput(SharedFolder,\"tmp.apk\",F";
Debug.JustUpdateDeviceLine();
_out = parent.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(__ref.getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(BA.ObjectToString("tmp.apk")),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("out", _out);
 BA.debugLineNum = 262;BA.debugLine="File.Copy2(j.GetInputStream, out)";
Debug.JustUpdateDeviceLine();
parent.__c.getField(false,"File").runVoidMethod ("Copy2",(Object)((_j.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_getinputstream" /*RemoteObject*/ ).getObject())),(Object)((_out.getObject())));
 BA.debugLineNum = 263;BA.debugLine="out.Close";
Debug.JustUpdateDeviceLine();
_out.runVoidMethod ("Close");
 BA.debugLineNum = 264;BA.debugLine="Log($\"Copy2 (saving) ok? TRUE\"$)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","925362451",(RemoteObject.createImmutable("Copy2 (saving) ok? TRUE")),0);
 BA.debugLineNum = 265;BA.debugLine="sStatusCode = OK_DOWNLOAD";
Debug.JustUpdateDeviceLine();
__ref.setField ("_sstatuscode" /*RemoteObject*/ ,__ref.getField(true,"_ok_download" /*RemoteObject*/ ));
 BA.debugLineNum = 266;BA.debugLine="If sVerbose Then Log($\"${TAB}new apk version d";
Debug.JustUpdateDeviceLine();
if (true) break;

case 10:
//if
this.state = 15;
if (__ref.getField(true,"_sverbose" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 12;
;}if (true) break;

case 12:
//C
this.state = 15;
parent.__c.runVoidMethod ("LogImpl","925362453",(RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.__c.getField(true,"TAB")))),RemoteObject.createImmutable("new apk version downloaded and ready to install"))),0);
if (true) break;

case 15:
//C
this.state = 24;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 17:
//C
this.state = 18;
this.catchState = 0;
 BA.debugLineNum = 268;BA.debugLine="Log($\"Copy2 (saving) ok? FALSE\"$)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","925362455",(RemoteObject.createImmutable("Copy2 (saving) ok? FALSE")),0);
 BA.debugLineNum = 269;BA.debugLine="sStatusCode = ERR_DOWNLOAD";
Debug.JustUpdateDeviceLine();
__ref.setField ("_sstatuscode" /*RemoteObject*/ ,__ref.getField(true,"_err_download" /*RemoteObject*/ ));
 BA.debugLineNum = 270;BA.debugLine="If sVerbose Then Log($\"${TAB}failed download o";
Debug.JustUpdateDeviceLine();
if (true) break;

case 18:
//if
this.state = 23;
if (__ref.getField(true,"_sverbose" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 20;
;}if (true) break;

case 20:
//C
this.state = 23;
parent.__c.runVoidMethod ("LogImpl","925362457",(RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.__c.getField(true,"TAB")))),RemoteObject.createImmutable("failed download of new apk version"))),0);
if (true) break;

case 23:
//C
this.state = 24;
;
 BA.debugLineNum = 271;BA.debugLine="ToastMessageShow(LastException, True)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).getObject())),(Object)(parent.__c.getField(true,"True")));
 if (true) break;
if (true) break;

case 24:
//C
this.state = 33;
this.catchState = 0;
;
 if (true) break;

case 26:
//C
this.state = 27;
 BA.debugLineNum = 274;BA.debugLine="Log($\"${TAB}Error: ${J.ErrorMessage}\"$)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","925362461",(RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.__c.getField(true,"TAB")))),RemoteObject.createImmutable("Error: "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_j.getField(true,"_errormessage" /*RemoteObject*/ )))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 275;BA.debugLine="sStatusCode = ERR_HTTP";
Debug.JustUpdateDeviceLine();
__ref.setField ("_sstatuscode" /*RemoteObject*/ ,__ref.getField(true,"_err_http" /*RemoteObject*/ ));
 BA.debugLineNum = 276;BA.debugLine="If sVerbose Then Log($\"${TAB}error in httputils";
Debug.JustUpdateDeviceLine();
if (true) break;

case 27:
//if
this.state = 32;
if (__ref.getField(true,"_sverbose" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 29;
;}if (true) break;

case 29:
//C
this.state = 32;
parent.__c.runVoidMethod ("LogImpl","925362463",(RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.__c.getField(true,"TAB")))),RemoteObject.createImmutable("error in httputils2"))),0);
if (true) break;

case 32:
//C
this.state = 33;
;
 BA.debugLineNum = 277;BA.debugLine="ToastMessageShow($\"Error: ${J.ErrorMessage}\"$,";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("Error: "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_j.getField(true,"_errormessage" /*RemoteObject*/ )))),RemoteObject.createImmutable(""))))),(Object)(parent.__c.getField(true,"True")));
 if (true) break;

case 33:
//C
this.state = 34;
;
 BA.debugLineNum = 279;BA.debugLine="j.Release";
Debug.JustUpdateDeviceLine();
_j.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 280;BA.debugLine="If sStatusCode == OK_DOWNLOAD Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 34:
//if
this.state = 43;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_sstatuscode" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_ok_download" /*RemoteObject*/ )))) { 
this.state = 36;
}if (true) break;

case 36:
//C
this.state = 37;
 BA.debugLineNum = 281;BA.debugLine="SendInstallIntent";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (ir.saelozahra.damaara.mazraeyeman.cl_appupdate.class, "_sendinstallintent" /*RemoteObject*/ );
 BA.debugLineNum = 282;BA.debugLine="sStatusCode = OK_INSTALL";
Debug.JustUpdateDeviceLine();
__ref.setField ("_sstatuscode" /*RemoteObject*/ ,__ref.getField(true,"_ok_install" /*RemoteObject*/ ));
 BA.debugLineNum = 283;BA.debugLine="If sVerbose Then Log($\"${TAB}user asked to inst";
Debug.JustUpdateDeviceLine();
if (true) break;

case 37:
//if
this.state = 42;
if (__ref.getField(true,"_sverbose" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 39;
;}if (true) break;

case 39:
//C
this.state = 42;
parent.__c.runVoidMethod ("LogImpl","925362470",(RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.__c.getField(true,"TAB")))),RemoteObject.createImmutable("user asked to install new apk"))),0);
if (true) break;

case 42:
//C
this.state = 43;
;
 if (true) break;

case 43:
//C
this.state = 44;
;
 if (true) break;

case 44:
//C
this.state = -1;
;
 BA.debugLineNum = 286;BA.debugLine="Finito";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (ir.saelozahra.damaara.mazraeyeman.cl_appupdate.class, "_finito" /*RemoteObject*/ );
 BA.debugLineNum = 287;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e0.toString());}
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
public static void  _updateapk(RemoteObject __ref,RemoteObject _pstatus) throws Exception{
try {
		Debug.PushSubsStack("UpdateApk (cl_appupdate) ","cl_appupdate",24,__ref.getField(false, "ba"),__ref,210);
if (RapidSub.canDelegate("updateapk")) { __ref.runUserSub(false, "cl_appupdate","updateapk", __ref, _pstatus); return;}
ResumableSub_UpdateApk rsub = new ResumableSub_UpdateApk(null,__ref,_pstatus);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_UpdateApk extends BA.ResumableSub {
public ResumableSub_UpdateApk(ir.saelozahra.damaara.mazraeyeman.cl_appupdate parent,RemoteObject __ref,RemoteObject _pstatus) {
this.parent = parent;
this.__ref = __ref;
this._pstatus = _pstatus;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
ir.saelozahra.damaara.mazraeyeman.cl_appupdate parent;
RemoteObject _pstatus;
RemoteObject _okwebver = RemoteObject.createImmutable(false);
RemoteObject _fsize = RemoteObject.createImmutable(0L);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("UpdateApk (cl_appupdate) ","cl_appupdate",24,__ref.getField(false, "ba"),__ref,210);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("pstatus", _pstatus);
 BA.debugLineNum = 211;BA.debugLine="LogColor(\"---- AppUpdating.UpdateApk\", LogColor1)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","925296897",BA.ObjectToString("---- AppUpdating.UpdateApk"),__ref.getField(true,"_logcolor1" /*RemoteObject*/ ));
 BA.debugLineNum = 212;BA.debugLine="If Not(pstatus) Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 61;
if (parent.__c.runMethod(true,"Not",(Object)(_pstatus)).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 11;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 213;BA.debugLine="sStatusCode = ERR_NOPERM";
Debug.JustUpdateDeviceLine();
__ref.setField ("_sstatuscode" /*RemoteObject*/ ,__ref.getField(true,"_err_noperm" /*RemoteObject*/ ));
 BA.debugLineNum = 214;BA.debugLine="If sVerbose Then Log(TAB & \"no permissions from";
Debug.JustUpdateDeviceLine();
if (true) break;

case 4:
//if
this.state = 9;
if (__ref.getField(true,"_sverbose" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
parent.__c.runVoidMethod ("LogImpl","925296900",RemoteObject.concat(parent.__c.getField(true,"TAB"),RemoteObject.createImmutable("no permissions from user to install new apk")),0);
if (true) break;

case 9:
//C
this.state = 61;
;
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 216;BA.debugLine="Wait For(IsvalidWV) Complete (OkWebVer As Boolea";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cl_appupdate", "updateapk"), __ref.runClassMethod (ir.saelozahra.damaara.mazraeyeman.cl_appupdate.class, "_isvalidwv" /*RemoteObject*/ ));
this.state = 62;
return;
case 62:
//C
this.state = 12;
_okwebver = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("OkWebVer", _okwebver);
;
 BA.debugLineNum = 217;BA.debugLine="If (IsValidCV And OkWebVer) Then							'here we";
Debug.JustUpdateDeviceLine();
if (true) break;

case 12:
//if
this.state = 60;
if ((RemoteObject.solveBoolean(".",__ref.runClassMethod (ir.saelozahra.damaara.mazraeyeman.cl_appupdate.class, "_isvalidcv" /*RemoteObject*/ )) && RemoteObject.solveBoolean(".",_okwebver))) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 218;BA.debugLine="If curver < webver Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 15:
//if
this.state = 59;
if (RemoteObject.solveBoolean("<",BA.numberCast(double.class, __ref.getField(true,"_curver" /*RemoteObject*/ )),BA.numberCast(double.class, __ref.getField(true,"_webver" /*RemoteObject*/ )))) { 
this.state = 17;
}else {
this.state = 52;
}if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 220;BA.debugLine="If IsNumber(webfsize) Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 18:
//if
this.state = 31;
if (parent.__c.runMethod(true,"IsNumber",(Object)(__ref.getField(true,"_webfsize" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 221;BA.debugLine="Dim fsize As Long = webfsize";
Debug.JustUpdateDeviceLine();
_fsize = BA.numberCast(long.class, __ref.getField(true,"_webfsize" /*RemoteObject*/ ));Debug.locals.put("fsize", _fsize);Debug.locals.put("fsize", _fsize);
 BA.debugLineNum = 222;BA.debugLine="If fsize*2 > GetFreeSpace Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 21:
//if
this.state = 30;
if (RemoteObject.solveBoolean(">",RemoteObject.solve(new RemoteObject[] {_fsize,RemoteObject.createImmutable(2)}, "*",0, 2),__ref.runClassMethod (ir.saelozahra.damaara.mazraeyeman.cl_appupdate.class, "_getfreespace" /*RemoteObject*/ ))) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 223;BA.debugLine="sStatusCode = ERR_NOSPACE";
Debug.JustUpdateDeviceLine();
__ref.setField ("_sstatuscode" /*RemoteObject*/ ,__ref.getField(true,"_err_nospace" /*RemoteObject*/ ));
 BA.debugLineNum = 224;BA.debugLine="If sVerbose Then Log($\"${TAB}no enough avail";
Debug.JustUpdateDeviceLine();
if (true) break;

case 24:
//if
this.state = 29;
if (__ref.getField(true,"_sverbose" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 26;
;}if (true) break;

case 26:
//C
this.state = 29;
parent.__c.runVoidMethod ("LogImpl","925296910",(RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.__c.getField(true,"TAB")))),RemoteObject.createImmutable("no enough available space to download apk"))),0);
if (true) break;

case 29:
//C
this.state = 30;
;
 if (true) break;

case 30:
//C
this.state = 31;
;
 if (true) break;
;
 BA.debugLineNum = 227;BA.debugLine="If sStatusCode >= 0 Then";
Debug.JustUpdateDeviceLine();

case 31:
//if
this.state = 50;
if (RemoteObject.solveBoolean("g",__ref.getField(true,"_sstatuscode" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
this.state = 33;
}if (true) break;

case 33:
//C
this.state = 34;
 BA.debugLineNum = 228;BA.debugLine="sStatusCode = OK_NEWERAPK			'info file tells";
Debug.JustUpdateDeviceLine();
__ref.setField ("_sstatuscode" /*RemoteObject*/ ,__ref.getField(true,"_ok_newerapk" /*RemoteObject*/ ));
 BA.debugLineNum = 229;BA.debugLine="If sVerbose Then Log($\"${TAB}Newer version av";
Debug.JustUpdateDeviceLine();
if (true) break;

case 34:
//if
this.state = 39;
if (__ref.getField(true,"_sverbose" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 36;
;}if (true) break;

case 36:
//C
this.state = 39;
parent.__c.runVoidMethod ("LogImpl","925296915",(RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.__c.getField(true,"TAB")))),RemoteObject.createImmutable("Newer version available. Now I try its downloading"))),0);
if (true) break;

case 39:
//C
this.state = 40;
;
 BA.debugLineNum = 230;BA.debugLine="If sNewVerApk = \"\" Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 40:
//if
this.state = 49;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_snewverapk" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 42;
}if (true) break;

case 42:
//C
this.state = 43;
 BA.debugLineNum = 231;BA.debugLine="sStatusCode = ERR_NOAPK";
Debug.JustUpdateDeviceLine();
__ref.setField ("_sstatuscode" /*RemoteObject*/ ,__ref.getField(true,"_err_noapk" /*RemoteObject*/ ));
 BA.debugLineNum = 232;BA.debugLine="If sVerbose Then Log($\"${TAB}missing apk fil";
Debug.JustUpdateDeviceLine();
if (true) break;

case 43:
//if
this.state = 48;
if (__ref.getField(true,"_sverbose" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 45;
;}if (true) break;

case 45:
//C
this.state = 48;
parent.__c.runVoidMethod ("LogImpl","925296918",(RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.__c.getField(true,"TAB")))),RemoteObject.createImmutable("missing apk file full path indication"))),0);
if (true) break;

case 48:
//C
this.state = 49;
;
 if (true) break;

case 49:
//C
this.state = 50;
;
 if (true) break;

case 50:
//C
this.state = 59;
;
 if (true) break;

case 52:
//C
this.state = 53;
 BA.debugLineNum = 236;BA.debugLine="sStatusCode = NO_NEWERAPK";
Debug.JustUpdateDeviceLine();
__ref.setField ("_sstatuscode" /*RemoteObject*/ ,__ref.getField(true,"_no_newerapk" /*RemoteObject*/ ));
 BA.debugLineNum = 237;BA.debugLine="If sVerbose Then Log($\"${TAB}No newer version";
Debug.JustUpdateDeviceLine();
if (true) break;

case 53:
//if
this.state = 58;
if (__ref.getField(true,"_sverbose" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 55;
;}if (true) break;

case 55:
//C
this.state = 58;
parent.__c.runVoidMethod ("LogImpl","925296923",(RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.__c.getField(true,"TAB")))),RemoteObject.createImmutable("No newer version available on webserver."))),0);
if (true) break;

case 58:
//C
this.state = 59;
;
 if (true) break;

case 59:
//C
this.state = 60;
;
 if (true) break;

case 60:
//C
this.state = 61;
;
 if (true) break;

case 61:
//C
this.state = -1;
;
 BA.debugLineNum = 241;BA.debugLine="TryApkUpdate						'if available and permitted, do";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (ir.saelozahra.damaara.mazraeyeman.cl_appupdate.class, "_tryapkupdate" /*void*/ );
 BA.debugLineNum = 242;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
}