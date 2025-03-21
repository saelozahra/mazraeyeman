package b4j.example;


import anywheresoftware.b4a.BA;

public class main extends javafx.application.Application{
public static main mostCurrent = new main();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.main", null);
		ba.loadHtSubs(main.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.main", ba);
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}

 
    public static void main(String[] args) {
    	launch(args);
    }
    public void start (javafx.stage.Stage stage) {
        try {
            if (!false)
                System.setProperty("prism.lcdtext", "false");
            anywheresoftware.b4j.objects.FxBA.application = this;
		    anywheresoftware.b4a.keywords.Common.setDensity(javafx.stage.Screen.getPrimary().getDpi());
            anywheresoftware.b4a.keywords.Common.LogDebug("Program started.");
            initializeProcessGlobals();
            anywheresoftware.b4j.objects.Form frm = new anywheresoftware.b4j.objects.Form();
            frm.initWithStage(ba, stage, 600, 400);
            ba.raiseEvent(null, "appstart", frm, (String[])getParameters().getRaw().toArray(new String[0]));
        } catch (Throwable t) {
            BA.printException(t, true);
            System.exit(1);
        }
    }
public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static anywheresoftware.b4j.objects.Form _mainform = null;
public static String _api_key = "";
public static anywheresoftware.b4j.objects.ButtonWrapper _button_clear = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _button_oku = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _button_send = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _button_yaz = null;
public static anywheresoftware.b4j.objects.LabelWrapper _label1 = null;
public static anywheresoftware.b4j.objects.LabelWrapper _label2 = null;
public static anywheresoftware.b4j.objects.LabelWrapper _label3 = null;
public static anywheresoftware.b4j.objects.ListViewWrapper _listview1 = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _textfield_api = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _textfield_msg = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _textfield_msg_title = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _textfield_topic = null;
public static b4j.example.httputils2service _httputils2service = null;
public static String  _appstart(anywheresoftware.b4j.objects.Form _form1,String[] _args) throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
 //BA.debugLineNum = 31;BA.debugLine="MainForm = Form1";
_mainform = _form1;
 //BA.debugLineNum = 32;BA.debugLine="MainForm.RootPane.LoadLayout(\"L1\") 'Load the layo";
_mainform.getRootPane().LoadLayout(ba,"L1");
 //BA.debugLineNum = 33;BA.debugLine="MainForm.Show";
_mainform.Show();
 //BA.debugLineNum = 34;BA.debugLine="TextField_api.Text=API_KEY";
_textfield_api.setText(_api_key);
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return "";
}
public static String  _button_clear_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Sub Button_Clear_MouseClicked (EventData As MouseE";
 //BA.debugLineNum = 85;BA.debugLine="TextField_api.Text=\"\"";
_textfield_api.setText("");
 //BA.debugLineNum = 86;BA.debugLine="TextField_msg.Text=\"\"";
_textfield_msg.setText("");
 //BA.debugLineNum = 87;BA.debugLine="TextField_msg_title .Text=\"\"";
_textfield_msg_title.setText("");
 //BA.debugLineNum = 88;BA.debugLine="TextField_topic.Text=\"\"";
_textfield_topic.setText("");
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return "";
}
public static String  _button_oku_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub Button_OKU_MouseClicked (EventData As MouseEve";
 //BA.debugLineNum = 81;BA.debugLine="TextField_api.Text= File.readString(File.DirApp,\"";
_textfield_api.setText(anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"api.txt"));
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return "";
}
public static String  _button_send_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Sub Button_Send_MouseClicked (EventData As MouseEv";
 //BA.debugLineNum = 76;BA.debugLine="SendMessage(TextField_topic.Text.Trim,TextField_m";
_sendmessage(_textfield_topic.getText().trim(),_textfield_msg_title.getText().trim(),_textfield_msg.getText().trim(),_api_key);
 //BA.debugLineNum = 77;BA.debugLine="ListView1.Items.Add(DateTime.Time(DateTime.Now)&\"";
_listview1.getItems().Add((Object)(anywheresoftware.b4a.keywords.Common.DateTime.Time(anywheresoftware.b4a.keywords.Common.DateTime.getNow())+" ->>"+"پیام ارسال شد"));
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return "";
}
public static String  _button_yaz_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Sub Button_YAZ_MouseClicked (EventData As MouseEve";
 //BA.debugLineNum = 69;BA.debugLine="File.WriteString(File.DirApp,\"api.txt\",TextField_";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"api.txt",_textfield_api.getText().trim());
 //BA.debugLineNum = 70;BA.debugLine="fx.Msgbox(MainForm,\"API saved\",\"API records\")";
_fx.Msgbox(_mainform,"API saved","API records");
 //BA.debugLineNum = 71;BA.debugLine="ListView1.Items.Add(DateTime.Time(DateTime.Now)&\"";
_listview1.getItems().Add((Object)(anywheresoftware.b4a.keywords.Common.DateTime.Time(anywheresoftware.b4a.keywords.Common.DateTime.getNow())+" ->>"+"api saved"));
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(b4j.example.httpjob _job) throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Sub JobDone(job As HttpJob)";
 //BA.debugLineNum = 57;BA.debugLine="Log(job)";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(_job));
 //BA.debugLineNum = 58;BA.debugLine="ListView1.Items.Add(job)";
_listview1.getItems().Add((Object)(_job));
 //BA.debugLineNum = 59;BA.debugLine="ListView1.Items.Add(\"---------------------\")";
_listview1.getItems().Add((Object)("---------------------"));
 //BA.debugLineNum = 60;BA.debugLine="If job.Success Then";
if (_job._success) { 
 //BA.debugLineNum = 61;BA.debugLine="Log(job.GetString)";
anywheresoftware.b4a.keywords.Common.Log(_job._getstring());
 //BA.debugLineNum = 62;BA.debugLine="ListView1.Items.Add(DateTime.Time(DateTime.Now)&";
_listview1.getItems().Add((Object)(anywheresoftware.b4a.keywords.Common.DateTime.Time(anywheresoftware.b4a.keywords.Common.DateTime.getNow())+" ->>"+_job._getstring()));
 };
 //BA.debugLineNum = 64;BA.debugLine="job.Release";
_job._release();
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return "";
}

private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main._process_globals();
httputils2service._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 8;BA.debugLine="Private MainForm As Form";
_mainform = new anywheresoftware.b4j.objects.Form();
 //BA.debugLineNum = 10;BA.debugLine="Private const API_KEY As String = \"AAAAMxi6KEU:AP";
_api_key = "AAAAMxi6KEU:APA91bHXQjpXyPBxJl28CUGPvlDmZMQ6B0k6tcQGNvu9tHTwnXbHNcPQk1CQccDrq_O0-kSk5YucBb1NLXSC5-y6Oimvp6tjkkNEGPEK7GLdL_ZAHVI8bjMz0r-eTvQNCP4KQU446N3E";
 //BA.debugLineNum = 16;BA.debugLine="Private Button_Clear As Button";
_button_clear = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Private Button_OKU As Button";
_button_oku = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Private Button_Send As Button";
_button_send = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Private Button_YAZ As Button";
_button_yaz = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Private Label1 As Label";
_label1 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Private Label2 As Label";
_label2 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Private Label3 As Label";
_label3 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Private ListView1 As ListView";
_listview1 = new anywheresoftware.b4j.objects.ListViewWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Private TextField_api As TextField";
_textfield_api = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
 //BA.debugLineNum = 25;BA.debugLine="Private TextField_msg As TextField";
_textfield_msg = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Private TextField_msg_title As TextField";
_textfield_msg_title = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Private TextField_topic As TextField";
_textfield_topic = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return "";
}
public static String  _sendmessage(String _topic,String _title,String _body,String _key) throws Exception{
b4j.example.httpjob _job = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
anywheresoftware.b4a.objects.collections.Map _data = null;
anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator _jg = null;
 //BA.debugLineNum = 38;BA.debugLine="Private Sub SendMessage(Topic As String, Title As";
 //BA.debugLineNum = 39;BA.debugLine="Dim Job As HttpJob";
_job = new b4j.example.httpjob();
 //BA.debugLineNum = 40;BA.debugLine="Job.Initialize(\"fcm\", Me)";
_job._initialize(ba,"fcm",main.getObject());
 //BA.debugLineNum = 41;BA.debugLine="Dim m As Map = CreateMap(\"to\": $\"/topics/${Topic}";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("to"),(Object)(("/topics/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_topic))+""))});
 //BA.debugLineNum = 42;BA.debugLine="Dim data As Map = CreateMap(\"title\": Title, \"body";
_data = new anywheresoftware.b4a.objects.collections.Map();
_data = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("title"),(Object)(_title),(Object)("body"),(Object)(_body),(Object)("type"),(Object)("text")});
 //BA.debugLineNum = 43;BA.debugLine="m.Put(\"data\": data)";
_m.Put((Object)("data"),(Object)(_data.getObject()));
 //BA.debugLineNum = 44;BA.debugLine="Dim jg As JSONGenerator";
_jg = new anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 45;BA.debugLine="jg.Initialize(m)";
_jg.Initialize(_m);
 //BA.debugLineNum = 46;BA.debugLine="Job.PostString(\"https://fcm.googleapis.com/fcm/se";
_job._poststring("https://fcm.googleapis.com/fcm/send",_jg.ToString());
 //BA.debugLineNum = 47;BA.debugLine="Job.GetRequest";
_job._getrequest();
 //BA.debugLineNum = 48;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\")";
_job._getrequest().SetContentType("application/json");
 //BA.debugLineNum = 49;BA.debugLine="Job.GetRequest.SetHeader(\"Authorization\", \"key=\"";
_job._getrequest().SetHeader("Authorization","key="+_key);
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return "";
}
}
