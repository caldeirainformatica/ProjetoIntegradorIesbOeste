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

	
	//Metodo construtor para ser utilizado pelo pacote de Regras de Negócios (BusinessRules)
	public ConstrutorProduto(int idProdutos, int codigoBarras,
			String descricao, String aplicacao, String medida,
			Calendar dataValidade, Calendar dataFabricacao, String lote) {
		super();
		this.idProdutos = idProdutos;
		this.codigoBarras = codigoBarras;
		this.descricao = descricao;
		this.aplicacao = aplicacao;
		this.medida = medida;
		this.dataValidade = dataValidade;
		this.dataFabricacao = dataFabricacao;
		this.lote = lote;
	}

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

}
