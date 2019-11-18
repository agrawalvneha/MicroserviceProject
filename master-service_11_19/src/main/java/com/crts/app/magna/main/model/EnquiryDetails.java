package com.crts.app.magna.main.model;

import java.io.Serializable;
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
@Table(name = "mf_enq_details")
public class EnquiryDetails implements Serializable
{
	private static final long serialVersionUID = 2L;

	@Id
	@Column(name = "enq_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int enquiryId;
	
	@Column(name = "cust_id", nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int custId;
	
	@Column(name = "cust_f_name")
	private String custFirstName;
	
	@Column(name = "cust_m_name")
	private String custMiddleName;
	
	@Column(name = "cust_l_name")
	private String custLastName;
	
	@Column(name = "cust_contact_no")
	private String custContactNo;
	
	@Column(name = "cust_email_id")
	private String custEmailId;
	
	@Column(name = "cust_address")
	private String custAddress;
	
	@Column(name = "cust_loan_amt")
	private String custLoanAmount;
	
	@Column(name = "cust_p_id")
	private String custPrimaryId;
	
	@Column(name = "cust_p_value")
	private String custPrimaryValue;
	
	@Column(name = "cust_s_id")
	private String custSecondaryId;
	
	@Column(name = "cust_s_value")
	private String custSecondaryValue;
	
	@Column(name = "cust_gender")
	private String custGender;
	
	@Column(name = "cust_DOB")
	private String custDOB;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "b_id")
	private BranchMaster branchId;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "u_id")
	private UserMaster relationalExecutiveId;
	
	@Column(name = "enq_creation_date")
	private String enquiryCreationDate;
	
	@Column(name = "enq_creation_time")
	private String enquiryCreationTime;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(referencedColumnName = "u_username")
	private UserMaster enquiryCreatedBy;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ln_id")
	private LoanType loanTypeId;

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

	public BranchMaster getBranchId() {
		return branchId;
	}

	public void setBranchId(BranchMaster branchId) {
		this.branchId = branchId;
	}

	public UserMaster getRelationalExecutiveId() {
		return relationalExecutiveId;
	}

	public void setRelationalExecutiveId(UserMaster relationalExecutiveId) {
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

	public UserMaster getEnquiryCreatedBy() {
		return enquiryCreatedBy;
	}

	public void setEnquiryCreatedBy(UserMaster enquiryCreatedBy) {
		this.enquiryCreatedBy = enquiryCreatedBy;
	}

	public LoanType getLoanTypeId() {
		return loanTypeId;
	}

	public void setLoanTypeId(LoanType loanTypeId) {
		this.loanTypeId = loanTypeId;
	}
}