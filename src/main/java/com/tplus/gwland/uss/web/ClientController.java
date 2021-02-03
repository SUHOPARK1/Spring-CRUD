package com.tplus.gwland.uss.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import com.tplus.gwland.uss.service.*;

@RestController
@RequestMapping("/client")
public class ClientController {
	 private final Logger logger = LoggerFactory.getLogger(this.getClass());
	    @Autowired
	    ClientService clientService;
	    
	    @GetMapping("/list")
	    public Map<?, ?> list(){
	    	var map = new HashMap<>();
	    	map.put("message", (clientService.list == 1) ? "SUCCESS":"FAILURE");
	        logger.info("======= 학생 목록 조회 ======= ");
	        return map;
	    }
	 }






