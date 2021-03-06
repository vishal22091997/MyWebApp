package sethi.vishal.MyWebApp.classes;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import sethi.vishal.MyWebApp.entity.ContactMessage;
import sethi.vishal.MyWebApp.entity.User;

public class AddMessage {
	private User user;
	private String message;
	public AddMessage(User user, String message){
		this.user = user;
		this.message = message;
	}
	public void addMessage(){
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(ContactMessage.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		ContactMessage messe = new ContactMessage(user.getId(), message);
		session.save(messe);
		session.getTransaction().commit();
		session.close();
		factory.close();
	}

}
