package br.com.db1;

import br.com.db1.oojava.Cidade;
import br.com.db1.oojava.Endereco;
import br.com.db1.oojava.Pessoa;
import br.com.db1.oojava.Telefone;
import br.com.db1.type.EstadosDoBrasil;
import br.com.db1.type.TipoLogradouro;
import br.com.db1.type.TipoTelefone;

public class Aula10OrientacaoObjeto {
		public static void main(String[] args) {
			Pessoa pessoa = new Pessoa();
			Cidade cidade = new Cidade();
			Endereco endereco = new Endereco();
			Telefone telefone = new Telefone();
		
			
			pessoa.setNome("Marcelo");
			
			cidade.setNome("Maringá");
			cidade.setUf(EstadosDoBrasil.PARANA);
			
			endereco.setTipoLougradouro(TipoLogradouro.RUA);
			endereco.setCep(872000000);
			endereco.setNumero("S/N");
			endereco.setBairro("Jardim Cesu");
	
			telefone.setDdd(44);
			telefone.setNumero(99109090);
			telefone.setTipoTelefone(TipoTelefone.CELULAR);
			pessoa.addTelefones(telefone);
			
		}
}
