package com.reddy.ModelDao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.reddy.Model.ModelUser;
import com.reddy.util.ConnectionUtil;

public class ModelUserDao {
	public void insertUser(ModelUser user) throws Exception{
		String quary0="insert into User(id,name,username,passward,mobile_no,email_id,active,role) values(?,?,?,?,?,?,?,?)";
		 Connection con=ConnectionUtil.getConnectionUtil();
		  PreparedStatement pst= con.prepareStatement(quary0);
		  pst.setInt(1,user.getId());
		  pst.setString(2,user.getName());
		  pst.setString(3,user.getUsername());
		 pst.setString(4,user.getPassward());
		 pst.setInt(5,user.getMobile_no());
		 pst.setString(6,user.getEmail_id());
		 pst.setString(7,user.getActive());
		 pst.setString(8,user.getRole());
		  int row=pst.executeUpdate();
		System.out.println("no of row" +row);	
		 
		
	
		// TODO Auto-generated method stub
		
	}

}
