package com.inhoo.white_noise.persistance;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.inhoo.white_noise.models.UserVO;

public interface UserDao {
	
	public int insert(UserVO userVO);
	
	@Select("SELECT * FROM tbl_users WHERE user_email= #{user_email} ")
	public UserVO loginByUserEmailAndPassword(String user_email);
	
	@Select("SELECT * FROM tbl_users")
	public List<UserVO> selectAll();
	
}
