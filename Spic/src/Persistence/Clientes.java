/**
 * 
 */
package Persistence;

/**
 * @author Geisson
 *
 */
public class Clientes {
	private String razãoSocial;
	public Clientes(String razãoSocial, String cnpj_cpf, String ie_rg, String endereço, String numero,
			String complemento, String telComercial, String telCelular, String contato, String situação,
			String nomeCliente) {
		super();
		this.razãoSocial = razãoSocial;
		this.cnpj_cpf = cnpj_cpf;
		this.ie_rg = ie_rg;
		this.endereço = endereço;
		this.numero = numero;
		this.complemento = complemento;
		this.telComercial = telComercial;
		this.telCelular = telCelular;
		this.contato = contato;
		this.situação = situação;
		this.nomeCliente = nomeCliente;
	}
	private String cnpj_cpf;
	private String ie_rg;
	private String endereço;
	private String numero;
	private String complemento;
	private String telComercial;
	private String telCelular;
	private String contato;
	private String situação;
	
	private String nomeCliente;
	/**
	 * @return the nomeCliente
	 */
	public String getNomeCliente() {
		return nomeCliente;
	}
	/**
	 * @param nomeCliente the nomeCliente to set
	 */
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	/**
	 * @return the razãoSocial
	 */
	public String getRazãoSocial() {
		return razãoSocial;
	}
	/**
	 * @param razãoSocial the razãoSocial to set
	 */
	public void setRazãoSocial(String razãoSocial) {
		this.razãoSocial = razãoSocial;
	}
	/**
	 * @return the cnpj_cpf
	 */
	public String getCnpj_cpf() {
		return cnpj_cpf;
	}
	/**
	 * @param cnpj_cpf the cnpj_cpf to set
	 */
	public void setCnpj_cpf(String cnpj_cpf) {
		this.cnpj_cpf = cnpj_cpf;
	}
	/**
	 * @return the ie_rg
	 */
	public String getIe_rg() {
		return ie_rg;
	}
	/**
	 * @param ie_rg the ie_rg to set
	 */
	public void setIe_rg(String ie_rg) {
		this.ie_rg = ie_rg;
	}
	/**
	 * @return the endereço
	 */
	public String getEndereço() {
		return endereço;
	}
	/**
	 * @param endereço the endereço to set
	 */
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	/**
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}
	/**
	 * @param numero the numero to set
	 */
	public void setNumero(String numero) {
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
	 * @return the telComercial
	 */
	public String getTelComercial() {
		return telComercial;
	}
	/**
	 * @param telComercial the telComercial to set
	 */
	public void setTelComercial(String telComercial) {
		this.telComercial = telComercial;
	}
	/**
	 * @return the telCelular
	 */
	public String getTelCelular() {
		return telCelular;
	}
	/**
	 * @param telCelular the telCelular to set
	 */
	public void setTelCelular(String telCelular) {
		this.telCelular = telCelular;
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
	 * @return the situação
	 */
	public String getSituação() {
		return situação;
	}
	/**
	 * @param situação the situação to set
	 */
	public void setSituação(String situação) {
		this.situação = situação;
	}
	
	
	
	
	

}
