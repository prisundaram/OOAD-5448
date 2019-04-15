package myPack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class EmployeeMain {

	public static void main(String[] args) {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		con.addAnnotatedClass(EmpPOJO.class);
		ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
		SessionFactory sf = con.buildSessionFactory(sr);
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		EmpPOJO ep = new EmpPOJO();
		ep.setEname("Harry");
		ep.setEmail("Harry@gmail.com");
		ep.setPhone("(764) 511-0941");
		ep.setAddress("Colorado, USA");
		
		//Saving to db.. If not done, the object is in transient state.
		session.save(ep);
		
		ep.setEname("Harry Potter");
		ep.setEname("Harry James Potter");
		tr.commit();
		
		session.close();
		ep.setEname("Harry J Potter");
		
		sf.close();
		
	}

}
