package com.PepinillosSL.MiAlmacen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.PepinillosSL.MiAlmacen.modelo.dao.DAOService;

@Controller
public class ControlMain {

	@Autowired
	DAOService daoS;

	@GetMapping(value = "/")
	public String addProducto(Model model) {
		int numProd = daoS.countAllProducto();
		int numRec = daoS.countAllReceta();
		
		System.out.println(numProd);
		System.out.println(numRec);
		
		model.addAttribute("numProductos", numProd);
		model.addAttribute("numRecetas", numRec);
		
		return "index";
	}
	
}