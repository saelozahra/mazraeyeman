<?php 
include('./telepormo_functions.php');




$content = file_get_contents('php://input');

file_put_contents("inputNotification.json",$content);

$json_data = json_decode($content, true);

if($json_data['chargecode']=="TELSUBCTELKESHAVAR"){

    echo SendMsgFunc("989176073187",$json_data['msisdn']."
    با موفقیت در سامانه عضو شد.");
    echo SendMsgFunc("989170006373",$json_data['msisdn']."
    با موفقیت در سامانه عضو شد.");

    echo SendMsgFunc($json_data['msisdn'],"سلام
برای استفاده از کلیه خدمات سامانه کنترل هوشمند کشاورزی و دریافت اطلاعات کامل هواشناسی زمین کشاورزی خود نرم افزار «مزرعه من» را نصب کنید.
MazraeyeMan.ir/application

🥒🍇🍉🍒🍑");
    
    
}elseif($json_data['chargecode']=="TELUSUBCTELKESHAVA"){

    echo SendMsgFunc("989176073187",$json_data['msisdn']."
    عضویت خود را لغو کرد");
    echo SendMsgFunc("989170006373",$json_data['msisdn']."
    عضویت خود را لغو کرد");

    echo SendMsgFunc($json_data['msisdn'],"درخواست لغو عضویت شما ثبت گردید.
    لازم بذکر است کلیه خدمات وابسته به این سامانه کشاورزی متوقف شده و به منظور ارائه این خدمات تنها کافیست عدد ۱ را مجددا به شماره +983072451 ارسال فرمایید.");
    
}

?>