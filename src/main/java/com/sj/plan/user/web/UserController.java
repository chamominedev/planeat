package com.sj.plan.user.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.JsonObject;
import com.sj.plan.user.model.UserVo;
import com.sj.plan.user.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	/**
	 * 22.01.04 김재호
	 * main 페이지 접근
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String main() {
		return "main";
	}
	
	@RequestMapping(value = "logout", method = RequestMethod.GET)
	public ModelAndView logout(HttpServletRequest request) {
		request.getSession().invalidate();
		request.getSession(true);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("user/logout");
		return mv;
	}

	/**
	 * 	HttpSession httpSession = request.getSession(true);
	 *	httpSession.setAttribute("userVo", userVo2);
	 * */

	@RequestMapping(value = "user", method = RequestMethod.GET)
	public String userInfo(String hiamId) {
		JsonObject result = new JsonObject();

		result.addProperty("result", "0000");
		result.addProperty("data", "SUCCESS");

		return result.toString();

	}

	@RequestMapping(value = "user", method = RequestMethod.PUT)
	public String userUpdate(@RequestBody UserVo userVo) {
		JsonObject result = new JsonObject();
	//	result.addProperty("result", "0000");
	//	result.addProperty("data", "SUCCESS");
		return result.toString();
	}

	@RequestMapping(value = "user", method = RequestMethod.DELETE)
	public String userDelete(@RequestBody UserVo userVo) {
		JsonObject result = new JsonObject();
		//	result.addProperty("result", "0000");
		//	result.addProperty("data", "SUCCESS");
		return result.toString();
	}
}
