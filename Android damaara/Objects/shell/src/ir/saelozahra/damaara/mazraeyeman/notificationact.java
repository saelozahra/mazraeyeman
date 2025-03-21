
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

public class notificationact implements IRemote{
	public static notificationact mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public notificationact() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("notificationact"), "ir.saelozahra.damaara.mazraeyeman.notificationact");
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
		pcBA = new PCBA(this, notificationact.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _sql1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL");
public static RemoteObject _cu1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
public static RemoteObject _share = RemoteObject.declareNull("anywheresoftware.b4a.objects.IntentWrapper");
public static RemoteObject _type_str = RemoteObject.createImmutable("");
public static RemoteObject _config = RemoteObject.declareNull("ir.aghajari.slider.Amir_SlisderConfig");
public static RemoteObject _show = RemoteObject.declareNull("ir.aghajari.slider.Amir_SliderShow");
public static RemoteObject _su = RemoteObject.declareNull("anywheresoftware.b4a.objects.StringUtils");
public static RemoteObject _x1 = RemoteObject.declareNull("anywheresoftware.b4a.object.XmlLayoutBuilder");
public static RemoteObject _actionbar = RemoteObject.declareNull("de.amberhome.objects.appcompat.ACToolbarLightWrapper");
public static RemoteObject _css_start = RemoteObject.createImmutable("");
public static RemoteObject _css_end = RemoteObject.createImmutable("");
public static RemoteObject _web = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone.PhoneIntents");
public static RemoteObject _pc = RemoteObject.declareNull("de.amberhome.viewpager.AHPageContainer");
public static RemoteObject _tablayout = RemoteObject.declareNull("de.amberhome.objects.TabLayoutWrapper");
public static RemoteObject _vp = RemoteObject.declareNull("de.amberhome.viewpager.AHViewPager");
public static RemoteObject _svnotif = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
public static RemoteObject _svalert = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
public static RemoteObject _stopintnotif = RemoteObject.createImmutable(0);
public static RemoteObject _stopintalert = RemoteObject.createImmutable(0);
public static ir.saelozahra.damaara.mazraeyeman.main _main = null;
public static ir.saelozahra.damaara.mazraeyeman.intro2act _intro2act = null;
public static ir.saelozahra.damaara.mazraeyeman.login_act _login_act = null;
public static ir.saelozahra.damaara.mazraeyeman.homeact _homeact = null;
public static ir.saelozahra.damaara.mazraeyeman.starter _starter = null;
public static ir.saelozahra.damaara.mazraeyeman.accuweathercronjobservice _accuweathercronjobservice = null;
public static ir.saelozahra.damaara.mazraeyeman.registeract _registeract = null;
public static ir.saelozahra.damaara.mazraeyeman.saelozahra _saelozahra = null;
public static ir.saelozahra.damaara.mazraeyeman.sabtemahsoolact _sabtemahsoolact = null;
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
		return new Object[] {"accuWeatherCronJobService",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.accuweathercronjobservice.class),"Actionbar",notificationact.mostCurrent._actionbar,"Activity",notificationact.mostCurrent._activity,"bazarcheMahsoolAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.bazarchemahsoolact.class),"Config",notificationact.mostCurrent._config,"css_end",notificationact.mostCurrent._css_end,"css_start",notificationact.mostCurrent._css_start,"cu1",notificationact._cu1,"DateUtils",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.dateutils.class),"FirebaseMessaging",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.firebasemessaging.class),"fullscreen_video_act",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.fullscreen_video_act.class),"HomeAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.homeact.class),"HttpUtils2Service",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.httputils2service.class),"Intro2Act",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.intro2act.class),"login_act",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.login_act.class),"MahsoulListAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.mahsoullistact.class),"Main",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.main.class),"newinst2",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.newinst2.class),"OTPConfirmAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.otpconfirmact.class),"PC",notificationact.mostCurrent._pc,"RegisterAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.registeract.class),"SabteMahsoolAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.sabtemahsoolact.class),"SaeloZahra",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.saelozahra.class),"select_map_act",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.select_map_act.class),"share",notificationact._share,"Show",notificationact.mostCurrent._show,"SingleNewAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.singlenewact.class),"sql1",notificationact._sql1,"Starter",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.starter.class),"StopintAlert",notificationact._stopintalert,"StopintNotif",notificationact._stopintnotif,"su",notificationact.mostCurrent._su,"SvAlert",notificationact.mostCurrent._svalert,"SvNotif",notificationact.mostCurrent._svnotif,"TabLayout",notificationact.mostCurrent._tablayout,"type_str",notificationact._type_str,"VideoNewAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.videonewact.class),"VP",notificationact.mostCurrent._vp,"WeatherNewAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.weathernewact.class),"Web",notificationact.mostCurrent._web,"X1",notificationact.mostCurrent._x1,"ZarinPal_Payment",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.zarinpal_payment.class)};
}
}