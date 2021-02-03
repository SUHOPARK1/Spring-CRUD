package com.tplus.gwland.uss.web;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tplus.gwland.uss.service.*;

@Controller
@RequestMapping("/client/*")
public class ClientController {

	@Inject
	 private ClientService service;

	 @RequestMapping(value = "/list", method = RequestMethod.GET)
	 public void getList(Model model) throws Exception {
	  
	  List list = null;
	  list = service.list();
	  model.addAttribute("list", list);
	 }
}




