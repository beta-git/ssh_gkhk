package com.ei.reselement;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.ei.Bean.UserResources;
import com.ei.Bean.MultiMedia;

public class Video extends MultiMedia{
	public static final String TITLE = "title";
	public static final String URL = "url";
	public static final String COVER = "cover";
	public static final String SUBTYPE = "video";
	public static final String TAGS = "tags";
	private List comment = new ArrayList(0);
	public Video() {
		super();
		super.setSubType(SUBTYPE);
		// TODO Auto-generated constructor stub
	}


	public Video(UserResources userResources, Date date, String title, String url, String cover)
	{
		super.setDate(date);
		super.setSubType(SUBTYPE);
		super.setUserResources(userResources);
		setCover(cover);
		setUrl(url);
		setTitle(title);
	}
	public void setTags(String [] tags)
	{
		String result = "";
		for(String tag:tags)
		{
			result+="#"+tag;
		}
		result = result.substring(1);
		super.getResource().put(TAGS, result);
	}
	public String[] getTags()
	{
		return ((String)super.getResource().get(TAGS)).split("#");
	}
	public void setTitle(String title)
	{
		super.getResource().put(TITLE, title);
	}
	public Object getTitle()
	{
		return super.getResource().get(TITLE);
	}
	public void setUrl(String url)
	{
		super.getResource().put(URL, url);
	}
	public Object getUrl()
	{
		return super.getResource().get(URL);
	}
	public void setCover(String cover)
	{
		super.getResource().put(COVER, cover);
	}
	public Object getName()
	{
		return super.getResource().get(COVER);
	}

	public List getComment() {
		return comment;
	}

	public void setComment(List comment) {
		this.comment = comment;
	}
}
