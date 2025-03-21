package ir.saelozahra.damaara.mazraeyeman;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class dateutils_subs_0 {


public static RemoteObject  _addperiod(RemoteObject _ba,RemoteObject _ticks,RemoteObject _per) throws Exception{
try {
		Debug.PushSubsStack("AddPeriod (dateutils) ","dateutils",14,_ba,dateutils.mostCurrent,220);
if (RapidSub.canDelegate("addperiod")) { return ir.saelozahra.damaara.mazraeyeman.dateutils.remoteMe.runUserSub(false, "dateutils","addperiod", _ba, _ticks, _per);}
;
Debug.locals.put("Ticks", _ticks);
Debug.locals.put("Per", _per);
 BA.debugLineNum = 220;BA.debugLine="Public Sub AddPeriod(Ticks As Long, Per As Period)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 221;BA.debugLine="Ticks = DateTime.Add(Ticks, Per.Years, Per.Months";
Debug.ShouldStop(268435456);
_ticks = dateutils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Add",(Object)(_ticks),(Object)(_per.getField(true,"Years" /*RemoteObject*/ )),(Object)(_per.getField(true,"Months" /*RemoteObject*/ )),(Object)(_per.getField(true,"Days" /*RemoteObject*/ )));Debug.locals.put("Ticks", _ticks);
 BA.debugLineNum = 222;BA.debugLine="Ticks = Ticks + Per.Hours * DateTime.TicksPerHour";
Debug.ShouldStop(536870912);
_ticks = RemoteObject.solve(new RemoteObject[] {_ticks,_per.getField(true,"Hours" /*RemoteObject*/ ),dateutils.mostCurrent.__c.getField(false,"DateTime").getField(true,"TicksPerHour"),_per.getField(true,"Minutes" /*RemoteObject*/ ),dateutils.mostCurrent.__c.getField(false,"DateTime").getField(true,"TicksPerMinute"),_per.getField(true,"Seconds" /*RemoteObject*/ ),dateutils.mostCurrent.__c.getField(false,"DateTime").getField(true,"TicksPerSecond")}, "+*+*+*",3, 2);Debug.locals.put("Ticks", _ticks);
 BA.debugLineNum = 224;BA.debugLine="Return Ticks";
Debug.ShouldStop(-2147483648);
if (true) return _ticks;
 BA.debugLineNum = 225;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _format(RemoteObject _ba,RemoteObject _value,RemoteObject _length) throws Exception{
try {
		Debug.PushSubsStack("Format (dateutils) ","dateutils",14,_ba,dateutils.mostCurrent,207);
if (RapidSub.canDelegate("format")) { return ir.saelozahra.damaara.mazraeyeman.dateutils.remoteMe.runUserSub(false, "dateutils","format", _ba, _value, _length);}
;
Debug.locals.put("Value", _value);
Debug.locals.put("Length", _length);
 BA.debugLineNum = 207;BA.debugLine="Private Sub Format(Value As Int, Length As Int) As";
Debug.ShouldStop(16384);
 BA.debugLineNum = 208;BA.debugLine="Return NumberFormat2(Value, Length, 0, 0, False)";
Debug.ShouldStop(32768);
if (true) return dateutils.mostCurrent.__c.runMethod(true,"NumberFormat2",(Object)(BA.numberCast(double.class, _value)),(Object)(_length),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(dateutils.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 209;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdayofweekname(RemoteObject _ba,RemoteObject _ticks) throws Exception{
try {
		Debug.PushSubsStack("GetDayOfWeekName (dateutils) ","dateutils",14,_ba,dateutils.mostCurrent,21);
if (RapidSub.canDelegate("getdayofweekname")) { return ir.saelozahra.damaara.mazraeyeman.dateutils.remoteMe.runUserSub(false, "dateutils","getdayofweekname", _ba, _ticks);}
RemoteObject _df = RemoteObject.createImmutable("");
RemoteObject _res = RemoteObject.createImmutable("");
;
Debug.locals.put("Ticks", _ticks);
 BA.debugLineNum = 21;BA.debugLine="Public Sub GetDayOfWeekName(Ticks As Long) As Stri";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 22;BA.debugLine="Dim df As String = DateTime.DateFormat";
Debug.ShouldStop(2097152);
_df = dateutils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("df", _df);Debug.locals.put("df", _df);
 BA.debugLineNum = 23;BA.debugLine="DateTime.DateFormat = \"EEEE\"";
Debug.ShouldStop(4194304);
dateutils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("EEEE"));
 BA.debugLineNum = 24;BA.debugLine="Dim res As String = DateTime.Date(Ticks)";
Debug.ShouldStop(8388608);
_res = dateutils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_ticks));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 25;BA.debugLine="DateTime.DateFormat = df";
Debug.ShouldStop(16777216);
dateutils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_df);
 BA.debugLineNum = 26;BA.debugLine="Return res";
Debug.ShouldStop(33554432);
if (true) return _res;
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdaysnames(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("GetDaysNames (dateutils) ","dateutils",14,_ba,dateutils.mostCurrent,30);
if (RapidSub.canDelegate("getdaysnames")) { return ir.saelozahra.damaara.mazraeyeman.dateutils.remoteMe.runUserSub(false, "dateutils","getdaysnames", _ba);}
RemoteObject _df = RemoteObject.createImmutable("");
RemoteObject _t = RemoteObject.createImmutable(0L);
int _i = 0;
;
 BA.debugLineNum = 30;BA.debugLine="Public Sub GetDaysNames As List";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 31;BA.debugLine="If daysList.IsInitialized Then Return daysList";
Debug.ShouldStop(1073741824);
if (dateutils._dayslist.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
if (true) return dateutils._dayslist;};
 BA.debugLineNum = 32;BA.debugLine="daysList.Initialize";
Debug.ShouldStop(-2147483648);
dateutils._dayslist.runVoidMethod ("Initialize");
 BA.debugLineNum = 33;BA.debugLine="Dim df As String = DateTime.DateFormat";
Debug.ShouldStop(1);
_df = dateutils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("df", _df);Debug.locals.put("df", _df);
 BA.debugLineNum = 34;BA.debugLine="DateTime.DateFormat = \"EEEE\"";
Debug.ShouldStop(2);
dateutils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("EEEE"));
 BA.debugLineNum = 35;BA.debugLine="Dim t As Long = DateTime.Now";
Debug.ShouldStop(4);
_t = dateutils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("t", _t);Debug.locals.put("t", _t);
 BA.debugLineNum = 36;BA.debugLine="t = DateTime.Add(t, 0, 0, - (DateTime.GetDayOfWee";
Debug.ShouldStop(8);
_t = dateutils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Add",(Object)(_t),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, -(double) (0 + (RemoteObject.solve(new RemoteObject[] {dateutils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"GetDayOfWeek",(Object)(_t)),RemoteObject.createImmutable(1)}, "-",1, 1)).<Integer>get().intValue()))));Debug.locals.put("t", _t);
 BA.debugLineNum = 37;BA.debugLine="For i = 1 To 7";
Debug.ShouldStop(16);
{
final int step7 = 1;
final int limit7 = 7;
_i = 1 ;
for (;(step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7) ;_i = ((int)(0 + _i + step7))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 38;BA.debugLine="daysList.Add(DateTime.Date(t))";
Debug.ShouldStop(32);
dateutils._dayslist.runVoidMethod ("Add",(Object)((dateutils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_t)))));
 BA.debugLineNum = 39;BA.debugLine="t = DateTime.Add(t, 0, 0, 1)";
Debug.ShouldStop(64);
_t = dateutils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Add",(Object)(_t),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("t", _t);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 41;BA.debugLine="DateTime.DateFormat = df";
Debug.ShouldStop(256);
dateutils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_df);
 BA.debugLineNum = 42;BA.debugLine="Return daysList";
Debug.ShouldStop(512);
if (true) return dateutils._dayslist;
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getera(RemoteObject _ba,RemoteObject _negative) throws Exception{
try {
		Debug.PushSubsStack("GetEra (dateutils) ","dateutils",14,_ba,dateutils.mostCurrent,141);
if (RapidSub.canDelegate("getera")) { return ir.saelozahra.damaara.mazraeyeman.dateutils.remoteMe.runUserSub(false, "dateutils","getera", _ba, _negative);}
RemoteObject _df = RemoteObject.createImmutable("");
;
Debug.locals.put("Negative", _negative);
 BA.debugLineNum = 141;BA.debugLine="Private Sub GetEra(Negative As Boolean) As String";
Debug.ShouldStop(4096);
 BA.debugLineNum = 142;BA.debugLine="Dim df As String = DateTime.DateFormat";
Debug.ShouldStop(8192);
_df = dateutils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("df", _df);Debug.locals.put("df", _df);
 BA.debugLineNum = 143;BA.debugLine="If Negative Then";
Debug.ShouldStop(16384);
if (_negative.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 144;BA.debugLine="If bc <> \"\" Then Return bc";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("!",dateutils._bc,BA.ObjectToString(""))) { 
if (true) return dateutils._bc;};
 BA.debugLineNum = 145;BA.debugLine="DateTime.DateFormat = \"GG\"";
Debug.ShouldStop(65536);
dateutils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("GG"));
 BA.debugLineNum = 146;BA.debugLine="bc = DateTime.Date(-137628808000000)";
Debug.ShouldStop(131072);
dateutils._bc = dateutils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(BA.numberCast(long.class, -137628808000000L)));
 BA.debugLineNum = 147;BA.debugLine="DateTime.DateFormat = df";
Debug.ShouldStop(262144);
dateutils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_df);
 BA.debugLineNum = 148;BA.debugLine="Return bc";
Debug.ShouldStop(524288);
if (true) return dateutils._bc;
 }else {
 BA.debugLineNum = 150;BA.debugLine="If ad <> \"\" Then Return ad";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("!",dateutils._ad,BA.ObjectToString(""))) { 
if (true) return dateutils._ad;};
 BA.debugLineNum = 151;BA.debugLine="DateTime.DateFormat = \"GG\"";
Debug.ShouldStop(4194304);
dateutils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("GG"));
 BA.debugLineNum = 152;BA.debugLine="ad = DateTime.Date(0)";
Debug.ShouldStop(8388608);
dateutils._ad = dateutils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(BA.numberCast(long.class, 0)));
 BA.debugLineNum = 153;BA.debugLine="DateTime.DateFormat = df";
Debug.ShouldStop(16777216);
dateutils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_df);
 BA.debugLineNum = 154;BA.debugLine="Return ad";
Debug.ShouldStop(33554432);
if (true) return dateutils._ad;
 };
 BA.debugLineNum = 156;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getmonthname(RemoteObject _ba,RemoteObject _ticks) throws Exception{
try {
		Debug.PushSubsStack("GetMonthName (dateutils) ","dateutils",14,_ba,dateutils.mostCurrent,11);
if (RapidSub.canDelegate("getmonthname")) { return ir.saelozahra.damaara.mazraeyeman.dateutils.remoteMe.runUserSub(false, "dateutils","getmonthname", _ba, _ticks);}
RemoteObject _df = RemoteObject.createImmutable("");
RemoteObject _res = RemoteObject.createImmutable("");
;
Debug.locals.put("Ticks", _ticks);
 BA.debugLineNum = 11;BA.debugLine="Public Sub GetMonthName(Ticks As Long) As String";
Debug.ShouldStop(1024);
 BA.debugLineNum = 12;BA.debugLine="Dim df As String = DateTime.DateFormat";
Debug.ShouldStop(2048);
_df = dateutils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("df", _df);Debug.locals.put("df", _df);
 BA.debugLineNum = 13;BA.debugLine="DateTime.DateFormat = \"MMMM\"";
Debug.ShouldStop(4096);
dateutils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("MMMM"));
 BA.debugLineNum = 14;BA.debugLine="Dim res As String = DateTime.Date(Ticks)";
Debug.ShouldStop(8192);
_res = dateutils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_ticks));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 15;BA.debugLine="DateTime.DateFormat = df";
Debug.ShouldStop(16384);
dateutils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_df);
 BA.debugLineNum = 16;BA.debugLine="Return res";
Debug.ShouldStop(32768);
if (true) return _res;
 BA.debugLineNum = 17;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getmonthsnames(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("GetMonthsNames (dateutils) ","dateutils",14,_ba,dateutils.mostCurrent,46);
if (RapidSub.canDelegate("getmonthsnames")) { return ir.saelozahra.damaara.mazraeyeman.dateutils.remoteMe.runUserSub(false, "dateutils","getmonthsnames", _ba);}
RemoteObject _df = RemoteObject.createImmutable("");
RemoteObject _t = RemoteObject.createImmutable(0L);
int _i = 0;
;
 BA.debugLineNum = 46;BA.debugLine="Public Sub GetMonthsNames As List";
Debug.ShouldStop(8192);
 BA.debugLineNum = 47;BA.debugLine="If monthsList.IsInitialized Then Return monthsLis";
Debug.ShouldStop(16384);
if (dateutils._monthslist.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
if (true) return dateutils._monthslist;};
 BA.debugLineNum = 48;BA.debugLine="monthsList.Initialize";
Debug.ShouldStop(32768);
dateutils._monthslist.runVoidMethod ("Initialize");
 BA.debugLineNum = 49;BA.debugLine="Dim df As String = DateTime.DateFormat";
Debug.ShouldStop(65536);
_df = dateutils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("df", _df);Debug.locals.put("df", _df);
 BA.debugLineNum = 50;BA.debugLine="DateTime.DateFormat = \"MMMM\"";
Debug.ShouldStop(131072);
dateutils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("MMMM"));
 BA.debugLineNum = 51;BA.debugLine="Dim t As Long = DateTime.Now";
Debug.ShouldStop(262144);
_t = dateutils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("t", _t);Debug.locals.put("t", _t);
 BA.debugLineNum = 52;BA.debugLine="t = DateTime.Add(t, 0,- (DateTime.GetMonth(t) - 1";
Debug.ShouldStop(524288);
_t = dateutils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Add",(Object)(_t),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, -(double) (0 + (RemoteObject.solve(new RemoteObject[] {dateutils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(_t)),RemoteObject.createImmutable(1)}, "-",1, 1)).<Integer>get().intValue()))),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("t", _t);
 BA.debugLineNum = 53;BA.debugLine="For i = 1 To 12";
Debug.ShouldStop(1048576);
{
final int step7 = 1;
final int limit7 = 12;
_i = 1 ;
for (;(step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7) ;_i = ((int)(0 + _i + step7))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 54;BA.debugLine="monthsList.Add(DateTime.Date(t))";
Debug.ShouldStop(2097152);
dateutils._monthslist.runVoidMethod ("Add",(Object)((dateutils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_t)))));
 BA.debugLineNum = 55;BA.debugLine="t = DateTime.Add(t, 0, 1, 0)";
Debug.ShouldStop(4194304);
_t = dateutils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Add",(Object)(_t),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("t", _t);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 57;BA.debugLine="DateTime.DateFormat = df";
Debug.ShouldStop(16777216);
dateutils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_df);
 BA.debugLineNum = 58;BA.debugLine="Return monthsList";
Debug.ShouldStop(33554432);
if (true) return dateutils._monthslist;
 BA.debugLineNum = 59;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _issameday(RemoteObject _ba,RemoteObject _ticks1,RemoteObject _ticks2) throws Exception{
try {
		Debug.PushSubsStack("IsSameDay (dateutils) ","dateutils",14,_ba,dateutils.mostCurrent,232);
if (RapidSub.canDelegate("issameday")) { return ir.saelozahra.damaara.mazraeyeman.dateutils.remoteMe.runUserSub(false, "dateutils","issameday", _ba, _ticks1, _ticks2);}
;
Debug.locals.put("Ticks1", _ticks1);
Debug.locals.put("Ticks2", _ticks2);
 BA.debugLineNum = 232;BA.debugLine="Public Sub IsSameDay(Ticks1 As Long, Ticks2 As Lon";
Debug.ShouldStop(128);
 BA.debugLineNum = 233;BA.debugLine="Return DateTime.GetYear(Ticks1) = DateTime.GetYea";
Debug.ShouldStop(256);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("=",dateutils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_ticks1)),BA.numberCast(double.class, dateutils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_ticks2)))) && RemoteObject.solveBoolean("=",dateutils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(_ticks1)),BA.numberCast(double.class, dateutils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(_ticks2)))) && RemoteObject.solveBoolean("=",dateutils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(_ticks1)),BA.numberCast(double.class, dateutils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(_ticks2)))));
 BA.debugLineNum = 235;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _numberofdaysinmonth(RemoteObject _ba,RemoteObject _month,RemoteObject _year) throws Exception{
try {
		Debug.PushSubsStack("NumberOfDaysInMonth (dateutils) ","dateutils",14,_ba,dateutils.mostCurrent,212);
if (RapidSub.canDelegate("numberofdaysinmonth")) { return ir.saelozahra.damaara.mazraeyeman.dateutils.remoteMe.runUserSub(false, "dateutils","numberofdaysinmonth", _ba, _month, _year);}
RemoteObject _ticks = RemoteObject.createImmutable(0L);
RemoteObject _nextmonth = RemoteObject.createImmutable(0L);
RemoteObject _res = RemoteObject.createImmutable(0);
;
Debug.locals.put("Month", _month);
Debug.locals.put("Year", _year);
 BA.debugLineNum = 212;BA.debugLine="Public Sub NumberOfDaysInMonth(Month As Int, Year";
Debug.ShouldStop(524288);
 BA.debugLineNum = 213;BA.debugLine="Dim Ticks As Long = SetDate(Year, Month, 1)";
Debug.ShouldStop(1048576);
_ticks = _setdate(_ba,_year,_month,BA.numberCast(int.class, 1));Debug.locals.put("Ticks", _ticks);Debug.locals.put("Ticks", _ticks);
 BA.debugLineNum = 214;BA.debugLine="Dim nextMonth As Long = DateTime.Add(Ticks, 0, 1,";
Debug.ShouldStop(2097152);
_nextmonth = dateutils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Add",(Object)(_ticks),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("nextMonth", _nextmonth);Debug.locals.put("nextMonth", _nextmonth);
 BA.debugLineNum = 215;BA.debugLine="Dim res As Int =  Round((nextMonth - Ticks) / Dat";
Debug.ShouldStop(4194304);
_res = BA.numberCast(int.class, dateutils.mostCurrent.__c.runMethod(true,"Round",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_nextmonth,_ticks}, "-",1, 2)),dateutils.mostCurrent.__c.getField(false,"DateTime").getField(true,"TicksPerDay")}, "/",0, 0))));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 216;BA.debugLine="Return res";
Debug.ShouldStop(8388608);
if (true) return _res;
 BA.debugLineNum = 217;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _periodbetween(RemoteObject _ba,RemoteObject _start,RemoteObject _endtime) throws Exception{
try {
		Debug.PushSubsStack("PeriodBetween (dateutils) ","dateutils",14,_ba,dateutils.mostCurrent,63);
if (RapidSub.canDelegate("periodbetween")) { return ir.saelozahra.damaara.mazraeyeman.dateutils.remoteMe.runUserSub(false, "dateutils","periodbetween", _ba, _start, _endtime);}
;
Debug.locals.put("Start", _start);
Debug.locals.put("EndTime", _endtime);
 BA.debugLineNum = 63;BA.debugLine="Public Sub PeriodBetween(Start As Long, EndTime As";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 64;BA.debugLine="Return PeriodBetweenHelper(Start, EndTime, False)";
Debug.ShouldStop(-2147483648);
if (true) return _periodbetweenhelper(_ba,_start,_endtime,dateutils.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 65;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _periodbetweenhelper(RemoteObject _ba,RemoteObject _start,RemoteObject _endtime,RemoteObject _startwithdays) throws Exception{
try {
		Debug.PushSubsStack("PeriodBetweenHelper (dateutils) ","dateutils",14,_ba,dateutils.mostCurrent,73);
if (RapidSub.canDelegate("periodbetweenhelper")) { return ir.saelozahra.damaara.mazraeyeman.dateutils.remoteMe.runUserSub(false, "dateutils","periodbetweenhelper", _ba, _start, _endtime, _startwithdays);}
RemoteObject _td = RemoteObject.declareNull("ir.saelozahra.damaara.mazraeyeman.dateutils._period");
RemoteObject _sy = RemoteObject.createImmutable(0);
RemoteObject _ey = RemoteObject.createImmutable(0);
RemoteObject _daysoffset = RemoteObject.createImmutable(0);
RemoteObject _ticks = RemoteObject.createImmutable(0L);
int _i = 0;
RemoteObject _diff = RemoteObject.createImmutable(0L);
;
Debug.locals.put("Start", _start);
Debug.locals.put("EndTime", _endtime);
Debug.locals.put("StartWithDays", _startwithdays);
 BA.debugLineNum = 73;BA.debugLine="Private Sub PeriodBetweenHelper(Start As Long, End";
Debug.ShouldStop(256);
 BA.debugLineNum = 74;BA.debugLine="Dim td As Period";
Debug.ShouldStop(512);
_td = RemoteObject.createNew ("ir.saelozahra.damaara.mazraeyeman.dateutils._period");Debug.locals.put("td", _td);
 BA.debugLineNum = 75;BA.debugLine="td.Initialize";
Debug.ShouldStop(1024);
_td.runVoidMethod ("Initialize");
 BA.debugLineNum = 76;BA.debugLine="Dim sy = DateTime.GetYear(Start), ey = DateTime.G";
Debug.ShouldStop(2048);
_sy = dateutils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_start));Debug.locals.put("sy", _sy);Debug.locals.put("sy", _sy);
_ey = dateutils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_endtime));Debug.locals.put("ey", _ey);Debug.locals.put("ey", _ey);
 BA.debugLineNum = 77;BA.debugLine="Dim daysOffset As Int";
Debug.ShouldStop(4096);
_daysoffset = RemoteObject.createImmutable(0);Debug.locals.put("daysOffset", _daysoffset);
 BA.debugLineNum = 78;BA.debugLine="If EndTime > Start Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean(">",_endtime,_start)) { 
 BA.debugLineNum = 79;BA.debugLine="If Not(StartWithDays) Then";
Debug.ShouldStop(16384);
if (dateutils.mostCurrent.__c.runMethod(true,"Not",(Object)(_startwithdays)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 81;BA.debugLine="If DateTime.Add(Start, ey - sy, 0, 0) > EndTime";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean(">",dateutils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Add",(Object)(_start),(Object)(RemoteObject.solve(new RemoteObject[] {_ey,_sy}, "-",1, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))),_endtime)) { 
_td.setField ("Years" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {_ey,_sy,RemoteObject.createImmutable(1)}, "--",2, 1));}
else {
_td.setField ("Years" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {_ey,_sy}, "-",1, 1));};
 BA.debugLineNum = 82;BA.debugLine="Dim ticks As Long = DateTime.Add(Start, td.Year";
Debug.ShouldStop(131072);
_ticks = dateutils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Add",(Object)(_start),(Object)(_td.getField(true,"Years" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("ticks", _ticks);Debug.locals.put("ticks", _ticks);
 BA.debugLineNum = 84;BA.debugLine="For i = 1 To 13";
Debug.ShouldStop(524288);
{
final int step9 = 1;
final int limit9 = 13;
_i = 1 ;
for (;(step9 > 0 && _i <= limit9) || (step9 < 0 && _i >= limit9) ;_i = ((int)(0 + _i + step9))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 85;BA.debugLine="If DateTime.Add(ticks, 0, i, 0) > EndTime Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean(">",dateutils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Add",(Object)(_ticks),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, _i)),(Object)(BA.numberCast(int.class, 0))),_endtime)) { 
 BA.debugLineNum = 86;BA.debugLine="td.Months = i - 1";
Debug.ShouldStop(2097152);
_td.setField ("Months" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1));
 BA.debugLineNum = 87;BA.debugLine="Exit";
Debug.ShouldStop(4194304);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 90;BA.debugLine="ticks = DateTime.Add(ticks, 0, td.Months, 0)";
Debug.ShouldStop(33554432);
_ticks = dateutils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Add",(Object)(_ticks),(Object)(BA.numberCast(int.class, 0)),(Object)(_td.getField(true,"Months" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("ticks", _ticks);
 }else {
 BA.debugLineNum = 92;BA.debugLine="daysOffset = (EndTime - Start) / DateTime.Ticks";
Debug.ShouldStop(134217728);
_daysoffset = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_endtime,_start}, "-",1, 2)),dateutils.mostCurrent.__c.getField(false,"DateTime").getField(true,"TicksPerDay"),RemoteObject.createImmutable(3)}, "/-",1, 0));Debug.locals.put("daysOffset", _daysoffset);
 BA.debugLineNum = 93;BA.debugLine="Dim ticks As Long = Start";
Debug.ShouldStop(268435456);
_ticks = _start;Debug.locals.put("ticks", _ticks);Debug.locals.put("ticks", _ticks);
 };
 BA.debugLineNum = 96;BA.debugLine="For i = daysOffset + 1 To daysOffset + 32";
Debug.ShouldStop(-2147483648);
{
final int step20 = 1;
final int limit20 = RemoteObject.solve(new RemoteObject[] {_daysoffset,RemoteObject.createImmutable(32)}, "+",1, 1).<Integer>get().intValue();
_i = RemoteObject.solve(new RemoteObject[] {_daysoffset,RemoteObject.createImmutable(1)}, "+",1, 1).<Integer>get().intValue() ;
for (;(step20 > 0 && _i <= limit20) || (step20 < 0 && _i >= limit20) ;_i = ((int)(0 + _i + step20))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 97;BA.debugLine="If DateTime.Add(ticks, 0, 0, i) > EndTime Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean(">",dateutils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Add",(Object)(_ticks),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, _i))),_endtime)) { 
 BA.debugLineNum = 98;BA.debugLine="td.Days = i - 1";
Debug.ShouldStop(2);
_td.setField ("Days" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1));
 BA.debugLineNum = 99;BA.debugLine="Exit";
Debug.ShouldStop(4);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 102;BA.debugLine="ticks = DateTime.Add(ticks, 0, 0, td.Days)";
Debug.ShouldStop(32);
_ticks = dateutils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Add",(Object)(_ticks),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_td.getField(true,"Days" /*RemoteObject*/ )));Debug.locals.put("ticks", _ticks);
 BA.debugLineNum = 103;BA.debugLine="Dim diff As Long = EndTime - ticks";
Debug.ShouldStop(64);
_diff = RemoteObject.solve(new RemoteObject[] {_endtime,_ticks}, "-",1, 2);Debug.locals.put("diff", _diff);Debug.locals.put("diff", _diff);
 BA.debugLineNum = 104;BA.debugLine="td.Hours = diff / DateTime.TicksPerHour";
Debug.ShouldStop(128);
_td.setField ("Hours" /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_diff,dateutils.mostCurrent.__c.getField(false,"DateTime").getField(true,"TicksPerHour")}, "/",0, 0)));
 BA.debugLineNum = 105;BA.debugLine="td.Minutes = (diff Mod DateTime.TicksPerHour) /";
Debug.ShouldStop(256);
_td.setField ("Minutes" /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_diff,dateutils.mostCurrent.__c.getField(false,"DateTime").getField(true,"TicksPerHour")}, "%",0, 2)),dateutils.mostCurrent.__c.getField(false,"DateTime").getField(true,"TicksPerMinute")}, "/",0, 0)));
 BA.debugLineNum = 106;BA.debugLine="td.Seconds = (diff Mod DateTime.TicksPerMinute)";
Debug.ShouldStop(512);
_td.setField ("Seconds" /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_diff,dateutils.mostCurrent.__c.getField(false,"DateTime").getField(true,"TicksPerMinute")}, "%",0, 2)),dateutils.mostCurrent.__c.getField(false,"DateTime").getField(true,"TicksPerSecond")}, "/",0, 0)));
 BA.debugLineNum = 107;BA.debugLine="Return td";
Debug.ShouldStop(1024);
if (true) return _td;
 }else {
 BA.debugLineNum = 109;BA.debugLine="If Not(StartWithDays) Then";
Debug.ShouldStop(4096);
if (dateutils.mostCurrent.__c.runMethod(true,"Not",(Object)(_startwithdays)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 111;BA.debugLine="If DateTime.Add(Start, ey - sy, 0, 0) < EndTime";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("<",dateutils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Add",(Object)(_start),(Object)(RemoteObject.solve(new RemoteObject[] {_ey,_sy}, "-",1, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))),_endtime)) { 
_td.setField ("Years" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {_ey,_sy,RemoteObject.createImmutable(1)}, "-+",2, 1));}
else {
_td.setField ("Years" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {_ey,_sy}, "-",1, 1));};
 BA.debugLineNum = 112;BA.debugLine="Dim ticks As Long = DateTime.Add(Start, td.Year";
Debug.ShouldStop(32768);
_ticks = dateutils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Add",(Object)(_start),(Object)(_td.getField(true,"Years" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("ticks", _ticks);Debug.locals.put("ticks", _ticks);
 BA.debugLineNum = 114;BA.debugLine="For i = -1 To -13 Step -1";
Debug.ShouldStop(131072);
{
final int step36 = -1;
final int limit36 = (int) (0 + -(double) (0 + 13));
_i = (int) (0 + -(double) (0 + 1)) ;
for (;(step36 > 0 && _i <= limit36) || (step36 < 0 && _i >= limit36) ;_i = ((int)(0 + _i + step36))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 115;BA.debugLine="If DateTime.Add(ticks, 0, i, 0) < EndTime Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("<",dateutils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Add",(Object)(_ticks),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, _i)),(Object)(BA.numberCast(int.class, 0))),_endtime)) { 
 BA.debugLineNum = 116;BA.debugLine="td.Months = i + 1";
Debug.ShouldStop(524288);
_td.setField ("Months" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 117;BA.debugLine="Exit";
Debug.ShouldStop(1048576);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 120;BA.debugLine="ticks = DateTime.Add(ticks, 0, td.Months, 0)";
Debug.ShouldStop(8388608);
_ticks = dateutils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Add",(Object)(_ticks),(Object)(BA.numberCast(int.class, 0)),(Object)(_td.getField(true,"Months" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("ticks", _ticks);
 }else {
 BA.debugLineNum = 122;BA.debugLine="daysOffset = (EndTime - Start) / DateTime.Ticks";
Debug.ShouldStop(33554432);
_daysoffset = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_endtime,_start}, "-",1, 2)),dateutils.mostCurrent.__c.getField(false,"DateTime").getField(true,"TicksPerDay"),RemoteObject.createImmutable(3)}, "/+",1, 0));Debug.locals.put("daysOffset", _daysoffset);
 BA.debugLineNum = 123;BA.debugLine="Dim ticks As Long = Start";
Debug.ShouldStop(67108864);
_ticks = _start;Debug.locals.put("ticks", _ticks);Debug.locals.put("ticks", _ticks);
 };
 BA.debugLineNum = 126;BA.debugLine="For i = daysOffset - 1 To daysOffset - 32 Step -";
Debug.ShouldStop(536870912);
{
final int step47 = -1;
final int limit47 = RemoteObject.solve(new RemoteObject[] {_daysoffset,RemoteObject.createImmutable(32)}, "-",1, 1).<Integer>get().intValue();
_i = RemoteObject.solve(new RemoteObject[] {_daysoffset,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue() ;
for (;(step47 > 0 && _i <= limit47) || (step47 < 0 && _i >= limit47) ;_i = ((int)(0 + _i + step47))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 127;BA.debugLine="If DateTime.Add(ticks, 0, 0, i) < EndTime Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("<",dateutils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Add",(Object)(_ticks),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, _i))),_endtime)) { 
 BA.debugLineNum = 128;BA.debugLine="td.Days = i + 1";
Debug.ShouldStop(-2147483648);
_td.setField ("Days" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 129;BA.debugLine="Exit";
Debug.ShouldStop(1);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 132;BA.debugLine="ticks = DateTime.Add(ticks, 0, 0, td.Days)";
Debug.ShouldStop(8);
_ticks = dateutils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Add",(Object)(_ticks),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_td.getField(true,"Days" /*RemoteObject*/ )));Debug.locals.put("ticks", _ticks);
 BA.debugLineNum = 133;BA.debugLine="Dim diff As Long = ticks - EndTime";
Debug.ShouldStop(16);
_diff = RemoteObject.solve(new RemoteObject[] {_ticks,_endtime}, "-",1, 2);Debug.locals.put("diff", _diff);Debug.locals.put("diff", _diff);
 BA.debugLineNum = 134;BA.debugLine="td.Hours = -diff / DateTime.TicksPerHour";
Debug.ShouldStop(32);
_td.setField ("Hours" /*RemoteObject*/ ,BA.numberCast(int.class, -(double) (0 + _diff.<Long>get().longValue())/(double)(double) (0 + dateutils.mostCurrent.__c.getField(false,"DateTime").getField(true,"TicksPerHour").<Long>get().longValue())));
 BA.debugLineNum = 135;BA.debugLine="td.Minutes = -(diff Mod DateTime.TicksPerHour) /";
Debug.ShouldStop(64);
_td.setField ("Minutes" /*RemoteObject*/ ,BA.numberCast(int.class, -(double) (0 + (RemoteObject.solve(new RemoteObject[] {_diff,dateutils.mostCurrent.__c.getField(false,"DateTime").getField(true,"TicksPerHour")}, "%",0, 2)).<Long>get().longValue())/(double)(double) (0 + dateutils.mostCurrent.__c.getField(false,"DateTime").getField(true,"TicksPerMinute").<Long>get().longValue())));
 BA.debugLineNum = 136;BA.debugLine="td.Seconds = -(diff Mod DateTime.TicksPerMinute)";
Debug.ShouldStop(128);
_td.setField ("Seconds" /*RemoteObject*/ ,BA.numberCast(int.class, -(double) (0 + (RemoteObject.solve(new RemoteObject[] {_diff,dateutils.mostCurrent.__c.getField(false,"DateTime").getField(true,"TicksPerMinute")}, "%",0, 2)).<Long>get().longValue())/(double)(double) (0 + dateutils.mostCurrent.__c.getField(false,"DateTime").getField(true,"TicksPerSecond").<Long>get().longValue())));
 BA.debugLineNum = 137;BA.debugLine="Return td";
Debug.ShouldStop(256);
if (true) return _td;
 };
 BA.debugLineNum = 139;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _periodbetweenindays(RemoteObject _ba,RemoteObject _start,RemoteObject _endtime) throws Exception{
try {
		Debug.PushSubsStack("PeriodBetweenInDays (dateutils) ","dateutils",14,_ba,dateutils.mostCurrent,69);
if (RapidSub.canDelegate("periodbetweenindays")) { return ir.saelozahra.damaara.mazraeyeman.dateutils.remoteMe.runUserSub(false, "dateutils","periodbetweenindays", _ba, _start, _endtime);}
;
Debug.locals.put("Start", _start);
Debug.locals.put("EndTime", _endtime);
 BA.debugLineNum = 69;BA.debugLine="Public Sub PeriodBetweenInDays (Start As Long, End";
Debug.ShouldStop(16);
 BA.debugLineNum = 70;BA.debugLine="Return PeriodBetweenHelper(Start, EndTime, True)";
Debug.ShouldStop(32);
if (true) return _periodbetweenhelper(_ba,_start,_endtime,dateutils.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 71;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Type Period (Years As Int, Months As Int, _ 		Day";
;
 //BA.debugLineNum = 5;BA.debugLine="Private daysList, monthsList As List";
dateutils._dayslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
dateutils._monthslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 6;BA.debugLine="Private ad, bc As String";
dateutils._ad = RemoteObject.createImmutable("");
dateutils._bc = RemoteObject.createImmutable("");
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _setdate(RemoteObject _ba,RemoteObject _years,RemoteObject _months,RemoteObject _days) throws Exception{
try {
		Debug.PushSubsStack("SetDate (dateutils) ","dateutils",14,_ba,dateutils.mostCurrent,158);
if (RapidSub.canDelegate("setdate")) { return ir.saelozahra.damaara.mazraeyeman.dateutils.remoteMe.runUserSub(false, "dateutils","setdate", _ba, _years, _months, _days);}
;
Debug.locals.put("Years", _years);
Debug.locals.put("Months", _months);
Debug.locals.put("Days", _days);
 BA.debugLineNum = 158;BA.debugLine="Public Sub SetDate(Years As Int, Months As Int, Da";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 159;BA.debugLine="Return SetDateAndTime(Years, Months, Days, 0, 0,";
Debug.ShouldStop(1073741824);
if (true) return _setdateandtime(_ba,_years,_months,_days,BA.numberCast(int.class, 0),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0));
 BA.debugLineNum = 160;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdateandtime(RemoteObject _ba,RemoteObject _years,RemoteObject _months,RemoteObject _days,RemoteObject _hours,RemoteObject _minutes,RemoteObject _seconds) throws Exception{
try {
		Debug.PushSubsStack("SetDateAndTime (dateutils) ","dateutils",14,_ba,dateutils.mostCurrent,162);
if (RapidSub.canDelegate("setdateandtime")) { return ir.saelozahra.damaara.mazraeyeman.dateutils.remoteMe.runUserSub(false, "dateutils","setdateandtime", _ba, _years, _months, _days, _hours, _minutes, _seconds);}
RemoteObject _df = RemoteObject.createImmutable("");
RemoteObject _tf = RemoteObject.createImmutable("");
RemoteObject _d = RemoteObject.createImmutable("");
RemoteObject _t = RemoteObject.createImmutable("");
RemoteObject _ticks = RemoteObject.createImmutable(0L);
;
Debug.locals.put("Years", _years);
Debug.locals.put("Months", _months);
Debug.locals.put("Days", _days);
Debug.locals.put("Hours", _hours);
Debug.locals.put("Minutes", _minutes);
Debug.locals.put("Seconds", _seconds);
 BA.debugLineNum = 162;BA.debugLine="Public Sub SetDateAndTime(Years As Int, Months As";
Debug.ShouldStop(2);
 BA.debugLineNum = 163;BA.debugLine="Dim df = DateTime.DateFormat, tf = DateTime.TimeF";
Debug.ShouldStop(4);
_df = dateutils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("df", _df);Debug.locals.put("df", _df);
_tf = dateutils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getTimeFormat");Debug.locals.put("tf", _tf);Debug.locals.put("tf", _tf);
 BA.debugLineNum = 164;BA.debugLine="DateTime.DateFormat = \"GGyyyyMMdd\"";
Debug.ShouldStop(8);
dateutils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("GGyyyyMMdd"));
 BA.debugLineNum = 165;BA.debugLine="DateTime.TimeFormat = \"HHmmss\"";
Debug.ShouldStop(16);
dateutils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setTimeFormat",BA.ObjectToString("HHmmss"));
 BA.debugLineNum = 166;BA.debugLine="Dim d As String = Format(Abs(Years), 4) & Format(";
Debug.ShouldStop(32);
_d = RemoteObject.concat(_format(_ba,BA.numberCast(int.class, dateutils.mostCurrent.__c.runMethod(true,"Abs",(Object)(BA.numberCast(double.class, _years)))),BA.numberCast(int.class, 4)),_format(_ba,_months,BA.numberCast(int.class, 2)),_format(_ba,_days,BA.numberCast(int.class, 2)));Debug.locals.put("d", _d);Debug.locals.put("d", _d);
 BA.debugLineNum = 167;BA.debugLine="d = GetEra(Years < 0) & d";
Debug.ShouldStop(64);
_d = RemoteObject.concat(_getera(_ba,BA.ObjectToBoolean(RemoteObject.solveBoolean("<",_years,BA.numberCast(double.class, 0)))),_d);Debug.locals.put("d", _d);
 BA.debugLineNum = 168;BA.debugLine="Dim t As String = Format(Hours, 2) & Format(Minut";
Debug.ShouldStop(128);
_t = RemoteObject.concat(_format(_ba,_hours,BA.numberCast(int.class, 2)),_format(_ba,_minutes,BA.numberCast(int.class, 2)),_format(_ba,_seconds,BA.numberCast(int.class, 2)));Debug.locals.put("t", _t);Debug.locals.put("t", _t);
 BA.debugLineNum = 169;BA.debugLine="Try";
Debug.ShouldStop(256);
try { BA.debugLineNum = 170;BA.debugLine="Dim ticks As Long = DateTime.DateTimeParse(d, t)";
Debug.ShouldStop(512);
_ticks = dateutils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"DateTimeParse",(Object)(_d),(Object)(_t));Debug.locals.put("ticks", _ticks);Debug.locals.put("ticks", _ticks);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e10) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e10.toString()); BA.debugLineNum = 172;BA.debugLine="DateTime.DateFormat = df";
Debug.ShouldStop(2048);
dateutils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_df);
 BA.debugLineNum = 173;BA.debugLine="DateTime.TimeFormat = tf";
Debug.ShouldStop(4096);
dateutils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setTimeFormat",_tf);
 BA.debugLineNum = 174;BA.debugLine="Log(\"Error: Invalid value: \" & d & \" \" & t)";
Debug.ShouldStop(8192);
dateutils.mostCurrent.__c.runVoidMethod ("LogImpl","416842764",RemoteObject.concat(RemoteObject.createImmutable("Error: Invalid value: "),_d,RemoteObject.createImmutable(" "),_t),0);
 BA.debugLineNum = 175;BA.debugLine="Return \"invalid date\" + 1 'hack to throw an erro";
Debug.ShouldStop(16384);
if (true) return BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, "invalid date"),RemoteObject.createImmutable(1)}, "+",1, 0));
 };
 BA.debugLineNum = 177;BA.debugLine="DateTime.DateFormat = df";
Debug.ShouldStop(65536);
dateutils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_df);
 BA.debugLineNum = 178;BA.debugLine="DateTime.TimeFormat = tf";
Debug.ShouldStop(131072);
dateutils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setTimeFormat",_tf);
 BA.debugLineNum = 179;BA.debugLine="Return ticks";
Debug.ShouldStop(262144);
if (true) return _ticks;
 BA.debugLineNum = 180;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdateandtime2(RemoteObject _ba,RemoteObject _years,RemoteObject _months,RemoteObject _days,RemoteObject _hours,RemoteObject _minutes,RemoteObject _seconds,RemoteObject _timezone) throws Exception{
try {
		Debug.PushSubsStack("SetDateAndTime2 (dateutils) ","dateutils",14,_ba,dateutils.mostCurrent,184);
if (RapidSub.canDelegate("setdateandtime2")) { return ir.saelozahra.damaara.mazraeyeman.dateutils.remoteMe.runUserSub(false, "dateutils","setdateandtime2", _ba, _years, _months, _days, _hours, _minutes, _seconds, _timezone);}
RemoteObject _df = RemoteObject.createImmutable("");
RemoteObject _d = RemoteObject.createImmutable("");
RemoteObject _tzminutes = RemoteObject.createImmutable(0);
RemoteObject _tzhours = RemoteObject.createImmutable(0);
RemoteObject _tzsign = RemoteObject.createImmutable("");
RemoteObject _ticks = RemoteObject.createImmutable(0L);
;
Debug.locals.put("Years", _years);
Debug.locals.put("Months", _months);
Debug.locals.put("Days", _days);
Debug.locals.put("Hours", _hours);
Debug.locals.put("Minutes", _minutes);
Debug.locals.put("Seconds", _seconds);
Debug.locals.put("TimeZone", _timezone);
 BA.debugLineNum = 184;BA.debugLine="Public Sub SetDateAndTime2(Years As Int, Months As";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 186;BA.debugLine="Dim df As String = DateTime.DateFormat";
Debug.ShouldStop(33554432);
_df = dateutils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("df", _df);Debug.locals.put("df", _df);
 BA.debugLineNum = 187;BA.debugLine="DateTime.DateFormat = \"GGyyyyMMddHHmmssz\"";
Debug.ShouldStop(67108864);
dateutils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("GGyyyyMMddHHmmssz"));
 BA.debugLineNum = 188;BA.debugLine="Dim d As String = Format(Abs(Years), 4) & Format(";
Debug.ShouldStop(134217728);
_d = RemoteObject.concat(_format(_ba,BA.numberCast(int.class, dateutils.mostCurrent.__c.runMethod(true,"Abs",(Object)(BA.numberCast(double.class, _years)))),BA.numberCast(int.class, 4)),_format(_ba,_months,BA.numberCast(int.class, 2)),_format(_ba,_days,BA.numberCast(int.class, 2)));Debug.locals.put("d", _d);Debug.locals.put("d", _d);
 BA.debugLineNum = 189;BA.debugLine="d = GetEra(Years < 0) & d";
Debug.ShouldStop(268435456);
_d = RemoteObject.concat(_getera(_ba,BA.ObjectToBoolean(RemoteObject.solveBoolean("<",_years,BA.numberCast(double.class, 0)))),_d);Debug.locals.put("d", _d);
 BA.debugLineNum = 190;BA.debugLine="Dim tzMinutes As Int = Abs(TimeZone * 60)";
Debug.ShouldStop(536870912);
_tzminutes = BA.numberCast(int.class, dateutils.mostCurrent.__c.runMethod(true,"Abs",(Object)(RemoteObject.solve(new RemoteObject[] {_timezone,RemoteObject.createImmutable(60)}, "*",0, 0))));Debug.locals.put("tzMinutes", _tzminutes);Debug.locals.put("tzMinutes", _tzminutes);
 BA.debugLineNum = 191;BA.debugLine="Dim tzHours As Int = tzMinutes / 60";
Debug.ShouldStop(1073741824);
_tzhours = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_tzminutes,RemoteObject.createImmutable(60)}, "/",0, 0));Debug.locals.put("tzHours", _tzhours);Debug.locals.put("tzHours", _tzhours);
 BA.debugLineNum = 192;BA.debugLine="Dim tzSign As String";
Debug.ShouldStop(-2147483648);
_tzsign = RemoteObject.createImmutable("");Debug.locals.put("tzSign", _tzsign);
 BA.debugLineNum = 193;BA.debugLine="If TimeZone >= 0 Then tzSign = \"+\" Else tzSign =";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("g",_timezone,BA.numberCast(double.class, 0))) { 
_tzsign = BA.ObjectToString("+");Debug.locals.put("tzSign", _tzsign);}
else {
_tzsign = BA.ObjectToString("-");Debug.locals.put("tzSign", _tzsign);};
 BA.debugLineNum = 194;BA.debugLine="d = d & Format(Hours, 2) & Format(Minutes, 2) & F";
Debug.ShouldStop(2);
_d = RemoteObject.concat(_d,_format(_ba,_hours,BA.numberCast(int.class, 2)),_format(_ba,_minutes,BA.numberCast(int.class, 2)),_format(_ba,_seconds,BA.numberCast(int.class, 2)),RemoteObject.createImmutable("GMT"),_tzsign,_format(_ba,_tzhours,BA.numberCast(int.class, 2)),RemoteObject.createImmutable(":"),_format(_ba,RemoteObject.solve(new RemoteObject[] {_tzminutes,RemoteObject.createImmutable(60)}, "%",0, 1),BA.numberCast(int.class, 2)));Debug.locals.put("d", _d);
 BA.debugLineNum = 196;BA.debugLine="Try";
Debug.ShouldStop(8);
try { BA.debugLineNum = 197;BA.debugLine="Dim ticks As Long = DateTime.DateParse(d)";
Debug.ShouldStop(16);
_ticks = dateutils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(_d));Debug.locals.put("ticks", _ticks);Debug.locals.put("ticks", _ticks);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e13) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e13.toString()); BA.debugLineNum = 199;BA.debugLine="DateTime.DateFormat = df";
Debug.ShouldStop(64);
dateutils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_df);
 BA.debugLineNum = 200;BA.debugLine="Log(\"Error: Invalid value: \" & d)";
Debug.ShouldStop(128);
dateutils.mostCurrent.__c.runVoidMethod ("LogImpl","416908304",RemoteObject.concat(RemoteObject.createImmutable("Error: Invalid value: "),_d),0);
 BA.debugLineNum = 201;BA.debugLine="Return \"invalid date\" + 1 'hack to throw an erro";
Debug.ShouldStop(256);
if (true) return BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, "invalid date"),RemoteObject.createImmutable(1)}, "+",1, 0));
 };
 BA.debugLineNum = 203;BA.debugLine="DateTime.DateFormat = df";
Debug.ShouldStop(1024);
dateutils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_df);
 BA.debugLineNum = 204;BA.debugLine="Return ticks";
Debug.ShouldStop(2048);
if (true) return _ticks;
 BA.debugLineNum = 205;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tickstostring(RemoteObject _ba,RemoteObject _ticks) throws Exception{
try {
		Debug.PushSubsStack("TicksToString (dateutils) ","dateutils",14,_ba,dateutils.mostCurrent,227);
if (RapidSub.canDelegate("tickstostring")) { return ir.saelozahra.damaara.mazraeyeman.dateutils.remoteMe.runUserSub(false, "dateutils","tickstostring", _ba, _ticks);}
;
Debug.locals.put("Ticks", _ticks);
 BA.debugLineNum = 227;BA.debugLine="Public Sub TicksToString(Ticks As Long) As String";
Debug.ShouldStop(4);
 BA.debugLineNum = 228;BA.debugLine="Return DateTime.Date(Ticks) & \" \" & DateTime.Time";
Debug.ShouldStop(8);
if (true) return RemoteObject.concat(dateutils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_ticks)),RemoteObject.createImmutable(" "),dateutils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(_ticks)));
 BA.debugLineNum = 229;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tickstounixtime(RemoteObject _ba,RemoteObject _ticks) throws Exception{
try {
		Debug.PushSubsStack("TicksToUnixTime (dateutils) ","dateutils",14,_ba,dateutils.mostCurrent,238);
if (RapidSub.canDelegate("tickstounixtime")) { return ir.saelozahra.damaara.mazraeyeman.dateutils.remoteMe.runUserSub(false, "dateutils","tickstounixtime", _ba, _ticks);}
;
Debug.locals.put("Ticks", _ticks);
 BA.debugLineNum = 238;BA.debugLine="Public Sub TicksToUnixTime(Ticks As Long) As Long";
Debug.ShouldStop(8192);
 BA.debugLineNum = 239;BA.debugLine="Return Ticks / DateTime.TicksPerSecond";
Debug.ShouldStop(16384);
if (true) return BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {_ticks,dateutils.mostCurrent.__c.getField(false,"DateTime").getField(true,"TicksPerSecond")}, "/",0, 0));
 BA.debugLineNum = 240;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _unixtimetoticks(RemoteObject _ba,RemoteObject _unixtime) throws Exception{
try {
		Debug.PushSubsStack("UnixTimeToTicks (dateutils) ","dateutils",14,_ba,dateutils.mostCurrent,243);
if (RapidSub.canDelegate("unixtimetoticks")) { return ir.saelozahra.damaara.mazraeyeman.dateutils.remoteMe.runUserSub(false, "dateutils","unixtimetoticks", _ba, _unixtime);}
;
Debug.locals.put("UnixTime", _unixtime);
 BA.debugLineNum = 243;BA.debugLine="Public Sub UnixTimeToTicks(UnixTime As Long) As Lo";
Debug.ShouldStop(262144);
 BA.debugLineNum = 244;BA.debugLine="Return UnixTime * DateTime.TicksPerSecond";
Debug.ShouldStop(524288);
if (true) return RemoteObject.solve(new RemoteObject[] {_unixtime,dateutils.mostCurrent.__c.getField(false,"DateTime").getField(true,"TicksPerSecond")}, "*",0, 2);
 BA.debugLineNum = 245;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}