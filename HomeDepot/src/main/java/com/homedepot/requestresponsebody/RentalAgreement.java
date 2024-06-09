package com.homedepot.requestresponsebody;

public class RentalAgreement {
	
	String toolCode;
	
	String toolType;
	
	String brandName;
	
	Integer rentalDays;
	
	String checkOutDate;
	
	String dueDate;
	
	Double dailyRentalCharge;
	
	Integer chargeableDays;
	
	Double preDiscountCharge;
	
	Double discountPercent;
	
	Double discountAmount;
	
	Double finalCharge;

	public RentalAgreement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getToolCode() {
		return toolCode;
	}

	public void setToolCode(String toolCode) {
		this.toolCode = toolCode;
	}

	public String getToolType() {
		return toolType;
	}

	public void setToolType(String toolType) {
		this.toolType = toolType;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public Integer getRentalDays() {
		return rentalDays;
	}

	public void setRentalDays(Integer rentalDays) {
		this.rentalDays = rentalDays;
	}

	public String getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(String checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public Double getDailyRentalCharge() {
		return dailyRentalCharge;
	}

	public void setDailyRentalCharge(Double dailyRentalCharge) {
		this.dailyRentalCharge = dailyRentalCharge;
	}

	public Integer getChargeableDays() {
		return chargeableDays;
	}

	public void setChargeableDays(Integer chargeableDays) {
		this.chargeableDays = chargeableDays;
	}

	public Double getPreDiscountCharge() {
		return preDiscountCharge;
	}

	public void setPreDiscountCharge(Double preDiscountCharge) {
		this.preDiscountCharge = preDiscountCharge;
	}

	public Double getDiscountPercent() {
		return discountPercent;
	}

	public void setDiscountPercent(Double discountPercent) {
		this.discountPercent = discountPercent;
	}

	public Double getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(Double discountAmount) {
		this.discountAmount = discountAmount;
	}

	public Double getFinalCharge() {
		return finalCharge;
	}

	public void setFinalCharge(Double finalCharge) {
		this.finalCharge = finalCharge;
	}

	@Override
	public String toString() {
		return "RentalAgreement [toolCode=" + toolCode + ", toolType=" + toolType + ", brandName=" + brandName
				+ ", rentalDays=" + rentalDays + ", checkOutDate=" + checkOutDate + ", dueDate=" + dueDate
				+ ", dailyRentalCharge=" + dailyRentalCharge + ", chargeableDays=" + chargeableDays
				+ ", preDiscountCharge=" + preDiscountCharge + ", discountCharge=" + discountPercent
				+ ", discountAmount=" + discountAmount + ", finalCharge=" + finalCharge + "]";
	}
	
	


}
