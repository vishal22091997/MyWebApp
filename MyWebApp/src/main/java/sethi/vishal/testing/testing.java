package sethi.vishal.testing;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import sethi.vishal.MyWebApp.entity.Address;

 

public class testing {
	public static void main(String hdp[]){
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Address.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		List<Address> list = session.createQuery("from Address where userId="+12).list();
		session.getTransaction().commit();
		session.close();
		factory.close();
		System.out.println(list.get(0)); 
	}

}
