package controle;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Con_Lote_Ezeq {

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

		try {
			if (idLote > 0) {

				this.idLote = idLote;
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public void setDescricao(String descricao) {

		try {
			if (!descricao.equals("")) {

				this.descricao = descricao;
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public void setDateValidade(Date dateValidade) {
		this.dateValidade = dateValidade;
		
		String x=request.setParameter("dataUsuario"); //pegando dados de um formulário WEB 
		SimpleDateFormat sdf1= new SimpleDateFormat("dd/MM/yyyy"); 
		Date dataUsuario=sdf1.parse(x);

		}

	public void setDateFabricacao(Date dateFabricacao) {
		this.dateFabricacao = dateFabricacao;
	}

}
