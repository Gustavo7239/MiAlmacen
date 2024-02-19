package com.PepinillosSL.MiAlmacen.modelo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.PepinillosSL.MiAlmacen.modelo.TipoProducto;

@Repository
public interface TipoProductoRepository extends JpaRepository<TipoProducto,Long>{

	@Query(value="SELECT * FROM tipo_producto tp WHERE nombre LIKE :nom", nativeQuery = true)
	TipoProducto findByNameTipoProducto(@Param("nom") String nombre);

	
}
