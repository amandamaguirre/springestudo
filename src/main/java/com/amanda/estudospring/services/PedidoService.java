package com.amanda.estudospring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amanda.estudospring.domain.Pedido;
import com.amanda.estudospring.repositories.PedidoRepository;
import com.amanda.estudospring.services.exception.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;
	
	public Pedido find(Integer id) {
		Pedido obj = repo.findOne(id); //findOne, se o id existir, retorna o obj, se não retorna null
		if (obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado. Id: " + id
					+ " Tipo: " + Pedido.class.getName());
		}
		return obj;
	}


}
