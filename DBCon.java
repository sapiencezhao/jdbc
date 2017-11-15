package com.lh.dao;
import java.sql.*;
public class DBCon {
	private static Connection conn = null;
	public static Connection getConn(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String user="root";
			String pwd="111";
			String url="jdbc:mysql://localhost:3306/db_database07";
			conn=DriverManager.getConnection(url, user, pwd);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
