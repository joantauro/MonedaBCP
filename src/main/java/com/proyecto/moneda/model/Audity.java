package com.proyecto.moneda.model;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Audity {

	@Column(nullable = false, updatable = false, name = "USUARIO_CREACION")
	protected String usuarioCreacion;
	@Column(nullable = false, updatable = false, name = "FECHA_CREACION")
	protected Instant fechaCreacion;
	@Column(insertable = false, name = "USUARIO_MODIFICACION")
	protected String usuarioModificacion;
	@Column(insertable = false, name = "FECHA_MODIFICACION")
	protected Instant fechaModificacion;
	
	public void setCampoSegIns(String usuarioCreacion, Instant fechaCreacion){
		this.usuarioCreacion = usuarioCreacion;
		this.fechaCreacion = fechaCreacion;
	}
	public void setCampoSegUpd(String usuarioModificacion, Instant fechaModificacion){
		this.usuarioModificacion = usuarioModificacion;
		this.fechaModificacion = fechaModificacion;
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
