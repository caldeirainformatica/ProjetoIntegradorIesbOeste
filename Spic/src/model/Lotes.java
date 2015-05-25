package model;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;




public class Lotes {
	
	
	
	private int idLote;
	private String lote;
	private Date dataValidade;
	private Date dataFabricacao;


	public Lotes() {
		
	}


	public void setIdlote(int idlote) {
		this.idLote = idlote;
	}


	public void setLote(String i) {
		this.lote = i;
	}


	public void setDataValidade(String dataValidade) throws ParseException  {
		if(dataValidade.matches("\\d{4}-\\d{2}-\\d{2}")){
			String[] data = dataValidade.split("-");
			dataValidade = 	data[2]	+ "/" + data[1] + "/"+ data[0];
			
			
		}
		
		DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");  
		java.sql.Date data = new java.sql.Date(fmt.parse(dataValidade).getTime());  
		this.dataValidade =	data;
	}


	public void setDataFabricacao(String dataFabricacao) throws ParseException {
		
		if(dataFabricacao.matches("\\d{4}-\\d{2}-\\d{2}")){
			
			String[] data = dataFabricacao.split("-");
			dataFabricacao = 	data[2]	+ "/" + data[1] + "/"+ data[0];
			
			
		}
		
		DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");  
		java.sql.Date data = new java.sql.Date(fmt.parse(dataFabricacao).getTime());  
		this.dataFabricacao = data;
	}
	



	public int getIdlote() {
		return idLote;
	}


	public String getLote() {
		return lote;
	}


	public Date getDataValidade() {
		return dataValidade;
	}


	public Date getDataFabricacao() {
		return dataFabricacao;
	}
	
	
}
