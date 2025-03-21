
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

public class homeact implements IRemote{
	public static homeact mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public homeact() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("homeact"), "ir.saelozahra.damaara.mazraeyeman.homeact");
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
		pcBA = new PCBA(this, homeact.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _sql1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL");
public static RemoteObject _cu1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
public static RemoteObject _listitemheightmsg = RemoteObject.createImmutable(0);
public static RemoteObject _listitemheightbazarche = RemoteObject.createImmutable(0);
public static RemoteObject _placelist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _mapproductname = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _windspeedvalue = RemoteObject.createImmutable("");
public static RemoteObject _nowwind = RemoteObject.createImmutable("");
public static RemoteObject _next12hdamaha = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _next12hfaghatdama = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _next12hwindha = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _relativehumidity = RemoteObject.createImmutable("");
public static RemoteObject _uvindex = RemoteObject.createImmutable("");
public static RemoteObject _dewpointvalue = RemoteObject.createImmutable(0);
public static RemoteObject _snowvalue = RemoteObject.createImmutable(0);
public static RemoteObject _rainvalue = RemoteObject.createImmutable(0);
public static RemoteObject _provider = RemoteObject.declareNull("ir.saelozahra.damaara.mazraeyeman.fileprovider");
public static RemoteObject _dttc = RemoteObject.declareNull("ir.saelozahra.damaara.mazraeyeman.doubletaptoclose");
public static RemoteObject _actionbar = RemoteObject.declareNull("de.amberhome.objects.appcompat.ACToolbarDarkWrapper");
public static RemoteObject _ac = RemoteObject.declareNull("de.amberhome.objects.appcompat.AppCompatBase");
public static RemoteObject _sh = RemoteObject.declareNull("ir.aghajari.slider.Amir_SliderShow");
public static RemoteObject _snake = RemoteObject.declareNull("de.amberhome.objects.SnackbarWrapper");
public static RemoteObject _x1 = RemoteObject.declareNull("anywheresoftware.b4a.object.XmlLayoutBuilder");
public static RemoteObject _custombrowser = RemoteObject.declareNull("ir.jokar.customtabsbrowser.wrapper");
public static RemoteObject _bottombar = RemoteObject.declareNull("com.aghajari.smoothbottombar.AX_SmoothBottomBar");
public static RemoteObject _vp = RemoteObject.declareNull("de.amberhome.viewpager.AHViewPager");
public static RemoteObject _apkupdt = RemoteObject.declareNull("ir.saelozahra.damaara.mazraeyeman.cl_appupdate");
public static RemoteObject _sm = RemoteObject.declareNull("anywheresoftware.b4a.objects.SlidingMenuWrapper");
public static RemoteObject _lv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ListViewWrapper");
public static RemoteObject _listsearchresults = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _listsearchhasvid = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _msi = RemoteObject.declareNull("de.amberhome.materialdialogs.MaterialSimpleListItemWrapper");
public static RemoteObject _modalbuilder = RemoteObject.declareNull("de.amberhome.materialdialogs.MaterialDialogBuilderWrapper");
public static RemoteObject _sv = RemoteObject.declareNull("de.amberhome.objects.appcompat.ACSearchViewWrapper");
public static RemoteObject _si = RemoteObject.declareNull("de.amberhome.objects.appcompat.ACMenuItemWrapper");
public static RemoteObject _panelmsgs = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelweather = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _homepanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _clvmsg = RemoteObject.declareNull("ir.saelozahra.damaara.mazraeyeman.customlistview");
public static RemoteObject _zouj = RemoteObject.createImmutable(false);
public static RemoteObject _weatherwv = RemoteObject.declareNull("anywheresoftware.b4a.objects.WebViewWrapper");
public static RemoteObject _parallaxdesign = RemoteObject.declareNull("iir.wrap.Hitex_ParallaxDesign");
public static RemoteObject _homepanelheight = RemoteObject.createImmutable(0);
public static RemoteObject _multimediawv = RemoteObject.declareNull("anywheresoftware.b4a.objects.WebViewWrapper");
public static RemoteObject _swipemultimedia = RemoteObject.declareNull("ir.saelozahra.damaara.mazraeyeman.wvswipe");
public static RemoteObject _multimediapanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _bazarchewv = RemoteObject.declareNull("anywheresoftware.b4a.objects.WebViewWrapper");
public static RemoteObject _swipebazarche = RemoteObject.declareNull("ir.saelozahra.damaara.mazraeyeman.wvswipe");
public static RemoteObject _bazarchewvpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _jobsinglebazarche = RemoteObject.declareNull("ir.saelozahra.damaara.mazraeyeman.httpjob");
public static RemoteObject _jobsinglevideo = RemoteObject.declareNull("ir.saelozahra.damaara.mazraeyeman.httpjob");
public static RemoteObject _jobget12hour = RemoteObject.declareNull("ir.saelozahra.damaara.mazraeyeman.httpjob");
public static RemoteObject _jobsearch = RemoteObject.declareNull("ir.saelozahra.damaara.mazraeyeman.httpjob");
public static ir.saelozahra.damaara.mazraeyeman.main _main = null;
public static ir.saelozahra.damaara.mazraeyeman.intro2act _intro2act = null;
public static ir.saelozahra.damaara.mazraeyeman.login_act _login_act = null;
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
		return new Object[] {"AC",homeact.mostCurrent._ac,"accuWeatherCronJobService",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.accuweathercronjobservice.class),"ActionBar",homeact.mostCurrent._actionbar,"Activity",homeact.mostCurrent._activity,"apkupdt",homeact.mostCurrent._apkupdt,"bazarcheMahsoolAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.bazarchemahsoolact.class),"BazarcheWV",homeact.mostCurrent._bazarchewv,"BazarcheWVPanel",homeact.mostCurrent._bazarchewvpanel,"BottomBar",homeact.mostCurrent._bottombar,"ClvMsg",homeact.mostCurrent._clvmsg,"cu1",homeact._cu1,"customBrowser",homeact.mostCurrent._custombrowser,"DateUtils",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.dateutils.class),"DewPointValue",homeact._dewpointvalue,"DTTC",homeact.mostCurrent._dttc,"FirebaseMessaging",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.firebasemessaging.class),"fullscreen_video_act",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.fullscreen_video_act.class),"HomePanel",homeact.mostCurrent._homepanel,"HomePanelHeight",homeact._homepanelheight,"HttpUtils2Service",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.httputils2service.class),"Intro2Act",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.intro2act.class),"JobGet12Hour",homeact.mostCurrent._jobget12hour,"JobSearch",homeact.mostCurrent._jobsearch,"jobSingleBazarche",homeact.mostCurrent._jobsinglebazarche,"jobSingleVideo",homeact.mostCurrent._jobsinglevideo,"listItemHeightBazarche",homeact._listitemheightbazarche,"listItemHeightMSG",homeact._listitemheightmsg,"listSearchHasVid",homeact.mostCurrent._listsearchhasvid,"listSearchResults",homeact.mostCurrent._listsearchresults,"login_act",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.login_act.class),"lv",homeact.mostCurrent._lv,"MahsoulListAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.mahsoullistact.class),"Main",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.main.class),"mapProductName",homeact._mapproductname,"ModalBuilder",homeact.mostCurrent._modalbuilder,"msi",homeact.mostCurrent._msi,"MultiMediaPanel",homeact.mostCurrent._multimediapanel,"MultiMediaWv",homeact.mostCurrent._multimediawv,"newinst2",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.newinst2.class),"Next12HDamaha",homeact._next12hdamaha,"Next12HFaghatDama",homeact._next12hfaghatdama,"Next12HWindha",homeact._next12hwindha,"NotificationAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.notificationact.class),"NowWind",homeact._nowwind,"OTPConfirmAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.otpconfirmact.class),"PanelMsgs",homeact.mostCurrent._panelmsgs,"PanelWeather",homeact.mostCurrent._panelweather,"ParallaxDesign",homeact.mostCurrent._parallaxdesign,"PlaceList",homeact._placelist,"Provider",homeact._provider,"RainValue",homeact._rainvalue,"RegisterAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.registeract.class),"RelativeHumidity",homeact._relativehumidity,"SabteMahsoolAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.sabtemahsoolact.class),"SaeloZahra",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.saelozahra.class),"select_map_act",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.select_map_act.class),"SH",homeact.mostCurrent._sh,"si",homeact.mostCurrent._si,"SingleNewAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.singlenewact.class),"SM",homeact.mostCurrent._sm,"Snake",homeact.mostCurrent._snake,"SnowValue",homeact._snowvalue,"SQL1",homeact._sql1,"Starter",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.starter.class),"sv",homeact.mostCurrent._sv,"SwipeBazarche",homeact.mostCurrent._swipebazarche,"SwipeMultiMedia",homeact.mostCurrent._swipemultimedia,"UVIndex",homeact._uvindex,"VideoNewAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.videonewact.class),"VP",homeact.mostCurrent._vp,"WeatherNewAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.weathernewact.class),"WeatherWV",homeact.mostCurrent._weatherwv,"WindSpeedValue",homeact._windspeedvalue,"X1",homeact.mostCurrent._x1,"ZarinPal_Payment",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.zarinpal_payment.class),"Zouj",homeact._zouj};
}
}