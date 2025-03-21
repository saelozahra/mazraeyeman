<?php
error_reporting(0);
session_start();
ob_start();

define("includesfile","true");
require("../includes/admin_functions.php");

adminlogin("","loginckeck");


$fileaddress = 'adminmanage';
if(adminmenus("checkaccess","admin")!=="1"){
	header("Location: index.php");
	exit;
}//EndIf

$page_sess = $_GET['sess'];
if(empty($page_sess) or $page_sess!==$_SESSION['adminlogin_session']){
	header("Location: adminmanage.php");
	exit;
}//EndIf

$save_check = $_GET['save'];
if($save_check=="true"){
	
	$name = safe_enter($_POST['name']);
	$mobile = safe_enter($_POST['mobile']);
	$email = safe_enter($_POST['email']);
	$username = safe_enter($_POST['username']);
	$pass1 = hash_func($_POST['pass1']);
	$pass2 = hash_func($_POST['pass2']);
	$status = safe_enter($_POST['status']);
	////////////////////////////////////////
	$error_check = "";
	
	if(empty($name) or empty($username) or empty($pass1) or empty($pass2) or empty($status)){
		echo '<img src="images/error4.png" style=" width:15px; height:15px; margin:0 0 -4px 5px;" /><b>خطا :</b> تکمیل موارد ستاره دار الزامی میباشد.';
		$error_check = "true";
		exit;
	}//EndIF	
	if(!empty($mobile) and !is_numeric($mobile)){
		echo '<img src="images/error4.png" style=" width:15px; height:15px; margin:0 0 -4px 5px;" /><b>خطا :</b> تلفن همراه وارد شده صحیح نمی باشد.';
		$error_check = "true";
		exit;	
	}//EndIf	
	if(!empty($email) and emailvalidate($email)==false){
		echo '<img src="images/error4.png" style=" width:15px; height:15px; margin:0 0 -4px 5px;" /><b>خطا :</b> ایمیل وارد شده صحیح نمی باشد.';
		$error_check = "true";
		exit;
	}//EndIF
	if(!preg_match("/^[a-zA-Z0-9]*$/",$username)){
		echo '<img src="images/error4.png" style=" width:15px; height:15px; margin:0 0 -4px 5px;" /><b>خطا :</b> نام کابری وارد شده مجاز نمی باشد.';
		$error_check = "true";
		exit;	
	}//EndIF	
	if(strlen($_POST['pass1'])<5 or strlen($_POST['pass2'])<5){
		echo '<img src="images/error4.png" style=" width:15px; height:15px; margin:0 0 -4px 5px;" /><b>خطا :</b> رمز عبور وارد شده کمتر از 5 کارکتر است.';
		$error_check = "true";
		exit;			
	}//EndIF
	if($pass1 !== $pass2){
		echo '<img src="images/error4.png" style=" width:15px; height:15px; margin:0 0 -4px 5px;" /><b>خطا :</b> رمز های عبور وارد شده با هم مطابقت ندارند.';
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
			
			$pic = "images/admin2.png";
			
			if(db_query("INSERT INTO `db_member` (`id`, `username`, `password`, `name`, `nationalcode`, `resellername`, `resellercode`, `city`, `address`, `fathername`, `email`, `tell`, `mobile`, `fax`, `pic`, `sh_code`, `login_session`, `login_date`, `last_page`, `last_visit`, `login_ip`, `reg_date`, `memberlevel`, `notepad`, `status`, `reseller_confirm`) VALUES (NULL, '$username', '$pass1', '$name', '', '', '', '', '', '', '$email', '', '$mobile', '', '$pic', '', '', '', '', '', '', '".time()."', 'admin', '', '$status', '');","insert")){
				adminlog("Add Admin | User=$username");
				echo '<img src="images/ok.png" style=" width:15px; height:15px; margin:0 0 -4px 5px;" /><b>تبریک! :</b> مدیر جدید با موفقیت ثبت شد.';
				?>
                	<script>setTimeout("location.href='" + "adminmanage.php" + "'", 2000);</script>	
                <?php
			}//EndIF
		
		}else{
			echo '<img src="images/error4.png" style=" width:15px; height:15px; margin:0 0 -4px 5px;" /><b>خطا :</b> این نام کاربری قبلا ثبت شده است.';
			$error_check = "true";
			exit;		
		}
	}//EndIF
	exit;
}//EndIf
?>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="fa" xml:lang="fa" dir="rtl">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta http-equiv="X-UA-Compatible" content="IE=edge" />
	<meta http-equiv="content-language" content="fa" />    
	<title>اضافه کردن مدیر</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1,maximum-scale=1,user-scalable=no">
	<meta name="robots" content="noindex, nofollow" />    
	<link rel="shortcut icon" href="images/favicon.png" />
    <link rel="icon" type="image/x-icon" href="images/favicon.png" />
	<link rel="stylesheet" type="text/css" href="css/page.css" />
	<script type="text/javascript" src="js/jquery-1.11.0.min.js"></script> 
    <script type="text/javascript" src="js/ajax.js"></script>
 <!--[if lt IE 9]>  
    	<script src="js/html5.js"></script>  
    	<script src="js/css3-mediaqueries.js"></script>  
  	<![endif]--> 
	<script>	
				
		function submit_check(){
			var error_result;	
			
			var name = document.getElementById('name').value;
			var username = document.getElementById('username').value;
			var pass1 = document.getElementById('pass1').value;
			var pass2 = document.getElementById('pass2').value;
			var status = $("input[name=status]:checked").val();
			//----------------------------------------------------//
			var mobile = document.getElementById('mobile').value;
			var email = document.getElementById('email').value;
			
			if(isEmpty(name)==true || isEmpty(username)==true || isEmpty(pass1)==true || isEmpty(pass2)==true || isEmpty(status)==true){	
				alert('خطا : تکمیل موارد ستاره دار الزامی میباشد.');
				error_result = "error";
			}//EndIf
				
			if(isEmpty(error_result)==true){
				if(pass1 !== pass2){
					document.getElementById('pass1').style="border:1px dashed red;";
					document.getElementById('pass2').style="border:1px dashed red;";
					document.getElementById('pass1').value='';
					document.getElementById('pass2').value='';
					alert('خطا : رمز های عبور وارد شده با هم مطابقت ندارند.');
					error_result = "error";				
				}else{
					if(pass2.length < 5){
						document.getElementById('pass1').style="border:1px dashed red;";
						document.getElementById('pass2').style="border:1px dashed red;";
						document.getElementById('pass1').value='';
						document.getElementById('pass2').value='';
						alert('خطا : رمز عبور وارد شده کمتر از 5 کارکتر است.');	
						error_result = "error";
					}////EndIf
				}//EndIf
				if(isEmpty(email)==false && validateEmail(email)==false){
					document.getElementById('email').style="border:1px dashed red;";
					alert('خطا : ایمیل وارد شده صحیح نمی باشد.');				
					error_result = "error";						
				}//EndIf				
			}//EndIf			
			
			if(isEmpty(error_result)==true){
				form_ajax();
			}else{
				form_ajax('false');
			}//EndIf
		}//EndFunction

    </script>       
</head>
<body><center>

	<div class="top_div"></div>
       
    <div class="topmanager_div">
    	<div class="topmanager_body">
            <div class="topmanager_div_right fr">
                <?php echo topadmininfo(); ?>  
            </div><!--topmanager_div_right-->
            <div class="topmanager_div_left fl">
                <div class="tmdl_box1 fr">
                    <a href="index.php" title="صفحه اصلی مدیریت"><div class="tmdl_b1_items fl "><div class="tmld_b1_mainpage"></div><p>( صفحه اصلی )</p></div></a>
                    <a href="#" title="مشاهده سایت"><div class="tmdl_b1_items fl"><div class="tmld_b1_website"></div><p>( مشاهده سایت )</p></div></a>
                </div><!--tmdl_box1-->
            </div><!--topmanager_div_left--> 
    	</div><!--topmanager_body-->   
    </div><!--topmanager_div-->
    
    
	<div class="father_div">
    	
        <div class="logininfo_div fr">
			<div class="logininfo_date fr"><div></div><b>امروز :</b> <?php echo date_analysis("6",time()); echo " (<b>".getip()."</b>)"; ?></div>
            <div class="logininfo_timer fr"><div></div><p><b>زمان باقيمانده :</b></p><p id="countbox1"></p><b onClick="LoginTimerReset();" style="cursor:pointer;">( بازبینی زمان )</b></div>
        </div><!--logininfo_div-->
        
		<div class="menudiv fr">        
			<?php
				require("_adminmenu.php");			
			?>                                
        </div><!--menudiv-->
        
        <div class="bodydiv fl">        
        	<div class="bodydiv_item fr">
            <div class="bodydiv_item_title fr"><div><img src="images/icon6.png" />اضافه کردن مدیر</div></div>
            <div class="bodydiv_page_loading fr" id="bodydiv_page_loading"><img src="images/loading3.gif" /><p>در حال دریافت اطلاعات ...</p></div>
            <div class="bodydiv_item_body fr" id="bodydiv_item_body">            
                
            	<script>adminpage_loader(1);</script>
  
               <div class="addadmin_div fr">
                    <form id="form_ajax" method="post" action="addadmin.php?sess=<?php echo $page_sess; ?>&save=true">
                    	<p>نام و نام خانوادگی : (*)</p><input type="text" name="name" id="name" dir="rtl" style="margin-right:14px;" /><p style="color:#A8A8A8">(فارسی)</p><br style="clear:both" />                    
                        <p>تلفن همراه : </p><input type="text" name="mobile" id="mobile" dir="ltr" style="margin-right:52px;" /><p style="color:#A8A8A8">(نمونه : 09170001234)</p><br style="clear:both" />
                        <p style="margin-left:52px;">ایمیل : </p><input type="text" name="email" id="email" dir="ltr" onFocus="this.style='border:1px dashed #B0CEE1;'" /><br style="clear:both" />
                        
                        <br style="clear:both" /><hr style="width:100%; border-top:1px solid #ccc;" /><br style="clear:both" />
                        
                        <p>نام کاربری : (*)</p><input type="text" name="username" id="username" dir="ltr" style="margin-right:52px;" /><p style="color:#A8A8A8">(کارکترهای مجاز : از a تا z  و از 0 تا 9 | مثال : admin71)</p><br style="clear:both" /> 
                        <p style="margin-left:54px;">رمز عبور : (*)</p><input type="password" name="pass1" id="pass1" dir="ltr" onFocus="this.style='border:1px dashed #B0CEE1';" /><p style="color:#A8A8A8">(حداقل 5 کارکتر)</p><br style="clear:both" />
                        <p style="margin-left:31px; margin-bottom:7px;">تکرار رمز عبور : (*)</p><input type="password" name="pass2" id="pass2" dir="ltr" onFocus="this.style='border:1px dashed #B0CEE1;'" /><br style="clear:both" />
                        
                        <br style="clear:both" /><br style="clear:both" />
                        
                        <br style="clear:both" /><hr style="width:100%; border-top:1px solid #ccc;" /><br style="clear:both" />
                        
                        <p>وضعیت : (*)</p><br style="clear:both" />
                        <input type="radio" name="status" value="active" style="float:right; margin:13px 7px 0 0;" checked="checked" /><p>فعال</p>
                        <input type="radio" name="status" value="deactivated" style="float:right; margin:13px -15px 0 0;" /><p>غیر فعال</p>
                        
                        <br style="clear:both" />
                        <br style="clear:both" /><hr style="width:100%; border-top:1px solid #ccc;" /><br style="clear:both" />
                        
                        <input type="submit" name="formsubmit" value="اضافه کردن" class="addadmin_formsubmit fr" onClick="submit_check();" />
                        <div id="form_ajax_result"></div>
                    </form>
                </div><!--addadmin_div-->

                
            </div><!--bodydiv_item_body-->
            </div><!--bodydiv_item-->
                            
        </div><!--bodydiv-->    
    <br style="clear:both" />   
    </div><!--father_div-->
    
    
    <div class="footer_div">
    	<div class="copyrightright fr"></div>
    	<p class="copyrightleft fl"><?php echo copyright(); ?></p>
    	
    </div><!--footer_div-->
    
    
    <?php
    
        echo "
            <script>
			adminpage_loader(2);
            document.getElementById('$fileaddress').className='menudiv_item_links_hover fr';
            </script>
           ";
    ?>   

</center></body>
</html>