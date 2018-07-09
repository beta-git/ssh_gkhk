package com.ei.reselement;

import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

import com.ei.pojo.MultiMedia;

public class Advice  extends MultiMedia{

	public static final String CONTENT = "content";
	public static final String FROM ="from";
	public Advice()
	{
		super();
	}
	public Advice(String subType, Date date, String content, long from) {
		super.setDate(date);
		super.setSubType(subType);
		setContent(content);
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
	
}
