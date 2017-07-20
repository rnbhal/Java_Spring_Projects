import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vmware.service.CustomerService;
import com.vmware.service.CustomerserviceImpl;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appcontext = new AnnotationConfigApplicationContext(AppConfig.class);
		CustomerService service = appcontext.getBean("customerService", CustomerService.class);

		System.out.println(service);

		// same address for singleton
		CustomerService service2 = appcontext.getBean("customerService", CustomerService.class);
		System.out.println(service2);

		System.out.println(service.findAll().get(0).getFirstname());
	}

}
