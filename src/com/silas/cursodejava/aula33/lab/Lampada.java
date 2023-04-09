package com.silas.cursodejava.aula33.lab;

public class Lampada {
	
	private String modelo;
	private String tensao;
	private String potencia;
	private String corLuz;
	private String tipoLuz;
	private int garantiaMeses;
	String[] tipos;
	boolean tipoAbajur;
	boolean estadoLampada;
	
	/*
	 * public Lampada() { String modelo; String tensao; String potencia; String
	 * corLuz; String tipoLuz; int garantiaMeses; String[] tipos; boolean
	 * tipoAbajur; boolean estadoLampada;
	 * 
	 * }
	 */
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getTensao() {
		return tensao;
	}
	public void setTensao(String tensao) {
		this.tensao = tensao;
	}
	public String getPotencia() {
		return potencia;
	}
	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}
	public String getCorLuz() {
		return corLuz;
	}
	public void setCorLuz(String corLuz) {
		this.corLuz = corLuz;
	}
	public String getTipoLuz() {
		return tipoLuz;
	}
	public void setTipoLuz(String tipoLuz) {
		this.tipoLuz = tipoLuz;
	}
	public int getGarantiaMeses() {
		return garantiaMeses;
	}
	public void setGarantiaMeses(int garantiaMeses) {
		this.garantiaMeses = garantiaMeses;
	}
	public String[] getTipos() {
		return tipos;
	}
	public void setTipos(String[] tipos) {
		this.tipos = tipos;
	}
	public boolean isTipoAbajur() {
		return tipoAbajur;
	}
	public void setTipoAbajur(boolean tipoAbajur) {
		this.tipoAbajur = tipoAbajur;
	}
	public boolean isEstadoLampada() {
		return estadoLampada;
	}
	public void setEstadoLampada(boolean estado) {
		this.estadoLampada = estado;
	}

	
	public void ligar() {
		setEstadoLampada(true);
		
	}
	
	public void desligar() {
		setEstadoLampada(false);
	}
	
	public void mostrarEstado() {
		if (isEstadoLampada()) {
			System.out.println("Lâmpada Ligada");
		}else {
			System.out.println("Lâmpada Desligada");
		}
	}
	public void mudarEstado() {
		if (isEstadoLampada()) {
			desligar();		
		}else {
			ligar();
		}
	}
	

	
	
}
