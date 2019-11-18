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
@Table(name = "mf_enq_status_trace")
public class EnquiryStatusTrace  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "enq_st_id")
	private int enquiryStatusId;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "enq_id")
	private EnquiryDetails enquiryId;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(referencedColumnName = "cust_id")
	private EnquiryDetails custId;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "status_id")
	private StatusMaster enquiryStatus;

	public int getEnquiryStatusId() {
		return enquiryStatusId;
	}

	public void setEnquiryStatusId(int enquiryStatusId) {
		this.enquiryStatusId = enquiryStatusId;
	}

	public EnquiryDetails getEnquiryId() {
		return enquiryId;
	}

	public void setEnquiryId(EnquiryDetails enquiryId) {
		this.enquiryId = enquiryId;
	}

	public EnquiryDetails getCustId() {
		return custId;
	}

	public void setCustId(EnquiryDetails custId) {
		this.custId = custId;
	}

	public StatusMaster getEnquiryStatus() {
		return enquiryStatus;
	}

	public void setEnquiryStatus(StatusMaster enquiryStatus) {
		this.enquiryStatus = enquiryStatus;
	}
}