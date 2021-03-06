package sethi.vishal.MyWebApp.classes;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import sethi.vishal.MyWebApp.entity.Address;

public class DeleteAddress {
	int addId ;
	int userId;
	
	public DeleteAddress(int userId, int addId) {
		// TODO Auto-generated constructor stub
		this.addId = addId;
		this.userId = userId;
	}

	public void action() {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Address.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		Address cur = session.get(Address.class, addId);
		 
		if(cur.getUserId()==userId){
			session.delete(cur);
			session.getTransaction().commit();
		}
		session.close();factory.close();
		
	}
	

}
