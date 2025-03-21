<?php
error_reporting(0);
session_start();
ob_start();

define("includesfile","true");
require("../includes/admin_functions.php");

adminlogin("","loginckeck");


$farmers_id = intval($_GET['id']);
$fileaddress = 'farmersmanage';
if(adminmenus("checkaccess","reseller")!=="1"){
	header("Location: index.php");
	exit;
}//EndIf

$page_sess = $_GET['sess'];
if(empty($page_sess) or $page_sess!==$_SESSION['adminlogin_session']){
	header("Location: farmersmanage.php");
	exit;
}//EndIf

$save_check = $_GET['save'];
if($save_check=="true"){
	
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
	$status = safe_enter($_POST['status']);
	$tell = safe_enter($_POST['tell']);
	$sh_bime = safe_enter($_POST['sh_bime']);
	$fathername = safe_enter($_POST['fathername']);
	////////////////////////////////////////
	$error_check = "";
	
	if(empty($name) or empty($nationalcode) or empty($mobile) or empty($state) or empty($city) or empty($address) or empty($location) or empty($unit) or empty($area) or empty($state)){
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
	
	
	if(empty($error_check)){
		$result = db_query("SELECT `username` FROM `db_farmers` WHERE `id`='$farmers_id' LIMIT 1" , "select");
		if(mysqli_num_rows($result)==1){
			
			if($status=="active"){
				$status = "active";
			}else{
				$status = "deactivated";	
			}//EndIF
			
			$password = hash_func($mobile);
			//$resellercode = intval($_SESSION['adminlogin_id']);
			
			if(db_query("UPDATE `db_farmers` SET `username` = '$mobile', `password` = '$password', `name` = '$name', `nationalcode` = '$nationalcode', `mobile` = '$mobile', `email` = '$email', `state` = '$state', `city` = '$city', `address` = '$address', `unit` = '$unit', `area` = '$area', `location` = '$location', `status` = '$status', `tell` = '$tell' , `sh_bime` = '$sh_bime' , `fathername` = '$fathername' WHERE `id` = '$farmers_id';","update")){
				adminlog("Add Farmers | User=$mobile");
				echo '<img src="images/ok.png" style=" width:15px; height:15px; margin:0 0 -4px 5px;" /><b>تبریک! :</b> کشاورز با موفقیت ویرایش شد.';
				?>
                	<script>setTimeout("location.href='" + "farmersmanage.php" + "'", 3000);</script>	
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
	$result = db_query("SELECT * FROM `db_farmers` WHERE `id`='$farmers_id' LIMIT 1" , "select");
		if(mysqli_num_rows($result)==1){
			while($row = mysqli_fetch_assoc($result)) {				
				$name = safe_enter($row['name']);
				$nationalcode = safe_enter($row['nationalcode']);
				$mobile = safe_enter($row['mobile']);
				$email = safe_enter($row['email']);
				$state = safe_enter($row['state']);
				$city = safe_enter($row['city']);
				$address = safe_enter($row['address']);
				$location = safe_enter($row['location']);
				$unit = safe_enter($row['unit']);
				$area = safe_enter($row['area']);
				$status = safe_enter($row['status']);
				$fathername = safe_enter($row['fathername']);
				$tell = safe_enter($row['tell']);
				$sh_bime = safe_enter($row['sh_bime']);
			}//EndWhile
		}else{
			header("Location: farmersmanage.php");
		}//EndIF	
}//EndIf
?>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="fa" xml:lang="fa" dir="rtl">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta http-equiv="X-UA-Compatible" content="IE=edge" />
	<meta http-equiv="content-language" content="fa" />    
	<title>ویرایش کردن کشاورز</title>
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
			form_ajax('false');
			var name = document.getElementById('name').value;
			var nationalcode = document.getElementById('nationalcode').value;
			var mobile = document.getElementById('mobile').value;
			var email = document.getElementById('email').value;
			var state = document.getElementById('state').value;
			var city = document.getElementById('city').value;
			var address = document.getElementById('address').value;
			var location = document.getElementById('location').value;
			var unit = document.getElementById('unit').value;
			var area = document.getElementById('area').value;
			var status = $("input[name=status]:checked").val();

			
			if(isEmpty(name)==true || isEmpty(nationalcode)==true || isEmpty(mobile)==true || isEmpty(state)==true || isEmpty(city)==true || isEmpty(address)==true || isEmpty(location)==true || isEmpty(unit)==true || isEmpty(area)==true || isEmpty(status)==true){	
				alert('خطا : تکمیل موارد ستاره دار الزامی میباشد.');
				error_result = "error";
			}//EndIf
				
			if(isEmpty(error_result)==true){
				if(nationalcode.length < 10){
					alert('خطا : کد ملی وارد شده کمتر از 10 کارکتر میباشد.');
					error_result = "error";		
				}//ENdIF
				if(mobile.length < 11){
					alert('خطا : تلفن همراه وارد شده کمتر از 11 کارکتر میباشد.');
					error_result = "error";		
				}//ENdIF
				if(isEmpty(email)==false && validateEmail(email)==false){
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
            <div class="bodydiv_item_title fr"><div><img src="images/icon6.png" />ویرایش کردن کشاورز</div></div>
            <div class="bodydiv_page_loading fr" id="bodydiv_page_loading"><img src="images/loading3.gif" /><p>در حال دریافت اطلاعات ...</p></div>
            <div class="bodydiv_item_body fr" id="bodydiv_item_body">            
                
            	<script>adminpage_loader(1);</script>
  
               <div class="addadmin_div fr">
                    <form id="form_ajax" method="post" action="editfarmers.php?sess=<?php echo $page_sess; ?>&id=<?php echo $farmers_id; ?>&save=true">
                    	<p>نام و نام خانوادگی : (*)</p><input type="text" name="name" id="name" dir="rtl" style="margin-right:14px;" value="<?php echo $name; ?>" /><p style="color:#A8A8A8">(فارسی)</p><br style="clear:both" />     
						<p>نام پدر : </p><input type="text" name="fathername" id="fathername" dir="rtl" style="margin-right:52px;" value="<?php echo $fathername; ?>" /><p style="color:#A8A8A8">(فارسی)</p><br style="clear:both" />   
						<p>کد ملی : (*)</p><input type="number" name="nationalcode" id="nationalcode" dir="ltr" style="margin-right:52px;" value="<?php echo $nationalcode; ?>" /><br style="clear:both" />    
                        <p>تلفن همراه : (*)</p><input type="number" name="mobile" id="mobile" dir="ltr" style="margin-right:46px;" value="<?php echo $mobile; ?>" /><p style="color:#A8A8A8">(نمونه : 09170001234)</p><br style="clear:both" />
						<p>تلفن ثابت :</p><input type="number" name="tell" id="tell" dir="ltr" style="margin-right:52px;"  value="<?php echo $tell; ?>"/><br style="clear:both" />
                        <p style="margin-left:52px;">ایمیل : </p><input type="text" name="email" id="email" dir="ltr" onFocus="this.style='border:1px dashed #B0CEE1;'" value="<?php echo $email; ?>" /><br style="clear:both" />
						<p style="margin-left:52px;">شماره بیمه : </p><input type="text" name="sh_bime" id="sh_bime" dir="ltr" onFocus="this.style='border:1px dashed #B0CEE1;'" value="<?php echo $sh_bime; ?>" /><br style="clear:both" />
                        
                        <br style="clear:both" /><hr style="width:99%; border-top:1px solid #ccc;" /><br style="clear:both" />
						
						<p>استان : (*)</p><input type="text" name="state" id="state" dir="rtl" style="margin-right:52px;" value="<?php echo $state; ?>" /><br style="clear:both" /> 
						<p>شهر : (*)</p><input type="text" name="city" id="city" dir="rtl" style="margin-right:52px;" value="<?php echo $city; ?>" /><br style="clear:both" /> 
						<p>آدرس : (*)</p><textarea name="address" id="address" style="margin-right:52px;"><?php echo $address; ?></textarea><br style="clear:both" />
						<br style="clear:both" />
						<p>موقعیت جغرافیایی : (*)</p><input type="text" name="location" id="location" dir="rtl" style="margin-right:12px;" value="<?php echo $location; ?>" /><br style="clear:both" /> 
						
						<p>واحد : (*)</p><select name="unit" id="unit" style="margin-right:52px;"><option value="hectare" <?php if($unit=="hectare"){echo "selected";} ?>>هکتار</option><option value="meter" <?php if($unit=="meter"){echo "selected";} ?>>متر مربع</option></select><br style="clear:both" />
						<p>مساحت : (*)</p><input type="number" name="area" id="area" dir="ltr" style="margin-right:52px;" value="<?php echo $area; ?>" /><br style="clear:both" /> 
						
						 <br style="clear:both" /><hr style="width:99%; border-top:1px solid #ccc;" /><br style="clear:both" />
                        
                        <p>نام کاربری : (*)</p><input type="text" name="username" id="username" style="margin-right:52px;" value="شماره موبایل" disabled /><br style="clear:both" /> 
                        <p style="margin-left:54px;">رمز عبور : (*)</p><input type="text" name="pass1" id="pass1" value="َشماره موبایل"  disabled /><br style="clear:both" />
                        
                        <br style="clear:both" /><br style="clear:both" />
                        
                        <br style="clear:both" /><hr style="width:100%; border-top:1px solid #ccc;" /><br style="clear:both" />
                        
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