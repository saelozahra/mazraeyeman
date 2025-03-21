
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

public class weathernewact implements IRemote{
	public static weathernewact mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public weathernewact() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("weathernewact"), "ir.saelozahra.damaara.mazraeyeman.weathernewact");
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
		pcBA = new PCBA(this, weathernewact.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _config = RemoteObject.declareNull("ir.aghajari.slider.Amir_SlisderConfig");
public static RemoteObject _show = RemoteObject.declareNull("ir.aghajari.slider.Amir_SliderShow");
public static RemoteObject _x1 = RemoteObject.declareNull("anywheresoftware.b4a.object.XmlLayoutBuilder");
public static RemoteObject _actionbar = RemoteObject.declareNull("de.amberhome.objects.appcompat.ACToolbarLightWrapper");
public static RemoteObject _tablayout = RemoteObject.declareNull("de.amberhome.objects.TabLayoutWrapper");
public static RemoteObject _vp = RemoteObject.declareNull("de.amberhome.viewpager.AHViewPager");
public static RemoteObject _pc = RemoteObject.declareNull("de.amberhome.viewpager.AHPageContainer");
public static RemoteObject _sv = null;
public static RemoteObject _jobgetamar = RemoteObject.declareNull("ir.saelozahra.damaara.mazraeyeman.httpjob");
public static RemoteObject _windweeklist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _tempweeklist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _rainweeklist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _snowweeklist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _iceweeklist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _humidityweeklist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _windmonthlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _tempmonthlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _rainmonthlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _snowmonthlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _icemonthlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _humiditymonthlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _windyearlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _tempyearlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _rainyearlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _snowyearlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _iceyearlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _humidityyearlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
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
		return new Object[] {"accuWeatherCronJobService",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.accuweathercronjobservice.class),"ActionBar",weathernewact.mostCurrent._actionbar,"Activity",weathernewact.mostCurrent._activity,"bazarcheMahsoolAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.bazarchemahsoolact.class),"Config",weathernewact.mostCurrent._config,"DateUtils",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.dateutils.class),"FirebaseMessaging",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.firebasemessaging.class),"fullscreen_video_act",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.fullscreen_video_act.class),"HomeAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.homeact.class),"HttpUtils2Service",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.httputils2service.class),"HumidityMonthList",weathernewact.mostCurrent._humiditymonthlist,"HumidityWeekList",weathernewact.mostCurrent._humidityweeklist,"HumidityYearList",weathernewact.mostCurrent._humidityyearlist,"IceMonthList",weathernewact.mostCurrent._icemonthlist,"IceWeekList",weathernewact.mostCurrent._iceweeklist,"IceYearList",weathernewact.mostCurrent._iceyearlist,"Intro2Act",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.intro2act.class),"JobGetAmar",weathernewact.mostCurrent._jobgetamar,"login_act",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.login_act.class),"MahsoulListAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.mahsoullistact.class),"Main",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.main.class),"newinst2",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.newinst2.class),"NotificationAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.notificationact.class),"OTPConfirmAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.otpconfirmact.class),"PC",weathernewact.mostCurrent._pc,"RainMonthList",weathernewact.mostCurrent._rainmonthlist,"RainWeekList",weathernewact.mostCurrent._rainweeklist,"RainYearList",weathernewact.mostCurrent._rainyearlist,"RegisterAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.registeract.class),"SabteMahsoolAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.sabtemahsoolact.class),"SaeloZahra",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.saelozahra.class),"select_map_act",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.select_map_act.class),"Show",weathernewact.mostCurrent._show,"SingleNewAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.singlenewact.class),"SnowMonthList",weathernewact.mostCurrent._snowmonthlist,"SnowWeekList",weathernewact.mostCurrent._snowweeklist,"SnowYearList",weathernewact.mostCurrent._snowyearlist,"Starter",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.starter.class),"SV",weathernewact.mostCurrent._sv,"TabLayout",weathernewact.mostCurrent._tablayout,"TempMonthList",weathernewact.mostCurrent._tempmonthlist,"TempWeekList",weathernewact.mostCurrent._tempweeklist,"TempYearList",weathernewact.mostCurrent._tempyearlist,"VideoNewAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.videonewact.class),"VP",weathernewact.mostCurrent._vp,"WindMonthList",weathernewact.mostCurrent._windmonthlist,"WindWeekList",weathernewact.mostCurrent._windweeklist,"WindYearList",weathernewact.mostCurrent._windyearlist,"X1",weathernewact.mostCurrent._x1,"ZarinPal_Payment",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.zarinpal_payment.class)};
}
}