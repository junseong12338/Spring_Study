package kr.co.softcampus.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.softcampus.beans.DataBean;
import kr.co.softcampus.beans.DataBean2;

@Controller
public class TestController {
	// map 으로 넘어오는 데이터 파라메터로 넘어오는 데이터는 형변환이 이루어지지 않는다
		// 그래서 문자로 값을 받아야 한다.
	@GetMapping("/test1")
	public String test1(@RequestParam Map<String, String> map,@RequestParam List<String> data3 ) {
		String data1 = map.get("data1");
		String data2 = map.get("data2");
		String data33 = map.get("data3");
		
		System.out.printf("data1 :%s\n",data1);
		System.out.printf("data2 :%s\n",data2);
		System.out.printf("data3 :%s\n",data33);
		
		for(String str : data3) {
			System.out.printf("data3 :%s\n",str);
		}
		return "result";
	}
	
	@GetMapping("/test2")
	public String test2( DataBean bean1, DataBean2 bean2) {
		System.out.printf("data1 :%d\n",bean1.getData1());
		System.out.printf("data2 :%d\n",bean1.getData2());
		
		for(int number1 : bean1.getData3()) {
			System.out.printf("data3 :%d\n",number1);
		}
		
		System.out.printf("bean1.getData2 :%d\n",bean2.getData1());
		System.out.printf("bean2.getData2 :%d\n",bean2.getData2());
		
		
		return "result";
	}
}
