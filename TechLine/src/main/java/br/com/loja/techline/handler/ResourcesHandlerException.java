package br.com.loja.techline.handler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.loja.techline.service.exception.UsuarioNaoEncontradoException;
import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourcesHandlerException {

	@ExceptionHandler(UsuarioNaoEncontradoException.class)
	public ResponseEntity<?> handleUsuarioNaoEncontradoException(
			UsuarioNaoEncontradoException e, HttpServletRequest request) {
		
		return ResponseEntity.notFound().build();
	}
}