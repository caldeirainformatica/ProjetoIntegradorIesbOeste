/**
 * 
 */
package Persistence;


import java.util.Date;


/**
 * @author RicardoNote
 *
 */
public class Produtos {
	//declaração de variaves
	private int codigoBarras;
	private String descricao;
	private String aplicacao;
	private String medida;
	private Boolean ativo;
	private Date dataValidade;
	private Date dataFabricacao;
	private String lote;
	
	//método construtor
	
	
	public Produtos(int codigoBarras,String descricao,String aplicacao,String medida,Boolean ativo, Date dataValidade,  Date dataFabricacao,String lote) {
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
	
		
	
	void mostraProduto(){
		
		
		
		System.out.println(getDataValidade()+" "+getDataFabricacao());
		
	
	}


}
