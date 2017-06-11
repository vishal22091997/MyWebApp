package sethi.vishal.MyWebApp.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sethi.vishal.MyWebApp.classes.CheckUsername;
import sethi.vishal.MyWebApp.classes.ProductDisplay;
import sethi.vishal.MyWebApp.entity.User;

/**
 * Servlet implementation class LoginOrSignup
 */
public class LoginOrSignup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginOrSignup() {
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
		 String id = (String)request.getParameter("id");
		 String name = (String)request.getParameter("name");
		 String email = request.getParameter("email");
		 String imageUrl = request.getParameter("imageurl");
		 CheckUsername check = new CheckUsername(id, name, email, imageUrl); 
		 User user =  check.checkUser();
		 HttpSession session = request.getSession();
		 session.setAttribute("user", user);
		 System.out.println("Reached here");
		 String returnAdd = (String)session.getAttribute("returnAdd");
		 if(returnAdd==null){
			 response.sendRedirect("Index");
		 }else{
			 session.setAttribute("returnAdd", null);
			 response.sendRedirect(returnAdd);;
		 }
		 
		 
		 
	}

}
