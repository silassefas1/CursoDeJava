package com.silas.cursodejava.aula36.lab;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria{
	
	private int diaRendimento;
	
	

	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
	
	public String toString() {
		String s = "> Conta Poupança <\n";
		s+= "Dia Rendimento: " + diaRendimento + "\n";
		s+= super.toString();
		s+= "]";
		return s;
	}
	
	public void calcularDiaRendimento(double taxaRendimento) {
		
		Calendar hoje = Calendar.getInstance();		
		if(diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
		super.setSaldo(this.getSaldo()*taxaRendimento);
		}
		
	}


}
