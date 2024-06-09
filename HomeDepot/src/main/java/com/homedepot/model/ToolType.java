package com.homedepot.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class ToolType {
	
	@Id
	@GeneratedValue
	@Column(name="tool_type_id")
	Integer toolTypeId;
	
	@Column(name="tool_type_name")
	String toolTypeName;
	
	@Column(name="daily_charge")
	Double dailyCharge;
	
	@Column(name="weekday_charge")
	Boolean hasWeekdayCharge;
	
	@Column(name="weekend_charge")
	Boolean hasWeekEndCharge;
	
	@Column(name="holiday_charge")
	Boolean hasHolidayCharge;

	public ToolType() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ToolType(Integer toolTypeId, String toolTypeName, Double dailyCharge, Boolean hasWeekdayCharge,
			Boolean hasWeekEndCharge, Boolean hasHolidayCharge) {
		super();
		this.toolTypeId = toolTypeId;
		this.toolTypeName = toolTypeName;
		this.dailyCharge = dailyCharge;
		this.hasWeekdayCharge = hasWeekdayCharge;
		this.hasWeekEndCharge = hasWeekEndCharge;
		this.hasHolidayCharge = hasHolidayCharge;
	}

	public Integer getToolTypeId() {
		return toolTypeId;
	}

	public void setToolTypeId(Integer toolTypeId) {
		this.toolTypeId = toolTypeId;
	}

	public String getToolTypeName() {
		return toolTypeName;
	}

	public void setToolTypeName(String toolTypeName) {
		this.toolTypeName = toolTypeName;
	}

	public Double getDailyCharge() {
		return dailyCharge;
	}

	public void setDailyCharge(Double dailyCharge) {
		this.dailyCharge = dailyCharge;
	}

	public Boolean getHasWeekdayCharge() {
		return hasWeekdayCharge;
	}

	public void setHasWeekdayCharge(Boolean hasWeekdayCharge) {
		this.hasWeekdayCharge = hasWeekdayCharge;
	}

	public Boolean getHasWeekEndCharge() {
		return hasWeekEndCharge;
	}

	public void setHasWeekEndCharge(Boolean hasWeekEndCharge) {
		this.hasWeekEndCharge = hasWeekEndCharge;
	}

	public Boolean getHasHolidayCharge() {
		return hasHolidayCharge;
	}

	public void setHasHolidayCharge(Boolean hasHolidayCharge) {
		this.hasHolidayCharge = hasHolidayCharge;
	}

	@Override
	public String toString() {
		return "ToolType [toolTypeId=" + toolTypeId + ", toolTypeName=" + toolTypeName + ", dailyCharge=" + dailyCharge
				+ ", hasWeekdayCharge=" + hasWeekdayCharge + ", hasWeekEndCharge=" + hasWeekEndCharge
				+ ", hasHolidayCharge=" + hasHolidayCharge + "]";
	}
	
	
	

}
