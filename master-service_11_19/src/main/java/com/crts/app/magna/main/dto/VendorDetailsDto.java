package com.crts.app.magna.main.dto;

public class VendorDetailsDto
{
	private String vendorName;
	private String vendorContactNo;
	private String vendorDiscription;
	private String vendorEmail;
	private DealerMasterDto dealerId;
	
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public String getVendorContactNo() {
		return vendorContactNo;
	}
	public void setVendorContactNo(String vendorContactNo) {
		this.vendorContactNo = vendorContactNo;
	}
	public String getVendorDiscription() {
		return vendorDiscription;
	}
	public void setVendorDiscription(String vendorDiscription) {
		this.vendorDiscription = vendorDiscription;
	}
	public String getVendorEmail() {
		return vendorEmail;
	}
	public void setVendorEmail(String vendorEmail) {
		this.vendorEmail = vendorEmail;
	}
	public DealerMasterDto getDealerId() {
		return dealerId;
	}
	public void setDealerId(DealerMasterDto dealerId) {
		this.dealerId = dealerId;
	}
}