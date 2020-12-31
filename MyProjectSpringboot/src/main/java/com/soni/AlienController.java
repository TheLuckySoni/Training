package com.soni;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AlienController {
	
	@RequestMapping("aliens")
	public String getAliens() {
		
		
		return "result";
	}
	

}
