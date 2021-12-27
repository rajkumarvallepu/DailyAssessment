package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Employee;
import com.app.repo.EmployeeRepository;

@RestController
@RequestMapping("/employee")
public class EmployeeRestController {

	@Autowired
	private EmployeeRepository employeeRepo;
	
	@PostMapping("/")
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeRepo.save(employee);
	}
	
	@GetMapping("/")
	public List<Employee> listEmployee(){
		return employeeRepo.findAll();
	}
	
	@PutMapping("/")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return employeeRepo.save(employee);
	}
	
	@DeleteMapping("/")
    public String deleteEmployee(@RequestBody Employee employee) {
        employeeRepo.save(employee);
        return "Employee Deleted Successfully";
    }
	
	
}
