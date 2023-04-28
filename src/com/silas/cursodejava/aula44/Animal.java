package com.silas.cursodejava.aula44;

public abstract class Animal {
	
	private String nome;
	
	public abstract void emitirSom(); // cada classe especifica vai criar o seu

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
