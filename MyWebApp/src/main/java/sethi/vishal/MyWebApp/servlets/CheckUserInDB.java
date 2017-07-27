package sethi.vishal.MyWebApp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import sethi.vishal.MyWebApp.classes.checkIfUserExists;

/**
 * Servlet implementation class CheckUserInDB
 */
public class CheckUserInDB extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckUserInDB() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String email = request.getParameter("email").toLowerCase().trim();
		 Gson gson = new Gson();
		 PrintWriter out = response.getWriter();
		 boolean exists = new checkIfUserExists().check(email);
		 List<Boolean> list = new ArrayList<Boolean>();
		 System.out.println(email);
		 if(exists){
			 System.out.println("exists"); 
			 list.add(true);
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
