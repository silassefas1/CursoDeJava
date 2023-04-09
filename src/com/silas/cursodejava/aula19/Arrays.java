package com.silas.cursodejava.aula19;

public class Arrays {

	public static void main(String[] args) {
		
		
		double [] temperatura = new double[365];
		temperatura[0] = 31.3;
		temperatura[1] = 32;
		temperatura[2] = 33.7;
		temperatura[3] = 34;
		temperatura[4] = 31.1;
		
		System.out.println("O valor da temperatura do dia 1 é:" + temperatura[2]);
		
		System.out.println("O tamanho do array:"+ temperatura.length);
		
		for(int i=0;i< temperatura.length; i++) {

			if (temperatura[i] != 0) {
				System.out.println("O valor da temperatura do dia"+ (i+1) + "é:" + temperatura[i]);
			}
		}
		
		/*Aqui a interação e feita dentro da propria variavel temp que é incrementada no proprio for,
		 * durante a execução*/
		
		for (double temp:temperatura) {
			if(temp != 0 ) {
				System.out.println(temp);
			}	
		} 
	}
}
