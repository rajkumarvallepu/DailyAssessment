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

import com.htd.workassignment.entities.Countries;
import com.htd.workassignment.repos.CountriesRepository;

@RestController
@RequestMapping("/countries")
public class CountriesController {

	@Autowired
	private CountriesRepository countryRepo;
	
	@PostMapping("/")
	public Countries addCountry(@RequestBody Countries countries) {
		return countryRepo.save(countries);
	}
	
	@GetMapping("/")
	public List<Countries> listCountries(){
		return countryRepo.findAll();
	}
	
	@PutMapping("/")
	public Countries updateCountries(@RequestBody Countries countries) {
		return countryRepo.save(countries);
	}
	
	@DeleteMapping("/")
    public String deleteCountries(@RequestBody Countries countries) {
		countryRepo.save(countries);
        return "Country Deleted Successfully";
    }
}
