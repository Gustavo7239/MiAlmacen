package com.PepinillosSL.MiAlmacen;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.PepinillosSL.MiAlmacen.modelo.TipoProducto;
import com.PepinillosSL.MiAlmacen.modelo.dao.DAOService;

@RestController
@RequestMapping("/api/tipo")
public class ControlTipoProducto {
	
	@Autowired
	DAOService daoS;
	
	@GetMapping(value="/list", produces= {"application/json"})
	public List<TipoProducto> obtenerTipos(){
		List<TipoProducto> listaTipos = daoS.findAllTipoProducto();
		return listaTipos;
	}
	
}
