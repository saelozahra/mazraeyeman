<?php
error_reporting(0);
session_start();
ob_start();

define("includesfile","true");
require("../includes/admin_functions.php");

adminlogin("","loginckeck");


$fileaddress = explode('.php', getfilename($_SERVER['REQUEST_URI']));
$fileaddress = reset($fileaddress);
if(adminmenus("checkaccess","admin")!=="1"){
	header("Location: index.php");
	exit;
}//EndIf


$act_check = $_GET['act'];
$sess_admin = safe_enter($_GET['sess']);
$filename = safe_enter($_GET['filename']);
if($act_check=="delete"){
	if($sess_admin==$_SESSION['adminlogin_session']){		
		if(unlink("backup/".$filename)){
			adminlog("Delete BackupFile | Filename = $filename");
			echo "delete";
			exit;
		}//EndIF
	}//ENDif
}//EndIF

if($act_check=="backup"){
	if($sess_admin==$_SESSION['adminlogin_session']){

		$query_exit = '';
		$tbl_list = db_query("SHOW TABLES" , "select");
		while($db_tbl = mysqli_fetch_row($tbl_list)){
			$Create_tbl = db_query("SHOW CREATE TABLE `$db_tbl[0]`" , "select");
			while($db_tbl_info = mysqli_fetch_array($Create_tbl)){
				$query_exit .= "
				// Start $db_tbl[0] //
				db_query(\"".$db_tbl_info['Create Table']."\" , \"backup\")";
			}//Endwhile
			$query_exit .= "; ";
			$Q_t = db_query("SELECT * FROM `$db_tbl[0]`", "select");
			while($R_c_f = mysqli_fetch_row($Q_t)){
				$query_exit .= "
				db_query(\""."INSERT INTO `$db_tbl[0]` VALUES('$R_c_f[0]' ";
				for($i=1;$i<sizeof($R_c_f);$i++){
					$rcu = str_replace("'","\'",$R_c_f[$i]);
					$rcu = str_replace('"','\"',$R_c_f[$i]);
					$query_exit .= ", '$rcu' ";
				}//EndFor
				$query_exit .= ");\", \"backup\"); ";
			}//Endwhile
			$query_exit .= "
				// End Table
			";
		}//Endwhile		
		
		$ctime = time();		
		$bfile = fopen("backup/DbBackup_".$ctime.".php","w");
		$Fileresult = fwrite($bfile,"<?php
		defined('includesfile') or die(header('Location: '.' warning.php?err=FileAccess'));
		error_reporting(0);
		
		/***************************************************************************
		 *   File Name             : DbBackup_".$ctime."
		 *   Dbase Name            : ".$db_name."
		 *   Site                  : ".clean_url($_SERVER['HTTP_HOST'])." 
		 *   Created by            : AdminId_".intval($_SESSION['adminlogin_id'])."
		 *   Ip                    : ".getip()."
		 *   Info                  : ".getinfo()."
		 ***************************************************************************/	
		
		//      Start Query      //
		
		".$query_exit."
		
		
		
		//      End Query      //
	?>");
	
		if($Fileresult){
			adminlog("Create BackupFile | Filename = DbBackup_".$ctime.".php");
			echo "true";
			exit;
		}//EndIF
	}//EndIF
}//EndIF


if($act_check=="restore"){
	if($sess_admin==$_SESSION['adminlogin_session'] and !empty($filename)){	
		
		$filename = str_replace(".php","",$filename);
		$filename = str_replace("/","",$filename);
		$filename = str_replace("\\","",$filename);
		$filename = str_replace(".","",$filename);
		
		$address = "backup/".$filename.".php";
		if(is_file($address)){
			$tbl_list = db_query("SHOW TABLES" , "select");
			while($db_tbl = mysqli_fetch_row($tbl_list)){
				if(!db_query("DROP TABLE `$db_tbl[0]`" , "select")){
					$query_error = "true";
				}//EndIF	
			}//EndWhile
			if(empty($query_error)){
				include($address);
				adminlog("Restore BackupFile | Filename = ".$filename.".php");
				echo "true";
				exit;
			}//EndIF	
		}//Endif
	}//ENDif
}//EndIF	
?>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="fa" xml:lang="fa" dir="rtl">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta http-equiv="X-UA-Compatible" content="IE=edge" />
	<meta http-equiv="content-language" content="fa" />    
	<title>پشتیبان گیری</title>
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
	function deletefile(sess_admin,filename,fileid){
		var msg=confirm("آیا از حذف این فایل مطمئن هستید؟");
		if(msg==true){
			var act="?act=delete&sess=" + sess_admin + "&filename=" + filename;
			xmlhttp=new XMLHttpRequest();
			xmlhttp.open("GET", act, false);
			xmlhttp.send();
			var result = xmlhttp.responseText;
			if(result=="delete"){
				alert("فایل مربوطه با موفقیت حذف شد.");
				var divitem = $("#fileid"+fileid);	
				divitem.hide("slow");
			}else{
				alert("خطا : عملیات حذف با خطا مواجه شد. مجددا اقدام نمایید.");
			}//EndIf
			
		}else{
			alert("عملیات حذف لغو شد.");			
		}//ENDif
	}//End deletefile
	
	function backup(sess_admin){
		var msg=confirm("آیا میخواهید از دیتابیس پشتیبان گیری نمایید؟");
		if(msg==true){
			var act="?act=backup&sess=" + sess_admin;
			xmlhttp=new XMLHttpRequest();
			xmlhttp.open("GET", act, false);
			xmlhttp.send();
			var result = xmlhttp.responseText;
			if(result=="true"){
				var divitem = $("#backuptext");	
				divitem.show("slow");
				setTimeout("location.href='" + "backup.php" + "'", 1 * 1500);
			}else{
				alert("خطا : عملیات پشتیبان گیری با خطا مواجه شد. مجددا اقدام نمایید.");
			}//EndIf
			
		}else{
			alert("عملیات پشتیبان گیری لغو شد.");			
		}//ENDif
	}//End deletefile	
	
	function restore(sess_admin,filename){
		var msg=confirm("آیا میخواهید این پشتیبان را به دیتابیس بازگردانی کنید؟");
		if(msg==true){
			var act="?act=restore&sess=" + sess_admin + "&filename=" + filename;
			xmlhttp=new XMLHttpRequest();
			xmlhttp.open("GET", act, false);
			xmlhttp.send();
			var result = xmlhttp.responseText;
			if(result=="true"){
				var divitem = $("#restoretext");	
				divitem.show("slow");
				setTimeout("$('#restoretext').fadeOut('slow');", 5000);
			}else{
				alert("خطا : عملیات بازگردانی با خطا مواجه شد. مجددا اقدام نمایید.");
			}//EndIf
			
		}else{
			alert("عملیات بازگردانی لغو شد.");			
		}//ENDif
	}//End deletefile	
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
            <div class="bodydiv_item_title fr"><div><img src="images/icon6.png" />پشتیبان گیری</div></div>
            <div class="bodydiv_page_loading fr" id="bodydiv_page_loading"><img src="images/loading3.gif" /><p>در حال دریافت اطلاعات ...</p></div>
            <div class="bodydiv_item_body fr" id="bodydiv_item_body">            
                
            	<script>adminpage_loader(1);</script>
                
                
                <div class="adminmanager_div fr">
                	<div class="adminmanager_button fr">
                    	<a onclick="backup('<?php echo $_SESSION['adminlogin_session']; ?>')" title="پشتیبان گیری از دیتابیس" class="adminadd_button fr sl2" style="cursor:pointer;">+ پشتیبان گیری از دیتابیس</a>
                        <div style="width:210px; height:20px;float:right; margin:5px 5px 0 0; text-align:right; font-family:tahoma; font-size:12px; font-weight:bold; color:green; display:none;" id="backuptext">پشتیبان گیری با موفقیت انجام شد...</div>
                        <div style="width:210px; height:20px;float:right; margin:5px 5px 0 0; text-align:right; font-family:tahoma; font-size:12px; font-weight:bold; color:green; display:none;" id="restoretext">بازگردانی با موفقیت انجام شد...</div>                
                    </div><!--adminmanager_button-->
                	
                    <div class="adminlist_div fr">
                        <div class="adminlist_title fr"><div class="username" style="width:230px; text-align:right;">تاریخ پشتیبان گیری</div><div class="des" style=" width:80px; margin-right:170px; text-align:left;">حجم فایل</div><div class="manager">مدیریت</div></div>                       
                            <?php
								$visitor_d_b = 0;
								$$fileid = 1;
								
                                $dir_array = scandir("backup");	
								rsort($dir_array);
								foreach($dir_array as $key=>$filename){
									if($filename!=".." && $filename!="." && $filename!=".htaccess" && $filename!="index.php" && is_file("backup/".$filename)){
										if(strstr($filename,"DbBackup_")){ 								
											$foundfile = "true";	
											
											$filesize = sizeFormat(filesize("backup/".$filename));
											
											$filedate = $filename;
											$filedate = str_replace("DbBackup_", "" , $filedate);	
											$filedate = str_replace(".php", "" , $filedate);
											$filedate = date_analysis("6_2",$filedate);
											
											if($visitor_d_b == 0){
												$visitor_class="adminlist";
												$visitor_d_b = 1;
											}else{
												$visitor_class="adminlist adminlist2";
												$visitor_d_b = 0;
											}//EndIF
											
											$admin_loginsession = $_SESSION['adminlogin_session'];
											
											echo "
												 <div class='$visitor_class fr' id='fileid".$fileid."'><div class='username' style='width:230px; text-align:right;'>".$filedate."</div><div class='name' style='width:80px; margin:4px 165px 0 0; text-align:left;'>".$filesize."</div><div class='manager'>";
											?>
                                            	<a onclick="restore('<?php echo $admin_loginsession; ?>','<?php echo $filename; ?>');"><img src='images/restore.gif' title='بازگردانی' alt='بازگردانی' draggable='false' /></a>
												 <a onclick="deletefile('<?php echo $admin_loginsession; ?>','<?php echo $filename; ?>','<?php echo $fileid; ?>');"><img src='images/delete.png' title='حذف' alt='حذف' draggable='false' /></a></div></div>
											<?php
																						
											$fileid++;
										}//End IF
									}//End IF
        						}//foreach
								
								if(empty($foundfile)){
									echo "<div class='adminlist fr'><p style='margin:5px 0 0 0;'>[ نتیجه‌ای جهت نمایش وجود ندارد. ]</p></div>";
								}//End IF
                        ?>                    
                    
                    
                    </div><!--adminlist_div-->             	
                	
                </div><!--adminmanager_div-->
                                
                
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