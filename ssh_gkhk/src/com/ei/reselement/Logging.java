package com.ei.reselement;

import java.sql.Date;

import com.ei.Bean.UserResources;
import com.ei.Bean.MultiMedia;

public class Logging  extends MultiMedia{

	public static final String CONTENT = "content";
	public static final String FROM ="from";
	public static final String SUBTYPE = "logging";
	public Logging()
	{
		super();
		super.setSubType(SUBTYPE);
	}
	public Logging(UserResources userResources,Date date, String content, long from) {
		super.setDate(date);
		super.setSubType(SUBTYPE);
		super.setUserResources(userResources);
		setContent(content);
		setFrom(from);
	}
	public Object getContent() {
		return super.getResource().get(CONTENT); 
	}
	public void setContent(String content) {
		super.getResource().put(CONTENT, content);
	}
	public Object getFrom() {
		return super.getResource().get(FROM);
	}
	public void setFrom(long from) {
		super.getResource().put(FROM,from);
	}
	
}
