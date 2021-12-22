import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.htd.shapesdata.Circle;
import com.htd.shapesdata.Rectangle;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("data.xml");
	Rectangle rect = (Rectangle) context.getBean("myRectangle");
	Circle cir = (Circle) context.getBean("myCircle");
	System.out.println(rect);
	System.out.println(rect.area());
	System.out.println(rect.volume());
	System.out.println(cir);
	System.out.println(cir.area());
	System.out.println(cir.volume());
	}

}
