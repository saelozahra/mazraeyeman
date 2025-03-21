<style>
@import 'https://cdn.rawgit.com/rastikerdar/samim-font/v3.1.0/dist/font-face.css';
*,body,html{
	direction:rtl;
	font-family:'Samim';
	line-height:2;
	font-size:120%;
}
</style>
<?php
error_reporting(0);
session_start();
ob_start();

define("includesfile","true");
require("../includes/public_functions.php");

$id = safe_enter($_GET['id']);

$result = db_query("SELECT db_product_farmers.*,db_product.title as product_title FROM `db_product_farmers` LEFT JOIN db_product ON db_product.id =db_product_farmers.product WHERE db_product_farmers.`id`='$id'" , "select");
if(mysqli_num_rows($result)){

	while($row = mysqli_fetch_assoc($result)){	
		//print_r($row);
		echo "<img style='max-width:100%;' src='https://mazraeyeman.ir/reseller/fileupload/product/".$row['pic']."'><br>";
		echo $row['vazn'].' تن <b>'.$row['product_title'].'</b><br>';
		echo 'قیمت هر تن <b>'.$row['ghimat'].'</b><br>';
		echo 'زمان ارائه: <b>'.$row['zaman_eraa'].'</b><br>';
		if(!empty($row['des'])){echo 'توضیحات: '.$row['des'];}
	}

}else{
	echo "not found";
	exit;
}//EndIF
?>