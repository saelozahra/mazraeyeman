<?php
error_reporting(0);
session_start();
ob_start();

define("includesfile","true");
require("../includes/admin_functions.php");

adminlogin("","loginckeck");


$fileaddress = "sendMsg";
if(adminmenus("checkaccess",$fileaddress)!=="1"){
	header("Location: index.php");
	exit;
}//EndIf

$page_sess = $_GET['sess'];
if(empty($page_sess) or $page_sess!==$_SESSION['adminlogin_session']){
	header("Location: postmanage.php");
	exit;
}//EndIf

$save_check = $_GET['save'];
if($save_check=="true"){

	$title = 	safe_enter($_POST['title']);
	$type = 	safe_enter($_POST['type']);
	$text1 = 	safe_enter($_POST['text1']);
	$to = 		safe_enter($_POST['to']);
	$publisher =intval($_SESSION['adminlogin_id']);
	////////////////////////////////////////
	$error_check = "";

	
	//اگه خطای موارد الزامی داد
	if(empty($title) or $type=="not" or empty($text1)){
		echo '<img src="images/error4.png" style=" width:15px; height:15px; margin:0 0 -4px 5px;" /><b>خطا :</b> تکمیل موارد ستاره دار الزامی میباشد.';
		$error_check = "true";
		exit;
	}//EndIf
	


	//پس از ارسال پیام موفق
	if(empty($error_check)){
		
		if ($type=="msg"){
			sendSms($to,$title,$text1);
		}elseif($type=="notification"){
			sendPushNotification($to,$title,$text1,$action="topic");
		}elseif($type=="msgandnotification"){
			sendSms($to,$title,$text1);
			sendPushNotification($to,$title,$text1,$action="topic");
		}

		if(db_query("INSERT INTO `db_msg` (`title`, `type`, `text`, `to_who`, `sender`) VALUES ('$title', '$type', '$text1', '$publisher');","insert")){
			adminlog("Add Msg | Title=$title");
			echo '<img src="images/ok.png" style=" width:15px; height:15px; margin:0 0 -4px 5px;" /><b>تبریک! :</b> پیام با موفقیت ارسال شد.';
			?>
				<script>setTimeout("location.href='" + "<?php echo $fileaddress; ?>.php" + "'", 2000);</script>	
			<?php
		}//EndIF		
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
	<title>ارسال پیام جدید</title>
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
			var type = $("select[name=type]:enabled").val();
			var text1 = document.getElementById('text1').value;
			var to = $("select[name=to]:enabled").val();
			
			//alert(title+"  -   "+type+"  -   "+text1+"  -   "+to);

			if(isEmpty(title)==true || isEmpty(text1)==true || to==""){	
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
            <div class="bodydiv_item_title fr"><div><img src="images/icon6.png" />ارسال پیام جدید</div></div>
            <div class="bodydiv_page_loading fr" id="bodydiv_page_loading"><img src="images/loading3.gif" /><p>در حال دریافت اطلاعات ...</p></div>
            <div class="bodydiv_item_body fr" id="bodydiv_item_body">            
                
            	<script>adminpage_loader(1);</script>
                
                
                <div class="addpost_div fr">
                
                	<form id="form_ajax" method="post" action="sendMsg.php?sess=<?php echo $page_sess; ?>&save=true" >
                    
                        <p>عنوان پیام : ( * فقط برای ناتیفیکیشن )</p><input type="text" name="title" id="title" class="addpost_title_inp fr" dir="rtl" /><br style="clear:both" />
                        <p>نوع ارسال : (*)</p>
                        <select name="type" id="type" class="addpost_cate_sel fr" dir="rtl">
							<option value="msg">پیامک</option>
							<option value="notification">ناتیفیکیشن</option>
							<option value="msgandnotification">پیامک و ناتیفیکیشن</option>
                         </select>
						 <br style="clear:both" />
                         
                         <p> متن پیام: (*)</p><br style="clear:both" />
                         <div class="editor1"><textarea name="text1" style=" width: 90%; height: 202px;" id="text1" class="addpost_title_inp"></textarea></div><br style="clear:both" />
                         
                         <br style="clear:both" />
						 <hr style="width:100%; border-top:1px solid #ccc;" />
						 
                         <br style="clear:both" />
                         <p> گیرندگان: (*)</p><small style="font-size: 66%;float: right;margin-top: 2%;">با گرفتن کنترل ( CTRL ) میتوانید چند نفر را انتخاب کنید</small><br style="clear:both" />
						 <select class="addpost_cate_sel" name="to" multiple id="to" style="height:auto;min-width:313px;float:right;margin:14px;">
							<option value="farmers">همه کشاورزان</option>
							<?php 
								$resultTo = db_query("SELECT DISTINCT state FROM db_farmers ","select");
								if(mysqli_num_rows($resultTo)!=0){
									while($row = mysqli_fetch_assoc($resultTo)) {				
											echo '
											<option value="state_'.$row['state'].'">استان « '.$row['state'].' »</option>
										'; 
									}//EndWhile
								}//EndIf
							?>
							
							<?php 
								$resultTo = db_query("SELECT DISTINCT city FROM db_farmers ","select");
								if(mysqli_num_rows($resultTo)!=0){
									while($row = mysqli_fetch_assoc($resultTo)) {				
											echo '
											<option value="city_'.$row['city'].'">شهر « '.$row['city'].' »</option>
										'; 
									}//EndWhile
								}//EndIf
							?>
							
						 </select>
						 <br style="clear:both" />
                         <br style="clear:both" />
						 <hr style="width:100%; border-top:1px solid #ccc;" />
						 <br style="clear:both" />
                            
                         <input type="submit" name="formsubmit" value="ارسال پیام" class="addpost_submit fr" onClick="submit_check();" />
                         
                         <div id="form_ajax_result"></div>
                         
               		</form>
                </div><!--addpost_div-->
                
                
            </div><!--bodydiv_item_body-->
            </div><!--bodydiv_item-->
                            
        </div><!--bodydiv-->    
    <br style="clear:both" />   
    </div><!--father_div-->
    
    
    <div class="footer_div">
    	<div class="copyrightright fr"><p class="cp_icon"></p> طراحی ، برنامه نویسی و پشتیبانی : امیر لطفی - 09366208105</div>
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