package com.silas.cursodejava.aula36a43.labs;

public class ContaPoupanca extends ContaBancaria {
	
	private double diaRendimento;
	private double taxaRendimento = 0.01;
	
	
	
	public double getDiaRendimento() {
		return diaRendimento;
	}
	public void setDiaRendimento(double diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
	public double getTaxaRendimento() {
		return taxaRendimento;
	}

	public void setTaxaRendimento(double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}


	public void calcularNovoSaldo() {
		
		double saldo = getSaldo();
		double novoSaldo = saldo + (saldo*taxaRendimento);
		setDiaRendimento(saldo*taxaRendimento);
		setSaldo(novoSaldo);
		
	}
	

}
