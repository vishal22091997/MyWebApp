package sethi.vishal.MyWebApp.classes;

 

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

 
import sethi.vishal.MyWebApp.entity.Product;

public class GetGreaterThan3Ratings {
 
	public List<Product> giveList( int ratings){
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Product.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		System.out.println("Transactionn begin");
		 
		
		 
		List<Product> list2 = session.createQuery("from Product where avail = 1 and ratings > 3").list();
		System.out.println("Got the list");
		session.getTransaction().commit();
		factory.close();
		System.out.println(list2);;
		System.out.println(list2.size());
		session.close();
		factory.close();
		return list2;
		
	}

}
