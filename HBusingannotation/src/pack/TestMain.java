package pack;
import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestMain {

	public static void main(String[] args) {
              Configuration cfg=new Configuration();
              cfg.configure("book.cfg.xml");
              SessionFactory factory=cfg.buildSessionFactory();
              Session session=factory.openSession();
              Transaction tr=session.beginTransaction();
              Scanner sc=new Scanner(System.in);
              String ch;
              do {
            	  Book b1=new Book();
            	  System.out.println("Enter book id:");
            	  int bid=sc.nextInt();
            	  System.out.println("Enter book name:");
            	  String name=sc.next();
            	  System.out.println("Enter book price:");
            	  int price=sc.nextInt();
            	  b1.setBid(bid);
            	  b1.setName(name);
            	  b1.setPrice(price);
            	  session.save(b1);
            	  System.out.println("Any more records? Yes/No");
            	  ch=sc.next();
              }while(ch.equals("Yes"));
              tr.commit();
              session.close();
	}

}
