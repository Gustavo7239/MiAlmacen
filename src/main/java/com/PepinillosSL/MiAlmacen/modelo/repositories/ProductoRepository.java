package com.PepinillosSL.MiAlmacen.modelo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.PepinillosSL.MiAlmacen.modelo.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long>{
	
	@Query(value = "SELECT * FROM `producto` WHERE `nombre` LIKE :nom", nativeQuery = true)
	Producto findByName(@Param("nom") String name);

	@Query(value = "SELECT * FROM `producto` WHERE `id_producto` = :id", nativeQuery = true)
	Producto findById(@Param("id") long l);
	
	@Query(value = "SELECT COUNT(*) FROM `producto`", nativeQuery = true)
	int countAll();
	
	/*
	@Query(value = "SELECT p.* "
				 + "FROM Producto p, tipo_producto tp "
				 + "WHERE p.tipo_producto_id LIKE tp.id_tipo_producto "
				 + "AND tp.nombre = :tipo")
    List<Producto> findByTipo(@PathVariable("tipo") String tipo);
    */
}
