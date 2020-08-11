package br.com.tonni.microservico.loja.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tonni.microservico.loja.client.FornecedorClient;
import br.com.tonni.microservico.loja.controller.dto.CompraDTO;

@Service
public class CompraService {
	
	@Autowired
	private FornecedorClient fornecedorClient;

	public void realizaCompra(CompraDTO compra) {
		
		System.out.println(fornecedorClient.getInfoPorEstado(compra.getEndereco().getEstado()).getEndereco());
		
	}

}
