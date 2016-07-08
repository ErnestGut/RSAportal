package com.rsaseguros.persistence.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.rsaseguros.persistence.mapper.ITendcampMapper;
import com.rsaseguros.persistence.model.TendcampDO;

public class ITendcampService {
	
	@Autowired 
	private ITendcampMapper mapper;

	public List<TendcampDO> getAll() {
		return mapper.getAll();
	}

}
