package com.homedepot.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.homedepot.model.Tool;
import com.homedepot.repository.ToolRepository;
import com.homedepot.requestresponsebody.Checkout;
import com.homedepot.requestresponsebody.RentalAgreement;
import com.homedepot.utils.RentalAgreementUtils;

public class DashboardService {
	
	@Autowired
	ToolRepository toolRepository;
	
	public RentalAgreement generateRentalAgreement(Checkout checkoutInfo) {
		RentalAgreement rentalAgreement = new RentalAgreement();
		Tool tool = toolRepository.findByToolCode(checkoutInfo.getToolCode());
		
		RentalAgreementUtils.updateFieldsFromRequestAndEntityObjects(checkoutInfo, tool, rentalAgreement);
		RentalAgreementUtils.updateDaysInfo(checkoutInfo, tool, rentalAgreement);

		return rentalAgreement;
		
	}
	

}
