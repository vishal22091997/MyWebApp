package sethi.vishal.MyWebApp.classes;

import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.* ;
import org.hibernate.query.Query;

import sethi.vishal.MyWebApp.entity.Cart;
import sethi.vishal.MyWebApp.entity.User;

public class AddingToCart {
	private String prodId;
	private int count;
	private User user;
	public AddingToCart(String prodId, int count, User user) {
		super();
		this.prodId = prodId;
		this.count = count;
		this.user = user;
	}
	
	public void addToCart(){
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Cart.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		int userId = user.getId();
		List<Cart> list = (List<Cart>)session.createQuery("from Cart where cust_id="+userId+" and product_id='"+prodId+"'").list();
		if(list.size()==0){
			Cart cart = new Cart(count,  prodId,user.getId());
			session.save(cart);
			session.getTransaction().commit();
			session.close();
		}else{
			Cart samCart = list.get(0);
			Session session2 = new Configuration().configure().addAnnotatedClass(Cart.class).buildSessionFactory().getCurrentSession();
			session2.beginTransaction();
			Cart act = session2.get(Cart.class, samCart.getId());
			act.setCount(samCart.getCount()+count);
			session2.getTransaction().commit();
			session2.close();
		}
		factory.close();
	}

}
