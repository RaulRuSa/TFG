package com.tfg.inmobilaria.modelo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tfg.inmobilaria.beansentity.Inmueble;

public interface IntInmuebleRepository extends JpaRepository<Inmueble, Integer>{
	@Query ("select i from Inmueble i where i.novedad = 1")
	public List<Inmueble> findNovedades();
}
