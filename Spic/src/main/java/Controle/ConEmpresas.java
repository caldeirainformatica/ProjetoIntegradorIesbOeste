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

	// verifica se não está sendo inserido caracteres inválidos
	public boolean validaCnpj(String cnpj) throws Exception {
		
		try {
			
			Long.valueOf(cnpj);
			if(cnpj.length() != 11|| cnpj == null||cnpj =="" ){
				
				throw new Exception("CPF inválido!");
				
				
			}
			else{
				
				Long.parseLong(cnpj);
				return true;
				
			}
			//System.out.pintln("Recebido sem erro");

		} catch (NumberFormatException e) {

			throw new Exception("Caracteres inválidos");

		} 

	}

	// Mostra cnpj com máscara
	public String mostraCnpj() throws Exception {

		try {
			String cnpj = String.format("%014d", empresa.getCnpj());
			System.out.println(cnpj.substring(0, 2) + "."+ cnpj.substring(2, 5) + "." + cnpj.substring(5, 8) + "/"+ cnpj.substring(8, 12) + "-" + cnpj.substring(12, 14));
			
			return cnpj.substring(0, 2) + "."+ cnpj.substring(2, 5) + "." + cnpj.substring(5, 8) + "/"+ cnpj.substring(8, 12) + "-" + cnpj.substring(12, 14);
		} catch (StringIndexOutOfBoundsException e) {

			throw new Exception("Número de CNPJ inválido!!");

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
	//Fim da validação ie
	
	
	public boolean validaEndereco(String endereco) throws Exception{
		
		if(endereco.isEmpty()|| endereco.equals("")){
			throw new Exception("Digite o endereço!");
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
			
			throw new Exception("Digite apenas números!");
			
			
		}
	
		
	}
	
	
	
	
	
	
	

}
