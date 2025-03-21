
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

public class registeract implements IRemote{
	public static registeract mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public registeract() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("registeract"), "ir.saelozahra.damaara.mazraeyeman.registeract");
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
		pcBA = new PCBA(this, registeract.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _acttype = RemoteObject.createImmutable("");
public static RemoteObject _otpcode = RemoteObject.createImmutable("");
public static RemoteObject _operator = RemoteObject.createImmutable("");
public static RemoteObject _cu1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
public static RemoteObject _sql1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL");
public static RemoteObject _gheimatkamel = RemoteObject.createImmutable(0);
public static RemoteObject _tedadnafaratekamel = RemoteObject.createImmutable(0);
public static RemoteObject _tedadrooztrial = RemoteObject.createImmutable(0);
public static RemoteObject _timestamp = RemoteObject.createImmutable(0L);
public static RemoteObject _payed = RemoteObject.createImmutable(0);
public static RemoteObject _defaultresseller = RemoteObject.createImmutable(0);
public static RemoteObject _x1 = RemoteObject.declareNull("anywheresoftware.b4a.object.XmlLayoutBuilder");
public static RemoteObject _errortext = RemoteObject.createImmutable("");
public static RemoteObject _job1 = RemoteObject.declareNull("ir.saelozahra.damaara.mazraeyeman.httpjob");
public static RemoteObject _jobotpgenerate = RemoteObject.declareNull("ir.saelozahra.damaara.mazraeyeman.httpjob");
public static RemoteObject _jobgetpayuser = RemoteObject.declareNull("ir.saelozahra.damaara.mazraeyeman.httpjob");
public static RemoteObject _jobcheckusername = RemoteObject.declareNull("ir.saelozahra.damaara.mazraeyeman.httpjob");
public static RemoteObject _scenariotriallbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _scenariomoneylbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _label1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _scrollview1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
public static RemoteObject _save_btn = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _map_select_btn = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _name_family_et = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _email_et = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _tel_et = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _address = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _masahateyahtekeshet = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _moaref_et = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _nationalcode_et = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _vahed_spinner = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _state_spinner = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _ime = RemoteObject.declareNull("anywheresoftware.b4a.objects.IME");
public static RemoteObject _int1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.IntentWrapper");
public static RemoteObject _uri = RemoteObject.createImmutable("");
public static RemoteObject _sealevel = RemoteObject.createImmutable("");
public static RemoteObject _userdatamap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _actionbar = RemoteObject.declareNull("de.amberhome.objects.appcompat.ACToolbarDarkWrapper");
public static RemoteObject _cityacet = RemoteObject.declareNull("anywheresoftware.b4a.objects.AutoCompleteEditTextWrapper");
public static RemoteObject _config = RemoteObject.declareNull("ir.aghajari.slider.Amir_SlisderConfig");
public static RemoteObject _show = RemoteObject.declareNull("ir.aghajari.slider.Amir_SliderShow");
public static RemoteObject _mytoast = RemoteObject.declareNull("ir.saelozahra.damaara.mazraeyeman.ctoast");
public static RemoteObject _snake = RemoteObject.declareNull("de.amberhome.objects.SnackbarWrapper");
public static RemoteObject _scenariopanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _custombrowser = RemoteObject.declareNull("ir.jokar.customtabsbrowser.wrapper");
public static RemoteObject _scenariomoneylayout = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _scenariotriallayout = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _waitforpay = RemoteObject.createImmutable(false);
public static RemoteObject _sendsmsbtn = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _codeet = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _otherthantelpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static ir.saelozahra.damaara.mazraeyeman.main _main = null;
public static ir.saelozahra.damaara.mazraeyeman.intro2act _intro2act = null;
public static ir.saelozahra.damaara.mazraeyeman.login_act _login_act = null;
public static ir.saelozahra.damaara.mazraeyeman.homeact _homeact = null;
public static ir.saelozahra.damaara.mazraeyeman.starter _starter = null;
public static ir.saelozahra.damaara.mazraeyeman.accuweathercronjobservice _accuweathercronjobservice = null;
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
		return new Object[] {"accuWeatherCronJobService",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.accuweathercronjobservice.class),"ActionBar",registeract.mostCurrent._actionbar,"Activity",registeract.mostCurrent._activity,"ActType",registeract._acttype,"address",registeract.mostCurrent._address,"bazarcheMahsoolAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.bazarchemahsoolact.class),"CityACET",registeract.mostCurrent._cityacet,"CodeEt",registeract.mostCurrent._codeet,"Config",registeract.mostCurrent._config,"CU1",registeract._cu1,"customBrowser",registeract.mostCurrent._custombrowser,"DateUtils",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.dateutils.class),"DefaultResseller",registeract._defaultresseller,"email_et",registeract.mostCurrent._email_et,"errorText",registeract.mostCurrent._errortext,"FirebaseMessaging",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.firebasemessaging.class),"fullscreen_video_act",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.fullscreen_video_act.class),"gheimatKamel",registeract._gheimatkamel,"HomeAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.homeact.class),"HttpUtils2Service",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.httputils2service.class),"IME",registeract.mostCurrent._ime,"Int1",registeract.mostCurrent._int1,"Intro2Act",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.intro2act.class),"job1",registeract.mostCurrent._job1,"JobCheckUserName",registeract.mostCurrent._jobcheckusername,"JobGetPayUser",registeract.mostCurrent._jobgetpayuser,"jobOtpGenerate",registeract.mostCurrent._jobotpgenerate,"Label1",registeract.mostCurrent._label1,"login_act",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.login_act.class),"MahsoulListAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.mahsoullistact.class),"Main",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.main.class),"map_select_btn",registeract.mostCurrent._map_select_btn,"masahateYahteKeshET",registeract.mostCurrent._masahateyahtekeshet,"moaref_et",registeract.mostCurrent._moaref_et,"MyToast",registeract.mostCurrent._mytoast,"name_family_et",registeract.mostCurrent._name_family_et,"NationalCode_et",registeract.mostCurrent._nationalcode_et,"newinst2",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.newinst2.class),"NotificationAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.notificationact.class),"Operator",registeract._operator,"OtherThanTelPanel",registeract.mostCurrent._otherthantelpanel,"OTPCode",registeract._otpcode,"OTPConfirmAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.otpconfirmact.class),"Payed",registeract._payed,"SabteMahsoolAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.sabtemahsoolact.class),"SaeloZahra",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.saelozahra.class),"save_btn",registeract.mostCurrent._save_btn,"ScenarioMoneyLayout",registeract.mostCurrent._scenariomoneylayout,"ScenarioMoneyLBL",registeract.mostCurrent._scenariomoneylbl,"ScenarioPanel",registeract.mostCurrent._scenariopanel,"ScenarioTrialLayout",registeract.mostCurrent._scenariotriallayout,"ScenarioTrialLbl",registeract.mostCurrent._scenariotriallbl,"ScrollView1",registeract.mostCurrent._scrollview1,"SeaLevel",registeract.mostCurrent._sealevel,"select_map_act",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.select_map_act.class),"SendSmsBtn",registeract.mostCurrent._sendsmsbtn,"Show",registeract.mostCurrent._show,"SingleNewAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.singlenewact.class),"Snake",registeract.mostCurrent._snake,"SQL1",registeract._sql1,"Starter",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.starter.class),"state_spinner",registeract.mostCurrent._state_spinner,"TedadNafarateKamel",registeract._tedadnafaratekamel,"TedadRoozTrial",registeract._tedadrooztrial,"tel_et",registeract.mostCurrent._tel_et,"TimeStamp",registeract._timestamp,"URI",registeract.mostCurrent._uri,"userDataMap",registeract.mostCurrent._userdatamap,"vahed_spinner",registeract.mostCurrent._vahed_spinner,"VideoNewAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.videonewact.class),"WaitForPay",registeract._waitforpay,"WeatherNewAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.weathernewact.class),"X1",registeract.mostCurrent._x1,"ZarinPal_Payment",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.zarinpal_payment.class)};
}
}