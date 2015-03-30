/**
 * 
 */
package Cadastro;

/**
 * @author RicardoNote
 *
 */
public class Produtos {
	
	public class Servicos {
		private String nomeServico;
		private String descricao;
		private double preco;
		/**
		 * @return the nomeServico
		 */
		public String getNomeServico() {
			return nomeServico;
		}
		public Servicos(String nomeServico, String descricao, double preco) {
			super();
			this.nomeServico = nomeServico;
			this.descricao = descricao;
			this.preco = preco;
		}
		/**
		 * @param nomeServico the nomeServico to set
		 */
		public void setNomeServico(String nomeServico) {
			this.nomeServico = nomeServico;
		}
		/**
		 * @return the descricao
		 */
		public String getDescricao() {
			return descricao;
		}
		/**
		 * @param descricao the descricao to set
		 */
		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}
		/**
		 * @return the preco
		 */
		public double getPreco() {
			return preco;
		}
		/**
		 * @param preco the preco to set
		 */
		public void setPreco(double preco) {
			this.preco = preco;
		}
		
			
		
		

	}


}
