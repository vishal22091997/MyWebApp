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
		 GetProductWithId get = new GetProductWithId();
		 Product product = get.getProduct(id);
		 HttpSession session = request.getSession();
		 session.setAttribute("product", product);
		 
		 List<Image> list = get.getImageNames(product.getNo());
		 session.setAttribute("image_list", list);
		 for(Image image:list){
			 System.out.println(image.getImage());
		 }
		 System.out.println(list.size());

		 
		 RequestDispatcher dispatch = request.getRequestDispatcher("shop_single_product.jsp");
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