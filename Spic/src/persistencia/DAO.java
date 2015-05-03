package persistencia;

//importes necessários para está classe funcionar utilizando conexão com o banco de dados

import java.sql.*;

import javax.swing.JOptionPane;

import model.Produtos;
import persistencia.ConectaBanco;

//Classe especifica para conexão com o atuação direta no banco de dados
//com a utilização de inclusão de produtos, alteração e outros
public class DAO {

	ConectaBanco conecta = new ConectaBanco();
	Produtos p = new Produtos();
	// Comando sql para inclusão de produtos, deixando bem generico para incluir
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
				"Erro na inserção \n Erro " + e1.getMessage());
	}
	}
}

