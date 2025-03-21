<?php
error_reporting(0);
session_start();
ob_start();

define("includesfile","true");
require("../includes/public_functions.php");


$fileupload =  $_FILES["fileupload"];
	

	
	if(!empty($fileupload["name"])){
		$myfile = fileupload_func($fileupload,"product");
		if($myfile=="error" or empty($myfile)){
			echo "khata dar upload pic";
			exit;
		}//ENdIF	
	}else{
		$myfile = "";
	}//ENdIF


echo "<br>myfilename : "; echo $myfile;
?>