package sethi.vishal.MyWebApp.servlets;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sethi.vishal.MyWebApp.classes.SaveApplication;
import sethi.vishal.MyWebApp.entity.Seller;
import sethi.vishal.MyWebApp.entity.User;

/**
 * Servlet implementation class SellerApplication
 */
public class SellerApplication extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SellerApplication() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String fName = request.getParameter("first_name");
		 String lName = request.getParameter("last_name");
		 String email = request.getParameter("email");
		 String phone = request.getParameter("phone");
		 String address = request.getParameter("address");
		 String city = request.getParameter("city");
		 String state = request.getParameter("state");
		 String pin = request.getParameter("pincode");
		 
		 String name = fName+" "+ lName;
		 String fullAddress = address+" "+ city+" "+ state;
		 HttpSession session = request.getSession();
		 User user = (User)session.getAttribute("user");
		 DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		 Date date = new Date();
		   //2016/11/16 12:08:43
		 
		 Seller application = new Seller(name, fullAddress, Long.parseLong(phone), email, dateFormat.format(date), Integer.parseInt(pin), user.getId());
		 SaveApplication save = new SaveApplication(application);
		 save.insertApplication();
		 
		 response.sendRedirect("Profile");
		 
		 
	}

}
