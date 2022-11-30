package com.sm.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sm.api.Student;

public class StudentRowMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {

		Student student = new Student();

		student.setId(rs.getInt("id"));
		student.setName(rs.getString("name"));
		student.setLastname(rs.getString("lastname"));
		student.setMobile(rs.getLong("mobile"));
		student.setCountry(rs.getString("country"));
		student.setGender(rs.getString("gender"));
		
		return student;
	}

}
