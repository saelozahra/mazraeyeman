<?php get_header(); ?>
    
    <?php include('slider1.php') ?>



    <div class="sld2 row">
        
     <div class="owl-carousel slider2"  >
                 
        <?php
        $args = array(
            'post_type' => 'product',
        );
            // The Query
            $the_query = new WP_Query( $args );

            // The Loop
            if ( $the_query->have_posts() ) {
                while ( $the_query->have_posts() ) {
        ?>
         
                 <a href="<?php the_permalink(); ?>" class="sld2itm" title="<?php the_title(); ?>">
                     <?php the_post_thumbnail( 'medium' ); ?>
                 </a>
                <?php
                    $the_query->the_post();
                }
                /* Restore original Post Data */
                wp_reset_postdata();
            } else {
                // no posts found
            }
        ?>
      </div>
    </div>
    
    <div class="backmain3 row">
        <div class="backmainText">
            <?php if ( is_active_sidebar( 'home_about' ) ) : ?>
                <div id="primary-sidebar" class="primary-sidebar widget-area" role="complementary">
                    <?php dynamic_sidebar( 'home_about' ); ?>
                </div><!-- #primary-sidebar -->
            <?php endif; ?>
        </div>
    </div>

     <div class="main4 row">
		<video class="dark_hover" autoplay muted loop id="myVideo1">
			<source src="<?php bloginfo("template_url"); ?>/IMG/video-bg.mp4" type="video/mp4">
		</video>
        <div class="dark_hover"></div>

         
             <?php if ( is_active_sidebar( 'ads' ) ) : ?>
                <div id="primary-sidebar" class="primary-sidebar widget-area container" role="complementary" style="position: relative;">
                    <?php dynamic_sidebar( 'ads' ); ?>
                </div><!-- #primary-sidebar -->
            <?php endif; ?>
     </div>
     <div class="main5"></div>


<?php get_footer(); ?>
