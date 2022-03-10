package com.proyecto.moneda.response;

import java.time.Instant;

public class MonedaAudityResponse {
	private Long id;
	private String monedaorigen;
	private String monedadestino;
	private double tipocambio;
	
	private String usuarioCreacion;
	private Instant fechaCreacion;
	private String usuarioModificacion;
	private Instant fechaModificacion;
	
	
	
	public MonedaAudityResponse() {
		super();
	}



	public MonedaAudityResponse(Long id, String monedaorigen, String monedadestino, double tipocambio,
			String usuarioCreacion, Instant fechaCreacion, String usuarioModificacion, Instant fechaModificacion) {
		super();
		this.id = id;
		this.monedaorigen = monedaorigen;
		this.monedadestino = monedadestino;
		this.tipocambio = tipocambio;
		this.usuarioCreacion = usuarioCreacion;
		this.fechaCreacion = fechaCreacion;
		this.usuarioModificacion = usuarioModificacion;
		this.fechaModificacion = fechaModificacion;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getMonedaorigen() {
		return monedaorigen;
	}



	public void setMonedaorigen(String monedaorigen) {
		this.monedaorigen = monedaorigen;
	}



	public String getMonedadestino() {
		return monedadestino;
	}



	public void setMonedadestino(String monedadestino) {
		this.monedadestino = monedadestino;
	}



	public double getTipocambio() {
		return tipocambio;
	}



	public void setTipocambio(double tipocambio) {
		this.tipocambio = tipocambio;
	}



	public String getUsuarioCreacion() {
		return usuarioCreacion;
	}



	public void setUsuarioCreacion(String usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}



	public Instant getFechaCreacion() {
		return fechaCreacion;
	}



	public void setFechaCreacion(Instant fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}



	public String getUsuarioModificacion() {
		return usuarioModificacion;
	}



	public void setUsuarioModificacion(String usuarioModificacion) {
		this.usuarioModificacion = usuarioModificacion;
	}



	public Instant getFechaModificacion() {
		return fechaModificacion;
	}



	public void setFechaModificacion(Instant fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}
	 
	
	
	
}