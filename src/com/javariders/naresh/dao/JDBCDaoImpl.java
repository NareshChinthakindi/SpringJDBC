package com.javariders.naresh.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.javariders.naresh.model.Circle;

@Component
public class JDBCDaoImpl 
{

	private JdbcTemplate jdbcTemplate = null;
	
	/**
	 * @param dataSource the dataSource to set
	 */
	@Autowired
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}




	/**
	 * @return the jdbcTemplate
	 */
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}




	/**
	 * @param jdbcTemplate the jdbcTemplate to set
	 */
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}




	public Circle getCircle(int id)
	{
		Circle circle = null;
		
		try
		{
			
			circle = this.getJdbcTemplate().queryForObject("select id,name from circle where id =?",new Object[]{id} ,new BeanPropertyRowMapper<Circle>(Circle.class));
						
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return circle;
	}
	
}
