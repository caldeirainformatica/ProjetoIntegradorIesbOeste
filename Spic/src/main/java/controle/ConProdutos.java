package controle;

import BusinessRules.Produtos;

public class ConProdutos {

	
	Produtos produto = new Produtos();
	/*
	private int idProdutos;
	private int codigoBarras;
	private String descricao;
	private String aplicacao;
	private String medida;
	private Boolean ativo;
	private Calendar dataValidade;
	private Calendar dataFabricacao;
	private String lote;
	*/
	
	//Validar codigoBarras
	boolean validarCodigoBarras(String codigoBarras){
		
		
		if(codigoBarras == ""||codigoBarras== null||codigoBarras.trim()==""||codigoBarras.length()<13){
			
			Exception campoVazioException = new Exception("Campo codigo de barras vazio!");
			return false;
		
		}else{
			
			
			
			return true;
			
		}
		
		
	
	}
	
	boolean validarDescricao(String descricao){
		
		if(descricao == ""||descricao== null||descricao.trim()==""){
			
			
			return false;
		
		}else{
			
			
			
			return true;
			
		}
		
		
		
	}

	boolean validarAplicacao(String aplicacao){
		
		if(){
			
			
			return false;
		
		}else{
			
			
			
			return true;
			
		}
		
	}

	boolean validarMedida(String medida){
		
		if(){
			
			
			return false;
		
		}else{
			
			
			
			return true;
			
		}
	}

	boolean validarAtivo(String ativo){
		
		if(){
			
			
			return false;
		
		}else{
			
			
			
			return true;
			
		}
		
	}
	
	boolean validarDataValidade(String dataValidade){
		if(){
			
			
			return false;
		
		}else{
			
			
			
			return true;
			
		}
		
		
	}

	boolean validarDataFabricacao(String dataFabricacao){
		
		
		if(){
			
			
			return false;
		
		}else{
			
			
			
			return true;
			
		}
		
	}
	
	boolean validarLote(String lote){
		if(){
			
			
			return false;
		
		}else{
			
			
			
			return true;
			
		}
	}
	
	
}	
