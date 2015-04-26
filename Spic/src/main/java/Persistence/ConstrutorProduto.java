package Persistence;

import java.sql.Date;
import java.util.Calendar;

public class ConstrutorProduto {
	
	int codigoBarras;
	String descricao;
	String aplicacao;
	String medida;
	Calendar dataValidade;
	Calendar dataFabricacao;
	String lote;
	
	
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
	public void setDataValidade(Calendar dataValidade) {
		this.dataValidade = dataValidade;
	}
	public void setDataFabricacao(Calendar dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
	public void setLote(String lote) {
		this.lote = lote;
	}
	
	
	

}
