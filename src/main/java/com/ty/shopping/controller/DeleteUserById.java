package com.ty.shopping.controller;

import com.ty.shopping.dto.User;

import com.ty.shopping.services.UserService;

public class DeleteUserById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UserService userservice=new UserService();
		userservice.deleteUserById(1);
	}

}
