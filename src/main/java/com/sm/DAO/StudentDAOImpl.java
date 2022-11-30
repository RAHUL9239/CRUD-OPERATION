package com.sm.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sm.Mapper.StudentRowMapper;
import com.sm.api.Student;

@Repository
public class StudentDAOImpl implements StudentDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Student> loadStudents() {

		String sql = "SELECT * FROM students";
		List<Student> theListOfStudent = jdbcTemplate.query(sql, new StudentRowMapper());

		return theListOfStudent;
	}

	@Override
	public void saveStudent(Student student) {

		Object[] sqlParamters = { student.getName(),student.getLastname(), student.getMobile(), student.getCountry(), student.getGender() };

		String sql = "insert into students(name,lastname, mobile, country, gender) values(?,?,?,?,?)";

		jdbcTemplate.update(sql, sqlParamters);

		System.out.println("one record added");

	}

	@Override
	public Student getStudent(int id) {

		String sql = " SELECT * FROM STUDENTS WHERE ID = ?";

		Student student = jdbcTemplate.queryForObject(sql, new StudentRowMapper(), id);

		return student;
	}

	@Override
	public void update(Student student) {

		String sql = "UPDATE STUDENTS SET name=?, lastname=?,  mobile=?, country=?, gender=? WHERE id = ? ";
		jdbcTemplate.update(sql, student.getName(), student.getLastname(), student.getMobile(), student.getCountry(), student.getGender(), student.getId());
		System.out.println("one record update");

	}

	@Override
	public void deleteStudent(int id) {

		String sql = " DELETE FROM STUDENTS WHERE ID = ? ";
		jdbcTemplate.update(sql, id);

	}

}
