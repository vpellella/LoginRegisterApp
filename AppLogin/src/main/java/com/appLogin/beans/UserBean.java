package com.appLogin.beans;

import java.io.Serializable;

public class UserBean implements Cloneable, Serializable, Comparable<UserBean>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2231728191278914005L;
	private Long userId;
	private String username;
	private String password;
	private String email;
	private String mobileNo;
	private Long addressId;
	
	
	public Long getUserId() {
		return userId;
	}


	public void setUserId(Long userId) {
		this.userId = userId;
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getMobileNo() {
		return mobileNo;
	}


	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}


	public Long getAddressId() {
		return addressId;
	}


	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}


	public int compareTo(UserBean userBean) {
		return this.userId.compareTo(userBean.getUserId());
	}
	
	
	
	

}
