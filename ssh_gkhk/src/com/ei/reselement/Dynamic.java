package com.ei.reselement;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.ei.Bean.UserResources;
import com.ei.Bean.MultiMedia;

public class Dynamic extends MultiMedia{
	public static final String CONTENT = "content";
	public static final String PICTURE = "picture";
	public static final String VIDEO = "video";
	public static final String SUBTYPE = "dynamic";
	private List comment = new ArrayList(0);
	public Dynamic() {
		super();
		super.setSubType(SUBTYPE);
		// TODO Auto-generated constructor stub
	}
	public Dynamic(UserResources userResources,Date date, String content, String picture, String video)
	{
		super.setDate(date);
		super.setSubType(SUBTYPE);
		super.setUserResources(userResources);
		setContent(content);
		setPicture(picture);
		setVideo(video);
	}
	public void setContent(String content)
	{
		super.getResource().put(CONTENT, content);
	}
	public Object getContent()
	{
		return super.getResource().get(CONTENT);
	}
	public void setPicture(String picture)
	{
		super.getResource().put(PICTURE, picture);
	}
	public Object getPicture()
	{
		return super.getResource().get(PICTURE);
	}
	public void setVideo(String video)
	{
		super.getResource().put(VIDEO, video);
	}
	public Object getVideo()
	{
		return super.getResource().get(VIDEO);
	}
	public List getComment() {
		return comment;
	}

	public void setComment(List comment) {
		this.comment = comment;
	}
}
