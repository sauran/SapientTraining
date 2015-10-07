package com.sapient.cui;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class MainApp {
   public static void main(String []args) {
	   ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	   
	   DataSource dataSource = (DataSource) context.getBean("dataSource");
	   JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
	   String sql = "select first_name from employees where employee_id= ? and salary= ?";
	   String name = jdbcTemplate.queryForObject(sql,new Object[]{107,4200},String.class);
	   
	   System.out.println(name);
	   
	   sql = "select * from employees where employee_id= ?";
	   Emp emp = jdbcTemplate.queryForObject(sql,new Object[]{108},new EmpMapper());
	   
	   System.out.println(emp);
   }
}
