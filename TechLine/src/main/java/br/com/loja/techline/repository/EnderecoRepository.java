package br.com.loja.techline.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.loja.techline.domain.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

}