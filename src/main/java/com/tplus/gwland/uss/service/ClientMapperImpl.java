package com.tplus.gwland.uss.service;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.tplus.gwland.uss.service.Client;

@Repository
public class ClientMapperImpl implements ClientMapper {

 @Inject
 private SqlSession sql;
 
private static String namespace = "com.tplus.gwland.uss.service.mapper";

 // 고객 목록
 @Override
 public List<Client> list() throws Exception { 
  
  return sql.selectList(namespace+ "list");
 }

}