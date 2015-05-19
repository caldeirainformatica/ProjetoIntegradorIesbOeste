package controle;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import model.Lotes;

/*
 * 
 * 
 * @author Daniel Fiuza
 * 
 * 
 */
//validarIdLote()
//validarLote()
//validarDataValidade
//validarDataFabricacao
public class ConLote {

	public Lotes lot = new Lotes();
	
	
	public boolean validarIdLote(String idLote){
		
		try{
			
			if(idLote == ""||idLote== null||idLote.trim()==""){
				
				return false;
				
			}else{
				
				lot.setIdlote(Integer.parseInt(idLote));
				return true;
			}
		}catch(NumberFormatException e){
			
			new Exception("valores inválidos!!");
			return false;
		}
	}
	
	
	public boolean validarLote(String lote){
		
		try{
			if(lote == ""||lote== null||lote.trim()==""){
				return false;
			}else{
				lot.setLote(lote);
				return true;
			}
			
		}catch(NumberFormatException e){
			
			new Exception("número de lote inválido!");
			return false;
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

        lot.setDataValidade(dataValidade);
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
        lot.setDataFabricacao(dataFabricacao);
        return(true);                          
    }  
	


	

}
