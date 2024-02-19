package com.PepinillosSL.MiAlmacen.modelo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.PepinillosSL.MiAlmacen.modelo.Producto;
import com.PepinillosSL.MiAlmacen.modelo.Receta;
import com.PepinillosSL.MiAlmacen.modelo.TipoProducto;
import com.PepinillosSL.MiAlmacen.modelo.repositories.ProductoRepository;
import com.PepinillosSL.MiAlmacen.modelo.repositories.RecetaRepository;
import com.PepinillosSL.MiAlmacen.modelo.repositories.TipoProductoRepository;

@Service
public class DAOServiceImpl implements DAOService {
	
	@Autowired
	ProductoRepository productoR;
	
	@Autowired
	RecetaRepository recetaR;
	
	@Autowired
	TipoProductoRepository tipoProdR;
	
	//Producto Methods --------------------------------------------
	@Override
	public void addProducto(Producto p) {
		productoR.save(p);
	}
	@Override
	public List<Producto> findAllProducto(){
		return productoR.findAll();
	}
	@Override
	public void updateProducto(Producto p) {
		productoR.save(p);
	}
	@Override
	public void deleteProducto(Producto p) {
		productoR.delete(p);
	}
	@Override
	public Producto findNombreProducto(String name) {
		return productoR.findNombreProducto(name);
	}
	public Producto findOneProducto(long l) {
		return productoR.findProductoPorId(l);
	}
	
	//Receta Methods --------------------------------------------
	@Override
	public void addReceta(Receta r) {
		recetaR.save(r);
	}
	@Override
	public List<Receta> findAllReceta(){
		return recetaR.findAll();
	}
	@Override
	public void updateReceta(Receta r) {
		recetaR.save(r);
	}
	@Override
	public void deleteReceta(Receta r) {
		recetaR.delete(r);
	}
	@Override
	public Receta findNombreReceta(String name) {
		return recetaR.findByNameReceta(name);
	}
	
	//TipoProducto  Methods --------------------------------------------
	@Override
	public void addTipoProducto(TipoProducto tp) {
		tipoProdR.save(tp);
	}
	@Override
	public List<TipoProducto> findAllTipoProducto(){
		return tipoProdR.findAll();
	}
	@Override
	public void updateTipoProducto(TipoProducto tp) {
		tipoProdR.save(tp);
	}
	@Override
	public void deleteTipoProducto(TipoProducto tp) {
		tipoProdR.delete(tp);
	}
	@Override
	public TipoProducto findPorNombreTipoProducto(String nombre) {
		return tipoProdR.findByNameTipoProducto(nombre);
	}
	
}
