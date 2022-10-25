package de.rieckpil;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {


  private static final List<Customer> CUSTOMER_LIST = new ArrayList<>(
    List.of(new Customer("Duke", "Java", 42L))
  );


  public void createCustomer(Customer customer) {
    CUSTOMER_LIST.add(customer);
  }

  public List<Customer> allCustumers() {
    return CUSTOMER_LIST;
  }
}
