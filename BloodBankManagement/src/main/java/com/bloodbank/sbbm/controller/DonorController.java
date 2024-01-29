package com.bloodbank.sbbm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bloodbank.sbbm.entity.Donor;
import com.bloodbank.sbbm.service.DonorService;


@RestController
public class DonorController {

	@Autowired
	DonorService ds;
	
	@GetMapping("/getBloodDonors")
	public List<Donor> getBloodDonors(){
		return ds.fetchDonorListDetails();
	}
		
	//get mapping with parameter for bloodbank list as per location
	@GetMapping("/getDonorByBloodGroup/{donorBloodGroup}")
	public List<Donor> getDonorByBloodGroup(@PathVariable("donorBloodGroup") String donorBloodGroup){
		return ds.fetchDonorByBloodGroup(donorBloodGroup);
	}
}
