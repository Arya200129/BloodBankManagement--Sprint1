package com.bloodbank.sbbm.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bloodbank.sbbm.entity.BloodBankList;
import com.bloodbank.sbbm.repository.BloodBankListRepository;
import com.bloodbank.sbbm.service.BloodBankListService;

@Service
public class BloodBankListServiceImpl implements BloodBankListService{

	@Autowired
	BloodBankListRepository bbrepo;
	
	//using findAll() method of JpaRepository to fetch all list of bloodbank  
	@Override
	public List<BloodBankList> fetchBloodBankListDetails() {
		return bbrepo.findAll();
	}

	//using findByLocation() method of JpaRepository to fetch list as per location
	@Override
	public List<BloodBankList> fetchBloodBankListDetails1(String bloodBankLocation) {
		return bbrepo.findByLocation(bloodBankLocation);
	}

}