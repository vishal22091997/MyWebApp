package sethi.vishal.MyWebApp.classes;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import sethi.vishal.MyWebApp.entity.Review;

public class AddReviewToDb {
	public void addReview(int no, String name, String email, int rating, String revi, int regi){
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		
		Review review = new Review(email,rating, revi, name, no, dateFormat.format(date),regi);
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Review.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		session.save(review);
		session.getTransaction().commit();
		session.close();
		factory.close();
		
	}

}
