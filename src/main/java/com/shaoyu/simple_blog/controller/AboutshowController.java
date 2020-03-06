package com.shaoyu.simple_blog.controller;

import com.shaoyu.simple_blog.DO.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AboutshowController {
	/**
	 *
	 * @return 名称 技能 介绍 联系方式 相关链接
	 *
	 */
	@GetMapping("/about")
	public User about() {

		return null;
	}
}
