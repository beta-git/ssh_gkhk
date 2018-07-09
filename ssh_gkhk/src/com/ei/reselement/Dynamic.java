package com.ei.reselement;

import java.sql.Date;
import java.util.Map;

import com.ei.pojo.MultiMedia;

public class Dynamic extends MultiMedia{
	public static final String CONTENT = "content";
	public static final String PICTURE = "picture";
	public static final String VIDEO = "video";
	public Dynamic() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dynamic(String subType, Date date, Map resource) {
		super(subType, date, resource);
		// TODO Auto-generated constructor stub
	}
	public Dynamic(String subType, Date date, String content, String picture, String video)
	{
		super.setDate(date);
		super.setSubType(subType);
		setContent(content);
		setPicture(picture);
		setVideo(video);
	}
	public void setContent(String content)
	{
		resource.put(CONTENT, content);
	}
	public Object getContent()
	{
		return resource.get(CONTENT);
	}
	public void setPicture(String picture)
	{
		resource.put(PICTURE, picture);
	}
	public Object getPicture()
	{
		return resource.get(PICTURE);
	}
	public void setVideo(String video)
	{
		resource.put(VIDEO, video);
	}
	public Object getVideo()
	{
		return resource.get(VIDEO);
	}
	
}
