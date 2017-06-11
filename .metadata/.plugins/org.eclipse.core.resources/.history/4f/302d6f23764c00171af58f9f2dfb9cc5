package sethi.vishal.MyWebApp.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sethi.vishal.MyWebApp.classes.AddingToCart;
import sethi.vishal.MyWebApp.entity.User;

/**
 * Servlet implementation class AddToCart
 */
public class AddToCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddToCart() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String prodId = request.getParameter("prodid");
		int count = Integer.parseInt(String.valueOf(request.getParameter("count")));
		HttpSession session = request.getSession();
		User user =  (User)session.getAttribute("user");
		System.out.println(prodId+" "+count);
		
		if(user==null){
			//Ask him to register or login to the page and return to same page
			RequestDispatcher dispatcher = request.getRequestDispatcher("login_register.jsp");
			session.setAttribute("return", "showSingle?id="+prodId);
			dispatcher.forward(request, response);
		}else{
			// add to cart and return back to same page 
			 AddingToCart cartAdder = new AddingToCart(prodId, count, user);
			 cartAdder.addToCart();
			 response.sendRedirect("DisplayCart");
			 
		}
			
	}

}
