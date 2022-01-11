package com.sj.plan.image.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.sj.plan.image.service.ImageService;

@Controller
public class ImageController {

	@Autowired
	private ImageService imageService;

}
