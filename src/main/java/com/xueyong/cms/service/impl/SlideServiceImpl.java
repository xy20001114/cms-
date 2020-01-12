package com.xueyong.cms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xueyong.cms.dao.SlideMapper;
import com.xueyong.cms.pojo.Slide;
import com.xueyong.cms.service.SlideService;

@Service
public class SlideServiceImpl implements SlideService{
	@Autowired
	private SlideMapper slideMapper;
	@Override
	public List<Slide> getAll() {
		return slideMapper.select(null);
	}

}
