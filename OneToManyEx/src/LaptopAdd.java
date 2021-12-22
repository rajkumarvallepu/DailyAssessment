import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class LaptopAdd {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Laptop laptop = new Laptop();
		laptop.setModelNo("Omen15");
		session.save(laptop);
		tx.commit();
		factory.close();
	}
}
