package sethi.vishal.MyWebApp.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sethi.vishal.MyWebApp.classes.SaveAddress;
import sethi.vishal.MyWebApp.entity.User;

/**
 * Servlet implementation class InsertAddress
 */
public class InsertAddress extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertAddress() {
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
		 String name = request.getParameter("name");
		 String phone = request.getParameter("phone");
		 String pincode = request.getParameter("pincode");
		 String address = request.getParameter("address");
		 String landmark = request.getParameter("landmark");
		 String city = request.getParameter("city");
		 String state = request.getParameter("state");
		 String finalString = name.toUpperCase()+"\n"+address+"\n"+landmark+"\n"+pincode+"\n"+city+"\n"+state+"\n"+phone;
		 SaveAddress saver = new SaveAddress();
		 HttpSession session = request.getSession();
		 User user = (User)session.getAttribute("user");
		 saver.save(user.getId(), finalString);
		 response.sendRedirect("Profile");
	}

}
