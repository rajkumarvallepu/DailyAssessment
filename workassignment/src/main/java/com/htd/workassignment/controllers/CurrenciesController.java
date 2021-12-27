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

import com.htd.workassignment.entities.Currencies;
import com.htd.workassignment.repos.CurrenciesRepository;

@RestController
@RequestMapping("/currencies")
public class CurrenciesController {

	@Autowired
	private CurrenciesRepository currencyRepo;
	
	@PostMapping("/")
	public Currencies addCurrency(@RequestBody Currencies currencies) {
		return currencyRepo.save(currencies);
	}
	
	@GetMapping("/")
	public List<Currencies> listCurrencies(){
		return currencyRepo.findAll();
	}
	
	@PutMapping("/")
	public Currencies updateCurrencies(@RequestBody Currencies currencies) {
		return currencyRepo.save(currencies);
	}
	
	@DeleteMapping("/")
    public String deleteCurrencies(@RequestBody Currencies currencies) {
		currencyRepo.save(currencies);
        return "Currency Deleted Successfully";
    }

}
