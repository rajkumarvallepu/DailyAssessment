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

import com.htd.workassignment.entities.Sales;
import com.htd.workassignment.repos.SalesRepository;

@RestController
@RequestMapping("/sales")
public class SalesController {

	@Autowired
	private SalesRepository salesRepo;
	
	@PostMapping("/")
	public Sales addSales(@RequestBody Sales sales) {
		return salesRepo.save(sales);
	}
	
	@GetMapping("/")
	public List<Sales> listProducts(){
		return salesRepo.findAll();
	}
	
	@PutMapping("/")
	public Sales updateSales(@RequestBody Sales sales) {
		return salesRepo.save(sales);
	}
	
	@DeleteMapping("/")
    public String deleteSales(@RequestBody Sales sales) {
		salesRepo.save(sales);
        return "Sales Deleted Successfully";
    }


}

