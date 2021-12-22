import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.htd.example.Employee;
import com.htd.example.Laptop;

public class MainApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("myString.xml");
		Laptop l = (Laptop) context.getBean("mylaptop");
		Employee e = (Employee) context.getBean("emp");
		Employee e1 = (Employee) context.getBean("emp1");
		System.out.println(l);
		System.out.println(e);
		System.out.println(e1);
	}

}
