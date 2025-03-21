<?php
error_reporting(0);
session_start();
ob_start();

define("includesfile","true");
require("../includes/admin_functions.php");

adminlogin("","loginckeck");


$fileaddress = explode('.php', getfilename($_SERVER['REQUEST_URI']));
$fileaddress = reset($fileaddress);
if(adminmenus("checkaccess","reseller")!=="1"){
	header("Location: index.php");
	exit;
}//EndIf

$page_sess = $_GET['sess'];
if(empty($page_sess) or $page_sess!==$_SESSION['adminlogin_session']){
	header("Location: farmersmanage.php");
	exit;
}//EndIf

$act_check 	= $_GET['act'];
if($act_check=="upload"){
	if($admin_sess == $_SESSION['admin_session']){
		$file_name    = $_FILES["myfile"]["name"];
		$file_pasvand = substr($file_name,strlen($file_name)-4,4);
		$file_pasvand = str_replace(".","",$file_pasvand);
		$file_pasvand = strtolower($file_pasvand);
		$file_type    = $_FILES["myfile"]["type"];
		$tmp_name     = $_FILES["myfile"]["tmp_name"];
		$u_error      = $_FILES["myfile"]["error"];
		$file_size    = $_FILES["myfile"]["size"];
		$watermark_chk= $_POST['watermark'];
		
		if(empty($file_name)){
			echo "<div style=\"width:100%; float:right; text-align:right; direction:rtl; font-family:tahoma; font-size:12px; color:#000; margin:10px 0 0 0;\">
				<img src=\"images/error4.png\" style=\"float:right;margin:1px 0 0 5px\"><b style=\"color:red;\">خطا : لطفا یک فایل جهت آپلود انتخاب نمایید.</b></div>
				<script type=\"text/javascript\">window.top.window.loading('hide');</script>";
			exit;
		}//EndIF
		
		if($file_name==".htaccess" or $file_type=="application/octet-stream" or $file_pasvand=="html" or $file_pasvand=="php"){
			echo "<div style=\"width:100%; float:right; text-align:right; direction:rtl; font-family:tahoma; font-size:12px; color:#000; margin:10px 0 0 0;\">
					<img src=\"images/error4.png\" style=\"float:right;margin:1px 0 0 5px\"><b style=\"color:red;\">خطا : آپلود فایل مورد نظر امکان پذیر نمی باشد.</b></div>
					<script type=\"text/javascript\">window.top.window.loading('hide');</script>";
					exit;
		}//EndIf

		if(!empty($file_pasvand) and !empty($file_type)){
			$check_allow = array("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"=>"xlsx","	application/vnd.ms-excel"=>".xls");
			if($file_type !== array_search($file_pasvand,$check_allow)){
					echo "<div style=\"width:100%; float:right; text-align:right; direction:rtl; font-family:tahoma; font-size:12px; color:#000; margin:10px 0 0 0;\">
						<img src=\"images/error4.png\" style=\"float:right;margin:1px 0 0 5px\"><b style=\"color:red;\">خطا : آپلود فایل مورد نظر امکان پذیر نمی باشد.</b></div>
						<script type=\"text/javascript\">window.top.window.loading('hide');</script>";
					exit;
			}//EndIF			
		}else{
			echo "<div style=\"width:100%; float:right; text-align:right; direction:rtl; font-family:tahoma; font-size:12px; color:#000; margin:10px 0 0 0;\">
				<img src=\"images/error4.png\" style=\"float:right;margin:1px 0 0 5px\"><b style=\"color:red;\">خطا در آپلود فایل . لطفا مجددا اقدام نمایید.</b></div>
				<script type=\"text/javascript\">window.top.window.loading('hide');</script>";
			exit;	
		}//EndIF
		
		
		if($u_error == 0){
			$newname = time()."_".rand('100','3000');
			$address = "upload_files/" . $newname . "." . $file_pasvand;
			$moved = move_uploaded_file($tmp_name , $address);
			if($moved==true){
				
				
				echo "<script type=\"text/javascript\">function copyfileaddress(filename){localStorage.setItem(\"FileUploadName\",filename);alert('آدرس فایل در حافظه ذخیره شد.');}</script>

				<div style=\"width:100%;float:right;text-align:right;direction:rtl;font-family:tahoma;font-size:12px;color:#000;margin:10px 0 0 0;\">
					<img src=\"images/ok.png\" style=\"float:right;margin:1px 0 0 5px\"><b style=\"color:green;\">فایل با موفقیت آپلود شد.</b>
					<br style=\"clear:both\"><img src=\"images/ok.png\" style=\"float:right;margin:1px 0 0 5px\"><b style=\"color:green;\">
					".farmers_import_excel($newname.".".$file_pasvand)."</b>
					<div style=\"float:left;direction:ltr;color:green;cursor:pointer;\"><a onClick=\"copyfileaddress('".$newname . "." . $file_pasvand."');\"><b>FileName : </b>".$newname . "." . $file_pasvand."</a></div></div>
					<script type=\"text/javascript\">window.top.window.loading('hide');</script>";
					exit;
			}else{
				echo "<div style=\"width:100%; float:right; text-align:right; direction:rtl; font-family:tahoma; font-size:12px; color:#000; margin:10px 0 0 0;\"><img src=\"../images/error4.png\" style=\"float:right;margin:1px 0 0 5px\"><b style=\"color:red;\">خطا : آپلود فایل با خطا مواجه شد. مجددا امتحان کنید</b></div><script type=\"text/javascript\">window.top.window.loading('hide');</script>";
				exit;
			}//EndIF
		}else{
			echo "<div style=\"width:100%; float:right; text-align:right; direction:rtl; font-family:tahoma; font-size:12px; color:#000; margin:10px 0 0 0;\">
				<img src=\"../images/error4.png\" style=\"float:right;margin:1px 0 0 5px\"><b style=\"color:red;\">خطا : آپلود فایل با خطا مواجه شد. مجددا امتحان کنید</b></div>
				<script type=\"text/javascript\">window.top.window.loading('hide');</script>";
			exit;
		}//EndIF
	}//EndIF	
	@unlink($tmp_name);
	exit;
}//EndIF

?>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="fa" xml:lang="fa" dir="rtl">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta http-equiv="X-UA-Compatible" content="IE=edge" />
	<meta http-equiv="content-language" content="fa" />    
	<title>اضافه کردن گروهی کشاورزان</title>
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
	<style>	
.uploadfile_div { width:100%; min-height:100px; margin:45px 0 0 0; padding:0 0 10px 0; border:1px dotted #ccc;}
.uploadfile_div .itemtitle_div { width:400px; margin:-23px -1px 0 0; clear:both;}
.uploadfile_div .item_title { float:right; width:150px; height:23px; background:#f6f5fe; font-family:'BYekan'; font-size:14px; color:#666;
border:1px solid #eee;
-webkit-border-radius:5px;-moz-border-radius:5px;border-radius:5px;}
.upload_i_title_hover { float:right; width:150px; height:23px; background:#467fbb; color:#fff; cursor:pointer; font-family:'BYekan'; font-size:14px;
border:1px solid #eee;
-webkit-border-radius:5px;-moz-border-radius:5px;border-radius:5px;}
.uploadfile_div .item_1_div { width:600px; margin:20px 10px 0 0;  }
.uploadfile_div .item_2_div { width:618px; margin:20px 10px 0 0; display:none; padding-bottom:10px; }
.uploadfile_div p {  min-width:50px; height:20px; float:right; margin:5px 0 0 5px; text-align:right; font-family:'BYekan'; font-size:14px; color:#444;} 
.uploadfile_div input[type="file"] { width:227px; margin: 3px 0 0 0; padding: 5px;background: #F9FCFF; font-family: tahoma; font-size: 12px;font-weight: normal;color: #3F3F3F ;border: 1px dashed #B0CEE1;}
.uploadfile_div .frm_submit {float:right; width:100px; background:#59bd56; font-family:'BYekan'; font-size:13px; font-weight:bold; color:#fff; margin:0 195px 0 0px; padding:3px 0 5px 0; cursor:pointer; }
.uploadfile_div .frm_submit:hover {background:#049a00;}
.uploadpage_msg { width:600px; min-height:20px; margin:5px 0px 0 0; text-align:right; }
.uploadpage_msg iframe { float:right; width:100%; height:80px;}
#loading , #loading2{ display:none;}
.item_2_div .watermark { width:200px; height:100px; margin:0 10px 0 0; padding:5px; border:1px solid #ccc;}
.error_div { float:right; width:100%; height:20px; font-family:tahoma; font-size:12px; color:#666; margin:10px 0 0 0; }	

	</style>
    <script>
		function form_submit(){
			var myfile = document.getElementById("myfile").value;
			if(myfile==''){
			alert("خطا : تکمیل فیلد فایل الزامی میباشد.");
				return false;	
			}else{
				return true;
			}//EndIf			
		}//form_submit
		
		function loading(act){
			if(act=="show"){
				$("#loading").show("fast");
			}else{
				$("#loading").hide("fast");
			}
		}//loading
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
            <div class="logininfo_timer fr"><div></div><p><b>زمان باقيمانده :</b></p><p id="countbox1"></p><b onclick="LoginTimerReset();" style="cursor:pointer;">( بازبینی زمان )</b></div>
        </div><!--logininfo_div-->
        
		<div class="menudiv fr">        
			<?php
				require("_adminmenu.php");			
			?>                                
        </div><!--menudiv-->
        
        <div class="bodydiv fl">        
        	<div class="bodydiv_item fr">
            <div class="bodydiv_item_title fr"><div><img src="images/icon6.png" />اضافه کردن گروهی کشاورزان</div></div>
            <div class="bodydiv_page_loading fr" id="bodydiv_page_loading"><img src="images/loading3.gif" /><p>در حال دریافت اطلاعات ...</p></div>
            <div class="bodydiv_item_body fr" id="bodydiv_item_body">            
                
            	<script>adminpage_loader(1);</script>
                
				
				
				
				 <div class="uploadfile_div fr">
                    	<div class="itemtitle_div fr">
                        	<div id="i_title_1" class="item_title fr" onClick="show_i_div('1');">آپلود</div>
                        </div><!--itemtitle_div-->
                    	
                        <div class="item_1_div fr" id="item_1_div">
                        	<form action="addfarmersfile.php?sess=<?php echo $page_sess;?>&act=upload" method="post" enctype="multipart/form-data" target="upload-target" onSdubmit="return form_submit();">
                            	<br style="clear:both">
                            	<p>فایل :</p>
                                <input type="file" name="myfile" id="myfile" class="fr r5">
                                <br style="clear:both"><br style="clear:both">
                                <input type="hidden" name="sess" value="<?php echo $_SESSION['admin_session']; ?>">
                                <input type="submit" name="frm_submit" value="آپلود" class="frm_submit fr" onClick="loading('show');">
                                <div class="uploadpage_msg fr">
                                	<div id="loading">
                                    	<p style="font-size:12px"><img src="images/loading1.gif" draggable="false" style="float:right; margin:0 0 0 5px;">
                                    	در حال پردازش</p>
                                    </div><!--loading-->
                                	<iframe id="upload-target" name="upload-target" scrolling="no"></iframe>
                                </div><!--uploadpage_msg-->                           
                                
                                <br style="clear:both"><br style="clear:both">
                                <hr style="border-top:1px solid #ccc;">
								<a href="demo_farmers.xlsx"><p style="font-size:13px;">دانلود نمونه فایل</p></a>
                                <br style="clear:both">
                                <p style="font-size:13px;">فرمت های مجاز : xlsx , xls</p>
                                <br style="clear:both">
                                <p style="font-size:13px;">حداکثر حجم مجاز برای آپلود هر فایل در این هاست : <?php echo ini_get("upload_max_filesize"); ?></p>
                            </form>
                        </div><!--item_1_div-->
                    
                                    
                    </div><!--uploadfile_div-->
                
				
				
				
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