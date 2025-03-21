package ir.saelozahra.damaara.mazraeyeman;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class mahsoullistact_subs_0 {


public static RemoteObject  _actionbar_navigationitemclick() throws Exception{
try {
		Debug.PushSubsStack("Actionbar_NavigationItemClick (mahsoullistact) ","mahsoullistact",18,mahsoullistact.mostCurrent.activityBA,mahsoullistact.mostCurrent,274);
if (RapidSub.canDelegate("actionbar_navigationitemclick")) { return ir.saelozahra.damaara.mazraeyeman.mahsoullistact.remoteMe.runUserSub(false, "mahsoullistact","actionbar_navigationitemclick");}
 BA.debugLineNum = 274;BA.debugLine="Sub Actionbar_NavigationItemClick";
Debug.ShouldStop(131072);
 BA.debugLineNum = 275;BA.debugLine="Activity.Finish";
Debug.ShouldStop(262144);
mahsoullistact.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 276;BA.debugLine="SaeloZahra.SetAnimation(\"zoom_enter\",\"zoom_exit\")";
Debug.ShouldStop(524288);
mahsoullistact.mostCurrent._saelozahra.runVoidMethod ("_setanimation" /*RemoteObject*/ ,mahsoullistact.mostCurrent.activityBA,(Object)(BA.ObjectToString("zoom_enter")),(Object)(RemoteObject.createImmutable("zoom_exit")));
 BA.debugLineNum = 277;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (mahsoullistact) ","mahsoullistact",18,mahsoullistact.mostCurrent.activityBA,mahsoullistact.mostCurrent,31);
if (RapidSub.canDelegate("activity_create")) { return ir.saelozahra.damaara.mazraeyeman.mahsoullistact.remoteMe.runUserSub(false, "mahsoullistact","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 31;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 33;BA.debugLine="Activity.LoadLayout(\"SVNewLayout\")";
Debug.ShouldStop(1);
mahsoullistact.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("SVNewLayout")),mahsoullistact.mostCurrent.activityBA);
 BA.debugLineNum = 34;BA.debugLine="ScrollView1.Visible=False";
Debug.ShouldStop(2);
mahsoullistact.mostCurrent._scrollview1.runMethod(true,"setVisible",mahsoullistact.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 36;BA.debugLine="SaeloZahra.SetStatusBarColor(SaeloZahra.ColorDark";
Debug.ShouldStop(8);
mahsoullistact.mostCurrent._saelozahra.runVoidMethod ("_setstatusbarcolor" /*RemoteObject*/ ,mahsoullistact.mostCurrent.activityBA,(Object)(mahsoullistact.mostCurrent._saelozahra._colordark /*RemoteObject*/ ));
 BA.debugLineNum = 37;BA.debugLine="ActionBar.Title=SaeloZahra.CSB(\"محصولات\")";
Debug.ShouldStop(16);
mahsoullistact.mostCurrent._actionbar.runMethod(true,"setTitle",BA.ObjectToCharSequence(mahsoullistact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,mahsoullistact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("محصولات"))).getObject()));
 BA.debugLineNum = 38;BA.debugLine="ActionBar.TitleTextColor=Colors.White";
Debug.ShouldStop(32);
mahsoullistact.mostCurrent._actionbar.runVoidMethod ("setTitleTextColor",mahsoullistact.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 39;BA.debugLine="ActionBar.NavigationIconDrawable = X1.GetDrawable";
Debug.ShouldStop(64);
mahsoullistact.mostCurrent._actionbar.runMethod(false,"setNavigationIconDrawable",mahsoullistact.mostCurrent._x1.runMethod(false,"GetDrawable",(Object)(RemoteObject.createImmutable("baseline_arrow_back_white_24"))));
 BA.debugLineNum = 40;BA.debugLine="ActionBar.Color=SaeloZahra.Color";
Debug.ShouldStop(128);
mahsoullistact.mostCurrent._actionbar.runVoidMethod ("setColor",mahsoullistact.mostCurrent._saelozahra._color /*RemoteObject*/ );
 BA.debugLineNum = 41;BA.debugLine="ActionBar.SetLayout(0,0,100%x,SaeloZahra.Material";
Debug.ShouldStop(256);
mahsoullistact.mostCurrent._actionbar.runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(mahsoullistact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),mahsoullistact.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {mahsoullistact.mostCurrent._saelozahra._materialactionbarheight /*RemoteObject*/ ,mahsoullistact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "+",1, 1)));
 BA.debugLineNum = 44;BA.debugLine="mapProductName.Initialize";
Debug.ShouldStop(2048);
mahsoullistact.mostCurrent._mapproductname.runVoidMethod ("Initialize");
 BA.debugLineNum = 45;BA.debugLine="If File.Exists(SaeloZahra.dir,\"ProductName\") Then";
Debug.ShouldStop(4096);
if (mahsoullistact.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(mahsoullistact.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("ProductName"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 46;BA.debugLine="mapProductName=File.ReadMap(SaeloZahra.dir,\"Prod";
Debug.ShouldStop(8192);
mahsoullistact.mostCurrent._mapproductname = mahsoullistact.mostCurrent.__c.getField(false,"File").runMethod(false,"ReadMap",(Object)(mahsoullistact.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("ProductName")));
 };
 BA.debugLineNum = 49;BA.debugLine="ClvBazarche.Initialize(Me, \"ClvBazarche\")";
Debug.ShouldStop(65536);
mahsoullistact.mostCurrent._clvbazarche.runClassMethod (ir.saelozahra.damaara.mazraeyeman.customlistview.class, "_initialize" /*RemoteObject*/ ,mahsoullistact.mostCurrent.activityBA,(Object)(mahsoullistact.getObject()),(Object)(RemoteObject.createImmutable("ClvBazarche")));
 BA.debugLineNum = 50;BA.debugLine="Activity.AddView(ClvBazarche.AsView,0,ActionBar.H";
Debug.ShouldStop(131072);
mahsoullistact.mostCurrent._activity.runVoidMethod ("AddView",(Object)((mahsoullistact.mostCurrent._clvbazarche.runClassMethod (ir.saelozahra.damaara.mazraeyeman.customlistview.class, "_asview" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(mahsoullistact.mostCurrent._actionbar.runMethod(true,"getHeight")),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(BA.numberCast(int.class, -(double) (0 + 1))));
 BA.debugLineNum = 52;BA.debugLine="jobBazarche.Initialize(\"jobBazarche\",Me)";
Debug.ShouldStop(524288);
mahsoullistact.mostCurrent._jobbazarche.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_initialize" /*RemoteObject*/ ,mahsoullistact.processBA,(Object)(BA.ObjectToString("jobBazarche")),(Object)(mahsoullistact.getObject()));
 BA.debugLineNum = 53;BA.debugLine="If ListType==\"my\" Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",mahsoullistact._listtype,BA.ObjectToString("my"))) { 
 BA.debugLineNum = 54;BA.debugLine="jobBazarche.Download(SaeloZahra.json_url&\"produc";
Debug.ShouldStop(2097152);
mahsoullistact.mostCurrent._jobbazarche.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.concat(mahsoullistact.mostCurrent._saelozahra._json_url /*RemoteObject*/ ,RemoteObject.createImmutable("productfarmers_list.php?userid="),mahsoullistact.mostCurrent._starter._usrnm /*RemoteObject*/ )));
 BA.debugLineNum = 55;BA.debugLine="Log(SaeloZahra.json_url&\"productfarmers_list.php";
Debug.ShouldStop(4194304);
mahsoullistact.mostCurrent.__c.runVoidMethod ("LogImpl","418874392",RemoteObject.concat(mahsoullistact.mostCurrent._saelozahra._json_url /*RemoteObject*/ ,RemoteObject.createImmutable("productfarmers_list.php?userid="),mahsoullistact.mostCurrent._starter._usrnm /*RemoteObject*/ ),0);
 BA.debugLineNum = 56;BA.debugLine="ActionBar.Title=SaeloZahra.CSB(\"محصولات من\")";
Debug.ShouldStop(8388608);
mahsoullistact.mostCurrent._actionbar.runMethod(true,"setTitle",BA.ObjectToCharSequence(mahsoullistact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,mahsoullistact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("محصولات من"))).getObject()));
 };
 BA.debugLineNum = 59;BA.debugLine="ProgressDialogShow(SaeloZahra.CSB(\"در حال بارگزار";
Debug.ShouldStop(67108864);
mahsoullistact.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",mahsoullistact.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(mahsoullistact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,mahsoullistact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("در حال بارگزاری..."))).getObject())));
 BA.debugLineNum = 62;BA.debugLine="If SaeloZahra.P.SdkVersion>23 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean(">",mahsoullistact.mostCurrent._saelozahra._p /*RemoteObject*/ .runMethod(true,"getSdkVersion"),BA.numberCast(double.class, 23))) { 
 BA.debugLineNum = 63;BA.debugLine="Config.Initialize";
Debug.ShouldStop(1073741824);
mahsoullistact.mostCurrent._config.runVoidMethod ("Initialize",mahsoullistact.processBA);
 BA.debugLineNum = 64;BA.debugLine="Config.position(Config.POSITION_LEFT)";
Debug.ShouldStop(-2147483648);
mahsoullistact.mostCurrent._config.runVoidMethod ("position",(Object)(mahsoullistact.mostCurrent._config.getField(true,"POSITION_LEFT")));
 BA.debugLineNum = 65;BA.debugLine="Config.primaryColor(SaeloZahra.ColorDark)";
Debug.ShouldStop(1);
mahsoullistact.mostCurrent._config.runVoidMethod ("primaryColor",(Object)(mahsoullistact.mostCurrent._saelozahra._colordark /*RemoteObject*/ ));
 BA.debugLineNum = 66;BA.debugLine="Config.edge(True)";
Debug.ShouldStop(2);
mahsoullistact.mostCurrent._config.runVoidMethod ("edge",(Object)(mahsoullistact.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 67;BA.debugLine="Config.sensitivity(100)";
Debug.ShouldStop(4);
mahsoullistact.mostCurrent._config.runVoidMethod ("sensitivity",(Object)(BA.numberCast(float.class, 100)));
 BA.debugLineNum = 68;BA.debugLine="Config.scrimColor(Colors.ARGB(180,0,0,0))";
Debug.ShouldStop(8);
mahsoullistact.mostCurrent._config.runVoidMethod ("scrimColor",(Object)(mahsoullistact.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 180)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))));
 BA.debugLineNum = 70;BA.debugLine="Show.convertActivityToTranslucent";
Debug.ShouldStop(32);
mahsoullistact.mostCurrent._show.runVoidMethod ("convertActivityToTranslucent",mahsoullistact.mostCurrent.activityBA);
 BA.debugLineNum = 71;BA.debugLine="Show.attachActivity(Config)";
Debug.ShouldStop(64);
mahsoullistact.mostCurrent._show.runVoidMethod ("attachActivity",mahsoullistact.mostCurrent.activityBA,(Object)(mahsoullistact.mostCurrent._config));
 };
 BA.debugLineNum = 74;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("Activity_KeyPress (mahsoullistact) ","mahsoullistact",18,mahsoullistact.mostCurrent.activityBA,mahsoullistact.mostCurrent,280);
if (RapidSub.canDelegate("activity_keypress")) { return ir.saelozahra.damaara.mazraeyeman.mahsoullistact.remoteMe.runUserSub(false, "mahsoullistact","activity_keypress", _keycode);}
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 280;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 281;BA.debugLine="If KeyCode==KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, mahsoullistact.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 282;BA.debugLine="Actionbar_NavigationItemClick";
Debug.ShouldStop(33554432);
_actionbar_navigationitemclick();
 BA.debugLineNum = 283;BA.debugLine="Return False";
Debug.ShouldStop(67108864);
if (true) return mahsoullistact.mostCurrent.__c.getField(true,"False");
 }else {
 BA.debugLineNum = 285;BA.debugLine="Return True";
Debug.ShouldStop(268435456);
if (true) return mahsoullistact.mostCurrent.__c.getField(true,"True");
 };
 BA.debugLineNum = 287;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("Activity_Pause (mahsoullistact) ","mahsoullistact",18,mahsoullistact.mostCurrent.activityBA,mahsoullistact.mostCurrent,80);
if (RapidSub.canDelegate("activity_pause")) { return ir.saelozahra.damaara.mazraeyeman.mahsoullistact.remoteMe.runUserSub(false, "mahsoullistact","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 80;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(32768);
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (mahsoullistact) ","mahsoullistact",18,mahsoullistact.mostCurrent.activityBA,mahsoullistact.mostCurrent,76);
if (RapidSub.canDelegate("activity_resume")) { return ir.saelozahra.damaara.mazraeyeman.mahsoullistact.remoteMe.runUserSub(false, "mahsoullistact","activity_resume");}
 BA.debugLineNum = 76;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(2048);
 BA.debugLineNum = 78;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _clv_itemclick(RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("CLV_ItemClick (mahsoullistact) ","mahsoullistact",18,mahsoullistact.mostCurrent.activityBA,mahsoullistact.mostCurrent,155);
if (RapidSub.canDelegate("clv_itemclick")) { ir.saelozahra.damaara.mazraeyeman.mahsoullistact.remoteMe.runUserSub(false, "mahsoullistact","clv_itemclick", _index, _value); return;}
ResumableSub_CLV_ItemClick rsub = new ResumableSub_CLV_ItemClick(null,_index,_value);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CLV_ItemClick extends BA.ResumableSub {
public ResumableSub_CLV_ItemClick(ir.saelozahra.damaara.mazraeyeman.mahsoullistact parent,RemoteObject _index,RemoteObject _value) {
this.parent = parent;
this._index = _index;
this._value = _value;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.saelozahra.damaara.mazraeyeman.mahsoullistact parent;
RemoteObject _index;
RemoteObject _value;
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CLV_ItemClick (mahsoullistact) ","mahsoullistact",18,mahsoullistact.mostCurrent.activityBA,mahsoullistact.mostCurrent,155);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 157;BA.debugLine="SH.convertActivityFromTranslucent";
Debug.ShouldStop(268435456);
parent.mostCurrent._sh.runVoidMethod ("convertActivityFromTranslucent",mahsoullistact.mostCurrent.activityBA);
 BA.debugLineNum = 159;BA.debugLine="If Value==\"\" Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 1:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",_value,RemoteObject.createImmutable(("")))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 12;
 BA.debugLineNum = 160;BA.debugLine="StartActivity(SabteMahsoolAct)";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",mahsoullistact.processBA,(Object)((parent.mostCurrent._sabtemahsoolact.getObject())));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 162;BA.debugLine="Log(Value)";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","419136519",BA.ObjectToString(_value),0);
 BA.debugLineNum = 165;BA.debugLine="Msgbox2Async(\"قصد انجام چه عملیاتی دارید ؟\", \"عم";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("قصد انجام چه عملیاتی دارید ؟")),(Object)(BA.ObjectToCharSequence("عملیات")),(Object)(BA.ObjectToString("نمایش")),(Object)(BA.ObjectToString("لغو")),(Object)(BA.ObjectToString("ویرایش")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.mostCurrent.__c.getField(false,"Null")),mahsoullistact.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 166;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", mahsoullistact.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mahsoullistact", "clv_itemclick"), null);
this.state = 13;
return;
case 13:
//C
this.state = 6;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 167;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(64);
if (true) break;

case 6:
//if
this.state = 11;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 8;
}else 
{ BA.debugLineNum = 171;BA.debugLine="Else If Result = DialogResponse.NEGATIVE Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"NEGATIVE")))) { 
this.state = 10;
}}
if (true) break;

case 8:
//C
this.state = 11;
 BA.debugLineNum = 168;BA.debugLine="bazarcheMahsoolAct.pageVals=Value";
Debug.ShouldStop(128);
parent.mostCurrent._bazarchemahsoolact._pagevals /*RemoteObject*/  = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _value);
 BA.debugLineNum = 169;BA.debugLine="ProgressDialogShow(\"کمی صبر کنید...\")";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",mahsoullistact.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("کمی صبر کنید..."))));
 BA.debugLineNum = 170;BA.debugLine="StartActivity(bazarcheMahsoolAct)";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",mahsoullistact.processBA,(Object)((parent.mostCurrent._bazarchemahsoolact.getObject())));
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 172;BA.debugLine="SabteMahsoolAct.EditMahsoolMap=Value";
Debug.ShouldStop(2048);
parent.mostCurrent._sabtemahsoolact._editmahsoolmap /*RemoteObject*/  = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _value);
 BA.debugLineNum = 173;BA.debugLine="ProgressDialogShow(\"کمی صبر کنید...\")";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",mahsoullistact.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("کمی صبر کنید..."))));
 BA.debugLineNum = 174;BA.debugLine="StartActivity(SabteMahsoolAct)";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",mahsoullistact.processBA,(Object)((parent.mostCurrent._sabtemahsoolact.getObject())));
 if (true) break;

case 11:
//C
this.state = 12;
;
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 179;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
public static void  _msgbox_result(RemoteObject _result) throws Exception{
}
public static RemoteObject  _cover_lbl_click() throws Exception{
try {
		Debug.PushSubsStack("Cover_lbl_Click (mahsoullistact) ","mahsoullistact",18,mahsoullistact.mostCurrent.activityBA,mahsoullistact.mostCurrent,182);
if (RapidSub.canDelegate("cover_lbl_click")) { return ir.saelozahra.damaara.mazraeyeman.mahsoullistact.remoteMe.runUserSub(false, "mahsoullistact","cover_lbl_click");}
RemoteObject _index = RemoteObject.createImmutable(0);
 BA.debugLineNum = 182;BA.debugLine="Sub Cover_lbl_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 183;BA.debugLine="Dim index As Int";
Debug.ShouldStop(4194304);
_index = RemoteObject.createImmutable(0);Debug.locals.put("index", _index);
 BA.debugLineNum = 184;BA.debugLine="index = ClvBazarche.GetItemFromView(Sender)";
Debug.ShouldStop(8388608);
_index = mahsoullistact.mostCurrent._clvbazarche.runClassMethod (ir.saelozahra.damaara.mazraeyeman.customlistview.class, "_getitemfromview" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), mahsoullistact.mostCurrent.__c.runMethod(false,"Sender",mahsoullistact.mostCurrent.activityBA)));Debug.locals.put("index", _index);
 BA.debugLineNum = 185;BA.debugLine="CLV_ItemClick(index,ClvBazarche.GetValue(index))";
Debug.ShouldStop(16777216);
_clv_itemclick(_index,mahsoullistact.mostCurrent._clvbazarche.runClassMethod (ir.saelozahra.damaara.mazraeyeman.customlistview.class, "_getvalue" /*RemoteObject*/ ,(Object)(_index)));
 BA.debugLineNum = 186;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createlistitem(RemoteObject _id_cli,RemoteObject _title_cli,RemoteObject _line2_cli,RemoteObject _image_cli,RemoteObject _url_cli) throws Exception{
try {
		Debug.PushSubsStack("CreateListItem (mahsoullistact) ","mahsoullistact",18,mahsoullistact.mostCurrent.activityBA,mahsoullistact.mostCurrent,190);
if (RapidSub.canDelegate("createlistitem")) { return ir.saelozahra.damaara.mazraeyeman.mahsoullistact.remoteMe.runUserSub(false, "mahsoullistact","createlistitem", _id_cli, _title_cli, _line2_cli, _image_cli, _url_cli);}
RemoteObject _p_view = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _gdr = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.GradientDrawable");
RemoteObject _image_wv = RemoteObject.declareNull("anywheresoftware.b4a.objects.WebViewWrapper");
RemoteObject _lbl_caption = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _text_wv = RemoteObject.declareNull("anywheresoftware.b4a.objects.WebViewWrapper");
RemoteObject _cover_lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("id_cli", _id_cli);
Debug.locals.put("Title_cli", _title_cli);
Debug.locals.put("line2_cli", _line2_cli);
Debug.locals.put("image_cli", _image_cli);
Debug.locals.put("Url_cli", _url_cli);
 BA.debugLineNum = 190;BA.debugLine="Sub CreateListItem(id_cli As Int,Title_cli As Stri";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 193;BA.debugLine="Dim p_view As Panel";
Debug.ShouldStop(1);
_p_view = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p_view", _p_view);
 BA.debugLineNum = 194;BA.debugLine="p_view.Initialize(\"\")";
Debug.ShouldStop(2);
_p_view.runVoidMethod ("Initialize",mahsoullistact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 196;BA.debugLine="Dim gdr As GradientDrawable";
Debug.ShouldStop(8);
_gdr = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.GradientDrawable");Debug.locals.put("gdr", _gdr);
 BA.debugLineNum = 197;BA.debugLine="gdr.Initialize(\"TR_BL\", Array As Int(0x2ADBECDC,";
Debug.ShouldStop(16);
_gdr.runVoidMethod ("Initialize",(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.drawable.GradientDrawable.Orientation"),"TR_BL")),(Object)(RemoteObject.createNewArray("int",new int[] {2},new Object[] {BA.numberCast(int.class, ((int)0x2adbecdc)),mahsoullistact.mostCurrent.__c.getField(false,"Colors").getField(true,"White")})));
 BA.debugLineNum = 198;BA.debugLine="gdr.CornerRadius = 8dip";
Debug.ShouldStop(32);
_gdr.runVoidMethod ("setCornerRadius",BA.numberCast(float.class, mahsoullistact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8)))));
 BA.debugLineNum = 200;BA.debugLine="p_view.Background=gdr";
Debug.ShouldStop(128);
_p_view.runMethod(false,"setBackground",(_gdr.getObject()));
 BA.debugLineNum = 201;BA.debugLine="p_view.Elevation=8dip";
Debug.ShouldStop(256);
_p_view.runMethod(true,"setElevation",BA.numberCast(float.class, mahsoullistact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8)))));
 BA.debugLineNum = 203;BA.debugLine="p_view.Padding = Array As Int(5dip,2dip,5dip,2dip";
Debug.ShouldStop(1024);
_p_view.runMethod(false,"setPadding",RemoteObject.createNewArray("int",new int[] {4},new Object[] {mahsoullistact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))),mahsoullistact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2))),mahsoullistact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))),mahsoullistact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}));
 BA.debugLineNum = 216;BA.debugLine="Dim Image_WV As WebView";
Debug.ShouldStop(8388608);
_image_wv = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");Debug.locals.put("Image_WV", _image_wv);
 BA.debugLineNum = 217;BA.debugLine="Image_WV.Initialize(\"image_wv\")";
Debug.ShouldStop(16777216);
_image_wv.runVoidMethod ("Initialize",mahsoullistact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("image_wv")));
 BA.debugLineNum = 218;BA.debugLine="Image_WV.LoadHtml(\"<!doctype html><html><head><me";
Debug.ShouldStop(33554432);
_image_wv.runVoidMethod ("LoadHtml",(Object)(RemoteObject.concat(RemoteObject.createImmutable("<!doctype html><html><head><meta charset='utf-8'><meta name='viewport' content='width=device-width'></head><body><div style=' bottom: 5%; height: 90%; left: 5%; position: fixed; right: 5%; top: 5%; width: 90%; overflow:hidden;box-shadow: 0 0 6px #666;'><img src='"),_image_cli,RemoteObject.createImmutable("' style='min-width:100%;min-height:100%;max-width:133%;max-height:202%;position: absolute;'></div></body></html>"))));
 BA.debugLineNum = 219;BA.debugLine="Image_WV.ZoomEnabled = False";
Debug.ShouldStop(67108864);
_image_wv.runMethod(true,"setZoomEnabled",mahsoullistact.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 220;BA.debugLine="Image_WV.Color = Colors.Transparent";
Debug.ShouldStop(134217728);
_image_wv.runVoidMethod ("setColor",mahsoullistact.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 221;BA.debugLine="Image_WV.Tag = Title_cli & CRLF & line2_cli &CRLF";
Debug.ShouldStop(268435456);
_image_wv.runMethod(false,"setTag",(RemoteObject.concat(_title_cli,mahsoullistact.mostCurrent.__c.getField(true,"CRLF"),_line2_cli,mahsoullistact.mostCurrent.__c.getField(true,"CRLF"),mahsoullistact.mostCurrent._saelozahra._site_url /*RemoteObject*/ )));
 BA.debugLineNum = 222;BA.debugLine="p_view.AddView( Image_WV , 60%x , 5dip , 37%x , H";
Debug.ShouldStop(536870912);
_p_view.runVoidMethod ("AddView",(Object)((_image_wv.getObject())),(Object)(mahsoullistact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 60)),mahsoullistact.mostCurrent.activityBA)),(Object)(mahsoullistact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(mahsoullistact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 37)),mahsoullistact.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {mahsoullistact.mostCurrent._homeact._listitemheightbazarche /*RemoteObject*/ ,mahsoullistact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "-",1, 1)));
 BA.debugLineNum = 225;BA.debugLine="Dim lbl_caption As Label";
Debug.ShouldStop(1);
_lbl_caption = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl_caption", _lbl_caption);
 BA.debugLineNum = 226;BA.debugLine="lbl_caption.Initialize(\"lbl_caption\")";
Debug.ShouldStop(2);
_lbl_caption.runVoidMethod ("Initialize",mahsoullistact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_caption")));
 BA.debugLineNum = 227;BA.debugLine="lbl_caption.Gravity = Bit.Or(Gravity.RIGHT,Gravit";
Debug.ShouldStop(4);
_lbl_caption.runMethod(true,"setGravity",mahsoullistact.mostCurrent.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(mahsoullistact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT")),(Object)(mahsoullistact.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL"))));
 BA.debugLineNum = 228;BA.debugLine="lbl_caption.TextSize = 1";
Debug.ShouldStop(8);
_lbl_caption.runMethod(true,"setTextSize",BA.numberCast(float.class, 1));
 BA.debugLineNum = 229;BA.debugLine="lbl_caption.Tag = id_cli";
Debug.ShouldStop(16);
_lbl_caption.runMethod(false,"setTag",(_id_cli));
 BA.debugLineNum = 230;BA.debugLine="lbl_caption.Text = Title_cli";
Debug.ShouldStop(32);
_lbl_caption.runMethod(true,"setText",BA.ObjectToCharSequence(_title_cli));
 BA.debugLineNum = 231;BA.debugLine="lbl_caption.SetTextSizeAnimated(313,17)";
Debug.ShouldStop(64);
_lbl_caption.runVoidMethod ("SetTextSizeAnimated",(Object)(BA.numberCast(int.class, 313)),(Object)(BA.numberCast(float.class, 17)));
 BA.debugLineNum = 232;BA.debugLine="lbl_caption.Typeface = SaeloZahra.font";
Debug.ShouldStop(128);
_lbl_caption.runMethod(false,"setTypeface",(mahsoullistact.mostCurrent._saelozahra._font /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 233;BA.debugLine="lbl_caption.TextColor = Colors.Black";
Debug.ShouldStop(256);
_lbl_caption.runMethod(true,"setTextColor",mahsoullistact.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 234;BA.debugLine="lbl_caption.SingleLine=True";
Debug.ShouldStop(512);
_lbl_caption.runVoidMethod ("setSingleLine",mahsoullistact.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 235;BA.debugLine="lbl_caption.Ellipsize=\"END\"";
Debug.ShouldStop(1024);
_lbl_caption.runMethod(true,"setEllipsize",BA.ObjectToString("END"));
 BA.debugLineNum = 236;BA.debugLine="p_view.AddView( lbl_caption , 2dip , 8dip , 59%x";
Debug.ShouldStop(2048);
_p_view.runVoidMethod ("AddView",(Object)((_lbl_caption.getObject())),(Object)(mahsoullistact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(mahsoullistact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8)))),(Object)(mahsoullistact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 59)),mahsoullistact.mostCurrent.activityBA)),(Object)(mahsoullistact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 35)))));
 BA.debugLineNum = 239;BA.debugLine="Dim text_wv As WebView";
Debug.ShouldStop(16384);
_text_wv = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");Debug.locals.put("text_wv", _text_wv);
 BA.debugLineNum = 240;BA.debugLine="text_wv.Initialize(\"text_wv\")";
Debug.ShouldStop(32768);
_text_wv.runVoidMethod ("Initialize",mahsoullistact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("text_wv")));
 BA.debugLineNum = 241;BA.debugLine="text_wv.Color = Colors.Transparent";
Debug.ShouldStop(65536);
_text_wv.runVoidMethod ("setColor",mahsoullistact.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 242;BA.debugLine="text_wv.ZoomEnabled=False";
Debug.ShouldStop(131072);
_text_wv.runMethod(true,"setZoomEnabled",mahsoullistact.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 243;BA.debugLine="text_wv.Tag = id_cli";
Debug.ShouldStop(262144);
_text_wv.runMethod(false,"setTag",(_id_cli));
 BA.debugLineNum = 244;BA.debugLine="text_wv.LoadHtml(\"<style>@import 'https://cdn.jsd";
Debug.ShouldStop(524288);
_text_wv.runVoidMethod ("LoadHtml",(Object)(RemoteObject.concat(RemoteObject.createImmutable("<style>@import 'https://cdn.jsdelivr.net/gh/rastikerdar/samim-font@v4.0.5/dist/font-face.css'; *,body,html{font-family:'Samim';margin:auto;} .div{ direction:rtl; width:100%;float:left;height:100%;font-size:12px;}</style><div class='div'>"),_line2_cli,RemoteObject.createImmutable("</div>"))));
 BA.debugLineNum = 245;BA.debugLine="p_view.AddView( text_wv , 0dip , 52dip , 59%x , 8";
Debug.ShouldStop(1048576);
_p_view.runVoidMethod ("AddView",(Object)((_text_wv.getObject())),(Object)(mahsoullistact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(mahsoullistact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 52)))),(Object)(mahsoullistact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 59)),mahsoullistact.mostCurrent.activityBA)),(Object)(mahsoullistact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 88)))));
 BA.debugLineNum = 249;BA.debugLine="Dim Cover_lbl As Label";
Debug.ShouldStop(16777216);
_cover_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("Cover_lbl", _cover_lbl);
 BA.debugLineNum = 250;BA.debugLine="Cover_lbl.Initialize(\"Cover_lbl\")";
Debug.ShouldStop(33554432);
_cover_lbl.runVoidMethod ("Initialize",mahsoullistact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Cover_lbl")));
 BA.debugLineNum = 251;BA.debugLine="Cover_lbl.Tag=Url_cli";
Debug.ShouldStop(67108864);
_cover_lbl.runMethod(false,"setTag",(_url_cli));
 BA.debugLineNum = 252;BA.debugLine="p_view.AddView(Cover_lbl,0dip,0dip,100%x,HomeAct.";
Debug.ShouldStop(134217728);
_p_view.runVoidMethod ("AddView",(Object)((_cover_lbl.getObject())),(Object)(mahsoullistact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(mahsoullistact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(mahsoullistact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),mahsoullistact.mostCurrent.activityBA)),(Object)(mahsoullistact.mostCurrent._homeact._listitemheightbazarche /*RemoteObject*/ ));
 BA.debugLineNum = 254;BA.debugLine="AC.SetClickEffect(Cover_lbl,True)";
Debug.ShouldStop(536870912);
mahsoullistact.mostCurrent._ac.runVoidMethod ("SetClickEffect",mahsoullistact.mostCurrent.activityBA,(Object)((_cover_lbl.getObject())),(Object)(mahsoullistact.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 260;BA.debugLine="Return p_view";
Debug.ShouldStop(8);
if (true) return _p_view;
 BA.debugLineNum = 263;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 13;BA.debugLine="Private ActionBar As ACToolBarDark";
mahsoullistact.mostCurrent._actionbar = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACToolbarDarkWrapper");
 //BA.debugLineNum = 14;BA.debugLine="Private ScrollView1 As ScrollView";
mahsoullistact.mostCurrent._scrollview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 15;BA.debugLine="Dim X1 As XmlLayoutBuilder";
mahsoullistact.mostCurrent._x1 = RemoteObject.createNew ("anywheresoftware.b4a.object.XmlLayoutBuilder");
 //BA.debugLineNum = 17;BA.debugLine="Dim SH As Amir_SliderShow";
mahsoullistact.mostCurrent._sh = RemoteObject.createNew ("ir.aghajari.slider.Amir_SliderShow");
 //BA.debugLineNum = 18;BA.debugLine="Dim Config 	As Amir_SliderConfig";
mahsoullistact.mostCurrent._config = RemoteObject.createNew ("ir.aghajari.slider.Amir_SlisderConfig");
 //BA.debugLineNum = 19;BA.debugLine="Dim Show 	As Amir_SliderShow";
mahsoullistact.mostCurrent._show = RemoteObject.createNew ("ir.aghajari.slider.Amir_SliderShow");
 //BA.debugLineNum = 20;BA.debugLine="Dim Snake As DSSnackbar";
mahsoullistact.mostCurrent._snake = RemoteObject.createNew ("de.amberhome.objects.SnackbarWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Dim AC As AppCompat";
mahsoullistact.mostCurrent._ac = RemoteObject.createNew ("de.amberhome.objects.appcompat.AppCompatBase");
 //BA.debugLineNum = 25;BA.debugLine="Dim ClvBazarche As CustomListView";
mahsoullistact.mostCurrent._clvbazarche = RemoteObject.createNew ("ir.saelozahra.damaara.mazraeyeman.customlistview");
 //BA.debugLineNum = 26;BA.debugLine="Dim jobBazarche As HttpJob";
mahsoullistact.mostCurrent._jobbazarche = RemoteObject.createNew ("ir.saelozahra.damaara.mazraeyeman.httpjob");
 //BA.debugLineNum = 27;BA.debugLine="Dim mapProductName As Map";
mahsoullistact.mostCurrent._mapproductname = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (mahsoullistact) ","mahsoullistact",18,mahsoullistact.mostCurrent.activityBA,mahsoullistact.mostCurrent,84);
if (RapidSub.canDelegate("jobdone")) { return ir.saelozahra.damaara.mazraeyeman.mahsoullistact.remoteMe.runUserSub(false, "mahsoullistact","jobdone", _job);}
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colroot = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _image_url = RemoteObject.createImmutable("");
RemoteObject _url = RemoteObject.createImmutable("");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 84;BA.debugLine="Sub JobDone (Job As HttpJob)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 86;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(2097152);
mahsoullistact.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 87;BA.debugLine="LogColor(Job.JobName&\"    ,    \"&Job.Success,Colo";
Debug.ShouldStop(4194304);
mahsoullistact.mostCurrent.__c.runVoidMethod ("LogImpl","419070979",RemoteObject.concat(_job.getField(true,"_jobname" /*RemoteObject*/ ),RemoteObject.createImmutable("    ,    "),_job.getField(true,"_success" /*RemoteObject*/ )),mahsoullistact.mostCurrent.__c.getField(false,"Colors").getField(true,"Magenta"));
 BA.debugLineNum = 89;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(16777216);
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 91;BA.debugLine="ClvBazarche.Clear";
Debug.ShouldStop(67108864);
mahsoullistact.mostCurrent._clvbazarche.runClassMethod (ir.saelozahra.damaara.mazraeyeman.customlistview.class, "_clear" /*RemoteObject*/ );
 BA.debugLineNum = 95;BA.debugLine="If Job.GetString==\"{\"\"result\"\":\"\"not found\"\"}\"";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_getstring" /*RemoteObject*/ ),BA.ObjectToString("{\"result\":\"not found\"}")) || RemoteObject.solveBoolean("=",_job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_getstring" /*RemoteObject*/ ),BA.ObjectToString("")) || RemoteObject.solveBoolean("=",_job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_getstring" /*RemoteObject*/ ),BA.ObjectToString("\"not found\""))) { 
 BA.debugLineNum = 97;BA.debugLine="ClvBazarche.Add(CreateListItem(1,\"در بازارچه";
Debug.ShouldStop(1);
mahsoullistact.mostCurrent._clvbazarche.runClassMethod (ir.saelozahra.damaara.mazraeyeman.customlistview.class, "_add" /*RemoteObject*/ ,(Object)(_createlistitem(BA.numberCast(int.class, 1),BA.ObjectToString("در بازارچه محصولی موجود نیست"),BA.ObjectToString("برای افزودن محصول کلیک کنید"),BA.ObjectToString("http://melkamlak.com/melk_pic/32438/bpic32438.jpg"),RemoteObject.createImmutable(""))),(Object)(RemoteObject.solve(new RemoteObject[] {mahsoullistact.mostCurrent._homeact._listitemheightbazarche /*RemoteObject*/ ,RemoteObject.createImmutable(22)}, "+",1, 1)),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 99;BA.debugLine="Snake.Initialize(\"snake\",Activity,SaeloZahra.";
Debug.ShouldStop(4);
mahsoullistact.mostCurrent._snake.runVoidMethod ("Initialize",mahsoullistact.mostCurrent.activityBA,(Object)(BA.ObjectToString("snake")),(Object)((mahsoullistact.mostCurrent._activity.getObject())),(Object)(BA.ObjectToCharSequence(mahsoullistact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,mahsoullistact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("نتیجه ای یافت نشد"))).getObject())),(Object)(mahsoullistact.mostCurrent._snake.getField(true,"DURATION_LONG")));
 BA.debugLineNum = 100;BA.debugLine="Snake.Show";
Debug.ShouldStop(8);
mahsoullistact.mostCurrent._snake.runVoidMethod ("Show");
 }else {
 BA.debugLineNum = 104;BA.debugLine="PlaceList.Initialize";
Debug.ShouldStop(128);
mahsoullistact._placelist.runVoidMethod ("Initialize");
 BA.debugLineNum = 108;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(2048);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 109;BA.debugLine="parser.Initialize(Job.GetString)";
Debug.ShouldStop(4096);
_parser.runVoidMethod ("Initialize",(Object)(_job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 110;BA.debugLine="Dim root As List = parser.NextArray";
Debug.ShouldStop(8192);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_root = _parser.runMethod(false,"NextArray");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 111;BA.debugLine="For Each colroot As Map In root";
Debug.ShouldStop(16384);
_colroot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group14 = _root;
final int groupLen14 = group14.runMethod(true,"getSize").<Integer>get()
;int index14 = 0;
;
for (; index14 < groupLen14;index14++){
_colroot = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group14.runMethod(false,"Get",index14));Debug.locals.put("colroot", _colroot);
Debug.locals.put("colroot", _colroot);
 BA.debugLineNum = 115;BA.debugLine="Dim image_url As String";
Debug.ShouldStop(262144);
_image_url = RemoteObject.createImmutable("");Debug.locals.put("image_url", _image_url);
 BA.debugLineNum = 116;BA.debugLine="If colroot.Get(\"pic\")<>\"\" Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("!",_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("pic")))),RemoteObject.createImmutable(("")))) { 
 BA.debugLineNum = 117;BA.debugLine="image_url = SaeloZahra.site_url&\"reseller/fil";
Debug.ShouldStop(1048576);
_image_url = RemoteObject.concat(mahsoullistact.mostCurrent._saelozahra._site_url /*RemoteObject*/ ,RemoteObject.createImmutable("reseller/fileupload/product/"),_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("pic")))));Debug.locals.put("image_url", _image_url);
 }else {
 BA.debugLineNum = 119;BA.debugLine="image_url = \"http://melkamlak.com/melk_pic/32";
Debug.ShouldStop(4194304);
_image_url = BA.ObjectToString("http://melkamlak.com/melk_pic/32438/bpic32438.jpg");Debug.locals.put("image_url", _image_url);
 };
 BA.debugLineNum = 122;BA.debugLine="Dim url As String = SaeloZahra.site_url&\"user/";
Debug.ShouldStop(33554432);
_url = RemoteObject.concat(mahsoullistact.mostCurrent._saelozahra._site_url /*RemoteObject*/ ,RemoteObject.createImmutable("user/id/"),_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))),RemoteObject.createImmutable("/simple"));Debug.locals.put("url", _url);Debug.locals.put("url", _url);
 BA.debugLineNum = 124;BA.debugLine="If mapProductName.ContainsKey(colroot.Get(\"pro";
Debug.ShouldStop(134217728);
if (mahsoullistact.mostCurrent._mapproductname.runMethod(true,"ContainsKey",(Object)(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("product")))))).<Boolean>get().booleanValue()) { 
_colroot.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("product"))),(Object)(mahsoullistact.mostCurrent._mapproductname.runMethod(false,"Get",(Object)(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("product"))))))));};
 BA.debugLineNum = 126;BA.debugLine="ClvBazarche.Add(CreateListItem(colroot.Get(\"id";
Debug.ShouldStop(536870912);
mahsoullistact.mostCurrent._clvbazarche.runClassMethod (ir.saelozahra.damaara.mazraeyeman.customlistview.class, "_add" /*RemoteObject*/ ,(Object)(_createlistitem(BA.numberCast(int.class, _colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))),RemoteObject.concat(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("vazn")))),RemoteObject.createImmutable(" تن "),_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("product_title"))))),RemoteObject.concat(RemoteObject.createImmutable("ارائه در "),_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("zaman_eraa"))))),_image_url,_url)),(Object)(RemoteObject.solve(new RemoteObject[] {mahsoullistact.mostCurrent._homeact._listitemheightbazarche /*RemoteObject*/ ,RemoteObject.createImmutable(22)}, "+",1, 1)),(Object)((_colroot.getObject())));
 BA.debugLineNum = 128;BA.debugLine="PlaceList.Add(colroot)";
Debug.ShouldStop(-2147483648);
mahsoullistact._placelist.runVoidMethod ("Add",(Object)((_colroot.getObject())));
 }
}Debug.locals.put("colroot", _colroot);
;
 };
 }else {
 BA.debugLineNum = 140;BA.debugLine="If SaeloZahra.CheckConnection Then Log(\"Error: \"";
Debug.ShouldStop(2048);
if (mahsoullistact.mostCurrent._saelozahra.runMethod(true,"_checkconnection" /*RemoteObject*/ ,mahsoullistact.mostCurrent.activityBA).<Boolean>get().booleanValue()) { 
mahsoullistact.mostCurrent.__c.runVoidMethod ("LogImpl","419071032",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage" /*RemoteObject*/ )),0);};
 BA.debugLineNum = 142;BA.debugLine="LogColor(Job.ErrorMessage,Colors.Magenta)";
Debug.ShouldStop(8192);
mahsoullistact.mostCurrent.__c.runVoidMethod ("LogImpl","419071034",_job.getField(true,"_errormessage" /*RemoteObject*/ ),mahsoullistact.mostCurrent.__c.getField(false,"Colors").getField(true,"Magenta"));
 };
 BA.debugLineNum = 146;BA.debugLine="Job.Release";
Debug.ShouldStop(131072);
_job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 148;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
 //BA.debugLineNum = 8;BA.debugLine="Dim PlaceList As List";
mahsoullistact._placelist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 9;BA.debugLine="Dim ListType As String = \"my\"";
mahsoullistact._listtype = BA.ObjectToString("my");
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}