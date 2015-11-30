package com.javariders.naresh.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.javariders.naresh.model.Circle;

@Component
public class JDBCDaoImpl 
{

	@Autowired
	private DataSource dataSource;
	
	public Circle getCircle(int id)
	{
		Circle circle = null;
		Connection connection = null;
		
		try
		{
			connection = dataSource.getConnection();
			
			PreparedStatement st = connection.prepareStatement("select *from circle where id =?");
			st.setInt(1, id);
			
			ResultSet rs = st.executeQuery();
			
			if(rs.next())
			{
				circle = new Circle(id,rs.getString("name"));
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			 try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return circle;
	}
	
}
