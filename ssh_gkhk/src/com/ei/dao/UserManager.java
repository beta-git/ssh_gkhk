package com.ei.dao;

import java.sql.Date;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.ei.Bean.*;

public class UserManager {
	
	public static User getDefaultUser()
	{
		User user = new User();
		user.setName("username");
		user.setPassword("password");
		user.setUserInfo(UserManager.getDefaultUserInfo(user));
		user.setUserResources(UserResourcesManager.getDefaultUserResources(user));
		return user;
	}
	public static UserInfo getDefaultUserInfo(User user)
	{
//			public UserInfo(User user, String iconURL, String signature, boolean gender, Date birthday, String address, String email) 
		return new UserInfo(user,"default.jpg","",true,java.sql.Date.valueOf("1970-1-1"),"","");
	}
}
