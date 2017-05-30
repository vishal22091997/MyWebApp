package sethi.vishal.MyWebApp.classes;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import sethi.vishal.MyWebApp.entity.Review;

public class AddReviewToDb {
	public void addReview(int no, String name, String email, int rating, String revi){
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		
		Review review = new Review(email,rating, revi, name, no, dateFormat.format(date),1);
		 
		Session session = new Configuration().configure().addAnnotatedClass(Review.class).buildSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(review);
		session.getTransaction().commit();
		session.close();
		
	}

}
