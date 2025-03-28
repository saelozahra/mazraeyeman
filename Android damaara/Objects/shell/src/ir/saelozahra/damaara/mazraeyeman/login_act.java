
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

public class login_act implements IRemote{
	public static login_act mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public login_act() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("login_act"), "ir.saelozahra.damaara.mazraeyeman.login_act");
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
		pcBA = new PCBA(this, login_act.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _itispayed = RemoteObject.createImmutable(false);
public static RemoteObject _morethantrialdays = RemoteObject.createImmutable(false);
public static RemoteObject _raf = RemoteObject.declareNull("anywheresoftware.b4a.randomaccessfile.RandomAccessFile");
public static RemoteObject _sh = RemoteObject.declareNull("ir.aghajari.slider.Amir_SliderShow");
public static RemoteObject _job1 = RemoteObject.declareNull("ir.saelozahra.damaara.mazraeyeman.httpjob");
public static RemoteObject _cd1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
public static RemoteObject _cd2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
public static RemoteObject _username_et = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _password_et = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _components = null;
public static RemoteObject _login_btn = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _register_btn = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _dsnake = RemoteObject.declareNull("de.amberhome.objects.SnackbarWrapper");
public static RemoteObject _parallaxdesign = RemoteObject.declareNull("iir.wrap.Hitex_ParallaxDesign");
public static RemoteObject _container = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _tip = RemoteObject.declareNull("com.maximussoft.showtips.BuilderWrapper");
public static ir.saelozahra.damaara.mazraeyeman.main _main = null;
public static ir.saelozahra.damaara.mazraeyeman.intro2act _intro2act = null;
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
		return new Object[] {"accuWeatherCronJobService",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.accuweathercronjobservice.class),"Activity",login_act.mostCurrent._activity,"bazarcheMahsoolAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.bazarchemahsoolact.class),"CD1",login_act.mostCurrent._cd1,"CD2",login_act.mostCurrent._cd2,"components",login_act.mostCurrent._components,"Container",login_act.mostCurrent._container,"DateUtils",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.dateutils.class),"dsnake",login_act.mostCurrent._dsnake,"FirebaseMessaging",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.firebasemessaging.class),"fullscreen_video_act",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.fullscreen_video_act.class),"HomeAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.homeact.class),"HttpUtils2Service",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.httputils2service.class),"Intro2Act",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.intro2act.class),"ItIsPayed",login_act._itispayed,"job1",login_act.mostCurrent._job1,"login_btn",login_act.mostCurrent._login_btn,"MahsoulListAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.mahsoullistact.class),"Main",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.main.class),"MoreThanTrialDays",login_act._morethantrialdays,"newinst2",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.newinst2.class),"NotificationAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.notificationact.class),"OTPConfirmAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.otpconfirmact.class),"ParallaxDesign",login_act.mostCurrent._parallaxdesign,"password_et",login_act.mostCurrent._password_et,"RAF",login_act.mostCurrent._raf,"Register_btn",login_act.mostCurrent._register_btn,"RegisterAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.registeract.class),"SabteMahsoolAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.sabtemahsoolact.class),"SaeloZahra",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.saelozahra.class),"select_map_act",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.select_map_act.class),"SH",login_act.mostCurrent._sh,"SingleNewAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.singlenewact.class),"Starter",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.starter.class),"TIP",login_act.mostCurrent._tip,"username_et",login_act.mostCurrent._username_et,"VideoNewAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.videonewact.class),"WeatherNewAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.weathernewact.class),"ZarinPal_Payment",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.zarinpal_payment.class)};
}
}