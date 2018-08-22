package br.com.db1.oojava;

import br.com.db1.type.EstadosDoBrasil;

public class Cidade {
		private String nome;
		private EstadosDoBrasil uf;
		
		public void setUf(EstadosDoBrasil uf) {
			this.uf = uf;
		}
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public String getNome() {
			return nome;
		}
		
		public EstadosDoBrasil getUf() {
			return uf;
		}
		
}
