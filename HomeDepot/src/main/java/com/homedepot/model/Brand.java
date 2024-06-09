package com.homedepot.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class Brand {
	
	@Id
	@GeneratedValue
	@Column(name="brand_id")
	Integer brandId;
	
	@Column(name="brand_name")
	String brandName;

	public Brand() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Brand(Integer brandId, String brandName) {
		super();
		this.brandId = brandId;
		this.brandName = brandName;
	}

	public Integer getBrandId() {
		return brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	@Override
	public String toString() {
		return "Brand [brandId=" + brandId + ", brandName=" + brandName + "]";
	}

}
