<?php
defined('includesfile') or die(header('Location: '.' warning.php?err=FileAccess'));
error_reporting(0);
session_start();
ob_start();

require("public_functions.php");

function adminlogin($id,$type)
{
	global $login_date;
	global $login_ip;
	global $memberlevel;
	global $admin_name;
	global $admin_pic;
	
	if($type=="loginok"){		
		$code = hash_func( rand(10,1000) . rand(10,1000) . rand(10,1000) );
		$_SESSION['adminlogin_session'] = $code;
		db_query("UPDATE `db_member` SET `login_session`='$code' , `login_date`='".time()."' , `last_visit`='".time()."' , `login_ip`='".getip()."'  WHERE `id`='$id' ","update");	
	}//endif
	if($type=="loginckeck"){
		
		$result = db_query("SELECT `siteurl` FROM `db_setting` WHERE `id`='1' ","select");
		while($row = mysqli_fetch_assoc($result)) {
			$siteurl = $row['siteurl'];
		}//EndWhile			
		if(clean_url($_SERVER['HTTP_HOST'])=="localhost"){			
			$str_len = strlen($_SERVER['REQUEST_URI']);
			$str_url = substr($_SERVER['REQUEST_URI'], 1, $str_len);
			$str_url = substr($_SERVER['REQUEST_URI'], 1, strpos($str_url,"/"));
			$str_url = "http://".clean_url($_SERVER['HTTP_HOST'])."/".$str_url."/";
			if($str_url !== $siteurl){				
				unset_admin_session();
				header("Location: login.php");
				exit;
			}//EndIf
		}else{
			if(clean_url($_SERVER['HTTP_HOST']) !== clean_url($siteurl)){				
				unset_admin_session();
				header("Location: login.php");
				exit;
			}//EndIf
		}//EndIf
		
		if(isset($_SERVER['HTTP_REFERER'])){
			if(clean_url($_SERVER['HTTP_REFERER']) !== clean_url($siteurl)){				
				unset_admin_session();
				header("Location: login.php");
				exit;
			}//EndIf
		}//EndIf
					
		if(!isset($_SESSION['adminlogin_id']) or !isset($_SESSION['adminlogin_session'])){	
			unset_admin_session();
			header("Location: login.php");
			exit;
		}else{
			$adminlogin_id = intval($_SESSION['adminlogin_id']);
			$result = db_query("SELECT * FROM `db_member` WHERE `id`='$adminlogin_id'  LIMIT 1","select");
			while($row = mysqli_fetch_assoc($result)) {
				$login_session = $row['login_session'];
				$login_date    = $row['login_date'];
				$last_visit    = $row['last_visit'];
				$login_ip      = $row['login_ip'];
				$memberlevel   = $row['memberlevel'];
				$admin_name    = $row['name'];
				$admin_pic     = $row['pic'];
			}//EndWhile	
				
			if($login_session==$_SESSION['adminlogin_session'] and $login_ip==getip()){
				$last_visit = $last_visit + (31*60);
				if($last_visit <= time()){
					unset_admin_session();
					header("Location: login.php");
					exit;						
				}else{					
					db_query("UPDATE `db_member` SET `last_visit`='".time()."' , `last_page`='".getfilename($_SERVER['REQUEST_URI'])."'  WHERE `id`='$adminlogin_id' ","update");
				}//Endif
			}else{
				unset_admin_session();
				header("Location: login.php");	
				exit;		
			}//EndIF			
		}//EndIf
	}//endif		
}//adminlogin


function unset_admin_session()
{
	unset($_SESSION['adminlogin_id']);
	unset($_SESSION['adminlogin_session']);
}//unset_admin_session


function adminlogin_log($user,$type)
{
	unset($_SESSION['captchacode']);
	
	if($type=='loginok'){		
		db_query("INSERT INTO `db_member_login` (`user`, `ip`, `date` , `des` , `info`) VALUES ('$user', '".getip()."', '".time()."', '$type', '".getinfo()."'); ","insert");	
	}//EndIf
	
	if($type=='loginerror'){						
		if(empty($_SESSION['adminlogin_error'])){
			$_SESSION['adminlogin_error']=1;
		}else{
			if($_SESSION['adminlogin_error']>=8){
				db_query("INSERT INTO `db_blacklist` (`ip`, `date`) VALUES ('".getip()."', '".time()."'); ","insert");
				unset($_SESSION['adminlogin_error']);
			}//EndIF
			$_SESSION['adminlogin_error'] ++;;
		}//EndIf
		db_query("INSERT INTO `db_member_login` (`user`, `ip`, `date` , `des` , `info`) VALUES ('$user', '".getip()."', '".time()."', '$type ".intval($_SESSION['adminlogin_error'])."', '".getinfo()."'); ","insert");		
	}//loginerror
}//adminlogin_log


function adminlog($action){
	if(!empty($action)){
		$user_id = intval($_SESSION['adminlogin_id']);
		$action = safe_enter($action);
		
		db_query("INSERT INTO `db_member_log` (`user_id`, `ip`, `date` , `action` , `info`) VALUES ('$user_id', '".getip()."', '".time()."', '$action', '".getinfo()."'); ","insert");
	}//EndIF
}//Endadminlog


function topadmininfo()
{
	global $login_date;
	global $login_ip;
	global $admin_name;
	global $admin_pic;	
	
	echo "
		<img src='".$admin_pic."' class='tmd_adminpic fr r5 sl2' draggable='false' />
		<div class='tmd_adminname fr'><p></p><b>".$admin_name."</b> عزیز خوش آمدید . </div>
		<div class='tmd_adminlastlogin fr'><p></p><b>آخرین ورود شما : </b>".date_analysis('6',$login_date)." ( <b>".$login_ip."</b> )</div><br />
		<a href='changeinfo.php' title='تغییر اطلاعات' id='changeinfo'><div class='tmd_changeinfo fr'><p></p><b>تغییر اطلاعات</b></div></a>
		<a href='login.php?logout=true' title='خروج از مدیریت'><div class='tmd_exit fr'><p></p><b>خروج از مدیریت</b></div></a> 
	";
}//lastlogin


function adminmenus($type,$level)
{
	global $memberlevel;
	
	if($type=="checkaccess" and !empty($level)){
		if(strstr($memberlevel,$level) or $memberlevel=="admin"){
			return("1");
		}//EndIF		
	}//EndIF || $type=="checkaccess"
}//adminmenus


function adminNotepad($type,$input)
{
	$adminlogin_id = intval($_SESSION['adminlogin_id']);
	
	if($type=="show"){	
		$result = db_query("SELECT `notepad` FROM `db_member` WHERE `id`='$adminlogin_id' ","select");
		while($row = mysqli_fetch_assoc($result)) {
			$adminnotepad = $row['notepad'];
		}//EndWhile		
		
		return $adminnotepad;
	}//End IF
	
	if($type=="save"){
		if(db_query("UPDATE `db_member` SET `notepad`='".$input."' WHERE `id`='$adminlogin_id' ","update")){
			echo '<b style="color:green">:: یادداشت ثبت شد...</b><script>endshowresult();</script>';	
		}else{
			echo '<b style="color:red">:: خطا در ثبت یادداشت...</b><script>endshowresult();</script>';
		}//End IF
	}//End IF
}//adminNotepad


function cmsinformations()
{
	$result = db_query("SELECT `cmsversion`,`cmstype`,`sitestartdate`,`sitespace`,`sitesystem`,`cmsmethod` FROM `db_setting` WHERE `id`='1' ","select");
	while($row = mysqli_fetch_assoc($result)) {
		$cmsversion		 = $row['cmsversion'];
		$cmstype 		 = $row['cmstype'];
		$sitestartdate   = $row['sitestartdate'];
		$sitespace  	 = $row['sitespace'];
		$sitesystem 	 = $row['sitesystem'];
		$cmsmethod		 = $row['cmsmethod'];		
	}//EndWhile	
	
	echo "
		<div class='informations_item fr'><div></div><p>نسخه مدیریت محتوا : <b>".$cmsversion."</b> - (بررسی آپدیت)</p></div>
		<div class='informations_item fr'><div></div><p>نوع کاربری : <b>".$cmstype."</b></p></div>
		<div class='informations_item fr'><div></div><p>تاریخ شروع : <b>".$sitestartdate."</b></p></div>

	   <form id='form_ajax' method='post' action='index.php'>
			<div class='informations_item fr'><div></div><p>فضا اختصاص داده شده : <b>".$sitespace."</b> - حجم فایلهای اپلود شده:             
				<input type='submit' name='submit_frm' value='( بررسی )' class='spacecheck' id='spacecheck'  onclick='form_ajax(2)' />
			</p></div><div class='showspace fr'><div id='form_ajax_result2'></div></div>
			<input type='text' name='complete_frm' class='complete_frm' />
			<input type='hidden' name='time_frm' value='<?php echo time(); ?>' />
			<input type='hidden' name='submit' value='asys' />  
			<input type='hidden' name='spacecheck' value='true' />                  
		</form>	
		
		<div class='informations_item fr'><div></div><p>سیستم عامل : <b>".$sitesystem."</b></p></div>
		<div class='informations_item fr'><div></div><p>متد ها و زبان های برنامه نویسی : <b>".$cmsmethod."</b></p></div>			
	";
}//cmsinformatios


function adminindexcount()
{
	$result = db_query("SELECT COUNT(id) FROM `db_farmers`" , "select");
	$farmers_count = mysqli_fetch_array($result);
	$farmers_count = $farmers_count["COUNT(id)"];
	
	$result = db_query("SELECT COUNT(id) FROM `db_member` WHERE `memberlevel`='reseller'" , "select");
	$reseller_count = mysqli_fetch_array($result);
	$reseller_count = $reseller_count["COUNT(id)"];
	
	$result = db_query("SELECT COUNT(id) FROM `db_farmers` WHERE `stream`='1'" , "select");
	$farmers_active_count = mysqli_fetch_array($result);
	$farmers_active_count = $farmers_active_count["COUNT(id)"];
	$farmers_deactive_count = $farmers_count-$farmers_active_count;
	
	$result = db_query("SELECT COUNT(id) FROM `db_weathers_log`" , "select");
	$weatherslog_count = mysqli_fetch_array($result);
	$weatherslog_count = $weatherslog_count["COUNT(id)"];
		
	echo "
		<div class='count_showitem fr'><div></div><p>کل کشاورزان : <b><span class='counter'>$farmers_count</span>  کشاورز</b></p></div>
		<div class='count_showitem fr'><div></div><p>کشاورزان فعال : <b><span class='counter'>$farmers_active_count </span> کشاورز</b></p></div>
		<div class='count_showitem fr'><div></div><p>کشاورزان غیرفعال : <b><span class='counter'>$farmers_deactive_count</span>  کشاورز</b></p></div>
		<div class='count_showitem fr'><div></div><p>آب و هواهای ثبت شده : <b><span class='counter'>$weatherslog_count</span>  وضعیت</b></p></div>
		<div class='count_showitem fr'><p></p></div>
		<div class='count_showitem fr'><div></div><p>تعداد نمایندگان: <b><span class='counter'>$reseller_count</span> </span> نماینده</b></p></div>
		<div class='count_showitem fr'><div></div><p>تعداد کارشناسان : <b><span class='counter'>$info_c_total</span>  کارشناس</b></p></div>
		<div class='count_showitem fr'><div></div><p>تعداد تیکت ها : <b><span class='counter'>$info_c_total_visitor</span> تیکت</b></p></div>
	";	
}//adminindexcount


function countpage_infoshow()
{
	$date_now = date_analysis("1","");
	$result = db_query("SELECT `visitcount`,`ipcount` FROM `db_counter` WHERE `date`='$date_now' LIMIT 1" , "select");
	if (mysqli_num_rows($result) == 1) {					
		while($row = mysqli_fetch_assoc($result)) {					
			$today_count   = number_format($row['visitcount']);
			$todat_visitor = number_format($row['ipcount']);
		}//EndWhile
	}else{
		$today_count   = 0;
		$todat_visitor = 0;		
	}//EndIf
	
	$yesterday = date_analysis("1",time()-86400);
	$result = db_query("SELECT `visitcount`,`ipcount` FROM `db_counter` WHERE `date`='$yesterday' LIMIT 1" , "select");
	if (mysqli_num_rows($result) == 1) {					
		while($row = mysqli_fetch_assoc($result)) {					
			$yesterday_count   = number_format($row['visitcount']);
			$yesterday_visitor = number_format($row['ipcount']);
		}//EndWhile
	}else{
		$yesterday_count   = 0;
		$yesterday_visitor = 0;
	}//EndIf

	$time1 = time();
	$time2 = time()-240;
	$result = db_query("SELECT `id` FROM `db_counter_visitor` WHERE `date`='$date_now' AND `time` between '$time2' and '$time1'" , "select");
	$online_count = mysqli_num_rows($result);
	
	$result = db_query("SELECT `information_count` FROM `db_counter_info` WHERE `id`='1' LIMIT 1" , "select");
	if (mysqli_num_rows($result) == 1) {					
		while($row = mysqli_fetch_assoc($result)) {					
			$information_count = htmlspecialchars_decode($row['information_count']);		
		}//EndWhile
	}else{
		$information_count = '{"total":0,"total_visitor":0}';	
	}//EndIf	
	$information_count = json_decode($information_count);
	$info_c_month 				= number_format($information_count->{"month"});
	$info_c_month_visitor	    = number_format($information_count->{"month_visitor"});
	$info_c_lastmonth 			= number_format($information_count->{"lastmonth"});
	$info_c_lastmonth_visitor   = number_format($information_count->{"lastmonth_visitor"});
	$info_c_year 				= number_format($information_count->{"year"});
	$info_c_year_visitor 		= number_format($information_count->{"year_visitor"});
	$info_c_lastyear 			= number_format($information_count->{"lastyear"});
	$info_c_lastyear_visitor    = number_format($information_count->{"lastyear_visitor"});	
	$info_c_bdaycount 			= $information_count->{"bdaycount"};			
	$info_c_total 				= number_format($information_count->{"total"});
	$info_c_total_visitor 		= number_format($information_count->{"total_visitor"});
	
	if(empty($info_c_bdaycount)){
		$info_c_bdaycount="0";
	}//EndIf

	if($online_count==0){
		$online_count = "0 کاربر";	
	}else{	
		$online_count = "<a href='visitorsonline.php' title='کاربران آنلاین' style='color:#a80349'>".$online_count." کاربر </a>";
	}//EndIF
	
	echo "
		<div class='lastcounter_box fr'>
			<div class='count_showitem fr'><div></div><p>بازدید امروز : <b>$today_count بازدید</b></p></div>
			<div class='count_showitem fr'><div></div><p>بازدیدکننده امروز : <b>$todat_visitor کاربر</b></p></div>
			<div class='count_showitem2 fr'><div></div><p>بازدید دیروز : <b>$yesterday_count بازدید</b></p></div>
			<div class='count_showitem2 fr'><div></div><p>بازدیدکننده دیروز : <b>$yesterday_visitor کاربر</b></p></div>		
			<div class='count_showitem fr'><div></div><p>بازدید ماه : <b>$info_c_month بازدید</b></p></div>
			<div class='count_showitem fr'><div></div><p>بازدیدکننده ماه : <b>$info_c_month_visitor کاربر</b></p></div>
			<div class='count_showitem2 fr'><div></div><p>بازدید ماه گذشته : <b>$info_c_lastmonth بازدید</b></p></div>
			<div class='count_showitem2 fr'><div></div><p>بازدیدکننده ماه گذشته : <b>$info_c_lastmonth_visitor کاربر</b></p></div>
		</div><!--lastcounter_box-->
		
		<div class='lastcounter_box fr'>
			<div class='count_showitem fr'><div></div><p>بازدید سال : <b>$info_c_year  بازدید</b></p></div>
			<div class='count_showitem fr'><div></div><p>بازدیدکننده سال : <b>$info_c_year_visitor کاربر</b></p></div> 		
			<div class='count_showitem2 fr'><div></div><p>بازدید سال گذشته : <b>$info_c_lastyear  بازدید</b></p></div>
			<div class='count_showitem2 fr'><div></div><p>بازدیدکننده سال گذشته : <b>$info_c_lastyear_visitor کاربر</b></p></div>
			<div class='count_showitem fr'><div></div><p>پر بازدیدترین روز : <b>$info_c_bdaycount بازدید</b></p></div>                      
			<div class='count_showitem fr'><div></div><p>کاربران آنلاین : <b>$online_count</b></p></div>
			<div class='count_showitem2 fr'><div></div><p>بازدید کل : <b>$info_c_total بازدید</b></p></div>
			<div class='count_showitem2 fr'><div></div><p>بازدیدکننده کل : <b>$info_c_total_visitor کاربر</b></p></div>	
		</div> <!--lastcounter_box--> 
	";	
}//countpage_infoshow


function farmers_import_excel($filename){
	require_once('PHPExcel.php');
	$filename = "../panel/upload_files/" . $filename;
	$type = PHPExcel_IOFactory::identify($filename);
	$objReader = PHPExcel_IOFactory::createReader($type);
	$objPHPExcel = $objReader->load($filename);

	foreach($objPHPExcel->getWorksheetIterator() as $worksheet) {
		$worksheets['ReadFile'] = $worksheet->toArray();
	}//foreach
	
	$num = 0;
	foreach($worksheets['ReadFile'] as $row){
		$name = safe_enter($row[0]);
		$fathername =  safe_enter($row[1]);
		$sh_bime =  safe_enter($row[2]);
		$unit = "hectare";
		$area =  safe_enter($row[3]);
		$nationalcode  =  safe_enter($row[4]);
		$mobile =  safe_enter($row[5]);
		$address =  safe_enter($row[6]);
		$username = safe_enter($mobile);
		$password = hash_func($mobile);
		$rescode = intval($_SESSION['adminlogin_id']);
		
		if(!empty($name) and !empty($mobile) and is_numeric($mobile)){
			if(db_query("INSERT INTO `db_farmers` (`id`, `username`, `password`, `name`, `fathername`, `nationalcode`, `sh_bime`, `mobile`, `tell`, `email`, `state`, `city`, `address`, `unit`, `area`, `location`, `reg_date`, `last_visit`, `resellercode`, `status`) VALUES (NULL, '$username', '$password', '$name', '$fathername', '$nationalcode', '$sh_bime', '$mobile', '', '', '', '', '$address', '$unit', '$area', '', 'time()', '', '$rescode', 'active');","insert")){
				$num++;
			}//ENdIF
			
		}//EndIF
	}//foreach
	
	if($num>1){
		return $num . " رکورد با موفقیت به جدول کشاورزان اضافه شد.";	
	}else{
		return $num . "خطایی در ثبت اطلاعات رخ داد.";
	}//EndIF


}//farmers_import_excel



?>