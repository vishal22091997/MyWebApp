package sethi.vishal.MyWebApp.classes;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import sethi.vishal.MyWebApp.entity.User;

public class checkLogIfUser {

	 
	public List<User> check(String email, String pass) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(User.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		List<User> list = session.createQuery("from User where name='"+email+"' and password='"+pass+"'").list();
		session.getTransaction().commit();
		session.close();
		factory.close();
		return list;
		
	}

}
