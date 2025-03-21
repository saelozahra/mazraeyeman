<?php
error_reporting(0);
session_start();
ob_start();
header('Content-type: application/json');


define("includesfile","true");
require("../includes/public_functions.php");


$farmertel = safe_enter($_GET['farmertel']);

if(!empty($farmertel)){
	$query = "WHERE `username`='$farmertel'";
}//ENdIF

$result = db_query("SELECT * FROM `db_farmers` $query ORDER BY `id` ASC" , "select");
if(mysqli_num_rows($result)){
	$num = 1;
	echo '[';
	while($row = mysqli_fetch_assoc($result)){	
		echo json_encode($row);
		if(mysqli_num_rows($result)>$num){
			echo ',';
		}//eNdIF
		$num++;
	}//ENdWhile
	echo ']';
}else{
	echo json_encode("error");
	exit;
}//EndIF
?>