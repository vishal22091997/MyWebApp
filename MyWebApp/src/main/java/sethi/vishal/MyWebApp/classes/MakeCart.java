package sethi.vishal.MyWebApp.classes;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import sethi.vishal.MyWebApp.entity.Cart;
import sethi.vishal.MyWebApp.entity.MainImageBig;
import sethi.vishal.MyWebApp.entity.Product;

public class MakeCart {
	 int id ;

	public MakeCart(int id) {
		super();
		this.id = id;
	}
	 
	public List<CartObject> makeCart(){
		Session session = new Configuration().configure().addAnnotatedClass(Cart.class).buildSessionFactory().getCurrentSession();
		session.beginTransaction();
		List<Cart> list = session.createQuery("from Cart where custId = "+id).list();
		session.getTransaction().commit();
		session.close();
		List<CartObject> ans = new ArrayList<CartObject>();
		for(Cart cart:list){
			Session session1 = new Configuration().configure().addAnnotatedClass(Product.class).buildSessionFactory().getCurrentSession();
			session1.beginTransaction();
			Product product = session1.get(Product.class, cart.getProductId());
			session1.getTransaction().commit();
			session1.close();
			
			Session session2 = new Configuration().configure().addAnnotatedClass(MainImageBig.class).buildSessionFactory().getCurrentSession();
			session2.beginTransaction();
			MainImageBig image = session2.get(MainImageBig.class, product.getNo());
			session2.getTransaction().commit();
			session2.close();
			
			int count = cart.getCount();
			
			CartObject obj = new CartObject(product, image.getImage(), count);
			ans.add(obj);
		}
		return ans;
		
		
		
		
		
		
	}
}
