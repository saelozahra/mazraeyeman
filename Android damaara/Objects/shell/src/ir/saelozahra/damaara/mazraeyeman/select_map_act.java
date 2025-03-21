
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

public class select_map_act implements IRemote{
	public static select_map_act mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public select_map_act() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("select_map_act"), "ir.saelozahra.damaara.mazraeyeman.select_map_act");
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
		pcBA = new PCBA(this, select_map_act.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _mylocation = RemoteObject.declareNull("anywheresoftware.b4a.gps.LocationWrapper");
public static RemoteObject _t = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
public static RemoteObject _t2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
public static RemoteObject _whatlove = RemoteObject.createImmutable("");
public static RemoteObject _place_lat = RemoteObject.createImmutable(0);
public static RemoteObject _place_lng = RemoteObject.createImmutable(0);
public static RemoteObject _gheshlagh_lat = RemoteObject.createImmutable(0);
public static RemoteObject _gheshlagh_lng = RemoteObject.createImmutable(0);
public static RemoteObject _yeylagh_lat = RemoteObject.createImmutable(0);
public static RemoteObject _yeylagh_lng = RemoteObject.createImmutable(0);
public static RemoteObject _mdialog = RemoteObject.declareNull("de.amberhome.materialdialogs.MaterialDialogBuilderWrapper");
public static RemoteObject _lista_punta = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _placelist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _x1 = RemoteObject.declareNull("anywheresoftware.b4a.object.XmlLayoutBuilder");
public static RemoteObject _sv = RemoteObject.declareNull("de.amberhome.objects.appcompat.ACSearchViewWrapper");
public static RemoteObject _gmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.MapFragmentWrapper.GoogleMapWrapper");
public static RemoteObject _cp = RemoteObject.declareNull("anywheresoftware.b4a.objects.MapFragmentWrapper.CameraPositionWrapper");
public static RemoteObject _mapfragment1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.MapFragmentWrapper");
public static RemoteObject _gme = RemoteObject.declareNull("uk.co.martinpearman.b4a.googlemapsextras.GoogleMapsExtras");
public static RemoteObject _onmylocationchangelistener1 = RemoteObject.declareNull("uk.co.martinpearman.b4a.com.google.android.gms.maps.googlemap.OnMyLocationChangeListener");
public static RemoteObject _latlng_old = RemoteObject.declareNull("anywheresoftware.b4a.objects.MapFragmentWrapper.LatLngWrapper");
public static RemoteObject _point = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _searchplace = RemoteObject.declareNull("ir.saelozahra.damaara.mazraeyeman.httpjob");
public static RemoteObject _get_my_address = RemoteObject.declareNull("ir.saelozahra.damaara.mazraeyeman.httpjob");
public static RemoteObject _getmyelevationjob = RemoteObject.declareNull("ir.saelozahra.damaara.mazraeyeman.httpjob");
public static RemoteObject _started = RemoteObject.createImmutable(false);
public static RemoteObject _address_bar_lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _time = RemoteObject.createImmutable(0);
public static RemoteObject _time2 = RemoteObject.createImmutable(0);
public static RemoteObject _search_et = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _actionbar = RemoteObject.declareNull("de.amberhome.objects.appcompat.ACToolbarLightWrapper");
public static RemoteObject _ac = RemoteObject.declareNull("de.amberhome.objects.appcompat.AppCompatBase");
public static RemoteObject _si = RemoteObject.declareNull("de.amberhome.objects.appcompat.ACMenuItemWrapper");
public static RemoteObject _panel1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _markeriv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _selectlocationbtn = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
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
public static ir.saelozahra.damaara.mazraeyeman.singlenewact _singlenewact = null;
public static ir.saelozahra.damaara.mazraeyeman.videonewact _videonewact = null;
public static ir.saelozahra.damaara.mazraeyeman.zarinpal_payment _zarinpal_payment = null;
public static ir.saelozahra.damaara.mazraeyeman.newinst2 _newinst2 = null;
public static ir.saelozahra.damaara.mazraeyeman.httputils2service _httputils2service = null;
  public Object[] GetGlobals() {
		return new Object[] {"AC",select_map_act.mostCurrent._ac,"accuWeatherCronJobService",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.accuweathercronjobservice.class),"ActionBar",select_map_act.mostCurrent._actionbar,"Activity",select_map_act.mostCurrent._activity,"address_bar_lbl",select_map_act.mostCurrent._address_bar_lbl,"bazarcheMahsoolAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.bazarchemahsoolact.class),"CP",select_map_act.mostCurrent._cp,"DateUtils",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.dateutils.class),"FirebaseMessaging",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.firebasemessaging.class),"fullscreen_video_act",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.fullscreen_video_act.class),"get_my_address",select_map_act.mostCurrent._get_my_address,"GetMyElevationJob",select_map_act.mostCurrent._getmyelevationjob,"gheshlagh_lat",select_map_act._gheshlagh_lat,"gheshlagh_lng",select_map_act._gheshlagh_lng,"gmap",select_map_act.mostCurrent._gmap,"gme",select_map_act.mostCurrent._gme,"HomeAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.homeact.class),"HttpUtils2Service",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.httputils2service.class),"Intro2Act",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.intro2act.class),"latlng_old",select_map_act.mostCurrent._latlng_old,"lista_punta",select_map_act.mostCurrent._lista_punta,"login_act",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.login_act.class),"MahsoulListAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.mahsoullistact.class),"Main",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.main.class),"MapFragment1",select_map_act.mostCurrent._mapfragment1,"MarkerIV",select_map_act.mostCurrent._markeriv,"MDialog",select_map_act.mostCurrent._mdialog,"myLocation",select_map_act._mylocation,"newinst2",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.newinst2.class),"NotificationAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.notificationact.class),"OnMyLocationChangeListener1",select_map_act.mostCurrent._onmylocationchangelistener1,"OTPConfirmAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.otpconfirmact.class),"Panel1",select_map_act.mostCurrent._panel1,"place_lat",select_map_act._place_lat,"place_lng",select_map_act._place_lng,"PlaceList",select_map_act.mostCurrent._placelist,"point",select_map_act.mostCurrent._point,"RegisterAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.registeract.class),"SabteMahsoolAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.sabtemahsoolact.class),"SaeloZahra",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.saelozahra.class),"search_et",select_map_act.mostCurrent._search_et,"SearchPlace",select_map_act.mostCurrent._searchplace,"SelectLocationBTN",select_map_act.mostCurrent._selectlocationbtn,"SI",select_map_act.mostCurrent._si,"SingleNewAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.singlenewact.class),"Started",select_map_act._started,"Starter",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.starter.class),"SV",select_map_act.mostCurrent._sv,"t",select_map_act._t,"T2",select_map_act._t2,"time",select_map_act._time,"Time2",select_map_act._time2,"VideoNewAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.videonewact.class),"WeatherNewAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.weathernewact.class),"WhatLove",select_map_act._whatlove,"X1",select_map_act.mostCurrent._x1,"yeylagh_lat",select_map_act._yeylagh_lat,"yeylagh_lng",select_map_act._yeylagh_lng,"ZarinPal_Payment",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.zarinpal_payment.class)};
}
}