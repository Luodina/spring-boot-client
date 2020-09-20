package com.tahaburak.atem.dao;

import com.tahaburak.atem.model.User;

/**
 * Created by burak on 24.11.2019
 */
public interface IUserDao {
	User findUserById(Long id);
}
