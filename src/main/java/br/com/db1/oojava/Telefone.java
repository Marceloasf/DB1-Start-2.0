package br.com.db1.oojava;

import br.com.db1.type.TipoTelefone;

public class Telefone {
		private Integer ddd;
		private Integer numero;
		private TipoTelefone tipoTelefone;
		
		public void setTipoTelefone(TipoTelefone tipoTelefone) {
			this.tipoTelefone = tipoTelefone;
		}
		
		public TipoTelefone getTipoTelefone() {
			return tipoTelefone;
		}
		
		public void setNumero(Integer numero) {
			this.numero = numero;
		}
		
		public void setDdd(Integer ddd) {
			this.ddd = ddd;
		}
		
		public String formataTelefone(){
			return "("+ ddd +")" + numero;
		}
		
}
