/**
 * 
 */
package Cadastro;

/**
 * @author Ricardo Caldeira/Gabriel
 *
 */
public class funcionarios {
	
	private String idfuncionarios;
	/**
	 * @param idfuncionarios
	 * @param nome
	 * @param cpfFuncionarios
	 * @param telFuncionarios
	 * @param empresas_idEmpresas
	 * @param enderecos_idEnderecos
	 * @param funcaoFuncionarios_idFuncaoFuncionarios
	 * @param bairros_idBairros
	 * @param cidades_idCidades
	 */
	public funcionarios(String idfuncionarios, String nome,
			int cpfFuncionarios, int telFuncionarios,
			String empresas_idEmpresas, String enderecos_idEnderecos,
			String funcaoFuncionarios_idFuncaoFuncionarios,
			String bairros_idBairros, String cidades_idCidades) {
		super();
		this.idfuncionarios = idfuncionarios;
		this.nome = nome;
		this.cpfFuncionarios = cpfFuncionarios;
		this.telFuncionarios = telFuncionarios;
		this.empresas_idEmpresas = empresas_idEmpresas;
		this.enderecos_idEnderecos = enderecos_idEnderecos;
		this.funcaoFuncionarios_idFuncaoFuncionarios = funcaoFuncionarios_idFuncaoFuncionarios;
		this.bairros_idBairros = bairros_idBairros;
		this.cidades_idCidades = cidades_idCidades;
	}
	private String nome;
	private int cpfFuncionarios;
	private int telFuncionarios;
	private String empresas_idEmpresas;
	private String enderecos_idEnderecos;
	private String funcaoFuncionarios_idFuncaoFuncionarios;
	private String bairros_idBairros;
	private String cidades_idCidades;
	/**
	 * @return the idfuncionarios
	 */
	public String getIdfuncionarios() {
		return idfuncionarios;
	}
	/**
	 * @param idfuncionarios the idfuncionarios to set
	 */
	public void setIdfuncionarios(String idfuncionarios) {
		this.idfuncionarios = idfuncionarios;
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the cpfFuncionarios
	 */
	public int getCpfFuncionarios() {
		return cpfFuncionarios;
	}
	/**
	 * @param cpfFuncionarios the cpfFuncionarios to set
	 */
	public void setCpfFuncionarios(int cpfFuncionarios) {
		this.cpfFuncionarios = cpfFuncionarios;
	}
	/**
	 * @return the telFuncionarios
	 */
	public int getTelFuncionarios() {
		return telFuncionarios;
	}
	/**
	 * @param telFuncionarios the telFuncionarios to set
	 */
	public void setTelFuncionarios(int telFuncionarios) {
		this.telFuncionarios = telFuncionarios;
	}
	/**
	 * @return the empresas_idEmpresas
	 */
	public String getEmpresas_idEmpresas() {
		return empresas_idEmpresas;
	}
	/**
	 * @param empresas_idEmpresas the empresas_idEmpresas to set
	 */
	public void setEmpresas_idEmpresas(String empresas_idEmpresas) {
		this.empresas_idEmpresas = empresas_idEmpresas;
	}
	/**
	 * @return the enderecos_idEnderecos
	 */
	public String getEnderecos_idEnderecos() {
		return enderecos_idEnderecos;
	}
	/**
	 * @param enderecos_idEnderecos the enderecos_idEnderecos to set
	 */
	public void setEnderecos_idEnderecos(String enderecos_idEnderecos) {
		this.enderecos_idEnderecos = enderecos_idEnderecos;
	}
	/**
	 * @return the funcaoFuncionarios_idFuncaoFuncionarios
	 */
	public String getFuncaoFuncionarios_idFuncaoFuncionarios() {
		return funcaoFuncionarios_idFuncaoFuncionarios;
	}
	/**
	 * @param funcaoFuncionarios_idFuncaoFuncionarios the funcaoFuncionarios_idFuncaoFuncionarios to set
	 */
	public void setFuncaoFuncionarios_idFuncaoFuncionarios(
			String funcaoFuncionarios_idFuncaoFuncionarios) {
		this.funcaoFuncionarios_idFuncaoFuncionarios = funcaoFuncionarios_idFuncaoFuncionarios;
	}
	/**
	 * @return the bairros_idBairros
	 */
	public String getBairros_idBairros() {
		return bairros_idBairros;
	}
	/**
	 * @param bairros_idBairros the bairros_idBairros to set
	 */
	public void setBairros_idBairros(String bairros_idBairros) {
		this.bairros_idBairros = bairros_idBairros;
	}
	/**
	 * @return the cidades_idCidades
	 */
	public String getCidades_idCidades() {
		return cidades_idCidades;
	}
	/**
	 * @param cidades_idCidades the cidades_idCidades to set
	 */
	public void setCidades_idCidades(String cidades_idCidades) {
		this.cidades_idCidades = cidades_idCidades;
	}
	
}
