import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOneRelationShip {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		Laptop laptop = new Laptop();
		laptop.setModelNo("Lenovo TP");
		Employee employee = new Employee();
		employee.setEmpAddress("Plvd");
		employee.setEmpContact(440633);
		employee.setEmpName("Raj");
		employee.setEmpID(803443);
		employee.setLaptop(laptop);
		session.save(laptop);
		session.save(employee);
		tx.commit();
		factory.close();
	}

}
