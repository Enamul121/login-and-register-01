package com.app.service;

import com.app.model.User;

public interface UserService {

	 User findUserByEmail(String email);
	
	  void saveUser(User user);
}
