/**
 * 
 */
package BusinessRules;

import java.util.InputMismatchException;

/**
 * @author Ricardo Caldeira
 *
 */
public class Empresas {
	/**
	 * @param idempresas
	 * @param fantasia
	 * @param cnpj
	 * @param ie
	 * @param endereco
	 * @param numero
	 * @param complemento
	 * @param telefone
	 * @param celular
	 * @param contato
	 * @param endereco_idEndereco
	 * @param bairro_idbairro
	 * @param cidades_idcidades
	 */
	private int idEmpresas;
	private String fantasia;
	private long cnpj;
	private int ie;
	private String endereco;
	private int numero;
	private String complemento;
	private int telefone;
	private int celular;
	private String contato;
	private String endereco_idEndereco;
	private String bairro_idbairro;
	private String cidades_idcidades;
	
	public Empresas(){ 
		
	}
		
	
	public Empresas(int idEmpresas, String fantasia, int cnpj, int ie,
			String endereco, int numero, String complemento, int telefone,
			int celular, String contato, String endereco_idEndereco,
			String bairro_idbairro, String cidades_idcidades) {
	super();
		this.idEmpresas = idEmpresas;
		this.fantasia = fantasia;
		this.cnpj = cnpj;
		this.ie = ie;
		this.endereco = endereco;
		this.numero = numero;
		this.complemento = complemento;
		this.telefone = telefone;
		this.celular = celular;
		this.contato = contato;
		this.endereco_idEndereco = endereco_idEndereco;
		this.bairro_idbairro = bairro_idbairro;
		this.cidades_idcidades = cidades_idcidades;
	}

	/**
	 * @return the idEmpresas
	 */
	public int getIdempresas() {
		return idEmpresas;
	}
	/**
	 * @param idempresas the idEmpresas to set
	 */
	public void setIdempresas(int idEmpresas) {
		
		this.idEmpresas = idEmpresas;
	}
	/**
	 * @return the fantasia
	 */
	public String getFantasia() {
		return fantasia;
	}
	/**
	 * @param fantasia the fantasia to set
	 */
	public void setFantasia(String fantasia) {
		this.fantasia = fantasia;
	}
	/**
	 * @return the cnpj
	 */
	public long getCnpj() {
		return cnpj;
	}
	/**
	 * @param cnpj the cnpj to set
	 */
	public void setCnpj(long cnpj) {
		
			this.cnpj = cnpj;
	

		}	
	
	
	/**
	 * @return the ie
	 */
	public int getIe() {
		return ie;
	}
	/**
	 * @param ie the ie to set
	 */
	public void setIe(int ie) {
		this.ie = ie;
	}
	/**
	 * @return the endereco
	 */
	public String getEndereco() {
		return endereco;
	}
	/**
	 * @param endereco the endereco to set
	 */
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}
	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}
	/**
	 * @return the complemento
	 */
	public String getComplemento() {
		return complemento;
	}
	/**
	 * @param complemento the complemento to set
	 */
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	/**
	 * @return the telefone
	 */
	public int getTelefone() {
		return telefone;
	}
	/**
	 * @param telefone the telefone to set
	 */
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	/**
	 * @return the celular
	 */
	public int getCelular() {
		return celular;
	}
	/**
	 * @param celular the celular to set
	 */
	public void setCelular(int celular) {
		this.celular = celular;
	}
	/**
	 * @return the contato
	 */
	public String getContato() {
		return contato;
	}
	/**
	 * @param contato the contato to set
	 */
	public void setContato(String contato) {
		this.contato = contato;
	}
	/**
	 * @return the endereco_idEndereco
	 */
	public String getEndereco_idEndereco() {
		return endereco_idEndereco;
	}
	/**
	 * @param endereco_idEndereco the endereco_idEndereco to set
	 */
	public void setEndereco_idEndereco(String endereco_idEndereco) {
		this.endereco_idEndereco = endereco_idEndereco;
	}
	/**
	 * @return the bairro_idbairro
	 */
	public String getBairro_idbairro() {
		return bairro_idbairro;
	}
	/**
	 * @param bairro_idbairro the bairro_idbairro to set
	 */
	public void setBairro_idbairro(String bairro_idbairro) {
		this.bairro_idbairro = bairro_idbairro;
	}
	/**
	 * @return the cidades_idcidades
	 */
	public String getCidades_idcidades() {
		return cidades_idcidades;
	}
	/**
	 * @param cidades_idcidades the cidades_idcidades to set
	 */
	public void setCidades_idcidades(String cidades_idcidades) {
		this.cidades_idcidades = cidades_idcidades;
	}
}
