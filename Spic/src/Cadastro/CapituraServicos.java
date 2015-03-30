/**
 * 
 */
package Cadastro;

import java.util.Scanner;

import Cadastro.Servicos;

/**
 * @author Ricardo / gabriel
 *
 */
public class CapituraServicos {
	


	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String nomeServico = null, descricao;
		double preco = 0;
		System.out.println("insira a descricao serviço: ");
		descricao = scan.next();
		Servicos servico = new Servicos(nomeServico, descricao, preco){
			public void setNomeServico(String nomeServico) {
				scan.next();
			};
			@Override
			public void setDescricao(String descricao) {
				// TODO Auto-generated method stub
				super.setDescricao(descricao);
			}
			
		};
	}

}
