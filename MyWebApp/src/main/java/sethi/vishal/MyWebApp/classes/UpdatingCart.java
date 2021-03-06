package sethi.vishal.MyWebApp.classes;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import sethi.vishal.MyWebApp.entity.Cart;

public class UpdatingCart {
	private List<CartObject> cart;
	private List<Integer> values;
	public UpdatingCart(List<CartObject> cart, List<Integer> values){
		this.cart = cart;
		this.values = values;
	}
	public void update(){
		int size = values.size();
		for(int i=0;i<size;i++){
			SessionFactory factory = new Configuration().configure().addAnnotatedClass(Cart.class).buildSessionFactory();
			Session session = factory.getCurrentSession();
			session.beginTransaction();
			Cart car = session.get(Cart.class, cart.get(i).getId());
			if(values.get(i)==0){
				session.delete(car);
			}else{
				car.setCount(values.get(i));
			}
			session.getTransaction().commit();
			session.close();
			factory.close();
		}
	}

}
