<div class="owl-carousel slider1 row">
        
<?php
$args = array(
	'post_type' => 'post',
	'post__in'  => get_option( 'sticky_posts' ),
	'ignore_sticky_posts' => 1
);
    // The Query
    $the_query = new WP_Query( $args );

    // The Loop
    if ( $the_query->have_posts() ) {
        while ( $the_query->have_posts() ) {
			$the_query->the_post();

?>
      <a href="<?php the_permalink(); ?>">
          <?php the_post_thumbnail( 'full' ); ?>
          <div class="greenhover">
              <h2><?php the_title(); ?></h2>
          </div>
      </a>
        <?php
        }
        /* Restore original Post Data */
        wp_reset_postdata();
    } else {
        // no posts found
    }
?>
</div><!--END SLIDER1-->