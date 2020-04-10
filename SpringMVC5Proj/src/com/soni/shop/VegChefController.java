package com.soni.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/veg")
public class VegChefController {
	@ResponseBody
	@RequestMapping("/getFood")
	public String prepareFood(@RequestParam(value = "orderId") int id) {
		return "your veg Food Order is getting Prepared!!! & your Order Id is " + id;

	}
}
