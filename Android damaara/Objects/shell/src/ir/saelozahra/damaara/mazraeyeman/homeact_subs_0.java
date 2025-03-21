package ir.saelozahra.damaara.mazraeyeman;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class homeact_subs_0 {


public static RemoteObject  _actionbar_menuitemclick(RemoteObject _item) throws Exception{
try {
		Debug.PushSubsStack("Actionbar_MenuItemClick (homeact) ","homeact",3,homeact.mostCurrent.activityBA,homeact.mostCurrent,946);
if (RapidSub.canDelegate("actionbar_menuitemclick")) { return ir.saelozahra.damaara.mazraeyeman.homeact.remoteMe.runUserSub(false, "homeact","actionbar_menuitemclick", _item);}
Debug.locals.put("Item", _item);
 BA.debugLineNum = 946;BA.debugLine="Sub Actionbar_MenuItemClick (Item As ACMenuItem)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 947;BA.debugLine="Select Item.Id";
Debug.ShouldStop(262144);
switch (BA.switchObjectToInt(_item.runMethod(true,"getId"))) {
}
;
 BA.debugLineNum = 951;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _actionbar_navigationitemclick() throws Exception{
try {
		Debug.PushSubsStack("ActionBar_NavigationItemClick (homeact) ","homeact",3,homeact.mostCurrent.activityBA,homeact.mostCurrent,969);
if (RapidSub.canDelegate("actionbar_navigationitemclick")) { return ir.saelozahra.damaara.mazraeyeman.homeact.remoteMe.runUserSub(false, "homeact","actionbar_navigationitemclick");}
 BA.debugLineNum = 969;BA.debugLine="Sub ActionBar_NavigationItemClick";
Debug.ShouldStop(256);
 BA.debugLineNum = 970;BA.debugLine="SM.ShowMenu";
Debug.ShouldStop(512);
homeact.mostCurrent._sm.runVoidMethod ("ShowMenu");
 BA.debugLineNum = 971;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("Activity_Create (homeact) ","homeact",3,homeact.mostCurrent.activityBA,homeact.mostCurrent,72);
if (RapidSub.canDelegate("activity_create")) { return ir.saelozahra.damaara.mazraeyeman.homeact.remoteMe.runUserSub(false, "homeact","activity_create", _firsttime);}
RemoteObject _grg = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.GradientDrawable");
RemoteObject _clrs = null;
RemoteObject _icon1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.BitmapDrawable");
RemoteObject _icon2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.BitmapDrawable");
RemoteObject _icon3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.BitmapDrawable");
RemoteObject _items = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _ui = RemoteObject.declareNull("com.aghajari.smoothbottombar.BottomBarUi");
RemoteObject _tafavotesize = RemoteObject.createImmutable(0);
RemoteObject _cdpanelmsg = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
int _i = 0;
RemoteObject _thisicon = RemoteObject.createImmutable("");
RemoteObject _cdpanelweather = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _weatherhover = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _pc = RemoteObject.declareNull("de.amberhome.viewpager.AHPageContainer");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 72;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(128);
 BA.debugLineNum = 74;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(512);
homeact.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 78;BA.debugLine="SaeloZahra.SetStatusBarColor(SaeloZahra.ColorDark";
Debug.ShouldStop(8192);
homeact.mostCurrent._saelozahra.runVoidMethod ("_setstatusbarcolor" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)(homeact.mostCurrent._saelozahra._colordark /*RemoteObject*/ ));
 BA.debugLineNum = 80;BA.debugLine="ActionBar.Initialize(\"ActionBar\")";
Debug.ShouldStop(32768);
homeact.mostCurrent._actionbar.runVoidMethod ("Initialize",homeact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("ActionBar")));
 BA.debugLineNum = 81;BA.debugLine="ActionBar.SetAsActionBar";
Debug.ShouldStop(65536);
homeact.mostCurrent._actionbar.runVoidMethod ("SetAsActionBar",homeact.mostCurrent.activityBA);
 BA.debugLineNum = 82;BA.debugLine="Activity.AddView(ActionBar,0,0,100%x,SaeloZahra.M";
Debug.ShouldStop(131072);
homeact.mostCurrent._activity.runVoidMethod ("AddView",(Object)((homeact.mostCurrent._actionbar.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(homeact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),homeact.mostCurrent.activityBA)),(Object)(homeact.mostCurrent._saelozahra._materialactionbarheight /*RemoteObject*/ ));
 BA.debugLineNum = 83;BA.debugLine="ActionBar.Color=SaeloZahra.Color";
Debug.ShouldStop(262144);
homeact.mostCurrent._actionbar.runVoidMethod ("setColor",homeact.mostCurrent._saelozahra._color /*RemoteObject*/ );
 BA.debugLineNum = 85;BA.debugLine="customBrowser.Initialize";
Debug.ShouldStop(1048576);
homeact.mostCurrent._custombrowser.runVoidMethod ("Initialize",homeact.mostCurrent.activityBA);
 BA.debugLineNum = 86;BA.debugLine="customBrowser.ToolbarColor = SaeloZahra.Color";
Debug.ShouldStop(2097152);
homeact.mostCurrent._custombrowser.runVoidMethod ("setToolbarColor",homeact.mostCurrent._saelozahra._color /*RemoteObject*/ );
 BA.debugLineNum = 87;BA.debugLine="customBrowser.ShowTitle = True";
Debug.ShouldStop(4194304);
homeact.mostCurrent._custombrowser.runVoidMethod ("setShowTitle",homeact.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 88;BA.debugLine="customBrowser.Build";
Debug.ShouldStop(8388608);
homeact.mostCurrent._custombrowser.runVoidMethod ("Build");
 BA.debugLineNum = 90;BA.debugLine="Provider.Initialize";
Debug.ShouldStop(33554432);
homeact._provider.runClassMethod (ir.saelozahra.damaara.mazraeyeman.fileprovider.class, "_initialize" /*RemoteObject*/ ,homeact.processBA);
 BA.debugLineNum = 92;BA.debugLine="lv.Initialize(\"lv\")";
Debug.ShouldStop(134217728);
homeact.mostCurrent._lv.runVoidMethod ("Initialize",homeact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lv")));
 BA.debugLineNum = 93;BA.debugLine="lv.Color=Colors.Transparent";
Debug.ShouldStop(268435456);
homeact.mostCurrent._lv.runVoidMethod ("setColor",homeact.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 94;BA.debugLine="lv.AddSingleLine2(SaeloZahra.CSB(\"ویرایش حساب\"),\"";
Debug.ShouldStop(536870912);
homeact.mostCurrent._lv.runVoidMethod ("AddSingleLine2",(Object)(BA.ObjectToCharSequence(homeact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("ویرایش حساب"))).getObject())),(Object)((RemoteObject.createImmutable("edit_user"))));
 BA.debugLineNum = 95;BA.debugLine="lv.AddSingleLine2(SaeloZahra.CSB(\"محصولات من\"),\"m";
Debug.ShouldStop(1073741824);
homeact.mostCurrent._lv.runVoidMethod ("AddSingleLine2",(Object)(BA.ObjectToCharSequence(homeact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("محصولات من"))).getObject())),(Object)((RemoteObject.createImmutable("myproducts"))));
 BA.debugLineNum = 96;BA.debugLine="lv.AddSingleLine2(SaeloZahra.CSB(\"ثبت محصولات\"),\"";
Debug.ShouldStop(-2147483648);
homeact.mostCurrent._lv.runVoidMethod ("AddSingleLine2",(Object)(BA.ObjectToCharSequence(homeact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("ثبت محصولات"))).getObject())),(Object)((RemoteObject.createImmutable("sabtemahsool"))));
 BA.debugLineNum = 97;BA.debugLine="lv.AddSingleLine2(SaeloZahra.CSB(\"وضعیت آب و هوا\"";
Debug.ShouldStop(1);
homeact.mostCurrent._lv.runVoidMethod ("AddSingleLine2",(Object)(BA.ObjectToCharSequence(homeact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("وضعیت آب و هوا"))).getObject())),(Object)((RemoteObject.createImmutable("Weather"))));
 BA.debugLineNum = 98;BA.debugLine="lv.AddSingleLine2(SaeloZahra.CSB(\"اطلاعیــــــه ه";
Debug.ShouldStop(2);
homeact.mostCurrent._lv.runVoidMethod ("AddSingleLine2",(Object)(BA.ObjectToCharSequence(homeact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("اطلاعیــــــه ها"))).getObject())),(Object)((RemoteObject.createImmutable("Notification"))));
 BA.debugLineNum = 99;BA.debugLine="lv.AddSingleLine2(SaeloZahra.CSB(\"صندوق بیمه\") ,\"";
Debug.ShouldStop(4);
homeact.mostCurrent._lv.runVoidMethod ("AddSingleLine2",(Object)(BA.ObjectToCharSequence(homeact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("صندوق بیمه"))).getObject())),(Object)((RemoteObject.createImmutable("sandoghbime"))));
 BA.debugLineNum = 102;BA.debugLine="lv.AddSingleLine2(SaeloZahra.CSB(\"بروزرسانی نرم ا";
Debug.ShouldStop(32);
homeact.mostCurrent._lv.runVoidMethod ("AddSingleLine2",(Object)(BA.ObjectToCharSequence(homeact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("بروزرسانی نرم افزار"))).getObject())),(Object)((RemoteObject.createImmutable("update"))));
 BA.debugLineNum = 103;BA.debugLine="lv.AddSingleLine2(SaeloZahra.CSB(\"معرفی نرم افزار";
Debug.ShouldStop(64);
homeact.mostCurrent._lv.runVoidMethod ("AddSingleLine2",(Object)(BA.ObjectToCharSequence(homeact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("معرفی نرم افزار"))).getObject())),(Object)((RemoteObject.createImmutable("share"))));
 BA.debugLineNum = 104;BA.debugLine="lv.AddSingleLine2(SaeloZahra.CSB(\"پشتیبانی تلفنی\"";
Debug.ShouldStop(128);
homeact.mostCurrent._lv.runVoidMethod ("AddSingleLine2",(Object)(BA.ObjectToCharSequence(homeact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("پشتیبانی تلفنی"))).getObject())),(Object)((RemoteObject.createImmutable("support"))));
 BA.debugLineNum = 109;BA.debugLine="lv.AddSingleLine2(SaeloZahra.CSB(\"خروج\"),\"exit\")";
Debug.ShouldStop(4096);
homeact.mostCurrent._lv.runVoidMethod ("AddSingleLine2",(Object)(BA.ObjectToCharSequence(homeact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("خروج"))).getObject())),(Object)((RemoteObject.createImmutable("exit"))));
 BA.debugLineNum = 110;BA.debugLine="lv.Padding = Array As Int(0,SaeloZahra.MaterialAc";
Debug.ShouldStop(8192);
homeact.mostCurrent._lv.runMethod(false,"setPadding",RemoteObject.createNewArray("int",new int[] {4},new Object[] {BA.numberCast(int.class, 0),homeact.mostCurrent._saelozahra._materialactionbarheight /*RemoteObject*/ ,BA.numberCast(int.class, 0),BA.numberCast(int.class, 0)}));
 BA.debugLineNum = 112;BA.debugLine="lv.SingleLineLayout.ItemHeight = lv.SingleLineLay";
Debug.ShouldStop(32768);
homeact.mostCurrent._lv.runMethod(false,"getSingleLineLayout").runMethod(true,"setItemHeight",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {homeact.mostCurrent._lv.runMethod(false,"getSingleLineLayout").runMethod(true,"getItemHeight"),RemoteObject.createImmutable(1.2)}, "*",0, 0)));
 BA.debugLineNum = 113;BA.debugLine="lv.SingleLineLayout.Label.Padding = Array As Int";
Debug.ShouldStop(65536);
homeact.mostCurrent._lv.runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(false,"setPadding",RemoteObject.createNewArray("int",new int[] {4},new Object[] {homeact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30))),homeact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 12))),homeact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30))),homeact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 12)))}));
 BA.debugLineNum = 115;BA.debugLine="SM.Initialize(\"sm\")";
Debug.ShouldStop(262144);
homeact.mostCurrent._sm.runVoidMethod ("Initialize",homeact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("sm")));
 BA.debugLineNum = 118;BA.debugLine="Dim GrG As GradientDrawable";
Debug.ShouldStop(2097152);
_grg = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.GradientDrawable");Debug.locals.put("GrG", _grg);
 BA.debugLineNum = 119;BA.debugLine="Dim Clrs(4) As Int";
Debug.ShouldStop(4194304);
_clrs = RemoteObject.createNewArray ("int", new int[] {4}, new Object[]{});Debug.locals.put("Clrs", _clrs);
 BA.debugLineNum = 120;BA.debugLine="Clrs(0) = SaeloZahra.Color";
Debug.ShouldStop(8388608);
_clrs.setArrayElement (homeact.mostCurrent._saelozahra._color /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 121;BA.debugLine="Clrs(1) = SaeloZahra.ColorLight";
Debug.ShouldStop(16777216);
_clrs.setArrayElement (homeact.mostCurrent._saelozahra._colorlight /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 BA.debugLineNum = 122;BA.debugLine="Clrs(2) = SaeloZahra.Color";
Debug.ShouldStop(33554432);
_clrs.setArrayElement (homeact.mostCurrent._saelozahra._color /*RemoteObject*/ ,BA.numberCast(int.class, 2));
 BA.debugLineNum = 123;BA.debugLine="Clrs(3) = SaeloZahra.Color";
Debug.ShouldStop(67108864);
_clrs.setArrayElement (homeact.mostCurrent._saelozahra._color /*RemoteObject*/ ,BA.numberCast(int.class, 3));
 BA.debugLineNum = 124;BA.debugLine="GrG.Initialize(\"BR_TL\", Clrs)";
Debug.ShouldStop(134217728);
_grg.runVoidMethod ("Initialize",(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.drawable.GradientDrawable.Orientation"),"BR_TL")),(Object)(_clrs));
 BA.debugLineNum = 126;BA.debugLine="SM.Menu.Background = GrG";
Debug.ShouldStop(536870912);
homeact.mostCurrent._sm.runMethod(false,"getMenu").runMethod(false,"setBackground",(_grg.getObject()));
 BA.debugLineNum = 127;BA.debugLine="SM.Menu.AddView(lv,0,0,-2,-2)";
Debug.ShouldStop(1073741824);
homeact.mostCurrent._sm.runMethod(false,"getMenu").runVoidMethod ("AddView",(Object)((homeact.mostCurrent._lv.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, -(double) (0 + 2))),(Object)(BA.numberCast(int.class, -(double) (0 + 2))));
 BA.debugLineNum = 128;BA.debugLine="SM.BehindOffset=133dip";
Debug.ShouldStop(-2147483648);
homeact.mostCurrent._sm.runVoidMethod ("setBehindOffset",homeact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 133))));
 BA.debugLineNum = 129;BA.debugLine="ActionBar.NavigationIconBitmap = LoadBitmapResize";
Debug.ShouldStop(1);
homeact.mostCurrent._actionbar.runVoidMethod ("setNavigationIconBitmap",(homeact.mostCurrent.__c.runMethod(false,"LoadBitmapResize",(Object)(homeact.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("menu.png")),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {homeact.mostCurrent._actionbar.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {homeact.mostCurrent._actionbar.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(homeact.mostCurrent.__c.getField(true,"True"))).getObject()));
 BA.debugLineNum = 131;BA.debugLine="ActionBar.Title=SaeloZahra.CSB(Application.LabelN";
Debug.ShouldStop(4);
homeact.mostCurrent._actionbar.runMethod(true,"setTitle",BA.ObjectToCharSequence(homeact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)(homeact.mostCurrent.__c.getField(false,"Application").runMethod(true,"getLabelName"))).getObject()));
 BA.debugLineNum = 132;BA.debugLine="ActionBar.TitleTextColor=Colors.White";
Debug.ShouldStop(8);
homeact.mostCurrent._actionbar.runVoidMethod ("setTitleTextColor",homeact.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 135;BA.debugLine="DTTC.InItIaLiZe(\"برای خروج از نرم افزار\"&CRLF&\"مج";
Debug.ShouldStop(64);
homeact.mostCurrent._dttc.runClassMethod (ir.saelozahra.damaara.mazraeyeman.doubletaptoclose.class, "_initialize" /*RemoteObject*/ ,homeact.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("برای خروج از نرم افزار"),homeact.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("مجددا دکمه خروج را بزنید"))));
 BA.debugLineNum = 138;BA.debugLine="JobSearch.Initialize(\"JobSearch\",Me)";
Debug.ShouldStop(512);
homeact.mostCurrent._jobsearch.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_initialize" /*RemoteObject*/ ,homeact.processBA,(Object)(BA.ObjectToString("JobSearch")),(Object)(homeact.getObject()));
 BA.debugLineNum = 145;BA.debugLine="Dim Icon1 As BitmapDrawable";
Debug.ShouldStop(65536);
_icon1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.BitmapDrawable");Debug.locals.put("Icon1", _icon1);
 BA.debugLineNum = 146;BA.debugLine="Icon1.Initialize(LoadBitmap(File.DirAssets,\"icon1";
Debug.ShouldStop(131072);
_icon1.runVoidMethod ("Initialize",(Object)((homeact.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(homeact.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("icon1.png"))).getObject())));
 BA.debugLineNum = 147;BA.debugLine="Dim Icon2 As BitmapDrawable";
Debug.ShouldStop(262144);
_icon2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.BitmapDrawable");Debug.locals.put("Icon2", _icon2);
 BA.debugLineNum = 148;BA.debugLine="Icon2.Initialize(LoadBitmap(File.DirAssets,\"icon2";
Debug.ShouldStop(524288);
_icon2.runVoidMethod ("Initialize",(Object)((homeact.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(homeact.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("icon2.png"))).getObject())));
 BA.debugLineNum = 149;BA.debugLine="Dim Icon3 As BitmapDrawable";
Debug.ShouldStop(1048576);
_icon3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.BitmapDrawable");Debug.locals.put("Icon3", _icon3);
 BA.debugLineNum = 150;BA.debugLine="Icon3.Initialize(LoadBitmap(File.DirAssets,\"icon3";
Debug.ShouldStop(2097152);
_icon3.runVoidMethod ("Initialize",(Object)((homeact.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(homeact.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("icon3.png"))).getObject())));
 BA.debugLineNum = 152;BA.debugLine="Dim Items As List";
Debug.ShouldStop(8388608);
_items = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Items", _items);
 BA.debugLineNum = 153;BA.debugLine="Items.Initialize";
Debug.ShouldStop(16777216);
_items.runVoidMethod ("Initialize");
 BA.debugLineNum = 154;BA.debugLine="Items.Add(BottomBar.CreateItem(\"چندرسانه‌ای\",Icon";
Debug.ShouldStop(33554432);
_items.runVoidMethod ("Add",(Object)((homeact.mostCurrent._bottombar.runMethod(false,"CreateItem",(Object)(BA.ObjectToString("چندرسانه‌ای")),(Object)((_icon1.getObject()))))));
 BA.debugLineNum = 155;BA.debugLine="Items.Add(BottomBar.CreateItem(\"مزرعه‌من\",Icon2))";
Debug.ShouldStop(67108864);
_items.runVoidMethod ("Add",(Object)((homeact.mostCurrent._bottombar.runMethod(false,"CreateItem",(Object)(BA.ObjectToString("مزرعه‌من")),(Object)((_icon2.getObject()))))));
 BA.debugLineNum = 156;BA.debugLine="Items.Add(BottomBar.CreateItem(\"بازارچه\",Icon3))";
Debug.ShouldStop(134217728);
_items.runVoidMethod ("Add",(Object)((homeact.mostCurrent._bottombar.runMethod(false,"CreateItem",(Object)(BA.ObjectToString("بازارچه")),(Object)((_icon3.getObject()))))));
 BA.debugLineNum = 158;BA.debugLine="Dim Ui As AX_SmoothBottomBarUI";
Debug.ShouldStop(536870912);
_ui = RemoteObject.createNew ("com.aghajari.smoothbottombar.BottomBarUi");Debug.locals.put("Ui", _ui);
 BA.debugLineNum = 159;BA.debugLine="Ui.Initialize";
Debug.ShouldStop(1073741824);
_ui.runVoidMethod ("Initialize",homeact.processBA);
 BA.debugLineNum = 160;BA.debugLine="Ui.BarBackgroundColor = SaeloZahra.Color";
Debug.ShouldStop(-2147483648);
_ui.setField ("BarBackgroundColor",homeact.mostCurrent._saelozahra._color /*RemoteObject*/ );
 BA.debugLineNum = 161;BA.debugLine="Ui.ItemTextColor = Colors.White";
Debug.ShouldStop(1);
_ui.setField ("ItemTextColor",homeact.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 162;BA.debugLine="Ui.ItemIconSize = 50dip";
Debug.ShouldStop(2);
_ui.setField ("ItemIconSize",BA.numberCast(float.class, homeact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))));
 BA.debugLineNum = 163;BA.debugLine="Ui.BarIndicatorColor = 0x2DFFFFFF";
Debug.ShouldStop(4);
_ui.setField ("BarIndicatorColor",BA.numberCast(int.class, ((int)0x2dffffff)));
 BA.debugLineNum = 164;BA.debugLine="Ui.BarIndicatorRadius = 10dip";
Debug.ShouldStop(8);
_ui.setField ("BarIndicatorRadius",BA.numberCast(float.class, homeact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))));
 BA.debugLineNum = 166;BA.debugLine="Ui.BarSideMargins = 15dip";
Debug.ShouldStop(32);
_ui.setField ("BarSideMargins",BA.numberCast(float.class, homeact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 15)))));
 BA.debugLineNum = 167;BA.debugLine="Ui.ItemPadding = 8dip ' har chi Kamtar beshe kooc";
Debug.ShouldStop(64);
_ui.setField ("ItemPadding",BA.numberCast(float.class, homeact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8)))));
 BA.debugLineNum = 168;BA.debugLine="Ui.ItemIconTint = 0xA0FFFFFF";
Debug.ShouldStop(128);
_ui.setField ("ItemIconTint",BA.numberCast(int.class, ((int)0xa0ffffff)));
 BA.debugLineNum = 169;BA.debugLine="Ui.ItemIconTintActive = Colors.White";
Debug.ShouldStop(256);
_ui.setField ("ItemIconTintActive",homeact.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 171;BA.debugLine="Ui.ItemTypeface=SaeloZahra.fontBold";
Debug.ShouldStop(1024);
_ui.setField ("ItemTypeface",(homeact.mostCurrent._saelozahra._fontbold /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 172;BA.debugLine="BottomBar.Initialize(\"Amir\",Ui,Items)";
Debug.ShouldStop(2048);
homeact.mostCurrent._bottombar.runVoidMethod ("Initialize",homeact.processBA,(Object)(BA.ObjectToString("Amir")),(Object)(_ui),(Object)((_items.getObject())));
 BA.debugLineNum = 173;BA.debugLine="Activity.AddView(BottomBar,0,100%y-SaeloZahra.Mat";
Debug.ShouldStop(4096);
homeact.mostCurrent._activity.runVoidMethod ("AddView",(Object)((homeact.mostCurrent._bottombar.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {homeact.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),homeact.mostCurrent.activityBA),homeact.mostCurrent._saelozahra._materialactionbarheight /*RemoteObject*/ ,homeact.mostCurrent._saelozahra._getstatusbarheight /*RemoteObject*/ ,homeact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "---",3, 1)),(Object)(homeact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),homeact.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {homeact.mostCurrent._saelozahra._materialactionbarheight /*RemoteObject*/ ,homeact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "+",1, 1)));
 BA.debugLineNum = 240;BA.debugLine="HomePanelHeight = 100%y-AC.GetMaterialActionBarHe";
Debug.ShouldStop(32768);
homeact._homepanelheight = RemoteObject.solve(new RemoteObject[] {homeact.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),homeact.mostCurrent.activityBA),homeact.mostCurrent._ac.runMethod(true,"GetMaterialActionBarHeight",homeact.mostCurrent.activityBA),homeact.mostCurrent._saelozahra._materialactionbarheight /*RemoteObject*/ ,homeact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 14)))}, "--+",3, 1);
 BA.debugLineNum = 241;BA.debugLine="HomePanel.Initialize(\"HomePanel\")";
Debug.ShouldStop(65536);
homeact.mostCurrent._homepanel.runVoidMethod ("Initialize",homeact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("HomePanel")));
 BA.debugLineNum = 242;BA.debugLine="Dim TafavoteSize As Int = HomePanelHeight/12";
Debug.ShouldStop(131072);
_tafavotesize = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {homeact._homepanelheight,RemoteObject.createImmutable(12)}, "/",0, 0));Debug.locals.put("TafavoteSize", _tafavotesize);Debug.locals.put("TafavoteSize", _tafavotesize);
 BA.debugLineNum = 243;BA.debugLine="If GetDeviceLayoutValues.Height>2020 Then Tafavot";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean(">",homeact.mostCurrent.__c.runMethod(false,"GetDeviceLayoutValues",homeact.mostCurrent.activityBA).getField(true,"Height"),BA.numberCast(double.class, 2020))) { 
_tafavotesize = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {homeact._homepanelheight,RemoteObject.createImmutable(20)}, "/",0, 0));Debug.locals.put("TafavoteSize", _tafavotesize);};
 BA.debugLineNum = 245;BA.debugLine="Dim cdPanelMsg As ColorDrawable";
Debug.ShouldStop(1048576);
_cdpanelmsg = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("cdPanelMsg", _cdpanelmsg);
 BA.debugLineNum = 246;BA.debugLine="cdPanelMsg.Initialize(Colors.White,18)";
Debug.ShouldStop(2097152);
_cdpanelmsg.runVoidMethod ("Initialize",(Object)(homeact.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(BA.numberCast(int.class, 18)));
 BA.debugLineNum = 247;BA.debugLine="PanelMsgs.Initialize(\"PanelMsgs\")";
Debug.ShouldStop(4194304);
homeact.mostCurrent._panelmsgs.runVoidMethod ("Initialize",homeact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("PanelMsgs")));
 BA.debugLineNum = 248;BA.debugLine="PanelMsgs.Background=cdPanelMsg";
Debug.ShouldStop(8388608);
homeact.mostCurrent._panelmsgs.runMethod(false,"setBackground",(_cdpanelmsg.getObject()));
 BA.debugLineNum = 249;BA.debugLine="PanelMsgs.Elevation=7dip";
Debug.ShouldStop(16777216);
homeact.mostCurrent._panelmsgs.runMethod(true,"setElevation",BA.numberCast(float.class, homeact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 7)))));
 BA.debugLineNum = 250;BA.debugLine="HomePanel.AddView(PanelMsgs,14dip,14dip,100%x-28d";
Debug.ShouldStop(33554432);
homeact.mostCurrent._homepanel.runVoidMethod ("AddView",(Object)((homeact.mostCurrent._panelmsgs.getObject())),(Object)(homeact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 14)))),(Object)(homeact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 14)))),(Object)(RemoteObject.solve(new RemoteObject[] {homeact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),homeact.mostCurrent.activityBA),homeact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 28)))}, "-",1, 1)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {homeact._homepanelheight,RemoteObject.createImmutable(2),homeact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60))),_tafavotesize}, "/--",2, 0))));
 BA.debugLineNum = 251;BA.debugLine="AC.SetElevation(PanelMsgs,7dip)";
Debug.ShouldStop(67108864);
homeact.mostCurrent._ac.runVoidMethod ("SetElevation",(Object)((homeact.mostCurrent._panelmsgs.getObject())),(Object)(BA.numberCast(float.class, homeact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 7))))));
 BA.debugLineNum = 253;BA.debugLine="ClvMsg.Initialize(Me, \"ClvMsg\")";
Debug.ShouldStop(268435456);
homeact.mostCurrent._clvmsg.runClassMethod (ir.saelozahra.damaara.mazraeyeman.customlistview.class, "_initialize" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)(homeact.getObject()),(Object)(RemoteObject.createImmutable("ClvMsg")));
 BA.debugLineNum = 254;BA.debugLine="PanelMsgs.AddView(ClvMsg.AsView,0dip,0dip,PanelMs";
Debug.ShouldStop(536870912);
homeact.mostCurrent._panelmsgs.runVoidMethod ("AddView",(Object)((homeact.mostCurrent._clvmsg.runClassMethod (ir.saelozahra.damaara.mazraeyeman.customlistview.class, "_asview" /*RemoteObject*/ ).getObject())),(Object)(homeact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(homeact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(homeact.mostCurrent._panelmsgs.runMethod(true,"getWidth")),(Object)(RemoteObject.solve(new RemoteObject[] {homeact.mostCurrent._panelmsgs.runMethod(true,"getHeight"),homeact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))}, "-",1, 1)));
 BA.debugLineNum = 257;BA.debugLine="If File.Exists(SaeloZahra.dir,\"db.db\") = False Th";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",homeact.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(homeact.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("db.db"))),homeact.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 258;BA.debugLine="File.Copy(File.DirAssets,\"db.db\",SaeloZahra.dir,";
Debug.ShouldStop(2);
homeact.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(homeact.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("db.db")),(Object)(homeact.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("db.db")));
 };
 BA.debugLineNum = 262;BA.debugLine="If Not(SQL1.IsInitialized) Then";
Debug.ShouldStop(32);
if (homeact.mostCurrent.__c.runMethod(true,"Not",(Object)(homeact._sql1.runMethod(true,"IsInitialized"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 263;BA.debugLine="SQL1.Initialize(SaeloZahra.dir,\"db.db\",False)";
Debug.ShouldStop(64);
homeact._sql1.runVoidMethod ("Initialize",(Object)(homeact.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(BA.ObjectToString("db.db")),(Object)(homeact.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 266;BA.debugLine="cu1 = SQL1.ExecQuery(\"SELECT * FROM notification";
Debug.ShouldStop(512);
homeact._cu1 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), homeact._sql1.runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM notification ORDER BY id DESC"))));
 BA.debugLineNum = 268;BA.debugLine="For i = 0 To cu1.RowCount-1";
Debug.ShouldStop(2048);
{
final int step88 = 1;
final int limit88 = RemoteObject.solve(new RemoteObject[] {homeact._cu1.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step88 > 0 && _i <= limit88) || (step88 < 0 && _i >= limit88) ;_i = ((int)(0 + _i + step88))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 269;BA.debugLine="cu1.Position = i";
Debug.ShouldStop(4096);
homeact._cu1.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 270;BA.debugLine="Dim ThisIcon As String = cu1.GetString(\"icon\")";
Debug.ShouldStop(8192);
_thisicon = homeact._cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("icon")));Debug.locals.put("ThisIcon", _thisicon);Debug.locals.put("ThisIcon", _thisicon);
 BA.debugLineNum = 271;BA.debugLine="If ThisIcon==\"\" Then ThisIcon = 0";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_thisicon,BA.ObjectToString(""))) { 
_thisicon = BA.NumberToString(0);Debug.locals.put("ThisIcon", _thisicon);};
 BA.debugLineNum = 272;BA.debugLine="ClvMsg.Add(CreateListItemMsg(cu1.GetString(\"id\")";
Debug.ShouldStop(32768);
homeact.mostCurrent._clvmsg.runClassMethod (ir.saelozahra.damaara.mazraeyeman.customlistview.class, "_add" /*RemoteObject*/ ,(Object)(_createlistitemmsg(homeact._cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("id"))),homeact._cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("title"))),homeact._cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("value"))).runMethod(true,"replace",(Object)(BA.ObjectToString("<hr>")),(Object)(RemoteObject.createImmutable(""))),homeact._cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("type"))),homeact._cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("time"))),BA.numberCast(int.class, _thisicon),homeact.mostCurrent._saelozahra.runMethod(true,"_findalertcolor" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)(homeact._cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("type"))))))),(Object)(homeact._listitemheightmsg),(Object)((homeact._cu1.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("title"))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 275;BA.debugLine="If cu1.RowCount <4 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("<",homeact._cu1.runMethod(true,"getRowCount"),BA.numberCast(double.class, 4))) { 
 BA.debugLineNum = 276;BA.debugLine="ProgressDialogShow(SaeloZahra.CSB(\"در حال دریافت";
Debug.ShouldStop(524288);
homeact.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",homeact.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(homeact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("در حال دریافت اطلاعات اولیه نرم افزار"))).getObject())));
 BA.debugLineNum = 277;BA.debugLine="StartService(accuWeatherCronJobService)";
Debug.ShouldStop(1048576);
homeact.mostCurrent.__c.runVoidMethod ("StartService",homeact.processBA,(Object)((homeact.mostCurrent._accuweathercronjobservice.getObject())));
 };
 BA.debugLineNum = 315;BA.debugLine="JobGet12Hour.Initialize(\"JobGet12Hour\",Me)";
Debug.ShouldStop(67108864);
homeact.mostCurrent._jobget12hour.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_initialize" /*RemoteObject*/ ,homeact.processBA,(Object)(BA.ObjectToString("JobGet12Hour")),(Object)(homeact.getObject()));
 BA.debugLineNum = 317;BA.debugLine="JobGet12Hour.Download(	$\"https://mazraeyeman.ir/r";
Debug.ShouldStop(268435456);
homeact.mostCurrent._jobget12hour.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_download" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable("https://mazraeyeman.ir/reseller/api_files/forecasts.php?region="),homeact.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((homeact.mostCurrent._accuweathercronjobservice._regioncode /*RemoteObject*/ ))),RemoteObject.createImmutable("&period=hour")))));
 BA.debugLineNum = 321;BA.debugLine="Dim cdPanelWeather As ColorDrawable";
Debug.ShouldStop(1);
_cdpanelweather = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("cdPanelWeather", _cdpanelweather);
 BA.debugLineNum = 322;BA.debugLine="cdPanelWeather.Initialize(Colors.White,18)";
Debug.ShouldStop(2);
_cdpanelweather.runVoidMethod ("Initialize",(Object)(homeact.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(BA.numberCast(int.class, 18)));
 BA.debugLineNum = 324;BA.debugLine="PanelWeather.Initialize(\"PanelWeather\")";
Debug.ShouldStop(8);
homeact.mostCurrent._panelweather.runVoidMethod ("Initialize",homeact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("PanelWeather")));
 BA.debugLineNum = 325;BA.debugLine="PanelWeather.Background=cdPanelWeather";
Debug.ShouldStop(16);
homeact.mostCurrent._panelweather.runMethod(false,"setBackground",(_cdpanelweather.getObject()));
 BA.debugLineNum = 326;BA.debugLine="PanelWeather.Padding= Array As Int (0,0,0,0 )";
Debug.ShouldStop(32);
homeact.mostCurrent._panelweather.runMethod(false,"setPadding",RemoteObject.createNewArray("int",new int[] {4},new Object[] {BA.numberCast(int.class, 0),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0)}));
 BA.debugLineNum = 327;BA.debugLine="PanelWeather.Elevation=7dip";
Debug.ShouldStop(64);
homeact.mostCurrent._panelweather.runMethod(true,"setElevation",BA.numberCast(float.class, homeact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 7)))));
 BA.debugLineNum = 328;BA.debugLine="PanelWeather.SetBackgroundImage(LoadBitmap(File.D";
Debug.ShouldStop(128);
homeact.mostCurrent._panelweather.runVoidMethod ("SetBackgroundImageNew",(Object)((homeact.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(homeact.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("home-weather-background.jpg"))).getObject())));
 BA.debugLineNum = 329;BA.debugLine="HomePanel.AddView(PanelWeather,14dip, PanelMsgs.T";
Debug.ShouldStop(256);
homeact.mostCurrent._homepanel.runVoidMethod ("AddView",(Object)((homeact.mostCurrent._panelweather.getObject())),(Object)(homeact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 14)))),(Object)(RemoteObject.solve(new RemoteObject[] {homeact.mostCurrent._panelmsgs.runMethod(true,"getTop"),homeact.mostCurrent._panelmsgs.runMethod(true,"getHeight"),homeact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "++",2, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {homeact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),homeact.mostCurrent.activityBA),homeact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 28)))}, "-",1, 1)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {homeact._homepanelheight,RemoteObject.createImmutable(2),_tafavotesize}, "/+",1, 0))));
 BA.debugLineNum = 333;BA.debugLine="ParallaxDesign.Initialize";
Debug.ShouldStop(4096);
homeact.mostCurrent._parallaxdesign.runVoidMethod ("Initialize",homeact.mostCurrent.activityBA);
 BA.debugLineNum = 334;BA.debugLine="PanelWeather.AddView(ParallaxDesign,-5dip,-5dip,P";
Debug.ShouldStop(8192);
homeact.mostCurrent._panelweather.runVoidMethod ("AddView",(Object)((homeact.mostCurrent._parallaxdesign.getObject())),(Object)(BA.numberCast(int.class, -(double) (0 + homeact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))).<Integer>get().intValue()))),(Object)(BA.numberCast(int.class, -(double) (0 + homeact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))).<Integer>get().intValue()))),(Object)(RemoteObject.solve(new RemoteObject[] {homeact.mostCurrent._panelweather.runMethod(true,"getWidth"),homeact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "+",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {homeact.mostCurrent._panelweather.runMethod(true,"getHeight"),homeact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "+",1, 1)));
 BA.debugLineNum = 335;BA.debugLine="ParallaxDesign.setMargins(PanelWeather.Height/2,P";
Debug.ShouldStop(16384);
homeact.mostCurrent._parallaxdesign.runVoidMethod ("setMargins",(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {homeact.mostCurrent._panelweather.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {homeact.mostCurrent._panelweather.runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "/",0, 0))));
 BA.debugLineNum = 336;BA.debugLine="ParallaxDesign.setMultipliers(1.4f,1.4f)";
Debug.ShouldStop(32768);
homeact.mostCurrent._parallaxdesign.runVoidMethod ("setMultipliers",(Object)(BA.numberCast(float.class, 1.4f)),(Object)(BA.numberCast(float.class, 1.4f)));
 BA.debugLineNum = 337;BA.debugLine="ParallaxDesign.SetImageBitmap(LoadBitmap(File.Dir";
Debug.ShouldStop(65536);
homeact.mostCurrent._parallaxdesign.runVoidMethod ("SetImageBitmap",(Object)(homeact.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(homeact.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("home-weather-background.jpg")))));
 BA.debugLineNum = 346;BA.debugLine="WeatherWV.Initialize(\"WeatherWV\")";
Debug.ShouldStop(33554432);
homeact.mostCurrent._weatherwv.runVoidMethod ("Initialize",homeact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("WeatherWV")));
 BA.debugLineNum = 347;BA.debugLine="WeatherWV.Color=Colors.Transparent";
Debug.ShouldStop(67108864);
homeact.mostCurrent._weatherwv.runVoidMethod ("setColor",homeact.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 348;BA.debugLine="WeatherWV.ZoomEnabled=False";
Debug.ShouldStop(134217728);
homeact.mostCurrent._weatherwv.runMethod(true,"setZoomEnabled",homeact.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 349;BA.debugLine="WeatherWV.LoadHtml(\"<br><br><br><h3 style='text-a";
Debug.ShouldStop(268435456);
homeact.mostCurrent._weatherwv.runVoidMethod ("LoadHtml",(Object)(RemoteObject.createImmutable("<br><br><br><h3 style='text-align:center;'>در حال بارگزاری</h3>")));
 BA.debugLineNum = 350;BA.debugLine="WeatherWV.LoadUrl(\"file:///android_asset/backgrou";
Debug.ShouldStop(536870912);
homeact.mostCurrent._weatherwv.runVoidMethod ("LoadUrl",(Object)(RemoteObject.createImmutable("file:///android_asset/background.html")));
 BA.debugLineNum = 351;BA.debugLine="PanelWeather.AddView(WeatherWV,5dip,15dip,PanelWe";
Debug.ShouldStop(1073741824);
homeact.mostCurrent._panelweather.runVoidMethod ("AddView",(Object)((homeact.mostCurrent._weatherwv.getObject())),(Object)(homeact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(homeact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 15)))),(Object)(RemoteObject.solve(new RemoteObject[] {homeact.mostCurrent._panelweather.runMethod(true,"getWidth"),homeact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "-",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {homeact.mostCurrent._panelweather.runMethod(true,"getHeight"),homeact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 55)))}, "-",1, 1)));
 BA.debugLineNum = 353;BA.debugLine="Dim WeatherHover As Label";
Debug.ShouldStop(1);
_weatherhover = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("WeatherHover", _weatherhover);
 BA.debugLineNum = 354;BA.debugLine="WeatherHover.Initialize(\"WeatherHover\")";
Debug.ShouldStop(2);
_weatherhover.runVoidMethod ("Initialize",homeact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("WeatherHover")));
 BA.debugLineNum = 355;BA.debugLine="PanelWeather.AddView(WeatherHover,-30dip,-30dip,1";
Debug.ShouldStop(4);
homeact.mostCurrent._panelweather.runVoidMethod ("AddView",(Object)((_weatherhover.getObject())),(Object)(BA.numberCast(int.class, -(double) (0 + homeact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30))).<Integer>get().intValue()))),(Object)(BA.numberCast(int.class, -(double) (0 + homeact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30))).<Integer>get().intValue()))),(Object)(homeact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),homeact.mostCurrent.activityBA)),(Object)(homeact.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),homeact.mostCurrent.activityBA)));
 BA.debugLineNum = 357;BA.debugLine="AC.SetClickEffect(WeatherHover,True)";
Debug.ShouldStop(16);
homeact.mostCurrent._ac.runVoidMethod ("SetClickEffect",homeact.mostCurrent.activityBA,(Object)((_weatherhover.getObject())),(Object)(homeact.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 384;BA.debugLine="jobSingleVideo.Initialize(\"jobSingleVideo\",Me)";
Debug.ShouldStop(-2147483648);
homeact.mostCurrent._jobsinglevideo.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_initialize" /*RemoteObject*/ ,homeact.processBA,(Object)(BA.ObjectToString("jobSingleVideo")),(Object)(homeact.getObject()));
 BA.debugLineNum = 386;BA.debugLine="MultiMediaWv.Initialize(\"MultiMediaWv\")";
Debug.ShouldStop(2);
homeact.mostCurrent._multimediawv.runVoidMethod ("Initialize",homeact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("MultiMediaWv")));
 BA.debugLineNum = 387;BA.debugLine="MultiMediaWv.Color=Colors.Transparent";
Debug.ShouldStop(4);
homeact.mostCurrent._multimediawv.runVoidMethod ("setColor",homeact.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 388;BA.debugLine="MultiMediaWv.ZoomEnabled=False";
Debug.ShouldStop(8);
homeact.mostCurrent._multimediawv.runMethod(true,"setZoomEnabled",homeact.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 389;BA.debugLine="MultiMediaWv.LoadUrl(SaeloZahra.json_url&\"multime";
Debug.ShouldStop(16);
homeact.mostCurrent._multimediawv.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(homeact.mostCurrent._saelozahra._json_url /*RemoteObject*/ ,RemoteObject.createImmutable("multimedia.php"))));
 BA.debugLineNum = 391;BA.debugLine="MultiMediaWv.Tag = \"salam\"";
Debug.ShouldStop(64);
homeact.mostCurrent._multimediawv.runMethod(false,"setTag",RemoteObject.createImmutable(("salam")));
 BA.debugLineNum = 393;BA.debugLine="MultiMediaPanel.Initialize(\"MultiMediaPanel\")";
Debug.ShouldStop(256);
homeact.mostCurrent._multimediapanel.runVoidMethod ("Initialize",homeact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("MultiMediaPanel")));
 BA.debugLineNum = 394;BA.debugLine="MultiMediaPanel.AddView(MultiMediaWv,0,0,100%x,10";
Debug.ShouldStop(512);
homeact.mostCurrent._multimediapanel.runVoidMethod ("AddView",(Object)((homeact.mostCurrent._multimediawv.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(homeact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),homeact.mostCurrent.activityBA)),(Object)(homeact.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),homeact.mostCurrent.activityBA)));
 BA.debugLineNum = 417;BA.debugLine="jobSingleBazarche.Initialize(\"jobSingleBazarche\",";
Debug.ShouldStop(1);
homeact.mostCurrent._jobsinglebazarche.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_initialize" /*RemoteObject*/ ,homeact.processBA,(Object)(BA.ObjectToString("jobSingleBazarche")),(Object)(homeact.getObject()));
 BA.debugLineNum = 420;BA.debugLine="BazarcheWV.Initialize(\"BazarcheWV\")";
Debug.ShouldStop(8);
homeact.mostCurrent._bazarchewv.runVoidMethod ("Initialize",homeact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("BazarcheWV")));
 BA.debugLineNum = 421;BA.debugLine="BazarcheWV.Color=Colors.Transparent";
Debug.ShouldStop(16);
homeact.mostCurrent._bazarchewv.runVoidMethod ("setColor",homeact.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 422;BA.debugLine="BazarcheWV.ZoomEnabled=False";
Debug.ShouldStop(32);
homeact.mostCurrent._bazarchewv.runMethod(true,"setZoomEnabled",homeact.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 423;BA.debugLine="BazarcheWV.LoadUrl(SaeloZahra.json_url&\"productfa";
Debug.ShouldStop(64);
homeact.mostCurrent._bazarchewv.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(homeact.mostCurrent._saelozahra._json_url /*RemoteObject*/ ,RemoteObject.createImmutable("productfarmers_list.php?bazarche=html&wc=yes"))));
 BA.debugLineNum = 425;BA.debugLine="BazarcheWVPanel.Initialize(\"BazarcheWVPanel\")";
Debug.ShouldStop(256);
homeact.mostCurrent._bazarchewvpanel.runVoidMethod ("Initialize",homeact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("BazarcheWVPanel")));
 BA.debugLineNum = 426;BA.debugLine="BazarcheWVPanel.AddView(BazarcheWV,0,0,100%x,100%";
Debug.ShouldStop(512);
homeact.mostCurrent._bazarchewvpanel.runVoidMethod ("AddView",(Object)((homeact.mostCurrent._bazarchewv.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(homeact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),homeact.mostCurrent.activityBA)),(Object)(homeact.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),homeact.mostCurrent.activityBA)));
 BA.debugLineNum = 429;BA.debugLine="mapProductName.Initialize";
Debug.ShouldStop(4096);
homeact._mapproductname.runVoidMethod ("Initialize");
 BA.debugLineNum = 448;BA.debugLine="If FirstTime Then";
Debug.ShouldStop(-2147483648);
if (_firsttime.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 449;BA.debugLine="apkupdt.Initialize(Me,\"update\")			'initializes t";
Debug.ShouldStop(1);
homeact.mostCurrent._apkupdt.runClassMethod (ir.saelozahra.damaara.mazraeyeman.cl_appupdate.class, "_initialize" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)(homeact.getObject()),(Object)(RemoteObject.createImmutable("update")));
 BA.debugLineNum = 450;BA.debugLine="apkupdt.Verbose = True  				'this one affects th";
Debug.ShouldStop(2);
homeact.mostCurrent._apkupdt.runClassMethod (ir.saelozahra.damaara.mazraeyeman.cl_appupdate.class, "_setverbose",homeact.mostCurrent.__c.getField(true,"True"));
 };
 BA.debugLineNum = 453;BA.debugLine="apkupdt.PackageName = Application.PackageName";
Debug.ShouldStop(16);
homeact.mostCurrent._apkupdt.runClassMethod (ir.saelozahra.damaara.mazraeyeman.cl_appupdate.class, "_setpackagename" /*RemoteObject*/ ,homeact.mostCurrent.__c.getField(false,"Application").runMethod(true,"getPackageName"));
 BA.debugLineNum = 455;BA.debugLine="apkupdt.NewVerTxt = SaeloZahra.site_url&\"applicat";
Debug.ShouldStop(64);
homeact.mostCurrent._apkupdt.runClassMethod (ir.saelozahra.damaara.mazraeyeman.cl_appupdate.class, "_setnewvertxt",RemoteObject.concat(homeact.mostCurrent._saelozahra._site_url /*RemoteObject*/ ,RemoteObject.createImmutable("application/android.inf")));
 BA.debugLineNum = 457;BA.debugLine="apkupdt.NewVerApk = SaeloZahra.site_url&\"applicat";
Debug.ShouldStop(256);
homeact.mostCurrent._apkupdt.runClassMethod (ir.saelozahra.damaara.mazraeyeman.cl_appupdate.class, "_setnewverapk",RemoteObject.concat(homeact.mostCurrent._saelozahra._site_url /*RemoteObject*/ ,RemoteObject.createImmutable("application/android.apk")));
 BA.debugLineNum = 459;BA.debugLine="apkupdt.setCredentials(\"saelozahra\",\"Yaheydar110\"";
Debug.ShouldStop(1024);
homeact.mostCurrent._apkupdt.runClassMethod (ir.saelozahra.damaara.mazraeyeman.cl_appupdate.class, "_setcredentials" /*RemoteObject*/ ,(Object)(BA.ObjectToString("saelozahra")),(Object)(RemoteObject.createImmutable("Yaheydar110")));
 BA.debugLineNum = 474;BA.debugLine="VP.Initialize(\"VP\")";
Debug.ShouldStop(33554432);
homeact.mostCurrent._vp.runVoidMethod ("Initialize",homeact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("VP")));
 BA.debugLineNum = 475;BA.debugLine="Activity.AddView(VP,0,SaeloZahra.MaterialActionBa";
Debug.ShouldStop(67108864);
homeact.mostCurrent._activity.runVoidMethod ("AddView",(Object)((homeact.mostCurrent._vp.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(homeact.mostCurrent._saelozahra._materialactionbarheight /*RemoteObject*/ ),(Object)(homeact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),homeact.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {homeact.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),homeact.mostCurrent.activityBA),homeact.mostCurrent._bottombar.runMethod(true,"getHeight"),homeact.mostCurrent._saelozahra._materialactionbarheight /*RemoteObject*/ ,homeact.mostCurrent._saelozahra._getstatusbarheight /*RemoteObject*/ ,homeact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3)))}, "---+",4, 1)));
 BA.debugLineNum = 477;BA.debugLine="Dim PC As AHPageContainer";
Debug.ShouldStop(268435456);
_pc = RemoteObject.createNew ("de.amberhome.viewpager.AHPageContainer");Debug.locals.put("PC", _pc);
 BA.debugLineNum = 478;BA.debugLine="PC.Initialize";
Debug.ShouldStop(536870912);
_pc.runVoidMethod ("Initialize",homeact.mostCurrent.activityBA);
 BA.debugLineNum = 479;BA.debugLine="PC.AddPage(MultiMediaPanel,\"چندرسانه‌ای\")";
Debug.ShouldStop(1073741824);
_pc.runVoidMethod ("AddPage",(Object)((homeact.mostCurrent._multimediapanel.getObject())),(Object)(RemoteObject.createImmutable("چندرسانه‌ای")));
 BA.debugLineNum = 480;BA.debugLine="PC.AddPage(HomePanel,\"مزرعه‌من\")";
Debug.ShouldStop(-2147483648);
_pc.runVoidMethod ("AddPage",(Object)((homeact.mostCurrent._homepanel.getObject())),(Object)(RemoteObject.createImmutable("مزرعه‌من")));
 BA.debugLineNum = 481;BA.debugLine="PC.AddPage(BazarcheWVPanel,\"بازارچه\")";
Debug.ShouldStop(1);
_pc.runVoidMethod ("AddPage",(Object)((homeact.mostCurrent._bazarchewvpanel.getObject())),(Object)(RemoteObject.createImmutable("بازارچه")));
 BA.debugLineNum = 482;BA.debugLine="VP.PageContainer = PC";
Debug.ShouldStop(2);
homeact.mostCurrent._vp.runVoidMethod ("setPageContainer",_pc);
 BA.debugLineNum = 483;BA.debugLine="VP.CurrentPage = 1";
Debug.ShouldStop(4);
homeact.mostCurrent._vp.runMethod(true,"setCurrentPage",BA.numberCast(int.class, 1));
 BA.debugLineNum = 484;BA.debugLine="BottomBar.ActiveItem = 1";
Debug.ShouldStop(8);
homeact.mostCurrent._bottombar.runMethod(true,"setActiveItem",BA.numberCast(int.class, 1));
 BA.debugLineNum = 486;BA.debugLine="BottomBar.BringToFront";
Debug.ShouldStop(32);
homeact.mostCurrent._bottombar.runVoidMethod ("BringToFront");
 BA.debugLineNum = 488;BA.debugLine="HomePanel.Height = HomePanel.Height + 110dip";
Debug.ShouldStop(128);
homeact.mostCurrent._homepanel.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {homeact.mostCurrent._homepanel.runMethod(true,"getHeight"),homeact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 110)))}, "+",1, 1));
 BA.debugLineNum = 492;BA.debugLine="SwipeBazarche.Initialize(BazarcheWV)";
Debug.ShouldStop(2048);
homeact.mostCurrent._swipebazarche.runClassMethod (ir.saelozahra.damaara.mazraeyeman.wvswipe.class, "_initialize" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)(homeact.mostCurrent._bazarchewv));
 BA.debugLineNum = 493;BA.debugLine="SwipeBazarche.Progress_Color=SaeloZahra.Color";
Debug.ShouldStop(4096);
homeact.mostCurrent._swipebazarche.runClassMethod (ir.saelozahra.damaara.mazraeyeman.wvswipe.class, "_setprogress_color",homeact.mostCurrent._saelozahra._color /*RemoteObject*/ );
 BA.debugLineNum = 495;BA.debugLine="SwipeMultiMedia.Initialize(MultiMediaWv)";
Debug.ShouldStop(16384);
homeact.mostCurrent._swipemultimedia.runClassMethod (ir.saelozahra.damaara.mazraeyeman.wvswipe.class, "_initialize" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)(homeact.mostCurrent._multimediawv));
 BA.debugLineNum = 496;BA.debugLine="SwipeMultiMedia.Progress_Color=SaeloZahra.ColorDa";
Debug.ShouldStop(32768);
homeact.mostCurrent._swipemultimedia.runClassMethod (ir.saelozahra.damaara.mazraeyeman.wvswipe.class, "_setprogress_color",homeact.mostCurrent._saelozahra._colordark /*RemoteObject*/ );
 BA.debugLineNum = 498;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_createmenu(RemoteObject _menu) throws Exception{
try {
		Debug.PushSubsStack("Activity_CreateMenu (homeact) ","homeact",3,homeact.mostCurrent.activityBA,homeact.mostCurrent,926);
if (RapidSub.canDelegate("activity_createmenu")) { return ir.saelozahra.damaara.mazraeyeman.homeact.remoteMe.runUserSub(false, "homeact","activity_createmenu", _menu);}
Debug.locals.put("Menu", _menu);
 BA.debugLineNum = 926;BA.debugLine="Sub Activity_CreateMenu(Menu As ACMenu)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 928;BA.debugLine="sv.Initialize2(\"search\", sv.THEME_DARK)";
Debug.ShouldStop(-2147483648);
homeact.mostCurrent._sv.runVoidMethod ("Initialize2",homeact.mostCurrent.activityBA,(Object)(BA.ObjectToString("search")),(Object)(homeact.mostCurrent._sv.getField(true,"THEME_DARK")));
 BA.debugLineNum = 929;BA.debugLine="sv.IconifiedByDefault = True";
Debug.ShouldStop(1);
homeact.mostCurrent._sv.runMethod(true,"setIconifiedByDefault",homeact.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 931;BA.debugLine="Menu.Clear";
Debug.ShouldStop(4);
_menu.runVoidMethod ("Clear");
 BA.debugLineNum = 932;BA.debugLine="ActionBar.InitMenuListener";
Debug.ShouldStop(8);
homeact.mostCurrent._actionbar.runVoidMethod ("InitMenuListener");
 BA.debugLineNum = 934;BA.debugLine="sv.QueryHint=SaeloZahra.csb(\"جستجو در مطالب\")";
Debug.ShouldStop(32);
homeact.mostCurrent._sv.runMethod(true,"setQueryHint",BA.ObjectToCharSequence(homeact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("جستجو در مطالب"))).getObject()));
 BA.debugLineNum = 935;BA.debugLine="si = Menu.Add2(1, 1, \"جستجو\", X1.GetDrawable(\"bas";
Debug.ShouldStop(64);
homeact.mostCurrent._si = _menu.runMethod(false,"Add2",(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.ObjectToCharSequence("جستجو")),(Object)(homeact.mostCurrent._x1.runMethod(false,"GetDrawable",(Object)(RemoteObject.createImmutable("baseline_search_white_24")))));
 BA.debugLineNum = 936;BA.debugLine="si.SearchView = sv";
Debug.ShouldStop(128);
homeact.mostCurrent._si.runVoidMethod ("setSearchView",homeact.mostCurrent._sv);
 BA.debugLineNum = 944;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("Activity_KeyPress (homeact) ","homeact",3,homeact.mostCurrent.activityBA,homeact.mostCurrent,974);
if (RapidSub.canDelegate("activity_keypress")) { return ir.saelozahra.damaara.mazraeyeman.homeact.remoteMe.runUserSub(false, "homeact","activity_keypress", _keycode);}
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 974;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(8192);
 BA.debugLineNum = 975;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, homeact.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 976;BA.debugLine="If SM.Visible Then";
Debug.ShouldStop(32768);
if (homeact.mostCurrent._sm.runMethod(true,"getVisible").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 977;BA.debugLine="ActionBar_NavigationItemClick";
Debug.ShouldStop(65536);
_actionbar_navigationitemclick();
 }else 
{ BA.debugLineNum = 978;BA.debugLine="Else if VP.CurrentPage == 0 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",homeact.mostCurrent._vp.runMethod(true,"getCurrentPage"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 979;BA.debugLine="MultiMediaWv.Back";
Debug.ShouldStop(262144);
homeact.mostCurrent._multimediawv.runVoidMethod ("Back");
 BA.debugLineNum = 980;BA.debugLine="DTTC.TapToClose";
Debug.ShouldStop(524288);
homeact.mostCurrent._dttc.runClassMethod (ir.saelozahra.damaara.mazraeyeman.doubletaptoclose.class, "_taptoclose" /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 982;BA.debugLine="DTTC.TapToClose";
Debug.ShouldStop(2097152);
homeact.mostCurrent._dttc.runClassMethod (ir.saelozahra.damaara.mazraeyeman.doubletaptoclose.class, "_taptoclose" /*RemoteObject*/ );
 }}
;
 BA.debugLineNum = 984;BA.debugLine="Return True";
Debug.ShouldStop(8388608);
if (true) return homeact.mostCurrent.__c.getField(true,"True");
 }else {
 BA.debugLineNum = 986;BA.debugLine="Return False";
Debug.ShouldStop(33554432);
if (true) return homeact.mostCurrent.__c.getField(true,"False");
 };
 BA.debugLineNum = 988;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("Activity_Pause (homeact) ","homeact",3,homeact.mostCurrent.activityBA,homeact.mostCurrent,644);
if (RapidSub.canDelegate("activity_pause")) { return ir.saelozahra.damaara.mazraeyeman.homeact.remoteMe.runUserSub(false, "homeact","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 644;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(8);
 BA.debugLineNum = 646;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (homeact) ","homeact",3,homeact.mostCurrent.activityBA,homeact.mostCurrent,508);
if (RapidSub.canDelegate("activity_resume")) { ir.saelozahra.damaara.mazraeyeman.homeact.remoteMe.runUserSub(false, "homeact","activity_resume"); return;}
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
public ResumableSub_Activity_Resume(ir.saelozahra.damaara.mazraeyeman.homeact parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.saelozahra.damaara.mazraeyeman.homeact parent;
RemoteObject _int1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.IntentWrapper");
RemoteObject _uri = RemoteObject.createImmutable("");
int _i = 0;
int step17;
int limit17;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (homeact) ","homeact",3,homeact.mostCurrent.activityBA,homeact.mostCurrent,508);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 510;BA.debugLine="Dim Int1 As Intent = GetIntent";
Debug.ShouldStop(536870912);
_int1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");
_int1 = _getintent();Debug.locals.put("Int1", _int1);Debug.locals.put("Int1", _int1);
 BA.debugLineNum = 511;BA.debugLine="If Int1.Action = Int1.ACTION_VIEW Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 1:
//if
this.state = 14;
if (RemoteObject.solveBoolean("=",_int1.runMethod(true,"getAction"),_int1.getField(true,"ACTION_VIEW"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 512;BA.debugLine="Dim URI As String =Int1.GetData";
Debug.ShouldStop(-2147483648);
_uri = _int1.runMethod(true,"GetData");Debug.locals.put("URI", _uri);Debug.locals.put("URI", _uri);
 BA.debugLineNum = 513;BA.debugLine="LogColor(URI,Colors.Yellow)";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","42359301",_uri,parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Yellow"));
 BA.debugLineNum = 514;BA.debugLine="If URI.StartsWith(\"tmm://mazraeyeman.ir\") Then";
Debug.ShouldStop(2);
if (true) break;

case 4:
//if
this.state = 13;
if (_uri.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("tmm://mazraeyeman.ir"))).<Boolean>get().booleanValue()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 515;BA.debugLine="If URI.Replace(\"tmm://mazraeyeman.ir?marja=\",\"\"";
Debug.ShouldStop(4);
if (true) break;

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean(">",_uri.runMethod(true,"replace",(Object)(BA.ObjectToString("tmm://mazraeyeman.ir?marja=")),(Object)(RemoteObject.createImmutable(""))).runMethod(true,"length"),BA.numberCast(double.class, 5))) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 516;BA.debugLine="Snake.Initialize(\"snake\",Activity,SaeloZahra.C";
Debug.ShouldStop(8);
parent.mostCurrent._snake.runVoidMethod ("Initialize",homeact.mostCurrent.activityBA,(Object)(BA.ObjectToString("snake")),(Object)((parent.mostCurrent._activity.getObject())),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("پرداخت با موفقیت انجام شد"))).getObject())),(Object)(parent.mostCurrent._snake.getField(true,"DURATION_LONG")));
 BA.debugLineNum = 517;BA.debugLine="Msgbox2Async(\"وضعیت تراکنش: موفق\"& CRLF&\"کد پی";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("وضعیت تراکنش: موفق"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("کد پیگیری تراکنش: "),_uri.runMethod(true,"replace",(Object)(BA.ObjectToString("tmm://mazraeyeman.ir?marja=")),(Object)(RemoteObject.createImmutable("")))))),(Object)(BA.ObjectToCharSequence("وضعیت تراکنش")),(Object)(BA.ObjectToString(parent.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("ثبت نام"))))),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.mostCurrent.__c.getField(false,"Null")),homeact.processBA,(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 518;BA.debugLine="login_act.ItIsPayed = True";
Debug.ShouldStop(32);
parent.mostCurrent._login_act._itispayed /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"True");
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 520;BA.debugLine="Snake.Initialize(\"snake\",Activity,SaeloZahra.C";
Debug.ShouldStop(128);
parent.mostCurrent._snake.runVoidMethod ("Initialize",homeact.mostCurrent.activityBA,(Object)(BA.ObjectToString("snake")),(Object)((parent.mostCurrent._activity.getObject())),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("خطا در پرداخت"))).getObject())),(Object)(parent.mostCurrent._snake.getField(true,"DURATION_LONG")));
 if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 522;BA.debugLine="Snake.Show";
Debug.ShouldStop(512);
parent.mostCurrent._snake.runVoidMethod ("Show");
 if (true) break;

case 13:
//C
this.state = 14;
;
 if (true) break;

case 14:
//C
this.state = 15;
;
 BA.debugLineNum = 529;BA.debugLine="Sleep(0)";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("Sleep",homeact.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "homeact", "activity_resume"),BA.numberCast(int.class, 0));
this.state = 211;
return;
case 211:
//C
this.state = 15;
;
 BA.debugLineNum = 530;BA.debugLine="For i = 0 To ClvMsg.GetSize-1";
Debug.ShouldStop(131072);
if (true) break;

case 15:
//for
this.state = 24;
step17 = 1;
limit17 = RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._clvmsg.runClassMethod (ir.saelozahra.damaara.mazraeyeman.customlistview.class, "_getsize" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 212;
if (true) break;

case 212:
//C
this.state = 24;
if ((step17 > 0 && _i <= limit17) || (step17 < 0 && _i >= limit17)) this.state = 17;
if (true) break;

case 213:
//C
this.state = 212;
_i = ((int)(0 + _i + step17)) ;
Debug.locals.put("i", _i);
if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 531;BA.debugLine="If ClvMsg.GetValue(i) == \"وضعیت \"&SaeloZahra.tar";
Debug.ShouldStop(262144);
if (true) break;

case 18:
//if
this.state = 23;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._clvmsg.runClassMethod (ir.saelozahra.damaara.mazraeyeman.customlistview.class, "_getvalue" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _i))),(RemoteObject.concat(RemoteObject.createImmutable("وضعیت "),parent.mostCurrent._saelozahra.runMethod(true,"_tarikhekhafan" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)(parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"))))))) { 
this.state = 20;
;}if (true) break;

case 20:
//C
this.state = 23;
parent.mostCurrent._clvmsg.runClassMethod (ir.saelozahra.damaara.mazraeyeman.customlistview.class, "_jumptoitem" /*void*/ ,(Object)(BA.numberCast(int.class, _i)));
if (true) break;

case 23:
//C
this.state = 213;
;
 if (true) break;
if (true) break;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 534;BA.debugLine="If Not(ActionBar.IsInitialized) Or ActionBar.Heig";
Debug.ShouldStop(2097152);

case 24:
//if
this.state = 29;
if (RemoteObject.solveBoolean(".",parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._actionbar.runMethod(true,"IsInitialized")))) || RemoteObject.solveBoolean("<",parent.mostCurrent._actionbar.runMethod(true,"getHeight"),BA.numberCast(double.class, parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))))) { 
this.state = 26;
;}if (true) break;

case 26:
//C
this.state = 29;
parent.mostCurrent.__c.runVoidMethod ("ExitApplication");
if (true) break;

case 29:
//C
this.state = 30;
;
 BA.debugLineNum = 536;BA.debugLine="Try";
Debug.ShouldStop(8388608);
if (true) break;

case 30:
//try
this.state = 41;
this.catchState = 40;
this.state = 32;
if (true) break;

case 32:
//C
this.state = 33;
this.catchState = 40;
 BA.debugLineNum = 537;BA.debugLine="If File.Exists(SaeloZahra.dir,\"UVIndex\") Then";
Debug.ShouldStop(16777216);
if (true) break;

case 33:
//if
this.state = 38;
if (parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("UVIndex"))).<Boolean>get().booleanValue()) { 
this.state = 35;
}else {
this.state = 37;
}if (true) break;

case 35:
//C
this.state = 38;
 BA.debugLineNum = 538;BA.debugLine="UVIndex = File.ReadString(SaeloZahra.dir,\"UVInd";
Debug.ShouldStop(33554432);
parent._uvindex = parent.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(parent.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("UVIndex")));
 if (true) break;

case 37:
//C
this.state = 38;
 BA.debugLineNum = 540;BA.debugLine="UVIndex = accuWeatherCronJobService.UVIndex";
Debug.ShouldStop(134217728);
parent._uvindex = parent.mostCurrent._accuweathercronjobservice._uvindex /*RemoteObject*/ ;
 if (true) break;

case 38:
//C
this.state = 41;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 40:
//C
this.state = 41;
this.catchState = 0;
 BA.debugLineNum = 543;BA.debugLine="Log(\"UVIndex: \"&UVIndex)";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","42359331",RemoteObject.concat(RemoteObject.createImmutable("UVIndex: "),parent._uvindex),0);
 BA.debugLineNum = 544;BA.debugLine="Log(LastException)";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","42359332",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",homeact.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;
;
 BA.debugLineNum = 547;BA.debugLine="Try";
Debug.ShouldStop(4);

case 41:
//try
this.state = 58;
this.catchState = 0;
this.catchState = 57;
this.state = 43;
if (true) break;

case 43:
//C
this.state = 44;
this.catchState = 57;
 BA.debugLineNum = 548;BA.debugLine="If Not(File.Exists(SaeloZahra.Dir,\"MinDama\")) Th";
Debug.ShouldStop(8);
if (true) break;

case 44:
//if
this.state = 49;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("MinDama"))))).<Boolean>get().booleanValue()) { 
this.state = 46;
;}if (true) break;

case 46:
//C
this.state = 49;
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(parent.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(BA.ObjectToString("MinDama")),(Object)(BA.NumberToString(0)));
if (true) break;

case 49:
//C
this.state = 50;
;
 BA.debugLineNum = 549;BA.debugLine="If accuWeatherCronJobService.MinDama<1 Then accu";
Debug.ShouldStop(16);
if (true) break;

case 50:
//if
this.state = 55;
if (RemoteObject.solveBoolean("<",parent.mostCurrent._accuweathercronjobservice._mindama /*RemoteObject*/ ,BA.numberCast(double.class, 1))) { 
this.state = 52;
;}if (true) break;

case 52:
//C
this.state = 55;
parent.mostCurrent._accuweathercronjobservice._mindama /*RemoteObject*/  = BA.numberCast(int.class, parent.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(parent.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("MinDama"))));
if (true) break;

case 55:
//C
this.state = 58;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 57:
//C
this.state = 58;
this.catchState = 0;
 BA.debugLineNum = 551;BA.debugLine="Log(\"MinDama: \"&accuWeatherCronJobService.MinDam";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","42359339",RemoteObject.concat(RemoteObject.createImmutable("MinDama: "),parent.mostCurrent._accuweathercronjobservice._mindama /*RemoteObject*/ ),0);
 BA.debugLineNum = 552;BA.debugLine="Log(LastException)";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","42359340",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",homeact.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;
;
 BA.debugLineNum = 555;BA.debugLine="Try";
Debug.ShouldStop(1024);

case 58:
//try
this.state = 75;
this.catchState = 0;
this.catchState = 74;
this.state = 60;
if (true) break;

case 60:
//C
this.state = 61;
this.catchState = 74;
 BA.debugLineNum = 556;BA.debugLine="If Not(File.Exists(SaeloZahra.Dir,\"MaxDama\")) Th";
Debug.ShouldStop(2048);
if (true) break;

case 61:
//if
this.state = 66;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("MaxDama"))))).<Boolean>get().booleanValue()) { 
this.state = 63;
;}if (true) break;

case 63:
//C
this.state = 66;
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(parent.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(BA.ObjectToString("MaxDama")),(Object)(BA.NumberToString(0)));
if (true) break;

case 66:
//C
this.state = 67;
;
 BA.debugLineNum = 557;BA.debugLine="If accuWeatherCronJobService.MaxDama<1 Then accu";
Debug.ShouldStop(4096);
if (true) break;

case 67:
//if
this.state = 72;
if (RemoteObject.solveBoolean("<",parent.mostCurrent._accuweathercronjobservice._maxdama /*RemoteObject*/ ,BA.numberCast(double.class, 1))) { 
this.state = 69;
;}if (true) break;

case 69:
//C
this.state = 72;
parent.mostCurrent._accuweathercronjobservice._maxdama /*RemoteObject*/  = BA.numberCast(int.class, parent.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(parent.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("MaxDama"))));
if (true) break;

case 72:
//C
this.state = 75;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 74:
//C
this.state = 75;
this.catchState = 0;
 BA.debugLineNum = 559;BA.debugLine="Log(\"MaxDama: \"&accuWeatherCronJobService.MaxDam";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","42359347",RemoteObject.concat(RemoteObject.createImmutable("MaxDama: "),parent.mostCurrent._accuweathercronjobservice._maxdama /*RemoteObject*/ ),0);
 BA.debugLineNum = 560;BA.debugLine="Log(LastException)";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","42359348",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",homeact.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;
;
 BA.debugLineNum = 563;BA.debugLine="Try";
Debug.ShouldStop(262144);

case 75:
//try
this.state = 92;
this.catchState = 0;
this.catchState = 91;
this.state = 77;
if (true) break;

case 77:
//C
this.state = 78;
this.catchState = 91;
 BA.debugLineNum = 564;BA.debugLine="If Not(File.Exists(SaeloZahra.Dir,\"NightIcon\"))";
Debug.ShouldStop(524288);
if (true) break;

case 78:
//if
this.state = 83;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("NightIcon"))))).<Boolean>get().booleanValue()) { 
this.state = 80;
;}if (true) break;

case 80:
//C
this.state = 83;
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(parent.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(BA.ObjectToString("NightIcon")),(Object)(BA.NumberToString(1)));
if (true) break;

case 83:
//C
this.state = 84;
;
 BA.debugLineNum = 565;BA.debugLine="If accuWeatherCronJobService.NightIcon<1 Then ac";
Debug.ShouldStop(1048576);
if (true) break;

case 84:
//if
this.state = 89;
if (RemoteObject.solveBoolean("<",parent.mostCurrent._accuweathercronjobservice._nighticon /*RemoteObject*/ ,BA.numberCast(double.class, 1))) { 
this.state = 86;
;}if (true) break;

case 86:
//C
this.state = 89;
parent.mostCurrent._accuweathercronjobservice._nighticon /*RemoteObject*/  = BA.numberCast(int.class, parent.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(parent.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("NightIcon"))));
if (true) break;

case 89:
//C
this.state = 92;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 91:
//C
this.state = 92;
this.catchState = 0;
 BA.debugLineNum = 567;BA.debugLine="Log(\"NightIcon: \"&accuWeatherCronJobService.Nigh";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","42359355",RemoteObject.concat(RemoteObject.createImmutable("NightIcon: "),parent.mostCurrent._accuweathercronjobservice._nighticon /*RemoteObject*/ ),0);
 BA.debugLineNum = 568;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","42359356",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",homeact.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;
;
 BA.debugLineNum = 572;BA.debugLine="Try";
Debug.ShouldStop(134217728);

case 92:
//try
this.state = 109;
this.catchState = 0;
this.catchState = 108;
this.state = 94;
if (true) break;

case 94:
//C
this.state = 95;
this.catchState = 108;
 BA.debugLineNum = 573;BA.debugLine="If Not(File.Exists(SaeloZahra.Dir,\"DayIcon\")) Th";
Debug.ShouldStop(268435456);
if (true) break;

case 95:
//if
this.state = 100;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("DayIcon"))))).<Boolean>get().booleanValue()) { 
this.state = 97;
;}if (true) break;

case 97:
//C
this.state = 100;
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(parent.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(BA.ObjectToString("DayIcon")),(Object)(BA.NumberToString(1)));
if (true) break;

case 100:
//C
this.state = 101;
;
 BA.debugLineNum = 574;BA.debugLine="If accuWeatherCronJobService.DayIcon<1 Then accu";
Debug.ShouldStop(536870912);
if (true) break;

case 101:
//if
this.state = 106;
if (RemoteObject.solveBoolean("<",parent.mostCurrent._accuweathercronjobservice._dayicon /*RemoteObject*/ ,BA.numberCast(double.class, 1))) { 
this.state = 103;
;}if (true) break;

case 103:
//C
this.state = 106;
parent.mostCurrent._accuweathercronjobservice._dayicon /*RemoteObject*/  = BA.numberCast(int.class, parent.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(parent.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("DayIcon"))));
if (true) break;

case 106:
//C
this.state = 109;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 108:
//C
this.state = 109;
this.catchState = 0;
 BA.debugLineNum = 576;BA.debugLine="Log(\"DayIcon: \"&accuWeatherCronJobService.DayIco";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","42359364",RemoteObject.concat(RemoteObject.createImmutable("DayIcon: "),parent.mostCurrent._accuweathercronjobservice._dayicon /*RemoteObject*/ ),0);
 BA.debugLineNum = 577;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","42359365",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",homeact.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;
;
 BA.debugLineNum = 581;BA.debugLine="Try";
Debug.ShouldStop(16);

case 109:
//try
this.state = 126;
this.catchState = 0;
this.catchState = 125;
this.state = 111;
if (true) break;

case 111:
//C
this.state = 112;
this.catchState = 125;
 BA.debugLineNum = 582;BA.debugLine="If Not(File.Exists(SaeloZahra.Dir,\"NightShortPhr";
Debug.ShouldStop(32);
if (true) break;

case 112:
//if
this.state = 117;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("NightShortPhrase"))))).<Boolean>get().booleanValue()) { 
this.state = 114;
;}if (true) break;

case 114:
//C
this.state = 117;
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(parent.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(BA.ObjectToString("NightShortPhrase")),(Object)(RemoteObject.createImmutable("")));
if (true) break;

case 117:
//C
this.state = 118;
;
 BA.debugLineNum = 583;BA.debugLine="If accuWeatherCronJobService.NightShortPhrase==\"";
Debug.ShouldStop(64);
if (true) break;

case 118:
//if
this.state = 123;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._accuweathercronjobservice._nightshortphrase /*RemoteObject*/ ,BA.ObjectToString(""))) { 
this.state = 120;
;}if (true) break;

case 120:
//C
this.state = 123;
parent.mostCurrent._accuweathercronjobservice._nightshortphrase /*RemoteObject*/  = parent.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(parent.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("NightShortPhrase")));
if (true) break;

case 123:
//C
this.state = 126;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 125:
//C
this.state = 126;
this.catchState = 0;
 BA.debugLineNum = 585;BA.debugLine="Log(\"NightShortPhrase: \"&accuWeatherCronJobServi";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","42359373",RemoteObject.concat(RemoteObject.createImmutable("NightShortPhrase: "),parent.mostCurrent._accuweathercronjobservice._nightshortphrase /*RemoteObject*/ ),0);
 BA.debugLineNum = 586;BA.debugLine="Log(LastException)";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","42359374",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",homeact.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;
;
 BA.debugLineNum = 590;BA.debugLine="Try";
Debug.ShouldStop(8192);

case 126:
//try
this.state = 143;
this.catchState = 0;
this.catchState = 142;
this.state = 128;
if (true) break;

case 128:
//C
this.state = 129;
this.catchState = 142;
 BA.debugLineNum = 591;BA.debugLine="If Not(File.Exists(SaeloZahra.Dir,\"DayShortPhras";
Debug.ShouldStop(16384);
if (true) break;

case 129:
//if
this.state = 134;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("DayShortPhrase"))))).<Boolean>get().booleanValue()) { 
this.state = 131;
;}if (true) break;

case 131:
//C
this.state = 134;
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(parent.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(BA.ObjectToString("DayShortPhrase")),(Object)(RemoteObject.createImmutable("")));
if (true) break;

case 134:
//C
this.state = 135;
;
 BA.debugLineNum = 592;BA.debugLine="If accuWeatherCronJobService.DayShortPhrase==\"\"";
Debug.ShouldStop(32768);
if (true) break;

case 135:
//if
this.state = 140;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._accuweathercronjobservice._dayshortphrase /*RemoteObject*/ ,BA.ObjectToString(""))) { 
this.state = 137;
;}if (true) break;

case 137:
//C
this.state = 140;
parent.mostCurrent._accuweathercronjobservice._dayshortphrase /*RemoteObject*/  = parent.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(parent.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("DayShortPhrase")));
if (true) break;

case 140:
//C
this.state = 143;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 142:
//C
this.state = 143;
this.catchState = 0;
 BA.debugLineNum = 594;BA.debugLine="Log(\"DayShortPhrase: \"&accuWeatherCronJobService";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","42359382",RemoteObject.concat(RemoteObject.createImmutable("DayShortPhrase: "),parent.mostCurrent._accuweathercronjobservice._dayshortphrase /*RemoteObject*/ ),0);
 BA.debugLineNum = 595;BA.debugLine="Log(LastException)";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","42359383",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",homeact.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;
;
 BA.debugLineNum = 598;BA.debugLine="Try";
Debug.ShouldStop(2097152);

case 143:
//try
this.state = 160;
this.catchState = 0;
this.catchState = 159;
this.state = 145;
if (true) break;

case 145:
//C
this.state = 146;
this.catchState = 159;
 BA.debugLineNum = 599;BA.debugLine="If Not(File.Exists(SaeloZahra.Dir,\"NowWind\")) Th";
Debug.ShouldStop(4194304);
if (true) break;

case 146:
//if
this.state = 151;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("NowWind"))))).<Boolean>get().booleanValue()) { 
this.state = 148;
;}if (true) break;

case 148:
//C
this.state = 151;
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(parent.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(BA.ObjectToString("NowWind")),(Object)(RemoteObject.createImmutable("")));
if (true) break;

case 151:
//C
this.state = 152;
;
 BA.debugLineNum = 600;BA.debugLine="If NowWind==\"\" Then NowWind = File.ReadString(Sa";
Debug.ShouldStop(8388608);
if (true) break;

case 152:
//if
this.state = 157;
if (RemoteObject.solveBoolean("=",parent._nowwind,BA.ObjectToString(""))) { 
this.state = 154;
;}if (true) break;

case 154:
//C
this.state = 157;
parent._nowwind = parent.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(parent.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("NowWind")));
if (true) break;

case 157:
//C
this.state = 160;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 159:
//C
this.state = 160;
this.catchState = 0;
 BA.debugLineNum = 602;BA.debugLine="Log(\"NowWind: \"&NowWind)";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","42359390",RemoteObject.concat(RemoteObject.createImmutable("NowWind: "),parent._nowwind),0);
 BA.debugLineNum = 603;BA.debugLine="Log(LastException)";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","42359391",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",homeact.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;
;
 BA.debugLineNum = 606;BA.debugLine="Try";
Debug.ShouldStop(536870912);

case 160:
//try
this.state = 177;
this.catchState = 0;
this.catchState = 176;
this.state = 162;
if (true) break;

case 162:
//C
this.state = 163;
this.catchState = 176;
 BA.debugLineNum = 607;BA.debugLine="If Not(File.Exists(SaeloZahra.Dir,\"DayRainProbab";
Debug.ShouldStop(1073741824);
if (true) break;

case 163:
//if
this.state = 168;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("DayRainProbability"))))).<Boolean>get().booleanValue()) { 
this.state = 165;
;}if (true) break;

case 165:
//C
this.state = 168;
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(parent.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(BA.ObjectToString("DayRainProbability")),(Object)(RemoteObject.createImmutable("0")));
if (true) break;

case 168:
//C
this.state = 169;
;
 BA.debugLineNum = 608;BA.debugLine="If accuWeatherCronJobService.DayRainProbability=";
Debug.ShouldStop(-2147483648);
if (true) break;

case 169:
//if
this.state = 174;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._accuweathercronjobservice._dayrainprobability /*RemoteObject*/ ,BA.numberCast(double.class, 0))) { 
this.state = 171;
;}if (true) break;

case 171:
//C
this.state = 174;
parent.mostCurrent._accuweathercronjobservice._dayrainprobability /*RemoteObject*/  = BA.numberCast(int.class, parent.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(parent.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("DayRainProbability"))));
if (true) break;

case 174:
//C
this.state = 177;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 176:
//C
this.state = 177;
this.catchState = 0;
 BA.debugLineNum = 610;BA.debugLine="Log(\"DayRainProbability: \"&accuWeatherCronJobSer";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","42359398",RemoteObject.concat(RemoteObject.createImmutable("DayRainProbability: "),parent.mostCurrent._accuweathercronjobservice._dayrainprobability /*RemoteObject*/ ),0);
 BA.debugLineNum = 611;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","42359399",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",homeact.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;
;
 BA.debugLineNum = 614;BA.debugLine="Try";
Debug.ShouldStop(32);

case 177:
//try
this.state = 194;
this.catchState = 0;
this.catchState = 193;
this.state = 179;
if (true) break;

case 179:
//C
this.state = 180;
this.catchState = 193;
 BA.debugLineNum = 615;BA.debugLine="If Not(File.Exists(SaeloZahra.Dir,\"RelativeHumid";
Debug.ShouldStop(64);
if (true) break;

case 180:
//if
this.state = 185;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("RelativeHumidity"))))).<Boolean>get().booleanValue()) { 
this.state = 182;
;}if (true) break;

case 182:
//C
this.state = 185;
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(parent.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(BA.ObjectToString("RelativeHumidity")),(Object)(RemoteObject.createImmutable("")));
if (true) break;

case 185:
//C
this.state = 186;
;
 BA.debugLineNum = 616;BA.debugLine="If RelativeHumidity==\"\" Then RelativeHumidity =";
Debug.ShouldStop(128);
if (true) break;

case 186:
//if
this.state = 191;
if (RemoteObject.solveBoolean("=",parent._relativehumidity,BA.ObjectToString(""))) { 
this.state = 188;
;}if (true) break;

case 188:
//C
this.state = 191;
parent._relativehumidity = parent.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(parent.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("RelativeHumidity")));
if (true) break;

case 191:
//C
this.state = 194;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 193:
//C
this.state = 194;
this.catchState = 0;
 BA.debugLineNum = 618;BA.debugLine="Log(\"RelativeHumidity: \"&RelativeHumidity)";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","42359406",RemoteObject.concat(RemoteObject.createImmutable("RelativeHumidity: "),parent._relativehumidity),0);
 BA.debugLineNum = 619;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","42359407",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",homeact.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 194:
//C
this.state = 195;
this.catchState = 0;
;
 BA.debugLineNum = 622;BA.debugLine="buildWeatherHtml";
Debug.ShouldStop(8192);
_buildweatherhtml();
 BA.debugLineNum = 624;BA.debugLine="If Not(SaeloZahra.RayganHast) Then";
Debug.ShouldStop(32768);
if (true) break;

case 195:
//if
this.state = 210;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._saelozahra._rayganhast /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 197;
}if (true) break;

case 197:
//C
this.state = 198;
 BA.debugLineNum = 625;BA.debugLine="If File.Exists(SaeloZahra.dir,\"usrnm\") And File.";
Debug.ShouldStop(65536);
if (true) break;

case 198:
//if
this.state = 209;
if (RemoteObject.solveBoolean(".",parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("usrnm")))) && RemoteObject.solveBoolean("=",parent.mostCurrent.__c.getField(false,"File").runMethod(false,"ReadMap",(Object)(parent.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("user.dat"))).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("pay_type")))),RemoteObject.createImmutable(("vas")))) { 
this.state = 200;
}else {
this.state = 208;
}if (true) break;

case 200:
//C
this.state = 201;
 BA.debugLineNum = 626;BA.debugLine="If Not(File.Exists(SaeloZahra.dir,\"NotNeedUserP";
Debug.ShouldStop(131072);
if (true) break;

case 201:
//if
this.state = 206;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("NotNeedUserPass"))))).<Boolean>get().booleanValue()) { 
this.state = 203;
}else {
this.state = 205;
}if (true) break;

case 203:
//C
this.state = 206;
 if (true) break;

case 205:
//C
this.state = 206;
 BA.debugLineNum = 635;BA.debugLine="Log(\"Niaz Be Pass Nist\")";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","42359423",RemoteObject.createImmutable("Niaz Be Pass Nist"),0);
 if (true) break;

case 206:
//C
this.state = 209;
;
 if (true) break;

case 208:
//C
this.state = 209;
 BA.debugLineNum = 638;BA.debugLine="Log(\"VAS Nist\")";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","42359426",RemoteObject.createImmutable("VAS Nist"),0);
 if (true) break;

case 209:
//C
this.state = 210;
;
 if (true) break;

case 210:
//C
this.state = -1;
;
 BA.debugLineNum = 642;BA.debugLine="End Sub";
Debug.ShouldStop(2);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",homeact.processBA, e0.toString());}
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
public static RemoteObject  _amir_onitemselected(RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("Amir_onItemSelected (homeact) ","homeact",3,homeact.mostCurrent.activityBA,homeact.mostCurrent,1339);
if (RapidSub.canDelegate("amir_onitemselected")) { return ir.saelozahra.damaara.mazraeyeman.homeact.remoteMe.runUserSub(false, "homeact","amir_onitemselected", _position);}
Debug.locals.put("Position", _position);
 BA.debugLineNum = 1339;BA.debugLine="Private Sub Amir_onItemSelected (Position As Int)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 1340;BA.debugLine="Log(\"onItemSelected : \"&Position)";
Debug.ShouldStop(134217728);
homeact.mostCurrent.__c.runVoidMethod ("LogImpl","43407873",RemoteObject.concat(RemoteObject.createImmutable("onItemSelected : "),_position),0);
 BA.debugLineNum = 1341;BA.debugLine="VP.CurrentPage = Position";
Debug.ShouldStop(268435456);
homeact.mostCurrent._vp.runMethod(true,"setCurrentPage",_position);
 BA.debugLineNum = 1342;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _bazarchewv_overrideurl(RemoteObject _url) throws Exception{
try {
		Debug.PushSubsStack("BazarcheWV_OverrideUrl (homeact) ","homeact",3,homeact.mostCurrent.activityBA,homeact.mostCurrent,1696);
if (RapidSub.canDelegate("bazarchewv_overrideurl")) { return ir.saelozahra.damaara.mazraeyeman.homeact.remoteMe.runUserSub(false, "homeact","bazarchewv_overrideurl", _url);}
Debug.locals.put("Url", _url);
 BA.debugLineNum = 1696;BA.debugLine="Sub BazarcheWV_OverrideUrl (Url As String) As Bool";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 1698;BA.debugLine="If MultiMediaWv.Tag <> \"salam\" Then ProgressDialo";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("!",homeact.mostCurrent._multimediawv.runMethod(false,"getTag"),RemoteObject.createImmutable(("salam")))) { 
homeact.mostCurrent.__c.runVoidMethod ("ProgressDialogShow2",homeact.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(homeact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("در حال بارگزاری رسانه ها"))).getObject())),(Object)(homeact.mostCurrent.__c.getField(true,"True")));};
 BA.debugLineNum = 1699;BA.debugLine="MultiMediaWv.Tag = \"bia\"";
Debug.ShouldStop(4);
homeact.mostCurrent._multimediawv.runMethod(false,"setTag",RemoteObject.createImmutable(("bia")));
 BA.debugLineNum = 1700;BA.debugLine="Log(Url)";
Debug.ShouldStop(8);
homeact.mostCurrent.__c.runVoidMethod ("LogImpl","43932164",_url,0);
 BA.debugLineNum = 1701;BA.debugLine="If Url.Contains(\"http://cat_id:\") Then";
Debug.ShouldStop(16);
if (_url.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("http://cat_id:"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1702;BA.debugLine="ToastMessageShow( Url.Replace(\"http://cat_id:\",\"";
Debug.ShouldStop(32);
homeact.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(_url.runMethod(true,"replace",(Object)(BA.ObjectToString("http://cat_id:")),(Object)(RemoteObject.createImmutable(""))).runMethod(true,"replace",(Object)(BA.ObjectToString("/")),(Object)(RemoteObject.createImmutable(""))))),(Object)(homeact.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 1703;BA.debugLine="Return True";
Debug.ShouldStop(64);
if (true) return homeact.mostCurrent.__c.getField(true,"True");
 }else 
{ BA.debugLineNum = 1704;BA.debugLine="else If Url.Contains(\"http://bazarche:\") Then";
Debug.ShouldStop(128);
if (_url.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("http://bazarche:"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1705;BA.debugLine="ProgressDialogShow(SaeloZahra.CSB(\"در حال بارگزا";
Debug.ShouldStop(256);
homeact.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",homeact.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(homeact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("در حال بارگزاری"))).getObject())));
 BA.debugLineNum = 1706;BA.debugLine="Log(SaeloZahra.json_url&\"productfarmers_list.php";
Debug.ShouldStop(512);
homeact.mostCurrent.__c.runVoidMethod ("LogImpl","43932170",RemoteObject.concat(homeact.mostCurrent._saelozahra._json_url /*RemoteObject*/ ,RemoteObject.createImmutable("productfarmers_list.php?search=yes&field=db_product_farmers.id&s="),_url.runMethod(true,"replace",(Object)(BA.ObjectToString("http://bazarche:")),(Object)(RemoteObject.createImmutable(""))).runMethod(true,"replace",(Object)(BA.ObjectToString("/")),(Object)(RemoteObject.createImmutable("")))),0);
 BA.debugLineNum = 1707;BA.debugLine="jobSingleBazarche.Download(SaeloZahra.json_url&\"";
Debug.ShouldStop(1024);
homeact.mostCurrent._jobsinglebazarche.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.concat(homeact.mostCurrent._saelozahra._json_url /*RemoteObject*/ ,RemoteObject.createImmutable("productfarmers_list.php?search=yes&field=db_product_farmers.id&s="),_url.runMethod(true,"replace",(Object)(BA.ObjectToString("http://bazarche:")),(Object)(RemoteObject.createImmutable(""))).runMethod(true,"replace",(Object)(BA.ObjectToString("/")),(Object)(RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 1708;BA.debugLine="Return True";
Debug.ShouldStop(2048);
if (true) return homeact.mostCurrent.__c.getField(true,"True");
 }else 
{ BA.debugLineNum = 1709;BA.debugLine="else If Url.Contains(\"http://singleid:\") Then";
Debug.ShouldStop(4096);
if (_url.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("http://singleid:"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1710;BA.debugLine="Log(SaeloZahra.site_url&\"?p=\"&Url.Replace(\"http:";
Debug.ShouldStop(8192);
homeact.mostCurrent.__c.runVoidMethod ("LogImpl","43932174",RemoteObject.concat(homeact.mostCurrent._saelozahra._site_url /*RemoteObject*/ ,RemoteObject.createImmutable("?p="),_url.runMethod(true,"replace",(Object)(BA.ObjectToString("http://singleid:")),(Object)(RemoteObject.createImmutable(""))).runMethod(true,"replace",(Object)(BA.ObjectToString("/")),(Object)(RemoteObject.createImmutable("")))),0);
 BA.debugLineNum = 1711;BA.debugLine="customBrowser.CreateNewTab(SaeloZahra.site_url&\"";
Debug.ShouldStop(16384);
homeact.mostCurrent._custombrowser.runVoidMethod ("CreateNewTab",(Object)(RemoteObject.concat(homeact.mostCurrent._saelozahra._site_url /*RemoteObject*/ ,RemoteObject.createImmutable("?p="),_url.runMethod(true,"replace",(Object)(BA.ObjectToString("http://singleid:")),(Object)(RemoteObject.createImmutable(""))).runMethod(true,"replace",(Object)(BA.ObjectToString("/")),(Object)(RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 1712;BA.debugLine="Return True";
Debug.ShouldStop(32768);
if (true) return homeact.mostCurrent.__c.getField(true,"True");
 }else {
 BA.debugLineNum = 1714;BA.debugLine="Return False";
Debug.ShouldStop(131072);
if (true) return homeact.mostCurrent.__c.getField(true,"False");
 }}}
;
 BA.debugLineNum = 1716;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _bazarchewv_pagefinished(RemoteObject _url) throws Exception{
try {
		Debug.PushSubsStack("BazarcheWV_PageFinished (homeact) ","homeact",3,homeact.mostCurrent.activityBA,homeact.mostCurrent,1719);
if (RapidSub.canDelegate("bazarchewv_pagefinished")) { return ir.saelozahra.damaara.mazraeyeman.homeact.remoteMe.runUserSub(false, "homeact","bazarchewv_pagefinished", _url);}
Debug.locals.put("Url", _url);
 BA.debugLineNum = 1719;BA.debugLine="Sub BazarcheWV_PageFinished (Url As String)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 1720;BA.debugLine="Try";
Debug.ShouldStop(8388608);
try { BA.debugLineNum = 1721;BA.debugLine="If SwipeBazarche.IsInitialized Then SwipeBazarch";
Debug.ShouldStop(16777216);
if (homeact.mostCurrent._swipebazarche.runMethod(true,"IsInitialized" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
homeact.mostCurrent._swipebazarche.runClassMethod (ir.saelozahra.damaara.mazraeyeman.wvswipe.class, "_refreshcompleted" /*RemoteObject*/ );};
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e4) {
			BA.rdebugUtils.runVoidMethod("setLastException",homeact.processBA, e4.toString()); BA.debugLineNum = 1723;BA.debugLine="Log(\"4444444444444444444\")";
Debug.ShouldStop(67108864);
homeact.mostCurrent.__c.runVoidMethod ("LogImpl","43997700",RemoteObject.createImmutable("4444444444444444444"),0);
 BA.debugLineNum = 1724;BA.debugLine="Log(LastException)";
Debug.ShouldStop(134217728);
homeact.mostCurrent.__c.runVoidMethod ("LogImpl","43997701",BA.ObjectToString(homeact.mostCurrent.__c.runMethod(false,"LastException",homeact.mostCurrent.activityBA)),0);
 };
 BA.debugLineNum = 1726;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(536870912);
homeact.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 1727;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildweatherhtml() throws Exception{
try {
		Debug.PushSubsStack("buildWeatherHtml (homeact) ","homeact",3,homeact.mostCurrent.activityBA,homeact.mostCurrent,1370);
if (RapidSub.canDelegate("buildweatherhtml")) { return ir.saelozahra.damaara.mazraeyeman.homeact.remoteMe.runUserSub(false, "homeact","buildweatherhtml");}
RemoteObject _night = RemoteObject.createImmutable(false);
RemoteObject _css = RemoteObject.createImmutable("");
RemoteObject _mianginedamaint = RemoteObject.createImmutable(0);
RemoteObject _tarikhesh = RemoteObject.createImmutable("");
RemoteObject _shahresh = RemoteObject.createImmutable("");
RemoteObject _topdama = RemoteObject.createImmutable("");
RemoteObject _damasanj = RemoteObject.createImmutable("");
RemoteObject _aksevaziat = RemoteObject.createImmutable("");
RemoteObject _topdamamiangin = RemoteObject.createImmutable("");
RemoteObject _topbox = RemoteObject.createImmutable("");
RemoteObject _bottomrows = RemoteObject.createImmutable("");
RemoteObject _bottombox = RemoteObject.createImmutable("");
RemoteObject _joziatebishtar = RemoteObject.createImmutable("");
RemoteObject _html = RemoteObject.createImmutable("");
 BA.debugLineNum = 1370;BA.debugLine="Sub buildWeatherHtml As String";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 1371;BA.debugLine="Try";
Debug.ShouldStop(67108864);
try { BA.debugLineNum = 1373;BA.debugLine="Dim Night As Boolean = False";
Debug.ShouldStop(268435456);
_night = homeact.mostCurrent.__c.getField(true,"False");Debug.locals.put("Night", _night);Debug.locals.put("Night", _night);
 BA.debugLineNum = 1374;BA.debugLine="Select DateTime.GetHour(DateTime.Now)";
Debug.ShouldStop(536870912);
switch (BA.switchObjectToInt(homeact.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"GetHour",(Object)(homeact.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"))),BA.numberCast(int.class, 17),BA.numberCast(int.class, 18),BA.numberCast(int.class, 19),BA.numberCast(int.class, 20),BA.numberCast(int.class, 21),BA.numberCast(int.class, 22),BA.numberCast(int.class, 23),BA.numberCast(int.class, 0),BA.numberCast(int.class, 1),BA.numberCast(int.class, 2),BA.numberCast(int.class, 3),BA.numberCast(int.class, 4),BA.numberCast(int.class, 5),BA.numberCast(int.class, 6),BA.numberCast(int.class, 7),BA.numberCast(int.class, 8),BA.numberCast(int.class, 9),BA.numberCast(int.class, 10),BA.numberCast(int.class, 11),BA.numberCast(int.class, 12),BA.numberCast(int.class, 13),BA.numberCast(int.class, 14),BA.numberCast(int.class, 15),BA.numberCast(int.class, 16),BA.numberCast(int.class, 17))) {
case 0: 
case 1: 
case 2: 
case 3: 
case 4: 
case 5: 
case 6: 
case 7: 
case 8: 
case 9: 
case 10: 
case 11: 
case 12: {
 BA.debugLineNum = 1376;BA.debugLine="Night=True";
Debug.ShouldStop(-2147483648);
_night = homeact.mostCurrent.__c.getField(true,"True");Debug.locals.put("Night", _night);
 break; }
case 13: 
case 14: 
case 15: 
case 16: 
case 17: 
case 18: 
case 19: 
case 20: 
case 21: 
case 22: 
case 23: 
case 24: {
 BA.debugLineNum = 1378;BA.debugLine="Night=False";
Debug.ShouldStop(2);
_night = homeact.mostCurrent.__c.getField(true,"False");Debug.locals.put("Night", _night);
 break; }
}
;
 BA.debugLineNum = 1382;BA.debugLine="Dim CSS As String = \"<style>\"& _ 		\"@import 'htt";
Debug.ShouldStop(32);
_css = RemoteObject.concat(RemoteObject.createImmutable("<style>"),RemoteObject.createImmutable("@import 'https://cdn.jsdelivr.net/gh/rastikerdar/samim-font@v4.0.5/dist/font-face.css';"),RemoteObject.createImmutable("*,body,html{font-family:'Samim';margin:auto;direction:rtl;}"),RemoteObject.createImmutable(" body{background-size:cover;position:relative;} "),RemoteObject.createImmutable(" .topbox{position:absolute;left:0;top:0;width:100%;height:50%;} "),RemoteObject.createImmutable(" .bottombox{position:absolute;left:0;bottom:5%;width:100%;height:45%;padding-top:4%;border-top:1px solid rgba(1,1,1,0.1)} "),RemoteObject.createImmutable(" .row,.col1{width:100%;float:right; height:auto;} "),RemoteObject.createImmutable(" .col4{width:25%;float:right;position:relative;font-size:90%;} "),RemoteObject.createImmutable(" .whitespace{float:right;white-space: nowrap;text-overflow: ellipsis;overflow: hidden;font-size:88%;text-align:center;} "),RemoteObject.createImmutable(" .adadeshe{width:100%; white-space: nowrap; text-overflow: ellipsis; overflow: hidden; font-size:90%; text-align:center; position:absolute; top:30px;} "),RemoteObject.createImmutable(" .topDama{direction:rtl; width:45px;min-height:100px; font-size:100%; color:white; text-align:center; float:right; background-image:url('file:///android_asset/topdama.png'); background-size:cover; border-radius:10px; position:relative; margin-right:12px; } "),RemoteObject.createImmutable(" .balayish_topdama{line-height:2; padding-top:5px; width:100%;height:50%; position:absolute; top:0% ; right:0;} "),RemoteObject.createImmutable(" .payinish_topdama{line-height:2; padding-top:8px; width:100%;height:50%; position:absolute; top:50%; right:0;} "),RemoteObject.createImmutable(" .bottombox .col4 img{transform: scale(4.5);} "),RemoteObject.createImmutable(" .topDamaMiangin{float:left; width:162px; text-align:center; margin-top:-10px; } "),RemoteObject.createImmutable(" .balayish_topdamaMiangin{ font-size:250%; font-weight: bold; } "),RemoteObject.createImmutable(" .JoziateBishtar{ text-align:center; color:ccc; bottom:0px; left:0; width:100%;position:absolute; font-size:90%; } "),RemoteObject.createImmutable(" .likeBtn{ display:inline-block;border-radius:8px; color:white;padding:2px 10px;margin:3px 14px;font-size:80%;background: #aac1c9; /* Old browsers */background: -moz-linear-gradient(-45deg,  #aac1c9 0%, #94a8af 100%); /* FF3.6-15 */background: -webkit-linear-gradient(-45deg,  #aac1c9 0%,#94a8af 100%); /* Chrome10-25,Safari5.1-6 */background: linear-gradient(135deg,  #aac1c9 0%,#94a8af 100%); /* W3C, IE10+, FF16+, Chrome26+, Opera12+, Safari7+ */filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#aac1c9', endColorstr='#94a8af',GradientType=1 );}</style>"));Debug.locals.put("CSS", _css);Debug.locals.put("CSS", _css);
 BA.debugLineNum = 1402;BA.debugLine="Next12HFaghatDama.Sort(True)";
Debug.ShouldStop(33554432);
homeact._next12hfaghatdama.runVoidMethod ("Sort",(Object)(homeact.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 1405;BA.debugLine="Dim miangineDamaInt As Int = (accuWeatherCronJob";
Debug.ShouldStop(268435456);
_mianginedamaint = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {homeact.mostCurrent._accuweathercronjobservice._mindama /*RemoteObject*/ ,homeact.mostCurrent._accuweathercronjobservice._maxdama /*RemoteObject*/ }, "+",1, 1)),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("miangineDamaInt", _mianginedamaint);Debug.locals.put("miangineDamaInt", _mianginedamaint);
 BA.debugLineNum = 1407;BA.debugLine="Dim tarikhesh As String = \"<div class='likeBtn'";
Debug.ShouldStop(1073741824);
_tarikhesh = RemoteObject.concat(RemoteObject.createImmutable("<div class='likeBtn' style='float:right;'>"),homeact.mostCurrent._saelozahra.runMethod(true,"_tarikhekhafan" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)(homeact.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"))),RemoteObject.createImmutable("</div>"));Debug.locals.put("tarikhesh", _tarikhesh);Debug.locals.put("tarikhesh", _tarikhesh);
 BA.debugLineNum = 1408;BA.debugLine="Dim shahresh As String = \"<div class='likeBtn' s";
Debug.ShouldStop(-2147483648);
_shahresh = RemoteObject.concat(RemoteObject.createImmutable("<div class='likeBtn' style='float:left;'>"),homeact.mostCurrent.__c.getField(false,"File").runMethod(false,"ReadMap",(Object)(homeact.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("user.dat"))).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("city")))),RemoteObject.createImmutable("</div>"));Debug.locals.put("shahresh", _shahresh);Debug.locals.put("shahresh", _shahresh);
 BA.debugLineNum = 1410;BA.debugLine="Dim TopDama As String = \"<div class='topDama'><d";
Debug.ShouldStop(2);
_topdama = RemoteObject.concat(RemoteObject.createImmutable("<div class='topDama'><div class='balayish_topdama'>"),homeact.mostCurrent._saelozahra.runMethod(true,"_convertpersian" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)(BA.NumberToString(homeact.mostCurrent._accuweathercronjobservice._maxdama /*RemoteObject*/ ))),RemoteObject.createImmutable("°</div><div class='payinish_topdama'>"),homeact.mostCurrent._saelozahra.runMethod(true,"_convertpersian" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)(BA.NumberToString(homeact.mostCurrent._accuweathercronjobservice._mindama /*RemoteObject*/ ))),RemoteObject.createImmutable("°</div></div>"));Debug.locals.put("TopDama", _topdama);Debug.locals.put("TopDama", _topdama);
 BA.debugLineNum = 1412;BA.debugLine="Dim Damasanj As String   = \"<img style='float:ri";
Debug.ShouldStop(8);
_damasanj = BA.ObjectToString("<img style='float:right;max-width:40px;max-height:180px; margin-top:10px;margin-right:13px;' src='file:///android_asset/home-weather-1.png'>");Debug.locals.put("Damasanj", _damasanj);Debug.locals.put("Damasanj", _damasanj);
 BA.debugLineNum = 1416;BA.debugLine="If Night Then";
Debug.ShouldStop(128);
if (_night.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1417;BA.debugLine="Dim AkseVaziat As String = \"<img style='float:l";
Debug.ShouldStop(256);
_aksevaziat = RemoteObject.concat(RemoteObject.createImmutable("<img style='float:left;max-width:88px;max-height:180px; margin-top:20px; margin-left:10px;' src='file:///android_asset/"),homeact.mostCurrent._accuweathercronjobservice._nighticon /*RemoteObject*/ ,RemoteObject.createImmutable(".png'>"));Debug.locals.put("AkseVaziat", _aksevaziat);Debug.locals.put("AkseVaziat", _aksevaziat);
 }else {
 BA.debugLineNum = 1419;BA.debugLine="Dim AkseVaziat As String = \"<img style='float:l";
Debug.ShouldStop(1024);
_aksevaziat = RemoteObject.concat(RemoteObject.createImmutable("<img style='float:left;max-width:88px;max-height:180px; margin-top:20px; margin-left:10px;' src='file:///android_asset/"),homeact.mostCurrent._accuweathercronjobservice._dayicon /*RemoteObject*/ ,RemoteObject.createImmutable(".png'>"));Debug.locals.put("AkseVaziat", _aksevaziat);Debug.locals.put("AkseVaziat", _aksevaziat);
 };
 BA.debugLineNum = 1422;BA.debugLine="If Night Then";
Debug.ShouldStop(8192);
if (_night.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1423;BA.debugLine="Dim TopDamaMiangin As String = \"<div class='top";
Debug.ShouldStop(16384);
_topdamamiangin = RemoteObject.concat(RemoteObject.createImmutable("<div class='topDamaMiangin' ><div class='balayish_topdamaMiangin row' >"),homeact.mostCurrent._saelozahra.runMethod(true,"_convertpersian" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)(BA.NumberToString(_mianginedamaint))),RemoteObject.createImmutable("°</div><div class='payinish_vaziat whitespace row'>"),homeact.mostCurrent._accuweathercronjobservice._nightshortphrase /*RemoteObject*/ ,RemoteObject.createImmutable("</div></div>"));Debug.locals.put("TopDamaMiangin", _topdamamiangin);Debug.locals.put("TopDamaMiangin", _topdamamiangin);
 }else {
 BA.debugLineNum = 1425;BA.debugLine="Dim TopDamaMiangin As String = \"<div class='top";
Debug.ShouldStop(65536);
_topdamamiangin = RemoteObject.concat(RemoteObject.createImmutable("<div class='topDamaMiangin' ><div class='balayish_topdamaMiangin row' >"),homeact.mostCurrent._saelozahra.runMethod(true,"_convertpersian" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)(BA.NumberToString(_mianginedamaint))),RemoteObject.createImmutable("°</div><div class='payinish_vaziat whitespace row'>"),homeact.mostCurrent._accuweathercronjobservice._dayshortphrase /*RemoteObject*/ ,RemoteObject.createImmutable("</div></div>"));Debug.locals.put("TopDamaMiangin", _topdamamiangin);Debug.locals.put("TopDamaMiangin", _topdamamiangin);
 };
 BA.debugLineNum = 1430;BA.debugLine="Dim TopBox As String 	= \"<div class='topbox'><di";
Debug.ShouldStop(2097152);
_topbox = RemoteObject.concat(RemoteObject.createImmutable("<div class='topbox'><div class='row' style='margin-top:-5px;padding-bottom:5px;'>"),_tarikhesh,_shahresh,RemoteObject.createImmutable("</div><div class='row' style='padding:top:5px;'>"),_topdama,_damasanj,_aksevaziat,_topdamamiangin,RemoteObject.createImmutable(" </div></div>"));Debug.locals.put("TopBox", _topbox);Debug.locals.put("TopBox", _topbox);
 BA.debugLineNum = 1434;BA.debugLine="Dim bottomRows As String = \"<div class='col4' st";
Debug.ShouldStop(33554432);
_bottomrows = RemoteObject.concat(RemoteObject.createImmutable("<div class='col4' style='float:left;'><img class='row' src='"),_finddarsadimage(homeact._nowwind),RemoteObject.createImmutable("'><div class='adadeshe'>"),homeact.mostCurrent._saelozahra.runMethod(true,"_convertpersian" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)(homeact._nowwind)),RemoteObject.createImmutable("</div><div class='row whitespace'>باد</div></div>"));Debug.locals.put("bottomRows", _bottomrows);Debug.locals.put("bottomRows", _bottomrows);
 BA.debugLineNum = 1435;BA.debugLine="bottomRows 	  = bottomRows&\"<div class='col4' st";
Debug.ShouldStop(67108864);
_bottomrows = RemoteObject.concat(_bottomrows,RemoteObject.createImmutable("<div class='col4' style='float:left;'><img class='row' src='"),_finddarsadimage(BA.NumberToString(homeact.mostCurrent._accuweathercronjobservice._dayrainprobability /*RemoteObject*/ )),RemoteObject.createImmutable("'><div class='adadeshe'>"),homeact.mostCurrent._saelozahra.runMethod(true,"_convertpersian" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)(BA.NumberToString(homeact.mostCurrent._accuweathercronjobservice._dayrainprobability /*RemoteObject*/ ))),RemoteObject.createImmutable("%</div><div class='row whitespace'>احتمال بارش</div></div>"));Debug.locals.put("bottomRows", _bottomrows);
 BA.debugLineNum = 1436;BA.debugLine="bottomRows 	  = bottomRows&\"<div class='col4' st";
Debug.ShouldStop(134217728);
_bottomrows = RemoteObject.concat(_bottomrows,RemoteObject.createImmutable("<div class='col4' style='float:left;'><img class='row' src='"),_finddarsadimage(homeact._uvindex),RemoteObject.createImmutable("'><div class='adadeshe'>"),homeact.mostCurrent._saelozahra.runMethod(true,"_convertpersian" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)(homeact._uvindex)),RemoteObject.createImmutable("</div><div class='row whitespace'>UV</div></div>"));Debug.locals.put("bottomRows", _bottomrows);
 BA.debugLineNum = 1437;BA.debugLine="bottomRows 	  = bottomRows&\"<div class='col4' st";
Debug.ShouldStop(268435456);
_bottomrows = RemoteObject.concat(_bottomrows,RemoteObject.createImmutable("<div class='col4' style='float:left;'><img class='row' src='"),_finddarsadimage(homeact._relativehumidity),RemoteObject.createImmutable("'><div class='adadeshe'><b>"),homeact.mostCurrent._saelozahra.runMethod(true,"_convertpersian" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)(homeact._relativehumidity)),RemoteObject.createImmutable("</b><small>%</small></div><div class='row whitespace'>رطوبت</div></div>"));Debug.locals.put("bottomRows", _bottomrows);
 BA.debugLineNum = 1441;BA.debugLine="Dim BottomBox As String = \"<div class='bottombox";
Debug.ShouldStop(1);
_bottombox = RemoteObject.concat(RemoteObject.createImmutable("<div class='bottombox'>"),_bottomrows,RemoteObject.createImmutable("</div>"));Debug.locals.put("BottomBox", _bottombox);Debug.locals.put("BottomBox", _bottombox);
 BA.debugLineNum = 1443;BA.debugLine="Dim JoziateBishtar As String = \"<div class='Jozi";
Debug.ShouldStop(4);
_joziatebishtar = BA.ObjectToString("<div class='JoziateBishtar'  >جزئیات بیـــــشتر</div>");Debug.locals.put("JoziateBishtar", _joziatebishtar);Debug.locals.put("JoziateBishtar", _joziatebishtar);
 BA.debugLineNum = 1445;BA.debugLine="Dim Html As String = CSS&\"<html style='overflow:";
Debug.ShouldStop(16);
_html = RemoteObject.concat(_css,RemoteObject.createImmutable("<html style='overflow:hidden;'><body style='overflow:hidden;' >"),_topbox,_bottombox,_joziatebishtar,RemoteObject.createImmutable("</body></html>"));Debug.locals.put("Html", _html);Debug.locals.put("Html", _html);
 BA.debugLineNum = 1447;BA.debugLine="Return Html";
Debug.ShouldStop(64);
Debug.CheckDeviceExceptions();if (true) return _html;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e36) {
			BA.rdebugUtils.runVoidMethod("setLastException",homeact.processBA, e36.toString()); BA.debugLineNum = 1449;BA.debugLine="Return \"خطا در دریافت اطلاعات\"";
Debug.ShouldStop(256);
if (true) return BA.ObjectToString("خطا در دریافت اطلاعات");
 BA.debugLineNum = 1450;BA.debugLine="Log(LastException)";
Debug.ShouldStop(512);
homeact.mostCurrent.__c.runVoidMethod ("LogImpl","43539024",BA.ObjectToString(homeact.mostCurrent.__c.runMethod(false,"LastException",homeact.mostCurrent.activityBA)),0);
 };
 BA.debugLineNum = 1453;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkinstallationrequirements() throws Exception{
try {
		Debug.PushSubsStack("CheckInstallationRequirements (homeact) ","homeact",3,homeact.mostCurrent.activityBA,homeact.mostCurrent,857);
if (RapidSub.canDelegate("checkinstallationrequirements")) { return ir.saelozahra.damaara.mazraeyeman.homeact.remoteMe.runUserSub(false, "homeact","checkinstallationrequirements");}
ResumableSub_CheckInstallationRequirements rsub = new ResumableSub_CheckInstallationRequirements(null);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CheckInstallationRequirements extends BA.ResumableSub {
public ResumableSub_CheckInstallationRequirements(ir.saelozahra.damaara.mazraeyeman.homeact parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.saelozahra.damaara.mazraeyeman.homeact parent;
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _in = RemoteObject.declareNull("anywheresoftware.b4a.objects.IntentWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CheckInstallationRequirements (homeact) ","homeact",3,homeact.mostCurrent.activityBA,homeact.mostCurrent,857);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
 BA.debugLineNum = 858;BA.debugLine="If File.ExternalWritable = False Then";
Debug.ShouldStop(33554432);
if (true) break;

case 1:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getExternalWritable"),parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 3;
}else 
{ BA.debugLineNum = 861;BA.debugLine="Else If SaeloZahra.P.SdkVersion >= 26 And apkupdt";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("g",parent.mostCurrent._saelozahra._p /*RemoteObject*/ .runMethod(true,"getSdkVersion"),BA.numberCast(double.class, 26)) && RemoteObject.solveBoolean("=",parent.mostCurrent._apkupdt.runClassMethod (ir.saelozahra.damaara.mazraeyeman.cl_appupdate.class, "_canrequestpackageinstalls" /*RemoteObject*/ ),parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 5;
}else 
{ BA.debugLineNum = 869;BA.debugLine="Else If apkupdt.CheckNonMarketAppsEnabled = False";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",parent.mostCurrent._apkupdt.runClassMethod (ir.saelozahra.damaara.mazraeyeman.cl_appupdate.class, "_checknonmarketappsenabled" /*RemoteObject*/ ),parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 7;
}else {
this.state = 9;
}}}
if (true) break;

case 3:
//C
this.state = 10;
 BA.debugLineNum = 859;BA.debugLine="MsgboxAsync(SaeloZahra.CSB(\"مموری موجود نیست، مط";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(parent.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("مموری موجود نیست، مطمئن شوید که دستگاه شما به فلش مموری متصل نیست"))).getObject())),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),homeact.processBA);
 BA.debugLineNum = 860;BA.debugLine="Return False";
Debug.ShouldStop(134217728);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 if (true) break;

case 5:
//C
this.state = 10;
 BA.debugLineNum = 862;BA.debugLine="MsgboxAsync(SaeloZahra.CSB(\"لطفا به من مجوز نصب";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(parent.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("لطفا به من مجوز نصب نرم افزار را بدهید"))).getObject())),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),homeact.processBA);
 BA.debugLineNum = 863;BA.debugLine="Wait For Msgbox_Result(Result As Int)";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", homeact.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "homeact", "checkinstallationrequirements"), null);
this.state = 11;
return;
case 11:
//C
this.state = 10;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 864;BA.debugLine="Dim in As Intent";
Debug.ShouldStop(-2147483648);
_in = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");Debug.locals.put("in", _in);
 BA.debugLineNum = 865;BA.debugLine="in.Initialize(\"android.settings.MANAGE_UNKNOWN_";
Debug.ShouldStop(1);
_in.runVoidMethod ("Initialize",(Object)(BA.ObjectToString("android.settings.MANAGE_UNKNOWN_APP_SOURCES")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("package:"),parent.mostCurrent.__c.getField(false,"Application").runMethod(true,"getPackageName"))));
 BA.debugLineNum = 866;BA.debugLine="StartActivity(in)";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",homeact.processBA,(Object)((_in.getObject())));
 BA.debugLineNum = 867;BA.debugLine="Wait For Activity_Resume '<-- wait for Activity_";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","activity_resume", homeact.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "homeact", "checkinstallationrequirements"), null);
this.state = 12;
return;
case 12:
//C
this.state = 10;
;
 BA.debugLineNum = 868;BA.debugLine="Return apkupdt.CanRequestPackageInstalls";
Debug.ShouldStop(8);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent._apkupdt.runClassMethod (ir.saelozahra.damaara.mazraeyeman.cl_appupdate.class, "_canrequestpackageinstalls" /*RemoteObject*/ )));return;};
 if (true) break;

case 7:
//C
this.state = 10;
 BA.debugLineNum = 870;BA.debugLine="MsgboxAsync(\"لطفا مجوز نصب برنامه را در \" & CRLF";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("لطفا مجوز نصب برنامه را در "),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("تنظیمات (Setting) > امنیتی (Security) > Unknown sources (نصب برنامه از منابع ناشناس)"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("یا "),RemoteObject.createImmutable("Settings > Applications > Unknown sources"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("بدهید")))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),homeact.processBA);
 BA.debugLineNum = 873;BA.debugLine="Return False";
Debug.ShouldStop(256);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 875;BA.debugLine="Return True";
Debug.ShouldStop(1024);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 877;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
public static void  _msgbox_result(RemoteObject _result) throws Exception{
}
public static RemoteObject  _clvmsg_itemclick(RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("ClvMsg_ItemClick (homeact) ","homeact",3,homeact.mostCurrent.activityBA,homeact.mostCurrent,1650);
if (RapidSub.canDelegate("clvmsg_itemclick")) { return ir.saelozahra.damaara.mazraeyeman.homeact.remoteMe.runUserSub(false, "homeact","clvmsg_itemclick", _index, _value);}
RemoteObject _panel_test = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 1650;BA.debugLine="Sub ClvMsg_ItemClick (Index As Int, Value As Objec";
Debug.ShouldStop(131072);
 BA.debugLineNum = 1653;BA.debugLine="If login_act.ItIsPayed Then";
Debug.ShouldStop(1048576);
if (homeact.mostCurrent._login_act._itispayed /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1655;BA.debugLine="Dim panel_test As Panel";
Debug.ShouldStop(4194304);
_panel_test = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("panel_test", _panel_test);
 BA.debugLineNum = 1656;BA.debugLine="panel_test = ClvMsg.GetPanel(Index)";
Debug.ShouldStop(8388608);
_panel_test = homeact.mostCurrent._clvmsg.runClassMethod (ir.saelozahra.damaara.mazraeyeman.customlistview.class, "_getpanel" /*RemoteObject*/ ,(Object)(_index));Debug.locals.put("panel_test", _panel_test);
 BA.debugLineNum = 1658;BA.debugLine="Log(\"Tag is: \"&panel_test.GetView(0).Tag)";
Debug.ShouldStop(33554432);
homeact.mostCurrent.__c.runVoidMethod ("LogImpl","43801096",RemoteObject.concat(RemoteObject.createImmutable("Tag is: "),_panel_test.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"getTag")),0);
 BA.debugLineNum = 1660;BA.debugLine="SH.convertActivityFromTranslucent";
Debug.ShouldStop(134217728);
homeact.mostCurrent._sh.runVoidMethod ("convertActivityFromTranslucent",homeact.mostCurrent.activityBA);
 BA.debugLineNum = 1662;BA.debugLine="StartActivity(NotificationAct)";
Debug.ShouldStop(536870912);
homeact.mostCurrent.__c.runVoidMethod ("StartActivity",homeact.processBA,(Object)((homeact.mostCurrent._notificationact.getObject())));
 }else {
 BA.debugLineNum = 1665;BA.debugLine="ShowPardakhtModal";
Debug.ShouldStop(1);
_showpardakhtmodal();
 };
 BA.debugLineNum = 1667;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _covermsglbl_click() throws Exception{
try {
		Debug.PushSubsStack("CoverMsglbl_Click (homeact) ","homeact",3,homeact.mostCurrent.activityBA,homeact.mostCurrent,1672);
if (RapidSub.canDelegate("covermsglbl_click")) { return ir.saelozahra.damaara.mazraeyeman.homeact.remoteMe.runUserSub(false, "homeact","covermsglbl_click");}
RemoteObject _index = RemoteObject.createImmutable(0);
 BA.debugLineNum = 1672;BA.debugLine="Sub CoverMsglbl_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 1674;BA.debugLine="Dim index As Int";
Debug.ShouldStop(512);
_index = RemoteObject.createImmutable(0);Debug.locals.put("index", _index);
 BA.debugLineNum = 1675;BA.debugLine="index = ClvMsg.GetItemFromView(Sender)";
Debug.ShouldStop(1024);
_index = homeact.mostCurrent._clvmsg.runClassMethod (ir.saelozahra.damaara.mazraeyeman.customlistview.class, "_getitemfromview" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), homeact.mostCurrent.__c.runMethod(false,"Sender",homeact.mostCurrent.activityBA)));Debug.locals.put("index", _index);
 BA.debugLineNum = 1681;BA.debugLine="ClvMsg_ItemClick(index,ClvMsg.GetValue(index))";
Debug.ShouldStop(65536);
_clvmsg_itemclick(_index,homeact.mostCurrent._clvmsg.runClassMethod (ir.saelozahra.damaara.mazraeyeman.customlistview.class, "_getvalue" /*RemoteObject*/ ,(Object)(_index)));
 BA.debugLineNum = 1683;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createlistitemmsg(RemoteObject _id_cli,RemoteObject _title_cli,RemoteObject _content_cli,RemoteObject _typecli,RemoteObject _time_cli,RemoteObject _icon_cli,RemoteObject _color_cli) throws Exception{
try {
		Debug.PushSubsStack("CreateListItemMsg (homeact) ","homeact",3,homeact.mostCurrent.activityBA,homeact.mostCurrent,1523);
if (RapidSub.canDelegate("createlistitemmsg")) { return ir.saelozahra.damaara.mazraeyeman.homeact.remoteMe.runUserSub(false, "homeact","createlistitemmsg", _id_cli, _title_cli, _content_cli, _typecli, _time_cli, _icon_cli, _color_cli);}
RemoteObject _p_view = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _gdr = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.GradientDrawable");
RemoteObject _imgcoverlbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _cdbubble = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _imgcoverbubblelbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _cdlittlebubble = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _imgcoverlittlebubblelbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _image_iv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
RemoteObject _lbl_caption = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _wvtext = RemoteObject.declareNull("anywheresoftware.b4a.objects.WebViewWrapper");
RemoteObject _cd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _timelbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _ss = RemoteObject.declareNull("com.smartstring.arminkh.smartstring");
RemoteObject _border_bottom_lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _covermsglbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("id_cli", _id_cli);
Debug.locals.put("Title_cli", _title_cli);
Debug.locals.put("content_cli", _content_cli);
Debug.locals.put("TypeCli", _typecli);
Debug.locals.put("time_cli", _time_cli);
Debug.locals.put("Icon_cli", _icon_cli);
Debug.locals.put("Color_cli", _color_cli);
 BA.debugLineNum = 1523;BA.debugLine="Sub CreateListItemMsg(id_cli As String,Title_cli A";
Debug.ShouldStop(262144);
 BA.debugLineNum = 1525;BA.debugLine="If Zouj Then Zouj=False Else Zouj = True";
Debug.ShouldStop(1048576);
if (homeact._zouj.<Boolean>get().booleanValue()) { 
homeact._zouj = homeact.mostCurrent.__c.getField(true,"False");}
else {
homeact._zouj = homeact.mostCurrent.__c.getField(true,"True");};
 BA.debugLineNum = 1527;BA.debugLine="Dim p_view As Panel";
Debug.ShouldStop(4194304);
_p_view = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p_view", _p_view);
 BA.debugLineNum = 1528;BA.debugLine="p_view.Initialize(\"\")";
Debug.ShouldStop(8388608);
_p_view.runVoidMethod ("Initialize",homeact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 1530;BA.debugLine="Dim gdr As GradientDrawable";
Debug.ShouldStop(33554432);
_gdr = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.GradientDrawable");Debug.locals.put("gdr", _gdr);
 BA.debugLineNum = 1531;BA.debugLine="gdr.Initialize(\"TR_BL\", Array As Int(Colors.White";
Debug.ShouldStop(67108864);
_gdr.runVoidMethod ("Initialize",(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.drawable.GradientDrawable.Orientation"),"TR_BL")),(Object)(RemoteObject.createNewArray("int",new int[] {2},new Object[] {homeact.mostCurrent.__c.getField(false,"Colors").getField(true,"White"),homeact.mostCurrent.__c.getField(false,"Colors").getField(true,"White")})));
 BA.debugLineNum = 1533;BA.debugLine="If Title_cli == \"وضعیت \"&SaeloZahra.tarikheKhafan";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_title_cli,RemoteObject.concat(RemoteObject.createImmutable("وضعیت "),homeact.mostCurrent._saelozahra.runMethod(true,"_tarikhekhafan" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)(homeact.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")))))) { 
 BA.debugLineNum = 1534;BA.debugLine="gdr.Initialize(\"TR_BL\", Array As Int(SaeloZahra.";
Debug.ShouldStop(536870912);
_gdr.runVoidMethod ("Initialize",(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.drawable.GradientDrawable.Orientation"),"TR_BL")),(Object)(RemoteObject.createNewArray("int",new int[] {2},new Object[] {homeact.mostCurrent._saelozahra._color /*RemoteObject*/ ,homeact.mostCurrent._saelozahra._colorlight /*RemoteObject*/ })));
 };
 BA.debugLineNum = 1538;BA.debugLine="p_view.Background=gdr";
Debug.ShouldStop(2);
_p_view.runMethod(false,"setBackground",(_gdr.getObject()));
 BA.debugLineNum = 1543;BA.debugLine="Dim ImgCoverLbl As Label";
Debug.ShouldStop(64);
_imgcoverlbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("ImgCoverLbl", _imgcoverlbl);
 BA.debugLineNum = 1544;BA.debugLine="ImgCoverLbl.Initialize(\"ImgCoverLbl\")";
Debug.ShouldStop(128);
_imgcoverlbl.runVoidMethod ("Initialize",homeact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("ImgCoverLbl")));
 BA.debugLineNum = 1545;BA.debugLine="If Zouj Then ImgCoverLbl.Color = SaeloZahra.Color";
Debug.ShouldStop(256);
if (homeact._zouj.<Boolean>get().booleanValue()) { 
_imgcoverlbl.runVoidMethod ("setColor",homeact.mostCurrent._saelozahra._color /*RemoteObject*/ );}
else {
_imgcoverlbl.runVoidMethod ("setColor",homeact.mostCurrent._saelozahra._colordark /*RemoteObject*/ );};
 BA.debugLineNum = 1546;BA.debugLine="p_view.AddView( ImgCoverLbl, PanelMsgs.Width-list";
Debug.ShouldStop(512);
_p_view.runVoidMethod ("AddView",(Object)((_imgcoverlbl.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {homeact.mostCurrent._panelmsgs.runMethod(true,"getWidth"),homeact._listitemheightmsg}, "-",1, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(homeact._listitemheightmsg),(Object)(homeact._listitemheightmsg));
 BA.debugLineNum = 1549;BA.debugLine="Dim CdBubble As ColorDrawable";
Debug.ShouldStop(4096);
_cdbubble = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("CdBubble", _cdbubble);
 BA.debugLineNum = 1551;BA.debugLine="Dim ImgCoverBubbleLbl As Label";
Debug.ShouldStop(16384);
_imgcoverbubblelbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("ImgCoverBubbleLbl", _imgcoverbubblelbl);
 BA.debugLineNum = 1552;BA.debugLine="ImgCoverBubbleLbl.Initialize(\"ImgCoverBubbleLbl\")";
Debug.ShouldStop(32768);
_imgcoverbubblelbl.runVoidMethod ("Initialize",homeact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("ImgCoverBubbleLbl")));
 BA.debugLineNum = 1553;BA.debugLine="If Zouj Then CdBubble.Initialize(SaeloZahra.Color";
Debug.ShouldStop(65536);
if (homeact._zouj.<Boolean>get().booleanValue()) { 
_cdbubble.runVoidMethod ("Initialize",(Object)(homeact.mostCurrent._saelozahra._color /*RemoteObject*/ ),(Object)(homeact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 14)))));}
else {
_cdbubble.runVoidMethod ("Initialize",(Object)(homeact.mostCurrent._saelozahra._colordark /*RemoteObject*/ ),(Object)(homeact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 14)))));};
 BA.debugLineNum = 1554;BA.debugLine="ImgCoverBubbleLbl.Color=Color_cli";
Debug.ShouldStop(131072);
_imgcoverbubblelbl.runVoidMethod ("setColor",_color_cli);
 BA.debugLineNum = 1555;BA.debugLine="ImgCoverBubbleLbl.Background=CdBubble";
Debug.ShouldStop(262144);
_imgcoverbubblelbl.runMethod(false,"setBackground",(_cdbubble.getObject()));
 BA.debugLineNum = 1556;BA.debugLine="p_view.AddView( ImgCoverBubbleLbl, PanelMsgs.Widt";
Debug.ShouldStop(524288);
_p_view.runVoidMethod ("AddView",(Object)((_imgcoverbubblelbl.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {homeact.mostCurrent._panelmsgs.runMethod(true,"getWidth"),homeact._listitemheightmsg,homeact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 12)))}, "--",2, 1)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {homeact._listitemheightmsg,RemoteObject.createImmutable(2)}, "/",0, 0)),homeact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 12)))}, "-",1, 0))),(Object)(homeact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 24)))),(Object)(homeact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 24)))));
 BA.debugLineNum = 1559;BA.debugLine="Dim CdLittleBubble As ColorDrawable";
Debug.ShouldStop(4194304);
_cdlittlebubble = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("CdLittleBubble", _cdlittlebubble);
 BA.debugLineNum = 1560;BA.debugLine="CdLittleBubble.Initialize2(Color_cli,10dip,2dip,C";
Debug.ShouldStop(8388608);
_cdlittlebubble.runVoidMethod ("Initialize2",(Object)(_color_cli),(Object)(homeact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(homeact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(homeact.mostCurrent.__c.getField(false,"Colors").getField(true,"White")));
 BA.debugLineNum = 1562;BA.debugLine="Dim ImgCoverLittleBubbleLbl As Label";
Debug.ShouldStop(33554432);
_imgcoverlittlebubblelbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("ImgCoverLittleBubbleLbl", _imgcoverlittlebubblelbl);
 BA.debugLineNum = 1563;BA.debugLine="ImgCoverLittleBubbleLbl.Initialize(\"ImgCoverLittl";
Debug.ShouldStop(67108864);
_imgcoverlittlebubblelbl.runVoidMethod ("Initialize",homeact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("ImgCoverLittleBubbleLbl")));
 BA.debugLineNum = 1564;BA.debugLine="ImgCoverLittleBubbleLbl.Background=CdLittleBubble";
Debug.ShouldStop(134217728);
_imgcoverlittlebubblelbl.runMethod(false,"setBackground",(_cdlittlebubble.getObject()));
 BA.debugLineNum = 1565;BA.debugLine="p_view.AddView( ImgCoverLittleBubbleLbl, PanelMsg";
Debug.ShouldStop(268435456);
_p_view.runVoidMethod ("AddView",(Object)((_imgcoverlittlebubblelbl.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {homeact.mostCurrent._panelmsgs.runMethod(true,"getWidth"),homeact._listitemheightmsg,homeact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 7)))}, "--",2, 1)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {homeact._listitemheightmsg,RemoteObject.createImmutable(2)}, "/",0, 0)),homeact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 7)))}, "-",1, 0))),(Object)(homeact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 14)))),(Object)(homeact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 14)))));
 BA.debugLineNum = 1567;BA.debugLine="Dim Image_IV As ImageView";
Debug.ShouldStop(1073741824);
_image_iv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");Debug.locals.put("Image_IV", _image_iv);
 BA.debugLineNum = 1568;BA.debugLine="Image_IV.Initialize(\"image_wv\")";
Debug.ShouldStop(-2147483648);
_image_iv.runVoidMethod ("Initialize",homeact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("image_wv")));
 BA.debugLineNum = 1569;BA.debugLine="Image_IV.Gravity=Gravity.CENTER";
Debug.ShouldStop(1);
_image_iv.runMethod(true,"setGravity",homeact.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 1571;BA.debugLine="Image_IV.Bitmap = SaeloZahra.FindWeatherImg(Icon_";
Debug.ShouldStop(4);
_image_iv.runMethod(false,"setBitmap",(homeact.mostCurrent._saelozahra.runMethod(false,"_findweatherimg" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)(_icon_cli)).runMethod(false,"Resize",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {homeact._listitemheightmsg,RemoteObject.createImmutable(1.5)}, "/",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {homeact._listitemheightmsg,RemoteObject.createImmutable(1.5)}, "/",0, 0))),(Object)(homeact.mostCurrent.__c.getField(true,"True"))).getObject()));
 BA.debugLineNum = 1572;BA.debugLine="p_view.AddView( Image_IV , PanelMsgs.Width - list";
Debug.ShouldStop(8);
_p_view.runVoidMethod ("AddView",(Object)((_image_iv.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {homeact.mostCurrent._panelmsgs.runMethod(true,"getWidth"),homeact._listitemheightmsg}, "-",1, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(homeact._listitemheightmsg),(Object)(homeact._listitemheightmsg));
 BA.debugLineNum = 1575;BA.debugLine="Dim lbl_caption As Label";
Debug.ShouldStop(64);
_lbl_caption = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl_caption", _lbl_caption);
 BA.debugLineNum = 1576;BA.debugLine="lbl_caption.Initialize(\"lbl_caption\")";
Debug.ShouldStop(128);
_lbl_caption.runVoidMethod ("Initialize",homeact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lbl_caption")));
 BA.debugLineNum = 1577;BA.debugLine="lbl_caption.Gravity = Bit.Or(Gravity.RIGHT,Gravit";
Debug.ShouldStop(256);
_lbl_caption.runMethod(true,"setGravity",homeact.mostCurrent.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(homeact.mostCurrent.__c.getField(false,"Gravity").getField(true,"RIGHT")),(Object)(homeact.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL"))));
 BA.debugLineNum = 1578;BA.debugLine="lbl_caption.TextSize = 1";
Debug.ShouldStop(512);
_lbl_caption.runMethod(true,"setTextSize",BA.numberCast(float.class, 1));
 BA.debugLineNum = 1579;BA.debugLine="lbl_caption.Tag = id_cli";
Debug.ShouldStop(1024);
_lbl_caption.runMethod(false,"setTag",(_id_cli));
 BA.debugLineNum = 1580;BA.debugLine="lbl_caption.Text = Title_cli";
Debug.ShouldStop(2048);
_lbl_caption.runMethod(true,"setText",BA.ObjectToCharSequence(_title_cli));
 BA.debugLineNum = 1581;BA.debugLine="lbl_caption.SetTextSizeAnimated(555,15)";
Debug.ShouldStop(4096);
_lbl_caption.runVoidMethod ("SetTextSizeAnimated",(Object)(BA.numberCast(int.class, 555)),(Object)(BA.numberCast(float.class, 15)));
 BA.debugLineNum = 1582;BA.debugLine="lbl_caption.Typeface = SaeloZahra.font";
Debug.ShouldStop(8192);
_lbl_caption.runMethod(false,"setTypeface",(homeact.mostCurrent._saelozahra._font /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 1583;BA.debugLine="lbl_caption.TextColor = Colors.Black";
Debug.ShouldStop(16384);
_lbl_caption.runMethod(true,"setTextColor",homeact.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 1584;BA.debugLine="lbl_caption.SingleLine=True";
Debug.ShouldStop(32768);
_lbl_caption.runVoidMethod ("setSingleLine",homeact.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1585;BA.debugLine="lbl_caption.Ellipsize=\"END\"";
Debug.ShouldStop(65536);
_lbl_caption.runMethod(true,"setEllipsize",BA.ObjectToString("END"));
 BA.debugLineNum = 1586;BA.debugLine="p_view.AddView( lbl_caption , 2dip , 2dip , Panel";
Debug.ShouldStop(131072);
_p_view.runVoidMethod ("AddView",(Object)((_lbl_caption.getObject())),(Object)(homeact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(homeact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(RemoteObject.solve(new RemoteObject[] {homeact.mostCurrent._panelmsgs.runMethod(true,"getWidth"),homeact._listitemheightmsg,homeact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 24)))}, "--",2, 1)),(Object)(homeact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 35)))));
 BA.debugLineNum = 1588;BA.debugLine="Dim WVText As WebView";
Debug.ShouldStop(524288);
_wvtext = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");Debug.locals.put("WVText", _wvtext);
 BA.debugLineNum = 1589;BA.debugLine="WVText.Initialize(\"WVText\")";
Debug.ShouldStop(1048576);
_wvtext.runVoidMethod ("Initialize",homeact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("WVText")));
 BA.debugLineNum = 1590;BA.debugLine="WVText.Color = Colors.Transparent";
Debug.ShouldStop(2097152);
_wvtext.runVoidMethod ("setColor",homeact.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 1591;BA.debugLine="WVText.ZoomEnabled=False";
Debug.ShouldStop(4194304);
_wvtext.runMethod(true,"setZoomEnabled",homeact.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1592;BA.debugLine="WVText.Tag = id_cli";
Debug.ShouldStop(8388608);
_wvtext.runMethod(false,"setTag",(_id_cli));
 BA.debugLineNum = 1593;BA.debugLine="content_cli=content_cli.Replace(\"<br>\",\" \")";
Debug.ShouldStop(16777216);
_content_cli = _content_cli.runMethod(true,"replace",(Object)(BA.ObjectToString("<br>")),(Object)(RemoteObject.createImmutable(" ")));Debug.locals.put("content_cli", _content_cli);
 BA.debugLineNum = 1594;BA.debugLine="content_cli=content_cli.Replace(\"<br>\",\" \")";
Debug.ShouldStop(33554432);
_content_cli = _content_cli.runMethod(true,"replace",(Object)(BA.ObjectToString("<br>")),(Object)(RemoteObject.createImmutable(" ")));Debug.locals.put("content_cli", _content_cli);
 BA.debugLineNum = 1595;BA.debugLine="WVText.LoadHtml(\"<style>@import 'https://cdn.jsde";
Debug.ShouldStop(67108864);
_wvtext.runVoidMethod ("LoadHtml",(Object)(RemoteObject.concat(RemoteObject.createImmutable("<style>@import 'https://cdn.jsdelivr.net/gh/rastikerdar/samim-font@v4.0.5/dist/font-face.css'; *,body,html{font-family:'Samim';margin:auto;} .div{ direction:rtl; width:100%;float:left;height:100%;font-size:10px;}</style><div class='div'>"),homeact.mostCurrent._saelozahra.runMethod(true,"_plaintext" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)(_content_cli)),RemoteObject.createImmutable("</div>"))));
 BA.debugLineNum = 1596;BA.debugLine="p_view.AddView( WVText , 2dip , 43dip , PanelMsgs";
Debug.ShouldStop(134217728);
_p_view.runVoidMethod ("AddView",(Object)((_wvtext.getObject())),(Object)(homeact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(homeact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 43)))),(Object)(RemoteObject.solve(new RemoteObject[] {homeact.mostCurrent._panelmsgs.runMethod(true,"getWidth"),homeact._listitemheightmsg,homeact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 24)))}, "--",2, 1)),(Object)(homeact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 18)))));
 BA.debugLineNum = 1599;BA.debugLine="Dim cd As ColorDrawable";
Debug.ShouldStop(1073741824);
_cd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("cd", _cd);
 BA.debugLineNum = 1600;BA.debugLine="cd.Initialize(Color_cli,7dip)";
Debug.ShouldStop(-2147483648);
_cd.runVoidMethod ("Initialize",(Object)(_color_cli),(Object)(homeact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 7)))));
 BA.debugLineNum = 1602;BA.debugLine="Dim timeLbl As Label";
Debug.ShouldStop(2);
_timelbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("timeLbl", _timelbl);
 BA.debugLineNum = 1603;BA.debugLine="timeLbl.Initialize(\"timeLbl\")";
Debug.ShouldStop(4);
_timelbl.runVoidMethod ("Initialize",homeact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("timeLbl")));
 BA.debugLineNum = 1604;BA.debugLine="timeLbl.Background	= cd";
Debug.ShouldStop(8);
_timelbl.runMethod(false,"setBackground",(_cd.getObject()));
 BA.debugLineNum = 1605;BA.debugLine="timeLbl.TextSize	= 12";
Debug.ShouldStop(16);
_timelbl.runMethod(true,"setTextSize",BA.numberCast(float.class, 12));
 BA.debugLineNum = 1606;BA.debugLine="timeLbl.Typeface = Typeface.LoadFromAssets(\"aviny";
Debug.ShouldStop(32);
_timelbl.runMethod(false,"setTypeface",homeact.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("aviny.ttf"))));
 BA.debugLineNum = 1607;BA.debugLine="timeLbl.Gravity		= Bit.Or(Gravity.CENTER, Gravity";
Debug.ShouldStop(64);
_timelbl.runMethod(true,"setGravity",homeact.mostCurrent.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(homeact.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER")),(Object)(homeact.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"))));
 BA.debugLineNum = 1608;BA.debugLine="timeLbl.textColor	= Colors.White";
Debug.ShouldStop(128);
_timelbl.runMethod(true,"setTextColor",homeact.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1609;BA.debugLine="If TypeCli == \"notification\" Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_typecli,BA.ObjectToString("notification"))) { 
 BA.debugLineNum = 1610;BA.debugLine="timeLbl.Text	 	= \"اطلاعیـــه\"";
Debug.ShouldStop(512);
_timelbl.runMethod(true,"setText",BA.ObjectToCharSequence("اطلاعیـــه"));
 }else 
{ BA.debugLineNum = 1611;BA.debugLine="Else if TypeCli == \"weather\" Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_typecli,BA.ObjectToString("weather"))) { 
 BA.debugLineNum = 1612;BA.debugLine="timeLbl.Text	 	= \"وضعیت آب و هوا\"";
Debug.ShouldStop(2048);
_timelbl.runMethod(true,"setText",BA.ObjectToCharSequence("وضعیت آب و هوا"));
 }else 
{ BA.debugLineNum = 1613;BA.debugLine="Else if TypeCli == \"sarmazadegi\" Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_typecli,BA.ObjectToString("sarmazadegi"))) { 
 BA.debugLineNum = 1614;BA.debugLine="timeLbl.Text	 	= \"هشدار سرمازدگی\"";
Debug.ShouldStop(8192);
_timelbl.runMethod(true,"setText",BA.ObjectToCharSequence("هشدار سرمازدگی"));
 }else 
{ BA.debugLineNum = 1615;BA.debugLine="Else if TypeCli == \"garmazadegi\" Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_typecli,BA.ObjectToString("garmazadegi"))) { 
 BA.debugLineNum = 1616;BA.debugLine="timeLbl.Text	 	= \"هشدار گرمازدگی\"";
Debug.ShouldStop(32768);
_timelbl.runMethod(true,"setText",BA.ObjectToCharSequence("هشدار گرمازدگی"));
 }else {
 BA.debugLineNum = 1618;BA.debugLine="timeLbl.Text	 	= SaeloZahra.mohasebe_tarikh(time";
Debug.ShouldStop(131072);
_timelbl.runMethod(true,"setText",BA.ObjectToCharSequence(homeact.mostCurrent._saelozahra.runMethod(true,"_mohasebe_tarikh" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)(BA.numberCast(long.class, _time_cli)))));
 }}}}
;
 BA.debugLineNum = 1620;BA.debugLine="p_view.AddView(timeLbl,5dip,7dip,72dip,24dip)";
Debug.ShouldStop(524288);
_p_view.runVoidMethod ("AddView",(Object)((_timelbl.getObject())),(Object)(homeact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))),(Object)(homeact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 7)))),(Object)(homeact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 72)))),(Object)(homeact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 24)))));
 BA.debugLineNum = 1622;BA.debugLine="Dim ss As SmartString";
Debug.ShouldStop(2097152);
_ss = RemoteObject.createNew ("com.smartstring.arminkh.smartstring");Debug.locals.put("ss", _ss);
 BA.debugLineNum = 1623;BA.debugLine="ss.Initialize";
Debug.ShouldStop(4194304);
_ss.runVoidMethod ("_initialize",homeact.mostCurrent.activityBA);
 BA.debugLineNum = 1624;BA.debugLine="ss.SingleLine2(Activity,timeLbl,\"aviny.ttf\")";
Debug.ShouldStop(8388608);
_ss.runVoidMethod ("_vvv5",(Object)(homeact.mostCurrent._activity),(Object)((_timelbl.getObject())),(Object)(RemoteObject.createImmutable("aviny.ttf")));
 BA.debugLineNum = 1627;BA.debugLine="Dim border_bottom_lbl As Label";
Debug.ShouldStop(67108864);
_border_bottom_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("border_bottom_lbl", _border_bottom_lbl);
 BA.debugLineNum = 1628;BA.debugLine="border_bottom_lbl.Initialize(\"border_bottom_lbl\")";
Debug.ShouldStop(134217728);
_border_bottom_lbl.runVoidMethod ("Initialize",homeact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("border_bottom_lbl")));
 BA.debugLineNum = 1629;BA.debugLine="border_bottom_lbl.Color=0xBECCCCCC";
Debug.ShouldStop(268435456);
_border_bottom_lbl.runVoidMethod ("setColor",BA.numberCast(int.class, ((int)0xbecccccc)));
 BA.debugLineNum = 1630;BA.debugLine="p_view.AddView(border_bottom_lbl,15%x,listItemHei";
Debug.ShouldStop(536870912);
_p_view.runVoidMethod ("AddView",(Object)((_border_bottom_lbl.getObject())),(Object)(homeact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),homeact.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {homeact._listitemheightmsg,homeact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))}, "-",1, 1)),(Object)(homeact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),homeact.mostCurrent.activityBA)),(Object)(homeact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))));
 BA.debugLineNum = 1633;BA.debugLine="Dim CoverMsglbl As Label";
Debug.ShouldStop(1);
_covermsglbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("CoverMsglbl", _covermsglbl);
 BA.debugLineNum = 1634;BA.debugLine="CoverMsglbl.Initialize(\"CoverMsglbl\")";
Debug.ShouldStop(2);
_covermsglbl.runVoidMethod ("Initialize",homeact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("CoverMsglbl")));
 BA.debugLineNum = 1636;BA.debugLine="p_view.AddView(CoverMsglbl,0dip,0dip,100%x,listIt";
Debug.ShouldStop(8);
_p_view.runVoidMethod ("AddView",(Object)((_covermsglbl.getObject())),(Object)(homeact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(homeact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(homeact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),homeact.mostCurrent.activityBA)),(Object)(homeact._listitemheightmsg));
 BA.debugLineNum = 1638;BA.debugLine="AC.SetClickEffect(CoverMsglbl,True)";
Debug.ShouldStop(32);
homeact.mostCurrent._ac.runVoidMethod ("SetClickEffect",homeact.mostCurrent.activityBA,(Object)((_covermsglbl.getObject())),(Object)(homeact.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 1641;BA.debugLine="Return p_view";
Debug.ShouldStop(256);
if (true) return _p_view;
 BA.debugLineNum = 1644;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dialog_simpleitemselected(RemoteObject _dialog,RemoteObject _position,RemoteObject _item) throws Exception{
try {
		Debug.PushSubsStack("Dialog_SimpleItemSelected (homeact) ","homeact",3,homeact.mostCurrent.activityBA,homeact.mostCurrent,991);
if (RapidSub.canDelegate("dialog_simpleitemselected")) { return ir.saelozahra.damaara.mazraeyeman.homeact.remoteMe.runUserSub(false, "homeact","dialog_simpleitemselected", _dialog, _position, _item);}
RemoteObject _resultmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Dialog", _dialog);
Debug.locals.put("Position", _position);
Debug.locals.put("Item", _item);
 BA.debugLineNum = 991;BA.debugLine="Sub Dialog_SimpleItemSelected (Dialog As MaterialD";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 992;BA.debugLine="Dim ResultMap As Map = listSearchResults.Get(Posi";
Debug.ShouldStop(-2147483648);
_resultmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_resultmap = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), homeact.mostCurrent._listsearchresults.runMethod(false,"Get",(Object)(_position)));Debug.locals.put("ResultMap", _resultmap);Debug.locals.put("ResultMap", _resultmap);
 BA.debugLineNum = 993;BA.debugLine="ToastMessageShow(Item.Content, False)";
Debug.ShouldStop(1);
homeact.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(_item.runMethod(true,"getContent"))),(Object)(homeact.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 994;BA.debugLine="If listSearchHasVid.Get(Position)==\"true\" Or list";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",homeact.mostCurrent._listsearchhasvid.runMethod(false,"Get",(Object)(_position)),RemoteObject.createImmutable(("true"))) || RemoteObject.solveBoolean("=",homeact.mostCurrent._listsearchhasvid.runMethod(false,"Get",(Object)(_position)),RemoteObject.createImmutable(("True"))) || RemoteObject.solveBoolean("=",homeact.mostCurrent._listsearchhasvid.runMethod(false,"Get",(Object)(_position)),(homeact.mostCurrent.__c.getField(true,"True")))) { 
 BA.debugLineNum = 995;BA.debugLine="ProgressDialogShow(SaeloZahra.CSB(\"در حال بارگزا";
Debug.ShouldStop(4);
homeact.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",homeact.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(homeact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("در حال بارگزاری فیلم"))).getObject())));
 BA.debugLineNum = 996;BA.debugLine="jobSingleVideo.Download(SaeloZahra.json_url&\"pos";
Debug.ShouldStop(8);
homeact.mostCurrent._jobsinglevideo.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.concat(homeact.mostCurrent._saelozahra._json_url /*RemoteObject*/ ,RemoteObject.createImmutable("post.php?type=html&id="),_resultmap.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))))));
 }else {
 BA.debugLineNum = 999;BA.debugLine="SingleNewAct.post_id = ResultMap.Get(\"id\")";
Debug.ShouldStop(64);
homeact.mostCurrent._singlenewact._post_id /*RemoteObject*/  = BA.ObjectToString(_resultmap.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));
 BA.debugLineNum = 1000;BA.debugLine="SingleNewAct.caption_str = ResultMap.Get(\"title\"";
Debug.ShouldStop(128);
homeact.mostCurrent._singlenewact._caption_str /*RemoteObject*/  = BA.ObjectToString(_resultmap.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("title")))));
 BA.debugLineNum = 1001;BA.debugLine="SingleNewAct.content_str = ResultMap.Get(\"conten";
Debug.ShouldStop(256);
homeact.mostCurrent._singlenewact._content_str /*RemoteObject*/  = BA.ObjectToString(_resultmap.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("content")))));
 BA.debugLineNum = 1002;BA.debugLine="SingleNewAct.video_str = ResultMap.Get(\"video\")";
Debug.ShouldStop(512);
homeact.mostCurrent._singlenewact._video_str /*RemoteObject*/  = BA.ObjectToString(_resultmap.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("video")))));
 BA.debugLineNum = 1003;BA.debugLine="StartActivity(SingleNewAct)";
Debug.ShouldStop(1024);
homeact.mostCurrent.__c.runVoidMethod ("StartActivity",homeact.processBA,(Object)((homeact.mostCurrent._singlenewact.getObject())));
 };
 BA.debugLineNum = 1005;BA.debugLine="Dialog.Dismiss";
Debug.ShouldStop(4096);
_dialog.runVoidMethod ("Dismiss");
 BA.debugLineNum = 1006;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _finddarsadimage(RemoteObject _adad) throws Exception{
try {
		Debug.PushSubsStack("FindDarsadImage (homeact) ","homeact",3,homeact.mostCurrent.activityBA,homeact.mostCurrent,1457);
if (RapidSub.canDelegate("finddarsadimage")) { return ir.saelozahra.damaara.mazraeyeman.homeact.remoteMe.runUserSub(false, "homeact","finddarsadimage", _adad);}
RemoteObject _dada = RemoteObject.createImmutable(0);
Debug.locals.put("adad", _adad);
 BA.debugLineNum = 1457;BA.debugLine="Sub FindDarsadImage(adad As String) As String";
Debug.ShouldStop(65536);
 BA.debugLineNum = 1458;BA.debugLine="Try";
Debug.ShouldStop(131072);
try { BA.debugLineNum = 1459;BA.debugLine="If adad = \"\" Then adad = 5";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_adad,BA.ObjectToString(""))) { 
_adad = BA.NumberToString(5);Debug.locals.put("adad", _adad);};
 BA.debugLineNum = 1461;BA.debugLine="adad = adad.Replace(\"km/h\",\"\").Replace(\"%\",\"\").R";
Debug.ShouldStop(1048576);
_adad = _adad.runMethod(true,"replace",(Object)(BA.ObjectToString("km/h")),(Object)(RemoteObject.createImmutable(""))).runMethod(true,"replace",(Object)(BA.ObjectToString("%")),(Object)(RemoteObject.createImmutable(""))).runMethod(true,"replace",(Object)(BA.ObjectToString("<b>")),(Object)(RemoteObject.createImmutable(""))).runMethod(true,"replace",(Object)(BA.ObjectToString("</b>")),(Object)(RemoteObject.createImmutable(""))).runMethod(true,"replace",(Object)(BA.ObjectToString("<small style='font-size:12'></small>")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("adad", _adad);
 BA.debugLineNum = 1463;BA.debugLine="Dim dada As Int = 1";
Debug.ShouldStop(4194304);
_dada = BA.numberCast(int.class, 1);Debug.locals.put("dada", _dada);Debug.locals.put("dada", _dada);
 BA.debugLineNum = 1466;BA.debugLine="Select adad";
Debug.ShouldStop(33554432);
switch (BA.switchObjectToInt(_adad,BA.ObjectToString("پائین"),BA.ObjectToString("کم"),BA.ObjectToString("پایین"),BA.ObjectToString("low"),BA.ObjectToString("متوسط"),BA.ObjectToString("medium"),BA.ObjectToString("بالا"),BA.ObjectToString("زیاد"),BA.ObjectToString("hight"))) {
case 0: 
case 1: 
case 2: 
case 3: {
 BA.debugLineNum = 1468;BA.debugLine="dada = 2";
Debug.ShouldStop(134217728);
_dada = BA.numberCast(int.class, 2);Debug.locals.put("dada", _dada);
 break; }
case 4: 
case 5: {
 BA.debugLineNum = 1470;BA.debugLine="dada = 5";
Debug.ShouldStop(536870912);
_dada = BA.numberCast(int.class, 5);Debug.locals.put("dada", _dada);
 break; }
case 6: 
case 7: 
case 8: {
 BA.debugLineNum = 1472;BA.debugLine="dada = 9";
Debug.ShouldStop(-2147483648);
_dada = BA.numberCast(int.class, 9);Debug.locals.put("dada", _dada);
 break; }
}
;
 BA.debugLineNum = 1475;BA.debugLine="If dada>1 Then Return \"file:///android_asset/dar";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean(">",_dada,BA.numberCast(double.class, 1))) { 
Debug.CheckDeviceExceptions();if (true) return RemoteObject.concat(RemoteObject.createImmutable("file:///android_asset/darsad_"),_dada,RemoteObject.createImmutable(".svg"));};
 BA.debugLineNum = 1478;BA.debugLine="dada = SaeloZahra.parseInt(adad)";
Debug.ShouldStop(32);
_dada = homeact.mostCurrent._saelozahra.runMethod(true,"_parseint" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)(_adad));Debug.locals.put("dada", _dada);
 BA.debugLineNum = 1480;BA.debugLine="If dada >10 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean(">",_dada,BA.numberCast(double.class, 10))) { 
 BA.debugLineNum = 1481;BA.debugLine="dada = SaeloZahra.parseInt(dada/10)";
Debug.ShouldStop(256);
_dada = homeact.mostCurrent._saelozahra.runMethod(true,"_parseint" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)(BA.NumberToString(RemoteObject.solve(new RemoteObject[] {_dada,RemoteObject.createImmutable(10)}, "/",0, 0))));Debug.locals.put("dada", _dada);
 };
 BA.debugLineNum = 1484;BA.debugLine="If dada = 0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_dada,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1485;BA.debugLine="dada = 1";
Debug.ShouldStop(4096);
_dada = BA.numberCast(int.class, 1);Debug.locals.put("dada", _dada);
 }else 
{ BA.debugLineNum = 1486;BA.debugLine="else if dada>10 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean(">",_dada,BA.numberCast(double.class, 10))) { 
 BA.debugLineNum = 1487;BA.debugLine="dada = 10";
Debug.ShouldStop(16384);
_dada = BA.numberCast(int.class, 10);Debug.locals.put("dada", _dada);
 }}
;
 BA.debugLineNum = 1489;BA.debugLine="If SaeloZahra.Debug Then LogColor(\"adad: \"&adad&";
Debug.ShouldStop(65536);
if (homeact.mostCurrent._saelozahra._debug /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
homeact.mostCurrent.__c.runVoidMethod ("LogImpl","43604512",RemoteObject.concat(RemoteObject.createImmutable("adad: "),_adad,RemoteObject.createImmutable("    dada: "),_dada,RemoteObject.createImmutable("     round: "),homeact.mostCurrent.__c.runMethod(true,"Round2",(Object)(BA.numberCast(double.class, _dada)),(Object)(BA.numberCast(int.class, 0)))),homeact.mostCurrent.__c.getField(false,"Colors").getField(true,"Blue"));};
 BA.debugLineNum = 1491;BA.debugLine="dada = Round2(dada,0)";
Debug.ShouldStop(262144);
_dada = BA.numberCast(int.class, homeact.mostCurrent.__c.runMethod(true,"Round2",(Object)(BA.numberCast(double.class, _dada)),(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("dada", _dada);
 BA.debugLineNum = 1494;BA.debugLine="Return \"file:///android_asset/darsad_\"&dada&\".sv";
Debug.ShouldStop(2097152);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.concat(RemoteObject.createImmutable("file:///android_asset/darsad_"),_dada,RemoteObject.createImmutable(".svg"));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e27) {
			BA.rdebugUtils.runVoidMethod("setLastException",homeact.processBA, e27.toString()); BA.debugLineNum = 1497;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16777216);
homeact.mostCurrent.__c.runVoidMethod ("LogImpl","43604520",BA.ObjectToString(homeact.mostCurrent.__c.runMethod(false,"LastException",homeact.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1498;BA.debugLine="Return \"file:///android_asset/darsad_5.svg\"";
Debug.ShouldStop(33554432);
if (true) return BA.ObjectToString("file:///android_asset/darsad_5.svg");
 };
 BA.debugLineNum = 1500;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("GetIntent (homeact) ","homeact",3,homeact.mostCurrent.activityBA,homeact.mostCurrent,502);
if (RapidSub.canDelegate("getintent")) { return ir.saelozahra.damaara.mazraeyeman.homeact.remoteMe.runUserSub(false, "homeact","getintent");}
RemoteObject _sr = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
 BA.debugLineNum = 502;BA.debugLine="Sub GetIntent As Intent";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 503;BA.debugLine="Dim sR As Reflector";
Debug.ShouldStop(4194304);
_sr = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("sR", _sr);
 BA.debugLineNum = 504;BA.debugLine="sR.Target=sR.GetActivity";
Debug.ShouldStop(8388608);
_sr.setField ("Target",(_sr.runMethod(false,"GetActivity",homeact.processBA)));
 BA.debugLineNum = 505;BA.debugLine="Return sR.RunMethod(\"getIntent\")";
Debug.ShouldStop(16777216);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.IntentWrapper"), _sr.runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getIntent"))));
 BA.debugLineNum = 506;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 24;BA.debugLine="Dim DTTC As DoubleTaptoClose";
homeact.mostCurrent._dttc = RemoteObject.createNew ("ir.saelozahra.damaara.mazraeyeman.doubletaptoclose");
 //BA.debugLineNum = 25;BA.debugLine="Private ActionBar As ACToolBarDark";
homeact.mostCurrent._actionbar = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACToolbarDarkWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Dim AC As AppCompat";
homeact.mostCurrent._ac = RemoteObject.createNew ("de.amberhome.objects.appcompat.AppCompatBase");
 //BA.debugLineNum = 28;BA.debugLine="Dim SH As Amir_SliderShow";
homeact.mostCurrent._sh = RemoteObject.createNew ("ir.aghajari.slider.Amir_SliderShow");
 //BA.debugLineNum = 29;BA.debugLine="Dim Snake As DSSnackbar";
homeact.mostCurrent._snake = RemoteObject.createNew ("de.amberhome.objects.SnackbarWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Dim X1 As XmlLayoutBuilder";
homeact.mostCurrent._x1 = RemoteObject.createNew ("anywheresoftware.b4a.object.XmlLayoutBuilder");
 //BA.debugLineNum = 32;BA.debugLine="Dim customBrowser As JK_CustomTabsBrowser";
homeact.mostCurrent._custombrowser = RemoteObject.createNew ("ir.jokar.customtabsbrowser.wrapper");
 //BA.debugLineNum = 35;BA.debugLine="Dim BottomBar As AX_SmoothBottomBar";
homeact.mostCurrent._bottombar = RemoteObject.createNew ("com.aghajari.smoothbottombar.AX_SmoothBottomBar");
 //BA.debugLineNum = 36;BA.debugLine="Private VP As AHViewPager";
homeact.mostCurrent._vp = RemoteObject.createNew ("de.amberhome.viewpager.AHViewPager");
 //BA.debugLineNum = 37;BA.debugLine="Dim apkupdt As cl_appupdate";
homeact.mostCurrent._apkupdt = RemoteObject.createNew ("ir.saelozahra.damaara.mazraeyeman.cl_appupdate");
 //BA.debugLineNum = 41;BA.debugLine="Dim SM As SlidingMenu";
homeact.mostCurrent._sm = RemoteObject.createNew ("anywheresoftware.b4a.objects.SlidingMenuWrapper");
 //BA.debugLineNum = 42;BA.debugLine="Dim lv As ListView";
homeact.mostCurrent._lv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 43;BA.debugLine="Dim listSearchResults,listSearchHasVid As List";
homeact.mostCurrent._listsearchresults = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
homeact.mostCurrent._listsearchhasvid = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 44;BA.debugLine="Dim msi As MaterialSimpleListItem";
homeact.mostCurrent._msi = RemoteObject.createNew ("de.amberhome.materialdialogs.MaterialSimpleListItemWrapper");
 //BA.debugLineNum = 45;BA.debugLine="Dim ModalBuilder As MaterialDialogBuilder";
homeact.mostCurrent._modalbuilder = RemoteObject.createNew ("de.amberhome.materialdialogs.MaterialDialogBuilderWrapper");
 //BA.debugLineNum = 47;BA.debugLine="Dim sv As ACSearchView";
homeact.mostCurrent._sv = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACSearchViewWrapper");
 //BA.debugLineNum = 48;BA.debugLine="Dim si As ACMenuItem";
homeact.mostCurrent._si = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACMenuItemWrapper");
 //BA.debugLineNum = 51;BA.debugLine="Private PanelMsgs,PanelWeather,HomePanel As Panel";
homeact.mostCurrent._panelmsgs = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
homeact.mostCurrent._panelweather = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
homeact.mostCurrent._homepanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 52;BA.debugLine="Dim ClvMsg As CustomListView";
homeact.mostCurrent._clvmsg = RemoteObject.createNew ("ir.saelozahra.damaara.mazraeyeman.customlistview");
 //BA.debugLineNum = 53;BA.debugLine="Dim Zouj As Boolean = True";
homeact._zouj = homeact.mostCurrent.__c.getField(true,"True");
 //BA.debugLineNum = 55;BA.debugLine="Dim WeatherWV As WebView";
homeact.mostCurrent._weatherwv = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 56;BA.debugLine="Dim ParallaxDesign As Hitex_ParallaxDesign";
homeact.mostCurrent._parallaxdesign = RemoteObject.createNew ("iir.wrap.Hitex_ParallaxDesign");
 //BA.debugLineNum = 57;BA.debugLine="Dim HomePanelHeight As Int";
homeact._homepanelheight = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 60;BA.debugLine="Private MultiMediaWv As WebView";
homeact.mostCurrent._multimediawv = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 61;BA.debugLine="Private SwipeMultiMedia As WVSwipe";
homeact.mostCurrent._swipemultimedia = RemoteObject.createNew ("ir.saelozahra.damaara.mazraeyeman.wvswipe");
 //BA.debugLineNum = 62;BA.debugLine="Dim MultiMediaPanel As Panel";
homeact.mostCurrent._multimediapanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 65;BA.debugLine="Dim BazarcheWV As WebView";
homeact.mostCurrent._bazarchewv = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 66;BA.debugLine="Private SwipeBazarche As WVSwipe";
homeact.mostCurrent._swipebazarche = RemoteObject.createNew ("ir.saelozahra.damaara.mazraeyeman.wvswipe");
 //BA.debugLineNum = 67;BA.debugLine="Dim BazarcheWVPanel As Panel";
homeact.mostCurrent._bazarchewvpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 68;BA.debugLine="Dim jobSingleBazarche,jobSingleVideo,JobGet12Hour";
homeact.mostCurrent._jobsinglebazarche = RemoteObject.createNew ("ir.saelozahra.damaara.mazraeyeman.httpjob");
homeact.mostCurrent._jobsinglevideo = RemoteObject.createNew ("ir.saelozahra.damaara.mazraeyeman.httpjob");
homeact.mostCurrent._jobget12hour = RemoteObject.createNew ("ir.saelozahra.damaara.mazraeyeman.httpjob");
homeact.mostCurrent._jobsearch = RemoteObject.createNew ("ir.saelozahra.damaara.mazraeyeman.httpjob");
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static void  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (homeact) ","homeact",3,homeact.mostCurrent.activityBA,homeact.mostCurrent,1017);
if (RapidSub.canDelegate("jobdone")) { ir.saelozahra.damaara.mazraeyeman.homeact.remoteMe.runUserSub(false, "homeact","jobdone", _job); return;}
ResumableSub_JobDone rsub = new ResumableSub_JobDone(null,_job);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_JobDone extends BA.ResumableSub {
public ResumableSub_JobDone(ir.saelozahra.damaara.mazraeyeman.homeact parent,RemoteObject _job) {
this.parent = parent;
this._job = _job;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.saelozahra.damaara.mazraeyeman.homeact parent;
RemoteObject _job;
RemoteObject _notemptyjob = RemoteObject.createImmutable(false);
RemoteObject _parserbazarche = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _rootbazarche = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colrootbazarche = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _builder = RemoteObject.declareNull("de.amberhome.materialdialogs.MaterialDialogBuilderWrapper");
RemoteObject _root1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _shomareyenatije = RemoteObject.createImmutable(0);
RemoteObject _searchresults = null;
RemoteObject _rootsearch = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _contentid = RemoteObject.createImmutable("");
RemoteObject _titlerendered = RemoteObject.createImmutable("");
RemoteObject _video = RemoteObject.createImmutable("");
RemoteObject _excerptrendered = RemoteObject.createImmutable("");
RemoteObject _pic = RemoteObject.createImmutable("");
RemoteObject _moretext = RemoteObject.createImmutable("");
RemoteObject _shomarande = RemoteObject.createImmutable(0);
RemoteObject _parser2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root12hour = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colroot = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _epochdatetime = RemoteObject.createImmutable(0L);
RemoteObject _weathericon = RemoteObject.createImmutable("");
RemoteObject _dewpoint = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _snow = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _rain = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _wind = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _windspeed = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _temperature = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _temperaturevalue = RemoteObject.createImmutable(0);
RemoteObject group18;
int index18;
int groupLen18;
RemoteObject group39;
int index39;
int groupLen39;
RemoteObject group54;
int index54;
int groupLen54;
RemoteObject group100;
int index100;
int groupLen100;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("JobDone (homeact) ","homeact",3,homeact.mostCurrent.activityBA,homeact.mostCurrent,1017);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("Job", _job);
 BA.debugLineNum = 1019;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 1020;BA.debugLine="LogColor(Job.JobName&\"    ,    \"&Job.Success,Colo";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","43145731",RemoteObject.concat(_job.getField(true,"_jobname" /*RemoteObject*/ ),RemoteObject.createImmutable("    ,    "),_job.getField(true,"_success" /*RemoteObject*/ )),parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Magenta"));
 BA.debugLineNum = 1022;BA.debugLine="Dim NotEmptyJob As Boolean = True";
Debug.ShouldStop(536870912);
_notemptyjob = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("NotEmptyJob", _notemptyjob);Debug.locals.put("NotEmptyJob", _notemptyjob);
 BA.debugLineNum = 1023;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 1:
//if
this.state = 18;
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1024;BA.debugLine="If Job.GetString ==\"\" Then NotEmptyJob=False Els";
Debug.ShouldStop(-2147483648);
if (true) break;

case 4:
//if
this.state = 11;
if (RemoteObject.solveBoolean("=",_job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_getstring" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 6;
;}
else {
this.state = 8;
;}if (true) break;

case 6:
//C
this.state = 11;
_notemptyjob = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("NotEmptyJob", _notemptyjob);
if (true) break;

case 8:
//C
this.state = 11;
_notemptyjob = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("NotEmptyJob", _notemptyjob);
if (true) break;

case 11:
//C
this.state = 12;
;
 BA.debugLineNum = 1025;BA.debugLine="If Job.GetString.Contains(\"The allowed number of";
Debug.ShouldStop(1);
if (true) break;

case 12:
//if
this.state = 17;
if (_job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_getstring" /*RemoteObject*/ ).runMethod(true,"contains",(Object)(RemoteObject.createImmutable("The allowed number of requests has been exceeded."))).<Boolean>get().booleanValue()) { 
this.state = 14;
;}if (true) break;

case 14:
//C
this.state = 17;
_notemptyjob = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("NotEmptyJob", _notemptyjob);
if (true) break;

case 17:
//C
this.state = 18;
;
 if (true) break;
;
 BA.debugLineNum = 1028;BA.debugLine="If Job.Success And NotEmptyJob Then";
Debug.ShouldStop(8);

case 18:
//if
this.state = 130;
if (RemoteObject.solveBoolean(".",_job.getField(true,"_success" /*RemoteObject*/ )) && RemoteObject.solveBoolean(".",_notemptyjob)) { 
this.state = 20;
}else {
this.state = 105;
}if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 1030;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(32);
if (true) break;

case 21:
//select
this.state = 103;
switch (BA.switchObjectToInt(_job.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("UnsubscribeJob"),BA.ObjectToString("jobSingleBazarche"),BA.ObjectToString("JobSearch"),BA.ObjectToString("jobSingleVideo"),BA.ObjectToString("JobGet12Hour"))) {
case 0: {
this.state = 23;
if (true) break;
}
case 1: {
this.state = 25;
if (true) break;
}
case 2: {
this.state = 36;
if (true) break;
}
case 3: {
this.state = 76;
if (true) break;
}
case 4: {
this.state = 84;
if (true) break;
}
}
if (true) break;

case 23:
//C
this.state = 103;
 BA.debugLineNum = 1033;BA.debugLine="File.Delete(SaeloZahra.Dir,\"NotNeedUserPass\")";
Debug.ShouldStop(256);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(parent.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("NotNeedUserPass")));
 BA.debugLineNum = 1034;BA.debugLine="ToastMessageShow(SaeloZahra.CSB(\"اشتراک مزرعه";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(parent.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("اشتراک مزرعه من با موفقیت حذف شد"))).getObject())),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 1035;BA.debugLine="ExitApplication";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("ExitApplication");
 if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 1039;BA.debugLine="Dim ParserBazarche As JSONParser";
Debug.ShouldStop(16384);
_parserbazarche = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("ParserBazarche", _parserbazarche);
 BA.debugLineNum = 1040;BA.debugLine="ParserBazarche.Initialize(Job.GetString)";
Debug.ShouldStop(32768);
_parserbazarche.runVoidMethod ("Initialize",(Object)(_job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 1041;BA.debugLine="Dim RootBazarche As List = ParserBazarche.Next";
Debug.ShouldStop(65536);
_rootbazarche = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_rootbazarche = _parserbazarche.runMethod(false,"NextArray");Debug.locals.put("RootBazarche", _rootbazarche);Debug.locals.put("RootBazarche", _rootbazarche);
 BA.debugLineNum = 1042;BA.debugLine="For Each ColRootBazarche As Map In RootBazarch";
Debug.ShouldStop(131072);
if (true) break;

case 26:
//for
this.state = 29;
_colrootbazarche = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group18 = _rootbazarche;
index18 = 0;
groupLen18 = group18.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("ColRootBazarche", _colrootbazarche);
this.state = 131;
if (true) break;

case 131:
//C
this.state = 29;
if (index18 < groupLen18) {
this.state = 28;
_colrootbazarche = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group18.runMethod(false,"Get",index18));Debug.locals.put("ColRootBazarche", _colrootbazarche);}
if (true) break;

case 132:
//C
this.state = 131;
index18++;
Debug.locals.put("ColRootBazarche", _colrootbazarche);
if (true) break;

case 28:
//C
this.state = 132;
 if (true) break;
if (true) break;
Debug.locals.put("ColRootBazarche", _colrootbazarche);
;
 BA.debugLineNum = 1045;BA.debugLine="If login_act.ItIsPayed Then";
Debug.ShouldStop(1048576);

case 29:
//if
this.state = 34;
if (parent.mostCurrent._login_act._itispayed /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
this.state = 31;
}else {
this.state = 33;
}if (true) break;

case 31:
//C
this.state = 34;
 BA.debugLineNum = 1046;BA.debugLine="SH.convertActivityFromTranslucent";
Debug.ShouldStop(2097152);
parent.mostCurrent._sh.runVoidMethod ("convertActivityFromTranslucent",homeact.mostCurrent.activityBA);
 BA.debugLineNum = 1047;BA.debugLine="bazarcheMahsoolAct.pageVals=ColRootBazarche";
Debug.ShouldStop(4194304);
parent.mostCurrent._bazarchemahsoolact._pagevals /*RemoteObject*/  = _colrootbazarche;
 BA.debugLineNum = 1048;BA.debugLine="ProgressDialogShow(\"در حال بارگزاری...\")";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",homeact.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("در حال بارگزاری..."))));
 BA.debugLineNum = 1049;BA.debugLine="StartActivity(bazarcheMahsoolAct)";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",homeact.processBA,(Object)((parent.mostCurrent._bazarchemahsoolact.getObject())));
 if (true) break;

case 33:
//C
this.state = 34;
 BA.debugLineNum = 1051;BA.debugLine="ShowPardakhtModal";
Debug.ShouldStop(67108864);
_showpardakhtmodal();
 if (true) break;

case 34:
//C
this.state = 103;
;
 if (true) break;

case 36:
//C
this.state = 37;
 BA.debugLineNum = 1056;BA.debugLine="If Job.GetString==\"{\"\"result\"\":\"\"not found\"\"}\"";
Debug.ShouldStop(-2147483648);
if (true) break;

case 37:
//if
this.state = 74;
if (RemoteObject.solveBoolean("=",_job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_getstring" /*RemoteObject*/ ),BA.ObjectToString("{\"result\":\"not found\"}")) || RemoteObject.solveBoolean("=",_job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_getstring" /*RemoteObject*/ ),BA.ObjectToString("[]"))) { 
this.state = 39;
}else {
this.state = 41;
}if (true) break;

case 39:
//C
this.state = 74;
 BA.debugLineNum = 1057;BA.debugLine="Snake.Initialize(\"snakeSearch\",Activity,Saelo";
Debug.ShouldStop(1);
parent.mostCurrent._snake.runVoidMethod ("Initialize",homeact.mostCurrent.activityBA,(Object)(BA.ObjectToString("snakeSearch")),(Object)((parent.mostCurrent._activity.getObject())),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("هیچ نتیجه ای یافت نشد"))).getObject())),(Object)(BA.numberCast(int.class, 2000)));
 BA.debugLineNum = 1058;BA.debugLine="Snake.SetAction(SaeloZahra.CSB(\"جستجوی مجدد\")";
Debug.ShouldStop(2);
parent.mostCurrent._snake.runVoidMethod ("SetAction",(Object)(BA.ObjectToCharSequence(parent.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("جستجوی مجدد"))).getObject())));
 BA.debugLineNum = 1059;BA.debugLine="Snake.Show";
Debug.ShouldStop(4);
parent.mostCurrent._snake.runVoidMethod ("Show");
 if (true) break;

case 41:
//C
this.state = 42;
 BA.debugLineNum = 1063;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(64);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 1064;BA.debugLine="parser.Initialize(Job.GetString)";
Debug.ShouldStop(128);
_parser.runVoidMethod ("Initialize",(Object)(_job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 1065;BA.debugLine="If sv.QueryHint == \"جستجو در بازارچه\" Then";
Debug.ShouldStop(256);
if (true) break;

case 42:
//if
this.state = 73;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._sv.runMethod(true,"getQueryHint"),BA.ObjectToString("جستجو در بازارچه"))) { 
this.state = 44;
}else {
this.state = 56;
}if (true) break;

case 44:
//C
this.state = 45;
 BA.debugLineNum = 1067;BA.debugLine="PlaceList.Initialize";
Debug.ShouldStop(1024);
parent._placelist.runVoidMethod ("Initialize");
 BA.debugLineNum = 1068;BA.debugLine="Dim RootBazarche As List = parser.NextArray";
Debug.ShouldStop(2048);
_rootbazarche = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_rootbazarche = _parser.runMethod(false,"NextArray");Debug.locals.put("RootBazarche", _rootbazarche);Debug.locals.put("RootBazarche", _rootbazarche);
 BA.debugLineNum = 1069;BA.debugLine="For Each ColRootBazarche As Map In RootBazar";
Debug.ShouldStop(4096);
if (true) break;

case 45:
//for
this.state = 54;
_colrootbazarche = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group39 = _rootbazarche;
index39 = 0;
groupLen39 = group39.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("ColRootBazarche", _colrootbazarche);
this.state = 133;
if (true) break;

case 133:
//C
this.state = 54;
if (index39 < groupLen39) {
this.state = 47;
_colrootbazarche = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group39.runMethod(false,"Get",index39));Debug.locals.put("ColRootBazarche", _colrootbazarche);}
if (true) break;

case 134:
//C
this.state = 133;
index39++;
Debug.locals.put("ColRootBazarche", _colrootbazarche);
if (true) break;

case 47:
//C
this.state = 48;
 BA.debugLineNum = 1080;BA.debugLine="If mapProductName.ContainsKey(ColRootBazarc";
Debug.ShouldStop(8388608);
if (true) break;

case 48:
//if
this.state = 53;
if (parent._mapproductname.runMethod(true,"ContainsKey",(Object)(_colrootbazarche.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("product")))))).<Boolean>get().booleanValue()) { 
this.state = 50;
;}if (true) break;

case 50:
//C
this.state = 53;
_colrootbazarche.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("product"))),(Object)(parent._mapproductname.runMethod(false,"Get",(Object)(_colrootbazarche.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("product"))))))));
if (true) break;

case 53:
//C
this.state = 134;
;
 BA.debugLineNum = 1084;BA.debugLine="PlaceList.Add(ColRootBazarche)";
Debug.ShouldStop(134217728);
parent._placelist.runVoidMethod ("Add",(Object)((_colrootbazarche.getObject())));
 if (true) break;
if (true) break;

case 54:
//C
this.state = 73;
Debug.locals.put("ColRootBazarche", _colrootbazarche);
;
 if (true) break;

case 56:
//C
this.state = 57;
 BA.debugLineNum = 1089;BA.debugLine="Dim Builder As MaterialDialogBuilder";
Debug.ShouldStop(1);
_builder = RemoteObject.createNew ("de.amberhome.materialdialogs.MaterialDialogBuilderWrapper");Debug.locals.put("Builder", _builder);
 BA.debugLineNum = 1090;BA.debugLine="Builder.Initialize(\"Dialog\")";
Debug.ShouldStop(2);
_builder.runVoidMethod ("Initialize",homeact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Dialog")));
 BA.debugLineNum = 1091;BA.debugLine="Builder.Icon(X1.GetDrawable(\"baseline_search";
Debug.ShouldStop(4);
_builder.runVoidMethod ("Icon",(Object)(parent.mostCurrent._x1.runMethod(false,"GetDrawable",(Object)(RemoteObject.createImmutable("baseline_search_black_24")))));
 BA.debugLineNum = 1092;BA.debugLine="Builder.Title(SaeloZahra.CSB(\"نتیجه جستجو\"))";
Debug.ShouldStop(8);
_builder.runVoidMethod ("Title",(Object)(BA.ObjectToCharSequence(parent.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("نتیجه جستجو"))).getObject())));
 BA.debugLineNum = 1093;BA.debugLine="Builder.Typeface(SaeloZahra.fontBold,SaeloZa";
Debug.ShouldStop(16);
_builder.runVoidMethod ("Typeface",(Object)((parent.mostCurrent._saelozahra._fontbold /*RemoteObject*/ .getObject())),(Object)((parent.mostCurrent._saelozahra._font /*RemoteObject*/ .getObject())));
 BA.debugLineNum = 1097;BA.debugLine="Dim root1 As List = parser.NextArray";
Debug.ShouldStop(256);
_root1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_root1 = _parser.runMethod(false,"NextArray");Debug.locals.put("root1", _root1);Debug.locals.put("root1", _root1);
 BA.debugLineNum = 1098;BA.debugLine="Dim shomareyeNatije As Int = 0";
Debug.ShouldStop(512);
_shomareyenatije = BA.numberCast(int.class, 0);Debug.locals.put("shomareyeNatije", _shomareyenatije);Debug.locals.put("shomareyeNatije", _shomareyenatije);
 BA.debugLineNum = 1099;BA.debugLine="Dim SearchResults(root1.Size) As String";
Debug.ShouldStop(1024);
_searchresults = RemoteObject.createNewArray ("String", new int[] {_root1.runMethod(true,"getSize").<Integer>get().intValue()}, new Object[]{});Debug.locals.put("SearchResults", _searchresults);
 BA.debugLineNum = 1100;BA.debugLine="listSearchResults.Initialize";
Debug.ShouldStop(2048);
parent.mostCurrent._listsearchresults.runVoidMethod ("Initialize");
 BA.debugLineNum = 1101;BA.debugLine="listSearchHasVid.Initialize";
Debug.ShouldStop(4096);
parent.mostCurrent._listsearchhasvid.runVoidMethod ("Initialize");
 BA.debugLineNum = 1102;BA.debugLine="For Each RootSearch As Map In root1";
Debug.ShouldStop(8192);
if (true) break;

case 57:
//for
this.state = 72;
_rootsearch = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group54 = _root1;
index54 = 0;
groupLen54 = group54.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("RootSearch", _rootsearch);
this.state = 135;
if (true) break;

case 135:
//C
this.state = 72;
if (index54 < groupLen54) {
this.state = 59;
_rootsearch = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group54.runMethod(false,"Get",index54));Debug.locals.put("RootSearch", _rootsearch);}
if (true) break;

case 136:
//C
this.state = 135;
index54++;
Debug.locals.put("RootSearch", _rootsearch);
if (true) break;

case 59:
//C
this.state = 60;
 BA.debugLineNum = 1103;BA.debugLine="Dim ContentId As String = RootSearch.Get(\"i";
Debug.ShouldStop(16384);
_contentid = BA.ObjectToString(_rootsearch.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("ContentId", _contentid);Debug.locals.put("ContentId", _contentid);
 BA.debugLineNum = 1104;BA.debugLine="Dim TitleRendered As String = RootSearch.Ge";
Debug.ShouldStop(32768);
_titlerendered = BA.ObjectToString(_rootsearch.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("title")))));Debug.locals.put("TitleRendered", _titlerendered);Debug.locals.put("TitleRendered", _titlerendered);
 BA.debugLineNum = 1105;BA.debugLine="Dim video As String = RootSearch.Get(\"video";
Debug.ShouldStop(65536);
_video = BA.ObjectToString(_rootsearch.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("video")))));Debug.locals.put("video", _video);Debug.locals.put("video", _video);
 BA.debugLineNum = 1106;BA.debugLine="Dim excerptrendered As String = RootSearch.";
Debug.ShouldStop(131072);
_excerptrendered = BA.ObjectToString(_rootsearch.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("text")))));Debug.locals.put("excerptrendered", _excerptrendered);Debug.locals.put("excerptrendered", _excerptrendered);
 BA.debugLineNum = 1107;BA.debugLine="Dim pic As String = RootSearch.Get(\"pic\")";
Debug.ShouldStop(262144);
_pic = BA.ObjectToString(_rootsearch.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("pic")))));Debug.locals.put("pic", _pic);Debug.locals.put("pic", _pic);
 BA.debugLineNum = 1108;BA.debugLine="Dim moretext As String = RootSearch.Get(\"mo";
Debug.ShouldStop(524288);
_moretext = BA.ObjectToString(_rootsearch.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("moretext")))));Debug.locals.put("moretext", _moretext);Debug.locals.put("moretext", _moretext);
 BA.debugLineNum = 1123;BA.debugLine="SearchResults(shomareyeNatije) = TitleRende";
Debug.ShouldStop(4);
_searchresults.setArrayElement (_titlerendered,_shomareyenatije);
 BA.debugLineNum = 1124;BA.debugLine="shomareyeNatije =shomareyeNatije+1";
Debug.ShouldStop(8);
_shomareyenatije = RemoteObject.solve(new RemoteObject[] {_shomareyenatije,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("shomareyeNatije", _shomareyenatije);
 BA.debugLineNum = 1127;BA.debugLine="listSearchResults.Add(CreateMap(\"id\":Conten";
Debug.ShouldStop(64);
parent.mostCurrent._listsearchresults.runVoidMethod ("Add",(Object)((parent.mostCurrent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("id")),(_contentid),RemoteObject.createImmutable(("title")),(_titlerendered),RemoteObject.createImmutable(("excerpt")),(_excerptrendered),RemoteObject.createImmutable(("content")),(_moretext),RemoteObject.createImmutable(("video")),(_video),RemoteObject.createImmutable(("image")),(_pic)})).getObject())));
 BA.debugLineNum = 1129;BA.debugLine="If SaeloZahra.Debug Then ToastMessageShow(T";
Debug.ShouldStop(256);
if (true) break;

case 60:
//if
this.state = 65;
if (parent.mostCurrent._saelozahra._debug /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
this.state = 62;
;}if (true) break;

case 62:
//C
this.state = 65;
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(_titlerendered)),(Object)(parent.mostCurrent.__c.getField(true,"False")));
if (true) break;

case 65:
//C
this.state = 66;
;
 BA.debugLineNum = 1130;BA.debugLine="If video.Length>20 Then";
Debug.ShouldStop(512);
if (true) break;

case 66:
//if
this.state = 71;
if (RemoteObject.solveBoolean(">",_video.runMethod(true,"length"),BA.numberCast(double.class, 20))) { 
this.state = 68;
}else {
this.state = 70;
}if (true) break;

case 68:
//C
this.state = 71;
 BA.debugLineNum = 1131;BA.debugLine="listSearchHasVid.Add(True)";
Debug.ShouldStop(1024);
parent.mostCurrent._listsearchhasvid.runVoidMethod ("Add",(Object)((parent.mostCurrent.__c.getField(true,"True"))));
 BA.debugLineNum = 1132;BA.debugLine="msi.Initialize2(\"outline_video_library_bla";
Debug.ShouldStop(2048);
parent.mostCurrent._msi.runVoidMethod ("Initialize2",homeact.processBA,(Object)(BA.ObjectToString("outline_video_library_black_24")),(Object)(BA.ObjectToCharSequence(_titlerendered)));
 if (true) break;

case 70:
//C
this.state = 71;
 BA.debugLineNum = 1134;BA.debugLine="listSearchHasVid.Add(False)";
Debug.ShouldStop(8192);
parent.mostCurrent._listsearchhasvid.runVoidMethod ("Add",(Object)((parent.mostCurrent.__c.getField(true,"False"))));
 BA.debugLineNum = 1135;BA.debugLine="msi.Initialize2(\"outline_file_copy_black_2";
Debug.ShouldStop(16384);
parent.mostCurrent._msi.runVoidMethod ("Initialize2",homeact.processBA,(Object)(BA.ObjectToString("outline_file_copy_black_24")),(Object)(BA.ObjectToCharSequence(_titlerendered)));
 if (true) break;

case 71:
//C
this.state = 136;
;
 BA.debugLineNum = 1137;BA.debugLine="msi.BackgroundColor = Colors.White 'Rnd(Col";
Debug.ShouldStop(65536);
parent.mostCurrent._msi.runMethod(true,"setBackgroundColor",parent.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 1138;BA.debugLine="Builder.AddSimpleItem(msi)";
Debug.ShouldStop(131072);
_builder.runVoidMethod ("AddSimpleItem",(Object)(parent.mostCurrent._msi));
 if (true) break;
if (true) break;

case 72:
//C
this.state = 73;
Debug.locals.put("RootSearch", _rootsearch);
;
 BA.debugLineNum = 1166;BA.debugLine="Builder.NegativeText(\"بازگشت\")";
Debug.ShouldStop(8192);
_builder.runVoidMethod ("NegativeText",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("بازگشت"))));
 BA.debugLineNum = 1167;BA.debugLine="Builder.Show";
Debug.ShouldStop(16384);
_builder.runVoidMethod ("Show");
 if (true) break;

case 73:
//C
this.state = 74;
;
 if (true) break;

case 74:
//C
this.state = 103;
;
 if (true) break;

case 76:
//C
this.state = 77;
 BA.debugLineNum = 1175;BA.debugLine="VideoNewAct.pageTitle=TitleRendered";
Debug.ShouldStop(4194304);
parent.mostCurrent._videonewact._pagetitle /*RemoteObject*/  = _titlerendered;
 BA.debugLineNum = 1176;BA.debugLine="If video.Length>20 Then";
Debug.ShouldStop(8388608);
if (true) break;

case 77:
//if
this.state = 82;
if (RemoteObject.solveBoolean(">",_video.runMethod(true,"length"),BA.numberCast(double.class, 20))) { 
this.state = 79;
}else {
this.state = 81;
}if (true) break;

case 79:
//C
this.state = 82;
 BA.debugLineNum = 1177;BA.debugLine="VideoNewAct.VidUrl=video";
Debug.ShouldStop(16777216);
parent.mostCurrent._videonewact._vidurl /*RemoteObject*/  = _video;
 BA.debugLineNum = 1178;BA.debugLine="StartActivity(VideoNewAct)";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",homeact.processBA,(Object)((parent.mostCurrent._videonewact.getObject())));
 if (true) break;

case 81:
//C
this.state = 82;
 BA.debugLineNum = 1180;BA.debugLine="SingleNewAct.post_id = jobSingleVideo.Tag";
Debug.ShouldStop(134217728);
parent.mostCurrent._singlenewact._post_id /*RemoteObject*/  = BA.ObjectToString(parent.mostCurrent._jobsinglevideo.getField(false,"_tag" /*RemoteObject*/ ));
 BA.debugLineNum = 1181;BA.debugLine="SingleNewAct.caption_str = \"محتوای چندرسانه‌ا";
Debug.ShouldStop(268435456);
parent.mostCurrent._singlenewact._caption_str /*RemoteObject*/  = BA.ObjectToString("محتوای چندرسانه‌ای");
 BA.debugLineNum = 1182;BA.debugLine="SingleNewAct.content_str = Job.GetString";
Debug.ShouldStop(536870912);
parent.mostCurrent._singlenewact._content_str /*RemoteObject*/  = _job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_getstring" /*RemoteObject*/ );
 BA.debugLineNum = 1183;BA.debugLine="SingleNewAct.video_str = \"\"";
Debug.ShouldStop(1073741824);
parent.mostCurrent._singlenewact._video_str /*RemoteObject*/  = BA.ObjectToString("");
 BA.debugLineNum = 1184;BA.debugLine="StartActivity(SingleNewAct)";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",homeact.processBA,(Object)((parent.mostCurrent._singlenewact.getObject())));
 if (true) break;

case 82:
//C
this.state = 103;
;
 if (true) break;

case 84:
//C
this.state = 85;
 BA.debugLineNum = 1189;BA.debugLine="Next12HWindha.Initialize";
Debug.ShouldStop(16);
parent._next12hwindha.runVoidMethod ("Initialize");
 BA.debugLineNum = 1190;BA.debugLine="Next12HDamaha.Initialize";
Debug.ShouldStop(32);
parent._next12hdamaha.runVoidMethod ("Initialize");
 BA.debugLineNum = 1191;BA.debugLine="Next12HFaghatDama.Initialize";
Debug.ShouldStop(64);
parent._next12hfaghatdama.runVoidMethod ("Initialize");
 BA.debugLineNum = 1193;BA.debugLine="Dim Shomarande As Int = 0";
Debug.ShouldStop(256);
_shomarande = BA.numberCast(int.class, 0);Debug.locals.put("Shomarande", _shomarande);Debug.locals.put("Shomarande", _shomarande);
 BA.debugLineNum = 1194;BA.debugLine="Dim Zouj As Boolean = True";
Debug.ShouldStop(512);
parent._zouj = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 1196;BA.debugLine="Dim parser2 As JSONParser";
Debug.ShouldStop(2048);
_parser2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser2", _parser2);
 BA.debugLineNum = 1197;BA.debugLine="parser2.Initialize(Job.GetString)";
Debug.ShouldStop(4096);
_parser2.runVoidMethod ("Initialize",(Object)(_job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 1198;BA.debugLine="Dim root12Hour As List = parser2.NextArray";
Debug.ShouldStop(8192);
_root12hour = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_root12hour = _parser2.runMethod(false,"NextArray");Debug.locals.put("root12Hour", _root12hour);Debug.locals.put("root12Hour", _root12hour);
 BA.debugLineNum = 1199;BA.debugLine="For Each colroot As Map In root12Hour";
Debug.ShouldStop(16384);
if (true) break;

case 85:
//for
this.state = 102;
_colroot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group100 = _root12hour;
index100 = 0;
groupLen100 = group100.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colroot", _colroot);
this.state = 137;
if (true) break;

case 137:
//C
this.state = 102;
if (index100 < groupLen100) {
this.state = 87;
_colroot = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group100.runMethod(false,"Get",index100));Debug.locals.put("colroot", _colroot);}
if (true) break;

case 138:
//C
this.state = 137;
index100++;
Debug.locals.put("colroot", _colroot);
if (true) break;

case 87:
//C
this.state = 88;
 BA.debugLineNum = 1201;BA.debugLine="Shomarande=Shomarande+1";
Debug.ShouldStop(65536);
_shomarande = RemoteObject.solve(new RemoteObject[] {_shomarande,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("Shomarande", _shomarande);
 BA.debugLineNum = 1203;BA.debugLine="If Zouj Then Zouj = False Else Zouj = True";
Debug.ShouldStop(262144);
if (true) break;

case 88:
//if
this.state = 95;
if (parent._zouj.<Boolean>get().booleanValue()) { 
this.state = 90;
;}
else {
this.state = 92;
;}if (true) break;

case 90:
//C
this.state = 95;
parent._zouj = parent.mostCurrent.__c.getField(true,"False");
if (true) break;

case 92:
//C
this.state = 95;
parent._zouj = parent.mostCurrent.__c.getField(true,"True");
if (true) break;

case 95:
//C
this.state = 96;
;
 BA.debugLineNum = 1204;BA.debugLine="If Not(Zouj) Then Continue";
Debug.ShouldStop(524288);
if (true) break;

case 96:
//if
this.state = 101;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent._zouj)).<Boolean>get().booleanValue()) { 
this.state = 98;
;}if (true) break;

case 98:
//C
this.state = 101;
this.state = 138;
if (true) break;;
if (true) break;

case 101:
//C
this.state = 138;
;
 BA.debugLineNum = 1207;BA.debugLine="Dim EpochDateTime As Long = colroot.Get(\"Epoc";
Debug.ShouldStop(4194304);
_epochdatetime = BA.numberCast(long.class, _colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("EpochDateTime")))));Debug.locals.put("EpochDateTime", _epochdatetime);Debug.locals.put("EpochDateTime", _epochdatetime);
 BA.debugLineNum = 1208;BA.debugLine="Dim WeatherIcon As String = colroot.Get(\"Weat";
Debug.ShouldStop(8388608);
_weathericon = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("WeatherIcon")))));Debug.locals.put("WeatherIcon", _weathericon);Debug.locals.put("WeatherIcon", _weathericon);
 BA.debugLineNum = 1210;BA.debugLine="RelativeHumidity = colroot.Get(\"RelativeHumid";
Debug.ShouldStop(33554432);
parent._relativehumidity = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("RelativeHumidity")))));
 BA.debugLineNum = 1211;BA.debugLine="File.WriteString(SaeloZahra.Dir,\"RelativeHumi";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(parent.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(BA.ObjectToString("RelativeHumidity")),(Object)(parent._relativehumidity));
 BA.debugLineNum = 1212;BA.debugLine="WeatherWV.LoadHtml(buildWeatherHtml)";
Debug.ShouldStop(134217728);
parent.mostCurrent._weatherwv.runVoidMethod ("LoadHtml",(Object)(_buildweatherhtml()));
 BA.debugLineNum = 1215;BA.debugLine="UVIndex = colroot.Get(\"UVIndexText\")";
Debug.ShouldStop(1073741824);
parent._uvindex = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("UVIndexText")))));
 BA.debugLineNum = 1216;BA.debugLine="File.WriteString(SaeloZahra.dir,\"UVIndex\",UVI";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(parent.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(BA.ObjectToString("UVIndex")),(Object)(parent._uvindex));
 BA.debugLineNum = 1217;BA.debugLine="Dim DewPoint As Map = colroot.Get(\"DewPoint\")";
Debug.ShouldStop(1);
_dewpoint = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_dewpoint = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("DewPoint")))));Debug.locals.put("DewPoint", _dewpoint);Debug.locals.put("DewPoint", _dewpoint);
 BA.debugLineNum = 1218;BA.debugLine="DewPointValue = DewPoint.Get(\"Value\")";
Debug.ShouldStop(2);
parent._dewpointvalue = BA.numberCast(double.class, _dewpoint.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Value")))));
 BA.debugLineNum = 1221;BA.debugLine="Dim Snow As Map = colroot.Get(\"Snow\")";
Debug.ShouldStop(16);
_snow = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_snow = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Snow")))));Debug.locals.put("Snow", _snow);Debug.locals.put("Snow", _snow);
 BA.debugLineNum = 1222;BA.debugLine="SnowValue = Snow.Get(\"Value\")";
Debug.ShouldStop(32);
parent._snowvalue = BA.numberCast(double.class, _snow.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Value")))));
 BA.debugLineNum = 1223;BA.debugLine="Dim Rain As Map = colroot.Get(\"Rain\")";
Debug.ShouldStop(64);
_rain = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_rain = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Rain")))));Debug.locals.put("Rain", _rain);Debug.locals.put("Rain", _rain);
 BA.debugLineNum = 1224;BA.debugLine="RainValue = Rain.Get(\"Value\")";
Debug.ShouldStop(128);
parent._rainvalue = BA.numberCast(double.class, _rain.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Value")))));
 BA.debugLineNum = 1225;BA.debugLine="Dim Wind As Map = colroot.Get(\"Wind\")";
Debug.ShouldStop(256);
_wind = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_wind = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Wind")))));Debug.locals.put("Wind", _wind);Debug.locals.put("Wind", _wind);
 BA.debugLineNum = 1226;BA.debugLine="Dim WindSpeed As Map = Wind.Get(\"Speed\")";
Debug.ShouldStop(512);
_windspeed = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_windspeed = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _wind.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Speed")))));Debug.locals.put("WindSpeed", _windspeed);Debug.locals.put("WindSpeed", _windspeed);
 BA.debugLineNum = 1227;BA.debugLine="WindSpeedValue = WindSpeed.Get(\"Value\")";
Debug.ShouldStop(1024);
parent._windspeedvalue = BA.ObjectToString(_windspeed.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Value")))));
 BA.debugLineNum = 1228;BA.debugLine="NowWind = \"<b>\"&WindSpeedValue&\"</b>\" & \"<sma";
Debug.ShouldStop(2048);
parent._nowwind = RemoteObject.concat(RemoteObject.createImmutable("<b>"),parent._windspeedvalue,RemoteObject.createImmutable("</b>"),RemoteObject.createImmutable("<small style='font-size:10%'>KM/H</small>"));
 BA.debugLineNum = 1229;BA.debugLine="File.WriteString(SaeloZahra.Dir,\"NowWind\",Now";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(parent.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(BA.ObjectToString("NowWind")),(Object)(parent._nowwind));
 BA.debugLineNum = 1231;BA.debugLine="Dim Temperature As Map = colroot.Get(\"Tempera";
Debug.ShouldStop(16384);
_temperature = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_temperature = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Temperature")))));Debug.locals.put("Temperature", _temperature);Debug.locals.put("Temperature", _temperature);
 BA.debugLineNum = 1232;BA.debugLine="Dim TemperatureValue As Double = Temperature.";
Debug.ShouldStop(32768);
_temperaturevalue = BA.numberCast(double.class, _temperature.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Value")))));Debug.locals.put("TemperatureValue", _temperaturevalue);Debug.locals.put("TemperatureValue", _temperaturevalue);
 BA.debugLineNum = 1242;BA.debugLine="Next12HWindha.Add(CreateMap(\"title\":\"ساعت \"&D";
Debug.ShouldStop(33554432);
parent._next12hwindha.runVoidMethod ("Add",(Object)((parent.mostCurrent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("title")),(RemoteObject.concat(RemoteObject.createImmutable("ساعت "),parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"GetHour",(Object)(BA.numberCast(long.class, RemoteObject.concat(_epochdatetime,RemoteObject.createImmutable("000"))))))),RemoteObject.createImmutable(("value")),(parent._windspeedvalue),RemoteObject.createImmutable(("image")),(RemoteObject.concat(_weathericon,RemoteObject.createImmutable(".png")))})).getObject())));
 BA.debugLineNum = 1243;BA.debugLine="Next12HDamaha.Add(CreateMap(\"title\":\"ساعت \"&D";
Debug.ShouldStop(67108864);
parent._next12hdamaha.runVoidMethod ("Add",(Object)((parent.mostCurrent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("title")),(RemoteObject.concat(RemoteObject.createImmutable("ساعت "),parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"GetHour",(Object)(BA.numberCast(long.class, RemoteObject.concat(_epochdatetime,RemoteObject.createImmutable("000"))))))),RemoteObject.createImmutable(("value")),(_temperaturevalue),RemoteObject.createImmutable(("image")),(RemoteObject.concat(_weathericon,RemoteObject.createImmutable(".png")))})).getObject())));
 BA.debugLineNum = 1244;BA.debugLine="Next12HFaghatDama.Add(TemperatureValue)";
Debug.ShouldStop(134217728);
parent._next12hfaghatdama.runVoidMethod ("Add",(Object)((_temperaturevalue)));
 if (true) break;
if (true) break;

case 102:
//C
this.state = 103;
Debug.locals.put("colroot", _colroot);
;
 BA.debugLineNum = 1249;BA.debugLine="LogColor(\"Load 12H Complete\",Colors.Yellow)";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","43145960",BA.ObjectToString("Load 12H Complete"),parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Yellow"));
 if (true) break;

case 103:
//C
this.state = 130;
;
 if (true) break;

case 105:
//C
this.state = 106;
 BA.debugLineNum = 1256;BA.debugLine="If SaeloZahra.CheckConnection Then Log(\"Error: \"";
Debug.ShouldStop(128);
if (true) break;

case 106:
//if
this.state = 111;
if (parent.mostCurrent._saelozahra.runMethod(true,"_checkconnection" /*RemoteObject*/ ,homeact.mostCurrent.activityBA).<Boolean>get().booleanValue()) { 
this.state = 108;
;}if (true) break;

case 108:
//C
this.state = 111;
parent.mostCurrent.__c.runVoidMethod ("LogImpl","43145967",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage" /*RemoteObject*/ )),0);
if (true) break;

case 111:
//C
this.state = 112;
;
 BA.debugLineNum = 1258;BA.debugLine="If (Job.JobName==\"JobGet12Hour\" And  Job.GetStri";
Debug.ShouldStop(512);
if (true) break;

case 112:
//if
this.state = 129;
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_job.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("JobGet12Hour")) && RemoteObject.solveBoolean(".",_job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_getstring" /*RemoteObject*/ ).runMethod(true,"contains",(Object)(RemoteObject.createImmutable("The allowed number of requests has been exceeded."))))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_job.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("JobGet12Hour")) && RemoteObject.solveBoolean(".",parent.mostCurrent.__c.runMethod(true,"Not",(Object)(_notemptyjob))))))) { 
this.state = 114;
}if (true) break;

case 114:
//C
this.state = 115;
 BA.debugLineNum = 1260;BA.debugLine="Log(\"GetString: \"&Job.GetString)";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","43145971",RemoteObject.concat(RemoteObject.createImmutable("GetString: "),_job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_getstring" /*RemoteObject*/ )),0);
 BA.debugLineNum = 1261;BA.debugLine="Log(\"The allowed number of requests has been ex";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","43145972",RemoteObject.createImmutable("The allowed number of requests has been exceeded.  Api Jadid Begir"),0);
 BA.debugLineNum = 1262;BA.debugLine="Sleep(3000)";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("Sleep",homeact.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "homeact", "jobdone"),BA.numberCast(int.class, 3000));
this.state = 139;
return;
case 139:
//C
this.state = 115;
;
 BA.debugLineNum = 1263;BA.debugLine="Select Rnd(1,7)";
Debug.ShouldStop(16384);
if (true) break;

case 115:
//select
this.state = 128;
switch (BA.switchObjectToInt(parent.mostCurrent.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 7))),BA.numberCast(int.class, 1),BA.numberCast(int.class, 2),BA.numberCast(int.class, 3),BA.numberCast(int.class, 4),BA.numberCast(int.class, 5))) {
case 0: {
this.state = 117;
if (true) break;
}
case 1: {
this.state = 119;
if (true) break;
}
case 2: {
this.state = 121;
if (true) break;
}
case 3: {
this.state = 123;
if (true) break;
}
case 4: {
this.state = 125;
if (true) break;
}
default: {
this.state = 127;
if (true) break;
}
}
if (true) break;

case 117:
//C
this.state = 128;
 BA.debugLineNum = 1265;BA.debugLine="JobGet12Hour.Download(	\"http://newserver.mazr";
Debug.ShouldStop(65536);
parent.mostCurrent._jobget12hour.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://newserver.mazraeyeman.ir/mazraeyeman_proxy.php?url="),parent.mostCurrent._saelozahra.runMethod(true,"_encodeurl" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://dataservice.accuweather.com/forecasts/v1/hourly/12hour/"),parent.mostCurrent._accuweathercronjobservice._regioncode /*RemoteObject*/ ,RemoteObject.createImmutable("?metric=true&details=true&language=fa-ir&apikey="),parent.mostCurrent._accuweathercronjobservice._apiaccuweather1 /*RemoteObject*/ ))),RemoteObject.createImmutable("&amirTime="),parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"))));
 BA.debugLineNum = 1266;BA.debugLine="Log(\"Downloading: \"&	\"http://newserver.mazrae";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","43145977",RemoteObject.concat(RemoteObject.createImmutable("Downloading: "),RemoteObject.createImmutable("http://newserver.mazraeyeman.ir/mazraeyeman_proxy.php?url="),parent.mostCurrent._saelozahra.runMethod(true,"_encodeurl" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://dataservice.accuweather.com/forecasts/v1/hourly/12hour/"),parent.mostCurrent._accuweathercronjobservice._regioncode /*RemoteObject*/ ,RemoteObject.createImmutable("?metric=true&details=true&language=fa-ir&apikey="),parent.mostCurrent._accuweathercronjobservice._apiaccuweather1 /*RemoteObject*/ ))),RemoteObject.createImmutable("&amirTime="),parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")),0);
 if (true) break;

case 119:
//C
this.state = 128;
 BA.debugLineNum = 1268;BA.debugLine="JobGet12Hour.Download(	\"http://newserver.mazr";
Debug.ShouldStop(524288);
parent.mostCurrent._jobget12hour.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://newserver.mazraeyeman.ir/mazraeyeman_proxy.php?url="),parent.mostCurrent._saelozahra.runMethod(true,"_encodeurl" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://dataservice.accuweather.com/forecasts/v1/hourly/12hour/"),parent.mostCurrent._accuweathercronjobservice._regioncode /*RemoteObject*/ ,RemoteObject.createImmutable("?metric=true&details=true&language=fa-ir&apikey="),parent.mostCurrent._accuweathercronjobservice._apiaccuweather2 /*RemoteObject*/ ))),RemoteObject.createImmutable("&amirTime="),parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"))));
 BA.debugLineNum = 1269;BA.debugLine="Log(\"Downloading: \"&	\"http://newserver.mazrae";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","43145980",RemoteObject.concat(RemoteObject.createImmutable("Downloading: "),RemoteObject.createImmutable("http://newserver.mazraeyeman.ir/mazraeyeman_proxy.php?url="),parent.mostCurrent._saelozahra.runMethod(true,"_encodeurl" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://dataservice.accuweather.com/forecasts/v1/hourly/12hour/"),parent.mostCurrent._accuweathercronjobservice._regioncode /*RemoteObject*/ ,RemoteObject.createImmutable("?metric=true&details=true&language=fa-ir&apikey="),parent.mostCurrent._accuweathercronjobservice._apiaccuweather2 /*RemoteObject*/ ))),RemoteObject.createImmutable("&amirTime="),parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")),0);
 if (true) break;

case 121:
//C
this.state = 128;
 BA.debugLineNum = 1271;BA.debugLine="JobGet12Hour.Download(	\"http://newserver.mazr";
Debug.ShouldStop(4194304);
parent.mostCurrent._jobget12hour.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://newserver.mazraeyeman.ir/mazraeyeman_proxy.php?url="),parent.mostCurrent._saelozahra.runMethod(true,"_encodeurl" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://dataservice.accuweather.com/forecasts/v1/hourly/12hour/"),parent.mostCurrent._accuweathercronjobservice._regioncode /*RemoteObject*/ ,RemoteObject.createImmutable("?metric=true&details=true&language=fa-ir&apikey="),parent.mostCurrent._accuweathercronjobservice._apiaccuweather3 /*RemoteObject*/ ))),RemoteObject.createImmutable("&amirTime="),parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"))));
 BA.debugLineNum = 1272;BA.debugLine="Log(\"Downloading: \"&	\"http://newserver.mazrae";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","43145983",RemoteObject.concat(RemoteObject.createImmutable("Downloading: "),RemoteObject.createImmutable("http://newserver.mazraeyeman.ir/mazraeyeman_proxy.php?url="),parent.mostCurrent._saelozahra.runMethod(true,"_encodeurl" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://dataservice.accuweather.com/forecasts/v1/hourly/12hour/"),parent.mostCurrent._accuweathercronjobservice._regioncode /*RemoteObject*/ ,RemoteObject.createImmutable("?metric=true&details=true&language=fa-ir&apikey="),parent.mostCurrent._accuweathercronjobservice._apiaccuweather3 /*RemoteObject*/ ))),RemoteObject.createImmutable("&amirTime="),parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")),0);
 if (true) break;

case 123:
//C
this.state = 128;
 BA.debugLineNum = 1274;BA.debugLine="JobGet12Hour.Download(	\"http://newserver.mazr";
Debug.ShouldStop(33554432);
parent.mostCurrent._jobget12hour.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://newserver.mazraeyeman.ir/mazraeyeman_proxy.php?url="),parent.mostCurrent._saelozahra.runMethod(true,"_encodeurl" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://dataservice.accuweather.com/forecasts/v1/hourly/12hour/"),parent.mostCurrent._accuweathercronjobservice._regioncode /*RemoteObject*/ ,RemoteObject.createImmutable("?metric=true&details=true&language=fa-ir&apikey="),parent.mostCurrent._accuweathercronjobservice._apiaccuweather4 /*RemoteObject*/ ))),RemoteObject.createImmutable("&amirTime="),parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"))));
 BA.debugLineNum = 1275;BA.debugLine="Log(\"Downloading: \"&	\"http://newserver.mazrae";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","43145986",RemoteObject.concat(RemoteObject.createImmutable("Downloading: "),RemoteObject.createImmutable("http://newserver.mazraeyeman.ir/mazraeyeman_proxy.php?url="),parent.mostCurrent._saelozahra.runMethod(true,"_encodeurl" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://dataservice.accuweather.com/forecasts/v1/hourly/12hour/"),parent.mostCurrent._accuweathercronjobservice._regioncode /*RemoteObject*/ ,RemoteObject.createImmutable("?metric=true&details=true&language=fa-ir&apikey="),parent.mostCurrent._accuweathercronjobservice._apiaccuweather4 /*RemoteObject*/ ))),RemoteObject.createImmutable("&amirTime="),parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")),0);
 if (true) break;

case 125:
//C
this.state = 128;
 BA.debugLineNum = 1277;BA.debugLine="JobGet12Hour.Download(	\"http://newserver.mazr";
Debug.ShouldStop(268435456);
parent.mostCurrent._jobget12hour.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://newserver.mazraeyeman.ir/mazraeyeman_proxy.php?url="),parent.mostCurrent._saelozahra.runMethod(true,"_encodeurl" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://dataservice.accuweather.com/forecasts/v1/hourly/12hour/"),parent.mostCurrent._accuweathercronjobservice._regioncode /*RemoteObject*/ ,RemoteObject.createImmutable("?metric=true&details=true&language=fa-ir&apikey="),parent.mostCurrent._accuweathercronjobservice._apiaccuweather5 /*RemoteObject*/ ))),RemoteObject.createImmutable("&amirTime="),parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"))));
 BA.debugLineNum = 1278;BA.debugLine="Log(\"Downloading: \"&	\"http://newserver.mazrae";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","43145989",RemoteObject.concat(RemoteObject.createImmutable("Downloading: "),RemoteObject.createImmutable("http://newserver.mazraeyeman.ir/mazraeyeman_proxy.php?url="),parent.mostCurrent._saelozahra.runMethod(true,"_encodeurl" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://dataservice.accuweather.com/forecasts/v1/hourly/12hour/"),parent.mostCurrent._accuweathercronjobservice._regioncode /*RemoteObject*/ ,RemoteObject.createImmutable("?metric=true&details=true&language=fa-ir&apikey="),parent.mostCurrent._accuweathercronjobservice._apiaccuweather5 /*RemoteObject*/ ))),RemoteObject.createImmutable("&amirTime="),parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")),0);
 if (true) break;

case 127:
//C
this.state = 128;
 BA.debugLineNum = 1280;BA.debugLine="JobGet12Hour.Download(	\"http://newserver.mazr";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._jobget12hour.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://newserver.mazraeyeman.ir/mazraeyeman_proxy.php?url="),parent.mostCurrent._saelozahra.runMethod(true,"_encodeurl" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://dataservice.accuweather.com/forecasts/v1/hourly/12hour/"),parent.mostCurrent._accuweathercronjobservice._regioncode /*RemoteObject*/ ,RemoteObject.createImmutable("?metric=true&details=true&language=fa-ir&apikey="),parent.mostCurrent._accuweathercronjobservice._apiaccuweather /*RemoteObject*/ ))),RemoteObject.createImmutable("&amirTime="),parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"))));
 BA.debugLineNum = 1281;BA.debugLine="Log(\"Downloading: \"&	\"http://newserver.mazrae";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","43145992",RemoteObject.concat(RemoteObject.createImmutable("Downloading: "),RemoteObject.createImmutable("http://newserver.mazraeyeman.ir/mazraeyeman_proxy.php?url="),parent.mostCurrent._saelozahra.runMethod(true,"_encodeurl" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://dataservice.accuweather.com/forecasts/v1/hourly/12hour/"),parent.mostCurrent._accuweathercronjobservice._regioncode /*RemoteObject*/ ,RemoteObject.createImmutable("?metric=true&details=true&language=fa-ir&apikey="),parent.mostCurrent._accuweathercronjobservice._apiaccuweather /*RemoteObject*/ ))),RemoteObject.createImmutable("&amirTime="),parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")),0);
 if (true) break;

case 128:
//C
this.state = 129;
;
 if (true) break;

case 129:
//C
this.state = 130;
;
 BA.debugLineNum = 1286;BA.debugLine="LogColor(Job.ErrorMessage,Colors.Magenta)";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","43145997",_job.getField(true,"_errormessage" /*RemoteObject*/ ),parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Magenta"));
 if (true) break;

case 130:
//C
this.state = -1;
;
 BA.debugLineNum = 1290;BA.debugLine="Job.Release";
Debug.ShouldStop(512);
_job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 1292;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
public static void  _lv_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("lv_ItemClick (homeact) ","homeact",3,homeact.mostCurrent.activityBA,homeact.mostCurrent,738);
if (RapidSub.canDelegate("lv_itemclick")) { ir.saelozahra.damaara.mazraeyeman.homeact.remoteMe.runUserSub(false, "homeact","lv_itemclick", _position, _value); return;}
ResumableSub_lv_ItemClick rsub = new ResumableSub_lv_ItemClick(null,_position,_value);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_lv_ItemClick extends BA.ResumableSub {
public ResumableSub_lv_ItemClick(ir.saelozahra.damaara.mazraeyeman.homeact parent,RemoteObject _position,RemoteObject _value) {
this.parent = parent;
this._position = _position;
this._value = _value;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.saelozahra.damaara.mazraeyeman.homeact parent;
RemoteObject _position;
RemoteObject _value;
RemoteObject _filename = RemoteObject.createImmutable("");
RemoteObject _email = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone.Email");
RemoteObject _in = RemoteObject.declareNull("anywheresoftware.b4a.objects.IntentWrapper");
RemoteObject _result = RemoteObject.createImmutable(false);
RemoteObject _resultsssss = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("lv_ItemClick (homeact) ","homeact",3,homeact.mostCurrent.activityBA,homeact.mostCurrent,738);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 739;BA.debugLine="Select Value";
Debug.ShouldStop(4);
if (true) break;

case 1:
//select
this.state = 50;
switch (BA.switchObjectToInt(_value,RemoteObject.createImmutable(("share")),RemoteObject.createImmutable(("karshenasan")),RemoteObject.createImmutable(("sandoghbime")),RemoteObject.createImmutable(("myproducts")),RemoteObject.createImmutable(("edit_user")),RemoteObject.createImmutable(("update")),RemoteObject.createImmutable(("sabtemahsool")),RemoteObject.createImmutable(("Weather")),RemoteObject.createImmutable(("Notification")),RemoteObject.createImmutable(("support")),RemoteObject.createImmutable(("unsubscribeUssd")),RemoteObject.createImmutable(("exit")))) {
case 0: {
this.state = 3;
if (true) break;
}
case 1: {
this.state = 11;
if (true) break;
}
case 2: {
this.state = 13;
if (true) break;
}
case 3: {
this.state = 15;
if (true) break;
}
case 4: {
this.state = 17;
if (true) break;
}
case 5: {
this.state = 19;
if (true) break;
}
case 6: {
this.state = 21;
if (true) break;
}
case 7: {
this.state = 23;
if (true) break;
}
case 8: {
this.state = 31;
if (true) break;
}
case 9: {
this.state = 39;
if (true) break;
}
case 10: {
this.state = 47;
if (true) break;
}
case 11: {
this.state = 49;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 742;BA.debugLine="Try";
Debug.ShouldStop(32);
if (true) break;

case 4:
//try
this.state = 9;
this.catchState = 8;
this.state = 6;
if (true) break;

case 6:
//C
this.state = 9;
this.catchState = 8;
 BA.debugLineNum = 745;BA.debugLine="Dim FileName As String = \"ads_mockup.jpg\"";
Debug.ShouldStop(256);
_filename = BA.ObjectToString("ads_mockup.jpg");Debug.locals.put("FileName", _filename);Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 747;BA.debugLine="File.Copy(File.DirAssets, FileName, Provider.S";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(_filename),(Object)(parent._provider.getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_filename));
 BA.debugLineNum = 748;BA.debugLine="Dim email As Email";
Debug.ShouldStop(2048);
_email = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.Email");Debug.locals.put("email", _email);
 BA.debugLineNum = 750;BA.debugLine="email.Subject = \"مزرعه من\"";
Debug.ShouldStop(8192);
_email.setField ("Subject",BA.ObjectToString("مزرعه من"));
 BA.debugLineNum = 751;BA.debugLine="email.Body    = \"نسخه آخر نرم افزار \"&Applicat";
Debug.ShouldStop(16384);
_email.setField ("Body",RemoteObject.concat(RemoteObject.createImmutable("نسخه آخر نرم افزار "),parent.mostCurrent.__c.getField(false,"Application").runMethod(true,"getLabelName"),RemoteObject.createImmutable(" را از "),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("mazraeyeman.ir/application"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("دریافت کنید."),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("🌹🌷💐")));
 BA.debugLineNum = 752;BA.debugLine="email.Attachments.Add(Provider.GetFileUri(File";
Debug.ShouldStop(32768);
_email.getField(false,"Attachments").runVoidMethod ("Add",(Object)(parent._provider.runClassMethod (ir.saelozahra.damaara.mazraeyeman.fileprovider.class, "_getfileuri" /*RemoteObject*/ ,(Object)(_filename))));
 BA.debugLineNum = 753;BA.debugLine="Dim in As Intent = email.GetIntent";
Debug.ShouldStop(65536);
_in = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");
_in = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.IntentWrapper"), _email.runMethod(false,"GetIntent"));Debug.locals.put("in", _in);Debug.locals.put("in", _in);
 BA.debugLineNum = 754;BA.debugLine="in.Flags = 1 'FLAG_GRANT_READ_URI_PERMISSION";
Debug.ShouldStop(131072);
_in.runMethod(true,"setFlags",BA.numberCast(int.class, 1));
 BA.debugLineNum = 755;BA.debugLine="StartActivity(in)";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",homeact.processBA,(Object)((_in.getObject())));
 Debug.CheckDeviceExceptions();
if (true) break;

case 8:
//C
this.state = 9;
this.catchState = 0;
 BA.debugLineNum = 757;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","42490387",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",homeact.mostCurrent.activityBA)),0);
 BA.debugLineNum = 758;BA.debugLine="SaeloZahra.intent1.Initialize(SaeloZahra.inten";
Debug.ShouldStop(2097152);
parent.mostCurrent._saelozahra._intent1 /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(parent.mostCurrent._saelozahra._intent1 /*RemoteObject*/ .getField(true,"ACTION_SEND")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 759;BA.debugLine="SaeloZahra.intent1.SetType(\"text/plain\")";
Debug.ShouldStop(4194304);
parent.mostCurrent._saelozahra._intent1 /*RemoteObject*/ .runVoidMethod ("SetType",(Object)(RemoteObject.createImmutable("text/plain")));
 BA.debugLineNum = 760;BA.debugLine="SaeloZahra.intent1.PutExtra(\"android.intent.ex";
Debug.ShouldStop(8388608);
parent.mostCurrent._saelozahra._intent1 /*RemoteObject*/ .runVoidMethod ("PutExtra",(Object)(BA.ObjectToString("android.intent.extra.TEXT")),(Object)((RemoteObject.concat(RemoteObject.createImmutable("نسخه آخر نرم افزار "),parent.mostCurrent.__c.getField(false,"Application").runMethod(true,"getLabelName"),RemoteObject.createImmutable(" را از "),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("mazraeyeman.ir/application"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("دریافت کنید."),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("🌹🌷💐")))));
 BA.debugLineNum = 761;BA.debugLine="SaeloZahra.intent1.WrapAsIntentChooser(\"اشتراک";
Debug.ShouldStop(16777216);
parent.mostCurrent._saelozahra._intent1 /*RemoteObject*/ .runVoidMethod ("WrapAsIntentChooser",(Object)(RemoteObject.createImmutable("اشتراک گذاری نرم افزار")));
 BA.debugLineNum = 762;BA.debugLine="StartActivity(SaeloZahra.intent1)";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",homeact.processBA,(Object)((parent.mostCurrent._saelozahra._intent1 /*RemoteObject*/ .getObject())));
 if (true) break;
if (true) break;

case 9:
//C
this.state = 50;
this.catchState = 0;
;
 if (true) break;

case 11:
//C
this.state = 50;
 BA.debugLineNum = 766;BA.debugLine="customBrowser.CreateNewTab(\"https://mazraeyeman";
Debug.ShouldStop(536870912);
parent.mostCurrent._custombrowser.runVoidMethod ("CreateNewTab",(Object)(RemoteObject.createImmutable("https://mazraeyeman.ir/%d8%a8%d8%ae%d8%b4-%da%a9%d8%a7%d8%b1%d8%b4%d9%86%d8%a7%d8%b3%d8%a7%d9%86/")));
 if (true) break;

case 13:
//C
this.state = 50;
 BA.debugLineNum = 769;BA.debugLine="customBrowser.CreateNewTab(\"http://www.sbkiran.";
Debug.ShouldStop(1);
parent.mostCurrent._custombrowser.runVoidMethod ("CreateNewTab",(Object)(RemoteObject.createImmutable("http://www.sbkiran.ir/")));
 if (true) break;

case 15:
//C
this.state = 50;
 BA.debugLineNum = 772;BA.debugLine="SH.convertActivityFromTranslucent";
Debug.ShouldStop(8);
parent.mostCurrent._sh.runVoidMethod ("convertActivityFromTranslucent",homeact.mostCurrent.activityBA);
 BA.debugLineNum = 773;BA.debugLine="MahsoulListAct.ListType = \"my\"";
Debug.ShouldStop(16);
parent.mostCurrent._mahsoullistact._listtype /*RemoteObject*/  = BA.ObjectToString("my");
 BA.debugLineNum = 774;BA.debugLine="StartActivity(MahsoulListAct)";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",homeact.processBA,(Object)((parent.mostCurrent._mahsoullistact.getObject())));
 if (true) break;

case 17:
//C
this.state = 50;
 BA.debugLineNum = 776;BA.debugLine="SH.convertActivityFromTranslucent";
Debug.ShouldStop(128);
parent.mostCurrent._sh.runVoidMethod ("convertActivityFromTranslucent",homeact.mostCurrent.activityBA);
 BA.debugLineNum = 777;BA.debugLine="RegisterAct.ActType = \"edit\"";
Debug.ShouldStop(256);
parent.mostCurrent._registeract._acttype /*RemoteObject*/  = BA.ObjectToString("edit");
 BA.debugLineNum = 778;BA.debugLine="StartActivity(RegisterAct)";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",homeact.processBA,(Object)((parent.mostCurrent._registeract.getObject())));
 if (true) break;

case 19:
//C
this.state = 50;
 BA.debugLineNum = 781;BA.debugLine="Wait For (CheckInstallationRequirements) Comple";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", homeact.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "homeact", "lv_itemclick"), _checkinstallationrequirements());
this.state = 51;
return;
case 51:
//C
this.state = 50;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 784;BA.debugLine="ProgressDialogShow(SaeloZahra.CSB(\"کمی صبر کنید";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",homeact.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(parent.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("کمی صبر کنید"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("در حال بروزرسانی")))).getObject())));
 BA.debugLineNum = 786;BA.debugLine="apkupdt.UpdateApk(Result) 'checks for newer apk";
Debug.ShouldStop(131072);
parent.mostCurrent._apkupdt.runClassMethod (ir.saelozahra.damaara.mazraeyeman.cl_appupdate.class, "_updateapk" /*void*/ ,(Object)(_result));
 if (true) break;

case 21:
//C
this.state = 50;
 BA.debugLineNum = 789;BA.debugLine="SH.convertActivityFromTranslucent";
Debug.ShouldStop(1048576);
parent.mostCurrent._sh.runVoidMethod ("convertActivityFromTranslucent",homeact.mostCurrent.activityBA);
 BA.debugLineNum = 790;BA.debugLine="StartActivity(SabteMahsoolAct)";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",homeact.processBA,(Object)((parent.mostCurrent._sabtemahsoolact.getObject())));
 if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 792;BA.debugLine="If login_act.ItIsPayed Then";
Debug.ShouldStop(8388608);
if (true) break;

case 24:
//if
this.state = 29;
if (parent.mostCurrent._login_act._itispayed /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
this.state = 26;
}else {
this.state = 28;
}if (true) break;

case 26:
//C
this.state = 29;
 BA.debugLineNum = 793;BA.debugLine="SH.convertActivityFromTranslucent";
Debug.ShouldStop(16777216);
parent.mostCurrent._sh.runVoidMethod ("convertActivityFromTranslucent",homeact.mostCurrent.activityBA);
 BA.debugLineNum = 794;BA.debugLine="StartActivity(WeatherNewAct)";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",homeact.processBA,(Object)((parent.mostCurrent._weathernewact.getObject())));
 if (true) break;

case 28:
//C
this.state = 29;
 BA.debugLineNum = 796;BA.debugLine="ShowPardakhtModal";
Debug.ShouldStop(134217728);
_showpardakhtmodal();
 if (true) break;

case 29:
//C
this.state = 50;
;
 if (true) break;

case 31:
//C
this.state = 32;
 BA.debugLineNum = 799;BA.debugLine="If login_act.ItIsPayed Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 32:
//if
this.state = 37;
if (parent.mostCurrent._login_act._itispayed /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
this.state = 34;
}else {
this.state = 36;
}if (true) break;

case 34:
//C
this.state = 37;
 BA.debugLineNum = 800;BA.debugLine="SH.convertActivityFromTranslucent";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._sh.runVoidMethod ("convertActivityFromTranslucent",homeact.mostCurrent.activityBA);
 BA.debugLineNum = 801;BA.debugLine="StartActivity(NotificationAct)";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",homeact.processBA,(Object)((parent.mostCurrent._notificationact.getObject())));
 if (true) break;

case 36:
//C
this.state = 37;
 BA.debugLineNum = 803;BA.debugLine="ShowPardakhtModal";
Debug.ShouldStop(4);
_showpardakhtmodal();
 if (true) break;

case 37:
//C
this.state = 50;
;
 if (true) break;

case 39:
//C
this.state = 40;
 BA.debugLineNum = 807;BA.debugLine="Msgbox2Async(\"با کدوم بخش پشتیبانی کار دارید؟\",";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("با کدوم بخش پشتیبانی کار دارید؟")),(Object)(BA.ObjectToCharSequence("پشتیبانی تلفنی")),(Object)(BA.ObjectToString("پشتیبانی فنی")),(Object)(BA.ObjectToString("لغو")),(Object)(BA.ObjectToString("پشتیبانی سامانه")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.mostCurrent.__c.getField(false,"Null")),homeact.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 808;BA.debugLine="Wait For Msgbox_Result (Resultsssss As Int)";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", homeact.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "homeact", "lv_itemclick"), null);
this.state = 52;
return;
case 52:
//C
this.state = 40;
_resultsssss = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Resultsssss", _resultsssss);
;
 BA.debugLineNum = 809;BA.debugLine="If Resultsssss = DialogResponse.POSITIVE Then";
Debug.ShouldStop(256);
if (true) break;

case 40:
//if
this.state = 45;
if (RemoteObject.solveBoolean("=",_resultsssss,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 42;
}else 
{ BA.debugLineNum = 812;BA.debugLine="else If Resultsssss = DialogResponse.NEGATIVE T";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_resultsssss,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"NEGATIVE")))) { 
this.state = 44;
}}
if (true) break;

case 42:
//C
this.state = 45;
 BA.debugLineNum = 810;BA.debugLine="SaeloZahra.intent1.Initialize(SaeloZahra.inten";
Debug.ShouldStop(512);
parent.mostCurrent._saelozahra._intent1 /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(parent.mostCurrent._saelozahra._intent1 /*RemoteObject*/ .getField(true,"ACTION_VIEW")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("tel:"),parent.mostCurrent._saelozahra._supportnumber /*RemoteObject*/ )));
 BA.debugLineNum = 811;BA.debugLine="StartActivity(SaeloZahra.intent1)";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",homeact.processBA,(Object)((parent.mostCurrent._saelozahra._intent1 /*RemoteObject*/ .getObject())));
 if (true) break;

case 44:
//C
this.state = 45;
 BA.debugLineNum = 813;BA.debugLine="SaeloZahra.intent1.Initialize(SaeloZahra.inten";
Debug.ShouldStop(4096);
parent.mostCurrent._saelozahra._intent1 /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(parent.mostCurrent._saelozahra._intent1 /*RemoteObject*/ .getField(true,"ACTION_VIEW")),(Object)(RemoteObject.createImmutable("tel: 09173842588")));
 BA.debugLineNum = 814;BA.debugLine="StartActivity(SaeloZahra.intent1)";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",homeact.processBA,(Object)((parent.mostCurrent._saelozahra._intent1 /*RemoteObject*/ .getObject())));
 if (true) break;

case 45:
//C
this.state = 50;
;
 if (true) break;

case 47:
//C
this.state = 50;
 BA.debugLineNum = 824;BA.debugLine="SaeloZahra.intent1.Initialize(SaeloZahra.intent";
Debug.ShouldStop(8388608);
parent.mostCurrent._saelozahra._intent1 /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(parent.mostCurrent._saelozahra._intent1 /*RemoteObject*/ .getField(true,"ACTION_VIEW")),(Object)(RemoteObject.createImmutable("tel:*800#")));
 BA.debugLineNum = 825;BA.debugLine="StartActivity(SaeloZahra.intent1)";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",homeact.processBA,(Object)((parent.mostCurrent._saelozahra._intent1 /*RemoteObject*/ .getObject())));
 if (true) break;

case 49:
//C
this.state = 50;
 BA.debugLineNum = 839;BA.debugLine="ExitApplication";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("ExitApplication");
 if (true) break;

case 50:
//C
this.state = -1;
;
 BA.debugLineNum = 842;BA.debugLine="End Sub";
Debug.ShouldStop(512);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",homeact.processBA, e0.toString());}
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
public static void  _complete(RemoteObject _result) throws Exception{
}
public static RemoteObject  _modalbuilder_buttonpressed(RemoteObject _dialog,RemoteObject _action) throws Exception{
try {
		Debug.PushSubsStack("ModalBuilder_ButtonPressed (homeact) ","homeact",3,homeact.mostCurrent.activityBA,homeact.mostCurrent,1746);
if (RapidSub.canDelegate("modalbuilder_buttonpressed")) { return ir.saelozahra.damaara.mazraeyeman.homeact.remoteMe.runUserSub(false, "homeact","modalbuilder_buttonpressed", _dialog, _action);}
Debug.locals.put("Dialog", _dialog);
Debug.locals.put("Action", _action);
 BA.debugLineNum = 1746;BA.debugLine="Sub ModalBuilder_ButtonPressed (Dialog As Material";
Debug.ShouldStop(131072);
 BA.debugLineNum = 1747;BA.debugLine="Select Action";
Debug.ShouldStop(262144);
switch (BA.switchObjectToInt(_action,_dialog.getField(true,"ACTION_POSITIVE"),_dialog.getField(true,"ACTION_NEUTRAL"))) {
case 0: {
 BA.debugLineNum = 1750;BA.debugLine="Log(\"Positive Button pressed\")";
Debug.ShouldStop(2097152);
homeact.mostCurrent.__c.runVoidMethod ("LogImpl","44128772",RemoteObject.createImmutable("Positive Button pressed"),0);
 BA.debugLineNum = 1751;BA.debugLine="customBrowser.CreateNewTab(SaeloZahra.json_url&";
Debug.ShouldStop(4194304);
homeact.mostCurrent._custombrowser.runVoidMethod ("CreateNewTab",(Object)(RemoteObject.concat(homeact.mostCurrent._saelozahra._json_url /*RemoteObject*/ ,RemoteObject.createImmutable("pec_pay/payment.php?aftertrial=true&tel="),homeact.mostCurrent._starter._usrnm /*RemoteObject*/ ,RemoteObject.createImmutable("&Amount="),homeact.mostCurrent._registeract._gheimatkamel /*RemoteObject*/ ,RemoteObject.createImmutable("0&OrderId="),homeact.mostCurrent.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 999))),homeact.mostCurrent._starter._usrnm /*RemoteObject*/ ,homeact.mostCurrent.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 100)),(Object)(BA.numberCast(int.class, 999))))));
 break; }
case 1: {
 BA.debugLineNum = 1760;BA.debugLine="Log(\"Neutral Button pressed\")";
Debug.ShouldStop(-2147483648);
homeact.mostCurrent.__c.runVoidMethod ("LogImpl","44128782",RemoteObject.createImmutable("Neutral Button pressed"),0);
 break; }
}
;
 BA.debugLineNum = 1763;BA.debugLine="Log(\"CheckBox: \" & Dialog.PromptCheckBoxChecked)";
Debug.ShouldStop(4);
homeact.mostCurrent.__c.runVoidMethod ("LogImpl","44128785",RemoteObject.concat(RemoteObject.createImmutable("CheckBox: "),_dialog.runMethod(true,"getPromptCheckBoxChecked")),0);
 BA.debugLineNum = 1764;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _multimediawv_overrideurl(RemoteObject _url) throws Exception{
try {
		Debug.PushSubsStack("MultiMediaWv_OverrideUrl (homeact) ","homeact",3,homeact.mostCurrent.activityBA,homeact.mostCurrent,1295);
if (RapidSub.canDelegate("multimediawv_overrideurl")) { return ir.saelozahra.damaara.mazraeyeman.homeact.remoteMe.runUserSub(false, "homeact","multimediawv_overrideurl", _url);}
Debug.locals.put("Url", _url);
 BA.debugLineNum = 1295;BA.debugLine="Sub MultiMediaWv_OverrideUrl (Url As String) As Bo";
Debug.ShouldStop(16384);
 BA.debugLineNum = 1297;BA.debugLine="If MultiMediaWv.Tag <> \"salam\" Then ProgressDialo";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("!",homeact.mostCurrent._multimediawv.runMethod(false,"getTag"),RemoteObject.createImmutable(("salam")))) { 
homeact.mostCurrent.__c.runVoidMethod ("ProgressDialogShow2",homeact.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(homeact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("در حال بارگزاری رسانه ها"))).getObject())),(Object)(homeact.mostCurrent.__c.getField(true,"True")));};
 BA.debugLineNum = 1298;BA.debugLine="MultiMediaWv.Tag = \"bia\"";
Debug.ShouldStop(131072);
homeact.mostCurrent._multimediawv.runMethod(false,"setTag",RemoteObject.createImmutable(("bia")));
 BA.debugLineNum = 1299;BA.debugLine="Log(Url)";
Debug.ShouldStop(262144);
homeact.mostCurrent.__c.runVoidMethod ("LogImpl","43211268",_url,0);
 BA.debugLineNum = 1300;BA.debugLine="If Url==\"http://porbazdid/\" Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_url,BA.ObjectToString("http://porbazdid/"))) { 
 BA.debugLineNum = 1301;BA.debugLine="Return True";
Debug.ShouldStop(1048576);
if (true) return homeact.mostCurrent.__c.getField(true,"True");
 }else 
{ BA.debugLineNum = 1302;BA.debugLine="else If Url==\"http://porbahs/\" Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_url,BA.ObjectToString("http://porbahs/"))) { 
 BA.debugLineNum = 1303;BA.debugLine="Return True";
Debug.ShouldStop(4194304);
if (true) return homeact.mostCurrent.__c.getField(true,"True");
 }else 
{ BA.debugLineNum = 1308;BA.debugLine="else If Url.Contains(\"http://cat_id:\") Then";
Debug.ShouldStop(134217728);
if (_url.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("http://cat_id:"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1309;BA.debugLine="ToastMessageShow( Url.Replace(\"http://cat_id:\",\"";
Debug.ShouldStop(268435456);
homeact.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(_url.runMethod(true,"replace",(Object)(BA.ObjectToString("http://cat_id:")),(Object)(RemoteObject.createImmutable(""))).runMethod(true,"replace",(Object)(BA.ObjectToString("/")),(Object)(RemoteObject.createImmutable(""))))),(Object)(homeact.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 1310;BA.debugLine="Return True";
Debug.ShouldStop(536870912);
if (true) return homeact.mostCurrent.__c.getField(true,"True");
 }else 
{ BA.debugLineNum = 1311;BA.debugLine="else If Url.Contains(\"http://singleid:\") Then";
Debug.ShouldStop(1073741824);
if (_url.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("http://singleid:"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1312;BA.debugLine="ProgressDialogShow(SaeloZahra.CSB(\"در حال بارگزا";
Debug.ShouldStop(-2147483648);
homeact.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",homeact.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(homeact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("در حال بارگزاری"))).getObject())));
 BA.debugLineNum = 1313;BA.debugLine="Log(SaeloZahra.json_url&\"post.php?type=html&id=\"";
Debug.ShouldStop(1);
homeact.mostCurrent.__c.runVoidMethod ("LogImpl","43211282",RemoteObject.concat(homeact.mostCurrent._saelozahra._json_url /*RemoteObject*/ ,RemoteObject.createImmutable("post.php?type=html&id="),_url.runMethod(true,"replace",(Object)(BA.ObjectToString("http://singleid:")),(Object)(RemoteObject.createImmutable(""))).runMethod(true,"replace",(Object)(BA.ObjectToString("/")),(Object)(RemoteObject.createImmutable("")))),0);
 BA.debugLineNum = 1314;BA.debugLine="jobSingleVideo.Tag = Url.Replace(\"http://singlei";
Debug.ShouldStop(2);
homeact.mostCurrent._jobsinglevideo.setField ("_tag" /*RemoteObject*/ ,(_url.runMethod(true,"replace",(Object)(BA.ObjectToString("http://singleid:")),(Object)(RemoteObject.createImmutable(""))).runMethod(true,"replace",(Object)(BA.ObjectToString("/")),(Object)(RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1315;BA.debugLine="jobSingleVideo.Download(SaeloZahra.json_url&\"pos";
Debug.ShouldStop(4);
homeact.mostCurrent._jobsinglevideo.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.concat(homeact.mostCurrent._saelozahra._json_url /*RemoteObject*/ ,RemoteObject.createImmutable("post.php?type=html&id="),_url.runMethod(true,"replace",(Object)(BA.ObjectToString("http://singleid:")),(Object)(RemoteObject.createImmutable(""))).runMethod(true,"replace",(Object)(BA.ObjectToString("/")),(Object)(RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 1316;BA.debugLine="Return True";
Debug.ShouldStop(8);
if (true) return homeact.mostCurrent.__c.getField(true,"True");
 }else {
 BA.debugLineNum = 1318;BA.debugLine="Return False";
Debug.ShouldStop(32);
if (true) return homeact.mostCurrent.__c.getField(true,"False");
 }}}}
;
 BA.debugLineNum = 1320;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _multimediawv_pagefinished(RemoteObject _url) throws Exception{
try {
		Debug.PushSubsStack("MultiMediaWv_PageFinished (homeact) ","homeact",3,homeact.mostCurrent.activityBA,homeact.mostCurrent,1322);
if (RapidSub.canDelegate("multimediawv_pagefinished")) { return ir.saelozahra.damaara.mazraeyeman.homeact.remoteMe.runUserSub(false, "homeact","multimediawv_pagefinished", _url);}
Debug.locals.put("Url", _url);
 BA.debugLineNum = 1322;BA.debugLine="Sub MultiMediaWv_PageFinished (Url As String)";
Debug.ShouldStop(512);
 BA.debugLineNum = 1323;BA.debugLine="Try";
Debug.ShouldStop(1024);
try { BA.debugLineNum = 1324;BA.debugLine="If SwipeMultiMedia.IsInitialized Then SwipeMulti";
Debug.ShouldStop(2048);
if (homeact.mostCurrent._swipemultimedia.runMethod(true,"IsInitialized" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
homeact.mostCurrent._swipemultimedia.runClassMethod (ir.saelozahra.damaara.mazraeyeman.wvswipe.class, "_refreshcompleted" /*RemoteObject*/ );};
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e4) {
			BA.rdebugUtils.runVoidMethod("setLastException",homeact.processBA, e4.toString()); BA.debugLineNum = 1326;BA.debugLine="Log(\"3333333333333333333\")";
Debug.ShouldStop(8192);
homeact.mostCurrent.__c.runVoidMethod ("LogImpl","43276804",RemoteObject.createImmutable("3333333333333333333"),0);
 BA.debugLineNum = 1327;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16384);
homeact.mostCurrent.__c.runVoidMethod ("LogImpl","43276805",BA.ObjectToString(homeact.mostCurrent.__c.runMethod(false,"LastException",homeact.mostCurrent.activityBA)),0);
 };
 BA.debugLineNum = 1329;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(65536);
homeact.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 1330;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Dim SQL1 As SQL";
homeact._sql1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");
 //BA.debugLineNum = 10;BA.debugLine="Dim cu1 As Cursor";
homeact._cu1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 //BA.debugLineNum = 11;BA.debugLine="Dim listItemHeightMSG As Int = 72dip";
homeact._listitemheightmsg = homeact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 72)));
 //BA.debugLineNum = 12;BA.debugLine="Dim listItemHeightBazarche As Int = 110dip";
homeact._listitemheightbazarche = homeact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 110)));
 //BA.debugLineNum = 13;BA.debugLine="Dim PlaceList As List";
homeact._placelist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 14;BA.debugLine="Dim mapProductName As Map";
homeact._mapproductname = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 15;BA.debugLine="Dim WindSpeedValue,NowWind As String'RainProbabil";
homeact._windspeedvalue = RemoteObject.createImmutable("");
homeact._nowwind = RemoteObject.createImmutable("");
 //BA.debugLineNum = 16;BA.debugLine="Dim Next12HDamaha,Next12HFaghatDama,Next12HWindha";
homeact._next12hdamaha = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
homeact._next12hfaghatdama = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
homeact._next12hwindha = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 17;BA.debugLine="Dim RelativeHumidity,UVIndex As String";
homeact._relativehumidity = RemoteObject.createImmutable("");
homeact._uvindex = RemoteObject.createImmutable("");
 //BA.debugLineNum = 18;BA.debugLine="Dim DewPointValue,SnowValue,RainValue As Double";
homeact._dewpointvalue = RemoteObject.createImmutable(0);
homeact._snowvalue = RemoteObject.createImmutable(0);
homeact._rainvalue = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 19;BA.debugLine="Dim Provider As FileProvider";
homeact._provider = RemoteObject.createNew ("ir.saelozahra.damaara.mazraeyeman.fileprovider");
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _restartact() throws Exception{
try {
		Debug.PushSubsStack("RestartAct (homeact) ","homeact",3,homeact.mostCurrent.activityBA,homeact.mostCurrent,1012);
if (RapidSub.canDelegate("restartact")) { return ir.saelozahra.damaara.mazraeyeman.homeact.remoteMe.runUserSub(false, "homeact","restartact");}
 BA.debugLineNum = 1012;BA.debugLine="Sub RestartAct";
Debug.ShouldStop(524288);
 BA.debugLineNum = 1013;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1048576);
homeact.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 1014;BA.debugLine="StartActivity(Me)";
Debug.ShouldStop(2097152);
homeact.mostCurrent.__c.runVoidMethod ("StartActivity",homeact.processBA,(Object)(homeact.getObject()));
 BA.debugLineNum = 1015;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _search_querysubmitted(RemoteObject _query) throws Exception{
try {
		Debug.PushSubsStack("search_QuerySubmitted (homeact) ","homeact",3,homeact.mostCurrent.activityBA,homeact.mostCurrent,953);
if (RapidSub.canDelegate("search_querysubmitted")) { return ir.saelozahra.damaara.mazraeyeman.homeact.remoteMe.runUserSub(false, "homeact","search_querysubmitted", _query);}
Debug.locals.put("Query", _query);
 BA.debugLineNum = 953;BA.debugLine="Sub search_QuerySubmitted (Query As String)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 955;BA.debugLine="sv.Iconfied = True";
Debug.ShouldStop(67108864);
homeact.mostCurrent._sv.runMethod(true,"setIconfied",homeact.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 956;BA.debugLine="si.ItemCollapsed = True";
Debug.ShouldStop(134217728);
homeact.mostCurrent._si.runMethod(true,"setItemCollapsed",homeact.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 957;BA.debugLine="If sv.QueryHint == \"جستجو در بازارچه\" Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",homeact.mostCurrent._sv.runMethod(true,"getQueryHint"),BA.ObjectToString("جستجو در بازارچه"))) { 
 BA.debugLineNum = 958;BA.debugLine="JobSearch.Download(SaeloZahra.json_url&\"productf";
Debug.ShouldStop(536870912);
homeact.mostCurrent._jobsearch.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.concat(homeact.mostCurrent._saelozahra._json_url /*RemoteObject*/ ,RemoteObject.createImmutable("productfarmers_list.php?bazarche=yes&search=yes&field=title&s="),_query)));
 }else {
 BA.debugLineNum = 960;BA.debugLine="JobSearch.Download(SaeloZahra.json_url&\"post.php";
Debug.ShouldStop(-2147483648);
homeact.mostCurrent._jobsearch.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.concat(homeact.mostCurrent._saelozahra._json_url /*RemoteObject*/ ,RemoteObject.createImmutable("post.php?search="),_query)));
 };
 BA.debugLineNum = 962;BA.debugLine="ProgressDialogShow(SaeloZahra.CSB(\"در حال جستجو\")";
Debug.ShouldStop(2);
homeact.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",homeact.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(homeact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("در حال جستجو"))).getObject())));
 BA.debugLineNum = 964;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showpardakhtmodal() throws Exception{
try {
		Debug.PushSubsStack("ShowPardakhtModal (homeact) ","homeact",3,homeact.mostCurrent.activityBA,homeact.mostCurrent,1733);
if (RapidSub.canDelegate("showpardakhtmodal")) { return ir.saelozahra.damaara.mazraeyeman.homeact.remoteMe.runUserSub(false, "homeact","showpardakhtmodal");}
 BA.debugLineNum = 1733;BA.debugLine="Sub ShowPardakhtModal";
Debug.ShouldStop(16);
 BA.debugLineNum = 1734;BA.debugLine="ModalBuilder.Initialize(\"ModalBuilder\")";
Debug.ShouldStop(32);
homeact.mostCurrent._modalbuilder.runVoidMethod ("Initialize",homeact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("ModalBuilder")));
 BA.debugLineNum = 1736;BA.debugLine="ModalBuilder.Title(SaeloZahra.CSB(\"پرداخت حق عضوی";
Debug.ShouldStop(128);
homeact.mostCurrent._modalbuilder.runVoidMethod ("Title",(Object)(BA.ObjectToCharSequence(homeact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("پرداخت حق عضویت"))).getObject())));
 BA.debugLineNum = 1738;BA.debugLine="ModalBuilder.Content(SaeloZahra.CSB($\"دوره آزمایش";
Debug.ShouldStop(512);
homeact.mostCurrent._modalbuilder.runVoidMethod ("Content",(Object)(BA.ObjectToCharSequence(homeact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("دوره آزمایشی شما تمام شد "),homeact.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((homeact.mostCurrent.__c.getField(true,"CRLF")))),RemoteObject.createImmutable(" برای دسترسی کامل به تمام بخش‌های سامانه مبلغ "),homeact.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((homeact.mostCurrent._registeract._gheimatkamel /*RemoteObject*/ ))),RemoteObject.createImmutable(" تومان پرداخت کنید "))))).getObject())));
 BA.debugLineNum = 1739;BA.debugLine="ModalBuilder.PositiveText(\"پرداخت حق عضویـــــت\")";
Debug.ShouldStop(1024);
homeact.mostCurrent._modalbuilder.runMethod(false,"PositiveText",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("پرداخت حق عضویـــــت")))).runVoidMethod ("NegativeText",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("معــــرفی افراد"))));
 BA.debugLineNum = 1740;BA.debugLine="ModalBuilder.IconRes(\"baseline_attach_money_white";
Debug.ShouldStop(2048);
homeact.mostCurrent._modalbuilder.runMethod(false,"IconRes",(Object)(RemoteObject.createImmutable("baseline_attach_money_white_24"))).runVoidMethod ("LimitIconToDefaultSize");
 BA.debugLineNum = 1741;BA.debugLine="ModalBuilder.ButtonStackedGravity(ModalBuilder.GR";
Debug.ShouldStop(4096);
homeact.mostCurrent._modalbuilder.runVoidMethod ("ButtonStackedGravity",(Object)(homeact.mostCurrent._modalbuilder.getField(false,"GRAVITY_END")));
 BA.debugLineNum = 1742;BA.debugLine="ModalBuilder.ForceStacking(True)";
Debug.ShouldStop(8192);
homeact.mostCurrent._modalbuilder.runVoidMethod ("ForceStacking",(Object)(homeact.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 1743;BA.debugLine="ModalBuilder.Show";
Debug.ShouldStop(16384);
homeact.mostCurrent._modalbuilder.runVoidMethod ("Show");
 BA.debugLineNum = 1744;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _snakesearch_click() throws Exception{
try {
		Debug.PushSubsStack("snakeSearch_Click (homeact) ","homeact",3,homeact.mostCurrent.activityBA,homeact.mostCurrent,1334);
if (RapidSub.canDelegate("snakesearch_click")) { return ir.saelozahra.damaara.mazraeyeman.homeact.remoteMe.runUserSub(false, "homeact","snakesearch_click");}
 BA.debugLineNum = 1334;BA.debugLine="Sub snakeSearch_Click()";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 1335;BA.debugLine="sv.Submit";
Debug.ShouldStop(4194304);
homeact.mostCurrent._sv.runVoidMethod ("Submit");
 BA.debugLineNum = 1336;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _update_updatecomplete() throws Exception{
try {
		Debug.PushSubsStack("update_UpdateComplete (homeact) ","homeact",3,homeact.mostCurrent.activityBA,homeact.mostCurrent,880);
if (RapidSub.canDelegate("update_updatecomplete")) { return ir.saelozahra.damaara.mazraeyeman.homeact.remoteMe.runUserSub(false, "homeact","update_updatecomplete");}
 BA.debugLineNum = 880;BA.debugLine="Sub update_UpdateComplete";
Debug.ShouldStop(32768);
 BA.debugLineNum = 881;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(65536);
homeact.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 882;BA.debugLine="LogColor($\"UpdateComplete - time: ${DateTime.Time";
Debug.ShouldStop(131072);
homeact.mostCurrent.__c.runVoidMethod ("LogImpl","42621442",(RemoteObject.concat(RemoteObject.createImmutable("UpdateComplete - time: "),homeact.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((homeact.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(homeact.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")))))),RemoteObject.createImmutable(""))),BA.numberCast(int.class, ((int)0xff556b2f)));
 BA.debugLineNum = 883;BA.debugLine="apkupdt.StopSplashScreen";
Debug.ShouldStop(262144);
homeact.mostCurrent._apkupdt.runClassMethod (ir.saelozahra.damaara.mazraeyeman.cl_appupdate.class, "_stopsplashscreen" /*RemoteObject*/ );
 BA.debugLineNum = 885;BA.debugLine="Select apkupdt.Status";
Debug.ShouldStop(1048576);
switch (BA.switchObjectToInt(homeact.mostCurrent._apkupdt.runClassMethod (ir.saelozahra.damaara.mazraeyeman.cl_appupdate.class, "_getstatus" /*RemoteObject*/ ),homeact.mostCurrent._apkupdt.getField(true,"_ok_curver" /*RemoteObject*/ ),homeact.mostCurrent._apkupdt.getField(true,"_ok_webver" /*RemoteObject*/ ),homeact.mostCurrent._apkupdt.getField(true,"_ok_newerapk" /*RemoteObject*/ ),homeact.mostCurrent._apkupdt.getField(true,"_no_newerapk" /*RemoteObject*/ ),homeact.mostCurrent._apkupdt.getField(true,"_ok_download" /*RemoteObject*/ ),homeact.mostCurrent._apkupdt.getField(true,"_ok_install" /*RemoteObject*/ ),homeact.mostCurrent._apkupdt.getField(true,"_err_noperm" /*RemoteObject*/ ))) {
case 0: {
 BA.debugLineNum = 887;BA.debugLine="MsgboxAsync(SaeloZahra.CSB($\"ورژن در حال اجرا:";
Debug.ShouldStop(4194304);
homeact.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(homeact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("ورژن در حال اجرا: "),homeact.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((homeact.mostCurrent._apkupdt.runClassMethod (ir.saelozahra.damaara.mazraeyeman.cl_appupdate.class, "_getcurvn" /*RemoteObject*/ )))),RemoteObject.createImmutable(" است "),homeact.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((homeact.mostCurrent.__c.getField(true,"CRLF")))),RemoteObject.createImmutable(""))))).getObject())),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),homeact.processBA);
 break; }
case 1: {
 BA.debugLineNum = 889;BA.debugLine="MsgboxAsync(SaeloZahra.CSB($\" نسخه آنلاین: ${ap";
Debug.ShouldStop(16777216);
homeact.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(homeact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable(" نسخه آنلاین: "),homeact.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((homeact.mostCurrent._apkupdt.runClassMethod (ir.saelozahra.damaara.mazraeyeman.cl_appupdate.class, "_getwebvn" /*RemoteObject*/ )))),RemoteObject.createImmutable(""),homeact.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((homeact.mostCurrent.__c.getField(true,"CRLF")))),RemoteObject.createImmutable(" توضیحات نسخه جدید: "),homeact.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((homeact.mostCurrent._apkupdt.runClassMethod (ir.saelozahra.damaara.mazraeyeman.cl_appupdate.class, "_getwebchangelog" /*RemoteObject*/ )))),RemoteObject.createImmutable(""),homeact.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((homeact.mostCurrent.__c.getField(true,"CRLF")))),RemoteObject.createImmutable(" حجم فایل: "),homeact.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((homeact.mostCurrent._apkupdt.runClassMethod (ir.saelozahra.damaara.mazraeyeman.cl_appupdate.class, "_getwebfilesize" /*RemoteObject*/ )))),RemoteObject.createImmutable(" "),homeact.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((homeact.mostCurrent.__c.getField(true,"CRLF")))),RemoteObject.createImmutable(""))))).getObject())),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),homeact.processBA);
 break; }
case 2: {
 BA.debugLineNum = 891;BA.debugLine="MsgboxAsync(SaeloZahra.CSB($\"نسخه جدید موجود اس";
Debug.ShouldStop(67108864);
homeact.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(homeact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)((RemoteObject.createImmutable("نسخه جدید موجود است")))).getObject())),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),homeact.processBA);
 break; }
case 3: {
 BA.debugLineNum = 893;BA.debugLine="MsgboxAsync(SaeloZahra.CSB($\"نسخه جدیدی موجود ن";
Debug.ShouldStop(268435456);
homeact.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(homeact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)((RemoteObject.createImmutable("نسخه جدیدی موجود نیست")))).getObject())),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),homeact.processBA);
 break; }
case 4: {
 BA.debugLineNum = 895;BA.debugLine="MsgboxAsync(SaeloZahra.CSB($\"نسخه جدید دانلود ش";
Debug.ShouldStop(1073741824);
homeact.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(homeact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)((RemoteObject.createImmutable("نسخه جدید دانلود شد")))).getObject())),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),homeact.processBA);
 break; }
case 5: {
 BA.debugLineNum = 897;BA.debugLine="MsgboxAsync(SaeloZahra.CSB($\"درخواست نصب نسخه ج";
Debug.ShouldStop(1);
homeact.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(homeact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)((RemoteObject.createImmutable("درخواست نصب نسخه جدید به کاربر ارسال شد")))).getObject())),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),homeact.processBA);
 break; }
case 6: {
 BA.debugLineNum = 899;BA.debugLine="Log(\"No permission to install\")";
Debug.ShouldStop(4);
homeact.mostCurrent.__c.runVoidMethod ("LogImpl","42621459",RemoteObject.createImmutable("No permission to install"),0);
 BA.debugLineNum = 900;BA.debugLine="MsgboxAsync(SaeloZahra.CSB($\"کاربر اجازه نصب نر";
Debug.ShouldStop(8);
homeact.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(homeact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)((RemoteObject.createImmutable("کاربر اجازه نصب نرم افزار را نداد")))).getObject())),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),homeact.processBA);
 break; }
default: {
 BA.debugLineNum = 902;BA.debugLine="MsgboxAsync(SaeloZahra.CSB($\" وضعیت: ${apkupdt.";
Debug.ShouldStop(32);
homeact.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(homeact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable(" وضعیت: "),homeact.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((homeact.mostCurrent._apkupdt.runClassMethod (ir.saelozahra.damaara.mazraeyeman.cl_appupdate.class, "_getstatus" /*RemoteObject*/ )))),RemoteObject.createImmutable(" "))))).getObject())),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),homeact.processBA);
 break; }
}
;
 BA.debugLineNum = 904;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _vp_pagechanged(RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("VP_PageChanged (homeact) ","homeact",3,homeact.mostCurrent.activityBA,homeact.mostCurrent,1344);
if (RapidSub.canDelegate("vp_pagechanged")) { return ir.saelozahra.damaara.mazraeyeman.homeact.remoteMe.runUserSub(false, "homeact","vp_pagechanged", _position);}
Debug.locals.put("Position", _position);
 BA.debugLineNum = 1344;BA.debugLine="Private Sub VP_PageChanged (Position As Int)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 1345;BA.debugLine="BottomBar.ActiveItem = Position";
Debug.ShouldStop(1);
homeact.mostCurrent._bottombar.runMethod(true,"setActiveItem",_position);
 BA.debugLineNum = 1346;BA.debugLine="If Position == 2 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_position,BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 1347;BA.debugLine="ActionBar.Title=SaeloZahra.CSB(\"بازارچــــــــــ";
Debug.ShouldStop(4);
homeact.mostCurrent._actionbar.runMethod(true,"setTitle",BA.ObjectToCharSequence(homeact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("بازارچـــــــــــه"))).getObject()));
 BA.debugLineNum = 1348;BA.debugLine="sv.QueryHint=SaeloZahra.CSB(\"جستجو در بازارچه\")";
Debug.ShouldStop(8);
homeact.mostCurrent._sv.runMethod(true,"setQueryHint",BA.ObjectToCharSequence(homeact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("جستجو در بازارچه"))).getObject()));
 }else 
{ BA.debugLineNum = 1349;BA.debugLine="Else If Position == 1 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_position,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 1350;BA.debugLine="ActionBar.Title=SaeloZahra.CSB(\"مزرعه من\")";
Debug.ShouldStop(32);
homeact.mostCurrent._actionbar.runMethod(true,"setTitle",BA.ObjectToCharSequence(homeact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("مزرعه من"))).getObject()));
 BA.debugLineNum = 1351;BA.debugLine="sv.QueryHint=SaeloZahra.CSB(\"جستجو در سایت\")";
Debug.ShouldStop(64);
homeact.mostCurrent._sv.runMethod(true,"setQueryHint",BA.ObjectToCharSequence(homeact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("جستجو در سایت"))).getObject()));
 }else 
{ BA.debugLineNum = 1352;BA.debugLine="Else If Position == 0 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_position,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1353;BA.debugLine="ActionBar.Title=SaeloZahra.CSB(\"چندرسانـــــــــ";
Debug.ShouldStop(256);
homeact.mostCurrent._actionbar.runMethod(true,"setTitle",BA.ObjectToCharSequence(homeact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("چندرسانــــــــــــــــه‌ای"))).getObject()));
 BA.debugLineNum = 1354;BA.debugLine="sv.QueryHint=SaeloZahra.CSB(\"جستجو در رسانه ها\")";
Debug.ShouldStop(512);
homeact.mostCurrent._sv.runMethod(true,"setQueryHint",BA.ObjectToCharSequence(homeact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,homeact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("جستجو در رسانه ها"))).getObject()));
 BA.debugLineNum = 1356;BA.debugLine="Log(SaeloZahra.json_url&\"multimedia.php\")";
Debug.ShouldStop(2048);
homeact.mostCurrent.__c.runVoidMethod ("LogImpl","43473420",RemoteObject.concat(homeact.mostCurrent._saelozahra._json_url /*RemoteObject*/ ,RemoteObject.createImmutable("multimedia.php")),0);
 }}}
;
 BA.debugLineNum = 1359;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _weatherhover_click() throws Exception{
try {
		Debug.PushSubsStack("WeatherHover_Click (homeact) ","homeact",3,homeact.mostCurrent.activityBA,homeact.mostCurrent,1502);
if (RapidSub.canDelegate("weatherhover_click")) { return ir.saelozahra.damaara.mazraeyeman.homeact.remoteMe.runUserSub(false, "homeact","weatherhover_click");}
 BA.debugLineNum = 1502;BA.debugLine="Sub WeatherHover_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 1504;BA.debugLine="If login_act.ItIsPayed Then";
Debug.ShouldStop(-2147483648);
if (homeact.mostCurrent._login_act._itispayed /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1506;BA.debugLine="SH.convertActivityFromTranslucent";
Debug.ShouldStop(2);
homeact.mostCurrent._sh.runVoidMethod ("convertActivityFromTranslucent",homeact.mostCurrent.activityBA);
 BA.debugLineNum = 1508;BA.debugLine="StartActivity(WeatherNewAct)";
Debug.ShouldStop(8);
homeact.mostCurrent.__c.runVoidMethod ("StartActivity",homeact.processBA,(Object)((homeact.mostCurrent._weathernewact.getObject())));
 }else {
 BA.debugLineNum = 1511;BA.debugLine="ShowPardakhtModal";
Debug.ShouldStop(64);
_showpardakhtmodal();
 };
 BA.debugLineNum = 1513;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}