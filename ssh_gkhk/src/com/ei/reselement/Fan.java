package com.ei.reselement;

import java.sql.Date;
import java.util.Map;

import com.ei.pojo.MultiMedia;

public class Fan extends MultiMedia{
	public static final String USERID = "userId";
	public Fan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fan(String subType, Date date, Map resource) {
		super(subType, date, resource);
		// TODO Auto-generated constructor stub
	}
	public Fan(String subType, Date date, long userId)
	{
		super.setDate(date);
		super.setSubType(subType);
		setMultiMediaId(userId);
	}
	public void setMultiMediaId(long userId)
	{
		resource.put(USERID, userId);
	}
	public Object getMultiMediaId()
	{
		return resource.get(USERID);
	}
	
}
