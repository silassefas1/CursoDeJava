package com.silas.cursodejava.aula43;

import java.util.Arrays;
import java.util.Objects;

public class Aluno  {
	
	private String curso;
	private double[] notas;


	public Aluno() {
		super();
		
	}
	
	
	
	public Aluno(String endereco, String telefone, String nome, String curso) {
		//super(endereco, telefone, nome); /*Funciona como o this so que fazendo referencia a super class*/
		this.curso = curso;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	
	public double[] getNotas() {
		return notas;
	}



	public void setNotas(double[] notas) {
		this.notas = notas;
	}



	public double calcularMedia() {
		
		return 0;
	}
	
	public boolean verificarAprovado() {
		
		return true;
	}
	public String obterEtiquetaEndereco() {
		/*o metodo herdado foi reescrito na crase filho*/
		
		String s= "Endereço do Aluno: ";
		//s += super.getEndereco();
		
		return s;
	}



	/*Auto gerado*/
	public String toString() {
		return "Aluno [curso=" + curso + ", notas=" + Arrays.toString(notas) + "]";
	}



	
	/*o importante nesse equals e o nome do curso*/
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Aluno other = (Aluno) obj;
		if (curso.equalsIgnoreCase(other.getCurso())) {
			return true;
		}
			
		return false;
	}

	/*sobrescrevendo o metodo toString
	public String toString() {
		String s =  curso +"\n";
		for (double nota: notas) {
			s+=nota + " ";
		}
		return s;
	}*/
	
	
	
}
