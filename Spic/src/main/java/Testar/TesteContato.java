package Testar;

import java.util.Calendar;
import Persistence.Contato;
import Persistence.ContatoDAO;

public class TesteContato {
	public static void main(String[] args) {
		Contato contato = new Contato();
		contato.setNome("RICARDO");
		contato.setEmail("ricardo@cpdsi.com.br");
		contato.setEndereco("qnq 02 conjunto 1 casa 38");
		contato.setDataNascimento(Calendar.getInstance());
		
		ContatoDAO dao = new ContatoDAO();
		dao.ContatoDao();
		dao.adiciona(contato);
		System.out.println("gravado");
		
	}

}
