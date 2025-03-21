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

?>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="fa" xml:lang="fa" dir="rtl">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta http-equiv="X-UA-Compatible" content="IE=edge" />
	<meta http-equiv="content-language" content="fa" />    
	<title>گزارش ورود به سیستم</title>
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
            <div class="bodydiv_item_title fr"><div><img src="images/icon6.png" />گزارش ورود به سیستم</div></div>
            <div class="bodydiv_page_loading fr" id="bodydiv_page_loading"><img src="images/loading3.gif" /><p>در حال دریافت اطلاعات ...</p></div>
            <div class="bodydiv_item_body fr" id="bodydiv_item_body">
                
            	<script>adminpage_loader(1);</script>
                
                <div class="visitorsonline_div fr">
                	<div class="visitorsonline_title fr"><div class="ip">آی پی</div><div class="user">نام کاربری</div><div class="computer">کامپیوتر کاربر</div><div class="date">تاریخ و ساعت</div><div class="des">وضعیت</div></div>                       
                        <?php
                            $time_now = time();
                            $time_between = time()-240;
                            $query_limit = "20";
                            $page = intval($_GET['page']);
                            if(!isset($page)){$page="0";}elseif($page!="0"){$page=$page-1;}
                            $query_startpoint = $page*$query_limit;
                            
                            function visitor_info($input){
                                $value = getOS($input);
                                $value = "<img src='images/$value.gif' title='$value' draggable='false' />";
                                $value2 = getBrowser($input);
                                $value2 = "<img src='images/$value2.gif' title='$value2' draggable='false' />";
                                return($value.$value2);	
                            }//visitor_info
                            
                            $visitor_d_b = 0;
                            $result = db_query("SELECT `user`,`ip`,`date`,`des`,`info` FROM `db_member_login` ORDER BY `date` DESC LIMIT ".$query_startpoint." , $query_limit" , "select");
                            if(mysqli_num_rows($result)){					
                                while($row = mysqli_fetch_assoc($result)) {	
									$adminlogin_user = $row['user'];				
                                    $adminlogin_ip = $row['ip'];
                                    $adminlogin_date = $row['date'];
                                    $adminlogin_des = $row['des'];
                                    $adminlogin_info = $row['info'];
                                    
                                    if($adminlogin_des=="loginok"){
                                        $adminlogin_des="<img src='images/ok.png' title='ورود موفقیت آمیز' alt='ورود موفقیت آمیز' draggable='false' />";	
                                    }else{
										$adminlogin_des="<img src='images/error3.png' title='خطا در ورود' alt='خطا در ورود' draggable='false' />";
									}//EndIF
                                    
                                    if($visitor_d_b == 0){
                                        $visitor_class="visitorsonline";
                                        $visitor_d_b = 1;
                                    }else{
                                        $visitor_class="visitorsonline visitorsonline2";
                                        $visitor_d_b = 0;
                                    }//EndIF
                                    
                                    echo "
                                         <div class='$visitor_class fr'><div class='ip'><a href='iplookup.php?ip=$adminlogin_ip' title='Whois ip'>".$adminlogin_ip."</a></div><div class='user'>".$adminlogin_user."</div><div class='computer'>".visitor_info($adminlogin_info)."</div><div class='date'>".date_analysis("5",$adminlogin_date)."</div><div class='des'>".$adminlogin_des."</div></div>
                                    ";
                                }//EndWhile
                            }else{
                                echo "<div class='visitorsonline fr'><p style='margin:5px 0 0 0;'>[ نتیجه‌ای جهت نمایش وجود ندارد. ]</p></div>";
                            }//EndIf
    
                            							
                            $result = db_query("SELECT `user`,`ip`,`date`,`des`,`info` FROM `db_member_login` ORDER BY `date` DESC" , "select");
							$page_q_num_row = mysqli_num_rows($result);
                            if($query_limit<$page_q_num_row){
								
                                $ceil_pages = ceil($page_q_num_row/$query_limit);
                                $page = $page+1;
								$page_link_step = 10;
                                
                                if($page>$ceil_pages or $page<0){ header("Location: adminloginlogs.php"); exit; }
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
									echo "<a href='adminloginlogs.php?page=1' class='visitor_page_link fr r5 sl2' id='visitor_page_1'>1</a>
										  <a class='visitor_page_link fr r5 sl2'>...</a>";
								}//ENdIF
								
								for($i=$page_link_start; $i<=$page_link_step; $i++){
									if($i>0 and $i<=$ceil_pages){
										echo "
												<a href='adminloginlogs.php?page=$i' class='visitor_page_link fr r5 sl2' id='visitor_page_$i'>$i</a>
											";	
									}//ENdIF
									if($i==$ceil_pages){$no_otherpage = true;}
								}//EndFor
								
								if($ceil_pages>=($page+6) and $ceil_pages>10 and !isset($no_otherpage)){
									echo "<a class='visitor_page_link fr r5 sl2'>...</a>
										  <a href='adminloginlogs.php?page=$ceil_pages' class='visitor_page_link fr r5 sl2' id='visitor_page_$ceil_pages'>$ceil_pages</a>";									
								}//ENdIF

                                
                                echo "</div><!--visitor_page_div-->
                                      <script>$('#visitor_page_$page').addClass('visitor_page_hover');</script>
                                ";							
                            
							}else{							
								if(!empty($_GET['page']) or $_GET['page']=="0"){ header("Location: adminloginlogs.php"); }	
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