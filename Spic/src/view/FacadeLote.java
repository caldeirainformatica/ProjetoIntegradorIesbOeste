package view;

import java.text.ParseException;

import javax.swing.JOptionPane;

import persistencia.DaoLote;
import controle.ConLote;

public class FacadeLote {

	ConLote conlote = new ConLote();
	DaoLote dao = new DaoLote();
	
	public void gravarLote(String lote,String val,String fab) throws Exception{
		
		
	if( conlote.validarLote(lote) == true && conlote.validarDataValidade(val) == true && conlote.validarDataFabricacao(fab)==true){
		
		dao.inserirLote(conlote.lot);
		
	}else{
		
		JOptionPane.showMessageDialog(null, "Valores inválidos!");
		
	}
		
		
	}

}
