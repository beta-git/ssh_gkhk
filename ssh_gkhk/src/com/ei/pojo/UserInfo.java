package com.ei.pojo;

import java.sql.Date;

public class UserInfo {
	private String icon;
	private java.sql.Date birthday;
	private boolean gender;
	private String signature;
	private String address;
	private String email;
	public UserInfo(String icon, Date birthday, boolean gender, String signature, String address, String email) {
		super();
		this.icon = icon;
		this.birthday = birthday;
		this.gender = gender;
		this.signature = signature;
		this.address = address;
		this.email = email;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public java.sql.Date getBirthday() {
		return birthday;
	}
	public void setBirthday(java.sql.Date birthday) {
		this.birthday = birthday;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
