package pack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestMain {

	public static void main(String[] args) {
	     Configuration cfg=new Configuration();
	     cfg.configure("hibernate.cfg.xml");
	     SessionFactory factory=cfg.buildSessionFactory();
	     Session session=factory .openSession();
	     Transaction tr=session.beginTransaction();
	     Address a1=new Address();  
	     a1.setCity("Pune");
	     a1.setState("Kerala");
	     a1.setCountry("India");
	     Employee e1=new Employee();
	     e1.setEmpid(102);
	     e1.setEmpname("adi");
	     e1.setSalary(500000);
	     e1.setAddr(a1);
	     session.save(e1);
	     tr.commit();
	     session.close();
	 
	}
}
