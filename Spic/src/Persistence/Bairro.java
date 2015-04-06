/**
 * 
 */
package Persistence;

/**
 * @author Ricardo Caldeira
 *
 */
public class Bairro {
	private String descricaoBairro;

	/**
	 * @param descricaoBairro
	 */
	public Bairro(String descricaoBairro) {
		super();
		this.descricaoBairro = descricaoBairro;
	}

	/**
	 * @return the descricaoBairro
	 */
	public String getDescricaoBairro() {
		return descricaoBairro;
	}

	/**
	 * @param descricaoBairro the descricaoBairro to set
	 * Metodo construtor para a classe Bairro.
	 */
	public void setDescricaoBairro(String descricaoBairro) {
		this.descricaoBairro = descricaoBairro;
	}

}
