package com.addwork.ADDWORK.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;

import com.addwork.ADDWORK.entities.Documentation;
import com.addwork.ADDWORK.service.DocumentationService;

@Controller
@CrossOrigin
public class MasterController {
	
	@Autowired
	DocumentationService documentationService;
	
	@GetMapping("/documentations")
	public ResponseEntity<List<Documentation>> get(){ 
		List<Documentation> documentations = documentationService.findAll();
		return new ResponseEntity<List<Documentation>>(documentations, HttpStatus.OK);
	}

}
