package br.com.fiap.bean;

import br.com.fiap.annotation.Coluna;

public class Animal {
	
	@Coluna(nome="NM_ANIMAL")
	private String nome;
	
	@Coluna(nome="DS_ESPECIE")
	private String especie;
	
	private float peso;
	
	public void andar(){
		System.out.println("Andando...");
	}
	
}