package ir.saelozahra.damaara.mazraeyeman;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class singlenewact_subs_0 {


public static RemoteObject  _actionbar_menuitemclick(RemoteObject _item) throws Exception{
try {
		Debug.PushSubsStack("ActionBar_MenuItemClick (singlenewact) ","singlenewact",21,singlenewact.mostCurrent.activityBA,singlenewact.mostCurrent,87);
if (RapidSub.canDelegate("actionbar_menuitemclick")) { return ir.saelozahra.damaara.mazraeyeman.singlenewact.remoteMe.runUserSub(false, "singlenewact","actionbar_menuitemclick", _item);}
Debug.locals.put("Item", _item);
 BA.debugLineNum = 87;BA.debugLine="Sub ActionBar_MenuItemClick (Item As ACMenuItem)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 88;BA.debugLine="Select Item.Id";
Debug.ShouldStop(8388608);
switch (BA.switchObjectToInt(_item.runMethod(true,"getId"),BA.numberCast(int.class, 1),BA.numberCast(int.class, 2),BA.numberCast(int.class, 3))) {
case 0: {
 break; }
case 1: {
 BA.debugLineNum = 91;BA.debugLine="fullscreen_video_act.videoUrlStr = video_str";
Debug.ShouldStop(67108864);
singlenewact.mostCurrent._fullscreen_video_act._videourlstr /*RemoteObject*/  = singlenewact._video_str;
 BA.debugLineNum = 92;BA.debugLine="StartActivity(fullscreen_video_act)";
Debug.ShouldStop(134217728);
singlenewact.mostCurrent.__c.runVoidMethod ("StartActivity",singlenewact.processBA,(Object)((singlenewact.mostCurrent._fullscreen_video_act.getObject())));
 break; }
case 2: {
 BA.debugLineNum = 94;BA.debugLine="Log(			 SaeloZahra.json_url&\"post.php?type=html";
Debug.ShouldStop(536870912);
singlenewact.mostCurrent.__c.runVoidMethod ("LogImpl","421889031",RemoteObject.concat(singlenewact.mostCurrent._saelozahra._json_url /*RemoteObject*/ ,RemoteObject.createImmutable("post.php?type=html&like=true&id="),singlenewact._post_id),0);
 BA.debugLineNum = 95;BA.debugLine="likeJob.Download(SaeloZahra.json_url&\"post.php?";
Debug.ShouldStop(1073741824);
singlenewact.mostCurrent._likejob.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.concat(singlenewact.mostCurrent._saelozahra._json_url /*RemoteObject*/ ,RemoteObject.createImmutable("post.php?type=html&like=true&id="),singlenewact._post_id)));
 BA.debugLineNum = 96;BA.debugLine="If Stared Then";
Debug.ShouldStop(-2147483648);
if (singlenewact._stared.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 97;BA.debugLine="Stared = False";
Debug.ShouldStop(1);
singlenewact._stared = singlenewact.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 98;BA.debugLine="ActionBar.Menu.FindItem(3).Icon=X1.GetDrawable";
Debug.ShouldStop(2);
singlenewact.mostCurrent._actionbar.runMethod(false,"getMenu").runMethod(false,"FindItem",(Object)(BA.numberCast(int.class, 3))).runMethod(false,"setIcon",singlenewact.mostCurrent._x1.runMethod(false,"GetDrawable",(Object)(RemoteObject.createImmutable("baseline_star_border_white_24"))));
 }else {
 BA.debugLineNum = 102;BA.debugLine="Stared = True";
Debug.ShouldStop(32);
singlenewact._stared = singlenewact.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 103;BA.debugLine="ActionBar.Menu.FindItem(3).Icon=X1.GetDrawable";
Debug.ShouldStop(64);
singlenewact.mostCurrent._actionbar.runMethod(false,"getMenu").runMethod(false,"FindItem",(Object)(BA.numberCast(int.class, 3))).runMethod(false,"setIcon",singlenewact.mostCurrent._x1.runMethod(false,"GetDrawable",(Object)(RemoteObject.createImmutable("baseline_star_white_24"))));
 };
 break; }
}
;
 BA.debugLineNum = 108;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("Actionbar_NavigationItemClick (singlenewact) ","singlenewact",21,singlenewact.mostCurrent.activityBA,singlenewact.mostCurrent,119);
if (RapidSub.canDelegate("actionbar_navigationitemclick")) { return ir.saelozahra.damaara.mazraeyeman.singlenewact.remoteMe.runUserSub(false, "singlenewact","actionbar_navigationitemclick");}
 BA.debugLineNum = 119;BA.debugLine="Sub Actionbar_NavigationItemClick";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 120;BA.debugLine="Activity.Finish";
Debug.ShouldStop(8388608);
singlenewact.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 121;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("Activity_Create (singlenewact) ","singlenewact",21,singlenewact.mostCurrent.activityBA,singlenewact.mostCurrent,32);
if (RapidSub.canDelegate("activity_create")) { return ir.saelozahra.damaara.mazraeyeman.singlenewact.remoteMe.runUserSub(false, "singlenewact","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 32;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 35;BA.debugLine="Activity.LoadLayout(\"WVNewLayout\")";
Debug.ShouldStop(4);
singlenewact.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("WVNewLayout")),singlenewact.mostCurrent.activityBA);
 BA.debugLineNum = 37;BA.debugLine="ActionBar.SetLayout(0,0,100%x,SaeloZahra.Material";
Debug.ShouldStop(16);
singlenewact.mostCurrent._actionbar.runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(singlenewact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),singlenewact.mostCurrent.activityBA)),(Object)(singlenewact.mostCurrent._saelozahra._materialactionbarheight /*RemoteObject*/ ));
 BA.debugLineNum = 38;BA.debugLine="WebView1.SetLayout(0,SaeloZahra.MaterialActionBar";
Debug.ShouldStop(32);
singlenewact.mostCurrent._webview1.runVoidMethod ("SetLayout",(Object)(BA.numberCast(int.class, 0)),(Object)(singlenewact.mostCurrent._saelozahra._materialactionbarheight /*RemoteObject*/ ),(Object)(singlenewact.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),singlenewact.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {singlenewact.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),singlenewact.mostCurrent.activityBA),singlenewact.mostCurrent._saelozahra._materialactionbarheight /*RemoteObject*/ }, "-",1, 1)));
 BA.debugLineNum = 39;BA.debugLine="SaeloZahra.SetStatusBarColor(SaeloZahra.ColorDark";
Debug.ShouldStop(64);
singlenewact.mostCurrent._saelozahra.runVoidMethod ("_setstatusbarcolor" /*RemoteObject*/ ,singlenewact.mostCurrent.activityBA,(Object)(singlenewact.mostCurrent._saelozahra._colordark /*RemoteObject*/ ));
 BA.debugLineNum = 40;BA.debugLine="ActionBar.Color = SaeloZahra.Color";
Debug.ShouldStop(128);
singlenewact.mostCurrent._actionbar.runVoidMethod ("setColor",singlenewact.mostCurrent._saelozahra._color /*RemoteObject*/ );
 BA.debugLineNum = 43;BA.debugLine="ActionBar.NavigationIconDrawable = X1.GetDrawable";
Debug.ShouldStop(1024);
singlenewact.mostCurrent._actionbar.runMethod(false,"setNavigationIconDrawable",singlenewact.mostCurrent._x1.runMethod(false,"GetDrawable",(Object)(RemoteObject.createImmutable("baseline_arrow_back_white_24"))));
 BA.debugLineNum = 46;BA.debugLine="ActionBar.Title = SaeloZahra.csb(\"نمایش مطلب\")";
Debug.ShouldStop(8192);
singlenewact.mostCurrent._actionbar.runMethod(true,"setTitle",BA.ObjectToCharSequence(singlenewact.mostCurrent._saelozahra.runMethod(false,"_csb" /*RemoteObject*/ ,singlenewact.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("نمایش مطلب"))).getObject()));
 BA.debugLineNum = 50;BA.debugLine="CSS = \" <html><head><style>@import url(https://cd";
Debug.ShouldStop(131072);
singlenewact.mostCurrent._css = BA.ObjectToString(" <html><head><style>@import url(https://cdn.jsdelivr.net/gh/rastikerdar/samim-font@v4.0.5/dist/font-face.css); *{ line-height:2;direction:rtl; font-family:'Samim'; max-width:100%; } h1,h2,h3,h4,h5,h6,h7{ font-weight: bold; } img,video{max-width:100%;height:auto;} video{float:right;} iframe{border:0;} .title{colot:#212121;} a{text-decoration:none;color:#590606} body{ box-sizing:border-box; padding:0 5px 18px 5px; } </style>");
 BA.debugLineNum = 51;BA.debugLine="WebView1.LoadHtml(CSS& \"</head><body><h3 class='t";
Debug.ShouldStop(262144);
singlenewact.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(RemoteObject.concat(singlenewact.mostCurrent._css,RemoteObject.createImmutable("</head><body><h3 class='title'><a href='"),singlenewact.mostCurrent._fullcontentlink,RemoteObject.createImmutable("'>"),singlenewact._caption_str,RemoteObject.createImmutable("</a></h3>"),singlenewact._content_str,RemoteObject.createImmutable("</body></html>"))));
 BA.debugLineNum = 53;BA.debugLine="ActionBar.InitMenuListener";
Debug.ShouldStop(1048576);
singlenewact.mostCurrent._actionbar.runVoidMethod ("InitMenuListener");
 BA.debugLineNum = 55;BA.debugLine="If video_str.Length>20 Then ActionBar.Menu.Add2(2";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean(">",singlenewact._video_str.runMethod(true,"length"),BA.numberCast(double.class, 20))) { 
singlenewact.mostCurrent._actionbar.runMethod(false,"getMenu").runMethod(false,"Add2",(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.ObjectToCharSequence("پخش فیلم")),(Object)(singlenewact.mostCurrent._x1.runMethod(false,"GetDrawable",(Object)(RemoteObject.createImmutable("baseline_fullscreen_white_24"))))).runVoidMethod ("setShowAsAction",BA.numberCast(int.class, 2));};
 BA.debugLineNum = 57;BA.debugLine="If Stared Then";
Debug.ShouldStop(16777216);
if (singlenewact._stared.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 58;BA.debugLine="ActionBar.Menu.Add2(3,3,\"مورد علاقه\",X1.GetDrawa";
Debug.ShouldStop(33554432);
singlenewact.mostCurrent._actionbar.runMethod(false,"getMenu").runMethod(false,"Add2",(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.ObjectToCharSequence("مورد علاقه")),(Object)(singlenewact.mostCurrent._x1.runMethod(false,"GetDrawable",(Object)(RemoteObject.createImmutable("baseline_star_white_24"))))).runVoidMethod ("setShowAsAction",BA.numberCast(int.class, 2));
 }else {
 BA.debugLineNum = 60;BA.debugLine="ActionBar.Menu.Add2(3,3,\"مورد علاقه\",X1.GetDrawa";
Debug.ShouldStop(134217728);
singlenewact.mostCurrent._actionbar.runMethod(false,"getMenu").runMethod(false,"Add2",(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.ObjectToCharSequence("مورد علاقه")),(Object)(singlenewact.mostCurrent._x1.runMethod(false,"GetDrawable",(Object)(RemoteObject.createImmutable("baseline_star_border_white_24"))))).runVoidMethod ("setShowAsAction",BA.numberCast(int.class, 2));
 };
 BA.debugLineNum = 63;BA.debugLine="likeJob.Initialize(\"likeJob\",Me)";
Debug.ShouldStop(1073741824);
singlenewact.mostCurrent._likejob.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_initialize" /*RemoteObject*/ ,singlenewact.processBA,(Object)(BA.ObjectToString("likeJob")),(Object)(singlenewact.getObject()));
 BA.debugLineNum = 65;BA.debugLine="customBrowser.Initialize";
Debug.ShouldStop(1);
singlenewact.mostCurrent._custombrowser.runVoidMethod ("Initialize",singlenewact.mostCurrent.activityBA);
 BA.debugLineNum = 66;BA.debugLine="customBrowser.ToolbarColor = SaeloZahra.Color";
Debug.ShouldStop(2);
singlenewact.mostCurrent._custombrowser.runVoidMethod ("setToolbarColor",singlenewact.mostCurrent._saelozahra._color /*RemoteObject*/ );
 BA.debugLineNum = 68;BA.debugLine="customBrowser.ShowTitle = True";
Debug.ShouldStop(8);
singlenewact.mostCurrent._custombrowser.runVoidMethod ("setShowTitle",singlenewact.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 70;BA.debugLine="customBrowser.Build";
Debug.ShouldStop(32);
singlenewact.mostCurrent._custombrowser.runVoidMethod ("Build");
 BA.debugLineNum = 72;BA.debugLine="If SaeloZahra.P.SdkVersion>23 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean(">",singlenewact.mostCurrent._saelozahra._p /*RemoteObject*/ .runMethod(true,"getSdkVersion"),BA.numberCast(double.class, 23))) { 
 BA.debugLineNum = 73;BA.debugLine="Config.Initialize";
Debug.ShouldStop(256);
singlenewact.mostCurrent._config.runVoidMethod ("Initialize",singlenewact.processBA);
 BA.debugLineNum = 74;BA.debugLine="Config.position(Config.POSITION_LEFT)";
Debug.ShouldStop(512);
singlenewact.mostCurrent._config.runVoidMethod ("position",(Object)(singlenewact.mostCurrent._config.getField(true,"POSITION_LEFT")));
 BA.debugLineNum = 75;BA.debugLine="Config.primaryColor(SaeloZahra.ColorDark)";
Debug.ShouldStop(1024);
singlenewact.mostCurrent._config.runVoidMethod ("primaryColor",(Object)(singlenewact.mostCurrent._saelozahra._colordark /*RemoteObject*/ ));
 BA.debugLineNum = 76;BA.debugLine="Config.edge(True)";
Debug.ShouldStop(2048);
singlenewact.mostCurrent._config.runVoidMethod ("edge",(Object)(singlenewact.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 77;BA.debugLine="Config.sensitivity(100)";
Debug.ShouldStop(4096);
singlenewact.mostCurrent._config.runVoidMethod ("sensitivity",(Object)(BA.numberCast(float.class, 100)));
 BA.debugLineNum = 78;BA.debugLine="Config.scrimColor(Colors.ARGB(180,0,0,0))";
Debug.ShouldStop(8192);
singlenewact.mostCurrent._config.runVoidMethod ("scrimColor",(Object)(singlenewact.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 180)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))));
 BA.debugLineNum = 80;BA.debugLine="Show.convertActivityToTranslucent";
Debug.ShouldStop(32768);
singlenewact.mostCurrent._show.runVoidMethod ("convertActivityToTranslucent",singlenewact.mostCurrent.activityBA);
 BA.debugLineNum = 81;BA.debugLine="Show.attachActivity(Config)";
Debug.ShouldStop(65536);
singlenewact.mostCurrent._show.runVoidMethod ("attachActivity",singlenewact.mostCurrent.activityBA,(Object)(singlenewact.mostCurrent._config));
 };
 BA.debugLineNum = 84;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (singlenewact) ","singlenewact",21,singlenewact.mostCurrent.activityBA,singlenewact.mostCurrent,115);
if (RapidSub.canDelegate("activity_pause")) { return ir.saelozahra.damaara.mazraeyeman.singlenewact.remoteMe.runUserSub(false, "singlenewact","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 115;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 117;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("Activity_Resume (singlenewact) ","singlenewact",21,singlenewact.mostCurrent.activityBA,singlenewact.mostCurrent,111);
if (RapidSub.canDelegate("activity_resume")) { return ir.saelozahra.damaara.mazraeyeman.singlenewact.remoteMe.runUserSub(false, "singlenewact","activity_resume");}
 BA.debugLineNum = 111;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(16384);
 BA.debugLineNum = 113;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 19;BA.debugLine="Dim Config 	As Amir_SliderConfig";
singlenewact.mostCurrent._config = RemoteObject.createNew ("ir.aghajari.slider.Amir_SlisderConfig");
 //BA.debugLineNum = 20;BA.debugLine="Dim Show 	As Amir_SliderShow";
singlenewact.mostCurrent._show = RemoteObject.createNew ("ir.aghajari.slider.Amir_SliderShow");
 //BA.debugLineNum = 22;BA.debugLine="Dim CSS As String";
singlenewact.mostCurrent._css = RemoteObject.createImmutable("");
 //BA.debugLineNum = 23;BA.debugLine="Dim customBrowser As JK_CustomTabsBrowser";
singlenewact.mostCurrent._custombrowser = RemoteObject.createNew ("ir.jokar.customtabsbrowser.wrapper");
 //BA.debugLineNum = 24;BA.debugLine="Dim ActionBar As ACToolBarLight";
singlenewact.mostCurrent._actionbar = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACToolbarLightWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Dim WebView1 As WebView";
singlenewact.mostCurrent._webview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Dim likeJob As HttpJob";
singlenewact.mostCurrent._likejob = RemoteObject.createNew ("ir.saelozahra.damaara.mazraeyeman.httpjob");
 //BA.debugLineNum = 27;BA.debugLine="Dim ds As DSSnackbar";
singlenewact.mostCurrent._ds = RemoteObject.createNew ("de.amberhome.objects.SnackbarWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Dim X1 As XmlLayoutBuilder";
singlenewact.mostCurrent._x1 = RemoteObject.createNew ("anywheresoftware.b4a.object.XmlLayoutBuilder");
 //BA.debugLineNum = 29;BA.debugLine="Dim FullContentLink As String = SaeloZahra.site_u";
singlenewact.mostCurrent._fullcontentlink = RemoteObject.concat(singlenewact.mostCurrent._saelozahra._site_url /*RemoteObject*/ ,RemoteObject.createImmutable("/?p="),singlenewact._post_id);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (singlenewact) ","singlenewact",21,singlenewact.mostCurrent.activityBA,singlenewact.mostCurrent,124);
if (RapidSub.canDelegate("jobdone")) { return ir.saelozahra.damaara.mazraeyeman.singlenewact.remoteMe.runUserSub(false, "singlenewact","jobdone", _job);}
RemoteObject _csb1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.CSBuilder");
Debug.locals.put("job", _job);
 BA.debugLineNum = 124;BA.debugLine="Sub JobDone (job As HttpJob)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 126;BA.debugLine="If job.Success Then";
Debug.ShouldStop(536870912);
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 128;BA.debugLine="Dim csb1 As CSBuilder";
Debug.ShouldStop(-2147483648);
_csb1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.CSBuilder");Debug.locals.put("csb1", _csb1);
 BA.debugLineNum = 129;BA.debugLine="csb1.Initialize";
Debug.ShouldStop(1);
_csb1.runVoidMethod ("Initialize");
 BA.debugLineNum = 130;BA.debugLine="csb1.Alignment(\"ALIGN_OPPOSITE\").Typeface(Typefa";
Debug.ShouldStop(2);
_csb1.runMethod(false,"Alignment",(Object)(BA.getEnumFromString(BA.getDeviceClass("android.text.Layout.Alignment"),RemoteObject.createImmutable("ALIGN_OPPOSITE")))).runMethod(false,"Typeface",(Object)(singlenewact.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"getFONTAWESOME"))).runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(singlenewact.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xf21e))))))).runMethod(false,"Pop").runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("پسندیدید")))).runVoidMethod ("PopAll");
 BA.debugLineNum = 131;BA.debugLine="ds.Initialize(\"ds\",Activity,csb1,ds.DURATION_LON";
Debug.ShouldStop(4);
singlenewact.mostCurrent._ds.runVoidMethod ("Initialize",singlenewact.mostCurrent.activityBA,(Object)(BA.ObjectToString("ds")),(Object)((singlenewact.mostCurrent._activity.getObject())),(Object)(BA.ObjectToCharSequence(_csb1.getObject())),(Object)(singlenewact.mostCurrent._ds.getField(true,"DURATION_LONG")));
 BA.debugLineNum = 132;BA.debugLine="ds.Show";
Debug.ShouldStop(8);
singlenewact.mostCurrent._ds.runVoidMethod ("Show");
 BA.debugLineNum = 133;BA.debugLine="WebView1.LoadHtml(CSS& \"</head><body>\" & job.Get";
Debug.ShouldStop(16);
singlenewact.mostCurrent._webview1.runVoidMethod ("LoadHtml",(Object)(RemoteObject.concat(singlenewact.mostCurrent._css,RemoteObject.createImmutable("</head><body>"),_job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_getstring" /*RemoteObject*/ ),RemoteObject.createImmutable("</body></html>"))));
 }else {
 BA.debugLineNum = 135;BA.debugLine="Actionbar_NavigationItemClick";
Debug.ShouldStop(64);
_actionbar_navigationitemclick();
 };
 BA.debugLineNum = 138;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(512);
singlenewact.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 140;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
 //BA.debugLineNum = 10;BA.debugLine="Dim post_id As String";
singlenewact._post_id = RemoteObject.createImmutable("");
 //BA.debugLineNum = 11;BA.debugLine="Dim caption_str As String";
singlenewact._caption_str = RemoteObject.createImmutable("");
 //BA.debugLineNum = 12;BA.debugLine="Dim content_str As String";
singlenewact._content_str = RemoteObject.createImmutable("");
 //BA.debugLineNum = 13;BA.debugLine="Dim video_str As String";
singlenewact._video_str = RemoteObject.createImmutable("");
 //BA.debugLineNum = 14;BA.debugLine="Dim Stared As Boolean = False";
singlenewact._stared = singlenewact.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _webview1_overrideurl(RemoteObject _url) throws Exception{
try {
		Debug.PushSubsStack("WebView1_OverrideUrl (singlenewact) ","singlenewact",21,singlenewact.mostCurrent.activityBA,singlenewact.mostCurrent,146);
if (RapidSub.canDelegate("webview1_overrideurl")) { return ir.saelozahra.damaara.mazraeyeman.singlenewact.remoteMe.runUserSub(false, "singlenewact","webview1_overrideurl", _url);}
Debug.locals.put("Url", _url);
 BA.debugLineNum = 146;BA.debugLine="Sub WebView1_OverrideUrl (Url As String) As Boolea";
Debug.ShouldStop(131072);
 BA.debugLineNum = 148;BA.debugLine="customBrowser.CreateNewTab(Url)";
Debug.ShouldStop(524288);
singlenewact.mostCurrent._custombrowser.runVoidMethod ("CreateNewTab",(Object)(_url));
 BA.debugLineNum = 150;BA.debugLine="Return True";
Debug.ShouldStop(2097152);
if (true) return singlenewact.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 152;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _webview1_pagefinished(RemoteObject _url) throws Exception{
try {
		Debug.PushSubsStack("WebView1_PageFinished (singlenewact) ","singlenewact",21,singlenewact.mostCurrent.activityBA,singlenewact.mostCurrent,142);
if (RapidSub.canDelegate("webview1_pagefinished")) { return ir.saelozahra.damaara.mazraeyeman.singlenewact.remoteMe.runUserSub(false, "singlenewact","webview1_pagefinished", _url);}
Debug.locals.put("Url", _url);
 BA.debugLineNum = 142;BA.debugLine="Sub WebView1_PageFinished (Url As String)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 144;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}