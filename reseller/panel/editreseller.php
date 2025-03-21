<?php
error_reporting(0);
session_start();
ob_start();

define("includesfile","true");
require("../includes/admin_functions.php");

adminlogin("","loginckeck");

$fileaddress = "resellermanage";
if(adminmenus("checkaccess","admin")!=="1"){
	header("Location: index.php");
	exit;
}//EndIf

$page_sess = $_GET['sess'];
$admin_id = intval($_GET['id']);
if(empty($page_sess) or $page_sess!==$_SESSION['adminlogin_session'] or empty($admin_id)){
	header("Location: resellermanage.php?type=1");
	exit;
}//EndIf

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
	$status = safe_enter($_POST['status']);
	$confirm = $_POST['confirm'];
	if(!is_numeric($confirm)){
		$confirm = "1";
	}else{
		$confirm = intval($confirm);	
	}//ENdIF
	////////////////////////////////////////
	$error_check = "";

	
	
	
	if(empty($name) or empty($fathername) or empty($nationalcode) or empty($mobile) or empty($nationalcode) or empty($resellername) or empty($resellercode) or empty($address) or empty($status)){
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
	if($pass1!=="ad50825391d4d7a2850051ae1707ec08fS" or $pass2!=="ad50825391d4d7a2850051ae1707ec08fS"){		
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
	}//EndIF

	if(empty($error_check)){
		$result = db_query("SELECT `id`,`password`,`username` FROM `db_member` WHERE `id`='$admin_id' LIMIT 1" , "select");
		if(mysqli_num_rows($result)==1){
			while($row = mysqli_fetch_assoc($result)) {				
				$password_old = $row['password'];
				$admin_user = $row['username'];
			}//EndWhile	
			
			if($pass1=="ad50825391d4d7a2850051ae1707ec08fS" or $pass2=="ad50825391d4d7a2850051ae1707ec08fS"){
				$password = $password_old;
			}else{
				$password = $pass1;
			}//EndIF
			
			if($status=="active"){
				$status = "active";
			}else{
				$status = "deactivated";	
			}//EndIF
			
			if(db_query("UPDATE `db_member` SET `password` = '$password', `name` = '$name', `nationalcode` = '$nationalcode', `resellername` = '$resellername', `resellercode` = '$resellercode', `city` = '$city', `address` = '$address', `fathername` = '$fathername', `email` = '$email', `tell` = '$tell', `mobile` = '$mobile', `fax` = '$fax', `sh_code` = '$sh_code', `status` = '$status', `reseller_confirm` = '$confirm' WHERE `id` = '$admin_id';","update")){
				adminlog("Edit Reseller | User=$admin_user | Id = $admin_id");
				echo '<img src="images/ok.png" style=" width:15px; height:15px; margin:0 0 -4px 5px;" /><b>تبریک! :</b> نماینده با موفقیت ویرایش شد.';
				?>
                	<script>setTimeout("location.href='" + "resellermanage.php?type=1" + "'", 3000);</script>	
                <?php
			}//EndIF
		
		}else{
			echo '<img src="images/error4.png" style=" width:15px; height:15px; margin:0 0 -4px 5px;" /><b>خطا :</b> این نام کاربری یافت نشد.';
			$error_check = "true";
			exit;		
		}
	}//EndIF
	exit;
}else{
	$result = db_query("SELECT * FROM `db_member` WHERE `id`='$admin_id' AND `memberlevel`='reseller' LIMIT 1" , "select");
		if(mysqli_num_rows($result)==1){
			while($row = mysqli_fetch_assoc($result)) {				
				$name = safe_enter($row['name']);
				$fathername = safe_enter($row['fathername']);
				$nationalcode = safe_enter($row['nationalcode']);
				$sh_code = safe_enter($row['sh_code']);
				$tell = safe_enter($row['tell']);
				$mobile = safe_enter($row['mobile']);
				$fax = safe_enter($row['fax']);
				$email = safe_enter($row['email']);
				$resellername = safe_enter($row['resellername']);
				$resellercode = safe_enter($row['resellercode']);
				$city = safe_enter($row['city']);
				$address = safe_enter($row['address']);
				$username = safe_enter($row['username']);
				$pass1 = hash_func($row['pass1']);
				$pass2 = hash_func($row['pass2']);
				$status = safe_enter($row['status']);
				$confirm = intval($row['reseller_confirm']);
			}//EndWhile
			$fileaddress = $fileaddress . $confirm;
		}else{
			header("Location: resellermanage.php?type=1");
		}//EndIF	
}//EndIf
?>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="fa" xml:lang="fa" dir="rtl">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta http-equiv="X-UA-Compatible" content="IE=edge" />
	<meta http-equiv="content-language" content="fa" />    
	<title>ویرایش کردن نماینده</title>
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
			var fathername = document.getElementById('fathername').value;
			var nationalcode = document.getElementById('nationalcode').value;
			var mobile = document.getElementById('mobile').value;
			var resellername = document.getElementById('resellername').value;
			var resellercode = document.getElementById('resellercode').value;
			var city = document.getElementById('city').value;
			var address = document.getElementById('address').value;
			var username = document.getElementById('username').value;
			var pass1 = document.getElementById('pass1').value;
			var pass2 = document.getElementById('pass2').value;
			var status = $("input[name=status]:checked").val();
			//----------------------------------------------------//
			var tell = document.getElementById('tell').value;
			var email = document.getElementById('email').value;
			var custom_checkbox = $("input[name=custom_checkbox]:checked").val();
			
			if(isEmpty(name)==true || isEmpty(fathername)==true  || isEmpty(nationalcode)==true || isEmpty(mobile)==true || isEmpty(resellername)==true || isEmpty(resellercode)==true || isEmpty(city)==true || isEmpty(address)==true || isEmpty(username)==true || isEmpty(status)==true){	
				alert('خطا : تکمیل موارد ستاره دار الزامی میباشد.');
				error_result = "error";
			}//EndIf
			if(isEmpty(error_result)==true){
				if(isEmpty(pass1)==false || isEmpty(pass2)==false){
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
            <div class="bodydiv_item_title fr"><div><img src="images/icon6.png" />ویرایش کردن نماینده</div></div>
            <div class="bodydiv_page_loading fr" id="bodydiv_page_loading"><img src="images/loading3.gif" /><p>در حال دریافت اطلاعات ...</p></div>
            <div class="bodydiv_item_body fr" id="bodydiv_item_body">            
                
            	<script>adminpage_loader(1);</script>
  
               <div class="addadmin_div fr">
                    <form id="form_ajax" method="post" action="editreseller.php?sess=<?php echo $page_sess."&id=".$admin_id; ?>&save=true">
                    	<p>نام و نام خانوادگی : (*)</p><input type="text" name="name" id="name" dir="rtl" style="margin-right:14px;" value="<?php echo $name ;?>" /><p style="color:#A8A8A8">(فارسی)</p><br style="clear:both" />  
                        <p>نام پدر : (*)</p><input type="text" name="fathername" id="fathername" dir="rtl" style="margin-right:52px;" value="<?php echo $fathername ;?>" /><br style="clear:both" />                    	
                        <p>کد ملی : (*)</p><input type="text" name="nationalcode" id="nationalcode" dir="ltr" style="margin-right:52px;" value="<?php echo $nationalcode ;?>" /><br style="clear:both" />
                        <p>شماره شناسنامه : </p><input type="text" name="sh_code" id="sh_code" dir="ltr" style="margin-right:39px;" value="<?php echo $sh_code ;?>" /><br style="clear:both" />
                        <p>تلفن همراه : (*)</p><input type="text" name="mobile" id="mobile" dir="ltr" style="margin-right:46px;" value="<?php echo $mobile ;?>" /><p style="color:#A8A8A8">(نمونه : 09170001234)</p><br style="clear:both" />
                        <p>تلفن ثابت : </p><input type="text" name="tell" id="tell" dir="ltr" style="margin-right:52px;" value="<?php echo $tell ;?>" /><p style="color:#A8A8A8">(نمونه : 0210000000)</p><br style="clear:both" />
                        <p>فکس : </p><input type="text" name="fax" id="fax" dir="ltr" style="margin-right:52px;" value="<?php echo $fax ;?>" /><br style="clear:both" />
                        <p style="margin-left:52px;">ایمیل : </p><input type="text" name="email" id="email" dir="ltr" onFocus="this.style='border:1px dashed #B0CEE1;'" value="<?php echo $email ;?>" /><p style="color:#A8A8A8">(نمونه : Alireza@gmail.com)</p><br style="clear:both" />
                        
                        <br style="clear:both" /><hr style="width:100%; border-top:1px solid #ccc;" /><br style="clear:both" />
                        
                        <p>نام نمایندگی : (*)</p><input type="text" name="resellername" id="resellername" dir="rtl" style="margin-right:42px;" value="<?php echo $resellername ;?>" /><br style="clear:both" />  
                        <p>کد نمایندگی : (*)</p><input type="text" name="resellercode" id="resellercode" dir="ltr" style="margin-right:42px;" value="<?php echo $resellercode ;?>" /><br style="clear:both" />                    	
                        <p>شهر : (*)</p><input type="text" name="city" id="city" dir="rtl" style="margin-right:52px;" value="<?php echo $city ;?>" /><br style="clear:both" />
                        <p>آدرس : (*)</p><textarea name="address" id="address" style="margin-right:52px;"><?php echo $address ;?></textarea><br style="clear:both" />
                        
                        <br style="clear:both" /><hr style="width:100%; border-top:1px solid #ccc;" /><br style="clear:both" />
                        
                        <p>نام کاربری : (*)</p><input type="text" name="username" id="username" dir="ltr" style="margin-right:52px;background:#F3F3F3" value="<?php echo $username ;?>" disabled="disabled" /><br style="clear:both" /> 
                        <p style="margin-left:54px;">رمز عبور : (*)</p><input type="password" name="pass1" id="pass1" dir="ltr" onFocus="this.style='border:1px dashed #B0CEE1';" /><p style="color:#A8A8A8">(حداقل 5 کارکتر)</p><br style="clear:both" />
                        <p style="margin-left:31px; margin-bottom:7px;">تکرار رمز عبور : (*)</p><input type="password" name="pass2" id="pass2" dir="ltr" onFocus="this.style='border:1px dashed #B0CEE1;'" /><br style="clear:both" />
                        <p style="color:#A8A8A8; margin-right:130px">(در صورتیکه تمایلی به تغییر رمز عبور ندارید ، این قسمت را خالی بگذارید)</p>
                        
                        <br style="clear:both" /><br style="clear:both" />
                        
                        <br style="clear:both" /><hr style="width:100%; border-top:1px solid #ccc;" /><br style="clear:both" />
                        
                        <?php if($confirm=="0"){?>
                        <p>تایید حساب کاربری : (*)</p><br style="clear:both" />
                        <input type="radio" name="confirm" value="1" style="float:right; margin:13px 7px 0 0;" <?php if($confirm=="1"){echo 'checked="checked"'; }?> /><p>بله</p>
                        <input type="radio" name="confirm" value="0" style="float:right; margin:13px -15px 0 0;" <?php if($confirm=="0"){echo 'checked="checked"'; }?> /><p>خیر</p>
                        <?php }// ?>
                        
                        <br style="clear:both" /><br style="clear:both" />
                        <p>وضعیت حساب کاربری : (*)</p><br style="clear:both" />
                        <input type="radio" name="status" value="active" style="float:right; margin:13px 7px 0 0;" <?php if($status=='active'){echo 'checked="checked"'; }?> /><p>فعال</p>
                        <input type="radio" name="status" value="deactivated" style="float:right; margin:13px -15px 0 0;" <?php if($status!=='active'){echo 'checked="checked"'; }?> /><p>غیر فعال</p>
                        
                        <br style="clear:both" />
                        <br style="clear:both" /><hr style="width:100%; border-top:1px solid #ccc;" /><br style="clear:both" />
                        
                        <input type="submit" name="formsubmit" value="ویرایش کردن" class="addadmin_formsubmit fr" onClick="submit_check();" />
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