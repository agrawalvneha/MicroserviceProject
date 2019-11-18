package com.crts.app.magna.main.dto;

public class StateMasterDtoFetch {

	private int stateId;
	private String stateName;
	private String stateCode;
	private int stateStatus;
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

	public StateMasterDtoFetch() {

	}
}
