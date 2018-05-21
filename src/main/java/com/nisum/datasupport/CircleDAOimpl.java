package com.nisum.datasupport;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class CircleDAOimpl {
	
	@Autowired
	private DataSource datasource;
	
	private JdbcTemplate jdbcTemplate=new JdbcTemplate(this.datasource);
	
	
	
	/*public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
		this.jdbcTemplate = new JdbcTemplate(this.datasource);
	}*/



	public Circle getCircle(int circleId) {
		
		
		
		Circle circle = null;
		
		/*Connection conn =null;
		try {
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root", "12345");
		PreparedStatement ps =conn.prepareStatement("SELECT * FROM circle WHERE id = ?");
		ps.setInt(1, circleId);
		
		ResultSet rs= ps.executeQuery();
		if(rs.next()) {
			circle=new Circle(circleId,rs.getString("name"));
		}
		
		
		rs.close();
		ps.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally {
			
			try {
			conn.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		return circle;
	}*/
		
		Connection conn=null;
		
		try {
			conn=datasource.getConnection();
			PreparedStatement ps =conn.prepareStatement("SELECT * FROM circle WHERE id = ?");
			ps.setInt(1, circleId);
			
			ResultSet rs= ps.executeQuery();
			if(rs.next()) {
				circle=new Circle(circleId,rs.getString("name"));
			}
			
			
			rs.close();
			ps.close();
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
		finally {
			
			try {
			conn.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}

		
		
	}
		return circle;
	}
	
	/*public int getCircles() {
		jdbcTemplate.setDataSource(datasource);
		String sql="SELECT COUNT(*) FROM db WHERE id = ?";
		//return jdbcTemplate.queryForObject(sql, Integer.class);
		Integer result = (Integer)jdbcTemplate.queryForObject(sql, new Object[] { 1 }, Integer.class);
	    return result;

	}*/
	
	/*public String getCircleName(int circleId) {
		
		String sql="SELECT * FROM circle WHERE id = ?";
		jdbcTemplate.queryForObject(sql, new Object[] {circleId}, String.class);
		
	}*/
	
	/*public Circle getCircleJDBC(int id) {
		String sql="SELECT * FROM circle where id =?";
		return jdbcTemplate.queryForObject(sql, new Object[]{id},new CircleRowMapper());
	}*/

}
