import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOneRelationShip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SessionFactory factory = new  Configuration().configure().buildSessionFactory();
         Session session = factory.openSession();
         Transaction tx = session.beginTransaction();

         Laptop laptop=new Laptop();
         laptop.setModelNo("Omen15");
         Employee employee=new Employee();
         employee.setEmpAddress("Visakhapatnam");
         employee.setEmpContact(440633);
         employee.setEmpName("Sudeb Dolui");
         employee.setEmpID(803443);
         employee.setLaptop(laptop);
         session.save(laptop);
         session.save(employee);
         tx.commit();
         factory.close();
	}

}
