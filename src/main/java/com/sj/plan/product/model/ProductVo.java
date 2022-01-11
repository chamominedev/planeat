package com.sj.plan.product.model;

import org.springframework.stereotype.Repository;

import lombok.Data;

@Repository
@Data
public class ProductVo {
    private String productNo;
    private String title;			/*상품이름*/
    private String content;			/*상품설명*/
    private String category;		/*카테고리*/
    private String pCount;			/*상품개수*/
    private String pPrize;			/*상품가격*/
    private String deliveryPrize;	/*배송비*/
    private String pType;			/*상품선택*/
    private String readCnt;			/*조회수*/
    private String redDt;			/*등록일*/
    private String modiDt;			/*수정일*/
}