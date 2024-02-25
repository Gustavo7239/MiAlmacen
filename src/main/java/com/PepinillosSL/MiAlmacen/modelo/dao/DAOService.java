package com.PepinillosSL.MiAlmacen.modelo.dao;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.PepinillosSL.MiAlmacen.modelo.Producto;
import com.PepinillosSL.MiAlmacen.modelo.Receta;
import com.PepinillosSL.MiAlmacen.modelo.TipoProducto;

public interface DAOService {
	//Metodos Productos
	void addProducto(Producto p);			//Insert (C) create
	List<Producto> findAllProducto(); 		//Select (R) read
	void updateProducto(Producto p);		//Update (U) update
	void deleteProducto(Producto p);		//Delete (D) delete
	Producto findByNameProducto(String name);
	Producto findByIdProducto(long l);
	int countAllProducto();
	//List<Producto> findProductosByTipo(String tipo);
	
	//Metodos Receta
	void addReceta(Receta r);			//Insert (C) create
	List<Receta> findAllReceta(); 		//Select (R) read
	void updateReceta(Receta r);		//Update (U) update
	void deleteReceta(Receta r);		//Delete (D) delete	
	Receta findByNameReceta(String r);
	Receta findByIdReceta(long r);
	List<Receta> findAllRecetaDificultad(int dificultad);
	int countAllReceta();
	
	//Metodos TipoProductos
	void addTipoProducto(TipoProducto tp);			//Insert (C) create
	List<TipoProducto> findAllTipoProducto(); 		//Select (R) read
	void updateTipoProducto(TipoProducto tp);		//Update (U) update
	void deleteTipoProducto(TipoProducto tp);		//Delete (D) delete	
	TipoProducto findByNameTipoProducto(String nombre);
	TipoProducto findByIdTipoProducto(long tp);
	int countAllTipoProducto();
	
}
