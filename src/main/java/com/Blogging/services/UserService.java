package com.Blogging.services;

import java.util.List;

import com.Blogging.payload.UserDto;

public interface UserService {
	
	UserDto registerNewUser(UserDto user);

	UserDto createUser(UserDto user);
	
	UserDto updateUser(UserDto user,Integer userId);
	
	UserDto getSingleUser(Integer userId);
	
	List<UserDto> getAllUsers(Integer userId);
	
	void deleteUserById(Integer userId);
	
}
