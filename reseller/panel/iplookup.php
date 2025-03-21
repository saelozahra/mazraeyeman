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
	<title>مشخصات آی پی</title>
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
            <div class="bodydiv_item_title fr"><div><img src="images/icon6.png" />مشخصات آی پی</div></div>
            <div class="bodydiv_page_loading fr" id="bodydiv_page_loading"><img src="images/loading3.gif" /><p>در حال دریافت اطلاعات ...</p></div>
            <div class="bodydiv_item_body fr" id="bodydiv_item_body">
                
          		  	<script>adminpage_loader(1);</script>


					<?php
                        $ip = safe_enter($_GET['ip']);
						if (!filter_var($ip, FILTER_VALIDATE_IP) === false) {					
							if(function_exists('file_get_contents')){
								$address = 'http://ip-api.com/php/'.$ip;
								$query = unserialize(file_get_contents($address));
								if(is_array($query)){
									if($query && $query['status'] == 'success') {
										echo "
											<div class='iplookup_div'>
												<div class='iplookup_item fr'><div class='title fl'><p>IP Address :</p></div><div class='text fl'><p>".$query['query']."</p></div></div>
												<div class='iplookup_item iplookup_item2 fr'><div class='title fl'><p>Location :</p></div><div class='text fl'><p><img src='http://www.ip2location.com/images/flags/".strtolower($query['countryCode']).".png' />".$query['country'].' , '.$query['regionName'].' , '.$query['city']."</p></div></div>
												<div class='iplookup_item fr'><div class='title fl'><p>ISP :</p></div><div class='text fl'><p>".$query['isp']."</p></div></div>
												<div class='iplookup_item iplookup_item2 fr'><div class='title fl'><p>Organization :</p></div><div class='text fl'><p>".$query['org']."</p></div></div>
												<div class='iplookup_item fr'><div class='title fl'><p>Zip Code :</p></div><div class='text fl'><p>".$query['zip']."</p></div></div>
												<div class='iplookup_item iplookup_item2 fr'><div class='title fl'><p>Timezone :</p></div><div class='text fl'><p>".$query['timezone']."</p></div></div>
												<div class='iplookup_item fr'><div class='title fl'><p>Latitude , Longitude :</p></div><div class='text fl'><p>(".number_format($query['lat'],4).') , ('.number_format($query['lon'],4).")</p></div></div>
												<div class='iplookup_img fr'>
													<img src='http://maps.googleapis.com/maps/api/staticmap?key=AIzaSyAjh0Pdk6dasNa6f58zkd86cOrtNxbHQHE&center=".number_format($query['lat'],4).','.number_format($query['lon'],4)."&zoom=12&format=png&size=617x330&language=en' draggable='false' />
												</div><!--iplookup_img--> 
											 </div><!--iplookup_div-->  
										";
									}else{
									  echo '<br /><img src="images/error4.png" style=" width:15px; height:15px; margin:0 0 -4px 5px;" /><b>خطا :</b> اطلاعاتی در رابطه با آی پی مورد نظر یافت نشد!<br /><br />';
									}//EndIf
								}else{
									echo '<br /><img src="images/error4.png" style=" width:15px; height:15px; margin:0 0 -4px 5px;" /><b>خطا :</b> عدم ارتباط با سایت مرجع.<br /><br />';						
								}//EndIf
							}else{
								echo '<br /><img src="images/error4.png" style=" width:15px; height:15px; margin:0 0 -4px 5px;" /><b>خطا :</b> file_get_contents();<br /><br />';						
							}//EndIF
						
						}else{
							 echo '<br /><img src="images/error4.png" style=" width:15px; height:15px; margin:0 0 -4px 5px;" /><b>خطا :</b> آی پی وارد شده صحیح نمیباشد.<br /><br />';
						};

				?>
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