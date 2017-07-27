package sethi.vishal.MyWebApp.servlets;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sethi.vishal.MyWebApp.classes.SaveThisSignUp;
import sethi.vishal.MyWebApp.entity.User;

/**
 * Servlet implementation class SignUp
 */
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUp() {
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
		 String name = request.getParameter("name").toString();
		 String email = request.getParameter("id").toString();
		 String pass = request.getParameter("pass").toString();
		 System.out.println(name+" "+email+" "+pass);
		 SaveThisSignUp signup = new SaveThisSignUp(name, email, pass);
		 User user =  signup.save();
		 HttpSession session = request.getSession();
		 session.setAttribute("user", user);
		 
		  
		 
	}
	
}
