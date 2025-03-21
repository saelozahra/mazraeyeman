<?php

error_reporting(0);
session_start();
ob_start();

define("includesfile","true");
require("../reseller/includes/public_functions.php");

$id = $_POST['id'];
$message = urldecode($_POST['message']);
$sender = $_POST['sender'];
$time = $_POST['time'];

echo db_query("INSERT INTO `db_smss` (`id`, `message`, `sender`, `time`) VALUES (NULL, '$message' , '$sender' , '$time');","insert");

?>