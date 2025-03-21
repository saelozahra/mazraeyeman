
package ir.saelozahra.damaara.mazraeyeman;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class wvswipe {
    public static RemoteObject myClass;
	public wvswipe() {
	}
    public static PCBA staticBA = new PCBA(null, wvswipe.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _mwv = RemoteObject.declareNull("anywheresoftware.b4a.objects.WebViewWrapper");
public static RemoteObject _base = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _touchystart = RemoteObject.createImmutable(0f);
public static RemoteObject _handlingswipe = RemoteObject.createImmutable(false);
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _mpulltorefreshpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _pulltorefreshswipe = RemoteObject.createImmutable(false);
public static RemoteObject _waitingforrefreshtocomplete = RemoteObject.createImmutable(false);
public static RemoteObject _progressbar1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _progressbarcolor = RemoteObject.createImmutable(0);
public static RemoteObject _tim = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
public static ir.saelozahra.damaara.mazraeyeman.main _main = null;
public static ir.saelozahra.damaara.mazraeyeman.intro2act _intro2act = null;
public static ir.saelozahra.damaara.mazraeyeman.login_act _login_act = null;
public static ir.saelozahra.damaara.mazraeyeman.homeact _homeact = null;
public static ir.saelozahra.damaara.mazraeyeman.starter _starter = null;
public static ir.saelozahra.damaara.mazraeyeman.accuweathercronjobservice _accuweathercronjobservice = null;
public static ir.saelozahra.damaara.mazraeyeman.registeract _registeract = null;
public static ir.saelozahra.damaara.mazraeyeman.saelozahra _saelozahra = null;
public static ir.saelozahra.damaara.mazraeyeman.sabtemahsoolact _sabtemahsoolact = null;
public static ir.saelozahra.damaara.mazraeyeman.notificationact _notificationact = null;
public static ir.saelozahra.damaara.mazraeyeman.weathernewact _weathernewact = null;
public static ir.saelozahra.damaara.mazraeyeman.bazarchemahsoolact _bazarchemahsoolact = null;
public static ir.saelozahra.damaara.mazraeyeman.dateutils _dateutils = null;
public static ir.saelozahra.damaara.mazraeyeman.firebasemessaging _firebasemessaging = null;
public static ir.saelozahra.damaara.mazraeyeman.fullscreen_video_act _fullscreen_video_act = null;
public static ir.saelozahra.damaara.mazraeyeman.mahsoullistact _mahsoullistact = null;
public static ir.saelozahra.damaara.mazraeyeman.otpconfirmact _otpconfirmact = null;
public static ir.saelozahra.damaara.mazraeyeman.select_map_act _select_map_act = null;
public static ir.saelozahra.damaara.mazraeyeman.singlenewact _singlenewact = null;
public static ir.saelozahra.damaara.mazraeyeman.videonewact _videonewact = null;
public static ir.saelozahra.damaara.mazraeyeman.zarinpal_payment _zarinpal_payment = null;
public static ir.saelozahra.damaara.mazraeyeman.newinst2 _newinst2 = null;
public static ir.saelozahra.damaara.mazraeyeman.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"Base",_ref.getField(false, "_base"),"HandlingSwipe",_ref.getField(false, "_handlingswipe"),"mPullToRefreshPanel",_ref.getField(false, "_mpulltorefreshpanel"),"mWV",_ref.getField(false, "_mwv"),"ProgressBar1",_ref.getField(false, "_progressbar1"),"ProgressBarColor",_ref.getField(false, "_progressbarcolor"),"PullToRefreshSwipe",_ref.getField(false, "_pulltorefreshswipe"),"tim",_ref.getField(false, "_tim"),"TouchYStart",_ref.getField(false, "_touchystart"),"WaitingForRefreshToComplete",_ref.getField(false, "_waitingforrefreshtocomplete"),"xui",_ref.getField(false, "_xui")};
}
}