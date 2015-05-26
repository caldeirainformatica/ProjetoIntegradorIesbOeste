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
		/*
		lo.validarLote("lgvt003");
		lo.validarDataValidade("12/12/2015");
		lo.validarDataFabricacao("12/01/2015");
		
		*/
		
		
		lote.setLote("lgvt003");
		
		
		dao.selecionarLote(lote);
		
	}

}
