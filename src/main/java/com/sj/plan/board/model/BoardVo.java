package com.sj.plan.board.model;

import org.springframework.stereotype.Repository;

import lombok.Data;

@Repository
@Data
public class BoardVo {
	private String bbsNo;
    private String grpNo;		/*부모글번호*/
    private String grpOrd;		/*그룳내순서*/
    private String depth;		/*답글레벨*/
    private String userNo;		/*작성자*/
    private String title;		/*제목*/
    private String content;		/*내용*/
    private String readCnt;		/*조회수*/
    private String bbsCd;		/*게시판 코드*/
	private String redDt;		/*등록일*/
	private String modiDt;		/*수정일*/	
}