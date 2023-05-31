package br.com.loja.techline.Enumeration;

import jakarta.persistence.Embeddable;

@Embeddable
public enum TiposDePagamento {
	
	Boleto,
	Pix,
	Crédito,
	Débito

}
