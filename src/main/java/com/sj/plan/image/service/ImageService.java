package com.sj.plan.image.service;

import com.sj.plan.image.model.ImageVo;

public interface ImageService {
	ImageVo insert(ImageVo imageVo);
	ImageVo select(ImageVo imageVo);
	ImageVo update(ImageVo imageVo);
	ImageVo delete(ImageVo imageVo);
}
