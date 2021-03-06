<%@page import="java.util.ArrayList"%>
<%@page import="sethi.vishal.MyWebApp.entity.User"%>
<%@page import="java.util.Iterator"%>
<%@page import="sethi.vishal.MyWebApp.entity.Product"%>
<%@page import="java.util.List, sethi.vishal.MyWebApp.entity.*"%>
<%@page import="java.util.List, sethi.vishal.MyWebApp.classes.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
    
        <link href="assets/css/model.css" rel="stylesheet">
    <script type="text/javascript">


    
	      var xml;
	      var text;
			if(window.XMLHttpRequest){
				xml = new XMLHttpRequest();
				console.log("check");
			}else if(window.ActiveXObject){
				xml = new ActiveXObject("MICROSOFT.XMLHttp");
			}
			function sendMessageToCartServer(id, name){
				text = name;
				xml.open("POST", "AddToCart?count="+document.getElementById('countOfProduct').value+"&prodid="+id,true);
				xml.onreadystatechange = receiveMessageFromCartServer;
				xml.send();
				
			}
			function receiveMessageFromCartServer(){
				if(xml.readyState==4&&xml.status==200){
					var modal = document.getElementById('AddedToCart');
					document.getElementById('item_header').innerHTML = text+", has been added to your cart";
					modal.style.display = 'block';
					window.onclick = function(event) {
					    if (event.target == modal) {
					        modal.style.display = "none";
					    }
					}
					var span = document.getElementById("spanAddedToCart");
					span.onclick = function(event){
						console.log('entered');
						if(event.target==span){
							console.log('targated');
							modal.style.display = 'none';
						}
					} 
					
				}

			}
			function doWhatYouWant(){
				jQuery('#divForCart').load(' #divForCart');

			}

			 
			// When the user clicks on div, open the popup
			 
			 
			function openLogin(){
				var modal = document.getElementById('login_form');
				modal.style.display = "block";
				 
				 
				window.onclick = function(event) {
				    if (event.target == modal) {
				        modal.style.display = "none";
				    }
				}


			}				

			

      </script>
 	 
 
 	 
 	 
  </head>
  <body data-spy="scroll" data-target=".onpage-navigation" data-offset="60">
  
  
  
  <div id="AddedToCart" class="modal">

  <!-- Modal content -->
  <div class="modal-content">
    <div class="modal-header">
      <span id=spanAddedToCart class="close">&times;</span>
      <h2>Item Added To Cart</h2>
    </div>
    <div class="modal-body">
      <h3 id="item_header"></h3>
      <p id ="item_desc"></p>
    </div>
    <div class="modal-footer">
       <div class="herelog"><a href = "DisplayCart"><button onclick="Login.do; return false;" class="btn btn-border-w btn-circle" type=submit>Check Your Cart</button></a></div>
    	
    
    
    </div>
  </div>

</div> 


      
      <!-- The Modal -->
<div id="myModal" class="modal">

  <!-- Modal content -->
  <div class="modal-content">
    <div class="modal-header">
      <span class="close">&times;</span>
      <h2>Login Required </h2>
    </div>
    <div class="modal-body">
      <h3>You have to login to add it to your cart</h3>
      
    </div>
    <div class="modal-footer">
       <div class="herelog"><a href = "#"><button onclick="openLogin(); return false;" class="btn btn-border-w btn-circle" type=submit>Login</button></a></div>
    	<div class="herereg"><a href="Login.do"><button onclick="openLogin(); return false;" class="btn btn-border-w btn-circle" type=submit>Register</button></a></div>
    
    
    </div>
  </div>

</div>
      

    <main>
      <div class="page-loader">
        <div class="loader">Loading...</div>
      </div>
      
      
       <%@include file = "Navigation.jsp" %>
      
      
      
      
      <%
      	ProductDisplay product = (ProductDisplay)session.getAttribute("product");
      	List<String> images = product.getImages();
      	System.out.println(images.size());
      	String first = (images.size()==0)?"":images.get(0) ;
      	List<Review> reviews = product.getReviews();
      	int avg = 0;
      	
      	if(reviews.size()>0){
      		int size = 0;
      		for(Review review: reviews){
          		if(review.getRegister()==1){
          			avg+=review.getRating();
          			size++;
          		}
          	}
      		if(size>=1)
      			avg = avg/size;
      	}
      	
      	
      	
      	
      	
      %>
      
   <div id="login_form" class="modal">

  <!-- Modal content -->
  <div class = "modal-content" style="width: 352px;height: 377px">
     
    
    
       <%@include file = "LoginForm.jsp" %>
      
     
    
  </div>

</div> 
      
      <%User userChecking = (User)session.getAttribute("user");
     	 boolean askToLog;
    	if(userChecking!=null){
    		askToLog = false; 
    	}else{
    		askToLog = true;
    	}
    	String methodCall;
  		if(askToLog){
  			methodCall = "openLogin()";
  		}else{
  			methodCall = "sendMessageToCartServer('"+product.getId()+"','"+product.getName()+"')";
  		}
  		
      
      %>
      <div class="main">
        <section class="module">
          <div class="container">
            <div class="row">
              <div class="col-sm-6 mb-sm-40"><a class="gallery" href="assets/images/shop/<%= first%>"><img src="assets/images/shop/<%=first %>" alt="Single Product Image"/></a>
                <ul class="product-gallery">
                  <% for(int i=1, j=images.size();i<j;i++){ %>
                  <li><a class="gallery" href="assets/images/shop/<%= images.get(i)%>"></a><img src="assets/images/shop/<%=images.get(i)  %>" alt="Single Product"/></li>
                   <%} %>
                </ul>
              </div>
              <div class="col-sm-6">
                <div class="row">
                  <div class="col-sm-12">
                    <h1 class="product-title font-alt"><%=product.getName() %></h1>
                  </div>
                </div>
                <div class="row mb-20">
                  <div class="col-sm-12"><%for(int i=1;i<=avg;i++) { %> <span><i class="fa fa-star star"></i></span> <% } %>    <% for(int i=avg;i<5;i++){ %>   <span><i class="fa fa-star star-off"></i></span> <%} %><a class="open-tab section-scroll" href="#reviews">-<%= reviews.size() %>customer reviews</a>
                  </div>
                </div>
                <div class="row mb-20">
                  <div class="col-sm-12">
                  <% String price = (product.getAvail()==1)?"Rs."+product.getPrice()+"":"Out Of Stock"; %>
                    <div class="price font-alt"><span class="amount"><%=price %></span></div>
                  </div>
                </div>
                <div class="row mb-20">
                  <div class="col-sm-12">
                    <div class="description">
                      <p><%=product.getDescription() %></p>
                    </div>
                  </div>
                </div>
                <div class="row mb-20">
                  <div class="col-sm-4 mb-sm-20">
                  <script type="text/javascript" >
	      			function addTo(temp)
	  				{	
	  					 
	      				temp.submit();
	      				return false;	
	  				}	

  				</script>
                   
                  	<form method = "POST" action = "AddToCart" id = "cartform">
                    	<input class="form-control input-lg" type="number" id = "countOfProduct" name="count" value="1" max="40" min="1" required="required"/>
                  		<input type = "hidden" name = "prodid" value = "<%= product.getId() %>" id="prod_id"/>
                   	</form>
                  </div>
                  	
                  <div id = "divForCart">	
                  	
                  	
                  <div class="col-sm-8"><button onclick="<%= methodCall %>; return false;" class="btn btn-lg btn-block btn-round btn-b" >Add To Cart</button></div>
                </div>
                <!-- Just to check for the popup  -->
                
                 </div>
                
                 
                <div class="row mb-20">
                  <div class="col-sm-12">
                    <div class="product_meta">Categories:<a href="#"><%=product.getType() %></a>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <div class="row mt-70">
              <div class="col-sm-12">
                <ul class="nav nav-tabs font-alt" role="tablist">
                  <li class="active"><a href="#description" data-toggle="tab"><span class="icon-tools-2"></span>Description</a></li>
                  <li><a href="#data-sheet" data-toggle="tab"><span class="icon-tools-2"></span>Data sheet</a></li>
                  <li><a href="#reviews" data-toggle="tab"><span class="icon-tools-2"></span>Reviews (<%=reviews.size() %>)</a></li>
                </ul>
                <div class="tab-content">
                  <div class="tab-pane active" id="description">
                    <p><%=product.getDescription() %></p>
                     
                  </div>
                  <div class="tab-pane" id="data-sheet">
                    <table class="table table-striped ds-table table-responsive">
                      <tbody>
                        <tr>
                          <th>Title</th>
                          <th><%=product.getName() %></th>
                        </tr>
                        <tr>
                          <td>Type</td>
                          <td><%=product.getType() %></td>
                        </tr>
                        <tr>
                          <td>Price</td>
                          <td><%=product.getPrice() %></td>
                        </tr>
                        <tr>
                        	<%  %>
                          <td>Available Colors</td>
                          <td><%=product.getColors().toString() %></td>
                        </tr>
                        <tr>
                          <td>Brand</td>
                          <td><%=product.getBrand() %></td>
                        </tr>
                      </tbody>
                    </table>
                  </div>
                  <div class="tab-pane" id="reviews">
                    <div class="comments reviews">
                    
                    
                    <%
                    String disable = "";
        			
        			String nameOfUser = null;
        			String emailOfUser = null;
                    if(userChecking!=null){
                    	disable = "disabled";
                    	nameOfUser = userChecking.getName();
                    	emailOfUser = userChecking.getEmail();
                    } 
                    
                    for(Review review: reviews){ 
                    	String imageUrl = (review.getRegister()==1)?"assets/added/final.png":"assets/added/guest.png";
                    	 
                    	 
                    	 
                    	 
                    %>
                    
                      <div class="comment clearfix">
                        <div class="comment-avatar"><img src="<%=imageUrl %>" alt="avatar"/></div>
                        <div class="comment-content clearfix">
                          <div class="comment-author font-alt"><a href="#"><%=review.getName() %></a></div>
                          <div class="comment-body">
                            <p><%=review.getReview() %></p>
                          </div>
                          <div class="comment-meta font-alt"><%=review.getDate() %>-<%for(int i=1;i<=review.getRating();i++) { %> <span><i class="fa fa-star star"></i></span> <% } %>    <% for(int i=review.getRating();i<5;i++){ %>   <span><i class="fa fa-star star-off"></i></span> <%} %>
                          </div>
                        </div>
                      </div>
                       
                      
                      <% } %>
                      
                    </div>
                    
                    
                    
                    
                    <div class="comment-form mt-30">
                      <h4 class="comment-form-title font-alt">Add review</h4>
                      <form method="post" action = "addReview?no=<%= product.getNo() %>" id = "reviewForm">
                        <div class="row">
                          <div class="col-sm-4">
                            <div class="form-group">
                              <label class="sr-only" for="name"  >Name</label>
                              <input class="form-control" id="name" type="text" value="<%= (userChecking==null)?"":nameOfUser %>"  <%=disable %>  name="name" placeholder="Name" required/>
                            </div>
                          </div>
                          <div class="col-sm-4">
                            <div class="form-group">
                              <label class="sr-only" for="email" >Email</label>
                              <input class="form-control" value="<%= (userChecking==null)?"":emailOfUser %>"  <%=disable %> id="email" type="text" name="email"  placeholder="E-mail" required/>
                            </div>
                          </div>
                          <div class="col-sm-4">
                            <div class="form-group">
                              <select class="form-control" name = "rating" required>
                                <option selected="true" disabled=""  >Rating</option>
                                <option value="1">1</option>
                                <option value="2">2</option>
                                <option value="3">3</option>
                                <option value="4">4</option>
                                <option value="5">5</option>
                              </select>
                            </div>
                          </div>
                          <div class="col-sm-12">
                            <div class="form-group">
                              <textarea class="form-control" id="" name="review" rows="4" placeholder="Review" required></textarea>
                            </div>
                          </div>
                          <div class="col-sm-12">
                            <button class="btn btn-round btn-d" type="submit">Submit Review</button>
                          </div>
                        </div>
                      </form>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </section>
        <%
        	//Related Products Section
        	List<RelatedProduct> related = (List<RelatedProduct>)session.getAttribute("related");
        	
        
        %>
        
        <hr class="divider-w">
        <section class="module-small">
          <div class="container">
            <div class="row">
              <div class="col-sm-6 col-sm-offset-3">
                <h2 class="module-title font-alt">Related Products</h2>
              </div>
            </div>
            <div class="row multi-columns-row">
            
            <% 
           	
            
            for(RelatedProduct relPro: related){ 
            	String href = "showSingle?id="+relPro.getId();
            	String price2 = (relPro.getAvail()==0)?("OUT OF STOCK"):("Rs "+relPro.getPrice());
            
            %>
            
            
              <div class="col-sm-6 col-md-3 col-lg-3">
                <div class="shop-item">
                  <div class="shop-item-image"><img src="assets/images/shop/<%=relPro.getImage() %>" alt="<%= relPro.getName() %>"/>
                    <div class="shop-item-detail"><a class="btn btn-round btn-b"><span class="icon-basket">Add To Cart</span></a></div>
                  </div>
                  <h4 class="shop-item-title font-alt"><a href="<%= href %>"><%= relPro.getName() %></a></h4><%=price2%>
                </div>
              </div>
               
              
              
             <% } %> 
              
              
              
            </div>
          </div>
        </section>
        <hr class="divider-w">
        <section class="module">
          <div class="container">
            <div class="row">
              <div class="col-sm-6 col-sm-offset-3">
                <h2 class="module-title font-alt">Exclusive products</h2>
                <div class="module-subtitle font-serif">The languages only differ in their grammar, their pronunciation and their most common words.</div>
              </div>
            </div>
            <div class="row">
              <div class="owl-carousel text-center" data-items="5" data-pagination="false" data-navigation="false">
                <div class="owl-item">
                  <div class="col-sm-12">
                    <div class="ex-product"><a href="#"><img src="assets/images/shop/product-1.jpg" alt="Leather belt"/></a>
                      <h4 class="shop-item-title font-alt"><a href="#">Leather belt</a></h4>£12.00
                    </div>
                  </div>
                </div>
                <div class="owl-item">
                  <div class="col-sm-12">
                    <div class="ex-product"><a href="#"><img src="assets/images/shop/product-3.jpg" alt="Derby shoes"/></a>
                      <h4 class="shop-item-title font-alt"><a href="#">Derby shoes</a></h4>£54.00
                    </div>
                  </div>
                </div>
                <div class="owl-item">
                  <div class="col-sm-12">
                    <div class="ex-product"><a href="#"><img src="assets/images/shop/product-2.jpg" alt="Leather belt"/></a>
                      <h4 class="shop-item-title font-alt"><a href="#">Leather belt</a></h4>£19.00
                    </div>
                  </div>
                </div>
                <div class="owl-item">
                  <div class="col-sm-12">
                    <div class="ex-product"><a href="#"><img src="assets/images/shop/product-4.jpg" alt="Leather belt"/></a>
                      <h4 class="shop-item-title font-alt"><a href="#">Leather belt</a></h4>£14.00
                    </div>
                  </div>
                </div>
                <div class="owl-item">
                  <div class="col-sm-12">
                    <div class="ex-product"><a href="#"><img src="assets/images/shop/product-5.jpg" alt="Chelsea boots"/></a>
                      <h4 class="shop-item-title font-alt"><a href="#">Chelsea boots</a></h4>£44.00
                    </div>
                  </div>
                </div>
                <div class="owl-item">
                  <div class="col-sm-12">
                    <div class="ex-product"><a href="#"><img src="assets/images/shop/product-6.jpg" alt="Leather belt"/></a>
                      <h4 class="shop-item-title font-alt"><a href="#">Leather belt</a></h4>£19.00
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </section>
        <div class="module-small bg-dark">
          <div class="container">
            <div class="row">
              <div class="col-sm-3">
                <div class="widget">
                  <h5 class="widget-title font-alt">About Titan</h5>
                  <p>The languages only differ in their grammar, their pronunciation and their most common words.</p>
                  <p>Phone: +1 234 567 89 10</p>Fax: +1 234 567 89 10
                  <p>Email:<a href="#">somecompany@example.com</a></p>
                </div>
              </div>
              <div class="col-sm-3">
                <div class="widget">
                  <h5 class="widget-title font-alt">Recent Comments</h5>
                  <ul class="icon-list">
                    <li>Maria on <a href="#">Designer Desk Essentials</a></li>
                    <li>John on <a href="#">Realistic Business Card Mockup</a></li>
                    <li>Andy on <a href="#">Eco bag Mockup</a></li>
                    <li>Jack on <a href="#">Bottle Mockup</a></li>
                    <li>Mark on <a href="#">Our trip to the Alps</a></li>
                  </ul>
                </div>
              </div>
              <div class="col-sm-3">
                <div class="widget">
                  <h5 class="widget-title font-alt">Blog Categories</h5>
                  <ul class="icon-list">
                    <li><a href="#">Photography - 7</a></li>
                    <li><a href="#">Web Design - 3</a></li>
                    <li><a href="#">Illustration - 12</a></li>
                    <li><a href="#">Marketing - 1</a></li>
                    <li><a href="#">Wordpress - 16</a></li>
                  </ul>
                </div>
              </div>
              <div class="col-sm-3">
                <div class="widget">
                  <h5 class="widget-title font-alt">Popular Posts</h5>
                  <ul class="widget-posts">
                    <li class="clearfix">
                      <div class="widget-posts-image"><a href="#"><img src="assets/images/rp-1.jpg" alt="Post Thumbnail"/></a></div>
                      <div class="widget-posts-body">
                        <div class="widget-posts-title"><a href="#">Designer Desk Essentials</a></div>
                        <div class="widget-posts-meta">23 january</div>
                      </div>
                    </li>
                    <li class="clearfix">
                      <div class="widget-posts-image"><a href="#"><img src="assets/images/rp-2.jpg" alt="Post Thumbnail"/></a></div>
                      <div class="widget-posts-body">
                        <div class="widget-posts-title"><a href="#">Realistic Business Card Mockup</a></div>
                        <div class="widget-posts-meta">15 February</div>
                      </div>
                    </li>
                  </ul>
                </div>
              </div>
            </div>
          </div>
        </div>
        <hr class="divider-d">
        <footer class="footer bg-dark">
          <div class="container">
            <div class="row">
              <div class="col-sm-6">
                <p class="copyright font-alt">&copy; 2017&nbsp;<a href="index.html">TitaN</a>, All Rights Reserved</p>
              </div>
              <div class="col-sm-6">
                <div class="footer-social-links"><a href="#"><i class="fa fa-facebook"></i></a><a href="#"><i class="fa fa-twitter"></i></a><a href="#"><i class="fa fa-dribbble"></i></a><a href="#"><i class="fa fa-skype"></i></a>
                </div>
              </div>
            </div>
          </div>
        </footer>
      </div>
      <div class="scroll-up"><a href="#totop"><i class="fa fa-angle-double-up"></i></a></div>
    </main>
    <!--  
    JavaScripts
    =============================================
    -->
    <script src="assets/lib/jquery/dist/jquery.js"></script>
    <script src="assets/lib/bootstrap/dist/js/bootstrap.min.js"></script>
    <script src="assets/lib/wow/dist/wow.js"></script>
    <script src="assets/lib/jquery.mb.ytplayer/dist/jquery.mb.YTPlayer.js"></script>
    <script src="assets/lib/isotope/dist/isotope.pkgd.js"></script>
    <script src="assets/lib/imagesloaded/imagesloaded.pkgd.js"></script>
    <script src="assets/lib/flexslider/jquery.flexslider.js"></script>
    <script src="assets/lib/owl.carousel/dist/owl.carousel.min.js"></script>
    <script src="assets/lib/smoothscroll.js"></script>
    <script src="assets/lib/magnific-popup/dist/jquery.magnific-popup.js"></script>
    <script src="assets/lib/simple-text-rotator/jquery.simple-text-rotator.min.js"></script>
    <script src="assets/js/plugins.js"></script>
    <script src="assets/js/main.js"></script>
  </body>
</html>