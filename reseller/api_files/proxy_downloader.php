<?php

header('Content-type: application/json');

if(!isset($_GET['url'])){
	die("chi mikhay?");
}

$url = urldecode($_GET['url']);

if(strpos($url, 'accuweather') == false){
	die("bilakh");
}

echo file_get_contents($url);

?>