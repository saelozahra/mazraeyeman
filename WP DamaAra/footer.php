 </main>
    
<footer class="row">
    
    <div class="map">
        <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3464.8236431080477!2d52.46457518523857!3d29.72486734055394!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3fb21a107e0789dd%3A0xf69591f248430bb4!2z2b7Yp9ix2qkg2LnZhNmFINmIINmB2YbYp9mI2LHbjCDZgdin2LHYsw!5e0!3m2!1sfa!2s!4v1549234509114" width="1000" height="313" frameborder="0" style="border:0;width: 100%;" allowfullscreen></iframe>
    </div>
    <div class="footer1">
        <?php if ( is_active_sidebar( 'footermap' ) ) : ?>
            <div id="primary-sidebar" class="primary-sidebar widget-area" role="complementary">
                <?php dynamic_sidebar( 'footermap' ); ?>
            </div><!-- #primary-sidebar -->
        <?php endif; ?>
    </div>

</footer>
    
<script>
$(document).ready(function(){
    

  $(".slider2").owlCarousel({
        loop:false,
        margin:24,
        nav:false,
        navText:['<i class=" fa fa-chevron-left"></i>','<i class=" fa fa-chevron-right"></i>'],
        dots:true,
        autoplay:true,
        responsive:{
            0:{
                items:1
            },
            600:{
                items:3
            },
            1400:{
                items:4
            }
        }
    });
    

  $(".slider1").owlCarousel({
        loop:false,
        margin:10,
        nav:false,
        navText:['<i class=" fa fa-chevron-left"></i>','<i class=" fa fa-chevron-right"></i>'],
        dots:true,
        autoplay:true,
        responsive:{
            0:{
                items:1
            },
            600:{
                items:1
            },
            1400:{
                items:2
            }
        }
    });
    
});
    

</script>
    
     <?php wp_footer(); ?>

</body>
</html>