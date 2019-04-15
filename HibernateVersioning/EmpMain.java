package newPack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import newPack.EmpPOJO;

public class EmpMain {

	public static void main(String[] args) {
		new EmpMain().insertInfo();
		new EmpMain().updateInfo();
	}
	
	public void insertInfo() {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
		SessionFactory sf = con.buildSessionFactory(sr);
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		EmpPOJO ep = new EmpPOJO();
		ep.setEid(2);
		ep.setEname("Strange");
		ep.setEmail("strange@gmail.com");
		ep.setPhone("(547) 984-0983"); 
		ep.setAddress("London, GB");
		session.save(ep);
		tr.commit();
		session.close();
		sf.close();
	}
	
	public void updateInfo() {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
		SessionFactory sf = con.buildSessionFactory(sr);
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Object obj = session.load(EmpPOJO.class, new Integer(2));
		EmpPOJO dp = (EmpPOJO) obj;
		dp.setEname("Bruce");
		session.update(dp);
		tr.commit();
		session.close();
		sf.close();
	}

}
