<?php


add_action( 'after_setup_theme', 'register_my_menu' );
function register_my_menu() {
    register_nav_menu( 'primary', __( 'منوی اصلی' ) );
}

add_theme_support( 'post-thumbnails' ); 




add_action( 'admin_menu', 'admin_menu_add_external_link_top_level' );

function admin_menu_add_external_link_top_level() {
    global $menu;
    $menu_pos = 1; // whatever position you want your menu to appear

    // create the top level menu, using $menu_slug as a placeholder for the link
    add_menu_page( 'admin_menu_add_external_link_top_level', 'پنل مدیریت اصلی', 'read', "external_slug", 'aaaaa', '', $menu_pos );

    // replace the slug with your external url
    $menu[$menu_pos][2] = "https://mazraeyeman.ir/reseller/panel/";
}






function arphabet_widgets_init() {

	register_sidebar( array(
		'name'          => 'درباره ی ما',
		'id'            => 'home_about',
		'before_widget' => '<div>',
		'after_widget'  => '</div>',
		'before_title'  => '<h2 class="rounded">',
		'after_title'   => '</h2>',
	) );
    
    register_sidebar( array(
		'name'          => 'تبلیغات',
		'id'            => 'ads',
		'before_widget' => '<div>',
		'after_widget'  => '</div>',
		'before_title'  => '<h2 class="rounded ads_widget_title">',
		'after_title'   => '</h2>',
	) );
    
    register_sidebar( array(
		'name'          => 'فوتر',
		'id'            => 'footermap',
		'before_widget' => '<div>',
		'after_widget'  => '</div>',
		'before_title'  => '<h2 class="rounded map_widget_title">',
		'after_title'   => '</h2>',
	) );
}

add_action( 'widgets_init', 'arphabet_widgets_init' );



?>