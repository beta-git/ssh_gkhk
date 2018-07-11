package com.ei.reselement;

import java.sql.Date;
import java.util.Map;

import com.ei.Bean.UserResources;
import com.ei.Bean.MultiMedia;

public class Focus extends MultiMedia{
	public static final String USERID = "userId";
	public static final String SUBTYPE = "focus";
	public Focus() {
		super();
		super.setSubType(SUBTYPE);
		// TODO Auto-generated constructor stub
	}
	public Focus(UserResources userResources,Date date, long userId)
	{
		super.setDate(date);
		super.setSubType(SUBTYPE);
		super.setUserResources(userResources);
		setUserID(userId);
	}
	public void setUserID(long userId)
	{
		super.getResource().put(USERID, userId);
	}
	public Object getUserID()
	{
		return super.getResource().get(USERID);
	}
	
}
