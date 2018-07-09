package com.ei.dao;

import java.util.List;
import java.util.Set;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ei.Bean.MultiMedia;

/**
 * A data access object (DAO) providing persistence and search support for
 * MultiMedia entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.ei.dao.MultiMedia
 * @author MyEclipse Persistence Tools
 */
public class MultimediaDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(MultimediaDAO.class);
	// property constants
	public static final String SUB_TYPE = "subType";

	protected void initDao() {
		// do nothing
	}

	public void save(MultiMedia transientInstance) {
		log.debug("saving MultiMedia instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(MultiMedia persistentInstance) {
		log.debug("deleting MultiMedia instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public MultiMedia findById(java.lang.Long id) {
		log.debug("getting MultiMedia instance with id: " + id);
		try {
			MultiMedia instance = (MultiMedia) getHibernateTemplate().get("com.ei.dao.MultiMedia", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(MultiMedia instance) {
		log.debug("finding MultiMedia instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding MultiMedia instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from MultiMedia as model where model." + propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findBySubType(Object subType) {
		return findByProperty(SUB_TYPE, subType);
	}

	public List findAll() {
		log.debug("finding all MultiMedia instances");
		try {
			String queryString = "from MultiMedia";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public MultiMedia merge(MultiMedia detachedInstance) {
		log.debug("merging MultiMedia instance");
		try {
			MultiMedia result = (MultiMedia) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(MultiMedia instance) {
		log.debug("attaching dirty MultiMedia instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(MultiMedia instance) {
		log.debug("attaching clean MultiMedia instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static MultimediaDAO getFromApplicationContext(ApplicationContext ctx) {
		return (MultimediaDAO) ctx.getBean("MultimediaDAO");
	}
}