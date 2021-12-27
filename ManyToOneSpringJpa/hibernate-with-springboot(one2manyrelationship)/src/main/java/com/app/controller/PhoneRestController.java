package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.app.model.Phone;
import com.app.repo.PhoneRepository;

public class PhoneRestController {

	@Autowired
	private PhoneRepository phoneRepo;
	
	@PostMapping("/")
	public Phone addPhone(@RequestBody Phone phone) {
		return phoneRepo.save(phone);
	}
	
	@GetMapping("/")
	public List<Phone> listPhone(){
		return phoneRepo.findAll();
	}
	
	@PutMapping("/")
	public Phone updatePhone(@RequestBody Phone phone) {
		return phoneRepo.save(phone);
	}
	
	@DeleteMapping("/")
    public String deleteEmployee(@RequestBody Phone phone) {
        phoneRepo.save(phone);
        return "Phone Deleted Successfully";
    }
}
