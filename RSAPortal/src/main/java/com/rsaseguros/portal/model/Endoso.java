package com.rsaseguros.portal.model;

public class Endoso {
	private int id;
	private int oficina;
	private int ramo;
	private String poliza;
	private String asegurado;
	private String endosoTipo;
	private String fecha;
	private String status;
	private int idProducto;
	private String nombreProducto;
	
	public Endoso(){}
	
	public Endoso(int id, int oficina, int ramo, String poliza, String asegurado, String endosoTipo, String fecha, String status, int idProducto, String nombreProducto){
		this.id = id;
		this.oficina = oficina;
		this.ramo = ramo;
		this.poliza = poliza;
		this.asegurado = asegurado;
		this.endosoTipo = endosoTipo;
		this.fecha = fecha;
		this.status = status;
		this.idProducto = idProducto;
		this.nombreProducto = nombreProducto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getOficina() {
		return oficina;
	}

	public void setOficina(int oficina) {
		this.oficina = oficina;
	}

	public int getRamo() {
		return ramo;
	}

	public void setRamo(int ramo) {
		this.ramo = ramo;
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

	public String getEndosoTipo() {
		return endosoTipo;
	}

	public void setEndosoTipo(String endosoTipo) {
		this.endosoTipo = endosoTipo;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	
}
