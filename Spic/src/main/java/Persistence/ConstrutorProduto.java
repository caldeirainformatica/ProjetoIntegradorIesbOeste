package Persistence;

import java.util.Calendar;

/* Denominado Construtor Produto, com função de receber e fornecer dados para as classes que assim solicitarem.
 * com variaveis privadas e proibindo qualquer contato com as mesmas, caso seja necessário qualquer dado
 * solicitar utilizando gets and sets
 */
public class ConstrutorProduto {

	private int idProdutos;
	private int codigoBarras;
	private String descricao;
	private String aplicacao;
	private String medida;
	private Calendar dataValidade;
	private Calendar dataFabricacao;
	private String lote;

	public int getIdProdutos() {
		return idProdutos;
	}

	public int getCodigoBarras() {
		return codigoBarras;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getAplicacao() {
		return aplicacao;
	}

	public String getMedida() {
		return medida;
	}

	public Calendar getDataValidade() {
		return dataValidade;
	}

	public Calendar getDataFabricacao() {
		return dataFabricacao;
	}

	public String getLote() {
		return lote;
	}

	public void setIdProdutos(int idProdutos) {
		this.idProdutos = idProdutos;
	}

	public void setCodigoBarras(int codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setAplicacao(String aplicacao) {
		this.aplicacao = aplicacao;
	}

	public void setMedida(String medida) {
		this.medida = medida;
	}

	public void setDataValidade(Calendar dataValidade) {
		this.dataValidade = dataValidade;
	}

	public void setDataFabricacao(Calendar dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

}
