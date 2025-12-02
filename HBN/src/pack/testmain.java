package pack;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class testmain {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction tr=session.beginTransaction();
        employee e1=new employee();
        e1.setEmpid(2);
        e1.setName("Aditya");
        e1.setSalary(5630);
        session.save(e1);
        tr.commit();
        session.close();
        
        
	}

}
