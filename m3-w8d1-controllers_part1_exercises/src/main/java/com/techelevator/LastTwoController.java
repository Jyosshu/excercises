package com.techelevator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.techelevator.model.LastTwo;

@Controller
public class LastTwoController {
	@RequestMapping(path="/lastTwo", method=RequestMethod.GET)
	public String showLastTwo() {
		
		return "lastTwo";
	}
	
	@RequestMapping(path="/lastTwoResult", method=RequestMethod.GET)
	public String showReverseLastTwoResult(@ModelAttribute LastTwo theLastTwo, ModelMap modelHolder) {
		modelHolder.put("theLastTwo", theLastTwo);
		return "lastTwoResult";
	}
}
