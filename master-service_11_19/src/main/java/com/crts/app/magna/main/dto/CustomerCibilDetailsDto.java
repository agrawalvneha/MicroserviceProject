package com.crts.app.magna.main.dto;

public class CustomerCibilDetailsDto {

	private int custId;
	private String primaryIdStatus;
	private String secondaryIdStatus;
	private String cibilStatus;
	private String cibilReport;
	private String cibilGeneratedDate;

	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getPrimaryIdStatus() {
		return primaryIdStatus;
	}
	public void setPrimaryIdStatus(String primaryIdStatus) {
		this.primaryIdStatus = primaryIdStatus;
	}
	public String getSecondaryIdStatus() {
		return secondaryIdStatus;
	}
	public void setSecondaryIdStatus(String secondaryIdStatus) {
		this.secondaryIdStatus = secondaryIdStatus;
	}
	public String getCibilStatus() {
		return cibilStatus;
	}
	public void setCibilStatus(String cibilStatus) {
		this.cibilStatus = cibilStatus;
	}
	public String getCibilReport() {
		return cibilReport;
	}
	public void setCibilReport(String cibilReport) {
		this.cibilReport = cibilReport;
	}
	public String getCibilGeneratedDate() {
		return cibilGeneratedDate;
	}
	public void setCibilGeneratedDate(String cibilGeneratedDate) {
		this.cibilGeneratedDate = cibilGeneratedDate;
	}
}