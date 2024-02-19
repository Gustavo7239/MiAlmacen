package com.PepinillosSL.MiAlmacen.modelo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.PepinillosSL.MiAlmacen.modelo.Receta;

@Repository
public interface RecetaRepository extends JpaRepository<Receta,Long>{

	@Query(value = "SELECT * FROM receta r WHERE r.nombre LIKE :nom", nativeQuery = true)
	Receta findByNameReceta(@Param("nom") String name);

}
