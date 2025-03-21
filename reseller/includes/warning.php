<?php
error_reporting(0);

$err_txt_fr = "";
if(!empty($_GET['err'])){
	
	switch($_GET['err']){
		case 'DbConnect':
			$err_txt_fr="در ارتباط با پایگاه داده مشکلی بوجود آمد. لطفا مجددا اقدام نمایید.";
			$err_txt_en="A Database Error Occurred! . Please Try Again";
			$err_txt_des="این صفحه به این معناست که سایت به صورت موقت از حالت سرویس دهی خارج شده است.";
			break;
		case 'FileAccess':
			$err_txt_fr="دسترسی به فایل مورد نظر امکان پذیر نمی باشد.";
			$err_txt_en="<b>Access Denied!</b> Please Try Again";
			$err_txt_des="این صفحه به این معناست که سایت به صورت موقت از حالت سرویس دهی خارج شده است.";
			break;
		case 'BlackList' :
			$err_txt_fr="دسترسی به سایت برای شما محدود شده است. </br > لطفا جهت رفع این موضوع با مدیریت سایت در ارتباط باشید.";
			$err_txt_en="<b>You Are Blocked In The Site!</b>";
			$err_txt_des="این صفحه به این معناست که سایت به صورت موقت از حالت سرویس دهی خارج شده است.";
			break;
		}//EndSwitch
		
	if($err_txt_fr==""){exit;};

?>



<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="fa" xml:lang="fa" dir="rtl">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta http-equiv="X-UA-Compatible" content="IE=edge" />
	<meta http-equiv="content-language" content="fa" />    
	<title>خطا</title>
	<meta name="robots" content="noindex, nofollow" />
    <meta name="googlebot" content="noindex">  
    <link rel="shortcut icon" href="tools/sec2.png" />
	<style>
    	*{margin:0;padding:0}
		body{background-color:#608dff;direction:rtl}
		#content{position:relative;background-color:#f6f6f6;font:12px tahoma;min-height:200px;padding:5px 200px 5px 5px;margin:15% auto 0;width:40%}
		#content img{position:absolute;top:0;right:0}
		#content .fa{background-color:#608dff;padding:5px;color:#fff6c5;margin:5px 0;font:14px tahoma;text-align:center}
		#content .en{background-color:#608dff;direction:ltr;color:#fff6c5;padding:5px;margin:5px 0;text-align:center}
		#content a{text-decoration:none;position:absolute;bottom:5px;left:15px;color:#ff6960}
		#content a:hover{text-decoration:underline}
		.timer { float:left; width:60px; height:20px; margin:10px 0 0 0; font-family:tahoma; font-size:12px; color:red;}
    </style>
    <script>
		var i=parseInt(14);
		timer = setInterval("counter()",1000);
		
		function counter(){
			divM=document.getElementById('timer');
			divM.innerHTML=i;
			i-=1;
			
			if(i==-1){
				clearTimeout(timer);
				setTimeout("location.href='" + "../" + "'", 1);
			}//EndIf
		}//EndFunction
	</script>
</head>
<body>
    <div id="content">
        <img src="tools/sec2.png" draggable="false" />
        <div class="fa"><?php echo $err_txt_fr; ?></div>
        <div class="en"><?php echo $err_txt_en; ?></div>
        <br/><br/>
        <?php echo $err_txt_des; ?>
        <br/><br/>
        <div class="timer"><b id="timer" onclick="Start();">15</b> ثانیه</div>
    </div>
</body>
</html>


<?php
}//End if
?>