<?php
error_reporting(0);
session_start();
ob_start();

define("includesfile","true");
require("../includes/public_functions.php");


// $save_check = $_GET['save'];
// if($save_check=="true"){
	
	$farmers_user = safe_enter($_POST['user']);
    $unique_id = safe_enter($_POST['unique_id']);
	$latlng = safe_enter($_POST['latlng']);
	$time = safe_enter($_POST['time']);
	$humidity = safe_enter($_POST['humidity']);
	$cloudcover = safe_enter($_POST['cloudcover']);
	$uvindex = safe_enter($_POST['uvindex']);
	$dewpoint = safe_enter($_POST['dewpoint']);
	$ice = safe_enter($_POST['ice']);
	$snow = safe_enter($_POST['snow']);
	$rain = safe_enter($_POST['rain']);
	$wind = safe_enter($_POST['wind']);
	$temp = safe_enter($_POST['temp']);
	$ehtemal_precip = safe_enter($_POST['ehtemal_precip']);
	$ehtemal_rain = safe_enter($_POST['ehtemal_rain']);
	$ehtemal_ice = safe_enter($_POST['ehtemal_ice']);
	$ehtemal_snow = safe_enter($_POST['ehtemal_snow']);
	$ehtemal_gusts = safe_enter($_POST['ehtemal_gusts']);
	$date_insert = time();
	$ip_insert = getip();
	////////////////////////////////////////
	$error_check = "";
	
	if(empty($farmers_user) or empty($latlng) or empty($time) or empty($date_insert) or empty($ip_insert)){
		echo "insert all fields";
		$error_check = "true";
		exit;
	}//EndIF	
	if(!empty($farmers_user) and !is_numeric($farmers_user)){
		echo json_encode("wrong username");
		$error_check = "true";
		exit;	
	}//EndIf	

	
	if(empty($error_check)){
		$result = db_query("SELECT `username` FROM `db_farmers` WHERE `username`='$farmers_user' LIMIT 1" , "select");
		if(mysqli_num_rows($result)==1){

			if(db_query("INSERT INTO `db_weathers_log` (`id`,`unique_id`, `farmers_user`, `latlng`, `time`, `humidity`, `cloudcover`, `uvindex`, `dewpoint`, `ice`, `snow`, `rain`, `wind`, `temp`, `ehtemal_precip`, `ehtemal_rain`, `ehtemal_ice`, `ehtemal_snow`, `ehtemal_gusts`, `date_insert`, `ip_insert`) VALUES (NULL,'$unique_id', '$farmers_user', '$latlng', '$time', '$humidity', '$cloudcover', '$uvindex', '$dewpoint', '$ice', '$snow', '$rain', '$wind', '$temp', '$ehtemal_precip', '$ehtemal_rain', '$ehtemal_ice', '$ehtemal_snow', '$ehtemal_gusts', '$date_insert', '$ip_insert');","insert")){
				echo json_encode("success");
				exit;
			}//EndIF
		
		}else{
			echo "user not found";
			$error_check = "true";
			exit;		
		}
	}//EndIF
	exit;
	echo "tr";
//}//EndIf


?>