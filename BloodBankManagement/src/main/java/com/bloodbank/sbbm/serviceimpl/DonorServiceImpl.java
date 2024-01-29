package com.bloodbank.sbbm.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bloodbank.sbbm.entity.Donor;
import com.bloodbank.sbbm.repository.DonorRepository;
import com.bloodbank.sbbm.service.DonorService;

@Service
public class DonorServiceImpl implements DonorService{

	@Autowired
	DonorRepository drepo;
	
	@Override
	public List<Donor> fetchDonorListDetails() {
		return drepo.findAll();
	}

	@Override
	public List<Donor> fetchDonorByBloodGroup(String donorBloodGroup) {
		return drepo.findByBloodGroup(donorBloodGroup);
	}

}
