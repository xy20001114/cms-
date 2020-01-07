package com.xueyong.maven;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xueyong.maven.dao.UserMapper;
import com.xueyong.maven.pojo.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class UserTest {

	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void show() {
		List<User> select = userMapper.select();
		System.out.println(select);
		User selectById = userMapper.selectById(199);
		System.out.println(selectById);
		User user = new User();
		user.setId(199);
		user.setUsername("薛永3");
		/*
		 * int insert = userMapper.insert(user); System.out.println(insert);
		 */
		/*
		 * int update = userMapper.update(user); System.out.println(update);
		 */
		int delete = userMapper.delete(201);
		System.out.println(delete);
	}
	
}
