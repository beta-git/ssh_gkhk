package com.ei.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ei.Bean.*;
import com.ei.reselement.Advice;
import com.ei.reselement.Dynamic;
import com.ei.reselement.Message;
import com.ei.reselement.Video;

public class UserResourcesManager extends HibernateDaoSupport{
	public static final String SUB_TYPE = "subType";
	public static final String DATE = "date";
	public static UserResources getDefaultUserResources(User user)
	{
//	    public UserResources(User user, int balance, Set advice, Set video, Set dynamic, Set message, Set favorite, Set bill, Set focus, Set fan, Set history, Set logging) {
		UserResources userResources = new UserResources(user);
		userResources.setBalance(0);
		return userResources;
	}
	
	public boolean addMultiMedia(User user, MultiMedia multiMedia)
	{
		boolean flag = false;
		try {
			multiMedia.setUserResources(user.getUserResources());
			getHibernateTemplate().save(multiMedia);
			flag = true;
		} catch (RuntimeException re) {
			throw re;
		}
		finally
		{
			return flag;
		}
	}
	public boolean addMultiMedia( MultiMedia multiMedia)
	{
		boolean flag = false;
		try {
			getHibernateTemplate().save(multiMedia);
			flag = true;
		} catch (RuntimeException re) {
			throw re;
		}
		finally
		{
			return flag;
		}
	}
	public boolean deleteMultiMedia(long multiMediaID)/********************优化.指定subType删除comment************************************/
	{
		boolean flag = false;
		try {
			getHibernateTemplate().find("delete from MultiMedia model where model.id =?",multiMediaID);
			getHibernateTemplate().find("delete from Comment model where model.multiMediaID =?",multiMediaID);
			flag = true;
		} catch (RuntimeException re) {
			throw re;
		}
		finally
		{
			return flag;
		}
	}
	public boolean isMultiMediaHasComment(MultiMedia multiMedia)
	{
		return (multiMedia instanceof Video||multiMedia instanceof Dynamic || multiMedia instanceof Message);
	}
	
	public boolean addMultiMediaComment(MultiMedia multiMedia,Comment comment)//检查空set
	{
		boolean flag = false;
		try {
			if(isMultiMediaHasComment(multiMedia))
			{
				comment.setMultiMediaID(multiMedia.getId());
				getHibernateTemplate().save(comment);
				flag = true;
			}
		} catch (RuntimeException re) {
			throw re;
		}
		finally
		{
			return flag;
		}
	}
	public boolean addMultiMediaComment(Comment comment)//检查空set
	{
		boolean flag = false;
		try {
			getHibernateTemplate().save(comment);
			flag = true;
		} catch (RuntimeException re) {
			throw re;
		}
		finally
		{
			return flag;
		}
	}
	public List getMultiMediaComment(MultiMedia multiMedia)
	{
		List list = new ArrayList(0);
		try {
			if(isMultiMediaHasComment(multiMedia))
			{
				String queryString = "from Comment as model where model." + "multiMediaID" + "= ? order by model.date";
				return getHibernateTemplate().find(queryString, multiMedia.getId());
			}
		} catch (RuntimeException re) {
			throw re;
		}
		finally
		{
			return list;
		}
	}
	public List getMultiMediaComment(Long multiMediaID)
	{
		List list = new ArrayList(0);
		try {
			String queryString = "from Comment as model where model." + "multiMediaID" + "= ? order by model.date";
			return getHibernateTemplate().find(queryString, multiMediaID);
		} catch (RuntimeException re) {
			throw re;
		}
		finally
		{
			return list;
		}
	}
	public List deleteMultiMediaComment(MultiMedia multiMedia,Comment comment)/**************************************************/
	{
		List list = new ArrayList(0);
		try {
			if(isMultiMediaHasComment(multiMedia))
			{
				String queryString = "from Comment as model where model." + "multiMediaID" + "= ? order by model.date";
				return getHibernateTemplate().find(queryString, multiMedia.getId());
			}
		} catch (RuntimeException re) {
			throw re;
		}
		finally
		{
			return list;
		}
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
	public List findByProperty(String propertyName, Object value) {
		try {
			String queryString = "from MultiMedia as model where model." + propertyName + "= ? order by date";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			throw re;
		}
	}
}
