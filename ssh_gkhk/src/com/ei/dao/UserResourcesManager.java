package com.ei.dao;

import com.ei.Bean.*;

public class UserResourcesManager {
	
	public static UserResources getDefaultUserResources(User user)
	{
//	    public UserResources(User user, int balance, Set advice, Set video, Set dynamic, Set message, Set favorite, Set bill, Set focus, Set fan, Set history, Set logging) {
		UserResources userResources = new UserResources(user);
		userResources.setBalance(0);
		return userResources;
	}
}
