package com.sj.plan.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sj.plan.board.mapper.BoardMapper;

@Service
public class CommonServiceImpl implements CommonService {

	@Autowired
	private CommonMapper commonMapper;

	@Override
	public SearchSaveVo insert(SearchSaveVo searchSaveVo) {
		return commonMapper.insert(searchSaveVo);
	}

	@Override
	public SearchSaveVo select(SearchSaveVo searchSaveVo) {
		return commonMapper.select(searchSaveVo);
	}

}