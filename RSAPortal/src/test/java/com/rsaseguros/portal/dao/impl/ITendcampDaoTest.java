package com.rsaseguros.portal.dao.impl;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.rsaseguros.persistence.mapper.ITendcampMapper;
import com.rsaseguros.persistence.model.TendcampDO;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/applicationContext.xml")
public class ITendcampDaoTest {
	private static Log log = LogFactory.getLog(ITendcampDaoTest.class);
	
	@Autowired 
	private ITendcampMapper service;
		
	@Test
	public void testSelectAll(){
		log.info("testing selectAll ...");
		List<TendcampDO> tendcampList = service.getAll();
		for(TendcampDO t: tendcampList){
			System.out.println("valor: " +t);
		}
		assertNotNull("tendcamp is null", tendcampList);
		log.info(tendcampList);
	}
}