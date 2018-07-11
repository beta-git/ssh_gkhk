package com.ei.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ei.Bean.MultiMedia;
import com.ei.Bean.User;
import com.ei.reselement.MultiMediaTo;
import com.ei.reselement.Video;

public class SearchManager  extends HibernateDaoSupport{
	public static final String HIGHLIGHTCOLOR = "#3AF489";
	public static final String SUB_TYPE = "subType";
	public static final String DATE = "date";
	/*
	 * 模糊查找 包含 searchVideo() searchUser()
	 * */
	private String key = "";
	private String [] tags= null;
	public Object[] search()
	{
		return new Object[]{searchVideo().iterator(),searchUser().iterator()};
	}
	
	/*
	 * 通过标签组查找视频
	 * */
	public List<Video> searchVideoByTags()
	{
		List<Video> result = new ArrayList<Video>(0);
		if(getTags()!=null)
		{
			List list = findBySubType(Video.SUBTYPE);
			Iterator it = list.iterator();
			while(it.hasNext())
			{
				MultiMedia multiMedia = (MultiMedia)it.next();
				Video video = (Video)MultiMediaTo.toSubType(multiMedia);
				boolean flag = true;
				for(String tag:getTags())
				{
					if(!video.getResource().get(Video.TAGS).toString().contains(tag))
					{
						flag = false;
						break;
					}
				}
				if(flag)result.add(video);
			}
		}
		return result;
	}
	
	/*
	 * 模糊查找视频
	 * 
	 * */
	public List<Video> searchVideo()
	{
		List list  = findBySubType(Video.SUBTYPE);
		List<Video> result = new ArrayList<Video>(0);
		Iterator it = list.iterator();
		while(it.hasNext())
		{
			MultiMedia multiMedia = (MultiMedia)it.next();
			Video video = (Video)MultiMediaTo.toSubType(multiMedia);
			String title = compare(getKey(),(String)video.getTitle());
			if(title!=null)
			{
				video.setTitle(title);
				result.add(video);
			}
		}
		return result;
	}
	/*
	 * 
	 * */
	public List<User> searchUser()
	{
		List<User> result = new ArrayList<User>(0);
		try {
			List list = getHibernateTemplate().find("from User");
			Iterator it = list.iterator();
			while(it.hasNext())
			{
				User user = (User)it.next();
				if(user.getName().contains(getKey()))
				{
					result.add(user);
				}
			}
		} catch (RuntimeException re) {
			throw re;
		}
		finally
		{
			return result;
		}
	}
	
	public List findByProperty(String propertyName, Object value) {
		try {
			String queryString = "from MultiMedia as model where model." + propertyName + "= ? order by date";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			throw re;
		}
	}
	public List findBySubType(Object subType) {
		return findByProperty(SUB_TYPE, subType);
	}
	
	/*
	 * 高亮文本
	 * */
	public static String compare(String str0, String str1)
	{
		String result = null;
		StringBuffer target = new StringBuffer(str1);
		StringBuffer result0 = new StringBuffer("");
		String hightLightStr0 = highLight(str0);
		int start = target.indexOf(str0);/***************************设定方法*****************/
		while(start!=-1)
		{
			int end = start+str0.length()-1;
			result0.append(target.substring(0, start)+hightLightStr0);
			target.delete(0, end);
			start = target.indexOf(str0);
		}
		if(result0.toString().length()!=0)
		{
			result0.append(target);
			result = result0.toString();
		}
//		if(str1.)
		return result;
	}
	
	public static String highLight(String str)
	{
		return "<font color=\'"+HIGHLIGHTCOLOR+"\'>"+str+"</font>";
	}

	public static String getHighlightcolor() {
		return HIGHLIGHTCOLOR;
	}
	
	public void setKey(String key)
	{
		this.key = key;
	}
	
	public String  getKey()
	{
		return key;
	}
	
	public String[] getTags()
	{
		return tags;
	}
	public void setTags(String []tags)
	{
		this.tags = tags;
	}
	
	public boolean template()
	{
		boolean flag = false;
		try {
			
			flag = true;
		} catch (RuntimeException re) {
			throw re;
		}
		finally
		{
			return flag;
		}
	}
	/*
	 * 判断字符串str0是否存在于str1中
	 * */
	
}
