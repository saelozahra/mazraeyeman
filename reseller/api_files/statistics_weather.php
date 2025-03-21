<?php
error_reporting(0);
session_start();
ob_start();
header('Content-type: application/json');

define("includesfile","true");
require("../includes/public_functions.php");

$userid = safe_enter($_GET['userid']);
$timespan = safe_enter($_GET['timespan']);
$order = safe_enter($_GET['order']);
$o = safe_enter($_GET['o']);


if( !empty($userid) ){
    
    $now  = time();
    $yek_rooz=24*3600;
    $day  = intval($now)-$yek_rooz;
    $day3 = intval($now)-(intval($yek_rooz)*3);
    $week = intval($now)-(intval($yek_rooz)*7);
    $month= intval($now)-(intval($yek_rooz)*30);
    $month6=intval($now)-(intval($yek_rooz)*30*6);
    $year = intval($now)-(intval($yek_rooz)*30*12);
    
    
    switch ($timespan) {
        case "day":
            $shart_tarikh = " (`time` between $day   and $now ) and  ";
            $shart_tarikh_day = $shart_tarikh;
            break;
        case "3day":
            $shart_tarikh = " (`time` between $day3  and $now ) and  ";
            $shart_tarikh_day3 = $shart_tarikh;
            break;
        case "week":
            $shart_tarikh = " (`time` between $week  and $now ) and  ";
            $shart_tarikh_week = $shart_tarikh;
            break;
        case "month":
            $shart_tarikh = " (`time` between $month and $now ) and ";
            $shart_tarikh_month = $shart_tarikh;
            break;
        case "6month":
            $shart_tarikh = " (`time` between $month6 and $now ) and ";
            $shart_tarikh_month6 = $shart_tarikh;
            break;
        case "year":
            $shart_tarikh = " (`time` between $year   and $now ) and ";
            $shart_tarikh_year = $shart_tarikh;
            break;
        case "all":
            $shart_tarikh = " ";
            break;
        default:
            $shart_tarikh = " ";
   }
    
	$query = " WHERE $shart_tarikh `farmers_user`='$userid'";
    
}else{
    die("Enter name and date");
}//ENdIF



if($order=="yes" and !empty($o)){
	$order_query = " ORDER BY `$o` DESC";
}else{
	$order_query = " ORDER BY `id` DESC";
}//ENdIf

if( !empty($timespan) ){
    $result = db_query("SELECT id,unique_id,AVG(humidity) as humidity_amar, AVG(cloudcover) as cloudcover_amar, AVG(uvindex) as uvindex_amar, AVG(dewpoint) as dewpoint_amar, AVG(ice) as ice_amar, AVG(snow) as snow_amar, AVG(rain) as rain_amar, AVG(wind) as wind_amar, AVG(temp) as temp_amar, AVG(ehtemal_precip) as ehtemal_precip_amar, AVG(ehtemal_rain) as ehtemal_rain_amar, AVG(ehtemal_ice) as ehtemal_ice_amar, AVG(ehtemal_snow) as ehtemal_snow_amar, AVG(ehtemal_gusts) as ehtemal_gusts_amar from db_weathers_log $query $order_query" , "select");
    

    if(mysqli_num_rows($result)){
        echo json_encode(mysqli_fetch_assoc($result));
    }else{
        echo json_encode(array("result"=>"not found"));
        exit;
    }
}else{
    
    $query_day  = " WHERE $shart_tarikh_day   `farmers_user`='$userid'";
    $query_week = " WHERE $shart_tarikh_week  `farmers_user`='$userid'";
    $query_month= " WHERE $shart_tarikh_month `farmers_user`='$userid'";
    $query_year = " WHERE $shart_tarikh_year  `farmers_user`='$userid'";

    $result_day = db_query("SELECT id,unique_id,AVG(humidity) as humidity_amar_day, AVG(cloudcover) as cloudcover_amar_day, AVG(uvindex) as uvindex_amar_day, AVG(dewpoint) as dewpoint_amar_day, AVG(ice) as ice_amar_day, AVG(snow) as snow_amar_day, AVG(rain) as rain_amar_day, AVG(wind) as wind_amar_day, AVG(temp) as temp_amar_day from db_weathers_log $query_day" , "select");
    $result_week = db_query("SELECT id,unique_id,AVG(humidity) as humidity_amar_week, AVG(cloudcover) as cloudcover_amar_week, AVG(uvindex) as uvindex_amar_week, AVG(dewpoint) as dewpoint_amar_week, AVG(ice) as ice_amar_week, AVG(snow) as snow_amar_week, AVG(rain) as rain_amar_week, AVG(wind) as wind_amar_week, AVG(temp) as temp_amar_week from db_weathers_log $query_week" , "select");
    $result_month = db_query("SELECT id,unique_id,AVG(humidity) as humidity_amar_month, AVG(cloudcover) as cloudcover_amar_month, AVG(uvindex) as uvindex_amar_month, AVG(dewpoint) as dewpoint_amar_month, AVG(ice) as ice_amar_month, AVG(snow) as snow_amar_month, AVG(rain) as rain_amar_month, AVG(wind) as wind_amar_month, AVG(temp) as temp_amar_month from db_weathers_log $query_month" , "select");
    $result_year = db_query("SELECT id,unique_id,AVG(humidity) as humidity_amar_year, AVG(cloudcover) as cloudcover_amar_year, AVG(uvindex) as uvindex_amar_year, AVG(dewpoint) as dewpoint_amar_year, AVG(ice) as ice_amar_year, AVG(snow) as snow_amar_year, AVG(rain) as rain_amar_year, AVG(wind) as wind_amar_year, AVG(temp) as temp_amar_year from db_weathers_log $query_year" , "select");
    
    echo json_encode(array("daily_statistics"=>mysqli_fetch_assoc($result_day),"weekly_statistics"=>mysqli_fetch_assoc($result_week),"monthly_statistics"=>mysqli_fetch_assoc($result_month),"yearly_statistics"=>mysqli_fetch_assoc($result_year)));
}

?>