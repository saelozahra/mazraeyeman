<?php
error_reporting(0);
session_start();
ob_start();

define("includesfile","true");
require("../includes/admin_functions.php");

adminlogin("","loginckeck");


$fileaddress = "product_cate_manage";
if(adminmenus("checkaccess",$fileaddress)!=="1"){
	header("Location: index.php");
	exit;
}//EndIf


$page_sess = $_GET['sess'];
$category_id = intval($_GET['id']);
if(empty($page_sess) or $page_sess!==$_SESSION['adminlogin_session'] or empty($category_id)){
	header("Location: product_cate_manage.php");
	exit;
}//EndIf


$save_check = $_GET['save'];
if($save_check=="true"){

	$title = safe_enter($_POST['title']);
	$group = safe_enter($_POST['group']);
	$status = safe_enter($_POST['status']);
	////////////////////////////////////////
	$error_check = "";

	
	if(empty($title) or empty($group) or empty($status)){
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
	
		if(db_query("UPDATE `db_product_category` SET `title` = '$title' ,`group` = '$group', `status` = '$status' WHERE `id` = $category_id;","update")){
			adminlog("Edit ProductCategory | Title=$title | Id = $category_id");
			echo '<img src="images/ok.png" style=" width:15px; height:15px; margin:0 0 -4px 5px;" /><b>تبریک! :</b> دسته بندی با موفقیت ویرایش شد.';
			?>
				<script>setTimeout("location.href='" + "<?php echo $fileaddress; ?>.php" + "'", 2000);</script>	
			<?php
		}//EndIF						
		
	}//EndIF

	exit; 		
}else{
	$result = db_query("SELECT * FROM `db_product_category` WHERE `id`='$category_id'" , "select");
		if(mysqli_num_rows($result)==1){
			while($row = mysqli_fetch_assoc($result)) {				
				$title = safe_enter($row['title']);
				$group = safe_enter($row['group']);
				$status= safe_enter($row['status']);
			}//EndWhile
		}else{
			header("Location: product_cate_manage.php");
		}//EndIF	

}//EndIF
?>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="fa" xml:lang="fa" dir="rtl">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta http-equiv="X-UA-Compatible" content="IE=edge" />
	<meta http-equiv="content-language" content="fa" />    
	<title>ویرایش کردن دسته بندی</title>
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
			var group = document.getElementById('title').value;
			var status = $("input[name=status]:checked").val();

			if(isEmpty(title)==true || isEmpty(status)==true || isEmpty(group)==true){	
				alert('خطا : تکمیل موارد ستاره دار الزامی میباشد.');
				error_result = "error";
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
            <div class="bodydiv_item_title fr"><div><img src="images/icon6.png" />ویرایش کردن دسته بندی</div></div>
            <div class="bodydiv_page_loading fr" id="bodydiv_page_loading"><img src="images/loading3.gif" /><p>در حال دریافت اطلاعات ...</p></div>
            <div class="bodydiv_item_body fr" id="bodydiv_item_body">            
                
            	<script>adminpage_loader(1);</script>
                
                
                <div class="addadmin_div fr">                     
                    <form id="form_ajax" method="post" action="editproductcategory.php?sess=<?php echo $page_sess; ?>&id=<?php echo $category_id;?>&save=true" >
                    	<br style="clear:both" />
                    	<p>نام دسته بندی : (*)</p><input type="text" name="title" id="title" dir="rtl" style="margin-right:14px;" value="<?php echo $title;?>" /><p style="color:#ccc;">فارسی</p><br style="clear:both" />
                        <p>نام دسته بندی : </p><select name="group" id="group" style="margin-right:31px;"><option value="group1" >محصولات کشاورزی</option><option value="group2" <?php if($group=='group2'){echo 'selected'; }?> >دام و طیور و آبزیان پرورشی</option></select><br style="clear:both" /> 
                        
                        <br style="clear:both" />
                        <br style="clear:both" /><hr style="width:100%; border-top:1px solid #ccc;" /><br style="clear:both" />
                        
                        <p>وضعیت : (*)</p><br style="clear:both" />
                        <input type="radio" name="status" value="active" style="float:right; margin:13px 7px 0 0;" <?php if($status=='active'){echo 'checked="checked"'; }?> /><p>فعال</p>
                        <input type="radio" name="status" value="deactivated" style="float:right; margin:13px -15px 0 0;" <?php if($status!=='active'){echo 'checked="checked"'; }?> /><p>غیر فعال</p>
                        
                        <br style="clear:both" />
                        <br style="clear:both" /><hr style="width:100%; border-top:1px solid #ccc;" /><br style="clear:both" />
                        
                        <input type="submit" name="formsubmit" value="ویرایش کردن" class="addadmin_formsubmit fr" onClick="submit_check();" />
                    
                    
                    	<div id="form_ajax_result"></div>
                    </form>
                </div><!--addcategory_div-->
                
                
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