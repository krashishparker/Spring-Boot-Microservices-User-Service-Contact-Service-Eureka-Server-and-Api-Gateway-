package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;

@Service
public class UserServiceImpl implements UserService {

	List<User> list= List.of(
			new User(121L,"Ashish Kumar","93489321"),
			new User(131L,"Tony Stark","91345321"),
			new User(141L,"Steve Rogers","23456321"),
			new User(151L,"Peter Parker","78932321")
			);
	
	@Override
	public User getUser(Long Id) {
		// TODO Auto-generated method stub
		return this.list.stream().filter(user->user.getUser_id()==Id).findAny().orElse(null);
		
	}

}
