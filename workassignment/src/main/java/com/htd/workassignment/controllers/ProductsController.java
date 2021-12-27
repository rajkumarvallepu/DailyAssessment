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

import com.htd.workassignment.entities.Products;
import com.htd.workassignment.repos.ProductRepository;

@RestController
@RequestMapping("/products")
public class ProductsController {

	@Autowired
	private ProductRepository productRepo;
	
	@PostMapping("/")
	public Products addProduct(@RequestBody Products products) {
		return productRepo.save(products);
	}
	
	@GetMapping("/")
	public List<Products> listProducts(){
		return productRepo.findAll();
	}
	
	@PutMapping("/")
	public Products updateProducts(@RequestBody Products products) {
		return productRepo.save(products);
	}
	
	@DeleteMapping("/")
    public String deleteProducts(@RequestBody Products products) {
		productRepo.save(products);
        return "Product Deleted Successfully";
    }


}

