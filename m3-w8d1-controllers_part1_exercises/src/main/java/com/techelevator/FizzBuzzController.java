package com.techelevator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.techelevator.model.FizzBuzz;

@Controller
public class FizzBuzzController {
	
	@RequestMapping(path="/fizzBuzz", method=RequestMethod.GET)
	public String showFizzBuzz() {
		return "fizzBuzz";
	}
	
	@RequestMapping(path="/fizzBuzzResult", method=RequestMethod.GET)
	public String fizzBuzzed(@ModelAttribute FizzBuzz fizzed, ModelMap modelHolder) {
		modelHolder.put("fizzed", fizzed);
		
		return "fizzBuzzResult";
	}
}
