package com.crts.app.magna.main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mf_m_state")
public class StateMaster 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="st_id")
	private int stateId;
	
	@Column(name="st_name")
	private String stateName;
	
	@Column(name="st_code")
	private String stateCode;
	
	@Column(name="st_status")
	private int stateStatus;
	
	@Column(name="st_GSTCode")
	private int stateGSTCode;
	
	public int getStateId() {
		return stateId;
	}
	public void setStateId(int stateId) {
		this.stateId = stateId;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getStateCode() {
		return stateCode;
	}
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	public int getStateStatus() {
		return stateStatus;
	}
	public void setStateStatus(int stateStatus) {
		this.stateStatus = stateStatus;
	}
	public int getStateGSTCode() {
		return stateGSTCode;
	}
	public void setStateGSTCode(int stateGSTCode) {
		this.stateGSTCode = stateGSTCode;
	}
}