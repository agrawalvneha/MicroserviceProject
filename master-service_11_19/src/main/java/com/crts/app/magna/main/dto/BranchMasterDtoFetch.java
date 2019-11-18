package com.crts.app.magna.main.dto;

public class BranchMasterDtoFetch {

	private int branchId;
	private String branchName;
	private String branchCode;
	private StateMasterDtoFetch branchStateId;
	private DistrictMasterDtoFetch branchDistrictId;
	private int branchStatus;
	private String branchManagerName;
	private String branchAddress;
	private String branchContactNumber;
	private BranchTypeMasterDtoFetch branchTypeId;
	private String branchCreationDate;

	public int getBranchId() {
		return branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public int getBranchStateId() {
		return branchStateId.getStateId();
	}

	public void setBranchStateId(StateMasterDtoFetch branchStateId) {
		this.branchStateId = branchStateId;
	}

	public int getBranchDistrictId() {
		return branchDistrictId.getDistrictId();
	}

	public void setBranchDistrictId(DistrictMasterDtoFetch branchDistrictId) {
		this.branchDistrictId = branchDistrictId;
	}

	public int getBranchStatus() {
		return branchStatus;
	}

	public void setBranchStatus(int branchStatus) {
		this.branchStatus = branchStatus;
	}

	public String getBranchManagerName() {
		return branchManagerName;
	}

	public void setBranchManagerName(String branchManagerName) {
		this.branchManagerName = branchManagerName;
	}

	public String getBranchAddress() {
		return branchAddress;
	}

	public void setBranchAddress(String branchAddress) {
		this.branchAddress = branchAddress;
	}

	public String getBranchContactNumber() {
		return branchContactNumber;
	}

	public void setBranchContactNumber(String branchContactNumber) {
		this.branchContactNumber = branchContactNumber;
	}

	public int getBranchTypeId() {
		return branchTypeId.getBranchTypeId();
	}

	public void setBranchTypeId(BranchTypeMasterDtoFetch branchTypeId) {
		this.branchTypeId = branchTypeId;
	}

	public String getBranchCreationDate() {
		return branchCreationDate;
	}

	public void setBranchCreationDate(String branchCreationDate) {
		this.branchCreationDate = branchCreationDate;
	}

	public BranchMasterDtoFetch() {

	}

}
