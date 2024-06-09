package com.homedepot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.homedepot.model.Tool;
import com.homedepot.repository.ToolRepository;
import com.homedepot.requestresponsebody.Checkout;
import com.homedepot.requestresponsebody.RentalAgreement;
import com.homedepot.service.DashboardService;


@RestController
public class DashboardController {

	@Autowired
	private ToolRepository toolRepository;
	
	@Autowired
	private DashboardService dashboardService;

	@GetMapping("/toolsAvailable")
	public List<Tool> retrieveAllStudents() {
		return toolRepository.findAll();
	}
	
	@PostMapping("/generateRentalAgreement")
	public RentalAgreement generateRentalAgreement(@RequestBody Checkout checkoutInfo) {
		
		return dashboardService.generateRentalAgreement(checkoutInfo);
	}

}
