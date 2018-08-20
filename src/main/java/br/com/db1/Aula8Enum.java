package br.com.db1;

import br.com.db1.type.TipoLogradouro;

public class Aula8Enum {
		
		public static void main(String[] args) {
			
			String teste = "valor";
			String teste2 = "valor";
			
			if (teste == teste2){
				System.out.println("Entrou");
			}
			
			System.out.println(TipoLogradouro.RUA.getNomeLogradouro() + " - " + TipoLogradouro.RUA.getNomeSigla());
			System.out.println(TipoLogradouro.PRACA.getNomeLogradouro() + " - " + TipoLogradouro.PRACA.getNomeSigla());
			System.out.println(TipoLogradouro.FAZENDA.getNomeLogradouro() + " - " + TipoLogradouro.FAZENDA.getNomeSigla());
			System.out.println(TipoLogradouro.AVENIDA.getNomeLogradouro() + " - " + TipoLogradouro.AVENIDA.getNomeSigla());
		}
		
}
