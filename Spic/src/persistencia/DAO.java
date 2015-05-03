package persistencia;

//importes necess�rios para est� classe funcionar utilizando conex�o com o banco de dados

import java.sql.*;

import javax.swing.JOptionPane;

import model.Produtos;
import persistencia.ConectaBanco;

//Classe especifica para conex�o com o atua��o direta no banco de dados
//com a utiliza��o de inclus�o de produtos, altera��o e outros
public class DAO {

	ConectaBanco conecta = new ConectaBanco();
	Produtos p = new Produtos();
	// Comando sql para inclus�o de produtos, deixando bem generico para incluir
	// qualquer tipo de dados
	public void insert(Produtos p) {
		try{
		conecta.conexao();
		PreparedStatement pst = conecta.conn
				.prepareStatement("insert into produtos (codigoBarras, descricao, aplicacao,"
						+ "medida, dataValidade, dataFabricacao, lote)values (?,?,?,?,?,?,?)");
		pst.setLong(1, p.getCodigoBarras());
		pst.setString(2, p.getDescricao());
		pst.setString(3, p.getAplicacao());
		pst.setString(4, p.getMedida());
		pst.setString(5, p.getDataValidade());
		pst.setString(6, p.getDataFabricacao());
		pst.setString(7, p.getLote());
		pst.executeUpdate();
		//JOptionPane.showMessageDialog(null, "Salvo com sucesso");
	} catch (SQLException e1) {
		JOptionPane.showMessageDialog(null,
				"Erro na inser��o \n Erro " + e1.getMessage());
	}
	}
}

