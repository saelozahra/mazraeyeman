<?php
error_reporting(0);
session_start();
ob_start();

define("includesfile","true");
require("../includes/public_functions.php");

header('Content-type: application/json');




$cat = intval($_GET['cat']);
if(intval($cat)>0){
    $query = " WHERE `category_id`='$cat' ";
}//endif

$result = db_query("SELECT * FROM `db_product` $query ORDER BY `group` ASC" , "select");
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
	echo json_encode("not found");
	exit;
}//EndIF
?>