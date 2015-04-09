/**
 * 
 */
package BusinessRules;


import java.util.Date;


/**
 * @author RicardoNote
 *
 */
public class Produtos {
	//declaração de variaves
	private int idProdutos;
	private int codigoBarras;
	private String descricao;
	private String aplicacao;
	private String medida;
	private Boolean ativo;
	private Date dataValidade;
	private Date dataFabricacao;
	private String lote;
	
	//método construtor
	
	
	public Produtos(int idProdutos,int codigoBarras,String descricao,String aplicacao,String medida,Boolean ativo, Date dataValidade,  Date dataFabricacao,String lote) {
		this.idProdutos = idProdutos;
		this.codigoBarras = codigoBarras;
		this.descricao = descricao;
		this.aplicacao = aplicacao;
		this.medida =medida;
		this.ativo = ativo;
		this.dataValidade = dataValidade;
		this.dataFabricacao = dataFabricacao;
		this.lote = lote;	
	}
	public Produtos() {
		this.codigoBarras = 0;
		this.descricao = null;
		this.aplicacao = null;
		this.medida =medida;
		this.ativo = ativo;
		this.dataValidade = dataValidade;
		this.dataFabricacao = dataFabricacao;
		this.lote = lote;	
	}
	
// inicio dos getters
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

	public Boolean getAtivo() {
		return ativo;
	}

	public Date getDataValidade() {
		return dataValidade;
	}

	public Date getDataFabricacao() {
		return dataFabricacao;
	}

	public String getLote() {
		return lote;
	}
	
	// inicio dos setters 
	
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
	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}
	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
	public void setLote(String lote) {
		this.lote = lote;
	}
	
	
	void mostraProduto(){
		
		
		
		System.out.println();
		
	
	}
	
	


}
