package controle;

import BusinessRules.Clientes;

public class ConClientes {

	
		Clientes cliente = new Clientes();
		
		public void validarCpf(String cpf) throws Exception{  
		   
			
		    if(cpf == ""||cpf== null||cpf.trim()=="") {
		    	
		    	Exception campoVazioException = new Exception("Campo CPF vazio!");
		    	
		    	
		    }
		    // Elimina CPFs invalidos conhecidos    
		    if (cpf.length() != 11 || 
		        cpf == "00000000000" || 
		        cpf == "11111111111" || 
		        cpf == "22222222222" || 
		        cpf == "33333333333" || 
		        cpf == "44444444444" || 
		        cpf == "55555555555" || 
		        cpf == "66666666666" || 
		        cpf == "77777777777" || 
		        cpf == "88888888888" || 
		        cpf == "99999999999"){
		    	
		    	
		    	Exception cpfInvalidoException = new Exception("Cpf inválido!");
		    	
		    	
		    }
		                
		    // Valida 1o digito 
		    for(int i = 0;i<9;i++){
		    	
		    	
		    	
		    	
		    }
		    
		  
		    
		}
		
		
		
		
		
	

}
