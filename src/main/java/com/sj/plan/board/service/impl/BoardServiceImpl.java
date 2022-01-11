package com.sj.plan.board.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sj.plan.board.mapper.BoardMapper;
import com.sj.plan.board.model.BoardVo;
import com.sj.plan.board.service.BoardService;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardMapper boardMapper;

	@Override
	public BoardVo insert(BoardVo boardVo) {
		return boardMapper.insert(boardVo);
	}

	@Override
	public BoardVo select(BoardVo boardVo) {
		return boardMapper.select(boardVo);
	}

	@Override
	public BoardVo update(BoardVo boardVo) {
		return boardMapper.update(boardVo);
	}

	@Override
	public BoardVo delete(BoardVo boardVo) {
		return boardMapper.delete(boardVo);
	}
}