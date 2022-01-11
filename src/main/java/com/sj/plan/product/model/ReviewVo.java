package com.sj.plan.product.model;

import org.springframework.stereotype.Repository;

import lombok.Data;

@Repository
@Data
public class ReviewVo {
    private String reviewNo;
    private String productNo;	/*상품번호*/
    private String userNo;		/*회원번호*/
    private String title;		/*제목*/
    private String content;		/*내용*/
    private String star;		/*상품개수*/
    private String readCnt;		/*조회수*/
    private String redDt;		/*등록일*/
    private String modiDt;		/*수정일*/
}