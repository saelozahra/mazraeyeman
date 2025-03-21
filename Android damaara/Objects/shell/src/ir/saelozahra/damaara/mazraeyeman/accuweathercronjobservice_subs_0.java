package ir.saelozahra.damaara.mazraeyeman;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class accuweathercronjobservice_subs_0 {


public static void  _calcaccuweather(RemoteObject _getstring) throws Exception{
try {
		Debug.PushSubsStack("calcAccuWeather (accuweathercronjobservice) ","accuweathercronjobservice",5,accuweathercronjobservice.processBA,accuweathercronjobservice.mostCurrent,209);
if (RapidSub.canDelegate("calcaccuweather")) { ir.saelozahra.damaara.mazraeyeman.accuweathercronjobservice.remoteMe.runUserSub(false, "accuweathercronjobservice","calcaccuweather", _getstring); return;}
ResumableSub_calcAccuWeather rsub = new ResumableSub_calcAccuWeather(null,_getstring);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_calcAccuWeather extends BA.ResumableSub {
public ResumableSub_calcAccuWeather(ir.saelozahra.damaara.mazraeyeman.accuweathercronjobservice parent,RemoteObject _getstring) {
this.parent = parent;
this._getstring = _getstring;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.saelozahra.damaara.mazraeyeman.accuweathercronjobservice parent;
RemoteObject _getstring;
RemoteObject _shomarande = RemoteObject.createImmutable(0);
RemoteObject _vaziathtml = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _headline = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _dailyforecasts = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _coldailyforecasts = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _moon = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _moonepochset = RemoteObject.createImmutable(0);
RemoteObject _moonset = RemoteObject.createImmutable("");
RemoteObject _sun = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _sunepochset = RemoteObject.createImmutable(0);
RemoteObject _sunset = RemoteObject.createImmutable("");
RemoteObject _thisdatetime = RemoteObject.createImmutable("");
RemoteObject _temperature = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _temperatureminimum = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _temperatureminimumvalue = RemoteObject.createImmutable(0);
RemoteObject _temperaturemaximum = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _temperaturemaximumvalue = RemoteObject.createImmutable(0);
RemoteObject _night = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _nightrainprobability = RemoteObject.createImmutable(0);
RemoteObject _nightsnowprobability = RemoteObject.createImmutable(0);
RemoteObject _nightprecipitationprobability = RemoteObject.createImmutable(0);
RemoteObject _nighticeprobability = RemoteObject.createImmutable(0);
RemoteObject _nightcloudcover = RemoteObject.createImmutable(0);
RemoteObject _nightwind = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _nightwindspeed = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _nightwindspeedvalue = RemoteObject.createImmutable(0);
RemoteObject _nightwinddirection = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _nightwinddirectionlocalized = RemoteObject.createImmutable("");
RemoteObject _nightsnow = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _nightsnowvalue = RemoteObject.createImmutable(0);
RemoteObject _nighttotalliquid = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _nighttotalliquidvalue = RemoteObject.createImmutable(0);
RemoteObject _nightice = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _nighticevalue = RemoteObject.createImmutable(0);
RemoteObject _nightrain = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _nightrainvalue = RemoteObject.createImmutable(0);
RemoteObject _nightwindgust = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _nightwindgustspeed = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _nightwindgustspeedvalue = RemoteObject.createImmutable(0);
RemoteObject _unixtimestamp = RemoteObject.createImmutable(0);
RemoteObject _degreedaysummary = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _degreedaysummarycooling = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _degreedaysummarycoolingvalue = RemoteObject.createImmutable(0);
RemoteObject _degreedaysummaryheating = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _degreedaysummaryheatingvalue = RemoteObject.createImmutable(0);
RemoteObject _day = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _daysnowprobability = RemoteObject.createImmutable(0);
RemoteObject _dayprecipitationprobability = RemoteObject.createImmutable(0);
RemoteObject _dayiceprobability = RemoteObject.createImmutable(0);
RemoteObject _daycloudcover = RemoteObject.createImmutable(0);
RemoteObject _daywind = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _daywindspeed = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _daywindspeedvalue = RemoteObject.createImmutable(0);
RemoteObject _daywinddirection = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _daywinddirectionlocalized = RemoteObject.createImmutable("");
RemoteObject _daysnow = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _daysnowvalue = RemoteObject.createImmutable(0);
RemoteObject _daytotalliquid = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _daytotalliquidvalue = RemoteObject.createImmutable(0);
RemoteObject _dayice = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _dayicevalue = RemoteObject.createImmutable(0);
RemoteObject _dayrain = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _dayrainvalue = RemoteObject.createImmutable(0);
RemoteObject _daywindgust = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _daywindgustspeed = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _daywindgustspeedvalue = RemoteObject.createImmutable(0);
RemoteObject _khodetarikh = RemoteObject.createImmutable("");
RemoteObject _roozetarikh = RemoteObject.createImmutable("");
RemoteObject _mahesh = RemoteObject.createImmutable("");
RemoteObject _shamsidate = RemoteObject.declareNull("anywheresoftware.b4a.student.PersianDate");
RemoteObject _mapnight = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mapday = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _vaziatesh = RemoteObject.createImmutable("");
RemoteObject _j3 = RemoteObject.declareNull("ir.saelozahra.damaara.mazraeyeman.httpjob");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject group17;
int index17;
int groupLen17;
RemoteObject group188;
int index188;
int groupLen188;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("calcAccuWeather (accuweathercronjobservice) ","accuweathercronjobservice",5,accuweathercronjobservice.processBA,accuweathercronjobservice.mostCurrent,209);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("getString", _getstring);
 BA.debugLineNum = 211;BA.debugLine="Dim shomarande As Int = 0";
Debug.ShouldStop(262144);
_shomarande = BA.numberCast(int.class, 0);Debug.locals.put("shomarande", _shomarande);Debug.locals.put("shomarande", _shomarande);
 BA.debugLineNum = 213;BA.debugLine="BazeDama.Initialize";
Debug.ShouldStop(1048576);
parent._bazedama.runVoidMethod ("Initialize");
 BA.debugLineNum = 214;BA.debugLine="WindHaDay.Initialize";
Debug.ShouldStop(2097152);
parent._windhaday.runVoidMethod ("Initialize");
 BA.debugLineNum = 215;BA.debugLine="WindHaNight.Initialize";
Debug.ShouldStop(4194304);
parent._windhanight.runVoidMethod ("Initialize");
 BA.debugLineNum = 217;BA.debugLine="Try";
Debug.ShouldStop(16777216);
if (true) break;

case 1:
//try
this.state = 117;
this.catchState = 116;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 116;
 BA.debugLineNum = 218;BA.debugLine="Try";
Debug.ShouldStop(33554432);
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
 BA.debugLineNum = 219;BA.debugLine="Dim vaziatHtml As String=\"\"";
Debug.ShouldStop(67108864);
_vaziathtml = BA.ObjectToString("");Debug.locals.put("vaziatHtml", _vaziathtml);Debug.locals.put("vaziatHtml", _vaziathtml);
 BA.debugLineNum = 220;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(134217728);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 221;BA.debugLine="parser.Initialize(getString.Replace(\"null\",\"0\")";
Debug.ShouldStop(268435456);
_parser.runVoidMethod ("Initialize",(Object)(_getstring.runMethod(true,"replace",(Object)(BA.ObjectToString("null")),(Object)(RemoteObject.createImmutable("0"))).runMethod(true,"replace",(Object)(BA.ObjectToString("Null")),(Object)(RemoteObject.createImmutable("0")))));
 BA.debugLineNum = 222;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(536870912);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 223;BA.debugLine="Dim Headline As Map = root.Get(\"Headline\")";
Debug.ShouldStop(1073741824);
_headline = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_headline = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Headline")))));Debug.locals.put("Headline", _headline);Debug.locals.put("Headline", _headline);
 BA.debugLineNum = 224;BA.debugLine="MatneTouzihat = Headline.Get(\"Text\")";
Debug.ShouldStop(-2147483648);
parent._matnetouzihat = BA.ObjectToString(_headline.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Text")))));
 Debug.CheckDeviceExceptions();
if (true) break;

case 8:
//C
this.state = 9;
this.catchState = 116;
 BA.debugLineNum = 226;BA.debugLine="Log(\"همون بخش اول پکوندمون\")";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","45439505",RemoteObject.createImmutable("همون بخش اول پکوندمون"),0);
 if (true) break;
if (true) break;

case 9:
//C
this.state = 10;
this.catchState = 116;
;
 BA.debugLineNum = 235;BA.debugLine="Dim DailyForecasts As List = root.Get(\"DailyFore";
Debug.ShouldStop(1024);
_dailyforecasts = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_dailyforecasts = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("DailyForecasts")))));Debug.locals.put("DailyForecasts", _dailyforecasts);Debug.locals.put("DailyForecasts", _dailyforecasts);
 BA.debugLineNum = 236;BA.debugLine="For Each colDailyForecasts As Map In DailyForeca";
Debug.ShouldStop(2048);
if (true) break;

case 10:
//for
this.state = 100;
_coldailyforecasts = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group17 = _dailyforecasts;
index17 = 0;
groupLen17 = group17.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colDailyForecasts", _coldailyforecasts);
this.state = 118;
if (true) break;

case 118:
//C
this.state = 100;
if (index17 < groupLen17) {
this.state = 12;
_coldailyforecasts = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group17.runMethod(false,"Get",index17));Debug.locals.put("colDailyForecasts", _coldailyforecasts);}
if (true) break;

case 119:
//C
this.state = 118;
index17++;
Debug.locals.put("colDailyForecasts", _coldailyforecasts);
if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 237;BA.debugLine="shomarande = shomarande+1";
Debug.ShouldStop(4096);
_shomarande = RemoteObject.solve(new RemoteObject[] {_shomarande,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("shomarande", _shomarande);
 BA.debugLineNum = 238;BA.debugLine="LogColor(\"روز: \"&shomarande,Colors.Yellow)";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","45439517",RemoteObject.concat(RemoteObject.createImmutable("روز: "),_shomarande),parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Yellow"));
 BA.debugLineNum = 239;BA.debugLine="Dim Moon As Map = colDailyForecasts.Get(\"Moon\")";
Debug.ShouldStop(16384);
_moon = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_moon = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _coldailyforecasts.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Moon")))));Debug.locals.put("Moon", _moon);Debug.locals.put("Moon", _moon);
 BA.debugLineNum = 240;BA.debugLine="Dim MoonEpochSet As Int = Moon.Get(\"EpochSet\")";
Debug.ShouldStop(32768);
_moonepochset = BA.numberCast(int.class, _moon.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("EpochSet")))));Debug.locals.put("MoonEpochSet", _moonepochset);Debug.locals.put("MoonEpochSet", _moonepochset);
 BA.debugLineNum = 241;BA.debugLine="Dim MoonSet As String = Moon.Get(\"Set\")";
Debug.ShouldStop(65536);
_moonset = BA.ObjectToString(_moon.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Set")))));Debug.locals.put("MoonSet", _moonset);Debug.locals.put("MoonSet", _moonset);
 BA.debugLineNum = 242;BA.debugLine="MoonSet=MoonSet.SubString2(0,MoonSet.IndexOf(\"T";
Debug.ShouldStop(131072);
_moonset = _moonset.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(_moonset.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("T")))));Debug.locals.put("MoonSet", _moonset);
 BA.debugLineNum = 249;BA.debugLine="Dim Sun As Map = colDailyForecasts.Get(\"Sun\")";
Debug.ShouldStop(16777216);
_sun = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_sun = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _coldailyforecasts.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Sun")))));Debug.locals.put("Sun", _sun);Debug.locals.put("Sun", _sun);
 BA.debugLineNum = 250;BA.debugLine="Dim SunEpochSet As Int = Sun.Get(\"EpochSet\")";
Debug.ShouldStop(33554432);
_sunepochset = BA.numberCast(int.class, _sun.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("EpochSet")))));Debug.locals.put("SunEpochSet", _sunepochset);Debug.locals.put("SunEpochSet", _sunepochset);
 BA.debugLineNum = 251;BA.debugLine="Dim SunSet As String = Sun.Get(\"Set\")";
Debug.ShouldStop(67108864);
_sunset = BA.ObjectToString(_sun.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Set")))));Debug.locals.put("SunSet", _sunset);Debug.locals.put("SunSet", _sunset);
 BA.debugLineNum = 253;BA.debugLine="SunSet=SunSet.SubString2(0,SunSet.IndexOf(\"T\"))";
Debug.ShouldStop(268435456);
_sunset = _sunset.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(_sunset.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("T")))));Debug.locals.put("SunSet", _sunset);
 BA.debugLineNum = 257;BA.debugLine="Dim ThisDateTime As String = colDailyForecasts.";
Debug.ShouldStop(1);
_thisdatetime = BA.ObjectToString(_coldailyforecasts.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Date")))));Debug.locals.put("ThisDateTime", _thisdatetime);Debug.locals.put("ThisDateTime", _thisdatetime);
 BA.debugLineNum = 259;BA.debugLine="Dim Temperature As Map = colDailyForecasts.Get(";
Debug.ShouldStop(4);
_temperature = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_temperature = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _coldailyforecasts.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Temperature")))));Debug.locals.put("Temperature", _temperature);Debug.locals.put("Temperature", _temperature);
 BA.debugLineNum = 260;BA.debugLine="Dim TemperatureMinimum As Map = Temperature.Get(";
Debug.ShouldStop(8);
_temperatureminimum = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_temperatureminimum = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _temperature.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Minimum")))));Debug.locals.put("TemperatureMinimum", _temperatureminimum);Debug.locals.put("TemperatureMinimum", _temperatureminimum);
 BA.debugLineNum = 262;BA.debugLine="Dim TemperatureMinimumValue As Int = Temperatur";
Debug.ShouldStop(32);
_temperatureminimumvalue = BA.numberCast(int.class, _temperatureminimum.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Value")))));Debug.locals.put("TemperatureMinimumValue", _temperatureminimumvalue);Debug.locals.put("TemperatureMinimumValue", _temperatureminimumvalue);
 BA.debugLineNum = 264;BA.debugLine="If shomarande == 1 Then MinDama = TemperatureMi";
Debug.ShouldStop(128);
if (true) break;

case 13:
//if
this.state = 18;
if (RemoteObject.solveBoolean("=",_shomarande,BA.numberCast(double.class, 1))) { 
this.state = 15;
;}if (true) break;

case 15:
//C
this.state = 18;
parent._mindama = _temperatureminimumvalue;
if (true) break;

case 18:
//C
this.state = 19;
;
 BA.debugLineNum = 265;BA.debugLine="File.WriteString(SaeloZahra.Dir,\"MinDama\",Tempe";
Debug.ShouldStop(256);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(parent.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(BA.ObjectToString("MinDama")),(Object)(BA.NumberToString(_temperatureminimumvalue)));
 BA.debugLineNum = 266;BA.debugLine="Dim TemperatureMaximum As Map = Temperature.Get";
Debug.ShouldStop(512);
_temperaturemaximum = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_temperaturemaximum = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _temperature.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Maximum")))));Debug.locals.put("TemperatureMaximum", _temperaturemaximum);Debug.locals.put("TemperatureMaximum", _temperaturemaximum);
 BA.debugLineNum = 268;BA.debugLine="Dim TemperatureMaximumValue As Int = Temperatur";
Debug.ShouldStop(2048);
_temperaturemaximumvalue = BA.numberCast(int.class, _temperaturemaximum.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Value")))));Debug.locals.put("TemperatureMaximumValue", _temperaturemaximumvalue);Debug.locals.put("TemperatureMaximumValue", _temperaturemaximumvalue);
 BA.debugLineNum = 270;BA.debugLine="If shomarande == 1 Then MaxDama = TemperatureMa";
Debug.ShouldStop(8192);
if (true) break;

case 19:
//if
this.state = 24;
if (RemoteObject.solveBoolean("=",_shomarande,BA.numberCast(double.class, 1))) { 
this.state = 21;
;}if (true) break;

case 21:
//C
this.state = 24;
parent._maxdama = _temperaturemaximumvalue;
if (true) break;

case 24:
//C
this.state = 25;
;
 BA.debugLineNum = 271;BA.debugLine="File.WriteString(SaeloZahra.Dir,\"MaxDama\",Tempe";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(parent.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(BA.ObjectToString("MaxDama")),(Object)(BA.NumberToString(_temperaturemaximumvalue)));
 BA.debugLineNum = 290;BA.debugLine="Dim Night As Map = colDailyForecasts.Get(\"Night";
Debug.ShouldStop(2);
_night = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_night = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _coldailyforecasts.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Night")))));Debug.locals.put("Night", _night);Debug.locals.put("Night", _night);
 BA.debugLineNum = 291;BA.debugLine="Dim NightRainProbability As Int = Night.Get(\"Ra";
Debug.ShouldStop(4);
_nightrainprobability = BA.numberCast(int.class, _night.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("RainProbability")))));Debug.locals.put("NightRainProbability", _nightrainprobability);Debug.locals.put("NightRainProbability", _nightrainprobability);
 BA.debugLineNum = 292;BA.debugLine="Dim NightSnowProbability As Int = Night.Get(\"Sn";
Debug.ShouldStop(8);
_nightsnowprobability = BA.numberCast(int.class, _night.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("SnowProbability")))));Debug.locals.put("NightSnowProbability", _nightsnowprobability);Debug.locals.put("NightSnowProbability", _nightsnowprobability);
 BA.debugLineNum = 293;BA.debugLine="If shomarande == 1 Then NightShortPhrase = Nigh";
Debug.ShouldStop(16);
if (true) break;

case 25:
//if
this.state = 30;
if (RemoteObject.solveBoolean("=",_shomarande,BA.numberCast(double.class, 1))) { 
this.state = 27;
;}if (true) break;

case 27:
//C
this.state = 30;
parent._nightshortphrase = BA.ObjectToString(_night.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ShortPhrase")))));
if (true) break;

case 30:
//C
this.state = 31;
;
 BA.debugLineNum = 294;BA.debugLine="If shomarande == 1 Then File.WriteString(SaeloZ";
Debug.ShouldStop(32);
if (true) break;

case 31:
//if
this.state = 36;
if (RemoteObject.solveBoolean("=",_shomarande,BA.numberCast(double.class, 1))) { 
this.state = 33;
;}if (true) break;

case 33:
//C
this.state = 36;
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(parent.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(BA.ObjectToString("ShortPhrase")),(Object)(parent._nightshortphrase));
if (true) break;

case 36:
//C
this.state = 37;
;
 BA.debugLineNum = 300;BA.debugLine="If shomarande == 1 Then NightIcon = Night.Get(\"";
Debug.ShouldStop(2048);
if (true) break;

case 37:
//if
this.state = 42;
if (RemoteObject.solveBoolean("=",_shomarande,BA.numberCast(double.class, 1))) { 
this.state = 39;
;}if (true) break;

case 39:
//C
this.state = 42;
parent._nighticon = BA.numberCast(int.class, _night.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Icon")))));
if (true) break;

case 42:
//C
this.state = 43;
;
 BA.debugLineNum = 301;BA.debugLine="If shomarande == 1 Then File.WriteString(SaeloZ";
Debug.ShouldStop(4096);
if (true) break;

case 43:
//if
this.state = 48;
if (RemoteObject.solveBoolean("=",_shomarande,BA.numberCast(double.class, 1))) { 
this.state = 45;
;}if (true) break;

case 45:
//C
this.state = 48;
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(parent.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(BA.ObjectToString("NightIcon")),(Object)(BA.NumberToString(parent._nighticon)));
if (true) break;

case 48:
//C
this.state = 49;
;
 BA.debugLineNum = 304;BA.debugLine="Dim NightPrecipitationProbability As Int = Nigh";
Debug.ShouldStop(32768);
_nightprecipitationprobability = BA.numberCast(int.class, _night.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("PrecipitationProbability")))));Debug.locals.put("NightPrecipitationProbability", _nightprecipitationprobability);Debug.locals.put("NightPrecipitationProbability", _nightprecipitationprobability);
 BA.debugLineNum = 305;BA.debugLine="Dim NightIceProbability As Int = Night.Get(\"Ice";
Debug.ShouldStop(65536);
_nighticeprobability = BA.numberCast(int.class, _night.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("IceProbability")))));Debug.locals.put("NightIceProbability", _nighticeprobability);Debug.locals.put("NightIceProbability", _nighticeprobability);
 BA.debugLineNum = 306;BA.debugLine="Dim NightCloudCover As Int = Night.Get(\"CloudCo";
Debug.ShouldStop(131072);
_nightcloudcover = BA.numberCast(int.class, _night.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CloudCover")))));Debug.locals.put("NightCloudCover", _nightcloudcover);Debug.locals.put("NightCloudCover", _nightcloudcover);
 BA.debugLineNum = 308;BA.debugLine="Dim NightWind As Map = Night.Get(\"Wind\")";
Debug.ShouldStop(524288);
_nightwind = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_nightwind = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _night.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Wind")))));Debug.locals.put("NightWind", _nightwind);Debug.locals.put("NightWind", _nightwind);
 BA.debugLineNum = 309;BA.debugLine="Dim NightWindSpeed As Map = NightWind.Get(\"Spee";
Debug.ShouldStop(1048576);
_nightwindspeed = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_nightwindspeed = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _nightwind.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Speed")))));Debug.locals.put("NightWindSpeed", _nightwindspeed);Debug.locals.put("NightWindSpeed", _nightwindspeed);
 BA.debugLineNum = 311;BA.debugLine="Dim NightWindSpeedValue As Double = NightWindSp";
Debug.ShouldStop(4194304);
_nightwindspeedvalue = BA.numberCast(double.class, _nightwindspeed.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Value")))));Debug.locals.put("NightWindSpeedValue", _nightwindspeedvalue);Debug.locals.put("NightWindSpeedValue", _nightwindspeedvalue);
 BA.debugLineNum = 313;BA.debugLine="Dim NightWindDirection As Map = NightWind.Get(\"";
Debug.ShouldStop(16777216);
_nightwinddirection = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_nightwinddirection = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _nightwind.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Direction")))));Debug.locals.put("NightWindDirection", _nightwinddirection);Debug.locals.put("NightWindDirection", _nightwinddirection);
 BA.debugLineNum = 316;BA.debugLine="Dim NightWindDirectionLocalized As String = Nig";
Debug.ShouldStop(134217728);
_nightwinddirectionlocalized = BA.ObjectToString(_nightwinddirection.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Localized")))));Debug.locals.put("NightWindDirectionLocalized", _nightwinddirectionlocalized);Debug.locals.put("NightWindDirectionLocalized", _nightwinddirectionlocalized);
 BA.debugLineNum = 317;BA.debugLine="WindHaNight.Add(CreateMap(\"title\":NightWindDire";
Debug.ShouldStop(268435456);
parent._windhanight.runVoidMethod ("Add",(Object)((parent.mostCurrent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("title")),(_nightwinddirectionlocalized),RemoteObject.createImmutable(("value")),(_nightwindspeedvalue),RemoteObject.createImmutable(("image")),(RemoteObject.concat(parent._nighticon,RemoteObject.createImmutable(".png")))})).getObject())));
 BA.debugLineNum = 320;BA.debugLine="Dim NightSnow As Map = Night.Get(\"Snow\")";
Debug.ShouldStop(-2147483648);
_nightsnow = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_nightsnow = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _night.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Snow")))));Debug.locals.put("NightSnow", _nightsnow);Debug.locals.put("NightSnow", _nightsnow);
 BA.debugLineNum = 322;BA.debugLine="Dim NightSnowValue As Double = NightSnow.Get(\"V";
Debug.ShouldStop(2);
_nightsnowvalue = BA.numberCast(double.class, _nightsnow.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Value")))));Debug.locals.put("NightSnowValue", _nightsnowvalue);Debug.locals.put("NightSnowValue", _nightsnowvalue);
 BA.debugLineNum = 324;BA.debugLine="Dim NightTotalLiquid As Map = Night.Get(\"TotalL";
Debug.ShouldStop(8);
_nighttotalliquid = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_nighttotalliquid = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _night.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TotalLiquid")))));Debug.locals.put("NightTotalLiquid", _nighttotalliquid);Debug.locals.put("NightTotalLiquid", _nighttotalliquid);
 BA.debugLineNum = 326;BA.debugLine="Dim NightTotalLiquidValue As Double = NightTota";
Debug.ShouldStop(32);
_nighttotalliquidvalue = BA.numberCast(double.class, _nighttotalliquid.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Value")))));Debug.locals.put("NightTotalLiquidValue", _nighttotalliquidvalue);Debug.locals.put("NightTotalLiquidValue", _nighttotalliquidvalue);
 BA.debugLineNum = 328;BA.debugLine="Dim NightIce As Map = Night.Get(\"Ice\")";
Debug.ShouldStop(128);
_nightice = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_nightice = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _night.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Ice")))));Debug.locals.put("NightIce", _nightice);Debug.locals.put("NightIce", _nightice);
 BA.debugLineNum = 330;BA.debugLine="Dim NightIceValue As Double = NightIce.Get(\"Val";
Debug.ShouldStop(512);
_nighticevalue = BA.numberCast(double.class, _nightice.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Value")))));Debug.locals.put("NightIceValue", _nighticevalue);Debug.locals.put("NightIceValue", _nighticevalue);
 BA.debugLineNum = 332;BA.debugLine="Dim NightRain As Map = Night.Get(\"Rain\")";
Debug.ShouldStop(2048);
_nightrain = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_nightrain = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _night.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Rain")))));Debug.locals.put("NightRain", _nightrain);Debug.locals.put("NightRain", _nightrain);
 BA.debugLineNum = 334;BA.debugLine="Dim NightRainValue As Double = NightRain.Get(\"V";
Debug.ShouldStop(8192);
_nightrainvalue = BA.numberCast(double.class, _nightrain.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Value")))));Debug.locals.put("NightRainValue", _nightrainvalue);Debug.locals.put("NightRainValue", _nightrainvalue);
 BA.debugLineNum = 336;BA.debugLine="Dim NightWindGust As Map = Night.Get(\"WindGust\"";
Debug.ShouldStop(32768);
_nightwindgust = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_nightwindgust = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _night.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("WindGust")))));Debug.locals.put("NightWindGust", _nightwindgust);Debug.locals.put("NightWindGust", _nightwindgust);
 BA.debugLineNum = 337;BA.debugLine="Dim NightWindGustSpeed As Map = NightWindGust.G";
Debug.ShouldStop(65536);
_nightwindgustspeed = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_nightwindgustspeed = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _nightwindgust.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Speed")))));Debug.locals.put("NightWindGustSpeed", _nightwindgustspeed);Debug.locals.put("NightWindGustSpeed", _nightwindgustspeed);
 BA.debugLineNum = 339;BA.debugLine="Dim NightWindGustSpeedValue As Double = NightWi";
Debug.ShouldStop(262144);
_nightwindgustspeedvalue = BA.numberCast(double.class, _nightwindgustspeed.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Value")))));Debug.locals.put("NightWindGustSpeedValue", _nightwindgustspeedvalue);Debug.locals.put("NightWindGustSpeedValue", _nightwindgustspeedvalue);
 BA.debugLineNum = 345;BA.debugLine="Dim UnixTimeStamp As Int = colDailyForecasts.Ge";
Debug.ShouldStop(16777216);
_unixtimestamp = BA.numberCast(int.class, _coldailyforecasts.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("EpochDate")))));Debug.locals.put("UnixTimeStamp", _unixtimestamp);Debug.locals.put("UnixTimeStamp", _unixtimestamp);
 BA.debugLineNum = 347;BA.debugLine="Dim DegreeDaySummary As Map = colDailyForecasts";
Debug.ShouldStop(67108864);
_degreedaysummary = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_degreedaysummary = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _coldailyforecasts.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("DegreeDaySummary")))));Debug.locals.put("DegreeDaySummary", _degreedaysummary);Debug.locals.put("DegreeDaySummary", _degreedaysummary);
 BA.debugLineNum = 348;BA.debugLine="Dim DegreeDaySummaryCooling As Map = DegreeDayS";
Debug.ShouldStop(134217728);
_degreedaysummarycooling = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_degreedaysummarycooling = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _degreedaysummary.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Cooling")))));Debug.locals.put("DegreeDaySummaryCooling", _degreedaysummarycooling);Debug.locals.put("DegreeDaySummaryCooling", _degreedaysummarycooling);
 BA.debugLineNum = 350;BA.debugLine="Dim DegreeDaySummaryCoolingValue As Double = De";
Debug.ShouldStop(536870912);
_degreedaysummarycoolingvalue = BA.numberCast(double.class, _degreedaysummarycooling.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Value")))));Debug.locals.put("DegreeDaySummaryCoolingValue", _degreedaysummarycoolingvalue);Debug.locals.put("DegreeDaySummaryCoolingValue", _degreedaysummarycoolingvalue);
 BA.debugLineNum = 352;BA.debugLine="Dim DegreeDaySummaryHeating As Map = DegreeDayS";
Debug.ShouldStop(-2147483648);
_degreedaysummaryheating = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_degreedaysummaryheating = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _degreedaysummary.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Heating")))));Debug.locals.put("DegreeDaySummaryHeating", _degreedaysummaryheating);Debug.locals.put("DegreeDaySummaryHeating", _degreedaysummaryheating);
 BA.debugLineNum = 354;BA.debugLine="Dim DegreeDaySummaryHeatingValue As Double = De";
Debug.ShouldStop(2);
_degreedaysummaryheatingvalue = BA.numberCast(double.class, _degreedaysummaryheating.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Value")))));Debug.locals.put("DegreeDaySummaryHeatingValue", _degreedaysummaryheatingvalue);Debug.locals.put("DegreeDaySummaryHeatingValue", _degreedaysummaryheatingvalue);
 BA.debugLineNum = 375;BA.debugLine="If shomarande == 1 Then NotifKon = True Else No";
Debug.ShouldStop(4194304);
if (true) break;

case 49:
//if
this.state = 56;
if (RemoteObject.solveBoolean("=",_shomarande,BA.numberCast(double.class, 1))) { 
this.state = 51;
;}
else {
this.state = 53;
;}if (true) break;

case 51:
//C
this.state = 56;
parent._notifkon = parent.mostCurrent.__c.getField(true,"True");
if (true) break;

case 53:
//C
this.state = 56;
parent._notifkon = parent.mostCurrent.__c.getField(true,"False");
if (true) break;

case 56:
//C
this.state = 57;
;
 BA.debugLineNum = 377;BA.debugLine="Dim Day As Map = colDailyForecasts.Get(\"Day\")";
Debug.ShouldStop(16777216);
_day = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_day = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _coldailyforecasts.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Day")))));Debug.locals.put("Day", _day);Debug.locals.put("Day", _day);
 BA.debugLineNum = 379;BA.debugLine="DayShortPhrase				 = 				Day.Get(\"ShortPhrase\")";
Debug.ShouldStop(67108864);
parent._dayshortphrase = BA.ObjectToString(_day.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ShortPhrase")))));
 BA.debugLineNum = 380;BA.debugLine="If shomarande == 1 Then File.WriteString(SaeloZ";
Debug.ShouldStop(134217728);
if (true) break;

case 57:
//if
this.state = 62;
if (RemoteObject.solveBoolean("=",_shomarande,BA.numberCast(double.class, 1))) { 
this.state = 59;
;}if (true) break;

case 59:
//C
this.state = 62;
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(parent.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(BA.ObjectToString("DayShortPhrase")),(Object)(parent._dayshortphrase));
if (true) break;

case 62:
//C
this.state = 63;
;
 BA.debugLineNum = 384;BA.debugLine="DayIcon						= 				Day.Get(\"Icon\")";
Debug.ShouldStop(-2147483648);
parent._dayicon = BA.numberCast(int.class, _day.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Icon")))));
 BA.debugLineNum = 385;BA.debugLine="If shomarande == 1 Then File.WriteString(SaeloZ";
Debug.ShouldStop(1);
if (true) break;

case 63:
//if
this.state = 68;
if (RemoteObject.solveBoolean("=",_shomarande,BA.numberCast(double.class, 1))) { 
this.state = 65;
;}if (true) break;

case 65:
//C
this.state = 68;
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(parent.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(BA.ObjectToString("DayIcon")),(Object)(BA.NumberToString(parent._dayicon)));
if (true) break;

case 68:
//C
this.state = 69;
;
 BA.debugLineNum = 390;BA.debugLine="Dim DaySnowProbability As Int = 			Day.Get(\"Sno";
Debug.ShouldStop(32);
_daysnowprobability = BA.numberCast(int.class, _day.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("SnowProbability")))));Debug.locals.put("DaySnowProbability", _daysnowprobability);Debug.locals.put("DaySnowProbability", _daysnowprobability);
 BA.debugLineNum = 391;BA.debugLine="Dim DayPrecipitationProbability As Int = 	Day.G";
Debug.ShouldStop(64);
_dayprecipitationprobability = BA.numberCast(int.class, _day.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("PrecipitationProbability")))));Debug.locals.put("DayPrecipitationProbability", _dayprecipitationprobability);Debug.locals.put("DayPrecipitationProbability", _dayprecipitationprobability);
 BA.debugLineNum = 392;BA.debugLine="Dim DayIceProbability As Int = 				Day.Get(\"Ice";
Debug.ShouldStop(128);
_dayiceprobability = BA.numberCast(int.class, _day.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("IceProbability")))));Debug.locals.put("DayIceProbability", _dayiceprobability);Debug.locals.put("DayIceProbability", _dayiceprobability);
 BA.debugLineNum = 393;BA.debugLine="Dim DayCloudCover As Int = 					Day.Get(\"CloudC";
Debug.ShouldStop(256);
_daycloudcover = BA.numberCast(int.class, _day.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CloudCover")))));Debug.locals.put("DayCloudCover", _daycloudcover);Debug.locals.put("DayCloudCover", _daycloudcover);
 BA.debugLineNum = 394;BA.debugLine="DayRainProbability 				= 			Day.Get(\"RainProbab";
Debug.ShouldStop(512);
parent._dayrainprobability = BA.numberCast(int.class, _day.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("RainProbability")))));
 BA.debugLineNum = 395;BA.debugLine="If shomarande == 1 Then File.WriteString(SaeloZ";
Debug.ShouldStop(1024);
if (true) break;

case 69:
//if
this.state = 74;
if (RemoteObject.solveBoolean("=",_shomarande,BA.numberCast(double.class, 1))) { 
this.state = 71;
;}if (true) break;

case 71:
//C
this.state = 74;
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(parent.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(BA.ObjectToString("DayRainProbability")),(Object)(BA.NumberToString(parent._dayrainprobability)));
if (true) break;

case 74:
//C
this.state = 75;
;
 BA.debugLineNum = 397;BA.debugLine="Dim DayWind As Map = Day.Get(\"Wind\")";
Debug.ShouldStop(4096);
_daywind = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_daywind = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _day.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Wind")))));Debug.locals.put("DayWind", _daywind);Debug.locals.put("DayWind", _daywind);
 BA.debugLineNum = 398;BA.debugLine="Dim DayWindSpeed As Map = DayWind.Get(\"Speed\")";
Debug.ShouldStop(8192);
_daywindspeed = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_daywindspeed = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _daywind.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Speed")))));Debug.locals.put("DayWindSpeed", _daywindspeed);Debug.locals.put("DayWindSpeed", _daywindspeed);
 BA.debugLineNum = 400;BA.debugLine="Dim DayWindSpeedValue As Double = DayWindSpeed.";
Debug.ShouldStop(32768);
_daywindspeedvalue = BA.numberCast(double.class, _daywindspeed.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Value")))));Debug.locals.put("DayWindSpeedValue", _daywindspeedvalue);Debug.locals.put("DayWindSpeedValue", _daywindspeedvalue);
 BA.debugLineNum = 403;BA.debugLine="Dim DayWindDirection As Map = DayWind.Get(\"Dire";
Debug.ShouldStop(262144);
_daywinddirection = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_daywinddirection = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _daywind.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Direction")))));Debug.locals.put("DayWindDirection", _daywinddirection);Debug.locals.put("DayWindDirection", _daywinddirection);
 BA.debugLineNum = 406;BA.debugLine="Dim DayWindDirectionLocalized As String = DayWi";
Debug.ShouldStop(2097152);
_daywinddirectionlocalized = BA.ObjectToString(_daywinddirection.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Localized")))));Debug.locals.put("DayWindDirectionLocalized", _daywinddirectionlocalized);Debug.locals.put("DayWindDirectionLocalized", _daywinddirectionlocalized);
 BA.debugLineNum = 408;BA.debugLine="WindHaDay.Add(CreateMap(\"title\":DayWindDirectio";
Debug.ShouldStop(8388608);
parent._windhaday.runVoidMethod ("Add",(Object)((parent.mostCurrent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("title")),(_daywinddirectionlocalized),RemoteObject.createImmutable(("value")),(_daywindspeedvalue),RemoteObject.createImmutable(("image")),(RemoteObject.concat(parent._dayicon,RemoteObject.createImmutable(".png")))})).getObject())));
 BA.debugLineNum = 410;BA.debugLine="Dim DaySnow As Map = Day.Get(\"Snow\")";
Debug.ShouldStop(33554432);
_daysnow = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_daysnow = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _day.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Snow")))));Debug.locals.put("DaySnow", _daysnow);Debug.locals.put("DaySnow", _daysnow);
 BA.debugLineNum = 412;BA.debugLine="Dim DaySnowValue As Double = DaySnow.Get(\"Value";
Debug.ShouldStop(134217728);
_daysnowvalue = BA.numberCast(double.class, _daysnow.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Value")))));Debug.locals.put("DaySnowValue", _daysnowvalue);Debug.locals.put("DaySnowValue", _daysnowvalue);
 BA.debugLineNum = 414;BA.debugLine="Dim DayTotalLiquid As Map = Day.Get(\"TotalLiqui";
Debug.ShouldStop(536870912);
_daytotalliquid = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_daytotalliquid = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _day.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("TotalLiquid")))));Debug.locals.put("DayTotalLiquid", _daytotalliquid);Debug.locals.put("DayTotalLiquid", _daytotalliquid);
 BA.debugLineNum = 417;BA.debugLine="Dim DayTotalLiquidValue As Double = DayTotalLiq";
Debug.ShouldStop(1);
_daytotalliquidvalue = BA.numberCast(double.class, _daytotalliquid.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Value")))));Debug.locals.put("DayTotalLiquidValue", _daytotalliquidvalue);Debug.locals.put("DayTotalLiquidValue", _daytotalliquidvalue);
 BA.debugLineNum = 419;BA.debugLine="Dim DayIce As Map = Day.Get(\"Ice\")";
Debug.ShouldStop(4);
_dayice = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_dayice = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _day.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Ice")))));Debug.locals.put("DayIce", _dayice);Debug.locals.put("DayIce", _dayice);
 BA.debugLineNum = 421;BA.debugLine="Dim DayIceValue As Double = DayIce.Get(\"Value\")";
Debug.ShouldStop(16);
_dayicevalue = BA.numberCast(double.class, _dayice.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Value")))));Debug.locals.put("DayIceValue", _dayicevalue);Debug.locals.put("DayIceValue", _dayicevalue);
 BA.debugLineNum = 423;BA.debugLine="Dim DayRain As Map = Day.Get(\"Rain\")";
Debug.ShouldStop(64);
_dayrain = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_dayrain = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _day.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Rain")))));Debug.locals.put("DayRain", _dayrain);Debug.locals.put("DayRain", _dayrain);
 BA.debugLineNum = 425;BA.debugLine="Dim DayRainValue As Double = DayRain.Get(\"Value";
Debug.ShouldStop(256);
_dayrainvalue = BA.numberCast(double.class, _dayrain.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Value")))));Debug.locals.put("DayRainValue", _dayrainvalue);Debug.locals.put("DayRainValue", _dayrainvalue);
 BA.debugLineNum = 427;BA.debugLine="Dim DayWindGust As Map = Day.Get(\"WindGust\")";
Debug.ShouldStop(1024);
_daywindgust = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_daywindgust = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _day.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("WindGust")))));Debug.locals.put("DayWindGust", _daywindgust);Debug.locals.put("DayWindGust", _daywindgust);
 BA.debugLineNum = 428;BA.debugLine="Dim DayWindGustSpeed As Map = DayWindGust.Get(\"";
Debug.ShouldStop(2048);
_daywindgustspeed = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_daywindgustspeed = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _daywindgust.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Speed")))));Debug.locals.put("DayWindGustSpeed", _daywindgustspeed);Debug.locals.put("DayWindGustSpeed", _daywindgustspeed);
 BA.debugLineNum = 430;BA.debugLine="Dim DayWindGustSpeedValue As Double = DayWindGu";
Debug.ShouldStop(8192);
_daywindgustspeedvalue = BA.numberCast(double.class, _daywindgustspeed.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Value")))));Debug.locals.put("DayWindGustSpeedValue", _daywindgustspeedvalue);Debug.locals.put("DayWindGustSpeedValue", _daywindgustspeedvalue);
 BA.debugLineNum = 452;BA.debugLine="Dim KhodeTarikh,RoozeTarikh,Mahesh As String";
Debug.ShouldStop(8);
_khodetarikh = RemoteObject.createImmutable("");Debug.locals.put("KhodeTarikh", _khodetarikh);
_roozetarikh = RemoteObject.createImmutable("");Debug.locals.put("RoozeTarikh", _roozetarikh);
_mahesh = RemoteObject.createImmutable("");Debug.locals.put("Mahesh", _mahesh);
 BA.debugLineNum = 453;BA.debugLine="Try";
Debug.ShouldStop(16);
if (true) break;

case 75:
//try
this.state = 80;
this.catchState = 79;
this.state = 77;
if (true) break;

case 77:
//C
this.state = 80;
this.catchState = 79;
 BA.debugLineNum = 454;BA.debugLine="Dim shamsiDate As PersianDate";
Debug.ShouldStop(32);
_shamsidate = RemoteObject.createNew ("anywheresoftware.b4a.student.PersianDate");Debug.locals.put("shamsiDate", _shamsidate);
 BA.debugLineNum = 455;BA.debugLine="KhodeTarikh = SaeloZahra.ConvertEnglish(shamsi";
Debug.ShouldStop(64);
_khodetarikh = parent.mostCurrent._saelozahra.runMethod(true,"_convertenglish" /*RemoteObject*/ ,accuweathercronjobservice.processBA,(Object)(_shamsidate.runMethod(true,"getDate",(Object)(parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(BA.numberCast(long.class, RemoteObject.concat(_unixtimestamp,RemoteObject.createImmutable("000")))))),(Object)(parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(BA.numberCast(long.class, RemoteObject.concat(_unixtimestamp,RemoteObject.createImmutable("000")))))),(Object)(parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(BA.numberCast(long.class, RemoteObject.concat(_unixtimestamp,RemoteObject.createImmutable("000")))))),(Object)(RemoteObject.createImmutable("/")))));Debug.locals.put("KhodeTarikh", _khodetarikh);
 BA.debugLineNum = 456;BA.debugLine="KhodeTarikh=KhodeTarikh.Replace(\"1398/\",\"\").Re";
Debug.ShouldStop(128);
_khodetarikh = _khodetarikh.runMethod(true,"replace",(Object)(BA.ObjectToString("1398/")),(Object)(RemoteObject.createImmutable(""))).runMethod(true,"replace",(Object)(BA.ObjectToString("1399/")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("KhodeTarikh", _khodetarikh);
 BA.debugLineNum = 457;BA.debugLine="Log(\"KhodeTarikh:  \"&KhodeTarikh)";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","45439736",RemoteObject.concat(RemoteObject.createImmutable("KhodeTarikh:  "),_khodetarikh),0);
 BA.debugLineNum = 458;BA.debugLine="RoozeTarikh = KhodeTarikh.SubString2(KhodeTari";
Debug.ShouldStop(512);
_roozetarikh = _khodetarikh.runMethod(true,"substring",(Object)(_khodetarikh.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("/")))),(Object)(_khodetarikh.runMethod(true,"length"))).runMethod(true,"replace",(Object)(BA.ObjectToString("/")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("RoozeTarikh", _roozetarikh);
 BA.debugLineNum = 460;BA.debugLine="Mahesh = KhodeTarikh.SubString2(0,KhodeTarikh.";
Debug.ShouldStop(2048);
_mahesh = _khodetarikh.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(_khodetarikh.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("/")))));Debug.locals.put("Mahesh", _mahesh);
 BA.debugLineNum = 461;BA.debugLine="Mahesh = SaeloZahra.esmeMah(Mahesh.Replace(\"/\"";
Debug.ShouldStop(4096);
_mahesh = parent.mostCurrent._saelozahra.runMethod(true,"_esmemah" /*RemoteObject*/ ,accuweathercronjobservice.processBA,(Object)(BA.numberCast(int.class, _mahesh.runMethod(true,"replace",(Object)(BA.ObjectToString("/")),(Object)(RemoteObject.createImmutable(""))))));Debug.locals.put("Mahesh", _mahesh);
 Debug.CheckDeviceExceptions();
if (true) break;

case 79:
//C
this.state = 80;
this.catchState = 116;
 BA.debugLineNum = 463;BA.debugLine="Log(\"نتونست تاریخو در بیاره\"&LastException)";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","45439742",RemoteObject.concat(RemoteObject.createImmutable("نتونست تاریخو در بیاره"),parent.mostCurrent.__c.runMethod(false,"LastException",accuweathercronjobservice.processBA)),0);
 if (true) break;
if (true) break;
;
 BA.debugLineNum = 467;BA.debugLine="Try";
Debug.ShouldStop(262144);

case 80:
//try
this.state = 85;
this.catchState = 116;
this.catchState = 84;
this.state = 82;
if (true) break;

case 82:
//C
this.state = 85;
this.catchState = 84;
 BA.debugLineNum = 468;BA.debugLine="BazeDama.Add(CreateMap(\"icon\":DayIcon, \"title\"";
Debug.ShouldStop(524288);
parent._bazedama.runVoidMethod ("Add",(Object)((parent.mostCurrent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("icon")),(parent._dayicon),RemoteObject.createImmutable(("title")),(RemoteObject.concat(parent.mostCurrent._saelozahra.runMethod(true,"_esmeroozehafte" /*RemoteObject*/ ,accuweathercronjobservice.processBA,(Object)(BA.numberCast(long.class, RemoteObject.concat(_unixtimestamp,RemoteObject.createImmutable("000"))))),parent.mostCurrent._saelozahra.runMethod(true,"_convertpersian" /*RemoteObject*/ ,accuweathercronjobservice.processBA,(Object)(_roozetarikh)),RemoteObject.createImmutable(" "),_mahesh)),RemoteObject.createImmutable(("min")),(_temperatureminimumvalue),RemoteObject.createImmutable(("max")),(_temperaturemaximumvalue)})).getObject())));
 Debug.CheckDeviceExceptions();
if (true) break;

case 84:
//C
this.state = 85;
this.catchState = 116;
 BA.debugLineNum = 470;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","45439749",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",accuweathercronjobservice.processBA)),0);
 if (true) break;
if (true) break;
;
 BA.debugLineNum = 476;BA.debugLine="Try";
Debug.ShouldStop(134217728);

case 85:
//try
this.state = 90;
this.catchState = 116;
this.catchState = 89;
this.state = 87;
if (true) break;

case 87:
//C
this.state = 90;
this.catchState = 89;
 BA.debugLineNum = 478;BA.debugLine="Dim mapNight As Map";
Debug.ShouldStop(536870912);
_mapnight = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mapNight", _mapnight);
 BA.debugLineNum = 479;BA.debugLine="mapNight.Initialize";
Debug.ShouldStop(1073741824);
_mapnight.runVoidMethod ("Initialize");
 BA.debugLineNum = 480;BA.debugLine="mapNight.Put(\"unique_id\",		File.ReadString(Sae";
Debug.ShouldStop(-2147483648);
_mapnight.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("unique_id"))),(Object)((RemoteObject.concat(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(parent.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("usrnm"))),RemoteObject.createImmutable("_"),_moonepochset))));
 BA.debugLineNum = 481;BA.debugLine="mapNight.Put(\"user\",			File.ReadString(SaeloZa";
Debug.ShouldStop(1);
_mapnight.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("user"))),(Object)((parent.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(parent.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("usrnm"))))));
 BA.debugLineNum = 482;BA.debugLine="mapNight.Put(\"latlng\",			Starter.MyLocation.La";
Debug.ShouldStop(2);
_mapnight.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("latlng"))),(Object)((RemoteObject.concat(parent.mostCurrent._starter._mylocation /*RemoteObject*/ .runMethod(true,"getLatitude"),RemoteObject.createImmutable(","),parent.mostCurrent._starter._mylocation /*RemoteObject*/ .runMethod(true,"getLongitude")))));
 BA.debugLineNum = 483;BA.debugLine="mapNight.Put(\"time\",			MoonSet)";
Debug.ShouldStop(4);
_mapnight.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("time"))),(Object)((_moonset)));
 BA.debugLineNum = 484;BA.debugLine="mapNight.Put(\"humidity\",		NightTotalLiquidValu";
Debug.ShouldStop(8);
_mapnight.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("humidity"))),(Object)((_nighttotalliquidvalue)));
 BA.debugLineNum = 486;BA.debugLine="mapNight.Put(\"cloudcover\",		NightCloudCover)";
Debug.ShouldStop(32);
_mapnight.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("cloudcover"))),(Object)((_nightcloudcover)));
 BA.debugLineNum = 487;BA.debugLine="mapNight.Put(\"uvindex\",			UVIndex)";
Debug.ShouldStop(64);
_mapnight.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("uvindex"))),(Object)((parent._uvindex)));
 BA.debugLineNum = 488;BA.debugLine="mapNight.Put(\"ice\",				NightIceValue)";
Debug.ShouldStop(128);
_mapnight.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ice"))),(Object)((_nighticevalue)));
 BA.debugLineNum = 489;BA.debugLine="mapNight.Put(\"snow\",			NightSnowValue)";
Debug.ShouldStop(256);
_mapnight.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("snow"))),(Object)((_nightsnowvalue)));
 BA.debugLineNum = 490;BA.debugLine="mapNight.Put(\"rain\",			NightRainValue)";
Debug.ShouldStop(512);
_mapnight.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("rain"))),(Object)((_nightrainvalue)));
 BA.debugLineNum = 491;BA.debugLine="mapNight.Put(\"wind\",			NightWindSpeedValue)";
Debug.ShouldStop(1024);
_mapnight.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("wind"))),(Object)((_nightwindspeedvalue)));
 BA.debugLineNum = 492;BA.debugLine="mapNight.Put(\"temp\",			TemperatureMaximumValue";
Debug.ShouldStop(2048);
_mapnight.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("temp"))),(Object)((_temperaturemaximumvalue)));
 BA.debugLineNum = 493;BA.debugLine="mapNight.Put(\"ehtemal_precip\",	NightPrecipitat";
Debug.ShouldStop(4096);
_mapnight.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ehtemal_precip"))),(Object)((_nightprecipitationprobability)));
 BA.debugLineNum = 494;BA.debugLine="mapNight.Put(\"ehtemal_ice\",		NightIceProbabili";
Debug.ShouldStop(8192);
_mapnight.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ehtemal_ice"))),(Object)((_nighticeprobability)));
 BA.debugLineNum = 495;BA.debugLine="mapNight.Put(\"ehtemal_rain\",	NightRainProbabil";
Debug.ShouldStop(16384);
_mapnight.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ehtemal_rain"))),(Object)((_nightrainprobability)));
 BA.debugLineNum = 496;BA.debugLine="mapNight.Put(\"ehtemal_snow\",	NightSnowProbabil";
Debug.ShouldStop(32768);
_mapnight.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ehtemal_snow"))),(Object)((_nightsnowprobability)));
 BA.debugLineNum = 497;BA.debugLine="mapNight.Put(\"ehtemal_gusts\",	NightWindGustSpe";
Debug.ShouldStop(65536);
_mapnight.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ehtemal_gusts"))),(Object)((_nightwindgustspeedvalue)));
 BA.debugLineNum = 498;BA.debugLine="mapNight.Put(\"degreeday\",		DegreeDaySummaryCoo";
Debug.ShouldStop(131072);
_mapnight.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("degreeday"))),(Object)((_degreedaysummarycoolingvalue)));
 BA.debugLineNum = 499;BA.debugLine="mapNight.Put(\"day\",				UnixTimeStamp)";
Debug.ShouldStop(262144);
_mapnight.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("day"))),(Object)((_unixtimestamp)));
 BA.debugLineNum = 500;BA.debugLine="mapNight.Put(\"icon\",			NightIcon)";
Debug.ShouldStop(524288);
_mapnight.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("icon"))),(Object)((parent._nighticon)));
 BA.debugLineNum = 502;BA.debugLine="ListValues.Add(mapNight)";
Debug.ShouldStop(2097152);
parent._listvalues.runVoidMethod ("Add",(Object)((_mapnight.getObject())));
 Debug.CheckDeviceExceptions();
if (true) break;

case 89:
//C
this.state = 90;
this.catchState = 116;
 BA.debugLineNum = 506;BA.debugLine="Log(LastException)";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","45439785",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",accuweathercronjobservice.processBA)),0);
 if (true) break;
if (true) break;
;
 BA.debugLineNum = 510;BA.debugLine="Try";
Debug.ShouldStop(536870912);

case 90:
//try
this.state = 95;
this.catchState = 116;
this.catchState = 94;
this.state = 92;
if (true) break;

case 92:
//C
this.state = 95;
this.catchState = 94;
 BA.debugLineNum = 512;BA.debugLine="Dim mapDay As Map";
Debug.ShouldStop(-2147483648);
_mapday = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mapDay", _mapday);
 BA.debugLineNum = 513;BA.debugLine="mapDay.Initialize";
Debug.ShouldStop(1);
_mapday.runVoidMethod ("Initialize");
 BA.debugLineNum = 514;BA.debugLine="mapDay.Put(\"unique_id\",		File.ReadString(Saelo";
Debug.ShouldStop(2);
_mapday.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("unique_id"))),(Object)((RemoteObject.concat(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(parent.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("usrnm"))),RemoteObject.createImmutable("_"),_sunepochset))));
 BA.debugLineNum = 515;BA.debugLine="mapDay.Put(\"user\",			File.ReadString(SaeloZahr";
Debug.ShouldStop(4);
_mapday.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("user"))),(Object)((parent.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(parent.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("usrnm"))))));
 BA.debugLineNum = 516;BA.debugLine="mapDay.Put(\"latlng\",		Starter.MyLocation.Latit";
Debug.ShouldStop(8);
_mapday.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("latlng"))),(Object)((RemoteObject.concat(parent.mostCurrent._starter._mylocation /*RemoteObject*/ .runMethod(true,"getLatitude"),RemoteObject.createImmutable(","),parent.mostCurrent._starter._mylocation /*RemoteObject*/ .runMethod(true,"getLongitude")))));
 BA.debugLineNum = 517;BA.debugLine="mapDay.Put(\"time\",			SunSet)";
Debug.ShouldStop(16);
_mapday.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("time"))),(Object)((_sunset)));
 BA.debugLineNum = 518;BA.debugLine="mapDay.Put(\"humidity\",		DayTotalLiquidValue)'ر";
Debug.ShouldStop(32);
_mapday.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("humidity"))),(Object)((_daytotalliquidvalue)));
 BA.debugLineNum = 520;BA.debugLine="mapDay.Put(\"cloudcover\",	DayCloudCover)";
Debug.ShouldStop(128);
_mapday.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("cloudcover"))),(Object)((_daycloudcover)));
 BA.debugLineNum = 521;BA.debugLine="mapDay.Put(\"uvindex\",		UVIndex)";
Debug.ShouldStop(256);
_mapday.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("uvindex"))),(Object)((parent._uvindex)));
 BA.debugLineNum = 522;BA.debugLine="mapDay.Put(\"ice\",			DayIceValue)";
Debug.ShouldStop(512);
_mapday.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ice"))),(Object)((_dayicevalue)));
 BA.debugLineNum = 523;BA.debugLine="mapDay.Put(\"snow\",			DaySnowValue)";
Debug.ShouldStop(1024);
_mapday.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("snow"))),(Object)((_daysnowvalue)));
 BA.debugLineNum = 524;BA.debugLine="mapDay.Put(\"rain\",			DayRainValue)";
Debug.ShouldStop(2048);
_mapday.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("rain"))),(Object)((_dayrainvalue)));
 BA.debugLineNum = 525;BA.debugLine="mapDay.Put(\"wind\",			DayWindSpeedValue)";
Debug.ShouldStop(4096);
_mapday.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("wind"))),(Object)((_daywindspeedvalue)));
 BA.debugLineNum = 526;BA.debugLine="mapDay.Put(\"temp\",			TemperatureMinimumValue)";
Debug.ShouldStop(8192);
_mapday.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("temp"))),(Object)((_temperatureminimumvalue)));
 BA.debugLineNum = 527;BA.debugLine="mapDay.Put(\"ehtemal_precip\",DayPrecipitationPr";
Debug.ShouldStop(16384);
_mapday.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ehtemal_precip"))),(Object)((_dayprecipitationprobability)));
 BA.debugLineNum = 528;BA.debugLine="mapDay.Put(\"ehtemal_ice\",	DayIceProbability)";
Debug.ShouldStop(32768);
_mapday.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ehtemal_ice"))),(Object)((_dayiceprobability)));
 BA.debugLineNum = 529;BA.debugLine="mapDay.Put(\"ehtemal_rain\",	DayRainProbability)";
Debug.ShouldStop(65536);
_mapday.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ehtemal_rain"))),(Object)((parent._dayrainprobability)));
 BA.debugLineNum = 530;BA.debugLine="mapDay.Put(\"ehtemal_snow\",	DaySnowProbability)";
Debug.ShouldStop(131072);
_mapday.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ehtemal_snow"))),(Object)((_daysnowprobability)));
 BA.debugLineNum = 531;BA.debugLine="mapDay.Put(\"ehtemal_gusts\",	DayWindGustSpeedVa";
Debug.ShouldStop(262144);
_mapday.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ehtemal_gusts"))),(Object)((_daywindgustspeedvalue)));
 BA.debugLineNum = 532;BA.debugLine="mapDay.Put(\"degreeday\",		DegreeDaySummaryHeati";
Debug.ShouldStop(524288);
_mapday.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("degreeday"))),(Object)((_degreedaysummaryheatingvalue)));
 BA.debugLineNum = 533;BA.debugLine="mapDay.Put(\"day\",			UnixTimeStamp)";
Debug.ShouldStop(1048576);
_mapday.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("day"))),(Object)((_unixtimestamp)));
 BA.debugLineNum = 534;BA.debugLine="mapDay.Put(\"icon\",			DayIcon)";
Debug.ShouldStop(2097152);
_mapday.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("icon"))),(Object)((parent._dayicon)));
 BA.debugLineNum = 536;BA.debugLine="ListValues.Add(mapDay)";
Debug.ShouldStop(8388608);
parent._listvalues.runVoidMethod ("Add",(Object)((_mapday.getObject())));
 Debug.CheckDeviceExceptions();
if (true) break;

case 94:
//C
this.state = 95;
this.catchState = 116;
 BA.debugLineNum = 539;BA.debugLine="Log(LastException)";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","45439818",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",accuweathercronjobservice.processBA)),0);
 if (true) break;
if (true) break;

case 95:
//C
this.state = 96;
this.catchState = 116;
;
 BA.debugLineNum = 542;BA.debugLine="Dim Vaziatesh As String";
Debug.ShouldStop(536870912);
_vaziatesh = RemoteObject.createImmutable("");Debug.locals.put("Vaziatesh", _vaziatesh);
 BA.debugLineNum = 543;BA.debugLine="Vaziatesh = CheckBadMahsoolWeatherAlert(Tempera";
Debug.ShouldStop(1073741824);
_vaziatesh = _checkbadmahsoolweatheralert(_temperatureminimumvalue,_temperaturemaximumvalue);Debug.locals.put("Vaziatesh", _vaziatesh);
 BA.debugLineNum = 544;BA.debugLine="Log(\"در حال بررسی وضعیت \"&Vaziatesh)";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","45439823",RemoteObject.concat(RemoteObject.createImmutable("در حال بررسی وضعیت "),_vaziatesh),0);
 BA.debugLineNum = 547;BA.debugLine="vaziatHtml=$\"وضعیت روز: ${Day.Get(\"ShortPhrase\"";
Debug.ShouldStop(4);
_vaziathtml = (RemoteObject.concat(RemoteObject.createImmutable("وضعیت روز: "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_day.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ShortPhrase")))))),RemoteObject.createImmutable("  وضعیت شب: "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_night.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ShortPhrase")))))),RemoteObject.createImmutable(" <br> <br> جمع رطوبت روز: "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_daytotalliquidvalue))),RemoteObject.createImmutable("م‌م  جمع رطوبت شب: "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_nighttotalliquidvalue))),RemoteObject.createImmutable("م‌م <br> پوشش ابر روز: "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_daycloudcover))),RemoteObject.createImmutable("%  پوشش ابر شب: "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_nightcloudcover))),RemoteObject.createImmutable("% <br> شاخص اشعه ماوراء بنفش: "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._uvindex))),RemoteObject.createImmutable("  <br> یخ زدگی روز: "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_dayicevalue))),RemoteObject.createImmutable("م‌م  یخ زدگی شب: "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_nighticevalue))),RemoteObject.createImmutable("م‌م   <br> میزان برف روز: "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_daysnowvalue))),RemoteObject.createImmutable("م‌م  میزان برف شب: "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_nightsnowvalue))),RemoteObject.createImmutable("م‌م  <br> میزان باران روز: "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_dayrainvalue))),RemoteObject.createImmutable("م‌م  میزان باران شب: "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_nightrainvalue))),RemoteObject.createImmutable("م‌م   <br> سرعت باد روز: "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_daywindspeedvalue))),RemoteObject.createImmutable("KM/H  سرعت باد شب: "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_nightwindspeedvalue))),RemoteObject.createImmutable("KM/H   <br> حداقل دما: "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_temperatureminimumvalue))),RemoteObject.createImmutable("° حداکثر دما: "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_temperaturemaximumvalue))),RemoteObject.createImmutable("°   <br> احتمال بارش در روز: "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._dayrainprobability))),RemoteObject.createImmutable("م‌م  احتمال بارش در شب: "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_nightrainprobability))),RemoteObject.createImmutable("م‌م  <br> احتمال یخ زدگی در روز: "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_dayiceprobability))),RemoteObject.createImmutable("م‌م  احتمال یخ زدگی در شب: "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_nighticeprobability))),RemoteObject.createImmutable("م‌م  <br> احتمال بارش برف در روز: "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_daysnowprobability))),RemoteObject.createImmutable("م‌م	  احتمال بارش برف در شب: "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_nightsnowprobability))),RemoteObject.createImmutable("م‌م  <br> احتمال طوفان در روز: "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_daywindgustspeedvalue))),RemoteObject.createImmutable("KM/H  احتمال طوفان در شب: "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_nightwindgustspeedvalue))),RemoteObject.createImmutable("KM/H   <br><br>")));Debug.locals.put("vaziatHtml", _vaziathtml);
 BA.debugLineNum = 550;BA.debugLine="If MatneTouzihat.Length>1 Then";
Debug.ShouldStop(32);
if (true) break;

case 96:
//if
this.state = 99;
if (RemoteObject.solveBoolean(">",parent._matnetouzihat.runMethod(true,"length"),BA.numberCast(double.class, 1))) { 
this.state = 98;
}if (true) break;

case 98:
//C
this.state = 99;
 BA.debugLineNum = 551;BA.debugLine="saveAndAlert(ThisDateTime ,\"وضعیت \"&SaeloZahra";
Debug.ShouldStop(64);
_saveandalert(_thisdatetime,RemoteObject.concat(RemoteObject.createImmutable("وضعیت "),parent.mostCurrent._saelozahra.runMethod(true,"_tarikhekhafan" /*RemoteObject*/ ,accuweathercronjobservice.processBA,(Object)(BA.numberCast(long.class, RemoteObject.concat(_sunepochset,RemoteObject.createImmutable("000")))))),_vaziathtml,_vaziatesh,parent._dayicon,BA.numberCast(long.class, RemoteObject.concat(_sunepochset,RemoteObject.createImmutable("000"))),parent._notifkon);
 if (true) break;

case 99:
//C
this.state = 119;
;
 if (true) break;
if (true) break;
Debug.locals.put("colDailyForecasts", _coldailyforecasts);
;
 BA.debugLineNum = 558;BA.debugLine="If AvvalinBar Then";
Debug.ShouldStop(8192);

case 100:
//if
this.state = 103;
if (parent._avvalinbar.<Boolean>get().booleanValue()) { 
this.state = 102;
}if (true) break;

case 102:
//C
this.state = 103;
 BA.debugLineNum = 559;BA.debugLine="ToastMessageShow(\"ورود شما را برای اولین بار خو";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("ورود شما را برای اولین بار خوش آمد میگویم")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 560;BA.debugLine="CallSubDelayed(HomeAct,\"RestartAct\")";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("CallSubDelayed",accuweathercronjobservice.processBA,(Object)((parent.mostCurrent._homeact.getObject())),(Object)(RemoteObject.createImmutable("RestartAct")));
 if (true) break;
;
 BA.debugLineNum = 564;BA.debugLine="If OpenHome Then";
Debug.ShouldStop(524288);

case 103:
//if
this.state = 106;
if (parent._openhome.<Boolean>get().booleanValue()) { 
this.state = 105;
}if (true) break;

case 105:
//C
this.state = 106;
 BA.debugLineNum = 565;BA.debugLine="StartActivity(HomeAct)";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",accuweathercronjobservice.processBA,(Object)((parent.mostCurrent._homeact.getObject())));
 if (true) break;

case 106:
//C
this.state = 107;
;
 BA.debugLineNum = 570;BA.debugLine="Dim j3 As HttpJob";
Debug.ShouldStop(33554432);
_j3 = RemoteObject.createNew ("ir.saelozahra.damaara.mazraeyeman.httpjob");Debug.locals.put("j3", _j3);
 BA.debugLineNum = 571;BA.debugLine="j3.Initialize(\"j3\",Me)";
Debug.ShouldStop(67108864);
_j3.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_initialize" /*RemoteObject*/ ,accuweathercronjobservice.processBA,(Object)(BA.ObjectToString("j3")),(Object)(accuweathercronjobservice.getObject()));
 BA.debugLineNum = 573;BA.debugLine="For Each m As Map In ListValues";
Debug.ShouldStop(268435456);
if (true) break;

case 107:
//for
this.state = 114;
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group188 = parent._listvalues;
index188 = 0;
groupLen188 = group188.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("m", _m);
this.state = 120;
if (true) break;

case 120:
//C
this.state = 114;
if (index188 < groupLen188) {
this.state = 109;
_m = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group188.runMethod(false,"Get",index188));Debug.locals.put("m", _m);}
if (true) break;

case 121:
//C
this.state = 120;
index188++;
Debug.locals.put("m", _m);
if (true) break;

case 109:
//C
this.state = 110;
 BA.debugLineNum = 575;BA.debugLine="j3.PostMultipart(SaeloZahra.json_url&\"weather_i";
Debug.ShouldStop(1073741824);
_j3.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_postmultipart" /*RemoteObject*/ ,(Object)(RemoteObject.concat(parent.mostCurrent._saelozahra._json_url /*RemoteObject*/ ,RemoteObject.createImmutable("weather_insert.php?save=true"))),(Object)(_m),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), parent.mostCurrent.__c.getField(false,"Null")));
 BA.debugLineNum = 576;BA.debugLine="Wait For (j3) jobDone(j3 As HttpJob)";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", accuweathercronjobservice.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "accuweathercronjobservice", "calcaccuweather"), (_j3));
this.state = 122;
return;
case 122:
//C
this.state = 110;
_j3 = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("j3", _j3);
;
 BA.debugLineNum = 577;BA.debugLine="If j3.Success Then";
Debug.ShouldStop(1);
if (true) break;

case 110:
//if
this.state = 113;
if (_j3.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 112;
}if (true) break;

case 112:
//C
this.state = 113;
 BA.debugLineNum = 578;BA.debugLine="Log(\"Hi:  \"&j3.GetString)";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","45439857",RemoteObject.concat(RemoteObject.createImmutable("Hi:  "),_j3.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_getstring" /*RemoteObject*/ )),0);
 if (true) break;

case 113:
//C
this.state = 121;
;
 if (true) break;
if (true) break;

case 114:
//C
this.state = 117;
Debug.locals.put("m", _m);
;
 BA.debugLineNum = 582;BA.debugLine="j3.Release";
Debug.ShouldStop(32);
_j3.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_release" /*RemoteObject*/ );
 Debug.CheckDeviceExceptions();
if (true) break;

case 116:
//C
this.state = 117;
this.catchState = 0;
 BA.debugLineNum = 585;BA.debugLine="Log(LastException)";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","45439864",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",accuweathercronjobservice.processBA)),0);
 BA.debugLineNum = 586;BA.debugLine="LogColor(\"Error to Accuweather Calc\",0xFFCA1A4F)";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","45439865",BA.ObjectToString("Error to Accuweather Calc"),BA.numberCast(int.class, ((int)0xffca1a4f)));
 if (true) break;
if (true) break;

case 117:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 588;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",accuweathercronjobservice.processBA, e0.toString());}
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
public static RemoteObject  _checkbadmahsoolweatheralert(RemoteObject _mintemp,RemoteObject _maxtemp) throws Exception{
try {
		Debug.PushSubsStack("CheckBadMahsoolWeatherAlert (accuweathercronjobservice) ","accuweathercronjobservice",5,accuweathercronjobservice.processBA,accuweathercronjobservice.mostCurrent,590);
if (RapidSub.canDelegate("checkbadmahsoolweatheralert")) { return ir.saelozahra.damaara.mazraeyeman.accuweathercronjobservice.remoteMe.runUserSub(false, "accuweathercronjobservice","checkbadmahsoolweatheralert", _mintemp, _maxtemp);}
RemoteObject _coluserproducts = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _product_title = RemoteObject.createImmutable("");
RemoteObject _mintempmahsool = RemoteObject.createImmutable(0);
RemoteObject _maxtempmahsool = RemoteObject.createImmutable(0);
RemoteObject _alert_txt = RemoteObject.createImmutable("");
Debug.locals.put("minTemp", _mintemp);
Debug.locals.put("maxTemp", _maxtemp);
 BA.debugLineNum = 590;BA.debugLine="Sub CheckBadMahsoolWeatherAlert(minTemp As Int,max";
Debug.ShouldStop(8192);
 BA.debugLineNum = 591;BA.debugLine="Try";
Debug.ShouldStop(16384);
try { BA.debugLineNum = 593;BA.debugLine="If File.Exists(SaeloZahra.Dir,\"userProducts\") Th";
Debug.ShouldStop(65536);
if (accuweathercronjobservice.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(accuweathercronjobservice.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("userProducts"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 594;BA.debugLine="RAF.Initialize(SaeloZahra.Dir,\"userProducts\",Fa";
Debug.ShouldStop(131072);
accuweathercronjobservice._raf.runVoidMethod ("Initialize",(Object)(accuweathercronjobservice.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(BA.ObjectToString("userProducts")),(Object)(accuweathercronjobservice.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 595;BA.debugLine="ListUserProducts=RAF.readObject(RAF.CurrentPosi";
Debug.ShouldStop(262144);
accuweathercronjobservice._listuserproducts = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), accuweathercronjobservice._raf.runMethod(false,"ReadObject",(Object)(accuweathercronjobservice._raf.getField(true,"CurrentPosition"))));
 BA.debugLineNum = 597;BA.debugLine="For Each coluserProducts As Map In ListUserProd";
Debug.ShouldStop(1048576);
_coluserproducts = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group5 = accuweathercronjobservice._listuserproducts;
final int groupLen5 = group5.runMethod(true,"getSize").<Integer>get()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_coluserproducts = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group5.runMethod(false,"Get",index5));Debug.locals.put("coluserProducts", _coluserproducts);
Debug.locals.put("coluserProducts", _coluserproducts);
 BA.debugLineNum = 600;BA.debugLine="Dim product_title As String = coluserProducts.";
Debug.ShouldStop(8388608);
_product_title = BA.ObjectToString(_coluserproducts.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("product_title")))));Debug.locals.put("product_title", _product_title);Debug.locals.put("product_title", _product_title);
 BA.debugLineNum = 601;BA.debugLine="Dim minTempMahsool As Int = coluserProducts.Ge";
Debug.ShouldStop(16777216);
_mintempmahsool = BA.numberCast(int.class, _coluserproducts.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("temp_min")))));Debug.locals.put("minTempMahsool", _mintempmahsool);Debug.locals.put("minTempMahsool", _mintempmahsool);
 BA.debugLineNum = 602;BA.debugLine="Dim maXTempMahsool As Int = coluserProducts.Ge";
Debug.ShouldStop(33554432);
_maxtempmahsool = BA.numberCast(int.class, _coluserproducts.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("temp_max")))));Debug.locals.put("maXTempMahsool", _maxtempmahsool);Debug.locals.put("maXTempMahsool", _maxtempmahsool);
 BA.debugLineNum = 605;BA.debugLine="Dim alert_txt As String = coluserProducts.Get(";
Debug.ShouldStop(268435456);
_alert_txt = BA.ObjectToString(_coluserproducts.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("alert_txt")))));Debug.locals.put("alert_txt", _alert_txt);Debug.locals.put("alert_txt", _alert_txt);
 BA.debugLineNum = 609;BA.debugLine="If minTemp < minTempMahsool Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("<",_mintemp,BA.numberCast(double.class, _mintempmahsool))) { 
 BA.debugLineNum = 610;BA.debugLine="CreateNotification(\"هشدار سرمازدگی برای \"&pro";
Debug.ShouldStop(2);
_createnotification(RemoteObject.concat(RemoteObject.createImmutable("هشدار سرمازدگی برای "),_product_title),_alert_txt,BA.ObjectToString("sarmazadegi"),(accuweathercronjobservice.mostCurrent._notificationact.getObject()),accuweathercronjobservice.mostCurrent.__c.getField(true,"True"),accuweathercronjobservice.mostCurrent.__c.getField(true,"True")).runVoidMethod ("Notify",(Object)(BA.numberCast(int.class, 2)));
 BA.debugLineNum = 611;BA.debugLine="Log(\"سرمازدگی برای \"&product_title)";
Debug.ShouldStop(4);
accuweathercronjobservice.mostCurrent.__c.runVoidMethod ("LogImpl","45505045",RemoteObject.concat(RemoteObject.createImmutable("سرمازدگی برای "),_product_title),0);
 BA.debugLineNum = 612;BA.debugLine="Return \"sarmazadegi\"";
Debug.ShouldStop(8);
Debug.CheckDeviceExceptions();if (true) return BA.ObjectToString("sarmazadegi");
 };
 BA.debugLineNum = 615;BA.debugLine="If maxTemp > maXTempMahsool Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean(">",_maxtemp,BA.numberCast(double.class, _maxtempmahsool))) { 
 BA.debugLineNum = 616;BA.debugLine="CreateNotification(\"هشدار گرمازدگی برای \"&pro";
Debug.ShouldStop(128);
_createnotification(RemoteObject.concat(RemoteObject.createImmutable("هشدار گرمازدگی برای "),_product_title),_alert_txt,BA.ObjectToString("garmazadegi"),(accuweathercronjobservice.mostCurrent._notificationact.getObject()),accuweathercronjobservice.mostCurrent.__c.getField(true,"True"),accuweathercronjobservice.mostCurrent.__c.getField(true,"True")).runVoidMethod ("Notify",(Object)(BA.numberCast(int.class, 2)));
 BA.debugLineNum = 617;BA.debugLine="Log(\"گرمازدگی برای \"&product_title)";
Debug.ShouldStop(256);
accuweathercronjobservice.mostCurrent.__c.runVoidMethod ("LogImpl","45505051",RemoteObject.concat(RemoteObject.createImmutable("گرمازدگی برای "),_product_title),0);
 BA.debugLineNum = 618;BA.debugLine="Return \"garmazadegi\"";
Debug.ShouldStop(512);
Debug.CheckDeviceExceptions();if (true) return BA.ObjectToString("garmazadegi");
 };
 BA.debugLineNum = 620;BA.debugLine="Log(\"خطری برای \"&product_title&\" یافت نشد\")";
Debug.ShouldStop(2048);
accuweathercronjobservice.mostCurrent.__c.runVoidMethod ("LogImpl","45505054",RemoteObject.concat(RemoteObject.createImmutable("خطری برای "),_product_title,RemoteObject.createImmutable(" یافت نشد")),0);
 }
}Debug.locals.put("coluserProducts", _coluserproducts);
;
 }else {
 BA.debugLineNum = 623;BA.debugLine="Log(\"شما اول محصول ثبت کن بعد بیا خطراتشو بررسی";
Debug.ShouldStop(16384);
accuweathercronjobservice.mostCurrent.__c.runVoidMethod ("LogImpl","45505057",RemoteObject.createImmutable("شما اول محصول ثبت کن بعد بیا خطراتشو بررسی کن"),0);
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e26) {
			BA.rdebugUtils.runVoidMethod("setLastException",accuweathercronjobservice.processBA, e26.toString()); BA.debugLineNum = 626;BA.debugLine="Log(LastException)";
Debug.ShouldStop(131072);
accuweathercronjobservice.mostCurrent.__c.runVoidMethod ("LogImpl","45505060",BA.ObjectToString(accuweathercronjobservice.mostCurrent.__c.runMethod(false,"LastException",accuweathercronjobservice.processBA)),0);
 };
 BA.debugLineNum = 628;BA.debugLine="Return \"weather\"";
Debug.ShouldStop(524288);
if (true) return BA.ObjectToString("weather");
 BA.debugLineNum = 629;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createnotification(RemoteObject _title,RemoteObject _content,RemoteObject _icon,RemoteObject _targetactivity,RemoteObject _sound,RemoteObject _vibrate) throws Exception{
try {
		Debug.PushSubsStack("CreateNotification (accuweathercronjobservice) ","accuweathercronjobservice",5,accuweathercronjobservice.processBA,accuweathercronjobservice.mostCurrent,650);
if (RapidSub.canDelegate("createnotification")) { return ir.saelozahra.damaara.mazraeyeman.accuweathercronjobservice.remoteMe.runUserSub(false, "accuweathercronjobservice","createnotification", _title, _content, _icon, _targetactivity, _sound, _vibrate);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone");
RemoteObject _nb = RemoteObject.declareNull("barxdroid.NotificationBuilder.NotificationBuilder");
RemoteObject _javaobjectinstance = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _ctxt = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _manager = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _channel = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _importance = RemoteObject.createImmutable("");
RemoteObject _channelvisiblename = RemoteObject.createImmutable("");
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _n = RemoteObject.declareNull("anywheresoftware.b4a.objects.NotificationWrapper");
Debug.locals.put("Title", _title);
Debug.locals.put("Content", _content);
Debug.locals.put("Icon", _icon);
Debug.locals.put("TargetActivity", _targetactivity);
Debug.locals.put("Sound", _sound);
Debug.locals.put("Vibrate", _vibrate);
 BA.debugLineNum = 650;BA.debugLine="Public Sub CreateNotification(Title As String, Con";
Debug.ShouldStop(512);
 BA.debugLineNum = 652;BA.debugLine="Dim p As Phone";
Debug.ShouldStop(2048);
_p = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone");Debug.locals.put("p", _p);
 BA.debugLineNum = 653;BA.debugLine="If p.SdkVersion >= 21 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("g",_p.runMethod(true,"getSdkVersion"),BA.numberCast(double.class, 21))) { 
 BA.debugLineNum = 654;BA.debugLine="Dim nb As NotificationBuilder";
Debug.ShouldStop(8192);
_nb = RemoteObject.createNew ("barxdroid.NotificationBuilder.NotificationBuilder");Debug.locals.put("nb", _nb);
 BA.debugLineNum = 655;BA.debugLine="nb.Initialize";
Debug.ShouldStop(16384);
_nb.runVoidMethod ("Initialize",accuweathercronjobservice.processBA);
 BA.debugLineNum = 656;BA.debugLine="nb.DefaultSound = Sound";
Debug.ShouldStop(32768);
_nb.runVoidMethod ("setDefaultSound",_sound);
 BA.debugLineNum = 657;BA.debugLine="nb.DefaultVibrate = Vibrate";
Debug.ShouldStop(65536);
_nb.runVoidMethod ("setDefaultVibrate",_vibrate);
 BA.debugLineNum = 659;BA.debugLine="If Icon == \"garmazadegi\" Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_icon,BA.ObjectToString("garmazadegi"))) { 
 BA.debugLineNum = 660;BA.debugLine="nb.LargeIcon = LoadBitmap(File.DirAssets,\"30.pn";
Debug.ShouldStop(524288);
_nb.runVoidMethod ("setLargeIcon",(accuweathercronjobservice.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(accuweathercronjobservice.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("30.png"))).getObject()));
 }else 
{ BA.debugLineNum = 661;BA.debugLine="Else If Icon == \"sarmazadegi\" Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_icon,BA.ObjectToString("sarmazadegi"))) { 
 BA.debugLineNum = 662;BA.debugLine="nb.LargeIcon = LoadBitmap(File.DirAssets,\"31.pn";
Debug.ShouldStop(2097152);
_nb.runVoidMethod ("setLargeIcon",(accuweathercronjobservice.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(accuweathercronjobservice.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("31.png"))).getObject()));
 }else {
 BA.debugLineNum = 664;BA.debugLine="nb.LargeIcon = LoadBitmap(File.DirAssets,\"icon.";
Debug.ShouldStop(8388608);
_nb.runVoidMethod ("setLargeIcon",(accuweathercronjobservice.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(accuweathercronjobservice.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("icon.png"))).getObject()));
 }}
;
 BA.debugLineNum = 667;BA.debugLine="nb.AutoCancel = True";
Debug.ShouldStop(67108864);
_nb.runVoidMethod ("setAutoCancel",accuweathercronjobservice.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 668;BA.debugLine="nb.ContentTitle = Title";
Debug.ShouldStop(134217728);
_nb.runVoidMethod ("setContentTitle",_title);
 BA.debugLineNum = 669;BA.debugLine="nb.ContentText = Content";
Debug.ShouldStop(268435456);
_nb.runVoidMethod ("setContentText",_content);
 BA.debugLineNum = 670;BA.debugLine="nb.setActivity(TargetActivity)";
Debug.ShouldStop(536870912);
_nb.runVoidMethod ("setActivity",accuweathercronjobservice.processBA,(Object)(_targetactivity));
 BA.debugLineNum = 671;BA.debugLine="nb.AddAction(\"baseline_all_inclusive_white_24\",\"";
Debug.ShouldStop(1073741824);
_nb.runVoidMethod ("AddAction",accuweathercronjobservice.processBA,(Object)(BA.ObjectToString("baseline_all_inclusive_white_24")),(Object)(BA.ObjectToString("وضعیت کلی")),(Object)(BA.ObjectToString("full")),(Object)(_targetactivity));
 BA.debugLineNum = 672;BA.debugLine="nb.AddAction(\"baseline_place_white_24\",\"گزارش کا";
Debug.ShouldStop(-2147483648);
_nb.runVoidMethod ("AddAction",accuweathercronjobservice.processBA,(Object)(BA.ObjectToString("baseline_place_white_24")),(Object)(BA.ObjectToString("گزارش کامل امروز")),(Object)(BA.ObjectToString("full")),(Object)((accuweathercronjobservice.mostCurrent._weathernewact.getObject())));
 BA.debugLineNum = 673;BA.debugLine="nb.SmallIcon = Icon";
Debug.ShouldStop(1);
_nb.runVoidMethod ("setSmallIcon",_icon);
 BA.debugLineNum = 675;BA.debugLine="Dim javaobjectInstance As JavaObject";
Debug.ShouldStop(4);
_javaobjectinstance = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("javaobjectInstance", _javaobjectinstance);
 BA.debugLineNum = 676;BA.debugLine="javaobjectInstance = nb";
Debug.ShouldStop(8);
_javaobjectinstance = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _nb.getObject());Debug.locals.put("javaobjectInstance", _javaobjectinstance);
 BA.debugLineNum = 677;BA.debugLine="javaobjectInstance.RunMethod (\"setColor\", Array";
Debug.ShouldStop(16);
_javaobjectinstance.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setColor")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(accuweathercronjobservice.mostCurrent._saelozahra._color /*RemoteObject*/ )})));
 BA.debugLineNum = 679;BA.debugLine="If p.SdkVersion >= 26 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("g",_p.runMethod(true,"getSdkVersion"),BA.numberCast(double.class, 26))) { 
 BA.debugLineNum = 680;BA.debugLine="Dim ctxt As JavaObject";
Debug.ShouldStop(128);
_ctxt = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("ctxt", _ctxt);
 BA.debugLineNum = 681;BA.debugLine="ctxt.InitializeContext";
Debug.ShouldStop(256);
_ctxt.runVoidMethod ("InitializeContext",accuweathercronjobservice.processBA);
 BA.debugLineNum = 682;BA.debugLine="Dim manager As JavaObject";
Debug.ShouldStop(512);
_manager = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("manager", _manager);
 BA.debugLineNum = 683;BA.debugLine="manager.InitializeStatic(\"android.app.Notificat";
Debug.ShouldStop(1024);
_manager.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("android.app.NotificationManager")));
 BA.debugLineNum = 684;BA.debugLine="Dim Channel As JavaObject";
Debug.ShouldStop(2048);
_channel = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("Channel", _channel);
 BA.debugLineNum = 685;BA.debugLine="Dim importance As String";
Debug.ShouldStop(4096);
_importance = RemoteObject.createImmutable("");Debug.locals.put("importance", _importance);
 BA.debugLineNum = 686;BA.debugLine="If Sound Then importance = \"IMPORTANCE_DEFAULT\"";
Debug.ShouldStop(8192);
if (_sound.<Boolean>get().booleanValue()) { 
_importance = BA.ObjectToString("IMPORTANCE_DEFAULT");Debug.locals.put("importance", _importance);}
else {
_importance = BA.ObjectToString("IMPORTANCE_LOW");Debug.locals.put("importance", _importance);};
 BA.debugLineNum = 687;BA.debugLine="Dim ChannelVisibleName As String = Application.";
Debug.ShouldStop(16384);
_channelvisiblename = accuweathercronjobservice.mostCurrent.__c.getField(false,"Application").runMethod(true,"getLabelName");Debug.locals.put("ChannelVisibleName", _channelvisiblename);Debug.locals.put("ChannelVisibleName", _channelvisiblename);
 BA.debugLineNum = 688;BA.debugLine="Channel.InitializeNewInstance(\"android.app.Noti";
Debug.ShouldStop(32768);
_channel.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("android.app.NotificationChannel")),(Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {RemoteObject.createImmutable(("MyChannelId1")),(_channelvisiblename),_manager.runMethod(false,"GetField",(Object)(_importance))})));
 BA.debugLineNum = 690;BA.debugLine="manager = ctxt.RunMethod(\"getSystemService\", Ar";
Debug.ShouldStop(131072);
_manager = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _ctxt.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getSystemService")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("notification"))}))));Debug.locals.put("manager", _manager);
 BA.debugLineNum = 691;BA.debugLine="manager.RunMethod(\"createNotificationChannel\",";
Debug.ShouldStop(262144);
_manager.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("createNotificationChannel")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_channel.getObject())})));
 BA.debugLineNum = 692;BA.debugLine="Dim jo As JavaObject = nb";
Debug.ShouldStop(524288);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _nb.getObject());Debug.locals.put("jo", _jo);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 693;BA.debugLine="jo.RunMethod(\"setChannelId\", Array(\"MyChannelId";
Debug.ShouldStop(1048576);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setChannelId")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("MyChannelId1"))})));
 };
 BA.debugLineNum = 695;BA.debugLine="Return  nb.GetNotification";
Debug.ShouldStop(4194304);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.NotificationWrapper"), _nb.runMethod(false,"GetNotification",accuweathercronjobservice.processBA));
 }else {
 BA.debugLineNum = 697;BA.debugLine="Dim n As Notification";
Debug.ShouldStop(16777216);
_n = RemoteObject.createNew ("anywheresoftware.b4a.objects.NotificationWrapper");Debug.locals.put("n", _n);
 BA.debugLineNum = 698;BA.debugLine="n.Initialize";
Debug.ShouldStop(33554432);
_n.runVoidMethod ("Initialize");
 BA.debugLineNum = 700;BA.debugLine="n.AutoCancel=True";
Debug.ShouldStop(134217728);
_n.runVoidMethod ("setAutoCancel",accuweathercronjobservice.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 701;BA.debugLine="n.Vibrate = Vibrate";
Debug.ShouldStop(268435456);
_n.runVoidMethod ("setVibrate",_vibrate);
 BA.debugLineNum = 702;BA.debugLine="n.Icon = Icon";
Debug.ShouldStop(536870912);
_n.runVoidMethod ("setIcon",_icon);
 BA.debugLineNum = 704;BA.debugLine="n.SetInfo(Title, Content, TargetActivity)";
Debug.ShouldStop(-2147483648);
_n.runVoidMethod ("SetInfoNew",accuweathercronjobservice.processBA,(Object)(BA.ObjectToCharSequence(_title)),(Object)(BA.ObjectToCharSequence(_content)),(Object)(_targetactivity));
 BA.debugLineNum = 705;BA.debugLine="Return n";
Debug.ShouldStop(1);
if (true) return _n;
 };
 BA.debugLineNum = 707;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _findregioncode() throws Exception{
try {
		Debug.PushSubsStack("FindRegionCode (accuweathercronjobservice) ","accuweathercronjobservice",5,accuweathercronjobservice.processBA,accuweathercronjobservice.mostCurrent,73);
if (RapidSub.canDelegate("findregioncode")) { return ir.saelozahra.damaara.mazraeyeman.accuweathercronjobservice.remoteMe.runUserSub(false, "accuweathercronjobservice","findregioncode");}
 BA.debugLineNum = 73;BA.debugLine="Public Sub FindRegionCode";
Debug.ShouldStop(256);
 BA.debugLineNum = 75;BA.debugLine="ListValues.Initialize";
Debug.ShouldStop(1024);
accuweathercronjobservice._listvalues.runVoidMethod ("Initialize");
 BA.debugLineNum = 77;BA.debugLine="LogColor(\"Start Weather Service\",SaeloZahra.Color";
Debug.ShouldStop(4096);
accuweathercronjobservice.mostCurrent.__c.runVoidMethod ("LogImpl","45242884",BA.ObjectToString("Start Weather Service"),accuweathercronjobservice.mostCurrent._saelozahra._colorlight /*RemoteObject*/ );
 BA.debugLineNum = 79;BA.debugLine="If File.Exists(SaeloZahra.dir,\"RegionCode\") Then";
Debug.ShouldStop(16384);
if (accuweathercronjobservice.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(accuweathercronjobservice.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("RegionCode"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 80;BA.debugLine="Log(\"RegionCode Exists: \"&File.ReadString(SaeloZ";
Debug.ShouldStop(32768);
accuweathercronjobservice.mostCurrent.__c.runVoidMethod ("LogImpl","45242887",RemoteObject.concat(RemoteObject.createImmutable("RegionCode Exists: "),accuweathercronjobservice.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(accuweathercronjobservice.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("RegionCode")))),0);
 BA.debugLineNum = 81;BA.debugLine="RegionCode = File.ReadString(SaeloZahra.dir,\"Reg";
Debug.ShouldStop(65536);
accuweathercronjobservice._regioncode = accuweathercronjobservice.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(accuweathercronjobservice.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("RegionCode")));
 BA.debugLineNum = 82;BA.debugLine="If RegionCode.Length<2 Then File.Delete(SaeloZah";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("<",accuweathercronjobservice._regioncode.runMethod(true,"length"),BA.numberCast(double.class, 2))) { 
accuweathercronjobservice.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(accuweathercronjobservice.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("RegionCode")));};
 BA.debugLineNum = 83;BA.debugLine="GetAccuWeather(RegionCode,ApiAccuWeather)";
Debug.ShouldStop(262144);
_getaccuweather(accuweathercronjobservice._regioncode,accuweathercronjobservice._apiaccuweather);
 }else {
 BA.debugLineNum = 85;BA.debugLine="AvvalinBar = True";
Debug.ShouldStop(1048576);
accuweathercronjobservice._avvalinbar = accuweathercronjobservice.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 86;BA.debugLine="Log(\"No Find RegionCode\")";
Debug.ShouldStop(2097152);
accuweathercronjobservice.mostCurrent.__c.runVoidMethod ("LogImpl","45242893",RemoteObject.createImmutable("No Find RegionCode"),0);
 BA.debugLineNum = 87;BA.debugLine="If Starter.MyLocation.IsInitialized Then";
Debug.ShouldStop(4194304);
if (accuweathercronjobservice.mostCurrent._starter._mylocation /*RemoteObject*/ .runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 88;BA.debugLine="Log(\"Nothing Found Your Location\")";
Debug.ShouldStop(8388608);
accuweathercronjobservice.mostCurrent.__c.runVoidMethod ("LogImpl","45242895",RemoteObject.createImmutable("Nothing Found Your Location"),0);
 BA.debugLineNum = 89;BA.debugLine="JobGetRegionCode.Initialize(\"JobGetRegionCode\",";
Debug.ShouldStop(16777216);
accuweathercronjobservice._jobgetregioncode.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_initialize" /*RemoteObject*/ ,accuweathercronjobservice.processBA,(Object)(BA.ObjectToString("JobGetRegionCode")),(Object)(accuweathercronjobservice.getObject()));
 BA.debugLineNum = 91;BA.debugLine="JobGetRegionCode.Download(\"https://mazraeyeman.";
Debug.ShouldStop(67108864);
accuweathercronjobservice._jobgetregioncode.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("https://mazraeyeman.ir/reseller/api_files/forecasts.php?geoposition="),accuweathercronjobservice.mostCurrent._starter._mylocation /*RemoteObject*/ .runMethod(true,"getLatitude"),RemoteObject.createImmutable(","),accuweathercronjobservice.mostCurrent._starter._mylocation /*RemoteObject*/ .runMethod(true,"getLongitude"))));
 };
 };
 BA.debugLineNum = 96;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getaccuweather(RemoteObject _rcode,RemoteObject _apikey) throws Exception{
try {
		Debug.PushSubsStack("GetAccuWeather (accuweathercronjobservice) ","accuweathercronjobservice",5,accuweathercronjobservice.processBA,accuweathercronjobservice.mostCurrent,196);
if (RapidSub.canDelegate("getaccuweather")) { return ir.saelozahra.damaara.mazraeyeman.accuweathercronjobservice.remoteMe.runUserSub(false, "accuweathercronjobservice","getaccuweather", _rcode, _apikey);}
Debug.locals.put("RCode", _rcode);
Debug.locals.put("ApiKey", _apikey);
 BA.debugLineNum = 196;BA.debugLine="Sub GetAccuWeather(RCode As String,ApiKey As Strin";
Debug.ShouldStop(8);
 BA.debugLineNum = 198;BA.debugLine="LogColor($\"GetAccuWeather for ${RCode}  With API:";
Debug.ShouldStop(32);
accuweathercronjobservice.mostCurrent.__c.runVoidMethod ("LogImpl","45373954",(RemoteObject.concat(RemoteObject.createImmutable("GetAccuWeather for "),accuweathercronjobservice.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_rcode))),RemoteObject.createImmutable("  With API:"),accuweathercronjobservice.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_apikey))),RemoteObject.createImmutable(""))),accuweathercronjobservice.mostCurrent._saelozahra._colorlight /*RemoteObject*/ );
 BA.debugLineNum = 200;BA.debugLine="JobGetAccuWeather.Initialize(\"JobGetAccuWeather\",";
Debug.ShouldStop(128);
accuweathercronjobservice._jobgetaccuweather.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_initialize" /*RemoteObject*/ ,accuweathercronjobservice.processBA,(Object)(BA.ObjectToString("JobGetAccuWeather")),(Object)(accuweathercronjobservice.getObject()));
 BA.debugLineNum = 202;BA.debugLine="FullUrl=SaeloZahra.EncodeUrl(\"http://dataservice.";
Debug.ShouldStop(512);
accuweathercronjobservice._fullurl = accuweathercronjobservice.mostCurrent._saelozahra.runMethod(true,"_encodeurl" /*RemoteObject*/ ,accuweathercronjobservice.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://dataservice.accuweather.com/forecasts/v1/daily/5day/"),_rcode,RemoteObject.createImmutable("?metric=true&details=true&language=fa-ir&apikey="),_apikey,RemoteObject.createImmutable("&amirTime="),accuweathercronjobservice.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"))));
 BA.debugLineNum = 204;BA.debugLine="JobGetAccuWeather.Download($\"https://mazraeyeman.";
Debug.ShouldStop(2048);
accuweathercronjobservice._jobgetaccuweather.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_download" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable("https://mazraeyeman.ir/reseller/api_files/forecasts.php?region="),accuweathercronjobservice.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_rcode))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 205;BA.debugLine="LogColor($\"https://mazraeyeman.ir/reseller/api_fi";
Debug.ShouldStop(4096);
accuweathercronjobservice.mostCurrent.__c.runVoidMethod ("LogImpl","45373961",(RemoteObject.concat(RemoteObject.createImmutable("https://mazraeyeman.ir/reseller/api_files/forecasts.php?region="),accuweathercronjobservice.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_rcode))),RemoteObject.createImmutable(""))),accuweathercronjobservice.mostCurrent.__c.getField(false,"Colors").getField(true,"Yellow"));
 BA.debugLineNum = 207;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("jobDone (accuweathercronjobservice) ","accuweathercronjobservice",5,accuweathercronjobservice.processBA,accuweathercronjobservice.mostCurrent,101);
if (RapidSub.canDelegate("jobdone")) { ir.saelozahra.damaara.mazraeyeman.accuweathercronjobservice.remoteMe.runUserSub(false, "accuweathercronjobservice","jobdone", _job); return;}
ResumableSub_jobDone rsub = new ResumableSub_jobDone(null,_job);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_jobDone extends BA.ResumableSub {
public ResumableSub_jobDone(ir.saelozahra.damaara.mazraeyeman.accuweathercronjobservice parent,RemoteObject _job) {
this.parent = parent;
this._job = _job;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
ir.saelozahra.damaara.mazraeyeman.accuweathercronjobservice parent;
RemoteObject _job;
RemoteObject _notemptyjob = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("jobDone (accuweathercronjobservice) ","accuweathercronjobservice",5,accuweathercronjobservice.processBA,accuweathercronjobservice.mostCurrent,101);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("job", _job);
 BA.debugLineNum = 103;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 105;BA.debugLine="LogColor(job.JobName&\"    ,    \"&job.Success,Colo";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","45308420",RemoteObject.concat(_job.getField(true,"_jobname" /*RemoteObject*/ ),RemoteObject.createImmutable("    ,    "),_job.getField(true,"_success" /*RemoteObject*/ )),parent.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 107;BA.debugLine="Dim NotEmptyJob As Boolean = True";
Debug.ShouldStop(1024);
_notemptyjob = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("NotEmptyJob", _notemptyjob);Debug.locals.put("NotEmptyJob", _notemptyjob);
 BA.debugLineNum = 108;BA.debugLine="If job.Success Then";
Debug.ShouldStop(2048);
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
 BA.debugLineNum = 109;BA.debugLine="If job.GetString ==\"\" Then NotEmptyJob=False Els";
Debug.ShouldStop(4096);
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
 BA.debugLineNum = 110;BA.debugLine="If job.GetString.Contains(\"The allowed number of";
Debug.ShouldStop(8192);
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
 BA.debugLineNum = 113;BA.debugLine="If job.Success And NotEmptyJob Then";
Debug.ShouldStop(65536);

case 18:
//if
this.state = 67;
if (RemoteObject.solveBoolean(".",_job.getField(true,"_success" /*RemoteObject*/ )) && RemoteObject.solveBoolean(".",_notemptyjob)) { 
this.state = 20;
}else {
this.state = 43;
}if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 115;BA.debugLine="LogColor(job.JobName&\"   :   \"&job.GetString,Col";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","45308430",RemoteObject.concat(_job.getField(true,"_jobname" /*RemoteObject*/ ),RemoteObject.createImmutable("   :   "),_job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_getstring" /*RemoteObject*/ )),parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Green"));
 BA.debugLineNum = 117;BA.debugLine="Select job.JobName";
Debug.ShouldStop(1048576);
if (true) break;

case 21:
//select
this.state = 41;
switch (BA.switchObjectToInt(_job.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("JobGetAccuWeather"),BA.ObjectToString("JobGetRegionCode"))) {
case 0: {
this.state = 23;
if (true) break;
}
case 1: {
this.state = 34;
if (true) break;
}
}
if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 120;BA.debugLine="If job.GetString.Length>500 Then";
Debug.ShouldStop(8388608);
if (true) break;

case 24:
//if
this.state = 27;
if (RemoteObject.solveBoolean(">",_job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_getstring" /*RemoteObject*/ ).runMethod(true,"length"),BA.numberCast(double.class, 500))) { 
this.state = 26;
}if (true) break;

case 26:
//C
this.state = 27;
 BA.debugLineNum = 121;BA.debugLine="File.WriteString(SaeloZahra.Dir,\"FiveDay.Json";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(parent.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(BA.ObjectToString("FiveDay.Json")),(Object)(_job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_getstring" /*RemoteObject*/ )));
 if (true) break;
;
 BA.debugLineNum = 124;BA.debugLine="If File.Exists(SaeloZahra.Dir,\"FiveDay.Json\")";
Debug.ShouldStop(134217728);

case 27:
//if
this.state = 32;
if (parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("FiveDay.Json"))).<Boolean>get().booleanValue()) { 
this.state = 29;
}else {
this.state = 31;
}if (true) break;

case 29:
//C
this.state = 32;
 BA.debugLineNum = 125;BA.debugLine="calcAccuWeather(File.ReadString(SaeloZahra.Di";
Debug.ShouldStop(268435456);
_calcaccuweather(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(parent.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("FiveDay.Json"))));
 if (true) break;

case 31:
//C
this.state = 32;
 BA.debugLineNum = 127;BA.debugLine="calcAccuWeather(job.GetString)";
Debug.ShouldStop(1073741824);
_calcaccuweather(_job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_getstring" /*RemoteObject*/ ));
 if (true) break;

case 32:
//C
this.state = 41;
;
 BA.debugLineNum = 130;BA.debugLine="job.Release";
Debug.ShouldStop(2);
_job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_release" /*RemoteObject*/ );
 if (true) break;

case 34:
//C
this.state = 35;
 BA.debugLineNum = 143;BA.debugLine="If job.GetString.Length<20 Then";
Debug.ShouldStop(16384);
if (true) break;

case 35:
//if
this.state = 40;
if (RemoteObject.solveBoolean("<",_job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_getstring" /*RemoteObject*/ ).runMethod(true,"length"),BA.numberCast(double.class, 20))) { 
this.state = 37;
}else {
this.state = 39;
}if (true) break;

case 37:
//C
this.state = 40;
 BA.debugLineNum = 144;BA.debugLine="RegionCode = job.GetString";
Debug.ShouldStop(32768);
parent._regioncode = _job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_getstring" /*RemoteObject*/ );
 if (true) break;

case 39:
//C
this.state = 40;
 BA.debugLineNum = 146;BA.debugLine="JobGetRegionCode.Download(\"http://dataservice";
Debug.ShouldStop(131072);
parent._jobgetregioncode.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://dataservice.accuweather.com/locations/v1/cities/geoposition/search?language=fa-ir&q="),parent.mostCurrent._starter._mylocation /*RemoteObject*/ .runMethod(true,"getLatitude"),RemoteObject.createImmutable(","),parent.mostCurrent._starter._mylocation /*RemoteObject*/ .runMethod(true,"getLongitude"),RemoteObject.createImmutable("&apikey="),parent._apiaccuweather)));
 if (true) break;

case 40:
//C
this.state = 41;
;
 BA.debugLineNum = 149;BA.debugLine="LogColor(\"Your Region Code Is: \"&RegionCode,Sa";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","45308464",RemoteObject.concat(RemoteObject.createImmutable("Your Region Code Is: "),parent._regioncode),parent.mostCurrent._saelozahra._colorlight /*RemoteObject*/ );
 BA.debugLineNum = 150;BA.debugLine="File.WriteString(SaeloZahra.dir,\"RegionCode\",R";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(parent.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(BA.ObjectToString("RegionCode")),(Object)(parent._regioncode));
 BA.debugLineNum = 151;BA.debugLine="FindRegionCode";
Debug.ShouldStop(4194304);
_findregioncode();
 BA.debugLineNum = 152;BA.debugLine="Return";
Debug.ShouldStop(8388608);
if (true) return ;
 if (true) break;

case 41:
//C
this.state = 67;
;
 if (true) break;

case 43:
//C
this.state = 44;
 BA.debugLineNum = 159;BA.debugLine="If job.JobName==\"JobGetAccuWeather\" And job.GetS";
Debug.ShouldStop(1073741824);
if (true) break;

case 44:
//if
this.state = 63;
if (RemoteObject.solveBoolean("=",_job.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("JobGetAccuWeather")) && RemoteObject.solveBoolean(".",_job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_getstring" /*RemoteObject*/ ).runMethod(true,"contains",(Object)(RemoteObject.createImmutable("The allowed number of requests has been exceeded."))))) { 
this.state = 46;
}if (true) break;

case 46:
//C
this.state = 47;
 BA.debugLineNum = 160;BA.debugLine="Log(\"The allowed number of requests has been ex";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","45308475",RemoteObject.createImmutable("The allowed number of requests has been exceeded.  Api Jadid Begir"),0);
 BA.debugLineNum = 161;BA.debugLine="Select Rnd(1,7)";
Debug.ShouldStop(1);
if (true) break;

case 47:
//select
this.state = 62;
switch (BA.switchObjectToInt(parent.mostCurrent.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 7))),BA.numberCast(int.class, 1),BA.numberCast(int.class, 2),BA.numberCast(int.class, 3),BA.numberCast(int.class, 4),BA.numberCast(int.class, 5),BA.numberCast(int.class, 6))) {
case 0: {
this.state = 49;
if (true) break;
}
case 1: {
this.state = 51;
if (true) break;
}
case 2: {
this.state = 53;
if (true) break;
}
case 3: {
this.state = 55;
if (true) break;
}
case 4: {
this.state = 57;
if (true) break;
}
case 5: {
this.state = 59;
if (true) break;
}
default: {
this.state = 61;
if (true) break;
}
}
if (true) break;

case 49:
//C
this.state = 62;
 BA.debugLineNum = 163;BA.debugLine="GetAccuWeather(RegionCode,ApiAccuWeather1)";
Debug.ShouldStop(4);
_getaccuweather(parent._regioncode,parent._apiaccuweather1);
 if (true) break;

case 51:
//C
this.state = 62;
 BA.debugLineNum = 165;BA.debugLine="GetAccuWeather(RegionCode,ApiAccuWeather2)";
Debug.ShouldStop(16);
_getaccuweather(parent._regioncode,parent._apiaccuweather2);
 if (true) break;

case 53:
//C
this.state = 62;
 BA.debugLineNum = 167;BA.debugLine="GetAccuWeather(RegionCode,ApiAccuWeather3)";
Debug.ShouldStop(64);
_getaccuweather(parent._regioncode,parent._apiaccuweather3);
 if (true) break;

case 55:
//C
this.state = 62;
 BA.debugLineNum = 169;BA.debugLine="GetAccuWeather(RegionCode,ApiAccuWeather4)";
Debug.ShouldStop(256);
_getaccuweather(parent._regioncode,parent._apiaccuweather4);
 if (true) break;

case 57:
//C
this.state = 62;
 BA.debugLineNum = 171;BA.debugLine="GetAccuWeather(RegionCode,ApiAccuWeather5)";
Debug.ShouldStop(1024);
_getaccuweather(parent._regioncode,parent._apiaccuweather5);
 if (true) break;

case 59:
//C
this.state = 62;
 BA.debugLineNum = 173;BA.debugLine="GetAccuWeather(RegionCode,ApiAccuWeather6)";
Debug.ShouldStop(4096);
_getaccuweather(parent._regioncode,parent._apiaccuweather6);
 if (true) break;

case 61:
//C
this.state = 62;
 BA.debugLineNum = 175;BA.debugLine="GetAccuWeather(RegionCode,ApiAccuWeather)";
Debug.ShouldStop(16384);
_getaccuweather(parent._regioncode,parent._apiaccuweather);
 if (true) break;

case 62:
//C
this.state = 63;
;
 if (true) break;
;
 BA.debugLineNum = 180;BA.debugLine="If job.ErrorMessage.Contains(\"No address associa";
Debug.ShouldStop(524288);

case 63:
//if
this.state = 66;
if (RemoteObject.solveBoolean(".",_job.getField(true,"_errormessage" /*RemoteObject*/ ).runMethod(true,"contains",(Object)(RemoteObject.createImmutable("No address associated with hostname")))) || RemoteObject.solveBoolean(".",_job.getField(true,"_errormessage" /*RemoteObject*/ ).runMethod(true,"contains",(Object)(RemoteObject.createImmutable("503 Service Unavailable"))))) { 
this.state = 65;
}if (true) break;

case 65:
//C
this.state = 66;
 BA.debugLineNum = 181;BA.debugLine="Sleep(10000)";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("Sleep",accuweathercronjobservice.processBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "accuweathercronjobservice", "jobdone"),BA.numberCast(int.class, 10000));
this.state = 68;
return;
case 68:
//C
this.state = 66;
;
 BA.debugLineNum = 182;BA.debugLine="JobGetAccuWeather.Download(\"http://newserver.ma";
Debug.ShouldStop(2097152);
parent._jobgetaccuweather.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://newserver.mazraeyeman.ir/mazraeyeman_proxy.php?url="),parent._fullurl)));
 BA.debugLineNum = 183;BA.debugLine="ToastMessageShow(\"صفحه مورد نظر پیدا نشد\"&CRLF&";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("صفحه مورد نظر پیدا نشد"),parent.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("احتمالا آیپی شما مسدود شده یا اینترنتتون قطع هست")))),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 66:
//C
this.state = 67;
;
 BA.debugLineNum = 186;BA.debugLine="LogColor(\"Error in Hast:    \"&job.ErrorMessage,C";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","45308501",RemoteObject.concat(RemoteObject.createImmutable("Error in Hast:    "),_job.getField(true,"_errormessage" /*RemoteObject*/ )),parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"));
 if (true) break;

case 67:
//C
this.state = -1;
;
 BA.debugLineNum = 190;BA.debugLine="job.Release";
Debug.ShouldStop(536870912);
_job.runClassMethod (ir.saelozahra.damaara.mazraeyeman.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 192;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 5;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Dim OpenHome As Boolean = False";
accuweathercronjobservice._openhome = accuweathercronjobservice.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 7;BA.debugLine="Dim JobGetRegionCode,JobGetAccuWeather As HttpJob";
accuweathercronjobservice._jobgetregioncode = RemoteObject.createNew ("ir.saelozahra.damaara.mazraeyeman.httpjob");
accuweathercronjobservice._jobgetaccuweather = RemoteObject.createNew ("ir.saelozahra.damaara.mazraeyeman.httpjob");
 //BA.debugLineNum = 8;BA.debugLine="Dim RegionCode As String";
accuweathercronjobservice._regioncode = RemoteObject.createImmutable("");
 //BA.debugLineNum = 9;BA.debugLine="Dim AvvalinBar As Boolean = False";
accuweathercronjobservice._avvalinbar = accuweathercronjobservice.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 10;BA.debugLine="Dim sql1 As SQL";
accuweathercronjobservice._sql1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");
 //BA.debugLineNum = 11;BA.debugLine="Dim FullUrl As String";
accuweathercronjobservice._fullurl = RemoteObject.createImmutable("");
 //BA.debugLineNum = 12;BA.debugLine="Dim MatneTouzihat As String";
accuweathercronjobservice._matnetouzihat = RemoteObject.createImmutable("");
 //BA.debugLineNum = 13;BA.debugLine="Dim UVIndex,DayShortPhrase,NightShortPhrase As St";
accuweathercronjobservice._uvindex = RemoteObject.createImmutable("");
accuweathercronjobservice._dayshortphrase = RemoteObject.createImmutable("");
accuweathercronjobservice._nightshortphrase = RemoteObject.createImmutable("");
 //BA.debugLineNum = 14;BA.debugLine="Dim ApiAccuWeather As String  = \"g9btQW4rvB3pAHS3";
accuweathercronjobservice._apiaccuweather = BA.ObjectToString("g9btQW4rvB3pAHS37m8kqA8xobFsSGUu");
 //BA.debugLineNum = 15;BA.debugLine="Dim ApiAccuWeather1 As String = \"4LlMJ2sdnGCqgsLe";
accuweathercronjobservice._apiaccuweather1 = BA.ObjectToString("4LlMJ2sdnGCqgsLeZV30m11X1QEHRLM7");
 //BA.debugLineNum = 16;BA.debugLine="Dim ApiAccuWeather2 As String = \"rgAVOs6ZCNaut1hb";
accuweathercronjobservice._apiaccuweather2 = BA.ObjectToString("rgAVOs6ZCNaut1hbqL3p8YVBkkLZBtrq");
 //BA.debugLineNum = 17;BA.debugLine="Dim ApiAccuWeather3 As String = \"ARgdZ3zsAzhRLn5M";
accuweathercronjobservice._apiaccuweather3 = BA.ObjectToString("ARgdZ3zsAzhRLn5MadrahTDaCVVHoTb7");
 //BA.debugLineNum = 18;BA.debugLine="Dim ApiAccuWeather4 As String = \"3JtrEZcZTQO9ptzb";
accuweathercronjobservice._apiaccuweather4 = BA.ObjectToString("3JtrEZcZTQO9ptzb0AhALr1JKm3ucOIw");
 //BA.debugLineNum = 19;BA.debugLine="Dim ApiAccuWeather5 As String = \"5pYddALhTGle3yts";
accuweathercronjobservice._apiaccuweather5 = BA.ObjectToString("5pYddALhTGle3ytso69AuK6H4jkerbDL");
 //BA.debugLineNum = 20;BA.debugLine="Dim ApiAccuWeather6 As String = \"wLSgTqG4jjoTNbK7";
accuweathercronjobservice._apiaccuweather6 = BA.ObjectToString("wLSgTqG4jjoTNbK7vYgyC4HRQVlwXbYt");
 //BA.debugLineNum = 21;BA.debugLine="Dim DayIcon,NightIcon,DayRainProbability,MinDama,";
accuweathercronjobservice._dayicon = RemoteObject.createImmutable(0);
accuweathercronjobservice._nighticon = RemoteObject.createImmutable(0);
accuweathercronjobservice._dayrainprobability = RemoteObject.createImmutable(0);
accuweathercronjobservice._mindama = RemoteObject.createImmutable(0);
accuweathercronjobservice._maxdama = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 22;BA.debugLine="Dim BazeDama,WindHaDay,WindHaNight,ListValues,Lis";
accuweathercronjobservice._bazedama = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
accuweathercronjobservice._windhaday = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
accuweathercronjobservice._windhanight = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
accuweathercronjobservice._listvalues = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
accuweathercronjobservice._listuserproducts = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 23;BA.debugLine="Dim RAF As RandomAccessFile";
accuweathercronjobservice._raf = RemoteObject.createNew ("anywheresoftware.b4a.randomaccessfile.RandomAccessFile");
 //BA.debugLineNum = 24;BA.debugLine="Dim NotifKon As Boolean";
accuweathercronjobservice._notifkon = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _saveandalert(RemoteObject _id_str,RemoteObject _title_str,RemoteObject _content_str,RemoteObject _vaziat_str,RemoteObject _icon_str,RemoteObject _timestr,RemoteObject _notifbool) throws Exception{
try {
		Debug.PushSubsStack("saveAndAlert (accuweathercronjobservice) ","accuweathercronjobservice",5,accuweathercronjobservice.processBA,accuweathercronjobservice.mostCurrent,632);
if (RapidSub.canDelegate("saveandalert")) { return ir.saelozahra.damaara.mazraeyeman.accuweathercronjobservice.remoteMe.runUserSub(false, "accuweathercronjobservice","saveandalert", _id_str, _title_str, _content_str, _vaziat_str, _icon_str, _timestr, _notifbool);}
Debug.locals.put("ID_str", _id_str);
Debug.locals.put("title_str", _title_str);
Debug.locals.put("content_str", _content_str);
Debug.locals.put("Vaziat_str", _vaziat_str);
Debug.locals.put("Icon_str", _icon_str);
Debug.locals.put("TimeStr", _timestr);
Debug.locals.put("NotifBool", _notifbool);
 BA.debugLineNum = 632;BA.debugLine="Sub saveAndAlert(ID_str As String, title_str As St";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 634;BA.debugLine="Try";
Debug.ShouldStop(33554432);
try { BA.debugLineNum = 635;BA.debugLine="sql1.ExecNonQuery($\"insert into notification (id";
Debug.ShouldStop(67108864);
accuweathercronjobservice._sql1.runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("insert into notification (id,title,type,value,time,icon) VALUES ('"),accuweathercronjobservice.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_id_str))),RemoteObject.createImmutable("','"),accuweathercronjobservice.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_title_str))),RemoteObject.createImmutable("','"),accuweathercronjobservice.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_vaziat_str))),RemoteObject.createImmutable("','"),accuweathercronjobservice.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_content_str))),RemoteObject.createImmutable("','"),accuweathercronjobservice.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_timestr))),RemoteObject.createImmutable("','"),accuweathercronjobservice.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_icon_str))),RemoteObject.createImmutable("')")))));
 BA.debugLineNum = 636;BA.debugLine="LogColor(\"Local DB Inserted\",Colors.Magenta)";
Debug.ShouldStop(134217728);
accuweathercronjobservice.mostCurrent.__c.runVoidMethod ("LogImpl","45570564",BA.ObjectToString("Local DB Inserted"),accuweathercronjobservice.mostCurrent.__c.getField(false,"Colors").getField(true,"Magenta"));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e5) {
			BA.rdebugUtils.runVoidMethod("setLastException",accuweathercronjobservice.processBA, e5.toString()); BA.debugLineNum = 638;BA.debugLine="Try";
Debug.ShouldStop(536870912);
try { BA.debugLineNum = 639;BA.debugLine="sql1.ExecNonQuery($\"UPDATE notification set tit";
Debug.ShouldStop(1073741824);
accuweathercronjobservice._sql1.runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("UPDATE notification set title = '"),accuweathercronjobservice.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_title_str))),RemoteObject.createImmutable("',type ='"),accuweathercronjobservice.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_vaziat_str))),RemoteObject.createImmutable("',value = '"),accuweathercronjobservice.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_content_str))),RemoteObject.createImmutable("',time = '"),accuweathercronjobservice.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_timestr))),RemoteObject.createImmutable("',icon = '"),accuweathercronjobservice.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_icon_str))),RemoteObject.createImmutable("' WHERE id = '"),accuweathercronjobservice.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_id_str))),RemoteObject.createImmutable("'")))));
 BA.debugLineNum = 640;BA.debugLine="LogColor(\"Local DB Updated\",Colors.Magenta)";
Debug.ShouldStop(-2147483648);
accuweathercronjobservice.mostCurrent.__c.runVoidMethod ("LogImpl","45570568",BA.ObjectToString("Local DB Updated"),accuweathercronjobservice.mostCurrent.__c.getField(false,"Colors").getField(true,"Magenta"));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e9) {
			BA.rdebugUtils.runVoidMethod("setLastException",accuweathercronjobservice.processBA, e9.toString()); BA.debugLineNum = 642;BA.debugLine="LogColor($\"Local DB Errrror: ${LastException.Me";
Debug.ShouldStop(2);
accuweathercronjobservice.mostCurrent.__c.runVoidMethod ("LogImpl","45570570",(RemoteObject.concat(RemoteObject.createImmutable("Local DB Errrror: "),accuweathercronjobservice.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((accuweathercronjobservice.mostCurrent.__c.runMethod(false,"LastException",accuweathercronjobservice.processBA).runMethod(true,"getMessage")))),RemoteObject.createImmutable(" error To Up this id To Notification = "),accuweathercronjobservice.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_title_str))),RemoteObject.createImmutable(""))),accuweathercronjobservice.mostCurrent.__c.getField(false,"Colors").getField(true,"Magenta"));
 };
 };
 BA.debugLineNum = 646;BA.debugLine="If NotifBool Then CreateNotification(title_str ,";
Debug.ShouldStop(32);
if (_notifbool.<Boolean>get().booleanValue()) { 
_createnotification(_title_str,accuweathercronjobservice._matnetouzihat,BA.ObjectToString("teraktor"),(accuweathercronjobservice.mostCurrent._notificationact.getObject()),accuweathercronjobservice.mostCurrent.__c.getField(true,"True"),accuweathercronjobservice.mostCurrent.__c.getField(true,"True")).runVoidMethod ("Notify",(Object)(BA.numberCast(int.class, 1)));};
 BA.debugLineNum = 648;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_create() throws Exception{
try {
		Debug.PushSubsStack("Service_Create (accuweathercronjobservice) ","accuweathercronjobservice",5,accuweathercronjobservice.processBA,accuweathercronjobservice.mostCurrent,27);
if (RapidSub.canDelegate("service_create")) { return ir.saelozahra.damaara.mazraeyeman.accuweathercronjobservice.remoteMe.runUserSub(false, "accuweathercronjobservice","service_create");}
 BA.debugLineNum = 27;BA.debugLine="Sub Service_Create";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 28;BA.debugLine="LogColor(\"AccuWeatherCronJobService Created\",Sael";
Debug.ShouldStop(134217728);
accuweathercronjobservice.mostCurrent.__c.runVoidMethod ("LogImpl","45046273",BA.ObjectToString("AccuWeatherCronJobService Created"),accuweathercronjobservice.mostCurrent._saelozahra._colordark /*RemoteObject*/ );
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_destroy() throws Exception{
try {
		Debug.PushSubsStack("Service_Destroy (accuweathercronjobservice) ","accuweathercronjobservice",5,accuweathercronjobservice.processBA,accuweathercronjobservice.mostCurrent,69);
if (RapidSub.canDelegate("service_destroy")) { return ir.saelozahra.damaara.mazraeyeman.accuweathercronjobservice.remoteMe.runUserSub(false, "accuweathercronjobservice","service_destroy");}
 BA.debugLineNum = 69;BA.debugLine="Sub Service_Destroy";
Debug.ShouldStop(16);
 BA.debugLineNum = 71;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_start(RemoteObject _startingintent) throws Exception{
try {
		Debug.PushSubsStack("Service_Start (accuweathercronjobservice) ","accuweathercronjobservice",5,accuweathercronjobservice.processBA,accuweathercronjobservice.mostCurrent,34);
if (RapidSub.canDelegate("service_start")) { return ir.saelozahra.damaara.mazraeyeman.accuweathercronjobservice.remoteMe.runUserSub(false, "accuweathercronjobservice","service_start", _startingintent);}
Debug.locals.put("StartingIntent", _startingintent);
 BA.debugLineNum = 34;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
Debug.ShouldStop(2);
 BA.debugLineNum = 36;BA.debugLine="LogColor(\"AccuWeatherCronJobService Started\",Sael";
Debug.ShouldStop(8);
accuweathercronjobservice.mostCurrent.__c.runVoidMethod ("LogImpl","45111810",BA.ObjectToString("AccuWeatherCronJobService Started"),accuweathercronjobservice.mostCurrent._saelozahra._colordark /*RemoteObject*/ );
 BA.debugLineNum = 38;BA.debugLine="If Not(Starter.MyLocation.IsInitialized) Then";
Debug.ShouldStop(32);
if (accuweathercronjobservice.mostCurrent.__c.runMethod(true,"Not",(Object)(accuweathercronjobservice.mostCurrent._starter._mylocation /*RemoteObject*/ .runMethod(true,"IsInitialized"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 39;BA.debugLine="If File.Exists(SaeloZahra.dir,\"lat\") Then";
Debug.ShouldStop(64);
if (accuweathercronjobservice.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(accuweathercronjobservice.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("lat"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 40;BA.debugLine="Starter.MyLocation.Initialize";
Debug.ShouldStop(128);
accuweathercronjobservice.mostCurrent._starter._mylocation /*RemoteObject*/ .runVoidMethod ("Initialize");
 BA.debugLineNum = 41;BA.debugLine="Starter.MyLocation.Latitude  = File.ReadString(";
Debug.ShouldStop(256);
accuweathercronjobservice.mostCurrent._starter._mylocation /*RemoteObject*/ .runMethod(true,"setLatitude",BA.numberCast(double.class, accuweathercronjobservice.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(accuweathercronjobservice.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("lat")))));
 BA.debugLineNum = 42;BA.debugLine="Starter.MyLocation.Longitude = File.ReadString(";
Debug.ShouldStop(512);
accuweathercronjobservice.mostCurrent._starter._mylocation /*RemoteObject*/ .runMethod(true,"setLongitude",BA.numberCast(double.class, accuweathercronjobservice.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(accuweathercronjobservice.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("lng")))));
 };
 };
 BA.debugLineNum = 47;BA.debugLine="If SaeloZahra.CheckConnection Then";
Debug.ShouldStop(16384);
if (accuweathercronjobservice.mostCurrent._saelozahra.runMethod(true,"_checkconnection" /*RemoteObject*/ ,accuweathercronjobservice.processBA).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 48;BA.debugLine="StartServiceAt(Me, DateTime.Now + 24 * DateTime.";
Debug.ShouldStop(32768);
accuweathercronjobservice.mostCurrent.__c.runVoidMethod ("StartServiceAt",accuweathercronjobservice.processBA,(Object)(accuweathercronjobservice.getObject()),(Object)(RemoteObject.solve(new RemoteObject[] {accuweathercronjobservice.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"),RemoteObject.createImmutable(24),accuweathercronjobservice.mostCurrent.__c.getField(false,"DateTime").getField(true,"TicksPerHour")}, "+*",1, 2)),(Object)(accuweathercronjobservice.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 49;BA.debugLine="FindRegionCode";
Debug.ShouldStop(65536);
_findregioncode();
 }else {
 BA.debugLineNum = 51;BA.debugLine="Log(\"اینترنتو وصل کن داداچ\")";
Debug.ShouldStop(262144);
accuweathercronjobservice.mostCurrent.__c.runVoidMethod ("LogImpl","45111825",RemoteObject.createImmutable("اینترنتو وصل کن داداچ"),0);
 BA.debugLineNum = 52;BA.debugLine="StartServiceAt(Me, DateTime.Now + 15 * DateTime.";
Debug.ShouldStop(524288);
accuweathercronjobservice.mostCurrent.__c.runVoidMethod ("StartServiceAt",accuweathercronjobservice.processBA,(Object)(accuweathercronjobservice.getObject()),(Object)(RemoteObject.solve(new RemoteObject[] {accuweathercronjobservice.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"),RemoteObject.createImmutable(15),accuweathercronjobservice.mostCurrent.__c.getField(false,"DateTime").getField(true,"TicksPerMinute")}, "+*",1, 2)),(Object)(accuweathercronjobservice.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 58;BA.debugLine="If Not(File.Exists(SaeloZahra.dir,\"db.db\"))Then";
Debug.ShouldStop(33554432);
if (accuweathercronjobservice.mostCurrent.__c.runMethod(true,"Not",(Object)(accuweathercronjobservice.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(accuweathercronjobservice.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("db.db"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 59;BA.debugLine="File.Copy(File.DirAssets,\"db.db\",SaeloZahra.dir,";
Debug.ShouldStop(67108864);
accuweathercronjobservice.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(accuweathercronjobservice.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("db.db")),(Object)(accuweathercronjobservice.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("db.db")));
 };
 BA.debugLineNum = 62;BA.debugLine="If sql1.IsInitialized = False Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",accuweathercronjobservice._sql1.runMethod(true,"IsInitialized"),accuweathercronjobservice.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 63;BA.debugLine="sql1.Initialize(SaeloZahra.dir,\"db.db\",False)";
Debug.ShouldStop(1073741824);
accuweathercronjobservice._sql1.runVoidMethod ("Initialize",(Object)(accuweathercronjobservice.mostCurrent._saelozahra._dir /*RemoteObject*/ ),(Object)(BA.ObjectToString("db.db")),(Object)(accuweathercronjobservice.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}