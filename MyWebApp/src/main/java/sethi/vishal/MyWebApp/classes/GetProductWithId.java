package sethi.vishal.MyWebApp.classes;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import sethi.vishal.MyWebApp.entity.Brand;
import sethi.vishal.MyWebApp.entity.Colors;
import sethi.vishal.MyWebApp.entity.Image;
import sethi.vishal.MyWebApp.entity.MainImageBig;
import sethi.vishal.MyWebApp.entity.Product;
import sethi.vishal.MyWebApp.entity.Review;
import sethi.vishal.MyWebApp.entity.Seller;
import sethi.vishal.MyWebApp.entity.Type;

public class GetProductWithId {
	public Product getProduct(String id){
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Product.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		Product product = session.get(Product.class, id);
		session.getTransaction().commit();
		 
		session.close();
		factory.close();
		return product;
	}
	public List<String> getImageNames(int no){
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Image.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		List<Image> list =  (List<Image>)session.createQuery("from Image WHERE no="+no).list();
		session.getTransaction().commit();
		 
		session.close();
		List<String> ret = new ArrayList<String>();
		for(int i=0,j=list.size();i<j;i++){
			ret.add(list.get(i).getImage());
		}
		factory.close();
		return ret;
	}
	public List<String> availColors(int no){
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Colors.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		List<Colors> list = (List<Colors>)session.createQuery("from Colors   where no = "+no+" and avail = 1").list();
		List<String> cols = new ArrayList<String>();
		for(int i=0, j= list.size();i<j;i++){
			cols.add(list.get(i).getCol());
		}
		session.getTransaction().commit();
		session.close();
		factory.close();
		return cols;
	}
	public String brandName(int bran){
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Brand.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		Brand brand = session.get(Brand.class, bran);
		session.getTransaction().commit();
		session.close();
		factory.close();
		return(brand.getName());
	}
	public List<Review> giveProductReview(int no){
		
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Review.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		List<Review> list = session.createQuery("from Review where no = "+no).list();
		session.getTransaction().commit();
		 
		session.close();
		factory.close();
		return(list);
	}
	public String getType(int typ){
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Type.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		Type type = session.get(Type.class, typ);
		session.getTransaction().commit();
		 
		session.close();
		factory.close();
		return(type.getType());
	}
	public Seller getSeller(int seller){
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Seller.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		Seller selle  = session.get(Seller.class, seller);
		session.getTransaction().commit();
		 
		session.close();
		factory.close();
		return selle;
	}
	public List<RelatedProduct> relatedProducts(int type){
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Product.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		Query query = session.createQuery("from Product where type = "+type+" order by ratings DESC");
		query.setFirstResult(0);
		query.setMaxResults(4);
		
		List<Product> list = query.list();

		session.getTransaction().commit();
		session.close();
		System.out.println("Reached here");
		
		System.out.println(list);
		List<RelatedProduct> related = new ArrayList<RelatedProduct>();
		for(Product product : list){
			Session session1 = new Configuration().configure().addAnnotatedClass(MainImageBig.class).buildSessionFactory().getCurrentSession();
			session1.beginTransaction();
			MainImageBig image = session1.get(MainImageBig.class,product.getNo());
			RelatedProduct relpro = new RelatedProduct(product, image.getImage());
			related.add(relpro);
		}
		
		factory.close();
		return related;
	}
	

}
