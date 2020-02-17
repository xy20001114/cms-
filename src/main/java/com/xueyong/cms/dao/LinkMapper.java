package com.xueyong.cms.dao;

import java.util.List;

import com.xueyong.cms.pojo.Link;

public interface LinkMapper extends BaseDao<Link> {

	List<Link> select();


}
