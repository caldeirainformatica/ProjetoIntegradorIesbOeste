package testes;
import java.io.ObjectInputStream.GetField;
import java.text.ParseException;
import java.util.InputMismatchException;

import persistencia.DAO;
import persistencia.DaoLote;
import model.Empresas;
import model.Produtos;
import controle.ConEmpresas;
import controle.ConLote;
import controle.ConProdutos;


public class Teste {
	//Os testes estão funcionando
	public static void main(String[] args) throws Exception {
		
		ConProdutos pro = new ConProdutos();
		DAO dao = new DAO();
		
		pro.validarCodigoBarras("12323435");
		pro.validarDescricao("teste");
		pro.validarAplicacao("teste");
		pro.validarMedida("mei metro");
		dao.insert(pro.produto);
		
		ConLote lote = new ConLote();
		DaoLote daolote = new DaoLote();
		lote.validarLote("1sad234");
		lote.validarDataValidade("12/11/2000");
		lote.validarDataFabricacao("02/03/1970");
		lote.validarProduto_idproduto("13");
		daolote.inserirLote(lote.lot);
		
		
		
	}

}
