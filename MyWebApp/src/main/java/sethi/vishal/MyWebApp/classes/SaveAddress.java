package sethi.vishal.MyWebApp.classes;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import sethi.vishal.MyWebApp.entity.Address;;

public class SaveAddress {

	public void save(int id, String address) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Address.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		session.save(new sethi.vishal.MyWebApp.entity.Address(id, address));
		session.getTransaction().commit();
		session.close();
		factory.close();
		
	}

}
