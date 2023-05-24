package br.com.loja.techline.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.loja.techline.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
