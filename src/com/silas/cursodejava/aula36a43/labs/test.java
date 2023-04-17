package com.silas.cursodejava.aula36a43.labs;

public class test {
	
	public static void main(String[] args) {
		
		
		ContaPoupanca poupanca = new ContaPoupanca();
		poupanca.setSaldo(250);
		System.out.println(poupanca.getSaldo());	
		poupanca.calcularNovoSaldo();
		System.out.println(poupanca.getSaldo());	
		
	
	}
	
	
}
