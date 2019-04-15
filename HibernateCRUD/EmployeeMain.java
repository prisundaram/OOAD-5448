package myPack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import myPack.EmployeePOJO;

public class EmployeeMain {

	public static void main(String[] args) {
		new EmployeeMain().insertInfo();
		new EmployeeMain().getInfo();
		new EmployeeMain().updateInfo();
		new EmployeeMain().deleteInfo();
	}
	
	public void insertInfo() {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
		SessionFactory sf = con.buildSessionFactory(sr);
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		EmployeePOJO ep = new EmployeePOJO();
		ep.setEid(2);
		ep.setEname("Steve");
		ep.setEmail("Steve@gmail.com");
		ep.setPhone("(567) 721-1507");
		ep.setAddress("Broomfield, Colorado, USA");
		session.save(ep);
		EmployeePOJO ep1 = new EmployeePOJO();
		ep1.setEid(3);
		ep1.setEname("Thor");
		ep1.setEmail("Thor@gmail.com");
		ep1.setPhone("(567) 341-8622");
		ep1.setAddress("Louisville, Colorado, USA");
		session.save(ep1);
		tr.commit();
		session.close();
		sf.close();
	}
	
	public void getInfo() {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
		SessionFactory sf = con.buildSessionFactory(sr);
		Session session = sf.openSession();
		Object obj = session.load(EmployeePOJO.class,new Integer(2));
		EmployeePOJO dp = (EmployeePOJO) obj;
		System.out.println("ID: "+dp.getEid());
		System.out.println("Name: "+dp.getEname());
		System.out.println("Email: "+dp.getEmail());
		System.out.println("Address: "+dp.getAddress());
	}
	
	public void updateInfo() {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
		SessionFactory sf = con.buildSessionFactory(sr);
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		EmployeePOJO dp = new EmployeePOJO();
		dp.setEid(2);
		dp.setEname("Strange");
		dp.setAddress("London");
		session.update(dp);
		tr.commit();
		session.close();
		sf.close();
	}
	
	public void deleteInfo() {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
		SessionFactory sf = con.buildSessionFactory(sr);
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Object ob = session.load(EmployeePOJO.class,new Integer(2));
		session.delete(ob);
		tr.commit();
		session.close();
		sf.close();
	}

}
