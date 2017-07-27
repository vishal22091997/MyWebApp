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
	public String makeBestString(String text){
		String ans ;
		 
		String arr[] = text.trim().split(" ");
		System.out.println(arr.length);
		 
		ans = "from Product where ";
		for(int i=0;i<arr.length;i++){
			ans+= "UPPER(name) like UPPER('%"+arr[i]+"%')";
			if(i!=arr.length-1){
				ans+=" AND ";
			}
		}
		return ans;
	}
	public List<Product> findList(){
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Product.class).buildSessionFactory();
		System.out.println("factory Made");
		Session session = factory.getCurrentSession();
		System.out.println("Transaction Made");
		session.beginTransaction();
		System.out.println(text);
		String searchQuery = makeBestString(text);
		List<Product> products = session.createQuery(searchQuery).list();
		session.getTransaction().commit();
		session.close();
		factory.close();
		return products;
	}
	
	

}
