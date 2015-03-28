/**
 * 
 */
package Cadastro;

/**
 * @author RicardoNote
 *
 */

public class CapituraFuncionario  {
	
	int idFuncionario, cpfFuncionario;
	String nomeFuncionario, telefoneFuncionario, enderecoFuncionario, funcaoFuncionario;

public CapituraFuncionario(int IdFuncionario, int CpfFuncionario, String NomeFuncionario, String TelefoneFuncionario, String EnderecoFuncionario, String FuncaoFuncionario){
	idFuncionario = IdFuncionario;
	cpfFuncionario = CpfFuncionario;
	nomeFuncionario = NomeFuncionario;
	telefoneFuncionario = TelefoneFuncionario;
	enderecoFuncionario = EnderecoFuncionario;
	funcaoFuncionario = FuncaoFuncionario;


	private int getIdFuncionario() {
		return idFuncionario;
	}
	/**
	 * @param idFuncionario the idFuncionario to set
	 */
	private void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}
	/**
	 * @return the cpfFuncionario
	 */
	private int getCpfFuncionario() {
		return cpfFuncionario;
	}
	/**
	 * @param cpfFuncionario the cpfFuncionario to set
	 */
	private void setCpfFuncionario(int cpfFuncionario) {
		this.cpfFuncionario = cpfFuncionario;
	}
	/**
	 * @return the nomeFuncionario
	 */
	private String getNomeFuncionario() {
		return nomeFuncionario;
	}
	/**
	 * @param nomeFuncionario the nomeFuncionario to set
	 */
	private void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}
	/**
	 * @return the telefoneFuncionario
	 */
	private String getTelefoneFuncionario() {
		return telefoneFuncionario;
	}
	/**
	 * @param telefoneFuncionario the telefoneFuncionario to set
	 */
	private void setTelefoneFuncionario(String telefoneFuncionario) {
		this.telefoneFuncionario = telefoneFuncionario;
	}
	/**
	 * @return the enderecoFuncionario
	 */
	private String getEnderecoFuncionario() {
		return enderecoFuncionario;
	}
	/**
	 * @param enderecoFuncionario the enderecoFuncionario to set
	 */
	private void setEnderecoFuncionario(String enderecoFuncionario) {
		this.enderecoFuncionario = enderecoFuncionario;
	}
	/**
	 * @return the funcaoFuncionario
	 */
	private String getFuncaoFuncionario() {
		return funcaoFuncionario;
	}
	/**
	 * @param funcaoFuncionario the funcaoFuncionario to set
	 */
	private void setFuncaoFuncionario(String funcaoFuncionario) {
		this.funcaoFuncionario = funcaoFuncionario;
	}

}
}