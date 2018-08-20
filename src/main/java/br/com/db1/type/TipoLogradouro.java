package br.com.db1.type;

public enum TipoLogradouro {
	
	RUA("Rua","R"),
	FAZENDA("Fazenda","Fz"),
	PRACA("Praça","Pc"),
	AVENIDA("Avenida","Av");
	
	private String nomeLogradouro;
	private String nomeSigla;
	
	TipoLogradouro(String logradouro, String sigla){
		this.nomeLogradouro = logradouro;
		this.nomeSigla = sigla;
	}
	
	public String getNomeSigla() {
		return nomeSigla;
	}
	
	public String getNomeLogradouro() {
		return nomeLogradouro;
	}
}
