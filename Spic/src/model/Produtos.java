/**
 * 
 */
package model;




/**
 * @author RicardoNote
 *
 */
public class Produtos {
	//declaração de variaves
	private int idProdutos;
	private String codigoBarras;
	private String descricao;
	private String aplicacao;
	private String medida;
	private String lote;
	private double valorVenda;
	private double valorCusto;
	private double quantidade;
	private int idlotes_lotes;
	
	public Produtos(){
		
	}
	
	
// inicio dos getters
	public int getIdProdutos() {
		return idProdutos;
	}
	public String getCodigoBarras() {
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

	public String getLote() {
		return lote;
	}
	
	public double getValorVenda(){
		
		return valorVenda;
	}
	
	public double getValorCusto(){
		
		return valorCusto;
		
	}
	
	public double getQuantidade(){
		
		return quantidade;
	}
	
	public int getIdlotes_lotes(){
		
		
		return idlotes_lotes;
	}

	// inicio dos setters 
	
	public void setIdProdutos(int idProdutos) {
		this.idProdutos = idProdutos;
	}
	
	public void setCodigoBarras(String codigoBarras) {
		
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
	
	public void setLote(String lote) {
		this.lote = lote;
	}
	
	
	public void setValorVenda(double valorVenda){
		
		this.valorVenda = valorVenda;
		
	}
	
	public void setValorCusto(double valorCusto){

		
		this.valorCusto = valorCusto;
		
	}
	
	public void setQuantidade(double quantidade){
		
		this.quantidade = quantidade;
		
	}
	
	public void setLotes_lotes(int idlotes_lotes){
		
		this.idlotes_lotes = idlotes_lotes;
		
	}

}
