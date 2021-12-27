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

import com.htd.workassignment.entities.Regions;
import com.htd.workassignment.repos.RegionsRepository;

@RestController
@RequestMapping("/regions")
public class RegionsController {

	@Autowired
	private RegionsRepository regionRepo;
	
	@PostMapping("/")
	public Regions addRegion(@RequestBody Regions regions) {
		return regionRepo.save(regions);
	}
	
	@GetMapping("/")
	public List<Regions> listRegions(){
		return regionRepo.findAll();
	}
	
	@PutMapping("/")
	public Regions updateRegions(@RequestBody Regions regions) {
		return regionRepo.save(regions);
	}
	
	@DeleteMapping("/")
    public String deleteRegions(@RequestBody Regions regions) {
		regionRepo.save(regions);
        return "Region Deleted Successfully";
    }


}
