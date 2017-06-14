package com.reddy.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtil {
	 public static Connection getConnectionUtil() throws Exception{
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 String url = "jdbc:mysql://localhost:3306/pavani?useSSL=false";
		 Connection con = DriverManager.getConnection(url,"root","reddy");
		 return con;
	 }


}
