package br.com.loja.techline.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class FormaDePagamento {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	public enum Tipos{
		 
		Dinheiro("D"),
		Credito("C"),
		debito("D"),
		pix("P");

		private String tipoPagamento;
		Tipos(String string) {
			
		}
		
		
		void PagamentoEnum(String tipo) {
		setTipoPagamento(tipo);
		}
		
		
		public String getTipoPagamento() {
			return tipoPagamento;
		}
		
		public void setTipoPagamento(String tipoPagamento) {
			this.tipoPagamento = tipoPagamento;
		}
	}

}
