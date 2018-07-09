package com.ei.reselement;

import java.sql.Date;
import java.util.Map;

import com.ei.pojo.MultiMedia;

public class favorite extends MultiMedia{
	public static final String VIDEOID = "videoId";
	public favorite() {
		super();
		// TODO Auto-generated constructor stub
	}

	public favorite(String subType, Date date, Map resource) {
		super(subType, date, resource);
		// TODO Auto-generated constructor stub
	}
	public favorite(String subType, Date date, long videoId)
	{
		super.setDate(date);
		super.setSubType(subType);
		setMultiMediaId(videoId);
	}
	public void setMultiMediaId(long videoId)
	{
		resource.put(VIDEOID, videoId);
	}
	public Object getMultiMediaId()
	{
		return resource.get(VIDEOID);
	}
	
}
