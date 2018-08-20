package br.com.com.db1.type;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.type.TipoLogradouro;

public class TipoLogradouroTeste {
	
		
	@Test
	public void siglaLogradouroTeste(){
		Assert.assertEquals("R",TipoLogradouro.RUA.getNomeSigla());
		Assert.assertEquals("Fz",TipoLogradouro.FAZENDA.getNomeSigla());
		Assert.assertEquals("Pc",TipoLogradouro.PRACA.getNomeSigla());
		Assert.assertEquals("Av",TipoLogradouro.AVENIDA.getNomeSigla());
	}
	
	@Test
	public void nomeLogradouroTeste(){
		Assert.assertEquals("Rua", TipoLogradouro.RUA.getNomeLogradouro());
		Assert.assertEquals("Fazenda",TipoLogradouro.FAZENDA.getNomeLogradouro());
		Assert.assertEquals("Praça",TipoLogradouro.PRACA.getNomeLogradouro());
		Assert.assertEquals("Avenida",TipoLogradouro.AVENIDA.getNomeLogradouro());
	}
}
