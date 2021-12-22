import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToManyRelationShip {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Phone p1 = new Phone();
		p1.setPhoneNumber("12345678");
		p1.setType("Home");
		Phone p2 = new Phone();
		p2.setPhoneNumber("123456785");
		p2.setType("Self");
		List<Phone> phones = new ArrayList<Phone>();
		phones.add(p2);
		phones.add(p1);
		Employee employee = new Employee();
		employee.setEmpAddress("Plvd");
		employee.setEmpContact(440633);
		employee.setEmpName("Raj");
		employee.setTelephones(phones);
		session.save(p1);
		session.save(p2);
		session.save(employee);
		tx.commit();
		factory.close();
	}

}
