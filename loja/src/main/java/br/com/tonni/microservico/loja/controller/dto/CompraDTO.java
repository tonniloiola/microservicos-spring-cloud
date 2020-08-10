package br.com.tonni.microservico.loja.controller.dto;

import java.util.List;

public class CompraDTO {
	
	private List<ItemDaCompraDTO> itens;
	
	private EnderecoDTO endereco;

	public EnderecoDTO getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoDTO endereco) {
		this.endereco = endereco;
	}

	public List<ItemDaCompraDTO> getItens() {
		return itens;
	}

	public void setItens(List<ItemDaCompraDTO> itens) {
		this.itens = itens;
	}
	
	

}
