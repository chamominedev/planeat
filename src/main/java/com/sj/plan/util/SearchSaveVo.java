package com.sj.plan.util;

import org.springframework.stereotype.Repository;

import lombok.Data;

@Repository
@Data
public class SearchSaveVo {
	private String searchNo;
    private String userNo;		/*회원번호*/
	private String word;		/*검색어*/
	private String searchCnt;	/*검색횟수*/
	private String redDt;		/*등록일*/
}