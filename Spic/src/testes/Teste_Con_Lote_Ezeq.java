package testes;

import controle.Con_Lote_Ezeq;

public class Teste_Con_Lote_Ezeq {

	public static void main(String[] args) {
		// Testando a classe Con_Lote_Ezeq
		
		Con_Lote_Ezeq dateValidade = new Con_Lote_Ezeq();

		dateValidade.setDateValidade("20/11/2015");
		
		System.out.println(dateValidade);
	}

}
