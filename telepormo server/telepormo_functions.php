
<?php

function SendMsgFunc($ftel,$text) {
    $msg = array(
        "username"      => "damaara",
        "password"      => "D321!@#",
        "serviceid"     => "11140",
        "shortcode"     => "983072451",
        "msisdn"        =>  $ftel,
        "description"   =>  "deliverychannel=WAP|discoverychannel=WAP|origin=984060|contentid=3214",
        "chargecode"    =>  "TELSUBCTELKESHAVAR",
        "amount"        =>  "0",
        "currency"      =>  "RLS",
        "message"       =>  urldecode($text),
        "is_free"       =>  "1",
        "correlator"    =>  "983072451-correlato-testttt",
        "servicename"   =>  "CTELKESHAVARZI",
    );
    
    httpPost('http://10.20.9.187:8700/samsson-gateway/sendmessage/',$msg);
}// end Notification function




function generateRandomString($length = 18) {
    $characters = '0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ';
    $charactersLength = strlen($characters);
    $randomString = '';
    for ($i = 0; $i < $length; $i++) {
        $randomString .= $characters[rand(0, $charactersLength - 1)];
    }
    return "Ya_".$randomString."_Ali";
}


function httpPost($url, $data)
{
    $curl = curl_init($url);
    curl_setopt($curl, CURLOPT_POST, true);
    curl_setopt($curl, CURLOPT_POSTFIELDS, http_build_query($data));
    curl_setopt($curl, CURLOPT_RETURNTRANSFER, true);
    curl_setopt($curl, CURLOPT_SSL_VERIFYPEER, 0); // On dev server only!
    $response = curl_exec($curl);
    curl_close($curl);
    return $response;
}


?>