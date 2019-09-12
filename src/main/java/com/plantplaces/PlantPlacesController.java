package com.plantplaces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author Administrator
 * Handle the /start endpoint
 * @return
 */

@Controller
public class PlantPlacesController {
	
	@RequestMapping("/start" ) // When a URL is entered, any address that ends with "/start" will map to this method.
	public String start() {
		
		return "start";
	}
	@RequestMapping("/start" ) 
	public String index() {
		
		return "start";
	}

}
