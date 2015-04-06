package Cadastro;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class SpicTeste {
	

	public static void main(String[] args) {
	
		
		Produtos prod = new Produtos(394843492," Molas para caminhão", "Fiat", "9mm", true,new Date(2015,3,2),new Date(1111,2,3) , "sdfs");
		prod.mostraProduto();
		
	}

	

}
/*
private int codigoBarras;
private String descricao;
private String aplicacao;
private String medida;
private Boolean ativo;
private Date dataValidade;
private Date dataFabricacao;
private String lote;
*/