package br.com.db1.oojava;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
	private String nome;
	private Endereco endereco;
	private List<Telefone> telefones; 
	
	public Pessoa(){
		this.telefones = new ArrayList<Telefone>();
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public List<Telefone> getTelefones() {
		return telefones;
	}
	
	public void addTelefones(Telefone telefones){
		this.telefones.add(telefones);
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	
}
