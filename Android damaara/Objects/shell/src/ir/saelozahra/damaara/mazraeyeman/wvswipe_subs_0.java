package ir.saelozahra.damaara.mazraeyeman;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class wvswipe_subs_0 {


public static RemoteObject  _changeyoffset(RemoteObject __ref,RemoteObject _dy,RemoteObject _complete) throws Exception{
try {
		Debug.PushSubsStack("ChangeYOffset (wvswipe) ","wvswipe",29,__ref.getField(false, "ba"),__ref,90);
if (RapidSub.canDelegate("changeyoffset")) { return __ref.runUserSub(false, "wvswipe","changeyoffset", __ref, _dy, _complete);}
RemoteObject _newtop = RemoteObject.createImmutable(0);
Debug.locals.put("dy", _dy);
Debug.locals.put("complete", _complete);
 BA.debugLineNum = 90;BA.debugLine="Private Sub ChangeYOffset(dy As Int, complete As B";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 91;BA.debugLine="If WaitingForRefreshToComplete Then Return";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_waitingforrefreshtocomplete" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 92;BA.debugLine="Dim NewTop As Int = Min(Max(mWV.Top + dy, 0), mPu";
Debug.JustUpdateDeviceLine();
_newtop = BA.numberCast(int.class, wvswipe.__c.runMethod(true,"Min",(Object)(wvswipe.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mwv" /*RemoteObject*/ ).runMethod(true,"getTop"),_dy}, "+",1, 1))),(Object)(BA.numberCast(double.class, 0)))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_mpulltorefreshpanel" /*RemoteObject*/ ).runMethod(true,"getHeight")))));Debug.locals.put("NewTop", _newtop);Debug.locals.put("NewTop", _newtop);
 BA.debugLineNum = 93;BA.debugLine="mWV.Top = NewTop";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mwv" /*RemoteObject*/ ).runMethod(true,"setTop",_newtop);
 BA.debugLineNum = 94;BA.debugLine="If NewTop = mPullToRefreshPanel.Height Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_newtop,BA.numberCast(double.class, __ref.getField(false,"_mpulltorefreshpanel" /*RemoteObject*/ ).runMethod(true,"getHeight")))) { 
 BA.debugLineNum = 95;BA.debugLine="RaiseRefreshEvent";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (ir.saelozahra.damaara.mazraeyeman.wvswipe.class, "_raiserefreshevent" /*RemoteObject*/ );
 };
 BA.debugLineNum = 97;BA.debugLine="If complete Then";
Debug.JustUpdateDeviceLine();
if (_complete.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 98;BA.debugLine="mWV.SetLayoutAnimated(200, 0, 0, mWV.Width, mWV.";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mwv" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 200)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_mwv" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mwv" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 };
 BA.debugLineNum = 100;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private mWV As WebView";
wvswipe._mwv = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");__ref.setField("_mwv",wvswipe._mwv);
 //BA.debugLineNum = 4;BA.debugLine="Private Base As B4XView";
wvswipe._base = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_base",wvswipe._base);
 //BA.debugLineNum = 5;BA.debugLine="Private TouchYStart As Float";
wvswipe._touchystart = RemoteObject.createImmutable(0f);__ref.setField("_touchystart",wvswipe._touchystart);
 //BA.debugLineNum = 6;BA.debugLine="Private HandlingSwipe As Boolean";
wvswipe._handlingswipe = RemoteObject.createImmutable(false);__ref.setField("_handlingswipe",wvswipe._handlingswipe);
 //BA.debugLineNum = 7;BA.debugLine="Private xui As XUI";
wvswipe._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",wvswipe._xui);
 //BA.debugLineNum = 10;BA.debugLine="Private mPullToRefreshPanel As B4XView";
wvswipe._mpulltorefreshpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mpulltorefreshpanel",wvswipe._mpulltorefreshpanel);
 //BA.debugLineNum = 11;BA.debugLine="Private PullToRefreshSwipe As Boolean 'ignore";
wvswipe._pulltorefreshswipe = RemoteObject.createImmutable(false);__ref.setField("_pulltorefreshswipe",wvswipe._pulltorefreshswipe);
 //BA.debugLineNum = 12;BA.debugLine="Private WaitingForRefreshToComplete As Boolean";
wvswipe._waitingforrefreshtocomplete = RemoteObject.createImmutable(false);__ref.setField("_waitingforrefreshtocomplete",wvswipe._waitingforrefreshtocomplete);
 //BA.debugLineNum = 13;BA.debugLine="Private ProgressBar1 As B4XView";
wvswipe._progressbar1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_progressbar1",wvswipe._progressbar1);
 //BA.debugLineNum = 14;BA.debugLine="Private ProgressBarColor As Int = Colors.Gray";
wvswipe._progressbarcolor = wvswipe.__c.getField(false,"Colors").getField(true,"Gray");__ref.setField("_progressbarcolor",wvswipe._progressbarcolor);
 //BA.debugLineNum = 15;BA.debugLine="Private tim As Timer";
wvswipe._tim = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");__ref.setField("_tim",wvswipe._tim);
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _cwv) throws Exception{
try {
		Debug.PushSubsStack("Initialize (wvswipe) ","wvswipe",29,__ref.getField(false, "ba"),__ref,19);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "wvswipe","initialize", __ref, _ba, _cwv);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _creator = RemoteObject.declareNull("anywheresoftware.b4a.objects.TouchPanelCreator");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _p1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _p2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("ba", _ba);
Debug.locals.put("cWV", _cwv);
 BA.debugLineNum = 19;BA.debugLine="Public Sub Initialize (cWV As WebView)	', Callback";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 20;BA.debugLine="Dim creator As TouchPanelCreator";
Debug.JustUpdateDeviceLine();
_creator = RemoteObject.createNew ("anywheresoftware.b4a.objects.TouchPanelCreator");Debug.locals.put("creator", _creator);
 BA.debugLineNum = 21;BA.debugLine="Base = creator.CreateTouchPanel(\"TouchPanel\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_base" /*RemoteObject*/ ).setObject (_creator.runMethod(false,"CreateTouchPanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("TouchPanel"))).getObject());
 BA.debugLineNum = 22;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 23;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 1dip, 1dip)";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(wvswipe.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))),(Object)(wvswipe.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))));
 BA.debugLineNum = 24;BA.debugLine="mWV = cWV";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mwv" /*RemoteObject*/ ,_cwv);
 BA.debugLineNum = 25;BA.debugLine="Dim p1 As B4XView = mWV.Parent";
Debug.JustUpdateDeviceLine();
_p1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p1 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_mwv" /*RemoteObject*/ ).runMethod(false,"getParent"));Debug.locals.put("p1", _p1);Debug.locals.put("p1", _p1);
 BA.debugLineNum = 26;BA.debugLine="p1.AddView(Base, mWV.Left, mWV.Top, mWV.Width, mW";
Debug.JustUpdateDeviceLine();
_p1.runVoidMethod ("AddView",(Object)((__ref.getField(false,"_base" /*RemoteObject*/ ).getObject())),(Object)(__ref.getField(false,"_mwv" /*RemoteObject*/ ).runMethod(true,"getLeft")),(Object)(__ref.getField(false,"_mwv" /*RemoteObject*/ ).runMethod(true,"getTop")),(Object)(__ref.getField(false,"_mwv" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mwv" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 27;BA.debugLine="mWV.RemoveView";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mwv" /*RemoteObject*/ ).runVoidMethod ("RemoveView");
 BA.debugLineNum = 28;BA.debugLine="Base.AddView(mWV, 0, 0, Base.Width, Base.Height)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_base" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_mwv" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 31;BA.debugLine="Dim p2 As B4XView = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
_p2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p2 = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p2", _p2);Debug.locals.put("p2", _p2);
 BA.debugLineNum = 32;BA.debugLine="p2.SetLayoutAnimated(0, 0, 0, mWV.Width, 60dip)";
Debug.JustUpdateDeviceLine();
_p2.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_mwv" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(wvswipe.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60)))));
 BA.debugLineNum = 33;BA.debugLine="p2.LoadLayout(\"PullToRefresh\")";
Debug.JustUpdateDeviceLine();
_p2.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("PullToRefresh")),__ref.getField(false, "ba"));
 BA.debugLineNum = 34;BA.debugLine="setPullToRefreshPanel(p2)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (ir.saelozahra.damaara.mazraeyeman.wvswipe.class, "_setpulltorefreshpanel" /*RemoteObject*/ ,(Object)(_p2));
 BA.debugLineNum = 35;BA.debugLine="tim.Initialize(\"tim\", 500)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tim" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("tim")),(Object)(BA.numberCast(long.class, 500)));
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pull_immediately(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Pull_Immediately (wvswipe) ","wvswipe",29,__ref.getField(false, "ba"),__ref,108);
if (RapidSub.canDelegate("pull_immediately")) { return __ref.runUserSub(false, "wvswipe","pull_immediately", __ref);}
 BA.debugLineNum = 108;BA.debugLine="Public Sub Pull_Immediately";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 109;BA.debugLine="HandlingSwipe = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_handlingswipe" /*RemoteObject*/ ,wvswipe.__c.getField(true,"True"));
 BA.debugLineNum = 110;BA.debugLine="PullToRefreshSwipe = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_pulltorefreshswipe" /*RemoteObject*/ ,wvswipe.__c.getField(true,"True"));
 BA.debugLineNum = 111;BA.debugLine="mPullToRefreshPanel.Visible = True";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mpulltorefreshpanel" /*RemoteObject*/ ).runMethod(true,"setVisible",wvswipe.__c.getField(true,"True"));
 BA.debugLineNum = 112;BA.debugLine="ChangeYOffset(mPullToRefreshPanel.Height, False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (ir.saelozahra.damaara.mazraeyeman.wvswipe.class, "_changeyoffset" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_mpulltorefreshpanel" /*RemoteObject*/ ).runMethod(true,"getHeight")),(Object)(wvswipe.__c.getField(true,"False")));
 BA.debugLineNum = 113;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _raiserefreshevent(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("RaiseRefreshEvent (wvswipe) ","wvswipe",29,__ref.getField(false, "ba"),__ref,128);
if (RapidSub.canDelegate("raiserefreshevent")) { return __ref.runUserSub(false, "wvswipe","raiserefreshevent", __ref);}
 BA.debugLineNum = 128;BA.debugLine="Private Sub RaiseRefreshEvent";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 129;BA.debugLine="WaitingForRefreshToComplete = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_waitingforrefreshtocomplete" /*RemoteObject*/ ,wvswipe.__c.getField(true,"True"));
 BA.debugLineNum = 130;BA.debugLine="HandlingSwipe = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_handlingswipe" /*RemoteObject*/ ,wvswipe.__c.getField(true,"False"));
 BA.debugLineNum = 131;BA.debugLine="Swipe_RefreshRequested	'CallSub(mCallback, mEvent";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (ir.saelozahra.damaara.mazraeyeman.wvswipe.class, "_swipe_refreshrequested" /*void*/ );
 BA.debugLineNum = 132;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _refreshcompleted(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("RefreshCompleted (wvswipe) ","wvswipe",29,__ref.getField(false, "ba"),__ref,135);
if (RapidSub.canDelegate("refreshcompleted")) { return __ref.runUserSub(false, "wvswipe","refreshcompleted", __ref);}
 BA.debugLineNum = 135;BA.debugLine="Public Sub RefreshCompleted";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 136;BA.debugLine="If WaitingForRefreshToComplete = False Then Retur";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_waitingforrefreshtocomplete" /*RemoteObject*/ ),wvswipe.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 137;BA.debugLine="WaitingForRefreshToComplete = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_waitingforrefreshtocomplete" /*RemoteObject*/ ,wvswipe.__c.getField(true,"False"));
 BA.debugLineNum = 138;BA.debugLine="mPullToRefreshPanel.Visible = False";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mpulltorefreshpanel" /*RemoteObject*/ ).runMethod(true,"setVisible",wvswipe.__c.getField(true,"False"));
 BA.debugLineNum = 139;BA.debugLine="mWV.SetLayoutAnimated(200, 0, 0, mWV.Width, mWV.H";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mwv" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 200)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_mwv" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mwv" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 140;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setprogress_color(RemoteObject __ref,RemoteObject _newcolor) throws Exception{
try {
		Debug.PushSubsStack("setProgress_Color (wvswipe) ","wvswipe",29,__ref.getField(false, "ba"),__ref,122);
if (RapidSub.canDelegate("setprogress_color")) { return __ref.runUserSub(false, "wvswipe","setprogress_color", __ref, _newcolor);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("NewColor", _newcolor);
 BA.debugLineNum = 122;BA.debugLine="Public Sub setProgress_Color (NewColor As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 123;BA.debugLine="Dim jo As JavaObject = ProgressBar1";
Debug.JustUpdateDeviceLine();
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_progressbar1" /*RemoteObject*/ ).getObject());Debug.locals.put("jo", _jo);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 124;BA.debugLine="jo = jo.RunMethod(\"getIndeterminateDrawable\", Nul";
Debug.JustUpdateDeviceLine();
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getIndeterminateDrawable")),(Object)((wvswipe.__c.getField(false,"Null")))));Debug.locals.put("jo", _jo);
 BA.debugLineNum = 125;BA.debugLine="jo.RunMethod(\"setColorFilter\", Array (NewColor, \"";
Debug.JustUpdateDeviceLine();
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setColorFilter")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_newcolor),(RemoteObject.createImmutable("SRC_IN"))})));
 BA.debugLineNum = 126;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setpulltorefreshpanel(RemoteObject __ref,RemoteObject _pnl) throws Exception{
try {
		Debug.PushSubsStack("setPullToRefreshPanel (wvswipe) ","wvswipe",29,__ref.getField(false, "ba"),__ref,38);
if (RapidSub.canDelegate("setpulltorefreshpanel")) { return __ref.runUserSub(false, "wvswipe","setpulltorefreshpanel", __ref, _pnl);}
Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 38;BA.debugLine="Private Sub setPullToRefreshPanel(pnl As B4XView)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 39;BA.debugLine="If pnl.Parent.IsInitialized Then pnl.RemoveViewFr";
Debug.JustUpdateDeviceLine();
if (_pnl.runMethod(false,"getParent").runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
_pnl.runVoidMethod ("RemoveViewFromParent");};
 BA.debugLineNum = 40;BA.debugLine="If mPullToRefreshPanel.IsInitialized Then mPullTo";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_mpulltorefreshpanel" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
__ref.getField(false,"_mpulltorefreshpanel" /*RemoteObject*/ ).runVoidMethod ("RemoveViewFromParent");};
 BA.debugLineNum = 41;BA.debugLine="mPullToRefreshPanel = pnl";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mpulltorefreshpanel" /*RemoteObject*/ ,_pnl);
 BA.debugLineNum = 42;BA.debugLine="Base.AddView(mPullToRefreshPanel, 0, 0, Base.Widt";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_base" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_mpulltorefreshpanel" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_base" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mpulltorefreshpanel" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 43;BA.debugLine="mPullToRefreshPanel.SendToBack";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mpulltorefreshpanel" /*RemoteObject*/ ).runVoidMethod ("SendToBack");
 BA.debugLineNum = 44;BA.debugLine="mPullToRefreshPanel.Visible = False";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mpulltorefreshpanel" /*RemoteObject*/ ).runMethod(true,"setVisible",wvswipe.__c.getField(true,"False"));
 BA.debugLineNum = 45;BA.debugLine="ProgressBar1.Left = ((mWV.Width - mWV.Left) - Pro";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_progressbar1" /*RemoteObject*/ ).runMethod(true,"setLeft",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mwv" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(false,"_mwv" /*RemoteObject*/ ).runMethod(true,"getLeft")}, "-",1, 1)),__ref.getField(false,"_progressbar1" /*RemoteObject*/ ).runMethod(true,"getWidth")}, "-",1, 1)),RemoteObject.createImmutable(2)}, "/",0, 0)));
 BA.debugLineNum = 46;BA.debugLine="ProgressBar1.Visible = True";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_progressbar1" /*RemoteObject*/ ).runMethod(true,"setVisible",wvswipe.__c.getField(true,"True"));
 BA.debugLineNum = 47;BA.debugLine="setProgress_Color(ProgressBarColor)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (ir.saelozahra.damaara.mazraeyeman.wvswipe.class, "_setprogress_color" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_progressbarcolor" /*RemoteObject*/ )));
 BA.debugLineNum = 48;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _swipe_refreshrequested(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Swipe_RefreshRequested (wvswipe) ","wvswipe",29,__ref.getField(false, "ba"),__ref,143);
if (RapidSub.canDelegate("swipe_refreshrequested")) { __ref.runUserSub(false, "wvswipe","swipe_refreshrequested", __ref); return;}
ResumableSub_Swipe_RefreshRequested rsub = new ResumableSub_Swipe_RefreshRequested(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Swipe_RefreshRequested extends BA.ResumableSub {
public ResumableSub_Swipe_RefreshRequested(ir.saelozahra.damaara.mazraeyeman.wvswipe parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
ir.saelozahra.damaara.mazraeyeman.wvswipe parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Swipe_RefreshRequested (wvswipe) ","wvswipe",29,__ref.getField(false, "ba"),__ref,143);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 144;BA.debugLine="Sleep(1000)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "wvswipe", "swipe_refreshrequested"),BA.numberCast(int.class, 1000));
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
 BA.debugLineNum = 145;BA.debugLine="mWV.StopLoading";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mwv" /*RemoteObject*/ ).runVoidMethod ("StopLoading");
 BA.debugLineNum = 146;BA.debugLine="If mWV.Url = \"\" Or mWV.Url = Null Or mWV.Url = \"n";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_mwv" /*RemoteObject*/ ).runMethod(true,"getUrl"),BA.ObjectToString("")) || RemoteObject.solveBoolean("n",__ref.getField(false,"_mwv" /*RemoteObject*/ ).runMethod(true,"getUrl")) || RemoteObject.solveBoolean("=",__ref.getField(false,"_mwv" /*RemoteObject*/ ).runMethod(true,"getUrl"),BA.ObjectToString("null"))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 147;BA.debugLine="mWV.LoadHtml(\"No URL to load\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mwv" /*RemoteObject*/ ).runVoidMethod ("LoadHtml",(Object)(RemoteObject.createImmutable("No URL to load")));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 149;BA.debugLine="mWV.LoadUrl(mWV.Url)	'refresh the page";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mwv" /*RemoteObject*/ ).runVoidMethod ("LoadUrl",(Object)(__ref.getField(false,"_mwv" /*RemoteObject*/ ).runMethod(true,"getUrl")));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 151;BA.debugLine="End Sub";
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
public static RemoteObject  _tim_tick(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("tim_Tick (wvswipe) ","wvswipe",29,__ref.getField(false, "ba"),__ref,102);
if (RapidSub.canDelegate("tim_tick")) { return __ref.runUserSub(false, "wvswipe","tim_tick", __ref);}
 BA.debugLineNum = 102;BA.debugLine="Private Sub tim_Tick";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 103;BA.debugLine="tim.Enabled = False";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tim" /*RemoteObject*/ ).runMethod(true,"setEnabled",wvswipe.__c.getField(true,"False"));
 BA.debugLineNum = 104;BA.debugLine="RaiseRefreshEvent";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (ir.saelozahra.damaara.mazraeyeman.wvswipe.class, "_raiserefreshevent" /*RemoteObject*/ );
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
public static RemoteObject  _touchpanel_onintercepttouchevent(RemoteObject __ref,RemoteObject _action,RemoteObject _x,RemoteObject _y,RemoteObject _motionevent) throws Exception{
try {
		Debug.PushSubsStack("TouchPanel_OnInterceptTouchEvent (wvswipe) ","wvswipe",29,__ref.getField(false, "ba"),__ref,50);
if (RapidSub.canDelegate("touchpanel_onintercepttouchevent")) { return __ref.runUserSub(false, "wvswipe","touchpanel_onintercepttouchevent", __ref, _action, _x, _y, _motionevent);}
RemoteObject _dy = RemoteObject.createImmutable(0f);
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
Debug.locals.put("MotionEvent", _motionevent);
 BA.debugLineNum = 50;BA.debugLine="Private Sub TouchPanel_OnInterceptTouchEvent (Acti";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 51;BA.debugLine="If HandlingSwipe Or WaitingForRefreshToComplete T";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(".",__ref.getField(true,"_handlingswipe" /*RemoteObject*/ )) || RemoteObject.solveBoolean(".",__ref.getField(true,"_waitingforrefreshtocomplete" /*RemoteObject*/ ))) { 
if (true) return wvswipe.__c.getField(true,"True");};
 BA.debugLineNum = 52;BA.debugLine="Select Action";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_action,__ref.getField(false,"_base" /*RemoteObject*/ ).getField(true,"TOUCH_ACTION_DOWN"),__ref.getField(false,"_base" /*RemoteObject*/ ).getField(true,"TOUCH_ACTION_MOVE"))) {
case 0: {
 BA.debugLineNum = 54;BA.debugLine="TouchYStart = Y";
Debug.JustUpdateDeviceLine();
__ref.setField ("_touchystart" /*RemoteObject*/ ,_y);
 BA.debugLineNum = 55;BA.debugLine="HandlingSwipe = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_handlingswipe" /*RemoteObject*/ ,wvswipe.__c.getField(true,"False"));
 break; }
case 1: {
 BA.debugLineNum = 57;BA.debugLine="Dim dy As Float = Abs(y - TouchYStart)";
Debug.JustUpdateDeviceLine();
_dy = BA.numberCast(float.class, wvswipe.__c.runMethod(true,"Abs",(Object)(RemoteObject.solve(new RemoteObject[] {_y,__ref.getField(true,"_touchystart" /*RemoteObject*/ )}, "-",1, 0))));Debug.locals.put("dy", _dy);Debug.locals.put("dy", _dy);
 BA.debugLineNum = 59;BA.debugLine="If mPullToRefreshPanel.IsInitialized And y - To";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(".",__ref.getField(false,"_mpulltorefreshpanel" /*RemoteObject*/ ).runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean(">",RemoteObject.solve(new RemoteObject[] {_y,__ref.getField(true,"_touchystart" /*RemoteObject*/ )}, "-",1, 0),BA.numberCast(double.class, wvswipe.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3)))))) { 
 BA.debugLineNum = 60;BA.debugLine="If WebView_ScrollPosition = 0 Then	'only at th";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (ir.saelozahra.damaara.mazraeyeman.wvswipe.class, "_webview_scrollposition" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 61;BA.debugLine="HandlingSwipe = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_handlingswipe" /*RemoteObject*/ ,wvswipe.__c.getField(true,"True"));
 BA.debugLineNum = 62;BA.debugLine="PullToRefreshSwipe = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_pulltorefreshswipe" /*RemoteObject*/ ,wvswipe.__c.getField(true,"True"));
 BA.debugLineNum = 63;BA.debugLine="mPullToRefreshPanel.Visible = True";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mpulltorefreshpanel" /*RemoteObject*/ ).runMethod(true,"setVisible",wvswipe.__c.getField(true,"True"));
 };
 }else 
{ BA.debugLineNum = 65;BA.debugLine="Else If dy < 20dip Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",_dy,BA.numberCast(double.class, wvswipe.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))))) { 
 BA.debugLineNum = 66;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) return wvswipe.__c.getField(true,"False");
 }}
;
 break; }
}
;
 BA.debugLineNum = 69;BA.debugLine="Return HandlingSwipe";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_handlingswipe" /*RemoteObject*/ );
 BA.debugLineNum = 70;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _touchpanel_ontouchevent(RemoteObject __ref,RemoteObject _action,RemoteObject _x,RemoteObject _y,RemoteObject _motionevent) throws Exception{
try {
		Debug.PushSubsStack("TouchPanel_OnTouchEvent (wvswipe) ","wvswipe",29,__ref.getField(false, "ba"),__ref,72);
if (RapidSub.canDelegate("touchpanel_ontouchevent")) { return __ref.runUserSub(false, "wvswipe","touchpanel_ontouchevent", __ref, _action, _x, _y, _motionevent);}
RemoteObject _dy = RemoteObject.createImmutable(0f);
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
Debug.locals.put("MotionEvent", _motionevent);
 BA.debugLineNum = 72;BA.debugLine="Private Sub TouchPanel_OnTouchEvent (Action As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 73;BA.debugLine="If HandlingSwipe = False Or WaitingForRefreshToCo";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_handlingswipe" /*RemoteObject*/ ),wvswipe.__c.getField(true,"False")) || RemoteObject.solveBoolean(".",__ref.getField(true,"_waitingforrefreshtocomplete" /*RemoteObject*/ ))) { 
if (true) return wvswipe.__c.getField(true,"True");};
 BA.debugLineNum = 74;BA.debugLine="If PullToRefreshSwipe Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_pulltorefreshswipe" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 75;BA.debugLine="Select Action";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_action,__ref.getField(false,"_base" /*RemoteObject*/ ).getField(true,"TOUCH_ACTION_MOVE"),__ref.getField(false,"_base" /*RemoteObject*/ ).getField(true,"TOUCH_ACTION_UP"))) {
case 0: {
 BA.debugLineNum = 77;BA.debugLine="Dim dy As Float = y - TouchYStart";
Debug.JustUpdateDeviceLine();
_dy = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_y,__ref.getField(true,"_touchystart" /*RemoteObject*/ )}, "-",1, 0));Debug.locals.put("dy", _dy);Debug.locals.put("dy", _dy);
 BA.debugLineNum = 78;BA.debugLine="TouchYStart = Y";
Debug.JustUpdateDeviceLine();
__ref.setField ("_touchystart" /*RemoteObject*/ ,_y);
 BA.debugLineNum = 79;BA.debugLine="If WebView_ScrollPosition = 0 Then	'only at th";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (ir.saelozahra.damaara.mazraeyeman.wvswipe.class, "_webview_scrollposition" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 80;BA.debugLine="ChangeYOffset(dy, False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (ir.saelozahra.damaara.mazraeyeman.wvswipe.class, "_changeyoffset" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _dy)),(Object)(wvswipe.__c.getField(true,"False")));
 };
 break; }
case 1: {
 BA.debugLineNum = 83;BA.debugLine="ChangeYOffset(dy, True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (ir.saelozahra.damaara.mazraeyeman.wvswipe.class, "_changeyoffset" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _dy)),(Object)(wvswipe.__c.getField(true,"True")));
 BA.debugLineNum = 84;BA.debugLine="HandlingSwipe = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_handlingswipe" /*RemoteObject*/ ,wvswipe.__c.getField(true,"False"));
 break; }
}
;
 };
 BA.debugLineNum = 87;BA.debugLine="Return True";
Debug.JustUpdateDeviceLine();
if (true) return wvswipe.__c.getField(true,"True");
 BA.debugLineNum = 88;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _webview_scrollposition(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("WebView_ScrollPosition (wvswipe) ","wvswipe",29,__ref.getField(false, "ba"),__ref,115);
if (RapidSub.canDelegate("webview_scrollposition")) { return __ref.runUserSub(false, "wvswipe","webview_scrollposition", __ref);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _pos = RemoteObject.createImmutable(0);
 BA.debugLineNum = 115;BA.debugLine="Private Sub WebView_ScrollPosition As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 116;BA.debugLine="Dim jo As JavaObject = mWV";
Debug.JustUpdateDeviceLine();
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_mwv" /*RemoteObject*/ ).getObject());Debug.locals.put("jo", _jo);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 117;BA.debugLine="Dim pos As Int = jo.RunMethod(\"getScrollY\", Null)";
Debug.JustUpdateDeviceLine();
_pos = BA.numberCast(int.class, _jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getScrollY")),(Object)((wvswipe.__c.getField(false,"Null")))));Debug.locals.put("pos", _pos);Debug.locals.put("pos", _pos);
 BA.debugLineNum = 118;BA.debugLine="Return pos";
Debug.JustUpdateDeviceLine();
if (true) return _pos;
 BA.debugLineNum = 119;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}