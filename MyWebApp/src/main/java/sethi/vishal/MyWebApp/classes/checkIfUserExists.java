package sethi.vishal.MyWebApp.classes;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.*;
import sethi.vishal.MyWebApp.entity.User;

public class checkIfUserExists {

	public boolean check(String email) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(User.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		
		List<User> list = session.createQuery("from User where name = '"+email+"'").list();
		session.getTransaction().commit();
		session.close();factory.close();
		if(list.size()>0&&list.get(0).getName().equals(email)){
			return true;
		}else{
			return false;
		}
		
	}

}
