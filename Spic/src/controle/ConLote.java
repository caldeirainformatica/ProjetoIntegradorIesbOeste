/**
 * 
 */
package controle;

import java.util.Date;

/**
 * @author Ricardo Caldeira
 * @autor Gabriel Fernandes
 * @author Ezequiel Henrique
 *
 */
public class ConLote {

	private int idLote;
	private String descricao;
	private Date dateValidade;
	private Date dateFabricacao;
	
	
	
	public int getIdLote() {
		return idLote;
	}
	public String getDescricao() {
		return descricao;
	}
	public Date getDateValidade() {
		return dateValidade;
	}
	public Date getDateFabricacao() {
		return dateFabricacao;
	}
	public void setIdLote(int idLote) {
		this.idLote = idLote;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void setDateValidade(Date dateValidade) {
		this.dateValidade = dateValidade;
	}
	public void setDateFabricacao(Date dateFabricacao) {
		this.dateFabricacao = dateFabricacao;
	}
	
	
	 
	
	
	
	
	
	
	
	
}
