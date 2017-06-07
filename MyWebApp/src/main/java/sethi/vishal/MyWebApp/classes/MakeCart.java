package sethi.vishal.MyWebApp.classes;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
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
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Cart.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		List<Cart> list = session.createQuery("from Cart where custId = "+id).list();
		session.getTransaction().commit();
		session.close();
		factory.close();
		List<CartObject> ans = new ArrayList<CartObject>();
		for(Cart cart:list){
			SessionFactory factory1 = new Configuration().configure().addAnnotatedClass(Product.class).buildSessionFactory();
			Session session1 = factory1.getCurrentSession();
			session1.beginTransaction();
			Product product = session1.get(Product.class, cart.getProductId());
			session1.getTransaction().commit();
			session1.close();
			factory1.close();
			
			SessionFactory factory2 = new Configuration().configure().addAnnotatedClass(MainImageBig.class).buildSessionFactory();
			Session session2 = factory2.getCurrentSession();
			session2.beginTransaction();
			MainImageBig image = session2.get(MainImageBig.class, product.getNo());
			session2.getTransaction().commit();
			session2.close();
			factory2.close();
			
			
			int count = cart.getCount();
			System.out.println("Cart Id"+cart.getId());
			CartObject obj = new CartObject(product, image.getImage(), count, cart.getId());
			ans.add(obj);
		}
		return ans;
		
		
		
		
		
		
	}
}
