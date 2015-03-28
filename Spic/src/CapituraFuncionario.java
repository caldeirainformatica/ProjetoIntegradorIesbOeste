/**
 * @author Ricardo Caldeira

 *
 */
public class CapituraFuncionario(idMecanico int, cpfFuncionario int, nomeFuncionario String, telefoneFuncionario String, String endereco) {

	int idMecanico, cpfFuncionario;
	String nomeFuncionario, telefoneFuncionario, endereco;
	/**
	 * @return the idMecanico
	 */
	private int getIdMecanico() {
		return idMecanico;
	}
	/**
	 * @param idMecanico the idMecanico to set
	 */
	private void setIdMecanico(int idMecanico) {
		this.idMecanico = idMecanico;
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
	 * @return the endereco
	 */
	private String getEndereco() {
		return endereco;
	}
	/**
	 * @param endereco the endereco to set
	 */
	private void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
  // tive que voltar ao trabalho, lembrar de incluir os demais campo e quando estiver no eclipse, criar os gets e sets.
  
  //essa classe apenas vai pegar e guardar no array os dados de mecanicos, bem como tempo disponivel para o serviço
}
