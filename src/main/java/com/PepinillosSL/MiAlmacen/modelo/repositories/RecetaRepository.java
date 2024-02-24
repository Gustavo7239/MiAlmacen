package com.PepinillosSL.MiAlmacen.modelo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.PepinillosSL.MiAlmacen.modelo.Producto;
import com.PepinillosSL.MiAlmacen.modelo.Receta;

@Repository
public interface RecetaRepository extends JpaRepository<Receta,Long>{

	@Query(value = "SELECT * FROM `receta` WHERE `nombre` LIKE :nom", nativeQuery = true)
	Receta findByName(@Param("nom") String name);

	@Query(value = "SELECT * FROM `receta` WHERE `id_receta` = :id", nativeQuery = true)
	Receta findById(@Param("id") long l);
	
	@Query(value = "INSERT INTO `receta_producto`(`producto_id`, `receta_id`) VALUES (':productoId',':recetaId')", nativeQuery = true)
	void insertByProductoIntoReceta(@Param("productoId") Long p, @Param("recetaId") Long r);
}
