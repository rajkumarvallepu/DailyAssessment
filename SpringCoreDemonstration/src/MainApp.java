import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Employee e = new Employee(); Approach is not good at all.
			ClassPathXmlApplicationContext applicationContext = 
					new ClassPathXmlApplicationContext("myString.xml"); // Is an IoC
			Employee e=(Employee)applicationContext.getBean("emp123");
			System.out.println(e);
	}

}
