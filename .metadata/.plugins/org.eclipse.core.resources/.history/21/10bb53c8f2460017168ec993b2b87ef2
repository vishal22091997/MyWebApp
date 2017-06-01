package sethi.vishal.MyWebApp.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.cfg.Configuration;

import sethi.vishal.MyWebApp.classes.CartObject;
import sethi.vishal.MyWebApp.classes.MakeCart;
import sethi.vishal.MyWebApp.entity.User;

/**
 * Servlet implementation class DisplayCart
 */
public class DisplayCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayCart() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		User user = (User)session.getAttribute("user");
		MakeCart makeCart = new MakeCart(user.getId());
		session.setAttribute("cart", makeCart);
		List<CartObject> cartObjects = makeCart.makeCart();
		session.setAttribute("cart", cartObjects);
		System.out.println("Reached here");
		System.out.print(makeCart);
		RequestDispatcher dispatch = request.getRequestDispatcher("shop_checkout.jsp");
		dispatch.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
