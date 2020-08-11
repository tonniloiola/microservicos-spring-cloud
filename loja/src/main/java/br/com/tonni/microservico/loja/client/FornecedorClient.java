package br.com.tonni.microservico.loja.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.tonni.microservico.loja.controller.dto.InfoFornecedorDTO;

@FeignClient("fornecedor")
public interface FornecedorClient {

	@RequestMapping("info/{estado}")
	InfoFornecedorDTO getInfoPorEstado(@PathVariable String estado);
	
}
