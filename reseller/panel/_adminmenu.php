<?php
error_reporting(0);
session_start();
ob_start();

define("includesfile","true");
require_once("../includes/admin_functions.php");

adminlogin("","loginckeck");

if($memberlevel!==""){

	if(adminmenus("checkaccess","admin")=="1"){?>
    <div class="menudiv_item fr" id="menu1">
        <div class="menudiv_item_title fr sl2"><p>مدیریت</p><div class="icon" onclick="menushow('1');"></div></div>
        	<a href="adminloginlogs.php" title=""><div class="menudiv_item_links fr" id="adminloginlogs">گزارش ورود به سیستم</div></a>
        	<a href="adminlogs.php" title=""><div class="menudiv_item_links fr" id="adminlogs">گزارش اقدامات انجام شده</div></a>
        	<a href="adminmanage.php" title=""><div class="menudiv_item_links fr" id="adminmanage">مدیریت مدیران</div></a>
        	<a href="backup.php" title=""><div class="menudiv_item_links fr" id="backup">پشتیبان گیری</div></a>
        	<a href="blacklist.php" title=""><div class="menudiv_item_links fr" id="blacklist">لیست سیاه</div></a>
        	<a href="_page_sample.php" title="#"><div class="menudiv_item_links fr">تنظیمات</div></a>
    </div><!--menudiv_item--> 
	<?php }; ?>

	<?php if(adminmenus("checkaccess","admin")=="1"){?>
    <div class="menudiv_item fr" id="menu6">
        <div class="menudiv_item_title fr sl2"><p>بخش ارسال پیام</p><div class="icon" onclick="menushow('6');"></div></div>
        	<a href="sendMsg.php?sess=<?php echo $_SESSION['adminlogin_session'];?>" title="ارسال پیام"><div class="menudiv_item_links fr" id="sendMsg">ارسال پیام</div></a>
        	<a href="msgList.php" title=""><div class="menudiv_item_links fr" >لیست پیام ها</div></a>
    </div><!--menudiv_item--> 
	<?php }; ?>

	<?php if(adminmenus("checkaccess","admin")=="1"){?>
    <div class="menudiv_item fr" id="menu2">
        <div class="menudiv_item_title fr sl2"><p>مطالب</p><div class="icon" onclick="menushow('2');"></div></div>
        	<a href="categorymanage.php" title=""><div class="menudiv_item_links fr" id="categorymanage">مدیریت دسته بندی ها</div></a>
        	<a href="addpost.php?sess=<?php echo $_SESSION['adminlogin_session'];?>" title=""><div class="menudiv_item_links fr" id="addpost">اضافه کردن مطلب جدید</div></a>
        	<a href="postmanage.php" title=""><div class="menudiv_item_links fr" id="postmanage">مدیریت مطالب</div></a>
    </div><!--menudiv_item--> 
	<?php }; ?>


    <?php if(adminmenus("checkaccess","admin")=="1"){
		$result = db_query("SELECT `id` FROM `db_member` WHERE `memberlevel`='reseller' AND `reseller_confirm`='0'" , "select");
		$reseller_confirm = intval(mysqli_num_rows($result));?>  
    <div class="menudiv_item fr" id="menu3">
        <div class="menudiv_item_title fr"><p>نمایندگان</p><div class="icon" onclick="menushow('3');"></div></div>
        <a href="addreseller.php?sess=<?php echo $_SESSION['adminlogin_session'];?>" title=""><div class="menudiv_item_links fr" id="addreseller">اضافه کردن نماینده جدید</div></a>
        <a href="resellermanage.php?type=1" title=""><div class="menudiv_item_links fr" id="resellermanage1">مدیریت نمایندگان</div></a>
        <a href="resellermanage.php?type=0" title=""><div class="menudiv_item_links fr" id="resellermanage0">نمایندگان تایید نشده<b><?php echo $reseller_confirm; ?></b></div></a>
    </div><!--menudiv_item-->            
	<?php }; ?>


	<?php if(adminmenus("checkaccess","admin")=="1"){?>
    <div class="menudiv_item fr" id="menu5">
        <div class="menudiv_item_title fr"><p>محصولات</p><div class="icon" onclick="menushow('5');"></div></div>
		<a href="product_cate_manage.php" title=""><div class="menudiv_item_links fr" id="product_cate_manage">مدیریت دسته بندی ها</div></a>
        <a href="addproduct.php?sess=<?php echo $_SESSION['adminlogin_session'];?>" title=""><div class="menudiv_item_links fr" id="addproduct">اضافه کردن محصول جدید</div></a>
        <a href="productmanage.php" title=""><div class="menudiv_item_links fr" id="productmanage">مدیریت محصولات</div></a>
		<a href="productfarmers.php" title=""><div class="menudiv_item_links fr" id="productfarmers">محصولات کشاورزان</div></a>
    </div><!--menudiv_item-->            
	<?php }; ?>


 	<?php if(adminmenus("checkaccess","reseller")=="1"){?>
    <div class="menudiv_item fr" id="menu4">
        <div class="menudiv_item_title fr"><p>کشاورزان</p><div class="icon" onclick="menushow('4');"></div></div>
        <a href="addfarmers.php?sess=<?php echo $_SESSION['adminlogin_session'];?>" title=""><div class="menudiv_item_links fr" id="addfarmers">اضافه کردن کشاورز جدید</div></a>
		<a href="addfarmersfile.php?sess=<?php echo $_SESSION['adminlogin_session'];?>" title=""><div class="menudiv_item_links fr" id="addfarmersfile">اضافه کردن گروهی کشاورزان</div></a>
        <a href="farmersmanage.php" title=""><div class="menudiv_item_links fr" id="farmersmanage">مدیریت کشاورزان</div></a>
    </div><!--menudiv_item-->            
	<?php }; ?>

    
<?php
}//EndIF

?>