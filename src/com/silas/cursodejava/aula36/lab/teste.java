package com.silas.cursodejava.aula36.lab;

public class teste {
	
	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria();
		ContaPoupanca poupanca = new ContaPoupanca();
		conta.setNomeCliente("Silas");
		conta.setNumConta("123456-7");
		conta.depositar(250);
		System.out.println(conta);
		System.out.println(poupanca);
		
		
		
	}
}
