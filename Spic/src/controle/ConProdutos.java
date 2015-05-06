package controle;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import model.Produtos;


/*
 * 
 * 
 *@author Daniel Fiuza
 * 
 * 
 * 
 */





public class ConProdutos {

	
	public Produtos produto = new Produtos();
	
	
	//Validar codigoBarras
	 public boolean validarCodigoBarras(String codigoBarras) throws Exception{
		
		try{
		if(codigoBarras == ""||codigoBarras== null||codigoBarras.trim()==""||codigoBarras.length()>13){
			
			Exception campoVazioException = new Exception("Valor incorreto!");
			return false;
		
		}else{
			
			
			produto.setCodigoBarras(Long.parseLong(codigoBarras));
			return true;
			
		}
		}catch(NumberFormatException e){
			
			throw new Exception("Caracteres inválidos");
			
		
		}
		
		
	
	}
	
	public boolean validarDescricao(String descricao){
		
		if(descricao == ""||descricao== null||descricao.trim()==""){
			
			Exception campoVazioException = new Exception("Valor incorreto!");
			return false;
		
		}else{
			
			
			produto.setDescricao(descricao);
			return true;
			
		}
		
		
		
	}

	public boolean validarAplicacao(String aplicacao){
		
		if(aplicacao == ""||aplicacao== null||aplicacao.trim()==""){
			
			Exception campoVazioException = new Exception("Valor incorreto!");
			return false;
		
		}else{
			
			
			produto.setAplicacao(aplicacao);
			return true;
			
		}
		
	}

	public boolean validarMedida(String medida){
		
		if(medida == ""||medida== null||medida.trim()==""){
			
			Exception campoVazioException = new Exception("Valor incorreto!");
			return false;
		
		}else{
			
			
			produto.setMedida(medida);
			return true;
			
		}
	}

	public boolean validarAtivo(String ativo){
		
		if(ativo == ""||ativo== null||ativo.trim()==""){
			
			Exception campoVazioException = new Exception("Valor incorreto!");
			return false;
		
		}else{
			
			
			
			return true;
			
		}
		
	}
	
	public boolean validarDataValidade(String dataValidade)throws java.text.ParseException{  
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

        produto.setDataValidade(dataValidade);
        return(true);                          
    }  




	public boolean validarDataFabricacao(String dataFabricacao)throws java.text.ParseException {  
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
        produto.setDataFabricacao(dataFabricacao);
        return(true);                          
    }  



	
	public boolean validarLote(String lote){
		if(lote == ""||lote== null||lote.trim()==""){
			
			
			return false;
		
		}else{
			
			
			produto.setLote(lote);
			return true;
			
		}
	}
	
	public boolean validarValorVenda(String valorVenda)throws Exception {
		
		try{
			
			if(valorVenda == ""||valorVenda== null||valorVenda.trim()==""){
				
				
				return false;
			
			}else{
				
				
				produto.setValorVenda(Float.parseFloat(valorVenda));
				return true;
				
			}
		}catch(NumberFormatException e){
			
			new Exception("Valor inválido!!");
			return false;
		}
	
		
	}
	
	
	public boolean validarValorCusto(String valorCusto)throws Exception {
		
		try{
			
			if(valorCusto == ""||valorCusto== null||valorCusto.trim()==""){
				
				
				return false;
			
			}else{
				produto.setValorCusto(Float.parseFloat(valorCusto));
				return true;
			}
		}catch(NumberFormatException e){
			
			new Exception("Valor inválido!!");
			return false;
		}
	
		
	}
	
	public boolean validarQuantidade(String quantidade)throws Exception{
		
		try{
			
			if(quantidade == ""||quantidade== null||quantidade.trim()==""){
				return false;
			}else{
				
				produto.setQuantidade(Double.parseDouble(quantidade));
				return true;
			}
			
		}catch(NumberFormatException Exception){
			
			new Exception("Valor inválido!");
			return false;
			
		}
		
	}
	
}	
