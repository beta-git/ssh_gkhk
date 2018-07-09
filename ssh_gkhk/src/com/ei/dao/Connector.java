package com.ei.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Connector 
{
	private static SessionFactory sessionFactory=null;
	private static Session session=null;
	private static Connector uniqueInstance;
	protected Connector()
	{
		try
	    {
			Configuration config = new Configuration();
			config.configure("ssh_gkhk_test/hibernate.cfg.xml");
			sessionFactory=config.buildSessionFactory();
	    }
		catch(RuntimeException e)
		{
			e.printStackTrace();
			throw e;
		}
	}
	public static synchronized Connector getInstance()
	{
		if(uniqueInstance==null)
		{
			uniqueInstance = new Connector();
		}
		return uniqueInstance;
	}
	public void save(Object object)
	{
		Session session = sessionFactory.openSession();
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
	}
	public void update(Object object)
	{
		Session session = sessionFactory.openSession();
		Transaction ts = null;
		try
		{
			ts = session.beginTransaction();
			session.update(object);
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
	}
	public void delete(Object object)
	{
		Session session = sessionFactory.openSession();
		Transaction ts = null;
		try
		{
			ts = session.beginTransaction();
			session.delete(object);
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
		
	}
	public Object load(String className, long ID) throws ClassNotFoundException
	{
		Session session = sessionFactory.openSession();
		Transaction ts = null;
		try
		{
			ts = session.beginTransaction();
			Object object = session.load(Class.forName(className),ID);
			ts.commit();
			return object;
		}
		catch(RuntimeException e)
		{
			if(ts!=null)
			{
				ts.rollback();
			}
			e.printStackTrace();
			return null;
		}
	}
	public Object get(String className, long ID) throws ClassNotFoundException
	{
		Session session = sessionFactory.openSession();
		Transaction ts = null;
		try
		{
			ts = session.beginTransaction();
			Object object = session.get(Class.forName(className),ID);
			ts.commit();
			return object;
		}
		catch(RuntimeException e)
		{
			if(ts!=null)
			{
				ts.rollback();
			}
			e.printStackTrace();
			return null;
		}
	}
	public Session getSession()
	{
		if(session==null)
		{
			session = sessionFactory.openSession();
		}
		return session;
	}
	public void close()
	{
	}
}
