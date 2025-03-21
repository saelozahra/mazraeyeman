<?php
error_reporting(0);
session_start();
ob_start();

define("includesfile","true");
require("../includes/admin_functions.php");

adminlogin("","loginckeck");

if($_GET['act']=="refreshtime"){
	echo "resetok";
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
		?><script>setTimeout("location.href='" + "" + "'", 1);</script><?php
		die();
	}//EndIF	
	
	$notepadcheck   = !empty($_POST['notepadcheck'])? $_POST['notepadcheck'] : '';
	$spacecheck     = !empty($_POST['spacecheck'])? $_POST['spacecheck'] : '';
	
	if($notepadcheck=="true"){		
		$adminnote = safe_enter($_POST['notepad']);
		adminNotepad("save",$adminnote);
	}//End IF

	if($spacecheck=="true"){
		folderSize("../uploads");
		$spaceshow = sizeFormat($_SESSION['space']);
		unset($_SESSION['space']);			
		$spaceshow = "( <b>".$spaceshow."</b> )";
		echo $spaceshow;
		
		exit;
	}//End IF		
		
}else{
	
?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="fa" xml:lang="fa" dir="rtl">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta http-equiv="X-UA-Compatible" content="IE=edge" />
	<meta http-equiv="content-language" content="fa" />    
	<title>صفحه اصلی مدیریت</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1,maximum-scale=1,user-scalable=no">
	<meta name="robots" content="noindex, nofollow" />    
	<link rel="shortcut icon" href="images/favicon.png" />
    <link rel="icon" type="image/x-icon" href="images/favicon.png" />
	<link rel="stylesheet" type="text/css" href="css/main.css" />
	<script type="text/javascript" src="js/jquery-1.11.0.min.js"></script> 
    <script type="text/javascript" src="js/ajax.js"></script>
    <link rel="stylesheet" href="editorfile/CLEditor/jquery.cleditor.css" />
    <script src="editorfile/CLEditor/jquery.cleditor.min.js"></script>
    <script>
      
		$(document).ready(function () { $("#adminnotepad").cleditor({
			controls: "bold italic underline | color removeformat | alignleft center alignright justify | undo redo | cut copy paste pastetext | print source",
			bodyStyle: "direction:rtl" ,
			height: 140,			 
		});});
		
		
		jQuery(document).ready(function($) {
            $('.counter').counterUp({
                delay: 10,
                time: 1000
            });
        });
    </script>    
 	<!--[if lt IE 9]>  
    	<script src="js/html5.js"></script>  
    	<script src="js/css3-mediaqueries.js"></script>  
  	<![endif]-->      
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
        
        <div class="bodydiv fr">        
        	<div class="bodydiv_item fr">
            <div class="bodydiv_item_title fr"><div><p class="icon3"></p> میز کار</div></div>
            	<div class="mainpanel_div fr">
                	<a href="#" title="#" class="panellinks fr r5"><img src="images/product.png" draggable="false" /><p>افزودن محصول</p></a>
                    <a href="addpost.php?sess=<?php echo $_SESSION['adminlogin_session'];?>" title="#" class="panellinks fr r5"><img src="images/news.png" draggable="false" /><p>افزودن خبر</p></a>
                
                </div><!--mainpanel_div-->
            </div><!--bodydiv_item-->
        	<div class="bodydiv_item fr">
            <div class="bodydiv_item_title fr"><div><p class="icon4"></p> آخرین آمار و تحلیل ها</div></div>
            	<div class="count_div fr">
                	<div class="count_div_icon fr"></div>
                	<div class="count_div_right fr">
                    	<?php echo adminindexcount(); ?>
                    </div><!--count_div_right-->
                    <div class="count_div_left fr">
                    	<div class="count_showlink fr"><a href="count.php" title="نمایش کامل آمارها و تحلیل ها"><p>نمایش کامل آمار و تحلیل ها</p></a></div>
                        <div class="count_showlink fr"><a href="adminloginlogs.php" title="#"><p>نمایش آخرین ورودها به سیستم</p></a></div>
                        <div class="count_showlink fr"><a href="adminlogs.php" title="#"><p>نمایش آخرین اقدامات انجام شده</p></a></div>                    
                    </div><!--count_div_left-->
                </div><!--count_div-->
            </div><!--bodydiv_item-->
        	<div class="bodydiv_item fr">
            <div class="bodydiv_item_title fr"><div><p class="icon5"></p> دفترچه یادداشت آنلاین</div></div>
            	<div class="notepad_div fr">
                	<form id="form_ajax" method="post" action="index.php">
                        <textarea name="notepad" id="adminnotepad" class="notepad_input fr" maxlength="500" onKeyUp="notepadlenght();"><?php echo adminNotepad("show"); ?></textarea>
                    	<div class="notepad_bottom fr"></div>
                    	<div class="notepad_div_right fr">
                        	<div id="form_ajax_result"></div>
                        </div><!--notepad_div_right-->
                        <div class="notepad_div_left fl">               	
                            <input type="submit" name="submit_frm" value="ثبت یادداشت" class="notepad_link fl"  onclick="form_ajax();" />
                        	<!--<div class="notepad_link"><a href="#" title="#"><p>حذف</p></a></div>-->
                        </div><!--notepad_div_left-->
                        <input type="text" name="complete_frm" class="complete_frm" />
                        <input type="hidden" name="time_frm" value="<?php echo time(); ?>" />
                        <input type="hidden" name="submit" value="asys" />
                        <input type="hidden" name="notepadcheck" value="true" />
                    </form>
                </div><!--notepad_div-->
            </div><!--bodydiv_item-->
        	<div class="bodydiv_item fr">
            <div class="bodydiv_item_title fr"><div><p class="icon6"></p> اطلاعات سیستمی</div></div>
            	<div class="informations_div fr">
					<?php echo cmsinformations(); ?>
                </div><!--informations_div-->
            </div><!--bodydiv_item-->                              
        </div><!--bodydiv-->    
    <br style="clear:both" />   
    </div><!--father_div-->
    
    
    <div class="footer_div">
    	<div class="copyrightright fr"></div>
    	<p class="copyrightleft fl"><?php echo copyright(); ?></p>
    	
		
		<script src="js/jquery.counterup.min.js"></script>
    	<script src="js/waypoints.min.js"></script>
    </div><!--footer_div-->
    
    
</center></body>
</html>

<?php
}//if(!empty($submit_chk) and $submit_chk=='asys')

?>