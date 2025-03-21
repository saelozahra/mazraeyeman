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
$id_category = safe_enter(intval($_GET['id']));
$cate_title = safe_enter($_GET['cate_title']);
if($act_check=="delete"){
	if($sess_admin==$_SESSION['adminlogin_session']){		
		if(db_query("DELETE FROM `db_category` WHERE `id` = '".$id_category."'","delete")==true){
			adminlog("Delete Category | Title=$cate_title | Id = $id_category");
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
	<title>مدیریت دسته بندی ها</title>
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
	function deleteadmin(sess_admin,id_cate,cate_title){
		var msg=confirm("آیا از حذف این دسته بندی مطمئن هستید؟");
		if(msg==true){
			var act="?act=delete&sess=" + sess_admin + "&id=" + id_cate + "&cate_title=" + cate_title;
			xmlhttp=new XMLHttpRequest();
			xmlhttp.open("GET", act, false);
			xmlhttp.send();
			var result = xmlhttp.responseText;
			if(result=="delete"){
				alert("دسته بندی مربوطه با موفقیت حذف شد.");
				var divitem = $("#cateid"+id_cate);	
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
            <div class="bodydiv_item_title fr"><div><img src="images/icon6.png" />مدیریت دسته بندی ها</div></div>
            <div class="bodydiv_page_loading fr" id="bodydiv_page_loading"><img src="images/loading3.gif" /><p>در حال دریافت اطلاعات ...</p></div>
            <div class="bodydiv_item_body fr" id="bodydiv_item_body">            
                
            	<script>adminpage_loader(1);</script>
                
                
                <div class="adminmanager_div fr">
                	<div class="adminmanager_button fr">
                    	<a href="addcategory.php?sess=<?php echo $_SESSION['adminlogin_session']; ?>" title="اضافه کردن دسته بندی جدید" class="adminadd_button fr sl2">+ اضافه کردن دسته بندی جدید</a>                  
                    </div><!--brandsadd_button-->
                	
                    <div class="adminlist_div fr">
                        <div class="adminlist_title fr"><div class="id">ردیف</div><div class="name" style="text-align:right;width:320px;">نام دسته بندی</div><div class="model"></div><div class="des">وضعیت</div><div class="manager">مدیریت</div></div>                       
                            <?php
                                $time_now = time();
                                $time_between = time()-240;
                                $query_limit = "20";
                                $page = intval($_GET['page']);
                                if(!isset($page)){$page="0";}elseif($page!="0"){$page=$page-1;}
                                $query_startpoint = $page*$query_limit;
                                
                                $visitor_d_b = 0;
                                $result = db_query("SELECT `id`,`title`,`status` FROM `db_category` ORDER BY `id` ASC LIMIT ".$query_startpoint." , $query_limit" , "select");
                                if(mysqli_num_rows($result)){
									
									if(!empty($_GET['page']) and $_GET['page']>1){
										$radif = (intval($_GET['page'])-1)*20+1;
									}else{
										$radif = 1;	
									}//EndIF
									
									
									while($row = mysqli_fetch_assoc($result)) {	
                                        $cate_id = $row['id'];				
                                        $cate_title = $row['title'];
                                        $cate_status = $row['status'];
										                                        
                                        if($cate_status=="active"){
                                            $cate_status="<img src='images/ok.png' title='فعال' alt='فعال' draggable='false' />";	
                                        }else{
                                            $cate_status="<img src='images/error3.png' title='غیرفعال' alt='غیرفعال' draggable='false' />";
                                        }//EndIF
                                        
                                        if($visitor_d_b == 0){
                                            $visitor_class="adminlist";
                                            $visitor_d_b = 1;
                                        }else{
                                            $visitor_class="adminlist adminlist2";
                                            $visitor_d_b = 0;
                                        }//EndIF

										
										$adminmanager_loginsession = $_SESSION['adminlogin_session'];
										
										
										
                                        echo "
                                             <div class='$visitor_class fr' id='cateid".$cate_id."'><div class='id'>".$radif."</div><div class='name' style='width:332px;color:#0477BB'>".$cate_title."</div><div class='model'></div><div class='des'>".$cate_status."</div><div class='manager'><a href='editcategory.php?type=car&sess=$adminmanager_loginsession&id=$cate_id'><img src='images/edit.png' title='ویرایش' alt='ویرایش' draggable='false' /></a>";
										?>
                                             <a onclick="deleteadmin('<?php echo $adminmanager_loginsession; ?>','<?php echo $cate_id; ?>','<?php echo $cate_title; ?>');"><img src='images/delete.png' title='حذف' alt='حذف' draggable='false' /></a></div></div>
                                        <?php
										$radif++;
                                    }//EndWhile
                                }else{
                                    echo "<div class='adminlist fr'><p style='margin:5px 0 0 0;'>[ نتیجه‌ای جهت نمایش وجود ندارد. ]</p></div>";
                                }//EndIf
        						
                                                            
                                $result = db_query("SELECT `id`,`title`,`status` FROM `db_category` ORDER BY `id` ASC" , "select");
                                $page_q_num_row = mysqli_num_rows($result);
                                if($query_limit<$page_q_num_row){
                                    
                                    $ceil_pages = ceil($page_q_num_row/$query_limit);
                                    $page = $page+1;
                                    $page_link_step = 10;
                                    
                                    if($page>$ceil_pages or $page<0){ header("Location: categorymanage.php"); exit; }
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
                                        echo "<a href='categorymanage.php?page=1' class='adminlist_page_link fr r5 sl2' id='adminlist_page_1'>1</a>
                                              <a class='adminlist_page_link fr r5 sl2'>...</a>";
                                    }//ENdIF
                                    
                                    for($i=$page_link_start; $i<=$page_link_step; $i++){
                                        if($i>0 and $i<=$ceil_pages){
                                            echo "
                                                    <a href='categorymanage.php?page=$i' class='adminlist_page_link fr r5 sl2' id='adminlist_page_$i'>$i</a>
                                                ";	
                                        }//ENdIF
                                        if($i==$ceil_pages){$no_otherpage = true;}
                                    }//EndFor
                                    
                                    if($ceil_pages>=($page+6) and $ceil_pages>10 and !isset($no_otherpage)){
                                        echo "<a class='adminlist_page_link fr r5 sl2'>...</a>
                                              <a href='categorymanage.php?page=$ceil_pages' class='adminlist_page_link fr r5 sl2' id='adminlist_page_$ceil_pages'>$ceil_pages</a>";									
                                    }//ENdIF
    
                                    
                                    echo "</div><!--adminlist_page_div-->
                                          <script>$('#adminlist_page_$page').addClass('adminlist_page_hover');</script>
                                    ";							
                                
                                }else{							
                                    if(!empty($_GET['page']) or $_GET['page']=="0"){ header("Location: categorymanage.php"); }	
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