package com.tahaburak.atem.dao.impl;

import com.tahaburak.atem.dao.IUserDao;
import com.tahaburak.atem.model.User;
import com.tahaburak.atem.service.IDummyService;
import org.springframework.stereotype.Component;

/**
 * Created by burak on 24.11.2019
 */
@Component
public class UserDao implements IUserDao {

	private IDummyService dummyService;

	public UserDao(IDummyService dummyService) {
		this.dummyService = dummyService;
	}

	@Override
	public User findUserById(Long id) {
		return dummyService.getDummyUserById(id);
	}
}
