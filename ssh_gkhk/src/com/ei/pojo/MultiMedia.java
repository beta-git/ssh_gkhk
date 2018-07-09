package com.ei.pojo;

import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

public class MultiMedia {
	private String subType;
	private java.sql.Date date;
	protected Map resource = new HashMap(0);
	public MultiMedia(String subType, Date date, Map resource) {
		super();
		this.subType = subType;
		this.date = date;
		this.resource = resource;
	}
	public MultiMedia(){}
	public String getSubType() {
		return subType;
	}
	public void setSubType(String subType) {
		this.subType = subType;
	}
	public java.sql.Date getDate() {
		return date;
	}
	public void setDate(java.sql.Date date) {
		this.date = date;
	}
	public Map getResource() {
		return resource;
	}
	public void setResource(Map resource) {
		this.resource = resource;
	}
	
}
