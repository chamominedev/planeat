package com.sj.plan.board.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.sj.plan.board.service.BoardService;

@Controller
public class BoardController {

	@Autowired
	private BoardService boardService;

}
