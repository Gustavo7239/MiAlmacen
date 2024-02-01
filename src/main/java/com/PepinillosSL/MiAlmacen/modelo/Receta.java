package com.PepinillosSL.MiAlmacen.modelo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="receta")
public class Receta {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_receta")
	private Long idReceta;
	@Column(name="nombre")
	private String nombre;
	
	@ManyToMany
	@JoinTable(name="receta_producto",
	   joinColumns = @JoinColumn (name="receta_Id"), 
	    inverseJoinColumns= @JoinColumn(name="producto_Id"))
	private List<Producto> listaProductos;
	
	@Column(name="dificultad")
	private int dificultad;

	public Receta() {
		super();
	}

	public Receta(Long idReceta, String nombre, List<Producto> listaProductos, int dificultad) {
		super();
		this.idReceta = idReceta;
		this.nombre = nombre;
		this.listaProductos = listaProductos;
		this.dificultad = dificultad;
	}

	public Long getIdReceta() {
		return idReceta;
	}

	public void setIdReceta(Long idReceta) {
		this.idReceta = idReceta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Producto> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(List<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}

	public int getDificultad() {
		return dificultad;
	}

	public void setDificultad(int dificultad) {
		this.dificultad = dificultad;
	}

	@Override
	public String toString() {
		return "Receta [idReceta=" + idReceta + ", nombre=" + nombre + ", listaProductos=" + listaProductos
				+ ", dificultad=" + dificultad + "]";
	}
	
}
