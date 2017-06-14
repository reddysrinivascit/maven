package com.reddy.util;

import java.sql.Connection;


public class TestConnection {
	   public static void main(String[] args) throws Exception {
     	  Connection con=ConnectionUtil.getConnectionUtil();
			System.out.println(con);
		}

}
