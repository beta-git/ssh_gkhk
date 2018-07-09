package com.ei.reselement;

import java.sql.Date;
import java.util.Map;

import com.ei.pojo.MultiMedia;

public class Focus extends MultiMedia{
	public static final String USERID = "userId";
	public Focus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Focus(String subType, Date date, Map resource) {
		super(subType, date, resource);
		// TODO Auto-generated constructor stub
	}
	public Focus(String subType, Date date, long userId)
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
