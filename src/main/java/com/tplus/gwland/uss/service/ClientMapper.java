package com.tplus.gwland.uss.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tplus.gwland.uss.service.Client;


@Repository
public interface ClientMapper {
	public int insert(Client c);
	public List<Client> list();
}
