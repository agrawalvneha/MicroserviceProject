package com.crts.app.magna.main.dto;

public class EnquiryDetailsDtoFetch {

	private int enquiryId;
	private int custId;
	private String custFirstName;
	private String custMiddleName;
	private String custLastName;
	private String custContactNo;
	private String custEmailId;
	private String custAddress;
	private String custLoanAmount;
	private String custPrimaryId;
	private String custPrimaryValue;
	private String custSecondaryId;
	private String custSecondaryValue;
	private String custGender;
	private String custDOB;
	private BranchMasterDtoFetch branchId;
	private UserMasterDtoFetch relationalExecutiveId;
	private String enquiryCreationDate;
	private String enquiryCreationTime;
	private UserMasterDtoFetch enquiryCreatedBy;
	private LoanTypeDtoFetch loanTypeId;
	
	public EnquiryDetailsDtoFetch() {
		
	}

	public int getEnquiryId() {
		return enquiryId;
	}

	public void setEnquiryId(int enquiryId) {
		this.enquiryId = enquiryId;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustFirstName() {
		return custFirstName;
	}

	public void setCustFirstName(String custFirstName) {
		this.custFirstName = custFirstName;
	}

	public String getCustMiddleName() {
		return custMiddleName;
	}

	public void setCustMiddleName(String custMiddleName) {
		this.custMiddleName = custMiddleName;
	}

	public String getCustLastName() {
		return custLastName;
	}

	public void setCustLastName(String custLastName) {
		this.custLastName = custLastName;
	}

	public String getCustContactNo() {
		return custContactNo;
	}

	public void setCustContactNo(String custContactNo) {
		this.custContactNo = custContactNo;
	}

	public String getCustEmailId() {
		return custEmailId;
	}

	public void setCustEmailId(String custEmailId) {
		this.custEmailId = custEmailId;
	}

	public String getCustAddress() {
		return custAddress;
	}

	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}

	public String getCustLoanAmount() {
		return custLoanAmount;
	}

	public void setCustLoanAmount(String custLoanAmount) {
		this.custLoanAmount = custLoanAmount;
	}

	public String getCustPrimaryId() {
		return custPrimaryId;
	}

	public void setCustPrimaryId(String custPrimaryId) {
		this.custPrimaryId = custPrimaryId;
	}

	public String getCustPrimaryValue() {
		return custPrimaryValue;
	}

	public void setCustPrimaryValue(String custPrimaryValue) {
		this.custPrimaryValue = custPrimaryValue;
	}

	public String getCustSecondaryId() {
		return custSecondaryId;
	}

	public void setCustSecondaryId(String custSecondaryId) {
		this.custSecondaryId = custSecondaryId;
	}

	public String getCustSecondaryValue() {
		return custSecondaryValue;
	}

	public void setCustSecondaryValue(String custSecondaryValue) {
		this.custSecondaryValue = custSecondaryValue;
	}

	public String getCustGender() {
		return custGender;
	}

	public void setCustGender(String custGender) {
		this.custGender = custGender;
	}

	public String getCustDOB() {
		return custDOB;
	}

	public void setCustDOB(String custDOB) {
		this.custDOB = custDOB;
	}

	public int getBranchId() {
		return branchId.getBranchId();
	}

	public void setBranchId(BranchMasterDtoFetch branchId) {
		this.branchId = branchId;
	}

	public int getRelationalExecutiveId() {
		return relationalExecutiveId.getUserId();
	}

	public void setRelationalExecutiveId(UserMasterDtoFetch relationalExecutiveId) {
		this.relationalExecutiveId = relationalExecutiveId;
	}

	public String getEnquiryCreationDate() {
		return enquiryCreationDate;
	}

	public void setEnquiryCreationDate(String enquiryCreationDate) {
		this.enquiryCreationDate = enquiryCreationDate;
	}

	public String getEnquiryCreationTime() {
		return enquiryCreationTime;
	}

	public void setEnquiryCreationTime(String enquiryCreationTime) {
		this.enquiryCreationTime = enquiryCreationTime;
	}

	public String getEnquiryCreatedBy() {
		return enquiryCreatedBy.getUsername();
	}

	public void setEnquiryCreatedBy(UserMasterDtoFetch enquiryCreatedBy) {
		this.enquiryCreatedBy = enquiryCreatedBy;
	}

	public int getLoanTypeId() {
		return loanTypeId.getLoanTypeId();
	}

	public void setLoanTypeId(LoanTypeDtoFetch loanTypeId) {
		this.loanTypeId = loanTypeId;
	}
}