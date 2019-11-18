package com.crts.app.magna.main.dto;

public class UserMasterDtoFetch {
	
	private int userId;
	private String userFirstName;
	private String userMiddleName;
	private String userLastName;
	private String userEmailId;
	private String userContactNo;
	private BranchMasterDtoFetch userBranchId;
	private RoleMasterDtoFetch userRoleId;
	private String username;
	private String password;
	private String userLocalAddress;
	private String userPermanentAddress;
	private String userJoiningDate;
	private String userPANCard;
	
	public UserMasterDtoFetch() {
		// TODO Auto-generated constructor stub
	}

	public int getUserId() {
		return userId;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public String getUserMiddleName() {
		return userMiddleName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public String getUserEmailId() {
		return userEmailId;
	}

	public String getUserContactNo() {
		return userContactNo;
	}

	public int getUserBranchId() {
		return userBranchId.getBranchId();
	}

	public int getUserRoleId() {
		return userRoleId.getRoleId();
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getUserLocalAddress() {
		return userLocalAddress;
	}

	public String getUserPermanentAddress() {
		return userPermanentAddress;
	}

	public String getUserJoiningDate() {
		return userJoiningDate;
	}

	public String getUserPANCard() {
		return userPANCard;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public void setUserMiddleName(String userMiddleName) {
		this.userMiddleName = userMiddleName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public void setUserEmailId(String userEmailId) {
		this.userEmailId = userEmailId;
	}

	public void setUserContactNo(String userContactNo) {
		this.userContactNo = userContactNo;
	}

	public void setUserBranchId(BranchMasterDtoFetch userBranchId) {
		this.userBranchId = userBranchId;
	}

	public void setUserRoleId(RoleMasterDtoFetch userRoleId) {
		this.userRoleId = userRoleId;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setUserLocalAddress(String userLocalAddress) {
		this.userLocalAddress = userLocalAddress;
	}

	public void setUserPermanentAddress(String userPermanentAddress) {
		this.userPermanentAddress = userPermanentAddress;
	}

	public void setUserJoiningDate(String userJoiningDate) {
		this.userJoiningDate = userJoiningDate;
	}

	public void setUserPANCard(String userPANCard) {
		this.userPANCard = userPANCard;
	}
}