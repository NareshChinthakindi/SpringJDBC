/**
 * 
 */
package com.javariders.naresh.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javariders.naresh.dao.JDBCDaoImpl;

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
		
		JDBCDaoImpl daop = context.getBean(JDBCDaoImpl.class);
		
		System.out.println(daop.getCircle(1).getName());

	}

}
