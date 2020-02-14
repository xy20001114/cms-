package com.xueyong.cms.dao;


import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.xueyong.cms.pojo.Article;

public interface ArticleMapper extends BaseDao<Article> {

	@Select("select * from cms_article where channel_id=#{ids} and id!=#{id}")
	List<Article> selects(@Param("id")Integer id,@Param("ids")Integer integer);

	@Select("select * from cms_article where hits>=20 ORDER BY hits desc")
	List<Article> gethotselect();


}
