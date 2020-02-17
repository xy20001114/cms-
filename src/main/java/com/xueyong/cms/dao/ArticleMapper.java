package com.xueyong.cms.dao;


import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.xueyong.cms.pojo.Article;
import com.xueyong.cms.pojo.Collect;

public interface ArticleMapper extends BaseDao<Article> {

	@Select("select * from cms_article where channel_id=#{ids} and id!=#{id}")
	List<Article> selects(@Param("id")Integer id,@Param("ids")Integer integer);

	@Select("select * from cms_article where hits>=20 ORDER BY hits desc")
	List<Article> gethotselect();

	/* 判断文章是否相同，查找文章的id */
	@Select("select * from cms_article where title=#{text}")
	Article selectctId(String text);


}
