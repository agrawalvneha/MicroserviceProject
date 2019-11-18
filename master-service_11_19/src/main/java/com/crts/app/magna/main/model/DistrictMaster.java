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
@Table(name = "mf_m_district")
public class DistrictMaster {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "dt_id")
	private int districtId;

	@Column(name = "dt_name")
	private String districtName;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="st_id")
	private StateMaster districtStateId;

	@Column(name = "dt_status")
	private int districtStatus;
	
	public StateMaster getDistrictStateId() {
		return districtStateId;
	}

	public void setDistrictStateId(StateMaster districtStateId) {
		this.districtStateId = districtStateId;
	}
	
	public int getDistrictId() {
		return districtId;
	}

	public void setDistrictId(int districtId) {
		this.districtId = districtId;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public int getDistrictStatus() {
		return districtStatus;
	}

	public void setDistrictStatus(int districtStatus) {
		this.districtStatus = districtStatus;
	}
}