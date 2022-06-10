package com.ty.shopping.controller;

import com.ty.shopping.dto.User;

import com.ty.shopping.services.UserService;


public class getUserByIdController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	UserService userService=new UserService();
	//User user=new User();
	userService.getUserById(1);
	}

}
