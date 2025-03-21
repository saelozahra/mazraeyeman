<?php
error_reporting(0);
session_start();
ob_start();

define("includesfile","true");
require("../includes/public_functions.php");



$save_check = $_GET['save'];
if($save_check=="true"){
	
	$username = safe_enter($_POST['user']);
	$date = time();
	////////////////////////////////////////
	$error_check = "";
	
	if(empty($username) or empty($date)){
		echo json_encode("error1");
		$error_check = "true";
		exit;
	}//EndIF	
	
	if(empty($error_check)){
		if(db_query("INSERT INTO `db_farmers_activity` (`id`, `username`, `date`) VALUES (NULL, '$username', '$date');","insert")){
				echo json_encode("success");
				exit;
		}else{
			echo json_encode("error2");
			exit;
		}//EndIF
	}//EndIF
	exit;
}//EndIf

?>