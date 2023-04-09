package com.silas.cursodejava.aula34.labs;

public class ConversaoDeUnidadeDeArea {
	private static double valor;
	
	
	
	public static double conversaoDeArea(int opcao, double medida) {
		
		switch (opcao){
		case 1:/*metro quadrado para pes quadrado*/
			valor = medida*10.76;break;
		case 2: /*pe quadrado para cemtímetro quadrado*/
			valor = medida*929; break;
		case 3:/*milha quadrada para acre */
			valor = medida*640;break;
		case 4:/*acre  para pés quadrados*/
			valor = medida*43560;break;

		}
		
		return valor;
	}

}
