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


$act_check = $_GET['act'];
$sess_admin = safe_enter($_GET['sess']);
$id_product = safe_enter(intval($_GET['id']));
$product_title = safe_enter($_GET['admin_user']);
if($act_check=="delete"){
	if($sess_admin==$_SESSION['adminlogin_session']){		
		if(db_query("DELETE FROM `db_product` WHERE `id` = '".$id_product."'","delete")==true){
			adminlog("Delete Product | User=$product_title | Id = $id_product");
			echo "delete";
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
	<title>مدیریت محصولات</title>
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
	function deleteadmin(sess_admin,id_admin,admin_user){
		var msg=confirm("آیا از حذف این محصول مطمئن هستید؟");
		if(msg==true){
			var act="?act=delete&sess=" + sess_admin + "&id=" + id_admin + "&admin_user=" + admin_user;
			xmlhttp=new XMLHttpRequest();
			xmlhttp.open("GET", act, false);
			xmlhttp.send();
			var result = xmlhttp.responseText;
			if(result=="delete"){
				alert("محصول مربوطه با موفقیت حذف شد.");
				var divitem = $("#adminid"+id_admin);	
				divitem.hide("slow");
			}else{
				alert("خطا : عملیات حذف با خطا مواجه شد. مجددا اقدام نمایید.");
			}//EndIf
			
		}else{
			alert("عملیات حذف لغو شد.");			
		}//ENDif
	};
	
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
            <div class="bodydiv_item_title fr"><div><img src="images/icon6.png" />مدیریت محصولات</div></div>
            <div class="bodydiv_page_loading fr" id="bodydiv_page_loading"><img src="images/loading3.gif" /><p>در حال دریافت اطلاعات ...</p></div>
            <div class="bodydiv_item_body fr" id="bodydiv_item_body">            
                
            	<script>adminpage_loader(1);</script>
                

            	<div class="adminmanager_div fr">
                	<div class="adminmanager_button fr">
                    	<a href="addproduct.php?sess=<?php echo $_SESSION['adminlogin_session']; ?>" title="اضافه کردن محصول جدید" class="adminadd_button fr sl2">+ اضافه کردن محصول جدید</a>                  
                    </div><!--adminmanager_button-->
                	
                    <div class="adminlist_div fr">
                        <div class="adminlist_title fr"><div class="username" style="width:130px;text-align:right">نام محصول</div><div class="name" style="width:130px;text-align:right">گروه</div><div class="date" style="width:130px;text-align:right">دسته بندی</div><div class="des">وضعیت</div><div class="manager" style=" padding: 0;">مدیریت</div></div>                       
                            <?php
                                $time_now = time();
                                $time_between = time()-240;
                                $query_limit = "20";
                                $page = intval($_GET['page']);
                                if(!isset($page)){$page="0";}elseif($page!="0"){$page=$page-1;}
                                $query_startpoint = $page*$query_limit;
                                
                                $visitor_d_b = 0;
                                $result = db_query("SELECT `id`,`title`,`group`,`category_txt`,`status` FROM `db_product` ORDER BY `group` ASC LIMIT ".$query_startpoint." , $query_limit" , "select");
                                if(mysqli_num_rows($result)){					
                                    while($row = mysqli_fetch_assoc($result)) {	
                                        $product_id = intval($row['id']);				
                                        $product_title = safe_enter($row['title']);
										$product_group = safe_enter($row['group']);
										$product_category = safe_enter($row['category_txt']);
                                        $product_status = safe_enter($row['status']);
										                                        
                                        if($product_status=="active"){
                                            $product_status="<img src='images/ok.png' title='فعال' alt='فعال' draggable='false' />";	
                                        }else{
                                            $product_status="<img src='images/error3.png' title='غیرفعال' alt='غیرفعال' draggable='false' />";
                                        }//EndIF
                                        
                                        if($visitor_d_b == 0){
                                            $visitor_class="adminlist";
                                            $visitor_d_b = 1;
                                        }else{
                                            $visitor_class="adminlist adminlist2";
                                            $visitor_d_b = 0;
                                        }//EndIF
										
										if($product_group=="group1"){
											$product_group="محصولات کشاورزی";
										}elseif($product_group=="group2"){
											$product_group="دام و طیور و آبزیان پرورشی";
										}//ENdIF

										
										$adminmanager_loginsession = $_SESSION['adminlogin_session'];
										
										
                                        echo "
                                             <div class='$visitor_class fr' id='adminid".$product_id."'><div class='username' style='width:130px; text-align:right'>".$product_title."</div><div class='name' style='width:130px; text-align:right; font-size:11px;'>".$product_group."</div><div class='date' style='width:130px;text-align:right'>".$product_category."</div><div class='des' style='margin-right:18px;'>".$product_status."</div><div class='manager' style='border: margin:0 0px 0 0;padding:0px;'><a href='editproduct.php?sess=$adminmanager_loginsession&id=$product_id'><img src='images/edit.png' title='ویرایش' alt='ویرایش' draggable='false' /></a>";
										?>
                                             <a onclick="deleteadmin('<?php echo $adminmanager_loginsession; ?>','<?php echo $product_id; ?>','<?php echo $product_title; ?>');"><img src='images/delete.png' title='حذف' alt='حذف' draggable='false' /></a></div></div>
                                        <?php
										
                                    }//EndWhile
                                }else{
                                    echo "<div class='adminlist fr'><p style='margin:5px 0 0 0;'>[ نتیجه‌ای جهت نمایش وجود ندارد. ]</p></div>";
                                }//EndIf
        						
                                                            
                                $result = db_query("SELECT `id`,`title`,`group`,`category_txt`,`status` FROM `db_product` ORDER BY `group` ASC" , "select");
                                $page_q_num_row = mysqli_num_rows($result);
                                if($query_limit<$page_q_num_row){
                                    
                                    $ceil_pages = ceil($page_q_num_row/$query_limit);
                                    $page = $page+1;
                                    $page_link_step = 10;
                                    
                                    if($page>$ceil_pages or $page<0){ header("Location: productmanage.php"); exit; }
                                    echo "<div class='adminlist_page_div fr'><p>صفحه $page از $ceil_pages</p>";
                                    
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
                                        echo "<a href='productmanage.php?page=1' class='adminlist_page_link fr r5 sl2' id='adminlist_page_1'>1</a>
                                              <a class='adminlist_page_link fr r5 sl2'>...</a>";
                                    }//ENdIF
                                    
                                    for($i=$page_link_start; $i<=$page_link_step; $i++){
                                        if($i>0 and $i<=$ceil_pages){
                                            echo "
                                                    <a href='productmanage.php?page=$i' class='adminlist_page_link fr r5 sl2' id='adminlist_page_$i'>$i</a>
                                                ";	
                                        }//ENdIF
                                        if($i==$ceil_pages){$no_otherpage = true;}
                                    }//EndFor
                                    
                                    if($ceil_pages>=($page+6) and $ceil_pages>10 and !isset($no_otherpage)){
                                        echo "<a class='adminlist_page_link fr r5 sl2'>...</a>
                                              <a href='productmanage.php?page=$ceil_pages' class='adminlist_page_link fr r5 sl2' id='adminlist_page_$ceil_pages'>$ceil_pages</a>";									
                                    }//ENdIF
    
                                    
                                    echo "</div><!--adminlist_page_div-->
                                          <script>$('#adminlist_page_$page').addClass('adminlist_page_hover');</script>
                                    ";							
                                
                                }else{							
                                    if(!empty($_GET['page']) or $_GET['page']=="0"){ header("Location: productmanage.php"); }	
                                }//EndIF               
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