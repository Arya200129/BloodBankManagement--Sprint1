package com.bloodbank.sbbm.service;

import java.util.List;

import com.bloodbank.sbbm.entity.BloodBankList;

public interface BloodBankListService {

	//fetch all blood bank list details from table
	List<BloodBankList> fetchBloodBankListDetails();
	
	//fetch all blood bank list from table as per location
	List<BloodBankList> fetchBloodBankListDetails1(String bloodBankLocation);
}
