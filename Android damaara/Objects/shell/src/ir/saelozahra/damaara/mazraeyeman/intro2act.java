
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

public class intro2act implements IRemote{
	public static intro2act mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public intro2act() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("intro2act"), "ir.saelozahra.damaara.mazraeyeman.intro2act");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, intro2act.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _go_btn = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _desclbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _parallaxdesign = RemoteObject.declareNull("iir.wrap.Hitex_ParallaxDesign");
public static ir.saelozahra.damaara.mazraeyeman.main _main = null;
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
  public Object[] GetGlobals() {
		return new Object[] {"accuWeatherCronJobService",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.accuweathercronjobservice.class),"Activity",intro2act.mostCurrent._activity,"bazarcheMahsoolAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.bazarchemahsoolact.class),"DateUtils",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.dateutils.class),"DescLbl",intro2act.mostCurrent._desclbl,"FirebaseMessaging",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.firebasemessaging.class),"fullscreen_video_act",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.fullscreen_video_act.class),"go_btn",intro2act.mostCurrent._go_btn,"HomeAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.homeact.class),"HttpUtils2Service",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.httputils2service.class),"login_act",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.login_act.class),"MahsoulListAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.mahsoullistact.class),"Main",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.main.class),"newinst2",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.newinst2.class),"NotificationAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.notificationact.class),"OTPConfirmAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.otpconfirmact.class),"ParallaxDesign",intro2act.mostCurrent._parallaxdesign,"RegisterAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.registeract.class),"SabteMahsoolAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.sabtemahsoolact.class),"SaeloZahra",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.saelozahra.class),"select_map_act",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.select_map_act.class),"SingleNewAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.singlenewact.class),"Starter",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.starter.class),"VideoNewAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.videonewact.class),"WeatherNewAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.weathernewact.class),"ZarinPal_Payment",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.zarinpal_payment.class)};
}
}