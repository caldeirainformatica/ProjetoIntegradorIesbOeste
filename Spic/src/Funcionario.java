import java.util.Scanner;

import Cadastro.CapituraFuncionario;

/**
 * 
 */

/**
 * @author Ricardo Caldeira
 *
 */
public class Funcionario {
	static String nomeFuncionario;

	public static void main(String[] args) {
		CapituraFuncionario funcionario = new CapituraFuncionario();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o nome do funcionario");
		nomeFuncionario = scan.next();
		funcionario.setNomeFuncionario(nomeFuncionario);
		
		System.out.println("O nome do funcionario e: "+funcionario.getNomeFuncionario());
		

	}
}
