/**
 * 
 */
package BusinessRules;


import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


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
	private Calendar dataValidade;
	private Calendar dataFabricacao;
	private String lote;
	
	//método construtor
	
	
	public Produtos(int idProdutos,int codigoBarras,String descricao,String aplicacao,String medida,Boolean ativo, Calendar dataValidade,  Calendar dataFabricacao,String lote) {
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

	public Calendar getDataValidade() {
		return dataValidade;
	}

	public Calendar getDataFabricacao() {
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
	public void setDataFabricacao(int dia, int mes, int ano) {
		this.dataFabricacao = new GregorianCalendar(ano, mes, dia);
	}
	public void setLote(String lote) {
		this.lote = lote;
	}
	public void setDataValidade(int dia, int mes, int ano) {
		this.dataValidade = new GregorianCalendar(ano, mes, dia);
	}
	
	
	
	void mostraProduto(){
		
		
		
		System.out.println();
		
	
	}
	


}
