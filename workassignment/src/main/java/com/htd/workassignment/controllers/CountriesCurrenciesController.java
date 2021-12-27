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

import com.htd.workassignment.entities.CountriesCurrencies;
import com.htd.workassignment.repos.CountriesCurrenciesRepo;

@RestController
@RequestMapping("/countriescurrencies")
public class CountriesCurrenciesController {

	@Autowired
	private CountriesCurrenciesRepo countriesCurreciesRepo;
	
	@PostMapping("/")
	public CountriesCurrencies addCountriesCurrencies(@RequestBody CountriesCurrencies countriesCurrencies) {
		return countriesCurreciesRepo.save(countriesCurrencies);
	}
	
	@GetMapping("/")
	public List<CountriesCurrencies> listCountriesCurrencies(){
		return countriesCurreciesRepo.findAll();
	}
	
	@PutMapping("/")
	public CountriesCurrencies updateCountriesCurrencies(@RequestBody CountriesCurrencies countriesCurrencies) {
		return countriesCurreciesRepo.save(countriesCurrencies);
	}
	
	@DeleteMapping("/")
    public String deleteCountriesCurrencies(@RequestBody CountriesCurrencies countries) {
		countriesCurreciesRepo.save(countries);
        return "CountriesCurrency Deleted Successfully";
    }
}

