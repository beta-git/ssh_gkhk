package com.ei.reselement;

import java.sql.Date;
import java.util.Map;

import com.ei.pojo.MultiMedia;

public class Video extends MultiMedia{
	private String title;
	public static final String TITLE = "title";
	private String url;
	public static final String URL = "url";
	private String cover;
	public static final String COVER = "cover";
	public Video() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Video(String subType, Date date, Map resource) {
		super(subType, date, resource);
		// TODO Auto-generated constructor stub
	}
	public Video(String subType, Date date, String title, String url, String cover)
	{
		super.setDate(date);
		super.setSubType(subType);
		setCover(cover);
		setUrl(url);
		setTitle(title);
	}
	public void setTitle(String title)
	{
		resource.put(TITLE, title);
	}
	public Object getTitle()
	{
		return resource.get(TITLE);
	}
	public void setUrl(String url)
	{
		resource.put(URL, url);
	}
	public Object getUrl()
	{
		return resource.get(URL);
	}
	public void setCover(String cover)
	{
		resource.put(COVER, cover);
	}
	public Object getName()
	{
		return resource.get(COVER);
	}
	
}
