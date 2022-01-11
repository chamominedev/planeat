package com.sj.plan.user.model;

import org.springframework.stereotype.Repository;

import lombok.Data;

@Repository
@Data
public class ShippingAddressVo {
	private String shippingNo;
    private String userNo;		/*회원번호*/
	private String tel;			/*회원 연락처*/
	private String msg;			/*배송메시지*/
    private String baseYn;		/*기본배송지여부*/
	private String redDt;		/*등록일*/
	private String modiDt;		/*수정일*/
}