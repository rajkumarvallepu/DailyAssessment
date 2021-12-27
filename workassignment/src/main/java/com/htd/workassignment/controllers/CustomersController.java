package com.htd.workassignment.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.htd.workassignment.entities.Customers;
import com.htd.workassignment.repos.CustomerRepository;

@RestController
@RequestMapping("/customers")
public class CustomersController {

	@Autowired
	private CustomerRepository customerRepo;
	
	@PostMapping("/")
	public Customers addCustomer(@RequestBody Customers customers) {
		return customerRepo.save(customers);
	}
	
	@GetMapping("/")
	public List<Customers> listCustomers(){
		return customerRepo.findAll();
	}
	
	@PutMapping("/")
	public Customers updateCustomers(@RequestBody Customers customers) {
		return customerRepo.save(customers);
	}
	
	@DeleteMapping("/")
    public String deleteCustomers(@RequestBody Customers customers) {
		customerRepo.save(customers);
        return "Customer Deleted Successfully";
    }


}
