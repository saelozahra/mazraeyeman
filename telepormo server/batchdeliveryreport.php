<?php

include('./telepormo_functions.php');
echo SendMsgFunc("989176073187","پیام اومده");

if(file_put_contents("inputtext.txt",file_get_contents('php://input'))){
    echo "Shod";
}else{
    echo "nashod";
}
?>
