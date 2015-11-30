/**
 * 
 */
package com.javariders.naresh.model;

import java.io.Serializable;

/**
 * @author nchinthakindi
 *
 */
public class Circle implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	
	public Circle(int id,String name)
	{
		this.id = id;
		this.name = name; 
	}
	
	public Circle()
	{
		
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
