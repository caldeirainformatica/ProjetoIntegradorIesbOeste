/**
 * 
 */
package model;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;



/**
 * @author RicardoNote
 *
 */
public class Produtos {
	//declaração de variaves
	private int idProdutos;
	private long codigoBarras;
	private String descricao;
	private String aplicacao;
	private String medida;
	private String ativo;
	private Date dataValidade;
	private Date dataFabricacao;
	private String lote;
	private float valorVenda;
	private float valorCusto;
	
	//método construtor
	public Produtos(){
		
	}
	
	/*//Método construtor aprimorado
	public Produtos(int idProdutos,int codigoBarras,String descricao,String aplicacao,String medida,Boolean ativo, String dataValidade,  String dataFabricacao,String lote) throws ParseException {
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyy");
		
		this.idProdutos = idProdutos;
		this.codigoBarras = codigoBarras;
		this.descricao = descricao;
		this.aplicacao = aplicacao;
		this.medida =medida;
		this.ativo = ativo;
		this.dataValidade = df.parse(dataValidade);
		this.dataFabricacao = df.parse(dataFabricacao);
		this.lote = lote;	
	}*/


// inicio dos getters
	public int getIdProdutos() {
		return idProdutos;
	}
	public long getCodigoBarras() {
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

	public String getAtivo() {
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
	
	public void setCodigoBarras(long codigoBarras) {
		
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
	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}
	public void setDataValidade(String dataValidade) throws ParseException{
		
		DateFormat df = new SimpleDateFormat("dd/MM/yyy");
		java.util.Date data = df.parse(dataValidade);
		this.dataValidade =	new java.sql.Date(data.getTime());
		
	}
	public void setDataFabricacao(String dataFabricacao)throws ParseException {
		DateFormat df = new SimpleDateFormat("dd/MM/yyy");
		java.util.Date data = df.parse(dataFabricacao);
		this.dataFabricacao = new java.sql.Date(data.getTime());
		
	}
	public void setLote(String lote) {
		this.lote = lote;
	}
	

}
