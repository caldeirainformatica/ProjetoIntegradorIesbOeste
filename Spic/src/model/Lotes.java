package model;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Lotes {
	
	
	
	private int idLote;
	private int lote;
	private java.sql.Date dataValidade;
	private java.sql.Date dataFabricacao;


	public Lotes() {
		
	}


	public void setIdlote(int idlote) {
		this.idLote = idlote;
	}


	public void setLote(int lote) {
		this.lote = lote;
	}


	public void setDataValidade(String dataValidade) throws ParseException {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		java.util.Date data = df.parse(dataValidade);
		this.dataValidade =	new java.sql.Date(data.getTime());
	}


	public void setDataFabricacao(String dataFabricacao) throws ParseException {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		java.util.Date data = df.parse(dataFabricacao);
		this.dataFabricacao = new java.sql.Date(data.getTime());
	}


	public int getIdlote() {
		return idLote;
	}


	public int getLote() {
		return lote;
	}


	public Date getDataValidade() {
		return dataValidade;
	}


	public Date getDataFabricacao() {
		return dataFabricacao;
	}
	
	
	
}
