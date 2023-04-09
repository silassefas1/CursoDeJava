package com.silas.cursodejava.aula33.lab;

public class Conta {
	
	private int numConta;
	private double saldoConta;
	private String bancoConta;
	private String tipoConta; // poupança ou corente
	private boolean especial;
	private double limite;
	private boolean chequeEspecial;
	
	public int getNumConta() {
		return numConta;
	}


	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}


	public double getSaldoConta() {
		return saldoConta;
	}


	public void setSaldoConta(double saldoConta) {
		this.saldoConta = saldoConta;
	}


	public String getBancoConta() {
		return bancoConta;
	}


	public void setBancoConta(String bancoConta) {
		this.bancoConta = bancoConta;
	}


	public String getTipoConta() {
		return tipoConta;
	}


	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}


	public boolean isEspecial() {
		return especial;
	}


	public void setEspecial(boolean especial) {
		this.especial = especial;
	}


	public double getLimite() {
		return limite;
	}


	public void setLimite(double limite) {
		this.limite = limite;
	}
	

	public boolean isChequeEspecial() {
		return chequeEspecial;
	}


	public void setChequeEspecial(boolean chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}


	public boolean podeSacar() {
		if (getSaldoConta() > 0) {
			return true;
		}else {
			return false;
		}
		
	}
	public void depositar(double valor) {
		 setSaldoConta(valor);
	}
	
	public double consultarSaldo() {
		return getSaldoConta();
	}
	
	public boolean consultarChequeEspecial() {
		return isChequeEspecial();
	}
	
}
