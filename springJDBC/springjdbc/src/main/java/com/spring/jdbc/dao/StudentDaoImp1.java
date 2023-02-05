package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities1.Student;

public class StudentDaoImp1 implements StudentDao{

	public int insert()
	{
		return 0;
		
	}
	
	private JdbcTemplate jdbcTemplate;
	

	public int insert(Student student) {
        String query = "INSERT INTO student(id,name,city) VALUES(?,?,?)";
        int r = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
        
		return r;
	}


	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	public int change(Student student) {
		//updating data
		String query = "UPDATE student SET name=?,city=? WHERE id=?";
		int r = this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return r;
		
		
	}


	public int delete(int studentID) {
		//delete operation
		String query = "DELETE  FROM student WHERE id=?";
		int r = this.jdbcTemplate.update(query,studentID);
		return r;
	}


	public Student getStudent(int studentID) {
		//select one record of student
		
		String query = "SELECT * FROM STUDENT WHERE id=?";
		RowMapper<Student> rowMapper = new RowMapperImp();
		Student student = this.jdbcTemplate.queryForObject(query, rowMapper,studentID);
		
		return student;
	}


	public List<Student> getAllStudents() {
		//selecting multiple students
		
		String query="SELECT * FROM student";
		List<Student> students = this.jdbcTemplate.query(query,new RowMapperImp());
		return students;
	}
	
	
}
