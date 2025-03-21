
package ir.saelozahra.damaara.mazraeyeman;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class starter implements IRemote{
	public static starter mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public starter() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("starter"), "ir.saelozahra.damaara.mazraeyeman.starter");
	}
     public static RemoteObject getObject() {
		return myClass;
	 }
	public RemoteObject _service;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
        _service = (RemoteObject) args[2];
        remoteMe = RemoteObject.declareNull("ir.saelozahra.damaara.mazraeyeman.starter");
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[3];
		pcBA = new PCBA(this, starter.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}public static RemoteObject runMethod(boolean notUsed, String method, Object... args) throws Exception{
		return (RemoteObject) mostCurrent.pcBA.raiseEvent(method.substring(1), args);
	}
    public static void runVoidMethod(String method, Object... args) throws Exception{
		runMethod(false, method, args);
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _usrnm = RemoteObject.createImmutable("");
public static RemoteObject _my_id = RemoteObject.createImmutable("");
public static RemoteObject _rp = RemoteObject.declareNull("anywheresoftware.b4a.objects.RuntimePermissions");
public static RemoteObject _gps1 = RemoteObject.declareNull("anywheresoftware.b4a.gps.GPS");
public static RemoteObject _gpsstarted = RemoteObject.createImmutable(false);
public static RemoteObject _mylocation = RemoteObject.declareNull("anywheresoftware.b4a.gps.LocationWrapper");
public static ir.saelozahra.damaara.mazraeyeman.main _main = null;
public static ir.saelozahra.damaara.mazraeyeman.intro2act _intro2act = null;
public static ir.saelozahra.damaara.mazraeyeman.login_act _login_act = null;
public static ir.saelozahra.damaara.mazraeyeman.homeact _homeact = null;
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
  public Object[] GetGlobals() {
		return new Object[] {"accuWeatherCronJobService",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.accuweathercronjobservice.class),"bazarcheMahsoolAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.bazarchemahsoolact.class),"DateUtils",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.dateutils.class),"FirebaseMessaging",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.firebasemessaging.class),"fullscreen_video_act",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.fullscreen_video_act.class),"GPS1",starter._gps1,"gpsStarted",starter._gpsstarted,"HomeAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.homeact.class),"HttpUtils2Service",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.httputils2service.class),"Intro2Act",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.intro2act.class),"login_act",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.login_act.class),"MahsoulListAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.mahsoullistact.class),"Main",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.main.class),"my_id",starter._my_id,"MyLocation",starter._mylocation,"newinst2",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.newinst2.class),"NotificationAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.notificationact.class),"OTPConfirmAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.otpconfirmact.class),"RegisterAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.registeract.class),"rp",starter._rp,"SabteMahsoolAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.sabtemahsoolact.class),"SaeloZahra",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.saelozahra.class),"select_map_act",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.select_map_act.class),"Service",starter.mostCurrent._service,"SingleNewAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.singlenewact.class),"usrnm",starter._usrnm,"VideoNewAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.videonewact.class),"WeatherNewAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.weathernewact.class),"ZarinPal_Payment",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.zarinpal_payment.class)};
}
}