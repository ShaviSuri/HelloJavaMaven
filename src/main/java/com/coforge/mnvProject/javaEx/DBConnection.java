package com.coforge.mnvProject.javaEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnection {
	
	public static void main(String[] args) {
		Connection con;
		Statement st = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javafsd","root","root");
			st = con.createStatement();
			String sql = "select * from products";
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				System.out.println(rs.getString(2));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
