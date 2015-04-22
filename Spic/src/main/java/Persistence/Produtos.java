package Persistence;

import java.sql.Date;

public class Produtos {

	private int idProdutos;
	private int codigoBarras;
	private String descricao;
	private String aplicacao;
	private String medida;
	private Date dataValidade;
	private Date dataFabricacao;
	private String lote;
	/**
	 * @return the idProdutos
	 */
	public int getIdProdutos() {
		return idProdutos;
	}
	/**
	 * @param idProdutos the idProdutos to set
	 */
	public void setIdProdutos(int idProdutos) {
		this.idProdutos = idProdutos;
	}
	/**
	 * @return the codigoBarras
	 */
	public int getCodigoBarras() {
		return codigoBarras;
	}
	/**
	 * @param codigoBarras the codigoBarras to set
	 */
	public void setCodigoBarras(int codigoBarras) {
		this.codigoBarras = codigoBarras;
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
	 * @return the aplicacao
	 */
	public String getAplicacao() {
		return aplicacao;
	}
	/**
	 * @param aplicacao the aplicacao to set
	 */
	public void setAplicacao(String aplicacao) {
		this.aplicacao = aplicacao;
	}
	/**
	 * @return the medida
	 */
	public String getMedida() {
		return medida;
	}
	/**
	 * @param medida the medida to set
	 */
	public void setMedida(String medida) {
		this.medida = medida;
	}
	/**
	 * @return the dataValidade
	 */
	public Date getDataValidade() {
		return dataValidade;
	}
	/**
	 * @param dataValidade the dataValidade to set
	 */
	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}
	/**
	 * @return the dataFabricacao
	 */
	public Date getDataFabricacao() {
		return dataFabricacao;
	}
	/**
	 * @param dataFabricacao the dataFabricacao to set
	 */
	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
	/**
	 * @return the lote
	 */
	public String getLote() {
		return lote;
	}
	/**
	 * @param lote the lote to set
	 */
	public void setLote(String lote) {
		this.lote = lote;
	}
	
	
}
