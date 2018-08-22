package br.com.db1.oojava;

import br.com.db1.type.TipoLogradouro;

public class Endereco {
		private TipoLogradouro tipoLougradouro;
		private Cidade cidade;
		private Integer cep;
		private String numero;
		private String bairro;
		
	
		public void setTipoLougradouro(TipoLogradouro tipoLougradouro) {
			this.tipoLougradouro = tipoLougradouro;
		}
		
		public TipoLogradouro getTipoLougradouro() {
			return tipoLougradouro;
		}
		
		public Cidade getCidade() {
			return cidade;
		}
		
		public void setCep(Integer cep) {
			this.cep = cep;
		}
		
		public Integer getCep() {
			return cep;
		}
		
		public void setNumero(String numero) {
			this.numero = numero;
		}
		
		public String getNumero() {
			return numero;
		}
		
		public void setBairro(String bairro) {
			this.bairro = bairro;
		}
		
		public String getBairro() {
			return bairro;
		}
		
}
