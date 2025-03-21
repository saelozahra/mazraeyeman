<?php get_header();?>

    <section class="archive-section" itemtype="http://schema.org/Article" itemscope="" role="article" >
        
        
        <figure class="container">

        <?php

        if( have_posts() ) { 

            while (have_posts()) : the_post();  ?>

                <a href="<?php the_permalink(); ?>" title="<?php the_title(); ?>" class="tar tr row" >
                    <div class="fr">
                        <?php if ( has_post_thumbnail() ) { the_post_thumbnail('thumbnail', array('class' => 'dayereei'));  }?>
                    </div>
                    <h2 class="titr"><?php the_title(); ?></h2><!--titr-->
                    <div class="lead"><?php the_excerpt(); ?></div><!--lead-->
                </a>

        <?php
            endwhile;
        }
        wp_reset_query();  // Restore global post data stomped by the_post().
        ?>

<nav class="container nav_pag_num">
	<?php
    global $wp_query;
    
    $big = 999999999; // need an unlikely integer
    
    echo paginate_links( array(
        'base' => str_replace( $big, '%#%', esc_url( get_pagenum_link( $big ) ) ),
        'format' => '?paged=%#%',
        'current' => max( 1, get_query_var('paged') ),
        'total' => $wp_query->max_num_pages
    ) );
    ?>
</nav>


        </figure><!--end -->


    </section>
   

<?php get_footer(); ?>