package com.ei.actions;

import com.ei.Bean.UserInfo;
import com.ei.manager.Manager;
import com.ei.reselement.Focus;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{
	private String username;
	private String password;
	private Manager manager;
	private UserInfo userInfo;
	private Focus focus;
	public String resetUsername()
	{
		if(manager.resetUsername(username))
			return SUCCESS;
		return ERROR;
	}
	public String resetPassword()
	{
		if(manager.resetPassword(password))
			return SUCCESS;
		return ERROR;
	}
//	public String resetIconURL()
//	{
//		if(manager.resetIcon(iconURL))
//	}
	public String resetUserInfo()
	{
		if(manager.updateUserInfo(userInfo))
			return SUCCESS;
		return ERROR;
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
	public Manager getManager() {
		return manager;
	}
	public void setManager(Manager manager) {
		this.manager = manager;
	}
	
}
