/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.15
 * Generated at: 2017-06-06 13:38:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import sethi.vishal.MyWebApp.entity.User;
import java.util.Iterator;
import sethi.vishal.MyWebApp.entity.Product;
import java.util.List;
import java.util.ArrayList;
import sethi.vishal.MyWebApp.entity.User;
import java.util.Iterator;
import sethi.vishal.MyWebApp.entity.Product;
import java.util.List;
import sethi.vishal.MyWebApp.entity.*;
import java.util.List;
import sethi.vishal.MyWebApp.classes.*;

public final class login_005fregister_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/Navigation.jsp", Long.valueOf(1496755839109L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("sethi.vishal.MyWebApp.entity");
    _jspx_imports_packages.add("sethi.vishal.MyWebApp.classes");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("java.util.Iterator");
    _jspx_imports_classes.add("sethi.vishal.MyWebApp.entity.User");
    _jspx_imports_classes.add("sethi.vishal.MyWebApp.entity.Product");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("   <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <script src=\"https://apis.google.com/js/platform.js\" async defer></script>\n");
      out.write("  <meta name=\"google-signin-scope\" content=\"profile email\">\n");
      out.write("  <link rel='stylesheet prefetch' href='https://fonts.googleapis.com/css?family=Open+Sans:600'>\n");
      out.write(" <script src=\"https://apis.google.com/js/platform.js\" async defer></script>\n");
      out.write("\n");
      out.write("  \n");
      out.write(" <meta name=\"google-signin-client_id\" content=\"372475238802-hvh00kjrspaj8eo13au4cqf04rbq815k.apps.googleusercontent.com\">\n");
      out.write(" \n");
      out.write("    <!--  \n");
      out.write("    Document Title\n");
      out.write("    =============================================\n");
      out.write("    -->\n");
      out.write("    <title>MobiWorld</title>\n");
      out.write("    <!--  \n");
      out.write("    Favicons\n");
      out.write("    =============================================\n");
      out.write("    -->\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"57x57\" href=\"assets/images/favicons/apple-icon-57x57.png\">\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"60x60\" href=\"assets/images/favicons/apple-icon-60x60.png\">\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"72x72\" href=\"assets/images/favicons/apple-icon-72x72.png\">\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"76x76\" href=\"assets/images/favicons/apple-icon-76x76.png\">\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"114x114\" href=\"assets/images/favicons/apple-icon-114x114.png\">\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"120x120\" href=\"assets/images/favicons/apple-icon-120x120.png\">\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"144x144\" href=\"assets/images/favicons/apple-icon-144x144.png\">\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"152x152\" href=\"assets/images/favicons/apple-icon-152x152.png\">\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"180x180\" href=\"assets/images/favicons/apple-icon-180x180.png\">\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" sizes=\"192x192\" href=\"assets/images/favicons/android-icon-192x192.png\">\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" sizes=\"32x32\" href=\"assets/images/favicons/favicon-32x32.png\">\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" sizes=\"96x96\" href=\"assets/images/favicons/favicon-96x96.png\">\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" sizes=\"16x16\" href=\"assets/images/favicons/favicon-16x16.png\">\n");
      out.write("    <link rel=\"manifest\" href=\"/manifest.json\">\n");
      out.write("    <meta name=\"msapplication-TileColor\" content=\"#ffffff\">\n");
      out.write("    <meta name=\"msapplication-TileImage\" content=\"assets/images/favicons/ms-icon-144x144.png\">\n");
      out.write("    <meta name=\"theme-color\" content=\"#ffffff\">\n");
      out.write("    <!--  \n");
      out.write("    Stylesheets\n");
      out.write("    =============================================\n");
      out.write("    \n");
      out.write("    -->\n");
      out.write("    <!-- Default stylesheets-->\n");
      out.write("    <link href=\"assets/lib/bootstrap/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- Template specific stylesheets-->\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Roboto+Condensed:400,700\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Volkhov:400i\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700,800\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"assets/lib/animate.css/animate.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"assets/lib/components-font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"assets/lib/et-line-font/et-line-font.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"assets/lib/flexslider/flexslider.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"assets/lib/owl.carousel/dist/assets/owl.carousel.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"assets/lib/owl.carousel/dist/assets/owl.theme.default.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"assets/lib/magnific-popup/dist/magnific-popup.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"assets/lib/simple-text-rotator/simpletextrotator.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- Main stylesheet and color file-->\n");
      out.write("    <link href=\"assets/css/style.css\" rel=\"stylesheet\">\n");
      out.write("    <link id=\"color-scheme\" href=\"assets/css/colors/default.css\" rel=\"stylesheet\">\n");
      out.write("  </head>\n");
      out.write("  <body data-spy=\"scroll\" data-target=\".onpage-navigation\" data-offset=\"60\">\n");
      out.write("    <main>\n");
      out.write("      <div class=\"page-loader\">\n");
      out.write("        <div class=\"loader\">Loading...</div>\n");
      out.write("\t      </div>\n");
      out.write("      \n");
      out.write("    \t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <!--  \r\n");
      out.write("    Document Title\r\n");
      out.write("    =============================================\r\n");
      out.write("    -->\r\n");
      out.write("    <title>MobiWorld</title>\r\n");
      out.write("    <!--  \r\n");
      out.write("    Favicons\r\n");
      out.write("    =============================================\r\n");
      out.write("    -->\r\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"57x57\" href=\"assets/images/favicons/apple-icon-57x57.png\">\r\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"60x60\" href=\"assets/images/favicons/apple-icon-60x60.png\">\r\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"72x72\" href=\"assets/images/favicons/apple-icon-72x72.png\">\r\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"76x76\" href=\"assets/images/favicons/apple-icon-76x76.png\">\r\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"114x114\" href=\"assets/images/favicons/apple-icon-114x114.png\">\r\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"120x120\" href=\"assets/images/favicons/apple-icon-120x120.png\">\r\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"144x144\" href=\"assets/images/favicons/apple-icon-144x144.png\">\r\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"152x152\" href=\"assets/images/favicons/apple-icon-152x152.png\">\r\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"180x180\" href=\"assets/images/favicons/apple-icon-180x180.png\">\r\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" sizes=\"192x192\" href=\"assets/images/favicons/android-icon-192x192.png\">\r\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" sizes=\"32x32\" href=\"assets/images/favicons/favicon-32x32.png\">\r\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" sizes=\"96x96\" href=\"assets/images/favicons/favicon-96x96.png\">\r\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" sizes=\"16x16\" href=\"assets/images/favicons/favicon-16x16.png\">\r\n");
      out.write("    <link rel=\"manifest\" href=\"/manifest.json\">\r\n");
      out.write("    <meta name=\"msapplication-TileColor\" content=\"#ffffff\">\r\n");
      out.write("    <meta name=\"msapplication-TileImage\" content=\"assets/images/favicons/ms-icon-144x144.png\">\r\n");
      out.write("    <meta name=\"theme-color\" content=\"#ffffff\">\r\n");
      out.write("    <!--  \r\n");
      out.write("    Stylesheets\r\n");
      out.write("    =============================================\r\n");
      out.write("    \r\n");
      out.write("    -->\r\n");
      out.write("    <!-- Default stylesheets-->\r\n");
      out.write("    <link href=\"assets/lib/bootstrap/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!-- Template specific stylesheets-->\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Roboto+Condensed:400,700\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Volkhov:400i\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700,800\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"assets/lib/animate.css/animate.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"assets/lib/components-font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"assets/lib/et-line-font/et-line-font.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"assets/lib/flexslider/flexslider.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"assets/lib/owl.carousel/dist/assets/owl.carousel.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"assets/lib/owl.carousel/dist/assets/owl.theme.default.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"assets/lib/magnific-popup/dist/magnific-popup.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"assets/lib/simple-text-rotator/simpletextrotator.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!-- Main stylesheet and color file-->\r\n");
      out.write("    <link href=\"assets/css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link id=\"color-scheme\" href=\"assets/css/colors/default.css\" rel=\"stylesheet\">\r\n");
      out.write("  </head>\r\n");
      out.write("  <body data-spy=\"scroll\" data-target=\".onpage-navigation\" data-offset=\"60\">\r\n");
      out.write("    <main>\r\n");
      out.write("      \r\n");
      out.write("      <nav class=\"navbar navbar-custom navbar-fixed-top\" role=\"navigation\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("          <div class=\"navbar-header\">\r\n");
      out.write("            <button class=\"navbar-toggle\" type=\"button\" data-toggle=\"collapse\" data-target=\"#custom-collapse\"><span class=\"sr-only\">Toggle navigation</span><span class=\"icon-bar\"></span><span class=\"icon-bar\"></span><span class=\"icon-bar\"></span></button><a class=\"navbar-brand\" href=\"Index\">MobiWorld</a>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"collapse navbar-collapse\" id=\"custom-collapse\">\r\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("              <li class=\"dropdown\"><a class=\"dropdown-toggle\" href=\"#\" data-toggle=\"dropdown\">Chargers</a>\r\n");
      out.write(" \t\t\t\t\t<!-- Here Number of Dropdowns are removed -->\r\n");
      out.write("              </li>\r\n");
      out.write("              <li class=\"dropdown\"><a class=\"dropdown-toggle\" href=\"#\" data-toggle=\"dropdown\">Earphones</a>\r\n");
      out.write("                 \r\n");
      out.write("              </li>\r\n");
      out.write("              <li class=\"dropdown\"><a class=\"dropdown-toggle\" href=\"#\" data-toggle=\"dropdown\">Datacable</a>\r\n");
      out.write("                 \r\n");
      out.write("              </li>\r\n");
      out.write("              <li class=\"dropdown\"><a class=\"dropdown-toggle\" href=\"#\" data-toggle=\"dropdown\">ScreenGaurd</a>\r\n");
      out.write("                 \r\n");
      out.write("              </li>\r\n");
      out.write("              <li class=\"dropdown\"><a class=\"dropdown-toggle\" href=\"Contact\" data-toggle=\"dropdown\">Contact Us</a>\r\n");
      out.write("                 \r\n");
      out.write("              </li>\r\n");
      out.write("              \r\n");
      out.write("               \r\n");
      out.write("              <!--li.dropdown.navbar-cart-->\r\n");
      out.write("              <!--    a.dropdown-toggle(href='#', data-toggle='dropdown')-->\r\n");
      out.write("              <!--        span.icon-basket-->\r\n");
      out.write("              <!--        |-->\r\n");
      out.write("              <!--        span.cart-item-number 2-->\r\n");
      out.write("              <!--    ul.dropdown-menu.cart-list(role='menu')-->\r\n");
      out.write("              <!--        li-->\r\n");
      out.write("              <!--            .navbar-cart-item.clearfix-->\r\n");
      out.write("              <!--                .navbar-cart-img-->\r\n");
      out.write("              <!--                    a(href='#')-->\r\n");
      out.write("              <!--                        img(src='assets/images/shop/product-9.jpg', alt='')-->\r\n");
      out.write("              <!--                .navbar-cart-title-->\r\n");
      out.write("              <!--                    a(href='#') Short striped sweater-->\r\n");
      out.write("              <!--                    |-->\r\n");
      out.write("              <!--                    span.cart-amount 2 &times; $119.00-->\r\n");
      out.write("              <!--                    br-->\r\n");
      out.write("              <!--                    |-->\r\n");
      out.write("              <!--                    strong.cart-amount $238.00-->\r\n");
      out.write("              <!--        li-->\r\n");
      out.write("              <!--            .navbar-cart-item.clearfix-->\r\n");
      out.write("              <!--                .navbar-cart-img-->\r\n");
      out.write("              <!--                    a(href='#')-->\r\n");
      out.write("              <!--                        img(src='assets/images/shop/product-10.jpg', alt='')-->\r\n");
      out.write("              <!--                .navbar-cart-title-->\r\n");
      out.write("              <!--                    a(href='#') Colored jewel rings-->\r\n");
      out.write("              <!--                    |-->\r\n");
      out.write("              <!--                    span.cart-amount 2 &times; $119.00-->\r\n");
      out.write("              <!--                    br-->\r\n");
      out.write("              <!--                    |-->\r\n");
      out.write("              <!--                    strong.cart-amount $238.00-->\r\n");
      out.write("              <!--        li-->\r\n");
      out.write("              <!--            .clearfix-->\r\n");
      out.write("              <!--                .cart-sub-totle-->\r\n");
      out.write("              <!--                    strong Total: $476.00-->\r\n");
      out.write("              <!--        li-->\r\n");
      out.write("              <!--            .clearfix-->\r\n");
      out.write("              <!--                a.btn.btn-block.btn-round.btn-font-w(type='submit') Checkout-->\r\n");
      out.write("              <!--li.dropdown-->\r\n");
      out.write("              <!--    a.dropdown-toggle(href='#', data-toggle='dropdown') Search-->\r\n");
      out.write("              <!--    ul.dropdown-menu(role='menu')-->\r\n");
      out.write("              <!--        li-->\r\n");
      out.write("              <!--            .dropdown-search-->\r\n");
      out.write("              <!--                form(role='form')-->\r\n");
      out.write("              <!--                    input.form-control(type='text', placeholder='Search...')-->\r\n");
      out.write("              <!--                    |-->\r\n");
      out.write("              <!--                    button.search-btn(type='submit')-->\r\n");
      out.write("              <!--                        i.fa.fa-search-->\r\n");
      out.write("              ");

              	List<String> titles = new ArrayList<String>();
              	List<String> hrefs = new ArrayList<String>();
              	String log;
              	if(session.getAttribute("user")!=null){
              		User user = (User)session.getAttribute("user");
              		titles.add(0, "Your Orders");
              		titles.add(1, "Your Account");
              		titles.add(2, "Your Addresses");
              		titles.add(3, "Your Cart");
              		titles.add(4, "Signout");
              		hrefs.add(0,"#");
              		hrefs.add(1, "#");
              		hrefs.add(2,"#");
              		hrefs.add(3,"#");
              		hrefs.add(4,"Signout");
              		log = "Hello, "+user.getEmail();
					
              	}else{
              		titles.add(0, "SignIn");
              		titles.add(1, "Register");
              		hrefs.add(0, "Login.do");
              		hrefs.add(1, "Login.do");
              		log = "Hello, "+"Sign in";
              	}
              
              	int len = titles.size();
              
      out.write("\r\n");
      out.write("              \r\n");
      out.write("              <li class=\"dropdown\"><a class=\"dropdown-toggle\" href=\"Login.do\" data-toggle=\"dropdown\">");
      out.print(log );
      out.write("</a>\r\n");
      out.write("                   <ul class=\"dropdown-menu\">\r\n");
      out.write("                  ");
 for(int i=0;i<len;i++){ 
      out.write("\r\n");
      out.write("                  \r\n");
      out.write("                  <li><a href=\"");
      out.print( hrefs.get(i));
      out.write('"');
      out.write('>');
      out.print(titles.get(i) );
      out.write("</a></li>\r\n");
      out.write("                  \r\n");
      out.write("                  ");
} 
      out.write("\r\n");
      out.write("                  </ul>\r\n");
      out.write("                  \r\n");
      out.write("              </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </nav>");
      out.write("  \n");
      out.write("      \n");
      out.write("  \n");
      out.write("\n");
      out.write("      <div class=\"main\">\n");
      out.write("        <section class=\"module bg-dark-30\" data-background=\"assets/images/MainImage.jpg\">\n");
      out.write("          <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("              <div class=\"col-sm-6 col-sm-offset-3\">\n");
      out.write("               \n");
      out.write("               \n");
      out.write("                 \n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </section>\n");
      out.write("        \t\t\n");
      out.write("        \t <script type=\"text/javascript\">\n");
      out.write("\t\t\tfunction onSignIn(googleUser) {\n");
      out.write("\t\t\t  var profile = googleUser.getBasicProfile();\n");
      out.write("\t\t\t  console.log('reached here atleast');\n");
      out.write("\t\t\tdocument.getElementById('id').value = profile.getId();\n");
      out.write("\t\t\tdocument.getElementById('name').value = profile.getName();\n");
      out.write("\t\t\tdocument.getElementById('email').value = profile.getEmail();\n");
      out.write("\t\t\tdocument.getElementById('imageurl').value = profile.getImageUrl();\n");
      out.write("\t\t\tconsole.log('Reached till the end');\n");
      out.write("\t\t\t\n");
      out.write("\t\n");
      out.write("\t\t\t var auth2 = gapi.auth2.getAuthInstance();\n");
      out.write("\t\t\t    auth2.signOut().then(function () {\n");
      out.write("\t\t\t      console.log('User signed out.');\n");
      out.write("\t\t\t    });\n");
      out.write("\t\t\t\t    document.getElementById('temp_form').submit();\n");
      out.write("\t\t}\n");
      out.write("\t       </script>\t\n");
      out.write("        \t \t\n");
      out.write("        \n");
      out.write("         \n");
      out.write("\t\t\t<form name=\"temp_form\" method=\"POST\" id = 'temp_form' action = \"doWithGmail.do\">\n");
      out.write("\t\t\t  <input type=\"hidden\" name=\"id\" id=\"id\" />\n");
      out.write("\t\t\t  <input type=\"hidden\" name=\"name\" id=\"name\" />\n");
      out.write("\t\t\t  <input type=\"hidden\" name=\"email\" id=\"email\" />\n");
      out.write("\t\t\t  <input type=\"hidden\" name=\"imageurl\" id=\"imageurl\" />\n");
      out.write("\t\t\t  <input type=\"button\" name=\"Submit\" onclick=\"submit()\" />\n");
      out.write("\t\t\t</form>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <section class=\"module\">\n");
      out.write("          <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("              <div class=\"col-sm-5 col-sm-offset-1 mb-sm-40\">\n");
      out.write("                <h4 class=\"font-alt\">Login</h4>\n");
      out.write("                <hr class=\"divider-w mb-10\">\n");
      out.write("                <form class=\"form\">\n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                    <input class=\"form-control\" id=\"username\" type=\"text\" name=\"username\" placeholder=\"Username\"/>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                    <input class=\"form-control\" id=\"password\" type=\"password\" name=\"password\" placeholder=\"Password\"/>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"g-signin2\" data-onsuccess=\"onSignIn\"></div>\n");
      out.write("                  <br>\n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                    <button class=\"btn btn-round btn-b\">Login</button>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"form-group\"><a href=\"\"> </a></div>\n");
      out.write("                </form>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"col-sm-5\">\n");
      out.write("                <h4 class=\"font-alt\">Register</h4>\n");
      out.write("                <hr class=\"divider-w mb-10\">\n");
      out.write("                <form class=\"form\">\n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                    <input class=\"form-control\" id=\"E-mail\" type=\"text\" name=\"email\" placeholder=\"Email\"/>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                    <input class=\"form-control\" id=\"username\" type=\"text\" name=\"username\" placeholder=\"Username\"/>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                    <input class=\"form-control\" id=\"password\" type=\"password\" name=\"password\" placeholder=\"Password\"/>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                    <input class=\"form-control\" id=\"re-password\" type=\"password\" name=\"re-password\" placeholder=\"Re-enter Password\"/>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"g-signin2\" data-onsuccess=\"SignIn\" style=\"width:200%\">\n");
      out.write("                  </div><br>\n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                    <button class=\"btn btn-block btn-round btn-b\">Register</button>\n");
      out.write("                  </div>\n");
      out.write("                </form>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </section>\n");
      out.write("        <div class=\"module-small bg-dark\">\n");
      out.write("          <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("              <div class=\"col-sm-3\">\n");
      out.write("                <div class=\"widget\">\n");
      out.write("                  <h5 class=\"widget-title font-alt\">About Titan</h5>\n");
      out.write("                  <p>The languages only differ in their grammar, their pronunciation and their most common words.</p>\n");
      out.write("                  <p>Phone: +1 234 567 89 10</p>Fax: +1 234 567 89 10\n");
      out.write("                  <p>Email:<a href=\"#\">somecompany@example.com</a></p>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"col-sm-3\">\n");
      out.write("                <div class=\"widget\">\n");
      out.write("                  <h5 class=\"widget-title font-alt\">Recent Comments</h5>\n");
      out.write("                  <ul class=\"icon-list\">\n");
      out.write("                    <li>Maria on <a href=\"#\">Designer Desk Essentials</a></li>\n");
      out.write("                    <li>John on <a href=\"#\">Realistic Business Card Mockup</a></li>\n");
      out.write("                    <li>Andy on <a href=\"#\">Eco bag Mockup</a></li>\n");
      out.write("                    <li>Jack on <a href=\"#\">Bottle Mockup</a></li>\n");
      out.write("                    <li>Mark on <a href=\"#\">Our trip to the Alps</a></li>\n");
      out.write("                  </ul>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"col-sm-3\">\n");
      out.write("                <div class=\"widget\">\n");
      out.write("                  <h5 class=\"widget-title font-alt\">Blog Categories</h5>\n");
      out.write("                  <ul class=\"icon-list\">\n");
      out.write("                    <li><a href=\"#\">Photography - 7</a></li>\n");
      out.write("                    <li><a href=\"#\">Web Design - 3</a></li>\n");
      out.write("                    <li><a href=\"#\">Illustration - 12</a></li>\n");
      out.write("                    <li><a href=\"#\">Marketing - 1</a></li>\n");
      out.write("                    <li><a href=\"#\">Wordpress - 16</a></li>\n");
      out.write("                  </ul>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"col-sm-3\">\n");
      out.write("                <div class=\"widget\">\n");
      out.write("                  <h5 class=\"widget-title font-alt\">Popular Posts</h5>\n");
      out.write("                  <ul class=\"widget-posts\">\n");
      out.write("                    <li class=\"clearfix\">\n");
      out.write("                      <div class=\"widget-posts-image\"><a href=\"#\"><img src=\"assets/images/rp-1.jpg\" alt=\"Post Thumbnail\"/></a></div>\n");
      out.write("                      <div class=\"widget-posts-body\">\n");
      out.write("                        <div class=\"widget-posts-title\"><a href=\"#\">Designer Desk Essentials</a></div>\n");
      out.write("                        <div class=\"widget-posts-meta\">23 january</div>\n");
      out.write("                      </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"clearfix\">\n");
      out.write("                      <div class=\"widget-posts-image\"><a href=\"#\"><img src=\"assets/images/rp-2.jpg\" alt=\"Post Thumbnail\"/></a></div>\n");
      out.write("                      <div class=\"widget-posts-body\">\n");
      out.write("                        <div class=\"widget-posts-title\"><a href=\"#\">Realistic Business Card Mockup</a></div>\n");
      out.write("                        <div class=\"widget-posts-meta\">15 February</div>\n");
      out.write("                      </div>\n");
      out.write("                    </li>\n");
      out.write("                  </ul>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <hr class=\"divider-d\">\n");
      out.write("        <footer class=\"footer bg-dark\">\n");
      out.write("          <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("              <div class=\"col-sm-6\">\n");
      out.write("                <p class=\"copyright font-alt\">&copy; 2017&nbsp;<a href=\"index.html\">TitaN</a>, All Rights Reserved</p>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"col-sm-6\">\n");
      out.write("                <div class=\"footer-social-links\"><a href=\"#\"><i class=\"fa fa-facebook\"></i></a><a href=\"#\"><i class=\"fa fa-twitter\"></i></a><a href=\"#\"><i class=\"fa fa-dribbble\"></i></a><a href=\"#\"><i class=\"fa fa-skype\"></i></a>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </footer>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"scroll-up\"><a href=\"#totop\"><i class=\"fa fa-angle-double-up\"></i></a></div>\n");
      out.write("    </main>\n");
      out.write("    <!--  \n");
      out.write("    JavaScripts\n");
      out.write("    =============================================\n");
      out.write("    -->\n");
      out.write("    <script src=\"assets/lib/jquery/dist/jquery.js\"></script>\n");
      out.write("    <script src=\"assets/lib/bootstrap/dist/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"assets/lib/wow/dist/wow.js\"></script>\n");
      out.write("    <script src=\"assets/lib/jquery.mb.ytplayer/dist/jquery.mb.YTPlayer.js\"></script>\n");
      out.write("    <script src=\"assets/lib/isotope/dist/isotope.pkgd.js\"></script>\n");
      out.write("    <script src=\"assets/lib/imagesloaded/imagesloaded.pkgd.js\"></script>\n");
      out.write("    <script src=\"assets/lib/flexslider/jquery.flexslider.js\"></script>\n");
      out.write("    <script src=\"assets/lib/owl.carousel/dist/owl.carousel.min.js\"></script>\n");
      out.write("    <script src=\"assets/lib/smoothscroll.js\"></script>\n");
      out.write("    <script src=\"assets/lib/magnific-popup/dist/jquery.magnific-popup.js\"></script>\n");
      out.write("    <script src=\"assets/lib/simple-text-rotator/jquery.simple-text-rotator.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/plugins.js\"></script>\n");
      out.write("    <script src=\"assets/js/main.js\"></script>\n");
      out.write("  </body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
