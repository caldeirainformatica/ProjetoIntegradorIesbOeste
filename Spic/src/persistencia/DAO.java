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
		try {
			conecta.conexao();
			PreparedStatement pst = conecta.conn
					.prepareStatement("insert into produtos (codigoBarras, descricao, aplicacao,"
							+ "medida, valorVenda, valorCusto, quantidade)values (?,?,?,?,?,?,?)");
			pst.setLong(1, p.getCodigoBarras());
			pst.setString(2, p.getDescricao());
			pst.setString(3, p.getAplicacao());
			pst.setString(4, p.getMedida());
			pst.setDouble(5, p.getValorVenda());
			pst.setDouble(6, p.getValorCusto());
			pst.setDouble(7, p.getQuantidade());
			pst.executeUpdate();
			// JOptionPane.showMessageDialog(null, "Salvo com sucesso");
		} catch (SQLException e1) {
			JOptionPane.showMessageDialog(null, "Erro na inser��o \n Erro "
					+ e1.getMessage());
		}
	}

	public void select(Produtos p) {
		try {
			ResultSet rs;
			conecta.conexao();
			PreparedStatement pst = conecta.conn
					.prepareStatement("select * from produtos where idProdutos = %?% or codigoBarras = %?% or descricao = %?% or "
							+ "aplicacao = %?% or medida = %?% or valorVenda = %?% or valorCusto = %?% or quantidade = %?%");
			rs = pst.executeQuery();
			p.setIdProdutos(rs.getInt("idProdutos"));
			p.setCodigoBarras(rs.getLong("codigoBarras"));
			p.setDescricao(rs.getString("descricao"));
			p.setAplicacao(rs.getString("aplicacao"));
			p.setMedida(rs.getString("medida"));
			p.setValorVenda(rs.getDouble("valorVenda"));
			p.setValorCusto(rs.getDouble("valorCusto"));
			p.setQuantidade(rs.getDouble("quantidade"));
			
			// JOptionPane.showMessageDialog(null, "Salvo com sucesso");
		} catch (SQLException e1) {
			JOptionPane.showMessageDialog(null, "Erro na inser��o \n Erro "
					+ e1.getMessage());
		}
	}

}
