<!DOCTYPE html>
<html>
<head>
    <meta charset="<?php bloginfo( 'charset' ); ?>" >
    <title><?php bloginfo('name'); wp_title(); ?></title>
    <meta name="description" content="<?php if ( is_single() ) {
        single_post_title('', true); 
    } else {
        bloginfo('name'); echo " - "; bloginfo('description');
    }
    ?>" >
    <link rel="stylesheet" href="https://cdn.rawgit.com/rastikerdar/tanha-font/v0.4.1/dist/font-face.css">
    <link rel="stylesheet" href="<?php bloginfo("template_url"); ?>/OwlCarousel2-2.3.4/dist/assets/owl.carousel.min.css">
    <link rel="stylesheet" href="<?php bloginfo("template_url"); ?>/OwlCarousel2-2.3.4/dist/assets/owl.theme.default.min.css">
    <script src="<?php bloginfo("template_url"); ?>/js/jquery-3.3.1.min.js"></script>
    <script src="<?php bloginfo("template_url"); ?>/OwlCarousel2-2.3.4/dist/owl.carousel.min.js"></script>
     <?php wp_head(); ?>
    <link rel="stylesheet" href="<?php bloginfo("stylesheet_url"); ?>">
</head>
<body <?php body_class(); ?> >
    <header class="row">
        <div class="container">
            <div class="fr">
                <a href="<?php bloginfo("url"); ?>">
                    <img class="logo" src="<?php bloginfo("template_url"); ?>/IMG/logo.png">
                </a>
            </div>
            <div class="fl searchbox">
                <form style="margin-top: 25px;" method="get" action="<?php bloginfo("url"); ?>">
                    <input type="search" name="s" placeholder="جستجو">
                    <input type="submit" value="" >
                </form>
            </div>
        </div>
        
        <?php wp_nav_menu( array( 'theme_location' => 'primary' ) ); ?>

    </header>
 <main>