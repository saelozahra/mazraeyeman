<?php
defined('includesfile') or die(header('Location: '.' warning.php?err=FileAccess'));
error_reporting(0);

############################ DB Connection :
$db_host = "localhost";
$db_user = "mazraeye_resuser";
$db_pass = "ifXvb4eE3j";
$db_name = "mazraeye_resdb";

$db_conncect = mysqli_connect($db_host, $db_user, $db_pass , $db_name) or die(header('Location: '.' warning.php?err=DbConnect'));
$db_conncect->query("SET CHARACTER SET utf8;");
$db_conncect->query("SET SESSION collation_connection = 'utf8_general_ci'");

############################ BlackLisk Checker :
global $blacklist_query;

if(empty($blacklist_query)){
	$blacklist_query = mysqli_query($db_conncect, "SELECT `ip` FROM `db_blacklist` WHERE `ip`='".getip()."' LIMIT 1 ");
}//EndIF

if(mysqli_num_rows($blacklist_query)==1) {
	header('Location: '.' warning.php?err=BlackList') or die();
}//endif

?>