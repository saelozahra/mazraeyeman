<?php
error_reporting(0);
session_start();
ob_start();

define("includesfile","true");
require("../includes/public_functions.php");


// $save_check = $_GET['save'];
// if($save_check=="true"){
	
	$name = safe_enter($_POST['name']);
	$nationalcode = safe_enter($_POST['nationalcode']);
	$mobile = safe_enter($_POST['mobile']);
	$email = safe_enter($_POST['email']);
	$state = safe_enter($_POST['state']);
	$city = safe_enter($_POST['city']);
	$address = safe_enter($_POST['address']);
	$location = safe_enter($_POST['location']);
	$unit = safe_enter($_POST['unit']);
	$area = safe_enter($_POST['area']);
	$status = "active";
	$moaref = safe_enter($_POST['moaref']);
	$sealevel = safe_enter($_POST['sealevel']);
	$resellercode = safe_enter($_POST['resellercode']);
	$fileupload =  $_FILES["fileupload"];
	////////////////////////////////////////
	$error_check = "";
	
	if(empty($name) or empty($nationalcode) or empty($mobile) or empty($email) or empty($state) or empty($city) or empty($address) or empty($location) or empty($unit) or empty($area) or empty($state)){
		echo "insert all fields";
		$error_check = "true";
		exit;
	}//EndIF	
	if(!empty($mobile) and !is_numeric($mobile)){
		echo "shomare mobile sahih nist";
		$error_check = "true";
		exit;	
	}//EndIf	
	if(!empty($email) and emailvalidate($email)==false){
		echo "wrong email";
		$error_check = "true";
		exit;
	}//EndIF
	
	$result = db_query("SELECT `id` FROM `db_farmers` WHERE `username`='$mobile' " , "select");
	if(mysqli_num_rows($result)){
		echo "tel Repetitious";
		$error_check = "true";
		exit;
	}//ENdIF
		
	
	if(empty($error_check)){
		$result = db_query("SELECT `username` FROM `db_farmers` WHERE `username`='$mobile' LIMIT 1" , "select");
		if(mysqli_num_rows($result)==0){
			
			if($status=="active"){
				$status = "active";
			}else{
				$status = "deactivated";	
			}//EndIF
			
			$password = hash_func($mobile);
			
			if(!empty($fileupload["name"])){
				$myfile = fileupload_func($fileupload,"profile");
				if($myfile=="error" or empty($myfile)){
					echo "khata dar upload pic";
					exit;
				}//ENdIF	
			}else{
				$myfile = "";
			}//ENdIF
			
			
			if(db_query("INSERT INTO `db_farmers` (`id`, `username`, `password`, `name`, `nationalcode`, `mobile`, `email`, `state`, `city`, `address`, `unit`, `area`, `location`, `reg_date`, `last_visit`, `resellercode`, `sealevel` , `pic` , `status`) VALUES (NULL, '$mobile', '$password', '$name', '$nationalcode', '$mobile', '$email', '$state', '$city', '$address', '$unit', '$area', '$location', '".time()."', '', '$resellercode', '$sealevel' , '$myfile' , '$status');","insert")){
				
				if(!empty($moaref)){
					$result = db_query("SELECT `id`,`moaref` FROM `db_farmers` WHERE `username`='$moaref' or `id`='$moaref' LIMIT 1" , "select");
					if(mysqli_num_rows($result)){
						while($row = mysqli_fetch_assoc($result)){
							$farmer_id = intval($row['id']);
							$farmer_moaref = intval($row['moaref']);
						}//EndWhile
						$farmer_moaref = $farmer_moaref+1;
						
						db_query("UPDATE `db_farmers` SET `moaref` = '$farmer_moaref' WHERE `id` = '$farmer_id';","update");
					}//ENdIF
					
				}//EndIF
				
				echo json_encode("success");
				exit;
			}//EndIF
		
		}else{
			echo "ghablan sabtenam shode";
			$error_check = "true";
			exit;		
		}
	}//EndIF
	exit;
// }//EndIf


?>