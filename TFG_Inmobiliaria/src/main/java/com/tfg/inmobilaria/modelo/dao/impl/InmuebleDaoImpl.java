package com.tfg.inmobilaria.modelo.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tfg.inmobilaria.beansentity.Inmueble;
import com.tfg.inmobilaria.modelo.dao.IntInmuebleDao;
import com.tfg.inmobilaria.modelo.repository.IntInmuebleRepository;

@Service
public class InmuebleDaoImpl implements IntInmuebleDao {
	
	@Autowired
	private IntInmuebleRepository inmuebleRepo; 
	
	@Override
	public List<Inmueble> findAll() {
		return inmuebleRepo.findAll();
	}

	@Override
	public Inmueble findById(int id) {
		return inmuebleRepo.findById(id).orElse(null);
	}
	
	@Override
	public List<Inmueble> findNovedades(){
		return inmuebleRepo.findNovedades();
	}
}
