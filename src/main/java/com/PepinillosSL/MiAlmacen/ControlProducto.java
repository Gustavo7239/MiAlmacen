package com.PepinillosSL.MiAlmacen;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.PepinillosSL.MiAlmacen.modelo.Producto;
import com.PepinillosSL.MiAlmacen.modelo.dao.DAOService;

@Controller
@RequestMapping("/producto")
public class ControlProducto {

	@Autowired
	DAOService daoS;
	
	@GetMapping(value = "/")
	public String indice() {
		return "index";
	}
	
	@GetMapping(value="/add")
	public String addProducto(Model model) {
		Producto producto = new Producto(0L, "Atun", daoS.findPorNombreTipoProducto("Fruta"), 5, 1);
		System.out.println(producto);
		daoS.addProducto(producto);
		model.addAttribute("listadoPoductos", producto.toString());
		return "Producto";
	}
	
	@GetMapping(value="/list")
	public String obtenerProductos(Model model){
		List<Producto> listaProducto = daoS.findAllProducto();
		model.addAttribute("listadoProductos", listaProducto.toString());
		return "Producto";
	}
	
	@GetMapping(value = "/update")
	public String actualizaProducto(Model model) {
		Producto producto = daoS.findOneProducto(2L);
		System.out.println(producto);
		producto.setNombre("Otro producto");
		daoS.updateProducto(producto);
		model.addAttribute("listadoProductos",producto.toString());
		return "Producto";
	}
	
	@GetMapping(value = "/delete")
	public String borrarProducto(Model model) {
		Producto producto = daoS.findOneProducto(3L);
		daoS.deleteProducto(producto);
		model.addAttribute("listadoProductos",producto.toString());
		return "Producto";
	}
}