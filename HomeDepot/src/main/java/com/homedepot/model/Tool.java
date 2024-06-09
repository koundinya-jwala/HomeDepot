package com.homedepot.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Tool {
	
	@Id
	@GeneratedValue
	@Column(name="tool_id")
	Integer toolId;
	
	@Column(name="tool_code", unique=true)
	String toolCode;
	
	@ManyToOne
	@JoinColumn(name="brand_id")
	Brand brand;
	
	@ManyToOne
	@JoinColumn(name="tool_type_id")
	ToolType toolType;

	public Tool() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tool(Integer toolId, String toolCode, Brand brand, ToolType toolType) {
		super();
		this.toolId = toolId;
		this.toolCode = toolCode;
		this.brand = brand;
		this.toolType = toolType;
	}

	public Integer getToolId() {
		return toolId;
	}

	public void setToolId(Integer toolId) {
		this.toolId = toolId;
	}

	public String getToolCode() {
		return toolCode;
	}

	public void setToolCode(String toolCode) {
		this.toolCode = toolCode;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public ToolType getToolType() {
		return toolType;
	}

	public void setToolType(ToolType toolType) {
		this.toolType = toolType;
	}

	@Override
	public String toString() {
		return "Tool [toolId=" + toolId + ", toolCode=" + toolCode + ", brand=" + brand + ", toolType=" + toolType
				+ "]";
	}
	

}
