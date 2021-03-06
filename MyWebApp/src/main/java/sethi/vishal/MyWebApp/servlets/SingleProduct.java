package sethi.vishal.MyWebApp.servlets;

import java.io.IOException;
import java.util.List;import javax.imageio.stream.ImageInputStream;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sethi.vishal.MyWebApp.classes.GetProductWithId;
import sethi.vishal.MyWebApp.classes.MakeProductDisplay;
import sethi.vishal.MyWebApp.classes.ProductDisplay;
import sethi.vishal.MyWebApp.classes.RelatedProduct;
import sethi.vishal.MyWebApp.entity.Image;
import sethi.vishal.MyWebApp.entity.Product;

/**
 * Servlet implementation class SingleProduct
 */
public class SingleProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SingleProduct() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String id = request.getParameter("id");
		 ProductDisplay product = new MakeProductDisplay().makeProduct(id);
		 HttpSession session = request.getSession();
		 session.setAttribute("product", product);
		 GetProductWithId get = new GetProductWithId();
		 Product pro = get.getProduct(id);
		 List<RelatedProduct> related = get.relatedProducts(pro.getType());
		 session.setAttribute("related", related);
		 
		  
		 System.out.println("reachedInShopSingle");
		 RequestDispatcher dispatcher = request.getRequestDispatcher("shop_single_product.jsp");
		 dispatcher.forward(request, response);
		  
		 
		  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
