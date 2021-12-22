
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("file.xml");
		Order o = (Order)context.getBean("o1");
		Product p = (Product)context.getBean("p1");
		Customer c = (Customer)context.getBean("c1");
		System.out.println(o);
	}

}
 