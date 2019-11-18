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
@Table(name = "mf_m_user")
public class UserMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "u_id")
	private int userId;

	@Column(name = "u_f_name")
	private String userFirstName;

	@Column(name = "u_m_name")
	private String userMiddleName;

	@Column(name = "u_l_name")
	private String userLastName;

	@Column(name = "u_email_id")
	private String userEmailId;

	@Column(name = "u_contact_no")
	private String userContactNo;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "b_id")
	private BranchMaster userBranchId;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "r_id")
	private RoleMaster userRoleId;

	@Column(name = "u_username", unique = true, nullable = false)
	private String username;

	@Column(name = "u_password")
	private String password;

	@Column(name = "u_l_address")
	private String userLocalAddress;

	@Column(name = "u_p_address")
	private String userPermanentAddress;

	@Column(name = "u_join_date")
	private String userJoiningDate;

	@Column(name = "u_PAN_card")
	private String userPANCard;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserMiddleName() {
		return userMiddleName;
	}

	public void setUserMiddleName(String userMiddleName) {
		this.userMiddleName = userMiddleName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public String getUserEmailId() {
		return userEmailId;
	}

	public void setUserEmailId(String userEmailId) {
		this.userEmailId = userEmailId;
	}

	public String getUserContactNo() {
		return userContactNo;
	}

	public void setUserContactNo(String userContactNo) {
		this.userContactNo = userContactNo;
	}

	public BranchMaster getUserBranchId() {
		return userBranchId;
	}

	public void setUserBranchId(BranchMaster userBranchId) {
		this.userBranchId = userBranchId;
	}

	public RoleMaster getUserRoleId() {
		return userRoleId;
	}

	public void setUserRoleId(RoleMaster userRoleId) {
		this.userRoleId = userRoleId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserLocalAddress() {
		return userLocalAddress;
	}

	public void setUserLocalAddress(String userLocalAddress) {
		this.userLocalAddress = userLocalAddress;
	}

	public String getUserPermanentAddress() {
		return userPermanentAddress;
	}

	public void setUserPermanentAddress(String userPermanentAddress) {
		this.userPermanentAddress = userPermanentAddress;
	}

	public String getUserJoiningDate() {
		return userJoiningDate;
	}

	public void setUserJoiningDate(String userJoiningDate) {
		this.userJoiningDate = userJoiningDate;
	}

	public String getUserPANCard() {
		return userPANCard;
	}

	public void setUserPANCard(String userPANCard) {
		this.userPANCard = userPANCard;
	}
}