package br.com.loja.techline.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.loja.techline.domain.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
