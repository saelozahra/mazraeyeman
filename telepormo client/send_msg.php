<?php

//file_get_contents('https://mazraeyeman.ir/telepormo/receive_msg.php?id=222&message=aaaaa&sender=amir&time=time');

var_dump(file_get_contents('http://79.175.163.211:4300/telepormo/OTP_Generation.php?tel=989176073187'));
echo "<br>";

var_dump(file_get_contents('http://79.175.163.211:3400/telepormo/OTP_Generation.php?tel=989176073187'));


//if(file_get_contents('http://79.175.163.211:4300/telepormo/OTP_Generation.php?tel=989176073187')){
//	echo file_get_contents('http://79.175.163.211:4300/telepormo/OTP_Generation.php?tel=989176073187');
//	echo "ya ali";
//}else{
//	echo "Error dad";
//	error_log("Error Dad");
//}
?>