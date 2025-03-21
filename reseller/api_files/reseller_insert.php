<?php
error_reporting(0);
session_start();
ob_start();

define("includesfile","true");
require("../includes/public_functions.php");



$save_check = $_GET['save'];
if($save_check=="true"){
	
	$name = safe_enter($_POST['name']);
	$fathername = safe_enter($_POST['fathername']);
	$nationalcode = safe_enter($_POST['nationalcode']);
	$sh_code = safe_enter($_POST['sh_code']);
	$tell = safe_enter($_POST['tell']);
	$mobile = safe_enter($_POST['mobile']);
	$fax = safe_enter($_POST['fax']);
	$email = safe_enter($_POST['email']);
	$resellername = safe_enter($_POST['resellername']);
	$resellercode = safe_enter($_POST['resellercode']);
	$city = safe_enter($_POST['city']);
	$address = safe_enter($_POST['address']);
	$username = safe_enter($_POST['username']);
	$pass1 = hash_func($_POST['pass1']);
	$pass2 = hash_func($_POST['pass2']);
	$status = "active";//safe_enter($_POST['status']);
	////////////////////////////////////////
	$error_check = "";
	
	if(empty($name) or empty($fathername) or empty($nationalcode) or empty($mobile) or empty($username) or empty($nationalcode) or empty($resellername) or empty($address) or empty($pass1) or empty($pass2) or empty($status)){
		echo json_encode("error1");
		$error_check = "true";
		exit;
	}//EndIF	
	if(!empty($mobile) and !is_numeric($mobile)){
		echo json_encode("error2");
		$error_check = "true";
		exit;	
	}//EndIf	
	if(!empty($email) and emailvalidate($email)==false){
		echo json_encode("error3");
		$error_check = "true";
		exit;
	}//EndIF
	if(!preg_match("/^[a-zA-Z0-9]*$/",$username)){
		echo json_encode("error4");
		$error_check = "true";
		exit;	
	}//EndIF	
	if(strlen($_POST['pass1'])<5 or strlen($_POST['pass2'])<5){
		echo json_encode("error5");
		$error_check = "true";
		exit;			
	}//EndIF
	if($pass1 !== $pass2){
		echo json_encode("error6");
		$error_check = "true";
		exit;			
	}//EndIF	

	
	
	if(empty($error_check)){
		$result = db_query("SELECT `username` FROM `db_member` WHERE `username`='$username'" , "select");
		if(mysqli_num_rows($result)==0){
			
			if($status=="active"){
				$status = "active";
			}else{
				$status = "deactivated";	
			}//EndIF


			if(db_query("INSERT INTO `db_member` (`id`, `username`, `password`, `name`, `nationalcode`, `resellername`, `resellercode`, `city`,`address`, `fathername`, `email`, `tell`, `mobile`, `fax`, `pic`, `sh_code`, `login_session`, `login_date`, `last_page`, `last_visit`, `login_ip`, `reg_date`, `memberlevel`, `notepad`, `status`, `reseller_confirm`) VALUES (NULL, '$username', '$pass1', '$name', '$nationalcode', '$resellername', '$resellercode', '$city','$address', '$fathername', '$email', '$tell', '$mobile', '$fax', '', '$sh_code', '', '', '', '', '', '".time()."', 'reseller', '', 'active', '1');","insert")){
				echo 'success';
				exit;
			}//EndIF
		}else{
			echo 'error7';
			$error_check = "true";
			exit;		
		}
	}//EndIF
	exit;
}//EndIf

?>