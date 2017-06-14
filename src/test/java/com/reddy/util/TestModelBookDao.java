package com.reddy.util;

import java.time.LocalDate;

import com.reddy.Model.ModelBook;
import com.reddy.ModelDao.ModelBookDao;


public class TestModelBookDao {
	public static void main(String[] args) throws Exception {
		ModelBookDao con3=new ModelBookDao();
		ModelBook user=new ModelBook();
		user.setIsbn(9);
		user.setTitle("times of india");
		user.setAuthor("bbroy");
		user.setContent("knowledge");
		user.setPublishdate(LocalDate.parse("2006-11-12"));
		user.setStatus("no1");
		user.setPrice(1200);
		con3.insertBook(user);

}

}
