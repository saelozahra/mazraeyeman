
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

public class accuweathercronjobservice implements IRemote{
	public static accuweathercronjobservice mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public accuweathercronjobservice() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("accuweathercronjobservice"), "ir.saelozahra.damaara.mazraeyeman.accuweathercronjobservice");
	}
     public static RemoteObject getObject() {
		return myClass;
	 }
	public RemoteObject _service;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
        _service = (RemoteObject) args[2];
        remoteMe = RemoteObject.declareNull("ir.saelozahra.damaara.mazraeyeman.accuweathercronjobservice");
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[3];
		pcBA = new PCBA(this, accuweathercronjobservice.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _openhome = RemoteObject.createImmutable(false);
public static RemoteObject _jobgetregioncode = RemoteObject.declareNull("ir.saelozahra.damaara.mazraeyeman.httpjob");
public static RemoteObject _jobgetaccuweather = RemoteObject.declareNull("ir.saelozahra.damaara.mazraeyeman.httpjob");
public static RemoteObject _regioncode = RemoteObject.createImmutable("");
public static RemoteObject _avvalinbar = RemoteObject.createImmutable(false);
public static RemoteObject _sql1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL");
public static RemoteObject _fullurl = RemoteObject.createImmutable("");
public static RemoteObject _matnetouzihat = RemoteObject.createImmutable("");
public static RemoteObject _uvindex = RemoteObject.createImmutable("");
public static RemoteObject _dayshortphrase = RemoteObject.createImmutable("");
public static RemoteObject _nightshortphrase = RemoteObject.createImmutable("");
public static RemoteObject _apiaccuweather = RemoteObject.createImmutable("");
public static RemoteObject _apiaccuweather1 = RemoteObject.createImmutable("");
public static RemoteObject _apiaccuweather2 = RemoteObject.createImmutable("");
public static RemoteObject _apiaccuweather3 = RemoteObject.createImmutable("");
public static RemoteObject _apiaccuweather4 = RemoteObject.createImmutable("");
public static RemoteObject _apiaccuweather5 = RemoteObject.createImmutable("");
public static RemoteObject _apiaccuweather6 = RemoteObject.createImmutable("");
public static RemoteObject _dayicon = RemoteObject.createImmutable(0);
public static RemoteObject _nighticon = RemoteObject.createImmutable(0);
public static RemoteObject _dayrainprobability = RemoteObject.createImmutable(0);
public static RemoteObject _mindama = RemoteObject.createImmutable(0);
public static RemoteObject _maxdama = RemoteObject.createImmutable(0);
public static RemoteObject _bazedama = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _windhaday = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _windhanight = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _listvalues = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _listuserproducts = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _raf = RemoteObject.declareNull("anywheresoftware.b4a.randomaccessfile.RandomAccessFile");
public static RemoteObject _notifkon = RemoteObject.createImmutable(false);
public static ir.saelozahra.damaara.mazraeyeman.main _main = null;
public static ir.saelozahra.damaara.mazraeyeman.intro2act _intro2act = null;
public static ir.saelozahra.damaara.mazraeyeman.login_act _login_act = null;
public static ir.saelozahra.damaara.mazraeyeman.homeact _homeact = null;
public static ir.saelozahra.damaara.mazraeyeman.starter _starter = null;
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
		return new Object[] {"ApiAccuWeather",accuweathercronjobservice._apiaccuweather,"ApiAccuWeather1",accuweathercronjobservice._apiaccuweather1,"ApiAccuWeather2",accuweathercronjobservice._apiaccuweather2,"ApiAccuWeather3",accuweathercronjobservice._apiaccuweather3,"ApiAccuWeather4",accuweathercronjobservice._apiaccuweather4,"ApiAccuWeather5",accuweathercronjobservice._apiaccuweather5,"ApiAccuWeather6",accuweathercronjobservice._apiaccuweather6,"AvvalinBar",accuweathercronjobservice._avvalinbar,"bazarcheMahsoolAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.bazarchemahsoolact.class),"BazeDama",accuweathercronjobservice._bazedama,"DateUtils",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.dateutils.class),"DayIcon",accuweathercronjobservice._dayicon,"DayRainProbability",accuweathercronjobservice._dayrainprobability,"DayShortPhrase",accuweathercronjobservice._dayshortphrase,"FirebaseMessaging",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.firebasemessaging.class),"fullscreen_video_act",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.fullscreen_video_act.class),"FullUrl",accuweathercronjobservice._fullurl,"HomeAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.homeact.class),"HttpUtils2Service",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.httputils2service.class),"Intro2Act",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.intro2act.class),"JobGetAccuWeather",accuweathercronjobservice._jobgetaccuweather,"JobGetRegionCode",accuweathercronjobservice._jobgetregioncode,"ListUserProducts",accuweathercronjobservice._listuserproducts,"ListValues",accuweathercronjobservice._listvalues,"login_act",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.login_act.class),"MahsoulListAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.mahsoullistact.class),"Main",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.main.class),"MatneTouzihat",accuweathercronjobservice._matnetouzihat,"MaxDama",accuweathercronjobservice._maxdama,"MinDama",accuweathercronjobservice._mindama,"newinst2",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.newinst2.class),"NightIcon",accuweathercronjobservice._nighticon,"NightShortPhrase",accuweathercronjobservice._nightshortphrase,"NotificationAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.notificationact.class),"NotifKon",accuweathercronjobservice._notifkon,"OpenHome",accuweathercronjobservice._openhome,"OTPConfirmAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.otpconfirmact.class),"RAF",accuweathercronjobservice._raf,"RegionCode",accuweathercronjobservice._regioncode,"RegisterAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.registeract.class),"SabteMahsoolAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.sabtemahsoolact.class),"SaeloZahra",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.saelozahra.class),"select_map_act",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.select_map_act.class),"Service",accuweathercronjobservice.mostCurrent._service,"SingleNewAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.singlenewact.class),"sql1",accuweathercronjobservice._sql1,"Starter",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.starter.class),"UVIndex",accuweathercronjobservice._uvindex,"VideoNewAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.videonewact.class),"WeatherNewAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.weathernewact.class),"WindHaDay",accuweathercronjobservice._windhaday,"WindHaNight",accuweathercronjobservice._windhanight,"ZarinPal_Payment",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.zarinpal_payment.class)};
}
}