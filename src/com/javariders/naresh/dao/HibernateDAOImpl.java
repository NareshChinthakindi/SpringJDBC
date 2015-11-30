/**
 * 
 */
package com.javariders.naresh.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author nchinthakindi
 *
 */
@Repository
public class HibernateDAOImpl {

	@Autowired
	private SessionFactory sessionFactory;
	
	/**
	 * @return the sessionFactory
	 */
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	/**
	 * @param sessionFactory the sessionFactory to set
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Long getCircleCount()
	{
		Long result = null;
		String hql = "select count(*) from Circle";
		
		try
		{
			
			Session session = sessionFactory.openSession();
			
			Query query = session.createQuery(hql);
			
			result = (Long) query.uniqueResult();
						
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return result;
	}
}
