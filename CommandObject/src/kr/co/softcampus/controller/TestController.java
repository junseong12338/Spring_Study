package kr.co.softcampus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.softcampus.beans.DataBean;

@Controller
public class TestController {
	
	
//	@PostMapping("/test1")
//	public String test1(@ModelAttribute DataBean bean) {
//		System.out.println("data1 : "+bean.getData1());
//		System.out.println("data2 : "+bean.getData2());
//		
//		return "test1";
//	}
	
	// @ModelAttribute 이름을 지정하지 않는다면 생략가능
	// 이름을 지정하지않으면 해당클래스의 앞글자 소문자를 사용함 
	// ex DataBean -> dataBean
	@PostMapping("/test1")
	public String test1(DataBean bean) {
		System.out.println("data1 : "+bean.getData1());
		System.out.println("data2 : "+bean.getData2());
		
		return "test1";
	}
	// 이름 지정
	@PostMapping("/test2")
	public String test2(@ModelAttribute("testData") DataBean bean) {
		System.out.println("data1 : "+bean.getData1());
		System.out.println("data2 : "+bean.getData2());
		
		return "test2";
	}
}
