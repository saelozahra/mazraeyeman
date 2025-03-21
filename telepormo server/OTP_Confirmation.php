<?php

header('Content-Type: application/json');

include('./telepormo_functions.php');

$msg = array(
    "username"      => "damaara",
    "password"      => "D321!@#",
    "serviceid"     => "11140",
    "shortcode"     => "983072451",
    "msisdn"        =>  $_GET['tel'],
    "referencecode" =>  $_GET['referencecode'],
    "contentid"     =>  "110",
    "servicename"   =>  "CTELKESHAVARZI",
    "otptransaction"=>  $_GET['otptransaction'],
    "message"       =>  $_GET['msg'],
);

echo httpPost("http://10.20.9.187:8700/samsson-gateway/otp-confirmation/",$msg);


?>