package com.tfg.inmobilaria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import com.tfg.inmobilaria.modelo.dao.IntInmuebleDao;


@Controller
public class HomeController {

	@Autowired
	private IntInmuebleDao inmuebleDao;
	
	@GetMapping("/inicio")
	public String inicio(Model model) {
		model.addAttribute("novedades", inmuebleDao.findNovedades());
		return "inicio";
	}
}
