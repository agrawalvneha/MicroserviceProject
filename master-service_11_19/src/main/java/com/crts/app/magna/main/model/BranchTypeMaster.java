package com.crts.app.magna.main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mf_m_branch_type")
public class BranchTypeMaster
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "bt_id")
	private int branchTypeId;
	
	@Column(name = "bt_name")
	private String branchTypeName;

	public int getBranchTypeId() {
		return branchTypeId;
	}

	public void setBranchTypeId(int branchTypeId) {
		this.branchTypeId = branchTypeId;
	}

	public String getBranchTypename() {
		return branchTypeName;
	}

	public void setBranchTypename(String branchTypename) {
		this.branchTypeName = branchTypename;
	}
}
