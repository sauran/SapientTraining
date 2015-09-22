/**
 * 
 */
package com.sapient.model;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 * @author span42
 *
 */
public class User implements Serializable {
	private String fname;
	private String lname;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public boolean validateLogin(String username,String password){
		//Lookup for Datasource
		Context ctx = null;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet  rs = null;
		
		try {
			ctx = new InitialContext();
			DataSource ds = (DataSource)ctx.lookup("java:comp/env/jdbc/DemoProject");
			//Obtain a connection
			
			con = ds.getConnection();
			
			//Query the database
			
			ps  = con.prepareStatement("SELECT FIRSTNAME ,LASTNAME FROM  USERS WHERE USERID =? AND PASSWD =?");
			ps.setString(1, username);
			ps.setString(2, password);
			
			rs = ps.executeQuery();
			
			if(rs.next()){
				
				fname = rs.getString(1);
				lname = rs.getString(2);
				return true;
			}
			
			
			/*if(username.equalsIgnoreCase("admin")&& password.equals("admin")){
				return true;
			}*/
			return false;
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				if(ctx!=null){
					ctx.close();
				}
				if(con!=null){
					con.close();
				}
				if(ps!=null){
					ps.close();
				}
				if(rs!=null){
					rs.close();
				}
			} catch (NamingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return false;
	}
	public String getFullName(){
		
		return fname + ' ' + lname;
	}
	
	public List getListName(){
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(45);
		list.add(454);
		list.add(875);
		
		return list;
		
		
	}

}
