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

import com.app.model.Laptop;
import com.app.repo.LaptopRepository;

@RestController
@RequestMapping("/laptop")
public class LaptopRestController {

	@Autowired
	private LaptopRepository laptopRepo;
	
	@PostMapping("/")
	public Laptop addLaptop(@RequestBody Laptop laptop) {
		return laptopRepo.save(laptop);
	}
	
	@GetMapping("/")
	public List<Laptop> listLaptop(){
		return laptopRepo.findAll();
	}
	
	@PutMapping("/")
	public Laptop updateLaptop(@RequestBody Laptop laptop) {
		return laptopRepo.save(laptop);
	}
	
	@DeleteMapping("/")
    public String deleteLaptop(@RequestBody Laptop laptop) {
        laptopRepo.save(laptop);
        return "Laptop Deleted Successfully";
    }
}
