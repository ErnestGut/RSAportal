package com.rsaseguros.portal.dao;

import com.rsaseguros.portal.model.Usuario;

public interface ISeguridadDao {
	Usuario login(String username, String password);
}
