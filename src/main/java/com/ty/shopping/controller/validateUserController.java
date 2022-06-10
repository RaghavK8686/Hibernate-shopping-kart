package com.ty.shopping.controller;

import com.ty.shopping.dto.User;
import com.ty.shopping.services.UserService;

public class validateUserController {

	public static void main(String[] args) {
		UserService userService=new UserService();
		
		User user=userService.validateUser("ananaya", "ananya@gmail.com");
		if(user!=null)
		{
			System.out.println("id is :"+user.getId());
			System.out.println("name is :"+user.getName());
			System.out.println("email is :"+user.getEmail());
			System.out.println("password is :"+user.getPassword());
			System.out.println("phone is :"+user.getPhone());
			System.out.println("*******");
		}
		else
		{
			System.out.println("User not found");
		}
	}
}
