package br.com.loja.techline.resources;

import java.util.List;

import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.loja.techline.domain.Usuario;
import br.com.loja.techline.service.UsuarioService;
import br.com.loja.techline.repository.UsuarioRepository;

@RestController
@RequestMapping(value ="/usuarios")
public class UsuarioResources {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private UsuarioService usuarioService;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Usuario> obterTodosUsuarios() {
		
		return usuarioService.obterTodosUsuarios();
		
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public Usuario add(@RequestBody Usuario usuario) {
		
		Usuario u = usuarioRepository.save(usuario);	
		return u;
	}
	
	@RequestMapping(value = "/{id}", method=RequestMethod.GET)
	public ResponseEntity<Usuario> obterUsuario(@PathVariable("id") Long id) {
		
		Usuario usuario = usuarioService.obterUsuario(id);	
		 
		return ResponseEntity.status(HttpStatus.SC_OK).body(usuario);
		
	}
	
	@RequestMapping(value="/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> excluir(@PathVariable("id") Long id) {
		
		Usuario u = usuarioRepository.findById(id).orElse(null);
		if (u == null) {
			return ResponseEntity.notFound().build();
		}
		
		usuarioRepository.delete(u);
		
		return ResponseEntity.noContent().build();		
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public ResponseEntity<?> atualizar(@RequestBody Usuario usuario ) {
		
		usuarioRepository.save(usuario);
		
		return ResponseEntity.noContent().build();
	}
	
	
	/*@RequestMapping(method=RequestMethod.POST)
	public String add(@RequestBody Usuario usuario) {
		
		Usuario u = usuarioRepository.save(usuario);
		
		
		for (Endereco endereco : usuario.getEnderecos()) {
			endereco.setUsuario(u);
			enderecoRepository.save(endereco);
		}
		
		return "Usuario cadastrado com sucesso";
	}*/

}
