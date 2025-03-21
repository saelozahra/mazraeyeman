<?php
defined('includesfile') or die(header('Location: '.' warning.php?err=FileAccess'));
error_reporting(0);

function clean_url($url) 
{
    if($url == '') return;
    $url = str_replace('http://', null, strtolower($url));
    $url = str_replace('https://', null, $url );
    if(substr($url, 0, 4) == 'www.')  $url = substr($url, 4);
    $url = explode('/', $url);
    $url = reset($url);
    $url = explode(':', $url);
    $url = reset($url);
    return $url;
}

if(!isset($_SERVER['HTTP_REFERER']) or clean_url($_SERVER['HTTP_REFERER']) !== clean_url($_SERVER['HTTP_HOST']) ){
	die("");	
}//Endif
?>

