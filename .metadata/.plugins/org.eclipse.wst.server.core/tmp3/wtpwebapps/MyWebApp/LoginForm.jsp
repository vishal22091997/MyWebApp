<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<link href="css/style.css" rel="stylesheet" type="text/css" media="all"/>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" /> 
<meta name="keywords" content="Static Login Form Responsive, Login form web template, Sign up Web Templates, Flat Web Templates, Login signup Responsive web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<!--script-->
<script src="js/jquery.min.js"></script>
<script src="js/easyResponsiveTabs.js" type="text/javascript"></script>
		    
<!--script-->
<!---Google Analytics Designmaz.net-->
<script>(function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
  (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
  m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
  })(window,document,'script','//www.google-analytics.com/analytics.js','ga');ga('create', 'UA-35751449-15', 'auto');ga('send', 'pageview');</script>

</head>
<body>
	<div class="head">
		<div class="logo">
			<div class="logo-top">
				<h1>Responsive Static Login Form HTML5 Template</h1>
			</div>
			<div class="logo-bottom">
				<section class="sky-form">									
					<label class="radio"><input type="radio" name="radio" checked=""><i></i>Ut mattis mattis bibendum</label>
					<label class="radio"><input type="radio" name="radio"><i></i>Nullam rutrum sagittis interdum</label>										
					<label class="radio"><input type="radio" name="radio"><i></i>Nam cursus eros sed elit</label>
				</section>
			</div>
		</div>		
		<div class="login">
			<div class="sap_tabs">
				<div id="horizontalTab" style="display: block; width: 100%; margin: 0px;">
					<ul class="resp-tabs-list">
						<li class="resp-tab-item" aria-controls="tab_item-0" role="tab"><span>Login</span></li>
						<li class="resp-tab-item" aria-controls="tab_item-1" role="tab"><label>/</label><span>Sign up</span></li>
						<div class="clearfix"></div>
					</ul>				  	 
					<div class="resp-tabs-container">
						<div class="tab-1 resp-tab-content" aria-labelledby="tab_item-0">
							<div class="login-top">
								<form>
									<input type="text" class="email" placeholder="Email" required=""/>
									<input type="password" class="password" placeholder="Password" required=""/>		
								</form>
								<div class="login-bottom login-bottom1">
									<div class="submit">
										<input type="submit" value="LOGIN"/>
									</div>
									<ul>
										<li><p>Or login with</p></li>
										<li><a href="#"><span class="fb"></span></a></li>
										<li><a href="#"><span class="twit"></span></a></li>
										<li><a href="#"><span class="google"></span></a></li>
									</ul>
									<div class="clear"></div>
								</div>	
							</div>
						</div>
						<div class="tab-1 resp-tab-content" aria-labelledby="tab_item-1">
						<div class="login-top">
								<form>
									<input type="text" class="name active" placeholder="Your Name" required=""/>
									<input type="text" class="email" placeholder="Email" required=""/>
									<input type="password" class="password" placeholder="Password" required=""/>		
								</form>
								<div class="login-bottom">
									<div class="submit">
										<input type="submit" value="SIGN UP"/>
									</div>
									<ul>
										<li><p>Or login with</p></li>
										<li><a href="#"><span class="fb"></span></a></li>
										<li><a href="#"><span class="twit"></span></a></li>
										<li><a href="#"><span class="google"></span></a></li>
									</ul>
									<div class="clear"></div>
								</div>	
							</div>
							
						</div>							
					</div>	
				</div>
			</div>	
		</div>	
		<div class="clear"></div>
	</div>
	
	<script type="text/javascript">
			    $(document).ready(function () {
			        $('#horizontalTab').easyResponsiveTabs({
			            type: 'default', //Types: default, vertical, accordion           
			            width: 'auto', //auto or any width like 600px
			            fit: true   // 100% fit in a container
			        });
			    });
				
</script>
</body>
</html>