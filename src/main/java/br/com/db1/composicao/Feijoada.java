package br.com.db1.composicao;

public class Feijoada {
	private Feijao feijao;
	
	public Feijoada(Feijao feijaoParametro){
		System.out.println("Passou");
		this.feijao = feijaoParametro;
	}
	
	public Feijao getFeijao() {
		return feijao;
	}


}
