package com.PepinillosSL.MiAlmacen.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name="tipo_producto")
public class TipoProducto {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_tipo_producto")
	private Long idTipoProducto;
	@Column(name="nombre", unique=true, length=100)
	private String nombre;

	@Transient
	private int objetosCarrito;
	
	public TipoProducto(Long idTipoProducto, String nombre) {
		super();
		this.idTipoProducto = idTipoProducto;
		this.nombre = nombre;
	}

	public TipoProducto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getIdTipoProducto() {
		return idTipoProducto;
	}

	public void setIdTipoProducto(Long idTipoProducto) {
		this.idTipoProducto = idTipoProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	@Override
	public String toString() {
		return "TipoProducto [idTipoProducto=" + idTipoProducto + ", nombre=" + nombre + "]";
	}
	
	
}
