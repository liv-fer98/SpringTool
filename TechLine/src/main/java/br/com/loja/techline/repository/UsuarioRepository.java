package br.com.loja.techline.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.loja.techline.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
