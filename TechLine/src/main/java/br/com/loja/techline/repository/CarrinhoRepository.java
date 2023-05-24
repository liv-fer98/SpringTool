package br.com.loja.techline.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.loja.techline.domain.Carrinho;

public interface CarrinhoRepository extends JpaRepository<Carrinho, Long>{

}
