<?php
error_reporting(0);
session_start();
ob_start();

define("includesfile","true");
require("../includes/admin_functions.php");

$logout_check = $_GET['logout'];
if($logout_check=="true"){
	unset_admin_session();
	header("Location: login.php");
	exit;
}//EndIF

if(!empty($_POST['complete_frm']) or $_POST['complete_frm']!=""){
	db_query("INSERT INTO `db_blacklist` (`ip`, `date`) VALUES ('".getip()."', '".time()."'); ","insert");
	unset_admin_session();
	die();
	//Add Robots to BlackList 		
}//EndIF

$submit_chk = !empty($_POST['submit'])? $_POST['submit'] : '';
if(!empty($submit_chk) and $submit_chk=='asys'){

	$time_frm = intval($_POST['time_frm'])+3;
	if(time() < $time_frm){
		?><script>setTimeout("location.href='" + "login.php" + "'", 1);</script><?php
		die();
	}//EndIF
	
	$username = safe_enter($_POST['username']);
	$password = hash_func($_POST['password']);	
	$code_sec = hash_func($_POST['code_sec']);

	if(!empty($code_sec) and $code_sec!=="ad50825391d4d7a2850051ae1707ec08fS" and !empty($_SESSION['captchacode']) and !empty($username) and $password!=="ad50825391d4d7a2850051ae1707ec08fS"){
	
		if($code_sec==$_SESSION['captchacode']){
			
			
			$result = db_query("SELECT * FROM `db_member_login` WHERE `ip`='".getip()."' AND `des`!='loginok' ORDER BY `id` DESC LIMIT 7" , "select");			
			if (mysqli_num_rows($result) >= 7 ) {
				$number_cout = 0;			
				while($row = mysqli_fetch_assoc($result)) {					
					$blacklist["$number_cout"] = $row['date'];
					$number_cout++;
				}//EndWhile
				$number_cout ='';
				$tafrigh = intval($blacklist[0])-intval($blacklist[6]);
				if($tafrigh < 360){
					db_query("INSERT INTO `db_blacklist` (`ip`, `date`) VALUES ('".getip()."', '".time()."'); ","insert");
				}//EndIF
			}//EndIf			
						
			$result = db_query("SELECT * FROM `db_member` WHERE `username`='$username' AND `password`='$password' " , "select");
			if (mysqli_num_rows($result) == 1) {
								
				while($row = mysqli_fetch_assoc($result)) {					
					$_SESSION['adminlogin_id'] = intval($row['id']);
					$admin_status = $row['status'];
				}//EndWhile
				if($admin_status=="active"){
					if(!empty($_SESSION['adminlogin_id'])){				
						adminlogin(intval($_SESSION['adminlogin_id']),"loginok");
						echo "<img src='images/ok.png' class='result_icn' />ورود موفق آمیز...";
						adminlogin_log($username,'loginok');
						?>
							<script>							
								setTimeout("location.href='" + "index.php" + "'", 1 * 700);
							</script>        
						<?php
						exit;
					}//EndIf
				}else{
					echo "<img src='images/error4.png' class='result_icn' />خطا : حساب کاربری شما غیرفعال است.";	
					?>
						<script>
							recaptcha();
							document.getElementById("username","password","code_sec").value='';	
							document.getElementById("password").value='';	
							document.getElementById("code_sec").value='';
						</script>        
					<?php							
					exit;			
				}//EndIF
				
			} else {
				echo "<img src='images/error4.png' class='result_icn' /><b>خطا :</b> نام کاربری و کلمه عبور اشتباه است.";
				unset_admin_session();
				adminlogin_log($username,'loginerror');
				?>
					<script>
						recaptcha();
						document.getElementById("username","password","code_sec").value='';	
						document.getElementById("password").value='';	
						document.getElementById("code_sec").value='';	
						document.getElementById("username").focus();
					</script>        
				<?php					
			}//EndIf

			
		}else{
			echo "<img src='images/error4.png' class='result_icn' /><b>خطا :</b> کد امنیتی اشتباه می باشد.";	
			unset_admin_session();
			adminlogin_log($username,'loginerror');
			?>
				<script>
					recaptcha();
					document.getElementById("code_sec").value='';	
					document.getElementById("code_sec").focus();	
				</script>        
			<?php		
		}//EndIf

	}else{
		echo "<img src='images/error4.png' class='result_icn' /><b>خطا :</b> تکمیل تمامی فیلدها الزامی میباشد.";
		unset_admin_session();
	}//EndIf


}else{
		
?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="fa" xml:lang="fa" dir="rtl">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta http-equiv="X-UA-Compatible" content="IE=edge" />
	<meta http-equiv="content-language" content="fa" />    
	<title>ورود به سیستم</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1,maximum-scale=1,user-scalable=no">
	<meta name="robots" content="noindex, nofollow" />    
	<link rel="shortcut icon" href="images/favicon.png" />
    <link rel="icon" type="image/x-icon" href="images/favicon.png" />
	<link rel="stylesheet" type="text/css" href="css/login.css" />
	<script type="text/javascript" src="js/jquery-1.11.0.min.js"></script> 
    <script type="text/javascript" src="js/ajax.js"></script>
 <!--[if lt IE 9]>  
    	<script src="js/html5.js"></script>  
    	<script src="js/css3-mediaqueries.js"></script>  
  	<![endif]-->      
</head>
<body><center>

	<div class="top_div"></div>
    
	<div class="father_div">
    	      
        <div class="top_space"></div>
    	<div id="form_ajax_result"></div>

        <div class="login_div">
        	<form id="form_ajax" method="post" action="login.php">            
                <div class="uname_txt fr">نام کاربری :</div>
                <input type="text" name="username" id="username" class="user_inp fr" dir="ltr" autocomplete="off" value="" />
                <div class="pass_txt fr">کلمه عبور :</div>
                <input type="password" name="password" id="password" class="pass_inp fr" dir="ltr" value="" />        
                <div class="code_txt fr">کد امنیتی :</div>
                <input type="text" name="code_sec" id="code_sec" class="code_inp fr" dir="ltr" autocomplete="off" value=""  />         
                <div class="code_img_div fr"><img src="../includes/captcha.php?act=<?php echo rand(255,2000); ?>" id="imgcaptcha" draggable="false" /><div></div><p onClick="recaptcha('click');">ایجاد کد جدید</p></div>
                <input type="text" name="complete_frm" class="complete_frm" />
                <input type="hidden" name="time_frm" value="<?php echo time(); ?>" />
                <input type="submit" name="submit_frm" value="ورود به سیستم" class="submit_frm fr"  onclick="form_ajax();" />
            	<input type="button" name="button_frm" value="بازیابی رمز عبور" class="button_frm fr" onClick="document.location='https://mazraeyeman.ir/reseller/'"  />                          
            	<input type="hidden" name="submit" value="asys" />                
            </form>            
        </div><!--login_div-->
        
    </div><!--father_div-->
    
</center></body>
</html>

<?php
}//if(!empty($submit_chk) and $submit_chk=='asys')

?>