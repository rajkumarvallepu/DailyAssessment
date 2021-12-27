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

import com.htd.workassignment.entities.Stores;
import com.htd.workassignment.repos.StoresRepository;

@RestController
@RequestMapping("/stores")
public class StoresController {

	@Autowired
	private StoresRepository storesRepo;
	
	@PostMapping("/")
	public Stores addStore(@RequestBody Stores stores) {
		return storesRepo.save(stores);
	}
	
	@GetMapping("/")
	public List<Stores> listStores(){
		return storesRepo.findAll();
	}
	
	@PutMapping("/")
	public Stores updateStores(@RequestBody Stores stores) {
		return storesRepo.save(stores);
	}
	
	@DeleteMapping("/")
    public String deleteStores(@RequestBody Stores stores) {
		storesRepo.save(stores);
        return "Store Deleted Successfully";
    }


}

