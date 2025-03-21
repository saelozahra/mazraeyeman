<?php
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
}//End Function

if(empty($_GET['act']) or !is_numeric($_GET['act']) or !isset($_SERVER['HTTP_REFERER']) or clean_url($_SERVER['HTTP_REFERER']) !== clean_url($_SERVER['HTTP_HOST']) ){
	die("");	
}//Endif

	function generate_captcha ($width = 120, $height = 30, $chars = 5)
	{
		header("Pragma: no-cache");
		header("Cache-Control: no-cache, must-revalidate");
		header("Expires: Mon, 26 Jul 1997 05:00:00 GMT");
		
		ini_set("session.gc_maxlifetime" ,1200); // 1200 Sanie ta ghabelEstefade bodan...
		session_start();
		
		header('Content-Type: image/png');
		$width > 200 ? $width = 200 : $width = $width;
		$height > 100 ? $height = 100 : $height = $height;
		$chars > 6 ? $chars = 6 : $chars = $chars;
		$code = generateRandomString($chars);
		
		function safe_html($text=null){
			return htmlspecialchars($text);
		}//safe_html	
		
		$_SESSION['captchacode'] = 'a'. md5('(@_@)' . base64_encode(safe_html(strtoupper($code)).'afarinesh_team')) . 'S';;
		
		$cap_img = "tools/captcha_back/back5.png";
		$im = imagecreatefrompng($cap_img);

		//$im = imagecreatetruecolor($width, $height);
		//$bg = imagecolorallocate($im, rand(30, 100), rand(30, 100), rand(30, 100));
		imagefilledrectangle($im, 0, 0, $width, $height );
		//$font = "tools/".rand(1,2).".ttf";
		
		$xspace = 10;
		$len = strlen($code);
		for ($index = 0; $index < $len; $index ++) {
			$numbers[] = substr($code, $index, 1);
		}//ENdFor
		
		$width = $width-5; $height = $height-5;
		
		foreach ($numbers as $value) {
			$fg = imagecolorallocate($im, rand(50, 100), rand(120, 130), rand(80, 150));
			imagettftext($im, rand($width / ($chars + 2)-1, $width / ($chars + 2) + 3), rand(-30, 30), $xspace, ($height / 2) + 12, $fg, "tools/1.ttf" , $value);
			$xspace += ($width / $chars) - 1;
		}//ENdForeach
		imagepng($im);
		imagedestroy($im);	
	}//End Function
	
	function generateRandomString ($length = 10)
	{
		$characters = '2345689ABCDEFGHABCDEFG4568985643HKMNPRSTUWXZ';
		$randomString = '';
		for ($i = 0; $i < $length; $i ++) {
			$randomString .= $characters[rand(0, strlen($characters) - 1)];
		}
		return $randomString;
	}//End Function
	
	generate_captcha();

?>