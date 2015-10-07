package com.sapient.cui;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;




public class EmpMapper implements RowMapper<Emp>{

	
	public Emp mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Emp emp = new Emp();
		emp.setEmployee_id(rs.getInt("employee_id"));
		emp.setFirst_name(rs.getString("first_name"));
		emp.setSalary(rs.getInt("salary"));
		return emp;
	}
   
}
