package com.rsaseguros.portal.apiServices;

import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.rsaseguros.portal.model.Poliza;
import com.rsaseguros.portal.model.apiModel.PolizaParam;

@Path("/polizas")
public class PolizasService {
	@GET
	@Path("buscar")
	@Produces(MediaType.APPLICATION_JSON)
	public Poliza buscarPoliza(@BeanParam PolizaParam polizaPar){
		return new Poliza(polizaPar.getId(), polizaPar.getPoliza(), polizaPar.getAsegurado(), polizaPar.getTipoEndoso(), polizaPar.getEstatus());
	}
}
