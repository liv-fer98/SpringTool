package br.com.loja.techline.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.loja.techline.domain.Endereco;
import br.com.loja.techline.domain.Usuario;
import br.com.loja.techline.repository.EnderecoRepository;

@Service
public class EnderecoService {
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	
	public Endereco cadastrarEndereco(Long id) {
		
		Usuario usuario = new Usuario();
		usuario.setId(id);
		
		Endereco endereco = new Endereco();
		endereco.setUsuario(usuario);
		
		Endereco end = enderecoRepository.save(endereco);
		return end;
		
	}
	
	

}
