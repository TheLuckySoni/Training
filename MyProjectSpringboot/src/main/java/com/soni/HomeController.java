package com.soni;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String hello() {
		System.out.println("Hello From Home controller");
		return "index";
	}


	@RequestMapping("add")
	public ModelAndView myAdd(@RequestParam("val1") int i, @RequestParam("val2") int j) {
		ModelAndView mv = new ModelAndView();
		Integer val3 = i + j;
		mv.addObject("num", val3);
		mv.setViewName("result");
		System.out.println("From myAdd method");
		return mv;
	}
}
