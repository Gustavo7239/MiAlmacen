package com.PepinillosSL.MiAlmacen;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.PepinillosSL.MiAlmacen.modelo.Producto;
import com.PepinillosSL.MiAlmacen.modelo.Receta;
import com.PepinillosSL.MiAlmacen.modelo.TipoProducto;
import com.PepinillosSL.MiAlmacen.modelo.dao.DAOService;

@Controller
@RequestMapping("/receta")
public class ControlReceta {
	
	@Autowired
	DAOService daoS;
	
	@GetMapping(value = "/")
	public String indice() {
		return "Receta";
	}
	
	@GetMapping(value="/add")
	public String addReceta(Model model) {		
		List<Producto> rec = new ArrayList<>();
		rec.add(daoS.findByIdProducto(4L));
		
		Receta receta = new Receta(0L,"Huevo frito", rec, 1);
		System.out.println(receta);
		daoS.addReceta(receta);
		
		model.addAttribute("listadoPoductos", receta.toString());
		
		//Producto p = daoS.findByNameProducto("Huevo");
		//System.out.println(np.toString());
		return "Receta";
	}
	
	@GetMapping(value="/list")
	public String listReceta(Model model){
		List<Receta> listaReceta = daoS.findAllReceta();
		model.addAttribute("listadoProductos", listaReceta.toString());
		return "Receta";
	}
	
	@GetMapping(value = "/update")
	public String updateReceta(Model model) {
		Receta receta = daoS.findByNameReceta("Huevo frito");
		System.out.println(receta);
		receta.setNombre("Huevos revuelto");
		daoS.updateReceta(receta);
		model.addAttribute("listadoProductos",receta.toString());
		return "Receta";
	}
	
	@GetMapping(value = "/delete")
	public String deleteReceta(Model model) {
		Receta receta = daoS.findByNameReceta("Huevo frito");
		model.addAttribute("listadoProductos",receta.toString());
		daoS.deleteReceta(receta);
		return "Receta";
	}
	
	@GetMapping(value="/listDificultad1")
	public String listRecetaDificultad1(Model model){
		List<Receta> listaReceta = daoS.findAllRecetaDificultad(1);
		model.addAttribute("listadoProductos", listaReceta.toString());
		return "Receta";
	}
	
	@GetMapping(value="/listDificultad2")
	public String listRecetaDificultad2(Model model){
		List<Receta> listaReceta = daoS.findAllRecetaDificultad(2);
		model.addAttribute("listadoProductos", listaReceta.toString());
		return "Receta";
	}
}
