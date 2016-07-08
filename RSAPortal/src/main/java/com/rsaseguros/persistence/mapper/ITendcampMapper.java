package com.rsaseguros.persistence.mapper;

import java.util.List;

import com.rsaseguros.persistence.model.TendcampDO;

public interface ITendcampMapper {
	
	public List<TendcampDO> getAll();
	public void update(TendcampDO tendcamp);
	public void remove(TendcampDO tendcamp);
	public void insert(TendcampDO tendcamp);
	
}
