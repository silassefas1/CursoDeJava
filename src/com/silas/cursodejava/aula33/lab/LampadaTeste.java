package com.silas.cursodejava.aula33.lab;

public class LampadaTeste {

	public static void main(String[] args) {
		
		Lampada lampada = new Lampada();
		lampada.ligar();
		lampada.mostrarEstado();
		lampada.desligar();
		lampada.mostrarEstado();
		lampada.setPotencia("70w");
		System.out.println(lampada.getPotencia());
		lampada.mudarEstado();
		lampada.mostrarEstado();
		
		
		
	}

}
