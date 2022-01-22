package com.rodademate.stocksrm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StocksrmApplication  {

//	@Autowired
//	private AcaoRepository acaoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(StocksrmApplication.class, args);
		System.out.println("Iniciada a aplicação");
	}
	
//	@Override
//	public void run(String...args) throws Exception{
//		Acao acao1 = new Acao(null, "Petrobras", "PETR4");
//		Acao acao2 = new Acao(null, "Sanepar", "SAPR4");
//				
//		acaoRepository.saveAll(Arrays.asList(acao1, acao2));
//
//	}

}
