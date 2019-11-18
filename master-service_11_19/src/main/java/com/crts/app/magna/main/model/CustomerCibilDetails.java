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
@Table(name="mf_cust_cibil_details")
public class CustomerCibilDetails 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ccd_id")
	private int custCibilDetailsId;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cust_id")
	private EnquiryDetails customerId;
	
	@Column(name = "p_id_status")
	private String primaryIdStatus;
	
	@Column(name = "s_id_status")
	private String secondaryIdStatus;
	
	@Column(name = "cibil_status")
	private String cibilStatus;
	
	@Column(name = "cibil_report")
	private String cibilReport;
	
	@Column(name = "cibil_generated_date")
	private String cibilGeneratedDate;

	public int getCustCibilDetailsId() {
		return custCibilDetailsId;
	}

	public void setCustCibilDetailsId(int custCibilDetailsId) {
		this.custCibilDetailsId = custCibilDetailsId;
	}

	public EnquiryDetails getCustomerId() {
		return customerId;
	}

	public void setCustomerId(EnquiryDetails customerId) {
		this.customerId = customerId;
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