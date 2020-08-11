package br.com.tonni.microservico.fornecedor.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.tonni.microservico.fornecedor.model.Pedido;

public interface PedidoRepository extends CrudRepository<Pedido, Long>{

}
