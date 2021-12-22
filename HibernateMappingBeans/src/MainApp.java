import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Laptop laptop = new Laptop();
		laptop.setModelNo("Lenovo E540");
		Book book = new Book();
		book.setIsbn(343434L);
		book.setPrice(444);
		book.setTitle("Mobile Application Development using Python");
		session.save(laptop);
		session.save(book);
		tx.commit();
		factory.close();
	}
}
