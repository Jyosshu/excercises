package com.techelevator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.techelevator.model.OrderedName;

@Controller 
public class OrderedNameController {

	@RequestMapping({"/","/orderedName"})
	public String showOrderedName() {
		
		return "orderedName";
	}
	
	@RequestMapping("/orderedResult")
	public String orderName(@ModelAttribute OrderedName arrangedName, ModelMap mapHolder) {
		
		mapHolder.put("arrangedName", arrangedName);
		return "orderedResult";
	}
}
