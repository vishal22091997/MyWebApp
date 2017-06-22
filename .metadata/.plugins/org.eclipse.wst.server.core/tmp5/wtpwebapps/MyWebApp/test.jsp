<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div  class="Mydropdown" onfocus="openDropDown()" onblur="closeDropDown()">
          	 <input class="Mydropbtn" id="searchInput" onfocus="showList()" value="charger"   oninput="showList()" style="float:right;margin-top: 5%;color:black" class="navbar-header" type="text" placeholder="Press Enter to search">
          	 <div id="searchDropDown" class="Mydropdown-content">
	</div>
	</div>
</body>
</html>