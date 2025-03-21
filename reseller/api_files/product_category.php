<?php
error_reporting(0);
session_start();
ob_start();
header('Content-type: application/json');


define("includesfile","true");
require("../includes/public_functions.php");

$gp = $_GET['gp'];
if($gp=="group1"){
    $query = "WHERE `group`='group1'";
}//endif
if($gp=="group2"){
    $query = "WHERE `group`='group2'";
}//endif

$result = db_query("SELECT * FROM `db_product_category` $query" , "select");//
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