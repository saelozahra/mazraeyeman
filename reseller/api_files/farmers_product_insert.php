<?php
error_reporting(0);
session_start();
ob_start();

define("includesfile","true");
require("../includes/public_functions.php");


$save_check = $_GET['save'];
if($save_check=="true"){
	
	$group = safe_enter($_POST['group']);
	$category = safe_enter($_POST['category']);
	$product = safe_enter($_POST['product']);
	$zaman_kasht = safe_enter($_POST['zaman_kasht']);
	$sen_mahsol = safe_enter($_POST['sen_mahsol']);
	$vahed = safe_enter($_POST['vahed']);
	$masahat = safe_enter($_POST['masahat']);
	$khak = safe_enter($_POST['khak']);
	$abyari = safe_enter($_POST['abyari']);
	$zaman_kesht = safe_enter($_POST['zaman_kesht']);
	$fasele_kesht = safe_enter($_POST['fasele_kesht']);
	$khoroji_chah = safe_enter($_POST['khoroji_chah']);
	$fasele_radif = safe_enter($_POST['fasele_radif']);
	$fasele_roshd = safe_enter($_POST['fasele_roshd']);
	$goldehi_derakhtan = safe_enter($_POST['goldehi_derakhtan']);
	$tavarom_javane = safe_enter($_POST['tavarom_javane']);
	$farmers_user = safe_enter($_POST['farmers_user']);
	$f_res_code = safe_enter($_POST['f_res_code']);
	$bazarche = safe_enter($_POST['bazarche']);
	
	$vazn = safe_enter($_POST['vazn']);
	$ghimat = safe_enter($_POST['ghimat']);
	$zaman_eraa = safe_enter($_POST['zaman_eraa']);
	$des = safe_enter($_POST['des']);
	$yeylagh_time = safe_enter($_POST['yeylagh_time']);
	$gheshlagh_time = safe_enter($_POST['gheshlagh_time']);
	$yeylagh_latlng  = safe_enter($_POST['yeylagh_latlng ']);
	$gheshlagh_latlng  = safe_enter($_POST['gheshlagh_latlng ']);
	$fileupload =  $_FILES["fileupload"];
	
	$status = "active";
	////////////////////////////////////////
	$error_check = "";
	
	//echo "salam";

	if(empty($group) or empty($category) or empty($product) or empty($farmers_user) or empty($status)){
		echo "insert all fields";
		$error_check = "true";
		exit;
	}//EndIF	
	
	//echo "INSERT INTO `db_product_farmers` (`id`, `group`, `category`, `product`, `zaman_kasht`, `sen_mahsol`, `vahed`, `masahat`, `khak`, `abyari`, `zaman_kesht`, `fasele_kesht`, `khoroji_chah`, `fasele_radif`, `fasele_roshd`, `goldehi_derakhtan`, `tavarom_javane`, `farmers_user`, `f_res_code`, `vazn`, `ghimat`, `zaman_eraa`, `des`, `bazarche`, `yeylagh_time`, `gheshlagh_time`, `yeylagh_latlng`, `gheshlagh_latlng `, `status`) VALUES (NULL, '$group', '$category', '$product', '$zaman_kasht', '$sen_mahsol', '$vahed', '$masahat', '$khak', '$abyari', '$zaman_kesht', '$fasele_kesht', '$khoroji_chah', '$fasele_radif', '$fasele_roshd', '$goldehi_derakhtan', '$tavarom_javane', '$farmers_user', '', '$vazn', '$ghimat', '$zaman_eraa', '$des', '$bazarche', '$yeylagh_time', '$gheshlagh_time', '$yeylagh_latlng', '$gheshlagh_latlng ', $status');";
	
	
	
	if(!empty($fileupload["name"])){
		$myfile = fileupload_func($fileupload,"product");
		if($myfile=="error" or empty($myfile)){
			echo "khata dar upload pic";
			exit;
		}//ENdIF	
	}else{
		$myfile = "";
	}//ENdIF

	if(empty($error_check)){
		if(db_query("INSERT INTO `db_product_farmers` (`id`, `group`, `category`, `product`, `zaman_kasht`, `sen_mahsol`, `vahed`, `masahat`, `khak`, `abyari`, `zaman_kesht`, `fasele_kesht`, `khoroji_chah`, `fasele_radif`, `fasele_roshd`, `goldehi_derakhtan`, `tavarom_javane`, `farmers_user`, `f_res_code`, `vazn`, `ghimat`, `zaman_eraa`, `des`, `bazarche`, `yeylagh_time`, `gheshlagh_time`, `yeylagh_latlng`, `gheshlagh_latlng`, `pic`, `status`) VALUES (NULL, '$group', '$category', '$product', '$zaman_kasht', '$sen_mahsol', '$vahed', '$masahat', '$khak', '$abyari', '$zaman_kesht', '$fasele_kesht', '$khoroji_chah', '$fasele_radif', '$fasele_roshd', '$goldehi_derakhtan', '$tavarom_javane', '$farmers_user', '', '$vazn', '$ghimat', '$zaman_eraa', '$des', '$bazarche', '$yeylagh_time', '$gheshlagh_time', '$yeylagh_latlng', '$gheshlagh_latlng ', '$myfile', '$status');","insert")){
			echo 'success';
			exit;
		}else{
			echo 'cannot add';
		}//EndIF
	}else{
		echo 'error in fields';
	}//EndIF
	exit;
}//EndIf


?>