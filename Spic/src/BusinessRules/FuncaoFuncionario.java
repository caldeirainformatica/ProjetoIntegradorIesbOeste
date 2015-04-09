/**
 * 
 */
package BusinessRules;

/**
 * @author RicardoNote
 *
 */
public class FuncaoFuncionario {
	private String descricaoFuncao;

	/**
	 * @param descricaoFuncao
	 */
	//Abaixo, metodo construtor da Classe
	public FuncaoFuncionario(String descricaoFuncao) { 
		super();
		this.descricaoFuncao = descricaoFuncao;
	}

	/**
	 * @return the descricaoFuncao
	 */
	public String getDescricaoFuncao() {
		return descricaoFuncao;
	}

	/**
	 * @param descricaoFuncao the descricaoFuncao to set
	 */
	public void setDescricaoFuncao(String descricaoFuncao) {
		this.descricaoFuncao = descricaoFuncao;
	}

	
	
}
