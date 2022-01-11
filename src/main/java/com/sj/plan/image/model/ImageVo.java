package com.sj.plan.image.model;

import org.springframework.stereotype.Repository;

import lombok.Data;

@Repository
@Data
public class ImageVo {
    private String imageNo;   
    private String keyword;		/*조회값(게시판,상품,유저)*/
    private String filePath;	/*파일경로*/
    private String redDt;		/*등록일*/
    private String modiDt;		/*수정일*/
}