package com.addwork.ADDWORK.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.addwork.ADDWORK.Repository.DocumentationRepository;
import com.addwork.ADDWORK.entities.Documentation;
@Service
public class DocumentationServiceImpl implements DocumentationService{

	@Autowired
	DocumentationRepository documentationRepository;
	
	@Override
	public List<Documentation> findAll() {
		// TODO Auto-generated method stub
		return documentationRepository.findAll();
	}

}
