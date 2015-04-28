package Controle;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

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
	boolean validarCodigoBarras(String codigoBarras) throws Exception{
		
		try{
		if(codigoBarras == ""||codigoBarras== null||codigoBarras.trim()==""||codigoBarras.length()<13){
			
			Exception campoVazioException = new Exception("Valor incorreto!");
			return false;
		
		}else{
			
			
			
			return true;
			
		}
		}catch(NumberFormatException e){
			
			throw new Exception("Caracteres inválidos");
			
		
		}
		
		
	
	}
	
	boolean validarDescricao(String descricao){
		
		if(descricao == ""||descricao== null||descricao.trim()==""){
			
			Exception campoVazioException = new Exception("Valor incorreto!");
			return false;
		
		}else{
			
			
			
			return true;
			
		}
		
		
		
	}

	boolean validarAplicacao(String aplicacao){
		
		if(aplicacao == ""||aplicacao== null||aplicacao.trim()==""){
			
			Exception campoVazioException = new Exception("Valor incorreto!");
			return false;
		
		}else{
			
			
			
			return true;
			
		}
		
	}

	boolean validarMedida(String medida){
		
		if(medida == ""||medida== null||medida.trim()==""){
			
			Exception campoVazioException = new Exception("Valor incorreto!");
			return false;
		
		}else{
			
			
			
			return true;
			
		}
	}

	boolean validarAtivo(String ativo){
		
		if(ativo == ""||ativo== null||ativo.trim()==""){
			
			Exception campoVazioException = new Exception("Valor incorreto!");
			return false;
		
		}else{
			
			
			
			return true;
			
		}
		
	}
	
	boolean validarDataValidade(String dataValidade)throws java.text.ParseException{  
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");  
        Calendar cal = new GregorianCalendar();  

            // gerando o calendar  
        cal.setTime(df.parse(dataValidade));  

            // separando os dados da string para comparacao e validacao  
        String[] data = dataValidade.split("/");  
        String dia = data[0];  
        String mes = data[1];  
        String ano = data[2];  

            // testando se hah discrepancia entre a data que foi  
            // inserida no caledar e a data que foi passada como  
            // string. se houver diferenca, a data passada era  
            // invalida  
        if ( (new Integer(dia)).intValue() != (new  
        		Integer(cal.get(Calendar.DAY_OF_MONTH))).intValue() ) {  
           // dia nao casou  
            return(false);  
        } else if ( (new Integer(mes)).intValue() != (new  
        		Integer(cal.get(Calendar.MONTH)+1)).intValue() ) {  
                // mes nao casou  
            return(false);  
        } else if ( (new Integer(ano)).intValue() != (new  
        		Integer(cal.get(Calendar.YEAR))).intValue() ) {  
                // ano nao casou  
            return(false);  
        }  

        
        return(true);                          
    }  




	boolean validarDataFabricacao(String dataFabricacao)throws java.text.ParseException {  
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");  
        Calendar cal = new GregorianCalendar();  

            // gerando o calendar  
        cal.setTime(df.parse(dataFabricacao));  

            // separando os dados da string para comparacao e validacao  
        String[] data = dataFabricacao.split("/");  
        String dia = data[0];  
        String mes = data[1];  
        String ano = data[2];  

            // testando se hah discrepancia entre a data que foi  
            // inserida no caledar e a data que foi passada como  
            // string. se houver diferenca, a data passada era  
            // invalida  
        if ( (new Integer(dia)).intValue() != (new  
        		Integer(cal.get(Calendar.DAY_OF_MONTH))).intValue() ) {  
           // dia nao casou  
            return(false);  
        } else if ( (new Integer(mes)).intValue() != (new  
        		Integer(cal.get(Calendar.MONTH)+1)).intValue() ) {  
                // mes nao casou  
            return(false);  
        } else if ( (new Integer(ano)).intValue() != (new  
        		Integer(cal.get(Calendar.YEAR))).intValue() ) {  
                // ano nao casou  
            return(false);  
        }  

        return(true);                          
    }  



	
	boolean validarLote(String lote){
		if(lote == ""||lote== null||lote.trim()==""){
			
			
			return false;
		
		}else{
			
			
			
			return true;
			
		}
	}
	
	
}	
