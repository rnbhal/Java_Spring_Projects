import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vmware.service.CustomerService;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appcontext = new ClassPathXmlApplicationContext("applicationcontext.xml");
		CustomerService service = appcontext.getBean("customerService", CustomerService.class);
		
		System.out.println(service.findAll().get(0).getFirstname());
	}

}
