package com.crts.app.magna.main.dto;

public class RoleMasterDtoFetch {

	private int roleId;
	private String roleName;
	private String roleDescription;
	private String roleStatus;
	
	public RoleMasterDtoFetch() {
		// TODO Auto-generated constructor stub
	}

	public int getRoleId() {
		return roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public String getRoleDescription() {
		return roleDescription;
	}

	public String getRoleStatus() {
		return roleStatus;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}

	public void setRoleStatus(String roleStatus) {
		this.roleStatus = roleStatus;
	}
}