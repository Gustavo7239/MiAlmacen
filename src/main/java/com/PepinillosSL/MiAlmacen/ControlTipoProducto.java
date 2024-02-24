package com.PepinillosSL.MiAlmacen;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.PepinillosSL.MiAlmacen.modelo.Producto;
import com.PepinillosSL.MiAlmacen.modelo.TipoProducto;
import com.PepinillosSL.MiAlmacen.modelo.dao.DAOService;

@Controller
@RequestMapping("/tipo")
public class ControlTipoProducto {
	
	@Autowired
	DAOService daoS;
	
	@GetMapping(value = "/")
	public String indice() {
		return "Tipo";
	}
	
	@GetMapping(value="/add")
	public String addTipo(Model model) {
		TipoProducto tipo = new TipoProducto(0L, "Bebidas");
		System.out.println(tipo);
		daoS.addTipoProducto(tipo);
		model.addAttribute("listadoPoductos", tipo.toString());
		return "Tipo";
	}
	
	@GetMapping(value="/list")
	public String listTipo(Model model){
		List<TipoProducto > listaTipo= daoS.findAllTipoProducto();
		model.addAttribute("listadoProductos", listaTipo.toString());
		return "Tipo";
	}
	
	@GetMapping(value = "/update")
	public String updateTipo(Model model) {
		TipoProducto tipo = daoS.findByIdTipoProducto(2L);
		System.out.println(tipo);
		tipo.setNombre("Otro producto");
		daoS.updateTipoProducto(tipo);
		model.addAttribute("listadoProductos",tipo.toString());
		return "Tipo";
	}
	
	/*@GetMapping(value = "/delete")
	public String deleteTipo(Model model) {
		
		TipoProducto tipo = daoS.findByIdTipoProducto(3L);
		List<Producto> listaProducto = daoS.findAllProductoByTipo(tipo);
		for(Producto p:listaProducto) {
			daoS.deleteProducto(p);
		}
		model.addAttribute("listadoProductos",tipo.toString());
		daoS.deleteTipoProducto(tipo);
		
		return "Tipo";
	}*/
}
