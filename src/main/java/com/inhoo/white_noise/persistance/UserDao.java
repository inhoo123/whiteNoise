package com.inhoo.white_noise.persistance;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.inhoo.white_noise.models.UserVO;

public class UserDao {
 
	public int insert(UserVO userVO);
	
	@Select("SELECT * FROM USERS")
	public List<UserVO> selectAll();
}
