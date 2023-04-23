package com.silas.cursodejava.aula36.lab;

public class ContaPoupanca extends ContaBancaria{
	
	private int diaRendimento;
	
	

	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
	
	public String toString() {
		String s = "Conta Poupança";
		s+= "Dia Rendimento: " + diaRendimento + "\n";
		s+= super.toString();
		s+= "]";
		return s;
	}


}
