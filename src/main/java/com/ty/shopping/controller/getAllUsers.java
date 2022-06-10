package com.ty.shopping.controller;

import java.util.List;

import com.ty.shopping.dto.User;
import com.ty.shopping.services.UserService;

public class getAllUsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UserService userService=new UserService();
		
		List<User> list=userService.getAllUsers();
		for(User e:list)
		{
			System.out.println("id is :"+e.getId());
			System.out.println("name is :"+e.getName());
			System.out.println("email is :"+e.getEmail());
			System.out.println("password is :"+e.getPassword());
			System.out.println("phone is :"+e.getPhone());
			System.out.println("************");	
		}
		
	}

}
