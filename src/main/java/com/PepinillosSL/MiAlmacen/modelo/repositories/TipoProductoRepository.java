package com.PepinillosSL.MiAlmacen.modelo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.PepinillosSL.MiAlmacen.modelo.Producto;
import com.PepinillosSL.MiAlmacen.modelo.TipoProducto;

@Repository
public interface TipoProductoRepository extends JpaRepository<TipoProducto,Long>{

	@Query(value = "SELECT * FROM `tipo_producto` WHERE `nombre` LIKE :nom", nativeQuery = true)
	TipoProducto findByName(@Param("nom") String name);

	@Query(value = "SELECT * FROM `tipo_producto` WHERE `id_tipo_producto` = :id", nativeQuery = true)
	TipoProducto findById(@Param("id") long l);
	
	
}
