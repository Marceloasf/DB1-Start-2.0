package br.com.db1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Aula6 
{
	public List<String> CoresFavoritas(){
		List<String> cores = CriaListaDeCores();
		System.out.println("Exercicio 1 - " + cores + "\n");
		return cores;
	}

	private List<String> CriaListaDeCores() {
		List<String> cores = new ArrayList<String>();
		cores.add("Preto");
		cores.add("Branco");
		cores.add("Verde");
		cores.add("Azul");
		return cores;
	}
	
	public int TamanhoLista(){
		List<String> lista = CriaListaExercicio2();
		System.out.println("Exercicio 2 - " + lista.size() + "\n");
		return lista.size();
	}

	private List<String> CriaListaExercicio2() {
		List<String> lista = CriaListaExercicio3();
		return lista;
	}

	private List<String> CriaListaExercicio3() {
		List<String> lista = new ArrayList<String>();
		lista.add("1");
		lista.add("2");
		return lista;
	}
	
	public List<String> ParentesMenosPais(List<String> parametro){
		List<String> parentes = PuxaListaInseridaExercicio4(parametro);
		RemovePais(parentes);
		System.out.println("Exercicio 3 - " + parentes + "\n");
		return parentes;
	}

	private void RemovePais(List<String> parentes) {
		parentes.remove(0);
		parentes.remove(0);
	}

	private List<String> PuxaListaInseridaExercicio4(List<String> parametro) {
		List<String> parentes = AdicionaCidadesNaLista(parametro);
		return parentes;
	}
	
	public List<String> CidadesDoEstadoDeNascimento(List<String> parametro){
		List<String> cidades = AdicionaCidadesNaLista(parametro);
		cidades.remove(1);
		System.out.println("Exercicio 4 - " + cidades + "\n");
		return cidades;
	}

	private List<String> AdicionaCidadesNaLista(List<String> parametro) {
		List<String> cidades = AdicionaCoresNaListaExercicio5(parametro);
		return cidades;
	}
	
	public List<String> OrdenaCores(List<String> parametro){
		List<String> coresOrdenadas = AdicionaCoresNaListaExercicio5(parametro);
		Collections.sort(coresOrdenadas);
		System.out.println("Exercicio 5 - " + coresOrdenadas + "\n");
		return coresOrdenadas;	
	}

	private List<String> AdicionaCoresNaListaExercicio5(List<String> parametro) {
		List<String> coresOrdenadas = AdicionaCoresNaListaExercicio6(parametro);
		return coresOrdenadas;
	}
	
	public List<String> ApagaCorFavorita(List<String> parametro){
		List<String> cores = AdicionaCoresNaListaExercicio6(parametro);
		cores.remove("Azul");
		System.out.println("Exercicio 6 - " + cores + "\n");
		return cores;
	}

	private List<String> AdicionaCoresNaListaExercicio6(List<String> parametro) {
		List<String> cores = InsereParentesNaArray(parametro);
		return cores;
	}
	
	public List<String> OrdenaParentes(List<String> parametro){
		List<String> parentes = InsereParentesNaArray(parametro);
		OrdenaArrayDosParentes(parentes);
		return parentes;
	}

	private List<String> InsereParentesNaArray(List<String> parametro) {
		List<String> parentes = new ArrayList<String>();
		parentes.addAll(parametro);
		return parentes;
	}

	private void OrdenaArrayDosParentes(List<String> parentes) {
		Collections.sort(parentes);
		Collections.reverse(parentes);
	}
	
	public List<Integer> ParOuImpar(List<Integer> parametro){
		List<Integer> pares = new ArrayList<Integer>();
		List<Integer> impares = new ArrayList<Integer>();
		Integer tamanho = parametro.size();
		for (Integer contador=0; contador>=tamanho; contador++ ){
			if (parametro.get(contador) % 2 == 0){
				impares.remove(contador);
			}else{
				pares.remove(contador);
			}
		}
		List<Integer> juntaValores = new ArrayList<Integer>();
		juntaValores.addAll(pares);
		juntaValores.addAll(impares);
		return juntaValores;
	}
	
}
