package br.com.loja.techline.service.exception;

public class UsuarioNaoEncontradoException extends RuntimeException {
	
	public UsuarioNaoEncontradoException() {
		super("O id informado não corresponde a um usuário.");
	}

}