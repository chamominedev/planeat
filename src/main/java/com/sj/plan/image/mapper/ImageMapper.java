package com.sj.plan.image.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.sj.plan.board.model.BoardVo;
import com.sj.plan.image.model.ImageVo;

@Mapper
public interface ImageMapper {
	ImageVo insert(ImageVo imageVo);
	ImageVo select(ImageVo imageVo);
	ImageVo update(ImageVo imageVo);
	ImageVo delete(ImageVo imageVo);
}