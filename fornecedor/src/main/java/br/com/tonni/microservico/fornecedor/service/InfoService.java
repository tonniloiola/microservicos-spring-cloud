package br.com.tonni.microservico.fornecedor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tonni.microservico.fornecedor.model.InfoFornecedor;
import br.com.tonni.microservico.fornecedor.repository.InfoRepository;

@Service
public class InfoService {
	
	@Autowired
	private InfoRepository infoRepository;

	public InfoFornecedor getInfoPorEstado(String estado) {
		
		return infoRepository.findByEstado(estado);
	}
	
	

}
