
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

public class sabtemahsoolact implements IRemote{
	public static sabtemahsoolact mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public sabtemahsoolact() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("sabtemahsoolact"), "ir.saelozahra.damaara.mazraeyeman.sabtemahsoolact");
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
		pcBA = new PCBA(this, sabtemahsoolact.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _grouptypelistbyid = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _grouptypelistbyname = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _namemahsoolbyname = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _cc = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone.ContentChooser");
public static RemoteObject _editmahsoolmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _config = RemoteObject.declareNull("ir.aghajari.slider.Amir_SlisderConfig");
public static RemoteObject _show = RemoteObject.declareNull("ir.aghajari.slider.Amir_SliderShow");
public static RemoteObject _x1 = RemoteObject.declareNull("anywheresoftware.b4a.object.XmlLayoutBuilder");
public static RemoteObject _witchdatepicker = RemoteObject.createImmutable("");
public static RemoteObject _pdpd = RemoteObject.declareNull("com.ParsDatePickerDialog.ParsDatePickerDialog");
public static RemoteObject _label3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _label5 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _label6 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _goroohemahsoollbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _scrollview1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
public static RemoteObject _gorooh_mahsool_spinner = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _noueabyari_spinner = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _vahed_spinner = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _nouekhakspinner = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _name_mahsool_spinner = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _save_btn = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _panelmavarededarkhasti = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _paneleashayer = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panel_keshavarzi = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _zamanekasht_et = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _sennemahsool_et = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _zamanebazderakht_et = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _zamanekesht_et = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _fasele_kasht_et = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _radif_metr_et = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _chah_et = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _zamanefasleroshd_et = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _zamane_goldehi_et = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _group1radiobutton1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper");
public static RemoteObject _group2radiobutton2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper");
public static RemoteObject _joblistegroup = RemoteObject.declareNull("ir.saelozahra.damaara.mazraeyeman.httpjob");
public static RemoteObject _downloadlistmahsooljob = RemoteObject.declareNull("ir.saelozahra.damaara.mazraeyeman.httpjob");
public static RemoteObject _submitjob = RemoteObject.declareNull("ir.saelozahra.damaara.mazraeyeman.httpjob");
public static RemoteObject _name_mahsool_lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _thisgrouptypeid = RemoteObject.createImmutable(0);
public static RemoteObject _thisproductid = RemoteObject.createImmutable(0);
public static RemoteObject _array_mavared_darkhasti = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _files = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _mavarede_darkhasti = RemoteObject.createImmutable("");
public static RemoteObject _gheshlaghdate_et = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _yeylaghdate_et = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _yeylagh_map_btn = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _gheshlagh_map_btn = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _selectpicbtn = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _bazarcheswitch = RemoteObject.declareNull("de.amberhome.objects.appcompat.ACSwitchCompatWrapper");
public static RemoteObject _imageview1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _panel_bazarche = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _tonaj_et = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _amount_et = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _zaman_eraa_et = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _bazarche_des_et = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _masahateyahtekeshet = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _editedproducttitle = RemoteObject.createImmutable("");
public static RemoteObject _editedcategoryid = RemoteObject.createImmutable("");
public static RemoteObject _editedpicurl = RemoteObject.createImmutable("");
public static RemoteObject _bsfilechooser1 = RemoteObject.declareNull("ir.blue_saffron.libs.BSFileChooser");
public static RemoteObject _ime = RemoteObject.declareNull("anywheresoftware.b4a.objects.IME");
public static RemoteObject _actionbar = RemoteObject.declareNull("de.amberhome.objects.appcompat.ACToolbarDarkWrapper");
public static ir.saelozahra.damaara.mazraeyeman.main _main = null;
public static ir.saelozahra.damaara.mazraeyeman.intro2act _intro2act = null;
public static ir.saelozahra.damaara.mazraeyeman.login_act _login_act = null;
public static ir.saelozahra.damaara.mazraeyeman.homeact _homeact = null;
public static ir.saelozahra.damaara.mazraeyeman.starter _starter = null;
public static ir.saelozahra.damaara.mazraeyeman.accuweathercronjobservice _accuweathercronjobservice = null;
public static ir.saelozahra.damaara.mazraeyeman.registeract _registeract = null;
public static ir.saelozahra.damaara.mazraeyeman.saelozahra _saelozahra = null;
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
		return new Object[] {"accuWeatherCronJobService",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.accuweathercronjobservice.class),"ActionBar",sabtemahsoolact.mostCurrent._actionbar,"Activity",sabtemahsoolact.mostCurrent._activity,"amount_et",sabtemahsoolact.mostCurrent._amount_et,"array_mavared_darkhasti",sabtemahsoolact.mostCurrent._array_mavared_darkhasti,"bazarche_des_et",sabtemahsoolact.mostCurrent._bazarche_des_et,"bazarcheMahsoolAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.bazarchemahsoolact.class),"BazarcheSwitch",sabtemahsoolact.mostCurrent._bazarcheswitch,"BSFileChooser1",sabtemahsoolact.mostCurrent._bsfilechooser1,"CC",sabtemahsoolact._cc,"chah_et",sabtemahsoolact.mostCurrent._chah_et,"Config",sabtemahsoolact.mostCurrent._config,"DateUtils",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.dateutils.class),"downloadListMahsoolJob",sabtemahsoolact.mostCurrent._downloadlistmahsooljob,"EditedCategoryID",sabtemahsoolact.mostCurrent._editedcategoryid,"EditedPicUrl",sabtemahsoolact.mostCurrent._editedpicurl,"EditedProductTitle",sabtemahsoolact.mostCurrent._editedproducttitle,"EditMahsoolMap",sabtemahsoolact._editmahsoolmap,"fasele_kasht_et",sabtemahsoolact.mostCurrent._fasele_kasht_et,"Files",sabtemahsoolact.mostCurrent._files,"FirebaseMessaging",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.firebasemessaging.class),"fullscreen_video_act",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.fullscreen_video_act.class),"gheshlagh_map_btn",sabtemahsoolact.mostCurrent._gheshlagh_map_btn,"gheshlaghdate_et",sabtemahsoolact.mostCurrent._gheshlaghdate_et,"gorooh_mahsool_spinner",sabtemahsoolact.mostCurrent._gorooh_mahsool_spinner,"gorooheMahsoolLbl",sabtemahsoolact.mostCurrent._goroohemahsoollbl,"group1RadioButton1",sabtemahsoolact.mostCurrent._group1radiobutton1,"group2RadioButton2",sabtemahsoolact.mostCurrent._group2radiobutton2,"GroupTypeListByID",sabtemahsoolact._grouptypelistbyid,"GroupTypeListByName",sabtemahsoolact._grouptypelistbyname,"HomeAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.homeact.class),"HttpUtils2Service",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.httputils2service.class),"ImageView1",sabtemahsoolact.mostCurrent._imageview1,"IME",sabtemahsoolact.mostCurrent._ime,"Intro2Act",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.intro2act.class),"jobListeGroup",sabtemahsoolact.mostCurrent._joblistegroup,"Label3",sabtemahsoolact.mostCurrent._label3,"Label5",sabtemahsoolact.mostCurrent._label5,"Label6",sabtemahsoolact.mostCurrent._label6,"login_act",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.login_act.class),"MahsoulListAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.mahsoullistact.class),"Main",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.main.class),"masahateYahteKeshET",sabtemahsoolact.mostCurrent._masahateyahtekeshet,"mavarede_darkhasti",sabtemahsoolact.mostCurrent._mavarede_darkhasti,"name_mahsool_lbl",sabtemahsoolact.mostCurrent._name_mahsool_lbl,"name_mahsool_spinner",sabtemahsoolact.mostCurrent._name_mahsool_spinner,"nameMahsoolByName",sabtemahsoolact._namemahsoolbyname,"newinst2",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.newinst2.class),"NotificationAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.notificationact.class),"noueAbyari_Spinner",sabtemahsoolact.mostCurrent._noueabyari_spinner,"noueKhakSpinner",sabtemahsoolact.mostCurrent._nouekhakspinner,"OTPConfirmAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.otpconfirmact.class),"Panel_bazarche",sabtemahsoolact.mostCurrent._panel_bazarche,"panel_keshavarzi",sabtemahsoolact.mostCurrent._panel_keshavarzi,"PaneleAshayer",sabtemahsoolact.mostCurrent._paneleashayer,"PanelMavaredeDarkhasti",sabtemahsoolact.mostCurrent._panelmavarededarkhasti,"pdpd",sabtemahsoolact.mostCurrent._pdpd,"radif_metr_et",sabtemahsoolact.mostCurrent._radif_metr_et,"RegisterAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.registeract.class),"SaeloZahra",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.saelozahra.class),"save_btn",sabtemahsoolact.mostCurrent._save_btn,"ScrollView1",sabtemahsoolact.mostCurrent._scrollview1,"select_map_act",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.select_map_act.class),"selectPicBtn",sabtemahsoolact.mostCurrent._selectpicbtn,"sennemahsool_et",sabtemahsoolact.mostCurrent._sennemahsool_et,"Show",sabtemahsoolact.mostCurrent._show,"SingleNewAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.singlenewact.class),"Starter",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.starter.class),"SubmitJob",sabtemahsoolact.mostCurrent._submitjob,"ThisGroupTypeID",sabtemahsoolact._thisgrouptypeid,"ThisProductID",sabtemahsoolact._thisproductid,"tonaj_et",sabtemahsoolact.mostCurrent._tonaj_et,"vahed_spinner",sabtemahsoolact.mostCurrent._vahed_spinner,"VideoNewAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.videonewact.class),"WeatherNewAct",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.weathernewact.class),"witchDatePicker",sabtemahsoolact.mostCurrent._witchdatepicker,"X1",sabtemahsoolact.mostCurrent._x1,"yeylagh_map_btn",sabtemahsoolact.mostCurrent._yeylagh_map_btn,"yeylaghdate_et",sabtemahsoolact.mostCurrent._yeylaghdate_et,"zaman_eraa_et",sabtemahsoolact.mostCurrent._zaman_eraa_et,"zamane_goldehi_et",sabtemahsoolact.mostCurrent._zamane_goldehi_et,"zamanebazderakht_et",sabtemahsoolact.mostCurrent._zamanebazderakht_et,"zamanefasleroshd_et",sabtemahsoolact.mostCurrent._zamanefasleroshd_et,"zamanekasht_et",sabtemahsoolact.mostCurrent._zamanekasht_et,"zamanekesht_et",sabtemahsoolact.mostCurrent._zamanekesht_et,"ZarinPal_Payment",Debug.moduleToString(ir.saelozahra.damaara.mazraeyeman.zarinpal_payment.class)};
}
}