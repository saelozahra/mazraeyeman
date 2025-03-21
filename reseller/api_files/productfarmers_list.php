<?php
error_reporting(0);
session_start();
ob_start();
header('Content-type: application/json');

define("includesfile","true");
require("../includes/public_functions.php");

$show_type = $_GET['show_type'];
$bazarche = $_GET['bazarche'];
$userid = safe_enter($_GET['userid']);
$search = $_GET['search'];
$s = safe_enter($_GET['s']);
$field = safe_enter($_GET['field']);
$order = safe_enter($_GET['order']);
$o = safe_enter($_GET['o']);

if($bazarche=="yes"){
	$query = "WHERE `bazarche`='yes'";
}//ENdIF
if($search=="yes" and !empty($s) and !empty($field)){
	$query = "WHERE `$field` LIKE '%$s%'";
}//ENdIF
if($bazarche=="yes" and $search=="yes" and !empty($s) and !empty($field)){
	$query = "WHERE `bazarche`='yes' AND `$field` LIKE '%$s%'";
}//ENdIF
if(!empty($userid)){
//	$userid = intval($userid);
	$query = "WHERE `farmers_user`='$userid'";
}//ENdIF
if(!empty($userid) and $bazarche=="yes"){
	$query = "WHERE `farmers_user`='$userid' AND `bazarche`='yes'";
}//ENdIF


if($order=="yes" and !empty($o)){
	$order_query = "ORDER BY `$o` DESC";
}else{
	$order_query = "ORDER BY `id` DESC";
}//ENdIf
//echo "SELECT db_product_farmers.*,db_product.title as product_title FROM `db_product_farmers` LEFT JOIN db_product ON db_product.title =db_product_farmers.product $query $order_query";
$result = db_query("SELECT db_product_farmers.*,db_product.title as product_title FROM `db_product_farmers` LEFT JOIN db_product ON db_product.id =db_product_farmers.product $query $order_query" , "select");
if(mysqli_num_rows($result)){
	if($show_type=="html"){

		while($row = mysqli_fetch_assoc($result)){	
				include('./single_product_farmer.php?id='.$row['id']);
		}//ENdWhile
		
	}else{
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
	}//ENdIF
}else{
	echo json_encode(array("result"=>"not found"));
	exit;
}//EndIF
?>