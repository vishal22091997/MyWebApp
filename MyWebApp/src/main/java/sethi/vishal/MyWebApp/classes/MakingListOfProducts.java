package sethi.vishal.MyWebApp.classes;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import sethi.vishal.MyWebApp.entity.*;
public class MakingListOfProducts {
	String text;

	public MakingListOfProducts(String text) {
		System.out.println("made Object"); 
		this.text = text;
	}
	public List<Product> findList(){
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Product.class).buildSessionFactory();
		System.out.println("factory Made");
		Session session = factory.getCurrentSession();
		System.out.println("Transaction Made");
		session.beginTransaction();
		System.out.println(text);
		List<Product> products = session.createQuery("from Product where UPPER(name) like UPPER('%"+text+"%')").list();
		session.getTransaction().commit();
		session.close();
		factory.close();
		return products;
	}
	
	

}
