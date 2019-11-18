package com.crts.app.magna.main.dto;

public class VenderDetailsDtoFetch {

	private int vendorId;
	private String vendorName;
	private String vendorContactNo;
	private String vendorDiscription;
	private String vendorEmail;
	private DealerMasterDtoFetch dealerId;

	public int getVendorId() {
		return vendorId;
	}

	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}

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

	public int getDealerId() {
		return dealerId.getDealerId();
	}

	public void setDealerId(DealerMasterDtoFetch dealerId) {
		this.dealerId = dealerId;
	}

	public VenderDetailsDtoFetch() {

	}
}