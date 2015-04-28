/**
 * 
 */
package businessRules;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
	public Produtos(){
		
	}
	
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

	
	public String getDataValidade() throws ParseException{
		
		int ano = dataValidade.get(Calendar.YEAR);
		int mes = dataValidade.get(Calendar.MONTH );
		int dia = dataValidade.get(Calendar.DAY_OF_MONTH);
		String dataFormatada = dia +"/"+mes+"/" + ano ;
		DateFormat df = new SimpleDateFormat("dd/MM/yyy");
		Date dataConvertida = df.parse(dataFormatada) ;
		return df.format(dataConvertida);
		
		
	}

	public String getDataFabricacao() throws ParseException {
		int ano = dataFabricacao.get(Calendar.YEAR);
		int mes = dataFabricacao.get(Calendar.MONTH );
		int dia = dataFabricacao.get(Calendar.DAY_OF_MONTH);
		String dataFormatada = dia +"/"+mes+"/" + ano ;
		DateFormat df = new SimpleDateFormat("dd/MM/yyy");
		Date dataConvertida = df.parse(dataFormatada) ;
		return df.format(dataConvertida);
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
	public void setDataValidade(int ano,int mes, int dia){
		
		this.dataValidade = new GregorianCalendar(ano, mes, dia);
		Calendar dataValidade = Calendar.getInstance(); 
		dataValidade.set(Calendar.YEAR, ano);
		dataValidade.set(Calendar.MONTH, mes);
		dataValidade.set(Calendar.DAY_OF_MONTH, dia);
	}
	public void setDataFabricacao(int ano, int mes, int dia) {
		this.dataFabricacao = new GregorianCalendar(ano, mes, dia);
		Calendar dataFabricacao = Calendar.getInstance(); 
		dataFabricacao.set(Calendar.YEAR, ano);
		dataFabricacao.set(Calendar.MONTH, mes);
		dataFabricacao.set(Calendar.DAY_OF_MONTH, dia);
		
	}
	public void setLote(String lote) {
		this.lote = lote;
	}
	
	
	
	void mostraProduto(){
		
		
		
		System.out.println();
		
	
	}
	


}
