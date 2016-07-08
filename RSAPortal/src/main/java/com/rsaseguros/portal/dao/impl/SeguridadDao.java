package com.rsaseguros.portal.dao.impl;

import com.rsaseguros.portal.dao.ISeguridadDao;
import com.rsaseguros.portal.model.Usuario;

public class SeguridadDao implements ISeguridadDao{

	@Override
	public Usuario login(String username, String password) {
		if(username.equals("user1") && password.equals("user1pass"))
			return new Usuario(1,"user1","user1@email.com","","Jessica","Willington","",
					"Jessica Willington","Administrador", "Jefe de Ventas", 1);
		else if(username.equals("sergio")  && password.equals("surasergio") )
			return new Usuario(2,"sergio","user2@email.com","","Sergio","Sámano","",
					"Sergio Sámano","Coordinador", "Coordinador de TI", 1);
		else if(username.equals("gustavo")  && password.equals("suragustavo") )
			return new Usuario(3,"gustavo","user3@email.com","","Gustavo","Sánchez","",
					"Gustavo Sánchez","Coordinador", "Coordinador de TI", 1);
		else if(username.equals("jessica")  && password.equals("surajessica") )
			return new Usuario(4,"jessica","user4@email.com","","Jessica","Amador","",
					"Jessica Amador","Coordinador", "Coordinador de TI", 1);
		else if(username.equals("ernesto")  && password.equals("suraernesto") )
			return new Usuario(5,"ernesto","user5@email.com","","Ernesto","García","",
					"Ernesto García","Coordinador", "Coordinador de TI", 1);
		else if(username.equals("jonathan")  && password.equals("surajonathan") )
			return new Usuario(6,"jonathan","user6@email.com","","Jonathan","Hernández","",
					"Jonathan Hernández","Coordinador", "Coordinador de TI", 1);
		
		return new Usuario(0,"","","","","","",
				"","", "", 0);
	}

}
