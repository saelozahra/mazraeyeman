<?php
error_reporting(0);
session_start();
ob_start();

define("includesfile","true");
require("../includes/admin_functions.php");

adminlogin("","loginckeck");

$fileaddress = "productfarmers";
if(adminmenus("checkaccess","admin")!=="1"){
	header("Location: index.php");
	exit;
}//EndIf


$page_sess = $_GET['sess'];
$farmersproduct_id = intval($_GET['id']);
if(empty($page_sess) or $page_sess!==$_SESSION['adminlogin_session'] or empty($farmersproduct_id)){
	header("Location: productfarmers.php");
	exit;
}//EndIf

$save_check = $_GET['save'];
if($save_check=="true"){
	
	//$category = safe_enter($_POST['category']);
	//$product = safe_enter($_POST['product']);
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
	$status = safe_enter($_POST['status']);
	
	$vazn = safe_enter($_POST['vazn']);
	$ghimat = safe_enter($_POST['ghimat']);
	$zaman_eraa = safe_enter($_POST['zaman_eraa']);
	$des = safe_enter($_POST['des']);
	$bazarche = safe_enter($_POST['bazarche']);
	////////////////////////////////////////
	$error_check = "";

	if(empty($zaman_kasht) or empty($sen_mahsol) or empty($vahed) or empty($masahat) or empty($khak) or empty($abyari) or empty($zaman_kesht) or empty($fasele_kesht) or empty($khoroji_chah) or empty($fasele_radif) or empty($fasele_roshd) or empty($goldehi_derakhtan) or empty($tavarom_javane) or empty($status)){
		echo '<img src="images/error4.png" style=" width:15px; height:15px; margin:0 0 -4px 5px;" /><b>خطا :</b> تکمیل موارد ستاره دار الزامی میباشد.';
		$error_check = "true";
		exit;
	}//EndIF	
	
	
	if($_POST['category']=="not" or $_POST['product']=="not"){
		echo '<img src="images/error4.png" style=" width:15px; height:15px; margin:0 0 -4px 5px;" /><b>خطا :</b> در ارسال دسته بندی یا محصول خطایی رخ داد.';
		$error_check = "true";
		exit;
	}//EndIf


	if(empty($error_check)){
		if(db_query("UPDATE `db_product_farmers` SET `zaman_kasht` = '$zaman_kasht', `sen_mahsol` = '$sen_mahsol', `vahed` = '$vahed', `masahat` = '$masahat', `khak` = '$khak', `abyari` = '$abyari', `zaman_kesht` = '$zaman_kesht', `fasele_kesht` = '$fasele_kesht', `khoroji_chah` = '$khoroji_chah', `fasele_radif` = '$fasele_radif', `fasele_roshd` = '$fasele_roshd', `goldehi_derakhtan` = '$goldehi_derakhtan', `tavarom_javane` = '$tavarom_javane', `vazn` = '$vazn', `ghimat` = '$ghimat', `zaman_eraa` = '$zaman_eraa', `des` = '$des', `bazarche` = '$bazarche' , `status` = '$status' WHERE `id` = '$farmersproduct_id';","update")){
			adminlog("Edit ProductFarmers | User=$admin_user | Id = $farmersproduct_id");
			echo '<img src="images/ok.png" style="width:15px; height:15px; margin:0 0 -4px 5px;" /><b>تبریک! :</b> محصول کشاورز با موفقیت ویرایش شد.';
			?>
				<script>setTimeout("location.href='" + "productfarmers.php" + "'", 3000);</script>	
			<?php
		}//EndIF
	}//EndIF
	exit;
}else{
	$result = db_query("SELECT * FROM `db_product_farmers` WHERE `id`='$farmersproduct_id' LIMIT 1" , "select");
		if(mysqli_num_rows($result)==1){
			while($row = mysqli_fetch_assoc($result)) {	
				$group = safe_enter($row['group']);
				$category_id = safe_enter($row['category']);
				$product_id = safe_enter($row['product']);
				$zaman_kasht = safe_enter($row['zaman_kasht']);
				$sen_mahsol = safe_enter($row['sen_mahsol']);
				$vahed = safe_enter($row['vahed']);
				$masahat = safe_enter($row['masahat']);
				$khak = safe_enter($row['khak']);
				$abyari = safe_enter($row['abyari']);
				$zaman_kesht = safe_enter($row['zaman_kesht']);
				$fasele_kesht = safe_enter($row['fasele_kesht']);
				$khoroji_chah = safe_enter($row['khoroji_chah']);
				$fasele_radif = safe_enter($row['fasele_radif']);
				$fasele_roshd = safe_enter($row['fasele_roshd']);
				$goldehi_derakhtan = safe_enter($row['goldehi_derakhtan']);
				$tavarom_javane = safe_enter($row['tavarom_javane']);
				$status = safe_enter($row['status']);
				$reseller_code = intval($row['f_res_code']);
				
				$vazn = safe_enter($row['vazn']);
				$ghimat = safe_enter($row['ghimat']);
				$zaman_eraa = safe_enter($row['zaman_eraa']);
				$des = safe_enter($row['des']);
				$bazarche = safe_enter($row['bazarche']);
				$moaref = safe_enter($row['moaref']);
			}//EndWhile
			
			if(!empty($reseller_code) and $reseller_code!=="0"){
				$result = db_query("SELECT `id`,`resellername` FROM `db_member` WHERE `id`='$reseller_code' LIMIT 1" , "select");
				if(mysqli_num_rows($result)==1){
					while($row = mysqli_fetch_assoc($result)) {	
						$resellername = safe_enter($row['resellername']);
					}//EndWhile
				}//EndIF
			}//EndIF
		}else{
			header("Location: productfarmers.php");
		}//EndIF	
}//EndIf
?>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="fa" xml:lang="fa" dir="rtl">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta http-equiv="X-UA-Compatible" content="IE=edge" />
	<meta http-equiv="content-language" content="fa" />    
	<title>ویرایش محصول کشاورز</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1,maximum-scale=1,user-scalable=no">
	<meta name="robots" content="noindex, nofollow" />    
	<link rel="shortcut icon" href="images/favicon.png" />
    <link rel="icon" type="image/x-icon" href="images/favicon.png" />
	<link rel="stylesheet" type="text/css" href="css/page.css" />
	<link rel="stylesheet" href="css/calendar-blue.css" />
	<script type="text/javascript" src="js/jquery-1.11.0.min.js"></script> 
	<script type="text/javascript" src="js/calender.js"></script>
    <script type="text/javascript" src="js/ajax.js"></script>
 <!--[if lt IE 9]>  
    	<script src="js/html5.js"></script>  
    	<script src="js/css3-mediaqueries.js"></script>  
  	<![endif]--> 
	<script>	
				
		function submit_check(){
			form_ajax();
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
            <div class="bodydiv_item_title fr"><div><img src="images/icon6.png" />ویرایش محصول کشاورز</div></div>
            <div class="bodydiv_page_loading fr" id="bodydiv_page_loading"><img src="images/loading3.gif" /><p>در حال دریافت اطلاعات ...</p></div>
            <div class="bodydiv_item_body fr" id="bodydiv_item_body">            
                
            	<script>adminpage_loader(1);</script>
				
               <div class="addadmin_div fr">
                    <form id="form_ajax" method="post" action="editproductfarmers.php?sess=<?php echo $page_sess."&id=".$farmersproduct_id; ?>&save=true">

						<p>گروه : (*) </p><select name="group" id="group" style="margin-right:67px;" disabled><option value="not">-----</option><option value="group1" <?php if($group=="group1"){echo "selected";};?>>محصولات کشاورزی</option><option value="group2" <?php if($group=="group2"){echo "selected";};?>>دام و طیور و آبزیان پرورشی</option></select><br style="clear:both" />
						
                    	<p>دسته بندی : (*) </p>
						<div id="category_show">
						<?php
							$result = db_query("SELECT `id`,`title` FROM `db_product_category` WHERE `status`='active' AND `group`='$group'" , "select");
							if(mysqli_num_rows($result)>=1){
								$cate_exit .= '<select name="category" id="category" style="margin-right:60px;" disabled><option value="not">-----</option>';
								while($row = mysqli_fetch_assoc($result)) {	
									if($category_id==$row['id']){
										$selected = "selected";	
									}//ENdIF
									
									$cate_exit .= '<option value="'.intval($row['id']).'" '.$selected.'>'.safe_enter($row['title']).'</option>';
									$selected = "";	
								}//EndWhile
								$cate_exit .= '</select>';
							}else{
								$cate_exit .= '<select name="category" id="category" style="margin-right:60px;"><option value="not">عدم ثبت اطلاعات</option></select>';
							}//EndIF
							echo $cate_exit;
						?>
						</div><br style="clear:both" />
						
						
						<p>محصول : (*) </p>
						<div id="product_show">
						<?php
							$result = db_query("SELECT `id`,`title` FROM `db_product` WHERE `status`='active' AND `group`='$group'" , "select");
							if(mysqli_num_rows($result)>=1){
								$product_exit .= '<select name="product" id="product" style="margin-right:68px;" disabled><option value="not">-----</option>';
								while($row = mysqli_fetch_assoc($result)) {	
									if($product_id==$row['id']){
										$selected = "selected";	
									}//ENdIF
									
									$product_exit .= '<option value="'.intval($row['id']).'" '.$selected.'>'.safe_enter($row['title']).'</option>';
									$selected = "";	
								}//EndWhile
								$product_exit .= '</select>';
							}else{
								$product_exit .= '<select name="product" id="product" style="margin-right:68px;"><option value="not">عدم ثبت اطلاعات</option></select>';
							}//EndIF
							echo $product_exit;
						?>
						</div><br style="clear:both" />
						
						
                        <p>زمان کاشت : (*)</p><input type="text" name="zaman_kasht" id="f_date_s" dir="ltr" style="margin-right:60px;" value="<?php echo $zaman_kasht ;?>" />
                        <img src="images/date.png" style="margin:10px 10px 0 0;cursor:pointer" id="f_trigger_s" class="fr" draggable="false"><br style="clear:both" />
                        <p>سن محصول : (*)</p><input type="number" name="sen_mahsol" id="sen_mahsol" dir="ltr" style="margin-right:57px;" value="<?php echo $sen_mahsol ;?>" /><br style="clear:both" />
                        <p>واحد : (*)</p><select name="vahed" id="vahed" style="margin-right:66px;"><option value="hectare" <?php if($vahed=="hectare"){echo "selected";} ?>>هکتار</option><option value="meter" <?php if($vahed=="meter"){echo "selected";} ?>>متر مربع</option></select><br style="clear:both" />
                        <p>مساحت تحت کشت : (*)</p><input type="number" name="masahat" id="masahat" dir="ltr" style="margin-right:24px;" value="<?php echo $masahat ;?>" /><br style="clear:both" />
						
                        <p>نوع خاک : (*)</p>
						<select name="khak" id="khak" style="margin-right:66px;"><option value="rosi" <?php if($khak=="rosi"){echo "selected";};?>>رسی</option><option value="sheni" <?php if($khak=="sheni"){echo "selected";};?>>شنی</option><option value="rosisilti" <?php if($khak=="rosisilti"){echo "selected";};?>>رسی سیلتی</option><option value="rosisheni" <?php if($khak=="rosisheni"){echo "selected";};?>>رسی شنی</option></select><br style="clear:both" />
						
                        <p>نوع آبیاری : (*)</p><select name="abyari" id="abyari" style="margin-right:66px;"><option value="gharghabi" <?php if($abyari=="gharghabi"){echo "selected";};?>>غرقابی</option><option value="ghateai" <?php if($abyari=="ghateai"){echo "selected";};?>>قطره ای</option><option value="deim" <?php if($abyari=="deim"){echo "selected";};?>>دیم</option><option value="barani" <?php if($abyari=="barani"){echo "selected";};?>>بارانی</option></select><br style="clear:both" />
						
                        <p>زمان کشت : (*)</p><input type="text" name="zaman_kesht" id="f_date_s2" dir="ltr" style="margin-right:64px;" value="<?php echo $zaman_kesht ;?>" />
                        <img src="images/date.png" style="margin:10px 10px 0 0;cursor:pointer" id="f_trigger_s2" class="fr" draggable="false"><br style="clear:both" />
						
						<p style="margin-left:58px;">فاصله کشت : (*)</p><input type="number" name="fasele_kesht" id="fasele_kesht" dir="ltr"  value="<?php echo $fasele_kesht ;?>" /><p style="color:#A8A8A8">متر</p><br style="clear:both" />
						<p style="margin-left:52px;">دبی خروج چاه : (*)</p><input type="number" name="khoroji_chah" id="khoroji_chah" dir="ltr"  value="<?php echo $khoroji_chah ;?>" /><p style="color:#A8A8A8">اینچ</p><br style="clear:both" />
						<p style="margin-left:58px;">فاصله ردیف : (*)</p><input type="number" name="fasele_radif" id="fasele_radif" dir="ltr"  value="<?php echo $fasele_radif ;?>" /><p style="color:#A8A8A8">متر</p><br style="clear:both" />
						<p>زمان فصل رشد : (*)</p><input type="text" name="fasele_roshd" id="f_date_s3" dir="ltr" style="margin-right:42px;" value="<?php echo $fasele_roshd ;?>" />
                        <img src="images/date.png" style="margin:10px 10px 0 0;cursor:pointer" id="f_trigger_s3" class="fr" draggable="false"><br style="clear:both" />
						<p>زمان گلدهی درخت : (*)</p><input type="text" name="goldehi_derakhtan" id="f_date_s4" dir="ltr" style="margin-right:27px;" value="<?php echo $goldehi_derakhtan ;?>" />
                        <img src="images/date.png" style="margin:10px 10px 0 0;cursor:pointer" id="f_trigger_s4" class="fr" draggable="false"><br style="clear:both" />
						<p>زمان بازشدن درخت : (*)</p><input type="text" name="tavarom_javane" id="f_date_s5" dir="ltr" style="margin-right:22px;" value="<?php echo $tavarom_javane ;?>" />
                        <img src="images/date.png" style="margin:10px 10px 0 0;cursor:pointer" id="f_trigger_s5" class="fr" draggable="false"><p style="color:#A8A8A8">تورم جوانه</p><br style="clear:both" />
						
                        <br style="clear:both" /><hr style="width:100%; border-top:1px solid #ccc;" /><br style="clear:both" />
                         
                        <p>کد نمایندگی : </p><input type="number" name="reseller_code" id="reseller_code" dir="ltr" style="margin-right:71px;" value="<?php echo $reseller_code ;?>" disabled /><br style="clear:both" />
						<p>نام نمایندگی : </p><input type="text" name="resellername" id="resellername" dir="rtl" style="margin-right:70px;" value="<?php echo $resellername ;?>" disabled /><br style="clear:both" />         
                        
                        <br style="clear:both" /><hr style="width:100%; border-top:1px solid #ccc;" /><br style="clear:both" />
						
						<p style="margin-left:62px;">وزن قابل ارایه : </p><input type="number" name="vazn" id="vazn" dir="ltr"  value="<?php echo $vazn ;?>" /><p style="color:#A8A8A8">کیلوگرم / تن</p><br style="clear:both" />
						<p style="margin-left:69px;">قیمت واحد : </p><input type="number" name="ghimat" id="ghimat" dir="ltr"  value="<?php echo $ghimat ;?>" /><br style="clear:both" />
						<p style="margin-left:68px;">زمان ارایه : </p><input type="text" name="zaman_eraa" id="f_date_s6" dir="ltr"  value="<?php echo $zaman_eraa ;?>" /><img src="images/date.png" style="margin:10px 10px 0 0;cursor:pointer" id="f_trigger_s6" class="fr" draggable="false"><br style="clear:both" />
						<p>توضیحات : </p><input type="text" name="des" id="des" dir="rtl" style="margin-right:69px;" value="<?php echo $des ;?>" /><br style="clear:both" /><br style="clear:both" />
						<p>نمایش در بازارچه : </p><br style="clear:both" />
                        <input type="radio" name="bazarche" value="yes" style="float:right; margin:13px 7px 0 0;" <?php if($bazarche=='yes'){echo 'checked="checked"'; }?> /><p>بله</p>
                        <input type="radio" name="bazarche" value="no" style="float:right; margin:13px -15px 0 0;" <?php if($bazarche=='no'){echo 'checked="checked"'; }?> /><p>خیر</p><br style="clear:both" />
						
						<br style="clear:both" /><hr style="width:100%; border-top:1px solid #ccc;" /><br style="clear:both" />
						 <p>افراد معرفی شده : </p><input type="number" name="moaref" id="moaref" dir="ltr" style="margin-right:50px;" value="<?php echo $moaref ;?>" disabled /><br style="clear:both" />
						<br style="clear:both" /><hr style="width:100%; border-top:1px solid #ccc;" /><br style="clear:both" />
                        
                        <p>وضعیت : (*)</p><br style="clear:both" />
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
    
	<script type="text/javascript">
		Calendar.setup({
			inputField     :    "f_date_s", 
			ifFormat       :    "%Y-%m-%d",  
			button         :    "f_trigger_s", 
			align          :    "Br",           
			dateType	   :	"jalali",
			timeFormat     :    "24",
			showsTime      :    false,
			singleClick    :    true
		});
		Calendar.setup({
			inputField     :    "f_date_s2", 
			ifFormat       :    "%Y-%m-%d",  
			button         :    "f_trigger_s2", 
			align          :    "Br",           
			dateType	   :	"jalali",
			timeFormat     :    "24",
			showsTime      :    false,
			singleClick    :    true
		});
		Calendar.setup({
			inputField     :    "f_date_s3", 
			ifFormat       :    "%Y-%m-%d",  
			button         :    "f_trigger_s3", 
			align          :    "Br",           
			dateType	   :	"jalali",
			timeFormat     :    "24",
			showsTime      :    false,
			singleClick    :    true
		});
		Calendar.setup({
			inputField     :    "f_date_s4", 
			ifFormat       :    "%Y-%m-%d",  
			button         :    "f_trigger_s4", 
			align          :    "Br",           
			dateType	   :	"jalali",
			timeFormat     :    "24",
			showsTime      :    false,
			singleClick    :    true
		});
		Calendar.setup({
			inputField     :    "f_date_s5", 
			ifFormat       :    "%Y-%m-%d",  
			button         :    "f_trigger_s5", 
			align          :    "Br",           
			dateType	   :	"jalali",
			timeFormat     :    "24",
			showsTime      :    false,
			singleClick    :    true
		});
		Calendar.setup({
			inputField     :    "f_date_s6", 
			ifFormat       :    "%Y-%m-%d",  
			button         :    "f_trigger_s6", 
			align          :    "Br",           
			dateType	   :	"jalali",
			timeFormat     :    "24",
			showsTime      :    false,
			singleClick    :    true
		});
    </script>  
    
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