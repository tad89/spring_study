package com.study.tad;

import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.ModelAndView;

@Repository
public class TestDao {
	ModelAndView mav;
	
	public ModelAndView test(){
		mav = new ModelAndView();
		mav.addObject("testDao", "testDao에서 출력");
		return mav;
	}
}
