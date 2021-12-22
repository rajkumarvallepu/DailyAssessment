import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sudeb.Employee;
import com.sudeb.Laptop;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Laptop l = new Laptop();  
        // IOC container is responsible to manage life cycle of OBject
        // Inversion of Control
        // Creating/Initializing IOC container
        ClassPathXmlApplicationContext context = 
                new ClassPathXmlApplicationContext("myString.xml");
        // Requesting a bean from IOC container as an raw Object class
        Laptop l=(Laptop) context.getBean("mylaptop");
        Employee e=(Employee) context.getBean("emp");
        Employee e1=(Employee) context.getBean("emp1");
//        e.setName("Sudeb");
        System.out.println(l);
        System.out.println(e);
        System.out.println(e1);
	}

}
