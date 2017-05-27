package sethi.vishal.MyWebApp.classes;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import sethi.vishal.MyWebApp.entity.Image;
import sethi.vishal.MyWebApp.entity.Product;

public class GetProductWithId {
	public Product getProduct(String id){
		Session session = new Configuration().configure().addAnnotatedClass(Product.class).buildSessionFactory().getCurrentSession();
		session.beginTransaction();
		Product product = session.get(Product.class, id);
		session.getTransaction().commit();
		session.close();
	 
		return product;
	}
	public List<Image> getImageNames(int no){
		Session session = new Configuration().configure().addAnnotatedClass(Image.class).buildSessionFactory().getCurrentSession();
		session.beginTransaction();
		List<Image> list =  (List<Image>)session.createQuery("from Image WHERE no="+no).list();
		session.getTransaction().commit();
		session.close();
		return list;
	}

}