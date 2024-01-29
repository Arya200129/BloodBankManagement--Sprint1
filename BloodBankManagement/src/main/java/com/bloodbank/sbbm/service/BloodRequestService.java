package com.bloodbank.sbbm.service;

import com.bloodbank.sbbm.entity.BloodRequest;

public interface BloodRequestService {

	//add an new BloodRequest in db table
	BloodRequest addBloodRequest(BloodRequest bloodRequest);
	
	//add an new BloodRequest of existing user
	public void addNewRequest(BloodRequest bloodRequest, int bloodUserId);
	
	//remove existing BloodRequest record based on id from db table
	void removeBloodRequest(int requestId);
	
	//fetch BloodRequest details based on from db table
	BloodRequest fetchBloodRequestDetail(int requestId);

}
