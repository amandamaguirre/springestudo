package com.amanda.estudospring.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amanda.estudospring.domain.Categoria;
import com.amanda.estudospring.repositories.CategoriaRepository;
import com.amanda.estudospring.services.exception.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria find(Integer id) {
		Categoria obj = repo.findOne(id); //findOne, se o id existir, retorna o obj, se não retorna null
		if (obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado. Id: " + id
					+ " Tipo: " + Categoria.class.getName());
		}
		return obj;
	}

}