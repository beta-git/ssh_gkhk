package com.ei.reselement;

import java.sql.Date;
import java.util.Map;

import com.ei.pojo.MultiMedia;

public class template extends MultiMedia{
	public static final String NAME = "";
	public template() {
		super();
		// TODO Auto-generated constructor stub
	}

	public template(String subType, Date date, Map resource) {
		super(subType, date, resource);
		// TODO Auto-generated constructor stub
	}
	public template(String subType, Date date)
	{
		super.setDate(date);
		super.setSubType(subType);
		
	}
	public void setName(String name)
	{
		resource.put(NAME, name);
	}
	public Object getName()
	{
		return resource.get(NAME);
	}
	
}
