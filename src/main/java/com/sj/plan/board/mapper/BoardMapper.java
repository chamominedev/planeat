package com.sj.plan.board.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.sj.plan.board.model.BoardVo;

@Mapper
public interface BoardMapper {
	BoardVo insert(BoardVo boardVo);
	BoardVo select(BoardVo boardVo);
	BoardVo update(BoardVo boardVo);
	BoardVo delete(BoardVo boardVo);
}