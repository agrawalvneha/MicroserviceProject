package com.crts.app.magna.main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "mf_m_dealer")
public class DealerMaster 
{
	@Id
	@Column(name = "d_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int dealerId;
	
	@Column(name = "d_name")
	private String dealerName;
	
	@Column(name = "d_contactno")
	private String dealerContactNo;
	
	@Column(name = "d_address")
	private String dealerAddress;
	
	@OneToOne
	@JoinColumn(name = "b_id")   // has a relation one to one foreign key from branch
	private BranchMaster dealerBranchId;

	@Column(name = "d_accountno")
	private String dealerAccountNo;
	
	@Column(name = "d_emailid")
	private String dealerEmailId;
	
	@Column(name = "d_status")
	private int dealerStatus;

	@Column(name = "d_ifsccode")
	private String dealerIFSCCode;
	
	@Column(name = "d_accounttype")
	private String dealerAccountType;
	
	@Column(name = "d_bankname")
	private String dealerBankName;

	public int getDealerId() {
		return dealerId;
	}

	public void setDealerId(int dealerId) {
		this.dealerId = dealerId;
	}

	public String getDealerName() {
		return dealerName;
	}

	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}

	public String getDealerContactNo() {
		return dealerContactNo;
	}

	public void setDealerContactNo(String dealerContactNo) {
		this.dealerContactNo = dealerContactNo;
	}

	public String getDealerAddress() {
		return dealerAddress;
	}

	public void setDealerAddress(String dealerAddress) {
		this.dealerAddress = dealerAddress;
	}


	public BranchMaster getDealerBranchId() {
		return dealerBranchId;
	}

	public void setDealerBranchId(BranchMaster dealerBranchId) {
		this.dealerBranchId = dealerBranchId;
	}

	public String getDealerAccountNo() {
		return dealerAccountNo;
	}

	public void setDealerAccountNo(String dealerAccountNo) {
		this.dealerAccountNo = dealerAccountNo;
	}

	public String getDealerEmailId() {
		return dealerEmailId;
	}

	public void setDealerEmailId(String dealerEmailId) {
		this.dealerEmailId = dealerEmailId;
	}

	public int getDealerStatus() {
		return dealerStatus;
	}

	public void setDealerStatus(int dealerStatus) {
		this.dealerStatus = dealerStatus;
	}

	public String getDealerIFSCCode() {
		return dealerIFSCCode;
	}

	public void setDealerIFSCCode(String dealerIFSCCode) {
		this.dealerIFSCCode = dealerIFSCCode;
	}

	public String getDealerAccountType() {
		return dealerAccountType;
	}

	public void setDealerAccountType(String dealerAccountType) {
		this.dealerAccountType = dealerAccountType;
	}

	public String getDealerBankName() {
		return dealerBankName;
	}

	public void setDealerBankName(String dealerBankName) {
		this.dealerBankName = dealerBankName;
	}
	
	
	
}

