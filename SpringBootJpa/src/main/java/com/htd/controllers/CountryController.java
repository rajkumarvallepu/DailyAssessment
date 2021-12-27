package com.htd.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.htd.entities.Country;
import com.htd.repos.CountryRepository;

@RestController
public class CountryController {
    @Autowired
    private CountryRepository countryRepository;
 
    @GetMapping("/country")
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }
 
    @PostMapping("/country/blank")
    public Country addBlankCountries() {
        return countryRepository.save(new Country());
    }

    @PostMapping("/country")
    public Country addCountries(@RequestBody Country country) {
        return countryRepository.save(country);
    }

    @PutMapping("/country")
    public Country updateCountries(@RequestBody Country country) {
        return countryRepository.save(country);
    }

    @DeleteMapping("/country")
    public String deleteCountries(@RequestBody Country country) {
        countryRepository.delete(country);
        return "Deleted Successfully";
    }
}
