package com.PepinillosSL.MiAlmacen.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="producto")
public class Producto {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_producto")
	private Long idProducto;
	@Column(name="nombre")
	private String nombre;
	@ManyToOne
	@JoinColumn(name="tipoProducto_Id")
	private TipoProducto tipo;
	@Column(name="precio")
	private int precio;
	@Column(name="cantidad")
	private int cantidad;
	
	
	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Producto(Long idProducto, String nombre, TipoProducto tipo, int precio, int cantidad) {
		super();
		this.idProducto = idProducto;
		this.nombre = nombre;
		this.tipo = tipo;
		this.precio = precio;
		this.cantidad = cantidad;
	}
	public Long getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public TipoProducto getTipo() {
		return tipo;
	}
	public void setTipo(TipoProducto tipo) {
		this.tipo = tipo;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", nombre=" + nombre + ", tipo=" + tipo + ", precio=" + precio
				+ ", cantidad=" + cantidad + "]";
	}
	
	
}
