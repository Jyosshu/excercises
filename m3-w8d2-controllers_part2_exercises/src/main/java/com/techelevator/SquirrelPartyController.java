package com.techelevator;

import java.time.LocalDateTime;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.techelevator.model.Review;
import com.techelevator.model.ReviewDao;

@Controller 
public class SquirrelPartyController {
	
	@Autowired
	ReviewDao reviewDao;

	@RequestMapping(path="/", method=RequestMethod.GET)
	public String displayHomePage(ModelMap modelHolder) {
		List<Review> reviews = reviewDao.getAllReviews();
		
		modelHolder.put("reviews", reviews);
		return "index";
	}
	
	@RequestMapping(path="/review", method=RequestMethod.GET)
	public String displayReviewInput(ModelMap modelHolder) {
		if (! modelHolder.containsAttribute("review")) {
			modelHolder.put("review", new Review());
		}
		return "review";
	}
	
	@RequestMapping(path="/review", method=RequestMethod.POST)
	public String submitReview(@Valid @ModelAttribute Review newReview, BindingResult result, RedirectAttributes flash) {
		newReview.setDateSubmitted(LocalDateTime.now());
		
		flash.addFlashAttribute("review", newReview);
		
		if(result.hasErrors()) {
			
			flash.addFlashAttribute(BindingResult.MODEL_KEY_PREFIX + "review", result);
			return "redirect:/review";
		}
		
		reviewDao.save(newReview);
		
		return "redirect:/";
	}
}
