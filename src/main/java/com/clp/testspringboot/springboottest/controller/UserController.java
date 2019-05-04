package com.clp.testspringboot.springboottest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *      测试controller
 * @author hand
 * Date 2019-05-04
 */
@RestController
public class UserController {
	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}
}
