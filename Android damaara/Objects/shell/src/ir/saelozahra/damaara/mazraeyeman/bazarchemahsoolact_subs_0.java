package ir.saelozahra.damaara.mazraeyeman;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class bazarchemahsoolact_subs_0 {


public static RemoteObject  _actionbar_navigationitemclick() throws Exception{
try {
		Debug.PushSubsStack("Actionbar_NavigationItemClick (bazarchemahsoolact) ","bazarchemahsoolact",11,bazarchemahsoolact.mostCurrent.activityBA,bazarchemahsoolact.mostCurrent,183);
if (RapidSub.canDelegate("actionbar_navigationitemclick")) { return ir.saelozahra.damaara.mazraeyeman.bazarchemahsoolact.remoteMe.runUserSub(false, "bazarchemahsoolact","actionbar_navigationitemclick");}
 BA.debugLineNum = 183;BA.debugLine="Sub Actionbar_NavigationItemClick";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 184;BA.debugLine="Activity.Finish";
Debug.ShouldStop(8388608);
bazarchemahsoolact.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 185;BA.debugLine="SaeloZahra.SetAnimation(\"zoom_enter\",\"zoom_exit\")";
Debug.ShouldStop(16777216);
bazarchemahsoolact.mostCurrent._saelozahra.runVoidMethod ("_setanimation" /*RemoteObject*/ ,bazarchemahsoolact.mostCurrent.activityBA,(Object)(BA.ObjectToString("zoom_enter")),(Object)(RemoteObject.createImmutable("zoom_exit")));
 BA.debugLineNum = 186;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("Activity_Create (bazarchemahsoolact) ","bazarchemahsoolact",11,bazarchemahsoolact.mostCurrent.activityBA,bazarchemahsoolact.mostCurrent,32);
if (RapidSub.canDelegate("activity_create")) { return ir.saelozahra.damaara.mazraeyeman.bazarchemahsoolact.remoteMe.runUserSub(false, "bazarchemahsoolact","activity_create", _firsttime);}
RemoteObject _containerpanelheight = RemoteObject.createImmutable(0);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 32;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 34;BA.debugLine="Activity.LoadLayout(\"bazarcheSingleLayout\")";
Debug.ShouldStop(2);
bazarchemahsoolact.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("bazarcheSingleLayout")),bazarchemahsoolact.mostCurrent.activityBA);
 BA.debugLineNum = 36;BA.debugLine="Starter.rp.CheckAndRequest(Starter.rp.PERMISSION_";
Debug.ShouldStop(8);
bazarchemahsoolact.mostCurrent._starter._rp /*RemoteObject*/ .runVoidMethod ("CheckAndRequest",bazarchemahsoolact.processBA,(Object)(bazarchemahsoolact.mostCurrent._starter._rp /*RemoteObject*/ .getField(true,"PERMISSION_ACCESS_FINE_LOCATION")));
 BA.debugLineNum = 38;BA.debugLine="ActionBar.Color=0x582F944F";
Debug.ShouldStop(32);
bazarchemahsoolact.mostCurrent._actionbar.runVoidMethod ("setColor",BA.numberCast(int.class, ((int)0x582f944f)));
 BA.debugLineNum = 39;BA.debugLine="ActionBar.Title=SaeloZahra.CSBTitle(\"محصولات بازا";
Debug.ShouldStop(64);
bazarchemahsoolact.mostCurrent._actionbar.runMethod(true,"setTitle",BA.ObjectToCharSequence(bazarchemahsoolact.mostCurrent._saelozahra.runMethod(false,"_csbtitle" /*RemoteObject*/ ,bazarchemahsoolact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("محصولات بازارچه"))).getObject()));
 BA.debugLineNum = 40;BA.debugLine="ActionBar.Elevation=0";
Debug.ShouldStop(128);
bazarchemahsoolact.mostCurrent._actionbar.runMethod(true,"setElevation",BA.numberCast(float.class, 0));
 BA.debugLineNum = 43;BA.debugLine="DSBottomNavigationView1.Color=Colors.Transparent";
Debug.ShouldStop(1024);
bazarchemahsoolact.mostCurrent._dsbottomnavigationview1.runVoidMethod ("setColor",bazarchemahsoolact.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 44;BA.debugLine="DSBottomNavigationView1.ItemIconColor=Colors.Whit";
Debug.ShouldStop(2048);
bazarchemahsoolact.mostCurrent._dsbottomnavigationview1.runVoidMethod ("setItemIconColor",bazarchemahsoolact.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 45;BA.debugLine="DSBottomNavigationView1.ItemTextColor=Colors.Whit";
Debug.ShouldStop(4096);
bazarchemahsoolact.mostCurrent._dsbottomnavigationview1.runVoidMethod ("setItemTextColor",bazarchemahsoolact.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 46;BA.debugLine="DSBottomNavigationView1.SetItemIconColors(SaeloZa";
Debug.ShouldStop(8192);
bazarchemahsoolact.mostCurrent._dsbottomnavigationview1.runVoidMethod ("SetItemIconColors",(Object)(bazarchemahsoolact.mostCurrent._saelozahra._colorlight /*RemoteObject*/ ),(Object)(bazarchemahsoolact.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(bazarchemahsoolact.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray")));
 BA.debugLineNum = 47;BA.debugLine="DSBottomNavigationView1.SetItemtextColors(Colors.";
Debug.ShouldStop(16384);
bazarchemahsoolact.mostCurrent._dsbottomnavigationview1.runVoidMethod ("SetItemTextColors",(Object)(bazarchemahsoolact.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(bazarchemahsoolact.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(bazarchemahsoolact.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray")));
 BA.debugLineNum = 49;BA.debugLine="DSBottomNavigationView1.Menu.Add2(1, 1, SaeloZahr";
Debug.ShouldStop(65536);
bazarchemahsoolact.mostCurrent._dsbottomnavigationview1.runMethod(false,"getMenu").runMethod(false,"Add2",(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.ObjectToCharSequence(bazarchemahsoolact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,bazarchemahsoolact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("محصول"))).getObject())),(Object)(bazarchemahsoolact.mostCurrent._xml.runMethod(false,"GetDrawable",(Object)(RemoteObject.createImmutable("baseline_all_inclusive_white_24"))))).runMethod(true,"setChecked",bazarchemahsoolact.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 50;BA.debugLine="DSBottomNavigationView1.Menu.Add2(2, 2, SaeloZahr";
Debug.ShouldStop(131072);
bazarchemahsoolact.mostCurrent._dsbottomnavigationview1.runMethod(false,"getMenu").runVoidMethod ("Add2",(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.ObjectToCharSequence(bazarchemahsoolact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,bazarchemahsoolact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("موقعیت"))).getObject())),(Object)(bazarchemahsoolact.mostCurrent._xml.runMethod(false,"GetDrawable",(Object)(RemoteObject.createImmutable("baseline_place_white_24")))));
 BA.debugLineNum = 51;BA.debugLine="DSBottomNavigationView1.Menu.Add2(3, 3, SaeloZahr";
Debug.ShouldStop(262144);
bazarchemahsoolact.mostCurrent._dsbottomnavigationview1.runMethod(false,"getMenu").runVoidMethod ("Add2",(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.ObjectToCharSequence(bazarchemahsoolact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,bazarchemahsoolact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("تماس"))).getObject())),(Object)(bazarchemahsoolact.mostCurrent._xml.runMethod(false,"GetDrawable",(Object)(RemoteObject.createImmutable("baseline_local_phone_white_24")))));
 BA.debugLineNum = 53;BA.debugLine="currentPanel = Panel1";
Debug.ShouldStop(1048576);
bazarchemahsoolact.mostCurrent._currentpanel = bazarchemahsoolact.mostCurrent._panel1;
 BA.debugLineNum = 55;BA.debugLine="ActionBar.NavigationIconDrawable = xml.GetDrawabl";
Debug.ShouldStop(4194304);
bazarchemahsoolact.mostCurrent._actionbar.runMethod(false,"setNavigationIconDrawable",bazarchemahsoolact.mostCurrent._xml.runMethod(false,"GetDrawable",(Object)(RemoteObject.createImmutable("baseline_arrow_back_white_24"))));
 BA.debugLineNum = 57;BA.debugLine="WebView1.LoadHtml(pageVals.Get(\"product\"))";
Debug.ShouldStop(16777216);
bazarchemahsoolact.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(BA.ObjectToString(bazarchemahsoolact._pagevals.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("product")))))));
 BA.debugLineNum = 58;BA.debugLine="WebView1.LoadUrl(SaeloZahra.json_url&\"single_prod";
Debug.ShouldStop(33554432);
bazarchemahsoolact.mostCurrent._webview1.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(bazarchemahsoolact.mostCurrent._saelozahra._json_url /*RemoteObject*/ ,RemoteObject.createImmutable("single_product_farmer.php?id="),bazarchemahsoolact._pagevals.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))))));
 BA.debugLineNum = 60;BA.debugLine="currentPanel.Color=Colors.Transparent";
Debug.ShouldStop(134217728);
bazarchemahsoolact.mostCurrent._currentpanel.runVoidMethod ("setColor",bazarchemahsoolact.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 63;BA.debugLine="farmerjob.Initialize(\"farmerjob\",Me)";
Debug.ShouldStop(1073741824);
bazarchemahsoolact.mostCurrent._farmerjob.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_initialize" /*RemoteObject*/ ,bazarchemahsoolact.processBA,(Object)(BA.ObjectToString("farmerjob")),(Object)(bazarchemahsoolact.getObject()));
 BA.debugLineNum = 64;BA.debugLine="farmerjob.Download(SaeloZahra.json_url&\"farmers_l";
Debug.ShouldStop(-2147483648);
bazarchemahsoolact.mostCurrent._farmerjob.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.concat(bazarchemahsoolact.mostCurrent._saelozahra._json_url /*RemoteObject*/ ,RemoteObject.createImmutable("farmers_list.php?farmertel="),bazarchemahsoolact._pagevals.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("farmers_user")))))));
 BA.debugLineNum = 66;BA.debugLine="ContainerPanel.Color=Colors.LightGray";
Debug.ShouldStop(2);
bazarchemahsoolact.mostCurrent._containerpanel.runVoidMethod ("setColor",bazarchemahsoolact.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 67;BA.debugLine="Dim ContainerPanelHeight As Int =GetDeviceLayoutV";
Debug.ShouldStop(4);
_containerpanelheight = RemoteObject.solve(new RemoteObject[] {bazarchemahsoolact.mostCurrent.__c.runMethod(false,"GetDeviceLayoutValues",bazarchemahsoolact.mostCurrent.activityBA).getField(true,"Height"),(RemoteObject.solve(new RemoteObject[] {bazarchemahsoolact.mostCurrent._dsbottomnavigationview1.runMethod(true,"getHeight"),bazarchemahsoolact.mostCurrent._dsbottomnavigationview1.runMethod(true,"getTop"),bazarchemahsoolact.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))}, "++",2, 1)),bazarchemahsoolact.mostCurrent._saelozahra._getstatusbarheight /*RemoteObject*/ }, "-+",2, 1);Debug.locals.put("ContainerPanelHeight", _containerpanelheight);Debug.locals.put("ContainerPanelHeight", _containerpanelheight);
 BA.debugLineNum = 69;BA.debugLine="ContainerPanel.SetLayout(0,0,100%x,ContainerPanel";
Debug.ShouldStop(16);
bazarchemahsoolact.mostCurrent._containerpanel.runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(bazarchemahsoolact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),bazarchemahsoolact.mostCurrent.activityBA)),(Object)(_containerpanelheight));
 BA.debugLineNum = 70;BA.debugLine="Panel1.SetLayout(0,0,100%x,ContainerPanel.Height)";
Debug.ShouldStop(32);
bazarchemahsoolact.mostCurrent._panel1.runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(bazarchemahsoolact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),bazarchemahsoolact.mostCurrent.activityBA)),(Object)(bazarchemahsoolact.mostCurrent._containerpanel.runMethod(true,"getHeight")));
 BA.debugLineNum = 71;BA.debugLine="Panel2.SetLayout(0,0,100%x,ContainerPanel.Height)";
Debug.ShouldStop(64);
bazarchemahsoolact.mostCurrent._panel2.runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(bazarchemahsoolact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),bazarchemahsoolact.mostCurrent.activityBA)),(Object)(bazarchemahsoolact.mostCurrent._containerpanel.runMethod(true,"getHeight")));
 BA.debugLineNum = 72;BA.debugLine="Panel3.SetLayout(0,0,100%x,ContainerPanel.Height)";
Debug.ShouldStop(128);
bazarchemahsoolact.mostCurrent._panel3.runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(bazarchemahsoolact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),bazarchemahsoolact.mostCurrent.activityBA)),(Object)(bazarchemahsoolact.mostCurrent._containerpanel.runMethod(true,"getHeight")));
 BA.debugLineNum = 77;BA.debugLine="WebView1.Color=Colors.ARGB(188,255,255,255)";
Debug.ShouldStop(4096);
bazarchemahsoolact.mostCurrent._webview1.runVoidMethod ("setColor",bazarchemahsoolact.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 188)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 78;BA.debugLine="Panel1.Color = Colors.ARGB(188,255,255,255)";
Debug.ShouldStop(8192);
bazarchemahsoolact.mostCurrent._panel1.runVoidMethod ("setColor",bazarchemahsoolact.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 188)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 79;BA.debugLine="Panel2.Color = Colors.ARGB(188,255,255,255)";
Debug.ShouldStop(16384);
bazarchemahsoolact.mostCurrent._panel2.runVoidMethod ("setColor",bazarchemahsoolact.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 188)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 80;BA.debugLine="Panel3.Color = Colors.ARGB(188,255,255,255)";
Debug.ShouldStop(32768);
bazarchemahsoolact.mostCurrent._panel3.runVoidMethod ("setColor",bazarchemahsoolact.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 188)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 83;BA.debugLine="CallLbl.Text = SaeloZahra.CSB(\"شماره تماس: \"&page";
Debug.ShouldStop(262144);
bazarchemahsoolact.mostCurrent._calllbl.runMethod(true,"setText",BA.ObjectToCharSequence(bazarchemahsoolact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,bazarchemahsoolact.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("شماره تماس: "),bazarchemahsoolact._pagevals.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("farmers_user"))))))).getObject()));
 BA.debugLineNum = 85;BA.debugLine="If MapFragment1.IsGooglePlayServicesAvailable = F";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",bazarchemahsoolact.mostCurrent._mapfragment1.runMethod(true,"IsGooglePlayServicesAvailable",bazarchemahsoolact.mostCurrent.activityBA),bazarchemahsoolact.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 86;BA.debugLine="ToastMessageShow(\"گوگل پلی سرویس در دسترس نیست\",";
Debug.ShouldStop(2097152);
bazarchemahsoolact.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("گوگل پلی سرویس در دسترس نیست")),(Object)(bazarchemahsoolact.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 90;BA.debugLine="SaeloZahra.SetStatusBarColor(SaeloZahra.ColorDar";
Debug.ShouldStop(33554432);
bazarchemahsoolact.mostCurrent._saelozahra.runVoidMethod ("_setstatusbarcolor" /*RemoteObject*/ ,bazarchemahsoolact.mostCurrent.activityBA,(Object)(bazarchemahsoolact.mostCurrent._saelozahra._colordark /*RemoteObject*/ ));
 BA.debugLineNum = 91;BA.debugLine="Activity.Color		=SaeloZahra.Color";
Debug.ShouldStop(67108864);
bazarchemahsoolact.mostCurrent._activity.runVoidMethod ("setColor",bazarchemahsoolact.mostCurrent._saelozahra._color /*RemoteObject*/ );
 BA.debugLineNum = 92;BA.debugLine="ActionBar.Color		=Colors.Transparent";
Debug.ShouldStop(134217728);
bazarchemahsoolact.mostCurrent._actionbar.runVoidMethod ("setColor",bazarchemahsoolact.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 93;BA.debugLine="DSBottomNavigationView1.Color=Colors.Transparent";
Debug.ShouldStop(268435456);
bazarchemahsoolact.mostCurrent._dsbottomnavigationview1.runVoidMethod ("setColor",bazarchemahsoolact.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 94;BA.debugLine="ActionBar.SetLayout(0,0,100%x,SaeloZahra.Materia";
Debug.ShouldStop(536870912);
bazarchemahsoolact.mostCurrent._actionbar.runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(bazarchemahsoolact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),bazarchemahsoolact.mostCurrent.activityBA)),(Object)(bazarchemahsoolact.mostCurrent._saelozahra._materialactionbarheight /*RemoteObject*/ ));
 BA.debugLineNum = 95;BA.debugLine="DSBottomNavigationView1.SetLayout(0,SaeloZahra.M";
Debug.ShouldStop(1073741824);
bazarchemahsoolact.mostCurrent._dsbottomnavigationview1.runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(bazarchemahsoolact.mostCurrent._saelozahra._materialactionbarheight /*RemoteObject*/ ),(Object)(bazarchemahsoolact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),bazarchemahsoolact.mostCurrent.activityBA)),(Object)(bazarchemahsoolact.mostCurrent._saelozahra._materialactionbarheight /*RemoteObject*/ ));
 BA.debugLineNum = 96;BA.debugLine="DSBottomNavigationView1.SetItemIconColors(SaeloZ";
Debug.ShouldStop(-2147483648);
bazarchemahsoolact.mostCurrent._dsbottomnavigationview1.runVoidMethod ("SetItemIconColors",(Object)(bazarchemahsoolact.mostCurrent._saelozahra._colorlight /*RemoteObject*/ ),(Object)(bazarchemahsoolact.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(bazarchemahsoolact.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray")));
 BA.debugLineNum = 97;BA.debugLine="ContainerPanel.SetLayout(0,SaeloZahra.MaterialAc";
Debug.ShouldStop(1);
bazarchemahsoolact.mostCurrent._containerpanel.runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {bazarchemahsoolact.mostCurrent._saelozahra._materialactionbarheight /*RemoteObject*/ ,RemoteObject.createImmutable(2)}, "*",0, 1)),(Object)(bazarchemahsoolact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),bazarchemahsoolact.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {bazarchemahsoolact.mostCurrent._activity.runMethod(true,"getHeight"),(RemoteObject.solve(new RemoteObject[] {bazarchemahsoolact.mostCurrent._saelozahra._materialactionbarheight /*RemoteObject*/ ,RemoteObject.createImmutable(2)}, "*",0, 1)),bazarchemahsoolact.mostCurrent._saelozahra._getstatusbarheight /*RemoteObject*/ }, "-+",2, 1)));
 BA.debugLineNum = 98;BA.debugLine="Panel1.Height=ContainerPanel.Height+SaeloZahra.G";
Debug.ShouldStop(2);
bazarchemahsoolact.mostCurrent._panel1.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {bazarchemahsoolact.mostCurrent._containerpanel.runMethod(true,"getHeight"),bazarchemahsoolact.mostCurrent._saelozahra._getstatusbarheight /*RemoteObject*/ }, "+",1, 1));
 BA.debugLineNum = 99;BA.debugLine="Panel2.Height=ContainerPanel.Height+SaeloZahra.G";
Debug.ShouldStop(4);
bazarchemahsoolact.mostCurrent._panel2.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {bazarchemahsoolact.mostCurrent._containerpanel.runMethod(true,"getHeight"),bazarchemahsoolact.mostCurrent._saelozahra._getstatusbarheight /*RemoteObject*/ }, "+",1, 1));
 BA.debugLineNum = 100;BA.debugLine="Panel3.Height=ContainerPanel.Height+SaeloZahra.G";
Debug.ShouldStop(8);
bazarchemahsoolact.mostCurrent._panel3.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {bazarchemahsoolact.mostCurrent._containerpanel.runMethod(true,"getHeight"),bazarchemahsoolact.mostCurrent._saelozahra._getstatusbarheight /*RemoteObject*/ }, "+",1, 1));
 BA.debugLineNum = 103;BA.debugLine="If SaeloZahra.P.SdkVersion>23 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean(">",bazarchemahsoolact.mostCurrent._saelozahra._p /*RemoteObject*/ .runMethod(true,"getSdkVersion"),BA.numberCast(double.class, 23))) { 
 BA.debugLineNum = 104;BA.debugLine="Config.Initialize";
Debug.ShouldStop(128);
bazarchemahsoolact.mostCurrent._config.runVoidMethod ("Initialize",bazarchemahsoolact.processBA);
 BA.debugLineNum = 105;BA.debugLine="Config.position(Config.POSITION_LEFT)";
Debug.ShouldStop(256);
bazarchemahsoolact.mostCurrent._config.runVoidMethod ("position",(Object)(bazarchemahsoolact.mostCurrent._config.getField(true,"POSITION_LEFT")));
 BA.debugLineNum = 106;BA.debugLine="Config.primaryColor(SaeloZahra.ColorDark)";
Debug.ShouldStop(512);
bazarchemahsoolact.mostCurrent._config.runVoidMethod ("primaryColor",(Object)(bazarchemahsoolact.mostCurrent._saelozahra._colordark /*RemoteObject*/ ));
 BA.debugLineNum = 107;BA.debugLine="Config.edge(True )";
Debug.ShouldStop(1024);
bazarchemahsoolact.mostCurrent._config.runVoidMethod ("edge",(Object)(bazarchemahsoolact.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 108;BA.debugLine="Config.sensitivity(100)";
Debug.ShouldStop(2048);
bazarchemahsoolact.mostCurrent._config.runVoidMethod ("sensitivity",(Object)(BA.numberCast(float.class, 100)));
 BA.debugLineNum = 109;BA.debugLine="Config.scrimColor(Colors.ARGB(180,0,0,0))";
Debug.ShouldStop(4096);
bazarchemahsoolact.mostCurrent._config.runVoidMethod ("scrimColor",(Object)(bazarchemahsoolact.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 180)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))));
 BA.debugLineNum = 111;BA.debugLine="Show.convertActivityToTranslucent";
Debug.ShouldStop(16384);
bazarchemahsoolact.mostCurrent._show.runVoidMethod ("convertActivityToTranslucent",bazarchemahsoolact.mostCurrent.activityBA);
 BA.debugLineNum = 112;BA.debugLine="Show.attachActivity(Config)";
Debug.ShouldStop(32768);
bazarchemahsoolact.mostCurrent._show.runVoidMethod ("attachActivity",bazarchemahsoolact.mostCurrent.activityBA,(Object)(bazarchemahsoolact.mostCurrent._config));
 };
 BA.debugLineNum = 115;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("Activity_KeyPress (bazarchemahsoolact) ","bazarchemahsoolact",11,bazarchemahsoolact.mostCurrent.activityBA,bazarchemahsoolact.mostCurrent,189);
if (RapidSub.canDelegate("activity_keypress")) { return ir.saelozahra.damaara.mazraeyeman.bazarchemahsoolact.remoteMe.runUserSub(false, "bazarchemahsoolact","activity_keypress", _keycode);}
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 189;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 190;BA.debugLine="If KeyCode==KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, bazarchemahsoolact.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 191;BA.debugLine="Actionbar_NavigationItemClick";
Debug.ShouldStop(1073741824);
_actionbar_navigationitemclick();
 BA.debugLineNum = 192;BA.debugLine="Return False";
Debug.ShouldStop(-2147483648);
if (true) return bazarchemahsoolact.mostCurrent.__c.getField(true,"False");
 }else {
 BA.debugLineNum = 194;BA.debugLine="Return True";
Debug.ShouldStop(2);
if (true) return bazarchemahsoolact.mostCurrent.__c.getField(true,"True");
 };
 BA.debugLineNum = 196;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("Activity_Pause (bazarchemahsoolact) ","bazarchemahsoolact",11,bazarchemahsoolact.mostCurrent.activityBA,bazarchemahsoolact.mostCurrent,121);
if (RapidSub.canDelegate("activity_pause")) { return ir.saelozahra.damaara.mazraeyeman.bazarchemahsoolact.remoteMe.runUserSub(false, "bazarchemahsoolact","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 121;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 123;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("Activity_Resume (bazarchemahsoolact) ","bazarchemahsoolact",11,bazarchemahsoolact.mostCurrent.activityBA,bazarchemahsoolact.mostCurrent,117);
if (RapidSub.canDelegate("activity_resume")) { return ir.saelozahra.damaara.mazraeyeman.bazarchemahsoolact.remoteMe.runUserSub(false, "bazarchemahsoolact","activity_resume");}
 BA.debugLineNum = 117;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 119;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _calllbl_click() throws Exception{
try {
		Debug.PushSubsStack("CallLbl_Click (bazarchemahsoolact) ","bazarchemahsoolact",11,bazarchemahsoolact.mostCurrent.activityBA,bazarchemahsoolact.mostCurrent,286);
if (RapidSub.canDelegate("calllbl_click")) { return ir.saelozahra.damaara.mazraeyeman.bazarchemahsoolact.remoteMe.runUserSub(false, "bazarchemahsoolact","calllbl_click");}
 BA.debugLineNum = 286;BA.debugLine="Sub CallLbl_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 287;BA.debugLine="SaeloZahra.intent1.Initialize(SaeloZahra.intent1.";
Debug.ShouldStop(1073741824);
bazarchemahsoolact.mostCurrent._saelozahra._intent1 /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(bazarchemahsoolact.mostCurrent._saelozahra._intent1 /*RemoteObject*/ .getField(true,"ACTION_VIEW")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("tel:"),bazarchemahsoolact._pagevals.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("farmers_user")))))));
 BA.debugLineNum = 288;BA.debugLine="StartActivity(SaeloZahra.intent1)";
Debug.ShouldStop(-2147483648);
bazarchemahsoolact.mostCurrent.__c.runVoidMethod ("StartActivity",bazarchemahsoolact.processBA,(Object)((bazarchemahsoolact.mostCurrent._saelozahra._intent1 /*RemoteObject*/ .getObject())));
 BA.debugLineNum = 289;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dsbottomnavigationview1_navigationitemselected(RemoteObject _menuitem) throws Exception{
try {
		Debug.PushSubsStack("DSBottomNavigationView1_NavigationItemSelected (bazarchemahsoolact) ","bazarchemahsoolact",11,bazarchemahsoolact.mostCurrent.activityBA,bazarchemahsoolact.mostCurrent,152);
if (RapidSub.canDelegate("dsbottomnavigationview1_navigationitemselected")) { return ir.saelozahra.damaara.mazraeyeman.bazarchemahsoolact.remoteMe.runUserSub(false, "bazarchemahsoolact","dsbottomnavigationview1_navigationitemselected", _menuitem);}
RemoteObject _newpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("MenuItem", _menuitem);
 BA.debugLineNum = 152;BA.debugLine="Sub DSBottomNavigationView1_NavigationItemSelected";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 153;BA.debugLine="Log(\"Menu item selected: \" &MenuItem.Id&\"  :  \"&";
Debug.ShouldStop(16777216);
bazarchemahsoolact.mostCurrent.__c.runVoidMethod ("LogImpl","414090241",RemoteObject.concat(RemoteObject.createImmutable("Menu item selected: "),_menuitem.runMethod(true,"getId"),RemoteObject.createImmutable("  :  "),_menuitem.runMethod(true,"getTitle")),0);
 BA.debugLineNum = 154;BA.debugLine="Dim newPanel As Panel";
Debug.ShouldStop(33554432);
_newpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("newPanel", _newpanel);
 BA.debugLineNum = 155;BA.debugLine="Panel1.Visible=False";
Debug.ShouldStop(67108864);
bazarchemahsoolact.mostCurrent._panel1.runMethod(true,"setVisible",bazarchemahsoolact.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 156;BA.debugLine="Panel2.Visible=False";
Debug.ShouldStop(134217728);
bazarchemahsoolact.mostCurrent._panel2.runMethod(true,"setVisible",bazarchemahsoolact.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 157;BA.debugLine="Panel3.Visible=False";
Debug.ShouldStop(268435456);
bazarchemahsoolact.mostCurrent._panel3.runMethod(true,"setVisible",bazarchemahsoolact.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 159;BA.debugLine="Select MenuItem.Id";
Debug.ShouldStop(1073741824);
switch (BA.switchObjectToInt(_menuitem.runMethod(true,"getId"),BA.numberCast(int.class, 1),BA.numberCast(int.class, 2),BA.numberCast(int.class, 3))) {
case 0: {
 BA.debugLineNum = 161;BA.debugLine="newPanel = Panel1";
Debug.ShouldStop(1);
_newpanel = bazarchemahsoolact.mostCurrent._panel1;Debug.locals.put("newPanel", _newpanel);
 break; }
case 1: {
 BA.debugLineNum = 163;BA.debugLine="newPanel = Panel2";
Debug.ShouldStop(4);
_newpanel = bazarchemahsoolact.mostCurrent._panel2;Debug.locals.put("newPanel", _newpanel);
 break; }
case 2: {
 BA.debugLineNum = 165;BA.debugLine="newPanel = Panel3";
Debug.ShouldStop(16);
_newpanel = bazarchemahsoolact.mostCurrent._panel3;Debug.locals.put("newPanel", _newpanel);
 break; }
default: {
 BA.debugLineNum = 167;BA.debugLine="newPanel = Panel1";
Debug.ShouldStop(64);
_newpanel = bazarchemahsoolact.mostCurrent._panel1;Debug.locals.put("newPanel", _newpanel);
 break; }
}
;
 BA.debugLineNum = 173;BA.debugLine="If currentPanel <> newPanel Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("!",bazarchemahsoolact.mostCurrent._currentpanel,_newpanel)) { 
 BA.debugLineNum = 174;BA.debugLine="newPanel.SetVisibleAnimated(0, False)";
Debug.ShouldStop(8192);
_newpanel.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(bazarchemahsoolact.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 175;BA.debugLine="newPanel.BringToFront";
Debug.ShouldStop(16384);
_newpanel.runVoidMethod ("BringToFront");
 BA.debugLineNum = 176;BA.debugLine="newPanel.SetVisibleAnimated(200, True)";
Debug.ShouldStop(32768);
_newpanel.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 200)),(Object)(bazarchemahsoolact.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 177;BA.debugLine="currentPanel = newPanel";
Debug.ShouldStop(65536);
bazarchemahsoolact.mostCurrent._currentpanel = _newpanel;
 BA.debugLineNum = 178;BA.debugLine="currentPanel.SetVisibleAnimated(888,True)";
Debug.ShouldStop(131072);
bazarchemahsoolact.mostCurrent._currentpanel.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 888)),(Object)(bazarchemahsoolact.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 181;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 14;BA.debugLine="Dim Config 	As Amir_SliderConfig";
bazarchemahsoolact.mostCurrent._config = RemoteObject.createNew ("ir.aghajari.slider.Amir_SlisderConfig");
 //BA.debugLineNum = 15;BA.debugLine="Dim Show 	As Amir_SliderShow";
bazarchemahsoolact.mostCurrent._show = RemoteObject.createNew ("ir.aghajari.slider.Amir_SliderShow");
 //BA.debugLineNum = 17;BA.debugLine="Dim Email As String";
bazarchemahsoolact.mostCurrent._email = RemoteObject.createImmutable("");
 //BA.debugLineNum = 18;BA.debugLine="Dim xml As XmlLayoutBuilder";
bazarchemahsoolact.mostCurrent._xml = RemoteObject.createNew ("anywheresoftware.b4a.object.XmlLayoutBuilder");
 //BA.debugLineNum = 19;BA.debugLine="Private DSBottomNavigationView1 As DSBottomNaviga";
bazarchemahsoolact.mostCurrent._dsbottomnavigationview1 = RemoteObject.createNew ("de.amberhome.objects.BottomNavigationViewWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private ActionBar As ACToolBarDark";
bazarchemahsoolact.mostCurrent._actionbar = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACToolbarDarkWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private Panel1,Panel2,Panel3,ContainerPanel,curre";
bazarchemahsoolact.mostCurrent._panel1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
bazarchemahsoolact.mostCurrent._panel2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
bazarchemahsoolact.mostCurrent._panel3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
bazarchemahsoolact.mostCurrent._containerpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
bazarchemahsoolact.mostCurrent._currentpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Dim farmerjob As HttpJob";
bazarchemahsoolact.mostCurrent._farmerjob = RemoteObject.createNew ("ir.saelozahra.damaara.mazraeyeman.httpjob");
 //BA.debugLineNum = 24;BA.debugLine="Dim components(3) As String";
bazarchemahsoolact.mostCurrent._components = RemoteObject.createNewArray ("String", new int[] {3}, new Object[]{});
 //BA.debugLineNum = 25;BA.debugLine="Private WebView1 As WebView";
bazarchemahsoolact.mostCurrent._webview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Dim GMap As GoogleMap";
bazarchemahsoolact.mostCurrent._gmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.MapFragmentWrapper.GoogleMapWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Dim MapFragment1 As MapFragment";
bazarchemahsoolact.mostCurrent._mapfragment1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.MapFragmentWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private CallLbl,MailLbl As Label";
bazarchemahsoolact.mostCurrent._calllbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
bazarchemahsoolact.mostCurrent._maillbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("jobDone (bazarchemahsoolact) ","bazarchemahsoolact",11,bazarchemahsoolact.mostCurrent.activityBA,bazarchemahsoolact.mostCurrent,199);
if (RapidSub.canDelegate("jobdone")) { return ir.saelozahra.damaara.mazraeyeman.bazarchemahsoolact.remoteMe.runUserSub(false, "bazarchemahsoolact","jobdone", _job);}
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colroot = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _location = RemoteObject.createImmutable("");
RemoteObject _cp = RemoteObject.declareNull("anywheresoftware.b4a.objects.MapFragmentWrapper.CameraPositionWrapper");
Debug.locals.put("job", _job);
 BA.debugLineNum = 199;BA.debugLine="Sub jobDone(job As HttpJob)";
Debug.ShouldStop(64);
 BA.debugLineNum = 201;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(256);
bazarchemahsoolact.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 203;BA.debugLine="If job.Success Then";
Debug.ShouldStop(1024);
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 205;BA.debugLine="If job.GetString==\"\"\"PassError\"\"\" Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_getstring" /*RemoteObject*/ ),BA.ObjectToString("\"PassError\""))) { 
 BA.debugLineNum = 207;BA.debugLine="ToastMessageShow(SaeloZahra.CSB(\"کلمه عبور وارد";
Debug.ShouldStop(16384);
bazarchemahsoolact.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(bazarchemahsoolact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,bazarchemahsoolact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("کلمه عبور وارد شده غلط است"))).getObject())),(Object)(bazarchemahsoolact.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 208;BA.debugLine="File.Delete(SaeloZahra.dir,\"usrnm\")";
Debug.ShouldStop(32768);
bazarchemahsoolact.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(bazarchemahsoolact.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("usrnm")));
 BA.debugLineNum = 209;BA.debugLine="File.Delete(SaeloZahra.dir,\"pswd\")";
Debug.ShouldStop(65536);
bazarchemahsoolact.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(bazarchemahsoolact.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("pswd")));
 }else 
{ BA.debugLineNum = 211;BA.debugLine="Else If job.GetString==\"\"\"UserNotFound\"\"\" Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_getstring" /*RemoteObject*/ ),BA.ObjectToString("\"UserNotFound\""))) { 
 BA.debugLineNum = 213;BA.debugLine="ToastMessageShow(SaeloZahra.CSB(\"نام کاربری پید";
Debug.ShouldStop(1048576);
bazarchemahsoolact.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(bazarchemahsoolact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,bazarchemahsoolact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("نام کاربری پیدا نشد"))).getObject())),(Object)(bazarchemahsoolact.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 214;BA.debugLine="File.Delete(SaeloZahra.dir,\"usrnm\")";
Debug.ShouldStop(2097152);
bazarchemahsoolact.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(bazarchemahsoolact.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("usrnm")));
 BA.debugLineNum = 215;BA.debugLine="File.Delete(SaeloZahra.dir,\"pswd\")";
Debug.ShouldStop(4194304);
bazarchemahsoolact.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(bazarchemahsoolact.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("pswd")));
 }else {
 BA.debugLineNum = 219;BA.debugLine="LogColor(job.GetString,Colors.Green)";
Debug.ShouldStop(67108864);
bazarchemahsoolact.mostCurrent.__c.runVoidMethod ("LogImpl","414286868",_job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_getstring" /*RemoteObject*/ ),bazarchemahsoolact.mostCurrent.__c.getField(false,"Colors").getField(true,"Green"));
 BA.debugLineNum = 221;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(268435456);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 222;BA.debugLine="parser.Initialize(job.GetString)";
Debug.ShouldStop(536870912);
_parser.runVoidMethod ("Initialize",(Object)(_job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 223;BA.debugLine="Dim root As List = parser.NextArray";
Debug.ShouldStop(1073741824);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_root = _parser.runMethod(false,"NextArray");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 224;BA.debugLine="For Each colroot As Map In root";
Debug.ShouldStop(-2147483648);
_colroot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group16 = _root;
final int groupLen16 = group16.runMethod(true,"getSize").<Integer>get()
;int index16 = 0;
;
for (; index16 < groupLen16;index16++){
_colroot = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group16.runMethod(false,"Get",index16));Debug.locals.put("colroot", _colroot);
Debug.locals.put("colroot", _colroot);
 BA.debugLineNum = 239;BA.debugLine="Dim location As String = colroot.Get(\"location";
Debug.ShouldStop(16384);
_location = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("location")))));Debug.locals.put("location", _location);Debug.locals.put("location", _location);
 BA.debugLineNum = 242;BA.debugLine="Email = colroot.Get(\"email\")";
Debug.ShouldStop(131072);
bazarchemahsoolact.mostCurrent._email = BA.ObjectToString(_colroot.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("email")))));
 BA.debugLineNum = 243;BA.debugLine="MailLbl.Text = SaeloZahra.CSB(\"پست الکترونیک:";
Debug.ShouldStop(262144);
bazarchemahsoolact.mostCurrent._maillbl.runMethod(true,"setText",BA.ObjectToCharSequence(bazarchemahsoolact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,bazarchemahsoolact.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("پست الکترونیک: "),bazarchemahsoolact.mostCurrent._email))).getObject()));
 }
}Debug.locals.put("colroot", _colroot);
;
 BA.debugLineNum = 251;BA.debugLine="components = Regex.Split(\",\", location)";
Debug.ShouldStop(67108864);
bazarchemahsoolact.mostCurrent._components = bazarchemahsoolact.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(",")),(Object)(_location));
 BA.debugLineNum = 253;BA.debugLine="LogColor(components(0)&\",,,,\"&components(1),Col";
Debug.ShouldStop(268435456);
bazarchemahsoolact.mostCurrent.__c.runVoidMethod ("LogImpl","414286902",RemoteObject.concat(bazarchemahsoolact.mostCurrent._components.getArrayElement(true,BA.numberCast(int.class, 0)),RemoteObject.createImmutable(",,,,"),bazarchemahsoolact.mostCurrent._components.getArrayElement(true,BA.numberCast(int.class, 1))),bazarchemahsoolact.mostCurrent.__c.getField(false,"Colors").getField(true,"Blue"));
 BA.debugLineNum = 254;BA.debugLine="If GMap.IsInitialized Then";
Debug.ShouldStop(536870912);
if (bazarchemahsoolact.mostCurrent._gmap.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 255;BA.debugLine="Dim cp As CameraPosition";
Debug.ShouldStop(1073741824);
_cp = RemoteObject.createNew ("anywheresoftware.b4a.objects.MapFragmentWrapper.CameraPositionWrapper");Debug.locals.put("cp", _cp);
 BA.debugLineNum = 256;BA.debugLine="cp.Initialize(components(0), components(1), 14";
Debug.ShouldStop(-2147483648);
_cp.runVoidMethod ("Initialize",(Object)(BA.numberCast(double.class, bazarchemahsoolact.mostCurrent._components.getArrayElement(true,BA.numberCast(int.class, 0)))),(Object)(BA.numberCast(double.class, bazarchemahsoolact.mostCurrent._components.getArrayElement(true,BA.numberCast(int.class, 1)))),(Object)(BA.numberCast(float.class, 14)));
 BA.debugLineNum = 257;BA.debugLine="gmap.AnimateCamera(cp)";
Debug.ShouldStop(1);
bazarchemahsoolact.mostCurrent._gmap.runVoidMethod ("AnimateCamera",(Object)((_cp.getObject())));
 };
 }}
;
 }else {
 BA.debugLineNum = 266;BA.debugLine="If job.ErrorMessage.Contains(\"Unable to resolve";
Debug.ShouldStop(512);
if (_job.getField(true,"_errormessage" /*RemoteObject*/ ).runMethod(true,"contains",(Object)(RemoteObject.createImmutable("Unable to resolve host"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 267;BA.debugLine="ToastMessageShow(SaeloZahra.CSB(\" اینترنتتون وص";
Debug.ShouldStop(1024);
bazarchemahsoolact.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(bazarchemahsoolact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,bazarchemahsoolact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable(" اینترنتتون وصل نیست "))).getObject())),(Object)(bazarchemahsoolact.mostCurrent.__c.getField(true,"True")));
 }else {
 BA.debugLineNum = 269;BA.debugLine="ToastMessageShow(SaeloZahra.CSB(\" خطا \")&CRLF&j";
Debug.ShouldStop(4096);
bazarchemahsoolact.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(bazarchemahsoolact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,bazarchemahsoolact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable(" خطا "))),bazarchemahsoolact.mostCurrent.__c.getField(true,"CRLF"),_job.getField(true,"_errormessage" /*RemoteObject*/ )))),(Object)(bazarchemahsoolact.mostCurrent.__c.getField(true,"True")));
 };
 };
 BA.debugLineNum = 272;BA.debugLine="job.Release";
Debug.ShouldStop(32768);
_job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 273;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _maillbl_click() throws Exception{
try {
		Debug.PushSubsStack("MailLbl_Click (bazarchemahsoolact) ","bazarchemahsoolact",11,bazarchemahsoolact.mostCurrent.activityBA,bazarchemahsoolact.mostCurrent,278);
if (RapidSub.canDelegate("maillbl_click")) { return ir.saelozahra.damaara.mazraeyeman.bazarchemahsoolact.remoteMe.runUserSub(false, "bazarchemahsoolact","maillbl_click");}
 BA.debugLineNum = 278;BA.debugLine="Sub MailLbl_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 279;BA.debugLine="SaeloZahra.intent1.Initialize( \"android.intent.ac";
Debug.ShouldStop(4194304);
bazarchemahsoolact.mostCurrent._saelozahra._intent1 /*RemoteObject*/ .runVoidMethod ("Initialize",(Object)(BA.ObjectToString("android.intent.action.SENDTO")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("mailto:"),bazarchemahsoolact.mostCurrent._email)));
 BA.debugLineNum = 280;BA.debugLine="SaeloZahra.intent1.putExtra  ( \"android.intent.ex";
Debug.ShouldStop(8388608);
bazarchemahsoolact.mostCurrent._saelozahra._intent1 /*RemoteObject*/ .runVoidMethod ("PutExtra",(Object)(BA.ObjectToString("android.intent.extra.SUBJECT")),(Object)((RemoteObject.createImmutable("درخواست خرید محصول"))));
 BA.debugLineNum = 281;BA.debugLine="SaeloZahra.intent1.putExtra  ( \"android.intent.ex";
Debug.ShouldStop(16777216);
bazarchemahsoolact.mostCurrent._saelozahra._intent1 /*RemoteObject*/ .runVoidMethod ("PutExtra",(Object)(BA.ObjectToString("android.intent.extra.TEXT")),(Object)((RemoteObject.createImmutable("سلام / ببخشید چطور میتونم مقداری از این محصول تهیه کنم ؟"))));
 BA.debugLineNum = 282;BA.debugLine="SaeloZahra.intent1.WrapAsIntentChooser ( \"ارسال ا";
Debug.ShouldStop(33554432);
bazarchemahsoolact.mostCurrent._saelozahra._intent1 /*RemoteObject*/ .runVoidMethod ("WrapAsIntentChooser",(Object)(RemoteObject.createImmutable("ارسال ایمیل")));
 BA.debugLineNum = 283;BA.debugLine="StartActivity ( SaeloZahra.intent1 )";
Debug.ShouldStop(67108864);
bazarchemahsoolact.mostCurrent.__c.runVoidMethod ("StartActivity",bazarchemahsoolact.processBA,(Object)((bazarchemahsoolact.mostCurrent._saelozahra._intent1 /*RemoteObject*/ .getObject())));
 BA.debugLineNum = 284;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _mapfragment1_ready() throws Exception{
try {
		Debug.PushSubsStack("MapFragment1_Ready (bazarchemahsoolact) ","bazarchemahsoolact",11,bazarchemahsoolact.mostCurrent.activityBA,bazarchemahsoolact.mostCurrent,125);
if (RapidSub.canDelegate("mapfragment1_ready")) { ir.saelozahra.damaara.mazraeyeman.bazarchemahsoolact.remoteMe.runUserSub(false, "bazarchemahsoolact","mapfragment1_ready"); return;}
ResumableSub_MapFragment1_Ready rsub = new ResumableSub_MapFragment1_Ready(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_MapFragment1_Ready extends BA.ResumableSub {
public ResumableSub_MapFragment1_Ready(ir.saelozahra.damaara.mazraeyeman.bazarchemahsoolact parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.saelozahra.damaara.mazraeyeman.bazarchemahsoolact parent;
RemoteObject _permission = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(false);
RemoteObject _cp = RemoteObject.declareNull("anywheresoftware.b4a.objects.MapFragmentWrapper.CameraPositionWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("MapFragment1_Ready (bazarchemahsoolact) ","bazarchemahsoolact",11,bazarchemahsoolact.mostCurrent.activityBA,bazarchemahsoolact.mostCurrent,125);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 126;BA.debugLine="Log(\"map ready\")";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","414024705",RemoteObject.createImmutable("map ready"),0);
 BA.debugLineNum = 128;BA.debugLine="If Starter.rp.Check(Starter.rp.PERMISSION_ACCESS_";
Debug.ShouldStop(-2147483648);
if (true) break;

case 1:
//if
this.state = 16;
if (parent.mostCurrent._starter._rp /*RemoteObject*/ .runMethod(true,"Check",(Object)(parent.mostCurrent._starter._rp /*RemoteObject*/ .getField(true,"PERMISSION_ACCESS_FINE_LOCATION"))).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 9;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 129;BA.debugLine="If MapFragment1.GetMap.IsInitialized Then";
Debug.ShouldStop(1);
if (true) break;

case 4:
//if
this.state = 7;
if (parent.mostCurrent._mapfragment1.runMethod(false,"GetMap").runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 130;BA.debugLine="GMap = MapFragment1.GetMap";
Debug.ShouldStop(2);
parent.mostCurrent._gmap = parent.mostCurrent._mapfragment1.runMethod(false,"GetMap");
 if (true) break;

case 7:
//C
this.state = 16;
;
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 133;BA.debugLine="Starter.rp.CheckAndRequest(Starter.rp.PERMISSION";
Debug.ShouldStop(16);
parent.mostCurrent._starter._rp /*RemoteObject*/ .runVoidMethod ("CheckAndRequest",bazarchemahsoolact.processBA,(Object)(parent.mostCurrent._starter._rp /*RemoteObject*/ .getField(true,"PERMISSION_ACCESS_FINE_LOCATION")));
 BA.debugLineNum = 134;BA.debugLine="Wait For Activity_PermissionResult (Permission A";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","activity_permissionresult", bazarchemahsoolact.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "bazarchemahsoolact", "mapfragment1_ready"), null);
this.state = 26;
return;
case 26:
//C
this.state = 10;
_permission = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Permission", _permission);
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 135;BA.debugLine="If Result Then MapFragment1_Ready";
Debug.ShouldStop(64);
if (true) break;

case 10:
//if
this.state = 15;
if (_result.<Boolean>get().booleanValue()) { 
this.state = 12;
;}if (true) break;

case 12:
//C
this.state = 15;
_mapfragment1_ready();
if (true) break;

case 15:
//C
this.state = 16;
;
 if (true) break;
;
 BA.debugLineNum = 138;BA.debugLine="If Not(GMap.IsInitialized) Then";
Debug.ShouldStop(512);

case 16:
//if
this.state = 25;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._gmap.runMethod(true,"IsInitialized"))).<Boolean>get().booleanValue()) { 
this.state = 18;
}else {
this.state = 20;
}if (true) break;

case 18:
//C
this.state = 25;
 BA.debugLineNum = 139;BA.debugLine="ToastMessageShow(\"Error initializing the map.\",";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Error initializing the map.")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 141;BA.debugLine="If components(1).Length>2 Then";
Debug.ShouldStop(4096);
if (true) break;

case 21:
//if
this.state = 24;
if (RemoteObject.solveBoolean(">",parent.mostCurrent._components.getArrayElement(true,BA.numberCast(int.class, 1)).runMethod(true,"length"),BA.numberCast(double.class, 2))) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 142;BA.debugLine="Dim cp As CameraPosition";
Debug.ShouldStop(8192);
_cp = RemoteObject.createNew ("anywheresoftware.b4a.objects.MapFragmentWrapper.CameraPositionWrapper");Debug.locals.put("cp", _cp);
 BA.debugLineNum = 143;BA.debugLine="cp.Initialize(components(0), components(1), GMa";
Debug.ShouldStop(16384);
_cp.runVoidMethod ("Initialize",(Object)(BA.numberCast(double.class, parent.mostCurrent._components.getArrayElement(true,BA.numberCast(int.class, 0)))),(Object)(BA.numberCast(double.class, parent.mostCurrent._components.getArrayElement(true,BA.numberCast(int.class, 1)))),(Object)(parent.mostCurrent._gmap.runMethod(false,"getCameraPosition").runMethod(true,"getZoom")));
 BA.debugLineNum = 144;BA.debugLine="GMap.AnimateCamera(cp)";
Debug.ShouldStop(32768);
parent.mostCurrent._gmap.runVoidMethod ("AnimateCamera",(Object)((_cp.getObject())));
 BA.debugLineNum = 145;BA.debugLine="GMap.AddMarker2(components(0), components(1),\"م";
Debug.ShouldStop(65536);
parent.mostCurrent._gmap.runVoidMethod ("AddMarker2",(Object)(BA.numberCast(double.class, parent.mostCurrent._components.getArrayElement(true,BA.numberCast(int.class, 0)))),(Object)(BA.numberCast(double.class, parent.mostCurrent._components.getArrayElement(true,BA.numberCast(int.class, 1)))),(Object)(BA.ObjectToString("موقعیت این محصول")),(Object)(parent.mostCurrent._gmap.getField(true,"HUE_YELLOW")));
 if (true) break;

case 24:
//C
this.state = 25;
;
 if (true) break;

case 25:
//C
this.state = -1;
;
 BA.debugLineNum = 149;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Dim pageVals As Map";
bazarchemahsoolact._pagevals = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}