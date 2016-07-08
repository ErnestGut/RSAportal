package com.rsaseguros.portal.model;

public class Poliza {
	private int id;
	private String poliza;
	private String asegurado;
	private String tipoEndoso;
	private int estatus;
	
	public Poliza(){}
	
	public Poliza(int id, String poliza, String asegurado, String tipoEndoso, int estatus){
		this.id = id;
		this.poliza = poliza;
		this.asegurado = asegurado;
		this.tipoEndoso = tipoEndoso;
		this.estatus = estatus;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPoliza() {
		return poliza;
	}

	public void setPoliza(String poliza) {
		this.poliza = poliza;
	}

	public String getAsegurado() {
		return asegurado;
	}

	public void setAsegurado(String asegurado) {
		this.asegurado = asegurado;
	}

	public String getTipoEndoso() {
		return tipoEndoso;
	}

	public void setTipoEndoso(String tipoEndoso) {
		this.tipoEndoso = tipoEndoso;
	}

	public int getEstatus() {
		return estatus;
	}

	public void setEstatus(int estatus) {
		this.estatus = estatus;
	}
	
	
}
