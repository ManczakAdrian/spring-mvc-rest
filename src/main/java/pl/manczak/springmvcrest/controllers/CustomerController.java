package pl.manczak.springmvcrest.controllers;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.manczak.springmvcrest.domain.Customer;
import pl.manczak.springmvcrest.services.CustomerService;

import java.util.List;

@RestController
@RequestMapping(CustomerController.BASE_URL)

public class CustomerController {


    public static final String BASE_URL = "/api/v1/customers";

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
@GetMapping
    List<Customer> getAllCustomers(){
       return customerService.findAllCustomers();
    }

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable Long id){
        return customerService.findCustomerById(id);

    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Customer saveCustomer(@RequestBody Customer customer){
        return customerService.saveCustomer (customer);

    }
}
