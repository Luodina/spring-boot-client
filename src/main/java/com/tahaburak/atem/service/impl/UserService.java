package com.tahaburak.atem.service.impl;

import com.tahaburak.atem.dao.IUserDao;
import com.tahaburak.atem.model.User;
import com.tahaburak.atem.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * Created by burak on 25.11.2019
 */
@Service
public class UserService implements IUserService {

	private IUserDao userDao;

	public UserService(IUserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public User getUserById(Long id) {
		return userDao.findUserById(id);
	}
}
