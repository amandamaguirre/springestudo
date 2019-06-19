package com.amanda.estudospring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amanda.estudospring.domain.Cliente;
import com.amanda.estudospring.repositories.ClienteRepository;
import com.amanda.estudospring.services.exception.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	public Cliente find(Integer id) {
		Cliente obj = repo.findOne(id); //findOne, se o id existir, retorna o obj, se não retorna null
		if (obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado. Id: " + id
					+ " Tipo: " + Cliente.class.getName());
		}
		return obj;
	
	}
}
