package com.ty.shopping.controller;

import com.ty.shopping.dao.UserDao;
import com.ty.shopping.dto.User;

public class saveUserController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User user=new User();
		user.setName("rosy");
		user.setEmail("rosy@gmail.com");
		user.setPassword("rosy@123");
		user.setPhone("974128712");
		
		UserDao userDao=new UserDao();
		User res=userDao.saveUser(user);
		if(res!=null)
		{
			System.out.println("data inserted");
		}
		else
		{
			System.out.println("user didnot get inserted");
		}
	}

}
