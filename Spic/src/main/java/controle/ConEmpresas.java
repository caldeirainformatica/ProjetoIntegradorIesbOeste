package controle;

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
	public void validaCnpj(String cnpj) throws Exception {

		try {

			empresa.setCnpj(Long.valueOf(cnpj));
			String pj = cnpj.substring(0, 3) + "." + cnpj.substring(3, 6) + "."
					+ cnpj.substring(6, 9) + "/" + cnpj.substring(9, 13) + "-"
					+ cnpj.substring(13, 15);
			//System.out.pintln("Recebido sem erro");

		} catch (NumberFormatException e) {

			throw new Exception("Caracteres inv�lidos");

		} catch (StringIndexOutOfBoundsException e) {

			throw new Exception("N�mero de CNPJ inv�lido!!");

		}

	}

	// Mostra cnpj com m�scara
	public String mostraCnpj() throws Exception {

		try {
			String cnpj = String.format("%015d", empresa.getCnpj());
			System.out.println(cnpj.substring(0, 3) + "."
					+ cnpj.substring(3, 6) + "." + cnpj.substring(6, 9) + "/"
					+ cnpj.substring(9, 13) + "-" + cnpj.substring(13, 15));
			return cnpj.substring(0, 3) + "." + cnpj.substring(3, 6) + "."
					+ cnpj.substring(6, 9) + "/" + cnpj.substring(9, 13) + "-"
					+ cnpj.substring(13, 15);
		} catch (StringIndexOutOfBoundsException e) {

			throw new Exception("N�mero de CNPJ inv�lido!!");

		}
	}

}
