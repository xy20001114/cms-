package com.xueyong.maven;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xueyong.cms.dao.ArticleMapper;
import com.xueyong.cms.pojo.Article;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class ArticleTest {

	@Autowired
	private ArticleMapper articleMapper;
	
	@Test
	public void show() {
		List<Article> select = articleMapper.select();
		System.out.println(select);
	}
}
