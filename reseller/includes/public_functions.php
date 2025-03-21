<?php
defined('includesfile') or die(header('Location: '.' warning.php?err=FileAccess'));
error_reporting(0);
session_start();
ob_start();

require("db.php");

function db_query($sql , $type)
{
	if($type!=="backup"){$sql = safe_html($sql);}
	
	require("db.php");
	if($type=='insert' or $type=='update' or $type=='delete' or $type=='query'){
		if(!mysqli_query($db_conncect, $sql)){echo "خطا : لطفا مجددا اقدام نمایید." ;}else{
		return true;	
		}
	}
	if($type=='select' or $type=='backup'){
		$result = mysqli_query($db_conncect, $sql);
		return $result;			
	}
	db_conncect_close();
}//db_query


function db_conncect_close()
{
	mysqli_close($db_conncect);
}//db_conncect_close


function hash_func($pass = '')
{
	$pass = 'a'. md5('(@_@)' . base64_encode(safe_html(strtoupper($pass)).'afarinesh_team')) . 'S';
	return $pass;
}//create_hash


function validation_func($type,$input){
	
	# convert to orginal value
	$input = str_fix($input);
	$input = urldecode($input);
	$input = htmlspecialchars_decode($input);
	$input = strtolower($input);
	
	#delete other character
	$input = preg_replace('# {2,}#', ' ', $input);
	$input = strip_tags($input);
	$input = preg_replace("/[^A-Za-z0-9\.\_\-\( )\?\!\/\:\،\,\;\{\}\ \ا\آ\ب\پ\ت\ث\ج\چ\ح\خ\د\ذ\ر\ز\ژ\س\ش\ص\ض\ط\ظ\ع\غ\ف\ق\ك\ک\گ\ل\م\ن\و\ه\ی\ي]/", "", $input);
	$input = preg_replace("/(union|select|concat|information_schema)/", "-", $input);
	
	require("db.php");
	return mysqli_real_escape_string($db_conncect , $input);		
	
}//validation_func


function safe_html($text=null)
{	
	return htmlspecialchars(str_fix($text));	
}//safe_html

function safe_enter($text=null)
{
	require("db.php");
	return mysqli_real_escape_string($db_conncect , $text);	
}//safe_enter


function str_fix($input = '',$trim=true)
{
	$arabic = array("ي", "ك", "٤", "٥", "٦");
	$farsi = array("ی", "ک", "4", "5", "6");
	$out = str_replace($arabic,$farsi,$input);	
	
	$farsi_array = array("۰", "۱", "۲", "۳", "۴", "۵", "۶", "۷", "۸", "۹", "٫");
	$english_array = array("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ".");
	$out = str_replace($farsi_array, $english_array, $out);
		if($trim)
			$out = trim($out);
	return $out;
}//str_fix


function getip()
{
    if(!empty($_SERVER['HTTP_CLIENT_IP']))   //check ip from share internet
    {
      $ip=$_SERVER['HTTP_CLIENT_IP'];
    }
    elseif(!empty($_SERVER['HTTP_X_FORWARDED_FOR']))   //to check ip is pass from proxy
    {
      $ip=$_SERVER['HTTP_X_FORWARDED_FOR'];
    }else{
      $ip=$_SERVER['REMOTE_ADDR'];
    }
    return $ip;
}//getip


function getinfo()
{	
	$info .= 'HTTP_ACCEPT_LANGUAGE:' . safe_enter($_SERVER['HTTP_ACCEPT_LANGUAGE']) . '||' ;
	$info .= 'HTTP_USER_AGENT:' . safe_enter($_SERVER['HTTP_USER_AGENT']) . '||' ;
	$info .= 'REMOTE_ADDR:' .gethostbyaddr(safe_enter($_SERVER['REMOTE_ADDR']))."  -  ".getenv("username") . '||' ;
	return $info;
}//getinfo


function getOS($input) { 
	if(empty($input)){
		$user_agent  = $_SERVER['HTTP_USER_AGENT'];
	}else{
		$user_agent = $input;	
	}//EndIf
    
    $os_platform = "Unknown";
    $os_array    = array(
						'#Windows NT 10|Windows NT 6.4#'      =>  'Windows10',
						'#Windows NT 6.2|Windows NT 6.3#'     =>  'Windows8',
						'#Windows NT 6.1#'   				  =>  'Windows7',
						'#Windows NT 5.2|Windows NT 5.1|Windows NT 5.0|Windows XP#'     =>  'WindowsXP',
						'#Windows Phone OS|Windows Phone|Windows Mobile#'    			=>  'WindowsPhone',
						'#Macintosh|Mac OS X|Mac_PowerPC#'	  =>  'MacOS',
						'#Linux#'              				  =>  'Linux',
						'#iPhone|iPod|iPad#'  				  =>  'iOS',
						'#Android#'            				  =>  'Android',
						'#webOS|BOLT|Blazer|SymbianOS|Symbian|SymbOS|Doris|Dorothy|GoBrowser|MIB|NetFront|J2ME|Bada|BlackBerry|wOSBrowser|Nokia|NOKIA#'   =>  'MobileDevice'
					);//End array

    foreach ($os_array as $regex => $value) { 
        if (preg_match($regex, $user_agent)) {
            $os_platform    =   $value;
        }//End IF
    }//End foreach
    return $os_platform;
}// End getOS


function getBrowser($input) {
	if(empty($input)){
		$user_agent  = $_SERVER['HTTP_USER_AGENT'];
	}else{
		$user_agent = $input;	
	}//EndIf	
	
    $browser       = "Unknown";
    $browser_array = array(					
							'#Gecko/([0-9.]+) (Firefox|Firebird|Phoenix)/([0-9.]+)#'    =>  'Firefox',
							'#Mozilla/5.0(.*); rv:([0-9.]+)(.*) Gecko#'	        		=>  'Firefox',
							'#(MSIE|Trident/) ?([0-9.]+)?#'    						    =>  'InternetExplorer',
							'#Version/([0-9.]+)(.*) Safari/([0-9.]+)#'   		  		=>  'Safari',
							'#Safari/([0-9.]+)#'   		 						 		=>  'Safari',
							'#Mobile Safari/|SymbianOS|Symbian|SymbOS|GoBrowser|Bada#'  =>  'MobileBrowser',
							'#Chrome/([0-9.]+)#'   					 		      		=>  'Chrome',																				
							'#(Opera|Presto|OPR|Opera Mini)/([0-9.]+)#'    		 	    =>  'Opera',
							'#Edge/([0-9.]+)#'     								 	    =>  'Edge'
						);//End array
    foreach ($browser_array as $regex => $value) { 
        if (preg_match($regex, $user_agent)) {
            $browser	=	$value;
        }//End IF
    }//End foreach
    return $browser;
}//End getBrowser


require("jdf.php");
function date_analysis($type,$input)
{	
	switch($type){
		case "1":
			$format="Y/m/d"; // 1387/01/24
			break;		
		case "2":
			$format="l Y/m/d"; // 1387/01/24 شنبه
			break;	
		case "3":
			$format="l d F Y"; // 1387 فروردین 24 شنبه
			break;	
		case "4":
			$format="Y/m/d - H:i"; // 21:00 1387/01/24
			break;									
		case "5":
			$format="l Y/m/d - H:i"; // 21:00 1387/01/24 شنبه
			break;	
		case "6":
			$format="l d F Y - H:i"; // 21:00 1387 فروردین 24 شنبه
			break;
		case "6_2":
			$format="l d F Y - H:i:s"; // 21:00:00 1387 فروردین 24 شنبه
			break;	
		case "7":
			$format="H"; // 21 ساعت
			break;
		case "8":
			$format="Y"; // 1387 سال
			break;
		case "9":
			$format="m"; // 01 ماه
			break;
																	
		default:
			$format="F"; // 21:00 1387/01/24
			break;	
	}//switch
		
	return jdate( $format , $input);
}//date_analysis


function go_to($link = '')
{	
	$link = urldecode($link);
	
	die("<a href='{$link}'>$link</a>");
}//go_to


function getfilename($url){
	for($i = strlen($url)-1; $i >= 0; $i--){	
		if($url[$i]=="/"){break;}
		$file_name .= $url[$i];		
	}//For
	$file_name = strrev($file_name);
	$file_name = explode('?', $file_name);
    $file_name = reset($file_name);
	return $file_name;
}//getfilename


function copyright(){
	$years = date("Y")+2;
	$copyright = "CopyRight © 2015-$years AfarineshTeam | All Rights Reserved.";
	return $copyright;
}//copyright


function folderSize($dir){
	$dir_array = scandir($dir);	
	foreach($dir_array as $key=>$filename){
		if($filename!=".." && $filename!="."){
			if(is_dir($dir."/".$filename)){
				folderSize($dir."/".$filename);
			}elseif(is_file($dir."/".$filename)){				
				//echo $filename."-";
				$space = $space + filesize($dir."/".$filename);
			}//End IF
		}//End IF
	}//foreach
$_SESSION['space'] = $_SESSION['space'] + $space;
}//folderSize


function sizeFormat($bytes){ 
	$kb = 1024;
	$mb = $kb * 1024;
	$gb = $mb * 1024;
	$tb = $gb * 1024;
	
	if (($bytes >= 0) && ($bytes < $kb)) {
		return $bytes . 'B';	
	} elseif (($bytes >= $kb) && ($bytes < $mb)) {
		return ceil($bytes / $kb) . 'KB';
	
	} elseif (($bytes >= $mb) && ($bytes < $gb)) {
		return ceil($bytes / $mb) . 'MB';
	
	} elseif (($bytes >= $gb) && ($bytes < $tb)) {
		return ceil($bytes / $gb) . 'GB';
	
	} elseif ($bytes >= $tb) {
		return ceil($bytes / $tb) . 'TB';
	} else {
		return $bytes . 'B';
	}
}//sizeFormat


function clean_url($url){
    if($url == '') return;
    $url = str_replace('http://', null, strtolower($url));
    $url = str_replace('https://', null, $url );
    if(substr($url, 0, 4) == 'www.')  $url = substr($url, 4);
    $url = explode('/', $url);
    $url = reset($url);
    $url = explode(':', $url);
    $url = reset($url);
    return $url;
	
	// Example:
	// echo clean_url("http://ayoubsys.ir/download/123.txt");
	// Exit => ayoubsys.ir
}//clean_url


function emailvalidate($email){
	if(filter_var($email, FILTER_VALIDATE_EMAIL)){
	 	return true;
	}else{
		return false;	
	}//EndIF
}//emailvalidate


function fileupload_func($file,$location){
	$file_name    = $file["name"];
	$file_pasvand = substr($file_name,strlen($file_name)-4,4);
	$file_pasvand = str_replace(".","",$file_pasvand);
	$file_pasvand = strtolower($file_pasvand);
	$file_type    = $file["type"];
	$tmp_name     = $file["tmp_name"];
	$u_error      = $file["error"];
	$file_size    = $file["size"];
	$watermark_chk= $_POST['watermark'];
	
	if(empty($file_name)){
		return "error";
		exit;
	}//EndIF
	
	if($file_name==".htaccess" or $file_type=="application/octet-stream" or $file_pasvand=="html" or $file_pasvand=="php"){
		return "error";
		exit;
	}//EndIf
	
	$check_allow = array("image/gif"=>"gif" , "image/png"=>"png", "image/jpeg"=>"jpeg", "image/jpeg"=>"jpg");
	if($file_type !== array_search($file_pasvand,$check_allow)){
		return "error";
		exit;
	}//EndIF
	
	if($u_error == 0 and !empty($location)){
		$newname = time()."_".rand('100','3000');
		$address = "../fileupload/" . $location . "/" . $newname . "." . $file_pasvand;
		$moved = move_uploaded_file($tmp_name , $address);
		if($moved==true){
			return $newname. "." .$file_pasvand;
		}else{
			return "error";
			exit;
		}//EndIF
	}//EndIF
	
	@unlink($tmp_name);
}//fileupload_func

























?>