package com.rodademate.stocksrm.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rodademate.stocksrm.domain.Acao;
import com.rodademate.stocksrm.repositories.AcaoRepository;

@Service
public class AcaoService {

	@Autowired
	private AcaoRepository repo;
	
	public Acao find(Integer id) {
		Optional<Acao> obj = repo.findById(id);
		return obj.orElse(null);
	}
	
}
