package com.spring.jdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImp1;

@Configuration
public class JdbcConfig {

	@Bean(name={"ds"})
	public DataSource getDataSource() {
		
		System.out.println("hi");
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.spring.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("");
		return ds;
		
	}
	
	@Bean(name={"jdbcTemplate"})
	public JdbcTemplate getTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		
		return jdbcTemplate;
		
	}
	
	@Bean(name= {"studentDao"})
	public StudentDao getStudentDao() {
		StudentDaoImp1 studentDao = new StudentDaoImp1();
		studentDao.setJdbcTemplate(getTemplate());
		return  studentDao;
		
	}
	
	
	
	
}
