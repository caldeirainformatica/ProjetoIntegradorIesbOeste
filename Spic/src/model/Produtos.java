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
	//private String fklote;
	private float valorVenda;
	private float valorCusto;
	private double quantidade;
	
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

	//public String getLote() {
	//	return fklote;
	//}
	
	public float getValorVenda(){
		
		return valorVenda;
	}
	
	public float getValorCusto(){
		
		return valorCusto;
		
	}
	
	public double getQuantidade(){
		
		return quantidade;
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
	
	//public void setfkLote(String fklote) {
		//this.fklote = fklote;
	//}
	
	
	public void setValorVenda(float valorVenda){
		
		this.valorVenda = valorVenda;
		
	}
	
	public void setValorCusto(float valorCusto){
		
		this.valorCusto = valorCusto;
		
	}
	
	public void setQuantidade(double quantidade){
		
		this.quantidade = quantidade;
		
	}
	
	

}
