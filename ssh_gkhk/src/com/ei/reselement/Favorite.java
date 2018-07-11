package com.ei.reselement;

import java.sql.Date;
import java.util.Map;

import com.ei.Bean.UserResources;
import com.ei.Bean.MultiMedia;

public class Favorite extends MultiMedia{
	public static final String VIDEOID = "videoId";
	public static final String SUBTYPE = "favorite";
	public Favorite() {
		super();
		super.setSubType(SUBTYPE);
		// TODO Auto-generated constructor stub
	}
	public Favorite(UserResources userResources,Date date, long videoId)
	{
		super.setDate(date);
		super.setSubType(SUBTYPE);
		super.setUserResources(userResources);
		setMultiMediaId(videoId);
	}
	public void setMultiMediaId(long videoId)
	{
		super.getResource().put(VIDEOID, videoId);
	}
	public Object getMultiMediaId()
	{
		return super.getResource().get(VIDEOID);
	}
	
}
