package com.onebanana.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {
	
	
	
	public LoginDAO() {
		
		
	}

	public boolean checkLogin(String uname, String password) {
		// TODO Auto-generated method stub
		Connection con = Dbconnection.getConnection();
		ResultSet rs = null;
		PreparedStatement ps = null;
		
		try {
			ps = con.prepareStatement("SELECT USERNAME,PASSWORD FROM  LOGINCREDENTIALS WHERE USERNAME =? AND PASSWORD=?");
        	ps.setString(1, uname);
            //ps.setString(2, password);
			
			rs = ps.executeQuery();
			if(rs.getRow() > 0)
				return true;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		return false;
	}

}
