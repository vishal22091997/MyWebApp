package sethi.vishal.MyWebApp.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sethi.vishal.MyWebApp.classes.CartObject;
import sethi.vishal.MyWebApp.classes.UpdatingCart;

/**
 * Servlet implementation class UpdateCart
 */
public class UpdateCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateCart() {
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
		List<CartObject> cart = (List<CartObject>)session.getAttribute("cart");
		int size = cart.size();
		List<Integer> changedValues = new ArrayList<Integer>();
		for(int i=0;i<size;i++){
			int gotvalue =	Integer.parseInt(request.getParameter("count"+(i+1)));
			changedValues.add(i, gotvalue);
		}
		UpdatingCart update = new UpdatingCart(cart, changedValues);
		update.update();
		response.sendRedirect("DisplayCart");
	}

}
