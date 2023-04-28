package com.silas.cursodejava.aula45;

public class Professor extends Pessoa {
	

	private String departamento;
	private String nomeCurso;
	


	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	private double salario;
	
	public double calcularSalarioBruto() {
		
		return 0;
	}
	public String obterEtiquetaEndereco() {
		/*o metodo herdado foi reescrito na crase filho*/
		
		String s= "Endereço do Professor: ";
		s += super.getEndereco();
		
		return s;
	}
	

}
