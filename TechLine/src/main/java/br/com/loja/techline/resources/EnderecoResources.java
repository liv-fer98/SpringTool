package br.com.loja.techline.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.loja.techline.domain.Endereco;


@RestController
@RequestMapping(value="/enderecos")
public class EnderecoResources {
	
	@RequestMapping(value="/{id}", method=RequestMethod.POST)
	public String cadastrarEndereco(@RequestBody Endereco endereco, @PathVariable("id") Long idUsuario) {
		
		return "Endereço cadastrado com sucesso";
	}

}
