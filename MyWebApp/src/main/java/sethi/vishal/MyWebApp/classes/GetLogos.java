package sethi.vishal.MyWebApp.classes;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import sethi.vishal.MyWebApp.entity.Logo;

public class GetLogos {
	public List<Logo> getLogos(int rank){
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Logo.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		List<Logo> list = session.createQuery("from Logo where rank = 1").list();
		session.getTransaction().commit();
		session.close();
		factory.close();
		return list;
		
	}

}
