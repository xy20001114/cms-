package com.xueyong.maven.dao;

import java.util.List;

import com.xueyong.maven.pojo.User;

public interface BaseDao<T> {

	//列表查询
		List<T> select();
		//单条数据查询
		User selectById(Integer id);
		//单条修改
		int update(T t);
		//删除
		int delete(int ids);
		//添加
		int insert(T t);
}
