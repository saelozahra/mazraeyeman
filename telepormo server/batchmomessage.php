<?php 

include('./telepormo_functions.php');

$content = file_get_contents('php://input');

file_put_contents("inputtext.json",$content);

$json_data = json_decode($content, true);

SendMsgFunc("989170006373",'+'.$json_data['msisdn'] .' : 
'. $json_data['message']);

SendMsgFunc("989176073187",'+'.$json_data['msisdn'] .' : 
'. $json_data['message']);


//file_get_contents('http://mazraeyeman.ir/telepormo/receive_msg.php?message='.urlencode($json_data['message']).'&sender='.$json_data['msisdn'].'&time='.$json_data['datetime']);

$msg = array(
    "message"       => $json_data['message'],
    "sender"        => $json_data['msisdn'],
    "time"          => $json_data['datetime'],
);

httpPost("http://mazraeyeman.ir/telepormo/receive_msg.php",$msg);


?>
