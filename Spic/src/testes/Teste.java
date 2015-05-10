package testes;
import java.io.ObjectInputStream.GetField;
import java.text.ParseException;
import java.util.InputMismatchException;

import persistencia.DAO;
import model.Empresas;
import model.Produtos;
import controle.ConEmpresas;
import controle.ConProdutos;


public class Teste {
	//Os testes estão funcionando
	public static void main(String[] args) throws Exception {
		
		ConProdutos pro = new ConProdutos();
		DAO dao = new DAO();
		
		pro.validarCodigoBarras("12323435");
		pro.validarDescricao("sdfsdksdfjsdfdsf");
		pro.validarAplicacao("de passar no cabelo");
		pro.validarMedida("mei metro");
		dao.insert(pro.produto);
		
		
	}

}
