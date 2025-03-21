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
$bklist_id = safe_enter(intval($_GET['id']));
$bklist_ip = safe_enter($_GET['ip']);
if($act_check=="deleteip" and !empty($bklist_ip)){
	if($sess_admin==$_SESSION['adminlogin_session']){
		if(db_query("DELETE FROM `db_blacklist` WHERE `id` = '".$bklist_id."'","delete")==true){
			adminlog("Delete Blacklist Ip | Ip = $bklist_ip | Id = $bklist_id");
			echo "delete";
			exit;
		}//EndIF
	}//ENDif
}//EndIF

if($act_check=="addip" and !empty($bklist_ip)){
	if($sess_admin==$_SESSION['adminlogin_session']){
		if (!filter_var($bklist_ip, FILTER_VALIDATE_IP) === false) {
			$bklist_date = time();
			if(db_query("INSERT INTO `db_blacklist` (`ip`, `date`) VALUES ('$bklist_ip', '$bklist_date');","insert")==true){
				adminlog("Added Blacklist Ip | Ip = $bklist_ip");
				echo "added";
				exit;
			}//EndIF
		}else{
			echo "validate";
			exit;
		}//EndIF
	}//ENDif
}//EndIF
?>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="fa" xml:lang="fa" dir="rtl">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta http-equiv="X-UA-Compatible" content="IE=edge" />
	<meta http-equiv="content-language" content="fa" />    
	<title>لیست سیاه</title>
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
	function deleteip(sess_admin,bklist_id,bklist_ip){
		var msg=confirm("آیا از حذف این آی پی مطمئن هستید؟");
		if(msg==true){
			var act="?act=deleteip&sess=" + sess_admin + "&id=" + bklist_id + "&ip=" + bklist_ip;
			xmlhttp=new XMLHttpRequest();
			xmlhttp.open("GET", act, false);
			xmlhttp.send();
			var result = xmlhttp.responseText;
			if(result=="delete"){
				alert("آی پی " + bklist_ip + " با موفقیت حذف شد.");
				var divitem = $("#bklist_id"+bklist_id);	
				divitem.hide("slow");
			}else{
				alert("خطا : عملیات حذف با خطا مواجه شد. مجددا اقدام نمایید.");
			}//EndIf
			
		}else{
			alert("عملیات حذف لغو شد.");			
		}//ENDif
	}//deleteip
	
	function addip(sess_admin){
		var ipaddress = $("#ip").val(); 
		if(isEmpty(ipaddress)){
			alert("خطا : لطفا آی پی مورد نظر را وارد نمایید.");
		}else{
			var msg=confirm("آیا از اضافه کردن آی پی (" + ipaddress +") مطمئن هستید؟");
			if(msg==true){
				var act="?act=addip&sess=" + sess_admin + "&ip=" + ipaddress;
				xmlhttp=new XMLHttpRequest();
				xmlhttp.open("GET", act, false);
				xmlhttp.send();
				var result = xmlhttp.responseText;
				if(result=="added"){
					var divitem = $("#addiptext");	
					divitem.show("slow");
					setTimeout("location.href='" + "blacklist.php" + "'", 1 * 2000);
				}else{
					if(result=="validate"){
						alert("خطا : آی پی وارد شده صحیح نمیباشد.");
					}else{
						alert("خطا : عملیات حذف با خطا مواجه شد. مجددا اقدام نمایید.");
					}//EndIf
				}//EndIf
			}//EndIf
		}//EndIF
	}//addip
	
	function addip_div(){
		var divitem = $("#addip_btn");	
		divitem.hide("fast");
		
		var divitem = $("#addip_div");	
		divitem.show("slow");
	}//addip_div
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
            <div class="bodydiv_item_title fr"><div><img src="images/icon6.png" />لیست سیاه</div></div>
            <div class="bodydiv_page_loading fr" id="bodydiv_page_loading"><img src="images/loading3.gif" /><p>در حال دریافت اطلاعات ...</p></div>
            <div class="bodydiv_item_body fr" id="bodydiv_item_body">            
                
            	<script>adminpage_loader(1);</script>
                
                
                <a onclick="addip_div()" title="اضافه کردن آی پی" class="adminadd_button fr sl2" style="cursor:pointer; margin:10px 7px 0 0;" id="addip_btn">+ اضافه کردن آی پی</a>
                
                <div style="width:650px; height:30px; text-align:right; font-family:tahoma; font-size:12px; color:#000; margin:10px 0 0 0; display:none;" id="addip_div">
                	<p style="margin:7px 2px 0 10px; float:right;">آی پی : </p>
                    <input type="text" name="ip" id="ip" dir="ltr" style="float:right; width:160px; height:13px; margin:3px 0 0 0; padding:5px; background:#F9FCFF; font-family:tahoma; font-size:12px; font-weight:normal; color:#3F3F3F; direction:ltr; border:1px dashed #B0CEE1; -webkit-border-radius:5px;-moz-border-radius:5px;border-radius:5px;"  />
                    <input type="submit" name="submit_frm" value="اضافه کردن" class="button_class fl" onclick="addip('<?php echo $_SESSION['adminlogin_session'] ?>')">
                	<div style="width:210px; height:20px;float:right; margin:9px 10px 0 0; text-align:right; font-family:tahoma; font-size:12px; font-weight:bold; color:green; display:none; " id="addiptext">آی پی مورد نظر اضافه شد...</div>
                </div>
                
                <div class="visitorsonline_div fr">
                	<div class="visitorsonline_title fr"><div class="user" style="width:100px;">آی پی</div><div class="user" style="width:225px; margin-left:85px; text-align:center;">تاریخ و ساعت</div><div class="des" style="margin-right:100px;">مدیریت</div></div>                       
                        <?php
                            $time_now = time();
                            $time_between = time()-240;
                            $query_limit = "20";
                            $page = intval($_GET['page']);
                            if(!isset($page)){$page="0";}elseif($page!="0"){$page=$page-1;}
                            $query_startpoint = $page*$query_limit;
                            
                            function visitor_info($input){
                                $value = getOS($input);
                                $value = "OS = $value";
                                $value2 = getBrowser($input);
                                $value2 = "Browser = $value2";
                                return($value." -- ".$value2);	
                            }//visitor_info
                            
                            $visitor_d_b = 0;
                            $result = db_query("SELECT `id`,`ip`,`date` FROM `db_blacklist` ORDER BY `date` DESC LIMIT ".$query_startpoint." , $query_limit" , "select");
                            if(mysqli_num_rows($result)){					
                                while($row = mysqli_fetch_assoc($result)) {	
									
									$bklist_id = intval($row['id']);
                                    $bklist_ip = safe_enter($row['ip']);
                                    $bklist_date = date_analysis("5",$row['date']);
									$admin_sess = $_SESSION['adminlogin_session'];

                                    
                                    if($visitor_d_b == 0){
                                        $visitor_class="visitorsonline";
                                        $visitor_d_b = 1;
                                    }else{
                                        $visitor_class="visitorsonline visitorsonline2";
                                        $visitor_d_b = 0;
                                    }//EndIF
                                    
                                    echo "
                                         <div class='$visitor_class fr' id='bklist_id".$bklist_id."'><div class='ip' style='width:100px;'>".$bklist_ip."</div><div class='user' style='width:380px; text-align:right; direction:rtl; margin-right:35px;'>".$bklist_date."</div><div class='des'>";
										 ?>
                                             <a onclick="deleteip('<?php echo $admin_sess; ?>','<?php echo $bklist_id; ?>','<?php echo $bklist_ip; ?>');"><img src='images/delete.png' title='حذف' alt='حذف' draggable='false' style="cursor:pointer;" /></a></div></div>
                                        <?php
                                }//EndWhile
                            }else{
                                echo "<div class='visitorsonline fr'><p style='margin:5px 0 0 0;'>[ نتیجه‌ای جهت نمایش وجود ندارد. ]</p></div>";
                            }//EndIf
    
                            							
                            $result = db_query("SELECT `ip`,`date` FROM `db_blacklist` ORDER BY `date` DESC" , "select");
							$page_q_num_row = mysqli_num_rows($result);
                            if($query_limit<$page_q_num_row){
								
                                $ceil_pages = ceil($page_q_num_row/$query_limit);
                                $page = $page+1;
								$page_link_step = 10;
                                
                                if($page>$ceil_pages or $page<0){ header("Location: blacklist.php"); exit; }
                                echo "<div class='visitor_page_div fr'><p>صفحه $page از $ceil_pages</p>";
								
								if($ceil_pages<=$page_link_step){
									$page_link_start = 1;
									$page_link_step = $ceil_pages;
								}else{
									if($ceil_pages<=($page+6) and $page>5){
										$page_link_start = ($ceil_pages-$page_link_step);
										if($page_link_start==1){$page_link_start=2;}
										$page_link_step = $ceil_pages;
										
									}else{
										if($page>10){
											$page_link_start = $page-3;
											$page_link_step = ($page+$page_link_step)-3;
										}//ENdIF
										if($page>5 and $page<=10){
											$page_link_start = $page-3;
											$page_link_step = ($page+$page_link_step)-3;										
										}//ENdIF
									}//ENdIF	
								}//ENdIF
								
								if($page>5 and $ceil_pages>10){
									echo "<a href='blacklist.php?page=1' class='visitor_page_link fr r5 sl2' id='visitor_page_1'>1</a>
										  <a class='visitor_page_link fr r5 sl2'>...</a>";
								}//ENdIF
								
								for($i=$page_link_start; $i<=$page_link_step; $i++){
									if($i>0 and $i<=$ceil_pages){
										echo "
												<a href='blacklist.php?page=$i' class='visitor_page_link fr r5 sl2' id='visitor_page_$i'>$i</a>
											";	
									}//ENdIF
									if($i==$ceil_pages){$no_otherpage = true;}
								}//EndFor
								
								if($ceil_pages>=($page+6) and $ceil_pages>10 and !isset($no_otherpage)){
									echo "<a class='visitor_page_link fr r5 sl2'>...</a>
										  <a href='blacklist.php?page=$ceil_pages' class='visitor_page_link fr r5 sl2' id='visitor_page_$ceil_pages'>$ceil_pages</a>";									
								}//ENdIF

                                
                                echo "</div><!--visitor_page_div-->
                                      <script>$('#visitor_page_$page').addClass('visitor_page_hover');</script>
                                ";							
                            
							}else{							
								if(!empty($_GET['page']) or $_GET['page']=="0"){ header("Location: blacklist.php"); }	
							}//EndIF               
                    ?>                    
                </div><!--visitorsonline_div-->
                
                
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