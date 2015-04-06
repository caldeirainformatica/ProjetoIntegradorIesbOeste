package conexoesBd;

import java.util.ArrayList;

import Persistence.Produtos;

/*
 * @author: Daniel Fiuza
 * Esta classe serve para simular um cadastro de produtos usando ArrayList
 * 
 * 
 * 
 */
public class ArrayProdutos {
	
		
		ArrayList <Produtos> tabelaProdutos = new ArrayList<>();
	
	
		//Adiciona novo produto
		public void adicionaProduto(Produtos e){
		
			tabelaProdutos.add(e);
			System.out.println(e.getCodigoBarras()+" "+e.getDescricao());
		
	
	
	}
		//pesuisa produto pelo codigo de barras
		public void pesquisarProdutos(Produtos e,int codBarras){
			
			Boolean existe = tabelaProdutos.contains(e.getCodigoBarras() == codBarras);
			if(existe){
				
				System.out.println(e.getCodigoBarras()+e.getDescricao()+" "+e.getAplicacao()+" "+e.getMedida()+" "+e.getAtivo()+" "+e.getDataValidade()+" "+e.getDataFabricacao()+" "+" "+e.getLote());
				
				
			}else{
				
				
				System.out.println("Persistence de produtos não encontrado!!");
			}
			
			
		
		}
		
		//metodo que exclui produto
		public  void removerProdutos(Produtos e){
		//Fazer tratamento 	
			tabelaProdutos.remove(e);
			System.out.println("Produto removido!!!");
			
		}
		
		

}
