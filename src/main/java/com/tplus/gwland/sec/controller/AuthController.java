package com.tplus.gwland.sec.controller;

import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tplus.gwland.sec.mapper.AuthMapper;
import com.tplus.gwland.uss.service.Client;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Scope("session")
@Controller
@RequestMapping("/auth")
public class AuthController {
	private final AuthMapper authMapper;
	
	@PostMapping("/client/login")
	public Map<?,?> clientLogin(@RequestBody Client client){
		return null;
	}
	
	
}









