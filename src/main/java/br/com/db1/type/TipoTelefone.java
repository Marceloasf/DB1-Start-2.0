package br.com.db1.type;

public enum TipoTelefone {
	COMERCIAL("Comercial"),
	RESIDENCIAL("Residencial"),
	CELULAR("Celular"),
	REFERENCIA("Referência");
	
	private String tipoTelefone;
	
	TipoTelefone(String telefone){
		this.tipoTelefone = telefone;
	}
	
	public String getTipoTelefone() {
		return tipoTelefone;
	}
}
