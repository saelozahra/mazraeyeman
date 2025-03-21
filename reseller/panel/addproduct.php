<?php
error_reporting(0);
session_start();
ob_start();

define("includesfile","true");
require("../includes/admin_functions.php");

adminlogin("","loginckeck");

$fileaddress = "addproduct";
if(adminmenus("checkaccess","admin")!=="1"){
	header("Location: index.php");
	exit;
}//EndIf


$page_sess = $_GET['sess'];
if(empty($page_sess) or $page_sess!==$_SESSION['adminlogin_session']){
	header("Location: productmanage.php");
	exit;
}//EndIf


$save_check = $_GET['save'];
if($save_check=="true"){

	$title = safe_enter($_POST['title']);
	$group = safe_enter($_POST['group']);
	$category_id = safe_enter($_POST['category']);
	$status = safe_enter($_POST['status']);
	
	$temp_min = safe_enter($_POST['temp_min']);
	$temp_max = safe_enter($_POST['temp_max']);
	$dewpoint_min = safe_enter($_POST['dewpoint_min']);
	$dewpoint_max = safe_enter($_POST['dewpoint_max']);
	$alert_txt = safe_enter($_POST['alert_txt']);
	////////////////////////////////////////
	$error_check = "";

	
	if(empty($title) or empty($group) or empty($category_id) or $category_id=="not" or empty($status)){
		echo '<img src="images/error4.png" style=" width:15px; height:15px; margin:0 0 -4px 5px;" /><b>خطا :</b> تکمیل موارد ستاره دار الزامی میباشد.';
		$error_check = "true";
		exit;
	}//EndIf
	
	if($status=="active"){
		$status = "active";
	}else{
		$status = "deactivated";	
	}//EndIF

	if(empty($error_check)){
		$category_id = intval($category_id);
		$result = db_query("SELECT `title` FROM `db_product_category` WHERE `id`='$category_id' LIMIT 1" , "select");
		if(mysqli_num_rows($result)==1){
			$row = mysqli_fetch_assoc($result);
			$category_txt = safe_enter($row['title']);
			if(db_query("INSERT INTO `db_product` (`id`, `title`, `group`, `category_id`, `category_txt`, `temp_min`, `temp_max`, `dewpoint_min`, `dewpoint_max`, `alert_txt`, `status`) VALUES (NULL, '$title', '$group', '$category_id', '$category_txt', '$temp_min', '$temp_max', '$dewpoint_min', '$dewpoint_max', '$alert_txt' , '$status');","insert")){
				adminlog("Add Product | Title=$title");
				echo '<img src="images/ok.png" style=" width:15px; height:15px; margin:0 0 -4px 5px;" /><b>تبریک! :</b> محصول جدید با موفقیت ثبت شد.';
				?>
                	<script>setTimeout("location.href='" + "<?php echo $fileaddress; ?>.php" + "'", 2000);</script>	
                <?php
			}//EndIF
		}else{
			echo '<img src="images/error.png" style=" width:15px; height:15px; margin:0 0 -4px 5px;" /><b>خطا! :</b> خطایی در ثبت اطلاعات رخ داد. لطفا مجددا اقدام نمایید..';
			exit;
		}//ENdIF							
	}//EndIF

	exit; 		
}//EndIF


?>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="fa" xml:lang="fa" dir="rtl">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta http-equiv="X-UA-Compatible" content="IE=edge" />
	<meta http-equiv="content-language" content="fa" />    
	<title>اضافه کردن محصول جدید</title>
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
			var title = document.getElementById('title').value;
			var group = document.getElementById('group').value;
			var status = $("input[name=status]:checked").val();

			
			if(isEmpty(title)==true || isEmpty(status)==true || group=="not"){	
				alert('خطا : تکمیل موارد ستاره دار الزامی میباشد.');
				error_result = "error";
			}//EndIf			
			
			if(isEmpty(error_result)==true){
				form_ajax();
			}else{
				form_ajax('false');
			}//EndIf	
		}//EndFunction	
		
		
		function categoryshow(){
			<?php
				$result = db_query("SELECT `id`,`title` FROM `db_product_category` WHERE `status`='active' AND `group`='group1'" , "select");
				if(mysqli_num_rows($result)>=1){
					$js_exit .= '<select name="category" id="group2" style="margin-right:22px;"><option value="not">-----</option>';
					while($row = mysqli_fetch_assoc($result)) {				
						$js_exit .= '<option value="'.intval($row['id']).'">'.safe_enter($row['title']).'</option>';
					}//EndWhile
					$js_exit .= '</select>';
				}else{
					$js_exit .= '<select name="category" id="group2" style="margin-right:22px;"><option value="">عدم ثبت اطلاعات</option></select>';
				}//EndIF
				echo "var gp1 ='" . $js_exit . "';";
				$js_exit = "";
			
				$result = db_query("SELECT `id`,`title` FROM `db_product_category` WHERE `status`='active' AND `group`='group2'" , "select");
				if(mysqli_num_rows($result)>=1){
					$js_exit .= '<select name="category" id="group2" style="margin-right:22px; "><option value="not">-----</option>';
					while($row = mysqli_fetch_assoc($result)) {				
						$js_exit .= '<option value="'.intval($row['id']).'">'.safe_enter($row['title']).'</option>';
					}//EndWhile
					$js_exit .= '</select>';
				}else{
					$js_exit .= '<select name="category" id="group2" style="margin-right:22px;"><option value="">عدم ثبت اطلاعات</option></select>';
				}//EndIF
				echo "var gp2 ='" . $js_exit . "';";
				$js_exit = "";
			?>

			var group = document.getElementById('group').value;
			var category_show = document.getElementById('category_show');
			if(group=="group1"){
				 category_show.innerHTML = gp1;
			}else{
				if(group!=="not"){
					category_show.innerHTML = gp2;
				}//EndIF				
			}//ENdIF
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
            <div class="bodydiv_item_title fr"><div><img src="images/icon6.png" />اضافه کردن محصول جدید</div></div>
            <div class="bodydiv_page_loading fr" id="bodydiv_page_loading"><img src="images/loading3.gif" /><p>در حال دریافت اطلاعات ...</p></div>
            <div class="bodydiv_item_body fr" id="bodydiv_item_body">            
                
            	<script>adminpage_loader(1);</script>
                
                <div class="addadmin_div fr">                     
                    <form id="form_ajax" method="post" action="addproduct.php?sess=<?php echo $page_sess; ?>&save=true" >
                    	<br style="clear:both" />
                    	<p>نام محصول : (*)</p><input type="text" name="title" id="title" dir="rtl" style="margin-right:22px;" /><p style="color:#ccc;">فارسی</p><br style="clear:both" />
                        <p>گروه : (*) </p><select name="group" id="group" style="margin-right:29px;" onChange="categoryshow();"><option value="not">-----</option><option value="group1">محصولات کشاورزی</option><option value="group2">دام و طیور و آبزیان پرورشی</option></select><br style="clear:both" />
						<p>دسته بندی : (*) </p>
						<div id="category_show"></div>

						
						<br style="clear:both" />
						<br style="clear:both" />
                        
                        <br style="clear:both" />
                        <br style="clear:both" /><hr style="width:100%; border-top:1px solid #ccc;" /><br style="clear:both" />
						
						
						
                        <br style="clear:both" />
						<p>حداقل دما : </p> <input type="number" name="temp_min" id="temp_min" dir="ltr" style="margin-right:43px; width: 100px;" />
						<p>حداکثر دما : </p> <input type="number" name="temp_max" id="temp_max" dir="ltr" style="margin-right:47px; width: 100px;" />
						<br style="clear:both" />
						<p>حداقل نقطه شبنم : </p> <input type="number" name="dewpoint_min" id="dewpoint_min" dir="ltr" style="margin-right:22px; width: 100px;" />
						<p>حداکثر نقطه شبنم : </p> <input type="number" name="dewpoint_max" id="dewpoint_max" dir="ltr" style="margin-right:22px; width: 100px;" />
						<br style="clear:both" />
						<p>پیام : </p><textarea name="alert_txt" id="alert_txt" style="margin-right:42px; width: 338px;"></textarea>
						<br style="clear:both" />
						
						
                        <br style="clear:both" /><hr style="width:100%; border-top:1px solid #ccc;" /><br style="clear:both" />
						
                        <p>وضعیت : (*)</p><br style="clear:both" />
                        <input type="radio" name="status" value="active" style="float:right; margin:13px 7px 0 0;" checked="checked" /><p>فعال</p>
                        <input type="radio" name="status" value="deactivated" style="float:right; margin:13px -15px 0 0;" /><p>غیر فعال</p>
                        
                        <br style="clear:both" />
                        <br style="clear:both" /><hr style="width:100%; border-top:1px solid #ccc;" /><br style="clear:both" />
                        
                        <input type="submit" name="formsubmit" value="اضافه کردن" class="addadmin_formsubmit fr" onClick="submit_check();" />
                    
                    
                    	<div id="form_ajax_result"></div>
                    </form>
                </div> <!--addcategory_div-->
                
            </div><!--bodydiv_item_body-->
            </div><!--bodydiv_item-->
                            
        </div><!--bodydiv-->    
    <br style="clear:both" />   
    </div><!--father_div-->
    
    
    <div class="footer_div">
    	<div class="copyrightright fr"><p class="cp_icon"></p> طراحی ، برنامه نویسی و پشتیبانی : ایوب قاسمی - 09379088085</div>
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