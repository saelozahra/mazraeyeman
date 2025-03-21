package ir.saelozahra.damaara.mazraeyeman;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class firebasemessaging_subs_0 {


public static RemoteObject  _fm_messagearrived(RemoteObject _message) throws Exception{
try {
		Debug.PushSubsStack("fm_MessageArrived (firebasemessaging) ","firebasemessaging",16,firebasemessaging.processBA,firebasemessaging.mostCurrent,71);
if (RapidSub.canDelegate("fm_messagearrived")) { return ir.saelozahra.damaara.mazraeyeman.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","fm_messagearrived", _message);}
RemoteObject _javaobjectinstance = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("Message", _message);
 BA.debugLineNum = 71;BA.debugLine="Sub fm_MessageArrived (Message As RemoteMessage)";
Debug.ShouldStop(64);
 BA.debugLineNum = 73;BA.debugLine="Log(\"Message arrived\")";
Debug.ShouldStop(256);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","418153474",RemoteObject.createImmutable("Message arrived"),0);
 BA.debugLineNum = 74;BA.debugLine="Log(\"Message data: \"&Message.GetData)";
Debug.ShouldStop(512);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","418153475",RemoteObject.concat(RemoteObject.createImmutable("Message data: "),_message.runMethod(false,"GetData")),0);
 BA.debugLineNum = 76;BA.debugLine="If Message.GetData.ContainsKey(\"type\") Then";
Debug.ShouldStop(2048);
if (_message.runMethod(false,"GetData").runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("type")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 77;BA.debugLine="msg_type = Message.GetData.Get(\"type\")";
Debug.ShouldStop(4096);
firebasemessaging._msg_type = BA.ObjectToString(_message.runMethod(false,"GetData").runMethod(false,"Get",(Object)((RemoteObject.createImmutable("type")))));
 BA.debugLineNum = 78;BA.debugLine="msg_val = Message.GetData.Get(\"body\")";
Debug.ShouldStop(8192);
firebasemessaging._msg_val = BA.ObjectToString(_message.runMethod(false,"GetData").runMethod(false,"Get",(Object)((RemoteObject.createImmutable("body")))));
 }else {
 BA.debugLineNum = 80;BA.debugLine="msg_type = \"text\"";
Debug.ShouldStop(32768);
firebasemessaging._msg_type = BA.ObjectToString("text");
 BA.debugLineNum = 81;BA.debugLine="msg_val = \"\"";
Debug.ShouldStop(65536);
firebasemessaging._msg_val = BA.ObjectToString("");
 };
 BA.debugLineNum = 84;BA.debugLine="If Message.GetData.Get(\"title\") == Null Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("n",_message.runMethod(false,"GetData").runMethod(false,"Get",(Object)((RemoteObject.createImmutable("title")))))) { 
 BA.debugLineNum = 85;BA.debugLine="msg_title=Application.LabelName";
Debug.ShouldStop(1048576);
firebasemessaging._msg_title = firebasemessaging.mostCurrent.__c.getField(false,"Application").runMethod(true,"getLabelName");
 }else {
 BA.debugLineNum = 87;BA.debugLine="msg_title=Message.GetData.Get(\"title\")";
Debug.ShouldStop(4194304);
firebasemessaging._msg_title = BA.ObjectToString(_message.runMethod(false,"GetData").runMethod(false,"Get",(Object)((RemoteObject.createImmutable("title")))));
 };
 BA.debugLineNum = 91;BA.debugLine="If Message.GetData.Get(\"body\") == Null Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("n",_message.runMethod(false,"GetData").runMethod(false,"Get",(Object)((RemoteObject.createImmutable("body")))))) { 
 BA.debugLineNum = 92;BA.debugLine="msg_body=Application.LabelName";
Debug.ShouldStop(134217728);
firebasemessaging._msg_body = firebasemessaging.mostCurrent.__c.getField(false,"Application").runMethod(true,"getLabelName");
 }else {
 BA.debugLineNum = 94;BA.debugLine="msg_body=Message.GetData.Get(\"body\")";
Debug.ShouldStop(536870912);
firebasemessaging._msg_body = BA.ObjectToString(_message.runMethod(false,"GetData").runMethod(false,"Get",(Object)((RemoteObject.createImmutable("body")))));
 };
 BA.debugLineNum = 97;BA.debugLine="If Message.GetData.Get(\"title\")==Null And Message";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("n",_message.runMethod(false,"GetData").runMethod(false,"Get",(Object)((RemoteObject.createImmutable("title"))))) && RemoteObject.solveBoolean("n",_message.runMethod(false,"GetData").runMethod(false,"Get",(Object)((RemoteObject.createImmutable("body")))))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 99;BA.debugLine="If msg_type == \"expire\" And msg_body==\"yes\" Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",firebasemessaging._msg_type,BA.ObjectToString("expire")) && RemoteObject.solveBoolean("=",firebasemessaging._msg_body,BA.ObjectToString("yes"))) { 
 BA.debugLineNum = 100;BA.debugLine="File.WriteString(SaeloZahra.dir,\"expire\",True)";
Debug.ShouldStop(8);
firebasemessaging.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(firebasemessaging.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(BA.ObjectToString("expire")),(Object)(BA.ObjectToString(firebasemessaging.mostCurrent.__c.getField(true,"True"))));
 }else 
{ BA.debugLineNum = 101;BA.debugLine="Else If msg_type == \"expire\" And msg_body==\"no\" T";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",firebasemessaging._msg_type,BA.ObjectToString("expire")) && RemoteObject.solveBoolean("=",firebasemessaging._msg_body,BA.ObjectToString("no"))) { 
 BA.debugLineNum = 102;BA.debugLine="File.Delete(SaeloZahra.dir,\"expire\")";
Debug.ShouldStop(32);
firebasemessaging.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(firebasemessaging.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("expire")));
 }}
;
 BA.debugLineNum = 106;BA.debugLine="nb.Initialize";
Debug.ShouldStop(512);
firebasemessaging._nb.runVoidMethod ("Initialize",firebasemessaging.processBA);
 BA.debugLineNum = 107;BA.debugLine="nb.AutoCancel = True";
Debug.ShouldStop(1024);
firebasemessaging._nb.runVoidMethod ("setAutoCancel",firebasemessaging.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 108;BA.debugLine="nb.DefaultLight = True";
Debug.ShouldStop(2048);
firebasemessaging._nb.runVoidMethod ("setDefaultLight",firebasemessaging.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 109;BA.debugLine="nb.DefaultSound = True";
Debug.ShouldStop(4096);
firebasemessaging._nb.runVoidMethod ("setDefaultSound",firebasemessaging.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 110;BA.debugLine="nb.DefaultVibrate = True";
Debug.ShouldStop(8192);
firebasemessaging._nb.runVoidMethod ("setDefaultVibrate",firebasemessaging.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 111;BA.debugLine="nb.SmallIcon = \"teraktor\"'teraktor";
Debug.ShouldStop(16384);
firebasemessaging._nb.runVoidMethod ("setSmallIcon",BA.ObjectToString("teraktor"));
 BA.debugLineNum = 113;BA.debugLine="nb.CustomVibrate = Array As Long(0,100,200,300)";
Debug.ShouldStop(65536);
firebasemessaging._nb.runVoidMethod ("setCustomVibrate",RemoteObject.createNewArray("long",new int[] {4},new Object[] {BA.numberCast(long.class, 0),BA.numberCast(long.class, 100),BA.numberCast(long.class, 200),BA.numberCast(long.class, 300)}));
 BA.debugLineNum = 114;BA.debugLine="nb.LocalOnly = True";
Debug.ShouldStop(131072);
firebasemessaging._nb.runVoidMethod ("setLocalOnly",firebasemessaging.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 117;BA.debugLine="Dim javaobjectInstance As JavaObject";
Debug.ShouldStop(1048576);
_javaobjectinstance = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("javaobjectInstance", _javaobjectinstance);
 BA.debugLineNum = 118;BA.debugLine="javaobjectInstance = nb";
Debug.ShouldStop(2097152);
_javaobjectinstance = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), firebasemessaging._nb.getObject());Debug.locals.put("javaobjectInstance", _javaobjectinstance);
 BA.debugLineNum = 119;BA.debugLine="javaobjectInstance.RunMethod (\"setColor\", Array A";
Debug.ShouldStop(4194304);
_javaobjectinstance.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setColor")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(firebasemessaging.mostCurrent._saelozahra._color /*RemoteObject*/ )})));
 BA.debugLineNum = 126;BA.debugLine="nb.OnlyAlertOnce = True";
Debug.ShouldStop(536870912);
firebasemessaging._nb.runVoidMethod ("setOnlyAlertOnce",firebasemessaging.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 127;BA.debugLine="nb.setActivity(NotificationAct)";
Debug.ShouldStop(1073741824);
firebasemessaging._nb.runVoidMethod ("setActivity",firebasemessaging.processBA,(Object)((firebasemessaging.mostCurrent._notificationact.getObject())));
 BA.debugLineNum = 128;BA.debugLine="nb.Tag = \"opened\"";
Debug.ShouldStop(-2147483648);
firebasemessaging._nb.runVoidMethod ("setTag",BA.ObjectToString("opened"));
 BA.debugLineNum = 130;BA.debugLine="nb.ContentText = msg_body";
Debug.ShouldStop(2);
firebasemessaging._nb.runVoidMethod ("setContentText",firebasemessaging._msg_body);
 BA.debugLineNum = 131;BA.debugLine="nb.ContentTitle = msg_title";
Debug.ShouldStop(4);
firebasemessaging._nb.runVoidMethod ("setContentTitle",firebasemessaging._msg_title);
 BA.debugLineNum = 134;BA.debugLine="nb.OnGoingEvent=False";
Debug.ShouldStop(32);
firebasemessaging._nb.runVoidMethod ("setOnGoingEvent",firebasemessaging.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 135;BA.debugLine="nb.Notify(313)";
Debug.ShouldStop(64);
firebasemessaging._nb.runVoidMethod ("Notify",firebasemessaging.processBA,(Object)(BA.numberCast(int.class, 313)));
 BA.debugLineNum = 138;BA.debugLine="Log(msg_title&\"  :  \"&msg_type&\"  :  \"&msg_val)";
Debug.ShouldStop(512);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","418153539",RemoteObject.concat(firebasemessaging._msg_title,RemoteObject.createImmutable("  :  "),firebasemessaging._msg_type,RemoteObject.createImmutable("  :  "),firebasemessaging._msg_val),0);
 BA.debugLineNum = 142;BA.debugLine="Try";
Debug.ShouldStop(8192);
try { BA.debugLineNum = 143;BA.debugLine="sql1.ExecNonQuery($\"insert into notification (ti";
Debug.ShouldStop(16384);
firebasemessaging._sql1.runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("insert into notification (title,type,value,time) VALUES ('"),firebasemessaging.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((firebasemessaging._msg_title))),RemoteObject.createImmutable("','"),firebasemessaging.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((firebasemessaging._msg_type))),RemoteObject.createImmutable("','"),firebasemessaging.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((firebasemessaging._msg_val))),RemoteObject.createImmutable("','"),firebasemessaging.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((firebasemessaging.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")))),RemoteObject.createImmutable("')")))));
 BA.debugLineNum = 144;BA.debugLine="Log(\"Inserted\")";
Debug.ShouldStop(32768);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","418153545",RemoteObject.createImmutable("Inserted"),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e49) {
			BA.rdebugUtils.runVoidMethod("setLastException",firebasemessaging.processBA, e49.toString()); BA.debugLineNum = 146;BA.debugLine="Log($\" ${LastException.Message} error to insert";
Debug.ShouldStop(131072);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","418153547",(RemoteObject.concat(RemoteObject.createImmutable(" "),firebasemessaging.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((firebasemessaging.mostCurrent.__c.runMethod(false,"LastException",firebasemessaging.processBA).runMethod(true,"getMessage")))),RemoteObject.createImmutable(" error to insert this id to nitification = "),firebasemessaging.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((firebasemessaging._msg_title))),RemoteObject.createImmutable(""))),0);
 };
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
public static RemoteObject  _fm_tokenrefresh(RemoteObject _token) throws Exception{
try {
		Debug.PushSubsStack("fm_TokenRefresh (firebasemessaging) ","firebasemessaging",16,firebasemessaging.processBA,firebasemessaging.mostCurrent,67);
if (RapidSub.canDelegate("fm_tokenrefresh")) { return ir.saelozahra.damaara.mazraeyeman.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","fm_tokenrefresh", _token);}
Debug.locals.put("Token", _token);
 BA.debugLineNum = 67;BA.debugLine="Sub fm_TokenRefresh (Token As String)";
Debug.ShouldStop(4);
 BA.debugLineNum = 68;BA.debugLine="Log(\"Token: \"&Token)";
Debug.ShouldStop(8);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","418087937",RemoteObject.concat(RemoteObject.createImmutable("Token: "),_token),0);
 BA.debugLineNum = 69;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 8;BA.debugLine="Private fm As FirebaseMessaging";
firebasemessaging._fm = RemoteObject.createNew ("anywheresoftware.b4a.objects.FirebaseNotificationsService.FirebaseMessageWrapper");
 //BA.debugLineNum = 9;BA.debugLine="Dim msg_type,msg_val,msg_title,msg_body As String";
firebasemessaging._msg_type = RemoteObject.createImmutable("");
firebasemessaging._msg_val = RemoteObject.createImmutable("");
firebasemessaging._msg_title = RemoteObject.createImmutable("");
firebasemessaging._msg_body = RemoteObject.createImmutable("");
 //BA.debugLineNum = 11;BA.debugLine="Dim sql1 As SQL";
firebasemessaging._sql1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");
 //BA.debugLineNum = 12;BA.debugLine="Dim R As Reflector";
firebasemessaging._r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");
 //BA.debugLineNum = 13;BA.debugLine="Dim nb As NotificationBuilder";
firebasemessaging._nb = RemoteObject.createNew ("barxdroid.NotificationBuilder.NotificationBuilder");
 //BA.debugLineNum = 14;BA.debugLine="Dim MyToken As String";
firebasemessaging._mytoken = RemoteObject.createImmutable("");
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _service_create() throws Exception{
try {
		Debug.PushSubsStack("Service_Create (firebasemessaging) ","firebasemessaging",16,firebasemessaging.processBA,firebasemessaging.mostCurrent,17);
if (RapidSub.canDelegate("service_create")) { return ir.saelozahra.damaara.mazraeyeman.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","service_create");}
 BA.debugLineNum = 17;BA.debugLine="Sub Service_Create";
Debug.ShouldStop(65536);
 BA.debugLineNum = 19;BA.debugLine="fm.Initialize(\"fm\")";
Debug.ShouldStop(262144);
firebasemessaging._fm.runVoidMethod ("Initialize",firebasemessaging.processBA,(Object)(RemoteObject.createImmutable("fm")));
 BA.debugLineNum = 20;BA.debugLine="MyToken = fm.Token";
Debug.ShouldStop(524288);
firebasemessaging._mytoken = firebasemessaging._fm.runMethod(true,"getToken");
 BA.debugLineNum = 23;BA.debugLine="If Not(sql1.IsInitialized) Then";
Debug.ShouldStop(4194304);
if (firebasemessaging.mostCurrent.__c.runMethod(true,"Not",(Object)(firebasemessaging._sql1.runMethod(true,"IsInitialized"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 24;BA.debugLine="If Not(File.Exists(SaeloZahra.dir,\"db.db\")) Then";
Debug.ShouldStop(8388608);
if (firebasemessaging.mostCurrent.__c.runMethod(true,"Not",(Object)(firebasemessaging.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(firebasemessaging.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("db.db"))))).<Boolean>get().booleanValue()) { 
firebasemessaging.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(firebasemessaging.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("db.db")),(Object)(firebasemessaging.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("db.db")));};
 BA.debugLineNum = 25;BA.debugLine="sql1.Initialize(SaeloZahra.dir,\"db.db\",False)";
Debug.ShouldStop(16777216);
firebasemessaging._sql1.runVoidMethod ("Initialize",(Object)(firebasemessaging.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(BA.ObjectToString("db.db")),(Object)(firebasemessaging.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("Service_Destroy (firebasemessaging) ","firebasemessaging",16,firebasemessaging.processBA,firebasemessaging.mostCurrent,153);
if (RapidSub.canDelegate("service_destroy")) { return ir.saelozahra.damaara.mazraeyeman.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","service_destroy");}
 BA.debugLineNum = 153;BA.debugLine="Sub Service_Destroy";
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
public static RemoteObject  _service_start(RemoteObject _startingintent) throws Exception{
try {
		Debug.PushSubsStack("Service_Start (firebasemessaging) ","firebasemessaging",16,firebasemessaging.processBA,firebasemessaging.mostCurrent,56);
if (RapidSub.canDelegate("service_start")) { return ir.saelozahra.damaara.mazraeyeman.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","service_start", _startingintent);}
Debug.locals.put("StartingIntent", _startingintent);
 BA.debugLineNum = 56;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 59;BA.debugLine="If fm.IsInitialized == False Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",firebasemessaging._fm.runMethod(true,"IsInitialized"),firebasemessaging.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 60;BA.debugLine="fm.Initialize(\"fm\")";
Debug.ShouldStop(134217728);
firebasemessaging._fm.runVoidMethod ("Initialize",firebasemessaging.processBA,(Object)(RemoteObject.createImmutable("fm")));
 };
 BA.debugLineNum = 63;BA.debugLine="If StartingIntent.IsInitialized And fm.HandleInte";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean(".",_startingintent.runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean(".",firebasemessaging._fm.runMethod(true,"HandleIntent",(Object)((_startingintent.getObject()))))) { 
if (true) return RemoteObject.createImmutable("");};
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
public static RemoteObject  _subscribetotopics(RemoteObject _topicname) throws Exception{
try {
		Debug.PushSubsStack("SubscribeToTopics (firebasemessaging) ","firebasemessaging",16,firebasemessaging.processBA,firebasemessaging.mostCurrent,32);
if (RapidSub.canDelegate("subscribetotopics")) { return ir.saelozahra.damaara.mazraeyeman.firebasemessaging.remoteMe.runUserSub(false, "firebasemessaging","subscribetotopics", _topicname);}
Debug.locals.put("TopicName", _topicname);
 BA.debugLineNum = 32;BA.debugLine="Public Sub SubscribeToTopics( TopicName As String";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 34;BA.debugLine="If Not(fm.IsInitialized) Then fm.Initialize(\"fm\")";
Debug.ShouldStop(2);
if (firebasemessaging.mostCurrent.__c.runMethod(true,"Not",(Object)(firebasemessaging._fm.runMethod(true,"IsInitialized"))).<Boolean>get().booleanValue()) { 
firebasemessaging._fm.runVoidMethod ("Initialize",firebasemessaging.processBA,(Object)(RemoteObject.createImmutable("fm")));};
 BA.debugLineNum = 36;BA.debugLine="TopicName=TopicName.Replace(\" \",\"_\")";
Debug.ShouldStop(8);
_topicname = _topicname.runMethod(true,"replace",(Object)(BA.ObjectToString(" ")),(Object)(RemoteObject.createImmutable("_")));Debug.locals.put("TopicName", _topicname);
 BA.debugLineNum = 37;BA.debugLine="TopicName=TopicName.Replace(\":\",\"_\")";
Debug.ShouldStop(16);
_topicname = _topicname.runMethod(true,"replace",(Object)(BA.ObjectToString(":")),(Object)(RemoteObject.createImmutable("_")));Debug.locals.put("TopicName", _topicname);
 BA.debugLineNum = 38;BA.debugLine="TopicName=TopicName.Replace(\"\\n\",\"\")";
Debug.ShouldStop(32);
_topicname = _topicname.runMethod(true,"replace",(Object)(BA.ObjectToString("\\n")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("TopicName", _topicname);
 BA.debugLineNum = 40;BA.debugLine="Try";
Debug.ShouldStop(128);
try { BA.debugLineNum = 41;BA.debugLine="R.Target = fm";
Debug.ShouldStop(256);
firebasemessaging._r.setField ("Target",(firebasemessaging._fm.getObject()));
 BA.debugLineNum = 42;BA.debugLine="R.RunMethod2(\"subscribeToTopic\",TopicName,\"java.";
Debug.ShouldStop(512);
firebasemessaging._r.runVoidMethod ("RunMethod2",(Object)(BA.ObjectToString("subscribeToTopic")),(Object)(_topicname),(Object)(RemoteObject.createImmutable("java.lang.String")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e9) {
			BA.rdebugUtils.runVoidMethod("setLastException",firebasemessaging.processBA, e9.toString()); BA.debugLineNum = 45;BA.debugLine="Log(\"error1: \"&LastException.Message)";
Debug.ShouldStop(4096);
firebasemessaging.mostCurrent.__c.runVoidMethod ("LogImpl","417956877",RemoteObject.concat(RemoteObject.createImmutable("error1: "),firebasemessaging.mostCurrent.__c.runMethod(false,"LastException",firebasemessaging.processBA).runMethod(true,"getMessage")),0);
 };
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}