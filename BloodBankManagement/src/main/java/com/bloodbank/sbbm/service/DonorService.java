package com.bloodbank.sbbm.service;

import java.util.List;

import com.bloodbank.sbbm.entity.Donor;

//abstract method for performing insert, update, select on entity Donor 
public interface DonorService {
	
	//fetch all blood bank list details from table
	List<Donor> fetchDonorListDetails();
	
	//fetch all blood bank list from table as per location
	List<Donor> fetchDonorByBloodGroup(String donorBloodGroup);
}
