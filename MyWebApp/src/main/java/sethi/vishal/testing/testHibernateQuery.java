package sethi.vishal.testing;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import sethi.vishal.MyWebApp.classes.RelatedProduct;
import sethi.vishal.MyWebApp.entity.Brand;
import sethi.vishal.MyWebApp.entity.Colors;
import sethi.vishal.MyWebApp.entity.Image;
import sethi.vishal.MyWebApp.entity.MainImageBig;
import sethi.vishal.MyWebApp.entity.Product;
import sethi.vishal.MyWebApp.entity.Seller;
import sethi.vishal.MyWebApp.entity.Type;

public class testHibernateQuery {
	public static void main(String hd[]){
		Session session = new Configuration().configure().addAnnotatedClass(Product.class).buildSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query query = session.createQuery("from Product where type = "+1+" order by ratings DESC");
		query.setFirstResult(0);
		query.setMaxResults(4);
		
		List<Product> list = query.list();

		session.getTransaction().commit();
		session.close();
		
		
		System.out.println(list);
		List<RelatedProduct> related = new ArrayList<RelatedProduct>();
		for(Product product : list){
			Session session1 = new Configuration().configure().addAnnotatedClass(MainImageBig.class).buildSessionFactory().getCurrentSession();
			session1.beginTransaction();
			MainImageBig image = session1.get(MainImageBig.class,product.getNo());
			RelatedProduct relpro = new RelatedProduct(product, image.getImage());
			related.add(relpro);
		}
		
		
		System.out.println(related); ;
	}

}
