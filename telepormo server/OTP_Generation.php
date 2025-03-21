<?php

header('Content-Type: application/json');

include('./telepormo_functions.php');

$msg = array(
    "username"      => "damaara",
    "password"      => "D321!@#",
    "serviceid"     => "11140",
    "shortcode"     => "983072451",
    "msisdn"        =>  $_GET['tel'],
    "servicename"   =>  "CTELKESHAVARZI",
    "referencecode" =>  generateRandomString(),
    "contentid"     =>  "121",
    "chargecode"    =>  "TELSUBCTELKESHAVAR",
    "description"   =>  "my app name is :test",
);

echo httpPost("http://10.20.9.187:8700/samsson-gateway/otp-generation/",$msg);


?>