package com.rodademate.stocksrm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rodademate.stocksrm.domain.Acao;

@Repository
public interface AcaoRepository extends JpaRepository<Acao, Integer>{
	
}
