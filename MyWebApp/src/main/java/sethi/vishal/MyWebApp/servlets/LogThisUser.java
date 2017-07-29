package sethi.vishal.MyWebApp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;

import sethi.vishal.MyWebApp.classes.checkIfUserExists;
import sethi.vishal.MyWebApp.classes.checkLogIfUser;
import sethi.vishal.MyWebApp.entity.User;

/**
 * Servlet implementation class LogThisUser
 */
public class LogThisUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogThisUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email = request.getParameter("email").toLowerCase().trim();
		String pass = request.getParameter("pass");
		System.out.println(pass.length());
		 Gson gson = new Gson();
		 PrintWriter out = response.getWriter();
		 List<User> exists = new checkLogIfUser().check(email, pass);
		 List<Boolean> list = new ArrayList<Boolean>();
		 System.out.println(email);
		 
		 if(exists.size()>0&&exists.get(0).getName().equals(email)&&exists.get(0).getPassword().equals(pass)){
			 System.out.println("exists"); 
			 list.add(true);
			 HttpSession session = request.getSession();
			 session.setAttribute("user", exists.get(0));
			 out.print(gson.toJson(list));
			 
		 }else{
			 list.add ( false);
			 out.print(gson.toJson(list));
		 }
		 out.flush();
		 out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
