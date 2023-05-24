package br.com.loja.techline.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.loja.techline.domain.Fornecedor;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Long>{

}
