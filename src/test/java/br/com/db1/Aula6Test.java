package br.com.db1;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;



public class Aula6Test{
		Aula6 chamaMetodo = new Aula6();
	
	@Test
	public void CoresFavoritasTeste(){
		List<String> cores = chamaMetodo.CoresFavoritas();
		
		Assert.assertEquals(cores.get(0), "Preto");
		Assert.assertEquals(cores.get(1), "Branco");
		Assert.assertEquals(cores.get(2), "Verde");
		Assert.assertEquals(cores.get(3), "Azul");
		Assert.assertTrue(cores.size() == 4);
		Assert.assertNotEquals(cores.get(0), "Branco");
		Assert.assertFalse(cores.size() == 2);
	}
	
	
	@Test
	public void TamanhoListaTeste(){
		int tamanhoLista = chamaMetodo.TamanhoLista();
		Assert.assertTrue(2 == tamanhoLista);
		Assert.assertFalse(1 == tamanhoLista);
	}
	
	@Test
	public void ParentesMenosPaisTeste(){
		List<String> parentesTeste = new ArrayList<String>();
		parentesTeste.add("Marcelo");
		parentesTeste.add("Arleide");
		parentesTeste.add("Dorval");
		parentesTeste.add("Teia");
		parentesTeste.add("Leo");
		
		List<String> parentesMetodo = chamaMetodo.ParentesMenosPais(parentesTeste);
		
		Assert.assertEquals(parentesMetodo.get(0), "Dorval");
		Assert.assertEquals(parentesMetodo.get(1), "Teia");
		Assert.assertEquals(parentesMetodo.get(2), "Leo");
		Assert.assertTrue(parentesMetodo.size() == 3);
		Assert.assertFalse(parentesMetodo.size() == 5);
	}
	
	@Test
	public void CidadesDoEstadoDeNascimentoTeste(){
		List<String> cidadesTeste = new ArrayList<String>();
		cidadesTeste.add("Cianorte");
		cidadesTeste.add("Londrina");
		cidadesTeste.add("Maringá");
		
		List<String> cidadesMetodo = chamaMetodo.CidadesDoEstadoDeNascimento(cidadesTeste);
		
		Assert.assertEquals(cidadesMetodo.get(0), "Cianorte");
		Assert.assertNotEquals(cidadesMetodo.get(1), "Londrina");
		Assert.assertEquals(cidadesMetodo.get(1), "Maringá");
		Assert.assertTrue(cidadesMetodo.size() == 2);
		Assert.assertFalse(cidadesMetodo.size() == 3);
	}
	
	@Test 
	public void OrdenaCoresTeste(){
		List<String> coresTeste = chamaMetodo.CoresFavoritas();
		List<String> coresMetodo = chamaMetodo.OrdenaCores(coresTeste);
		
		Assert.assertEquals(coresMetodo.get(0), "Azul");
		Assert.assertEquals(coresMetodo.get(1), "Branco");
		Assert.assertEquals(coresMetodo.get(2), "Preto");
		Assert.assertEquals(coresMetodo.get(3), "Verde");
	}
	
	@Test 
	public void ApagaCorFavoritaTeste(){
		List<String> coresTeste = chamaMetodo.CoresFavoritas();
		List<String> coresMetodo = chamaMetodo.ApagaCorFavorita(coresTeste);
		
		Assert.assertEquals(coresMetodo.get(0), "Preto");
		Assert.assertEquals(coresMetodo.get(1), "Branco");
		Assert.assertEquals(coresMetodo.get(2), "Verde");
		Assert.assertFalse(coresMetodo.contains("Azul"));
		Assert.assertTrue(coresMetodo.size() == 3);
		Assert.assertFalse(coresMetodo.size() == 4);
	}
	
	@Test
	public void OrdenaParentes(){
		List<String> parentesTeste = new ArrayList<String>();
		parentesTeste.add("Marcelo");
		parentesTeste.add("Arleide");
		parentesTeste.add("Dorval");
		parentesTeste.add("Teia");
		parentesTeste.add("Leo");
		
		List<String> parentesMetodo = chamaMetodo.OrdenaParentes(parentesTeste);
		
		Assert.assertEquals(parentesMetodo.get(4), "Arleide");
		Assert.assertEquals(parentesMetodo.get(3), "Dorval");
		Assert.assertEquals(parentesMetodo.get(2), "Leo");
		Assert.assertEquals(parentesMetodo.get(1), "Marcelo");
		Assert.assertEquals(parentesMetodo.get(0), "Teia");
	}
	
	@Test
	public void ParOuImparTeste(){
		List<Integer> valoresInteger = new ArrayList<Integer>();
		valoresInteger.add(10);
		valoresInteger.add(3);
		valoresInteger.add(6);
		valoresInteger.add(15);
		valoresInteger.add(17);
		valoresInteger.add(19);
		
		List<Integer> valoresMetodo = chamaMetodo.ParOuImpar(valoresInteger);
		
		Assert.assertTrue(valoresMetodo.get(0) == 3);
		Assert.assertTrue(valoresMetodo.get(1) == 6);
		Assert.assertTrue(valoresMetodo.get(2) == 10);
		Assert.assertTrue(valoresMetodo.get(3) == 15);
		Assert.assertTrue(valoresMetodo.get(4) == 17);
		Assert.assertTrue(valoresMetodo.get(5) == 19);
	}
	
}
