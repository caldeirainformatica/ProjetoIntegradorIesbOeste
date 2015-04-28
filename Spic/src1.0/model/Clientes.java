/**
 * 
 */
package model;

/**
 * @author Geisson
 *
 */
public class Clientes {
	private String razaoSocial;
	public Clientes(String razaoSocial, long cnpj_cpf, long ie_rg, String endereço, int numero,
			String complemento, int telComercial, int telCelular, int contato, String situacao,
			String nomeCliente) {
		super();
		this.razaoSocial = razaoSocial;
		this.cnpj_cpf = cnpj_cpf;
		this.ie_rg = ie_rg;
		this.endereço = endereço;
		this.numero = numero;
		this.complemento = complemento;
		this.telComercial = telComercial;
		this.telCelular = telCelular;
		this.contato = contato;
		this.situacao = situacao;
		this.nomeCliente = nomeCliente;
	}
	public Clientes() {
		
	}
	private long cnpj_cpf;
	private long ie_rg;
	private String endereço;
	private int numero;
	private String complemento;
	private int telComercial;
	private int telCelular;
	private int contato;
	private String situacao;
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
		return razaoSocial;
	}
	/**
	 * @param razãoSocial the razãoSocial to set
	 */
	public void setRazãoSocial(String razãoSocial) {
		this.razaoSocial = razãoSocial;
	}
	/**
	 * @return the cnpj_cpf
	 */
	public long getCnpj_cpf() {
		return cnpj_cpf;
	}
	/**
	 * @param cnpj_cpf the cnpj_cpf to set
	 */
	public void setCnpj_cpf(long cnpj_cpf) {
		this.cnpj_cpf = cnpj_cpf;
	}
	/**
	 * @return the ie_rg
	 */
	public long getIe_rg() {
		return ie_rg;
	}
	/**
	 * @param ie_rg the ie_rg to set
	 */
	public void setIe_rg(long ie_rg) {
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
	 * @return the telComercial
	 */
	public int getTelComercial() {
		return telComercial;
	}
	/**
	 * @param telComercial the telComercial to set
	 */
	public void setTelComercial(int telComercial) {
		this.telComercial = telComercial;
	}
	/**
	 * @return the telCelular
	 */
	public int getTelCelular() {
		return telCelular;
	}
	/**
	 * @param telCelular the telCelular to set
	 */
	public void setTelCelular(int telCelular) {
		this.telCelular = telCelular;
	}
	/**
	 * @return the contato
	 */
	public int getContato() {
		return contato;
	}
	/**
	 * @param contato the contato to set
	 */
	public void setContato(int contato) {
		this.contato = contato;
	}
	/**
	 * @return the situação
	 */
	public String getSituacao() {
		return situacao;
	}
	/**
	 * @param situação the situação to set
	 */
	public void setSituação(String situacao) {
		this.situacao = situacao;
	}
	
	
	
	
	

}
