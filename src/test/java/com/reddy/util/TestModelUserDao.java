package com.reddy.util;

import com.reddy.Model.ModelUser;
import com.reddy.ModelDao.ModelUserDao;

public class TestModelUserDao {
	public static void main(String[] args) throws Exception {	
ModelUserDao con2=new ModelUserDao();
ModelUser user=new ModelUser();
user.setId(57557);
user.setName("reddy");
user.setUsername("pavan");
user.setPassward("123ser");
user.setMobile_no(1238);
user.setEmail_id("reddddddddy@");
user.setActive("a");
user.setRole("manager");
con2.insertUser(user);
}

}
