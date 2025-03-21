package ir.saelozahra.damaara.mazraeyeman;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class starter_subs_0 {


public static void  _activatessl() throws Exception{
try {
		Debug.PushSubsStack("ActivateSSL (starter) ","starter",4,starter.processBA,starter.mostCurrent,203);
if (RapidSub.canDelegate("activatessl")) { ir.saelozahra.damaara.mazraeyeman.starter.remoteMe.runUserSub(false, "starter","activatessl"); return;}
ResumableSub_ActivateSSL rsub = new ResumableSub_ActivateSSL(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ActivateSSL extends BA.ResumableSub {
public ResumableSub_ActivateSSL(ir.saelozahra.damaara.mazraeyeman.starter parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.saelozahra.damaara.mazraeyeman.starter parent;
RemoteObject _javaobjectcontext = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _javaobjectinstance = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _objectlistener = RemoteObject.declareNull("Object");
RemoteObject _phoneinstance = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone");
RemoteObject _stringmethodname = RemoteObject.createImmutable("");
RemoteObject _objectarguments = null;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ActivateSSL (starter) ","starter",4,starter.processBA,starter.mostCurrent,203);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 205;BA.debugLine="Dim javaobjectContext";
Debug.ShouldStop(4096);
_javaobjectcontext = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("javaobjectContext", _javaobjectcontext);
 BA.debugLineNum = 206;BA.debugLine="Dim javaobjectInstance";
Debug.ShouldStop(8192);
_javaobjectinstance = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("javaobjectInstance", _javaobjectinstance);
 BA.debugLineNum = 207;BA.debugLine="Dim objectListener";
Debug.ShouldStop(16384);
_objectlistener = RemoteObject.createNew ("Object");Debug.locals.put("objectListener", _objectlistener);
 BA.debugLineNum = 208;BA.debugLine="Dim phoneInstance";
Debug.ShouldStop(32768);
_phoneinstance = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone");Debug.locals.put("phoneInstance", _phoneinstance);
 BA.debugLineNum = 210;BA.debugLine="Try";
Debug.ShouldStop(131072);
if (true) break;

case 1:
//try
this.state = 12;
this.catchState = 11;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 11;
 BA.debugLineNum = 211;BA.debugLine="Select Case phoneInstance.SdkVersion";
Debug.ShouldStop(262144);
if (true) break;

case 4:
//select
this.state = 9;
switch (BA.switchObjectToInt(_phoneinstance.runMethod(true,"getSdkVersion"),BA.numberCast(int.class, 16),BA.numberCast(int.class, 17),BA.numberCast(int.class, 18),BA.numberCast(int.class, 19),BA.numberCast(int.class, 20))) {
case 0: 
case 1: 
case 2: 
case 3: 
case 4: {
this.state = 6;
if (true) break;
}
default: {
this.state = 8;
if (true) break;
}
}
if (true) break;

case 6:
//C
this.state = 9;
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 214;BA.debugLine="Return";
Debug.ShouldStop(2097152);
Debug.CheckDeviceExceptions();if (true) return ;
 if (true) break;

case 9:
//C
this.state = 12;
;
 BA.debugLineNum = 216;BA.debugLine="javaobjectInstance.InitializeStatic (\"com.google";
Debug.ShouldStop(8388608);
_javaobjectinstance.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("com.google.android.gms.security.ProviderInstaller")));
 BA.debugLineNum = 217;BA.debugLine="javaobjectContext.InitializeContext";
Debug.ShouldStop(16777216);
_javaobjectcontext.runVoidMethod ("InitializeContext",starter.processBA);
 BA.debugLineNum = 218;BA.debugLine="DisableStrictMode";
Debug.ShouldStop(33554432);
_disablestrictmode();
 BA.debugLineNum = 219;BA.debugLine="objectListener = javaobjectInstance.CreateEventF";
Debug.ShouldStop(67108864);
_objectlistener = _javaobjectinstance.runMethod(false,"CreateEventFromUI",starter.processBA,(Object)(BA.ObjectToString("com.google.android.gms.security.ProviderInstaller.ProviderInstallListener")),(Object)(BA.ObjectToString("objectListener")),(Object)(parent.mostCurrent.__c.getField(false,"Null")));Debug.locals.put("objectListener", _objectlistener);
 BA.debugLineNum = 220;BA.debugLine="javaobjectInstance.RunMethod (\"installIfNeededAs";
Debug.ShouldStop(134217728);
_javaobjectinstance.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("installIfNeededAsync")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_javaobjectcontext.getObject()),_objectlistener})));
 BA.debugLineNum = 221;BA.debugLine="Wait For objectListener_Event (stringMethodName";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","objectlistener_event", starter.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "starter", "activatessl"), null);
this.state = 13;
return;
case 13:
//C
this.state = 12;
_stringmethodname = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("stringMethodName", _stringmethodname);
_objectarguments = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("objectArguments", _objectarguments);
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
 BA.debugLineNum = 224;BA.debugLine="Log(LastException)";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","44849685",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",starter.processBA)),0);
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 227;BA.debugLine="End Sub";
Debug.ShouldStop(4);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",starter.processBA, e0.toString());}
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
public static void  _objectlistener_event(RemoteObject _stringmethodname,RemoteObject _objectarguments) throws Exception{
}
public static RemoteObject  _application_error(RemoteObject _error,RemoteObject _stacktrace) throws Exception{
try {
		Debug.PushSubsStack("Application_Error (starter) ","starter",4,starter.processBA,starter.mostCurrent,49);
if (RapidSub.canDelegate("application_error")) { return ir.saelozahra.damaara.mazraeyeman.starter.remoteMe.runUserSub(false, "starter","application_error", _error, _stacktrace);}
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 49;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(65536);
 BA.debugLineNum = 51;BA.debugLine="Return False";
Debug.ShouldStop(262144);
if (true) return starter.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 52;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _disablestrictmode() throws Exception{
try {
		Debug.PushSubsStack("DisableStrictMode (starter) ","starter",4,starter.processBA,starter.mostCurrent,229);
if (RapidSub.canDelegate("disablestrictmode")) { return ir.saelozahra.damaara.mazraeyeman.starter.remoteMe.runUserSub(false, "starter","disablestrictmode");}
RemoteObject _javaobjectinstance = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _javaobjectpolicy = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _javaobjectstrictmode = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
 BA.debugLineNum = 229;BA.debugLine="Sub DisableStrictMode";
Debug.ShouldStop(16);
 BA.debugLineNum = 231;BA.debugLine="Dim javaobjectInstance";
Debug.ShouldStop(64);
_javaobjectinstance = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("javaobjectInstance", _javaobjectinstance);
 BA.debugLineNum = 232;BA.debugLine="Dim javaobjectPolicy";
Debug.ShouldStop(128);
_javaobjectpolicy = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("javaobjectPolicy", _javaobjectpolicy);
 BA.debugLineNum = 233;BA.debugLine="Dim javaobjectStrictMode";
Debug.ShouldStop(256);
_javaobjectstrictmode = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("javaobjectStrictMode", _javaobjectstrictmode);
 BA.debugLineNum = 235;BA.debugLine="Try";
Debug.ShouldStop(1024);
try { BA.debugLineNum = 236;BA.debugLine="javaobjectInstance.InitializeStatic (\"android.os";
Debug.ShouldStop(2048);
_javaobjectinstance.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("android.os.Build.VERSION")));
 BA.debugLineNum = 237;BA.debugLine="If javaobjectInstance.GetField (\"SDK_INT\") > 9 T";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _javaobjectinstance.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("SDK_INT")))),BA.numberCast(double.class, 9))) { 
 BA.debugLineNum = 238;BA.debugLine="javaobjectPolicy = javaobjectPolicy.InitializeN";
Debug.ShouldStop(8192);
_javaobjectpolicy = _javaobjectpolicy.runMethod(false,"InitializeNewInstance",(Object)(BA.ObjectToString("android.os.StrictMode.ThreadPolicy.Builder")),(Object)((starter.mostCurrent.__c.getField(false,"Null"))));Debug.locals.put("javaobjectPolicy", _javaobjectpolicy);
 BA.debugLineNum = 239;BA.debugLine="javaobjectPolicy = javaobjectPolicy.RunMethodJO";
Debug.ShouldStop(16384);
_javaobjectpolicy = _javaobjectpolicy.runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("permitAll")),(Object)((starter.mostCurrent.__c.getField(false,"Null")))).runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("build")),(Object)((starter.mostCurrent.__c.getField(false,"Null"))));Debug.locals.put("javaobjectPolicy", _javaobjectpolicy);
 BA.debugLineNum = 240;BA.debugLine="javaobjectStrictMode.InitializeStatic (\"android";
Debug.ShouldStop(32768);
_javaobjectstrictmode.runMethod(false,"InitializeStatic",(Object)(RemoteObject.createImmutable("android.os.StrictMode"))).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setThreadPolicy")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_javaobjectpolicy.getObject())})));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e12) {
			BA.rdebugUtils.runVoidMethod("setLastException",starter.processBA, e12.toString()); BA.debugLineNum = 243;BA.debugLine="Log(LastException)";
Debug.ShouldStop(262144);
starter.mostCurrent.__c.runVoidMethod ("LogImpl","44915214",BA.ObjectToString(starter.mostCurrent.__c.runMethod(false,"LastException",starter.processBA)),0);
 };
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
public static RemoteObject  _gps_locationchanged(RemoteObject _location1) throws Exception{
try {
		Debug.PushSubsStack("GPS_LocationChanged (starter) ","starter",4,starter.processBA,starter.mostCurrent,60);
if (RapidSub.canDelegate("gps_locationchanged")) { return ir.saelozahra.damaara.mazraeyeman.starter.remoteMe.runUserSub(false, "starter","gps_locationchanged", _location1);}
Debug.locals.put("Location1", _location1);
 BA.debugLineNum = 60;BA.debugLine="Sub GPS_LocationChanged (Location1 As Location)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 61;BA.debugLine="MyLocation = Location1";
Debug.ShouldStop(268435456);
starter._mylocation = _location1;
 BA.debugLineNum = 63;BA.debugLine="If SaeloZahra.active_page ==\"selectmap\" Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",starter.mostCurrent._saelozahra._active_page /*RemoteObject*/ ,BA.ObjectToString("selectmap"))) { 
 BA.debugLineNum = 65;BA.debugLine="CallSub(select_map_act,\"goToMyLocation\")";
Debug.ShouldStop(1);
starter.mostCurrent.__c.runMethodAndSync(false,"CallSubNew",starter.processBA,(Object)((starter.mostCurrent._select_map_act.getObject())),(Object)(RemoteObject.createImmutable("goToMyLocation")));
 BA.debugLineNum = 66;BA.debugLine="select_map_act.myLocation=MyLocation";
Debug.ShouldStop(2);
starter.mostCurrent._select_map_act._mylocation /*RemoteObject*/  = starter._mylocation;
 BA.debugLineNum = 68;BA.debugLine="File.WriteString(SaeloZahra.dir,\"lat\",Location1.";
Debug.ShouldStop(8);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(starter.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(BA.ObjectToString("lat")),(Object)(BA.NumberToString(_location1.runMethod(true,"getLatitude"))));
 BA.debugLineNum = 69;BA.debugLine="File.WriteString(SaeloZahra.dir,\"lng\",Location1.";
Debug.ShouldStop(16);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(starter.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(BA.ObjectToString("lng")),(Object)(BA.NumberToString(_location1.runMethod(true,"getLongitude"))));
 };
 BA.debugLineNum = 73;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("JobDone (starter) ","starter",4,starter.processBA,starter.mostCurrent,95);
if (RapidSub.canDelegate("jobdone")) { return ir.saelozahra.damaara.mazraeyeman.starter.remoteMe.runUserSub(false, "starter","jobdone", _job);}
RemoteObject _parsercheckpurchusedjob = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _rootcheckpurchusedjob = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _purchases = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colpurchases = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _token = RemoteObject.createImmutable("");
RemoteObject _packagename = RemoteObject.createImmutable("");
RemoteObject _autorenewing = RemoteObject.createImmutable("");
RemoteObject _parserelevation = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _rootelevation = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colrootelevation = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _elevation = RemoteObject.createImmutable(0);
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _display_name = RemoteObject.createImmutable("");
RemoteObject _adresse = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _results = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colresults = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _formatted_address = RemoteObject.createImmutable("");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 95;BA.debugLine="Sub JobDone (Job As HttpJob)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 97;BA.debugLine="Log(Job.JobName&\"  \"&Job.Success)";
Debug.ShouldStop(1);
starter.mostCurrent.__c.runVoidMethod ("LogImpl","44784130",RemoteObject.concat(_job.getField(true,"_jobname" /*RemoteObject*/ ),RemoteObject.createImmutable("  "),_job.getField(true,"_success" /*RemoteObject*/ )),0);
 BA.debugLineNum = 99;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(4);
starter.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 102;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(32);
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 103;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(64);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("CheckPurchusedJob"),BA.ObjectToString("GetMyElevationJob"),BA.ObjectToString("get_my_address"),BA.ObjectToString("get_my_address_old"))) {
case 0: {
 BA.debugLineNum = 106;BA.debugLine="Dim parserCheckPurchusedJob As JSONParser";
Debug.ShouldStop(512);
_parsercheckpurchusedjob = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parserCheckPurchusedJob", _parsercheckpurchusedjob);
 BA.debugLineNum = 107;BA.debugLine="parserCheckPurchusedJob.Initialize(Job.GetStri";
Debug.ShouldStop(1024);
_parsercheckpurchusedjob.runVoidMethod ("Initialize",(Object)(_job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 108;BA.debugLine="Dim rootCheckPurchusedJob As Map = parserCheck";
Debug.ShouldStop(2048);
_rootcheckpurchusedjob = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_rootcheckpurchusedjob = _parsercheckpurchusedjob.runMethod(false,"NextObject");Debug.locals.put("rootCheckPurchusedJob", _rootcheckpurchusedjob);Debug.locals.put("rootCheckPurchusedJob", _rootcheckpurchusedjob);
 BA.debugLineNum = 109;BA.debugLine="Dim purchases As List = rootCheckPurchusedJob.";
Debug.ShouldStop(4096);
_purchases = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_purchases = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _rootcheckpurchusedjob.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("purchases")))));Debug.locals.put("purchases", _purchases);Debug.locals.put("purchases", _purchases);
 BA.debugLineNum = 110;BA.debugLine="For Each colpurchases As Map In purchases";
Debug.ShouldStop(8192);
_colpurchases = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group10 = _purchases;
final int groupLen10 = group10.runMethod(true,"getSize").<Integer>get()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_colpurchases = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group10.runMethod(false,"Get",index10));Debug.locals.put("colpurchases", _colpurchases);
Debug.locals.put("colpurchases", _colpurchases);
 BA.debugLineNum = 111;BA.debugLine="Dim token As String = colpurchases.Get(\"token";
Debug.ShouldStop(16384);
_token = BA.ObjectToString(_colpurchases.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("token")))));Debug.locals.put("token", _token);Debug.locals.put("token", _token);
 BA.debugLineNum = 112;BA.debugLine="Dim packageName As String = colpurchases.Get(";
Debug.ShouldStop(32768);
_packagename = BA.ObjectToString(_colpurchases.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("packageName")))));Debug.locals.put("packageName", _packagename);Debug.locals.put("packageName", _packagename);
 BA.debugLineNum = 113;BA.debugLine="Dim autoRenewing As String = colpurchases.Get";
Debug.ShouldStop(65536);
_autorenewing = BA.ObjectToString(_colpurchases.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("autoRenewing")))));Debug.locals.put("autoRenewing", _autorenewing);Debug.locals.put("autoRenewing", _autorenewing);
 BA.debugLineNum = 114;BA.debugLine="If (packageName == Application.PackageName) A";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_packagename,starter.mostCurrent.__c.getField(false,"Application").runMethod(true,"getPackageName"))))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_autorenewing.runMethod(true,"toLowerCase"),BA.ObjectToString("true")) || RemoteObject.solveBoolean("=",_autorenewing.runMethod(true,"toLowerCase"),BA.ObjectToString(starter.mostCurrent.__c.getField(true,"True"))))))) { 
 BA.debugLineNum = 115;BA.debugLine="LogColor(\"اشتراک شما ثبت شده\",Colors.LightGr";
Debug.ShouldStop(262144);
starter.mostCurrent.__c.runVoidMethod ("LogImpl","44784148",BA.ObjectToString("اشتراک شما ثبت شده"),starter.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 116;BA.debugLine="File.WriteString(SaeloZahra.dir,\"NotNeedUser";
Debug.ShouldStop(524288);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(starter.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(BA.ObjectToString("NotNeedUserPass")),(Object)(starter.mostCurrent.__c.getField(false,"Application").runMethod(true,"getPackageName")));
 BA.debugLineNum = 117;BA.debugLine="File.WriteString(SaeloZahra.dir,\"ActiveToken";
Debug.ShouldStop(1048576);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(starter.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(BA.ObjectToString("ActiveToken")),(Object)(_token));
 BA.debugLineNum = 118;BA.debugLine="RegisterAct.Payed=2";
Debug.ShouldStop(2097152);
starter.mostCurrent._registeract._payed /*RemoteObject*/  = BA.numberCast(int.class, 2);
 }else {
 BA.debugLineNum = 120;BA.debugLine="LogColor(\"شما اشتراک فعالی ندارید\",Colors.Li";
Debug.ShouldStop(8388608);
starter.mostCurrent.__c.runVoidMethod ("LogImpl","44784153",BA.ObjectToString("شما اشتراک فعالی ندارید"),starter.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 121;BA.debugLine="File.Delete(SaeloZahra.Dir,\"NotNeedUserPass\"";
Debug.ShouldStop(16777216);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(starter.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("NotNeedUserPass")));
 };
 }
}Debug.locals.put("colpurchases", _colpurchases);
;
 BA.debugLineNum = 125;BA.debugLine="If Job.GetString == \"{\"\"purchases\"\":[]}\" Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_getstring" /*RemoteObject*/ ),BA.ObjectToString("{\"purchases\":[]}"))) { 
 BA.debugLineNum = 126;BA.debugLine="LogColor(\"شما اشتراک فعالی ندارید\",Colors.Lig";
Debug.ShouldStop(536870912);
starter.mostCurrent.__c.runVoidMethod ("LogImpl","44784159",BA.ObjectToString("شما اشتراک فعالی ندارید"),starter.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 127;BA.debugLine="File.Delete(SaeloZahra.Dir,\"NotNeedUserPass\")";
Debug.ShouldStop(1073741824);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(starter.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("NotNeedUserPass")));
 };
 BA.debugLineNum = 129;BA.debugLine="If SaeloZahra.RayganHast Then RegisterAct.Paye";
Debug.ShouldStop(1);
if (starter.mostCurrent._saelozahra._rayganhast /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
starter.mostCurrent._registeract._payed /*RemoteObject*/  = BA.numberCast(int.class, 2);};
 BA.debugLineNum = 130;BA.debugLine="Job.Release";
Debug.ShouldStop(2);
_job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_release" /*RemoteObject*/ );
 break; }
case 1: {
 BA.debugLineNum = 132;BA.debugLine="Dim parserElevation As JSONParser";
Debug.ShouldStop(8);
_parserelevation = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parserElevation", _parserelevation);
 BA.debugLineNum = 133;BA.debugLine="parserElevation.Initialize(Job.GetString)";
Debug.ShouldStop(16);
_parserelevation.runVoidMethod ("Initialize",(Object)(_job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 134;BA.debugLine="Dim rootElevation As List = parserElevation.Ne";
Debug.ShouldStop(32);
_rootelevation = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_rootelevation = _parserelevation.runMethod(false,"NextArray");Debug.locals.put("rootElevation", _rootelevation);Debug.locals.put("rootElevation", _rootelevation);
 BA.debugLineNum = 135;BA.debugLine="For Each colrootElevation As Map In rootElevat";
Debug.ShouldStop(64);
_colrootelevation = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group34 = _rootelevation;
final int groupLen34 = group34.runMethod(true,"getSize").<Integer>get()
;int index34 = 0;
;
for (; index34 < groupLen34;index34++){
_colrootelevation = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group34.runMethod(false,"Get",index34));Debug.locals.put("colrootElevation", _colrootelevation);
Debug.locals.put("colrootElevation", _colrootelevation);
 BA.debugLineNum = 136;BA.debugLine="Dim elevation As Double = colrootElevation.Ge";
Debug.ShouldStop(128);
_elevation = BA.numberCast(double.class, _colrootelevation.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("elevation")))));Debug.locals.put("elevation", _elevation);Debug.locals.put("elevation", _elevation);
 BA.debugLineNum = 137;BA.debugLine="File.WriteString(SaeloZahra.dir,\"mySeaLevel\",";
Debug.ShouldStop(256);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(starter.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(BA.ObjectToString("mySeaLevel")),(Object)(BA.NumberToString(_elevation)));
 BA.debugLineNum = 138;BA.debugLine="ToastMessageShow(\"ارتفاع شما از سطح دریا \"&el";
Debug.ShouldStop(512);
starter.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("ارتفاع شما از سطح دریا "),_elevation,RemoteObject.createImmutable(" است")))),(Object)(starter.mostCurrent.__c.getField(true,"True")));
 }
}Debug.locals.put("colrootElevation", _colrootelevation);
;
 break; }
case 2: {
 BA.debugLineNum = 145;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(65536);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 146;BA.debugLine="parser.Initialize(Job.GetString)";
Debug.ShouldStop(131072);
_parser.runVoidMethod ("Initialize",(Object)(_job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 147;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(262144);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 148;BA.debugLine="Dim display_name As String = root.Get(\"display";
Debug.ShouldStop(524288);
_display_name = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("display_name")))));Debug.locals.put("display_name", _display_name);Debug.locals.put("display_name", _display_name);
 BA.debugLineNum = 149;BA.debugLine="File.WriteString(SaeloZahra.dir,\"address\",disp";
Debug.ShouldStop(1048576);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(starter.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(BA.ObjectToString("address")),(Object)(_display_name));
 BA.debugLineNum = 150;BA.debugLine="CallSubDelayed2(select_map_act,\"change_address";
Debug.ShouldStop(2097152);
starter.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",starter.processBA,(Object)((starter.mostCurrent._select_map_act.getObject())),(Object)(BA.ObjectToString("change_addressbar_text")),(Object)((_display_name)));
 break; }
case 3: {
 BA.debugLineNum = 152;BA.debugLine="Try";
Debug.ShouldStop(8388608);
try { BA.debugLineNum = 153;BA.debugLine="Dim Adresse As List";
Debug.ShouldStop(16777216);
_adresse = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Adresse", _adresse);
 BA.debugLineNum = 154;BA.debugLine="Adresse.Initialize";
Debug.ShouldStop(33554432);
_adresse.runVoidMethod ("Initialize");
 BA.debugLineNum = 155;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(67108864);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 156;BA.debugLine="Try";
Debug.ShouldStop(134217728);
try { BA.debugLineNum = 157;BA.debugLine="parser.Initialize(Job.GetString)";
Debug.ShouldStop(268435456);
_parser.runVoidMethod ("Initialize",(Object)(_job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 158;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(536870912);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 159;BA.debugLine="Dim results As List = root.Get(\"results\")";
Debug.ShouldStop(1073741824);
_results = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_results = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("results")))));Debug.locals.put("results", _results);Debug.locals.put("results", _results);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e56) {
			BA.rdebugUtils.runVoidMethod("setLastException",starter.processBA, e56.toString()); BA.debugLineNum = 161;BA.debugLine="Log(\"address json nist\")";
Debug.ShouldStop(1);
starter.mostCurrent.__c.runVoidMethod ("LogImpl","44784194",RemoteObject.createImmutable("address json nist"),0);
 };
 BA.debugLineNum = 164;BA.debugLine="For Each colresults As Map In results";
Debug.ShouldStop(8);
_colresults = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group58 = _results;
final int groupLen58 = group58.runMethod(true,"getSize").<Integer>get()
;int index58 = 0;
;
for (; index58 < groupLen58;index58++){
_colresults = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group58.runMethod(false,"Get",index58));Debug.locals.put("colresults", _colresults);
Debug.locals.put("colresults", _colresults);
 BA.debugLineNum = 165;BA.debugLine="Dim formatted_address As String = colresults";
Debug.ShouldStop(16);
_formatted_address = BA.ObjectToString(_colresults.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("formatted_address")))));Debug.locals.put("formatted_address", _formatted_address);Debug.locals.put("formatted_address", _formatted_address);
 BA.debugLineNum = 166;BA.debugLine="Adresse.Add(formatted_address)";
Debug.ShouldStop(32);
_adresse.runVoidMethod ("Add",(Object)((_formatted_address)));
 }
}Debug.locals.put("colresults", _colresults);
;
 BA.debugLineNum = 169;BA.debugLine="If Adresse.Size<>0 Then CallSubDelayed2(selec";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("!",_adresse.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
starter.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",starter.processBA,(Object)((starter.mostCurrent._select_map_act.getObject())),(Object)(BA.ObjectToString("change_addressbar_text")),(Object)(_adresse.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0)))));};
 BA.debugLineNum = 171;BA.debugLine="File.WriteString(SaeloZahra.dir,\"address\",Adr";
Debug.ShouldStop(1024);
starter.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(starter.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(BA.ObjectToString("address")),(Object)(BA.ObjectToString(_adresse.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e65) {
			BA.rdebugUtils.runVoidMethod("setLastException",starter.processBA, e65.toString()); BA.debugLineNum = 174;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8192);
starter.mostCurrent.__c.runVoidMethod ("LogImpl","44784207",BA.ObjectToString(starter.mostCurrent.__c.runMethod(false,"LastException",starter.processBA)),0);
 };
 break; }
}
;
 }else {
 BA.debugLineNum = 179;BA.debugLine="If Not(SaeloZahra.CheckConnection) Then";
Debug.ShouldStop(262144);
if (starter.mostCurrent.__c.runMethod(true,"Not",(Object)(starter.mostCurrent._saelozahra.runMethod(true,"_checkconnection" /*RemoteObject*/ ,starter.processBA))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 180;BA.debugLine="ToastMessageShow(SaeloZahra.CSB(\"اینترنت شما قط";
Debug.ShouldStop(524288);
starter.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(starter.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,starter.processBA,(Object)(RemoteObject.createImmutable("اینترنت شما قطع است"))).getObject())),(Object)(starter.mostCurrent.__c.getField(true,"True")));
 }else 
{ BA.debugLineNum = 181;BA.debugLine="Else If Not(SaeloZahra.checkSite) Then";
Debug.ShouldStop(1048576);
if (starter.mostCurrent.__c.runMethod(true,"Not",(Object)(starter.mostCurrent._saelozahra.runMethod(true,"_checksite" /*RemoteObject*/ ,starter.processBA))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 182;BA.debugLine="ToastMessageShow(SaeloZahra.CSB(\"اتصال به سایت";
Debug.ShouldStop(2097152);
starter.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(starter.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,starter.processBA,(Object)(RemoteObject.createImmutable("اتصال به سایت برقرار نشد"))).getObject())),(Object)(starter.mostCurrent.__c.getField(true,"True")));
 }else {
 BA.debugLineNum = 184;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
Debug.ShouldStop(8388608);
starter.mostCurrent.__c.runVoidMethod ("LogImpl","44784217",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 BA.debugLineNum = 186;BA.debugLine="If Job.ErrorMessage.Contains(\"Unable to resolve";
Debug.ShouldStop(33554432);
if (_job.getField(true,"_errormessage" /*RemoteObject*/ ).runMethod(true,"contains",(Object)(RemoteObject.createImmutable("Unable to resolve host"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 187;BA.debugLine="ToastMessageShow(SaeloZahra.CSB(\" اینترنتتون و";
Debug.ShouldStop(67108864);
starter.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(starter.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,starter.processBA,(Object)(RemoteObject.createImmutable(" اینترنتتون وصل نیست "))).getObject())),(Object)(starter.mostCurrent.__c.getField(true,"True")));
 }else 
{ BA.debugLineNum = 188;BA.debugLine="Else if Job.ErrorMessage.Contains(\"too_many_req";
Debug.ShouldStop(134217728);
if (_job.getField(true,"_errormessage" /*RemoteObject*/ ).runMethod(true,"contains",(Object)(RemoteObject.createImmutable("too_many_requests"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 189;BA.debugLine="Job.Release";
Debug.ShouldStop(268435456);
_job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_release" /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 191;BA.debugLine="ToastMessageShow(SaeloZahra.CSB(\" خطا در ورود";
Debug.ShouldStop(1073741824);
starter.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(starter.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,starter.processBA,(Object)(RemoteObject.createImmutable(" خطا در ورود "))),starter.mostCurrent.__c.getField(true,"CRLF"),_job.getField(true,"_errormessage" /*RemoteObject*/ )))),(Object)(starter.mostCurrent.__c.getField(true,"True")));
 }}
;
 }}
;
 };
 BA.debugLineNum = 197;BA.debugLine="Job.Release";
Debug.ShouldStop(16);
_job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_release" /*RemoteObject*/ );
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Dim usrnm As String = \"admin\"";
starter._usrnm = BA.ObjectToString("admin");
 //BA.debugLineNum = 8;BA.debugLine="Dim my_id As String";
starter._my_id = RemoteObject.createImmutable("");
 //BA.debugLineNum = 9;BA.debugLine="Public rp As RuntimePermissions";
starter._rp = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");
 //BA.debugLineNum = 10;BA.debugLine="Public GPS1 As GPS";
starter._gps1 = RemoteObject.createNew ("anywheresoftware.b4a.gps.GPS");
 //BA.debugLineNum = 11;BA.debugLine="Public gpsStarted As Boolean";
starter._gpsstarted = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 12;BA.debugLine="Dim MyLocation As Location";
starter._mylocation = RemoteObject.createNew ("anywheresoftware.b4a.gps.LocationWrapper");
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _service_create() throws Exception{
try {
		Debug.PushSubsStack("Service_Create (starter) ","starter",4,starter.processBA,starter.mostCurrent,17);
if (RapidSub.canDelegate("service_create")) { return ir.saelozahra.damaara.mazraeyeman.starter.remoteMe.runUserSub(false, "starter","service_create");}
 BA.debugLineNum = 17;BA.debugLine="Sub Service_Create";
Debug.ShouldStop(65536);
 BA.debugLineNum = 19;BA.debugLine="ActivateSSL";
Debug.ShouldStop(262144);
_activatessl();
 BA.debugLineNum = 21;BA.debugLine="StartService(FirebaseMessaging)";
Debug.ShouldStop(1048576);
starter.mostCurrent.__c.runVoidMethod ("StartService",starter.processBA,(Object)((starter.mostCurrent._firebasemessaging.getObject())));
 BA.debugLineNum = 22;BA.debugLine="CallSubDelayed2(FirebaseMessaging, \"SubscribeToTo";
Debug.ShouldStop(2097152);
starter.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",starter.processBA,(Object)((starter.mostCurrent._firebasemessaging.getObject())),(Object)(BA.ObjectToString("SubscribeToTopics")),(Object)((RemoteObject.createImmutable("general"))));
 BA.debugLineNum = 24;BA.debugLine="Try";
Debug.ShouldStop(8388608);
try { BA.debugLineNum = 25;BA.debugLine="GPS1.Initialize(\"GPS\")";
Debug.ShouldStop(16777216);
starter._gps1.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("GPS")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e7) {
			BA.rdebugUtils.runVoidMethod("setLastException",starter.processBA, e7.toString()); BA.debugLineNum = 27;BA.debugLine="Log(LastException&\" نتونستیم راهش بندازیم\")";
Debug.ShouldStop(67108864);
starter.mostCurrent.__c.runVoidMethod ("LogImpl","44259850",RemoteObject.concat(starter.mostCurrent.__c.runMethod(false,"LastException",starter.processBA),RemoteObject.createImmutable(" نتونستیم راهش بندازیم")),0);
 };
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("Service_Destroy (starter) ","starter",4,starter.processBA,starter.mostCurrent,55);
if (RapidSub.canDelegate("service_destroy")) { return ir.saelozahra.damaara.mazraeyeman.starter.remoteMe.runUserSub(false, "starter","service_destroy");}
 BA.debugLineNum = 55;BA.debugLine="Sub Service_Destroy";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 56;BA.debugLine="StopGps";
Debug.ShouldStop(8388608);
_stopgps();
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
public static RemoteObject  _service_start(RemoteObject _startingintent) throws Exception{
try {
		Debug.PushSubsStack("Service_Start (starter) ","starter",4,starter.processBA,starter.mostCurrent,40);
if (RapidSub.canDelegate("service_start")) { return ir.saelozahra.damaara.mazraeyeman.starter.remoteMe.runUserSub(false, "starter","service_start", _startingintent);}
Debug.locals.put("StartingIntent", _startingintent);
 BA.debugLineNum = 40;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
Debug.ShouldStop(128);
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_taskremoved() throws Exception{
try {
		Debug.PushSubsStack("Service_TaskRemoved (starter) ","starter",4,starter.processBA,starter.mostCurrent,45);
if (RapidSub.canDelegate("service_taskremoved")) { return ir.saelozahra.damaara.mazraeyeman.starter.remoteMe.runUserSub(false, "starter","service_taskremoved");}
 BA.debugLineNum = 45;BA.debugLine="Sub Service_TaskRemoved";
Debug.ShouldStop(4096);
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _startgps() throws Exception{
try {
		Debug.PushSubsStack("StartGps (starter) ","starter",4,starter.processBA,starter.mostCurrent,76);
if (RapidSub.canDelegate("startgps")) { return ir.saelozahra.damaara.mazraeyeman.starter.remoteMe.runUserSub(false, "starter","startgps");}
 BA.debugLineNum = 76;BA.debugLine="Public Sub StartGps";
Debug.ShouldStop(2048);
 BA.debugLineNum = 77;BA.debugLine="If gpsStarted = False Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",starter._gpsstarted,starter.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 78;BA.debugLine="GPS1.Start(0, 0)";
Debug.ShouldStop(8192);
starter._gps1.runVoidMethodAndSync ("Start",starter.processBA,(Object)(BA.numberCast(long.class, 0)),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 79;BA.debugLine="gpsStarted = True";
Debug.ShouldStop(16384);
starter._gpsstarted = starter.mostCurrent.__c.getField(true,"True");
 };
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
public static RemoteObject  _stopgps() throws Exception{
try {
		Debug.PushSubsStack("StopGps (starter) ","starter",4,starter.processBA,starter.mostCurrent,83);
if (RapidSub.canDelegate("stopgps")) { return ir.saelozahra.damaara.mazraeyeman.starter.remoteMe.runUserSub(false, "starter","stopgps");}
 BA.debugLineNum = 83;BA.debugLine="Public Sub StopGps";
Debug.ShouldStop(262144);
 BA.debugLineNum = 84;BA.debugLine="If gpsStarted Then";
Debug.ShouldStop(524288);
if (starter._gpsstarted.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 85;BA.debugLine="GPS1.Stop";
Debug.ShouldStop(1048576);
starter._gps1.runVoidMethod ("Stop");
 BA.debugLineNum = 86;BA.debugLine="gpsStarted = False";
Debug.ShouldStop(2097152);
starter._gpsstarted = starter.mostCurrent.__c.getField(true,"False");
 };
 BA.debugLineNum = 88;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}