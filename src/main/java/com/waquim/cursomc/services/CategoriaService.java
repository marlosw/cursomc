package com.waquim.cursomc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.waquim.cursomc.domain.Categoria;
import com.waquim.cursomc.repositories.CategoriaRepository;
import com.waquim.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;

	public Categoria findById(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + " , Tipo: " + this.getClass().getName()));
		
	}

	public List<Categoria> findAll() {
		return repo.findAll();
	}
}
