/**
 * 
 */
package Cadastro;

import java.security.InvalidParameterException;
import java.sql.Date;

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
	
/*	public Produtos(int codigoBarras,String descricao,String aplicacao,String medida,Boolean ativo,Date dataValidade,Date dataFabricacao,String lote) {
		this.codigoBarras = codigoBarras;
		//this.descricao = descricao;
	this.aplicacao = aplicacao;
		this.medida =medida;
		this.ativo = ativo;
		this.dataValidade = dataValidade;
		this.dataFabricacao = dataFabricacao;
		this.lote = lote;
	}*/
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
	
	// inicio dos setters 
	
	public void setCodigoBarras(int codigoBarras) {
		
		try{
		this.codigoBarras = codigoBarras;
		}
		catch(InvalidParameterException e){
			
			System.out.println("Digite um valor válido:");
		}
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
	
	
	


}
