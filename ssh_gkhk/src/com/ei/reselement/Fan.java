package com.ei.reselement;

import java.sql.Date;
import java.util.Map;

import com.ei.Bean.UserResources;
import com.ei.Bean.MultiMedia;

public class Fan extends MultiMedia{
	public static final String USERID = "userId";
	public static final String SUBTYPE = "fan";
	public Fan() {
		super();
		super.setSubType(SUBTYPE);
		// TODO Auto-generated constructor stub
	}

	public Fan(UserResources userResources,Date date, long userId)
	{
		super.setDate(date);
		super.setSubType(SUBTYPE);
		super.setUserResources(userResources);
		setMultiMediaId(userId);
	}
	public void setMultiMediaId(long userId)
	{
		super.getResource().put(USERID, userId);
	}
	public Object getMultiMediaId()
	{
		return super.getResource().get(USERID);
	}
	
}
