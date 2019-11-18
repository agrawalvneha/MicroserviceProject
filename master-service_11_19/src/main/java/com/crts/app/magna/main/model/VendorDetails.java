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
@Table(name="mf_m_vendor")
public class VendorDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="vn_id")
	private int vendorId;
    
    @Column(name="vn_name")
    private String vendorName;
    
    @Column(name="vn_con_no")
    private String vendorContactNo;
    
    @Column(name="vn_disc")
    private String vendorDiscription;
    
    @Column(name="vn_email")
    private String vendorEmail;
    
    @OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "d_id")          
    private DealerMaster dealerId;
    
	public int getVendorId() {
		return vendorId;
	}
	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}
	
	public DealerMaster getDealerId() {
		return dealerId;
	}
	public void setDealerId(DealerMaster dealerId) {
		this.dealerId = dealerId;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public String getVendorContactNo() {
		return vendorContactNo;
	}
	public void setVendorContactNo(String vendorContactNo) {
		this.vendorContactNo = vendorContactNo;
	}
	public String getVendorDiscription() {
		return vendorDiscription;
	}
	public void setVendorDiscription(String vendorDiscription) {
		this.vendorDiscription = vendorDiscription;
	}
	public String getVendorEmail() {
		return vendorEmail;
	}
	public void setVendorEmail(String vendorEmail) {
		this.vendorEmail = vendorEmail;
	}    
}