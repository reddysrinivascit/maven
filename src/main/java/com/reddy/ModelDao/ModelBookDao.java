package com.reddy.ModelDao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

import com.reddy.Model.ModelBook;
import com.reddy.util.ConnectionUtil;


public class ModelBookDao {
	public void insertBook(ModelBook user) throws Exception{
		String quary0="insert into Book(isbn,title,author,publishdate,content, price,status) values(?,?,?,?,?,?,?)";
		 Connection con=ConnectionUtil.getConnectionUtil();
		  PreparedStatement pst= con.prepareStatement(quary0);
	
		 pst.setInt(1,user.getIsbn());
		 pst.setString(2,user.getTitle());
		 pst.setString(3,user.getAuthor());
		 pst.setDate(4,Date.valueOf(user.getPublishdate()));
		 pst.setString(5,user.getContent());
		 pst.setInt(6,user.getPrice());
		 pst.setString(7,user.getStatus());
		
		  int row=pst.executeUpdate();
		System.out.println("no of row" +row);	

}}

