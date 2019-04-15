package myPack;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class EmployeeMain {
	public static void main(String[] args) {
		new EmployeeMain().addEmployee();
	}
	
	public void addEmployee() {
		Transaction tr = null;
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		con.addAnnotatedClass(PojoAnnotations.class);
		ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
		SessionFactory sf = con.buildSessionFactory(sr);
		Session session = sf.openSession();
		try {
			tr = session.beginTransaction();
			PojoAnnotations ep = new PojoAnnotations();
			ep.setEname("Steven");
			ep.setEmail("Steven@gmail.com");
			ep.setPhone("(567) 743-9011");
			ep.setAddress("Colorado, USA");
			session.save(ep);
			tr.commit();
		}catch (HibernateException e) {
	         if (tr!=null) tr.rollback();
	         e.printStackTrace(); 
	      } finally {
	         session.close(); 
	      }
	}

}
