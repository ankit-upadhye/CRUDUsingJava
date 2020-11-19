package com.ankit.entity;

public class LicenseType {

	private int licenseId;
	private String type;
	
	public LicenseType() {}
	
	public LicenseType(int licenseId, String type) {
		super();
		this.licenseId = licenseId;
		this.type = type;
	}

	public int getLicenseId() {
		return licenseId;
	}


	public String getType() {
		return type;
	}

	@Override
	public String toString() {
		return "LicenseType [licenseId=" + licenseId + ", type=" + type + "]";
	}

	
	
	
	
}
