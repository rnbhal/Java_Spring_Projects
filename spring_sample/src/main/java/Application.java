import com.vmware.service.CustomerService;
import com.vmware.service.CustomerserviceImpl;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerService service = new CustomerserviceImpl();
		
		System.out.println(service.findAll().get(0).getFirstname());
	}

}
