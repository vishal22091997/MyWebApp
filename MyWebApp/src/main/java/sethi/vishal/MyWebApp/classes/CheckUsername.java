package sethi.vishal.MyWebApp.classes;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.sql.ordering.antlr.Factory;

import sethi.vishal.MyWebApp.entity.User;

public class CheckUsername {
	private String id;
	private String email;
	private String name;
	private String imageUrl;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public CheckUsername(String id, String email, String name, String imageUrl) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
		this.imageUrl = imageUrl;
	}
	public String returnDate(){
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		return(dateFormat.format(date)); //2016/11/16 12:08:43
	}
	public User checkUser(){
		Session session = new Configuration().configure().addAnnotatedClass(User.class).buildSessionFactory().getCurrentSession();
		session.beginTransaction();
		List<User> list = session.createQuery("from User where gmailid = '"+id+"'").list();
		session.getTransaction().commit();
		session.close();
		
		
		if(list.size()>0){
			return list.get(0);
		}else{
			//Adding object into the database so as to use it for later purposes
			Session session2 = new Configuration().configure().addAnnotatedClass(User.class).buildSessionFactory().getCurrentSession();
			session2.beginTransaction();
			User user = new User(id,email,imageUrl,returnDate(),name);
			session2.save(user);
			session2.getTransaction().commit();
			session2.close();
			return getUser(id);
		}
	}
	private User getUser(String id2) {
		// TODO Auto-generated method stub
		Session session = new Configuration().configure().addAnnotatedClass(User.class).buildSessionFactory().getCurrentSession();
		session.beginTransaction();
		List<User> list = session.createQuery("from User where gmailid = '"+id2+"'").list();
		session.getTransaction().commit();
		session.close();
		 
		return list.get(0);
	}
}
