package br.com.com.db1.type;

//import org.junit.Assert;
import org.junit.Test;

import br.com.db1.type.EstadosDoBrasil;

public class EstadosDoBrasilTeste {
	EstadosDoBrasil chamaMetodoEnum;
	
	
	@Test
	public void retornaEstadosDoSulTeste(){
		System.out.println(EstadosDoBrasil.retornaEstadosDoSul());
		//Assert.assertTrue("Paraná", chamaMetodoEnum.retornaEstadosDoSul().contains(PARANA));
	}
	@Test
	public void retornaEstadosDoSudesteTeste(){
		
	}
	@Test
	public void retornaEstadosDoCentroOesteTeste(){
		
	}
	@Test
	public void retornaEstadosDoNorteTeste(){
		
	}
	@Test
	public void retornaEstadosDoNordesteTeste(){
		
	}
}
