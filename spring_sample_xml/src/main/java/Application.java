import java.applet.AppletContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.vmware.service.CustomerService;
import com.vmware.service.CustomerserviceImpl;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CustomerService service = new CustomerserviceImpl();
		ApplicationContext appco = new ClassPathXmlApplicationContext("appcontext.xml");
		
		CustomerService service = appco.getBean("foos", CustomerService.class);
		System.out.println(service);
		
		CustomerService service2 = appco.getBean("foos", CustomerService.class);
		System.out.println(service2);
		
		System.out.println(service.findAll().get(0).getFirstname());
		
		
	}

}
