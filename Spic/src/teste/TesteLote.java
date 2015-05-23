package teste;

import java.text.ParseException;

import persistencia.DaoLote;
import controle.ConLote;
import model.Lotes;

public class TesteLote {

	public static void main(String[] args) throws Exception {
		
		ConLote lo = new ConLote();
		Lotes lote = new Lotes();
		
		DaoLote dao = new DaoLote();
		
		lo.validarLote("whattafuck");
		lo.validarDataValidade("12/12/2015");
		lo.validarDataValidade("12/1/2015");
		
		dao.inserirLote(lo.lot);
		
		lote.setLote("whattafuck");
		
		
		dao.selecionarLote(lote);
		
	}

}
