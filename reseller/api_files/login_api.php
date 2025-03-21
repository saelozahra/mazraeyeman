<?php
error_reporting(0);
session_start();
ob_start();
header('Content-type: application/json');

define("includesfile","true");
require("../includes/public_functions.php");

$username = safe_enter($_POST['user']);
$password = hash_func($_POST['pass']);

$result = db_query("SELECT * FROM `db_farmers` WHERE `username`='$username' LIMIT 1" , "select");
if(mysqli_num_rows($result)){
	$farmers_array = mysqli_fetch_assoc($result);
	$farmers_pass = $farmers_array['password'];
	if($farmers_pass==$password){
		echo json_encode($farmers_array);
	}else{
		echo json_encode("PassError");
		exit;
	}//ENdIF
}else{
	echo json_encode("UserNotFound");
	exit;
}//EndIF
?>