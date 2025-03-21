
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

public class zarinpal_payment implements IRemote{
	public static zarinpal_payment mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public zarinpal_payment() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("zarinpal_payment"), "ir.saelozahra.damaara.mazraeyeman.zarinpal_payment");
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
		pcBA = new PCBA(this, zarinpal_payment.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _phone = RemoteObject.createImmutable("");
public static RemoteObject _e_mail = RemoteObject.createImmutable("");
public static RemoteObject _description = RemoteObject.createImmutable("");
public static RemoteObject _money = RemoteObject.createImmutable("");
public static RemoteObject _activity_now = RemoteObject.declareNull("Object");
public static RemoteObject _timer = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
public static RemoteObject _timer_ok = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
public static RemoteObject _htt = RemoteObject.declareNull("ir.saelozahra.damaara.mazraeyeman.httpjob");
public static RemoteObject _webview = RemoteObject.declareNull("anywheresoftware.b4a.objects.WebViewWrapper");
public static RemoteObject _lbl_ssl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbl_address = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _bool = RemoteObject.createImmutable(false);
public static RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _lbl_ssl_panel = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbl_ssl_about = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.richstring.RichStringBuilder.RichString");
public static RemoteObject _ab = RemoteObject.createImmutable("");
public static RemoteObject _merchand_id = RemoteObject.createImmutable("");
public static RemoteObject _logo = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
public static RemoteObject _start_hostname_with = RemoteObject.createImmutable("");
public static RemoteObject _font = RemoteObject.declareNull("anywheresoftware.b4a.keywords.constants.TypefaceWrapper");
public static RemoteObject _img_icon = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _nb = RemoteObject.declareNull("anywheresoftware.b4a.objects.IME");
public static RemoteObject _ph = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone");
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
public static ir.saelozahra.damaara.mazraeyeman.newinst2 _newinst2 = null;
public static ir.saelozahra.damaara.mazraeyeman.httputils2service _httputils2service = null;
  public Object[] GetGlobals() {
		return new Object[] {"ab",zarinpal_payment.mostCurrent._ab,"accuWeatherCronJobService",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.accuweathercronjobservice.class),"Activity",zarinpal_payment.mostCurrent._activity,"Activity_Now",zarinpal_payment._activity_now,"bazarcheMahsoolAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.bazarchemahsoolact.class),"bool",zarinpal_payment._bool,"DateUtils",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.dateutils.class),"Description",zarinpal_payment._description,"E_Mail",zarinpal_payment._e_mail,"FirebaseMessaging",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.firebasemessaging.class),"Font",zarinpal_payment.mostCurrent._font,"fullscreen_video_act",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.fullscreen_video_act.class),"HomeAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.homeact.class),"htt",zarinpal_payment.mostCurrent._htt,"HttpUtils2Service",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.httputils2service.class),"Img_Icon",zarinpal_payment.mostCurrent._img_icon,"Intro2Act",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.intro2act.class),"lbl_Address",zarinpal_payment.mostCurrent._lbl_address,"lbl_SSL",zarinpal_payment.mostCurrent._lbl_ssl,"lbl_SSL_About",zarinpal_payment.mostCurrent._lbl_ssl_about,"lbl_SSL_Panel",zarinpal_payment.mostCurrent._lbl_ssl_panel,"login_act",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.login_act.class),"logo",zarinpal_payment.mostCurrent._logo,"MahsoulListAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.mahsoullistact.class),"Main",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.main.class),"Merchand_ID",zarinpal_payment.mostCurrent._merchand_id,"money",zarinpal_payment._money,"nb",zarinpal_payment.mostCurrent._nb,"newinst2",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.newinst2.class),"NotificationAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.notificationact.class),"OTPConfirmAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.otpconfirmact.class),"ph",zarinpal_payment.mostCurrent._ph,"phone",zarinpal_payment._phone,"pnl",zarinpal_payment.mostCurrent._pnl,"r",zarinpal_payment.mostCurrent._r,"RegisterAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.registeract.class),"SabteMahsoolAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.sabtemahsoolact.class),"SaeloZahra",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.saelozahra.class),"select_map_act",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.select_map_act.class),"SingleNewAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.singlenewact.class),"Start_HostName_With",zarinpal_payment.mostCurrent._start_hostname_with,"Starter",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.starter.class),"timer",zarinpal_payment._timer,"timer_OK",zarinpal_payment._timer_ok,"VideoNewAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.videonewact.class),"WeatherNewAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.weathernewact.class),"WebView",zarinpal_payment.mostCurrent._webview};
}
}