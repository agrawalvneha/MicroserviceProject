package com.crts.app.magna.main.dto;

public class EnquiryStatusTraceDtoFetch {

	private int enquiryStatusId;
	private EnquiryDetailsDtoFetch enquiryId;
	private EnquiryDetailsDtoFetch custId;
	private StatusMasterDtoFetch enquiryStatus;

	public EnquiryStatusTraceDtoFetch() {

	}

	public int getEnquiryStatusId() {
		return enquiryStatusId;
	}

	public void setEnquiryStatusId(int enquiryStatusId) {
		this.enquiryStatusId = enquiryStatusId;
	}

	public int getEnquiryId() {
		return enquiryId.getEnquiryId();
	}

	public void setEnquiryId(EnquiryDetailsDtoFetch enquiryId) {
		this.enquiryId = enquiryId;
	}

	public int getCustId() {
		return custId.getCustId();
	}

	public void setCustId(EnquiryDetailsDtoFetch custId) {
		this.custId = custId;
	}

	public int getEnquiryStatus() {
		return enquiryStatus.getStatusId();
	}

	public void setEnquiryStatus(StatusMasterDtoFetch enquiryStatus) {
		this.enquiryStatus = enquiryStatus;
	}
}