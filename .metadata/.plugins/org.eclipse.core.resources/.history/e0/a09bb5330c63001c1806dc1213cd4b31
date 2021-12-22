import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		// Session Factory is Thread Safe Object and can live in the memory for long
		// without any negative effect
		Session session = factory.openSession();
		// Session is not Thread Safe Object and can not live in the memory for long
		Transaction tx = session.beginTransaction();
		// Process to execute the Query
		Laptop laptop = new Laptop();
		laptop.setModelNo("Lenovo E540");
		Book book = new Book();
		book.setIsbn(343434L);
		book.setPrice(444);
		book.setTitle("Mobile Application Development using Python");
		session.save(laptop);
		session.save(book);
		tx.commit(); // Saving Object Permanently and closing session
		factory.close(); // closing very expensive connection
	}
}
