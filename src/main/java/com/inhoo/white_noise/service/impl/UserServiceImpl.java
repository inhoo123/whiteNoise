package com.inhoo.white_noise.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.inhoo.white_noise.models.UserVO;
import com.inhoo.white_noise.persistance.UserDao;
import com.inhoo.white_noise.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	protected final UserDao userDao;

	public UserServiceImpl(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public int insert(UserVO userVO) {
		List<UserVO> users = userDao.selectAll();
		if (users == null || users.size() < 1) {
			userVO.setUser_role("ADMIN");
		} else {
			userVO.setUser_role("USER");
		}
		int ret = userDao.insert(userVO);
		return ret;
	}

}
