import cg.wbd.grandemonstration.repository.CustomerRepository;
import cg.wbd.grandemonstration.service.CustomerService;
import cg.wbd.grandemonstration.service.impl.CustomerServiceImplWithSpringData;
import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;

public class CustomerServiceTestConfig {
    @Bean
    public CustomerRepository customerRepository() {
        return Mockito.mock(CustomerRepository.class);
    }

    @Bean
    public CustomerService customerService() {
        return new CustomerServiceImplWithSpringData();
    }
}
