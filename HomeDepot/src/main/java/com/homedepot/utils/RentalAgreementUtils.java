package com.homedepot.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

import com.homedepot.model.Tool;
import com.homedepot.requestresponsebody.Checkout;
import com.homedepot.requestresponsebody.RentalAgreement;

public class RentalAgreementUtils {
	
	public static void updateFieldsFromRequestAndEntityObjects(Checkout checkoutInfo, Tool toolInfo, RentalAgreement rentalAgreementObj) {
		rentalAgreementObj.setToolCode(checkoutInfo.getToolCode());
		rentalAgreementObj.setBrandName(toolInfo.getBrand().getBrandName());
		rentalAgreementObj.setToolType(toolInfo.getToolType().getToolTypeName());
		
		rentalAgreementObj.setCheckOutDate(checkoutInfo.getCheckoutDate());
		rentalAgreementObj.setDailyRentalCharge(toolInfo.getToolType().getDailyCharge());
		rentalAgreementObj.setDiscountPercent(checkoutInfo.getDiscountPercentage());
	}
	
	public static void updateDaysInfo(Checkout checkoutInfo, Tool toolInfo, RentalAgreement rentalAgreementObj) {
		LocalDate startDate = LocalDate.parse(checkoutInfo.getCheckoutDate(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		LocalDate endDate = startDate.plusDays(checkoutInfo.getRentalDayCount());
		
		LocalDate nextWeekStartDate = startDate.plusDays(7-startDate.getDayOfWeek().getValue());
		LocalDate prevWeekEndDateForCheckOut = endDate.minusDays(endDate.getDayOfWeek().getValue());
		
		int noOfWeek = prevWeekEndDateForCheckOut.get(ChronoField.ALIGNED_WEEK_OF_YEAR)-nextWeekStartDate.get(ChronoField.ALIGNED_WEEK_OF_YEAR);
		
		int noOfWeekDays = noOfWeek*5 + getNoOfWeekDaysremainingInCurrentWeek(startDate) + getNoOfWeekDaysInCurrentWeek(endDate);
		int noofWeekendDays = noOfWeek*2 + getNoOfWeekEndDaysremainingInCurrentWeek(startDate) + getNoOfWeekEndDaysInCurrentWeek(endDate);
		
		int noOfChargeableDays=0;
		
		if(toolInfo.getToolType().getHasWeekdayCharge()) {
			noOfChargeableDays+= noOfWeekDays;
		}
		if(toolInfo.getToolType().getHasWeekEndCharge()) {
			noOfChargeableDays+=noofWeekendDays;
		}
		
		rentalAgreementObj.setChargeableDays(noOfChargeableDays);
		rentalAgreementObj.setPreDiscountCharge(noOfChargeableDays*rentalAgreementObj.getDailyRentalCharge());
		rentalAgreementObj.setDiscountAmount(rentalAgreementObj.getPreDiscountCharge()*rentalAgreementObj.getDiscountPercent()/100);
		rentalAgreementObj.setFinalCharge(rentalAgreementObj.getPreDiscountCharge()-rentalAgreementObj.getDiscountAmount());
	}
	
	private static int getNoOfWeekDaysremainingInCurrentWeek(LocalDate date) {
		return 5-getNoOfWeekDaysInCurrentWeek(date);
	}
	
	private static int getNoOfWeekDaysInCurrentWeek(LocalDate date) {
		if(date.getDayOfWeek().getValue()==7) {
			return 5;
		}else 
			return date.getDayOfWeek().getValue()-1;
		
	}
	
	private static int getNoOfWeekEndDaysremainingInCurrentWeek(LocalDate date) {
		return 2-getNoOfWeekEndDaysInCurrentWeek(date);
	}
	
	private static int getNoOfWeekEndDaysInCurrentWeek(LocalDate date) {
		if(date.getDayOfWeek().getValue()==7) {
			return 2;
		}else 
			return 1;
		
	}
	

}
