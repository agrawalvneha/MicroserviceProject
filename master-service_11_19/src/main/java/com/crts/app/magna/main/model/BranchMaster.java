package com.crts.app.magna.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "mf_m_branch")
public class BranchMaster {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "b_id")
	private int branchId;
	
	@Column(name = "b_name")
	private String branchName;
	
	@Column(name = "b_code")
	private String branchCode;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "st_id")
	private StateMaster branchStateId;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "dt_id")
	private DistrictMaster branchDistrictId;

	@Column(name = "b_status")
	private int branchStatus;
	
	@Column(name = "b_manager_name")
	private String branchManagerName;
	
	@Column(name = "b_address")
	private String branchAddress;
	
	@Column(name = "b_contact_number")
	private String branchContactNumber;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "bt_id")
	private BranchTypeMaster branchTypeId;

	public StateMaster getBranchStateId() {
		return branchStateId;
	}

	public void setBranchStateId(StateMaster branchStateId) {
		this.branchStateId = branchStateId;
	}

	public DistrictMaster getBranchDistrictId() {
		return branchDistrictId;
	}

	public void setBranchDistrictId(DistrictMaster branchDistrictId) {
		this.branchDistrictId = branchDistrictId;
	}

	public BranchTypeMaster getBranchTypeId() {
		return branchTypeId;
	}

	public void setBranchTypeId(BranchTypeMaster branchTypeId) {
		this.branchTypeId = branchTypeId;
	}

	@Column(name = "b_creationDate")
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

	public String getBranchCreationDate() {
		return branchCreationDate;
	}

	public void setBranchCreationDate(String branchCreationDate) {
		this.branchCreationDate = branchCreationDate;
	}

}
