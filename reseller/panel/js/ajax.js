function isEmpty(str) {
	return (!str || !str.trim());
}//EndFunction

function validateEmail(email) {
    var re = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
    return re.test(email);
}//EndFunction

function recaptcha(act){
	var rnd=Math.floor((Math.random()*1000)+1); 
	document.getElementById("imgcaptcha").src='captcha.png?act=' + rnd;
	if(act=='click'){ document.getElementById("code_sec").focus(); }//endIf 
}//recaptcha


function form_ajax(act)
{
	if(act==null){act=''}
	if(act==2){spacecheck();}
	var number=0;
	 $(document).on("submit", "#form_ajax", function() {
		 if(number<1){		 
			  $('#form_ajax_result'+act).slideUp('slow', function(){
				  $(this).html('<img src="images/loading3.gif">&nbsp;لطفا صبر کنید ...').slideDown('slow');
			   });		
			
			  var form = $(this),
				  action = form.attr('action'),
				  method = form.attr('method'),
				  dataSerialize = form.serialize();
			   
			  var request = $.ajax({
				type: method,
				url: action,
				data: dataSerialize
			  });
			  request.done(function(data) {
				 $('#form_ajax_result'+act).slideUp('slow', function(){
						$(this).html(data).slideDown('slow');
					});
					
			  });		
			  request.fail(function() {
					$('#form_ajax_result'+act).slideUp('slow', function(){
						$(this).html('خطا در ارتباط . لطفا مجدد تلاش کنید...').slideDown('slow');
					});
			  });			  
		 number++;	  
		 }//endIf
		  return false;
	});

}//form_ajax


var menuoldheight  = new Array();
function menushow(act)
{
	if($("#menu"+act).height()!="35"){
		var menu = $("#menu"+act);			
		menu.animate({height:'35px'},"slow");	
		menuoldheight[act] = $("#menu"+act).height();
	}else{
		var menu = $("#menu"+act);
		menu.animate({height:menuoldheight[act]+'px'},"slow");	
	}//EndIf	
}//menushow


timerreset=0;
function LoginTimerReset(){
	$(function () {
        $.ajax({url:"index.php"});
	});
	timerreset=1;
	
	var act="index.php?act=refreshtime";
	xmlhttp=new XMLHttpRequest();
	xmlhttp.open("GET", act, false);
	xmlhttp.send();
	var result = xmlhttp.responseText;
	if(result=="resetok"){
		document.getElementById('countbox1').style="color:#48b300;";
	}else{
		document.getElementById('countbox1').style="color:red;";
		alert("خطا : در بازبینی زمان مشکلی پیش آمد! لطفا مجددا امتحان کنید.");
	}//EndIf	
	
	
}//LoginTimerReset


dateFuture1 = new Date();
function GetCount(ddate,iid){
	
	dateNow = new Date();	//grab current date
	amount_time = ddate.getTime() - dateNow.getTime()+1801020;	//calc milliseconds between dates
	delete dateNow;
	
	// if time is already past
	if(amount_time < 0){
		//document.getElementById(iid).innerHTML="Now!";
		setTimeout("location.href='" + "login.php" + "'", 1 * 700);
	}
	// else date is still good
	else{
		mins=0;secs=0;out="";
		
		if(amount_time<120000){
			document.getElementById(iid).style.color="red";
		}//////

		if(timerreset==1){
			ddate = new Date();
			document.getElementById(iid).style.color="black";
					
			timerreset=0;
		}//////
		
		amount_time = Math.floor(amount_time/1000); ///kill the "milliseconds" so just secs

		mins=Math.floor(amount_time/60); ///minutes
		amount_time=amount_time%60;

		secs=Math.floor(amount_time); //seconds	

		out += mins +" "+((mins==1)?"دقیقه":"دقیقه")+" , ";
		out += secs +" "+((secs==1)?"ثانیه":"ثانیه")+" , ";
		out = out.substr(0,out.length-2);
		document.getElementById(iid).innerHTML=out;
		
		setTimeout(function(){GetCount(ddate,iid)}, 1000);
	}
}//GetCount

/////////////////////////////////////////////
window.onload=function(){
	GetCount(dateFuture1, 'countbox1');
}//window.onload=function
/////////////////////////////////////////////

function endshowresult(){
	setTimeout("$('#form_ajax_result').fadeOut('slow');", 5000);
}//endshowresult

function spacecheck(){
	document.getElementById("spacecheck").style.display="none";
}//spacecheck


function adminpage_loader(act){
	if(act=="1"){
		document.getElementById("bodydiv_item_body").style.display="none";
		document.getElementById("bodydiv_page_loading").style.height="20px";
	}//EndIF
	if(act=="2"){	
		document.getElementById("bodydiv_page_loading").style.display="none";
		document.getElementById("bodydiv_item_body").style.display="block";		
	}//EndIF
}//adminpage_loader

