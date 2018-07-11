package com.ei.dao;

import java.sql.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ei.Bean.*;

public class UserManager extends HibernateDaoSupport{
	public static final String ID = "id";
	public static final String NAME = "name";
	public static final String PASSWORD = "password";
	public static User getDefaultUser()
	{
		User user = new User();
		user.setName("username");
		user.setPassword("password");
		user.setUserInfo(UserManager.getDefaultUserInfo(user));
		user.setUserResources(UserResourcesManager.getDefaultUserResources(user));
		return user;
	}
	public static UserInfo getDefaultUserInfo(User user)
	{
//			public UserInfo(User user, String iconURL, String signature, boolean gender, Date birthday, String address, String email) 
		return new UserInfo(user,"default.jpg","",true,java.sql.Date.valueOf("1970-1-1"),"","");
	}
	/*
	 * add new user with unique name
	 * */
	public boolean addUser(String username, String password)
	{
		boolean flag = false;
		try
		{
			if(isNameUnique(username))
			{
				User user =  getDefaultUser();
				user.setName(username);
				user.setPassword(password);
				getHibernateTemplate().save(user);
				flag = true;
			}
		}
		catch (RuntimeException re)
		{
			throw re;
		}
		finally
		{
			return flag;
		}
	}
	public boolean isNameUnique(String username)
	{
		return findByName(username).size()==0;
	}
	public List findByExample(User instance) {
		try {
			List results = getHibernateTemplate().findByExample(instance);
			return results;
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		try {
			String queryString = "from User as model where model." + propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			throw re;
		}
	}
	public List findById(long id)
	{
		return findByProperty(ID,id);
	}
	public List findByName(Object name) {
		return findByProperty(NAME, name);
	}
	
	public boolean setPassword(User user,String password)
	{
		boolean flag = false;
		try {
			user.setPassword(password);
			getHibernateTemplate().update(user);
			flag = true;
		} catch (RuntimeException re) {
			throw re;
		}
		finally
		{
			return flag;
		}
	}
	public boolean setName(User user,String name)
	{
		boolean flag = false;
		try {
			user.setName(name);
			getHibernateTemplate().update(user);
			flag = true;
		} catch (RuntimeException re) {
			throw re;
		}
		finally
		{
			return flag;
		}
	}
	public boolean updateUserInfo(User user, UserInfo userInfo)
	{
		boolean flag = false;
		try {
			userInfo.setUser(user);
			user.setUserInfo(userInfo);
			getHibernateTemplate().update(user);
			flag = true;
		} catch (RuntimeException re) {
			throw re;
		}
		finally
		{
			return flag;
		}
	}
	
	public boolean setIcon(User user, String iconURL)
	{
		boolean flag = false;
		try {
			user.getUserInfo().setIconURL(iconURL);
			flag = true;
		} catch (RuntimeException re) {
			throw re;
		}
		finally
		{
			return flag;
		}
	}
	public boolean isUserExist(String username, String password)
	{
		boolean flag = false;
		try {
			List list = findByName(username);
			if(list.size()==1)
			{
				User user = (User)list.get(0);
				if(user.getName().equals(username)&&user.getPassword().equals(password))
				{
					flag = true;
				}
			}
		} catch (RuntimeException re) {
			throw re;
		}
		finally
		{
			return flag;
		}
	}
	
	public boolean updateUser(User user)
	{
		boolean flag = false;
		try {
			getHibernateTemplate().save(user);
			flag = true;
		} catch (RuntimeException re) {
			throw re;
		}
		finally
		{
			return flag;
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
	
	public boolean template(Object object)
	{
		boolean flag = false;
		Session session = getHibernateTemplate().getSessionFactory().openSession();
		Transaction ts = null;
		try
		{
			ts = session.beginTransaction();
			session.save(object);
			ts.commit();
		}
		catch(RuntimeException e)
		{
			if(ts!=null)
			{
				ts.rollback();
			}
			e.printStackTrace();
		}
		return flag;
	}
}
