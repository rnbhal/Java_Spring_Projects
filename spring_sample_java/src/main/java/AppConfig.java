import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan({"com.vmware"})
@PropertySource("app.properties")
public class AppConfig {
	
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}

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
