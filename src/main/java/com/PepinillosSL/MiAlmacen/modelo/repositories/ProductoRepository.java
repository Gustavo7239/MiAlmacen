
package com.PepinillosSL.MiAlmacen.modelo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.PepinillosSL.MiAlmacen.modelo.Producto;
import com.PepinillosSL.MiAlmacen.modelo.TipoProducto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long>{
	
	@Query(value = "SELECT * FROM producto p WHERE p.nombre LIKE ':nom'", nativeQuery = true)
	Producto findByName(@Param("nom") String name);

	@Query(value = "SELECT * FROM `producto` WHERE `id_producto` = :id", nativeQuery = true)
	Producto findById(@Param("id") long l);
	
	//List<Producto> findByTipo(TipoProducto tipoProducto);
	
}
