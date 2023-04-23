package com.silas.cursodejava.aula36.lab;
/*Compreende exercicios da aula 36 a 43*/
public class ContaBancaria {

	private String nomeCliente;
	private String numConta;
	private double saldo;
	public String getNomeCliente() {
		return nomeCliente;
	}
	
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	public String getNumConta() {
		return numConta;
	}
	
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String toString() {
		String s = "Conta Bancaria [ \n";
		s+= "Nome Cliente: " + nomeCliente + "\n";
		s+= "Numero da Conta: " + numConta + "\n";
		s+= "Saldo: " + saldo;
		s+= "]";
		
		
		return  s;
	}
	
	public void depositar(double valorDeposito) {
		saldo += saldo+valorDeposito;
	}
	
	public void sacar(double valor) {
		if(valor <= saldo && valor > 0) {
			System.out.println("Saque no valor de R$ "+valor+" realizado \n"
					+ "Saldo atual: R$ "+(saldo-valor));
		}else if(valor > saldo) {
			System.out.println("Saldo insulficiente para realizar saque, utilize o cheque especial");
		} else {
			System.out.println("Valor invalido");
		}
	}
	
}
