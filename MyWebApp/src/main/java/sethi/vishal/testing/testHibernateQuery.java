package sethi.vishal.testing;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import sethi.vishal.MyWebApp.classes.RelatedProduct;
import sethi.vishal.MyWebApp.entity.Brand;
import sethi.vishal.MyWebApp.entity.Cart;
import sethi.vishal.MyWebApp.entity.Colors;
import sethi.vishal.MyWebApp.entity.Image;
import sethi.vishal.MyWebApp.entity.MainImageBig;
import sethi.vishal.MyWebApp.entity.Product;
import sethi.vishal.MyWebApp.entity.Seller;
import sethi.vishal.MyWebApp.entity.Type;

public class testHibernateQuery {
	public static void main(String hd[]){

		Session session2 = new Configuration().configure().addAnnotatedClass(MainImageBig.class).buildSessionFactory().getCurrentSession();
		session2.beginTransaction();
		MainImageBig image = session2.get(MainImageBig.class, 1);
		session2.getTransaction().commit();
		session2.close();
		
		System.out.println(image);
	}

}
