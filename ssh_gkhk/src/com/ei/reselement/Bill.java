package com.ei.reselement;

import java.sql.Date;
import java.util.Map;

import com.ei.Bean.UserResources;
import com.ei.Bean.MultiMedia;

public class Bill extends MultiMedia{
	public static final String CONTENT = "content";
	public static final String FROM = "from";
	public static final String TO = "to";
	public static final String SUBTYPE="bill";
	public Bill() {
		super();
		super.setSubType(SUBTYPE);
		// TODO Auto-generated constructor stub
	}
	public Bill(UserResources userResources,Date date, String content, long from, long to)
	{
		super.setDate(date);
		super.setSubType(SUBTYPE);
		super.setUserResources(userResources);
		setContent(content);
		setTo(to);
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
	public void setTo(long to)
	{
		super.getResource().put(TO, to);
	}
	public Object getName()
	{
		return super.getResource().get(TO);
	}
	
}
