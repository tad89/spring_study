package com.study.tad;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service
public class TestService {
	
	ModelAndView mav;
	
	TestDao testdao;
	
	public TestService(TestDao testdao){
		this.testdao = testdao;
	}
	
	public ModelAndView test(){
		
		mav = testdao.test();
		mav.addObject("test", "service에서 심음");
		return mav;
	}
}
