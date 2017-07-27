package sethi.vishal.MyWebApp.classes;

import sethi.vishal.MyWebApp.entity.Address;
 
import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class GetProfileData {

	public List<Address> getListOfAddresses(int id) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Address.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		List<Address> list = session.createQuery("from Address where userId="+id).list();
		session.getTransaction().commit();
		session.close();
		factory.close();
		return list;
	}
	

}
