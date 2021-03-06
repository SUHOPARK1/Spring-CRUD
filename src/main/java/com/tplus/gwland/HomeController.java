package com.tplus.gwland;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
		 @GetMapping("/")
		    public String index() {
		        logger.info("home 진입");
		        return "home";
		    }

		    @GetMapping("/move/{dir}/{page}")
		    public String move(@PathVariable String dir, @PathVariable String page) {
		        return String.format("%s/%s", dir, page);
		    }

		    @GetMapping("/transfer/{dir}/{sub}/{page}")
		    public String transfer(@PathVariable String dir, @PathVariable String sub, @PathVariable String page) {
		        return String.format("%s/%s/%s", dir, sub, page);
		    }
		}
