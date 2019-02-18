package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseUtil {
	
	private static final String drivername= "oracle.jdbc.driver.OracleDriver";
	private static final String url= "jdbc:oracle:thin:@intvmoradb04:1521:ORAJAVADB"; 
	private static final String username= "TVM1819_TVM36_TJA183__TEST";
	private static final String password= "tcstvm36"; 
	
	
	public static Connection getConnection(){
		
		Connection conn = null;
		
		try {
				Class.forName(drivername);
				
				conn = DriverManager.getConnection(url, username, password);
				
				
		} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("Driver cannot be loaded");
				
		}catch (SQLException e ) {
			// TODO Auto-generated catch block
			System.out.println("Cannection cannot be established");
		}
		
		return conn;
	}
	
	
	public static void closeConnection(Connection conn){
		
		if(conn != null){
			
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	public static void closeStatement(PreparedStatement ps){
		
		if(ps != null){
			try{
				ps.close();
			}
		 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	}
}
