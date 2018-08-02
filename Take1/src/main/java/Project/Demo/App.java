package Project.Demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {

		try {
			
			Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Alien.class);

			SessionFactory factory = con.buildSessionFactory();

			Session session = factory.openSession();

			Transaction tx = session.beginTransaction();

			for(int i=0;i<5;i++) {
				Alien demo = new Alien();
				
				demo.setAname("Hi"+i);
				demo.setColor("Green"+i);
				session.save(demo);
				}
			
			tx.commit();
		} catch (Exception e) {

			e.printStackTrace();

		}
	}
}
