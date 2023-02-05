package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities1.Student;
import java.util.List;
//import com.sun.tools.javac.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My program started...." );
        //JDBCTemplate object is required
        
        ApplicationContext context = 
        		new AnnotationConfigApplicationContext(JdbcConfig.class);
//        JdbcTemplate template = context.getBean("jdbcTemplate",JdbcTemplate.class);
//        
//        //insert query
//        String query = "INSERT INTO student(id,name,city) VALUES(?,?,?)";
//    
//        //fire the query
//        
//        int result = template.update(query,100,"Daliya","Texas");
//        System.out.println("number of records inserted  "+result);
        
        StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
        
        //inserting in table
        Student student = new Student();
        student.setId(443);
        student.setName("Dorky");
        student.setCity("Templeton");
        
        int result = studentDao.insert(student);
        System.out.println("Students added..."+result);
        
        //updating table
        Student student1 = new Student();
        student1.setId(229);
        student1.setName("Rainy");
        student1.setCity("Argentina");
        
        int updateResult = studentDao.change(student1);
        System.out.println("Students updated...."+updateResult);
        
        //deleting record
        
        Student student2 = new Student();
        int deleteRecord = studentDao.delete(300);
        System.out.println("Records deleted.... "+deleteRecord);
        
        //select student
        
        Student student3 = studentDao.getStudent(222);
        System.out.println(student3);
        
        //selecting multiple students
        
        List<Student> students =  studentDao.getAllStudents();
        for(Student s:students)
        {
        	System.out.println(s);
        }
    }
}

