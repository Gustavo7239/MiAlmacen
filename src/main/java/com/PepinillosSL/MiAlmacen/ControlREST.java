package com.PepinillosSL.MiAlmacen;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.PepinillosSL.MiAlmacen.modelo.Producto;
import com.PepinillosSL.MiAlmacen.modelo.dao.DAOService;

@RestController
@RequestMapping("/api")
public class ControlREST {

	@Autowired
	DAOService daoS;
	
	@GetMapping(value = "producto/list", produces= {"application/json"})
	public List<Producto> obtenerProductos(){
		List<Producto> listaProducto = daoS.findAllProducto();
		return listaProducto;
	}
	@GetMapping(value = "producto/add", produces= {"application/json"})
	public String addProducto() {
		Producto producto = new Producto(0L, "Atun", daoS.findPorNombreTipoProducto("Fruta"), 5, 1);
		daoS.addProducto(producto);
		return "Se añadio corretamente "+ producto.toString();
	}
	@GetMapping(value = "producto/update", produces= {"application/json"})
	public String actualizaProducto() {
		Producto producto = daoS.findOneProducto(2L);
		System.out.println(producto);
		producto.setNombre("Otro producto");
		daoS.updateProducto(producto);
		return "Se actualizo corretamente "+ producto.toString();
	}
}
