import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import implementation.SomeBean;

/**
 * @author MrMario108
 *
 */
public class MainSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("konfiguracja.xml");
		
		SomeBean some = context.getBean("someBean", SomeBean.class);
		
		
	}

}
