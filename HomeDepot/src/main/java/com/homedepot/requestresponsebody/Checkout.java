package com.homedepot.requestresponsebody;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class Checkout {
	
	@NotEmpty
	String toolCode;
	
	@Size(min = 2, max = 100, message = "The rental day count must be between 2 and 100 characters.")
	Integer rentalDayCount;
	
	@Size(min = 0, max = 100, message = "The discount must be between 0 and 100 characters.")
	Double discountPercentage;
	
	@NotEmpty
	@Pattern(regexp = "([0-2][0-9]|3[0-1])\\/(0[1-9]|1[0-2])\\/[0-9]{4}")
	String checkoutDate;

	public Checkout() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getToolCode() {
		return toolCode;
	}

	public void setToolCode(String toolCode) {
		this.toolCode = toolCode;
	}

	public Integer getRentalDayCount() {
		return rentalDayCount;
	}

	public void setRentalDayCount(Integer rentalDayCount) {
		this.rentalDayCount = rentalDayCount;
	}

	public Double getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(Double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}

	public String getCheckoutDate() {
		return checkoutDate;
	}

	public void setCheckoutDate(String checkoutDate) {
		this.checkoutDate = checkoutDate;
	}

	@Override
	public String toString() {
		return "Checkout [toolCode=" + toolCode + ", rentalDayCount=" + rentalDayCount + ", discountPercentage="
				+ discountPercentage + ", checkoutDate=" + checkoutDate + "]";
	}
	
	

}
