package com.bloodbank.sbbm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bloodbank.sbbm.entity.BloodBankList;
import com.bloodbank.sbbm.service.BloodBankListService;

//Controller for all incoming requests on bloodBankList entity
@RestController
public class BloodBankListController {

	@Autowired
	BloodBankListService bbs;
	
	//get mapping to fetch all bloodbanks list
	@GetMapping("/getBloodBanks")
	public List<BloodBankList> getBloodBanks(){
		return bbs.fetchBloodBankListDetails();
	}
	
	//get mapping with parameter for bloodbank list as per location
	@GetMapping("/getBloodBankByLocation/{bloodBankLocation}")
	public List<BloodBankList> getBloodBankByLocation(@PathVariable("bloodBankLocation") String bloodBankLocation){
		return bbs.fetchBloodBankListDetails1(bloodBankLocation);
	}
}
