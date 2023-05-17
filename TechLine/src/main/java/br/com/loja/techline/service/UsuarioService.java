package br.com.loja.techline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.loja.techline.domain.Usuario;
import br.com.loja.techline.repository.UsuarioRepository;
import br.com.loja.techline.service.exception.UsuarioNaoEncontradoException;

@Service
public class UsuarioService {
	

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	
	public  List<Usuario> obterTodosUsuarios() {
		
		List<Usuario> usuarios = usuarioRepository.findAll();
		return usuarios;

	}
	
	public Usuario obterUsuario(Long id) {
		
		Usuario usuario = usuarioRepository.findById(id).orElse(null);
		
		if (usuario == null) {
			throw new UsuarioNaoEncontradoException();
		}
		
		return usuario;
	}
	
}
