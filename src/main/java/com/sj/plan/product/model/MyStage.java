package com.sj.plan.product.model;

import org.springframework.stereotype.Repository;

import lombok.Data;

@Repository
@Data
public class MyStage {
    private String zzimNo;
    private String productNo;	/*상품번호*/
    private String userNo;		/*회원번호*/
    private String itemType;	/*항목타입*/
    private String redDt;		/*등록일*/
    private String modiDt;		/*수정일*/
}