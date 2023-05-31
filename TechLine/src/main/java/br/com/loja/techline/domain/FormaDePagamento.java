package br.com.loja.techline.domain;

import br.com.loja.techline.Enumeration.TiposDePagamento;
import jakarta.annotation.Nonnull;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class FormaDePagamento {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Embedded
	@Nonnull
	private TiposDePagamento tipoPagamento;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TiposDePagamento getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(TiposDePagamento tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}
	
	


	
	
}
