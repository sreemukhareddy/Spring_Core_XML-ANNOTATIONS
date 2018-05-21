package com.nisum.datasupport;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CircleRowMapper implements RowMapper<Circle> {

	public Circle mapRow(ResultSet rs, int rowNum) throws SQLException {
		Circle c=new Circle();
		c.setId(rs.getInt("id"));
		c.setName(rs.getString("name"));
		return c;
	}

}
