import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.vmware.repository.CustomerRepository;
import com.vmware.repository.HibernateCustomerRepositoryImpl;
import com.vmware.service.CustomerService;
import com.vmware.service.CustomerserviceImpl;

@Configuration
@ComponentScan({"com.vmware"})
public class AppConfig {

	/*@Bean(name = "customerService")
	public CustomerService getCustomerService() {
//		CustomerserviceImpl service = new CustomerserviceImpl(getCustomerRepository());
		CustomerserviceImpl service = new CustomerserviceImpl();
		//service.setCustomerRepository(getCustomerRepository());
		return service;
	}*/

	/*@Bean(name = "customerRepository")
	public CustomerRepository getCustomerRepository() {
		return new HibernateCustomerRepositoryImpl();
	}*/

}
