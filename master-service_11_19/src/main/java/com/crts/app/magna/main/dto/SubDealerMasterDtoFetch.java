package com.crts.app.magna.main.dto;

public class SubDealerMasterDtoFetch {

	private int subDealerId;
	private DealerMasterDtoFetch dealerId;
	private String subDealerName;
	private String subdealerContactNo;
	private String subDealerAddress;
	private BranchMasterDtoFetch subDealerBranchId;
	private String subDealerAccountNo;
	private String subDealerEmailId;
	private int subDealerStatus;
	private String subDealerIFSCCode;
	private String subDealerAccountType;
	private String subDealerBankName;

	public int getSubDealerId() {
		return subDealerId;
	}

	public void setSubDealerId(int subDealerId) {
		this.subDealerId = subDealerId;
	}

	public int getDealerId() {
		return dealerId.getDealerId();
	}

	public void setDealerId(DealerMasterDtoFetch dealerId) {
		this.dealerId = dealerId;
	}

	public String getSubDealerName() {
		return subDealerName;
	}

	public void setSubDealerName(String subDealerName) {
		this.subDealerName = subDealerName;
	}

	public String getSubdealerContactNo() {
		return subdealerContactNo;
	}

	public void setSubdealerContactNo(String subdealerContactNo) {
		this.subdealerContactNo = subdealerContactNo;
	}

	public String getSubDealerAddress() {
		return subDealerAddress;
	}

	public void setSubDealerAddress(String subDealerAddress) {
		this.subDealerAddress = subDealerAddress;
	}

	public int getSubDealerBranchId() {
		return subDealerBranchId.getBranchId();
	}

	public void setSubDealerBranchId(BranchMasterDtoFetch subDealerBranchId) {
		this.subDealerBranchId = subDealerBranchId;
	}

	public String getSubDealerAccountNo() {
		return subDealerAccountNo;
	}

	public void setSubDealerAccountNo(String subDealerAccountNo) {
		this.subDealerAccountNo = subDealerAccountNo;
	}

	public String getSubDealerEmailId() {
		return subDealerEmailId;
	}

	public void setSubDealerEmailId(String subDealerEmailId) {
		this.subDealerEmailId = subDealerEmailId;
	}

	public int getSubDealerStatus() {
		return subDealerStatus;
	}

	public void setSubDealerStatus(int subDealerStatus) {
		this.subDealerStatus = subDealerStatus;
	}

	public String getSubDealerIFSCCode() {
		return subDealerIFSCCode;
	}

	public void setSubDealerIFSCCode(String subDealerIFSCCode) {
		this.subDealerIFSCCode = subDealerIFSCCode;
	}

	public String getSubDealerAccountType() {
		return subDealerAccountType;
	}

	public void setSubDealerAccountType(String subDealerAccountType) {
		this.subDealerAccountType = subDealerAccountType;
	}

	public String getSubDealerBankName() {
		return subDealerBankName;
	}

	public void setSubDealerBankName(String subDealerBankName) {
		this.subDealerBankName = subDealerBankName;
	}

	public SubDealerMasterDtoFetch() {

	}
}