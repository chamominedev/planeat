package com.sj.plan.image.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sj.plan.image.mapper.ImageMapper;
import com.sj.plan.image.model.ImageVo;
import com.sj.plan.image.service.ImageService;

@Service
public class ImageServiceImpl implements ImageService {

	@Autowired
	private ImageMapper imageMapper;

	@Override
	public ImageVo insert(ImageVo ImageVo) {
		return imageMapper.insert(ImageVo);
	}

	@Override
	public ImageVo select(ImageVo ImageVo) {
		return imageMapper.select(ImageVo);
	}

	@Override
	public ImageVo update(ImageVo ImageVo) {
		return imageMapper.update(ImageVo);
	}

	@Override
	public ImageVo delete(ImageVo ImageVo) {
		return imageMapper.delete(ImageVo);
	}
}