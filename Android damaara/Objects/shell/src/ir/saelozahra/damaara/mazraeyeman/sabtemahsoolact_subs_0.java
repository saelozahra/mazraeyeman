package ir.saelozahra.damaara.mazraeyeman;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class sabtemahsoolact_subs_0 {


public static RemoteObject  _actionbar_navigationitemclick() throws Exception{
try {
		Debug.PushSubsStack("Actionbar_NavigationItemClick (sabtemahsoolact) ","sabtemahsoolact",8,sabtemahsoolact.mostCurrent.activityBA,sabtemahsoolact.mostCurrent,307);
if (RapidSub.canDelegate("actionbar_navigationitemclick")) { return ir.saelozahra.damaara.mazraeyeman.sabtemahsoolact.remoteMe.runUserSub(false, "sabtemahsoolact","actionbar_navigationitemclick");}
 BA.debugLineNum = 307;BA.debugLine="Sub Actionbar_NavigationItemClick";
Debug.ShouldStop(262144);
 BA.debugLineNum = 308;BA.debugLine="Activity.Finish";
Debug.ShouldStop(524288);
sabtemahsoolact.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 309;BA.debugLine="SaeloZahra.SetAnimation(\"zoom_enter\",\"zoom_exit\")";
Debug.ShouldStop(1048576);
sabtemahsoolact.mostCurrent._saelozahra.runVoidMethod ("_setanimation" /*RemoteObject*/ ,sabtemahsoolact.mostCurrent.activityBA,(Object)(BA.ObjectToString("zoom_enter")),(Object)(RemoteObject.createImmutable("zoom_exit")));
 BA.debugLineNum = 310;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (sabtemahsoolact) ","sabtemahsoolact",8,sabtemahsoolact.mostCurrent.activityBA,sabtemahsoolact.mostCurrent,51);
if (RapidSub.canDelegate("activity_create")) { ir.saelozahra.damaara.mazraeyeman.sabtemahsoolact.remoteMe.runUserSub(false, "sabtemahsoolact","activity_create", _firsttime); return;}
ResumableSub_Activity_Create rsub = new ResumableSub_Activity_Create(null,_firsttime);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Activity_Create extends BA.ResumableSub {
public ResumableSub_Activity_Create(ir.saelozahra.damaara.mazraeyeman.sabtemahsoolact parent,RemoteObject _firsttime) {
this.parent = parent;
this._firsttime = _firsttime;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.saelozahra.damaara.mazraeyeman.sabtemahsoolact parent;
RemoteObject _firsttime;
RemoteObject _csb_sub = RemoteObject.declareNull("anywheresoftware.b4a.objects.CSBuilder");
RemoteObject _editmahsoolgroup = RemoteObject.createImmutable("");
RemoteObject _ivimgdnld = RemoteObject.declareNull("ir.saelozahra.damaara.mazraeyeman.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (sabtemahsoolact) ","sabtemahsoolact",8,sabtemahsoolact.mostCurrent.activityBA,sabtemahsoolact.mostCurrent,51);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 53;BA.debugLine="SaeloZahra.SetStatusBarColor(SaeloZahra.ColorDark";
Debug.ShouldStop(1048576);
parent.mostCurrent._saelozahra.runVoidMethod ("_setstatusbarcolor" /*RemoteObject*/ ,sabtemahsoolact.mostCurrent.activityBA,(Object)(parent.mostCurrent._saelozahra._colordark /*RemoteObject*/ ));
 BA.debugLineNum = 54;BA.debugLine="Activity.LoadLayout(\"SVNewlayout\")";
Debug.ShouldStop(2097152);
parent.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("SVNewlayout")),sabtemahsoolact.mostCurrent.activityBA);
 BA.debugLineNum = 55;BA.debugLine="ScrollView1.Panel.LoadLayout(\"sabte_mahsool_layou";
Debug.ShouldStop(4194304);
parent.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("sabte_mahsool_layout")),sabtemahsoolact.mostCurrent.activityBA);
 BA.debugLineNum = 57;BA.debugLine="Files.Initialize";
Debug.ShouldStop(16777216);
parent.mostCurrent._files.runVoidMethod ("Initialize");
 BA.debugLineNum = 59;BA.debugLine="ActionBar.Title=SaeloZahra.CSB(\"ثبت محصول جدید\")";
Debug.ShouldStop(67108864);
parent.mostCurrent._actionbar.runMethod(true,"setTitle",BA.ObjectToCharSequence(parent.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,sabtemahsoolact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("ثبت محصول جدید"))).getObject()));
 BA.debugLineNum = 60;BA.debugLine="ActionBar.TitleTextColor=Colors.White";
Debug.ShouldStop(134217728);
parent.mostCurrent._actionbar.runVoidMethod ("setTitleTextColor",parent.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 61;BA.debugLine="ActionBar.NavigationIconDrawable = X1.GetDrawable";
Debug.ShouldStop(268435456);
parent.mostCurrent._actionbar.runMethod(false,"setNavigationIconDrawable",parent.mostCurrent._x1.runMethod(false,"GetDrawable",(Object)(RemoteObject.createImmutable("baseline_arrow_back_white_24"))));
 BA.debugLineNum = 62;BA.debugLine="ActionBar.Color=SaeloZahra.Color";
Debug.ShouldStop(536870912);
parent.mostCurrent._actionbar.runVoidMethod ("setColor",parent.mostCurrent._saelozahra._color /*RemoteObject*/ );
 BA.debugLineNum = 63;BA.debugLine="ActionBar.SetLayout(0,0,100%x,SaeloZahra.Material";
Debug.ShouldStop(1073741824);
parent.mostCurrent._actionbar.runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),sabtemahsoolact.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._saelozahra._materialactionbarheight /*RemoteObject*/ ,parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "+",1, 1)));
 BA.debugLineNum = 66;BA.debugLine="save_btn.Color = SaeloZahra.Color";
Debug.ShouldStop(2);
parent.mostCurrent._save_btn.runVoidMethod ("setColor",parent.mostCurrent._saelozahra._color /*RemoteObject*/ );
 BA.debugLineNum = 67;BA.debugLine="save_btn.textColor = Colors.White";
Debug.ShouldStop(4);
parent.mostCurrent._save_btn.runMethod(true,"setTextColor",parent.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 68;BA.debugLine="zamanekasht_et.Typeface=SaeloZahra.font";
Debug.ShouldStop(8);
parent.mostCurrent._zamanekasht_et.runMethod(false,"setTypeface",(parent.mostCurrent._saelozahra._font /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 69;BA.debugLine="sennemahsool_et.Typeface=SaeloZahra.font";
Debug.ShouldStop(16);
parent.mostCurrent._sennemahsool_et.runMethod(false,"setTypeface",(parent.mostCurrent._saelozahra._font /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 70;BA.debugLine="save_btn.Typeface=SaeloZahra.fontBold";
Debug.ShouldStop(32);
parent.mostCurrent._save_btn.runMethod(false,"setTypeface",(parent.mostCurrent._saelozahra._fontbold /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 71;BA.debugLine="Label5.Typeface=SaeloZahra.font";
Debug.ShouldStop(64);
parent.mostCurrent._label5.runMethod(false,"setTypeface",(parent.mostCurrent._saelozahra._font /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 72;BA.debugLine="Label6.Typeface=SaeloZahra.font";
Debug.ShouldStop(128);
parent.mostCurrent._label6.runMethod(false,"setTypeface",(parent.mostCurrent._saelozahra._font /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 73;BA.debugLine="gorooheMahsoolLbl.Typeface=SaeloZahra.font";
Debug.ShouldStop(256);
parent.mostCurrent._goroohemahsoollbl.runMethod(false,"setTypeface",(parent.mostCurrent._saelozahra._font /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 74;BA.debugLine="zamanekesht_et.Typeface=SaeloZahra.font";
Debug.ShouldStop(512);
parent.mostCurrent._zamanekesht_et.runMethod(false,"setTypeface",(parent.mostCurrent._saelozahra._font /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 75;BA.debugLine="fasele_kasht_et.Typeface=SaeloZahra.font";
Debug.ShouldStop(1024);
parent.mostCurrent._fasele_kasht_et.runMethod(false,"setTypeface",(parent.mostCurrent._saelozahra._font /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 76;BA.debugLine="radif_metr_et.Typeface=SaeloZahra.font";
Debug.ShouldStop(2048);
parent.mostCurrent._radif_metr_et.runMethod(false,"setTypeface",(parent.mostCurrent._saelozahra._font /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 77;BA.debugLine="chah_et.Typeface=SaeloZahra.font";
Debug.ShouldStop(4096);
parent.mostCurrent._chah_et.runMethod(false,"setTypeface",(parent.mostCurrent._saelozahra._font /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 78;BA.debugLine="zamanefasleroshd_et.Typeface=SaeloZahra.font";
Debug.ShouldStop(8192);
parent.mostCurrent._zamanefasleroshd_et.runMethod(false,"setTypeface",(parent.mostCurrent._saelozahra._font /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 79;BA.debugLine="zamane_goldehi_et.Typeface=SaeloZahra.font";
Debug.ShouldStop(16384);
parent.mostCurrent._zamane_goldehi_et.runMethod(false,"setTypeface",(parent.mostCurrent._saelozahra._font /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 80;BA.debugLine="zamanebazderakht_et.Typeface=SaeloZahra.font";
Debug.ShouldStop(32768);
parent.mostCurrent._zamanebazderakht_et.runMethod(false,"setTypeface",(parent.mostCurrent._saelozahra._font /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 81;BA.debugLine="name_mahsool_lbl.Typeface=SaeloZahra.font";
Debug.ShouldStop(65536);
parent.mostCurrent._name_mahsool_lbl.runMethod(false,"setTypeface",(parent.mostCurrent._saelozahra._font /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 82;BA.debugLine="tonaj_et.Typeface=SaeloZahra.font";
Debug.ShouldStop(131072);
parent.mostCurrent._tonaj_et.runMethod(false,"setTypeface",(parent.mostCurrent._saelozahra._font /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 83;BA.debugLine="amount_et.Typeface=SaeloZahra.font";
Debug.ShouldStop(262144);
parent.mostCurrent._amount_et.runMethod(false,"setTypeface",(parent.mostCurrent._saelozahra._font /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 84;BA.debugLine="zaman_eraa_et.Typeface=SaeloZahra.font";
Debug.ShouldStop(524288);
parent.mostCurrent._zaman_eraa_et.runMethod(false,"setTypeface",(parent.mostCurrent._saelozahra._font /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 85;BA.debugLine="bazarche_des_et.Typeface=SaeloZahra.font";
Debug.ShouldStop(1048576);
parent.mostCurrent._bazarche_des_et.runMethod(false,"setTypeface",(parent.mostCurrent._saelozahra._font /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 86;BA.debugLine="BazarcheSwitch.Typeface=SaeloZahra.font";
Debug.ShouldStop(2097152);
parent.mostCurrent._bazarcheswitch.runMethod(false,"setTypeface",(parent.mostCurrent._saelozahra._font /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 87;BA.debugLine="selectPicBtn.Typeface=SaeloZahra.font";
Debug.ShouldStop(4194304);
parent.mostCurrent._selectpicbtn.runMethod(false,"setTypeface",(parent.mostCurrent._saelozahra._font /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 88;BA.debugLine="yeylagh_map_btn.Typeface=SaeloZahra.font";
Debug.ShouldStop(8388608);
parent.mostCurrent._yeylagh_map_btn.runMethod(false,"setTypeface",(parent.mostCurrent._saelozahra._font /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 89;BA.debugLine="gheshlagh_map_btn.Typeface=SaeloZahra.font";
Debug.ShouldStop(16777216);
parent.mostCurrent._gheshlagh_map_btn.runMethod(false,"setTypeface",(parent.mostCurrent._saelozahra._font /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 90;BA.debugLine="Label3.Typeface=SaeloZahra.font";
Debug.ShouldStop(33554432);
parent.mostCurrent._label3.runMethod(false,"setTypeface",(parent.mostCurrent._saelozahra._font /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 91;BA.debugLine="BazarcheSwitch.Tag=\"no\"";
Debug.ShouldStop(67108864);
parent.mostCurrent._bazarcheswitch.runMethod(false,"setTag",RemoteObject.createImmutable(("no")));
 BA.debugLineNum = 93;BA.debugLine="sennemahsool_et.InputType=sennemahsool_et.INPUT_T";
Debug.ShouldStop(268435456);
parent.mostCurrent._sennemahsool_et.runMethod(true,"setInputType",parent.mostCurrent._sennemahsool_et.getField(true,"INPUT_TYPE_DECIMAL_NUMBERS"));
 BA.debugLineNum = 94;BA.debugLine="masahateYahteKeshET.InputType=sennemahsool_et.INP";
Debug.ShouldStop(536870912);
parent.mostCurrent._masahateyahtekeshet.runMethod(true,"setInputType",parent.mostCurrent._sennemahsool_et.getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 95;BA.debugLine="fasele_kasht_et.InputType=sennemahsool_et.INPUT_T";
Debug.ShouldStop(1073741824);
parent.mostCurrent._fasele_kasht_et.runMethod(true,"setInputType",parent.mostCurrent._sennemahsool_et.getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 96;BA.debugLine="chah_et.InputType=sennemahsool_et.INPUT_TYPE_NUMB";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._chah_et.runMethod(true,"setInputType",parent.mostCurrent._sennemahsool_et.getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 97;BA.debugLine="radif_metr_et.InputType=sennemahsool_et.INPUT_TYP";
Debug.ShouldStop(1);
parent.mostCurrent._radif_metr_et.runMethod(true,"setInputType",parent.mostCurrent._sennemahsool_et.getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 98;BA.debugLine="tonaj_et.InputType=sennemahsool_et.INPUT_TYPE_NUM";
Debug.ShouldStop(2);
parent.mostCurrent._tonaj_et.runMethod(true,"setInputType",parent.mostCurrent._sennemahsool_et.getField(true,"INPUT_TYPE_NUMBERS"));
 BA.debugLineNum = 103;BA.debugLine="tonaj_et.Background=SaeloZahra.CD(SaeloZahra.Colo";
Debug.ShouldStop(64);
parent.mostCurrent._tonaj_et.runMethod(false,"setBackground",(parent.mostCurrent._saelozahra.runMethod(false,"_cd" /*RemoteObject*/ ,sabtemahsoolact.mostCurrent.activityBA,(Object)(parent.mostCurrent._saelozahra._colorlight /*RemoteObject*/ )).getObject()));
 BA.debugLineNum = 104;BA.debugLine="amount_et.Background=SaeloZahra.CD(SaeloZahra.Col";
Debug.ShouldStop(128);
parent.mostCurrent._amount_et.runMethod(false,"setBackground",(parent.mostCurrent._saelozahra.runMethod(false,"_cd" /*RemoteObject*/ ,sabtemahsoolact.mostCurrent.activityBA,(Object)(parent.mostCurrent._saelozahra._colorlight /*RemoteObject*/ )).getObject()));
 BA.debugLineNum = 105;BA.debugLine="zaman_eraa_et.Background=SaeloZahra.CD(SaeloZahra";
Debug.ShouldStop(256);
parent.mostCurrent._zaman_eraa_et.runMethod(false,"setBackground",(parent.mostCurrent._saelozahra.runMethod(false,"_cd" /*RemoteObject*/ ,sabtemahsoolact.mostCurrent.activityBA,(Object)(parent.mostCurrent._saelozahra._colorlight /*RemoteObject*/ )).getObject()));
 BA.debugLineNum = 106;BA.debugLine="bazarche_des_et.Background=SaeloZahra.CD(SaeloZah";
Debug.ShouldStop(512);
parent.mostCurrent._bazarche_des_et.runMethod(false,"setBackground",(parent.mostCurrent._saelozahra.runMethod(false,"_cd" /*RemoteObject*/ ,sabtemahsoolact.mostCurrent.activityBA,(Object)(parent.mostCurrent._saelozahra._colorlight /*RemoteObject*/ )).getObject()));
 BA.debugLineNum = 107;BA.debugLine="zamanebazderakht_et.Background=SaeloZahra.CD(Sael";
Debug.ShouldStop(1024);
parent.mostCurrent._zamanebazderakht_et.runMethod(false,"setBackground",(parent.mostCurrent._saelozahra.runMethod(false,"_cd" /*RemoteObject*/ ,sabtemahsoolact.mostCurrent.activityBA,(Object)(parent.mostCurrent._saelozahra._colorlight /*RemoteObject*/ )).getObject()));
 BA.debugLineNum = 108;BA.debugLine="zamane_goldehi_et.Background=SaeloZahra.CD(SaeloZ";
Debug.ShouldStop(2048);
parent.mostCurrent._zamane_goldehi_et.runMethod(false,"setBackground",(parent.mostCurrent._saelozahra.runMethod(false,"_cd" /*RemoteObject*/ ,sabtemahsoolact.mostCurrent.activityBA,(Object)(parent.mostCurrent._saelozahra._colorlight /*RemoteObject*/ )).getObject()));
 BA.debugLineNum = 109;BA.debugLine="zamanefasleroshd_et.Background=SaeloZahra.CD(Sael";
Debug.ShouldStop(4096);
parent.mostCurrent._zamanefasleroshd_et.runMethod(false,"setBackground",(parent.mostCurrent._saelozahra.runMethod(false,"_cd" /*RemoteObject*/ ,sabtemahsoolact.mostCurrent.activityBA,(Object)(parent.mostCurrent._saelozahra._colorlight /*RemoteObject*/ )).getObject()));
 BA.debugLineNum = 110;BA.debugLine="chah_et.Background=SaeloZahra.CD(SaeloZahra.Color";
Debug.ShouldStop(8192);
parent.mostCurrent._chah_et.runMethod(false,"setBackground",(parent.mostCurrent._saelozahra.runMethod(false,"_cd" /*RemoteObject*/ ,sabtemahsoolact.mostCurrent.activityBA,(Object)(parent.mostCurrent._saelozahra._colorlight /*RemoteObject*/ )).getObject()));
 BA.debugLineNum = 111;BA.debugLine="radif_metr_et.Background=SaeloZahra.CD(SaeloZahra";
Debug.ShouldStop(16384);
parent.mostCurrent._radif_metr_et.runMethod(false,"setBackground",(parent.mostCurrent._saelozahra.runMethod(false,"_cd" /*RemoteObject*/ ,sabtemahsoolact.mostCurrent.activityBA,(Object)(parent.mostCurrent._saelozahra._colorlight /*RemoteObject*/ )).getObject()));
 BA.debugLineNum = 112;BA.debugLine="fasele_kasht_et.Background=SaeloZahra.CD(SaeloZah";
Debug.ShouldStop(32768);
parent.mostCurrent._fasele_kasht_et.runMethod(false,"setBackground",(parent.mostCurrent._saelozahra.runMethod(false,"_cd" /*RemoteObject*/ ,sabtemahsoolact.mostCurrent.activityBA,(Object)(parent.mostCurrent._saelozahra._colorlight /*RemoteObject*/ )).getObject()));
 BA.debugLineNum = 113;BA.debugLine="zamanekesht_et.Background=SaeloZahra.CD(SaeloZahr";
Debug.ShouldStop(65536);
parent.mostCurrent._zamanekesht_et.runMethod(false,"setBackground",(parent.mostCurrent._saelozahra.runMethod(false,"_cd" /*RemoteObject*/ ,sabtemahsoolact.mostCurrent.activityBA,(Object)(parent.mostCurrent._saelozahra._colorlight /*RemoteObject*/ )).getObject()));
 BA.debugLineNum = 114;BA.debugLine="zamanekasht_et.Background=SaeloZahra.CD(SaeloZahr";
Debug.ShouldStop(131072);
parent.mostCurrent._zamanekasht_et.runMethod(false,"setBackground",(parent.mostCurrent._saelozahra.runMethod(false,"_cd" /*RemoteObject*/ ,sabtemahsoolact.mostCurrent.activityBA,(Object)(parent.mostCurrent._saelozahra._colorlight /*RemoteObject*/ )).getObject()));
 BA.debugLineNum = 115;BA.debugLine="sennemahsool_et.Background=SaeloZahra.CD(SaeloZah";
Debug.ShouldStop(262144);
parent.mostCurrent._sennemahsool_et.runMethod(false,"setBackground",(parent.mostCurrent._saelozahra.runMethod(false,"_cd" /*RemoteObject*/ ,sabtemahsoolact.mostCurrent.activityBA,(Object)(parent.mostCurrent._saelozahra._colorlight /*RemoteObject*/ )).getObject()));
 BA.debugLineNum = 116;BA.debugLine="name_mahsool_lbl.Background=SaeloZahra.CD(SaeloZa";
Debug.ShouldStop(524288);
parent.mostCurrent._name_mahsool_lbl.runMethod(false,"setBackground",(parent.mostCurrent._saelozahra.runMethod(false,"_cd" /*RemoteObject*/ ,sabtemahsoolact.mostCurrent.activityBA,(Object)(parent.mostCurrent._saelozahra._colorlight /*RemoteObject*/ )).getObject()));
 BA.debugLineNum = 117;BA.debugLine="gorooh_mahsool_spinner.Background=SaeloZahra.CD(S";
Debug.ShouldStop(1048576);
parent.mostCurrent._gorooh_mahsool_spinner.runMethod(false,"setBackground",(parent.mostCurrent._saelozahra.runMethod(false,"_cd" /*RemoteObject*/ ,sabtemahsoolact.mostCurrent.activityBA,(Object)(parent.mostCurrent._saelozahra._colorlight /*RemoteObject*/ )).getObject()));
 BA.debugLineNum = 118;BA.debugLine="gheshlagh_map_btn.Background=SaeloZahra.CD(SaeloZ";
Debug.ShouldStop(2097152);
parent.mostCurrent._gheshlagh_map_btn.runMethod(false,"setBackground",(parent.mostCurrent._saelozahra.runMethod(false,"_cd" /*RemoteObject*/ ,sabtemahsoolact.mostCurrent.activityBA,(Object)(parent.mostCurrent._saelozahra._colorlight /*RemoteObject*/ )).getObject()));
 BA.debugLineNum = 119;BA.debugLine="yeylagh_map_btn.Background=SaeloZahra.CD(SaeloZah";
Debug.ShouldStop(4194304);
parent.mostCurrent._yeylagh_map_btn.runMethod(false,"setBackground",(parent.mostCurrent._saelozahra.runMethod(false,"_cd" /*RemoteObject*/ ,sabtemahsoolact.mostCurrent.activityBA,(Object)(parent.mostCurrent._saelozahra._colorlight /*RemoteObject*/ )).getObject()));
 BA.debugLineNum = 120;BA.debugLine="selectPicBtn.Background=SaeloZahra.CD(SaeloZahra.";
Debug.ShouldStop(8388608);
parent.mostCurrent._selectpicbtn.runMethod(false,"setBackground",(parent.mostCurrent._saelozahra.runMethod(false,"_cd" /*RemoteObject*/ ,sabtemahsoolact.mostCurrent.activityBA,(Object)(parent.mostCurrent._saelozahra._colorlight /*RemoteObject*/ )).getObject()));
 BA.debugLineNum = 121;BA.debugLine="masahateYahteKeshET.Background=SaeloZahra.CD(Sael";
Debug.ShouldStop(16777216);
parent.mostCurrent._masahateyahtekeshet.runMethod(false,"setBackground",(parent.mostCurrent._saelozahra.runMethod(false,"_cd" /*RemoteObject*/ ,sabtemahsoolact.mostCurrent.activityBA,(Object)(parent.mostCurrent._saelozahra._colorlight /*RemoteObject*/ )).getObject()));
 BA.debugLineNum = 123;BA.debugLine="Label3.Background=SaeloZahra.CD(SaeloZahra.ColorL";
Debug.ShouldStop(67108864);
parent.mostCurrent._label3.runMethod(false,"setBackground",(parent.mostCurrent._saelozahra.runMethod(false,"_cd" /*RemoteObject*/ ,sabtemahsoolact.mostCurrent.activityBA,(Object)(parent.mostCurrent._saelozahra._colorlight /*RemoteObject*/ )).getObject()));
 BA.debugLineNum = 124;BA.debugLine="Label5.Background=SaeloZahra.CD(SaeloZahra.ColorL";
Debug.ShouldStop(134217728);
parent.mostCurrent._label5.runMethod(false,"setBackground",(parent.mostCurrent._saelozahra.runMethod(false,"_cd" /*RemoteObject*/ ,sabtemahsoolact.mostCurrent.activityBA,(Object)(parent.mostCurrent._saelozahra._colorlight /*RemoteObject*/ )).getObject()));
 BA.debugLineNum = 125;BA.debugLine="Label6.Background=SaeloZahra.CD(SaeloZahra.ColorL";
Debug.ShouldStop(268435456);
parent.mostCurrent._label6.runMethod(false,"setBackground",(parent.mostCurrent._saelozahra.runMethod(false,"_cd" /*RemoteObject*/ ,sabtemahsoolact.mostCurrent.activityBA,(Object)(parent.mostCurrent._saelozahra._colorlight /*RemoteObject*/ )).getObject()));
 BA.debugLineNum = 126;BA.debugLine="gorooheMahsoolLbl.Background=SaeloZahra.CD(SaeloZ";
Debug.ShouldStop(536870912);
parent.mostCurrent._goroohemahsoollbl.runMethod(false,"setBackground",(parent.mostCurrent._saelozahra.runMethod(false,"_cd" /*RemoteObject*/ ,sabtemahsoolact.mostCurrent.activityBA,(Object)(parent.mostCurrent._saelozahra._colorlight /*RemoteObject*/ )).getObject()));
 BA.debugLineNum = 128;BA.debugLine="Dim csb_sub As CSBuilder";
Debug.ShouldStop(-2147483648);
_csb_sub = RemoteObject.createNew ("anywheresoftware.b4a.objects.CSBuilder");Debug.locals.put("csb_sub", _csb_sub);
 BA.debugLineNum = 129;BA.debugLine="csb_sub.Initialize";
Debug.ShouldStop(1);
_csb_sub.runVoidMethod ("Initialize");
 BA.debugLineNum = 130;BA.debugLine="csb_sub.Typeface(SaeloZahra.font)";
Debug.ShouldStop(2);
_csb_sub.runVoidMethod ("Typeface",(Object)((parent.mostCurrent._saelozahra._font /*RemoteObject*/ .getObject())));
 BA.debugLineNum = 131;BA.debugLine="csb_sub.Size(14)";
Debug.ShouldStop(4);
_csb_sub.runVoidMethod ("Size",(Object)(BA.numberCast(int.class, 14)));
 BA.debugLineNum = 132;BA.debugLine="csb_sub.Color(Colors.White)";
Debug.ShouldStop(8);
_csb_sub.runVoidMethod ("Color",(Object)(parent.mostCurrent.__c.getField(false,"Colors").getField(true,"White")));
 BA.debugLineNum = 133;BA.debugLine="csb_sub.Append(\" اطلاعات \")";
Debug.ShouldStop(16);
_csb_sub.runVoidMethod ("Append",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(" اطلاعات "))));
 BA.debugLineNum = 134;BA.debugLine="csb_sub.Color(0xFFFFCD44)";
Debug.ShouldStop(32);
_csb_sub.runVoidMethod ("Color",(Object)(BA.numberCast(int.class, ((int)0xffffcd44))));
 BA.debugLineNum = 135;BA.debugLine="csb_sub.Bold";
Debug.ShouldStop(64);
_csb_sub.runVoidMethod ("Bold");
 BA.debugLineNum = 136;BA.debugLine="csb_sub.Append(\" محصول جدید \")";
Debug.ShouldStop(128);
_csb_sub.runVoidMethod ("Append",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(" محصول جدید "))));
 BA.debugLineNum = 137;BA.debugLine="csb_sub.Pop";
Debug.ShouldStop(256);
_csb_sub.runVoidMethod ("Pop");
 BA.debugLineNum = 138;BA.debugLine="csb_sub.Color(Colors.White)";
Debug.ShouldStop(512);
_csb_sub.runVoidMethod ("Color",(Object)(parent.mostCurrent.__c.getField(false,"Colors").getField(true,"White")));
 BA.debugLineNum = 139;BA.debugLine="csb_sub.Append(\" را وارد نمائید \")";
Debug.ShouldStop(1024);
_csb_sub.runVoidMethod ("Append",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(" را وارد نمائید "))));
 BA.debugLineNum = 140;BA.debugLine="csb_sub.PopAll";
Debug.ShouldStop(2048);
_csb_sub.runVoidMethod ("PopAll");
 BA.debugLineNum = 141;BA.debugLine="ActionBar.SubTitle = csb_sub";
Debug.ShouldStop(4096);
parent.mostCurrent._actionbar.runMethod(true,"setSubTitle",BA.ObjectToCharSequence(_csb_sub.getObject()));
 BA.debugLineNum = 144;BA.debugLine="gorooh_mahsool_spinner.Add(SaeloZahra.CSB(\"گروه م";
Debug.ShouldStop(32768);
parent.mostCurrent._gorooh_mahsool_spinner.runVoidMethod ("Add",(Object)(BA.ObjectToString(parent.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,sabtemahsoolact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("گروه محصول"))))));
 BA.debugLineNum = 145;BA.debugLine="gorooh_mahsool_spinner.AddAll(Array As String(\"حب";
Debug.ShouldStop(65536);
parent.mostCurrent._gorooh_mahsool_spinner.runVoidMethod ("AddAll",(Object)(parent.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {11},new Object[] {BA.ObjectToString("حبوبات"),BA.ObjectToString("درختان میوه"),BA.ObjectToString("غلات"),BA.ObjectToString("صیفی جات"),BA.ObjectToString("دانه های روغنی"),BA.ObjectToString("گیاهان دارویی"),BA.ObjectToString("گیاهان ادویه ای"),BA.ObjectToString("زنبورداران"),BA.ObjectToString("دام و طیور"),BA.ObjectToString("آبزیان"),RemoteObject.createImmutable("مراتع")})))));
 BA.debugLineNum = 147;BA.debugLine="noueAbyari_Spinner.AddAll(Array As String(\"غرقابی";
Debug.ShouldStop(262144);
parent.mostCurrent._noueabyari_spinner.runVoidMethod ("AddAll",(Object)(parent.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {4},new Object[] {BA.ObjectToString("غرقابی"),BA.ObjectToString("قطره ای"),BA.ObjectToString("دیم"),RemoteObject.createImmutable("بارانی")})))));
 BA.debugLineNum = 153;BA.debugLine="ScrollView1.Panel.Height=save_btn.Top+save_btn.He";
Debug.ShouldStop(16777216);
parent.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._save_btn.runMethod(true,"getTop"),parent.mostCurrent._save_btn.runMethod(true,"getHeight"),parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 24)))}, "++",2, 1));
 BA.debugLineNum = 155;BA.debugLine="vahed_spinner.Tag=\"hectare\"";
Debug.ShouldStop(67108864);
parent.mostCurrent._vahed_spinner.runMethod(false,"setTag",RemoteObject.createImmutable(("hectare")));
 BA.debugLineNum = 156;BA.debugLine="vahed_spinner.Add(\"هکتار\")";
Debug.ShouldStop(134217728);
parent.mostCurrent._vahed_spinner.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("هکتار")));
 BA.debugLineNum = 157;BA.debugLine="vahed_spinner.Add(\"متر مربع\")";
Debug.ShouldStop(268435456);
parent.mostCurrent._vahed_spinner.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("متر مربع")));
 BA.debugLineNum = 159;BA.debugLine="noueKhakSpinner.Add(\"رسی\")";
Debug.ShouldStop(1073741824);
parent.mostCurrent._nouekhakspinner.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("رسی")));
 BA.debugLineNum = 160;BA.debugLine="noueKhakSpinner.Add(\"شنی\")";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._nouekhakspinner.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("شنی")));
 BA.debugLineNum = 161;BA.debugLine="noueKhakSpinner.Add(\"رسی سیلتی\")";
Debug.ShouldStop(1);
parent.mostCurrent._nouekhakspinner.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("رسی سیلتی")));
 BA.debugLineNum = 162;BA.debugLine="noueKhakSpinner.Add(\"رسی شنی\")";
Debug.ShouldStop(2);
parent.mostCurrent._nouekhakspinner.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("رسی شنی")));
 BA.debugLineNum = 166;BA.debugLine="pdpd.Initialize(\"pdpd\",1402,1400,SaeloZahra.font,";
Debug.ShouldStop(32);
parent.mostCurrent._pdpd.runVoidMethod ("Initialize",sabtemahsoolact.mostCurrent.activityBA,(Object)(BA.ObjectToString("pdpd")),(Object)(BA.numberCast(int.class, 1402)),(Object)(BA.numberCast(int.class, 1400)),(Object)((parent.mostCurrent._saelozahra._font /*RemoteObject*/ .getObject())),(Object)(parent.mostCurrent._saelozahra._colordark /*RemoteObject*/ ),(Object)(BA.ObjectToString("ثبت")),(Object)(BA.ObjectToString("بازگشت")),(Object)(RemoteObject.createImmutable("امروز")));
 BA.debugLineNum = 172;BA.debugLine="Try";
Debug.ShouldStop(2048);
if (true) break;

case 1:
//try
this.state = 20;
this.catchState = 19;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 19;
 BA.debugLineNum = 173;BA.debugLine="If EditMahsoolMap.IsInitialized Then";
Debug.ShouldStop(4096);
if (true) break;

case 4:
//if
this.state = 17;
if (parent._editmahsoolmap.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 175;BA.debugLine="ActionBar.Title = SaeloZahra.CSB(\"ویرایش محصولا";
Debug.ShouldStop(16384);
parent.mostCurrent._actionbar.runMethod(true,"setTitle",BA.ObjectToCharSequence(parent.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,sabtemahsoolact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("ویرایش محصولات"))).getObject()));
 BA.debugLineNum = 176;BA.debugLine="save_btn.Text=\"ویرایش محصول\"";
Debug.ShouldStop(32768);
parent.mostCurrent._save_btn.runMethod(true,"setText",BA.ObjectToCharSequence("ویرایش محصول"));
 BA.debugLineNum = 178;BA.debugLine="vahed_spinner.SelectedIndex 	= vahed_spinner.In";
Debug.ShouldStop(131072);
parent.mostCurrent._vahed_spinner.runMethod(true,"setSelectedIndex",parent.mostCurrent._vahed_spinner.runMethod(true,"IndexOf",(Object)(BA.ObjectToString(parent._editmahsoolmap.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("vahed"))))))));
 BA.debugLineNum = 179;BA.debugLine="noueKhakSpinner.SelectedIndex 	= noueKhakSpinne";
Debug.ShouldStop(262144);
parent.mostCurrent._nouekhakspinner.runMethod(true,"setSelectedIndex",parent.mostCurrent._nouekhakspinner.runMethod(true,"IndexOf",(Object)(BA.ObjectToString(parent._editmahsoolmap.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("khak"))))))));
 BA.debugLineNum = 180;BA.debugLine="noueAbyari_Spinner.SelectedIndex= noueAbyari_Sp";
Debug.ShouldStop(524288);
parent.mostCurrent._noueabyari_spinner.runMethod(true,"setSelectedIndex",parent.mostCurrent._noueabyari_spinner.runMethod(true,"IndexOf",(Object)(BA.ObjectToString(parent._editmahsoolmap.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("abyari"))))))));
 BA.debugLineNum = 182;BA.debugLine="If EditMahsoolMap.Get(\"bazarche\")==\"yes\" Then";
Debug.ShouldStop(2097152);
if (true) break;

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",parent._editmahsoolmap.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("bazarche")))),RemoteObject.createImmutable(("yes")))) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 183;BA.debugLine="BazarcheSwitch_CheckedChange(True)";
Debug.ShouldStop(4194304);
_bazarcheswitch_checkedchange(parent.mostCurrent.__c.getField(true,"True"));
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 185;BA.debugLine="BazarcheSwitch_CheckedChange(False)";
Debug.ShouldStop(16777216);
_bazarcheswitch_checkedchange(parent.mostCurrent.__c.getField(true,"False"));
 if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 188;BA.debugLine="Dim EditMahsoolGroup 	= EditMahsoolMap.Get(\"gro";
Debug.ShouldStop(134217728);
_editmahsoolgroup = BA.ObjectToString(parent._editmahsoolmap.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("group")))));Debug.locals.put("EditMahsoolGroup", _editmahsoolgroup);Debug.locals.put("EditMahsoolGroup", _editmahsoolgroup);
 BA.debugLineNum = 189;BA.debugLine="masahateYahteKeshET.Text= EditMahsoolMap.Get(\"m";
Debug.ShouldStop(268435456);
parent.mostCurrent._masahateyahtekeshet.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(parent._editmahsoolmap.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("masahat"))))));
 BA.debugLineNum = 190;BA.debugLine="EditedPicUrl			= SaeloZahra.site_url&\"reseller/";
Debug.ShouldStop(536870912);
parent.mostCurrent._editedpicurl = RemoteObject.concat(parent.mostCurrent._saelozahra._site_url /*RemoteObject*/ ,RemoteObject.createImmutable("reseller/fileupload/product/"),parent._editmahsoolmap.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("pic")))));
 BA.debugLineNum = 191;BA.debugLine="EditedCategoryID		= EditMahsoolMap.Get(\"categor";
Debug.ShouldStop(1073741824);
parent.mostCurrent._editedcategoryid = BA.ObjectToString(parent._editmahsoolmap.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("category")))));
 BA.debugLineNum = 192;BA.debugLine="EditedProductTitle		= EditMahsoolMap.Get(\"produ";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._editedproducttitle = BA.ObjectToString(parent._editmahsoolmap.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("product_title")))));
 BA.debugLineNum = 193;BA.debugLine="sennemahsool_et.Text 	= EditMahsoolMap.Get(\"sen";
Debug.ShouldStop(1);
parent.mostCurrent._sennemahsool_et.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(parent._editmahsoolmap.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("sen_mahsol"))))));
 BA.debugLineNum = 194;BA.debugLine="chah_et.Text 			= EditMahsoolMap.Get(\"khoroji_c";
Debug.ShouldStop(2);
parent.mostCurrent._chah_et.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(parent._editmahsoolmap.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("khoroji_chah"))))));
 BA.debugLineNum = 195;BA.debugLine="zamanekasht_et.Text 	= EditMahsoolMap.Get(\"zama";
Debug.ShouldStop(4);
parent.mostCurrent._zamanekasht_et.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(parent._editmahsoolmap.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("zaman_kasht"))))));
 BA.debugLineNum = 196;BA.debugLine="zamanekesht_et.Text 	= EditMahsoolMap.Get(\"zama";
Debug.ShouldStop(8);
parent.mostCurrent._zamanekesht_et.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(parent._editmahsoolmap.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("zaman_kesht"))))));
 BA.debugLineNum = 197;BA.debugLine="tonaj_et.Text 			= EditMahsoolMap.Get(\"vazn\")";
Debug.ShouldStop(16);
parent.mostCurrent._tonaj_et.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(parent._editmahsoolmap.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("vazn"))))));
 BA.debugLineNum = 198;BA.debugLine="zaman_eraa_et.Text 		= EditMahsoolMap.Get(\"zama";
Debug.ShouldStop(32);
parent.mostCurrent._zaman_eraa_et.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(parent._editmahsoolmap.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("zaman_eraa"))))));
 BA.debugLineNum = 199;BA.debugLine="amount_et.Text 			= EditMahsoolMap.Get(\"ghimat\"";
Debug.ShouldStop(64);
parent.mostCurrent._amount_et.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(parent._editmahsoolmap.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ghimat"))))));
 BA.debugLineNum = 200;BA.debugLine="bazarche_des_et.Text 	= EditMahsoolMap.Get(\"des";
Debug.ShouldStop(128);
parent.mostCurrent._bazarche_des_et.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(parent._editmahsoolmap.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("des"))))));
 BA.debugLineNum = 201;BA.debugLine="zamane_goldehi_et.Text 	= EditMahsoolMap.Get(\"g";
Debug.ShouldStop(256);
parent.mostCurrent._zamane_goldehi_et.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(parent._editmahsoolmap.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("goldehi_derakhtan"))))));
 BA.debugLineNum = 202;BA.debugLine="zamanebazderakht_et.Text= EditMahsoolMap.Get(\"t";
Debug.ShouldStop(512);
parent.mostCurrent._zamanebazderakht_et.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(parent._editmahsoolmap.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tavarom_javane"))))));
 BA.debugLineNum = 203;BA.debugLine="zamanefasleroshd_et.Text= EditMahsoolMap.Get(\"f";
Debug.ShouldStop(1024);
parent.mostCurrent._zamanefasleroshd_et.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(parent._editmahsoolmap.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fasele_roshd"))))));
 BA.debugLineNum = 204;BA.debugLine="radif_metr_et.Text 		= EditMahsoolMap.Get(\"fase";
Debug.ShouldStop(2048);
parent.mostCurrent._radif_metr_et.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(parent._editmahsoolmap.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fasele_radif"))))));
 BA.debugLineNum = 205;BA.debugLine="fasele_kasht_et.Text 	= EditMahsoolMap.Get(\"fas";
Debug.ShouldStop(4096);
parent.mostCurrent._fasele_kasht_et.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(parent._editmahsoolmap.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fasele_kesht"))))));
 BA.debugLineNum = 206;BA.debugLine="gheshlaghdate_et.Text	= EditMahsoolMap.Get(\"ghe";
Debug.ShouldStop(8192);
parent.mostCurrent._gheshlaghdate_et.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(parent._editmahsoolmap.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("gheshlagh_time"))))));
 BA.debugLineNum = 207;BA.debugLine="yeylaghdate_et.Text		= EditMahsoolMap.Get(\"yeyl";
Debug.ShouldStop(16384);
parent.mostCurrent._yeylaghdate_et.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(parent._editmahsoolmap.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("yeylagh_time"))))));
 BA.debugLineNum = 209;BA.debugLine="Dim ivimgdnld As HttpJob";
Debug.ShouldStop(65536);
_ivimgdnld = RemoteObject.createNew ("ir.saelozahra.damaara.mazraeyeman.httpjob");Debug.locals.put("ivimgdnld", _ivimgdnld);
 BA.debugLineNum = 210;BA.debugLine="ivimgdnld.Initialize(\"ivimgdnld\",Me)";
Debug.ShouldStop(131072);
_ivimgdnld.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_initialize" /*RemoteObject*/ ,sabtemahsoolact.processBA,(Object)(BA.ObjectToString("ivimgdnld")),(Object)(sabtemahsoolact.getObject()));
 BA.debugLineNum = 211;BA.debugLine="ivimgdnld.Download(EditedPicUrl)";
Debug.ShouldStop(262144);
_ivimgdnld.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(parent.mostCurrent._editedpicurl));
 BA.debugLineNum = 212;BA.debugLine="Wait For (ivimgdnld) jobDone(ivimgdnld As HttpJ";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", sabtemahsoolact.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "sabtemahsoolact", "activity_create"), (_ivimgdnld));
this.state = 31;
return;
case 31:
//C
this.state = 13;
_ivimgdnld = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("ivimgdnld", _ivimgdnld);
;
 BA.debugLineNum = 213;BA.debugLine="If ivimgdnld.Success Then";
Debug.ShouldStop(1048576);
if (true) break;

case 13:
//if
this.state = 16;
if (_ivimgdnld.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 214;BA.debugLine="ImageView1.Bitmap = ivimgdnld.GetBitmap";
Debug.ShouldStop(2097152);
parent.mostCurrent._imageview1.runMethod(false,"setBitmap",(_ivimgdnld.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_getbitmap" /*RemoteObject*/ ).getObject()));
 if (true) break;

case 16:
//C
this.state = 17;
;
 if (true) break;

case 17:
//C
this.state = 20;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 19:
//C
this.state = 20;
this.catchState = 0;
 BA.debugLineNum = 219;BA.debugLine="Log(\"edit mahsool error\")";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","49830568",RemoteObject.createImmutable("edit mahsool error"),0);
 BA.debugLineNum = 220;BA.debugLine="Log(LastException)";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","49830569",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",sabtemahsoolact.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 20:
//C
this.state = 21;
this.catchState = 0;
;
 BA.debugLineNum = 224;BA.debugLine="jobListeGroup.Initialize(\"jobListeGroup\",Me)";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._joblistegroup.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_initialize" /*RemoteObject*/ ,sabtemahsoolact.processBA,(Object)(BA.ObjectToString("jobListeGroup")),(Object)(sabtemahsoolact.getObject()));
 BA.debugLineNum = 225;BA.debugLine="If EditMahsoolGroup<>\"\" Then";
Debug.ShouldStop(1);
if (true) break;

case 21:
//if
this.state = 26;
if (RemoteObject.solveBoolean("!",_editmahsoolgroup,BA.ObjectToString(""))) { 
this.state = 23;
}else {
this.state = 25;
}if (true) break;

case 23:
//C
this.state = 26;
 BA.debugLineNum = 226;BA.debugLine="gorooh_mahsool_spinner.Tag = EditMahsoolGroup";
Debug.ShouldStop(2);
parent.mostCurrent._gorooh_mahsool_spinner.runMethod(false,"setTag",(_editmahsoolgroup));
 if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 228;BA.debugLine="gorooh_mahsool_spinner.Tag = \"group1\"";
Debug.ShouldStop(8);
parent.mostCurrent._gorooh_mahsool_spinner.runMethod(false,"setTag",RemoteObject.createImmutable(("group1")));
 if (true) break;

case 26:
//C
this.state = 27;
;
 BA.debugLineNum = 230;BA.debugLine="jobListeGroup.Download(SaeloZahra.json_url&\"produ";
Debug.ShouldStop(32);
parent.mostCurrent._joblistegroup.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.concat(parent.mostCurrent._saelozahra._json_url /*RemoteObject*/ ,RemoteObject.createImmutable("product_category.php?gp="),parent.mostCurrent._gorooh_mahsool_spinner.runMethod(false,"getTag"))));
 BA.debugLineNum = 231;BA.debugLine="LogColor(SaeloZahra.json_url&\"product_category.ph";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","49830580",RemoteObject.concat(parent.mostCurrent._saelozahra._json_url /*RemoteObject*/ ,RemoteObject.createImmutable("product_category.php?gp="),parent.mostCurrent._gorooh_mahsool_spinner.runMethod(false,"getTag")),parent.mostCurrent.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 237;BA.debugLine="downloadListMahsoolJob.Initialize(\"downloadListMa";
Debug.ShouldStop(4096);
parent.mostCurrent._downloadlistmahsooljob.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_initialize" /*RemoteObject*/ ,sabtemahsoolact.processBA,(Object)(BA.ObjectToString("downloadListMahsoolJob")),(Object)(sabtemahsoolact.getObject()));
 BA.debugLineNum = 238;BA.debugLine="SubmitJob.Initialize(\"SubmitJob\",Me)";
Debug.ShouldStop(8192);
parent.mostCurrent._submitjob.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_initialize" /*RemoteObject*/ ,sabtemahsoolact.processBA,(Object)(BA.ObjectToString("SubmitJob")),(Object)(sabtemahsoolact.getObject()));
 BA.debugLineNum = 239;BA.debugLine="array_mavared_darkhasti.Initialize";
Debug.ShouldStop(16384);
parent.mostCurrent._array_mavared_darkhasti.runVoidMethod ("Initialize");
 BA.debugLineNum = 241;BA.debugLine="IME.Initialize(\"IME\")";
Debug.ShouldStop(65536);
parent.mostCurrent._ime.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("IME")));
 BA.debugLineNum = 242;BA.debugLine="IME.AddHeightChangedEvent";
Debug.ShouldStop(131072);
parent.mostCurrent._ime.runVoidMethod ("AddHeightChangedEvent",sabtemahsoolact.mostCurrent.activityBA);
 BA.debugLineNum = 244;BA.debugLine="If SaeloZahra.P.SdkVersion>23 Then";
Debug.ShouldStop(524288);
if (true) break;

case 27:
//if
this.state = 30;
if (RemoteObject.solveBoolean(">",parent.mostCurrent._saelozahra._p /*RemoteObject*/ .runMethod(true,"getSdkVersion"),BA.numberCast(double.class, 23))) { 
this.state = 29;
}if (true) break;

case 29:
//C
this.state = 30;
 BA.debugLineNum = 245;BA.debugLine="Config.Initialize";
Debug.ShouldStop(1048576);
parent.mostCurrent._config.runVoidMethod ("Initialize",sabtemahsoolact.processBA);
 BA.debugLineNum = 246;BA.debugLine="Config.position(Config.POSITION_LEFT)";
Debug.ShouldStop(2097152);
parent.mostCurrent._config.runVoidMethod ("position",(Object)(parent.mostCurrent._config.getField(true,"POSITION_LEFT")));
 BA.debugLineNum = 247;BA.debugLine="Config.primaryColor(SaeloZahra.ColorDark)";
Debug.ShouldStop(4194304);
parent.mostCurrent._config.runVoidMethod ("primaryColor",(Object)(parent.mostCurrent._saelozahra._colordark /*RemoteObject*/ ));
 BA.debugLineNum = 248;BA.debugLine="Config.edge(True)";
Debug.ShouldStop(8388608);
parent.mostCurrent._config.runVoidMethod ("edge",(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 249;BA.debugLine="Config.sensitivity(100)";
Debug.ShouldStop(16777216);
parent.mostCurrent._config.runVoidMethod ("sensitivity",(Object)(BA.numberCast(float.class, 100)));
 BA.debugLineNum = 250;BA.debugLine="Config.scrimColor(Colors.ARGB(180,0,0,0))";
Debug.ShouldStop(33554432);
parent.mostCurrent._config.runVoidMethod ("scrimColor",(Object)(parent.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 180)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))));
 BA.debugLineNum = 252;BA.debugLine="Show.convertActivityToTranslucent";
Debug.ShouldStop(134217728);
parent.mostCurrent._show.runVoidMethod ("convertActivityToTranslucent",sabtemahsoolact.mostCurrent.activityBA);
 BA.debugLineNum = 253;BA.debugLine="Show.attachActivity(Config)";
Debug.ShouldStop(268435456);
parent.mostCurrent._show.runVoidMethod ("attachActivity",sabtemahsoolact.mostCurrent.activityBA,(Object)(parent.mostCurrent._config));
 if (true) break;

case 30:
//C
this.state = -1;
;
 BA.debugLineNum = 256;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 258;BA.debugLine="End Sub";
Debug.ShouldStop(2);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",sabtemahsoolact.processBA, e0.toString());}
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
public static RemoteObject  _activity_keypress(RemoteObject _keycode) throws Exception{
try {
		Debug.PushSubsStack("Activity_KeyPress (sabtemahsoolact) ","sabtemahsoolact",8,sabtemahsoolact.mostCurrent.activityBA,sabtemahsoolact.mostCurrent,313);
if (RapidSub.canDelegate("activity_keypress")) { return ir.saelozahra.damaara.mazraeyeman.sabtemahsoolact.remoteMe.runUserSub(false, "sabtemahsoolact","activity_keypress", _keycode);}
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 313;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 314;BA.debugLine="If KeyCode==KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, sabtemahsoolact.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 315;BA.debugLine="Actionbar_NavigationItemClick";
Debug.ShouldStop(67108864);
_actionbar_navigationitemclick();
 BA.debugLineNum = 316;BA.debugLine="Return False";
Debug.ShouldStop(134217728);
if (true) return sabtemahsoolact.mostCurrent.__c.getField(true,"False");
 }else {
 BA.debugLineNum = 318;BA.debugLine="Return True";
Debug.ShouldStop(536870912);
if (true) return sabtemahsoolact.mostCurrent.__c.getField(true,"True");
 };
 BA.debugLineNum = 320;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (sabtemahsoolact) ","sabtemahsoolact",8,sabtemahsoolact.mostCurrent.activityBA,sabtemahsoolact.mostCurrent,261);
if (RapidSub.canDelegate("activity_pause")) { return ir.saelozahra.damaara.mazraeyeman.sabtemahsoolact.remoteMe.runUserSub(false, "sabtemahsoolact","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 261;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(16);
 BA.debugLineNum = 263;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (sabtemahsoolact) ","sabtemahsoolact",8,sabtemahsoolact.mostCurrent.activityBA,sabtemahsoolact.mostCurrent,266);
if (RapidSub.canDelegate("activity_resume")) { return ir.saelozahra.damaara.mazraeyeman.sabtemahsoolact.remoteMe.runUserSub(false, "sabtemahsoolact","activity_resume");}
RemoteObject _csbcheck = RemoteObject.declareNull("anywheresoftware.b4a.objects.CSBuilder");
RemoteObject _csbcheck1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.CSBuilder");
 BA.debugLineNum = 266;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(512);
 BA.debugLineNum = 268;BA.debugLine="If File.Exists(SaeloZahra.dir,\"gheshlagh_lat\") Th";
Debug.ShouldStop(2048);
if (sabtemahsoolact.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(sabtemahsoolact.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("gheshlagh_lat"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 270;BA.debugLine="Dim csbcheck As CSBuilder";
Debug.ShouldStop(8192);
_csbcheck = RemoteObject.createNew ("anywheresoftware.b4a.objects.CSBuilder");Debug.locals.put("csbcheck", _csbcheck);
 BA.debugLineNum = 271;BA.debugLine="csbcheck.Initialize";
Debug.ShouldStop(16384);
_csbcheck.runVoidMethod ("Initialize");
 BA.debugLineNum = 272;BA.debugLine="csbcheck.Typeface(SaeloZahra.font)";
Debug.ShouldStop(32768);
_csbcheck.runVoidMethod ("Typeface",(Object)((sabtemahsoolact.mostCurrent._saelozahra._font /*RemoteObject*/ .getObject())));
 BA.debugLineNum = 273;BA.debugLine="csbcheck.Append(\" انتخاب محل قشلاق \")";
Debug.ShouldStop(65536);
_csbcheck.runVoidMethod ("Append",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(" انتخاب محل قشلاق "))));
 BA.debugLineNum = 274;BA.debugLine="csbcheck.Color(SaeloZahra.ColorDark)";
Debug.ShouldStop(131072);
_csbcheck.runVoidMethod ("Color",(Object)(sabtemahsoolact.mostCurrent._saelozahra._colordark /*RemoteObject*/ ));
 BA.debugLineNum = 275;BA.debugLine="csbcheck.Typeface(Typeface.FONTAWESOME)";
Debug.ShouldStop(262144);
_csbcheck.runVoidMethod ("Typeface",(Object)(sabtemahsoolact.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"getFONTAWESOME")));
 BA.debugLineNum = 276;BA.debugLine="csbcheck.Append(Chr(0xF046)).PopAll";
Debug.ShouldStop(524288);
_csbcheck.runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(sabtemahsoolact.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xf046))))))).runVoidMethod ("PopAll");
 BA.debugLineNum = 278;BA.debugLine="gheshlagh_map_btn.Text = csbcheck";
Debug.ShouldStop(2097152);
sabtemahsoolact.mostCurrent._gheshlagh_map_btn.runMethod(true,"setText",BA.ObjectToCharSequence(_csbcheck.getObject()));
 };
 BA.debugLineNum = 282;BA.debugLine="If File.Exists(SaeloZahra.dir,\"yeylagh_lng\") Then";
Debug.ShouldStop(33554432);
if (sabtemahsoolact.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(sabtemahsoolact.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("yeylagh_lng"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 284;BA.debugLine="Dim csbcheck1 As CSBuilder";
Debug.ShouldStop(134217728);
_csbcheck1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.CSBuilder");Debug.locals.put("csbcheck1", _csbcheck1);
 BA.debugLineNum = 285;BA.debugLine="csbcheck1.Initialize";
Debug.ShouldStop(268435456);
_csbcheck1.runVoidMethod ("Initialize");
 BA.debugLineNum = 286;BA.debugLine="csbcheck1.Typeface(SaeloZahra.font)";
Debug.ShouldStop(536870912);
_csbcheck1.runVoidMethod ("Typeface",(Object)((sabtemahsoolact.mostCurrent._saelozahra._font /*RemoteObject*/ .getObject())));
 BA.debugLineNum = 287;BA.debugLine="csbcheck1.Append(\" انتخاب محل ییلاق \")";
Debug.ShouldStop(1073741824);
_csbcheck1.runVoidMethod ("Append",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(" انتخاب محل ییلاق "))));
 BA.debugLineNum = 288;BA.debugLine="csbcheck1.Color(SaeloZahra.ColorDark)";
Debug.ShouldStop(-2147483648);
_csbcheck1.runVoidMethod ("Color",(Object)(sabtemahsoolact.mostCurrent._saelozahra._colordark /*RemoteObject*/ ));
 BA.debugLineNum = 289;BA.debugLine="csbcheck1.Typeface(Typeface.FONTAWESOME)";
Debug.ShouldStop(1);
_csbcheck1.runVoidMethod ("Typeface",(Object)(sabtemahsoolact.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"getFONTAWESOME")));
 BA.debugLineNum = 290;BA.debugLine="csbcheck1.Append(Chr(0xF046)).PopAll";
Debug.ShouldStop(2);
_csbcheck1.runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(sabtemahsoolact.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xf046))))))).runVoidMethod ("PopAll");
 BA.debugLineNum = 292;BA.debugLine="yeylagh_map_btn.Text = csbcheck1";
Debug.ShouldStop(8);
sabtemahsoolact.mostCurrent._yeylagh_map_btn.runMethod(true,"setText",BA.ObjectToCharSequence(_csbcheck1.getObject()));
 };
 BA.debugLineNum = 297;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _back_click() throws Exception{
try {
		Debug.PushSubsStack("back_Click (sabtemahsoolact) ","sabtemahsoolact",8,sabtemahsoolact.mostCurrent.activityBA,sabtemahsoolact.mostCurrent,303);
if (RapidSub.canDelegate("back_click")) { return ir.saelozahra.damaara.mazraeyeman.sabtemahsoolact.remoteMe.runUserSub(false, "sabtemahsoolact","back_click");}
 BA.debugLineNum = 303;BA.debugLine="Sub back_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 304;BA.debugLine="Actionbar_NavigationItemClick";
Debug.ShouldStop(32768);
_actionbar_navigationitemclick();
 BA.debugLineNum = 305;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _bazarcheswitch_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("BazarcheSwitch_CheckedChange (sabtemahsoolact) ","sabtemahsoolact",8,sabtemahsoolact.mostCurrent.activityBA,sabtemahsoolact.mostCurrent,688);
if (RapidSub.canDelegate("bazarcheswitch_checkedchange")) { return ir.saelozahra.damaara.mazraeyeman.sabtemahsoolact.remoteMe.runUserSub(false, "sabtemahsoolact","bazarcheswitch_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 688;BA.debugLine="Sub BazarcheSwitch_CheckedChange(Checked As Boolea";
Debug.ShouldStop(32768);
 BA.debugLineNum = 689;BA.debugLine="Panel_bazarche.Visible=Checked";
Debug.ShouldStop(65536);
sabtemahsoolact.mostCurrent._panel_bazarche.runMethod(true,"setVisible",_checked);
 BA.debugLineNum = 690;BA.debugLine="Panel_bazarche.Top=BazarcheSwitch.Top+BazarcheSwi";
Debug.ShouldStop(131072);
sabtemahsoolact.mostCurrent._panel_bazarche.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {sabtemahsoolact.mostCurrent._bazarcheswitch.runMethod(true,"getTop"),sabtemahsoolact.mostCurrent._bazarcheswitch.runMethod(true,"getHeight"),sabtemahsoolact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 22)))}, "++",2, 1));
 BA.debugLineNum = 691;BA.debugLine="If Checked Then";
Debug.ShouldStop(262144);
if (_checked.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 692;BA.debugLine="save_btn.Top = Panel_bazarche.Top+Panel_bazarche";
Debug.ShouldStop(524288);
sabtemahsoolact.mostCurrent._save_btn.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {sabtemahsoolact.mostCurrent._panel_bazarche.runMethod(true,"getTop"),sabtemahsoolact.mostCurrent._panel_bazarche.runMethod(true,"getHeight"),sabtemahsoolact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))}, "++",2, 1));
 BA.debugLineNum = 693;BA.debugLine="ScrollView1.Panel.Height = save_btn.Top + save_b";
Debug.ShouldStop(1048576);
sabtemahsoolact.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {sabtemahsoolact.mostCurrent._save_btn.runMethod(true,"getTop"),sabtemahsoolact.mostCurrent._save_btn.runMethod(true,"getHeight"),sabtemahsoolact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 24)))}, "++",2, 1));
 BA.debugLineNum = 694;BA.debugLine="BazarcheSwitch.Tag=\"yes\"";
Debug.ShouldStop(2097152);
sabtemahsoolact.mostCurrent._bazarcheswitch.runMethod(false,"setTag",RemoteObject.createImmutable(("yes")));
 }else {
 BA.debugLineNum = 696;BA.debugLine="save_btn.Top = BazarcheSwitch.Top+BazarcheSwitch";
Debug.ShouldStop(8388608);
sabtemahsoolact.mostCurrent._save_btn.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {sabtemahsoolact.mostCurrent._bazarcheswitch.runMethod(true,"getTop"),sabtemahsoolact.mostCurrent._bazarcheswitch.runMethod(true,"getHeight"),sabtemahsoolact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))}, "++",2, 1));
 BA.debugLineNum = 697;BA.debugLine="ScrollView1.Panel.Height = save_btn.Top + save_b";
Debug.ShouldStop(16777216);
sabtemahsoolact.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {sabtemahsoolact.mostCurrent._save_btn.runMethod(true,"getTop"),sabtemahsoolact.mostCurrent._save_btn.runMethod(true,"getHeight"),sabtemahsoolact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 24)))}, "++",2, 1));
 BA.debugLineNum = 698;BA.debugLine="BazarcheSwitch.Tag=\"no\"";
Debug.ShouldStop(33554432);
sabtemahsoolact.mostCurrent._bazarcheswitch.runMethod(false,"setTag",RemoteObject.createImmutable(("no")));
 };
 BA.debugLineNum = 700;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cc_result(RemoteObject _success,RemoteObject _dir,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("CC_Result (sabtemahsoolact) ","sabtemahsoolact",8,sabtemahsoolact.mostCurrent.activityBA,sabtemahsoolact.mostCurrent,724);
if (RapidSub.canDelegate("cc_result")) { return ir.saelozahra.damaara.mazraeyeman.sabtemahsoolact.remoteMe.runUserSub(false, "sabtemahsoolact","cc_result", _success, _dir, _filename);}
RemoteObject _filetype = RemoteObject.createImmutable("");
RemoteObject _fd = RemoteObject.declareNull("ir.saelozahra.damaara.mazraeyeman.httpjob._multipartfiledata");
Debug.locals.put("Success", _success);
Debug.locals.put("Dir", _dir);
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 724;BA.debugLine="Sub CC_Result (Success As Boolean, Dir As String,";
Debug.ShouldStop(524288);
 BA.debugLineNum = 726;BA.debugLine="If Success = True Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_success,sabtemahsoolact.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 728;BA.debugLine="ImageView1.Bitmap = LoadBitmapSample(Dir, FileNa";
Debug.ShouldStop(8388608);
sabtemahsoolact.mostCurrent._imageview1.runMethod(false,"setBitmap",(sabtemahsoolact.mostCurrent.__c.runMethod(false,"LoadBitmapSample",(Object)(_dir),(Object)(_filename),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {sabtemahsoolact.mostCurrent._imageview1.runMethod(true,"getWidth"),RemoteObject.createImmutable(1.2)}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {sabtemahsoolact.mostCurrent._imageview1.runMethod(true,"getHeight"),RemoteObject.createImmutable(1.2)}, "*",0, 0)))).getObject()));
 BA.debugLineNum = 731;BA.debugLine="Dim filetype As String";
Debug.ShouldStop(67108864);
_filetype = RemoteObject.createImmutable("");Debug.locals.put("filetype", _filetype);
 BA.debugLineNum = 732;BA.debugLine="Dim fd As MultipartFileData";
Debug.ShouldStop(134217728);
_fd = RemoteObject.createNew ("ir.saelozahra.damaara.mazraeyeman.httpjob._multipartfiledata");Debug.locals.put("fd", _fd);
 BA.debugLineNum = 733;BA.debugLine="fd.Initialize";
Debug.ShouldStop(268435456);
_fd.runVoidMethod ("Initialize");
 BA.debugLineNum = 734;BA.debugLine="fd.KeyName=\"fileupload\"";
Debug.ShouldStop(536870912);
_fd.setField ("KeyName" /*RemoteObject*/ ,BA.ObjectToString("fileupload"));
 BA.debugLineNum = 736;BA.debugLine="If FileName.Contains(\".png\") Then";
Debug.ShouldStop(-2147483648);
if (_filename.runMethod(true,"contains",(Object)(RemoteObject.createImmutable(".png"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 737;BA.debugLine="fd.ContentType = \"image/png\"";
Debug.ShouldStop(1);
_fd.setField ("ContentType" /*RemoteObject*/ ,BA.ObjectToString("image/png"));
 BA.debugLineNum = 738;BA.debugLine="filetype = \"png\"";
Debug.ShouldStop(2);
_filetype = BA.ObjectToString("png");Debug.locals.put("filetype", _filetype);
 }else {
 BA.debugLineNum = 740;BA.debugLine="fd.ContentType = \"image/jpeg\"";
Debug.ShouldStop(8);
_fd.setField ("ContentType" /*RemoteObject*/ ,BA.ObjectToString("image/jpeg"));
 BA.debugLineNum = 741;BA.debugLine="filetype = \"jpg\"";
Debug.ShouldStop(16);
_filetype = BA.ObjectToString("jpg");Debug.locals.put("filetype", _filetype);
 };
 BA.debugLineNum = 744;BA.debugLine="File.Copy(Dir,FileName,SaeloZahra.dir,\"image.\"&f";
Debug.ShouldStop(128);
sabtemahsoolact.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(_dir),(Object)(_filename),(Object)(sabtemahsoolact.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("image."),_filetype)));
 BA.debugLineNum = 746;BA.debugLine="fd.Dir= SaeloZahra.dir";
Debug.ShouldStop(512);
_fd.setField ("Dir" /*RemoteObject*/ ,sabtemahsoolact.mostCurrent._saelozahra._dir /*RemoteObject*/ );
 BA.debugLineNum = 747;BA.debugLine="fd.FileName=\"image.\"&filetype";
Debug.ShouldStop(1024);
_fd.setField ("FileName" /*RemoteObject*/ ,RemoteObject.concat(RemoteObject.createImmutable("image."),_filetype));
 BA.debugLineNum = 749;BA.debugLine="Files.Add(fd)";
Debug.ShouldStop(4096);
sabtemahsoolact.mostCurrent._files.runVoidMethod ("Add",(Object)((_fd)));
 }else {
 BA.debugLineNum = 752;BA.debugLine="BSFileChooser1.Show3(\"tFile\", Array As String(\"j";
Debug.ShouldStop(32768);
sabtemahsoolact.mostCurrent._bsfilechooser1.runVoidMethod ("Show3",sabtemahsoolact.processBA,(Object)(BA.ObjectToString("tFile")),(Object)(sabtemahsoolact.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {3},new Object[] {BA.ObjectToString("jpeg"),BA.ObjectToString("jpg"),RemoteObject.createImmutable("png")})))));
 BA.debugLineNum = 753;BA.debugLine="ToastMessageShow(\"BS File Chooser :(\",False)";
Debug.ShouldStop(65536);
sabtemahsoolact.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("BS File Chooser :(")),(Object)(sabtemahsoolact.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 756;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _chkb_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("chkb_CheckedChange (sabtemahsoolact) ","sabtemahsoolact",8,sabtemahsoolact.mostCurrent.activityBA,sabtemahsoolact.mostCurrent,450);
if (RapidSub.canDelegate("chkb_checkedchange")) { return ir.saelozahra.damaara.mazraeyeman.sabtemahsoolact.remoteMe.runUserSub(false, "sabtemahsoolact","chkb_checkedchange", _checked);}
RemoteObject _chk = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
RemoteObject _chk_id = RemoteObject.declareNull("Object");
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 450;BA.debugLine="Sub chkb_CheckedChange(Checked As Boolean)";
Debug.ShouldStop(2);
 BA.debugLineNum = 452;BA.debugLine="Dim chk As CheckBox";
Debug.ShouldStop(8);
_chk = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");Debug.locals.put("chk", _chk);
 BA.debugLineNum = 453;BA.debugLine="chk.Initialize(\"\")";
Debug.ShouldStop(16);
_chk.runVoidMethod ("Initialize",sabtemahsoolact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 454;BA.debugLine="chk=Sender";
Debug.ShouldStop(32);
_chk = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper"), sabtemahsoolact.mostCurrent.__c.runMethod(false,"Sender",sabtemahsoolact.mostCurrent.activityBA));Debug.locals.put("chk", _chk);
 BA.debugLineNum = 456;BA.debugLine="If Checked Then";
Debug.ShouldStop(128);
if (_checked.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 457;BA.debugLine="If array_mavared_darkhasti.IndexOf(chk.Tag)==-1";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",sabtemahsoolact.mostCurrent._array_mavared_darkhasti.runMethod(true,"IndexOf",(Object)(_chk.runMethod(false,"getTag"))),BA.numberCast(double.class, -(double) (0 + 1)))) { 
sabtemahsoolact.mostCurrent._array_mavared_darkhasti.runVoidMethod ("Add",(Object)(_chk.runMethod(false,"getTag")));};
 }else {
 BA.debugLineNum = 459;BA.debugLine="If array_mavared_darkhasti.IndexOf(chk.Tag)>-1 T";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean(">",sabtemahsoolact.mostCurrent._array_mavared_darkhasti.runMethod(true,"IndexOf",(Object)(_chk.runMethod(false,"getTag"))),BA.numberCast(double.class, -(double) (0 + 1)))) { 
sabtemahsoolact.mostCurrent._array_mavared_darkhasti.runVoidMethod ("RemoveAt",(Object)(sabtemahsoolact.mostCurrent._array_mavared_darkhasti.runMethod(true,"IndexOf",(Object)(_chk.runMethod(false,"getTag")))));};
 };
 BA.debugLineNum = 462;BA.debugLine="mavarede_darkhasti = \"\"";
Debug.ShouldStop(8192);
sabtemahsoolact.mostCurrent._mavarede_darkhasti = BA.ObjectToString("");
 BA.debugLineNum = 463;BA.debugLine="For Each chk_id In array_mavared_darkhasti";
Debug.ShouldStop(16384);
{
final RemoteObject group10 = sabtemahsoolact.mostCurrent._array_mavared_darkhasti;
final int groupLen10 = group10.runMethod(true,"getSize").<Integer>get()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_chk_id = group10.runMethod(false,"Get",index10);Debug.locals.put("chk_id", _chk_id);
Debug.locals.put("chk_id", _chk_id);
 BA.debugLineNum = 464;BA.debugLine="mavarede_darkhasti = mavarede_darkhasti&chk_id&\"";
Debug.ShouldStop(32768);
sabtemahsoolact.mostCurrent._mavarede_darkhasti = RemoteObject.concat(sabtemahsoolact.mostCurrent._mavarede_darkhasti,_chk_id,RemoteObject.createImmutable(","));
 }
}Debug.locals.put("chk_id", _chk_id);
;
 BA.debugLineNum = 466;BA.debugLine="Log(mavarede_darkhasti)";
Debug.ShouldStop(131072);
sabtemahsoolact.mostCurrent.__c.runVoidMethod ("LogImpl","410420240",sabtemahsoolact.mostCurrent._mavarede_darkhasti,0);
 BA.debugLineNum = 468;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gheshlagh_map_btn_click() throws Exception{
try {
		Debug.PushSubsStack("gheshlagh_map_btn_Click (sabtemahsoolact) ","sabtemahsoolact",8,sabtemahsoolact.mostCurrent.activityBA,sabtemahsoolact.mostCurrent,677);
if (RapidSub.canDelegate("gheshlagh_map_btn_click")) { return ir.saelozahra.damaara.mazraeyeman.sabtemahsoolact.remoteMe.runUserSub(false, "sabtemahsoolact","gheshlagh_map_btn_click");}
 BA.debugLineNum = 677;BA.debugLine="Sub gheshlagh_map_btn_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 678;BA.debugLine="select_map_act.WhatLove=\"gheshlagh\"";
Debug.ShouldStop(32);
sabtemahsoolact.mostCurrent._select_map_act._whatlove /*RemoteObject*/  = BA.ObjectToString("gheshlagh");
 BA.debugLineNum = 679;BA.debugLine="StartActivity(select_map_act)";
Debug.ShouldStop(64);
sabtemahsoolact.mostCurrent.__c.runVoidMethod ("StartActivity",sabtemahsoolact.processBA,(Object)((sabtemahsoolact.mostCurrent._select_map_act.getObject())));
 BA.debugLineNum = 680;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gheshlaghdate_et_focuschanged(RemoteObject _hasfocus) throws Exception{
try {
		Debug.PushSubsStack("gheshlaghdate_et_FocusChanged (sabtemahsoolact) ","sabtemahsoolact",8,sabtemahsoolact.mostCurrent.activityBA,sabtemahsoolact.mostCurrent,512);
if (RapidSub.canDelegate("gheshlaghdate_et_focuschanged")) { return ir.saelozahra.damaara.mazraeyeman.sabtemahsoolact.remoteMe.runUserSub(false, "sabtemahsoolact","gheshlaghdate_et_focuschanged", _hasfocus);}
Debug.locals.put("HasFocus", _hasfocus);
 BA.debugLineNum = 512;BA.debugLine="Sub gheshlaghdate_et_FocusChanged (HasFocus As Boo";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 513;BA.debugLine="witchDatePicker = \"gheshlaghdate_et\"";
Debug.ShouldStop(1);
sabtemahsoolact.mostCurrent._witchdatepicker = BA.ObjectToString("gheshlaghdate_et");
 BA.debugLineNum = 514;BA.debugLine="If HasFocus Then pdpd.show";
Debug.ShouldStop(2);
if (_hasfocus.<Boolean>get().booleanValue()) { 
sabtemahsoolact.mostCurrent._pdpd.runVoidMethod ("show");};
 BA.debugLineNum = 515;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 14;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 15;BA.debugLine="Dim Config 	As Amir_SliderConfig";
sabtemahsoolact.mostCurrent._config = RemoteObject.createNew ("ir.aghajari.slider.Amir_SlisderConfig");
 //BA.debugLineNum = 16;BA.debugLine="Dim Show 	As Amir_SliderShow";
sabtemahsoolact.mostCurrent._show = RemoteObject.createNew ("ir.aghajari.slider.Amir_SliderShow");
 //BA.debugLineNum = 18;BA.debugLine="Dim X1 As XmlLayoutBuilder";
sabtemahsoolact.mostCurrent._x1 = RemoteObject.createNew ("anywheresoftware.b4a.object.XmlLayoutBuilder");
 //BA.debugLineNum = 19;BA.debugLine="Dim witchDatePicker As String";
sabtemahsoolact.mostCurrent._witchdatepicker = RemoteObject.createImmutable("");
 //BA.debugLineNum = 20;BA.debugLine="Dim pdpd As ParsDatePickerDialog";
sabtemahsoolact.mostCurrent._pdpd = RemoteObject.createNew ("com.ParsDatePickerDialog.ParsDatePickerDialog");
 //BA.debugLineNum = 21;BA.debugLine="Private Label3,Label5,Label6,gorooheMahsoolLbl As";
sabtemahsoolact.mostCurrent._label3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
sabtemahsoolact.mostCurrent._label5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
sabtemahsoolact.mostCurrent._label6 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
sabtemahsoolact.mostCurrent._goroohemahsoollbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private ScrollView1 As ScrollView";
sabtemahsoolact.mostCurrent._scrollview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private gorooh_mahsool_spinner,noueAbyari_Spinner";
sabtemahsoolact.mostCurrent._gorooh_mahsool_spinner = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
sabtemahsoolact.mostCurrent._noueabyari_spinner = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
sabtemahsoolact.mostCurrent._vahed_spinner = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
sabtemahsoolact.mostCurrent._nouekhakspinner = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
sabtemahsoolact.mostCurrent._name_mahsool_spinner = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private save_btn As Button";
sabtemahsoolact.mostCurrent._save_btn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private PanelMavaredeDarkhasti,PaneleAshayer,pane";
sabtemahsoolact.mostCurrent._panelmavarededarkhasti = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
sabtemahsoolact.mostCurrent._paneleashayer = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
sabtemahsoolact.mostCurrent._panel_keshavarzi = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private zamanekasht_et,sennemahsool_et,zamanebazd";
sabtemahsoolact.mostCurrent._zamanekasht_et = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
sabtemahsoolact.mostCurrent._sennemahsool_et = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
sabtemahsoolact.mostCurrent._zamanebazderakht_et = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
sabtemahsoolact.mostCurrent._zamanekesht_et = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
sabtemahsoolact.mostCurrent._fasele_kasht_et = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
sabtemahsoolact.mostCurrent._radif_metr_et = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
sabtemahsoolact.mostCurrent._chah_et = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
sabtemahsoolact.mostCurrent._zamanefasleroshd_et = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
sabtemahsoolact.mostCurrent._zamane_goldehi_et = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private group1RadioButton1,group2RadioButton2 As";
sabtemahsoolact.mostCurrent._group1radiobutton1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper");
sabtemahsoolact.mostCurrent._group2radiobutton2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Dim jobListeGroup,downloadListMahsoolJob,SubmitJo";
sabtemahsoolact.mostCurrent._joblistegroup = RemoteObject.createNew ("ir.saelozahra.damaara.mazraeyeman.httpjob");
sabtemahsoolact.mostCurrent._downloadlistmahsooljob = RemoteObject.createNew ("ir.saelozahra.damaara.mazraeyeman.httpjob");
sabtemahsoolact.mostCurrent._submitjob = RemoteObject.createNew ("ir.saelozahra.damaara.mazraeyeman.httpjob");
 //BA.debugLineNum = 29;BA.debugLine="Private name_mahsool_lbl As Label";
sabtemahsoolact.mostCurrent._name_mahsool_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Dim ThisGroupTypeID,ThisProductID As Int ',checkB";
sabtemahsoolact._thisgrouptypeid = RemoteObject.createImmutable(0);
sabtemahsoolact._thisproductid = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 31;BA.debugLine="Dim array_mavared_darkhasti,Files As List";
sabtemahsoolact.mostCurrent._array_mavared_darkhasti = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
sabtemahsoolact.mostCurrent._files = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 32;BA.debugLine="Dim mavarede_darkhasti As String = \"\"";
sabtemahsoolact.mostCurrent._mavarede_darkhasti = BA.ObjectToString("");
 //BA.debugLineNum = 33;BA.debugLine="Private gheshlaghdate_et,yeylaghdate_et As EditTe";
sabtemahsoolact.mostCurrent._gheshlaghdate_et = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
sabtemahsoolact.mostCurrent._yeylaghdate_et = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private yeylagh_map_btn,gheshlagh_map_btn,selectP";
sabtemahsoolact.mostCurrent._yeylagh_map_btn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
sabtemahsoolact.mostCurrent._gheshlagh_map_btn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
sabtemahsoolact.mostCurrent._selectpicbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private BazarcheSwitch As ACSwitch";
sabtemahsoolact.mostCurrent._bazarcheswitch = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACSwitchCompatWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private ImageView1 As ImageView";
sabtemahsoolact.mostCurrent._imageview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private Panel_bazarche As Panel";
sabtemahsoolact.mostCurrent._panel_bazarche = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Private tonaj_et,amount_et,zaman_eraa_et,bazarche";
sabtemahsoolact.mostCurrent._tonaj_et = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
sabtemahsoolact.mostCurrent._amount_et = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
sabtemahsoolact.mostCurrent._zaman_eraa_et = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
sabtemahsoolact.mostCurrent._bazarche_des_et = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
sabtemahsoolact.mostCurrent._masahateyahtekeshet = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Dim EditedProductTitle As String";
sabtemahsoolact.mostCurrent._editedproducttitle = RemoteObject.createImmutable("");
 //BA.debugLineNum = 42;BA.debugLine="Dim EditedCategoryID As String";
sabtemahsoolact.mostCurrent._editedcategoryid = RemoteObject.createImmutable("");
 //BA.debugLineNum = 43;BA.debugLine="Dim EditedPicUrl As String";
sabtemahsoolact.mostCurrent._editedpicurl = RemoteObject.createImmutable("");
 //BA.debugLineNum = 45;BA.debugLine="Dim BSFileChooser1 As BSFileChooser";
sabtemahsoolact.mostCurrent._bsfilechooser1 = RemoteObject.createNew ("ir.blue_saffron.libs.BSFileChooser");
 //BA.debugLineNum = 47;BA.debugLine="Dim IME As IME";
sabtemahsoolact.mostCurrent._ime = RemoteObject.createNew ("anywheresoftware.b4a.objects.IME");
 //BA.debugLineNum = 48;BA.debugLine="Private ActionBar As ACToolBarDark";
sabtemahsoolact.mostCurrent._actionbar = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACToolbarDarkWrapper");
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _gorooh_mahsool_spinner_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("gorooh_mahsool_spinner_ItemClick (sabtemahsoolact) ","sabtemahsoolact",8,sabtemahsoolact.mostCurrent.activityBA,sabtemahsoolact.mostCurrent,470);
if (RapidSub.canDelegate("gorooh_mahsool_spinner_itemclick")) { return ir.saelozahra.damaara.mazraeyeman.sabtemahsoolact.remoteMe.runUserSub(false, "sabtemahsoolact","gorooh_mahsool_spinner_itemclick", _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 470;BA.debugLine="Sub gorooh_mahsool_spinner_ItemClick (Position As";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 472;BA.debugLine="Log(Position&Value)";
Debug.ShouldStop(8388608);
sabtemahsoolact.mostCurrent.__c.runVoidMethod ("LogImpl","410485762",RemoteObject.concat(_position,_value),0);
 BA.debugLineNum = 474;BA.debugLine="ThisGroupTypeID = GroupTypeListByName.Get(Value)";
Debug.ShouldStop(33554432);
sabtemahsoolact._thisgrouptypeid = BA.numberCast(int.class, sabtemahsoolact._grouptypelistbyname.runMethod(false,"Get",(Object)(_value)));
 BA.debugLineNum = 476;BA.debugLine="downloadListMahsoolJob.Download(SaeloZahra.json_u";
Debug.ShouldStop(134217728);
sabtemahsoolact.mostCurrent._downloadlistmahsooljob.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.concat(sabtemahsoolact.mostCurrent._saelozahra._json_url /*RemoteObject*/ ,RemoteObject.createImmutable("product_list.php?type=new&cat="),sabtemahsoolact._thisgrouptypeid)));
 BA.debugLineNum = 477;BA.debugLine="LogColor(SaeloZahra.json_url&\"product_list.php?ty";
Debug.ShouldStop(268435456);
sabtemahsoolact.mostCurrent.__c.runVoidMethod ("LogImpl","410485767",RemoteObject.concat(sabtemahsoolact.mostCurrent._saelozahra._json_url /*RemoteObject*/ ,RemoteObject.createImmutable("product_list.php?type=new&cat="),sabtemahsoolact._thisgrouptypeid),sabtemahsoolact.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 479;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ime_heightchanged(RemoteObject _newheight,RemoteObject _oldheight) throws Exception{
try {
		Debug.PushSubsStack("IME_HeightChanged (sabtemahsoolact) ","sabtemahsoolact",8,sabtemahsoolact.mostCurrent.activityBA,sabtemahsoolact.mostCurrent,717);
if (RapidSub.canDelegate("ime_heightchanged")) { return ir.saelozahra.damaara.mazraeyeman.sabtemahsoolact.remoteMe.runUserSub(false, "sabtemahsoolact","ime_heightchanged", _newheight, _oldheight);}
Debug.locals.put("NewHeight", _newheight);
Debug.locals.put("OldHeight", _oldheight);
 BA.debugLineNum = 717;BA.debugLine="Sub IME_HeightChanged(NewHeight As Int, OldHeight";
Debug.ShouldStop(4096);
 BA.debugLineNum = 718;BA.debugLine="ScrollView1.Height = NewHeight-ScrollView1.Top";
Debug.ShouldStop(8192);
sabtemahsoolact.mostCurrent._scrollview1.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {_newheight,sabtemahsoolact.mostCurrent._scrollview1.runMethod(true,"getTop")}, "-",1, 1));
 BA.debugLineNum = 719;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("jobDone (sabtemahsoolact) ","sabtemahsoolact",8,sabtemahsoolact.mostCurrent.activityBA,sabtemahsoolact.mostCurrent,366);
if (RapidSub.canDelegate("jobdone")) { return ir.saelozahra.damaara.mazraeyeman.sabtemahsoolact.remoteMe.runUserSub(false, "sabtemahsoolact","jobdone", _job);}
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _rootlistmahsool = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colroot = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mahsoolid = RemoteObject.createImmutable("");
RemoteObject _mahsooltitle = RemoteObject.createImmutable("");
RemoteObject _rootgroup = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _groupid = RemoteObject.createImmutable("");
RemoteObject _grouptitle = RemoteObject.createImmutable("");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 366;BA.debugLine="Sub jobDone(Job As HttpJob)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 367;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(16384);
sabtemahsoolact.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 368;BA.debugLine="Log(Job.Success&\" : \"&Job.JobName)";
Debug.ShouldStop(32768);
sabtemahsoolact.mostCurrent.__c.runVoidMethod ("LogImpl","410354690",RemoteObject.concat(_job.getField(true,"_success" /*RemoteObject*/ ),RemoteObject.createImmutable(" : "),_job.getField(true,"_jobname" /*RemoteObject*/ )),0);
 BA.debugLineNum = 370;BA.debugLine="Log(Job.GetString)";
Debug.ShouldStop(131072);
sabtemahsoolact.mostCurrent.__c.runVoidMethod ("LogImpl","410354692",_job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_getstring" /*RemoteObject*/ ),0);
 BA.debugLineNum = 371;BA.debugLine="If Job.Success And  Job.GetString<>\"\"\"not found\"\"";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean(".",_job.getField(true,"_success" /*RemoteObject*/ )) && RemoteObject.solveBoolean("!",_job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_getstring" /*RemoteObject*/ ),BA.ObjectToString("\"not found\""))) { 
 BA.debugLineNum = 373;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(1048576);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("SubmitJob"),BA.ObjectToString("downloadListMahsoolJob"),BA.ObjectToString("jobListeGroup"))) {
case 0: {
 BA.debugLineNum = 376;BA.debugLine="Log(Job.GetString)";
Debug.ShouldStop(8388608);
sabtemahsoolact.mostCurrent.__c.runVoidMethod ("LogImpl","410354698",_job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_getstring" /*RemoteObject*/ ),0);
 BA.debugLineNum = 383;BA.debugLine="If Job.GetString == \"success\" Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_getstring" /*RemoteObject*/ ),BA.ObjectToString("success"))) { 
 BA.debugLineNum = 384;BA.debugLine="Activity.Finish";
Debug.ShouldStop(-2147483648);
sabtemahsoolact.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 385;BA.debugLine="SaeloZahra.beep(\"button-20.mp3\")";
Debug.ShouldStop(1);
sabtemahsoolact.mostCurrent._saelozahra.runVoidMethod ("_beep" /*RemoteObject*/ ,sabtemahsoolact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("button-20.mp3")));
 BA.debugLineNum = 386;BA.debugLine="ToastMessageShow(SaeloZahra.CSB(\"عملیات با مو";
Debug.ShouldStop(2);
sabtemahsoolact.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(sabtemahsoolact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,sabtemahsoolact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("عملیات با موفقیت انجام شد"))).getObject())),(Object)(sabtemahsoolact.mostCurrent.__c.getField(true,"True")));
 };
 break; }
case 1: {
 BA.debugLineNum = 390;BA.debugLine="nameMahsoolByName.Initialize";
Debug.ShouldStop(32);
sabtemahsoolact._namemahsoolbyname.runVoidMethod ("Initialize");
 BA.debugLineNum = 391;BA.debugLine="name_mahsool_spinner.Clear";
Debug.ShouldStop(64);
sabtemahsoolact.mostCurrent._name_mahsool_spinner.runVoidMethod ("Clear");
 BA.debugLineNum = 393;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(256);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 394;BA.debugLine="parser.Initialize(Job.GetString)";
Debug.ShouldStop(512);
_parser.runVoidMethod ("Initialize",(Object)(_job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 395;BA.debugLine="Dim rootListMahsool As List = parser.NextArray";
Debug.ShouldStop(1024);
_rootlistmahsool = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_rootlistmahsool = _parser.runMethod(false,"NextArray");Debug.locals.put("rootListMahsool", _rootlistmahsool);Debug.locals.put("rootListMahsool", _rootlistmahsool);
 BA.debugLineNum = 396;BA.debugLine="For Each colroot As Map In rootListMahsool";
Debug.ShouldStop(2048);
_colroot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group19 = _rootlistmahsool;
final int groupLen19 = group19.runMethod(true,"getSize").<Integer>get()
;int index19 = 0;
;
for (; index19 < groupLen19;index19++){
_colroot = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group19.runMethod(false,"Get",index19));Debug.locals.put("colroot", _colroot);
Debug.locals.put("colroot", _colroot);
 BA.debugLineNum = 399;BA.debugLine="Dim MahsoolID As String = colroot.Get(\"id\")";
Debug.ShouldStop(16384);
_mahsoolid = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("MahsoolID", _mahsoolid);Debug.locals.put("MahsoolID", _mahsoolid);
 BA.debugLineNum = 400;BA.debugLine="Dim MahsoolTitle As String = colroot.Get(\"tit";
Debug.ShouldStop(32768);
_mahsooltitle = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("title")))));Debug.locals.put("MahsoolTitle", _mahsooltitle);Debug.locals.put("MahsoolTitle", _mahsooltitle);
 BA.debugLineNum = 402;BA.debugLine="nameMahsoolByName.Put(MahsoolTitle,MahsoolID)";
Debug.ShouldStop(131072);
sabtemahsoolact._namemahsoolbyname.runVoidMethod ("Put",(Object)((_mahsooltitle)),(Object)((_mahsoolid)));
 BA.debugLineNum = 403;BA.debugLine="name_mahsool_spinner.Add(MahsoolTitle)";
Debug.ShouldStop(262144);
sabtemahsoolact.mostCurrent._name_mahsool_spinner.runVoidMethod ("Add",(Object)(_mahsooltitle));
 }
}Debug.locals.put("colroot", _colroot);
;
 BA.debugLineNum = 407;BA.debugLine="If EditedProductTitle<>\"\" Then name_mahsool_sp";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("!",sabtemahsoolact.mostCurrent._editedproducttitle,BA.ObjectToString(""))) { 
sabtemahsoolact.mostCurrent._name_mahsool_spinner.runMethod(true,"setSelectedIndex",sabtemahsoolact.mostCurrent._name_mahsool_spinner.runMethod(true,"IndexOf",(Object)(sabtemahsoolact.mostCurrent._editedproducttitle)));};
 break; }
case 2: {
 BA.debugLineNum = 411;BA.debugLine="GroupTypeListByID.Initialize";
Debug.ShouldStop(67108864);
sabtemahsoolact._grouptypelistbyid.runVoidMethod ("Initialize");
 BA.debugLineNum = 412;BA.debugLine="GroupTypeListByName.Initialize";
Debug.ShouldStop(134217728);
sabtemahsoolact._grouptypelistbyname.runVoidMethod ("Initialize");
 BA.debugLineNum = 413;BA.debugLine="gorooh_mahsool_spinner.Clear";
Debug.ShouldStop(268435456);
sabtemahsoolact.mostCurrent._gorooh_mahsool_spinner.runVoidMethod ("Clear");
 BA.debugLineNum = 415;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(1073741824);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 416;BA.debugLine="parser.Initialize(Job.GetString)";
Debug.ShouldStop(-2147483648);
_parser.runVoidMethod ("Initialize",(Object)(_job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 417;BA.debugLine="Dim rootGroup As List = parser.NextArray";
Debug.ShouldStop(1);
_rootgroup = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_rootgroup = _parser.runMethod(false,"NextArray");Debug.locals.put("rootGroup", _rootgroup);Debug.locals.put("rootGroup", _rootgroup);
 BA.debugLineNum = 418;BA.debugLine="For Each colroot As Map In rootGroup";
Debug.ShouldStop(2);
_colroot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group33 = _rootgroup;
final int groupLen33 = group33.runMethod(true,"getSize").<Integer>get()
;int index33 = 0;
;
for (; index33 < groupLen33;index33++){
_colroot = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group33.runMethod(false,"Get",index33));Debug.locals.put("colroot", _colroot);
Debug.locals.put("colroot", _colroot);
 BA.debugLineNum = 419;BA.debugLine="Dim groupID As String = colroot.Get(\"id\")";
Debug.ShouldStop(4);
_groupid = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("groupID", _groupid);Debug.locals.put("groupID", _groupid);
 BA.debugLineNum = 420;BA.debugLine="Dim GroupTitle As String = colroot.Get(\"title";
Debug.ShouldStop(8);
_grouptitle = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("title")))));Debug.locals.put("GroupTitle", _grouptitle);Debug.locals.put("GroupTitle", _grouptitle);
 BA.debugLineNum = 421;BA.debugLine="GroupTypeListByID.Put(groupID,GroupTitle)";
Debug.ShouldStop(16);
sabtemahsoolact._grouptypelistbyid.runVoidMethod ("Put",(Object)((_groupid)),(Object)((_grouptitle)));
 BA.debugLineNum = 422;BA.debugLine="GroupTypeListByName.Put(GroupTitle,groupID)";
Debug.ShouldStop(32);
sabtemahsoolact._grouptypelistbyname.runVoidMethod ("Put",(Object)((_grouptitle)),(Object)((_groupid)));
 BA.debugLineNum = 423;BA.debugLine="gorooh_mahsool_spinner.Add(GroupTitle)";
Debug.ShouldStop(64);
sabtemahsoolact.mostCurrent._gorooh_mahsool_spinner.runVoidMethod ("Add",(Object)(_grouptitle));
 }
}Debug.locals.put("colroot", _colroot);
;
 BA.debugLineNum = 426;BA.debugLine="ThisGroupTypeID = GroupTypeListByName.GetValue";
Debug.ShouldStop(512);
sabtemahsoolact._thisgrouptypeid = BA.numberCast(int.class, sabtemahsoolact._grouptypelistbyname.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 427;BA.debugLine="LogColor(SaeloZahra.json_url&\"product_list.php";
Debug.ShouldStop(1024);
sabtemahsoolact.mostCurrent.__c.runVoidMethod ("LogImpl","410354749",RemoteObject.concat(sabtemahsoolact.mostCurrent._saelozahra._json_url /*RemoteObject*/ ,RemoteObject.createImmutable("product_list.php?type=new&cat="),sabtemahsoolact._thisgrouptypeid),sabtemahsoolact.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 428;BA.debugLine="downloadListMahsoolJob.Download(SaeloZahra.jso";
Debug.ShouldStop(2048);
sabtemahsoolact.mostCurrent._downloadlistmahsooljob.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.concat(sabtemahsoolact.mostCurrent._saelozahra._json_url /*RemoteObject*/ ,RemoteObject.createImmutable("product_list.php?type=new&cat="),sabtemahsoolact._thisgrouptypeid)));
 BA.debugLineNum = 430;BA.debugLine="If EditedCategoryID<>\"\" Then gorooh_mahsool_sp";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("!",sabtemahsoolact.mostCurrent._editedcategoryid,BA.ObjectToString(""))) { 
sabtemahsoolact.mostCurrent._gorooh_mahsool_spinner.runMethod(true,"setSelectedIndex",sabtemahsoolact.mostCurrent._gorooh_mahsool_spinner.runMethod(true,"IndexOf",(Object)(sabtemahsoolact.mostCurrent._editedcategoryid)));};
 break; }
}
;
 }else {
 BA.debugLineNum = 435;BA.debugLine="If Job.GetString==\"\"\"not found\"\"\" Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_getstring" /*RemoteObject*/ ),BA.ObjectToString("\"not found\""))) { 
 BA.debugLineNum = 436;BA.debugLine="ToastMessageShow(SaeloZahra.CSB(\"موردی یافت نشد";
Debug.ShouldStop(524288);
sabtemahsoolact.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(sabtemahsoolact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,sabtemahsoolact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("موردی یافت نشد."))).getObject())),(Object)(sabtemahsoolact.mostCurrent.__c.getField(true,"True")));
 }else {
 BA.debugLineNum = 439;BA.debugLine="If Job.ErrorMessage.Contains(\"Unable to resolve";
Debug.ShouldStop(4194304);
if (_job.getField(true,"_errormessage" /*RemoteObject*/ ).runMethod(true,"contains",(Object)(RemoteObject.createImmutable("Unable to resolve host"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 440;BA.debugLine="ToastMessageShow(SaeloZahra.CSB(\" اینترنتتون و";
Debug.ShouldStop(8388608);
sabtemahsoolact.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(sabtemahsoolact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,sabtemahsoolact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable(" اینترنتتون وصل نیست "))).getObject())),(Object)(sabtemahsoolact.mostCurrent.__c.getField(true,"True")));
 }else {
 BA.debugLineNum = 442;BA.debugLine="ToastMessageShow(SaeloZahra.CSB(\" خطا \")&CRLF&";
Debug.ShouldStop(33554432);
sabtemahsoolact.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(sabtemahsoolact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,sabtemahsoolact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable(" خطا "))),sabtemahsoolact.mostCurrent.__c.getField(true,"CRLF"),_job.getField(true,"_errormessage" /*RemoteObject*/ )))),(Object)(sabtemahsoolact.mostCurrent.__c.getField(true,"True")));
 };
 };
 };
 BA.debugLineNum = 448;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _name_mahsool_spinner_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("name_mahsool_spinner_ItemClick (sabtemahsoolact) ","sabtemahsoolact",8,sabtemahsoolact.mostCurrent.activityBA,sabtemahsoolact.mostCurrent,481);
if (RapidSub.canDelegate("name_mahsool_spinner_itemclick")) { return ir.saelozahra.damaara.mazraeyeman.sabtemahsoolact.remoteMe.runUserSub(false, "sabtemahsoolact","name_mahsool_spinner_itemclick", _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 481;BA.debugLine="Sub name_mahsool_spinner_ItemClick (Position As In";
Debug.ShouldStop(1);
 BA.debugLineNum = 482;BA.debugLine="ThisProductID = nameMahsoolByName.Get(Value)";
Debug.ShouldStop(2);
sabtemahsoolact._thisproductid = BA.numberCast(int.class, sabtemahsoolact._namemahsoolbyname.runMethod(false,"Get",(Object)(_value)));
 BA.debugLineNum = 483;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _noueabyari_spinner_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("noueAbyari_Spinner_ItemClick (sabtemahsoolact) ","sabtemahsoolact",8,sabtemahsoolact.mostCurrent.activityBA,sabtemahsoolact.mostCurrent,787);
if (RapidSub.canDelegate("noueabyari_spinner_itemclick")) { return ir.saelozahra.damaara.mazraeyeman.sabtemahsoolact.remoteMe.runUserSub(false, "sabtemahsoolact","noueabyari_spinner_itemclick", _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 787;BA.debugLine="Private Sub noueAbyari_Spinner_ItemClick (Position";
Debug.ShouldStop(262144);
 BA.debugLineNum = 788;BA.debugLine="If Position = 2 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_position,BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 789;BA.debugLine="chah_et.Enabled=False";
Debug.ShouldStop(1048576);
sabtemahsoolact.mostCurrent._chah_et.runMethod(true,"setEnabled",sabtemahsoolact.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 790;BA.debugLine="SaeloZahra.SetAlpha(chah_et,0.4)";
Debug.ShouldStop(2097152);
sabtemahsoolact.mostCurrent._saelozahra.runVoidMethod ("_setalpha" /*RemoteObject*/ ,sabtemahsoolact.mostCurrent.activityBA,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), sabtemahsoolact.mostCurrent._chah_et.getObject()),(Object)(BA.numberCast(float.class, 0.4)));
 }else {
 BA.debugLineNum = 792;BA.debugLine="chah_et.Enabled=True";
Debug.ShouldStop(8388608);
sabtemahsoolact.mostCurrent._chah_et.runMethod(true,"setEnabled",sabtemahsoolact.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 793;BA.debugLine="SaeloZahra.SetAlpha(chah_et,1)";
Debug.ShouldStop(16777216);
sabtemahsoolact.mostCurrent._saelozahra.runVoidMethod ("_setalpha" /*RemoteObject*/ ,sabtemahsoolact.mostCurrent.activityBA,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), sabtemahsoolact.mostCurrent._chah_et.getObject()),(Object)(BA.numberCast(float.class, 1)));
 };
 BA.debugLineNum = 795;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pdpd_dateselected(RemoteObject _persianyear,RemoteObject _persianmonth,RemoteObject _persianday) throws Exception{
try {
		Debug.PushSubsStack("pdpd_DateSelected (sabtemahsoolact) ","sabtemahsoolact",8,sabtemahsoolact.mostCurrent.activityBA,sabtemahsoolact.mostCurrent,518);
if (RapidSub.canDelegate("pdpd_dateselected")) { return ir.saelozahra.damaara.mazraeyeman.sabtemahsoolact.remoteMe.runUserSub(false, "sabtemahsoolact","pdpd_dateselected", _persianyear, _persianmonth, _persianday);}
RemoteObject _str_mounth = RemoteObject.createImmutable("");
RemoteObject _str_day = RemoteObject.createImmutable("");
RemoteObject _fulldate = RemoteObject.createImmutable("");
RemoteObject _yearmountday = RemoteObject.createImmutable("");
Debug.locals.put("PersianYear", _persianyear);
Debug.locals.put("PersianMonth", _persianmonth);
Debug.locals.put("PersianDay", _persianday);
 BA.debugLineNum = 518;BA.debugLine="Sub pdpd_DateSelected(PersianYear As Int,PersianMo";
Debug.ShouldStop(32);
 BA.debugLineNum = 520;BA.debugLine="Dim str_mounth,str_day As String";
Debug.ShouldStop(128);
_str_mounth = RemoteObject.createImmutable("");Debug.locals.put("str_mounth", _str_mounth);
_str_day = RemoteObject.createImmutable("");Debug.locals.put("str_day", _str_day);
 BA.debugLineNum = 521;BA.debugLine="If PersianMonth < 10 Then str_mounth=\"0\"&PersianM";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("<",_persianmonth,BA.numberCast(double.class, 10))) { 
_str_mounth = RemoteObject.concat(RemoteObject.createImmutable("0"),_persianmonth);Debug.locals.put("str_mounth", _str_mounth);}
else {
_str_mounth = BA.NumberToString(_persianmonth);Debug.locals.put("str_mounth", _str_mounth);};
 BA.debugLineNum = 522;BA.debugLine="If PersianDay < 10 Then str_day=\"0\"&PersianDay El";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("<",_persianday,BA.numberCast(double.class, 10))) { 
_str_day = RemoteObject.concat(RemoteObject.createImmutable("0"),_persianday);Debug.locals.put("str_day", _str_day);}
else {
_str_day = BA.NumberToString(_persianday);Debug.locals.put("str_day", _str_day);};
 BA.debugLineNum = 524;BA.debugLine="Log($\"Year=${PersianYear} Month=${str_mounth} Day";
Debug.ShouldStop(2048);
sabtemahsoolact.mostCurrent.__c.runVoidMethod ("LogImpl","411010054",(RemoteObject.concat(RemoteObject.createImmutable("Year="),sabtemahsoolact.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_persianyear))),RemoteObject.createImmutable(" Month="),sabtemahsoolact.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_str_mounth))),RemoteObject.createImmutable(" Day="),sabtemahsoolact.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_str_day))),RemoteObject.createImmutable(" dar: "),sabtemahsoolact.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((sabtemahsoolact.mostCurrent._witchdatepicker))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 525;BA.debugLine="Dim fulldate As String = PersianYear&\"/\"&str_moun";
Debug.ShouldStop(4096);
_fulldate = RemoteObject.concat(_persianyear,RemoteObject.createImmutable("/"),_str_mounth,RemoteObject.createImmutable("/"),_str_day);Debug.locals.put("fulldate", _fulldate);Debug.locals.put("fulldate", _fulldate);
 BA.debugLineNum = 526;BA.debugLine="Dim YearMountDay As String = PersianYear&str_moun";
Debug.ShouldStop(8192);
_yearmountday = RemoteObject.concat(_persianyear,_str_mounth,_str_day);Debug.locals.put("YearMountDay", _yearmountday);Debug.locals.put("YearMountDay", _yearmountday);
 BA.debugLineNum = 528;BA.debugLine="Select witchDatePicker";
Debug.ShouldStop(32768);
switch (BA.switchObjectToInt(sabtemahsoolact.mostCurrent._witchdatepicker,BA.ObjectToString("gheshlaghdate_et"),BA.ObjectToString("yeylaghdate_et"),BA.ObjectToString("zamanekasht_et"),BA.ObjectToString("zaman_eraa_et"),BA.ObjectToString("zamanebazderakht_et"),BA.ObjectToString("zamane_goldehi_et"),BA.ObjectToString("zamanekesht_et"),BA.ObjectToString("zamanefasleroshd_et"))) {
case 0: {
 BA.debugLineNum = 530;BA.debugLine="gheshlaghdate_et.Text = fulldate";
Debug.ShouldStop(131072);
sabtemahsoolact.mostCurrent._gheshlaghdate_et.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_fulldate));
 BA.debugLineNum = 531;BA.debugLine="gheshlaghdate_et.Tag  = YearMountDay";
Debug.ShouldStop(262144);
sabtemahsoolact.mostCurrent._gheshlaghdate_et.runMethod(false,"setTag",(_yearmountday));
 break; }
case 1: {
 BA.debugLineNum = 533;BA.debugLine="yeylaghdate_et.Text = fulldate";
Debug.ShouldStop(1048576);
sabtemahsoolact.mostCurrent._yeylaghdate_et.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_fulldate));
 BA.debugLineNum = 534;BA.debugLine="yeylaghdate_et.Tag  = YearMountDay";
Debug.ShouldStop(2097152);
sabtemahsoolact.mostCurrent._yeylaghdate_et.runMethod(false,"setTag",(_yearmountday));
 break; }
case 2: {
 BA.debugLineNum = 536;BA.debugLine="zamanekasht_et.Text = fulldate";
Debug.ShouldStop(8388608);
sabtemahsoolact.mostCurrent._zamanekasht_et.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_fulldate));
 BA.debugLineNum = 537;BA.debugLine="zamanekasht_et.Tag  = YearMountDay";
Debug.ShouldStop(16777216);
sabtemahsoolact.mostCurrent._zamanekasht_et.runMethod(false,"setTag",(_yearmountday));
 break; }
case 3: {
 BA.debugLineNum = 539;BA.debugLine="zaman_eraa_et.Text = fulldate";
Debug.ShouldStop(67108864);
sabtemahsoolact.mostCurrent._zaman_eraa_et.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_fulldate));
 BA.debugLineNum = 540;BA.debugLine="zaman_eraa_et.Tag  = YearMountDay";
Debug.ShouldStop(134217728);
sabtemahsoolact.mostCurrent._zaman_eraa_et.runMethod(false,"setTag",(_yearmountday));
 break; }
case 4: {
 BA.debugLineNum = 542;BA.debugLine="zamanebazderakht_et.Text = fulldate";
Debug.ShouldStop(536870912);
sabtemahsoolact.mostCurrent._zamanebazderakht_et.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_fulldate));
 BA.debugLineNum = 543;BA.debugLine="zamanebazderakht_et.Tag  = YearMountDay";
Debug.ShouldStop(1073741824);
sabtemahsoolact.mostCurrent._zamanebazderakht_et.runMethod(false,"setTag",(_yearmountday));
 break; }
case 5: {
 BA.debugLineNum = 545;BA.debugLine="zamane_goldehi_et.Text = fulldate";
Debug.ShouldStop(1);
sabtemahsoolact.mostCurrent._zamane_goldehi_et.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_fulldate));
 BA.debugLineNum = 546;BA.debugLine="zamane_goldehi_et.Tag  = YearMountDay";
Debug.ShouldStop(2);
sabtemahsoolact.mostCurrent._zamane_goldehi_et.runMethod(false,"setTag",(_yearmountday));
 break; }
case 6: {
 BA.debugLineNum = 548;BA.debugLine="zamanekesht_et.Text = fulldate";
Debug.ShouldStop(8);
sabtemahsoolact.mostCurrent._zamanekesht_et.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_fulldate));
 BA.debugLineNum = 549;BA.debugLine="zamanekesht_et.Tag  = YearMountDay";
Debug.ShouldStop(16);
sabtemahsoolact.mostCurrent._zamanekesht_et.runMethod(false,"setTag",(_yearmountday));
 break; }
case 7: {
 BA.debugLineNum = 551;BA.debugLine="zamanefasleroshd_et.Text = fulldate";
Debug.ShouldStop(64);
sabtemahsoolact.mostCurrent._zamanefasleroshd_et.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_fulldate));
 BA.debugLineNum = 552;BA.debugLine="zamanefasleroshd_et.Tag  = YearMountDay";
Debug.ShouldStop(128);
sabtemahsoolact.mostCurrent._zamanefasleroshd_et.runMethod(false,"setTag",(_yearmountday));
 break; }
}
;
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
public static RemoteObject  _pdpd_disimised() throws Exception{
try {
		Debug.PushSubsStack("pdpd_Disimised (sabtemahsoolact) ","sabtemahsoolact",8,sabtemahsoolact.mostCurrent.activityBA,sabtemahsoolact.mostCurrent,557);
if (RapidSub.canDelegate("pdpd_disimised")) { return ir.saelozahra.damaara.mazraeyeman.sabtemahsoolact.remoteMe.runUserSub(false, "sabtemahsoolact","pdpd_disimised");}
 BA.debugLineNum = 557;BA.debugLine="Sub pdpd_Disimised";
Debug.ShouldStop(4096);
 BA.debugLineNum = 558;BA.debugLine="Log(\"pdpd_Disimised\")";
Debug.ShouldStop(8192);
sabtemahsoolact.mostCurrent.__c.runVoidMethod ("LogImpl","411075585",RemoteObject.createImmutable("pdpd_Disimised"),0);
 BA.debugLineNum = 559;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Dim GroupTypeListByID,GroupTypeListByName,nameMah";
sabtemahsoolact._grouptypelistbyid = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
sabtemahsoolact._grouptypelistbyname = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
sabtemahsoolact._namemahsoolbyname = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 8;BA.debugLine="Dim CC As ContentChooser";
sabtemahsoolact._cc = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.ContentChooser");
 //BA.debugLineNum = 9;BA.debugLine="Dim EditMahsoolMap As Map = Null";
sabtemahsoolact._editmahsoolmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
sabtemahsoolact._editmahsoolmap = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), sabtemahsoolact.mostCurrent.__c.getField(false,"Null"));
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _radiogroup_checkedchange(RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("radioGroup_CheckedChange (sabtemahsoolact) ","sabtemahsoolact",8,sabtemahsoolact.mostCurrent.activityBA,sabtemahsoolact.mostCurrent,332);
if (RapidSub.canDelegate("radiogroup_checkedchange")) { return ir.saelozahra.damaara.mazraeyeman.sabtemahsoolact.remoteMe.runUserSub(false, "sabtemahsoolact","radiogroup_checkedchange", _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 332;BA.debugLine="Sub radioGroup_CheckedChange(Checked As Boolean)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 334;BA.debugLine="If group1RadioButton1.Checked Then";
Debug.ShouldStop(8192);
if (sabtemahsoolact.mostCurrent._group1radiobutton1.runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 335;BA.debugLine="gorooh_mahsool_spinner.Tag = \"group1\"";
Debug.ShouldStop(16384);
sabtemahsoolact.mostCurrent._gorooh_mahsool_spinner.runMethod(false,"setTag",RemoteObject.createImmutable(("group1")));
 BA.debugLineNum = 336;BA.debugLine="PaneleAshayer.SetVisibleAnimated(110,False)";
Debug.ShouldStop(32768);
sabtemahsoolact.mostCurrent._paneleashayer.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 110)),(Object)(sabtemahsoolact.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 337;BA.debugLine="panel_keshavarzi.SetVisibleAnimated(1110,True)";
Debug.ShouldStop(65536);
sabtemahsoolact.mostCurrent._panel_keshavarzi.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 1110)),(Object)(sabtemahsoolact.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 338;BA.debugLine="PanelMavaredeDarkhasti.Top = panel_keshavarzi.To";
Debug.ShouldStop(131072);
sabtemahsoolact.mostCurrent._panelmavarededarkhasti.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {sabtemahsoolact.mostCurrent._panel_keshavarzi.runMethod(true,"getTop"),sabtemahsoolact.mostCurrent._panel_keshavarzi.runMethod(true,"getHeight"),sabtemahsoolact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 18)))}, "++",2, 1));
 }else {
 BA.debugLineNum = 340;BA.debugLine="gorooh_mahsool_spinner.Tag = \"group2\"";
Debug.ShouldStop(524288);
sabtemahsoolact.mostCurrent._gorooh_mahsool_spinner.runMethod(false,"setTag",RemoteObject.createImmutable(("group2")));
 BA.debugLineNum = 341;BA.debugLine="panel_keshavarzi.SetVisibleAnimated(110,False)";
Debug.ShouldStop(1048576);
sabtemahsoolact.mostCurrent._panel_keshavarzi.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 110)),(Object)(sabtemahsoolact.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 342;BA.debugLine="PaneleAshayer.SetVisibleAnimated(1110,True)";
Debug.ShouldStop(2097152);
sabtemahsoolact.mostCurrent._paneleashayer.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 1110)),(Object)(sabtemahsoolact.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 343;BA.debugLine="PanelMavaredeDarkhasti.Top = PaneleAshayer.Top +";
Debug.ShouldStop(4194304);
sabtemahsoolact.mostCurrent._panelmavarededarkhasti.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {sabtemahsoolact.mostCurrent._paneleashayer.runMethod(true,"getTop"),sabtemahsoolact.mostCurrent._paneleashayer.runMethod(true,"getHeight"),sabtemahsoolact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 18)))}, "++",2, 1));
 };
 BA.debugLineNum = 346;BA.debugLine="LogColor(gorooh_mahsool_spinner.Tag,Colors.Yellow";
Debug.ShouldStop(33554432);
sabtemahsoolact.mostCurrent.__c.runVoidMethod ("LogImpl","410289166",BA.ObjectToString(sabtemahsoolact.mostCurrent._gorooh_mahsool_spinner.runMethod(false,"getTag")),sabtemahsoolact.mostCurrent.__c.getField(false,"Colors").getField(true,"Yellow"));
 BA.debugLineNum = 348;BA.debugLine="jobListeGroup.Download(SaeloZahra.json_url&\"produ";
Debug.ShouldStop(134217728);
sabtemahsoolact.mostCurrent._joblistegroup.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.concat(sabtemahsoolact.mostCurrent._saelozahra._json_url /*RemoteObject*/ ,RemoteObject.createImmutable("product_category.php?gp="),sabtemahsoolact.mostCurrent._gorooh_mahsool_spinner.runMethod(false,"getTag"))));
 BA.debugLineNum = 349;BA.debugLine="LogColor(SaeloZahra.json_url&\"product_category.ph";
Debug.ShouldStop(268435456);
sabtemahsoolact.mostCurrent.__c.runVoidMethod ("LogImpl","410289169",RemoteObject.concat(sabtemahsoolact.mostCurrent._saelozahra._json_url /*RemoteObject*/ ,RemoteObject.createImmutable("product_category.php?gp="),sabtemahsoolact.mostCurrent._gorooh_mahsool_spinner.runMethod(false,"getTag")),sabtemahsoolact.mostCurrent.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 352;BA.debugLine="BazarcheSwitch.Top = PanelMavaredeDarkhasti.Top +";
Debug.ShouldStop(-2147483648);
sabtemahsoolact.mostCurrent._bazarcheswitch.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {sabtemahsoolact.mostCurrent._panelmavarededarkhasti.runMethod(true,"getTop"),sabtemahsoolact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 18)))}, "+",1, 1));
 BA.debugLineNum = 353;BA.debugLine="Panel_bazarche.Top=BazarcheSwitch.Top+BazarcheSwi";
Debug.ShouldStop(1);
sabtemahsoolact.mostCurrent._panel_bazarche.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {sabtemahsoolact.mostCurrent._bazarcheswitch.runMethod(true,"getTop"),sabtemahsoolact.mostCurrent._bazarcheswitch.runMethod(true,"getHeight"),sabtemahsoolact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 22)))}, "++",2, 1));
 BA.debugLineNum = 355;BA.debugLine="If BazarcheSwitch.Checked Then";
Debug.ShouldStop(4);
if (sabtemahsoolact.mostCurrent._bazarcheswitch.runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 356;BA.debugLine="save_btn.Top = Panel_bazarche.Top+Panel_bazarche";
Debug.ShouldStop(8);
sabtemahsoolact.mostCurrent._save_btn.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {sabtemahsoolact.mostCurrent._panel_bazarche.runMethod(true,"getTop"),sabtemahsoolact.mostCurrent._panel_bazarche.runMethod(true,"getHeight"),sabtemahsoolact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))}, "++",2, 1));
 }else {
 BA.debugLineNum = 358;BA.debugLine="save_btn.Top = BazarcheSwitch.Top+BazarcheSwitch";
Debug.ShouldStop(32);
sabtemahsoolact.mostCurrent._save_btn.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {sabtemahsoolact.mostCurrent._bazarcheswitch.runMethod(true,"getTop"),sabtemahsoolact.mostCurrent._bazarcheswitch.runMethod(true,"getHeight"),sabtemahsoolact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))}, "++",2, 1));
 };
 BA.debugLineNum = 361;BA.debugLine="ScrollView1.Panel.Height = save_btn.Top + save_bt";
Debug.ShouldStop(256);
sabtemahsoolact.mostCurrent._scrollview1.runMethod(false,"getPanel").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {sabtemahsoolact.mostCurrent._save_btn.runMethod(true,"getTop"),sabtemahsoolact.mostCurrent._save_btn.runMethod(true,"getHeight"),sabtemahsoolact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 24)))}, "++",2, 1));
 BA.debugLineNum = 363;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _save_btn_click() throws Exception{
try {
		Debug.PushSubsStack("save_btn_Click (sabtemahsoolact) ","sabtemahsoolact",8,sabtemahsoolact.mostCurrent.activityBA,sabtemahsoolact.mostCurrent,572);
if (RapidSub.canDelegate("save_btn_click")) { return ir.saelozahra.damaara.mazraeyeman.sabtemahsoolact.remoteMe.runUserSub(false, "sabtemahsoolact","save_btn_click");}
RemoteObject _googleweightyeylag = RemoteObject.createImmutable("");
RemoteObject _googleheightyeylag = RemoteObject.createImmutable("");
RemoteObject _googleweightgheshlagh = RemoteObject.createImmutable("");
RemoteObject _googleheightgheshlagh = RemoteObject.createImmutable("");
RemoteObject _mapsubmit = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 572;BA.debugLine="Sub save_btn_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 574;BA.debugLine="ThisGroupTypeID = GroupTypeListByName.Get(gorooh_";
Debug.ShouldStop(536870912);
sabtemahsoolact._thisgrouptypeid = BA.numberCast(int.class, sabtemahsoolact._grouptypelistbyname.runMethod(false,"Get",(Object)((sabtemahsoolact.mostCurrent._gorooh_mahsool_spinner.runMethod(true,"getSelectedItem")))));
 BA.debugLineNum = 576;BA.debugLine="If ThisProductID < 1 Or ThisGroupTypeID<1 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("<",sabtemahsoolact._thisproductid,BA.numberCast(double.class, 1)) || RemoteObject.solveBoolean("<",sabtemahsoolact._thisgrouptypeid,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 577;BA.debugLine="name_mahsool_spinner.RequestFocus";
Debug.ShouldStop(1);
sabtemahsoolact.mostCurrent._name_mahsool_spinner.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 578;BA.debugLine="ToastMessageShow(SaeloZahra.CSB(\"نام محصول را وا";
Debug.ShouldStop(2);
sabtemahsoolact.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(sabtemahsoolact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,sabtemahsoolact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("نام محصول را وارد کنید"))).getObject())),(Object)(sabtemahsoolact.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 580;BA.debugLine="Return";
Debug.ShouldStop(8);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 583;BA.debugLine="Dim googleweightyeylag As String=select_map_act.y";
Debug.ShouldStop(64);
_googleweightyeylag = BA.NumberToString(sabtemahsoolact.mostCurrent._select_map_act._yeylagh_lat /*RemoteObject*/ );Debug.locals.put("googleweightyeylag", _googleweightyeylag);Debug.locals.put("googleweightyeylag", _googleweightyeylag);
 BA.debugLineNum = 584;BA.debugLine="Dim googleheightyeylag As String=select_map_act.y";
Debug.ShouldStop(128);
_googleheightyeylag = BA.NumberToString(sabtemahsoolact.mostCurrent._select_map_act._yeylagh_lng /*RemoteObject*/ );Debug.locals.put("googleheightyeylag", _googleheightyeylag);Debug.locals.put("googleheightyeylag", _googleheightyeylag);
 BA.debugLineNum = 585;BA.debugLine="If File.Exists(SaeloZahra.dir,\"yeylagh_lat\")Then";
Debug.ShouldStop(256);
if (sabtemahsoolact.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(sabtemahsoolact.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("yeylagh_lat"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 586;BA.debugLine="googleweightyeylag = File.ReadString(SaeloZahra.";
Debug.ShouldStop(512);
_googleweightyeylag = sabtemahsoolact.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(sabtemahsoolact.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("yeylagh_lat")));Debug.locals.put("googleweightyeylag", _googleweightyeylag);
 BA.debugLineNum = 587;BA.debugLine="googleheightyeylag = File.ReadString(SaeloZahra.";
Debug.ShouldStop(1024);
_googleheightyeylag = sabtemahsoolact.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(sabtemahsoolact.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("yeylagh_lng")));Debug.locals.put("googleheightyeylag", _googleheightyeylag);
 };
 BA.debugLineNum = 590;BA.debugLine="Dim googleweightgheshlagh As String=select_map_ac";
Debug.ShouldStop(8192);
_googleweightgheshlagh = BA.NumberToString(sabtemahsoolact.mostCurrent._select_map_act._gheshlagh_lat /*RemoteObject*/ );Debug.locals.put("googleweightgheshlagh", _googleweightgheshlagh);Debug.locals.put("googleweightgheshlagh", _googleweightgheshlagh);
 BA.debugLineNum = 591;BA.debugLine="Dim googleheightgheshlagh As String=select_map_ac";
Debug.ShouldStop(16384);
_googleheightgheshlagh = BA.NumberToString(sabtemahsoolact.mostCurrent._select_map_act._gheshlagh_lng /*RemoteObject*/ );Debug.locals.put("googleheightgheshlagh", _googleheightgheshlagh);Debug.locals.put("googleheightgheshlagh", _googleheightgheshlagh);
 BA.debugLineNum = 592;BA.debugLine="If File.Exists(SaeloZahra.dir,\"gheshlagh_lat\")The";
Debug.ShouldStop(32768);
if (sabtemahsoolact.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(sabtemahsoolact.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("gheshlagh_lat"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 593;BA.debugLine="googleweightgheshlagh = File.ReadString(SaeloZah";
Debug.ShouldStop(65536);
_googleweightgheshlagh = sabtemahsoolact.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(sabtemahsoolact.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("gheshlagh_lat")));Debug.locals.put("googleweightgheshlagh", _googleweightgheshlagh);
 BA.debugLineNum = 594;BA.debugLine="googleheightgheshlagh = File.ReadString(SaeloZah";
Debug.ShouldStop(131072);
_googleheightgheshlagh = sabtemahsoolact.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(sabtemahsoolact.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("gheshlagh_lng")));Debug.locals.put("googleheightgheshlagh", _googleheightgheshlagh);
 };
 BA.debugLineNum = 597;BA.debugLine="Dim mapSubmit As Map";
Debug.ShouldStop(1048576);
_mapsubmit = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mapSubmit", _mapsubmit);
 BA.debugLineNum = 598;BA.debugLine="mapSubmit.Initialize";
Debug.ShouldStop(2097152);
_mapsubmit.runVoidMethod ("Initialize");
 BA.debugLineNum = 601;BA.debugLine="If gorooh_mahsool_spinner.Tag == \"group1\" Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",sabtemahsoolact.mostCurrent._gorooh_mahsool_spinner.runMethod(false,"getTag"),RemoteObject.createImmutable(("group1")))) { 
 BA.debugLineNum = 603;BA.debugLine="mapSubmit.Clear";
Debug.ShouldStop(67108864);
_mapsubmit.runVoidMethod ("Clear");
 BA.debugLineNum = 604;BA.debugLine="If EditMahsoolMap.IsInitialized Then";
Debug.ShouldStop(134217728);
if (sabtemahsoolact._editmahsoolmap.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 605;BA.debugLine="mapSubmit.Put(\"id\",		EditMahsoolMap.Get(\"id\"))";
Debug.ShouldStop(268435456);
_mapsubmit.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)(sabtemahsoolact._editmahsoolmap.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 };
 BA.debugLineNum = 607;BA.debugLine="mapSubmit.Put(\"group\",		gorooh_mahsool_spinner.T";
Debug.ShouldStop(1073741824);
_mapsubmit.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("group"))),(Object)(sabtemahsoolact.mostCurrent._gorooh_mahsool_spinner.runMethod(false,"getTag")));
 BA.debugLineNum = 608;BA.debugLine="mapSubmit.Put(\"category\",	ThisGroupTypeID)";
Debug.ShouldStop(-2147483648);
_mapsubmit.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("category"))),(Object)((sabtemahsoolact._thisgrouptypeid)));
 BA.debugLineNum = 609;BA.debugLine="mapSubmit.Put(\"product\",	ThisProductID)";
Debug.ShouldStop(1);
_mapsubmit.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("product"))),(Object)((sabtemahsoolact._thisproductid)));
 BA.debugLineNum = 610;BA.debugLine="mapSubmit.Put(\"zaman_kasht\",zamanekesht_et.Text)";
Debug.ShouldStop(2);
_mapsubmit.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("zaman_kasht"))),(Object)((sabtemahsoolact.mostCurrent._zamanekesht_et.runMethod(true,"getText"))));
 BA.debugLineNum = 611;BA.debugLine="mapSubmit.Put(\"zamane_kesht\",zamanekesht_et.Text";
Debug.ShouldStop(4);
_mapsubmit.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("zamane_kesht"))),(Object)((sabtemahsoolact.mostCurrent._zamanekesht_et.runMethod(true,"getText"))));
 BA.debugLineNum = 612;BA.debugLine="mapSubmit.Put(\"sen_mahsol\",	sennemahsool_et.Text";
Debug.ShouldStop(8);
_mapsubmit.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("sen_mahsol"))),(Object)((sabtemahsoolact.mostCurrent._sennemahsool_et.runMethod(true,"getText"))));
 BA.debugLineNum = 613;BA.debugLine="mapSubmit.Put(\"vahed\",		vahed_spinner.Tag)";
Debug.ShouldStop(16);
_mapsubmit.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("vahed"))),(Object)(sabtemahsoolact.mostCurrent._vahed_spinner.runMethod(false,"getTag")));
 BA.debugLineNum = 614;BA.debugLine="mapSubmit.Put(\"masahat\",	masahateYahteKeshET.Tex";
Debug.ShouldStop(32);
_mapsubmit.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("masahat"))),(Object)((sabtemahsoolact.mostCurrent._masahateyahtekeshet.runMethod(true,"getText"))));
 BA.debugLineNum = 615;BA.debugLine="mapSubmit.Put(\"khak\",		noueKhakSpinner.SelectedI";
Debug.ShouldStop(64);
_mapsubmit.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("khak"))),(Object)((sabtemahsoolact.mostCurrent._nouekhakspinner.runMethod(true,"getSelectedItem"))));
 BA.debugLineNum = 616;BA.debugLine="mapSubmit.Put(\"abyari\",		noueAbyari_Spinner.Sele";
Debug.ShouldStop(128);
_mapsubmit.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("abyari"))),(Object)((sabtemahsoolact.mostCurrent._noueabyari_spinner.runMethod(true,"getSelectedItem"))));
 BA.debugLineNum = 617;BA.debugLine="mapSubmit.Put(\"fasele_kesht\",fasele_kasht_et.Tex";
Debug.ShouldStop(256);
_mapsubmit.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fasele_kesht"))),(Object)((sabtemahsoolact.mostCurrent._fasele_kasht_et.runMethod(true,"getText"))));
 BA.debugLineNum = 618;BA.debugLine="mapSubmit.Put(\"khoroji_chah\",chah_et.Text)";
Debug.ShouldStop(512);
_mapsubmit.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("khoroji_chah"))),(Object)((sabtemahsoolact.mostCurrent._chah_et.runMethod(true,"getText"))));
 BA.debugLineNum = 619;BA.debugLine="mapSubmit.Put(\"fasele_radif\",radif_metr_et.Text)";
Debug.ShouldStop(1024);
_mapsubmit.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fasele_radif"))),(Object)((sabtemahsoolact.mostCurrent._radif_metr_et.runMethod(true,"getText"))));
 BA.debugLineNum = 620;BA.debugLine="mapSubmit.Put(\"fasele_roshd\",zamanefasleroshd_et";
Debug.ShouldStop(2048);
_mapsubmit.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fasele_roshd"))),(Object)((sabtemahsoolact.mostCurrent._zamanefasleroshd_et.runMethod(true,"getText"))));
 BA.debugLineNum = 621;BA.debugLine="mapSubmit.Put(\"goldehi_derakhtan\",zamane_goldehi";
Debug.ShouldStop(4096);
_mapsubmit.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("goldehi_derakhtan"))),(Object)((sabtemahsoolact.mostCurrent._zamane_goldehi_et.runMethod(true,"getText"))));
 BA.debugLineNum = 622;BA.debugLine="mapSubmit.Put(\"tavarom_javane\",zamanebazderakht_";
Debug.ShouldStop(8192);
_mapsubmit.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("tavarom_javane"))),(Object)((sabtemahsoolact.mostCurrent._zamanebazderakht_et.runMethod(true,"getText"))));
 BA.debugLineNum = 623;BA.debugLine="mapSubmit.Put(\"farmers_user\",Starter.usrnm)";
Debug.ShouldStop(16384);
_mapsubmit.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("farmers_user"))),(Object)((sabtemahsoolact.mostCurrent._starter._usrnm /*RemoteObject*/ )));
 BA.debugLineNum = 625;BA.debugLine="mapSubmit.Put(\"bazarche\",	BazarcheSwitch.Tag)";
Debug.ShouldStop(65536);
_mapsubmit.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("bazarche"))),(Object)(sabtemahsoolact.mostCurrent._bazarcheswitch.runMethod(false,"getTag")));
 BA.debugLineNum = 626;BA.debugLine="mapSubmit.Put(\"vazn\",		tonaj_et.Text)";
Debug.ShouldStop(131072);
_mapsubmit.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("vazn"))),(Object)((sabtemahsoolact.mostCurrent._tonaj_et.runMethod(true,"getText"))));
 BA.debugLineNum = 627;BA.debugLine="mapSubmit.Put(\"ghimat\",		amount_et.Text)";
Debug.ShouldStop(262144);
_mapsubmit.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ghimat"))),(Object)((sabtemahsoolact.mostCurrent._amount_et.runMethod(true,"getText"))));
 BA.debugLineNum = 628;BA.debugLine="mapSubmit.Put(\"zaman_eraa\",	zaman_eraa_et.Text)";
Debug.ShouldStop(524288);
_mapsubmit.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("zaman_eraa"))),(Object)((sabtemahsoolact.mostCurrent._zaman_eraa_et.runMethod(true,"getText"))));
 BA.debugLineNum = 629;BA.debugLine="mapSubmit.Put(\"des\",		bazarche_des_et.Text)";
Debug.ShouldStop(1048576);
_mapsubmit.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("des"))),(Object)((sabtemahsoolact.mostCurrent._bazarche_des_et.runMethod(true,"getText"))));
 BA.debugLineNum = 632;BA.debugLine="SubmitJob.PostMultipart(SaeloZahra.json_url&\"far";
Debug.ShouldStop(8388608);
sabtemahsoolact.mostCurrent._submitjob.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_postmultipart" /*RemoteObject*/ ,(Object)(RemoteObject.concat(sabtemahsoolact.mostCurrent._saelozahra._json_url /*RemoteObject*/ ,RemoteObject.createImmutable("farmers_product_insert.php?save=true"))),(Object)(_mapsubmit),(Object)(sabtemahsoolact.mostCurrent._files));
 }else 
{ BA.debugLineNum = 634;BA.debugLine="Else If gorooh_mahsool_spinner.Tag == \"group2\" Th";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",sabtemahsoolact.mostCurrent._gorooh_mahsool_spinner.runMethod(false,"getTag"),RemoteObject.createImmutable(("group2")))) { 
 BA.debugLineNum = 636;BA.debugLine="If googleweightyeylag.Length < 5 Or googleweight";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("<",_googleweightyeylag.runMethod(true,"length"),BA.numberCast(double.class, 5)) || RemoteObject.solveBoolean("<",_googleweightgheshlagh.runMethod(true,"length"),BA.numberCast(double.class, 5))) { 
 BA.debugLineNum = 637;BA.debugLine="ToastMessageShow(SaeloZahra.CSB(\"موقعیت مکانی ی";
Debug.ShouldStop(268435456);
sabtemahsoolact.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(sabtemahsoolact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,sabtemahsoolact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("موقعیت مکانی ییلاق و قشلاق الزامیست"))).getObject())),(Object)(sabtemahsoolact.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 638;BA.debugLine="Return";
Debug.ShouldStop(536870912);
if (true) return RemoteObject.createImmutable("");
 }else 
{ BA.debugLineNum = 639;BA.debugLine="Else If yeylaghdate_et.Text.Length < 5 Or gheshl";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("<",sabtemahsoolact.mostCurrent._yeylaghdate_et.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 5)) || RemoteObject.solveBoolean("<",sabtemahsoolact.mostCurrent._gheshlaghdate_et.runMethod(true,"getText").runMethod(true,"length"),BA.numberCast(double.class, 5))) { 
 BA.debugLineNum = 640;BA.debugLine="ToastMessageShow(SaeloZahra.CSB(\"تاریخ ییلاق و";
Debug.ShouldStop(-2147483648);
sabtemahsoolact.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(sabtemahsoolact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,sabtemahsoolact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("تاریخ ییلاق و قشلاق الزامیست"))).getObject())),(Object)(sabtemahsoolact.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 641;BA.debugLine="Return";
Debug.ShouldStop(1);
if (true) return RemoteObject.createImmutable("");
 }}
;
 BA.debugLineNum = 646;BA.debugLine="mapSubmit.Clear";
Debug.ShouldStop(32);
_mapsubmit.runVoidMethod ("Clear");
 BA.debugLineNum = 647;BA.debugLine="If EditMahsoolMap.IsInitialized Then";
Debug.ShouldStop(64);
if (sabtemahsoolact._editmahsoolmap.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 648;BA.debugLine="mapSubmit.Put(\"id\",		EditMahsoolMap.Get(\"id\"))";
Debug.ShouldStop(128);
_mapsubmit.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)(sabtemahsoolact._editmahsoolmap.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 };
 BA.debugLineNum = 650;BA.debugLine="mapSubmit.Put(\"group\",gorooh_mahsool_spinner.Tag";
Debug.ShouldStop(512);
_mapsubmit.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("group"))),(Object)(sabtemahsoolact.mostCurrent._gorooh_mahsool_spinner.runMethod(false,"getTag")));
 BA.debugLineNum = 651;BA.debugLine="mapSubmit.Put(\"category\",ThisGroupTypeID)";
Debug.ShouldStop(1024);
_mapsubmit.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("category"))),(Object)((sabtemahsoolact._thisgrouptypeid)));
 BA.debugLineNum = 652;BA.debugLine="mapSubmit.Put(\"product\",ThisProductID)";
Debug.ShouldStop(2048);
_mapsubmit.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("product"))),(Object)((sabtemahsoolact._thisproductid)));
 BA.debugLineNum = 653;BA.debugLine="mapSubmit.Put(\"yeylagh_time\",yeylaghdate_et.Text";
Debug.ShouldStop(4096);
_mapsubmit.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("yeylagh_time"))),(Object)((sabtemahsoolact.mostCurrent._yeylaghdate_et.runMethod(true,"getText"))));
 BA.debugLineNum = 654;BA.debugLine="mapSubmit.Put(\"gheshlagh_time\",gheshlaghdate_et.";
Debug.ShouldStop(8192);
_mapsubmit.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("gheshlagh_time"))),(Object)((sabtemahsoolact.mostCurrent._gheshlaghdate_et.runMethod(true,"getText"))));
 BA.debugLineNum = 655;BA.debugLine="mapSubmit.Put(\"yeylagh_latlng\",googleweightyeyla";
Debug.ShouldStop(16384);
_mapsubmit.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("yeylagh_latlng"))),(Object)((RemoteObject.concat(_googleweightyeylag,RemoteObject.createImmutable(","),_googleheightyeylag))));
 BA.debugLineNum = 656;BA.debugLine="mapSubmit.Put(\"yeylagh_latlng\",googleweightghesh";
Debug.ShouldStop(32768);
_mapsubmit.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("yeylagh_latlng"))),(Object)((RemoteObject.concat(_googleweightgheshlagh,RemoteObject.createImmutable(","),_googleheightgheshlagh))));
 BA.debugLineNum = 658;BA.debugLine="mapSubmit.Put(\"farmers_user\",Starter.usrnm)";
Debug.ShouldStop(131072);
_mapsubmit.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("farmers_user"))),(Object)((sabtemahsoolact.mostCurrent._starter._usrnm /*RemoteObject*/ )));
 BA.debugLineNum = 660;BA.debugLine="mapSubmit.Put(\"bazarche\",BazarcheSwitch.Tag)";
Debug.ShouldStop(524288);
_mapsubmit.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("bazarche"))),(Object)(sabtemahsoolact.mostCurrent._bazarcheswitch.runMethod(false,"getTag")));
 BA.debugLineNum = 661;BA.debugLine="mapSubmit.Put(\"vazn\",tonaj_et.Text)";
Debug.ShouldStop(1048576);
_mapsubmit.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("vazn"))),(Object)((sabtemahsoolact.mostCurrent._tonaj_et.runMethod(true,"getText"))));
 BA.debugLineNum = 662;BA.debugLine="mapSubmit.Put(\"ghimat\",amount_et.Text)";
Debug.ShouldStop(2097152);
_mapsubmit.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ghimat"))),(Object)((sabtemahsoolact.mostCurrent._amount_et.runMethod(true,"getText"))));
 BA.debugLineNum = 663;BA.debugLine="mapSubmit.Put(\"zaman_eraa\",zaman_eraa_et.Text)";
Debug.ShouldStop(4194304);
_mapsubmit.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("zaman_eraa"))),(Object)((sabtemahsoolact.mostCurrent._zaman_eraa_et.runMethod(true,"getText"))));
 BA.debugLineNum = 664;BA.debugLine="mapSubmit.Put(\"des\",bazarche_des_et.Text)";
Debug.ShouldStop(8388608);
_mapsubmit.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("des"))),(Object)((sabtemahsoolact.mostCurrent._bazarche_des_et.runMethod(true,"getText"))));
 BA.debugLineNum = 666;BA.debugLine="SubmitJob.PostMultipart(SaeloZahra.json_url&\"far";
Debug.ShouldStop(33554432);
sabtemahsoolact.mostCurrent._submitjob.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_postmultipart" /*RemoteObject*/ ,(Object)(RemoteObject.concat(sabtemahsoolact.mostCurrent._saelozahra._json_url /*RemoteObject*/ ,RemoteObject.createImmutable("farmers_product_insert.php?save=true"))),(Object)(_mapsubmit),(Object)(sabtemahsoolact.mostCurrent._files));
 }}
;
 BA.debugLineNum = 671;BA.debugLine="ProgressDialogShow(SaeloZahra.CSB(\"در حال ثبت اطل";
Debug.ShouldStop(1073741824);
sabtemahsoolact.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",sabtemahsoolact.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(sabtemahsoolact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,sabtemahsoolact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("در حال ثبت اطلاعات..."))).getObject())));
 BA.debugLineNum = 673;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _selectpicbtn_click() throws Exception{
try {
		Debug.PushSubsStack("selectPicBtn_Click (sabtemahsoolact) ","sabtemahsoolact",8,sabtemahsoolact.mostCurrent.activityBA,sabtemahsoolact.mostCurrent,703);
if (RapidSub.canDelegate("selectpicbtn_click")) { return ir.saelozahra.damaara.mazraeyeman.sabtemahsoolact.remoteMe.runUserSub(false, "sabtemahsoolact","selectpicbtn_click");}
 BA.debugLineNum = 703;BA.debugLine="Sub selectPicBtn_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 704;BA.debugLine="Try";
Debug.ShouldStop(-2147483648);
try { BA.debugLineNum = 705;BA.debugLine="CC.Initialize(\"CC\")";
Debug.ShouldStop(1);
sabtemahsoolact._cc.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("CC")));
 BA.debugLineNum = 706;BA.debugLine="CC.Show(\"image/*\", \"Choose image\")";
Debug.ShouldStop(2);
sabtemahsoolact._cc.runVoidMethod ("Show",sabtemahsoolact.processBA,(Object)(BA.ObjectToString("image/*")),(Object)(RemoteObject.createImmutable("Choose image")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e5) {
			BA.rdebugUtils.runVoidMethod("setLastException",sabtemahsoolact.processBA, e5.toString()); BA.debugLineNum = 708;BA.debugLine="BSFileChooser1.Show3(\"tFile\", Array As String(\"j";
Debug.ShouldStop(8);
sabtemahsoolact.mostCurrent._bsfilechooser1.runVoidMethod ("Show3",sabtemahsoolact.processBA,(Object)(BA.ObjectToString("tFile")),(Object)(sabtemahsoolact.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {3},new Object[] {BA.ObjectToString("jpeg"),BA.ObjectToString("jpg"),RemoteObject.createImmutable("png")})))));
 BA.debugLineNum = 709;BA.debugLine="ToastMessageShow(\"نتونستیم انتخابش کنیم\",False)";
Debug.ShouldStop(16);
sabtemahsoolact.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("نتونستیم انتخابش کنیم")),(Object)(sabtemahsoolact.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 711;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sennemahsool_et_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("sennemahsool_et_TextChanged (sabtemahsoolact) ","sabtemahsoolact",8,sabtemahsoolact.mostCurrent.activityBA,sabtemahsoolact.mostCurrent,713);
if (RapidSub.canDelegate("sennemahsool_et_textchanged")) { return ir.saelozahra.damaara.mazraeyeman.sabtemahsoolact.remoteMe.runUserSub(false, "sabtemahsoolact","sennemahsool_et_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 713;BA.debugLine="Sub sennemahsool_et_TextChanged (Old As String, Ne";
Debug.ShouldStop(256);
 BA.debugLineNum = 714;BA.debugLine="If New.Length>2 Then sennemahsool_et.Text=New.Sub";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean(">",_new.runMethod(true,"length"),BA.numberCast(double.class, 2))) { 
sabtemahsoolact.mostCurrent._sennemahsool_et.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_new.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2)))));};
 BA.debugLineNum = 715;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tfile_result(RemoteObject _filepath) throws Exception{
try {
		Debug.PushSubsStack("tFile_result (sabtemahsoolact) ","sabtemahsoolact",8,sabtemahsoolact.mostCurrent.activityBA,sabtemahsoolact.mostCurrent,758);
if (RapidSub.canDelegate("tfile_result")) { return ir.saelozahra.damaara.mazraeyeman.sabtemahsoolact.remoteMe.runUserSub(false, "sabtemahsoolact","tfile_result", _filepath);}
RemoteObject _filetype = RemoteObject.createImmutable("");
RemoteObject _fd = RemoteObject.declareNull("ir.saelozahra.damaara.mazraeyeman.httpjob._multipartfiledata");
Debug.locals.put("FilePath", _filepath);
 BA.debugLineNum = 758;BA.debugLine="Sub tFile_result(FilePath As String)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 761;BA.debugLine="ImageView1.Bitmap = LoadBitmapSample(\"\", FilePath";
Debug.ShouldStop(16777216);
sabtemahsoolact.mostCurrent._imageview1.runMethod(false,"setBitmap",(sabtemahsoolact.mostCurrent.__c.runMethod(false,"LoadBitmapSample",(Object)(BA.ObjectToString("")),(Object)(_filepath),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {sabtemahsoolact.mostCurrent._imageview1.runMethod(true,"getWidth"),RemoteObject.createImmutable(1.2)}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {sabtemahsoolact.mostCurrent._imageview1.runMethod(true,"getHeight"),RemoteObject.createImmutable(1.2)}, "*",0, 0)))).getObject()));
 BA.debugLineNum = 764;BA.debugLine="Dim filetype As String";
Debug.ShouldStop(134217728);
_filetype = RemoteObject.createImmutable("");Debug.locals.put("filetype", _filetype);
 BA.debugLineNum = 765;BA.debugLine="Dim fd As MultipartFileData";
Debug.ShouldStop(268435456);
_fd = RemoteObject.createNew ("ir.saelozahra.damaara.mazraeyeman.httpjob._multipartfiledata");Debug.locals.put("fd", _fd);
 BA.debugLineNum = 766;BA.debugLine="fd.Initialize";
Debug.ShouldStop(536870912);
_fd.runVoidMethod ("Initialize");
 BA.debugLineNum = 767;BA.debugLine="fd.KeyName=\"fileupload\"";
Debug.ShouldStop(1073741824);
_fd.setField ("KeyName" /*RemoteObject*/ ,BA.ObjectToString("fileupload"));
 BA.debugLineNum = 769;BA.debugLine="If FilePath.Contains(\".png\") Then";
Debug.ShouldStop(1);
if (_filepath.runMethod(true,"contains",(Object)(RemoteObject.createImmutable(".png"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 770;BA.debugLine="fd.ContentType = \"image/png\"";
Debug.ShouldStop(2);
_fd.setField ("ContentType" /*RemoteObject*/ ,BA.ObjectToString("image/png"));
 BA.debugLineNum = 771;BA.debugLine="filetype = \"png\"";
Debug.ShouldStop(4);
_filetype = BA.ObjectToString("png");Debug.locals.put("filetype", _filetype);
 }else {
 BA.debugLineNum = 773;BA.debugLine="fd.ContentType = \"image/jpeg\"";
Debug.ShouldStop(16);
_fd.setField ("ContentType" /*RemoteObject*/ ,BA.ObjectToString("image/jpeg"));
 BA.debugLineNum = 774;BA.debugLine="filetype = \"jpg\"";
Debug.ShouldStop(32);
_filetype = BA.ObjectToString("jpg");Debug.locals.put("filetype", _filetype);
 };
 BA.debugLineNum = 777;BA.debugLine="File.Copy(\"\",FilePath,SaeloZahra.dir,\"image.\"&fil";
Debug.ShouldStop(256);
sabtemahsoolact.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(BA.ObjectToString("")),(Object)(_filepath),(Object)(sabtemahsoolact.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("image."),_filetype)));
 BA.debugLineNum = 779;BA.debugLine="fd.Dir= SaeloZahra.dir";
Debug.ShouldStop(1024);
_fd.setField ("Dir" /*RemoteObject*/ ,sabtemahsoolact.mostCurrent._saelozahra._dir /*RemoteObject*/ );
 BA.debugLineNum = 780;BA.debugLine="fd.FileName=\"image.\"&filetype";
Debug.ShouldStop(2048);
_fd.setField ("FileName" /*RemoteObject*/ ,RemoteObject.concat(RemoteObject.createImmutable("image."),_filetype));
 BA.debugLineNum = 782;BA.debugLine="Files.Add(fd)";
Debug.ShouldStop(8192);
sabtemahsoolact.mostCurrent._files.runVoidMethod ("Add",(Object)((_fd)));
 BA.debugLineNum = 784;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _vahed_spinner_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("vahed_spinner_ItemClick (sabtemahsoolact) ","sabtemahsoolact",8,sabtemahsoolact.mostCurrent.activityBA,sabtemahsoolact.mostCurrent,324);
if (RapidSub.canDelegate("vahed_spinner_itemclick")) { return ir.saelozahra.damaara.mazraeyeman.sabtemahsoolact.remoteMe.runUserSub(false, "sabtemahsoolact","vahed_spinner_itemclick", _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 324;BA.debugLine="Sub vahed_spinner_ItemClick (Position As Int, Valu";
Debug.ShouldStop(8);
 BA.debugLineNum = 325;BA.debugLine="If Position == 0 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_position,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 326;BA.debugLine="vahed_spinner.Tag=\"hectare\"";
Debug.ShouldStop(32);
sabtemahsoolact.mostCurrent._vahed_spinner.runMethod(false,"setTag",RemoteObject.createImmutable(("hectare")));
 }else {
 BA.debugLineNum = 328;BA.debugLine="vahed_spinner.Tag=\"meters\"";
Debug.ShouldStop(128);
sabtemahsoolact.mostCurrent._vahed_spinner.runMethod(false,"setTag",RemoteObject.createImmutable(("meters")));
 };
 BA.debugLineNum = 330;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _yeylagh_map_btn_click() throws Exception{
try {
		Debug.PushSubsStack("yeylagh_map_btn_Click (sabtemahsoolact) ","sabtemahsoolact",8,sabtemahsoolact.mostCurrent.activityBA,sabtemahsoolact.mostCurrent,682);
if (RapidSub.canDelegate("yeylagh_map_btn_click")) { return ir.saelozahra.damaara.mazraeyeman.sabtemahsoolact.remoteMe.runUserSub(false, "sabtemahsoolact","yeylagh_map_btn_click");}
 BA.debugLineNum = 682;BA.debugLine="Sub yeylagh_map_btn_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 683;BA.debugLine="select_map_act.WhatLove=\"yeylagh\"";
Debug.ShouldStop(1024);
sabtemahsoolact.mostCurrent._select_map_act._whatlove /*RemoteObject*/  = BA.ObjectToString("yeylagh");
 BA.debugLineNum = 684;BA.debugLine="StartActivity(select_map_act)";
Debug.ShouldStop(2048);
sabtemahsoolact.mostCurrent.__c.runVoidMethod ("StartActivity",sabtemahsoolact.processBA,(Object)((sabtemahsoolact.mostCurrent._select_map_act.getObject())));
 BA.debugLineNum = 685;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _yeylaghdate_et_focuschanged(RemoteObject _hasfocus) throws Exception{
try {
		Debug.PushSubsStack("yeylaghdate_et_FocusChanged (sabtemahsoolact) ","sabtemahsoolact",8,sabtemahsoolact.mostCurrent.activityBA,sabtemahsoolact.mostCurrent,507);
if (RapidSub.canDelegate("yeylaghdate_et_focuschanged")) { return ir.saelozahra.damaara.mazraeyeman.sabtemahsoolact.remoteMe.runUserSub(false, "sabtemahsoolact","yeylaghdate_et_focuschanged", _hasfocus);}
Debug.locals.put("HasFocus", _hasfocus);
 BA.debugLineNum = 507;BA.debugLine="Sub yeylaghdate_et_FocusChanged (HasFocus As Boole";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 508;BA.debugLine="witchDatePicker = \"yeylaghdate_et\"";
Debug.ShouldStop(134217728);
sabtemahsoolact.mostCurrent._witchdatepicker = BA.ObjectToString("yeylaghdate_et");
 BA.debugLineNum = 509;BA.debugLine="If HasFocus Then pdpd.show";
Debug.ShouldStop(268435456);
if (_hasfocus.<Boolean>get().booleanValue()) { 
sabtemahsoolact.mostCurrent._pdpd.runVoidMethod ("show");};
 BA.debugLineNum = 510;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _zaman_eraa_et_focuschanged(RemoteObject _hasfocus) throws Exception{
try {
		Debug.PushSubsStack("zaman_eraa_et_FocusChanged (sabtemahsoolact) ","sabtemahsoolact",8,sabtemahsoolact.mostCurrent.activityBA,sabtemahsoolact.mostCurrent,566);
if (RapidSub.canDelegate("zaman_eraa_et_focuschanged")) { return ir.saelozahra.damaara.mazraeyeman.sabtemahsoolact.remoteMe.runUserSub(false, "sabtemahsoolact","zaman_eraa_et_focuschanged", _hasfocus);}
Debug.locals.put("HasFocus", _hasfocus);
 BA.debugLineNum = 566;BA.debugLine="Sub zaman_eraa_et_FocusChanged (HasFocus As Boolea";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 567;BA.debugLine="witchDatePicker = \"zaman_eraa_et\"";
Debug.ShouldStop(4194304);
sabtemahsoolact.mostCurrent._witchdatepicker = BA.ObjectToString("zaman_eraa_et");
 BA.debugLineNum = 568;BA.debugLine="If HasFocus Then pdpd.show";
Debug.ShouldStop(8388608);
if (_hasfocus.<Boolean>get().booleanValue()) { 
sabtemahsoolact.mostCurrent._pdpd.runVoidMethod ("show");};
 BA.debugLineNum = 569;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _zamane_goldehi_et_focuschanged(RemoteObject _hasfocus) throws Exception{
try {
		Debug.PushSubsStack("zamane_goldehi_et_FocusChanged (sabtemahsoolact) ","sabtemahsoolact",8,sabtemahsoolact.mostCurrent.activityBA,sabtemahsoolact.mostCurrent,492);
if (RapidSub.canDelegate("zamane_goldehi_et_focuschanged")) { return ir.saelozahra.damaara.mazraeyeman.sabtemahsoolact.remoteMe.runUserSub(false, "sabtemahsoolact","zamane_goldehi_et_focuschanged", _hasfocus);}
Debug.locals.put("HasFocus", _hasfocus);
 BA.debugLineNum = 492;BA.debugLine="Sub zamane_goldehi_et_FocusChanged (HasFocus As Bo";
Debug.ShouldStop(2048);
 BA.debugLineNum = 493;BA.debugLine="witchDatePicker = \"zamane_goldehi_et\"";
Debug.ShouldStop(4096);
sabtemahsoolact.mostCurrent._witchdatepicker = BA.ObjectToString("zamane_goldehi_et");
 BA.debugLineNum = 494;BA.debugLine="If HasFocus Then pdpd.show";
Debug.ShouldStop(8192);
if (_hasfocus.<Boolean>get().booleanValue()) { 
sabtemahsoolact.mostCurrent._pdpd.runVoidMethod ("show");};
 BA.debugLineNum = 495;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _zamanebazderakht_et_focuschanged(RemoteObject _hasfocus) throws Exception{
try {
		Debug.PushSubsStack("zamanebazderakht_et_FocusChanged (sabtemahsoolact) ","sabtemahsoolact",8,sabtemahsoolact.mostCurrent.activityBA,sabtemahsoolact.mostCurrent,487);
if (RapidSub.canDelegate("zamanebazderakht_et_focuschanged")) { return ir.saelozahra.damaara.mazraeyeman.sabtemahsoolact.remoteMe.runUserSub(false, "sabtemahsoolact","zamanebazderakht_et_focuschanged", _hasfocus);}
Debug.locals.put("HasFocus", _hasfocus);
 BA.debugLineNum = 487;BA.debugLine="Sub zamanebazderakht_et_FocusChanged (HasFocus As";
Debug.ShouldStop(64);
 BA.debugLineNum = 488;BA.debugLine="witchDatePicker = \"zamanebazderakht_et\"";
Debug.ShouldStop(128);
sabtemahsoolact.mostCurrent._witchdatepicker = BA.ObjectToString("zamanebazderakht_et");
 BA.debugLineNum = 489;BA.debugLine="If HasFocus Then pdpd.show";
Debug.ShouldStop(256);
if (_hasfocus.<Boolean>get().booleanValue()) { 
sabtemahsoolact.mostCurrent._pdpd.runVoidMethod ("show");};
 BA.debugLineNum = 490;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _zamanefasleroshd_et_focuschanged(RemoteObject _hasfocus) throws Exception{
try {
		Debug.PushSubsStack("zamanefasleroshd_et_FocusChanged (sabtemahsoolact) ","sabtemahsoolact",8,sabtemahsoolact.mostCurrent.activityBA,sabtemahsoolact.mostCurrent,497);
if (RapidSub.canDelegate("zamanefasleroshd_et_focuschanged")) { return ir.saelozahra.damaara.mazraeyeman.sabtemahsoolact.remoteMe.runUserSub(false, "sabtemahsoolact","zamanefasleroshd_et_focuschanged", _hasfocus);}
Debug.locals.put("HasFocus", _hasfocus);
 BA.debugLineNum = 497;BA.debugLine="Sub zamanefasleroshd_et_FocusChanged (HasFocus As";
Debug.ShouldStop(65536);
 BA.debugLineNum = 498;BA.debugLine="witchDatePicker = \"zamanefasleroshd_et\"";
Debug.ShouldStop(131072);
sabtemahsoolact.mostCurrent._witchdatepicker = BA.ObjectToString("zamanefasleroshd_et");
 BA.debugLineNum = 499;BA.debugLine="If HasFocus Then pdpd.show";
Debug.ShouldStop(262144);
if (_hasfocus.<Boolean>get().booleanValue()) { 
sabtemahsoolact.mostCurrent._pdpd.runVoidMethod ("show");};
 BA.debugLineNum = 500;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _zamanekasht_et_focuschanged(RemoteObject _hasfocus) throws Exception{
try {
		Debug.PushSubsStack("zamanekasht_et_FocusChanged (sabtemahsoolact) ","sabtemahsoolact",8,sabtemahsoolact.mostCurrent.activityBA,sabtemahsoolact.mostCurrent,561);
if (RapidSub.canDelegate("zamanekasht_et_focuschanged")) { return ir.saelozahra.damaara.mazraeyeman.sabtemahsoolact.remoteMe.runUserSub(false, "sabtemahsoolact","zamanekasht_et_focuschanged", _hasfocus);}
Debug.locals.put("HasFocus", _hasfocus);
 BA.debugLineNum = 561;BA.debugLine="Sub zamanekasht_et_FocusChanged (HasFocus As Boole";
Debug.ShouldStop(65536);
 BA.debugLineNum = 562;BA.debugLine="witchDatePicker = \"zamanekasht_et\"";
Debug.ShouldStop(131072);
sabtemahsoolact.mostCurrent._witchdatepicker = BA.ObjectToString("zamanekasht_et");
 BA.debugLineNum = 563;BA.debugLine="If HasFocus Then pdpd.show";
Debug.ShouldStop(262144);
if (_hasfocus.<Boolean>get().booleanValue()) { 
sabtemahsoolact.mostCurrent._pdpd.runVoidMethod ("show");};
 BA.debugLineNum = 564;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _zamanekesht_et_focuschanged(RemoteObject _hasfocus) throws Exception{
try {
		Debug.PushSubsStack("zamanekesht_et_FocusChanged (sabtemahsoolact) ","sabtemahsoolact",8,sabtemahsoolact.mostCurrent.activityBA,sabtemahsoolact.mostCurrent,502);
if (RapidSub.canDelegate("zamanekesht_et_focuschanged")) { return ir.saelozahra.damaara.mazraeyeman.sabtemahsoolact.remoteMe.runUserSub(false, "sabtemahsoolact","zamanekesht_et_focuschanged", _hasfocus);}
Debug.locals.put("HasFocus", _hasfocus);
 BA.debugLineNum = 502;BA.debugLine="Sub zamanekesht_et_FocusChanged (HasFocus As Boole";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 503;BA.debugLine="witchDatePicker = \"zamanekesht_et\"";
Debug.ShouldStop(4194304);
sabtemahsoolact.mostCurrent._witchdatepicker = BA.ObjectToString("zamanekesht_et");
 BA.debugLineNum = 504;BA.debugLine="If HasFocus Then pdpd.show";
Debug.ShouldStop(8388608);
if (_hasfocus.<Boolean>get().booleanValue()) { 
sabtemahsoolact.mostCurrent._pdpd.runVoidMethod ("show");};
 BA.debugLineNum = 505;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}