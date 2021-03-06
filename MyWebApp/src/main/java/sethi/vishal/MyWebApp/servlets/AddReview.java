package sethi.vishal.MyWebApp.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sethi.vishal.MyWebApp.classes.AddReviewToDb;
import sethi.vishal.MyWebApp.classes.ProductDisplay;
import sethi.vishal.MyWebApp.entity.User;

/**
 * Servlet implementation class AddReview
 */
public class AddReview extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddReview() {
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
		HttpSession session = request.getSession();
		User user = (User)session.getAttribute("user");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		int rating = Integer.parseInt(request.getParameter("rating"));
		String review = request.getParameter("review");
		int regi = 0;
		if(user!=null){
			regi = 1;
			name = user.getEmail();
			email = user.getName();
		}
		 
		 
		ProductDisplay product = (ProductDisplay)session.getAttribute("product");
		System.out.println(product);
		int no = Integer.parseInt((String)request.getParameter("no"));
		
		System.out.println("Reached in Add Review Class");
		AddReviewToDb add = new AddReviewToDb();
		
		System.out.println(product.getNo());
		add.addReview(no, name, email, rating, review,regi);
		
		response.sendRedirect("showSingle?id="+product.getId());
 
		
	}

}
