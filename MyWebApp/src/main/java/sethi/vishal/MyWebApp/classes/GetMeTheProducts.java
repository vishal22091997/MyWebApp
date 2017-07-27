package sethi.vishal.MyWebApp.classes;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import sethi.vishal.MyWebApp.entity.Product;

 

public class GetMeTheProducts {
	String type;
	String sort;
	String page;
	public GetMeTheProducts(String type, String sort, String page){
		this.type = type;
		this.sort = sort;
		this.page = page;
	}
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Product.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		List<Product> list = session.createQuery("from Product where type="+type).list();
		session.getTransaction().commit();
		session.close();
		factory.close();
		
		
		
		
		return list;
	}

}
