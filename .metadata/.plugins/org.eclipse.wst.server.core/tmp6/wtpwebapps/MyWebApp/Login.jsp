<!DOCTYPE html>
<html >
<head>
  <meta charset="UTF-8">
  <title>Day 001 Login Form</title>
  
  
  <link rel='stylesheet prefetch' href='https://fonts.googleapis.com/css?family=Open+Sans:600'>
 <script src="https://apis.google.com/js/platform.js" async defer></script>
  
 <meta name="google-signin-client_id" content="372475238802-l5mefq2g0mub1gmsna523i38o52c2900.apps.googleusercontent.com">
 
      <link rel="stylesheet" href="css/style.css">
<script type="text/javascript">
	function SignIn(googleUser) {
		  var profile = googleUser.getBasicProfile();
		  console.log('ID: ' + profile.getId()); // Do not send to your backend! Use an ID token instead.
		  console.log('Name: ' + profile.getName());
		  console.log('Image URL: ' + profile.getImageUrl());
		  console.log('Email: ' + profile.getEmail()); // This is null if the 'email' scope is not present.
		  
		 var username = document.getElementById('user2');
		 username.value = profile.getEmail();
		 var email = document.getElementById('email');
		email.value = profile.getEmail();
		username.setAttribute("disabled", true);
		email.setAttribute("disabled", true);	
		  
		}
	</script>
  
</head>

<body>
  <div class="login-wrap">
	<div class="login-html">
		<input id="tab-1" type="radio" name="tab" class="sign-in" checked><label for="tab-1" class="tab">Sign In</label>
		<input id="tab-2" type="radio" name="tab" class="sign-up"><label for="tab-2" class="tab">Sign Up</label>
		<div class="login-form">
			<div class="sign-in-htm">
				<div class="group">
					<label for="user" class="label">Username</label>
					<input id="user" type="text" class="input">
				</div>
				<div class="group">
					<label for="pass" class="label">Password</label>
					<input id="pass" type="password" class="input" data-type="password">
				</div>
				<div class="group">
					<input id="check" type="checkbox" class="check" checked>
					<label for="check"><span class="icon"></span> Keep me Signed in</label>
				</div>
				<div class="group">
					<input type="submit" class="button" value="Sign In">
				</div>
				<div class="hr"></div>
				<div class="foot-lnk">
					<a href="#forgot">Forgot Password?</a>
				</div>
			</div>
			<div class="sign-up-htm">
				<div class="group">
					<label for="user" class="label">Username</label>
					<input id="user2" type="text" class="input" >
				</div>
				<div class="group">
					<label for="pass" class="label">Password</label>
					<input id="pass" type="password" class="input" data-type="password">
				</div>
				<div class="group">
					<label for="pass" class="label">Repeat Password</label>
					<input id="pass" type="password" class="input" data-type="password">
				</div>
				<div class="group">
					<label for="pass" class="label">Email Address</label>
					<input id="email" type="text" class="input">
				</div>
				<div class="group">
				
					 	<div class="g-signin2" data-onsuccess="SignIn" style="width:100%">
<button class="button" style="vertical-align:middle"><span>Hover </span></button></div>
					
				</div>
				
				<div class="group">
					<input type="submit" class="button" value="Sign Up">
				</div>
				<div class="hr"></div>
				<div class="foot-lnk">
					<label for="tab-1">Already Member?</a>
				</div>
			</div>
		</div>
	</div>
</div>
  
  
</body>
</html>
