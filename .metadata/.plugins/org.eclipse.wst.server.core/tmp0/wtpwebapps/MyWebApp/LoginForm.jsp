<!DOCTYPE html>
<html lang="en-IN">
<head>
<meta charset="utf-8">
<link rel='stylesheet prefetch' href='https://fonts.googleapis.com/css?family=Open+Sans:600'>
 <script src="https://apis.google.com/js/platform.js" async defer></script>

  
 <meta name="google-signin-client_id" content="229306623946-p03t1aro8bce7611n19v5nu3vc8fosib.apps.googleusercontent.com">
 
<title></title>
<link href='http://fonts.googleapis.com/css?family=Ropa+Sans' rel='stylesheet'>
<link href="http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel='stylesheet'>
 



<style>
 
li,ul,body,input{margin:0; padding:0; list-style:none}
#login-form{width:350px; background:#FFF; margin:0 auto; margin-top:0px; background:#f8f8f8; overflow:hidden; border-radius:7px}
.form-header{display:table; clear:both}
.form-header label{display:block; cursor:pointer; z-index:999}
.form-header li{margin:0; line-height:60px; width:175px; text-align:center; background:#eee; font-size:18px; float:left; transition:all 600ms ease}

/*sectiop*/
.section-out{width:700px; float:left; transition:all 600ms ease}
.section-out:after{content:''; clear:both; display:table}
.section-out section{width:350px; float:left}

.login{padding:20px}
.ul-list{clear:both; display:table; width:100%}
.ul-list:after{content:''; clear:both; display:table}
.ul-list li{ margin:0 auto; margin-bottom:12px}
.input{background:#fff; transition:all 800ms; width:247px; border-radius:3px 0 0 3px; font-family: 'Ropa Sans', sans-serif; border:solid 1px #ccc; border-right:none; outline:none; color:#999; height:40px; line-height:40px; display:inline-block; padding-left:10px; font-size:16px}
.input,.login span.icon{vertical-align:top}
.login span.icon{width:50px; transition:all 800ms; text-align:center; color:#999; height:40px; border-radius:0 3px 3px 0; background:#e8e8e8; height:40px; line-height:40px; display:inline-block; border:solid 1px #ccc; border-left:none; font-size:16px}
.input:focus:invalid{border-color:red}
.input:focus:invalid+.icon{border-color:red}
.input:focus:valid{border-color:green}
.input:focus:valid+.icon{border-color:green}
#check,#check1{top:1px; position:relative}
.btn23{border:none; 																																																												outline:none; background:#0099CC; border-bottom:solid 4px #006699; font-family: 'Ropa Sans', sans-serif; margin:0 auto; display:block; height:40px; width:100%; padding:0 10px; border-radius:3px; font-size:16px; color:#FFF}

.social-login{padding:15px 20px; background:#f1f1f1; border-top:solid 2px #e8e8e8; text-align:right}
.social-login a{display:inline-block; height:35px; text-align:center; line-height:35px; width:35px; margin:0 3px; text-decoration:none; color:#FFFFFF}
.form a i.fa{line-height:35px}
.fb{background:#305891} .tw{background:#2ca8d2} .gp{background:#ce4d39} .in{background:#006699}
.remember{width:50%; display:inline-block; clear:both; font-size:14px}
.remember:nth-child(2){text-align:right}
.remember a{text-decoration:none; color:#666}

.hide{display:none}

/*swich form*/
#signup:checked~.section-out{margin-left:-350px}
#login:checked~.section-out{margin-left:0px}
#login:checked~div .form-header li:nth-child(1),#signup:checked~div .form-header li:nth-child(2){background:#e8e8e8}
</style>
</head>
<body>
<div id="login-form">

<input type="radio" checked id="login" name="switch" class="hide">
<input type="radio" id="signup" name="switch" class="hide">

<div>
<ul class="form-header">
<li><label for="login"><i class="fa fa-lock"></i> LOGIN<label for="login"></li>
<li><label for="signup"><i class="fa fa-credit-card"></i> REGISTER</label></li>
</ul>
</div>





 <script type="text/javascript">

 			var xml;
 			if(window.XMLHttpRequest){
				xml = new XMLHttpRequest();
 			}else if(window.ActiveXObject){
 	 			xml = new ActiveXObject("MICROSOFT.XMLHttp");

 	 		}
			function onSignIn(googleUser) {
			  var profile = googleUser.getBasicProfile();
			  console.log('reached here atleast');
			   
			document.getElementById('id').value = profile.getId();
			document.getElementById('name').value = profile.getName();
			document.getElementById('email').value = profile.getEmail();
			document.getElementById('imageurl').value = profile.getImageUrl();
			console.log('Reached till the end');
			
	
			 var auth2 = gapi.auth2.getAuthInstance();
			    auth2.signOut().then(function () {
			      console.log('User signed out.');
			    });
			     
				sendMessageToServer(profile,profile.getId(), profile.getName(), profile.getEmail(), profile.getImageUrl());    
			}
			function sendMessageToServer(profile, id, name, email, image){
				 
				xml.open("POST", 'doWithGmail.do?id='+id+'&name='+profile.getName()+'&email='+profile.getEmail()+'&image='+profile.getImageUrl());
				xml.onreadystatechange = changeState;
				xml.send();
					
			} 
			function changeState(){
				 
					document.getElementById('login_form').style.display = 'none';
					jQuery('#navBar').load(' #navBar');	
					jQuery('#sampleProducts').load(' #sampleProducts');
					 
				 

			}
			 
			function checkUser(){
				var xml2;
	 			if(window.XMLHttpRequest){
					xml2 = new XMLHttpRequest();
	 			}else if(window.ActiveXObject){
	 	 			xml2 = new ActiveXObject("MICROSOFT.XMLHttp");

	 	 		}
				console.log("reachecd to check user");
				var form = document.getElementById('register-form');
				var email = document.getElementById('email-register').value;
				xml2.open("GET",'CheckUserInDB?email='+email,true);
				xml2.onload = function(){
					
						var queryy = JSON.parse(xml2.responseText);
						console.log(queryy[0]);
						if(queryy[0]==true ||queryy[0]=='true'){
							document.getElementById('span-register').innerHTML = "User Already Exists";
							
						}else{
							document.getElementById('span-register').innerHTML = "";
							xml3 = new XMLHttpRequest();
							xml3.open("POST", 'SignUp?id='+document.getElementById('email-register').value+'&name='+document.getElementById('name-register').value+'&pass='+document.getElementById('password-register').value);
							xml3.onreadystatechange = changeState;
							xml3.send();

							
							 					
						}			


				} 
				xml2.send();
			} 
			function LogMeIn(){
				var xml3 ;
				if(window.XMLHttpRequest){
					xml3 = new XMLHttpRequest();
	 			}else if(window.ActiveXObject){
	 	 			xml3 = new ActiveXObject("MICROSOFT.XMLHttp");
	 	 		}
				var email = document.getElementById('email_log').value;
				var pass = document.getElementById('pass_log').value;
				xml3.open("GET",'LogThisUser?email='+email+"&pass="+pass,true);
				xml3.onload = function(){
					
					var queryy = JSON.parse(xml3.responseText);
					console.log(queryy[0]);
					if(queryy[0]==false ||queryy[0]=='false'){
						document.getElementById('span_log').innerHTML = "Email/password wrong";
						
					}else{
						changeState();	
					}			


			} 
			xml3.send();	




			} 
	       </script>	
        	 	
        
         
			<form name="temp_form" method="POST" id = 'temp_form' action = "doWithGmail.do">
			  <input type="hidden" name="id" id="id" />
			  <input type="hidden" name="name" id="name" />
			  <input type="hidden" name="email" id="email" />
			  <input type="hidden" name="imageurl" id="imageurl" />
			  <input type="button" name="Submit" onclick="submit()" />
			</form>
        
        








<div class="section-out">
<section class="login-section">
<div class="login">
<form>
<span style="color: orange;font-style: italic;font-size: 15px" id = "span_log"> </span>
<ul class="ul-list">
<li><input type="email" id = "email_log" required class="input" placeholder="Your Email"/><span class="icon"><i class="fa fa-user"></i></span></li>
<li><input type="password" id = "pass_log" required class="input" placeholder="Password"/><span class="icon"><i class="fa fa-lock"></i></span></li>
<li><span class="remember"><input type="checkbox" id="check"> <label for="check">Remember Me</label></span><span class="remember"><a href="">Forget Password</a></span></li>
<li><input type="button" onclick="LogMeIn()" value="SIGN IN" class="btn23"></li>
</ul>
</form>
</div>



<div class="social-login"><strong>Or sign up with</strong> &nbsp;
 	<div class="g-signin2" data-onsuccess="onSignIn"  >
 
	</div>
</div>

</section>

<section class="signup-section">
<div class="login">
<form action="SignUp" method="post" id = "register-form">
<span style="color: orange;font-style: italic;font-size: 15px" id = "span-register"> </span>
<ul class="ul-list">

<li><input type="name" id="name-register" required class="input" placeholder="Your Full Name"/><span class="icon"><i class="fa fa-user"></i></span></li>
<li><input id = "email-register" type="email" required class="input" placeholder="Your Email"/><span class="icon"><i class="fa fa-user"></i></span></li>
<li><input type="password" id = "password-register" required class="input" placeholder="Password"/><span class="icon"><i class="fa fa-lock"></i></span></li>
<li><input type="checkbox" id="check1"> <label for="check1">I accept terms and conditions</label></li>
<li><input type="button" value="SIGN UP" class="btn23" onclick="checkUser();return false;"></li>
</ul>
</form>
</div>

<div class="social-login">Or sign up with &nbsp;
<a href="" class="fb"><i class="fa fa-facebook"></i></a>
<a href="" class="tw"><i class="fa fa-twitter"></i></a>
<a href="" class="gp"><i class="fa fa-google-plus"></i></a>
<a href="" class="in"><i class="fa fa-linkedin"></i></a>
</div>
</section>
</div>

</div>

</body>
</html>