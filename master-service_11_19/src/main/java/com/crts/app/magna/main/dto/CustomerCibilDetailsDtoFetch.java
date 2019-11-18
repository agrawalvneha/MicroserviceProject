package com.crts.app.magna.main.dto;

public class CustomerCibilDetailsDtoFetch {

	private int custCibilDetailsId;
	private EnquiryDetailsDtoFetch custId;
	private String primaryIdStatus;
	private String secondaryIdStatus;
	private String cibilStatus;
	private String cibilReport;
	private String cibilGeneratedDate;

	public CustomerCibilDetailsDtoFetch() {

	}

	public int getCustCibilDetailsId() {
		return custCibilDetailsId;
	}

	public int getCustId() {
		return custId.getCustId();
	}

	public String getPrimaryIdStatus() {
		return primaryIdStatus;
	}

	public String getSecondaryIdStatus() {
		return secondaryIdStatus;
	}

	public String getCibilStatus() {
		return cibilStatus;
	}

	public String getCibilReport() {
		return cibilReport;
	}

	public String getCibilGeneratedDate() {
		return cibilGeneratedDate;
	}

	public void setCustCibilDetailsId(int custCibilDetailsId) {
		this.custCibilDetailsId = custCibilDetailsId;
	}

	public void setCustId(EnquiryDetailsDtoFetch custId) {
		this.custId = custId;
	}

	public void setPrimaryIdStatus(String primaryIdStatus) {
		this.primaryIdStatus = primaryIdStatus;
	}

	public void setSecondaryIdStatus(String secondaryIdStatus) {
		this.secondaryIdStatus = secondaryIdStatus;
	}

	public void setCibilStatus(String cibilStatus) {
		this.cibilStatus = cibilStatus;
	}

	public void setCibilReport(String cibilReport) {
		this.cibilReport = cibilReport;
	}

	public void setCibilGeneratedDate(String cibilGeneratedDate) {
		this.cibilGeneratedDate = cibilGeneratedDate;
	}
}