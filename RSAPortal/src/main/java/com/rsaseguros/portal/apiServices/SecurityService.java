package com.rsaseguros.portal.apiServices;

import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.rsaseguros.portal.dao.ISeguridadDao;
import com.rsaseguros.portal.dao.impl.SeguridadDao;
import com.rsaseguros.portal.model.Usuario;

@Path("/seguridad")
public class SecurityService {
	@GET
	@Path("login")
	@Produces(MediaType.APPLICATION_JSON)
	public Usuario login(@QueryParam("username") String username, @QueryParam("password") String password) {		
		ISeguridadDao seguridadDao = new SeguridadDao();
		
		Usuario user = seguridadDao.login(username, password);
		
		if(user.getId() == 0){
			throw new NotFoundException(Response
                    .status(Response.Status.NOT_FOUND)
                    .entity("LOGIN_INCORRECTO")
                    .build());
		}
		
		return user;
	}
}
