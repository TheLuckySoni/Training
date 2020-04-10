package com.soni.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("nonveg")
public class NonVegChefController {
	@ResponseBody
	@RequestMapping("/getFood")
	public String prepareFood() {
		return "<h1>your Non-Veg Food Order is getting Prepared!!!</h1>";

	}
}
