package Controle;

import java.beans.ExceptionListener;
import java.util.InputMismatchException;

import BusinessRules.Empresas;

public class ConEmpresas {

	Empresas empresa = new Empresas();

	
	//Validcao fantasia
	public void validaFantasia(String fantasia) throws Exception {

		if (fantasia == null || fantasia.trim().equals("")) {
			Exception ex = new Exception("Campo fantasia em branco!!");
			throw ex;
		}
		else{
			
			empresa.setFantasia(fantasia.trim());
		}
		
	}
	//Fim da validacao fantasia

	// verifica se n�o est� sendo inserido caracteres inv�lidos
	public boolean validaCnpj(String cnpj) throws Exception {
		
		try {
			
			Long.valueOf(cnpj);
			if(cnpj.length() != 11|| cnpj == null||cnpj =="" ){
				
				throw new Exception("CPF inv�lido!");
				
				
			}
			else{
				
				Long.parseLong(cnpj);
				return true;
				
			}
			//System.out.pintln("Recebido sem erro");

		} catch (NumberFormatException e) {

			throw new Exception("Caracteres inv�lidos");

		} 

	}

	// Mostra cnpj com m�scara
	public String mostraCnpj() throws Exception {

		try {
			String cnpj = String.format("%014d", empresa.getCnpj());
			System.out.println(cnpj.substring(0, 2) + "."+ cnpj.substring(2, 5) + "." + cnpj.substring(5, 8) + "/"+ cnpj.substring(8, 12) + "-" + cnpj.substring(12, 14));
			
			return cnpj.substring(0, 2) + "."+ cnpj.substring(2, 5) + "." + cnpj.substring(5, 8) + "/"+ cnpj.substring(8, 12) + "-" + cnpj.substring(12, 14);
		} catch (StringIndexOutOfBoundsException e) {

			throw new Exception("N�mero de CNPJ inv�lido!!");

		}
	}
	
	//Valida ie
	public boolean validaIe(String ie){
		if(ie.length()!= 13){
			return false;	
		}
		else{
			empresa.setIe(Integer.parseInt(ie));
			return true;
		}	
	}
	//Fim da valida��o ie
	
	
	public boolean validaEndereco(String endereco) throws Exception{
		
		if(endereco.isEmpty()|| endereco.equals("")){
			throw new Exception("Digite o endere�o!");
		}
		else{
			empresa.setEndereco(endereco);
			return true;
			
			
			
		}
		
		
	}
	
	public boolean validaNumero(String numero){
		
		try{
			
			
			if(){
				
				
			}else{
				
				return true;
				
			}
			
			
		}catch(NumberFormatException n){
			
			throw new Exception("Digite apenas n�meros!");
			
			
		}
	
		
	}
	
	
	
	
	
	
	

}
