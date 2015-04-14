import java.io.ObjectInputStream.GetField;
import java.util.InputMismatchException;

import controle.ConEmpresa;
import BusinessRules.Empresas;


public class Teste {
	public static void main(String[] args) {
		Empresas empresa = new Empresas();
		ConEmpresa validacoes = new ConEmpresa();
		
		try {
			validacoes.validaCnpj(" ");
			validacoes.mostraCnpj();
			System.out.println(empresa.getCnpj());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	

		
		
		
	}

}
