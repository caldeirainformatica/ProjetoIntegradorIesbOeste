package Persistence;

import java.sql.Date;

import conexoesBd.ArrayProdutos;

public class SpicTeste {
	

	public static void main(String[] args) {
	
		
		Produtos prod = new Produtos(394843492," Molas para caminhão", "Fiat", "9mm", true,new Date(2015,3,2),new Date(1111,2,3) , "sdfs");
		prod.mostraProduto();
		ArrayProdutos bd = new ArrayProdutos();// classe que possui tabela de produtos.
		 bd.adicionaProduto(prod);
		 bd.pesquisarProdutos(prod,123123123);// Método da classe ArrayProdutos que procura cadastro pelo codigo de barras
		
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