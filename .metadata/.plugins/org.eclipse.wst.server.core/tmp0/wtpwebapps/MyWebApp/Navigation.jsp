<%@page import="java.util.ArrayList"%>
<%@page import="sethi.vishal.MyWebApp.entity.User"%>
<%@page import="java.util.Iterator"%>
<%@page import="sethi.vishal.MyWebApp.entity.Product"%>
<%@page import="java.util.List, sethi.vishal.MyWebApp.entity.*"%>
<%@page import="java.util.List, sethi.vishal.MyWebApp.classes.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!--  
    Document Title
    =============================================
    -->
    <title>MobiWorld</title>
    <!--  
    Favicons
    =============================================
    -->
    <link rel="apple-touch-icon" sizes="57x57" href="assets/images/favicons/apple-icon-57x57.png">
    <link rel="apple-touch-icon" sizes="60x60" href="assets/images/favicons/apple-icon-60x60.png">
    <link rel="apple-touch-icon" sizes="72x72" href="assets/images/favicons/apple-icon-72x72.png">
    <link rel="apple-touch-icon" sizes="76x76" href="assets/images/favicons/apple-icon-76x76.png">
    <link rel="apple-touch-icon" sizes="114x114" href="assets/images/favicons/apple-icon-114x114.png">
    <link rel="apple-touch-icon" sizes="120x120" href="assets/images/favicons/apple-icon-120x120.png">
    <link rel="apple-touch-icon" sizes="144x144" href="assets/images/favicons/apple-icon-144x144.png">
    <link rel="apple-touch-icon" sizes="152x152" href="assets/images/favicons/apple-icon-152x152.png">
    <link rel="apple-touch-icon" sizes="180x180" href="assets/images/favicons/apple-icon-180x180.png">
    <link rel="icon" type="image/png" sizes="192x192" href="assets/images/favicons/android-icon-192x192.png">
    <link rel="icon" type="image/png" sizes="32x32" href="assets/images/favicons/favicon-32x32.png">
    <link rel="icon" type="image/png" sizes="96x96" href="assets/images/favicons/favicon-96x96.png">
    <link rel="icon" type="image/png" sizes="16x16" href="assets/images/favicons/favicon-16x16.png">
    <link rel="manifest" href="/manifest.json">
    <meta name="msapplication-TileColor" content="#ffffff">
    <meta name="msapplication-TileImage" content="assets/images/favicons/ms-icon-144x144.png">
    <meta name="theme-color" content="#ffffff">
    <!--  
    Stylesheets
    =============================================
    
    -->
    <!-- Default stylesheets-->
    <link href="assets/lib/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Template specific stylesheets-->
    <link href="https://fonts.googleapis.com/css?family=Roboto+Condensed:400,700" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Volkhov:400i" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700,800" rel="stylesheet">
    <link href="assets/lib/animate.css/animate.css" rel="stylesheet">
    <link href="assets/lib/components-font-awesome/css/font-awesome.min.css" rel="stylesheet">
    <link href="assets/lib/et-line-font/et-line-font.css" rel="stylesheet">
    <link href="assets/lib/flexslider/flexslider.css" rel="stylesheet">
    <link href="assets/lib/owl.carousel/dist/assets/owl.carousel.min.css" rel="stylesheet">
    <link href="assets/lib/owl.carousel/dist/assets/owl.theme.default.min.css" rel="stylesheet">
    <link href="assets/lib/magnific-popup/dist/magnific-popup.css" rel="stylesheet">
    <link href="assets/lib/simple-text-rotator/simpletextrotator.css" rel="stylesheet">
    <!-- Main stylesheet and color file-->
    <link href="assets/css/style.css" rel="stylesheet">
    <link id="color-scheme" href="assets/css/colors/default.css" rel="stylesheet">
    
    
    
    
    <style rel="stylesheet">
    	
    	#searchInput{
    		
		    float:right; 
		      
		     
    	}
    	.Mydropbtn {
		    background-color: white;
		    color: white;
		    padding: 8px;
		    font-size: 16px;
		    border-radius: 10px;
		    cursor: pointer;
		    margin-bottom: 5px;
		}

.Mydropdown {
    position: relative;
    display: inline-block;
}

.Mydropdown-content {
    display: none;
    position: absolute;
    background-color: white;
    min-width: 300px;
    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
    z-index: 1;
    margin-top:62px;
    margin-left:5px;
     
}

.Mydropdown-content a {
    color: black;
    padding: 12px 16px;
    text-decoration: none;
    display: block;
     
    
}

.Mydropdown-content a:hover {background-color: #f1f1f1}

.Mydropdown:hover .Mydropdown-content {
	margin-left:5px;
     
    display: block;
}

.Mydropdown:hover .Mydropbtn {
    background-color: white;
}
    
    
    </style>
    
    
    <script type="text/javascript">

	 
	 

	function openDropDown(){
		var drop = document.getElementById('dropMeDown');
		var content = document.getElementById('searchBox');
		content.style.display = 'block';
		 
		 
	}
	function closeDropDown(){
		var drop =  document.getElementById('dropMeDown');
		var content = document.getElementById('searchBox');
		 
		content.style.display = 'none';
	}

    </script>
    
    
  </head>
  <body data-spy="scroll" data-target=".onpage-navigation" data-offset="60">
    <main>
       
      <nav class="navbar navbar-custom navbar-fixed-top" role="navigation" id="navBar">
        <div class="container">
          <div class="navbar-header">
            <button class="navbar-toggle" type="button" data-toggle="collapse" data-target="#custom-collapse"><span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button><a class="navbar-brand" href="Index">MobiWorld</a>
          	 <div  class="Mydropdown" onfocus="openDropDown()" onblur="closeDropDown()" id = "dropMeDown">
          	 <input class="Mydropbtn" id="searchBox"  onfocus="openDropDown()" value="charger"   oninput="fetchResults();openDropDown();" style="float:right;margin-top: 5%;color:black" class="navbar-header" type="text" placeholder="Press Enter to search">
          	 <div id="searchDropDown" class="Mydropdown-content">
          	 	  
          	 	
				 
			  </div>
          	 </div>
          	 
          </div>
          <div>
          	
          </div>
          
          <div class="collapse navbar-collapse" id="custom-collapse">
            <ul class="nav navbar-nav navbar-right">
              <li  class="dropdown"><a class="dropdown-toggle" href="ShowProducts?type=1&sort=default&page=1"     data-toggle="dropdown">Chargers</a>
 					<!-- Here Number of Dropdowns are removed -->							
              </li>
              <li class="dropdown"><a target="_blank" class="dropdown-toggle" href="ShowProducts?type=2&sort=default&page=1" data-toggle="dropdown">Earphones</a>
                 
              </li>
              <li class="dropdown"><a class="dropdown-toggle" href="ShowProducts?type=3&sort=default&page=1" data-toggle="dropdown">Datacable</a>
                 
              </li>
              <li class="dropdown"><a class="dropdown-toggle" href="ShowProducts?type=4&sort=default&page=1" data-toggle="dropdown">ScreenGaurd</a>
                 
              </li>
              <li class="dropdown"> <a class="dropdown-toggle" href="Contact" data-toggle="dropdown">Contact Us</a> 
                 
              </li>
              
               
              <!--li.dropdoswn.navbar-cart-->
              <!--    a.dropdown-toggle(href='#', data-toggle='dropdown')-->
              <!--        span.icon-basket-->
              <!--        |-->
              <!--        span.cart-item-number 2-->
              <!--    ul.dropdown-menu.cart-list(role='menu')-->
              <!--        li-->
              <!--            .navbar-cart-item.clearfix-->
              <!--                .navbar-cart-img-->
              <!--                    a(href='#')-->
              <!--                        img(src='assets/images/shop/product-9.jpg', alt='')-->
              <!--                .navbar-cart-title-->
              <!--                    a(href='#') Short striped sweater-->
              <!--                    |-->
              <!--                    span.cart-amount 2 &times; $119.00-->
              <!--                    br-->
              <!--                    |-->
              <!--                    strong.cart-amount $238.00-->
              <!--        li-->
              <!--            .navbar-cart-item.clearfix-->
              <!--                .navbar-cart-img-->
              <!--                    a(href='#')-->
              <!--                        img(src='assets/images/shop/product-10.jpg', alt='')-->
              <!--                .navbar-cart-title-->
              <!--                    a(href='#') Colored jewel rings-->
              <!--                    |-->
              <!--                    span.cart-amount 2 &times; $119.00-->
              <!--                    br-->
              <!--                    |-->
              <!--                    strong.cart-amount $238.00-->
              <!--        li-->
              <!--            .clearfix-->
              <!--                .cart-sub-totle-->
              <!--                    strong Total: $476.00-->
              <!--        li-->
              <!--            .clearfix-->
              <!--                a.btn.btn-block.btn-round.btn-font-w(type='submit') Checkout-->
              <!--li.dropdown-->
              <!--    a.dropdown-toggle(href='#', data-toggle='dropdown') Search-->
              <!--    ul.dropdown-menu(role='menu')-->
              <!--        li-->
              <!--            .dropdown-search-->
              <!--                form(role='form')-->
              <!--                    input.form-control(type='text', placeholder='Search...')-->
              <!--                    |-->
              <!--                    button.search-btn(type='submit')-->
              <!--                        i.fa.fa-search-->
              <%
              	List<String> titles = new ArrayList<String>();
              	List<String> hrefs = new ArrayList<String>();
              	String log;
              	if(session.getAttribute("user")!=null){
              		User user = (User)session.getAttribute("user");
              		titles.add(0, "   View Profile");
              		titles.add(1, "   Orders");
              		titles.add(2, "   Cart");
              		titles.add(3, "   SignOut");
              		
              		hrefs.add(0,"Profile");
              		hrefs.add(1, "Orders");
              		hrefs.add(2,"DisplayCart");
              		hrefs.add(3,"Signout");
              		
              		log = "Hello, "+user.getEmail();
					
              	}else{
              		titles.add(0, "SignIn");
              		titles.add(1, "Register");
              		hrefs.add(0, "#");
              		hrefs.add(1, "#");
              		
              		log = "Hello, "+"Sign in";
              	}
              
              	int len = titles.size();
              %>
              
              <li class="dropdown"><a class="dropdown-toggle" href="#" data-toggle="dropdown"><%=log %></a>
                   <ul class="dropdown-menu">
                   
                   
                   
                  <% for(int i=0;i<len;i++){ %>
                  <% if(len==2) { %>
                  		<li><a href="<%= hrefs.get(i)%>" onclick="openLogin();return false;"><%=titles.get(i) %></a></li>
                  <%}  %>
			        <%if(len==4) {%>
		            <li><a href="<%= hrefs.get(i)%>"><%=titles.get(i) %></a></li>
	                <% } %>
                  <%} %>
                  </ul>
                  
              </li>
            </ul>
          </div>
        </div>
        <script src="js/jquery-3.2.1.min.js"></script>
	<script src="js/basic.js"></script>
      </nav>