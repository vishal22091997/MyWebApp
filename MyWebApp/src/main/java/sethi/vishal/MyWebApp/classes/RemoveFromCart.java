package sethi.vishal.MyWebApp.classes;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import sethi.vishal.MyWebApp.entity.Cart;

public class RemoveFromCart {
	private int id;
	public RemoveFromCart(int id){
		this.id = id;
	}
	public void remove(){
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Cart.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		Cart cart = session.get(Cart.class, id);
		if(cart!=null){
		session.delete(cart);
		session.getTransaction().commit();
		 
		}
		session.close();
		factory.close();
	}

}
