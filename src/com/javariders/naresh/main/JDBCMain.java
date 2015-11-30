/**
 * 
 */
package com.javariders.naresh.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javariders.naresh.dao.HibernateDAOImpl;

/**
 * @author nchinthakindi
 *
 */
public class JDBCMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		HibernateDAOImpl daop = context.getBean(HibernateDAOImpl.class);
		
		System.out.println(daop.getCircleCount());

	}

}
