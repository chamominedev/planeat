package com.sj.plan.user.model;

import org.springframework.stereotype.Repository;

import lombok.Data;

@Repository
@Data
public class UserVo {
	private String userNo;
	private String email; 		/*회원 이메일*/
	private String password; 	/*회원 비밀번호*/
	private String nm; 			/*회원 이름*/
	private String tel;  		/*회원 연락처*/
    private String address;  	/*회원 주소*/
	private String recommender; /*추천인*/
    private String social;  	/*소셜로그인인증업체*/
	private String noticeYn;  	/*문자1/이메일3/전체동의5*/
	private String auth;  		/*유저 권한*/
	private String userRank;  	/*고객 등급*/
	private String point;  		/*포인트*/
	private String redDt;  		/*등록일*/
	private String modiDt; 		/*수정일*/
}