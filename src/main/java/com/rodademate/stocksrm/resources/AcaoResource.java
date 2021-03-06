package com.rodademate.stocksrm.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rodademate.stocksrm.domain.Acao;
import com.rodademate.stocksrm.services.AcaoService;

@RestController
@RequestMapping(value="/acoes")
public class AcaoResource {
	
	@Autowired
	private AcaoService service;
	
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
	
		Acao obj = service.find(id); 
		return ResponseEntity.ok().body(obj);
		
		//Acao acao1 = new Acao(1, "Petrobras", "PETR4");
		//Acao acao2 = new Acao(2, "Sanepar", "SAPR4");
		
		//List<Acao> acoes = new ArrayList<>();
		//acoes.add(acao1);
		//acoes.add(acao2);
		
		//return acoes;
	}

}
