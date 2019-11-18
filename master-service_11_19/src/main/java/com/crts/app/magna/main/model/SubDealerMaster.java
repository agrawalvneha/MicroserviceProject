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
@Table(name = "mf_m_subdealer")
public class SubDealerMaster {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sd_id")
	private int subDealerId;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "d_id")
	private DealerMaster dealerId;

	@Column(name = "sd_name")
	private String subDealerName;

	@Column(name = "sd_contactno")
	private String subDealerContactNo;

	@Column(name = "sd_address")
	private String subDealerAddress;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "sd_branchid")
	private BranchMaster subDealerBranchId;
	
	@Column(name = "sd_accountno")
	private String subDealerAccountNo;

	@Column(name = "sd_emailid")
	private String subDealerEmailId;

	@Column(name = "sd_status")
	private int subDealerStatus;

	@Column(name = "sd_ifsccode")
	private String subDealerIFSCCode;

	@Column(name = "sd_accounttype")
	private String subDealerAccountType;

	@Column(name = "sd_bankname")
	private String subDealerBankName;

	public BranchMaster getSubDealerBranchId() {
		return subDealerBranchId;
	}

	public void setSubDealerBranchId(BranchMaster subDealerBranchId) {
		this.subDealerBranchId = subDealerBranchId;
	}

	public DealerMaster getDealerId() {
		return dealerId;
	}

	public void setDealerId(DealerMaster dealerId) {
		this.dealerId = dealerId;
	}

	public int getSubDealerId() {
		return subDealerId;
	}

	public void setSubDealerId(int subDealerId) {
		this.subDealerId = subDealerId;
	}

	public String getSubDealerName() {
		return subDealerName;
	}

	public void setSubDealerName(String subDealerName) {
		this.subDealerName = subDealerName;
	}

	public String getSubDealerContactNo() {
		return subDealerContactNo;
	}

	public void setSubDealerContactNo(String subDealerContactNo) {
		this.subDealerContactNo = subDealerContactNo;
	}

	public String getSubDealerAddress() {
		return subDealerAddress;
	}

	public void setSubDealerAddress(String subDealerAddress) {
		this.subDealerAddress = subDealerAddress;
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
}