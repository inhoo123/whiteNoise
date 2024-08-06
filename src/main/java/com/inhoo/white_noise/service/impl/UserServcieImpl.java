package com.inhoo.white_noise.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.inhoo.white_noise.models.UserVO;
import com.inhoo.white_noise.persistance.UserDao;
@Service
public class UserServcieImpl {
	
	protected final UserDao userDao;

	public UserServcieImpl(UserDao userDao) {
		super();
		this.userDao = userDao;
	}
	@Override
	public int join(UserVO userVO) {
		List<UserVO> users = userDao.selectAll();
		if(users == null || users.size() < 1) {
			userVO.setRole("ADMIN");
		} else {
			userVO.setRole("USER");
		}
		int ret = userDao.insert(userVO);
		return ret;
	}
}
