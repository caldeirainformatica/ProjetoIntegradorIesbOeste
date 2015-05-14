package controle;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/*
 * 
 * 
 *@author Ezequiel Henrique
 * 
 * 
 * 
 */

public class Con_Lote_Ezeq {

	private int idLote;
	private String descricao;
	private String dateValidade;
	private String dateFabricacao;

	public int getIdLote() {
		return idLote;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getDateValidade() {
		return dateValidade;
	}

	public String getDateFabricacao() {
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

	public void setDateValidade(String dateValidade) {

		
		DateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		sdf1.setLenient(false);

		try {
			sdf1.parse(dateValidade);
			this.dateValidade = dateValidade;
			
			System.out.println(dateValidade);
		} catch (ParseException e) {

			e.printStackTrace();
		}

		/*
		 * String x = new String("dataUsuario"); SimpleDateFormat sdf1 = new
		 * SimpleDateFormat("dd/MM/yyyy"); try { Date dataUsuario =
		 * sdf1.parse(x); } catch (ParseException e) { // TODO Auto-generated
		 * catch block e.printStackTrace(); }
		 */

	}

	public void setDateFabricacao(String dateFabricacao) {
		
	
	String x = dateFabricacao;
	DateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
	sdf1.setLenient(false);
	
	try {
		sdf1.parse(x);
		
		this.dateFabricacao = dateFabricacao;
	} catch (ParseException e) {
		
		e.printStackTrace();
	}
	}

}
