package com.tplus.gwland.uss.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;


import com.tplus.gwland.uss.service.Client;
import com.tplus.gwland.uss.service.ClientMapper;

@Service
public class ClientServiceImpl implements ClientService {

 @Inject
 private ClientMapper mapper;
 
 @Override
 public List<Client> list() throws Exception {
  return mapper.list();
 }

}