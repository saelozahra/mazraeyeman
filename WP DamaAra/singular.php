<?php get_header();?>
 
<?php
	

	 $key="view";
	 
	 $view_count = get_post_meta($post->ID, $key, true);

	

	 if ( ! add_post_meta( $post->ID, $key, $view_count+1 , true ) ) { 

		update_post_meta ( $post->ID, $key, $view_count+1 );

	 }


	
	 $key_like="like";

	 $view_likes = get_post_meta($post->ID, $key_like, true);


	 if(isset($_POST["like"])){

		 if ( ! add_post_meta( $post->ID, $key_like, $view_likes+1 , true ) ) { 
	
			update_post_meta ( $post->ID, $key_like, $view_likes+1 );
	
		 }
	 }
	 
	 
?>


    <article class="container" itemtype="http://schema.org/Article" itemscope="" role="article" >
         
        <figure class="content  alishoghal outer_div_body" id="post-<?php the_ID(); ?>" <?php post_class(); ?> >

          <?php if(have_posts()) : ?>

          <?php while(have_posts()) : the_post(); ?>

          <?php
                $title1 = ' تاریخ ثبت : ' . get_the_time('M j/Y') .' نویسنده: '. get_the_author() . ' تعداد بازدید : ' . $view_count;
                $shortUrl = get_bloginfo('url')."?p=".get_the_ID() ;
          ?>
            <figcaption>
                <h1 class="entry-title" itemprop="name"> <?php echo "<a href='".$shortUrl."' title='".get_the_title()."' >" .get_the_title()." </a>"; ?> </h1>
            </figcaption>
            

            <a itemtype='http://schema.org/ImageObject' itemscope itemprop='associatedMedia' href='<?php the_permalink(); ?>' title='<?php the_title_attribute(); ?>' >
            	<?php //if ( has_post_thumbnail() ) { the_post_thumbnail('full', array( 'class' => 'content_primary_image' )); } ?>
            </a>

            <p>
            
            <?php
            	
				the_content();
							
			?>
            
			

            <?php the_tags( "<nav id='tags' class='tr'>", "  " , " </nav><br style='clear:both'>" ); ?>

                
            </p>
            

          <?php endwhile; ?>
    
          <?php endif; ?>
        </figure><!--end content-->


        
        <div id="comments_lists_section" class="tr comments">
            <?php comments_template(); ?>
        </div>
        
    </article>
    
    

<?php get_footer(); ?>