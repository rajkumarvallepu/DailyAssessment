import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.htd.setterinject.FootballPlayer;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("data.xml");
		FootballPlayer fb = (FootballPlayer) context.getBean("kaka");
		fb.play();
		FootballPlayer fb1 = (FootballPlayer) context.getBean("forlan");
		fb1.play();
	}

}
