package com.ei.actions;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.ei.manager.Manager;
import com.opensymphony.xwork2.ActionSupport;

public class RegLog extends ActionSupport implements SessionAware{
	private Manager manager;
	private String username;
	private String password;
	private Map mySession;
	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		mySession = arg0;
	}
	public String login()
	{
		if(manager.login(username, password))
		{
			mySession.put("loginFlag","login");
			return SUCCESS;
		}
		return ERROR;
	}
	public String register()
	{
		if(manager.register(username, password))
		{
			mySession.put("loginFlag","login");
			return SUCCESS;
		}
		return ERROR;
	}
	
	public void validateRegister()
	{
		if(!manager.isUsernameUnique(username))
		{
			addFieldError("username","ÒÑ×¢²á");
		}
	}
	
	public Manager getManager() {
		return manager;
	}
	public void setManager(Manager manager) {
		this.manager = manager;
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
	
//	public void validateRegister()
//	{
//		if(repeatpassword==null||!repeatpassword.contentEquals(user.getPassword()))
//		{
//			addFieldError("repeatpassword",getText("info.repeatpassworderror"));
//		}
//	}
}
