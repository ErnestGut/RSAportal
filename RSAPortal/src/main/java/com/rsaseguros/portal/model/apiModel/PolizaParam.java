package com.rsaseguros.portal.model.apiModel;

import javax.ws.rs.QueryParam;

public class PolizaParam {
	@QueryParam("id")
	private int id;
	
	@QueryParam("poliza")
	private String poliza;
	
	@QueryParam("asegurado")
	private String asegurado;
	
	@QueryParam("tipoEndoso")
	private String tipoEndoso;
	
	@QueryParam("estatus")
	private int estatus;
	
//	public PolizaParam(@QueryParam("id") int id, @QueryParam("poliza") String poliza, @QueryParam("asegurado") String asegurado, 
//			@QueryParam("tipoEndoso") String tipoEndoso, @QueryParam("estatus") int estatus){
//		this.id = id;
//		this.poliza = poliza;
//		this.asegurado = asegurado;
//		this.tipoEndoso = tipoEndoso;
//		this.estatus = estatus;
//	}

	public int getId() {
		return id;
	}
	@QueryParam("id")
	public void setId(int id) {
		this.id = id;
	}

	public String getPoliza() {
		return poliza;
	}
	@QueryParam("poliza")
	public void setPoliza(String poliza) {
		this.poliza = poliza;
	}

	public String getAsegurado() {
		return asegurado;
	}
	@QueryParam("asegurado")
	public void setAsegurado(String asegurado) {
		this.asegurado = asegurado;
	}

	public String getTipoEndoso() {
		return tipoEndoso;
	}
	@QueryParam("tipoEndoso")
	public void setTipoEndoso(String tipoEndoso) {
		this.tipoEndoso = tipoEndoso;
	}

	public int getEstatus() {
		return estatus;
	}
	@QueryParam("estatus")
	public void setEstatus(int estatus) {
		this.estatus = estatus;
	}
	
	
}
