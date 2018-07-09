package com.ei.pojo;

public class User {
	private String username;
	private String password;
	private UserInfo userInfo;
	private UserResources userResources;
	public User(){}
	public User(String username, String password, UserInfo userInfo, UserResources userResources) {
		super();
		this.username = username;
		this.password = password;
		this.userInfo = userInfo;
		this.userResources = userResources;
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
	public UserInfo getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
	public UserResources getUserResources() {
		return userResources;
	}
	public void setUserResources(UserResources userResources) {
		this.userResources = userResources;
	}
}
