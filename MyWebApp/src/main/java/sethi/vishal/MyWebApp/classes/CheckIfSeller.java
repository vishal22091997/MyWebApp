package sethi.vishal.MyWebApp.classes;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import sethi.vishal.MyWebApp.entity.Seller;

public class CheckIfSeller {

	public boolean[] exists(int id) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Seller.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		List<Seller> list = session.createQuery("from Seller where userId = "+ id).list();
		
		session.getTransaction().commit();
		session.close();
		factory.close();
		System.out.println("reached under list");
		boolean ans[] = new boolean[2];//first one exists ... second one verified
		System.out.println("Size of list"+list.size());
		if(list.size()>0){
			
			ans[0] = true;
			if(list.get(0).getVerified()==1){
				ans[1] = true;
			}else{
				ans[1] = false;
			}
			
		}else{
			ans[0] = false;
			ans[1] = false;
		}
		return ans;
		
	}

}
