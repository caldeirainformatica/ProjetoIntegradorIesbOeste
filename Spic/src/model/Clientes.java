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
	public Clientes(String razaoSocial, long cnpj_cpf, long ie_rg, String endere�o, int numero,
			String complemento, int telComercial, int telCelular, int contato, String situacao,
			String nomeCliente) {
		super();
		this.razaoSocial = razaoSocial;
		this.cnpj_cpf = cnpj_cpf;
		this.ie_rg = ie_rg;
		this.endere�o = endere�o;
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
	private String endere�o;
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
	 * @return the raz�oSocial
	 */
	public String getRaz�oSocial() {
		return razaoSocial;
	}
	/**
	 * @param raz�oSocial the raz�oSocial to set
	 */
	public void setRaz�oSocial(String raz�oSocial) {
		this.razaoSocial = raz�oSocial;
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
	 * @return the endere�o
	 */
	public String getEndere�o() {
		return endere�o;
	}
	/**
	 * @param endere�o the endere�o to set
	 */
	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
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
	 * @return the situa��o
	 */
	public String getSituacao() {
		return situacao;
	}
	/**
	 * @param situa��o the situa��o to set
	 */
	public void setSitua��o(String situacao) {
		this.situacao = situacao;
	}
	
	
	
	
	

}
