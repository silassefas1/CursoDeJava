package com.silas.cursodejava.aula33.lab;

public class ContaTeste {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		
		conta.depositar(10.0);
		
		System.out.println(conta.consultarChequeEspecial());


	}

}
