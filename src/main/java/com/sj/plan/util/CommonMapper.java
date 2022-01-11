package com.sj.plan.util;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommonMapper {
	SearchSaveVo insert(SearchSaveVo searchSaveVo);
	SearchSaveVo select(SearchSaveVo searchSaveVo);
}