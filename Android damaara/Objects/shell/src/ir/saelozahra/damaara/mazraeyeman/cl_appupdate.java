
package ir.saelozahra.damaara.mazraeyeman;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class cl_appupdate {
    public static RemoteObject myClass;
	public cl_appupdate() {
	}
    public static PCBA staticBA = new PCBA(null, cl_appupdate.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _err_nopkg = RemoteObject.createImmutable(0);
public static RemoteObject _err_notxt = RemoteObject.createImmutable(0);
public static RemoteObject _err_noapk = RemoteObject.createImmutable(0);
public static RemoteObject _err_txtrow = RemoteObject.createImmutable(0);
public static RemoteObject _err_html = RemoteObject.createImmutable(0);
public static RemoteObject _err_nospace = RemoteObject.createImmutable(0);
public static RemoteObject _err_noperm = RemoteObject.createImmutable(0);
public static RemoteObject _err_download = RemoteObject.createImmutable(0);
public static RemoteObject _err_http = RemoteObject.createImmutable(0);
public static RemoteObject _ok_init = RemoteObject.createImmutable(0);
public static RemoteObject _ok_curver = RemoteObject.createImmutable(0);
public static RemoteObject _ok_webver = RemoteObject.createImmutable(0);
public static RemoteObject _no_newerapk = RemoteObject.createImmutable(0);
public static RemoteObject _ok_newerapk = RemoteObject.createImmutable(0);
public static RemoteObject _ok_download = RemoteObject.createImmutable(0);
public static RemoteObject _ok_install = RemoteObject.createImmutable(0);
public static RemoteObject _callback = RemoteObject.declareNull("Object");
public static RemoteObject _event = RemoteObject.createImmutable("");
public static RemoteObject _spackagename = RemoteObject.createImmutable("");
public static RemoteObject _snewvertxt = RemoteObject.createImmutable("");
public static RemoteObject _snewverapk = RemoteObject.createImmutable("");
public static RemoteObject _sstatuscode = RemoteObject.createImmutable(0);
public static RemoteObject _susername = RemoteObject.createImmutable("");
public static RemoteObject _supassword = RemoteObject.createImmutable("");
public static RemoteObject _curver = RemoteObject.createImmutable("");
public static RemoteObject _webver = RemoteObject.createImmutable("");
public static RemoteObject _webclog = RemoteObject.createImmutable("");
public static RemoteObject _webfsize = RemoteObject.createImmutable("");
public static RemoteObject _sverbose = RemoteObject.createImmutable(false);
public static RemoteObject _pnlsplash = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _splashshowing = RemoteObject.createImmutable(false);
public static RemoteObject _phone = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone");
public static RemoteObject _rp = RemoteObject.declareNull("anywheresoftware.b4a.objects.RuntimePermissions");
public static RemoteObject _sharedfolder = RemoteObject.createImmutable("");
public static RemoteObject _usefileprovider = RemoteObject.createImmutable(false);
public static RemoteObject _logcolor1 = RemoteObject.createImmutable(0);
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
public static ir.saelozahra.damaara.mazraeyeman.zarinpal_payment _zarinpal_payment = null;
public static ir.saelozahra.damaara.mazraeyeman.newinst2 _newinst2 = null;
public static ir.saelozahra.damaara.mazraeyeman.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"Callback",_ref.getField(false, "_callback"),"curver",_ref.getField(false, "_curver"),"ERR_DOWNLOAD",_ref.getField(false, "_err_download"),"ERR_HTML",_ref.getField(false, "_err_html"),"ERR_HTTP",_ref.getField(false, "_err_http"),"ERR_NOAPK",_ref.getField(false, "_err_noapk"),"ERR_NOPERM",_ref.getField(false, "_err_noperm"),"ERR_NOPKG",_ref.getField(false, "_err_nopkg"),"ERR_NOSPACE",_ref.getField(false, "_err_nospace"),"ERR_NOTXT",_ref.getField(false, "_err_notxt"),"ERR_TXTROW",_ref.getField(false, "_err_txtrow"),"Event",_ref.getField(false, "_event"),"LogColor1",_ref.getField(false, "_logcolor1"),"NO_NEWERAPK",_ref.getField(false, "_no_newerapk"),"OK_CURVER",_ref.getField(false, "_ok_curver"),"OK_DOWNLOAD",_ref.getField(false, "_ok_download"),"OK_INIT",_ref.getField(false, "_ok_init"),"OK_INSTALL",_ref.getField(false, "_ok_install"),"OK_NEWERAPK",_ref.getField(false, "_ok_newerapk"),"OK_WEBVER",_ref.getField(false, "_ok_webver"),"phone",_ref.getField(false, "_phone"),"pnlSplash",_ref.getField(false, "_pnlsplash"),"rp",_ref.getField(false, "_rp"),"SharedFolder",_ref.getField(false, "_sharedfolder"),"sNewVerApk",_ref.getField(false, "_snewverapk"),"sNewVerTxt",_ref.getField(false, "_snewvertxt"),"sPackageName",_ref.getField(false, "_spackagename"),"SplashShowing",_ref.getField(false, "_splashshowing"),"sStatusCode",_ref.getField(false, "_sstatuscode"),"sUPassword",_ref.getField(false, "_supassword"),"sUserName",_ref.getField(false, "_susername"),"sVerbose",_ref.getField(false, "_sverbose"),"UseFileProvider",_ref.getField(false, "_usefileprovider"),"webclog",_ref.getField(false, "_webclog"),"webfsize",_ref.getField(false, "_webfsize"),"webver",_ref.getField(false, "_webver")};
}
}