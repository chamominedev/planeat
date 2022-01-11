package com.sj.plan.board.service;

import com.sj.plan.board.model.BoardVo;

public interface BoardService {
	BoardVo insert(BoardVo boardVo);
	BoardVo select(BoardVo boardVo);
	BoardVo update(BoardVo boardVo);
	BoardVo delete(BoardVo boardVo);
}
