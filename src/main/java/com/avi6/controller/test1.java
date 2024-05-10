package com.avi6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/trip")
public class test1 {

	@GetMapping("/main")
	public void main() {
		System.out.println("메인 부름");
	}
}
