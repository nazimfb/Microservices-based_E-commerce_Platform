package az.budaqli.customer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("api/v1/customers")
public record CustomerController(CustomerService service) {
    @PostMapping
    public void registerCustomer(@RequestBody CustomerRegistrationRequest request) {
        log.info(String.format("new customer registration %s", request));
        service.registerCustomer(request);
    }
}
