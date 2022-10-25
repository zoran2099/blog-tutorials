package de.rieckpil;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v2/customer")
public class CustomerSimpleController {


  final CustomerService customerService;

  public CustomerSimpleController(CustomerService customerService) {
    this.customerService = customerService;
  }

  @GetMapping
  public List<Customer> getAllCustomers() {
    return customerService.allCustumers();
  }

  @PostMapping()
  public ResponseEntity<Void> createCustomer(@RequestBody Customer customer){
    customerService.createCustomer(customer);

    return ResponseEntity.status(HttpStatus.CREATED).build();
  }
}
