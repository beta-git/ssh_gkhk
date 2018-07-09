package com.ei.reselement;

import java.sql.Date;
import java.util.Map;

import com.ei.pojo.MultiMedia;

public class Bill extends MultiMedia{
	public static final String CONTENT = "content";
	public static final String FROM = "from";
	public static final String TO = "to";
	public Bill() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bill(String subType, Date date, Map resource) {
		super(subType, date, resource);
		// TODO Auto-generated constructor stub
	}
	public Bill(String subType, Date date, String content, long from, long to)
	{
		super.setDate(date);
		super.setSubType(subType);
		setContent(content);
		setTo(to);
		setFrom(from);
	}
	public Object getContent() {
		return resource.get(CONTENT); 
	}
	public void setContent(String content) {
		resource.put(CONTENT, content);
	}
	public Object getFrom() {
		return resource.get(FROM);
	}
	public void setFrom(long from) {
		resource.put(FROM,from);
	}
	public void setTo(long to)
	{
		resource.put(TO, to);
	}
	public Object getName()
	{
		return resource.get(TO);
	}
	
}
