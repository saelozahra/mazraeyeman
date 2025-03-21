package ir.saelozahra.damaara.mazraeyeman;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class registeract_subs_0 {


public static RemoteObject  _actionbar_navigationitemclick() throws Exception{
try {
		Debug.PushSubsStack("Actionbar_NavigationItemClick (registeract) ","registeract",6,registeract.mostCurrent.activityBA,registeract.mostCurrent,338);
if (RapidSub.canDelegate("actionbar_navigationitemclick")) { return ir.saelozahra.damaara.mazraeyeman.registeract.remoteMe.runUserSub(false, "registeract","actionbar_navigationitemclick");}
 BA.debugLineNum = 338;BA.debugLine="Sub Actionbar_NavigationItemClick";
Debug.ShouldStop(131072);
 BA.debugLineNum = 339;BA.debugLine="Activity.Finish";
Debug.ShouldStop(262144);
registeract.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 340;BA.debugLine="SaeloZahra.SetAnimation(\"zoom_enter\",\"zoom_exit\")";
Debug.ShouldStop(524288);
registeract.mostCurrent._saelozahra.runVoidMethod ("_setanimation" /*RemoteObject*/ ,registeract.mostCurrent.activityBA,(Object)(BA.ObjectToString("zoom_enter")),(Object)(RemoteObject.createImmutable("zoom_exit")));
 BA.debugLineNum = 341;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (registeract) ","registeract",6,registeract.mostCurrent.activityBA,registeract.mostCurrent,53);
if (RapidSub.canDelegate("activity_create")) { return ir.saelozahra.damaara.mazraeyeman.registeract.remoteMe.runUserSub(false, "registeract","activity_create", _firsttime);}
RemoteObject _listcity = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 53;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 55;BA.debugLine="SaeloZahra.SetStatusBarColor(SaeloZahra.ColorDark";
Debug.ShouldStop(4194304);
registeract.mostCurrent._saelozahra.runVoidMethod ("_setstatusbarcolor" /*RemoteObject*/ ,registeract.mostCurrent.activityBA,(Object)(registeract.mostCurrent._saelozahra._colordark /*RemoteObject*/ ));
 BA.debugLineNum = 56;BA.debugLine="Activity.LoadLayout(\"SVNewlayout\")";
Debug.ShouldStop(8388608);
registeract.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("SVNewlayout")),registeract.mostCurrent.activityBA);
 BA.debugLineNum = 57;BA.debugLine="ScrollView1.Panel.LoadLayout(\"sabte_etelaat_baghd";
Debug.ShouldStop(16777216);
registeract.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("sabte_etelaat_baghdaran_layout")),registeract.mostCurrent.activityBA);
 BA.debugLineNum = 59;BA.debugLine="IME.Initialize(\"IME\")";
Debug.ShouldStop(67108864);
registeract.mostCurrent._ime.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("IME")));
 BA.debugLineNum = 60;BA.debugLine="IME.AddHeightChangedEvent";
Debug.ShouldStop(134217728);
registeract.mostCurrent._ime.runVoidMethod ("AddHeightChangedEvent",registeract.mostCurrent.activityBA);
 BA.debugLineNum = 62;BA.debugLine="ActionBar.Color=SaeloZahra.Color";
Debug.ShouldStop(536870912);
registeract.mostCurrent._actionbar.runVoidMethod ("setColor",registeract.mostCurrent._saelozahra._color /*RemoteObject*/ );
 BA.debugLineNum = 63;BA.debugLine="ActionBar.Title=SaeloZahra.CSB(\"ثبت‌نام مزرعه دار";
Debug.ShouldStop(1073741824);
registeract.mostCurrent._actionbar.runMethod(true,"setTitle",BA.ObjectToCharSequence(registeract.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,registeract.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("ثبت‌نام مزرعه داران"))).getObject()));
 BA.debugLineNum = 64;BA.debugLine="ActionBar.TitleTextColor=Colors.White";
Debug.ShouldStop(-2147483648);
registeract.mostCurrent._actionbar.runVoidMethod ("setTitleTextColor",registeract.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 65;BA.debugLine="ActionBar.NavigationIconDrawable = X1.GetDrawable";
Debug.ShouldStop(1);
registeract.mostCurrent._actionbar.runMethod(false,"setNavigationIconDrawable",registeract.mostCurrent._x1.runMethod(false,"GetDrawable",(Object)(RemoteObject.createImmutable("baseline_arrow_back_white_24"))));
 BA.debugLineNum = 68;BA.debugLine="save_btn.Color = SaeloZahra.Color";
Debug.ShouldStop(8);
registeract.mostCurrent._save_btn.runVoidMethod ("setColor",registeract.mostCurrent._saelozahra._color /*RemoteObject*/ );
 BA.debugLineNum = 69;BA.debugLine="save_btn.textColor = Colors.White";
Debug.ShouldStop(16);
registeract.mostCurrent._save_btn.runMethod(true,"setTextColor",registeract.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 71;BA.debugLine="masahateYahteKeshET.Typeface=SaeloZahra.font";
Debug.ShouldStop(64);
registeract.mostCurrent._masahateyahtekeshet.runMethod(false,"setTypeface",(registeract.mostCurrent._saelozahra._font /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 72;BA.debugLine="Label1.Typeface=SaeloZahra.font";
Debug.ShouldStop(128);
registeract.mostCurrent._label1.runMethod(false,"setTypeface",(registeract.mostCurrent._saelozahra._font /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 73;BA.debugLine="save_btn.Typeface=SaeloZahra.font";
Debug.ShouldStop(256);
registeract.mostCurrent._save_btn.runMethod(false,"setTypeface",(registeract.mostCurrent._saelozahra._font /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 74;BA.debugLine="map_select_btn.Typeface=SaeloZahra.font";
Debug.ShouldStop(512);
registeract.mostCurrent._map_select_btn.runMethod(false,"setTypeface",(registeract.mostCurrent._saelozahra._font /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 76;BA.debugLine="name_family_et.Typeface=SaeloZahra.font";
Debug.ShouldStop(2048);
registeract.mostCurrent._name_family_et.runMethod(false,"setTypeface",(registeract.mostCurrent._saelozahra._font /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 77;BA.debugLine="tel_et.Typeface=SaeloZahra.font";
Debug.ShouldStop(4096);
registeract.mostCurrent._tel_et.runMethod(false,"setTypeface",(registeract.mostCurrent._saelozahra._font /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 78;BA.debugLine="email_et.Typeface=SaeloZahra.font";
Debug.ShouldStop(8192);
registeract.mostCurrent._email_et.runMethod(false,"setTypeface",(registeract.mostCurrent._saelozahra._font /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 79;BA.debugLine="moaref_et.Typeface=SaeloZahra.font";
Debug.ShouldStop(16384);
registeract.mostCurrent._moaref_et.runMethod(false,"setTypeface",(registeract.mostCurrent._saelozahra._font /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 80;BA.debugLine="address.Typeface=SaeloZahra.font";
Debug.ShouldStop(32768);
registeract.mostCurrent._address.runMethod(false,"setTypeface",(registeract.mostCurrent._saelozahra._font /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 81;BA.debugLine="NationalCode_et.Typeface=SaeloZahra.font";
Debug.ShouldStop(65536);
registeract.mostCurrent._nationalcode_et.runMethod(false,"setTypeface",(registeract.mostCurrent._saelozahra._font /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 82;BA.debugLine="CityACET.Typeface=SaeloZahra.font";
Debug.ShouldStop(131072);
registeract.mostCurrent._cityacet.runMethod(false,"setTypeface",(registeract.mostCurrent._saelozahra._font /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 83;BA.debugLine="ScenarioTrialLbl.Typeface=SaeloZahra.font";
Debug.ShouldStop(262144);
registeract.mostCurrent._scenariotriallbl.runMethod(false,"setTypeface",(registeract.mostCurrent._saelozahra._font /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 84;BA.debugLine="ScenarioMoneyLBL.Typeface=SaeloZahra.font";
Debug.ShouldStop(524288);
registeract.mostCurrent._scenariomoneylbl.runMethod(false,"setTypeface",(registeract.mostCurrent._saelozahra._font /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 85;BA.debugLine="SendSmsBtn.Typeface=SaeloZahra.font";
Debug.ShouldStop(1048576);
registeract.mostCurrent._sendsmsbtn.runMethod(false,"setTypeface",(registeract.mostCurrent._saelozahra._font /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 86;BA.debugLine="CodeEt.Typeface=SaeloZahra.font";
Debug.ShouldStop(2097152);
registeract.mostCurrent._codeet.runMethod(false,"setTypeface",(registeract.mostCurrent._saelozahra._font /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 87;BA.debugLine="SendSmsBtn.Color=SaeloZahra.Color";
Debug.ShouldStop(4194304);
registeract.mostCurrent._sendsmsbtn.runVoidMethod ("setColor",registeract.mostCurrent._saelozahra._color /*RemoteObject*/ );
 BA.debugLineNum = 88;BA.debugLine="SendSmsBtn.TextColor=Colors.White";
Debug.ShouldStop(8388608);
registeract.mostCurrent._sendsmsbtn.runMethod(true,"setTextColor",registeract.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 91;BA.debugLine="ScenarioTrialLBL_Click";
Debug.ShouldStop(67108864);
_scenariotriallbl_click();
 BA.debugLineNum = 93;BA.debugLine="masahateYahteKeshET.Background=SaeloZahra.CD(Sael";
Debug.ShouldStop(268435456);
registeract.mostCurrent._masahateyahtekeshet.runMethod(false,"setBackground",(registeract.mostCurrent._saelozahra.runMethod(false,"_cd" /*RemoteObject*/ ,registeract.mostCurrent.activityBA,(Object)(registeract.mostCurrent._saelozahra._colorlight /*RemoteObject*/ )).getObject()));
 BA.debugLineNum = 94;BA.debugLine="name_family_et.Background=SaeloZahra.CD(SaeloZahr";
Debug.ShouldStop(536870912);
registeract.mostCurrent._name_family_et.runMethod(false,"setBackground",(registeract.mostCurrent._saelozahra.runMethod(false,"_cd" /*RemoteObject*/ ,registeract.mostCurrent.activityBA,(Object)(registeract.mostCurrent._saelozahra._colorlight /*RemoteObject*/ )).getObject()));
 BA.debugLineNum = 95;BA.debugLine="NationalCode_et.Background=SaeloZahra.CD(SaeloZah";
Debug.ShouldStop(1073741824);
registeract.mostCurrent._nationalcode_et.runMethod(false,"setBackground",(registeract.mostCurrent._saelozahra.runMethod(false,"_cd" /*RemoteObject*/ ,registeract.mostCurrent.activityBA,(Object)(registeract.mostCurrent._saelozahra._colorlight /*RemoteObject*/ )).getObject()));
 BA.debugLineNum = 96;BA.debugLine="CityACET.Background=SaeloZahra.CD(SaeloZahra.Colo";
Debug.ShouldStop(-2147483648);
registeract.mostCurrent._cityacet.runMethod(false,"setBackground",(registeract.mostCurrent._saelozahra.runMethod(false,"_cd" /*RemoteObject*/ ,registeract.mostCurrent.activityBA,(Object)(registeract.mostCurrent._saelozahra._colorlight /*RemoteObject*/ )).getObject()));
 BA.debugLineNum = 97;BA.debugLine="tel_et.Background=SaeloZahra.CD(SaeloZahra.ColorL";
Debug.ShouldStop(1);
registeract.mostCurrent._tel_et.runMethod(false,"setBackground",(registeract.mostCurrent._saelozahra.runMethod(false,"_cd" /*RemoteObject*/ ,registeract.mostCurrent.activityBA,(Object)(registeract.mostCurrent._saelozahra._colorlight /*RemoteObject*/ )).getObject()));
 BA.debugLineNum = 98;BA.debugLine="moaref_et.Background=SaeloZahra.CD(SaeloZahra.Col";
Debug.ShouldStop(2);
registeract.mostCurrent._moaref_et.runMethod(false,"setBackground",(registeract.mostCurrent._saelozahra.runMethod(false,"_cd" /*RemoteObject*/ ,registeract.mostCurrent.activityBA,(Object)(registeract.mostCurrent._saelozahra._colorlight /*RemoteObject*/ )).getObject()));
 BA.debugLineNum = 99;BA.debugLine="email_et.Background=SaeloZahra.CD(SaeloZahra.Colo";
Debug.ShouldStop(4);
registeract.mostCurrent._email_et.runMethod(false,"setBackground",(registeract.mostCurrent._saelozahra.runMethod(false,"_cd" /*RemoteObject*/ ,registeract.mostCurrent.activityBA,(Object)(registeract.mostCurrent._saelozahra._colorlight /*RemoteObject*/ )).getObject()));
 BA.debugLineNum = 100;BA.debugLine="address.Background=SaeloZahra.CD(SaeloZahra.Color";
Debug.ShouldStop(8);
registeract.mostCurrent._address.runMethod(false,"setBackground",(registeract.mostCurrent._saelozahra.runMethod(false,"_cd" /*RemoteObject*/ ,registeract.mostCurrent.activityBA,(Object)(registeract.mostCurrent._saelozahra._colorlight /*RemoteObject*/ )).getObject()));
 BA.debugLineNum = 101;BA.debugLine="map_select_btn.Background=SaeloZahra.CD(SaeloZahr";
Debug.ShouldStop(16);
registeract.mostCurrent._map_select_btn.runMethod(false,"setBackground",(registeract.mostCurrent._saelozahra.runMethod(false,"_cd" /*RemoteObject*/ ,registeract.mostCurrent.activityBA,(Object)(registeract.mostCurrent._saelozahra._colorlight /*RemoteObject*/ )).getObject()));
 BA.debugLineNum = 103;BA.debugLine="tel_et.InputType=tel_et.INPUT_TYPE_PHONE";
Debug.ShouldStop(64);
registeract.mostCurrent._tel_et.runMethod(true,"setInputType",registeract.mostCurrent._tel_et.getField(true,"INPUT_TYPE_PHONE"));
 BA.debugLineNum = 104;BA.debugLine="NationalCode_et.InputType=tel_et.INPUT_TYPE_NUMBE";
Debug.ShouldStop(128);
registeract.mostCurrent._nationalcode_et.runMethod(true,"setInputType",registeract.mostCurrent._tel_et.getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 105;BA.debugLine="masahateYahteKeshET.InputType=tel_et.INPUT_TYPE_D";
Debug.ShouldStop(256);
registeract.mostCurrent._masahateyahtekeshet.runMethod(true,"setInputType",registeract.mostCurrent._tel_et.getField(true,"INPUT_TYPE_DECIMAL_NUMBERS"));
 BA.debugLineNum = 106;BA.debugLine="moaref_et.InputType=tel_et.INPUT_TYPE_DECIMAL_NUM";
Debug.ShouldStop(512);
registeract.mostCurrent._moaref_et.runMethod(true,"setInputType",registeract.mostCurrent._tel_et.getField(true,"INPUT_TYPE_DECIMAL_NUMBERS"));
 BA.debugLineNum = 108;BA.debugLine="If DefaultResseller > 0 Then moaref_et.Text = Def";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean(">",registeract._defaultresseller,BA.numberCast(double.class, 0))) { 
registeract.mostCurrent._moaref_et.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(registeract._defaultresseller));};
 BA.debugLineNum = 111;BA.debugLine="File.Delete(SaeloZahra.dir,\"address\")";
Debug.ShouldStop(16384);
registeract.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(registeract.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("address")));
 BA.debugLineNum = 113;BA.debugLine="vahed_spinner.Add(\"هکتار\")";
Debug.ShouldStop(65536);
registeract.mostCurrent._vahed_spinner.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("هکتار")));
 BA.debugLineNum = 114;BA.debugLine="vahed_spinner.Add(\"متر مربع\")";
Debug.ShouldStop(131072);
registeract.mostCurrent._vahed_spinner.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("متر مربع")));
 BA.debugLineNum = 124;BA.debugLine="state_spinner.Add(\"فارس\")";
Debug.ShouldStop(134217728);
registeract.mostCurrent._state_spinner.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("فارس")));
 BA.debugLineNum = 125;BA.debugLine="state_spinner.Add(\"البرز\")";
Debug.ShouldStop(268435456);
registeract.mostCurrent._state_spinner.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("البرز")));
 BA.debugLineNum = 126;BA.debugLine="state_spinner.Add(\"اصفهان\")";
Debug.ShouldStop(536870912);
registeract.mostCurrent._state_spinner.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("اصفهان")));
 BA.debugLineNum = 127;BA.debugLine="state_spinner.Add(\"اردبيل\")";
Debug.ShouldStop(1073741824);
registeract.mostCurrent._state_spinner.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("اردبيل")));
 BA.debugLineNum = 128;BA.debugLine="state_spinner.Add(\"ايلام\")";
Debug.ShouldStop(-2147483648);
registeract.mostCurrent._state_spinner.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("ايلام")));
 BA.debugLineNum = 129;BA.debugLine="state_spinner.Add(\"آذربایجان‌شرقی\")";
Debug.ShouldStop(1);
registeract.mostCurrent._state_spinner.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("آذربایجان‌شرقی")));
 BA.debugLineNum = 130;BA.debugLine="state_spinner.Add(\"آذربایجان‌غربی\")";
Debug.ShouldStop(2);
registeract.mostCurrent._state_spinner.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("آذربایجان‌غربی")));
 BA.debugLineNum = 131;BA.debugLine="state_spinner.Add(\"بوشهر\")";
Debug.ShouldStop(4);
registeract.mostCurrent._state_spinner.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("بوشهر")));
 BA.debugLineNum = 132;BA.debugLine="state_spinner.Add(\"تهران\")";
Debug.ShouldStop(8);
registeract.mostCurrent._state_spinner.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("تهران")));
 BA.debugLineNum = 133;BA.debugLine="state_spinner.Add(\"چهارمحال‌و‌بختیاری\")";
Debug.ShouldStop(16);
registeract.mostCurrent._state_spinner.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("چهارمحال‌و‌بختیاری")));
 BA.debugLineNum = 134;BA.debugLine="state_spinner.Add(\"خراسان‌جنوبی\")";
Debug.ShouldStop(32);
registeract.mostCurrent._state_spinner.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("خراسان‌جنوبی")));
 BA.debugLineNum = 135;BA.debugLine="state_spinner.Add(\"خراسان‌رضوی\")";
Debug.ShouldStop(64);
registeract.mostCurrent._state_spinner.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("خراسان‌رضوی")));
 BA.debugLineNum = 136;BA.debugLine="state_spinner.Add(\"خراسان‌شمالی\")";
Debug.ShouldStop(128);
registeract.mostCurrent._state_spinner.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("خراسان‌شمالی")));
 BA.debugLineNum = 137;BA.debugLine="state_spinner.Add(\"خوزستان\")";
Debug.ShouldStop(256);
registeract.mostCurrent._state_spinner.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("خوزستان")));
 BA.debugLineNum = 138;BA.debugLine="state_spinner.Add(\"زنجان\")";
Debug.ShouldStop(512);
registeract.mostCurrent._state_spinner.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("زنجان")));
 BA.debugLineNum = 139;BA.debugLine="state_spinner.Add(\"سمنان\")";
Debug.ShouldStop(1024);
registeract.mostCurrent._state_spinner.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("سمنان")));
 BA.debugLineNum = 140;BA.debugLine="state_spinner.Add(\"سیستان‌و‌بلوچستان\")";
Debug.ShouldStop(2048);
registeract.mostCurrent._state_spinner.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("سیستان‌و‌بلوچستان")));
 BA.debugLineNum = 141;BA.debugLine="state_spinner.Add(\"قزوين\")";
Debug.ShouldStop(4096);
registeract.mostCurrent._state_spinner.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("قزوين")));
 BA.debugLineNum = 142;BA.debugLine="state_spinner.Add(\"قم\")";
Debug.ShouldStop(8192);
registeract.mostCurrent._state_spinner.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("قم")));
 BA.debugLineNum = 143;BA.debugLine="state_spinner.Add(\"كردستان\")";
Debug.ShouldStop(16384);
registeract.mostCurrent._state_spinner.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("كردستان")));
 BA.debugLineNum = 144;BA.debugLine="state_spinner.Add(\"كرمان\")";
Debug.ShouldStop(32768);
registeract.mostCurrent._state_spinner.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("كرمان")));
 BA.debugLineNum = 145;BA.debugLine="state_spinner.Add(\"كرمانشاه\")";
Debug.ShouldStop(65536);
registeract.mostCurrent._state_spinner.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("كرمانشاه")));
 BA.debugLineNum = 146;BA.debugLine="state_spinner.Add(\"کهگیلویه‌و‌بویراحمد\")";
Debug.ShouldStop(131072);
registeract.mostCurrent._state_spinner.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("کهگیلویه‌و‌بویراحمد")));
 BA.debugLineNum = 147;BA.debugLine="state_spinner.Add(\"گلستان\")";
Debug.ShouldStop(262144);
registeract.mostCurrent._state_spinner.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("گلستان")));
 BA.debugLineNum = 148;BA.debugLine="state_spinner.Add(\"گيلان\")";
Debug.ShouldStop(524288);
registeract.mostCurrent._state_spinner.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("گيلان")));
 BA.debugLineNum = 149;BA.debugLine="state_spinner.Add(\"لرستان\")";
Debug.ShouldStop(1048576);
registeract.mostCurrent._state_spinner.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("لرستان")));
 BA.debugLineNum = 150;BA.debugLine="state_spinner.Add(\"مازندران\")";
Debug.ShouldStop(2097152);
registeract.mostCurrent._state_spinner.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("مازندران")));
 BA.debugLineNum = 151;BA.debugLine="state_spinner.Add(\"مركزي\")";
Debug.ShouldStop(4194304);
registeract.mostCurrent._state_spinner.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("مركزي")));
 BA.debugLineNum = 152;BA.debugLine="state_spinner.Add(\"هرمزگان\")";
Debug.ShouldStop(8388608);
registeract.mostCurrent._state_spinner.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("هرمزگان")));
 BA.debugLineNum = 153;BA.debugLine="state_spinner.Add(\"همدان\")";
Debug.ShouldStop(16777216);
registeract.mostCurrent._state_spinner.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("همدان")));
 BA.debugLineNum = 154;BA.debugLine="state_spinner.Add(\"يزد\")";
Debug.ShouldStop(33554432);
registeract.mostCurrent._state_spinner.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("يزد")));
 BA.debugLineNum = 157;BA.debugLine="Try";
Debug.ShouldStop(268435456);
try { BA.debugLineNum = 159;BA.debugLine="If SQL1.IsInitialized = False Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",registeract._sql1.runMethod(true,"IsInitialized"),registeract.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 160;BA.debugLine="SQL1.Initialize(SaeloZahra.dir,\"db.db\",False)";
Debug.ShouldStop(-2147483648);
registeract._sql1.runVoidMethod ("Initialize",(Object)(registeract.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(BA.ObjectToString("db.db")),(Object)(registeract.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 163;BA.debugLine="CU1 = SQL1.ExecQuery(\"SELECT * FROM ostanha\")";
Debug.ShouldStop(4);
registeract._cu1 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), registeract._sql1.runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM ostanha"))));
 BA.debugLineNum = 164;BA.debugLine="Dim listCity As List";
Debug.ShouldStop(8);
_listcity = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("listCity", _listcity);
 BA.debugLineNum = 165;BA.debugLine="listCity.Initialize";
Debug.ShouldStop(16);
_listcity.runVoidMethod ("Initialize");
 BA.debugLineNum = 166;BA.debugLine="For i = 0 To CU1.RowCount-1";
Debug.ShouldStop(32);
{
final int step85 = 1;
final int limit85 = RemoteObject.solve(new RemoteObject[] {registeract._cu1.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step85 > 0 && _i <= limit85) || (step85 < 0 && _i >= limit85) ;_i = ((int)(0 + _i + step85))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 167;BA.debugLine="CU1.Position = i";
Debug.ShouldStop(64);
registeract._cu1.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 168;BA.debugLine="listCity.Add(CU1.GetString(\"city\"))";
Debug.ShouldStop(128);
_listcity.runVoidMethod ("Add",(Object)((registeract._cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("city"))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 170;BA.debugLine="CityACET.SetItems(listCity)";
Debug.ShouldStop(512);
registeract.mostCurrent._cityacet.runVoidMethod ("SetItems",registeract.processBA,(Object)(_listcity));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e91) {
			BA.rdebugUtils.runVoidMethod("setLastException",registeract.processBA, e91.toString()); BA.debugLineNum = 173;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4096);
registeract.mostCurrent.__c.runVoidMethod ("LogImpl","45832824",BA.ObjectToString(registeract.mostCurrent.__c.runMethod(false,"LastException",registeract.mostCurrent.activityBA)),0);
 };
 BA.debugLineNum = 176;BA.debugLine="If SaeloZahra.P.SdkVersion>23 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean(">",registeract.mostCurrent._saelozahra._p /*RemoteObject*/ .runMethod(true,"getSdkVersion"),BA.numberCast(double.class, 23))) { 
 BA.debugLineNum = 177;BA.debugLine="Config.Initialize";
Debug.ShouldStop(65536);
registeract.mostCurrent._config.runVoidMethod ("Initialize",registeract.processBA);
 BA.debugLineNum = 178;BA.debugLine="Config.position(Config.POSITION_LEFT)";
Debug.ShouldStop(131072);
registeract.mostCurrent._config.runVoidMethod ("position",(Object)(registeract.mostCurrent._config.getField(true,"POSITION_LEFT")));
 BA.debugLineNum = 179;BA.debugLine="Config.primaryColor(SaeloZahra.ColorDark)";
Debug.ShouldStop(262144);
registeract.mostCurrent._config.runVoidMethod ("primaryColor",(Object)(registeract.mostCurrent._saelozahra._colordark /*RemoteObject*/ ));
 BA.debugLineNum = 180;BA.debugLine="Config.edge(True)";
Debug.ShouldStop(524288);
registeract.mostCurrent._config.runVoidMethod ("edge",(Object)(registeract.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 181;BA.debugLine="Config.sensitivity(100)";
Debug.ShouldStop(1048576);
registeract.mostCurrent._config.runVoidMethod ("sensitivity",(Object)(BA.numberCast(float.class, 100)));
 BA.debugLineNum = 182;BA.debugLine="Config.scrimColor(Colors.ARGB(180,0,0,0))";
Debug.ShouldStop(2097152);
registeract.mostCurrent._config.runVoidMethod ("scrimColor",(Object)(registeract.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 180)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))));
 BA.debugLineNum = 184;BA.debugLine="Show.convertActivityToTranslucent";
Debug.ShouldStop(8388608);
registeract.mostCurrent._show.runVoidMethod ("convertActivityToTranslucent",registeract.mostCurrent.activityBA);
 BA.debugLineNum = 185;BA.debugLine="Show.attachActivity(Config)";
Debug.ShouldStop(16777216);
registeract.mostCurrent._show.runVoidMethod ("attachActivity",registeract.mostCurrent.activityBA,(Object)(registeract.mostCurrent._config));
 };
 BA.debugLineNum = 189;BA.debugLine="MyToast.Initialize(Activity,Me,Activity.Height,Ac";
Debug.ShouldStop(268435456);
registeract.mostCurrent._mytoast.runClassMethod (ir.saelozahra.damaara.mazraeyeman.ctoast.class, "_initialize" /*RemoteObject*/ ,registeract.mostCurrent.activityBA,(Object)(registeract.mostCurrent._activity),(Object)(registeract.getObject()),(Object)(registeract.mostCurrent._activity.runMethod(true,"getHeight")),(Object)(registeract.mostCurrent._activity.runMethod(true,"getWidth")));
 BA.debugLineNum = 191;BA.debugLine="JobCheckUserName.Initialize(\"JobCheckUserName\",Me";
Debug.ShouldStop(1073741824);
registeract.mostCurrent._jobcheckusername.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_initialize" /*RemoteObject*/ ,registeract.processBA,(Object)(BA.ObjectToString("JobCheckUserName")),(Object)(registeract.getObject()));
 BA.debugLineNum = 192;BA.debugLine="JobGetPayUser.Initialize(	\"JobGetPayUser\",Me)";
Debug.ShouldStop(-2147483648);
registeract.mostCurrent._jobgetpayuser.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_initialize" /*RemoteObject*/ ,registeract.processBA,(Object)(BA.ObjectToString("JobGetPayUser")),(Object)(registeract.getObject()));
 BA.debugLineNum = 193;BA.debugLine="jobOtpGenerate.Initialize(	\"jobOtpGenerate\",Me)";
Debug.ShouldStop(1);
registeract.mostCurrent._jobotpgenerate.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_initialize" /*RemoteObject*/ ,registeract.processBA,(Object)(BA.ObjectToString("jobOtpGenerate")),(Object)(registeract.getObject()));
 BA.debugLineNum = 194;BA.debugLine="job1.Initialize(\"job1\",Me)";
Debug.ShouldStop(2);
registeract.mostCurrent._job1.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_initialize" /*RemoteObject*/ ,registeract.processBA,(Object)(BA.ObjectToString("job1")),(Object)(registeract.getObject()));
 BA.debugLineNum = 199;BA.debugLine="customBrowser.Initialize";
Debug.ShouldStop(64);
registeract.mostCurrent._custombrowser.runVoidMethod ("Initialize",registeract.mostCurrent.activityBA);
 BA.debugLineNum = 200;BA.debugLine="customBrowser.ToolbarColor = SaeloZahra.Color";
Debug.ShouldStop(128);
registeract.mostCurrent._custombrowser.runVoidMethod ("setToolbarColor",registeract.mostCurrent._saelozahra._color /*RemoteObject*/ );
 BA.debugLineNum = 201;BA.debugLine="customBrowser.ShowTitle = True";
Debug.ShouldStop(256);
registeract.mostCurrent._custombrowser.runVoidMethod ("setShowTitle",registeract.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 202;BA.debugLine="customBrowser.Build";
Debug.ShouldStop(512);
registeract.mostCurrent._custombrowser.runVoidMethod ("Build");
 BA.debugLineNum = 205;BA.debugLine="ScenarioMoneyLayout.Initialize";
Debug.ShouldStop(4096);
registeract.mostCurrent._scenariomoneylayout.runVoidMethod ("Initialize");
 BA.debugLineNum = 206;BA.debugLine="ScenarioMoneyLayout.Put(\"left\",ScenarioMoneyLBL.L";
Debug.ShouldStop(8192);
registeract.mostCurrent._scenariomoneylayout.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("left"))),(Object)((registeract.mostCurrent._scenariomoneylbl.runMethod(true,"getLeft"))));
 BA.debugLineNum = 207;BA.debugLine="ScenarioMoneyLayout.Put(\"width\",ScenarioMoneyLBL.";
Debug.ShouldStop(16384);
registeract.mostCurrent._scenariomoneylayout.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("width"))),(Object)((registeract.mostCurrent._scenariomoneylbl.runMethod(true,"getWidth"))));
 BA.debugLineNum = 208;BA.debugLine="ScenarioMoneyLayout.Put(\"top\",ScenarioMoneyLBL.To";
Debug.ShouldStop(32768);
registeract.mostCurrent._scenariomoneylayout.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("top"))),(Object)((registeract.mostCurrent._scenariomoneylbl.runMethod(true,"getTop"))));
 BA.debugLineNum = 209;BA.debugLine="ScenarioMoneyLayout.Put(\"height\",ScenarioMoneyLBL";
Debug.ShouldStop(65536);
registeract.mostCurrent._scenariomoneylayout.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("height"))),(Object)((registeract.mostCurrent._scenariomoneylbl.runMethod(true,"getHeight"))));
 BA.debugLineNum = 210;BA.debugLine="ScenarioTrialLayout.Initialize";
Debug.ShouldStop(131072);
registeract.mostCurrent._scenariotriallayout.runVoidMethod ("Initialize");
 BA.debugLineNum = 211;BA.debugLine="ScenarioTrialLayout.Put(\"left\",ScenarioTrialLbl.L";
Debug.ShouldStop(262144);
registeract.mostCurrent._scenariotriallayout.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("left"))),(Object)((registeract.mostCurrent._scenariotriallbl.runMethod(true,"getLeft"))));
 BA.debugLineNum = 212;BA.debugLine="ScenarioTrialLayout.Put(\"width\",ScenarioTrialLbl.";
Debug.ShouldStop(524288);
registeract.mostCurrent._scenariotriallayout.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("width"))),(Object)((registeract.mostCurrent._scenariotriallbl.runMethod(true,"getWidth"))));
 BA.debugLineNum = 213;BA.debugLine="ScenarioTrialLayout.Put(\"top\",ScenarioTrialLbl.To";
Debug.ShouldStop(1048576);
registeract.mostCurrent._scenariotriallayout.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("top"))),(Object)((registeract.mostCurrent._scenariotriallbl.runMethod(true,"getTop"))));
 BA.debugLineNum = 214;BA.debugLine="ScenarioTrialLayout.Put(\"height\",ScenarioTrialLbl";
Debug.ShouldStop(2097152);
registeract.mostCurrent._scenariotriallayout.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("height"))),(Object)((registeract.mostCurrent._scenariotriallbl.runMethod(true,"getHeight"))));
 BA.debugLineNum = 217;BA.debugLine="onlyTrialorMoney(\"\")";
Debug.ShouldStop(16777216);
_onlytrialormoney(RemoteObject.createImmutable(""));
 BA.debugLineNum = 219;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_keypress(RemoteObject _keycode) throws Exception{
try {
		Debug.PushSubsStack("Activity_KeyPress (registeract) ","registeract",6,registeract.mostCurrent.activityBA,registeract.mostCurrent,344);
if (RapidSub.canDelegate("activity_keypress")) { return ir.saelozahra.damaara.mazraeyeman.registeract.remoteMe.runUserSub(false, "registeract","activity_keypress", _keycode);}
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 344;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 345;BA.debugLine="If KeyCode==KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, registeract.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 346;BA.debugLine="Actionbar_NavigationItemClick";
Debug.ShouldStop(33554432);
_actionbar_navigationitemclick();
 BA.debugLineNum = 347;BA.debugLine="Return False";
Debug.ShouldStop(67108864);
if (true) return registeract.mostCurrent.__c.getField(true,"False");
 }else {
 BA.debugLineNum = 349;BA.debugLine="Return True";
Debug.ShouldStop(268435456);
if (true) return registeract.mostCurrent.__c.getField(true,"True");
 };
 BA.debugLineNum = 351;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (registeract) ","registeract",6,registeract.mostCurrent.activityBA,registeract.mostCurrent,327);
if (RapidSub.canDelegate("activity_pause")) { ir.saelozahra.damaara.mazraeyeman.registeract.remoteMe.runUserSub(false, "registeract","activity_pause", _userclosed); return;}
ResumableSub_Activity_Pause rsub = new ResumableSub_Activity_Pause(null,_userclosed);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Activity_Pause extends BA.ResumableSub {
public ResumableSub_Activity_Pause(ir.saelozahra.damaara.mazraeyeman.registeract parent,RemoteObject _userclosed) {
this.parent = parent;
this._userclosed = _userclosed;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.saelozahra.damaara.mazraeyeman.registeract parent;
RemoteObject _userclosed;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (registeract) ","registeract",6,registeract.mostCurrent.activityBA,registeract.mostCurrent,327);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 328;BA.debugLine="Sleep(0)";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("Sleep",registeract.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "registeract", "activity_pause"),BA.numberCast(int.class, 0));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 329;BA.debugLine="SaeloZahra.P.HideKeyboard(Activity)";
Debug.ShouldStop(256);
parent.mostCurrent._saelozahra._p /*RemoteObject*/ .runVoidMethod ("HideKeyboard",(Object)(parent.mostCurrent._activity));
 BA.debugLineNum = 330;BA.debugLine="Sleep(0)";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("Sleep",registeract.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "registeract", "activity_pause"),BA.numberCast(int.class, 0));
this.state = 2;
return;
case 2:
//C
this.state = -1;
;
 BA.debugLineNum = 331;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (registeract) ","registeract",6,registeract.mostCurrent.activityBA,registeract.mostCurrent,227);
if (RapidSub.canDelegate("activity_resume")) { ir.saelozahra.damaara.mazraeyeman.registeract.remoteMe.runUserSub(false, "registeract","activity_resume"); return;}
ResumableSub_Activity_Resume rsub = new ResumableSub_Activity_Resume(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Activity_Resume extends BA.ResumableSub {
public ResumableSub_Activity_Resume(ir.saelozahra.damaara.mazraeyeman.registeract parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.saelozahra.damaara.mazraeyeman.registeract parent;
RemoteObject _permission = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(false);
RemoteObject _locs = null;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (registeract) ","registeract",6,registeract.mostCurrent.activityBA,registeract.mostCurrent,227);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 230;BA.debugLine="Int1 = GetIntent";
Debug.ShouldStop(32);
parent.mostCurrent._int1 = _getintent();
 BA.debugLineNum = 231;BA.debugLine="If Int1.Action = Int1.ACTION_VIEW Then";
Debug.ShouldStop(64);
if (true) break;

case 1:
//if
this.state = 26;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._int1.runMethod(true,"getAction"),parent.mostCurrent._int1.getField(true,"ACTION_VIEW"))) { 
this.state = 3;
}else {
this.state = 21;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 232;BA.debugLine="URI=Int1.GetData";
Debug.ShouldStop(128);
parent.mostCurrent._uri = parent.mostCurrent._int1.runMethod(true,"GetData");
 BA.debugLineNum = 233;BA.debugLine="LogColor(URI,Colors.Yellow)";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","45963782",parent.mostCurrent._uri,parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Yellow"));
 BA.debugLineNum = 234;BA.debugLine="If URI.StartsWith(\"mm://mazraeyeman.ir\") Then";
Debug.ShouldStop(512);
if (true) break;

case 4:
//if
this.state = 19;
if (parent.mostCurrent._uri.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("mm://mazraeyeman.ir"))).<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 14;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 235;BA.debugLine="If URI.Replace(\"mm://mazraeyeman.ir?marja=\",\"\")";
Debug.ShouldStop(1024);
if (true) break;

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean(">",parent.mostCurrent._uri.runMethod(true,"replace",(Object)(BA.ObjectToString("mm://mazraeyeman.ir?marja=")),(Object)(RemoteObject.createImmutable(""))).runMethod(true,"length"),BA.numberCast(double.class, 5))) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 236;BA.debugLine="Snake.Initialize(\"snake\",Activity,SaeloZahra.C";
Debug.ShouldStop(2048);
parent.mostCurrent._snake.runVoidMethod ("Initialize",registeract.mostCurrent.activityBA,(Object)(BA.ObjectToString("snake")),(Object)((parent.mostCurrent._activity.getObject())),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,registeract.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("پرداخت با موفقیت انجام شد"))).getObject())),(Object)(parent.mostCurrent._snake.getField(true,"DURATION_LONG")));
 BA.debugLineNum = 237;BA.debugLine="Zarin_Pal_Request(\"موفق\",URI.Replace(\"mm://maz";
Debug.ShouldStop(4096);
_zarin_pal_request(BA.ObjectToString("موفق"),parent.mostCurrent._uri.runMethod(true,"replace",(Object)(BA.ObjectToString("mm://mazraeyeman.ir?marja=")),(Object)(RemoteObject.createImmutable(""))));
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 239;BA.debugLine="Snake.Initialize(\"snake\",Activity,SaeloZahra.C";
Debug.ShouldStop(16384);
parent.mostCurrent._snake.runVoidMethod ("Initialize",registeract.mostCurrent.activityBA,(Object)(BA.ObjectToString("snake")),(Object)((parent.mostCurrent._activity.getObject())),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,registeract.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("خطا در پرداخت"))).getObject())),(Object)(parent.mostCurrent._snake.getField(true,"DURATION_LONG")));
 if (true) break;

case 12:
//C
this.state = 19;
;
 BA.debugLineNum = 241;BA.debugLine="Snake.Show";
Debug.ShouldStop(65536);
parent.mostCurrent._snake.runVoidMethod ("Show");
 if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 243;BA.debugLine="If WaitForPay Then";
Debug.ShouldStop(262144);
if (true) break;

case 15:
//if
this.state = 18;
if (parent._waitforpay.<Boolean>get().booleanValue()) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 244;BA.debugLine="JobGetPayUser.Download(SaeloZahra.json_url&\"pa";
Debug.ShouldStop(524288);
parent.mostCurrent._jobgetpayuser.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.concat(parent.mostCurrent._saelozahra._json_url /*RemoteObject*/ ,RemoteObject.createImmutable("payment.php?tel="),parent.mostCurrent._tel_et.runMethod(true,"getText"))));
 if (true) break;

case 18:
//C
this.state = 19;
;
 if (true) break;

case 19:
//C
this.state = 26;
;
 if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 248;BA.debugLine="If WaitForPay Then";
Debug.ShouldStop(8388608);
if (true) break;

case 22:
//if
this.state = 25;
if (parent._waitforpay.<Boolean>get().booleanValue()) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 249;BA.debugLine="JobGetPayUser.Download(SaeloZahra.json_url&\"pay";
Debug.ShouldStop(16777216);
parent.mostCurrent._jobgetpayuser.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.concat(parent.mostCurrent._saelozahra._json_url /*RemoteObject*/ ,RemoteObject.createImmutable("payment.php?tel="),parent.mostCurrent._tel_et.runMethod(true,"getText"))));
 if (true) break;

case 25:
//C
this.state = 26;
;
 if (true) break;

case 26:
//C
this.state = 27;
;
 BA.debugLineNum = 258;BA.debugLine="Starter.rp.CheckAndRequest(Starter.rp.PERMISSION_";
Debug.ShouldStop(2);
parent.mostCurrent._starter._rp /*RemoteObject*/ .runVoidMethod ("CheckAndRequest",registeract.processBA,(Object)(parent.mostCurrent._starter._rp /*RemoteObject*/ .getField(true,"PERMISSION_ACCESS_FINE_LOCATION")));
 BA.debugLineNum = 259;BA.debugLine="Wait For Activity_PermissionResult (Permission As";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","activity_permissionresult", registeract.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "registeract", "activity_resume"), null);
this.state = 43;
return;
case 43:
//C
this.state = 27;
_permission = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Permission", _permission);
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 260;BA.debugLine="If Result Then CallSubDelayed(Starter, \"StartGPS\"";
Debug.ShouldStop(8);
if (true) break;

case 27:
//if
this.state = 32;
if (_result.<Boolean>get().booleanValue()) { 
this.state = 29;
;}if (true) break;

case 29:
//C
this.state = 32;
parent.mostCurrent.__c.runVoidMethod ("CallSubDelayed",registeract.processBA,(Object)((parent.mostCurrent._starter.getObject())),(Object)(RemoteObject.createImmutable("StartGPS")));
if (true) break;

case 32:
//C
this.state = 33;
;
 BA.debugLineNum = 263;BA.debugLine="ScrollView1.Panel.Height=OtherThanTelPanel.Top+Ot";
Debug.ShouldStop(64);
parent.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._otherthantelpanel.runMethod(true,"getTop"),parent.mostCurrent._otherthantelpanel.runMethod(true,"getHeight"),parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 33)))}, "++",2, 1));
 BA.debugLineNum = 266;BA.debugLine="If File.Exists(SaeloZahra.dir,\"mySeaLevel\") Then";
Debug.ShouldStop(512);
if (true) break;

case 33:
//if
this.state = 36;
if (parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("mySeaLevel"))).<Boolean>get().booleanValue()) { 
this.state = 35;
}if (true) break;

case 35:
//C
this.state = 36;
 BA.debugLineNum = 267;BA.debugLine="SeaLevel = File.ReadString(SaeloZahra.dir,\"mySea";
Debug.ShouldStop(1024);
parent.mostCurrent._sealevel = parent.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(parent.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("mySeaLevel")));
 if (true) break;
;
 BA.debugLineNum = 271;BA.debugLine="If File.Exists(SaeloZahra.dir,\"address\") Then";
Debug.ShouldStop(16384);

case 36:
//if
this.state = 39;
if (parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("address"))).<Boolean>get().booleanValue()) { 
this.state = 38;
}if (true) break;

case 38:
//C
this.state = 39;
 BA.debugLineNum = 272;BA.debugLine="address.Text=File.ReadString(SaeloZahra.dir,\"add";
Debug.ShouldStop(32768);
parent.mostCurrent._address.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(parent.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("address")))));
 if (true) break;
;
 BA.debugLineNum = 275;BA.debugLine="If ActType==\"edit\" Then";
Debug.ShouldStop(262144);

case 39:
//if
this.state = 42;
if (RemoteObject.solveBoolean("=",parent._acttype,BA.ObjectToString("edit"))) { 
this.state = 41;
}if (true) break;

case 41:
//C
this.state = 42;
 BA.debugLineNum = 277;BA.debugLine="tel_et.Enabled=False";
Debug.ShouldStop(1048576);
parent.mostCurrent._tel_et.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 279;BA.debugLine="ScenarioPanel.Enabled=False";
Debug.ShouldStop(4194304);
parent.mostCurrent._scenariopanel.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 280;BA.debugLine="SaeloZahra.SetAlpha(ScenarioPanel,0.7)";
Debug.ShouldStop(8388608);
parent.mostCurrent._saelozahra.runVoidMethod ("_setalpha" /*RemoteObject*/ ,registeract.mostCurrent.activityBA,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), parent.mostCurrent._scenariopanel.getObject()),(Object)(BA.numberCast(float.class, 0.7)));
 BA.debugLineNum = 281;BA.debugLine="ScenarioMoneyLBL.Enabled=False";
Debug.ShouldStop(16777216);
parent.mostCurrent._scenariomoneylbl.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 282;BA.debugLine="SaeloZahra.SetAlpha(ScenarioMoneyLBL,0.7)";
Debug.ShouldStop(33554432);
parent.mostCurrent._saelozahra.runVoidMethod ("_setalpha" /*RemoteObject*/ ,registeract.mostCurrent.activityBA,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), parent.mostCurrent._scenariomoneylbl.getObject()),(Object)(BA.numberCast(float.class, 0.7)));
 BA.debugLineNum = 283;BA.debugLine="ScenarioTrialLbl.Enabled=False";
Debug.ShouldStop(67108864);
parent.mostCurrent._scenariotriallbl.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 284;BA.debugLine="SaeloZahra.SetAlpha(ScenarioTrialLbl,0.7)";
Debug.ShouldStop(134217728);
parent.mostCurrent._saelozahra.runVoidMethod ("_setalpha" /*RemoteObject*/ ,registeract.mostCurrent.activityBA,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), parent.mostCurrent._scenariotriallbl.getObject()),(Object)(BA.numberCast(float.class, 0.7)));
 BA.debugLineNum = 286;BA.debugLine="SendSmsBtn.SetVisibleAnimated(313,False)";
Debug.ShouldStop(536870912);
parent.mostCurrent._sendsmsbtn.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 313)),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 287;BA.debugLine="CodeEt.SetVisibleAnimated(313,False)";
Debug.ShouldStop(1073741824);
parent.mostCurrent._codeet.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 313)),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 288;BA.debugLine="OtherThanTelPanel.SetVisibleAnimated(313,True)";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._otherthantelpanel.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 313)),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 290;BA.debugLine="Activity.Title=SaeloZahra.CSB(\"ویرایش اطلاعات با";
Debug.ShouldStop(2);
parent.mostCurrent._activity.runMethod(false,"setTitle",BA.ObjectToCharSequence(parent.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,registeract.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("ویرایش اطلاعات باغداران"))).getObject()));
 BA.debugLineNum = 291;BA.debugLine="userDataMap = File.ReadMap(SaeloZahra.dir,\"user.";
Debug.ShouldStop(4);
parent.mostCurrent._userdatamap = parent.mostCurrent.__c.getField(false,"File").runMethod(false,"ReadMap",(Object)(parent.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("user.dat")));
 BA.debugLineNum = 293;BA.debugLine="name_family_et.Text = userDataMap.Get(\"name\")";
Debug.ShouldStop(16);
parent.mostCurrent._name_family_et.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._userdatamap.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name"))))));
 BA.debugLineNum = 294;BA.debugLine="NationalCode_et.Text = userDataMap.Get(\"national";
Debug.ShouldStop(32);
parent.mostCurrent._nationalcode_et.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._userdatamap.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("nationalcode"))))));
 BA.debugLineNum = 295;BA.debugLine="tel_et.Text = userDataMap.Get(\"mobile\")";
Debug.ShouldStop(64);
parent.mostCurrent._tel_et.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._userdatamap.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("mobile"))))));
 BA.debugLineNum = 296;BA.debugLine="email_et.Text = userDataMap.Get(\"email\")";
Debug.ShouldStop(128);
parent.mostCurrent._email_et.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._userdatamap.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("email"))))));
 BA.debugLineNum = 297;BA.debugLine="CityACET.Text = userDataMap.Get(\"city\")";
Debug.ShouldStop(256);
parent.mostCurrent._cityacet.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._userdatamap.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("city"))))));
 BA.debugLineNum = 298;BA.debugLine="address.Text = userDataMap.Get(\"address\")";
Debug.ShouldStop(512);
parent.mostCurrent._address.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._userdatamap.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("address"))))));
 BA.debugLineNum = 299;BA.debugLine="masahateYahteKeshET.Text = userDataMap.Get(\"area";
Debug.ShouldStop(1024);
parent.mostCurrent._masahateyahtekeshet.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._userdatamap.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("area"))))));
 BA.debugLineNum = 300;BA.debugLine="moaref_et.Text = userDataMap.Get(\"moaref\")";
Debug.ShouldStop(2048);
parent.mostCurrent._moaref_et.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._userdatamap.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("moaref"))))));
 BA.debugLineNum = 303;BA.debugLine="state_spinner.SelectedIndex = state_spinner.Inde";
Debug.ShouldStop(16384);
parent.mostCurrent._state_spinner.runMethod(true,"setSelectedIndex",parent.mostCurrent._state_spinner.runMethod(true,"IndexOf",(Object)(BA.ObjectToString(parent.mostCurrent._userdatamap.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("state"))))))));
 BA.debugLineNum = 304;BA.debugLine="vahed_spinner.SelectedIndex = vahed_spinner.Inde";
Debug.ShouldStop(32768);
parent.mostCurrent._vahed_spinner.runMethod(true,"setSelectedIndex",parent.mostCurrent._vahed_spinner.runMethod(true,"IndexOf",(Object)(BA.ObjectToString(parent.mostCurrent._userdatamap.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("unit"))))))));
 BA.debugLineNum = 306;BA.debugLine="Dim locs() As String = Regex.Split(\",\", userData";
Debug.ShouldStop(131072);
_locs = parent.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(",")),(Object)(BA.ObjectToString(parent.mostCurrent._userdatamap.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("location")))))));Debug.locals.put("locs", _locs);Debug.locals.put("locs", _locs);
 BA.debugLineNum = 310;BA.debugLine="File.WriteString(SaeloZahra.dir,\"place_lat\",locs";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(parent.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(BA.ObjectToString("place_lat")),(Object)(_locs.getArrayElement(true,BA.numberCast(int.class, 0))));
 BA.debugLineNum = 311;BA.debugLine="File.WriteString(SaeloZahra.dir,\"place_lng\",locs";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(parent.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(BA.ObjectToString("place_lng")),(Object)(_locs.getArrayElement(true,BA.numberCast(int.class, 1))));
 BA.debugLineNum = 314;BA.debugLine="JobGetPayUser.Download(SaeloZahra.json_url&\"paym";
Debug.ShouldStop(33554432);
parent.mostCurrent._jobgetpayuser.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.concat(parent.mostCurrent._saelozahra._json_url /*RemoteObject*/ ,RemoteObject.createImmutable("payment.php?tel="),parent.mostCurrent._tel_et.runMethod(true,"getText"))));
 BA.debugLineNum = 322;BA.debugLine="save_btn.Text=\"ویرایش اطلاعات\"";
Debug.ShouldStop(2);
parent.mostCurrent._save_btn.runMethod(true,"setText",BA.ObjectToCharSequence("ویرایش اطلاعات"));
 if (true) break;

case 42:
//C
this.state = -1;
;
 BA.debugLineNum = 325;BA.debugLine="End Sub";
Debug.ShouldStop(16);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _activity_permissionresult(RemoteObject _permission,RemoteObject _result) throws Exception{
}
public static RemoteObject  _codeet_enterpressed() throws Exception{
try {
		Debug.PushSubsStack("CodeEt_EnterPressed (registeract) ","registeract",6,registeract.mostCurrent.activityBA,registeract.mostCurrent,787);
if (RapidSub.canDelegate("codeet_enterpressed")) { return ir.saelozahra.damaara.mazraeyeman.registeract.remoteMe.runUserSub(false, "registeract","codeet_enterpressed");}
 BA.debugLineNum = 787;BA.debugLine="Sub CodeEt_EnterPressed";
Debug.ShouldStop(262144);
 BA.debugLineNum = 788;BA.debugLine="SendSmsBtn_Click";
Debug.ShouldStop(524288);
_sendsmsbtn_click();
 BA.debugLineNum = 789;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _email_et_focuschanged(RemoteObject _hasfocus) throws Exception{
try {
		Debug.PushSubsStack("email_et_FocusChanged (registeract) ","registeract",6,registeract.mostCurrent.activityBA,registeract.mostCurrent,557);
if (RapidSub.canDelegate("email_et_focuschanged")) { return ir.saelozahra.damaara.mazraeyeman.registeract.remoteMe.runUserSub(false, "registeract","email_et_focuschanged", _hasfocus);}
Debug.locals.put("HasFocus", _hasfocus);
 BA.debugLineNum = 557;BA.debugLine="Sub email_et_FocusChanged (HasFocus As Boolean)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 558;BA.debugLine="If Not(HasFocus) And email_et.Text<>\"\" Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean(".",registeract.mostCurrent.__c.runMethod(true,"Not",(Object)(_hasfocus))) && RemoteObject.solveBoolean("!",registeract.mostCurrent._email_et.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 559;BA.debugLine="If Not(SaeloZahra.ValidateEmail(email_et.Text))";
Debug.ShouldStop(16384);
if (registeract.mostCurrent.__c.runMethod(true,"Not",(Object)(registeract.mostCurrent._saelozahra.runMethod(true,"_validateemail" /*RemoteObject*/ ,registeract.mostCurrent.activityBA,(Object)(registeract.mostCurrent._email_et.runMethod(true,"getText"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 560;BA.debugLine="email_et.SelectAll";
Debug.ShouldStop(32768);
registeract.mostCurrent._email_et.runVoidMethod ("SelectAll");
 BA.debugLineNum = 561;BA.debugLine="errorText=\"پست الکترونیک صحیح را وارد کنید\"";
Debug.ShouldStop(65536);
registeract.mostCurrent._errortext = BA.ObjectToString("پست الکترونیک صحیح را وارد کنید");
 BA.debugLineNum = 562;BA.debugLine="MyToast.ToastMessageShow2(SaeloZahra.CSB(errorT";
Debug.ShouldStop(131072);
registeract.mostCurrent._mytoast.runClassMethod (ir.saelozahra.damaara.mazraeyeman.ctoast.class, "_toastmessageshow2" /*void*/ ,(Object)(BA.ObjectToString(registeract.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,registeract.mostCurrent.activityBA,(Object)(registeract.mostCurrent._errortext)))),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.ObjectToString("")),(Object)(BA.numberCast(long.class, registeract.mostCurrent.__c.getField(false,"Colors").getField(true,"White"))),(Object)(BA.numberCast(long.class, registeract.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"))),(Object)(BA.numberCast(int.class, 15)),(Object)(registeract.mostCurrent.__c.getField(true,"True")));
 }else {
 BA.debugLineNum = 564;BA.debugLine="errorText=\"\"";
Debug.ShouldStop(524288);
registeract.mostCurrent._errortext = BA.ObjectToString("");
 };
 };
 BA.debugLineNum = 567;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getintent() throws Exception{
try {
		Debug.PushSubsStack("GetIntent (registeract) ","registeract",6,registeract.mostCurrent.activityBA,registeract.mostCurrent,221);
if (RapidSub.canDelegate("getintent")) { return ir.saelozahra.damaara.mazraeyeman.registeract.remoteMe.runUserSub(false, "registeract","getintent");}
RemoteObject _sr = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
 BA.debugLineNum = 221;BA.debugLine="Sub GetIntent As Intent";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 222;BA.debugLine="Dim sR As Reflector";
Debug.ShouldStop(536870912);
_sr = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("sR", _sr);
 BA.debugLineNum = 223;BA.debugLine="sR.Target=sR.GetActivity";
Debug.ShouldStop(1073741824);
_sr.setField ("Target",(_sr.runMethod(false,"GetActivity",registeract.processBA)));
 BA.debugLineNum = 224;BA.debugLine="Return sR.RunMethod(\"getIntent\")";
Debug.ShouldStop(-2147483648);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.IntentWrapper"), _sr.runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getIntent"))));
 BA.debugLineNum = 225;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 24;BA.debugLine="Dim X1 As XmlLayoutBuilder";
registeract.mostCurrent._x1 = RemoteObject.createNew ("anywheresoftware.b4a.object.XmlLayoutBuilder");
 //BA.debugLineNum = 25;BA.debugLine="Dim errorText As String=\"\"";
registeract.mostCurrent._errortext = BA.ObjectToString("");
 //BA.debugLineNum = 26;BA.debugLine="Dim job1,jobOtpGenerate,JobGetPayUser,JobCheckUse";
registeract.mostCurrent._job1 = RemoteObject.createNew ("ir.saelozahra.damaara.mazraeyeman.httpjob");
registeract.mostCurrent._jobotpgenerate = RemoteObject.createNew ("ir.saelozahra.damaara.mazraeyeman.httpjob");
registeract.mostCurrent._jobgetpayuser = RemoteObject.createNew ("ir.saelozahra.damaara.mazraeyeman.httpjob");
registeract.mostCurrent._jobcheckusername = RemoteObject.createNew ("ir.saelozahra.damaara.mazraeyeman.httpjob");
 //BA.debugLineNum = 27;BA.debugLine="Private ScenarioTrialLbl,ScenarioMoneyLBL,Label1";
registeract.mostCurrent._scenariotriallbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
registeract.mostCurrent._scenariomoneylbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
registeract.mostCurrent._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private ScrollView1 As ScrollView";
registeract.mostCurrent._scrollview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private save_btn,map_select_btn As Button";
registeract.mostCurrent._save_btn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
registeract.mostCurrent._map_select_btn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private name_family_et,email_et,tel_et,address,ma";
registeract.mostCurrent._name_family_et = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
registeract.mostCurrent._email_et = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
registeract.mostCurrent._tel_et = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
registeract.mostCurrent._address = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
registeract.mostCurrent._masahateyahtekeshet = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
registeract.mostCurrent._moaref_et = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
registeract.mostCurrent._nationalcode_et = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private vahed_spinner,state_spinner As Spinner";
registeract.mostCurrent._vahed_spinner = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
registeract.mostCurrent._state_spinner = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Dim IME As IME";
registeract.mostCurrent._ime = RemoteObject.createNew ("anywheresoftware.b4a.objects.IME");
 //BA.debugLineNum = 33;BA.debugLine="Dim Int1 As Intent";
registeract.mostCurrent._int1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Dim URI As String";
registeract.mostCurrent._uri = RemoteObject.createImmutable("");
 //BA.debugLineNum = 35;BA.debugLine="Dim SeaLevel As String";
registeract.mostCurrent._sealevel = RemoteObject.createImmutable("");
 //BA.debugLineNum = 36;BA.debugLine="Dim userDataMap As Map";
registeract.mostCurrent._userdatamap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 37;BA.debugLine="Private ActionBar As ACToolBarDark";
registeract.mostCurrent._actionbar = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACToolbarDarkWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Dim CityACET As AutoCompleteEditText";
registeract.mostCurrent._cityacet = RemoteObject.createNew ("anywheresoftware.b4a.objects.AutoCompleteEditTextWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Dim Config 	As Amir_SliderConfig";
registeract.mostCurrent._config = RemoteObject.createNew ("ir.aghajari.slider.Amir_SlisderConfig");
 //BA.debugLineNum = 40;BA.debugLine="Dim Show 	As Amir_SliderShow";
registeract.mostCurrent._show = RemoteObject.createNew ("ir.aghajari.slider.Amir_SliderShow");
 //BA.debugLineNum = 41;BA.debugLine="Dim MyToast As CToast";
registeract.mostCurrent._mytoast = RemoteObject.createNew ("ir.saelozahra.damaara.mazraeyeman.ctoast");
 //BA.debugLineNum = 42;BA.debugLine="Dim Snake As DSSnackbar";
registeract.mostCurrent._snake = RemoteObject.createNew ("de.amberhome.objects.SnackbarWrapper");
 //BA.debugLineNum = 43;BA.debugLine="Private ScenarioPanel As Panel";
registeract.mostCurrent._scenariopanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 44;BA.debugLine="Dim customBrowser As JK_CustomTabsBrowser";
registeract.mostCurrent._custombrowser = RemoteObject.createNew ("ir.jokar.customtabsbrowser.wrapper");
 //BA.debugLineNum = 45;BA.debugLine="Dim ScenarioMoneyLayout,ScenarioTrialLayout As Ma";
registeract.mostCurrent._scenariomoneylayout = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
registeract.mostCurrent._scenariotriallayout = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 46;BA.debugLine="Dim WaitForPay As Boolean = False";
registeract._waitforpay = registeract.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 48;BA.debugLine="Private SendSmsBtn As Button";
registeract.mostCurrent._sendsmsbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 49;BA.debugLine="Private CodeEt As EditText";
registeract.mostCurrent._codeet = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 50;BA.debugLine="Private OtherThanTelPanel As B4XView";
registeract.mostCurrent._otherthantelpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _ime_heightchanged(RemoteObject _newheight,RemoteObject _oldheight) throws Exception{
try {
		Debug.PushSubsStack("IME_HeightChanged (registeract) ","registeract",6,registeract.mostCurrent.activityBA,registeract.mostCurrent,553);
if (RapidSub.canDelegate("ime_heightchanged")) { return ir.saelozahra.damaara.mazraeyeman.registeract.remoteMe.runUserSub(false, "registeract","ime_heightchanged", _newheight, _oldheight);}
Debug.locals.put("NewHeight", _newheight);
Debug.locals.put("OldHeight", _oldheight);
 BA.debugLineNum = 553;BA.debugLine="Sub IME_HeightChanged(NewHeight As Int, OldHeight";
Debug.ShouldStop(256);
 BA.debugLineNum = 554;BA.debugLine="ScrollView1.Height = NewHeight-ScrollView1.Top";
Debug.ShouldStop(512);
registeract.mostCurrent._scrollview1.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {_newheight,registeract.mostCurrent._scrollview1.runMethod(true,"getTop")}, "-",1, 1));
 BA.debugLineNum = 555;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("jobDone (registeract) ","registeract",6,registeract.mostCurrent.activityBA,registeract.mostCurrent,466);
if (RapidSub.canDelegate("jobdone")) { return ir.saelozahra.damaara.mazraeyeman.registeract.remoteMe.runUserSub(false, "registeract","jobdone", _job);}
RemoteObject _payparser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _payroot = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _paycolroot = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("job", _job);
 BA.debugLineNum = 466;BA.debugLine="Sub jobDone(job As HttpJob)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 467;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(262144);
registeract.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 468;BA.debugLine="If job.Success Then";
Debug.ShouldStop(524288);
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 469;BA.debugLine="LogColor(job.JobName&\" | \"&job.GetString,Colors.";
Debug.ShouldStop(1048576);
registeract.mostCurrent.__c.runVoidMethod ("LogImpl","46488067",RemoteObject.concat(_job.getField(true,"_jobname" /*RemoteObject*/ ),RemoteObject.createImmutable(" | "),_job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_getstring" /*RemoteObject*/ )),registeract.mostCurrent.__c.getField(false,"Colors").getField(true,"Yellow"));
 BA.debugLineNum = 471;BA.debugLine="Select job.JobName";
Debug.ShouldStop(4194304);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("JobCheckUserName"),BA.ObjectToString("JobGetPayUser"),BA.ObjectToString("jobOtpGenerate"),BA.ObjectToString("job1"))) {
case 0: {
 BA.debugLineNum = 473;BA.debugLine="Select job.GetString";
Debug.ShouldStop(16777216);
switch (BA.switchObjectToInt(_job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_getstring" /*RemoteObject*/ ),BA.ObjectToString("enter tel"),BA.ObjectToString("tel Repetitious"))) {
case 0: {
 BA.debugLineNum = 475;BA.debugLine="MyToast.ToastMessageShow2(SaeloZahra.CSB(\"شم";
Debug.ShouldStop(67108864);
registeract.mostCurrent._mytoast.runClassMethod (ir.saelozahra.damaara.mazraeyeman.ctoast.class, "_toastmessageshow2" /*void*/ ,(Object)(BA.ObjectToString(registeract.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,registeract.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("شماره تماس ر ا وارد کنید"))))),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.ObjectToString("")),(Object)(BA.numberCast(long.class, registeract.mostCurrent.__c.getField(false,"Colors").getField(true,"White"))),(Object)(BA.numberCast(long.class, registeract.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"))),(Object)(BA.numberCast(int.class, 15)),(Object)(registeract.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 476;BA.debugLine="tel_et.RequestFocus";
Debug.ShouldStop(134217728);
registeract.mostCurrent._tel_et.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 477;BA.debugLine="tel_et.SelectAll";
Debug.ShouldStop(268435456);
registeract.mostCurrent._tel_et.runVoidMethod ("SelectAll");
 break; }
case 1: {
 BA.debugLineNum = 479;BA.debugLine="MyToast.ToastMessageShow2(SaeloZahra.CSB(\"شم";
Debug.ShouldStop(1073741824);
registeract.mostCurrent._mytoast.runClassMethod (ir.saelozahra.damaara.mazraeyeman.ctoast.class, "_toastmessageshow2" /*void*/ ,(Object)(BA.ObjectToString(registeract.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,registeract.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("شماره تماس تکراریست"))))),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.ObjectToString("")),(Object)(BA.numberCast(long.class, registeract.mostCurrent.__c.getField(false,"Colors").getField(true,"White"))),(Object)(BA.numberCast(long.class, registeract.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"))),(Object)(BA.numberCast(int.class, 15)),(Object)(registeract.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 480;BA.debugLine="tel_et.RequestFocus";
Debug.ShouldStop(-2147483648);
registeract.mostCurrent._tel_et.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 481;BA.debugLine="tel_et.SelectAll";
Debug.ShouldStop(1);
registeract.mostCurrent._tel_et.runVoidMethod ("SelectAll");
 BA.debugLineNum = 482;BA.debugLine="SendSmsBtn.Enabled=False";
Debug.ShouldStop(2);
registeract.mostCurrent._sendsmsbtn.runMethod(true,"setEnabled",registeract.mostCurrent.__c.getField(true,"False"));
 break; }
default: {
 BA.debugLineNum = 484;BA.debugLine="SendSmsBtn.Enabled=True";
Debug.ShouldStop(8);
registeract.mostCurrent._sendsmsbtn.runMethod(true,"setEnabled",registeract.mostCurrent.__c.getField(true,"True"));
 break; }
}
;
 break; }
case 1: {
 BA.debugLineNum = 487;BA.debugLine="If job.GetString<>\"\"\"not found\"\"\" Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("!",_job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_getstring" /*RemoteObject*/ ),BA.ObjectToString("\"not found\""))) { 
 BA.debugLineNum = 489;BA.debugLine="Dim PayParser As JSONParser";
Debug.ShouldStop(256);
_payparser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("PayParser", _payparser);
 BA.debugLineNum = 490;BA.debugLine="PayParser.Initialize(job.GetString)";
Debug.ShouldStop(512);
_payparser.runVoidMethod ("Initialize",(Object)(_job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 491;BA.debugLine="Dim PayRoot As List = PayParser.NextArray";
Debug.ShouldStop(1024);
_payroot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_payroot = _payparser.runMethod(false,"NextArray");Debug.locals.put("PayRoot", _payroot);Debug.locals.put("PayRoot", _payroot);
 BA.debugLineNum = 492;BA.debugLine="For Each PayColroot As Map In PayRoot";
Debug.ShouldStop(2048);
_paycolroot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group24 = _payroot;
final int groupLen24 = group24.runMethod(true,"getSize").<Integer>get()
;int index24 = 0;
;
for (; index24 < groupLen24;index24++){
_paycolroot = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group24.runMethod(false,"Get",index24));Debug.locals.put("PayColroot", _paycolroot);
Debug.locals.put("PayColroot", _paycolroot);
 BA.debugLineNum = 493;BA.debugLine="If PayColroot.Get(\"amount\") > \"50000\" Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _paycolroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("amount"))))),BA.numberCast(double.class, "50000"))) { 
 BA.debugLineNum = 495;BA.debugLine="Payed=1";
Debug.ShouldStop(16384);
registeract._payed = BA.numberCast(int.class, 1);
 };
 }
}Debug.locals.put("PayColroot", _paycolroot);
;
 };
 BA.debugLineNum = 499;BA.debugLine="If SaeloZahra.RayganHast Then Payed = 1";
Debug.ShouldStop(262144);
if (registeract.mostCurrent._saelozahra._rayganhast /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
registeract._payed = BA.numberCast(int.class, 1);};
 break; }
case 2: {
 BA.debugLineNum = 502;BA.debugLine="CodeEt.SetVisibleAnimated(313,True)";
Debug.ShouldStop(2097152);
registeract.mostCurrent._codeet.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 313)),(Object)(registeract.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 503;BA.debugLine="SendSmsBtn.SetLayoutAnimated(313,SendSmsBtn.L";
Debug.ShouldStop(4194304);
registeract.mostCurrent._sendsmsbtn.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 313)),(Object)(registeract.mostCurrent._sendsmsbtn.runMethod(true,"getLeft")),(Object)(registeract.mostCurrent._sendsmsbtn.runMethod(true,"getTop")),(Object)(registeract.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80)))),(Object)(registeract.mostCurrent._sendsmsbtn.runMethod(true,"getHeight")));
 BA.debugLineNum = 504;BA.debugLine="SendSmsBtn.Text=\"تائید\"";
Debug.ShouldStop(8388608);
registeract.mostCurrent._sendsmsbtn.runMethod(true,"setText",BA.ObjectToCharSequence("تائید"));
 break; }
case 3: {
 BA.debugLineNum = 507;BA.debugLine="If job.GetString == \"success\" Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_getstring" /*RemoteObject*/ ),BA.ObjectToString("success"))) { 
 BA.debugLineNum = 508;BA.debugLine="File.WriteString(SaeloZahra.dir,\"usrnm\",tel_e";
Debug.ShouldStop(134217728);
registeract.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(registeract.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(BA.ObjectToString("usrnm")),(Object)(registeract.mostCurrent._tel_et.runMethod(true,"getText")));
 BA.debugLineNum = 509;BA.debugLine="File.WriteString(SaeloZahra.dir,\"pswd\",tel_et";
Debug.ShouldStop(268435456);
registeract.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(registeract.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(BA.ObjectToString("pswd")),(Object)(registeract.mostCurrent._tel_et.runMethod(true,"getText")));
 BA.debugLineNum = 510;BA.debugLine="StartService(accuWeatherCronJobService)";
Debug.ShouldStop(536870912);
registeract.mostCurrent.__c.runVoidMethod ("StartService",registeract.processBA,(Object)((registeract.mostCurrent._accuweathercronjobservice.getObject())));
 BA.debugLineNum = 511;BA.debugLine="SaeloZahra.beep(\"button-20.mp3\")";
Debug.ShouldStop(1073741824);
registeract.mostCurrent._saelozahra.runVoidMethod ("_beep" /*RemoteObject*/ ,registeract.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("button-20.mp3")));
 BA.debugLineNum = 512;BA.debugLine="ToastMessageShow(SaeloZahra.CSB(\"ثبت نام با م";
Debug.ShouldStop(-2147483648);
registeract.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(registeract.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,registeract.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("ثبت نام با موفقیت انجام شد"))).getObject())),(Object)(registeract.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 513;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1);
registeract.mostCurrent._activity.runVoidMethod ("Finish");
 }else 
{ BA.debugLineNum = 514;BA.debugLine="Else If job.GetString == \"updated\" Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_getstring" /*RemoteObject*/ ),BA.ObjectToString("updated"))) { 
 BA.debugLineNum = 515;BA.debugLine="ToastMessageShow(SaeloZahra.CSB(\"اطلاعات شما";
Debug.ShouldStop(4);
registeract.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(registeract.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,registeract.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("اطلاعات شما با موفقیت ویرایش شد"))).getObject())),(Object)(registeract.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 516;BA.debugLine="ToastMessageShow(SaeloZahra.CSB(\"در ورود بعدی";
Debug.ShouldStop(8);
registeract.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(registeract.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,registeract.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("در ورود بعدی شما به سامانه ، اطلاعات جدید بارگزاری میشود"))).getObject())),(Object)(registeract.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 517;BA.debugLine="Activity.Finish";
Debug.ShouldStop(16);
registeract.mostCurrent._activity.runVoidMethod ("Finish");
 }else 
{ BA.debugLineNum = 518;BA.debugLine="Else If job.GetString == \"shomare mobile sahih";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_getstring" /*RemoteObject*/ ),BA.ObjectToString("shomare mobile sahih nist"))) { 
 BA.debugLineNum = 519;BA.debugLine="tel_et.RequestFocus";
Debug.ShouldStop(64);
registeract.mostCurrent._tel_et.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 520;BA.debugLine="MyToast.ToastMessageShow2(SaeloZahra.CSB(\"شما";
Debug.ShouldStop(128);
registeract.mostCurrent._mytoast.runClassMethod (ir.saelozahra.damaara.mazraeyeman.ctoast.class, "_toastmessageshow2" /*void*/ ,(Object)(BA.ObjectToString(registeract.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,registeract.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("شماره تماس صحیح نیست"))))),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.ObjectToString("")),(Object)(BA.numberCast(long.class, registeract.mostCurrent.__c.getField(false,"Colors").getField(true,"White"))),(Object)(BA.numberCast(long.class, registeract.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"))),(Object)(BA.numberCast(int.class, 15)),(Object)(registeract.mostCurrent.__c.getField(true,"True")));
 }else 
{ BA.debugLineNum = 522;BA.debugLine="Else If job.GetString == \"wrong email\" Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_getstring" /*RemoteObject*/ ),BA.ObjectToString("wrong email"))) { 
 BA.debugLineNum = 523;BA.debugLine="email_et.RequestFocus";
Debug.ShouldStop(1024);
registeract.mostCurrent._email_et.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 524;BA.debugLine="ToastMessageShow(SaeloZahra.CSB(\"پست الکترونی";
Debug.ShouldStop(2048);
registeract.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(registeract.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,registeract.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("پست الکترونیک وارد شده اشتباه است"))).getObject())),(Object)(registeract.mostCurrent.__c.getField(true,"True")));
 }else 
{ BA.debugLineNum = 525;BA.debugLine="Else If job.GetString == \"insert all fields\" T";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_getstring" /*RemoteObject*/ ),BA.ObjectToString("insert all fields"))) { 
 BA.debugLineNum = 526;BA.debugLine="ToastMessageShow(SaeloZahra.CSB(\"تمام فیلد ها";
Debug.ShouldStop(8192);
registeract.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(registeract.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,registeract.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("تمام فیلد ها را وارد کنید"))).getObject())),(Object)(registeract.mostCurrent.__c.getField(true,"True")));
 }else 
{ BA.debugLineNum = 527;BA.debugLine="Else If job.GetString == \"tel Repetitious\" The";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_getstring" /*RemoteObject*/ ),BA.ObjectToString("tel Repetitious"))) { 
 BA.debugLineNum = 528;BA.debugLine="tel_et.RequestFocus";
Debug.ShouldStop(32768);
registeract.mostCurrent._tel_et.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 529;BA.debugLine="ToastMessageShow(SaeloZahra.CSB(\"شماره تماس ت";
Debug.ShouldStop(65536);
registeract.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(registeract.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,registeract.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("شماره تماس تکراریست"))).getObject())),(Object)(registeract.mostCurrent.__c.getField(true,"True")));
 }else {
 BA.debugLineNum = 532;BA.debugLine="If job.ErrorMessage.Contains(\"Unable to resol";
Debug.ShouldStop(524288);
if (_job.getField(true,"_errormessage" /*RemoteObject*/ ).runMethod(true,"contains",(Object)(RemoteObject.createImmutable("Unable to resolve host"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 533;BA.debugLine="ToastMessageShow(SaeloZahra.CSB(\" اینترنتتون";
Debug.ShouldStop(1048576);
registeract.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(registeract.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,registeract.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable(" اینترنتتون وصل نیست "))).getObject())),(Object)(registeract.mostCurrent.__c.getField(true,"True")));
 }else {
 BA.debugLineNum = 535;BA.debugLine="ToastMessageShow(SaeloZahra.CSB(\" خطا در ورو";
Debug.ShouldStop(4194304);
registeract.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(registeract.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,registeract.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable(" خطا در ورود "))),registeract.mostCurrent.__c.getField(true,"CRLF"),_job.getField(true,"_errormessage" /*RemoteObject*/ )))),(Object)(registeract.mostCurrent.__c.getField(true,"True")));
 };
 }}}}}}
;
 break; }
}
;
 }else {
 BA.debugLineNum = 543;BA.debugLine="If job.ErrorMessage.Contains(\"Unable to resolve";
Debug.ShouldStop(1073741824);
if (_job.getField(true,"_errormessage" /*RemoteObject*/ ).runMethod(true,"contains",(Object)(RemoteObject.createImmutable("Unable to resolve host"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 544;BA.debugLine="ToastMessageShow(SaeloZahra.CSB(\" اینترنتتون وص";
Debug.ShouldStop(-2147483648);
registeract.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(registeract.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,registeract.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable(" اینترنتتون وصل نیست "))).getObject())),(Object)(registeract.mostCurrent.__c.getField(true,"True")));
 }else {
 BA.debugLineNum = 546;BA.debugLine="ToastMessageShow(SaeloZahra.CSB(\" خطا در ورود \"";
Debug.ShouldStop(2);
registeract.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(registeract.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,registeract.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable(" خطا در ورود "))),registeract.mostCurrent.__c.getField(true,"CRLF"),_job.getField(true,"_errormessage" /*RemoteObject*/ )))),(Object)(registeract.mostCurrent.__c.getField(true,"True")));
 };
 };
 BA.debugLineNum = 549;BA.debugLine="job.Release";
Debug.ShouldStop(16);
_job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 550;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _map_select_btn_click() throws Exception{
try {
		Debug.PushSubsStack("map_select_btn_Click (registeract) ","registeract",6,registeract.mostCurrent.activityBA,registeract.mostCurrent,354);
if (RapidSub.canDelegate("map_select_btn_click")) { return ir.saelozahra.damaara.mazraeyeman.registeract.remoteMe.runUserSub(false, "registeract","map_select_btn_click");}
 BA.debugLineNum = 354;BA.debugLine="Sub map_select_btn_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 355;BA.debugLine="SaeloZahra.SetAnimation(\"zoom_exit\",\"zoom_enter\")";
Debug.ShouldStop(4);
registeract.mostCurrent._saelozahra.runVoidMethod ("_setanimation" /*RemoteObject*/ ,registeract.mostCurrent.activityBA,(Object)(BA.ObjectToString("zoom_exit")),(Object)(RemoteObject.createImmutable("zoom_enter")));
 BA.debugLineNum = 356;BA.debugLine="StartActivity(select_map_act)";
Debug.ShouldStop(8);
registeract.mostCurrent.__c.runVoidMethod ("StartActivity",registeract.processBA,(Object)((registeract.mostCurrent._select_map_act.getObject())));
 BA.debugLineNum = 357;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _nationalcode_et_focuschanged(RemoteObject _hasfocus) throws Exception{
try {
		Debug.PushSubsStack("NationalCode_et_FocusChanged (registeract) ","registeract",6,registeract.mostCurrent.activityBA,registeract.mostCurrent,596);
if (RapidSub.canDelegate("nationalcode_et_focuschanged")) { return ir.saelozahra.damaara.mazraeyeman.registeract.remoteMe.runUserSub(false, "registeract","nationalcode_et_focuschanged", _hasfocus);}
Debug.locals.put("HasFocus", _hasfocus);
 BA.debugLineNum = 596;BA.debugLine="Sub NationalCode_et_FocusChanged (HasFocus As Bool";
Debug.ShouldStop(524288);
 BA.debugLineNum = 597;BA.debugLine="If Not(HasFocus) Then";
Debug.ShouldStop(1048576);
if (registeract.mostCurrent.__c.runMethod(true,"Not",(Object)(_hasfocus)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 598;BA.debugLine="NationalCode_et.Text=SaeloZahra.ConvertEnglish(N";
Debug.ShouldStop(2097152);
registeract.mostCurrent._nationalcode_et.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(registeract.mostCurrent._saelozahra.runMethod(true,"_convertenglish" /*RemoteObject*/ ,registeract.mostCurrent.activityBA,(Object)(registeract.mostCurrent._nationalcode_et.runMethod(true,"getText")))));
 BA.debugLineNum = 599;BA.debugLine="If NationalCode_et.Text.Length<9 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("<",registeract.mostCurrent._nationalcode_et.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 9))) { 
 BA.debugLineNum = 600;BA.debugLine="errorText=\"کد ملی را به صورت کامل وارد کنید\"";
Debug.ShouldStop(8388608);
registeract.mostCurrent._errortext = BA.ObjectToString("کد ملی را به صورت کامل وارد کنید");
 BA.debugLineNum = 601;BA.debugLine="MyToast.ToastMessageShow2(SaeloZahra.CSB(errorT";
Debug.ShouldStop(16777216);
registeract.mostCurrent._mytoast.runClassMethod (ir.saelozahra.damaara.mazraeyeman.ctoast.class, "_toastmessageshow2" /*void*/ ,(Object)(BA.ObjectToString(registeract.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,registeract.mostCurrent.activityBA,(Object)(registeract.mostCurrent._errortext)))),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.ObjectToString("")),(Object)(BA.numberCast(long.class, registeract.mostCurrent.__c.getField(false,"Colors").getField(true,"White"))),(Object)(BA.numberCast(long.class, registeract.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"))),(Object)(BA.numberCast(int.class, 15)),(Object)(registeract.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 603;BA.debugLine="NationalCode_et.SelectAll";
Debug.ShouldStop(67108864);
registeract.mostCurrent._nationalcode_et.runVoidMethod ("SelectAll");
 }else 
{ BA.debugLineNum = 604;BA.debugLine="Else If NationalCode_et.Text.Length>10 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean(">",registeract.mostCurrent._nationalcode_et.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 10))) { 
 BA.debugLineNum = 605;BA.debugLine="errorText=\"تعداد ارقام بیش از حد مجاز\"";
Debug.ShouldStop(268435456);
registeract.mostCurrent._errortext = BA.ObjectToString("تعداد ارقام بیش از حد مجاز");
 BA.debugLineNum = 606;BA.debugLine="MyToast.ToastMessageShow2(SaeloZahra.CSB(errorT";
Debug.ShouldStop(536870912);
registeract.mostCurrent._mytoast.runClassMethod (ir.saelozahra.damaara.mazraeyeman.ctoast.class, "_toastmessageshow2" /*void*/ ,(Object)(BA.ObjectToString(registeract.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,registeract.mostCurrent.activityBA,(Object)(registeract.mostCurrent._errortext)))),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.ObjectToString("")),(Object)(BA.numberCast(long.class, registeract.mostCurrent.__c.getField(false,"Colors").getField(true,"White"))),(Object)(BA.numberCast(long.class, registeract.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"))),(Object)(BA.numberCast(int.class, 15)),(Object)(registeract.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 607;BA.debugLine="NationalCode_et.SelectAll";
Debug.ShouldStop(1073741824);
registeract.mostCurrent._nationalcode_et.runVoidMethod ("SelectAll");
 }else {
 BA.debugLineNum = 609;BA.debugLine="errorText=\"\"";
Debug.ShouldStop(1);
registeract.mostCurrent._errortext = BA.ObjectToString("");
 }}
;
 };
 BA.debugLineNum = 612;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _onlytrialormoney(RemoteObject _thistype) throws Exception{
try {
		Debug.PushSubsStack("onlyTrialorMoney (registeract) ","registeract",6,registeract.mostCurrent.activityBA,registeract.mostCurrent,447);
if (RapidSub.canDelegate("onlytrialormoney")) { return ir.saelozahra.damaara.mazraeyeman.registeract.remoteMe.runUserSub(false, "registeract","onlytrialormoney", _thistype);}
Debug.locals.put("thisType", _thistype);
 BA.debugLineNum = 447;BA.debugLine="Sub onlyTrialorMoney(thisType As String)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 448;BA.debugLine="ScenarioMoneyLBL.SetLayout(ScenarioMoneyLayout.Ge";
Debug.ShouldStop(-2147483648);
registeract.mostCurrent._scenariomoneylbl.runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, registeract.mostCurrent._scenariomoneylayout.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("left")))))),(Object)(BA.numberCast(int.class, registeract.mostCurrent._scenariomoneylayout.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("top")))))),(Object)(BA.numberCast(int.class, registeract.mostCurrent._scenariomoneylayout.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("width")))))),(Object)(BA.numberCast(int.class, registeract.mostCurrent._scenariomoneylayout.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("height")))))));
 BA.debugLineNum = 449;BA.debugLine="ScenarioTrialLbl.SetLayout(ScenarioTrialLayout.Ge";
Debug.ShouldStop(1);
registeract.mostCurrent._scenariotriallbl.runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, registeract.mostCurrent._scenariotriallayout.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("left")))))),(Object)(BA.numberCast(int.class, registeract.mostCurrent._scenariotriallayout.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("top")))))),(Object)(BA.numberCast(int.class, registeract.mostCurrent._scenariotriallayout.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("width")))))),(Object)(BA.numberCast(int.class, registeract.mostCurrent._scenariotriallayout.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("height")))))));
 BA.debugLineNum = 450;BA.debugLine="If thisType == \"Trial\" Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_thistype,BA.ObjectToString("Trial"))) { 
 BA.debugLineNum = 451;BA.debugLine="ScenarioMoneyLBL.Visible=False";
Debug.ShouldStop(4);
registeract.mostCurrent._scenariomoneylbl.runMethod(true,"setVisible",registeract.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 452;BA.debugLine="ScenarioTrialLbl.Visible=True";
Debug.ShouldStop(8);
registeract.mostCurrent._scenariotriallbl.runMethod(true,"setVisible",registeract.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 453;BA.debugLine="ScenarioTrialLbl.SetLayout(0,0,-2,-2)";
Debug.ShouldStop(16);
registeract.mostCurrent._scenariotriallbl.runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, -(double) (0 + 2))),(Object)(BA.numberCast(int.class, -(double) (0 + 2))));
 }else 
{ BA.debugLineNum = 454;BA.debugLine="Else If thisType == \"money\" Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_thistype,BA.ObjectToString("money"))) { 
 BA.debugLineNum = 455;BA.debugLine="ScenarioTrialLbl.Visible=False";
Debug.ShouldStop(64);
registeract.mostCurrent._scenariotriallbl.runMethod(true,"setVisible",registeract.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 456;BA.debugLine="ScenarioMoneyLBL.Visible=True";
Debug.ShouldStop(128);
registeract.mostCurrent._scenariomoneylbl.runMethod(true,"setVisible",registeract.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 457;BA.debugLine="ScenarioMoneyLBL.SetLayout(0,0,-2,-2)";
Debug.ShouldStop(256);
registeract.mostCurrent._scenariomoneylbl.runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, -(double) (0 + 2))),(Object)(BA.numberCast(int.class, -(double) (0 + 2))));
 }else {
 BA.debugLineNum = 459;BA.debugLine="ScenarioTrialLbl.Visible=True";
Debug.ShouldStop(1024);
registeract.mostCurrent._scenariotriallbl.runMethod(true,"setVisible",registeract.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 460;BA.debugLine="ScenarioMoneyLBL.Visible=True";
Debug.ShouldStop(2048);
registeract.mostCurrent._scenariomoneylbl.runMethod(true,"setVisible",registeract.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 461;BA.debugLine="ScenarioMoneyLBL.SetLayout(ScenarioMoneyLayout.G";
Debug.ShouldStop(4096);
registeract.mostCurrent._scenariomoneylbl.runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, registeract.mostCurrent._scenariomoneylayout.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("left")))))),(Object)(BA.numberCast(int.class, registeract.mostCurrent._scenariomoneylayout.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("top")))))),(Object)(BA.numberCast(int.class, registeract.mostCurrent._scenariomoneylayout.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("width")))))),(Object)(BA.numberCast(int.class, registeract.mostCurrent._scenariomoneylayout.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("height")))))));
 BA.debugLineNum = 462;BA.debugLine="ScenarioTrialLbl.SetLayout(ScenarioTrialLayout.G";
Debug.ShouldStop(8192);
registeract.mostCurrent._scenariotriallbl.runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, registeract.mostCurrent._scenariotriallayout.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("left")))))),(Object)(BA.numberCast(int.class, registeract.mostCurrent._scenariotriallayout.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("top")))))),(Object)(BA.numberCast(int.class, registeract.mostCurrent._scenariotriallayout.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("width")))))),(Object)(BA.numberCast(int.class, registeract.mostCurrent._scenariotriallayout.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("height")))))));
 }}
;
 BA.debugLineNum = 464;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 8;BA.debugLine="Dim ActType As String = \"register\"";
registeract._acttype = BA.ObjectToString("register");
 //BA.debugLineNum = 11;BA.debugLine="Dim OTPCode As String = \"\"";
registeract._otpcode = BA.ObjectToString("");
 //BA.debugLineNum = 12;BA.debugLine="Dim Operator As String = \"\"";
registeract._operator = BA.ObjectToString("");
 //BA.debugLineNum = 13;BA.debugLine="Dim CU1 As Cursor";
registeract._cu1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 //BA.debugLineNum = 14;BA.debugLine="Dim SQL1 As SQL";
registeract._sql1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");
 //BA.debugLineNum = 15;BA.debugLine="Dim gheimatKamel As Int 	 = 80000";
registeract._gheimatkamel = BA.numberCast(int.class, 80000);
 //BA.debugLineNum = 16;BA.debugLine="Dim TedadNafarateKamel As Int= 12";
registeract._tedadnafaratekamel = BA.numberCast(int.class, 12);
 //BA.debugLineNum = 17;BA.debugLine="Dim TedadRoozTrial As Int= 14";
registeract._tedadrooztrial = BA.numberCast(int.class, 14);
 //BA.debugLineNum = 18;BA.debugLine="Dim TimeStamp As Long";
registeract._timestamp = RemoteObject.createImmutable(0L);
 //BA.debugLineNum = 19;BA.debugLine="Dim Payed As Int = 0";
registeract._payed = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 20;BA.debugLine="Dim DefaultResseller As Int = 6";
registeract._defaultresseller = BA.numberCast(int.class, 6);
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _save_btn_click() throws Exception{
try {
		Debug.PushSubsStack("save_btn_Click (registeract) ","registeract",6,registeract.mostCurrent.activityBA,registeract.mostCurrent,361);
if (RapidSub.canDelegate("save_btn_click")) { return ir.saelozahra.damaara.mazraeyeman.registeract.remoteMe.runUserSub(false, "registeract","save_btn_click");}
RemoteObject _place_lat = RemoteObject.createImmutable("");
RemoteObject _place_lng = RemoteObject.createImmutable("");
 BA.debugLineNum = 361;BA.debugLine="Sub save_btn_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 363;BA.debugLine="Dim place_lat As String=\"\"";
Debug.ShouldStop(1024);
_place_lat = BA.ObjectToString("");Debug.locals.put("place_lat", _place_lat);Debug.locals.put("place_lat", _place_lat);
 BA.debugLineNum = 364;BA.debugLine="Dim place_lng As String=\"\"";
Debug.ShouldStop(2048);
_place_lng = BA.ObjectToString("");Debug.locals.put("place_lng", _place_lng);Debug.locals.put("place_lng", _place_lng);
 BA.debugLineNum = 365;BA.debugLine="If File.Exists(SaeloZahra.dir,\"place_lat\") Then";
Debug.ShouldStop(4096);
if (registeract.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(registeract.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("place_lat"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 366;BA.debugLine="Dim place_lat As String = File.ReadString(SaeloZ";
Debug.ShouldStop(8192);
_place_lat = registeract.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(registeract.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("place_lat")));Debug.locals.put("place_lat", _place_lat);Debug.locals.put("place_lat", _place_lat);
 };
 BA.debugLineNum = 368;BA.debugLine="If File.Exists(SaeloZahra.dir,\"place_lng\") Then";
Debug.ShouldStop(32768);
if (registeract.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(registeract.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("place_lng"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 369;BA.debugLine="Dim place_lng As String = File.ReadString(SaeloZ";
Debug.ShouldStop(65536);
_place_lng = registeract.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(registeract.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("place_lng")));Debug.locals.put("place_lng", _place_lng);Debug.locals.put("place_lng", _place_lng);
 };
 BA.debugLineNum = 372;BA.debugLine="If name_family_et.Text==\"\" Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",registeract.mostCurrent._name_family_et.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 373;BA.debugLine="Snake.Initialize(\"snake\",Activity,SaeloZahra.CSB";
Debug.ShouldStop(1048576);
registeract.mostCurrent._snake.runVoidMethod ("Initialize",registeract.mostCurrent.activityBA,(Object)(BA.ObjectToString("snake")),(Object)((registeract.mostCurrent._activity.getObject())),(Object)(BA.ObjectToCharSequence(registeract.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,registeract.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("نام خود را وارد کنید"))).getObject())),(Object)(registeract.mostCurrent._snake.getField(true,"DURATION_LONG")));
 BA.debugLineNum = 374;BA.debugLine="Snake.Show";
Debug.ShouldStop(2097152);
registeract.mostCurrent._snake.runVoidMethod ("Show");
 BA.debugLineNum = 375;BA.debugLine="name_family_et.RequestFocus";
Debug.ShouldStop(4194304);
registeract.mostCurrent._name_family_et.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 376;BA.debugLine="Return";
Debug.ShouldStop(8388608);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 379;BA.debugLine="If tel_et.Text==\"\" Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",registeract.mostCurrent._tel_et.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 380;BA.debugLine="Snake.Initialize(\"snake\",Activity,SaeloZahra.CSB";
Debug.ShouldStop(134217728);
registeract.mostCurrent._snake.runVoidMethod ("Initialize",registeract.mostCurrent.activityBA,(Object)(BA.ObjectToString("snake")),(Object)((registeract.mostCurrent._activity.getObject())),(Object)(BA.ObjectToCharSequence(registeract.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,registeract.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("شماره تماس خود را وارد کنید"))).getObject())),(Object)(registeract.mostCurrent._snake.getField(true,"DURATION_LONG")));
 BA.debugLineNum = 381;BA.debugLine="Snake.Show";
Debug.ShouldStop(268435456);
registeract.mostCurrent._snake.runVoidMethod ("Show");
 BA.debugLineNum = 382;BA.debugLine="tel_et.RequestFocus";
Debug.ShouldStop(536870912);
registeract.mostCurrent._tel_et.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 383;BA.debugLine="Return";
Debug.ShouldStop(1073741824);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 386;BA.debugLine="If CityACET.Text==\"\" Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",registeract.mostCurrent._cityacet.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 387;BA.debugLine="Snake.Initialize(\"snake\",Activity,SaeloZahra.CSB";
Debug.ShouldStop(4);
registeract.mostCurrent._snake.runVoidMethod ("Initialize",registeract.mostCurrent.activityBA,(Object)(BA.ObjectToString("snake")),(Object)((registeract.mostCurrent._activity.getObject())),(Object)(BA.ObjectToCharSequence(registeract.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,registeract.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("شهر خود را وارد کنید"))).getObject())),(Object)(registeract.mostCurrent._snake.getField(true,"DURATION_LONG")));
 BA.debugLineNum = 388;BA.debugLine="Snake.Show";
Debug.ShouldStop(8);
registeract.mostCurrent._snake.runVoidMethod ("Show");
 BA.debugLineNum = 389;BA.debugLine="CityACET.RequestFocus";
Debug.ShouldStop(16);
registeract.mostCurrent._cityacet.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 390;BA.debugLine="Return";
Debug.ShouldStop(32);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 393;BA.debugLine="If address.Text==\"\" Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",registeract.mostCurrent._address.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 394;BA.debugLine="Snake.Initialize(\"snake\",Activity,SaeloZahra.CSB";
Debug.ShouldStop(512);
registeract.mostCurrent._snake.runVoidMethod ("Initialize",registeract.mostCurrent.activityBA,(Object)(BA.ObjectToString("snake")),(Object)((registeract.mostCurrent._activity.getObject())),(Object)(BA.ObjectToCharSequence(registeract.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,registeract.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("آدرس را وارد کنید"))).getObject())),(Object)(registeract.mostCurrent._snake.getField(true,"DURATION_LONG")));
 BA.debugLineNum = 395;BA.debugLine="Snake.Show";
Debug.ShouldStop(1024);
registeract.mostCurrent._snake.runVoidMethod ("Show");
 BA.debugLineNum = 396;BA.debugLine="address.RequestFocus";
Debug.ShouldStop(2048);
registeract.mostCurrent._address.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 397;BA.debugLine="Return";
Debug.ShouldStop(4096);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 400;BA.debugLine="If place_lat==\"\" Or place_lng==\"\" Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_place_lat,BA.ObjectToString("")) || RemoteObject.solveBoolean("=",_place_lng,BA.ObjectToString(""))) { 
 BA.debugLineNum = 401;BA.debugLine="Snake.Initialize(\"snake\",Activity,SaeloZahra.CSB";
Debug.ShouldStop(65536);
registeract.mostCurrent._snake.runVoidMethod ("Initialize",registeract.mostCurrent.activityBA,(Object)(BA.ObjectToString("snake")),(Object)((registeract.mostCurrent._activity.getObject())),(Object)(BA.ObjectToCharSequence(registeract.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,registeract.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("اول موقعیت خود را ذخیره کنید"))).getObject())),(Object)(registeract.mostCurrent._snake.getField(true,"DURATION_LONG")));
 BA.debugLineNum = 402;BA.debugLine="Snake.Show";
Debug.ShouldStop(131072);
registeract.mostCurrent._snake.runVoidMethod ("Show");
 BA.debugLineNum = 404;BA.debugLine="map_select_btn_Click";
Debug.ShouldStop(524288);
_map_select_btn_click();
 BA.debugLineNum = 405;BA.debugLine="Return";
Debug.ShouldStop(1048576);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 410;BA.debugLine="If ScenarioPanel.Tag == \"trial\" Or ActType<>\"edit";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",registeract.mostCurrent._scenariopanel.runMethod(false,"getTag"),RemoteObject.createImmutable(("trial"))) || RemoteObject.solveBoolean("!",registeract._acttype,BA.ObjectToString("edit"))) { 
 BA.debugLineNum = 411;BA.debugLine="ToastMessageShow(SaeloZahra.CSB(\"نرم افزار تا \"&";
Debug.ShouldStop(67108864);
registeract.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(registeract.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,registeract.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("نرم افزار تا "),registeract._tedadrooztrial,RemoteObject.createImmutable(" روز به صورت رایگان برای شما فعال شد")))).getObject())),(Object)(registeract.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 412;BA.debugLine="SubmitForm";
Debug.ShouldStop(134217728);
_submitform();
 }else 
{ BA.debugLineNum = 413;BA.debugLine="Else If ScenarioPanel.Tag == \"money\" Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",registeract.mostCurrent._scenariopanel.runMethod(false,"getTag"),RemoteObject.createImmutable(("money")))) { 
 BA.debugLineNum = 414;BA.debugLine="save_btn.Text = \"پرداخت و ثبت نام\"";
Debug.ShouldStop(536870912);
registeract.mostCurrent._save_btn.runMethod(true,"setText",BA.ObjectToCharSequence("پرداخت و ثبت نام"));
 BA.debugLineNum = 415;BA.debugLine="If ActType==\"edit\" And Payed==0 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",registeract._acttype,BA.ObjectToString("edit")) && RemoteObject.solveBoolean("=",registeract._payed,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 416;BA.debugLine="save_btn.Text = \"پرداخت و ویرایش حساب\"";
Debug.ShouldStop(-2147483648);
registeract.mostCurrent._save_btn.runMethod(true,"setText",BA.ObjectToCharSequence("پرداخت و ویرایش حساب"));
 }else 
{ BA.debugLineNum = 417;BA.debugLine="Else If ActType==\"edit\" And Payed==1 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",registeract._acttype,BA.ObjectToString("edit")) && RemoteObject.solveBoolean("=",registeract._payed,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 418;BA.debugLine="save_btn.Text = \"ویرایش حساب کاربری\"";
Debug.ShouldStop(2);
registeract.mostCurrent._save_btn.runMethod(true,"setText",BA.ObjectToCharSequence("ویرایش حساب کاربری"));
 }}
;
 BA.debugLineNum = 426;BA.debugLine="WaitForPay = True";
Debug.ShouldStop(512);
registeract._waitforpay = registeract.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 427;BA.debugLine="If Payed==1 Or SaeloZahra.RayganHast Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",registeract._payed,BA.numberCast(double.class, 1)) || RemoteObject.solveBoolean(".",registeract.mostCurrent._saelozahra._rayganhast /*RemoteObject*/ )) { 
 BA.debugLineNum = 428;BA.debugLine="SubmitForm";
Debug.ShouldStop(2048);
_submitform();
 }else {
 BA.debugLineNum = 430;BA.debugLine="customBrowser.CreateNewTab(SaeloZahra.json_url&";
Debug.ShouldStop(8192);
registeract.mostCurrent._custombrowser.runVoidMethod ("CreateNewTab",(Object)(RemoteObject.concat(registeract.mostCurrent._saelozahra._json_url /*RemoteObject*/ ,RemoteObject.createImmutable("pec_pay/payment.php?tel="),registeract.mostCurrent._tel_et.runMethod(true,"getText"),RemoteObject.createImmutable("&Amount="),registeract._gheimatkamel,RemoteObject.createImmutable("0&OrderId="),registeract.mostCurrent.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 999))),registeract.mostCurrent._tel_et.runMethod(true,"getText"),registeract.mostCurrent.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 100)),(Object)(BA.numberCast(int.class, 999))))));
 };
 }}
;
 BA.debugLineNum = 434;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _scenariomoneylbl_click() throws Exception{
try {
		Debug.PushSubsStack("ScenarioMoneyLBL_Click (registeract) ","registeract",6,registeract.mostCurrent.activityBA,registeract.mostCurrent,616);
if (RapidSub.canDelegate("scenariomoneylbl_click")) { return ir.saelozahra.damaara.mazraeyeman.registeract.remoteMe.runUserSub(false, "registeract","scenariomoneylbl_click");}
RemoteObject _scenariomoneycbs = RemoteObject.declareNull("anywheresoftware.b4a.objects.CSBuilder");
RemoteObject _scenariotrialcbs = RemoteObject.declareNull("anywheresoftware.b4a.objects.CSBuilder");
 BA.debugLineNum = 616;BA.debugLine="Sub ScenarioMoneyLBL_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 620;BA.debugLine="ScenarioMoneyLBL.SetColorAnimated(313,Colors.Whit";
Debug.ShouldStop(2048);
registeract.mostCurrent._scenariomoneylbl.runVoidMethod ("SetColorAnimated",(Object)(BA.numberCast(int.class, 313)),(Object)(registeract.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(registeract.mostCurrent._saelozahra._colorlight /*RemoteObject*/ ));
 BA.debugLineNum = 621;BA.debugLine="ScenarioTrialLbl.SetColorAnimated(313,SaeloZahra.";
Debug.ShouldStop(4096);
registeract.mostCurrent._scenariotriallbl.runVoidMethod ("SetColorAnimated",(Object)(BA.numberCast(int.class, 313)),(Object)(registeract.mostCurrent._saelozahra._colorlight /*RemoteObject*/ ),(Object)(registeract.mostCurrent.__c.getField(false,"Colors").getField(true,"White")));
 BA.debugLineNum = 622;BA.debugLine="ScenarioTrialLbl.Color=Colors.White";
Debug.ShouldStop(8192);
registeract.mostCurrent._scenariotriallbl.runVoidMethod ("setColor",registeract.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 625;BA.debugLine="Dim ScenarioMoneyCBS As CSBuilder";
Debug.ShouldStop(65536);
_scenariomoneycbs = RemoteObject.createNew ("anywheresoftware.b4a.objects.CSBuilder");Debug.locals.put("ScenarioMoneyCBS", _scenariomoneycbs);
 BA.debugLineNum = 626;BA.debugLine="ScenarioMoneyCBS.Initialize.Typeface(SaeloZahra.f";
Debug.ShouldStop(131072);
_scenariomoneycbs.runMethod(false,"Initialize").runMethod(false,"Typeface",(Object)((registeract.mostCurrent._saelozahra._font /*RemoteObject*/ .getObject()))).runMethod(false,"Bold").runMethod(false,"Color",(Object)(registeract.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"))).runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("خرید نقدی یکساله خدمات")))).runMethod(false,"Pop").runMethod(false,"Pop").runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(registeract.mostCurrent.__c.getField(true,"CRLF")))).runMethod(false,"Color",(Object)(registeract.mostCurrent.__c.getField(false,"Colors").getField(true,"White"))).runMethod(false,"Typeface",(Object)((registeract.mostCurrent._saelozahra._font /*RemoteObject*/ .getObject()))).runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("")))).runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable(" "),registeract.mostCurrent._saelozahra.runMethod(true,"_convertpersian" /*RemoteObject*/ ,registeract.mostCurrent.activityBA,(Object)(BA.NumberToString(registeract._gheimatkamel))),RemoteObject.createImmutable(" تومان "))))).runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(registeract.mostCurrent.__c.getField(true,"CRLF")))).runMethod(false,"Bold").runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("با این خرید شما از تسهیلات کاربران ویژه بخش کشاورزی بهره مند خواهید شد")))).runVoidMethod ("PopAll");
 BA.debugLineNum = 627;BA.debugLine="ScenarioMoneyLBL.Text = ScenarioMoneyCBS";
Debug.ShouldStop(262144);
registeract.mostCurrent._scenariomoneylbl.runMethod(true,"setText",BA.ObjectToCharSequence(_scenariomoneycbs.getObject()));
 BA.debugLineNum = 629;BA.debugLine="Dim ScenarioTrialCBS As CSBuilder";
Debug.ShouldStop(1048576);
_scenariotrialcbs = RemoteObject.createNew ("anywheresoftware.b4a.objects.CSBuilder");Debug.locals.put("ScenarioTrialCBS", _scenariotrialcbs);
 BA.debugLineNum = 630;BA.debugLine="ScenarioTrialCBS.Initialize.Typeface(SaeloZahra.f";
Debug.ShouldStop(2097152);
_scenariotrialcbs.runMethod(false,"Initialize").runMethod(false,"Typeface",(Object)((registeract.mostCurrent._saelozahra._font /*RemoteObject*/ .getObject()))).runMethod(false,"Bold").runMethod(false,"Color",(Object)(registeract.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"))).runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("تست "),registeract._tedadrooztrial,RemoteObject.createImmutable(" روزه رایگان"))))).runMethod(false,"Pop").runMethod(false,"Pop").runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(registeract.mostCurrent.__c.getField(true,"CRLF")))).runMethod(false,"Color",(Object)(registeract.mostCurrent.__c.getField(false,"Colors").getField(true,"DarkGray"))).runMethod(false,"Typeface",(Object)((registeract.mostCurrent._saelozahra._font /*RemoteObject*/ .getObject()))).runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("تا "),registeract._tedadrooztrial,RemoteObject.createImmutable(" روز رایگان از امکانات سامانه استفاده کنید"))))).runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(registeract.mostCurrent.__c.getField(true,"CRLF")))).runVoidMethod ("PopAll");
 BA.debugLineNum = 631;BA.debugLine="ScenarioTrialLbl.Text = ScenarioTrialCBS";
Debug.ShouldStop(4194304);
registeract.mostCurrent._scenariotriallbl.runMethod(true,"setText",BA.ObjectToCharSequence(_scenariotrialcbs.getObject()));
 BA.debugLineNum = 636;BA.debugLine="ScenarioPanel.Tag=ScenarioMoneyLBL.Tag 'money";
Debug.ShouldStop(134217728);
registeract.mostCurrent._scenariopanel.runMethod(false,"setTag",registeract.mostCurrent._scenariomoneylbl.runMethod(false,"getTag"));
 BA.debugLineNum = 639;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _scenariotriallbl_click() throws Exception{
try {
		Debug.PushSubsStack("ScenarioTrialLBL_Click (registeract) ","registeract",6,registeract.mostCurrent.activityBA,registeract.mostCurrent,643);
if (RapidSub.canDelegate("scenariotriallbl_click")) { return ir.saelozahra.damaara.mazraeyeman.registeract.remoteMe.runUserSub(false, "registeract","scenariotriallbl_click");}
RemoteObject _scenariomoneycbs = RemoteObject.declareNull("anywheresoftware.b4a.objects.CSBuilder");
RemoteObject _scenariotrialcbs = RemoteObject.declareNull("anywheresoftware.b4a.objects.CSBuilder");
 BA.debugLineNum = 643;BA.debugLine="Sub ScenarioTrialLBL_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 645;BA.debugLine="ScenarioTrialLbl.SetColorAnimated(313,Colors.Whit";
Debug.ShouldStop(16);
registeract.mostCurrent._scenariotriallbl.runVoidMethod ("SetColorAnimated",(Object)(BA.numberCast(int.class, 313)),(Object)(registeract.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(registeract.mostCurrent._saelozahra._colorlight /*RemoteObject*/ ));
 BA.debugLineNum = 646;BA.debugLine="ScenarioMoneyLBL.SetColorAnimated(313,SaeloZahra.";
Debug.ShouldStop(32);
registeract.mostCurrent._scenariomoneylbl.runVoidMethod ("SetColorAnimated",(Object)(BA.numberCast(int.class, 313)),(Object)(registeract.mostCurrent._saelozahra._colorlight /*RemoteObject*/ ),(Object)(registeract.mostCurrent.__c.getField(false,"Colors").getField(true,"White")));
 BA.debugLineNum = 649;BA.debugLine="Dim ScenarioMoneyCBS As CSBuilder";
Debug.ShouldStop(256);
_scenariomoneycbs = RemoteObject.createNew ("anywheresoftware.b4a.objects.CSBuilder");Debug.locals.put("ScenarioMoneyCBS", _scenariomoneycbs);
 BA.debugLineNum = 650;BA.debugLine="ScenarioMoneyCBS.Initialize.Typeface(SaeloZahra.f";
Debug.ShouldStop(512);
_scenariomoneycbs.runMethod(false,"Initialize").runMethod(false,"Typeface",(Object)((registeract.mostCurrent._saelozahra._font /*RemoteObject*/ .getObject()))).runMethod(false,"Bold").runMethod(false,"Color",(Object)(registeract.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"))).runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("خرید نقدی یکساله خدمات")))).runMethod(false,"Pop").runMethod(false,"Pop").runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(registeract.mostCurrent.__c.getField(true,"CRLF")))).runMethod(false,"Color",(Object)(registeract.mostCurrent.__c.getField(false,"Colors").getField(true,"DarkGray"))).runMethod(false,"Typeface",(Object)((registeract.mostCurrent._saelozahra._font /*RemoteObject*/ .getObject()))).runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("")))).runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable(" "),registeract.mostCurrent._saelozahra.runMethod(true,"_convertpersian" /*RemoteObject*/ ,registeract.mostCurrent.activityBA,(Object)(BA.NumberToString(registeract._gheimatkamel))),RemoteObject.createImmutable(" تومان "))))).runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(registeract.mostCurrent.__c.getField(true,"CRLF")))).runMethod(false,"Bold").runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("با این خرید شما از تسهیلات کاربران ویژه بخش کشاورزی بهره مند خواهید شد")))).runVoidMethod ("PopAll");
 BA.debugLineNum = 651;BA.debugLine="ScenarioMoneyLBL.Text = ScenarioMoneyCBS";
Debug.ShouldStop(1024);
registeract.mostCurrent._scenariomoneylbl.runMethod(true,"setText",BA.ObjectToCharSequence(_scenariomoneycbs.getObject()));
 BA.debugLineNum = 653;BA.debugLine="Dim ScenarioTrialCBS As CSBuilder";
Debug.ShouldStop(4096);
_scenariotrialcbs = RemoteObject.createNew ("anywheresoftware.b4a.objects.CSBuilder");Debug.locals.put("ScenarioTrialCBS", _scenariotrialcbs);
 BA.debugLineNum = 654;BA.debugLine="ScenarioTrialCBS.Initialize.Typeface(SaeloZahra.f";
Debug.ShouldStop(8192);
_scenariotrialcbs.runMethod(false,"Initialize").runMethod(false,"Typeface",(Object)((registeract.mostCurrent._saelozahra._font /*RemoteObject*/ .getObject()))).runMethod(false,"Bold").runMethod(false,"Color",(Object)(registeract.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"))).runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("تست "),registeract._tedadrooztrial,RemoteObject.createImmutable(" روزه رایگان"))))).runMethod(false,"Pop").runMethod(false,"Pop").runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(registeract.mostCurrent.__c.getField(true,"CRLF")))).runMethod(false,"Color",(Object)(registeract.mostCurrent.__c.getField(false,"Colors").getField(true,"White"))).runMethod(false,"Typeface",(Object)((registeract.mostCurrent._saelozahra._font /*RemoteObject*/ .getObject()))).runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("تا "),registeract._tedadrooztrial,RemoteObject.createImmutable(" روز رایگان از امکانات سامانه استفاده کنید"))))).runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(registeract.mostCurrent.__c.getField(true,"CRLF")))).runVoidMethod ("PopAll");
 BA.debugLineNum = 655;BA.debugLine="ScenarioTrialLbl.Text = ScenarioTrialCBS";
Debug.ShouldStop(16384);
registeract.mostCurrent._scenariotriallbl.runMethod(true,"setText",BA.ObjectToCharSequence(_scenariotrialcbs.getObject()));
 BA.debugLineNum = 658;BA.debugLine="ScenarioPanel.Tag=ScenarioTrialLbl.Tag 'Trial";
Debug.ShouldStop(131072);
registeract.mostCurrent._scenariopanel.runMethod(false,"setTag",registeract.mostCurrent._scenariotriallbl.runMethod(false,"getTag"));
 BA.debugLineNum = 660;BA.debugLine="save_btn.Text = \"ثبت نام\"";
Debug.ShouldStop(524288);
registeract.mostCurrent._save_btn.runMethod(true,"setText",BA.ObjectToCharSequence("ثبت نام"));
 BA.debugLineNum = 662;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sendsmsbtn_click() throws Exception{
try {
		Debug.PushSubsStack("SendSmsBtn_Click (registeract) ","registeract",6,registeract.mostCurrent.activityBA,registeract.mostCurrent,755);
if (RapidSub.canDelegate("sendsmsbtn_click")) { return ir.saelozahra.damaara.mazraeyeman.registeract.remoteMe.runUserSub(false, "registeract","sendsmsbtn_click");}
 BA.debugLineNum = 755;BA.debugLine="Sub SendSmsBtn_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 756;BA.debugLine="If SendSmsBtn.Text == \"تائید\" Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",registeract.mostCurrent._sendsmsbtn.runMethod(true,"getText"),BA.ObjectToString("تائید"))) { 
 BA.debugLineNum = 757;BA.debugLine="If OTPCode==CodeEt.Text Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",registeract._otpcode,registeract.mostCurrent._codeet.runMethod(true,"getText"))) { 
 BA.debugLineNum = 758;BA.debugLine="CodeEt.SetVisibleAnimated(313,False)";
Debug.ShouldStop(2097152);
registeract.mostCurrent._codeet.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 313)),(Object)(registeract.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 759;BA.debugLine="SendSmsBtn.SetVisibleAnimated(313,False)";
Debug.ShouldStop(4194304);
registeract.mostCurrent._sendsmsbtn.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 313)),(Object)(registeract.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 760;BA.debugLine="OtherThanTelPanel.SetVisibleAnimated(313,True)";
Debug.ShouldStop(8388608);
registeract.mostCurrent._otherthantelpanel.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 313)),(Object)(registeract.mostCurrent.__c.getField(true,"True")));
 }else {
 BA.debugLineNum = 763;BA.debugLine="CodeEt.Text=\"\"";
Debug.ShouldStop(67108864);
registeract.mostCurrent._codeet.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 765;BA.debugLine="Snake.Initialize(\"SmsSnake\",Activity,SaeloZahra";
Debug.ShouldStop(268435456);
registeract.mostCurrent._snake.runVoidMethod ("Initialize",registeract.mostCurrent.activityBA,(Object)(BA.ObjectToString("SmsSnake")),(Object)((registeract.mostCurrent._activity.getObject())),(Object)(BA.ObjectToCharSequence(registeract.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,registeract.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("کد وارد شده غلط است"))).getObject())),(Object)(registeract.mostCurrent._snake.getField(true,"DURATION_LONG")));
 BA.debugLineNum = 766;BA.debugLine="Snake.SetAction(SaeloZahra.CSB(\"ارسال مجدد پیام";
Debug.ShouldStop(536870912);
registeract.mostCurrent._snake.runVoidMethod ("SetAction",(Object)(BA.ObjectToCharSequence(registeract.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,registeract.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("ارسال مجدد پیام"))).getObject())));
 BA.debugLineNum = 767;BA.debugLine="Snake.Show";
Debug.ShouldStop(1073741824);
registeract.mostCurrent._snake.runVoidMethod ("Show");
 BA.debugLineNum = 768;BA.debugLine="SaeloZahra.P.HideKeyboard(Activity)";
Debug.ShouldStop(-2147483648);
registeract.mostCurrent._saelozahra._p /*RemoteObject*/ .runVoidMethod ("HideKeyboard",(Object)(registeract.mostCurrent._activity));
 };
 }else {
 BA.debugLineNum = 772;BA.debugLine="Operator = SaeloZahra.pishhomare(tel_et.Text)";
Debug.ShouldStop(8);
registeract._operator = registeract.mostCurrent._saelozahra.runMethod(true,"_pishhomare" /*RemoteObject*/ ,registeract.mostCurrent.activityBA,(Object)(registeract.mostCurrent._tel_et.runMethod(true,"getText")));
 BA.debugLineNum = 773;BA.debugLine="ProgressDialogShow(SaeloZahra.CSB(\"کمی صبر کنید\"";
Debug.ShouldStop(16);
registeract.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",registeract.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(registeract.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,registeract.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("کمی صبر کنید"))).getObject())));
 BA.debugLineNum = 774;BA.debugLine="OTPCode = Rnd(1100,9999)";
Debug.ShouldStop(32);
registeract._otpcode = BA.NumberToString(registeract.mostCurrent.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 1100)),(Object)(BA.numberCast(int.class, 9999))));
 BA.debugLineNum = 775;BA.debugLine="TimeStamp=DateTime.Now";
Debug.ShouldStop(64);
registeract._timestamp = registeract.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow");
 BA.debugLineNum = 776;BA.debugLine="Log(SaeloZahra.json_url&\"sendSms.php?tel=\"&tel_e";
Debug.ShouldStop(128);
registeract.mostCurrent.__c.runVoidMethod ("LogImpl","47077909",RemoteObject.concat(registeract.mostCurrent._saelozahra._json_url /*RemoteObject*/ ,RemoteObject.createImmutable("sendSms.php?tel="),registeract.mostCurrent._tel_et.runMethod(true,"getText"),RemoteObject.createImmutable("&text="),registeract.mostCurrent._name_family_et.runMethod(true,"getText"),RemoteObject.createImmutable(" عزیز، کد ورود به نرم افزار مزرعه من "),registeract._otpcode,RemoteObject.createImmutable(" است.")),0);
 BA.debugLineNum = 777;BA.debugLine="jobOtpGenerate.Download(SaeloZahra.json_url&\"sen";
Debug.ShouldStop(256);
registeract.mostCurrent._jobotpgenerate.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.concat(registeract.mostCurrent._saelozahra._json_url /*RemoteObject*/ ,RemoteObject.createImmutable("sendSms.php?tel="),registeract.mostCurrent._tel_et.runMethod(true,"getText"),RemoteObject.createImmutable("&text="),registeract.mostCurrent._name_family_et.runMethod(true,"getText"),RemoteObject.createImmutable(" عزیز، کد ورود به نرم افزار مزرعه من "),registeract._otpcode,RemoteObject.createImmutable(" است."))));
 };
 BA.debugLineNum = 779;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _smssnake_click() throws Exception{
try {
		Debug.PushSubsStack("SmsSnake_Click (registeract) ","registeract",6,registeract.mostCurrent.activityBA,registeract.mostCurrent,791);
if (RapidSub.canDelegate("smssnake_click")) { return ir.saelozahra.damaara.mazraeyeman.registeract.remoteMe.runUserSub(false, "registeract","smssnake_click");}
 BA.debugLineNum = 791;BA.debugLine="Sub SmsSnake_Click()";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 792;BA.debugLine="If TimeStamp+DateTime.TicksPerMinute>DateTime.Now";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean(">",RemoteObject.solve(new RemoteObject[] {registeract._timestamp,registeract.mostCurrent.__c.getField(false,"DateTime").getField(true,"TicksPerMinute")}, "+",1, 2),registeract.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"))) { 
 BA.debugLineNum = 793;BA.debugLine="jobOtpGenerate.Download(SaeloZahra.json_url&\"sen";
Debug.ShouldStop(16777216);
registeract.mostCurrent._jobotpgenerate.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.concat(registeract.mostCurrent._saelozahra._json_url /*RemoteObject*/ ,RemoteObject.createImmutable("sendSms.php?tel="),registeract.mostCurrent._tel_et.runMethod(true,"getText"),RemoteObject.createImmutable("&text="),registeract.mostCurrent._name_family_et.runMethod(true,"getText"),RemoteObject.createImmutable(" عزیز، کد ورود به نرم افزار مزرعه من "),registeract._otpcode,RemoteObject.createImmutable(" است."))));
 }else {
 BA.debugLineNum = 795;BA.debugLine="ToastMessageShow(\" پس از یک دقیقه، مجددا امتحان";
Debug.ShouldStop(67108864);
registeract.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(" پس از یک دقیقه، مجددا امتحان کنید ")),(Object)(registeract.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 796;BA.debugLine="Snake.Initialize(\"SmsSnake\",Activity,SaeloZahra.";
Debug.ShouldStop(134217728);
registeract.mostCurrent._snake.runVoidMethod ("Initialize",registeract.mostCurrent.activityBA,(Object)(BA.ObjectToString("SmsSnake")),(Object)((registeract.mostCurrent._activity.getObject())),(Object)(BA.ObjectToCharSequence(registeract.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,registeract.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("کد وارد شده غلط است"))).getObject())),(Object)(BA.numberCast(int.class, 60000)));
 BA.debugLineNum = 797;BA.debugLine="Snake.SetAction(SaeloZahra.CSB(\"ارسال مجدد پیام\"";
Debug.ShouldStop(268435456);
registeract.mostCurrent._snake.runVoidMethod ("SetAction",(Object)(BA.ObjectToCharSequence(registeract.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,registeract.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("ارسال مجدد پیام"))).getObject())));
 BA.debugLineNum = 798;BA.debugLine="Snake.Show";
Debug.ShouldStop(536870912);
registeract.mostCurrent._snake.runVoidMethod ("Show");
 BA.debugLineNum = 799;BA.debugLine="SaeloZahra.P.HideKeyboard(Activity)";
Debug.ShouldStop(1073741824);
registeract.mostCurrent._saelozahra._p /*RemoteObject*/ .runVoidMethod ("HideKeyboard",(Object)(registeract.mostCurrent._activity));
 };
 BA.debugLineNum = 801;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _submitform() throws Exception{
try {
		Debug.PushSubsStack("SubmitForm (registeract) ","registeract",6,registeract.mostCurrent.activityBA,registeract.mostCurrent,682);
if (RapidSub.canDelegate("submitform")) { return ir.saelozahra.damaara.mazraeyeman.registeract.remoteMe.runUserSub(false, "registeract","submitform");}
RemoteObject _place_lat = RemoteObject.createImmutable("");
RemoteObject _place_lng = RemoteObject.createImmutable("");
 BA.debugLineNum = 682;BA.debugLine="Sub SubmitForm";
Debug.ShouldStop(512);
 BA.debugLineNum = 684;BA.debugLine="Dim place_lat As String=select_map_act.place_lat";
Debug.ShouldStop(2048);
_place_lat = BA.NumberToString(registeract.mostCurrent._select_map_act._place_lat /*RemoteObject*/ );Debug.locals.put("place_lat", _place_lat);Debug.locals.put("place_lat", _place_lat);
 BA.debugLineNum = 685;BA.debugLine="Dim place_lng As String=select_map_act.place_lng";
Debug.ShouldStop(4096);
_place_lng = BA.NumberToString(registeract.mostCurrent._select_map_act._place_lng /*RemoteObject*/ );Debug.locals.put("place_lng", _place_lng);Debug.locals.put("place_lng", _place_lng);
 BA.debugLineNum = 686;BA.debugLine="If File.Exists(SaeloZahra.dir,\"place_lat\") Then";
Debug.ShouldStop(8192);
if (registeract.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(registeract.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("place_lat"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 687;BA.debugLine="Dim place_lat As String = File.ReadString(SaeloZ";
Debug.ShouldStop(16384);
_place_lat = registeract.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(registeract.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("place_lat")));Debug.locals.put("place_lat", _place_lat);Debug.locals.put("place_lat", _place_lat);
 };
 BA.debugLineNum = 689;BA.debugLine="If File.Exists(SaeloZahra.dir,\"place_lng\") Then";
Debug.ShouldStop(65536);
if (registeract.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(registeract.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("place_lng"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 690;BA.debugLine="Dim place_lng As String = File.ReadString(SaeloZ";
Debug.ShouldStop(131072);
_place_lng = registeract.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(registeract.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("place_lng")));Debug.locals.put("place_lng", _place_lng);Debug.locals.put("place_lng", _place_lng);
 };
 BA.debugLineNum = 693;BA.debugLine="If name_family_et.Text==\"\" Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",registeract.mostCurrent._name_family_et.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 694;BA.debugLine="Snake.Initialize(\"snake\",Activity,SaeloZahra.CSB";
Debug.ShouldStop(2097152);
registeract.mostCurrent._snake.runVoidMethod ("Initialize",registeract.mostCurrent.activityBA,(Object)(BA.ObjectToString("snake")),(Object)((registeract.mostCurrent._activity.getObject())),(Object)(BA.ObjectToCharSequence(registeract.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,registeract.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("نام خود را وارد کنید"))).getObject())),(Object)(registeract.mostCurrent._snake.getField(true,"DURATION_LONG")));
 BA.debugLineNum = 695;BA.debugLine="Snake.Show";
Debug.ShouldStop(4194304);
registeract.mostCurrent._snake.runVoidMethod ("Show");
 BA.debugLineNum = 696;BA.debugLine="name_family_et.RequestFocus";
Debug.ShouldStop(8388608);
registeract.mostCurrent._name_family_et.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 697;BA.debugLine="Return";
Debug.ShouldStop(16777216);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 700;BA.debugLine="If tel_et.Text==\"\" Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",registeract.mostCurrent._tel_et.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 701;BA.debugLine="Snake.Initialize(\"snake\",Activity,SaeloZahra.CSB";
Debug.ShouldStop(268435456);
registeract.mostCurrent._snake.runVoidMethod ("Initialize",registeract.mostCurrent.activityBA,(Object)(BA.ObjectToString("snake")),(Object)((registeract.mostCurrent._activity.getObject())),(Object)(BA.ObjectToCharSequence(registeract.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,registeract.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("شماره تماس خود را وارد کنید"))).getObject())),(Object)(registeract.mostCurrent._snake.getField(true,"DURATION_LONG")));
 BA.debugLineNum = 702;BA.debugLine="Snake.Show";
Debug.ShouldStop(536870912);
registeract.mostCurrent._snake.runVoidMethod ("Show");
 BA.debugLineNum = 703;BA.debugLine="tel_et.RequestFocus";
Debug.ShouldStop(1073741824);
registeract.mostCurrent._tel_et.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 704;BA.debugLine="Return";
Debug.ShouldStop(-2147483648);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 707;BA.debugLine="If CityACET.Text==\"\" Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",registeract.mostCurrent._cityacet.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 708;BA.debugLine="Snake.Initialize(\"snake\",Activity,SaeloZahra.CSB";
Debug.ShouldStop(8);
registeract.mostCurrent._snake.runVoidMethod ("Initialize",registeract.mostCurrent.activityBA,(Object)(BA.ObjectToString("snake")),(Object)((registeract.mostCurrent._activity.getObject())),(Object)(BA.ObjectToCharSequence(registeract.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,registeract.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("شهر خود را وارد کنید"))).getObject())),(Object)(registeract.mostCurrent._snake.getField(true,"DURATION_LONG")));
 BA.debugLineNum = 709;BA.debugLine="Snake.Show";
Debug.ShouldStop(16);
registeract.mostCurrent._snake.runVoidMethod ("Show");
 BA.debugLineNum = 710;BA.debugLine="CityACET.RequestFocus";
Debug.ShouldStop(32);
registeract.mostCurrent._cityacet.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 711;BA.debugLine="Return";
Debug.ShouldStop(64);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 714;BA.debugLine="If address.Text==\"\" Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",registeract.mostCurrent._address.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 715;BA.debugLine="Snake.Initialize(\"snake\",Activity,SaeloZahra.CSB";
Debug.ShouldStop(1024);
registeract.mostCurrent._snake.runVoidMethod ("Initialize",registeract.mostCurrent.activityBA,(Object)(BA.ObjectToString("snake")),(Object)((registeract.mostCurrent._activity.getObject())),(Object)(BA.ObjectToCharSequence(registeract.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,registeract.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("آدرس را وارد کنید"))).getObject())),(Object)(registeract.mostCurrent._snake.getField(true,"DURATION_LONG")));
 BA.debugLineNum = 716;BA.debugLine="Snake.Show";
Debug.ShouldStop(2048);
registeract.mostCurrent._snake.runVoidMethod ("Show");
 BA.debugLineNum = 717;BA.debugLine="address.RequestFocus";
Debug.ShouldStop(4096);
registeract.mostCurrent._address.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 718;BA.debugLine="Return";
Debug.ShouldStop(8192);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 721;BA.debugLine="If place_lat==\"\" Or place_lng==\"\" Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_place_lat,BA.ObjectToString("")) || RemoteObject.solveBoolean("=",_place_lng,BA.ObjectToString(""))) { 
 BA.debugLineNum = 722;BA.debugLine="Snake.Initialize(\"snake\",Activity,SaeloZahra.CSB";
Debug.ShouldStop(131072);
registeract.mostCurrent._snake.runVoidMethod ("Initialize",registeract.mostCurrent.activityBA,(Object)(BA.ObjectToString("snake")),(Object)((registeract.mostCurrent._activity.getObject())),(Object)(BA.ObjectToCharSequence(registeract.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,registeract.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("اول موقعیت خود را ذخیره کنید"))).getObject())),(Object)(registeract.mostCurrent._snake.getField(true,"DURATION_LONG")));
 BA.debugLineNum = 723;BA.debugLine="Snake.Show";
Debug.ShouldStop(262144);
registeract.mostCurrent._snake.runVoidMethod ("Show");
 BA.debugLineNum = 725;BA.debugLine="map_select_btn_Click";
Debug.ShouldStop(1048576);
_map_select_btn_click();
 BA.debugLineNum = 726;BA.debugLine="Return";
Debug.ShouldStop(2097152);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 731;BA.debugLine="If errorText==\"\" Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",registeract.mostCurrent._errortext,BA.ObjectToString(""))) { 
 BA.debugLineNum = 733;BA.debugLine="Select vahed_spinner.SelectedIndex";
Debug.ShouldStop(268435456);
switch (BA.switchObjectToInt(registeract.mostCurrent._vahed_spinner.runMethod(true,"getSelectedIndex"),BA.numberCast(int.class, 0),BA.numberCast(int.class, 1))) {
case 0: {
 BA.debugLineNum = 735;BA.debugLine="vahed_spinner.Tag=\"hectare\"";
Debug.ShouldStop(1073741824);
registeract.mostCurrent._vahed_spinner.runMethod(false,"setTag",RemoteObject.createImmutable(("hectare")));
 break; }
case 1: {
 BA.debugLineNum = 737;BA.debugLine="vahed_spinner.Tag=\"meters\"";
Debug.ShouldStop(1);
registeract.mostCurrent._vahed_spinner.runMethod(false,"setTag",RemoteObject.createImmutable(("meters")));
 break; }
}
;
 BA.debugLineNum = 741;BA.debugLine="If ActType==\"edit\" Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",registeract._acttype,BA.ObjectToString("edit"))) { 
 BA.debugLineNum = 742;BA.debugLine="job1.PostString(SaeloZahra.json_url&\"farmers_in";
Debug.ShouldStop(32);
registeract.mostCurrent._job1.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(registeract.mostCurrent._saelozahra._json_url /*RemoteObject*/ ,RemoteObject.createImmutable("farmers_insert.php?save=edit"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("&id="),registeract.mostCurrent._starter._my_id /*RemoteObject*/ ,RemoteObject.createImmutable("&nationalcode="),registeract.mostCurrent._nationalcode_et.runMethod(true,"getText"),RemoteObject.createImmutable("&name="),registeract.mostCurrent._name_family_et.runMethod(true,"getText"),RemoteObject.createImmutable("&unit="),registeract.mostCurrent._vahed_spinner.runMethod(false,"getTag"),RemoteObject.createImmutable("&area="),registeract.mostCurrent._masahateyahtekeshet.runMethod(true,"getText"),RemoteObject.createImmutable("&email="),registeract.mostCurrent._email_et.runMethod(true,"getText"),RemoteObject.createImmutable("&moaref="),registeract.mostCurrent._moaref_et.runMethod(true,"getText"),RemoteObject.createImmutable("&location="),_place_lat,RemoteObject.createImmutable(","),_place_lng,RemoteObject.createImmutable("&state="),registeract.mostCurrent._state_spinner.runMethod(true,"getSelectedItem"),RemoteObject.createImmutable("&city="),registeract.mostCurrent._cityacet.runMethod(true,"getText"),RemoteObject.createImmutable("&address="),registeract.mostCurrent._address.runMethod(true,"getText"),RemoteObject.createImmutable("&sealevel="),registeract.mostCurrent._sealevel,RemoteObject.createImmutable("&pay_type="),registeract.mostCurrent._scenariopanel.runMethod(false,"getTag"),RemoteObject.createImmutable("&payed="),registeract._payed)));
 }else {
 BA.debugLineNum = 744;BA.debugLine="job1.PostString(SaeloZahra.json_url&\"farmers_in";
Debug.ShouldStop(128);
registeract.mostCurrent._job1.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(registeract.mostCurrent._saelozahra._json_url /*RemoteObject*/ ,RemoteObject.createImmutable("farmers_insert.php?save=true"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("&nationalcode="),registeract.mostCurrent._nationalcode_et.runMethod(true,"getText"),RemoteObject.createImmutable("&name="),registeract.mostCurrent._name_family_et.runMethod(true,"getText"),RemoteObject.createImmutable("&mobile="),registeract.mostCurrent._tel_et.runMethod(true,"getText"),RemoteObject.createImmutable("&unit="),registeract.mostCurrent._vahed_spinner.runMethod(false,"getTag"),RemoteObject.createImmutable("&area="),registeract.mostCurrent._masahateyahtekeshet.runMethod(true,"getText"),RemoteObject.createImmutable("&email="),registeract.mostCurrent._email_et.runMethod(true,"getText"),RemoteObject.createImmutable("&moaref="),registeract.mostCurrent._moaref_et.runMethod(true,"getText"),RemoteObject.createImmutable("&location="),_place_lat,RemoteObject.createImmutable(","),_place_lng,RemoteObject.createImmutable("&state="),registeract.mostCurrent._state_spinner.runMethod(true,"getSelectedItem"),RemoteObject.createImmutable("&city="),registeract.mostCurrent._cityacet.runMethod(true,"getText"),RemoteObject.createImmutable("&address="),registeract.mostCurrent._address.runMethod(true,"getText"),RemoteObject.createImmutable("&sealevel="),registeract.mostCurrent._sealevel,RemoteObject.createImmutable("&pay_type="),registeract.mostCurrent._scenariopanel.runMethod(false,"getTag"),RemoteObject.createImmutable("&payed="),registeract._payed)));
 };
 BA.debugLineNum = 747;BA.debugLine="ProgressDialogShow(SaeloZahra.CSB(\"در حال ثبت نا";
Debug.ShouldStop(1024);
registeract.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",registeract.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(registeract.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,registeract.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("در حال ثبت نام..."))).getObject())));
 }else {
 BA.debugLineNum = 750;BA.debugLine="ToastMessageShow(SaeloZahra.CSB(errorText),True)";
Debug.ShouldStop(8192);
registeract.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(registeract.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,registeract.mostCurrent.activityBA,(Object)(registeract.mostCurrent._errortext)).getObject())),(Object)(registeract.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 753;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tel_et_focuschanged(RemoteObject _hasfocus) throws Exception{
try {
		Debug.PushSubsStack("tel_et_FocusChanged (registeract) ","registeract",6,registeract.mostCurrent.activityBA,registeract.mostCurrent,569);
if (RapidSub.canDelegate("tel_et_focuschanged")) { return ir.saelozahra.damaara.mazraeyeman.registeract.remoteMe.runUserSub(false, "registeract","tel_et_focuschanged", _hasfocus);}
Debug.locals.put("HasFocus", _hasfocus);
 BA.debugLineNum = 569;BA.debugLine="Sub tel_et_FocusChanged (HasFocus As Boolean)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 570;BA.debugLine="tel_et.Text=SaeloZahra.ConvertEnglish(tel_et.Text";
Debug.ShouldStop(33554432);
registeract.mostCurrent._tel_et.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(registeract.mostCurrent._saelozahra.runMethod(true,"_convertenglish" /*RemoteObject*/ ,registeract.mostCurrent.activityBA,(Object)(registeract.mostCurrent._tel_et.runMethod(true,"getText")))));
 BA.debugLineNum = 571;BA.debugLine="If Not(HasFocus) Then";
Debug.ShouldStop(67108864);
if (registeract.mostCurrent.__c.runMethod(true,"Not",(Object)(_hasfocus)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 572;BA.debugLine="If Not(tel_et.Text.StartsWith(\"09\")) Then";
Debug.ShouldStop(134217728);
if (registeract.mostCurrent.__c.runMethod(true,"Not",(Object)(registeract.mostCurrent._tel_et.runMethod(true,"getText").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("09"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 573;BA.debugLine="tel_et.RequestFocus";
Debug.ShouldStop(268435456);
registeract.mostCurrent._tel_et.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 574;BA.debugLine="tel_et.SelectAll";
Debug.ShouldStop(536870912);
registeract.mostCurrent._tel_et.runVoidMethod ("SelectAll");
 BA.debugLineNum = 575;BA.debugLine="errorText=\"شماره تلفن با 09 آغاز میشود\"";
Debug.ShouldStop(1073741824);
registeract.mostCurrent._errortext = BA.ObjectToString("شماره تلفن با 09 آغاز میشود");
 BA.debugLineNum = 576;BA.debugLine="MyToast.ToastMessageShow2(SaeloZahra.CSB(errorT";
Debug.ShouldStop(-2147483648);
registeract.mostCurrent._mytoast.runClassMethod (ir.saelozahra.damaara.mazraeyeman.ctoast.class, "_toastmessageshow2" /*void*/ ,(Object)(BA.ObjectToString(registeract.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,registeract.mostCurrent.activityBA,(Object)(registeract.mostCurrent._errortext)))),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.ObjectToString("")),(Object)(BA.numberCast(long.class, registeract.mostCurrent.__c.getField(false,"Colors").getField(true,"White"))),(Object)(BA.numberCast(long.class, registeract.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"))),(Object)(BA.numberCast(int.class, 15)),(Object)(registeract.mostCurrent.__c.getField(true,"True")));
 }else 
{ BA.debugLineNum = 577;BA.debugLine="else If tel_et.Text.Length>11 Or tel_et.Text.Len";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean(">",registeract.mostCurrent._tel_et.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 11)) || RemoteObject.solveBoolean("<",registeract.mostCurrent._tel_et.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 10))) { 
 BA.debugLineNum = 578;BA.debugLine="tel_et.RequestFocus";
Debug.ShouldStop(2);
registeract.mostCurrent._tel_et.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 579;BA.debugLine="tel_et.SelectAll";
Debug.ShouldStop(4);
registeract.mostCurrent._tel_et.runVoidMethod ("SelectAll");
 BA.debugLineNum = 580;BA.debugLine="errorText=\"تعداد ارقام شماره تماس صحیح نیست\"";
Debug.ShouldStop(8);
registeract.mostCurrent._errortext = BA.ObjectToString("تعداد ارقام شماره تماس صحیح نیست");
 BA.debugLineNum = 581;BA.debugLine="MyToast.ToastMessageShow2(SaeloZahra.CSB(errorT";
Debug.ShouldStop(16);
registeract.mostCurrent._mytoast.runClassMethod (ir.saelozahra.damaara.mazraeyeman.ctoast.class, "_toastmessageshow2" /*void*/ ,(Object)(BA.ObjectToString(registeract.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,registeract.mostCurrent.activityBA,(Object)(registeract.mostCurrent._errortext)))),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.ObjectToString("")),(Object)(BA.numberCast(long.class, registeract.mostCurrent.__c.getField(false,"Colors").getField(true,"White"))),(Object)(BA.numberCast(long.class, registeract.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"))),(Object)(BA.numberCast(int.class, 15)),(Object)(registeract.mostCurrent.__c.getField(true,"True")));
 }else {
 BA.debugLineNum = 583;BA.debugLine="errorText=\"\"";
Debug.ShouldStop(64);
registeract.mostCurrent._errortext = BA.ObjectToString("");
 }}
;
 };
 BA.debugLineNum = 586;BA.debugLine="Operator = SaeloZahra.pishhomare(tel_et.Text)";
Debug.ShouldStop(512);
registeract._operator = registeract.mostCurrent._saelozahra.runMethod(true,"_pishhomare" /*RemoteObject*/ ,registeract.mostCurrent.activityBA,(Object)(registeract.mostCurrent._tel_et.runMethod(true,"getText")));
 BA.debugLineNum = 588;BA.debugLine="If tel_et.Text.Length>10 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean(">",registeract.mostCurrent._tel_et.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 10))) { 
 BA.debugLineNum = 589;BA.debugLine="If ActType<>\"edit\" Then JobCheckUserName.Downloa";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("!",registeract._acttype,BA.ObjectToString("edit"))) { 
registeract.mostCurrent._jobcheckusername.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.concat(registeract.mostCurrent._saelozahra._json_url /*RemoteObject*/ ,RemoteObject.createImmutable("check_farmer.php?tel="),registeract.mostCurrent._tel_et.runMethod(true,"getText"))));};
 BA.debugLineNum = 590;BA.debugLine="JobGetPayUser.Download(SaeloZahra.json_url&\"paym";
Debug.ShouldStop(8192);
registeract.mostCurrent._jobgetpayuser.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.concat(registeract.mostCurrent._saelozahra._json_url /*RemoteObject*/ ,RemoteObject.createImmutable("payment.php?tel="),registeract.mostCurrent._tel_et.runMethod(true,"getText"))));
 };
 BA.debugLineNum = 593;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tel_et_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("tel_et_TextChanged (registeract) ","registeract",6,registeract.mostCurrent.activityBA,registeract.mostCurrent,438);
if (RapidSub.canDelegate("tel_et_textchanged")) { return ir.saelozahra.damaara.mazraeyeman.registeract.remoteMe.runUserSub(false, "registeract","tel_et_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 438;BA.debugLine="Sub tel_et_TextChanged (Old As String, New As Stri";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 439;BA.debugLine="If SaeloZahra.pishhomare(New) == \"rightel\" Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",registeract.mostCurrent._saelozahra.runMethod(true,"_pishhomare" /*RemoteObject*/ ,registeract.mostCurrent.activityBA,(Object)(_new)),BA.ObjectToString("rightel"))) { 
 };
 BA.debugLineNum = 442;BA.debugLine="If New.Length>10 And ActType<>\"edit\" Then JobChec";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean(">",_new.runMethod(true,"length"),BA.numberCast(double.class, 10)) && RemoteObject.solveBoolean("!",registeract._acttype,BA.ObjectToString("edit"))) { 
registeract.mostCurrent._jobcheckusername.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.concat(registeract.mostCurrent._saelozahra._json_url /*RemoteObject*/ ,RemoteObject.createImmutable("check_farmer.php?tel="),_new)));};
 BA.debugLineNum = 443;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _zarin_pal_request(RemoteObject _status,RemoteObject _kod_payment) throws Exception{
try {
		Debug.PushSubsStack("Zarin_Pal_Request (registeract) ","registeract",6,registeract.mostCurrent.activityBA,registeract.mostCurrent,666);
if (RapidSub.canDelegate("zarin_pal_request")) { return ir.saelozahra.damaara.mazraeyeman.registeract.remoteMe.runUserSub(false, "registeract","zarin_pal_request", _status, _kod_payment);}
Debug.locals.put("Status", _status);
Debug.locals.put("Kod_Payment", _kod_payment);
 BA.debugLineNum = 666;BA.debugLine="Sub Zarin_Pal_Request( Status As String, Kod_Payme";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 669;BA.debugLine="If Status =\"100\" Or Status=\"101\" Or Status=\"موفق\"";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_status,BA.ObjectToString("100")) || RemoteObject.solveBoolean("=",_status,BA.ObjectToString("101")) || RemoteObject.solveBoolean("=",_status,BA.ObjectToString("موفق"))) { 
 BA.debugLineNum = 670;BA.debugLine="Payed=1";
Debug.ShouldStop(536870912);
registeract._payed = BA.numberCast(int.class, 1);
 BA.debugLineNum = 671;BA.debugLine="Msgbox2Async(\"وضعیت تراکنش: \"&Status& CRLF&\"کد پ";
Debug.ShouldStop(1073741824);
registeract.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("وضعیت تراکنش: "),_status,registeract.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("کد پیگیری تراکنش: "),_kod_payment))),(Object)(BA.ObjectToCharSequence("وضعیت تراکنش")),(Object)(BA.ObjectToString(registeract.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,registeract.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("ثبت نام"))))),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), registeract.mostCurrent.__c.getField(false,"Null")),registeract.processBA,(Object)(registeract.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 672;BA.debugLine="SubmitForm";
Debug.ShouldStop(-2147483648);
_submitform();
 }else {
 BA.debugLineNum = 674;BA.debugLine="Payed=0";
Debug.ShouldStop(2);
registeract._payed = BA.numberCast(int.class, 0);
 BA.debugLineNum = 675;BA.debugLine="MsgboxAsync(\"تراکنش ناموفق!\",\"وضعیت تراکنش\")";
Debug.ShouldStop(4);
registeract.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("تراکنش ناموفق!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("وضعیت تراکنش"))),registeract.processBA);
 };
 BA.debugLineNum = 677;BA.debugLine="Log(Status& CRLF & Kod_Payment)";
Debug.ShouldStop(16);
registeract.mostCurrent.__c.runVoidMethod ("LogImpl","46946827",RemoteObject.concat(_status,registeract.mostCurrent.__c.getField(true,"CRLF"),_kod_payment),0);
 BA.debugLineNum = 678;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}